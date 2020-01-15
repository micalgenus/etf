import React from 'react';
import Link from 'next/link';
import { Menu, Input, Layout } from 'antd';

const { Header, Content, Footer } = Layout;

const AppLayout : React.FC = ({ children }) => (
  <Layout>
    <Header style={{ position: 'fixed', zIndex: 1, width: '100%', backgroundColor: "#ff971d" }}>
      <Menu mode="horizontal" style={{ lineHeight: '64px', backgroundColor: "#ff971d" }}>
        <Menu.Item key="home"><Link href="/index"><img src="/images/cow.png" style ={{width:'42', height:'42'}}></img></Link></Menu.Item>
        <Menu.Item key="portfile"><a style ={{color: 'black'}}>차트</a></Menu.Item>
        <Menu.Item key="login">로그인</Menu.Item>
        <Menu.Item key="mail">
          <Input.Search enterButton style={{ verticalAlign: 'middle' }} />
        </Menu.Item>
      </Menu>
    </Header>
    <Content style={{ padding: '0 50px', marginTop: 64, background: '#ffffff'}}>
     
      <div style={{ background: 'white', padding: 24, minHeight: 380 }}>{children}</div>
    </Content>
    <Footer style={{ textAlign: 'center', backgroundColor: '#f9f6f7', color : "black" }}>black cow project footer</Footer>



  </Layout>
);


export default AppLayout;