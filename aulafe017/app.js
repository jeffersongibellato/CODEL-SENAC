let dado = document.querySelector('#face');
let titulo = document.getElementById('descricao');
let lados = [
    {
        id:1,
        img: 'imagens/face1.png',
        descricao: 'LADO 1',
    },
    {
        id:2,
        img: 'imagens/face2.png',
        descricao: 'LADO 2',
    },
    {
        id:3,
        img: 'imagens/face3.png',
        descricao: 'LADO 3',
    },
    {
        id:4,
        img: 'imagens/face4.png',
        descricao: 'LADO 4',
    },
    {
        id:5,
        img: 'imagens/face5.png',
        descricao: 'LADO 5',
    },
    {
        id:6,
        img: 'imagens/face6.png',
        descricao: 'LADO 6'
    }
]

function lancar(){
     let numero = Math.floor(Math.random()*10);
     while(numero > 6 || numero == 0){
        numero = Math.floor(Math.random()*10);
     }
     console.log(numero)
            lados[numero-1].id
            dado.src = lados[numero-1].img;
            titulo.innerHTML = lados[numero-1].descricao;
    }