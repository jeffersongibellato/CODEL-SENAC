const input = document.querySelector('.formLogin__input');
const button = document.querySelector('.formLogin__button');
const form = document.querySelector('.formLogin');

const validarInput = ({ target}) => {
    if(target.value.length > 3){
        button.removeAttribute('disabled');
        return;
    }
    button.setAttribute('disabled', '');
}
const handleSubmit = (event) => {
    event.preventDefault();
    localStorage.setItem('jogador', input.value);
    window.location = 'game.html';
}
input.addEventListener('input', validarInput);
form.addEventListener('submit', handleSubmit);