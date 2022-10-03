class AparelhoEletronico {
    #microcontrolador;
    #botao;
    #pinos;
    #led;
    #comunicacao;

    constructor(botao, pinos, led, comunicacao){
        this.#microcontrolador = true;
        this.#botao = botao;
        this.#pinos = pinos;
        this.#led = led;
        this.#comunicacao = comunicacao;
    }

    emitirLuz(){
        console.log("Ligar o led!");
    }

    emitirComunicacao(){
        console.log("Ativar a comunicação!");
    }

    getBotao(){
        return this.#botao;
    }

    getPinos(){
        return this.#pinos;
    }

    getLed(){
        return this.#led;
    }

    getComunicacao(){
        return this.#comunicacao;
    }

    setBotao(botao){
        this.#botao = botao;
    }

    setPinos(pinos){
        return this.#pinos = pinos;
    }

    setPeso(led){ // status do led
        return this.#led = led;
    }

    setComunicacao(comunicacao){
        return this.#comunicacao = comunicacao;
    }
}

module.exports = AparelhoEletronico;