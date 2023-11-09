let caixaImagem = document.querySelector('.imagem');
let imagens = [
    {
        img: 'discord.jpg',
    },
    {
        img: 'github.jpg',
    },
    {
        img: 'instagram.jpg',
    },
    {
        img: 'markz.jpg',
    },
    {
        img: 'youtube.jpg',
    }
]

caixaImagem.style.width = '300px';
caixaImagem.style.height = '300px';
function clicarf(){
    caixaImagem.src = imagens[3].img;
}
function clicard(){
    caixaImagem.src = imagens[0].img;
}
function clicari(){
    caixaImagem.src = imagens[2].img;
}
function clicarg(){
    caixaImagem.src = imagens[1].img;
}
function clicary(){
    caixaImagem.src = imagens[4].img;
}
function retornarfundo(){
    caixaImagem.src = "";
}