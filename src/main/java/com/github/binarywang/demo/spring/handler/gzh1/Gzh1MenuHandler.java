package com.github.binarywang.demo.spring.handler.gzh1;

import com.github.binarywang.demo.spring.config.WxConfig;
import com.github.binarywang.demo.spring.config.WxGzh1Config;
import com.github.binarywang.demo.spring.handler.MenuHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Gzh1MenuHandler extends MenuHandler {
  @Autowired
  private WxGzh1Config wxConfig;

  @Override
  protected WxConfig getWxConfig() {
    return this.wxConfig;
  }

}
