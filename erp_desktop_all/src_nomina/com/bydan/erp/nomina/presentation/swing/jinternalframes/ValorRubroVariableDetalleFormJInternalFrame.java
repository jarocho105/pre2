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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.ValorRubroVariableConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class ValorRubroVariableDetalleFormJInternalFrame extends ValorRubroVariableBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleValorRubroVariable;
	
	protected JMenuBar jmenuBarDetalleValorRubroVariable;
	
	protected JMenu jmenuDetalleValorRubroVariable;
	protected JMenu jmenuDetalleArchivoValorRubroVariable;
	protected JMenu jmenuDetalleAccionesValorRubroVariable;
	protected JMenu jmenuDetalleDatosValorRubroVariable;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleValorRubroVariable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutValorRubroVariable;	
	protected GridBagConstraints gridBagConstraintsValorRubroVariable;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ValorRubroVariableBeanSwingJInternalFrameAdditional jInternalFrameDetalleValorRubroVariable;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_rubroemplea="";
	
	public ValorRubroVariableSessionBean valorrubrovariableSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public RubroEmpleaSessionBean rubroempleaSessionBean;	
	
	public ValorRubroVariableLogic valorrubrovariableLogic;
	
	public JScrollPane jScrollPanelDatosValorRubroVariable;
	public JScrollPane jScrollPanelDatosEdicionValorRubroVariable;
	public JScrollPane jScrollPanelDatosGeneralValorRubroVariable;
	
	protected JPanel jPanelCamposValorRubroVariable;    
	protected JPanel jPanelCamposOcultosValorRubroVariable;    	
	protected JPanel jPanelAccionesValorRubroVariable;
	protected JPanel jPanelAccionesFormularioValorRubroVariable;
    
	
	
	protected Integer iXPanelCamposValorRubroVariable=0;
	protected Integer iYPanelCamposValorRubroVariable=0;
	
	protected Integer iXPanelCamposOcultosValorRubroVariable=0;
	protected Integer iYPanelCamposOcultosValorRubroVariable=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoValorRubroVariable;
	public JButton jButtonModificarValorRubroVariable;
	public JButton jButtonActualizarValorRubroVariable;
    public JButton jButtonEliminarValorRubroVariable;
	public JButton jButtonCancelarValorRubroVariable;
    public JButton jButtonGuardarCambiosValorRubroVariable;
	public JButton jButtonGuardarCambiosTablaValorRubroVariable;
	protected JButton jButtonCerrarValorRubroVariable;
	
	
	protected JButton jButtonProcesarInformacionValorRubroVariable;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoValorRubroVariable;
	protected JCheckBox jCheckBoxPostAccionSinCerrarValorRubroVariable;
	protected JCheckBox jCheckBoxPostAccionSinMensajeValorRubroVariable;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarValorRubroVariable;
	protected JButton jButtonModificarToolBarValorRubroVariable;
	protected JButton jButtonActualizarToolBarValorRubroVariable;
    protected JButton jButtonEliminarToolBarValorRubroVariable;
	protected JButton jButtonCancelarToolBarValorRubroVariable;
    protected JButton jButtonGuardarCambiosToolBarValorRubroVariable;
	protected JButton jButtonGuardarCambiosTablaToolBarValorRubroVariable;
	protected JButton jButtonMostrarOcultarTablaToolBarValorRubroVariable;
	protected JButton jButtonCerrarToolBarValorRubroVariable;
	
	protected JButton jButtonProcesarInformacionToolBarValorRubroVariable;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoValorRubroVariable;
	protected JMenuItem jMenuItemModificarValorRubroVariable;
	protected JMenuItem jMenuItemActualizarValorRubroVariable;
    protected JMenuItem jMenuItemEliminarValorRubroVariable;
	protected JMenuItem jMenuItemCancelarValorRubroVariable;
    protected JMenuItem jMenuItemGuardarCambiosValorRubroVariable;
	protected JMenuItem jMenuItemGuardarCambiosTablaValorRubroVariable;
	protected JMenuItem jMenuItemCerrarValorRubroVariable;
	protected JMenuItem jMenuItemDetalleCerrarValorRubroVariable;
	protected JMenuItem jMenuItemDetalleMostarOcultarValorRubroVariable;
	
	protected JMenuItem jMenuItemProcesarInformacionValorRubroVariable;
	protected JMenuItem jMenuItemNuevoGuardarCambiosValorRubroVariable;
	protected JMenuItem jMenuItemMostrarOcultarValorRubroVariable;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesValorRubroVariable;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesValorRubroVariable;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesValorRubroVariable;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioValorRubroVariable;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidValorRubroVariable;
	public JLabel jLabelIdValorRubroVariable;
	public JLabel jLabelidValorRubroVariable;
	public JButton jButtonidValorRubroVariableBusqueda= new JButtonMe();

	public JPanel jPanelfechaValorRubroVariable;
	public JLabel jLabelfechaValorRubroVariable;
	//public JFormattedTextField jDateChooserfechaValorRubroVariable;

	public JDateChooser jDateChooserfechaValorRubroVariable;
	public JButton jButtonfechaValorRubroVariableBusqueda= new JButtonMe();

	public JPanel jPanelvalorValorRubroVariable;
	public JLabel jLabelvalorValorRubroVariable;
	public JTextField jTextFieldvalorValorRubroVariable;
	public JButton jButtonvalorValorRubroVariableBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaValorRubroVariable;
	public JLabel jLabelid_empresaValorRubroVariable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaValorRubroVariable;
	public JButton jButtonid_empresaValorRubroVariable= new JButtonMe();
	public JButton jButtonid_empresaValorRubroVariableUpdate= new JButtonMe();
	public JButton jButtonid_empresaValorRubroVariableBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoValorRubroVariable;
	public JLabel jLabelid_empleadoValorRubroVariable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoValorRubroVariable;
	public JButton jButtonid_empleadoValorRubroVariable= new JButtonMe();
	public JButton jButtonid_empleadoValorRubroVariableUpdate= new JButtonMe();
	public JButton jButtonid_empleadoValorRubroVariableBusqueda= new JButtonMe();

	public JPanel jPanelid_rubro_empleaValorRubroVariable;
	public JLabel jLabelid_rubro_empleaValorRubroVariable;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_rubro_empleaValorRubroVariable;
	public JButton jButtonid_rubro_empleaValorRubroVariable= new JButtonMe();
	public JButton jButtonid_rubro_empleaValorRubroVariableUpdate= new JButtonMe();
	public JButton jButtonid_rubro_empleaValorRubroVariableBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesValorRubroVariable;
	
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
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=330;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public ValorRubroVariableDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposValorRubroVariable=new JPanel();
				this.jPanelAccionesFormularioValorRubroVariable=new JPanel();
				this.jmenuBarDetalleValorRubroVariable=new JMenuBar();
				this.jTtoolBarDetalleValorRubroVariable=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ValorRubroVariableDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ValorRubroVariable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ValorRubroVariableDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ValorRubroVariable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ValorRubroVariableDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ValorRubroVariable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ValorRubroVariableDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ValorRubroVariable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ValorRubroVariableDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ValorRubroVariable No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarValorRubroVariable() {
		return this.jButtonActualizarToolBarValorRubroVariable;
	}
	
	public JButton getjButtonEliminarToolBarValorRubroVariable() {
		return this.jButtonEliminarToolBarValorRubroVariable;
	}
	
	public JButton getjButtonCancelarToolBarValorRubroVariable() {
		return this.jButtonCancelarToolBarValorRubroVariable;
	}		
	
	public JButton getjButtonProcesarInformacionValorRubroVariable() {
		return this.jButtonProcesarInformacionValorRubroVariable;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionValorRubroVariable)	{
		this.jButtonProcesarInformacionValorRubroVariable = jButtonProcesarInformacionValorRubroVariable;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesValorRubroVariable() {
		return this.jComboBoxTiposAccionesValorRubroVariable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesValorRubroVariable(
			JComboBox jComboBoxTiposRelacionesValorRubroVariable) {
		this.jComboBoxTiposRelacionesValorRubroVariable = jComboBoxTiposRelacionesValorRubroVariable;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesValorRubroVariable(
			JComboBox jComboBoxTiposAccionesValorRubroVariable) {
		this.jComboBoxTiposAccionesValorRubroVariable = jComboBoxTiposAccionesValorRubroVariable;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioValorRubroVariable() {
		return this.jComboBoxTiposAccionesFormularioValorRubroVariable;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioValorRubroVariable(
			JComboBox jComboBoxTiposAccionesFormularioValorRubroVariable) {
		this.jComboBoxTiposAccionesFormularioValorRubroVariable = jComboBoxTiposAccionesFormularioValorRubroVariable;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.valorrubrovariableSessionBean=new ValorRubroVariableSessionBean();
		
		this.valorrubrovariableSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.valorrubrovariableSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.valorrubrovariableSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ValorRubroVariableJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ValorRubroVariableJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ValorRubroVariableJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Valor Rubro Variable MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
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
	
		ValorRubroVariableJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleValorRubroVariable= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarValorRubroVariable=new JButtonMe();
				this.jButtonModificarToolBarValorRubroVariable=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarValorRubroVariable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarValorRubroVariable,this.jTtoolBarDetalleValorRubroVariable,
							"actualizar","actualizar","Actualizar"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarValorRubroVariable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarValorRubroVariable,this.jTtoolBarDetalleValorRubroVariable,
							"eliminar","eliminar","Eliminar"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarValorRubroVariable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarValorRubroVariable,this.jTtoolBarDetalleValorRubroVariable,
							"cancelar","cancelar","Cancelar"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarValorRubroVariable=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarValorRubroVariable,this.jTtoolBarDetalleValorRubroVariable,
							"guardarcambios","guardarcambios","Guardar"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarValorRubroVariable,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarValorRubroVariable,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarValorRubroVariable,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleValorRubroVariable=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleValorRubroVariable=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoValorRubroVariable=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesValorRubroVariable=new JMenuMe("Acciones");
		this.jmenuDetalleDatosValorRubroVariable=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoValorRubroVariable= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoValorRubroVariable.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoValorRubroVariable,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarValorRubroVariable= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarValorRubroVariable.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarValorRubroVariable,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarValorRubroVariable= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarValorRubroVariable.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarValorRubroVariable,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarValorRubroVariable= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarValorRubroVariable.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarValorRubroVariable,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarValorRubroVariable= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarValorRubroVariable.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarValorRubroVariable,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosValorRubroVariable= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosValorRubroVariable.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosValorRubroVariable,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarValorRubroVariable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarValorRubroVariable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarValorRubroVariable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarValorRubroVariable= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarValorRubroVariable.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarValorRubroVariable,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarValorRubroVariable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarValorRubroVariable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarValorRubroVariable,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarValorRubroVariable= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarValorRubroVariable.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarValorRubroVariable,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoValorRubroVariable.add(this.jMenuItemDetalleCerrarValorRubroVariable);
		
		this.jmenuDetalleAccionesValorRubroVariable.add(this.jMenuItemActualizarValorRubroVariable);
		this.jmenuDetalleAccionesValorRubroVariable.add(this.jMenuItemEliminarValorRubroVariable);
		this.jmenuDetalleAccionesValorRubroVariable.add(this.jMenuItemCancelarValorRubroVariable);		
		
		//this.jmenuDetalleDatosValorRubroVariable.add(this.jMenuItemDetalleAbrirOrderByValorRubroVariable);				
		this.jmenuDetalleDatosValorRubroVariable.add(this.jMenuItemDetalleMostarOcultarValorRubroVariable);				
				
		//this.jmenuDetalleAccionesValorRubroVariable.add(this.jMenuItemGuardarCambiosValorRubroVariable);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleValorRubroVariable.add(this.jmenuDetalleArchivoValorRubroVariable);		
		this.jmenuBarDetalleValorRubroVariable.add(this.jmenuDetalleAccionesValorRubroVariable);		
		this.jmenuBarDetalleValorRubroVariable.add(this.jmenuDetalleDatosValorRubroVariable);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleValorRubroVariable);				
	}
	
	
	public void inicializarElementosCamposValorRubroVariable() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdValorRubroVariable = new JLabelMe();
		jLabelIdValorRubroVariable.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdValorRubroVariable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdValorRubroVariable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdValorRubroVariable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdValorRubroVariable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidValorRubroVariable = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidValorRubroVariable.setToolTipText(ValorRubroVariableConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutValorRubroVariable= new GridBagLayout();

		this.jPanelidValorRubroVariable.setLayout(this.gridaBagLayoutValorRubroVariable);

		jLabelidValorRubroVariable = new JLabel();
		jLabelidValorRubroVariable.setText("Id");

		jLabelidValorRubroVariable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidValorRubroVariable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidValorRubroVariable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfechaValorRubroVariable = new JLabelMe();
		this.jLabelfechaValorRubroVariable.setText(""+ValorRubroVariableConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaValorRubroVariable.setToolTipText("Fecha");
		this.jLabelfechaValorRubroVariable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaValorRubroVariable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaValorRubroVariable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaValorRubroVariable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaValorRubroVariable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaValorRubroVariable.setToolTipText(ValorRubroVariableConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutValorRubroVariable = new GridBagLayout();
		this.jPanelfechaValorRubroVariable.setLayout(this.gridaBagLayoutValorRubroVariable);


		//jFormattedTextFieldfechaValorRubroVariable= new JFormattedTextFieldMe();

		jDateChooserfechaValorRubroVariable= new JDateChooser();
		jDateChooserfechaValorRubroVariable.setEnabled(false);
		jDateChooserfechaValorRubroVariable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaValorRubroVariable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaValorRubroVariable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaValorRubroVariable,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaValorRubroVariable.setDate(new Date());
		jDateChooserfechaValorRubroVariable.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaValorRubroVariable.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaValorRubroVariableBusqueda= new JButtonMe();
		this.jButtonfechaValorRubroVariableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaValorRubroVariableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaValorRubroVariableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaValorRubroVariableBusqueda.setText("U");
		this.jButtonfechaValorRubroVariableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaValorRubroVariableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaValorRubroVariableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaValorRubroVariable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaValorRubroVariable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaValorRubroVariableBusqueda"));

		if(this.valorrubrovariableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaValorRubroVariableBusqueda.setVisible(false);		}


					
		this.jLabelvalorValorRubroVariable = new JLabelMe();
		this.jLabelvalorValorRubroVariable.setText(""+ValorRubroVariableConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorValorRubroVariable.setToolTipText("Valor");
		this.jLabelvalorValorRubroVariable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorValorRubroVariable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorValorRubroVariable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorValorRubroVariable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorValorRubroVariable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorValorRubroVariable.setToolTipText(ValorRubroVariableConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutValorRubroVariable = new GridBagLayout();
		this.jPanelvalorValorRubroVariable.setLayout(this.gridaBagLayoutValorRubroVariable);


		jTextFieldvalorValorRubroVariable= new JTextFieldMe();
		jTextFieldvalorValorRubroVariable.setEnabled(false);
		jTextFieldvalorValorRubroVariable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorValorRubroVariable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorValorRubroVariable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorValorRubroVariable,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorValorRubroVariable.setText("0.0");

		this.jButtonvalorValorRubroVariableBusqueda= new JButtonMe();
		this.jButtonvalorValorRubroVariableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorValorRubroVariableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorValorRubroVariableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorValorRubroVariableBusqueda.setText("U");
		this.jButtonvalorValorRubroVariableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorValorRubroVariableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorValorRubroVariableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorValorRubroVariable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorValorRubroVariable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorValorRubroVariableBusqueda"));

		if(this.valorrubrovariableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorValorRubroVariableBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysValorRubroVariable() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaValorRubroVariable = new JLabelMe();
		this.jLabelid_empresaValorRubroVariable.setText(""+ValorRubroVariableConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaValorRubroVariable.setToolTipText("Empresa");
		this.jLabelid_empresaValorRubroVariable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaValorRubroVariable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaValorRubroVariable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaValorRubroVariable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaValorRubroVariable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaValorRubroVariable.setToolTipText(ValorRubroVariableConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutValorRubroVariable = new GridBagLayout();
		this.jPanelid_empresaValorRubroVariable.setLayout(this.gridaBagLayoutValorRubroVariable);


		jComboBoxid_empresaValorRubroVariable= new JComboBoxMe();
		jComboBoxid_empresaValorRubroVariable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaValorRubroVariable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaValorRubroVariable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaValorRubroVariable,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaValorRubroVariable.setEnabled(false);

		this.jButtonid_empresaValorRubroVariable= new JButtonMe();
		this.jButtonid_empresaValorRubroVariable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaValorRubroVariable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaValorRubroVariable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaValorRubroVariable.setText("Buscar");
		this.jButtonid_empresaValorRubroVariable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaValorRubroVariable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaValorRubroVariable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaValorRubroVariable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaValorRubroVariable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaValorRubroVariable"));

		this.jButtonid_empresaValorRubroVariableBusqueda= new JButtonMe();
		this.jButtonid_empresaValorRubroVariableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaValorRubroVariableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaValorRubroVariableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaValorRubroVariableBusqueda.setText("U");
		this.jButtonid_empresaValorRubroVariableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaValorRubroVariableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaValorRubroVariableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaValorRubroVariable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaValorRubroVariable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaValorRubroVariableBusqueda"));

		if(this.valorrubrovariableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaValorRubroVariableBusqueda.setVisible(false);		}

		this.jButtonid_empresaValorRubroVariableUpdate= new JButtonMe();
		this.jButtonid_empresaValorRubroVariableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaValorRubroVariableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaValorRubroVariableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaValorRubroVariableUpdate.setText("U");
		this.jButtonid_empresaValorRubroVariableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaValorRubroVariableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaValorRubroVariableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaValorRubroVariable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaValorRubroVariable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaValorRubroVariableUpdate"));



					
		this.jLabelid_empleadoValorRubroVariable = new JLabelMe();
		this.jLabelid_empleadoValorRubroVariable.setText(""+ValorRubroVariableConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoValorRubroVariable.setToolTipText("Empleado");
		this.jLabelid_empleadoValorRubroVariable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoValorRubroVariable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoValorRubroVariable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoValorRubroVariable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoValorRubroVariable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoValorRubroVariable.setToolTipText(ValorRubroVariableConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutValorRubroVariable = new GridBagLayout();
		this.jPanelid_empleadoValorRubroVariable.setLayout(this.gridaBagLayoutValorRubroVariable);


		jComboBoxid_empleadoValorRubroVariable= new JComboBoxMe();
		jComboBoxid_empleadoValorRubroVariable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoValorRubroVariable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoValorRubroVariable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoValorRubroVariable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoValorRubroVariable= new JButtonMe();
		this.jButtonid_empleadoValorRubroVariable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoValorRubroVariable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoValorRubroVariable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoValorRubroVariable.setText("Buscar");
		this.jButtonid_empleadoValorRubroVariable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoValorRubroVariable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoValorRubroVariable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoValorRubroVariable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoValorRubroVariable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoValorRubroVariable"));

		this.jButtonid_empleadoValorRubroVariableBusqueda= new JButtonMe();
		this.jButtonid_empleadoValorRubroVariableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoValorRubroVariableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoValorRubroVariableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoValorRubroVariableBusqueda.setText("U");
		this.jButtonid_empleadoValorRubroVariableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoValorRubroVariableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoValorRubroVariableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoValorRubroVariable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoValorRubroVariable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoValorRubroVariableBusqueda"));

		if(this.valorrubrovariableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoValorRubroVariableBusqueda.setVisible(false);		}

		this.jButtonid_empleadoValorRubroVariableUpdate= new JButtonMe();
		this.jButtonid_empleadoValorRubroVariableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoValorRubroVariableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoValorRubroVariableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoValorRubroVariableUpdate.setText("U");
		this.jButtonid_empleadoValorRubroVariableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoValorRubroVariableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoValorRubroVariableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoValorRubroVariable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoValorRubroVariable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoValorRubroVariableUpdate"));



					
		this.jLabelid_rubro_empleaValorRubroVariable = new JLabelMe();
		this.jLabelid_rubro_empleaValorRubroVariable.setText(""+ValorRubroVariableConstantesFunciones.LABEL_IDRUBROEMPLEA+" : *");
		this.jLabelid_rubro_empleaValorRubroVariable.setToolTipText("Rubro Emplea");
		this.jLabelid_rubro_empleaValorRubroVariable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_rubro_empleaValorRubroVariable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_rubro_empleaValorRubroVariable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_rubro_empleaValorRubroVariable,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_rubro_empleaValorRubroVariable=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_rubro_empleaValorRubroVariable.setToolTipText(ValorRubroVariableConstantesFunciones.LABEL_IDRUBROEMPLEA);
		this.gridaBagLayoutValorRubroVariable = new GridBagLayout();
		this.jPanelid_rubro_empleaValorRubroVariable.setLayout(this.gridaBagLayoutValorRubroVariable);


		jComboBoxid_rubro_empleaValorRubroVariable= new JComboBoxMe();
		jComboBoxid_rubro_empleaValorRubroVariable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaValorRubroVariable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_rubro_empleaValorRubroVariable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_rubro_empleaValorRubroVariable,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_rubro_empleaValorRubroVariable= new JButtonMe();
		this.jButtonid_rubro_empleaValorRubroVariable.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaValorRubroVariable.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaValorRubroVariable.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_rubro_empleaValorRubroVariable.setText("Buscar");
		this.jButtonid_rubro_empleaValorRubroVariable.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_rubro_empleaValorRubroVariable.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaValorRubroVariable,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_rubro_empleaValorRubroVariable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaValorRubroVariable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaValorRubroVariable"));

		this.jButtonid_rubro_empleaValorRubroVariableBusqueda= new JButtonMe();
		this.jButtonid_rubro_empleaValorRubroVariableBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaValorRubroVariableBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaValorRubroVariableBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_rubro_empleaValorRubroVariableBusqueda.setText("U");
		this.jButtonid_rubro_empleaValorRubroVariableBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_rubro_empleaValorRubroVariableBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaValorRubroVariableBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_rubro_empleaValorRubroVariable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaValorRubroVariable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaValorRubroVariableBusqueda"));

		if(this.valorrubrovariableSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_rubro_empleaValorRubroVariableBusqueda.setVisible(false);		}

		this.jButtonid_rubro_empleaValorRubroVariableUpdate= new JButtonMe();
		this.jButtonid_rubro_empleaValorRubroVariableUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaValorRubroVariableUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_rubro_empleaValorRubroVariableUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_rubro_empleaValorRubroVariableUpdate.setText("U");
		this.jButtonid_rubro_empleaValorRubroVariableUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_rubro_empleaValorRubroVariableUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_rubro_empleaValorRubroVariableUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_rubro_empleaValorRubroVariable.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_rubro_empleaValorRubroVariable.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_rubro_empleaValorRubroVariableUpdate"));



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
		//this.jInternalFrameDetalleValorRubroVariable = new ValorRubroVariableBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Valor Rubro Variable DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutValorRubroVariable= new GridBagLayout();
		

		
		String sToolTipValorRubroVariable="";
		sToolTipValorRubroVariable=ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipValorRubroVariable+="(Nomina.ValorRubroVariable)";
		}
		
		if(!this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
			sToolTipValorRubroVariable+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoValorRubroVariable = new JButtonMe();
		this.jButtonModificarValorRubroVariable = new JButtonMe();
        this.jButtonActualizarValorRubroVariable = new JButtonMe();
        this.jButtonEliminarValorRubroVariable = new JButtonMe();
        this.jButtonCancelarValorRubroVariable = new JButtonMe();
        this.jButtonGuardarCambiosValorRubroVariable = new JButtonMe();
		this.jButtonGuardarCambiosTablaValorRubroVariable = new JButtonMe();
		this.jButtonCerrarValorRubroVariable = new JButtonMe();
		
		this.jScrollPanelDatosValorRubroVariable = new JScrollPane();   
        this.jScrollPanelDatosEdicionValorRubroVariable = new JScrollPane();
		this.jScrollPanelDatosGeneralValorRubroVariable = new JScrollPane();
				
		
		
		this.jPanelCamposValorRubroVariable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosValorRubroVariable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesValorRubroVariable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioValorRubroVariable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Valor Rubro Variable";
		
		if(!this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosValorRubroVariable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Valor Rubro Variables" + this.sPath));
		} else {
			this.jScrollPanelDatosValorRubroVariable.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionValorRubroVariable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralValorRubroVariable.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposValorRubroVariable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposValorRubroVariable.setName("jPanelCamposValorRubroVariable"); 

		this.jPanelCamposOcultosValorRubroVariable.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosValorRubroVariable.setName("jPanelCamposOcultosValorRubroVariable"); 

        this.jPanelAccionesValorRubroVariable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesValorRubroVariable.setToolTipText("Acciones");
        this.jPanelAccionesValorRubroVariable.setName("Acciones"); 

		this.jPanelAccionesFormularioValorRubroVariable.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioValorRubroVariable.setToolTipText("Acciones");
        this.jPanelAccionesFormularioValorRubroVariable.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionValorRubroVariable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralValorRubroVariable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosValorRubroVariable, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposValorRubroVariable, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosValorRubroVariable, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioValorRubroVariable, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoValorRubroVariable.setText("Nuevo");
		this.jButtonModificarValorRubroVariable.setText("Editar");
        this.jButtonActualizarValorRubroVariable.setText("Actualizar");
        this.jButtonEliminarValorRubroVariable.setText("Eliminar");
        this.jButtonCancelarValorRubroVariable.setText("Cancelar");
        this.jButtonGuardarCambiosValorRubroVariable.setText("Guardar");
		this.jButtonGuardarCambiosTablaValorRubroVariable.setText("Guardar");
		this.jButtonCerrarValorRubroVariable.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoValorRubroVariable,"nuevo_button","Nuevo",this.valorrubrovariableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarValorRubroVariable,"modificar_button","Editar",this.valorrubrovariableSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarValorRubroVariable,"actualizar_button","Actualizar",this.valorrubrovariableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarValorRubroVariable,"eliminar_button","Eliminar",this.valorrubrovariableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarValorRubroVariable,"cancelar_button","Cancelar",this.valorrubrovariableSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosValorRubroVariable,"guardarcambios_button","Guardar",this.valorrubrovariableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaValorRubroVariable,"guardarcambiostabla_button","Guardar",this.valorrubrovariableSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarValorRubroVariable,"cerrar_button","Salir",this.valorrubrovariableSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarValorRubroVariable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarValorRubroVariable, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarValorRubroVariable, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoValorRubroVariable.setToolTipText("Nuevo"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarValorRubroVariable.setToolTipText("Editar"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarValorRubroVariable.setToolTipText("Actualizar"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarValorRubroVariable.setToolTipText("Eliminar)"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarValorRubroVariable.setToolTipText("Cancelar"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosValorRubroVariable.setToolTipText("Guardar"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaValorRubroVariable.setToolTipText("Guardar"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarValorRubroVariable.setToolTipText("Salir"+" "+ValorRubroVariableConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoValorRubroVariable";
		inputMap = this.jButtonNuevoValorRubroVariable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoValorRubroVariable.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoValorRubroVariable"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarValorRubroVariable";
		inputMap = this.jButtonActualizarValorRubroVariable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarValorRubroVariable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarValorRubroVariable"));
		
		//ELIMINAR
		sMapKey = "EliminarValorRubroVariable";
		inputMap = this.jButtonEliminarValorRubroVariable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarValorRubroVariable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarValorRubroVariable"));
		
		//CANCELAR	
		sMapKey = "CancelarValorRubroVariable";
		inputMap = this.jButtonCancelarValorRubroVariable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarValorRubroVariable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarValorRubroVariable"));
		
		//CERRAR		
		sMapKey = "CerrarValorRubroVariable";
		inputMap = this.jButtonCerrarValorRubroVariable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarValorRubroVariable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarValorRubroVariable"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaValorRubroVariable";
		inputMap = this.jButtonGuardarCambiosTablaValorRubroVariable.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaValorRubroVariable.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaValorRubroVariable"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoValorRubroVariable = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoValorRubroVariable.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoValorRubroVariable.setToolTipText("Nuevo ValorRubroVariable");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoValorRubroVariable, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarValorRubroVariable = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarValorRubroVariable.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarValorRubroVariable.setToolTipText("Sin Cerrar Ventana ValorRubroVariable");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarValorRubroVariable, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeValorRubroVariable = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeValorRubroVariable.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeValorRubroVariable.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeValorRubroVariable, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesValorRubroVariable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesValorRubroVariable.setText("Accion");
		this.jComboBoxTiposAccionesValorRubroVariable.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioValorRubroVariable = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioValorRubroVariable.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioValorRubroVariable.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesValorRubroVariable = new JLabelMe();
		
		this.jLabelAccionesValorRubroVariable.setText("Acciones");		
		this.jLabelAccionesValorRubroVariable.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesValorRubroVariable.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesValorRubroVariable.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposValorRubroVariable();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysValorRubroVariable();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesValorRubroVariable=new JTabbedPane();
		this.jTabbedPaneRelacionesValorRubroVariable.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesValorRubroVariable,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesValorRubroVariable.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesValorRubroVariable.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesValorRubroVariable.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesValorRubroVariable, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioValorRubroVariable.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioValorRubroVariable.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioValorRubroVariable.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioValorRubroVariable, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposValorRubroVariable = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosValorRubroVariable = new GridBagLayout();
		
		this.jPanelCamposValorRubroVariable.setLayout(gridaBagLayoutCamposValorRubroVariable);
		this.jPanelCamposOcultosValorRubroVariable.setLayout(gridaBagLayoutCamposOcultosValorRubroVariable);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
	this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsValorRubroVariable.gridy = 0;
	this.gridBagConstraintsValorRubroVariable.gridx = 0;
	this.gridBagConstraintsValorRubroVariable.ipadx = 0;
	this.gridBagConstraintsValorRubroVariable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidValorRubroVariable.add(jLabelIdValorRubroVariable, this.gridBagConstraintsValorRubroVariable);



	this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
	this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsValorRubroVariable.gridy = 0;
	this.gridBagConstraintsValorRubroVariable.gridx = 1;
	this.gridBagConstraintsValorRubroVariable.ipadx = 0;
	this.gridBagConstraintsValorRubroVariable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidValorRubroVariable.add(jLabelidValorRubroVariable, this.gridBagConstraintsValorRubroVariable);


	this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
	this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsValorRubroVariable.gridy = 0;
	this.gridBagConstraintsValorRubroVariable.gridx = 0;
	this.gridBagConstraintsValorRubroVariable.ipadx = 0;
	this.gridBagConstraintsValorRubroVariable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaValorRubroVariable.add(jLabelid_empresaValorRubroVariable, this.gridBagConstraintsValorRubroVariable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		//this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorRubroVariable.gridy = 0;
		this.gridBagConstraintsValorRubroVariable.gridx = 2;
		this.gridBagConstraintsValorRubroVariable.ipadx = 0;
		this.gridBagConstraintsValorRubroVariable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaValorRubroVariable.add(jButtonid_empresaValorRubroVariableBusqueda, this.gridBagConstraintsValorRubroVariable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		//this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorRubroVariable.gridy = 0;
		this.gridBagConstraintsValorRubroVariable.gridx = 3;
		this.gridBagConstraintsValorRubroVariable.ipadx = 0;
		this.gridBagConstraintsValorRubroVariable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaValorRubroVariable.add(jButtonid_empresaValorRubroVariableUpdate, this.gridBagConstraintsValorRubroVariable);
	}

	this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
	this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsValorRubroVariable.gridy = 0;
	this.gridBagConstraintsValorRubroVariable.gridx = 1;
	this.gridBagConstraintsValorRubroVariable.ipadx = 0;
	this.gridBagConstraintsValorRubroVariable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaValorRubroVariable.add(jComboBoxid_empresaValorRubroVariable, this.gridBagConstraintsValorRubroVariable);


	this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
	this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsValorRubroVariable.gridy = 0;
	this.gridBagConstraintsValorRubroVariable.gridx = 0;
	this.gridBagConstraintsValorRubroVariable.ipadx = 0;
	this.gridBagConstraintsValorRubroVariable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoValorRubroVariable.add(jLabelid_empleadoValorRubroVariable, this.gridBagConstraintsValorRubroVariable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		//this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorRubroVariable.gridy = 0;
		this.gridBagConstraintsValorRubroVariable.gridx = 2;
		this.gridBagConstraintsValorRubroVariable.ipadx = 0;
		this.gridBagConstraintsValorRubroVariable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoValorRubroVariable.add(jButtonid_empleadoValorRubroVariableBusqueda, this.gridBagConstraintsValorRubroVariable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		//this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorRubroVariable.gridy = 0;
		this.gridBagConstraintsValorRubroVariable.gridx = 3;
		this.gridBagConstraintsValorRubroVariable.ipadx = 0;
		this.gridBagConstraintsValorRubroVariable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoValorRubroVariable.add(jButtonid_empleadoValorRubroVariableUpdate, this.gridBagConstraintsValorRubroVariable);
	}

	this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
	this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsValorRubroVariable.gridy = 0;
	this.gridBagConstraintsValorRubroVariable.gridx = 1;
	this.gridBagConstraintsValorRubroVariable.ipadx = 0;
	this.gridBagConstraintsValorRubroVariable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoValorRubroVariable.add(jComboBoxid_empleadoValorRubroVariable, this.gridBagConstraintsValorRubroVariable);


	this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
	this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsValorRubroVariable.gridy = 0;
	this.gridBagConstraintsValorRubroVariable.gridx = 0;
	this.gridBagConstraintsValorRubroVariable.ipadx = 0;
	this.gridBagConstraintsValorRubroVariable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_rubro_empleaValorRubroVariable.add(jLabelid_rubro_empleaValorRubroVariable, this.gridBagConstraintsValorRubroVariable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		//this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorRubroVariable.gridy = 0;
		this.gridBagConstraintsValorRubroVariable.gridx = 2;
		this.gridBagConstraintsValorRubroVariable.ipadx = 0;
		this.gridBagConstraintsValorRubroVariable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_rubro_empleaValorRubroVariable.add(jButtonid_rubro_empleaValorRubroVariableBusqueda, this.gridBagConstraintsValorRubroVariable);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		//this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorRubroVariable.gridy = 0;
		this.gridBagConstraintsValorRubroVariable.gridx = 3;
		this.gridBagConstraintsValorRubroVariable.ipadx = 0;
		this.gridBagConstraintsValorRubroVariable.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_rubro_empleaValorRubroVariable.add(jButtonid_rubro_empleaValorRubroVariableUpdate, this.gridBagConstraintsValorRubroVariable);
	}

	this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
	this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsValorRubroVariable.gridy = 0;
	this.gridBagConstraintsValorRubroVariable.gridx = 1;
	this.gridBagConstraintsValorRubroVariable.ipadx = 0;
	this.gridBagConstraintsValorRubroVariable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_rubro_empleaValorRubroVariable.add(jComboBoxid_rubro_empleaValorRubroVariable, this.gridBagConstraintsValorRubroVariable);


	this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
	this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsValorRubroVariable.gridy = 0;
	this.gridBagConstraintsValorRubroVariable.gridx = 0;
	this.gridBagConstraintsValorRubroVariable.ipadx = 0;
	this.gridBagConstraintsValorRubroVariable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaValorRubroVariable.add(jLabelfechaValorRubroVariable, this.gridBagConstraintsValorRubroVariable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		//this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorRubroVariable.gridy = 0;
		this.gridBagConstraintsValorRubroVariable.gridx = 2;
		this.gridBagConstraintsValorRubroVariable.ipadx = 0;
		this.gridBagConstraintsValorRubroVariable.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaValorRubroVariable.add(jButtonfechaValorRubroVariableBusqueda, this.gridBagConstraintsValorRubroVariable);
	}

	this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
	this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsValorRubroVariable.gridy = 0;
	this.gridBagConstraintsValorRubroVariable.gridx = 1;
	this.gridBagConstraintsValorRubroVariable.ipadx = 0;
	this.gridBagConstraintsValorRubroVariable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaValorRubroVariable.add(jDateChooserfechaValorRubroVariable, this.gridBagConstraintsValorRubroVariable);


	this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
	this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsValorRubroVariable.gridy = 0;
	this.gridBagConstraintsValorRubroVariable.gridx = 0;
	this.gridBagConstraintsValorRubroVariable.ipadx = 0;
	this.gridBagConstraintsValorRubroVariable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorValorRubroVariable.add(jLabelvalorValorRubroVariable, this.gridBagConstraintsValorRubroVariable);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		//this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsValorRubroVariable.gridy = 0;
		this.gridBagConstraintsValorRubroVariable.gridx = 2;
		this.gridBagConstraintsValorRubroVariable.ipadx = 0;
		this.gridBagConstraintsValorRubroVariable.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorValorRubroVariable.add(jButtonvalorValorRubroVariableBusqueda, this.gridBagConstraintsValorRubroVariable);
	}

	this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
	this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsValorRubroVariable.gridy = 0;
	this.gridBagConstraintsValorRubroVariable.gridx = 1;
	this.gridBagConstraintsValorRubroVariable.ipadx = 0;
	this.gridBagConstraintsValorRubroVariable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorValorRubroVariable.add(jTextFieldvalorValorRubroVariable, this.gridBagConstraintsValorRubroVariable);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
	this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsValorRubroVariable.gridy = iYPanelCamposValorRubroVariable;
	this.gridBagConstraintsValorRubroVariable.gridx = iXPanelCamposValorRubroVariable++;
	this.gridBagConstraintsValorRubroVariable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsValorRubroVariable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposValorRubroVariable.add(this.jPanelidValorRubroVariable, this.gridBagConstraintsValorRubroVariable);



	if(iXPanelCamposValorRubroVariable % 1==0) {
		iXPanelCamposValorRubroVariable=0;
		iYPanelCamposValorRubroVariable++;
	}
	this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
	this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsValorRubroVariable.gridy = iYPanelCamposValorRubroVariable;
	this.gridBagConstraintsValorRubroVariable.gridx = iXPanelCamposValorRubroVariable++;
	this.gridBagConstraintsValorRubroVariable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsValorRubroVariable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposValorRubroVariable.add(this.jPanelid_empleadoValorRubroVariable, this.gridBagConstraintsValorRubroVariable);



	if(iXPanelCamposValorRubroVariable % 1==0) {
		iXPanelCamposValorRubroVariable=0;
		iYPanelCamposValorRubroVariable++;
	}
	this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
	this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsValorRubroVariable.gridy = iYPanelCamposValorRubroVariable;
	this.gridBagConstraintsValorRubroVariable.gridx = iXPanelCamposValorRubroVariable++;
	this.gridBagConstraintsValorRubroVariable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsValorRubroVariable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposValorRubroVariable.add(this.jPanelid_rubro_empleaValorRubroVariable, this.gridBagConstraintsValorRubroVariable);



	if(iXPanelCamposValorRubroVariable % 1==0) {
		iXPanelCamposValorRubroVariable=0;
		iYPanelCamposValorRubroVariable++;
	}
	this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
	this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsValorRubroVariable.gridy = iYPanelCamposValorRubroVariable;
	this.gridBagConstraintsValorRubroVariable.gridx = iXPanelCamposValorRubroVariable++;
	this.gridBagConstraintsValorRubroVariable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsValorRubroVariable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposValorRubroVariable.add(this.jPanelfechaValorRubroVariable, this.gridBagConstraintsValorRubroVariable);



	if(iXPanelCamposValorRubroVariable % 1==0) {
		iXPanelCamposValorRubroVariable=0;
		iYPanelCamposValorRubroVariable++;
	}
	this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
	this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsValorRubroVariable.gridy = iYPanelCamposValorRubroVariable;
	this.gridBagConstraintsValorRubroVariable.gridx = iXPanelCamposValorRubroVariable++;
	this.gridBagConstraintsValorRubroVariable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsValorRubroVariable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposValorRubroVariable.add(this.jPanelvalorValorRubroVariable, this.gridBagConstraintsValorRubroVariable);



	if(iXPanelCamposValorRubroVariable % 1==0) {
		iXPanelCamposValorRubroVariable=0;
		iYPanelCamposValorRubroVariable++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
	this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsValorRubroVariable.gridy = iYPanelCamposOcultosValorRubroVariable;
	this.gridBagConstraintsValorRubroVariable.gridx = iXPanelCamposOcultosValorRubroVariable++;
	this.gridBagConstraintsValorRubroVariable.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsValorRubroVariable.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosValorRubroVariable.add(this.jPanelid_empresaValorRubroVariable, this.gridBagConstraintsValorRubroVariable);



	if(iXPanelCamposOcultosValorRubroVariable % 1==0) {
		iXPanelCamposOcultosValorRubroVariable=0;
		iYPanelCamposOcultosValorRubroVariable++;
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
			
		GridBagLayout gridaBagLayoutAccionesValorRubroVariable= new GridBagLayout();
		this.jPanelAccionesValorRubroVariable.setLayout(gridaBagLayoutAccionesValorRubroVariable);
		
		GridBagLayout gridaBagLayoutAccionesFormularioValorRubroVariable= new GridBagLayout();
		this.jPanelAccionesFormularioValorRubroVariable.setLayout(gridaBagLayoutAccionesFormularioValorRubroVariable);
		
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsValorRubroVariable.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioValorRubroVariable.add(this.jComboBoxTiposAccionesFormularioValorRubroVariable, this.gridBagConstraintsValorRubroVariable);

		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsValorRubroVariable.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioValorRubroVariable.add(this.jCheckBoxPostAccionNuevoValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.valorrubrovariableSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsValorRubroVariable.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioValorRubroVariable.add(this.jCheckBoxPostAccionSinCerrarValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.valorrubrovariableSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.valorrubrovariableSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsValorRubroVariable.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioValorRubroVariable.add(this.jCheckBoxPostAccionSinMensajeValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsValorRubroVariable.gridy = 0;
		this.gridBagConstraintsValorRubroVariable.gridx = iPosXAccion++;
			
		this.jPanelAccionesValorRubroVariable.add(this.jButtonModificarValorRubroVariable, this.gridBagConstraintsValorRubroVariable);							

		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsValorRubroVariable.gridy = 0;
		this.gridBagConstraintsValorRubroVariable.gridx =iPosXAccion++;
			
		this.jPanelAccionesValorRubroVariable.add(this.jButtonEliminarValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
		
			
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.gridy = 0;		
		this.gridBagConstraintsValorRubroVariable.gridx = iPosXAccion++;
		
		this.jPanelAccionesValorRubroVariable.add(this.jButtonActualizarValorRubroVariable, this.gridBagConstraintsValorRubroVariable);


		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.gridy = 0;		
		this.gridBagConstraintsValorRubroVariable.gridx = iPosXAccion++;
		
		this.jPanelAccionesValorRubroVariable.add(this.jButtonGuardarCambiosValorRubroVariable, this.gridBagConstraintsValorRubroVariable);	
		
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.gridy = 0;		
		this.gridBagConstraintsValorRubroVariable.gridx =iPosXAccion++;
		
		this.jPanelAccionesValorRubroVariable.add(this.jButtonCancelarValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutValorRubroVariable = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutValorRubroVariable);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.valorrubrovariableSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();						
			this.gridBagConstraintsValorRubroVariable.gridy = iGridyPrincipal++;
			this.gridBagConstraintsValorRubroVariable.gridx = 0;		
			//this.gridBagConstraintsValorRubroVariable.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsValorRubroVariable.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.gridy =iGridyPrincipal++;
		this.gridBagConstraintsValorRubroVariable.gridx =0;
		this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsValorRubroVariable.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ValorRubroVariableJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleValorRubroVariable = new ValorRubroVariableBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Valor Rubro Variable DATOS");
			
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
			
	        //this.setTitle("[FOR] - Valor Rubro Variable DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Valor Rubro Variable Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ValorRubroVariableModel valorrubrovariableModel=new ValorRubroVariableModel(this);
			
			//SI USARA CLASE INTERNA
			//ValorRubroVariableModel.ValorRubroVariableFocusTraversalPolicy valorrubrovariableFocusTraversalPolicy = valorrubrovariableModel.new ValorRubroVariableFocusTraversalPolicy(this);
			
			//valorrubrovariableFocusTraversalPolicy.setvalorrubrovariableJInternalFrame(this);
			
			this.setFocusTraversalPolicy(valorrubrovariableModel);
			
			
			this.jContentPaneDetalleValorRubroVariable = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleValorRubroVariable = new GridBagLayout();	
			this.jContentPaneDetalleValorRubroVariable.setLayout(gridaBagLayoutDetalleValorRubroVariable);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosValorRubroVariable = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
				this.gridBagConstraintsValorRubroVariable.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsValorRubroVariable.gridx = 0;
					
				
				this.jContentPaneDetalleValorRubroVariable.add(jTtoolBarDetalleValorRubroVariable, gridBagConstraintsValorRubroVariable);								
				
}
			
			this.jScrollPanelDatosEdicionValorRubroVariable=   new JScrollPane(jContentPaneDetalleValorRubroVariable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionValorRubroVariable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionValorRubroVariable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionValorRubroVariable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralValorRubroVariable=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralValorRubroVariable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralValorRubroVariable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralValorRubroVariable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			
			
	        this.gridBagConstraintsValorRubroVariable.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsValorRubroVariable.gridx = 0;
	        
			this.jContentPaneDetalleValorRubroVariable.add(jPanelCamposValorRubroVariable, gridBagConstraintsValorRubroVariable);
			
			
			
			
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
						&& valorrubrovariableSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.valorrubrovariableSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsValorRubroVariable= new GridBagConstraints();
						this.gridBagConstraintsValorRubroVariable.gridy = iGridyRelaciones++;
						this.gridBagConstraintsValorRubroVariable.gridx = 0;
						this.jContentPaneDetalleValorRubroVariable.add(this.jTabbedPaneRelacionesValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesValorRubroVariable.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosValorRubroVariable.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
					this.gridBagConstraintsValorRubroVariable.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsValorRubroVariable.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsValorRubroVariable.gridx = 0;
					
				
					this.jContentPaneDetalleValorRubroVariable.add(jPanelCamposOcultosValorRubroVariable, gridBagConstraintsValorRubroVariable);
				
					this.jPanelCamposOcultosValorRubroVariable.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsValorRubroVariable.gridx = 0;
	        this.gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleValorRubroVariable.add(this.jPanelAccionesFormularioValorRubroVariable, this.gridBagConstraintsValorRubroVariable);							
			
			
			
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
	        this.gridBagConstraintsValorRubroVariable.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsValorRubroVariable.gridx = 0;
	        
			
			this.jContentPaneDetalleValorRubroVariable.add(this.jPanelAccionesValorRubroVariable, this.gridBagConstraintsValorRubroVariable);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionValorRubroVariable);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionValorRubroVariable=   new JScrollPane(this.jPanelCamposValorRubroVariable,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionValorRubroVariable.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionValorRubroVariable.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionValorRubroVariable.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsValorRubroVariable.gridx = 0;
			this.gridBagConstraintsValorRubroVariable.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsValorRubroVariable.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsValorRubroVariable.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsValorRubroVariable.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioValorRubroVariable, this.gridBagConstraintsValorRubroVariable);			
			
			this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
			this.gridBagConstraintsValorRubroVariable.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsValorRubroVariable.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesValorRubroVariable, this.gridBagConstraintsValorRubroVariable);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsValorRubroVariable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
			
			
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsValorRubroVariable.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
		
			
		this.gridBagConstraintsValorRubroVariable = new GridBagConstraints();
		this.gridBagConstraintsValorRubroVariable.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsValorRubroVariable.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesValorRubroVariable, this.gridBagConstraintsValorRubroVariable);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralValorRubroVariable;//jContentPane;
		
		return jScrollPanelDatosEdicionValorRubroVariable;
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
