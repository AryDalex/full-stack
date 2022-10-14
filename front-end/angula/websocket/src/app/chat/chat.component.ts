import { Component, OnDestroy, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { SocketService } from '../services/socket.service'
import { PadoLabsMessage } from '../models/padolabsMessage'

@Component({
  selector: 'app-chat',
  templateUrl: './chat.component.html',
  styleUrls: ['./chat.component.scss']
})
export class ChatComponent implements OnInit, OnDestroy {

  protected socketService: SocketService;

  constructor(socketService: SocketService) {
    this.socketService = socketService;
  }

  ngOnInit(): void {
    this.socketService.openConnection();
  }

  ngOnDestroy(): void {
    // throw new Error('Method not implemented.');
    this.socketService.closeConnection();
  }

  public sendMessage(sendForm: NgForm) {
    
    const chatMessage = new PadoLabsMessage(sendForm.value.user, sendForm.value.message);
    this.socketService.sendMessage(chatMessage);
    sendForm.controls['message'].reset();

  }

}
