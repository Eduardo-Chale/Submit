function validacion() {
    valor = document.getElementById("barras").value;
    valor2 = document.getElementById("contra").value;
    valido=true;


    document.getElementById("pBarras").innerHTML="";
    document.getElementById("pContra").innerHTML="";

    //-------------------------------------------------------
    //Condiciones para codigo de barra
    if(valor == null || valor.length <12 || valor.length >13 || /^\s+$/.test(valor)){

        valido=false;
        document.getElementById("pBarras").innerHTML="Cantidad de caracteres incorrecto";
        return false;

    }
    if(/^\d{13}$/.test(valor) && /^750\d+$/.test(valor)==false){

    valido=false;
    document.getElementById("pBarras").innerHTML="Codigo inicial incorrecto";
    return false;
    }
    //--------------------------------------------------------


    //-------------------------------------------------------
    //Condiciones para contraseña
    if(valor2 == null || valor2.length <12 || /^\s+$/.test(valor2)){

        valido=false;
        document.getElementById("pContra").innerHTML="Cantidad de caracteres incorrecto";
        return false;

    }
    if(/[A-Z]+/.test(valor2)==false || /[a-z]+/.test(valor2)==false || /[0-9]+/.test(valor2)==false || /[$@$!%*?&]+/.test(valor2)==false){

        valido=false;
        document.getElementById("pContra").innerHTML="No cuenta con todos los tipos de caracter requeridos";
        return false;
    }
    //---------------------------------------------------------

    if(valido==true){
        document.body.innerHTML="<h1>Datos de alumno</h1>" +
            "<p>Nombre del alumno: Eduardo Adrian Chale Ciau<br> No. de control: 1390324</p> " +
            "<h1>Datos del ejercicio</h1>" +
            "<p>Cree un formulario con 2 campos para captura de datos y un botón que llame a una función que haga la validación de los datos introducidos.<br>Adjunte información antes de cada campo de texto, sobre las reglas para generar el dato válido correspondiente. \n <br>" +
            "<br>" +
            "Cree una función en JavaScript que procese el formulario en caso de que la validación sea exitosa y muestre una página HTML con sus datos <br>personales y de esta tarea. Los datos a validar serán los asignados por el docente, los cuáles serán enviados en un correo electrónico.<br> Si es necesario, investigue las reglas que debe seguir para generar datos asignados.\n <br>" +
            "<br>" +
            "Suba sus códigos en un repositorio git. Cree un documento con hoja de presentación, pegue sus códigos y capturas de pantalla demostrando su <br>funcionamiento. Al final de documento agregue el link a su repositorio. Adjunte su documento a la tarea.</p>";
    }
    return true;
}