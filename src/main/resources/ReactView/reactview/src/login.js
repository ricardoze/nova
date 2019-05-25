// login.js
import React, {Component} from 'react'
import {InputGroup, FormControl, ButtonToolbar} from 'react-bootstrap';
import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";
import Badge from "antd-mobile/es/badge";
import Button from "react-bootstrap/Button";

class Login extends Component {
    render() {
        return (
            <Row>
                <Col> </Col>
                <Col>

                    <div style={{margin: '100px', width: '400px'}}>
                        <h1 align="center">
                            登录
                        </h1>
                        < InputGroup className=" mb-3 ">
                            < InputGroup.Prepend>
                                < InputGroup.Text id=" basic-addon1 "> 用户名 </ InputGroup.Text>
                            </ InputGroup.Prepend>
                            < FormControl
                                placeholder=" 请输入用户名 "
                                aria-label="Username"
                                aria-describedby=" basic-addon1 "
                            />
                        </InputGroup>

                        < InputGroup className=" mb-3 ">
                            < InputGroup.Prepend>
                                < InputGroup.Text id=" basic-addon2 "> 密码 </ InputGroup.Text>
                            </ InputGroup.Prepend>
                            < FormControl
                                placeholder=" 请输入密码 "
                                aria-label="Username"
                                type="password"
                                aria-describedby=" basic-addon1 "
                            />
                        </InputGroup>
                        <ButtonToolbar style={{height: '50px',width:'300px'}}>
                            <Button style={{margin: '30px'}} variant="primary">登录</Button>
                            <Button style={{margin: '30px'}} variant="success">注册</Button>

                        </ButtonToolbar>
                    </div>

                </Col>
                <Col> </Col>
            </Row>

        )
    }

}

export default Login