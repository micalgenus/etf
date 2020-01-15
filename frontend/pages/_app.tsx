import App, { Container } from 'next/app';
import * as React from 'react';
import Head from 'next/head';
import AppLayout from '../components/AppLayout';
//import { Menu, Input, Layout, Breadcrumb } from 'antd';
//import styles from './_app.scss'

export default class BlackCow extends App {
  // static async getInitialProps ({ component, router, ctx }) {
  //   let pageProps = {};

  //   if (Component.getInitialProps) {
  //     pageProps = await Component.getInitialProps(ctx)
  //   }

  //   return {pageProps}
  // }

  public render() {
    const { Component, pageProps } = this.props;
    return (<Container>
      <Head>
        <title>BlackCow!</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/antd/3.25.3/antd.css"/>
      </Head>
      <AppLayout>
        <Component {...pageProps} />
      </AppLayout>
    
     
      

    </Container>);
  }
}