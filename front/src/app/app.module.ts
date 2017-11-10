import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpModule} from '@angular/http';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { AllregistrosComponent } from './components/allregistros/allregistros.component';
import { RegistroService} from '../app/services/registro.service';


@NgModule({
  declarations: [
    AppComponent,
    AllregistrosComponent
  ],
  imports: [
    BrowserModule, HttpModule
  ],
  providers: [RegistroService],
  bootstrap: [AppComponent]
})
export class AppModule { }
