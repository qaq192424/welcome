import React,{Component} from 'react'
import axios from 'axios'

export default class App extends Component{
  state = { //初始化状态
    aaa:[]
  }
  getStudentData = ()=>{
    axios.get('http://localhost:8080/ltl/students').then(
        response => {console.log('成功了',response.data.user);
          this.setState({aaa:response.data.user})
        },
        error => {console.log('失败了',error);}
    )
  }
  render(){
    const {aaa}=this.state
    console.log("111",aaa)
    return (
        <div>
          <button onClick={this.getStudentData}>点我获取学生数据</button>
          <ul>
            {
              aaa.map((user)=>{
                return (
                    <li>
                      <div key={user.id}>
                        <p>id: {user.id} 名字：{user.name}  密码：{user.pwd}</p>
                      </div>
                    </li>
                )
              })
            }
          </ul>
        </div>
    )
  }
}
