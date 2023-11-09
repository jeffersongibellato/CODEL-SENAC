let dx, dy
let px, py
let vel
let obj
let tmp

function inicia() {
    dx = 0
    dy = 0
    px = 0
    py = 0
    vel = 10
    obj = document.querySelector('#obj')
    tmp = setInterval(acao, 20) // repete a funcao acao infinitamente a cada 20 millisegundos

    document.addEventListener('keydown', teclaPressionada) // chama isso aqui toda vez que a tecla for pressionada
    document.addEventListener('keyup', teclaliberada) // chama isso aqui toda vez que a tecla for liberada
}

function teclaPressionada() {
    let tecla = event.keyCode // keycode é um numero que identifica o id da tecla no teclado, 37, 38, 39 e 40 é o id das setas no teclado
    if (tecla == 37) {
        dx -= 1
    }
    if (tecla == 38) {
        dy -= 1
    }
    if (tecla == 39) {
        dx += 1
    }
    if (tecla == 40) {
        dy += 1
    }
    if (tecla == 32) { // se espaço for pressionado, reseta a posição do quadrado
        dy = 0
    }
}

function teclaliberada() { // essa aqui não faz nada nesse jogo, é só usado como exemplo
    let tecla = event.keyCode
    if (tecla == 37) {
        dx = 0
    }
    if (tecla == 38) {
        dy = 0
    }
    if (tecla == 39) {
        dx = 0
    }
    if (tecla == 40) {
        dy = 0
    }
}

function acao() { // a cada 20ms essa função é chamada, alterando a posição do quadrado vermelho na tela
    px += dx * vel
    py += dy * vel
    obj.style.left = px + "px"
    obj.style.top = py + "px"
}

window.addEventListener("load", inicia)