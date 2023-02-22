// Call the dataTables jQuery plugin
$(document).ready(function() {
  // lo dejo vacío
});

async function iniciarSesion(){
  let datos={};
  datos.email=document.getElementById('txtEmail').value;
  datos.password=document.getElementById('txtPassword').value;

   const request = await fetch('api/login', {
      method: 'POST',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
      body: JSON.stringify(datos)
    });
  // No me gusta que devuelva String , cambio a JSON
  const respuesta = await request.text();
  if (respuesta == 'OK') {
  window.location.href='usuarios.html';
  } else {
  alert(' Credenciales erróneas, intente de nuevo');
  }
}
