const umCent = '<img class="moeda" src="./assets/money_penny.png" alt="desenho moeda de um centavo" >'
const cincoCent = '<img class="moeda" src="./assets/money_nickel.png" alt="desenho moeda de cinco centavos">'
const dezCent = '<img class="moeda" src="./assets/money_dime.png" alt="desenho moeda de dez centavos" >'
const vinteCintoCent = '<img class="moeda" src="./assets/money_quarter.png" alt="desenho moeda de vinte e cinco centavos" >'
const cinquentaCent = '<img class="moeda" src="./assets/money_half_dollar.png" alt="desenho moeda de cinquenta centavos" >'

const form = document.getElementById("formulario");

form.addEventListener("submit", (e) => {
  e.preventDefault();
});

let mensagem = document.getElementById("mensagem");

const input = document.getElementById("input");
function moedas() {
  let troco = input.value.replace(",", ".");
  let contadorDeMoedas = 0;
  let arrayDeMoedas = [];

  if (troco > 0 && troco < 1) {
    while (troco >= 0.5) {
      troco = Number(troco - 0.5).toFixed(2);
      contadorDeMoedas++;
      arrayDeMoedas.push(cinquentaCent);
    }

    while (troco >= 0.25) {
      troco = Number(troco - 0.25).toFixed(2);
      contadorDeMoedas++;
      arrayDeMoedas.push(vinteCintoCent);
    }
    while (troco >= 0.1) {
      troco = Number(troco - 0.1).toFixed(2);
      contadorDeMoedas++;
      arrayDeMoedas.push(dezCent);
    }
    while (troco >= 0.05) {
      troco = Number(troco - 0.05).toFixed(2);
      contadorDeMoedas++;
      arrayDeMoedas.push(cincoCent);
    }
    while (troco <= 4 && troco > 0) {
      troco = Number(troco - 0.01).toFixed(2);
      contadorDeMoedas++;
      arrayDeMoedas.push(umCent);
    }

    return (mensagem.innerHTML = `<p>Total de moedas a devolver: ${contadorDeMoedas}</p>
    <p>Moedas do troco: </p> ${arrayDeMoedas}`);
  } else {
    limpar();
  }
}

function limpar() {
  input.value = "";
  mensagem.innerHTML = "";
}
