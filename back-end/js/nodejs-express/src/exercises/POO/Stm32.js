const AparelhoEletronico = require('./AparelhoEletronico');

class Stm32 extends AparelhoEletronico {
    #debugger;

    constructor(botao, pinos, led, comunicacao){
        super(botao, pinos, led, comunicacao);
        this.#debugger = true;
    }

    emitirLuz(){
        console.log("Led ligado!");
    }

    emitirComunicacao(){
        console.log("Comunicação ligada!")
    }

    getDebugger(){
        return this.#debugger;
    }
}

const stm32 = new Stm32(2, 132, 3, "SPI");
console.log(`Quantidade de botões: ${stm32.getBotao()}`);
console.log(`Quantidade de pinos: ${stm32.getPinos()}`);
console.log(`Quantidade de leds: ${stm32.getLed()}`);
console.log(`Comunicando por: ${stm32.getComunicacao()}`);
console.log(`Debugger: ${stm32.getDebugger()}`);
stm32.emitirLuz();
stm32.emitirComunicacao();