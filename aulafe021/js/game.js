const grid = document.querySelector('.grid');
const sJogador = document.querySelector('.jogador');
const timer = document.querySelector('.timer');
const caracteres = [
    'Senac1', 'Senac2', 'Senac3', 'Senac4', 'Senac5', 'Senac6', 'Senac7', 'Senac8', 'Senac9', 'Senac10',
];
const createElement = (tag, className) => {
    const elemento = document.createElement(tag);
    elemento.className = className;
    return elemento;
}
let primeiraCard ='';
let segundaCard = '';
const verificarFimGame = () => {
    const desabilitarCards = document.querySelectorAll('.disabilitar-card');
    if (desabilitarCards.length === 20){
        clearInterval(this.loop);
        alert(`Parabéns ${sJogador.innerHTML}! Seu tempo foi de ${timer.innerHTML}`);
    }
}
const checkCards = () => {
    const primeiraC = primeiraCard.getAttribute('data-character');
    const segundaC = segundaCard.getAttribute('data-character');
    if (primeiraC === segundaC){
        primeiraCard.firstChild.classList.add('disabilitar-card')
        segundaCard.firstChild.classList.add('disabilitar-card')
        primeiraCard = '';
        segundaCard = '';
        verificarFimGame();
    }else{
        setTimeout( () => {
            primeiraCard.classList.remove('revela-card');
            segundaCard.classList.remove('revela-card');
            primeiraCard = '';
            segundaCard = '';
        }, 500);
    }
}
const revelaCard = ({target}) => {
    if(target.parentNode.className.includes('revela-card')){
        return;
    }
    if(primeiraCard === ''){
        target.parentNode.classList.add('revela-card');
        primeiraCard = target.parentNode;
    }else if(segundaCard === ''){
        target.parentNode.classList.add('revela-card');
        segundaCard = target.parentNode;
        checkCards();
    }
}
const createCard = (caractere) => {
    const card = createElement('div', 'card');
    const front = createElement('div', 'face front');
    const back = createElement('div', 'face back');

    front.style.backgroundImage = `url('../imagens/${caractere}.jpg')`;
    card.appendChild(front);
    card.appendChild(back);
    card.addEventListener('click', revelaCard)
    card.setAttribute('data-character', caractere)
}
const loadGame = () => {
    const duplicarCaracter = [...caracteres, ...caracteres];
    const embaralharArray = duplicarCaracter.sort( () => Math.random() - 0.5);
    embaralharArray.forEach( (caractere) => {
        const card = createCard(caractere);
        grid.append(card);
    })
}
const startTimer = () => {
    this.loop = setInterval( () => {
        const tempo = +timer.innerHTML;
        timer.innerHTML = tempo + 1;

    },1000);
}
window.onload = () =>{
    sJogador.innerHTML = localStorage.getItem('jogador');
    startTimer();
    loadGame();
}