import React from 'react';
import 'bootstrap/dist/css/bootstrap.css';
import axios from 'axios';

//List.js
class TrData extends React.Component {
    constructor(props) {
        super(props);
    }

    render() {
        return (
            this.props.users.data.map((user, i) => {
                return (
                    <tr key={user.userId} className="text-center">
                        <td>{user.userId}</td>
                        <td>{user.loginName}</td>
                        <td>{user.userName}</td>
                    </tr>
                )
            })
        )
    }
}

class List extends React.Component {


    constructor(props)
    {
        super(props);
        this.state = {
            users: [],
            isLoaded: false
        }
    }
    componentDidMount()
    {
        const _this = this;    //先存一下this，以防使用箭头函数this会指向我们不希望它所指向的对象。
        axios.get('/api/user/userList')
            .then(function (response) {
                _this.setState({
                    users: response.data,
                    isLoaded: true
                });
            })
            .catch(function (error) {
                console.log(error);
                _this.setState({
                    isLoaded: false,
                    error: error
                })
            })
    }
    render()
    {
        if (!this.state.isLoaded) {
            return <div>Loading</div>
        } else {
            return (
                <table className="table table-bordered">
                    <thead>
                    <tr>
                        <th className="text-center">ID</th>
                        <th className="text-center">账号</th>
                        <th className="text-center">用户名</th>
                    </tr>
                    </thead>
                    <tbody>
                    <TrData users={this.state.users}/>
                    </tbody>
                </table>
            )
        }
    }
}

export default List;


