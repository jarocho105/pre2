/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.activosfijos.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.util.ResponsableActivoFijoConstantesFunciones;

import com.bydan.erp.activosfijos.business.logic.*;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.*;
import com.bydan.framework.erp.util.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.*;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.TableColumn;

import com.toedter.calendar.JDateChooser;


@SuppressWarnings("unused")
public class ResponsableActivoFijoDetalleFormJInternalFrame extends ResponsableActivoFijoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleResponsableActivoFijo;
	
	protected JMenuBar jmenuBarDetalleResponsableActivoFijo;
	
	protected JMenu jmenuDetalleResponsableActivoFijo;
	protected JMenu jmenuDetalleArchivoResponsableActivoFijo;
	protected JMenu jmenuDetalleAccionesResponsableActivoFijo;
	protected JMenu jmenuDetalleDatosResponsableActivoFijo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleResponsableActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutResponsableActivoFijo;	
	protected GridBagConstraints gridBagConstraintsResponsableActivoFijo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ResponsableActivoFijoBeanSwingJInternalFrameAdditional jInternalFrameDetalleResponsableActivoFijo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_detalleactivofijo="";

	protected EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estructura="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";
	
	public ResponsableActivoFijoSessionBean responsableactivofijoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public DetalleActivoFijoSessionBean detalleactivofijoSessionBean;
	public EstructuraSessionBean estructuraSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;	
	
	public ResponsableActivoFijoLogic responsableactivofijoLogic;
	
	public JScrollPane jScrollPanelDatosResponsableActivoFijo;
	public JScrollPane jScrollPanelDatosEdicionResponsableActivoFijo;
	public JScrollPane jScrollPanelDatosGeneralResponsableActivoFijo;
	
	protected JPanel jPanelCamposResponsableActivoFijo;    
	protected JPanel jPanelCamposOcultosResponsableActivoFijo;    	
	protected JPanel jPanelAccionesResponsableActivoFijo;
	protected JPanel jPanelAccionesFormularioResponsableActivoFijo;
    
	
	
	protected Integer iXPanelCamposResponsableActivoFijo=0;
	protected Integer iYPanelCamposResponsableActivoFijo=0;
	
	protected Integer iXPanelCamposOcultosResponsableActivoFijo=0;
	protected Integer iYPanelCamposOcultosResponsableActivoFijo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoResponsableActivoFijo;
	public JButton jButtonModificarResponsableActivoFijo;
	public JButton jButtonActualizarResponsableActivoFijo;
    public JButton jButtonEliminarResponsableActivoFijo;
	public JButton jButtonCancelarResponsableActivoFijo;
    public JButton jButtonGuardarCambiosResponsableActivoFijo;
	public JButton jButtonGuardarCambiosTablaResponsableActivoFijo;
	protected JButton jButtonCerrarResponsableActivoFijo;
	
	
	protected JButton jButtonProcesarInformacionResponsableActivoFijo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoResponsableActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarResponsableActivoFijo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeResponsableActivoFijo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarResponsableActivoFijo;
	protected JButton jButtonModificarToolBarResponsableActivoFijo;
	protected JButton jButtonActualizarToolBarResponsableActivoFijo;
    protected JButton jButtonEliminarToolBarResponsableActivoFijo;
	protected JButton jButtonCancelarToolBarResponsableActivoFijo;
    protected JButton jButtonGuardarCambiosToolBarResponsableActivoFijo;
	protected JButton jButtonGuardarCambiosTablaToolBarResponsableActivoFijo;
	protected JButton jButtonMostrarOcultarTablaToolBarResponsableActivoFijo;
	protected JButton jButtonCerrarToolBarResponsableActivoFijo;
	
	protected JButton jButtonProcesarInformacionToolBarResponsableActivoFijo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoResponsableActivoFijo;
	protected JMenuItem jMenuItemModificarResponsableActivoFijo;
	protected JMenuItem jMenuItemActualizarResponsableActivoFijo;
    protected JMenuItem jMenuItemEliminarResponsableActivoFijo;
	protected JMenuItem jMenuItemCancelarResponsableActivoFijo;
    protected JMenuItem jMenuItemGuardarCambiosResponsableActivoFijo;
	protected JMenuItem jMenuItemGuardarCambiosTablaResponsableActivoFijo;
	protected JMenuItem jMenuItemCerrarResponsableActivoFijo;
	protected JMenuItem jMenuItemDetalleCerrarResponsableActivoFijo;
	protected JMenuItem jMenuItemDetalleMostarOcultarResponsableActivoFijo;
	
	protected JMenuItem jMenuItemProcesarInformacionResponsableActivoFijo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosResponsableActivoFijo;
	protected JMenuItem jMenuItemMostrarOcultarResponsableActivoFijo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesResponsableActivoFijo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesResponsableActivoFijo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesResponsableActivoFijo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioResponsableActivoFijo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidResponsableActivoFijo;
	public JLabel jLabelIdResponsableActivoFijo;
	public JLabel jLabelidResponsableActivoFijo;
	public JButton jButtonidResponsableActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelubicacionResponsableActivoFijo;
	public JLabel jLabelubicacionResponsableActivoFijo;
	public JTextArea jTextAreaubicacionResponsableActivoFijo;
	public JScrollPane jscrollPaneubicacionResponsableActivoFijo;
	public JButton jButtonubicacionResponsableActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelfechaResponsableActivoFijo;
	public JLabel jLabelfechaResponsableActivoFijo;
	//public JFormattedTextField jDateChooserfechaResponsableActivoFijo;

	public JDateChooser jDateChooserfechaResponsableActivoFijo;
	public JButton jButtonfechaResponsableActivoFijoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionResponsableActivoFijo;
	public JLabel jLabeldescripcionResponsableActivoFijo;
	public JTextArea jTextAreadescripcionResponsableActivoFijo;
	public JScrollPane jscrollPanedescripcionResponsableActivoFijo;
	public JButton jButtondescripcionResponsableActivoFijoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaResponsableActivoFijo;
	public JLabel jLabelid_empresaResponsableActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaResponsableActivoFijo;
	public JButton jButtonid_empresaResponsableActivoFijo= new JButtonMe();
	public JButton jButtonid_empresaResponsableActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_empresaResponsableActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalResponsableActivoFijo;
	public JLabel jLabelid_sucursalResponsableActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalResponsableActivoFijo;
	public JButton jButtonid_sucursalResponsableActivoFijo= new JButtonMe();
	public JButton jButtonid_sucursalResponsableActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalResponsableActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_detalle_activo_fijoResponsableActivoFijo;
	public JLabel jLabelid_detalle_activo_fijoResponsableActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_detalle_activo_fijoResponsableActivoFijo;
	public JButton jButtonid_detalle_activo_fijoResponsableActivoFijo= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoResponsableActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_detalle_activo_fijoResponsableActivoFijoBusqueda= new JButtonMe();

	public JPanel jPanelid_estructuraResponsableActivoFijo;
	public JLabel jLabelid_estructuraResponsableActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estructuraResponsableActivoFijo;
	public JButton jButtonid_estructuraResponsableActivoFijo= new JButtonMe();
	public JButton jButtonid_estructuraResponsableActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_estructuraResponsableActivoFijoBusqueda= new JButtonMe();
	public JButton jButtonid_estructuraResponsableActivoFijoArbol= new JButtonMe();

	public JPanel jPanelid_empleadoResponsableActivoFijo;
	public JLabel jLabelid_empleadoResponsableActivoFijo;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoResponsableActivoFijo;
	public JButton jButtonid_empleadoResponsableActivoFijo= new JButtonMe();
	public JButton jButtonid_empleadoResponsableActivoFijoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoResponsableActivoFijoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesResponsableActivoFijo;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ResponsableActivoFijoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposResponsableActivoFijo=new JPanel();
				this.jPanelAccionesFormularioResponsableActivoFijo=new JPanel();
				this.jmenuBarDetalleResponsableActivoFijo=new JMenuBar();
				this.jTtoolBarDetalleResponsableActivoFijo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResponsableActivoFijoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ResponsableActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ResponsableActivoFijoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ResponsableActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResponsableActivoFijoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ResponsableActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResponsableActivoFijoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ResponsableActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ResponsableActivoFijoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ResponsableActivoFijo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}

			this.initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Clase Padre Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }		

	public JInternalFrameBase getJInternalFrameParent() {
		return jInternalFrameParent;
	}

	public void setJInternalFrameParent(JInternalFrameBase internalFrameParent)	{
		jInternalFrameParent = internalFrameParent;
	}
	
	
	public JButton getjButtonActualizarToolBarResponsableActivoFijo() {
		return this.jButtonActualizarToolBarResponsableActivoFijo;
	}
	
	public JButton getjButtonEliminarToolBarResponsableActivoFijo() {
		return this.jButtonEliminarToolBarResponsableActivoFijo;
	}
	
	public JButton getjButtonCancelarToolBarResponsableActivoFijo() {
		return this.jButtonCancelarToolBarResponsableActivoFijo;
	}		
	
	public JButton getjButtonProcesarInformacionResponsableActivoFijo() {
		return this.jButtonProcesarInformacionResponsableActivoFijo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionResponsableActivoFijo)	{
		this.jButtonProcesarInformacionResponsableActivoFijo = jButtonProcesarInformacionResponsableActivoFijo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesResponsableActivoFijo() {
		return this.jComboBoxTiposAccionesResponsableActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesResponsableActivoFijo(
			JComboBox jComboBoxTiposRelacionesResponsableActivoFijo) {
		this.jComboBoxTiposRelacionesResponsableActivoFijo = jComboBoxTiposRelacionesResponsableActivoFijo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesResponsableActivoFijo(
			JComboBox jComboBoxTiposAccionesResponsableActivoFijo) {
		this.jComboBoxTiposAccionesResponsableActivoFijo = jComboBoxTiposAccionesResponsableActivoFijo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioResponsableActivoFijo() {
		return this.jComboBoxTiposAccionesFormularioResponsableActivoFijo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioResponsableActivoFijo(
			JComboBox jComboBoxTiposAccionesFormularioResponsableActivoFijo) {
		this.jComboBoxTiposAccionesFormularioResponsableActivoFijo = jComboBoxTiposAccionesFormularioResponsableActivoFijo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.responsableactivofijoSessionBean=new ResponsableActivoFijoSessionBean();
		
		this.responsableactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.responsableactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.responsableactivofijoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ResponsableActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ResponsableActivoFijoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ResponsableActivoFijoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Responsable Activo Fijo MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.setResizable(true);
			this.setClosable(true);
			this.setMaximizable(true);
			this.iconable=true;
			
			setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
			
			if(Constantes.CON_VARIAS_VENTANAS) {
				openFrameCount++;
				
				if(openFrameCount==Constantes.INUM_MAX_VENTANAS) {
					openFrameCount=0;
				}
			}
		}				
	
		ResponsableActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleResponsableActivoFijo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarResponsableActivoFijo=new JButtonMe();
				this.jButtonModificarToolBarResponsableActivoFijo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarResponsableActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarResponsableActivoFijo,this.jTtoolBarDetalleResponsableActivoFijo,
							"actualizar","actualizar","Actualizar"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarResponsableActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarResponsableActivoFijo,this.jTtoolBarDetalleResponsableActivoFijo,
							"eliminar","eliminar","Eliminar"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarResponsableActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarResponsableActivoFijo,this.jTtoolBarDetalleResponsableActivoFijo,
							"cancelar","cancelar","Cancelar"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarResponsableActivoFijo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarResponsableActivoFijo,this.jTtoolBarDetalleResponsableActivoFijo,
							"guardarcambios","guardarcambios","Guardar"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarResponsableActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarResponsableActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarResponsableActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleResponsableActivoFijo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleResponsableActivoFijo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoResponsableActivoFijo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesResponsableActivoFijo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosResponsableActivoFijo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoResponsableActivoFijo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoResponsableActivoFijo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoResponsableActivoFijo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarResponsableActivoFijo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarResponsableActivoFijo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarResponsableActivoFijo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarResponsableActivoFijo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarResponsableActivoFijo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarResponsableActivoFijo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarResponsableActivoFijo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarResponsableActivoFijo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarResponsableActivoFijo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarResponsableActivoFijo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarResponsableActivoFijo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarResponsableActivoFijo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosResponsableActivoFijo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosResponsableActivoFijo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosResponsableActivoFijo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarResponsableActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarResponsableActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarResponsableActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarResponsableActivoFijo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarResponsableActivoFijo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarResponsableActivoFijo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarResponsableActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarResponsableActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarResponsableActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarResponsableActivoFijo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarResponsableActivoFijo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarResponsableActivoFijo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoResponsableActivoFijo.add(this.jMenuItemDetalleCerrarResponsableActivoFijo);
		
		this.jmenuDetalleAccionesResponsableActivoFijo.add(this.jMenuItemActualizarResponsableActivoFijo);
		this.jmenuDetalleAccionesResponsableActivoFijo.add(this.jMenuItemEliminarResponsableActivoFijo);
		this.jmenuDetalleAccionesResponsableActivoFijo.add(this.jMenuItemCancelarResponsableActivoFijo);		
		
		//this.jmenuDetalleDatosResponsableActivoFijo.add(this.jMenuItemDetalleAbrirOrderByResponsableActivoFijo);				
		this.jmenuDetalleDatosResponsableActivoFijo.add(this.jMenuItemDetalleMostarOcultarResponsableActivoFijo);				
				
		//this.jmenuDetalleAccionesResponsableActivoFijo.add(this.jMenuItemGuardarCambiosResponsableActivoFijo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleResponsableActivoFijo.add(this.jmenuDetalleArchivoResponsableActivoFijo);		
		this.jmenuBarDetalleResponsableActivoFijo.add(this.jmenuDetalleAccionesResponsableActivoFijo);		
		this.jmenuBarDetalleResponsableActivoFijo.add(this.jmenuDetalleDatosResponsableActivoFijo);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleResponsableActivoFijo);				
	}
	
	
	public void inicializarElementosCamposResponsableActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdResponsableActivoFijo = new JLabelMe();
		jLabelIdResponsableActivoFijo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdResponsableActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidResponsableActivoFijo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidResponsableActivoFijo.setToolTipText(ResponsableActivoFijoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutResponsableActivoFijo= new GridBagLayout();

		this.jPanelidResponsableActivoFijo.setLayout(this.gridaBagLayoutResponsableActivoFijo);

		jLabelidResponsableActivoFijo = new JLabel();
		jLabelidResponsableActivoFijo.setText("Id");

		jLabelidResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelubicacionResponsableActivoFijo = new JLabelMe();
		this.jLabelubicacionResponsableActivoFijo.setText(""+ResponsableActivoFijoConstantesFunciones.LABEL_UBICACION+" : *");
		this.jLabelubicacionResponsableActivoFijo.setToolTipText("Ubicacion");
		this.jLabelubicacionResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelubicacionResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelubicacionResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelubicacionResponsableActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelubicacionResponsableActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelubicacionResponsableActivoFijo.setToolTipText(ResponsableActivoFijoConstantesFunciones.LABEL_UBICACION);
		this.gridaBagLayoutResponsableActivoFijo = new GridBagLayout();
		this.jPanelubicacionResponsableActivoFijo.setLayout(this.gridaBagLayoutResponsableActivoFijo);


		jTextAreaubicacionResponsableActivoFijo= new JTextAreaMe();
		jTextAreaubicacionResponsableActivoFijo.setEnabled(false);
		jTextAreaubicacionResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaubicacionResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaubicacionResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaubicacionResponsableActivoFijo.setLineWrap(true);
		jTextAreaubicacionResponsableActivoFijo.setWrapStyleWord(true);
		jTextAreaubicacionResponsableActivoFijo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaubicacionResponsableActivoFijo.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaubicacionResponsableActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneubicacionResponsableActivoFijo = new JScrollPane(jTextAreaubicacionResponsableActivoFijo);
		jscrollPaneubicacionResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneubicacionResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneubicacionResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonubicacionResponsableActivoFijoBusqueda= new JButtonMe();
		this.jButtonubicacionResponsableActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonubicacionResponsableActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonubicacionResponsableActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonubicacionResponsableActivoFijoBusqueda.setText("U");
		this.jButtonubicacionResponsableActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonubicacionResponsableActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonubicacionResponsableActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaubicacionResponsableActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaubicacionResponsableActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ubicacionResponsableActivoFijoBusqueda"));

		if(this.responsableactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonubicacionResponsableActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabelfechaResponsableActivoFijo = new JLabelMe();
		this.jLabelfechaResponsableActivoFijo.setText(""+ResponsableActivoFijoConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaResponsableActivoFijo.setToolTipText("Fecha");
		this.jLabelfechaResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaResponsableActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaResponsableActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaResponsableActivoFijo.setToolTipText(ResponsableActivoFijoConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutResponsableActivoFijo = new GridBagLayout();
		this.jPanelfechaResponsableActivoFijo.setLayout(this.gridaBagLayoutResponsableActivoFijo);


		//jFormattedTextFieldfechaResponsableActivoFijo= new JFormattedTextFieldMe();

		jDateChooserfechaResponsableActivoFijo= new JDateChooser();
		jDateChooserfechaResponsableActivoFijo.setEnabled(false);
		jDateChooserfechaResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaResponsableActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaResponsableActivoFijo.setDate(new Date());
		jDateChooserfechaResponsableActivoFijo.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaResponsableActivoFijo.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaResponsableActivoFijoBusqueda= new JButtonMe();
		this.jButtonfechaResponsableActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaResponsableActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaResponsableActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaResponsableActivoFijoBusqueda.setText("U");
		this.jButtonfechaResponsableActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaResponsableActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaResponsableActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaResponsableActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaResponsableActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaResponsableActivoFijoBusqueda"));

		if(this.responsableactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaResponsableActivoFijoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionResponsableActivoFijo = new JLabelMe();
		this.jLabeldescripcionResponsableActivoFijo.setText(""+ResponsableActivoFijoConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionResponsableActivoFijo.setToolTipText("Descripcion");
		this.jLabeldescripcionResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionResponsableActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionResponsableActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionResponsableActivoFijo.setToolTipText(ResponsableActivoFijoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutResponsableActivoFijo = new GridBagLayout();
		this.jPaneldescripcionResponsableActivoFijo.setLayout(this.gridaBagLayoutResponsableActivoFijo);


		jTextAreadescripcionResponsableActivoFijo= new JTextAreaMe();
		jTextAreadescripcionResponsableActivoFijo.setEnabled(false);
		jTextAreadescripcionResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionResponsableActivoFijo.setLineWrap(true);
		jTextAreadescripcionResponsableActivoFijo.setWrapStyleWord(true);
		jTextAreadescripcionResponsableActivoFijo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionResponsableActivoFijo.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionResponsableActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionResponsableActivoFijo = new JScrollPane(jTextAreadescripcionResponsableActivoFijo);
		jscrollPanedescripcionResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionResponsableActivoFijoBusqueda= new JButtonMe();
		this.jButtondescripcionResponsableActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionResponsableActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionResponsableActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionResponsableActivoFijoBusqueda.setText("U");
		this.jButtondescripcionResponsableActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionResponsableActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionResponsableActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionResponsableActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionResponsableActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionResponsableActivoFijoBusqueda"));

		if(this.responsableactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionResponsableActivoFijoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysResponsableActivoFijo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaResponsableActivoFijo = new JLabelMe();
		this.jLabelid_empresaResponsableActivoFijo.setText(""+ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaResponsableActivoFijo.setToolTipText("Empresa");
		this.jLabelid_empresaResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaResponsableActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaResponsableActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaResponsableActivoFijo.setToolTipText(ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutResponsableActivoFijo = new GridBagLayout();
		this.jPanelid_empresaResponsableActivoFijo.setLayout(this.gridaBagLayoutResponsableActivoFijo);


		jComboBoxid_empresaResponsableActivoFijo= new JComboBoxMe();
		jComboBoxid_empresaResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaResponsableActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaResponsableActivoFijo.setEnabled(false);

		this.jButtonid_empresaResponsableActivoFijo= new JButtonMe();
		this.jButtonid_empresaResponsableActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaResponsableActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaResponsableActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaResponsableActivoFijo.setText("Buscar");
		this.jButtonid_empresaResponsableActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaResponsableActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaResponsableActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaResponsableActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaResponsableActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaResponsableActivoFijo"));

		this.jButtonid_empresaResponsableActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_empresaResponsableActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaResponsableActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaResponsableActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaResponsableActivoFijoBusqueda.setText("U");
		this.jButtonid_empresaResponsableActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaResponsableActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaResponsableActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaResponsableActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaResponsableActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaResponsableActivoFijoBusqueda"));

		if(this.responsableactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaResponsableActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_empresaResponsableActivoFijoUpdate= new JButtonMe();
		this.jButtonid_empresaResponsableActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaResponsableActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaResponsableActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaResponsableActivoFijoUpdate.setText("U");
		this.jButtonid_empresaResponsableActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaResponsableActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaResponsableActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaResponsableActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaResponsableActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaResponsableActivoFijoUpdate"));



					
		this.jLabelid_sucursalResponsableActivoFijo = new JLabelMe();
		this.jLabelid_sucursalResponsableActivoFijo.setText(""+ResponsableActivoFijoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalResponsableActivoFijo.setToolTipText("Sucursal");
		this.jLabelid_sucursalResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalResponsableActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalResponsableActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalResponsableActivoFijo.setToolTipText(ResponsableActivoFijoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutResponsableActivoFijo = new GridBagLayout();
		this.jPanelid_sucursalResponsableActivoFijo.setLayout(this.gridaBagLayoutResponsableActivoFijo);


		jComboBoxid_sucursalResponsableActivoFijo= new JComboBoxMe();
		jComboBoxid_sucursalResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalResponsableActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalResponsableActivoFijo.setEnabled(false);

		this.jButtonid_sucursalResponsableActivoFijo= new JButtonMe();
		this.jButtonid_sucursalResponsableActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalResponsableActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalResponsableActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalResponsableActivoFijo.setText("Buscar");
		this.jButtonid_sucursalResponsableActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalResponsableActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalResponsableActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalResponsableActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalResponsableActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalResponsableActivoFijo"));

		this.jButtonid_sucursalResponsableActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_sucursalResponsableActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalResponsableActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalResponsableActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalResponsableActivoFijoBusqueda.setText("U");
		this.jButtonid_sucursalResponsableActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalResponsableActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalResponsableActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalResponsableActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalResponsableActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalResponsableActivoFijoBusqueda"));

		if(this.responsableactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalResponsableActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalResponsableActivoFijoUpdate= new JButtonMe();
		this.jButtonid_sucursalResponsableActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalResponsableActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalResponsableActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalResponsableActivoFijoUpdate.setText("U");
		this.jButtonid_sucursalResponsableActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalResponsableActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalResponsableActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalResponsableActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalResponsableActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalResponsableActivoFijoUpdate"));



					
		this.jLabelid_detalle_activo_fijoResponsableActivoFijo = new JLabelMe();
		this.jLabelid_detalle_activo_fijoResponsableActivoFijo.setText(""+ResponsableActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO+" : *");
		this.jLabelid_detalle_activo_fijoResponsableActivoFijo.setToolTipText("Detalle Activo Fijo");
		this.jLabelid_detalle_activo_fijoResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_detalle_activo_fijoResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_detalle_activo_fijoResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_detalle_activo_fijoResponsableActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_detalle_activo_fijoResponsableActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_detalle_activo_fijoResponsableActivoFijo.setToolTipText(ResponsableActivoFijoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO);
		this.gridaBagLayoutResponsableActivoFijo = new GridBagLayout();
		this.jPanelid_detalle_activo_fijoResponsableActivoFijo.setLayout(this.gridaBagLayoutResponsableActivoFijo);


		jComboBoxid_detalle_activo_fijoResponsableActivoFijo= new JComboBoxMe();
		jComboBoxid_detalle_activo_fijoResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_detalle_activo_fijoResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_detalle_activo_fijoResponsableActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_detalle_activo_fijoResponsableActivoFijo= new JButtonMe();
		this.jButtonid_detalle_activo_fijoResponsableActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijoResponsableActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijoResponsableActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_detalle_activo_fijoResponsableActivoFijo.setText("Buscar");
		this.jButtonid_detalle_activo_fijoResponsableActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_detalle_activo_fijoResponsableActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijoResponsableActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_detalle_activo_fijoResponsableActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijoResponsableActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijoResponsableActivoFijo"));

		this.jButtonid_detalle_activo_fijoResponsableActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_detalle_activo_fijoResponsableActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoResponsableActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoResponsableActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_activo_fijoResponsableActivoFijoBusqueda.setText("U");
		this.jButtonid_detalle_activo_fijoResponsableActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_detalle_activo_fijoResponsableActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijoResponsableActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_detalle_activo_fijoResponsableActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijoResponsableActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijoResponsableActivoFijoBusqueda"));

		if(this.responsableactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_detalle_activo_fijoResponsableActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_detalle_activo_fijoResponsableActivoFijoUpdate= new JButtonMe();
		this.jButtonid_detalle_activo_fijoResponsableActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoResponsableActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_detalle_activo_fijoResponsableActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_detalle_activo_fijoResponsableActivoFijoUpdate.setText("U");
		this.jButtonid_detalle_activo_fijoResponsableActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_detalle_activo_fijoResponsableActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_detalle_activo_fijoResponsableActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_detalle_activo_fijoResponsableActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_detalle_activo_fijoResponsableActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_detalle_activo_fijoResponsableActivoFijoUpdate"));



					
		this.jLabelid_estructuraResponsableActivoFijo = new JLabelMe();
		this.jLabelid_estructuraResponsableActivoFijo.setText(""+ResponsableActivoFijoConstantesFunciones.LABEL_IDESTRUCTURA+" : *");
		this.jLabelid_estructuraResponsableActivoFijo.setToolTipText("Estructura");
		this.jLabelid_estructuraResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estructuraResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estructuraResponsableActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estructuraResponsableActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estructuraResponsableActivoFijo.setToolTipText(ResponsableActivoFijoConstantesFunciones.LABEL_IDESTRUCTURA);
		this.gridaBagLayoutResponsableActivoFijo = new GridBagLayout();
		this.jPanelid_estructuraResponsableActivoFijo.setLayout(this.gridaBagLayoutResponsableActivoFijo);


		jComboBoxid_estructuraResponsableActivoFijo= new JComboBoxMe();
		jComboBoxid_estructuraResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estructuraResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estructuraResponsableActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estructuraResponsableActivoFijo= new JButtonMe();
		this.jButtonid_estructuraResponsableActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraResponsableActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraResponsableActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estructuraResponsableActivoFijo.setText("Buscar");
		this.jButtonid_estructuraResponsableActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estructuraResponsableActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraResponsableActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estructuraResponsableActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraResponsableActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraResponsableActivoFijo"));

		this.jButtonid_estructuraResponsableActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_estructuraResponsableActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraResponsableActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraResponsableActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraResponsableActivoFijoBusqueda.setText("U");
		this.jButtonid_estructuraResponsableActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estructuraResponsableActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraResponsableActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estructuraResponsableActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraResponsableActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraResponsableActivoFijoBusqueda"));

		if(this.responsableactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estructuraResponsableActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_estructuraResponsableActivoFijoUpdate= new JButtonMe();
		this.jButtonid_estructuraResponsableActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraResponsableActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estructuraResponsableActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estructuraResponsableActivoFijoUpdate.setText("U");
		this.jButtonid_estructuraResponsableActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estructuraResponsableActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraResponsableActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estructuraResponsableActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraResponsableActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraResponsableActivoFijoUpdate"));


		jButtonid_estructuraResponsableActivoFijoArbol= new JButtonMe();
		jButtonid_estructuraResponsableActivoFijoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraResponsableActivoFijoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraResponsableActivoFijoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_estructuraResponsableActivoFijoArbol.setText("Arbol");
		jButtonid_estructuraResponsableActivoFijoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_estructuraResponsableActivoFijoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estructuraResponsableActivoFijoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_estructuraResponsableActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estructuraResponsableActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estructuraResponsableActivoFijoArbol"));



					
		this.jLabelid_empleadoResponsableActivoFijo = new JLabelMe();
		this.jLabelid_empleadoResponsableActivoFijo.setText(""+ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoResponsableActivoFijo.setToolTipText("Empleado");
		this.jLabelid_empleadoResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoResponsableActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoResponsableActivoFijo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoResponsableActivoFijo.setToolTipText(ResponsableActivoFijoConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutResponsableActivoFijo = new GridBagLayout();
		this.jPanelid_empleadoResponsableActivoFijo.setLayout(this.gridaBagLayoutResponsableActivoFijo);


		jComboBoxid_empleadoResponsableActivoFijo= new JComboBoxMe();
		jComboBoxid_empleadoResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoResponsableActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoResponsableActivoFijo= new JButtonMe();
		this.jButtonid_empleadoResponsableActivoFijo.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoResponsableActivoFijo.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoResponsableActivoFijo.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoResponsableActivoFijo.setText("Buscar");
		this.jButtonid_empleadoResponsableActivoFijo.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoResponsableActivoFijo.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoResponsableActivoFijo,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoResponsableActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoResponsableActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoResponsableActivoFijo"));

		this.jButtonid_empleadoResponsableActivoFijoBusqueda= new JButtonMe();
		this.jButtonid_empleadoResponsableActivoFijoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoResponsableActivoFijoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoResponsableActivoFijoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoResponsableActivoFijoBusqueda.setText("U");
		this.jButtonid_empleadoResponsableActivoFijoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoResponsableActivoFijoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoResponsableActivoFijoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoResponsableActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoResponsableActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoResponsableActivoFijoBusqueda"));

		if(this.responsableactivofijoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoResponsableActivoFijoBusqueda.setVisible(false);		}

		this.jButtonid_empleadoResponsableActivoFijoUpdate= new JButtonMe();
		this.jButtonid_empleadoResponsableActivoFijoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoResponsableActivoFijoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoResponsableActivoFijoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoResponsableActivoFijoUpdate.setText("U");
		this.jButtonid_empleadoResponsableActivoFijoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoResponsableActivoFijoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoResponsableActivoFijoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoResponsableActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoResponsableActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoResponsableActivoFijoUpdate"));



	}
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) {
		//System.out.println("TRANSFIERE EL MANEJO AL PADRE O FORM PRINCIPAL");
		
		jInternalFrameParent.jButtonActionPerformedTecladoGeneral(sTipo,evt);
	}
	
	//JPanel
	//@SuppressWarnings({"unchecked" })//"rawtypes"
	public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {	
		//PARA TABLA PARAMETROS
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		this.jContentPane = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
				
		this.usuarioActual=usuarioActual;
		this.resumenUsuarioActual=resumenUsuarioActual;
		this.opcionActual=opcionActual;
		
		this.moduloActual=moduloActual;		
		this.parametroGeneralSg=parametroGeneralSg;		
		this.parametroGeneralUsuario=parametroGeneralUsuario;	
		
		this.jDesktopPane=jDesktopPane;
				
		this.conFuncionalidadRelaciones=parametroGeneralUsuario.getcon_guardar_relaciones();
		
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleResponsableActivoFijo = new ResponsableActivoFijoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Responsable Activo Fijo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutResponsableActivoFijo= new GridBagLayout();
		

		
		String sToolTipResponsableActivoFijo="";
		sToolTipResponsableActivoFijo=ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipResponsableActivoFijo+="(ActivosFijos.ResponsableActivoFijo)";
		}
		
		if(!this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
			sToolTipResponsableActivoFijo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoResponsableActivoFijo = new JButtonMe();
		this.jButtonModificarResponsableActivoFijo = new JButtonMe();
        this.jButtonActualizarResponsableActivoFijo = new JButtonMe();
        this.jButtonEliminarResponsableActivoFijo = new JButtonMe();
        this.jButtonCancelarResponsableActivoFijo = new JButtonMe();
        this.jButtonGuardarCambiosResponsableActivoFijo = new JButtonMe();
		this.jButtonGuardarCambiosTablaResponsableActivoFijo = new JButtonMe();
		this.jButtonCerrarResponsableActivoFijo = new JButtonMe();
		
		this.jScrollPanelDatosResponsableActivoFijo = new JScrollPane();   
        this.jScrollPanelDatosEdicionResponsableActivoFijo = new JScrollPane();
		this.jScrollPanelDatosGeneralResponsableActivoFijo = new JScrollPane();
				
		
		
		this.jPanelCamposResponsableActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosResponsableActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesResponsableActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioResponsableActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Responsable Activo Fijo";
		
		if(!this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosResponsableActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Responsable Activo Fijos" + this.sPath));
		} else {
			this.jScrollPanelDatosResponsableActivoFijo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionResponsableActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralResponsableActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposResponsableActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposResponsableActivoFijo.setName("jPanelCamposResponsableActivoFijo"); 

		this.jPanelCamposOcultosResponsableActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosResponsableActivoFijo.setName("jPanelCamposOcultosResponsableActivoFijo"); 

        this.jPanelAccionesResponsableActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesResponsableActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesResponsableActivoFijo.setName("Acciones"); 

		this.jPanelAccionesFormularioResponsableActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioResponsableActivoFijo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioResponsableActivoFijo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoResponsableActivoFijo.setText("Nuevo");
		this.jButtonModificarResponsableActivoFijo.setText("Editar");
        this.jButtonActualizarResponsableActivoFijo.setText("Actualizar");
        this.jButtonEliminarResponsableActivoFijo.setText("Eliminar");
        this.jButtonCancelarResponsableActivoFijo.setText("Cancelar");
        this.jButtonGuardarCambiosResponsableActivoFijo.setText("Guardar");
		this.jButtonGuardarCambiosTablaResponsableActivoFijo.setText("Guardar");
		this.jButtonCerrarResponsableActivoFijo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoResponsableActivoFijo,"nuevo_button","Nuevo",this.responsableactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarResponsableActivoFijo,"modificar_button","Editar",this.responsableactivofijoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarResponsableActivoFijo,"actualizar_button","Actualizar",this.responsableactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarResponsableActivoFijo,"eliminar_button","Eliminar",this.responsableactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarResponsableActivoFijo,"cancelar_button","Cancelar",this.responsableactivofijoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosResponsableActivoFijo,"guardarcambios_button","Guardar",this.responsableactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaResponsableActivoFijo,"guardarcambiostabla_button","Guardar",this.responsableactivofijoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarResponsableActivoFijo,"cerrar_button","Salir",this.responsableactivofijoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoResponsableActivoFijo.setToolTipText("Nuevo"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarResponsableActivoFijo.setToolTipText("Editar"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarResponsableActivoFijo.setToolTipText("Actualizar"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarResponsableActivoFijo.setToolTipText("Eliminar)"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarResponsableActivoFijo.setToolTipText("Cancelar"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosResponsableActivoFijo.setToolTipText("Guardar"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaResponsableActivoFijo.setToolTipText("Guardar"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarResponsableActivoFijo.setToolTipText("Salir"+" "+ResponsableActivoFijoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
		//HOT KEYS
		/*
		N->Nuevo
		N->Alt + Nuevo Relaciones (ANTES R)
		A->Actualizar
		E->Eliminar
		S->Cerrar
		C->->Mayus + Cancelar (ANTES Q->Quit)
		G->Guardar Cambios
		D->Duplicar
		C->Alt + Cop?ar
		O->Orden
		N->Nuevo Tabla
		R->Recargar Informacion Inicial (ANTES I)
		Alt + Pag.Down->Siguientes
		Alt + Pag.Up->Anteriores
		
		NO UTILIZADOS
		M->Modificar
		
		*/
		String sMapKey = "";
		InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoResponsableActivoFijo";
		inputMap = this.jButtonNuevoResponsableActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoResponsableActivoFijo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoResponsableActivoFijo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarResponsableActivoFijo";
		inputMap = this.jButtonActualizarResponsableActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarResponsableActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarResponsableActivoFijo"));
		
		//ELIMINAR
		sMapKey = "EliminarResponsableActivoFijo";
		inputMap = this.jButtonEliminarResponsableActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarResponsableActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarResponsableActivoFijo"));
		
		//CANCELAR	
		sMapKey = "CancelarResponsableActivoFijo";
		inputMap = this.jButtonCancelarResponsableActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarResponsableActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarResponsableActivoFijo"));
		
		//CERRAR		
		sMapKey = "CerrarResponsableActivoFijo";
		inputMap = this.jButtonCerrarResponsableActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarResponsableActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarResponsableActivoFijo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaResponsableActivoFijo";
		inputMap = this.jButtonGuardarCambiosTablaResponsableActivoFijo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaResponsableActivoFijo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaResponsableActivoFijo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoResponsableActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoResponsableActivoFijo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoResponsableActivoFijo.setToolTipText("Nuevo ResponsableActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarResponsableActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarResponsableActivoFijo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarResponsableActivoFijo.setToolTipText("Sin Cerrar Ventana ResponsableActivoFijo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeResponsableActivoFijo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeResponsableActivoFijo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeResponsableActivoFijo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesResponsableActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesResponsableActivoFijo.setText("Accion");
		this.jComboBoxTiposAccionesResponsableActivoFijo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioResponsableActivoFijo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioResponsableActivoFijo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioResponsableActivoFijo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesResponsableActivoFijo = new JLabelMe();
		
		this.jLabelAccionesResponsableActivoFijo.setText("Acciones");		
		this.jLabelAccionesResponsableActivoFijo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesResponsableActivoFijo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesResponsableActivoFijo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposResponsableActivoFijo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysResponsableActivoFijo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesResponsableActivoFijo=new JTabbedPane();
		this.jTabbedPaneRelacionesResponsableActivoFijo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesResponsableActivoFijo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesResponsableActivoFijo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesResponsableActivoFijo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesResponsableActivoFijo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioResponsableActivoFijo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioResponsableActivoFijo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioResponsableActivoFijo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioResponsableActivoFijo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposResponsableActivoFijo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosResponsableActivoFijo = new GridBagLayout();
		
		this.jPanelCamposResponsableActivoFijo.setLayout(gridaBagLayoutCamposResponsableActivoFijo);
		this.jPanelCamposOcultosResponsableActivoFijo.setLayout(gridaBagLayoutCamposOcultosResponsableActivoFijo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
	this.gridBagConstraintsResponsableActivoFijo.gridx = 0;
	this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
	this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidResponsableActivoFijo.add(jLabelIdResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);



	this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
	this.gridBagConstraintsResponsableActivoFijo.gridx = 1;
	this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
	this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidResponsableActivoFijo.add(jLabelidResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);


	this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
	this.gridBagConstraintsResponsableActivoFijo.gridx = 0;
	this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
	this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaResponsableActivoFijo.add(jLabelid_empresaResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
		this.gridBagConstraintsResponsableActivoFijo.gridx = 2;
		this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
		this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaResponsableActivoFijo.add(jButtonid_empresaResponsableActivoFijoBusqueda, this.gridBagConstraintsResponsableActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
		this.gridBagConstraintsResponsableActivoFijo.gridx = 3;
		this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
		this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaResponsableActivoFijo.add(jButtonid_empresaResponsableActivoFijoUpdate, this.gridBagConstraintsResponsableActivoFijo);
	}

	this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
	this.gridBagConstraintsResponsableActivoFijo.gridx = 1;
	this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
	this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaResponsableActivoFijo.add(jComboBoxid_empresaResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);


	this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
	this.gridBagConstraintsResponsableActivoFijo.gridx = 0;
	this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
	this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalResponsableActivoFijo.add(jLabelid_sucursalResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
		this.gridBagConstraintsResponsableActivoFijo.gridx = 2;
		this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
		this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalResponsableActivoFijo.add(jButtonid_sucursalResponsableActivoFijoBusqueda, this.gridBagConstraintsResponsableActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
		this.gridBagConstraintsResponsableActivoFijo.gridx = 3;
		this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
		this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalResponsableActivoFijo.add(jButtonid_sucursalResponsableActivoFijoUpdate, this.gridBagConstraintsResponsableActivoFijo);
	}

	this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
	this.gridBagConstraintsResponsableActivoFijo.gridx = 1;
	this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
	this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalResponsableActivoFijo.add(jComboBoxid_sucursalResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);


	this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
	this.gridBagConstraintsResponsableActivoFijo.gridx = 0;
	this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
	this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_detalle_activo_fijoResponsableActivoFijo.add(jLabelid_detalle_activo_fijoResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
		this.gridBagConstraintsResponsableActivoFijo.gridx = 2;
		this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
		this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_activo_fijoResponsableActivoFijo.add(jButtonid_detalle_activo_fijoResponsableActivoFijoBusqueda, this.gridBagConstraintsResponsableActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
		this.gridBagConstraintsResponsableActivoFijo.gridx = 3;
		this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
		this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_detalle_activo_fijoResponsableActivoFijo.add(jButtonid_detalle_activo_fijoResponsableActivoFijoUpdate, this.gridBagConstraintsResponsableActivoFijo);
	}

	this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
	this.gridBagConstraintsResponsableActivoFijo.gridx = 1;
	this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
	this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_detalle_activo_fijoResponsableActivoFijo.add(jComboBoxid_detalle_activo_fijoResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);


	this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
	this.gridBagConstraintsResponsableActivoFijo.gridx = 0;
	this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
	this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estructuraResponsableActivoFijo.add(jLabelid_estructuraResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
		this.gridBagConstraintsResponsableActivoFijo.gridx = 2;
		this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
		this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraResponsableActivoFijo.add(jButtonid_estructuraResponsableActivoFijoBusqueda, this.gridBagConstraintsResponsableActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
		this.gridBagConstraintsResponsableActivoFijo.gridx = 3;
		this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
		this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estructuraResponsableActivoFijo.add(jButtonid_estructuraResponsableActivoFijoUpdate, this.gridBagConstraintsResponsableActivoFijo);
	}

	this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
	this.gridBagConstraintsResponsableActivoFijo.gridx = 1;
	this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
	this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estructuraResponsableActivoFijo.add(jComboBoxid_estructuraResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);


	this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
	this.gridBagConstraintsResponsableActivoFijo.gridx = 0;
	this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
	this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoResponsableActivoFijo.add(jLabelid_empleadoResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
	//this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
	this.gridBagConstraintsResponsableActivoFijo.gridx = 2;
	this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
	this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoResponsableActivoFijo.add(jButtonid_empleadoResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
		this.gridBagConstraintsResponsableActivoFijo.gridx = 3;
		this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
		this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoResponsableActivoFijo.add(jButtonid_empleadoResponsableActivoFijoBusqueda, this.gridBagConstraintsResponsableActivoFijo);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
		this.gridBagConstraintsResponsableActivoFijo.gridx = 4;
		this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
		this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoResponsableActivoFijo.add(jButtonid_empleadoResponsableActivoFijoUpdate, this.gridBagConstraintsResponsableActivoFijo);
	}

	this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
	this.gridBagConstraintsResponsableActivoFijo.gridx = 1;
	this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
	this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoResponsableActivoFijo.add(jComboBoxid_empleadoResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);


	this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
	this.gridBagConstraintsResponsableActivoFijo.gridx = 0;
	this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
	this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelubicacionResponsableActivoFijo.add(jLabelubicacionResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
		this.gridBagConstraintsResponsableActivoFijo.gridx = 2;
		this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
		this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelubicacionResponsableActivoFijo.add(jButtonubicacionResponsableActivoFijoBusqueda, this.gridBagConstraintsResponsableActivoFijo);
	}

	this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
	this.gridBagConstraintsResponsableActivoFijo.gridx = 1;
	this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
	this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelubicacionResponsableActivoFijo.add(jscrollPaneubicacionResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);


	this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
	this.gridBagConstraintsResponsableActivoFijo.gridx = 0;
	this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
	this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaResponsableActivoFijo.add(jLabelfechaResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
		this.gridBagConstraintsResponsableActivoFijo.gridx = 2;
		this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
		this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaResponsableActivoFijo.add(jButtonfechaResponsableActivoFijoBusqueda, this.gridBagConstraintsResponsableActivoFijo);
	}

	this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
	this.gridBagConstraintsResponsableActivoFijo.gridx = 1;
	this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
	this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaResponsableActivoFijo.add(jDateChooserfechaResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);


	this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
	this.gridBagConstraintsResponsableActivoFijo.gridx = 0;
	this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
	this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionResponsableActivoFijo.add(jLabeldescripcionResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		//this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
		this.gridBagConstraintsResponsableActivoFijo.gridx = 2;
		this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
		this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionResponsableActivoFijo.add(jButtondescripcionResponsableActivoFijoBusqueda, this.gridBagConstraintsResponsableActivoFijo);
	}

	this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
	this.gridBagConstraintsResponsableActivoFijo.gridx = 1;
	this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
	this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionResponsableActivoFijo.add(jscrollPanedescripcionResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsableActivoFijo.gridy = iYPanelCamposResponsableActivoFijo;
	this.gridBagConstraintsResponsableActivoFijo.gridx = iXPanelCamposResponsableActivoFijo++;
	this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsableActivoFijo.add(this.jPanelidResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);



	if(iXPanelCamposResponsableActivoFijo % 1==0) {
		iXPanelCamposResponsableActivoFijo=0;
		iYPanelCamposResponsableActivoFijo++;
	}
	this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsableActivoFijo.gridy = iYPanelCamposResponsableActivoFijo;
	this.gridBagConstraintsResponsableActivoFijo.gridx = iXPanelCamposResponsableActivoFijo++;
	this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsableActivoFijo.add(this.jPanelid_detalle_activo_fijoResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);



	if(iXPanelCamposResponsableActivoFijo % 1==0) {
		iXPanelCamposResponsableActivoFijo=0;
		iYPanelCamposResponsableActivoFijo++;
	}
	this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsableActivoFijo.gridy = iYPanelCamposResponsableActivoFijo;
	this.gridBagConstraintsResponsableActivoFijo.gridx = iXPanelCamposResponsableActivoFijo++;
	this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsableActivoFijo.add(this.jPanelid_estructuraResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);



	if(iXPanelCamposResponsableActivoFijo % 1==0) {
		iXPanelCamposResponsableActivoFijo=0;
		iYPanelCamposResponsableActivoFijo++;
	}
	this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsableActivoFijo.gridy = iYPanelCamposResponsableActivoFijo;
	this.gridBagConstraintsResponsableActivoFijo.gridx = iXPanelCamposResponsableActivoFijo++;
	this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsableActivoFijo.add(this.jPanelid_empleadoResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);



	if(iXPanelCamposResponsableActivoFijo % 1==0) {
		iXPanelCamposResponsableActivoFijo=0;
		iYPanelCamposResponsableActivoFijo++;
	}
	this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsableActivoFijo.gridy = iYPanelCamposResponsableActivoFijo;
	this.gridBagConstraintsResponsableActivoFijo.gridx = iXPanelCamposResponsableActivoFijo++;
	this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsableActivoFijo.add(this.jPanelubicacionResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);



	if(iXPanelCamposResponsableActivoFijo % 1==0) {
		iXPanelCamposResponsableActivoFijo=0;
		iYPanelCamposResponsableActivoFijo++;
	}
	this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsableActivoFijo.gridy = iYPanelCamposResponsableActivoFijo;
	this.gridBagConstraintsResponsableActivoFijo.gridx = iXPanelCamposResponsableActivoFijo++;
	this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsableActivoFijo.add(this.jPanelfechaResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);



	if(iXPanelCamposResponsableActivoFijo % 1==0) {
		iXPanelCamposResponsableActivoFijo=0;
		iYPanelCamposResponsableActivoFijo++;
	}
	this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsableActivoFijo.gridy = iYPanelCamposResponsableActivoFijo;
	this.gridBagConstraintsResponsableActivoFijo.gridx = iXPanelCamposResponsableActivoFijo++;
	this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposResponsableActivoFijo.add(this.jPaneldescripcionResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);



	if(iXPanelCamposResponsableActivoFijo % 1==0) {
		iXPanelCamposResponsableActivoFijo=0;
		iYPanelCamposResponsableActivoFijo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsableActivoFijo.gridy = iYPanelCamposOcultosResponsableActivoFijo;
	this.gridBagConstraintsResponsableActivoFijo.gridx = iXPanelCamposOcultosResponsableActivoFijo++;
	this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosResponsableActivoFijo.add(this.jPanelid_empresaResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);



	if(iXPanelCamposOcultosResponsableActivoFijo % 1==0) {
		iXPanelCamposOcultosResponsableActivoFijo=0;
		iYPanelCamposOcultosResponsableActivoFijo++;
	}
	this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
	this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsResponsableActivoFijo.gridy = iYPanelCamposOcultosResponsableActivoFijo;
	this.gridBagConstraintsResponsableActivoFijo.gridx = iXPanelCamposOcultosResponsableActivoFijo++;
	this.gridBagConstraintsResponsableActivoFijo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsResponsableActivoFijo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosResponsableActivoFijo.add(this.jPanelid_sucursalResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);



	if(iXPanelCamposOcultosResponsableActivoFijo % 1==0) {
		iXPanelCamposOcultosResponsableActivoFijo=0;
		iYPanelCamposOcultosResponsableActivoFijo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesResponsableActivoFijo= new GridBagLayout();
		this.jPanelAccionesResponsableActivoFijo.setLayout(gridaBagLayoutAccionesResponsableActivoFijo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioResponsableActivoFijo= new GridBagLayout();
		this.jPanelAccionesFormularioResponsableActivoFijo.setLayout(gridaBagLayoutAccionesFormularioResponsableActivoFijo);
		
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsResponsableActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioResponsableActivoFijo.add(this.jComboBoxTiposAccionesFormularioResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);

		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsResponsableActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioResponsableActivoFijo.add(this.jCheckBoxPostAccionNuevoResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.responsableactivofijoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsResponsableActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioResponsableActivoFijo.add(this.jCheckBoxPostAccionSinCerrarResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.responsableactivofijoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.responsableactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsResponsableActivoFijo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioResponsableActivoFijo.add(this.jCheckBoxPostAccionSinMensajeResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
		this.gridBagConstraintsResponsableActivoFijo.gridx = iPosXAccion++;
			
		this.jPanelAccionesResponsableActivoFijo.add(this.jButtonModificarResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);							

		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsResponsableActivoFijo.gridy = 0;
		this.gridBagConstraintsResponsableActivoFijo.gridx =iPosXAccion++;
			
		this.jPanelAccionesResponsableActivoFijo.add(this.jButtonEliminarResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
		
			
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.gridy = 0;		
		this.gridBagConstraintsResponsableActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesResponsableActivoFijo.add(this.jButtonActualizarResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);


		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.gridy = 0;		
		this.gridBagConstraintsResponsableActivoFijo.gridx = iPosXAccion++;
		
		this.jPanelAccionesResponsableActivoFijo.add(this.jButtonGuardarCambiosResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);	
		
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.gridy = 0;		
		this.gridBagConstraintsResponsableActivoFijo.gridx =iPosXAccion++;
		
		this.jPanelAccionesResponsableActivoFijo.add(this.jButtonCancelarResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutResponsableActivoFijo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutResponsableActivoFijo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.responsableactivofijoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();						
			this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsResponsableActivoFijo.gridx = 0;		
			//this.gridBagConstraintsResponsableActivoFijo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsResponsableActivoFijo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsResponsableActivoFijo.gridx =0;
		this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsResponsableActivoFijo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ResponsableActivoFijoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleResponsableActivoFijo = new ResponsableActivoFijoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Responsable Activo Fijo DATOS");
			
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	        //this.setjInternalFrameParent(this);
	        
			iHeightFormularioMaximo=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	        
	        if(iHeightFormulario>iHeightFormularioMaximo) {
	        	iHeightFormulario=iHeightFormularioMaximo;
	        }
			
			iWidthFormularioMaximo=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
	        
			if(iWidthFormulario>iWidthFormularioMaximo) {
	        	iWidthFormulario=iWidthFormularioMaximo;
	        }
			
	        //this.setTitle("[FOR] - Responsable Activo Fijo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Responsable Activo Fijo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ResponsableActivoFijoModel responsableactivofijoModel=new ResponsableActivoFijoModel(this);
			
			//SI USARA CLASE INTERNA
			//ResponsableActivoFijoModel.ResponsableActivoFijoFocusTraversalPolicy responsableactivofijoFocusTraversalPolicy = responsableactivofijoModel.new ResponsableActivoFijoFocusTraversalPolicy(this);
			
			//responsableactivofijoFocusTraversalPolicy.setresponsableactivofijoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(responsableactivofijoModel);
			
			
			this.jContentPaneDetalleResponsableActivoFijo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleResponsableActivoFijo = new GridBagLayout();	
			this.jContentPaneDetalleResponsableActivoFijo.setLayout(gridaBagLayoutDetalleResponsableActivoFijo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosResponsableActivoFijo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
				this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsResponsableActivoFijo.gridx = 0;
					
				
				this.jContentPaneDetalleResponsableActivoFijo.add(jTtoolBarDetalleResponsableActivoFijo, gridBagConstraintsResponsableActivoFijo);								
				
}
			
			this.jScrollPanelDatosEdicionResponsableActivoFijo=   new JScrollPane(jContentPaneDetalleResponsableActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionResponsableActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionResponsableActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionResponsableActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralResponsableActivoFijo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralResponsableActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralResponsableActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralResponsableActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsResponsableActivoFijo.gridx = 0;
	        
			this.jContentPaneDetalleResponsableActivoFijo.add(jPanelCamposResponsableActivoFijo, gridBagConstraintsResponsableActivoFijo);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& responsableactivofijoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.responsableactivofijoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsResponsableActivoFijo= new GridBagConstraints();
						this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsResponsableActivoFijo.gridx = 0;
						this.jContentPaneDetalleResponsableActivoFijo.add(this.jTabbedPaneRelacionesResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesResponsableActivoFijo.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosResponsableActivoFijo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
					this.gridBagConstraintsResponsableActivoFijo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsResponsableActivoFijo.gridx = 0;
					
				
					this.jContentPaneDetalleResponsableActivoFijo.add(jPanelCamposOcultosResponsableActivoFijo, gridBagConstraintsResponsableActivoFijo);
				
					this.jPanelCamposOcultosResponsableActivoFijo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsResponsableActivoFijo.gridx = 0;
	        this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleResponsableActivoFijo.add(this.jPanelAccionesFormularioResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);							
			
			
			
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
	        this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsResponsableActivoFijo.gridx = 0;
	        
			
			this.jContentPaneDetalleResponsableActivoFijo.add(this.jPanelAccionesResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionResponsableActivoFijo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionResponsableActivoFijo=   new JScrollPane(this.jPanelCamposResponsableActivoFijo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionResponsableActivoFijo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionResponsableActivoFijo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionResponsableActivoFijo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsResponsableActivoFijo.gridx = 0;
			this.gridBagConstraintsResponsableActivoFijo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsResponsableActivoFijo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsResponsableActivoFijo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsResponsableActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);			
			
			this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
			this.gridBagConstraintsResponsableActivoFijo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsResponsableActivoFijo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResponsableActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
			
			
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsResponsableActivoFijo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
		
			
		this.gridBagConstraintsResponsableActivoFijo = new GridBagConstraints();
		this.gridBagConstraintsResponsableActivoFijo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsResponsableActivoFijo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesResponsableActivoFijo, this.gridBagConstraintsResponsableActivoFijo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralResponsableActivoFijo;//jContentPane;
		
		return jScrollPanelDatosEdicionResponsableActivoFijo;
    } 
	
		
	
	
	
	
	
	
	
	
	/*
	case "CONTROL_BUSQUEDA":
		sKeyName="F3";
	case "CONTROL_BUSCAR":
		sKeyName="F4";
	case "CONTROL_ARBOL":
		sKeyName="F5";
	case "CONTROL_ACTUALIZAR":
		sKeyName="F6";
	sKeyName="N";					
	*/
}
