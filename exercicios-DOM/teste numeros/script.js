let num1 = document.getElementById("numum");
let num2 = document.getElementById("numdois");

function numeros (num1, num2) {
  num1 = Number(num1.value);
  num2 = Number(num2.value);
document.getElementById("resultado").innerHTML = `Os números ${num1} e ${num2} ${comparaIguais(num1, num2)} são iguais. E a somas deles é ${num1 + num2} que é ${comparaVinteDez(num1, num2)}`;
}

function comparaIguais (num1, num2){
  return num1 == num2 ? '' : 'não';
}

function comparaVinteDez (num1, num2){
 let soma = num1 + num2;
 let vinte = soma < 20;
 let dez = soma < 10;
 
 let resultado10 = 'maior';
 let resultado20 = 'maior';
 
if (dez) {
  resultado10 = 'menor'
}
  
 if (vinte) {
  resultado20 = 'menor'
}
    return `${resultado10} que 10 e ${resultado20} que 20.`;
}