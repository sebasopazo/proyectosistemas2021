const init = function(e) {
    
    let spn = document.querySelector('#origen');
    let spn2 = document.querySelector('#fdv');
    let spn3 = document.querySelector('#destino');
    let spn4 = document.querySelector('#hdv');

    let origen = localStorage.getItem('co');
    let fdv = localStorage.getItem('fi');
    let destino = localStorage.getItem('cd');
    let hdv = localStorage.getItem('hr');
    
    spn.innerHTML = origen ; // id del elemento que cambia
    spn3.innerHTML = destino;
    spn2.innerHTML = fdv;   
    spn4.innerHTML = hdv;

};

document.addEventListener('DOMContentLoaded', function() {
    init();});