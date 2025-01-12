package pillihuaman.com.pe.security.user.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import pillihuaman.com.pe.basebd.control.Control;
import pillihuaman.com.pe.lib.response.RespControl;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-01-11T21:16:55-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
public class ControlMapperImpl implements ControlMapper {

    @Override
    public RespControl toRespControl(Control control) {
        if ( control == null ) {
            return null;
        }

        RespControl.RespControlBuilder respControl = RespControl.builder();

        respControl.idCode( control.getIdCode() );
        respControl.description( control.getDescription() );
        respControl.icono( control.getIcono() );
        respControl.iconClass( control.getIconClass() );
        respControl.status( control.getStatus() );
        respControl.styleClass( control.getStyleClass() );
        respControl.id( control.getId() );
        respControl.text( control.getText() );

        return respControl.build();
    }

    @Override
    public List<RespControl> controlsToRespControls(List<Control> controls) {
        if ( controls == null ) {
            return null;
        }

        List<RespControl> list = new ArrayList<RespControl>( controls.size() );
        for ( Control control : controls ) {
            list.add( toRespControl( control ) );
        }

        return list;
    }
}
