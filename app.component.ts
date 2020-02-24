import { Component }           from '@angular/core';

@Component({
  moduleId: module.id,
  selector: 'my-app',
  templateUrl: 'app.component.html'
})
export class AppComponent { 
  messages: string[] = [];
  
  gatherCount(message) {
    this.messages.push(message);
  }
  
  gatherPage(pageNo) {
    this.messages.push(`I am at page ${pageNo} now.`);
  }
}

