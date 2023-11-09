function ligar(){
    document.querySelector("#Lamp").src = "ligada.png"
}
function desligar(){
    document.querySelector("#Lamp").src = "desligada.png"
}
function quebrar(){
    document.querySelector("#Lamp").src = "quebrada.png"
}
function piscar(){
    let intervalo = 0;
    for(i=0;i<10;i++){
        intervalo += 300
        setTimeout("document.querySelector('#Lamp').src = 'ligada.png'", intervalo)
        intervalo += 300
        setTimeout("document.querySelector('#Lamp').src = 'desligada.png'", intervalo)
    }
}
let lamp = document.querySelector("#Lamp")
lamp.addEventListener("mouseleave", desligar)
lamp.addEventListener("mouseover", ligar)
 lamp.addEventListener("dblclick", quebrar )
