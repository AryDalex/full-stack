const AparelhoEletronico = require('./AparelhoEletronico');

class Esp32 extends AparelhoEletronico {
    constructor(botao, pinos, led, comunicacao){
        super(botao, pinos, led, comunicacao);
    }

    emitirLuz(){
        console.log("Led piscando!");
    }

    emitirComunicacao(){
        console.log("Comunicação ligada!")
    }
}

const esp32 = new Esp32(2, 38, 1, "UART");
console.log(`Quantidade de botões: ${esp32.getBotao()}`);
console.log(`Quantidade de pinos: ${esp32.getPinos()}`);
console.log(`Quantidade de leds: ${esp32.getLed()}`);
console.log(`Comunicando por: ${esp32.getComunicacao()}`);
esp32.emitirLuz();
esp32.emitirComunicacao();