import React, {Component} from "react";
import logo from "../../logo.svg";
import './Root.css'
import {Format} from "../../locales/format";
import {User} from "../../domain/user/User";

class Root extends Component<any, User> {
  async componentDidMount() {
    this.state = await User.findCurrentUser()
  }

  render() {
    return <>
      <div className="Main">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo"/>
          <p>
            {Format.format("project_app")}
          </p>
          <a
            className="App-link"
            href="https://reactjs.org"
            target="_blank"
            rel="noopener noreferrer"
          >
            {Format.format("learn_react")}
          </a>
          <a
            className="App-link"
            href="/user/login"
            target="_blank"
          >
            {Format.format("root_login")}
          </a>
        </header>
      </div>
    </>;
  }
}

export default Root;