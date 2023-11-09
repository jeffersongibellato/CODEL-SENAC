let contadorPartida = 1
let countHtml = document.getElementById("count")
countHtml.innerHTML = "Partida: " + contadorPartida

let pontuacaoPlayer = 0
let pontuacaoPlayerHTML = document.getElementById("PontPlayer1")
let pontuacaoPc = 0
let pontuacaoPcHTML = document.getElementById("PontPcPlayer")
let placarResultado = document.getElementById("ResultadoPartida")

let vencedor = 0
let empate = false

let pedra = document.getElementById("pedraInput")
let papel = document.getElementById("papelInput")
let tesoura = document.getElementById("tesouraInput")
let radioEscolhido;

let pcImg = document.getElementById("pcJogoImg")


function jogadorJoga() {

    let chosen = 0;

    if(pedra.checked) {
        chosen = 1
        radioEscolhido = pedra
        console.log("Player escolheu pedra")
    } else if(papel.checked) {
        chosen = 2
        radioEscolhido = papel
        console.log("Player escolheu papel")
    } else if(tesoura.checked) {
        chosen = 3
        radioEscolhido = tesoura
        console.log("Player escolheu tesoura")
    } else {
        alert("Favor escolher Pedra, Papel, ou Tesoura")
        return
    }

    let jogadaPc = jogoPc()

    if(jogadaPc == 1) {
        pcImg.innerHTML = `<img src="imagens/pcpedra.png" alt="Pedra">`
        console.log("Computador jogou pedra")
    } else if (jogadaPc == 2) {
        pcImg.innerHTML = `<img src="imagens/pcpapel.png" alt="Papel">`
        console.log("Computador jogou papel")
    } else if (jogadaPc == 3) {
        pcImg.innerHTML = `<img src="imagens/pctesoura.png" alt="Tesoura">`
        console.log("Computador jogou tesoura")
    }

    comparaJogada(chosen, jogadaPc) 
    contadorPartida++
    atualizaUi()
    console.log("fim aplicação")
}

function  jogoPc() {
    console.log("Computador jogou")
    return Math.floor(Math.random() * 3 + 1)
}

function comparaJogada(p1, pc) {
    if (p1 == pc) {
        // empate
        empate = true
        console.log("Empate")
    } else {
        if(p1 == 1 && pc == 2) { // pedra - papel
            // player perde
            pontuacaoPc++
            vencedor = 1
            console.log("Player perdeu")
        } else if (p1 == 1 && pc == 3) { // pedra - tesoura
            // player ganha
            pontuacaoPlayer++
            vencedor = 2
            console.log("Player ganhou")
        } else if(p1 == 2 && pc == 1) { // papel - pedra
            // player ganha
            pontuacaoPlayer++
            vencedor = 2
            console.log("Player ganhou")
        } else if (p1 == 2 && pc == 3) { // papel - tesoura
            // player perde
            pontuacaoPc++
            vencedor = 1
            console.log("Player perdeu")
        } else if (p1 == 3 && pc == 1) { // tesoura - pedra
            // player perde
            pontuacaoPc++
            vencedor = 1
            console.log("Player perdeu")
        } else if(p1 == 3 && pc == 2) { // tesoura - papel
            // player ganha
            pontuacaoPlayer++
            vencedor = 2
            console.log("Player ganhou")
        }
    }
}

function atualizaUi() {
    console.log("Atualizando UI")
    radioEscolhido.checked = false
    countHtml.innerHTML = "Partida: " + contadorPartida

    if(empate) {
        placarResultado.innerHTML = `<h2>Empate!<h2>`
        empate = false
        return
    }

    if(vencedor == 1) { // Pc ganhou
        placarResultado.innerHTML = `<h2>Computador venceu<h2>`
        console.log("Atualizando UI - PC ganhou")
    } else if(vencedor == 2) { // Player ganhou
        placarResultado.innerHTML = `<h2>Player venceu<h2>`
        console.log("Atualizando UI - player ganhou")
    }

    pontuacaoPcHTML.innerHTML = `<h2>Computador: ${pontuacaoPc}</h2>`
    pontuacaoPlayerHTML.innerHTML = `<h2>Jogador: ${pontuacaoPlayer}</h2>`

    console.log("fim atualiza ui")
}
console.log('DESENVOLVIDO POR: Caio, Matheus, Jefferson')