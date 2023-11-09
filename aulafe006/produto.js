let lojas = [
    "Carrefour", "Muffato", "Fast", "Magazine Luiza", "Kabum", "Pichau", "Mercado Livre", "Shoppe", "Aliexpress", "Amazon"
];

let modelo = [
    "pad", "ergonômico", "gamer", "slim", "wireless", "serial", "usb"
];

let inputText = document.querySelector('input');
inputText.addEventListener('keydown', function(e) {


    if (e.key === 'Enter'){
        construirTabela()
    }
})

function construirTabela(){
    let tabela = document.querySelector("#tabela tbody");
    let produto = document.querySelector("#produto").value;

    tabela.innerHTML = "";
    for(let i=0;i<10;i++){
        let preco = Math.random() * 50 + 50;
        let tipoLoja = Math.floor(Math.random()* 10);
        let tipoMouse = Math.floor(Math.random() * 7)
        
        let conteudo = `
        <td>${lojas[tipoLoja]}</td>
        <td>${produto}</td>
        <td>${modelo[tipoMouse]}</td>
        <td>R$${preco.toFixed(2).replace('.', ',')}</td>
        `;
        let tr = document.createElement("tr");
        tr.innerHTML = conteudo;
        tabela.append(tr);
    }
}
document.querySelector(".btn").addEventListener("click", construirTabela);
