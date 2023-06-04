let tijolosDireita = "";
let contador = 1;

let altura;

do {altura = prompt("Escolha um número de 3 a 10: ")}
while (altura < 3 || altura > 10);


while (contador <= altura) {
  let tijolosEsquerda = "";
  let spaces = altura - contador;

  tijolosDireita = tijolosDireita + "#";

  for (let i = 0; i < spaces; i++) {
    tijolosEsquerda = tijolosEsquerda + "<span>.</span>";
  }
  for (let i = 0; i < contador; i++) {
    tijolosEsquerda = tijolosEsquerda + "#";
  }
  console.log(tijolosEsquerda, "", tijolosDireita);
  let aux =  document.getElementById("escada")
  aux.innerHTML += `<h1>${tijolosEsquerda}<span>.....</span>${tijolosDireita}</h1>`
  contador++;
}


