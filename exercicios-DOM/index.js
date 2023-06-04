const textos = document.getElementById('textos')

for (let i=1; i < 6; i++){
    textos.innerHTML += `<p class="texto">Texto  ${i} </p>`
}


const fraseContador = document.getElementById("contador")
let clique = 0;

function contadorDeCliques(){
    clique++
    fraseContador.innerHTML = `<p class="fraseClique"> Você clicou ${clique} vezes </p>`
    console.log("cliquei")
}

const lista = document.getElementById("listaCompras")
const inputEntrada = document.getElementById("entrada")

function listaDeCompras(){
    if (inputEntrada.value !== ''){
    lista.innerHTML += `<li class="item">${inputEntrada.value}</li>`
    inputEntrada.value = ''
    }
}