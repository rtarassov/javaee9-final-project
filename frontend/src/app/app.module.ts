import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { WelcomeComponent } from './components/welcome/welcome.component';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatCardModule } from '@angular/material/card';
import { MatButtonModule } from '@angular/material/button';
import { NewsFeedComponent } from './components/news-feed/news-feed.component';
import { NewsFormComponent } from './components/news-form/news-form.component';
import {ReactiveFormsModule} from "@angular/forms";

@NgModule({
  declarations: [
    WelcomeComponent,
    NewsFeedComponent,
    NewsFormComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatCardModule,
    MatButtonModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [WelcomeComponent]
})
export class AppModule { }
