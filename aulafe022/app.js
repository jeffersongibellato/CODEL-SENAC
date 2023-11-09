function menuToggle(){
    let menubar = document.querySelector('.menuAp');
    let menusEsp = document.querySelector('.grande1');
    let menusImg = document.querySelector('.grande2')
    menubar.classList.toggle('menuTog')
    menusEsp.classList.toggle('menuEsp');
    menusImg.classList.toggle('menuEsp');
}
function fechar(){
    window.alert("você deseja fechar a página?")
}