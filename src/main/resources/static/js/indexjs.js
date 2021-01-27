
const init= function(e) {
    let btn = document.querySelector("#buscarPasaje"); //id del boton que trigger todo esto
   
    let co; // Ciudad De Origen
    let cd; // Ciudad De destino
    let nU; //nombre de usuario
    let fi = new Date(); //FEcha ida     
    let hr; 
    btn.addEventListener('click', function() {
        
        
        
        co = document.getElementById("origen").value;
        cd = document.getElementById("destino").value;
        fi = document.getElementById("fecha").value;
        hr = document.getElementById("horaViaje").value;
       
        localStorage.setItem('co',co);
        localStorage.setItem('cd',cd);
        localStorage.setItem('fi',fi);
        localStorage.setItem('hr',hr);
        

       
        //window.document.location='./name2.html';
        
       
       
        
    });
}



document.addEventListener('DOMContentLoaded', function() {
    init();});
