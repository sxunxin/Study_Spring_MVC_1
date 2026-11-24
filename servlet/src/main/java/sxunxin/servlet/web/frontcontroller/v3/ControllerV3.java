package sxunxin.servlet.web.frontcontroller.v3;

import java.util.Map;

import sxunxin.servlet.web.frontcontroller.ModelView;

public interface ControllerV3 {
    
    ModelView process(Map<String, String> paramMap);
}