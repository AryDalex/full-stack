import { Injectable } from '@angular/core';
import { PadoLabsMessage } from '../models/padolabsMessage'

@Injectable({
  providedIn: 'root'
})
export class SocketService {

  private padolabsMessages: PadoLabsMessage[] = [];
  private socket: WebSocket | undefined;

  constructor() { }

  public getMessage(): PadoLabsMessage[] {
    return this.padolabsMessages;
  }

  public openConnection() {
    
    this.socket = new WebSocket(`ws://localhost:7000/chat/ary`);
  
    this.socket.onopen = (event) => {
      console.log(event)
    }

    this.socket.onmessage = (event) => {
      console.log(event.data)
      const padoMessages = JSON.parse(event.data);
      this.padolabsMessages.push(padoMessages);
    }

    this.socket.onclose = (event) => {
      console.log(event)
    }

  }

  public sendMessage(padolabsMessage: PadoLabsMessage)
  {
    this.socket?.send(JSON.stringify(padolabsMessage))
  }

  public closeConnection() {
    this.socket?.close();
  }

}
