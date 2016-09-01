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
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.TipoContratoConstantesFunciones;

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
public class TipoContratoDetalleFormJInternalFrame extends TipoContratoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoContrato;
	
	protected JMenuBar jmenuBarDetalleTipoContrato;
	
	protected JMenu jmenuDetalleTipoContrato;
	protected JMenu jmenuDetalleArchivoTipoContrato;
	protected JMenu jmenuDetalleAccionesTipoContrato;
	protected JMenu jmenuDetalleDatosTipoContrato;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoContrato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoContrato;	
	protected GridBagConstraints gridBagConstraintsTipoContrato;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoContratoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoContrato;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";
	
	public TipoContratoSessionBean tipocontratoSessionBean;
	
	

	public DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFrame=null;
	public DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDatoGeneralEmpleado=false;
	public DatoGeneralEmpleadoSessionBean datogeneralempleadoSessionBean;

	public EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame=null;
	public EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleado=false;
	public EmpleadoSessionBean empleadoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public FormatoSessionBean formatoSessionBean;	
	
	public TipoContratoLogic tipocontratoLogic;
	
	public JScrollPane jScrollPanelDatosTipoContrato;
	public JScrollPane jScrollPanelDatosEdicionTipoContrato;
	public JScrollPane jScrollPanelDatosGeneralTipoContrato;
	
	protected JPanel jPanelCamposTipoContrato;    
	protected JPanel jPanelCamposOcultosTipoContrato;    	
	protected JPanel jPanelAccionesTipoContrato;
	protected JPanel jPanelAccionesFormularioTipoContrato;
    
	
	
	protected Integer iXPanelCamposTipoContrato=0;
	protected Integer iYPanelCamposTipoContrato=0;
	
	protected Integer iXPanelCamposOcultosTipoContrato=0;
	protected Integer iYPanelCamposOcultosTipoContrato=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoContrato;
	public JButton jButtonModificarTipoContrato;
	public JButton jButtonActualizarTipoContrato;
    public JButton jButtonEliminarTipoContrato;
	public JButton jButtonCancelarTipoContrato;
    public JButton jButtonGuardarCambiosTipoContrato;
	public JButton jButtonGuardarCambiosTablaTipoContrato;
	protected JButton jButtonCerrarTipoContrato;
	
	
	protected JButton jButtonProcesarInformacionTipoContrato;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoContrato;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoContrato;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoContrato;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoContrato;
	protected JButton jButtonModificarToolBarTipoContrato;
	protected JButton jButtonActualizarToolBarTipoContrato;
    protected JButton jButtonEliminarToolBarTipoContrato;
	protected JButton jButtonCancelarToolBarTipoContrato;
    protected JButton jButtonGuardarCambiosToolBarTipoContrato;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoContrato;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoContrato;
	protected JButton jButtonCerrarToolBarTipoContrato;
	
	protected JButton jButtonProcesarInformacionToolBarTipoContrato;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoContrato;
	protected JMenuItem jMenuItemModificarTipoContrato;
	protected JMenuItem jMenuItemActualizarTipoContrato;
    protected JMenuItem jMenuItemEliminarTipoContrato;
	protected JMenuItem jMenuItemCancelarTipoContrato;
    protected JMenuItem jMenuItemGuardarCambiosTipoContrato;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoContrato;
	protected JMenuItem jMenuItemCerrarTipoContrato;
	protected JMenuItem jMenuItemDetalleCerrarTipoContrato;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoContrato;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoContrato;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoContrato;
	protected JMenuItem jMenuItemMostrarOcultarTipoContrato;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoContrato;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoContrato;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoContrato;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoContrato;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoContrato;
	public JLabel jLabelIdTipoContrato;
	public JLabel jLabelidTipoContrato;
	public JButton jButtonidTipoContratoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoContrato;
	public JLabel jLabelcodigoTipoContrato;
	public JTextField jTextFieldcodigoTipoContrato;
	public JButton jButtoncodigoTipoContratoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoContrato;
	public JLabel jLabelnombreTipoContrato;
	public JTextArea jTextAreanombreTipoContrato;
	public JScrollPane jscrollPanenombreTipoContrato;
	public JButton jButtonnombreTipoContratoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_diasTipoContrato;
	public JLabel jLabelnumero_diasTipoContrato;
	public JTextField jTextFieldnumero_diasTipoContrato;
	public JButton jButtonnumero_diasTipoContratoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoContrato;
	public JLabel jLabelid_empresaTipoContrato;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoContrato;
	public JButton jButtonid_empresaTipoContrato= new JButtonMe();
	public JButton jButtonid_empresaTipoContratoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoContratoBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoTipoContrato;
	public JLabel jLabelid_formatoTipoContrato;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoTipoContrato;
	public JButton jButtonid_formatoTipoContrato= new JButtonMe();
	public JButton jButtonid_formatoTipoContratoUpdate= new JButtonMe();
	public JButton jButtonid_formatoTipoContratoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoContrato;
	
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
	public int iHeightFormulario=506;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoContratoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoContrato=new JPanel();
				this.jPanelAccionesFormularioTipoContrato=new JPanel();
				this.jmenuBarDetalleTipoContrato=new JMenuBar();
				this.jTtoolBarDetalleTipoContrato=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoContratoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoContrato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoContratoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoContrato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoContratoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoContrato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoContratoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoContrato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoContratoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoContrato No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoContrato() {
		return this.jButtonActualizarToolBarTipoContrato;
	}
	
	public JButton getjButtonEliminarToolBarTipoContrato() {
		return this.jButtonEliminarToolBarTipoContrato;
	}
	
	public JButton getjButtonCancelarToolBarTipoContrato() {
		return this.jButtonCancelarToolBarTipoContrato;
	}		
	
	public JButton getjButtonProcesarInformacionTipoContrato() {
		return this.jButtonProcesarInformacionTipoContrato;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoContrato)	{
		this.jButtonProcesarInformacionTipoContrato = jButtonProcesarInformacionTipoContrato;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoContrato() {
		return this.jComboBoxTiposAccionesTipoContrato;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoContrato(
			JComboBox jComboBoxTiposRelacionesTipoContrato) {
		this.jComboBoxTiposRelacionesTipoContrato = jComboBoxTiposRelacionesTipoContrato;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoContrato(
			JComboBox jComboBoxTiposAccionesTipoContrato) {
		this.jComboBoxTiposAccionesTipoContrato = jComboBoxTiposAccionesTipoContrato;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoContrato() {
		return this.jComboBoxTiposAccionesFormularioTipoContrato;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoContrato(
			JComboBox jComboBoxTiposAccionesFormularioTipoContrato) {
		this.jComboBoxTiposAccionesFormularioTipoContrato = jComboBoxTiposAccionesFormularioTipoContrato;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipocontratoSessionBean=new TipoContratoSessionBean();
		
		this.tipocontratoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocontratoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocontratoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.datogeneralempleadoSessionBean=new DatoGeneralEmpleadoSessionBean();
		//this.empleadoSessionBean=new EmpleadoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoContratoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoContratoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoContratoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Contrato MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipocontratoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoContratoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoContrato= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoContrato=new JButtonMe();
				this.jButtonModificarToolBarTipoContrato=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoContrato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoContrato,this.jTtoolBarDetalleTipoContrato,
							"actualizar","actualizar","Actualizar"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoContrato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoContrato,this.jTtoolBarDetalleTipoContrato,
							"eliminar","eliminar","Eliminar"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoContrato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoContrato,this.jTtoolBarDetalleTipoContrato,
							"cancelar","cancelar","Cancelar"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoContrato=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoContrato,this.jTtoolBarDetalleTipoContrato,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoContrato,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoContrato,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoContrato,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoContrato=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoContrato=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoContrato=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoContrato=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoContrato=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoContrato= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoContrato.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoContrato,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoContrato= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoContrato.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoContrato,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoContrato= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoContrato.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoContrato,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoContrato= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoContrato.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoContrato,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoContrato= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoContrato.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoContrato,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoContrato= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoContrato.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoContrato,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoContrato= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoContrato.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoContrato,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoContrato= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoContrato.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoContrato,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoContrato= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoContrato.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoContrato,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoContrato= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoContrato.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoContrato,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoContrato.add(this.jMenuItemDetalleCerrarTipoContrato);
		
		this.jmenuDetalleAccionesTipoContrato.add(this.jMenuItemActualizarTipoContrato);
		this.jmenuDetalleAccionesTipoContrato.add(this.jMenuItemEliminarTipoContrato);
		this.jmenuDetalleAccionesTipoContrato.add(this.jMenuItemCancelarTipoContrato);		
		
		//this.jmenuDetalleDatosTipoContrato.add(this.jMenuItemDetalleAbrirOrderByTipoContrato);				
		this.jmenuDetalleDatosTipoContrato.add(this.jMenuItemDetalleMostarOcultarTipoContrato);				
				
		//this.jmenuDetalleAccionesTipoContrato.add(this.jMenuItemGuardarCambiosTipoContrato);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoContrato.add(this.jmenuDetalleArchivoTipoContrato);		
		this.jmenuBarDetalleTipoContrato.add(this.jmenuDetalleAccionesTipoContrato);		
		this.jmenuBarDetalleTipoContrato.add(this.jmenuDetalleDatosTipoContrato);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoContrato.add(this.jmenuDetalleTipoContrato);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoContrato);				
	}
	
	
	public void inicializarElementosCamposTipoContrato() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoContrato = new JLabelMe();
		jLabelIdTipoContrato.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoContrato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoContrato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoContrato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoContrato,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoContrato = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoContrato.setToolTipText(TipoContratoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoContrato= new GridBagLayout();

		this.jPanelidTipoContrato.setLayout(this.gridaBagLayoutTipoContrato);

		jLabelidTipoContrato = new JLabel();
		jLabelidTipoContrato.setText("Id");

		jLabelidTipoContrato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoContrato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoContrato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoContrato = new JLabelMe();
		this.jLabelcodigoTipoContrato.setText(""+TipoContratoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoContrato.setToolTipText("Codigo");
		this.jLabelcodigoTipoContrato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoContrato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoContrato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoContrato,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoContrato=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoContrato.setToolTipText(TipoContratoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoContrato = new GridBagLayout();
		this.jPanelcodigoTipoContrato.setLayout(this.gridaBagLayoutTipoContrato);


		jTextFieldcodigoTipoContrato= new JTextFieldMe();

		jTextFieldcodigoTipoContrato.setEnabled(false);
		jTextFieldcodigoTipoContrato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoContrato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoContrato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoContrato,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoContratoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoContratoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoContratoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoContratoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoContratoBusqueda.setText("U");
		this.jButtoncodigoTipoContratoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoContratoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoContratoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoContrato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoContrato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoContratoBusqueda"));

		if(this.tipocontratoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoContratoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoContrato = new JLabelMe();
		this.jLabelnombreTipoContrato.setText(""+TipoContratoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoContrato.setToolTipText("Nombre");
		this.jLabelnombreTipoContrato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoContrato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoContrato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoContrato,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoContrato=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoContrato.setToolTipText(TipoContratoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoContrato = new GridBagLayout();
		this.jPanelnombreTipoContrato.setLayout(this.gridaBagLayoutTipoContrato);


		jTextAreanombreTipoContrato= new JTextAreaMe();
		jTextAreanombreTipoContrato.setEnabled(false);
		jTextAreanombreTipoContrato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoContrato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoContrato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoContrato.setLineWrap(true);
		jTextAreanombreTipoContrato.setWrapStyleWord(true);
		jTextAreanombreTipoContrato.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoContrato.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoContrato,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoContrato = new JScrollPane(jTextAreanombreTipoContrato);
		jscrollPanenombreTipoContrato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoContrato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoContrato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoContratoBusqueda= new JButtonMe();
		this.jButtonnombreTipoContratoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoContratoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoContratoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoContratoBusqueda.setText("U");
		this.jButtonnombreTipoContratoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoContratoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoContratoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoContrato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoContrato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoContratoBusqueda"));

		if(this.tipocontratoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoContratoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_diasTipoContrato = new JLabelMe();
		this.jLabelnumero_diasTipoContrato.setText(""+TipoContratoConstantesFunciones.LABEL_NUMERODIAS+" : *");
		this.jLabelnumero_diasTipoContrato.setToolTipText("Numero Dias");
		this.jLabelnumero_diasTipoContrato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diasTipoContrato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diasTipoContrato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_diasTipoContrato,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_diasTipoContrato=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_diasTipoContrato.setToolTipText(TipoContratoConstantesFunciones.LABEL_NUMERODIAS);
		this.gridaBagLayoutTipoContrato = new GridBagLayout();
		this.jPanelnumero_diasTipoContrato.setLayout(this.gridaBagLayoutTipoContrato);


		jTextFieldnumero_diasTipoContrato= new JTextFieldMe();
		jTextFieldnumero_diasTipoContrato.setEnabled(false);
		jTextFieldnumero_diasTipoContrato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diasTipoContrato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diasTipoContrato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_diasTipoContrato,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_diasTipoContrato.setText("0");

		this.jButtonnumero_diasTipoContratoBusqueda= new JButtonMe();
		this.jButtonnumero_diasTipoContratoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diasTipoContratoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diasTipoContratoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_diasTipoContratoBusqueda.setText("U");
		this.jButtonnumero_diasTipoContratoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_diasTipoContratoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_diasTipoContratoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_diasTipoContrato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_diasTipoContrato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_diasTipoContratoBusqueda"));

		if(this.tipocontratoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_diasTipoContratoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoContrato() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoContrato = new JLabelMe();
		this.jLabelid_empresaTipoContrato.setText(""+TipoContratoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoContrato.setToolTipText("Empresa");
		this.jLabelid_empresaTipoContrato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoContrato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoContrato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoContrato,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoContrato=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoContrato.setToolTipText(TipoContratoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoContrato = new GridBagLayout();
		this.jPanelid_empresaTipoContrato.setLayout(this.gridaBagLayoutTipoContrato);


		jComboBoxid_empresaTipoContrato= new JComboBoxMe();
		jComboBoxid_empresaTipoContrato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoContrato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoContrato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoContrato,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoContrato.setEnabled(false);

		this.jButtonid_empresaTipoContrato= new JButtonMe();
		this.jButtonid_empresaTipoContrato.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoContrato.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoContrato.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoContrato.setText("Buscar");
		this.jButtonid_empresaTipoContrato.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoContrato.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoContrato,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoContrato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoContrato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoContrato"));

		this.jButtonid_empresaTipoContratoBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoContratoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoContratoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoContratoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoContratoBusqueda.setText("U");
		this.jButtonid_empresaTipoContratoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoContratoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoContratoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoContrato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoContrato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoContratoBusqueda"));

		if(this.tipocontratoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoContratoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoContratoUpdate= new JButtonMe();
		this.jButtonid_empresaTipoContratoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoContratoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoContratoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoContratoUpdate.setText("U");
		this.jButtonid_empresaTipoContratoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoContratoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoContratoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoContrato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoContrato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoContratoUpdate"));



					
		this.jLabelid_formatoTipoContrato = new JLabelMe();
		this.jLabelid_formatoTipoContrato.setText(""+TipoContratoConstantesFunciones.LABEL_IDFORMATO+" : *");
		this.jLabelid_formatoTipoContrato.setToolTipText("Formato");
		this.jLabelid_formatoTipoContrato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoTipoContrato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoTipoContrato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoTipoContrato,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoTipoContrato=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoTipoContrato.setToolTipText(TipoContratoConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutTipoContrato = new GridBagLayout();
		this.jPanelid_formatoTipoContrato.setLayout(this.gridaBagLayoutTipoContrato);


		jComboBoxid_formatoTipoContrato= new JComboBoxMe();
		jComboBoxid_formatoTipoContrato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoTipoContrato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoTipoContrato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoTipoContrato,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoTipoContrato= new JButtonMe();
		this.jButtonid_formatoTipoContrato.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoTipoContrato.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoTipoContrato.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoTipoContrato.setText("Buscar");
		this.jButtonid_formatoTipoContrato.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoTipoContrato.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoTipoContrato,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoTipoContrato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoTipoContrato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoTipoContrato"));

		this.jButtonid_formatoTipoContratoBusqueda= new JButtonMe();
		this.jButtonid_formatoTipoContratoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoTipoContratoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoTipoContratoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoTipoContratoBusqueda.setText("U");
		this.jButtonid_formatoTipoContratoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoTipoContratoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoTipoContratoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoTipoContrato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoTipoContrato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoTipoContratoBusqueda"));

		if(this.tipocontratoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoTipoContratoBusqueda.setVisible(false);		}

		this.jButtonid_formatoTipoContratoUpdate= new JButtonMe();
		this.jButtonid_formatoTipoContratoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoTipoContratoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoTipoContratoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoTipoContratoUpdate.setText("U");
		this.jButtonid_formatoTipoContratoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoTipoContratoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoTipoContratoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoTipoContrato.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoTipoContrato.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoTipoContratoUpdate"));



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
		//this.jInternalFrameDetalleTipoContrato = new TipoContratoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Contrato DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoContrato= new GridBagLayout();
		

		
		String sToolTipTipoContrato="";
		sToolTipTipoContrato=TipoContratoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoContrato+="(Nomina.TipoContrato)";
		}
		
		if(!this.tipocontratoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoContrato+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoContrato = new JButtonMe();
		this.jButtonModificarTipoContrato = new JButtonMe();
        this.jButtonActualizarTipoContrato = new JButtonMe();
        this.jButtonEliminarTipoContrato = new JButtonMe();
        this.jButtonCancelarTipoContrato = new JButtonMe();
        this.jButtonGuardarCambiosTipoContrato = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoContrato = new JButtonMe();
		this.jButtonCerrarTipoContrato = new JButtonMe();
		
		this.jScrollPanelDatosTipoContrato = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoContrato = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoContrato = new JScrollPane();
				
		
		
		this.jPanelCamposTipoContrato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoContrato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoContrato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoContrato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Contrato";
		
		if(!this.tipocontratoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoContrato.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Contratos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoContrato.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoContrato.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoContrato.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoContrato.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoContrato.setName("jPanelCamposTipoContrato"); 

		this.jPanelCamposOcultosTipoContrato.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoContrato.setName("jPanelCamposOcultosTipoContrato"); 

        this.jPanelAccionesTipoContrato.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoContrato.setToolTipText("Acciones");
        this.jPanelAccionesTipoContrato.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoContrato.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoContrato.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoContrato.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoContrato, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoContrato, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoContrato, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoContrato, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoContrato, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoContrato, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoContrato.setText("Nuevo");
		this.jButtonModificarTipoContrato.setText("Editar");
        this.jButtonActualizarTipoContrato.setText("Actualizar");
        this.jButtonEliminarTipoContrato.setText("Eliminar");
        this.jButtonCancelarTipoContrato.setText("Cancelar");
        this.jButtonGuardarCambiosTipoContrato.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoContrato.setText("Guardar");
		this.jButtonCerrarTipoContrato.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoContrato,"nuevo_button","Nuevo",this.tipocontratoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoContrato,"modificar_button","Editar",this.tipocontratoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoContrato,"actualizar_button","Actualizar",this.tipocontratoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoContrato,"eliminar_button","Eliminar",this.tipocontratoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoContrato,"cancelar_button","Cancelar",this.tipocontratoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoContrato,"guardarcambios_button","Guardar",this.tipocontratoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoContrato,"guardarcambiostabla_button","Guardar",this.tipocontratoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoContrato,"cerrar_button","Salir",this.tipocontratoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoContrato, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoContrato, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoContrato, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoContrato.setToolTipText("Nuevo"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoContrato.setToolTipText("Editar"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoContrato.setToolTipText("Actualizar"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoContrato.setToolTipText("Eliminar)"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoContrato.setToolTipText("Cancelar"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoContrato.setToolTipText("Guardar"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoContrato.setToolTipText("Guardar"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoContrato.setToolTipText("Salir"+" "+TipoContratoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoContrato";
		inputMap = this.jButtonNuevoTipoContrato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoContrato.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoContrato"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoContrato";
		inputMap = this.jButtonActualizarTipoContrato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoContrato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoContrato"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoContrato";
		inputMap = this.jButtonEliminarTipoContrato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoContrato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoContrato"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoContrato";
		inputMap = this.jButtonCancelarTipoContrato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoContrato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoContrato"));
		
		//CERRAR		
		sMapKey = "CerrarTipoContrato";
		inputMap = this.jButtonCerrarTipoContrato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoContrato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoContrato"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoContrato";
		inputMap = this.jButtonGuardarCambiosTablaTipoContrato.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoContrato.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoContrato"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoContrato = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoContrato.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoContrato.setToolTipText("Nuevo TipoContrato");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoContrato, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoContrato = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoContrato.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoContrato.setToolTipText("Sin Cerrar Ventana TipoContrato");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoContrato, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoContrato = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoContrato.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoContrato.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoContrato, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoContrato = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoContrato.setText("Accion");
		this.jComboBoxTiposAccionesTipoContrato.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoContrato = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoContrato.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoContrato.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoContrato = new JLabelMe();
		
		this.jLabelAccionesTipoContrato.setText("Acciones");		
		this.jLabelAccionesTipoContrato.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoContrato.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoContrato.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoContrato();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoContrato();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoContrato=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoContrato.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoContrato,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoContrato.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoContrato.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoContrato.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoContrato, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoContrato.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoContrato.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoContrato.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoContrato, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoContrato = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoContrato = new GridBagLayout();
		
		this.jPanelCamposTipoContrato.setLayout(gridaBagLayoutCamposTipoContrato);
		this.jPanelCamposOcultosTipoContrato.setLayout(gridaBagLayoutCamposOcultosTipoContrato);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoContrato = new GridBagConstraints();
	this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoContrato.gridy = 0;
	this.gridBagConstraintsTipoContrato.gridx = 0;
	this.gridBagConstraintsTipoContrato.ipadx = 0;
	this.gridBagConstraintsTipoContrato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoContrato.add(jLabelIdTipoContrato, this.gridBagConstraintsTipoContrato);



	this.gridBagConstraintsTipoContrato = new GridBagConstraints();
	this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoContrato.gridy = 0;
	this.gridBagConstraintsTipoContrato.gridx = 1;
	this.gridBagConstraintsTipoContrato.ipadx = 0;
	this.gridBagConstraintsTipoContrato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoContrato.add(jLabelidTipoContrato, this.gridBagConstraintsTipoContrato);


	this.gridBagConstraintsTipoContrato = new GridBagConstraints();
	this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoContrato.gridy = 0;
	this.gridBagConstraintsTipoContrato.gridx = 0;
	this.gridBagConstraintsTipoContrato.ipadx = 0;
	this.gridBagConstraintsTipoContrato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoContrato.add(jLabelid_empresaTipoContrato, this.gridBagConstraintsTipoContrato);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		//this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoContrato.gridy = 0;
		this.gridBagConstraintsTipoContrato.gridx = 2;
		this.gridBagConstraintsTipoContrato.ipadx = 0;
		this.gridBagConstraintsTipoContrato.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoContrato.add(jButtonid_empresaTipoContratoBusqueda, this.gridBagConstraintsTipoContrato);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		//this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoContrato.gridy = 0;
		this.gridBagConstraintsTipoContrato.gridx = 3;
		this.gridBagConstraintsTipoContrato.ipadx = 0;
		this.gridBagConstraintsTipoContrato.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoContrato.add(jButtonid_empresaTipoContratoUpdate, this.gridBagConstraintsTipoContrato);
	}

	this.gridBagConstraintsTipoContrato = new GridBagConstraints();
	this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoContrato.gridy = 0;
	this.gridBagConstraintsTipoContrato.gridx = 1;
	this.gridBagConstraintsTipoContrato.ipadx = 0;
	this.gridBagConstraintsTipoContrato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoContrato.add(jComboBoxid_empresaTipoContrato, this.gridBagConstraintsTipoContrato);


	this.gridBagConstraintsTipoContrato = new GridBagConstraints();
	this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoContrato.gridy = 0;
	this.gridBagConstraintsTipoContrato.gridx = 0;
	this.gridBagConstraintsTipoContrato.ipadx = 0;
	this.gridBagConstraintsTipoContrato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formatoTipoContrato.add(jLabelid_formatoTipoContrato, this.gridBagConstraintsTipoContrato);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		//this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoContrato.gridy = 0;
		this.gridBagConstraintsTipoContrato.gridx = 2;
		this.gridBagConstraintsTipoContrato.ipadx = 0;
		this.gridBagConstraintsTipoContrato.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoTipoContrato.add(jButtonid_formatoTipoContratoBusqueda, this.gridBagConstraintsTipoContrato);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		//this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoContrato.gridy = 0;
		this.gridBagConstraintsTipoContrato.gridx = 3;
		this.gridBagConstraintsTipoContrato.ipadx = 0;
		this.gridBagConstraintsTipoContrato.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoTipoContrato.add(jButtonid_formatoTipoContratoUpdate, this.gridBagConstraintsTipoContrato);
	}

	this.gridBagConstraintsTipoContrato = new GridBagConstraints();
	this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoContrato.gridy = 0;
	this.gridBagConstraintsTipoContrato.gridx = 1;
	this.gridBagConstraintsTipoContrato.ipadx = 0;
	this.gridBagConstraintsTipoContrato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formatoTipoContrato.add(jComboBoxid_formatoTipoContrato, this.gridBagConstraintsTipoContrato);


	this.gridBagConstraintsTipoContrato = new GridBagConstraints();
	this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoContrato.gridy = 0;
	this.gridBagConstraintsTipoContrato.gridx = 0;
	this.gridBagConstraintsTipoContrato.ipadx = 0;
	this.gridBagConstraintsTipoContrato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoContrato.add(jLabelcodigoTipoContrato, this.gridBagConstraintsTipoContrato);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		//this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoContrato.gridy = 0;
		this.gridBagConstraintsTipoContrato.gridx = 2;
		this.gridBagConstraintsTipoContrato.ipadx = 0;
		this.gridBagConstraintsTipoContrato.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoContrato.add(jButtoncodigoTipoContratoBusqueda, this.gridBagConstraintsTipoContrato);
	}

	this.gridBagConstraintsTipoContrato = new GridBagConstraints();
	this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoContrato.gridy = 0;
	this.gridBagConstraintsTipoContrato.gridx = 1;
	this.gridBagConstraintsTipoContrato.ipadx = 0;
	this.gridBagConstraintsTipoContrato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoContrato.add(jTextFieldcodigoTipoContrato, this.gridBagConstraintsTipoContrato);


	this.gridBagConstraintsTipoContrato = new GridBagConstraints();
	this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoContrato.gridy = 0;
	this.gridBagConstraintsTipoContrato.gridx = 0;
	this.gridBagConstraintsTipoContrato.ipadx = 0;
	this.gridBagConstraintsTipoContrato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoContrato.add(jLabelnombreTipoContrato, this.gridBagConstraintsTipoContrato);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		//this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoContrato.gridy = 0;
		this.gridBagConstraintsTipoContrato.gridx = 2;
		this.gridBagConstraintsTipoContrato.ipadx = 0;
		this.gridBagConstraintsTipoContrato.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoContrato.add(jButtonnombreTipoContratoBusqueda, this.gridBagConstraintsTipoContrato);
	}

	this.gridBagConstraintsTipoContrato = new GridBagConstraints();
	this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoContrato.gridy = 0;
	this.gridBagConstraintsTipoContrato.gridx = 1;
	this.gridBagConstraintsTipoContrato.ipadx = 0;
	this.gridBagConstraintsTipoContrato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoContrato.add(jscrollPanenombreTipoContrato, this.gridBagConstraintsTipoContrato);


	this.gridBagConstraintsTipoContrato = new GridBagConstraints();
	this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoContrato.gridy = 0;
	this.gridBagConstraintsTipoContrato.gridx = 0;
	this.gridBagConstraintsTipoContrato.ipadx = 0;
	this.gridBagConstraintsTipoContrato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_diasTipoContrato.add(jLabelnumero_diasTipoContrato, this.gridBagConstraintsTipoContrato);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		//this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoContrato.gridy = 0;
		this.gridBagConstraintsTipoContrato.gridx = 2;
		this.gridBagConstraintsTipoContrato.ipadx = 0;
		this.gridBagConstraintsTipoContrato.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_diasTipoContrato.add(jButtonnumero_diasTipoContratoBusqueda, this.gridBagConstraintsTipoContrato);
	}

	this.gridBagConstraintsTipoContrato = new GridBagConstraints();
	this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoContrato.gridy = 0;
	this.gridBagConstraintsTipoContrato.gridx = 1;
	this.gridBagConstraintsTipoContrato.ipadx = 0;
	this.gridBagConstraintsTipoContrato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_diasTipoContrato.add(jTextFieldnumero_diasTipoContrato, this.gridBagConstraintsTipoContrato);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoContrato = new GridBagConstraints();
	this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoContrato.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoContrato.gridy = iYPanelCamposTipoContrato;
	this.gridBagConstraintsTipoContrato.gridx = iXPanelCamposTipoContrato++;
	this.gridBagConstraintsTipoContrato.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoContrato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoContrato.add(this.jPanelidTipoContrato, this.gridBagConstraintsTipoContrato);



	if(iXPanelCamposTipoContrato % 1==0) {
		iXPanelCamposTipoContrato=0;
		iYPanelCamposTipoContrato++;
	}
	this.gridBagConstraintsTipoContrato = new GridBagConstraints();
	this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoContrato.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoContrato.gridy = iYPanelCamposTipoContrato;
	this.gridBagConstraintsTipoContrato.gridx = iXPanelCamposTipoContrato++;
	this.gridBagConstraintsTipoContrato.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoContrato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoContrato.add(this.jPanelid_formatoTipoContrato, this.gridBagConstraintsTipoContrato);



	if(iXPanelCamposTipoContrato % 1==0) {
		iXPanelCamposTipoContrato=0;
		iYPanelCamposTipoContrato++;
	}
	this.gridBagConstraintsTipoContrato = new GridBagConstraints();
	this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoContrato.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoContrato.gridy = iYPanelCamposTipoContrato;
	this.gridBagConstraintsTipoContrato.gridx = iXPanelCamposTipoContrato++;
	this.gridBagConstraintsTipoContrato.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoContrato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoContrato.add(this.jPanelcodigoTipoContrato, this.gridBagConstraintsTipoContrato);



	if(iXPanelCamposTipoContrato % 1==0) {
		iXPanelCamposTipoContrato=0;
		iYPanelCamposTipoContrato++;
	}
	this.gridBagConstraintsTipoContrato = new GridBagConstraints();
	this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoContrato.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoContrato.gridy = iYPanelCamposTipoContrato;
	this.gridBagConstraintsTipoContrato.gridx = iXPanelCamposTipoContrato++;
	this.gridBagConstraintsTipoContrato.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoContrato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoContrato.add(this.jPanelnombreTipoContrato, this.gridBagConstraintsTipoContrato);



	if(iXPanelCamposTipoContrato % 1==0) {
		iXPanelCamposTipoContrato=0;
		iYPanelCamposTipoContrato++;
	}
	this.gridBagConstraintsTipoContrato = new GridBagConstraints();
	this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoContrato.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoContrato.gridy = iYPanelCamposTipoContrato;
	this.gridBagConstraintsTipoContrato.gridx = iXPanelCamposTipoContrato++;
	this.gridBagConstraintsTipoContrato.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoContrato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoContrato.add(this.jPanelnumero_diasTipoContrato, this.gridBagConstraintsTipoContrato);



	if(iXPanelCamposTipoContrato % 1==0) {
		iXPanelCamposTipoContrato=0;
		iYPanelCamposTipoContrato++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoContrato = new GridBagConstraints();
	this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoContrato.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoContrato.gridy = iYPanelCamposOcultosTipoContrato;
	this.gridBagConstraintsTipoContrato.gridx = iXPanelCamposOcultosTipoContrato++;
	this.gridBagConstraintsTipoContrato.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoContrato.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoContrato.add(this.jPanelid_empresaTipoContrato, this.gridBagConstraintsTipoContrato);



	if(iXPanelCamposOcultosTipoContrato % 1==0) {
		iXPanelCamposOcultosTipoContrato=0;
		iYPanelCamposOcultosTipoContrato++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoContrato= new GridBagLayout();
		this.jPanelAccionesTipoContrato.setLayout(gridaBagLayoutAccionesTipoContrato);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoContrato= new GridBagLayout();
		this.jPanelAccionesFormularioTipoContrato.setLayout(gridaBagLayoutAccionesFormularioTipoContrato);
		
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoContrato.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoContrato.add(this.jComboBoxTiposAccionesFormularioTipoContrato, this.gridBagConstraintsTipoContrato);

		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoContrato.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoContrato.add(this.jCheckBoxPostAccionNuevoTipoContrato, this.gridBagConstraintsTipoContrato);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipocontratoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoContrato.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoContrato.add(this.jCheckBoxPostAccionSinCerrarTipoContrato, this.gridBagConstraintsTipoContrato);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipocontratoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipocontratoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoContrato.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoContrato.add(this.jCheckBoxPostAccionSinMensajeTipoContrato, this.gridBagConstraintsTipoContrato);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoContrato.gridy = 0;
		this.gridBagConstraintsTipoContrato.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoContrato.add(this.jButtonModificarTipoContrato, this.gridBagConstraintsTipoContrato);							

		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoContrato.gridy = 0;
		this.gridBagConstraintsTipoContrato.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoContrato.add(this.jButtonEliminarTipoContrato, this.gridBagConstraintsTipoContrato);
		
			
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.gridy = 0;		
		this.gridBagConstraintsTipoContrato.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoContrato.add(this.jButtonActualizarTipoContrato, this.gridBagConstraintsTipoContrato);


		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.gridy = 0;		
		this.gridBagConstraintsTipoContrato.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoContrato.add(this.jButtonGuardarCambiosTipoContrato, this.gridBagConstraintsTipoContrato);	
		
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.gridy = 0;		
		this.gridBagConstraintsTipoContrato.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoContrato.add(this.jButtonCancelarTipoContrato, this.gridBagConstraintsTipoContrato);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoContrato = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoContrato);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocontratoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();						
			this.gridBagConstraintsTipoContrato.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoContrato.gridx = 0;		
			//this.gridBagConstraintsTipoContrato.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoContrato.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoContrato.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoContrato.gridx =0;
		this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoContrato.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoContrato, this.gridBagConstraintsTipoContrato);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoContratoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoContrato = new TipoContratoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Contrato DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Contrato DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Contrato Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoContratoModel tipocontratoModel=new TipoContratoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoContratoModel.TipoContratoFocusTraversalPolicy tipocontratoFocusTraversalPolicy = tipocontratoModel.new TipoContratoFocusTraversalPolicy(this);
			
			//tipocontratoFocusTraversalPolicy.settipocontratoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipocontratoModel);
			
			
			this.jContentPaneDetalleTipoContrato = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoContrato = new GridBagLayout();	
			this.jContentPaneDetalleTipoContrato.setLayout(gridaBagLayoutDetalleTipoContrato);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoContrato = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoContrato = new GridBagConstraints();
				this.gridBagConstraintsTipoContrato.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoContrato.gridx = 0;
					
				
				this.jContentPaneDetalleTipoContrato.add(jTtoolBarDetalleTipoContrato, gridBagConstraintsTipoContrato);								
				
}
			
			this.jScrollPanelDatosEdicionTipoContrato=   new JScrollPane(jContentPaneDetalleTipoContrato,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoContrato.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoContrato.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoContrato.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoContrato=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoContrato.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoContrato.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoContrato.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoContrato.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoContrato.gridx = 0;
	        
			this.jContentPaneDetalleTipoContrato.add(jPanelCamposTipoContrato, gridBagConstraintsTipoContrato);
			
			
			
			
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
						&& tipocontratoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(this.puedeCargarPorParteDatoGeneralEmpleado,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleado(this.puedeCargarPorParteEmpleado,false,-1);
					
					if(this.tipocontratoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoContrato= new GridBagConstraints();
						this.gridBagConstraintsTipoContrato.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoContrato.gridx = 0;
						this.jContentPaneDetalleTipoContrato.add(this.jTabbedPaneRelacionesTipoContrato, this.gridBagConstraintsTipoContrato);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoContrato.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameEmpleado(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoContrato.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoContrato = new GridBagConstraints();
					this.gridBagConstraintsTipoContrato.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoContrato.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoContrato.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoContrato.gridx = 0;
					
				
					this.jContentPaneDetalleTipoContrato.add(jPanelCamposOcultosTipoContrato, gridBagConstraintsTipoContrato);
				
					this.jPanelCamposOcultosTipoContrato.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsTipoContrato.gridx = 0;
	        this.gridBagConstraintsTipoContrato.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoContrato.add(this.jPanelAccionesFormularioTipoContrato, this.gridBagConstraintsTipoContrato);							
			
			
			
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
	        this.gridBagConstraintsTipoContrato.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsTipoContrato.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoContrato.add(this.jPanelAccionesTipoContrato, this.gridBagConstraintsTipoContrato);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoContrato);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoContrato=   new JScrollPane(this.jPanelCamposTipoContrato,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoContrato.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoContrato.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoContrato.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoContrato.gridx = 0;
			this.gridBagConstraintsTipoContrato.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoContrato.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoContrato.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoContrato, this.gridBagConstraintsTipoContrato);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoContrato.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoContrato, this.gridBagConstraintsTipoContrato);			
			
			this.gridBagConstraintsTipoContrato = new GridBagConstraints();
			this.gridBagConstraintsTipoContrato.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoContrato.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoContrato, this.gridBagConstraintsTipoContrato);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoContrato.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoContrato, this.gridBagConstraintsTipoContrato);
			
			
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoContrato.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoContrato, this.gridBagConstraintsTipoContrato);
		
			
		this.gridBagConstraintsTipoContrato = new GridBagConstraints();
		this.gridBagConstraintsTipoContrato.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoContrato.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoContrato, this.gridBagConstraintsTipoContrato);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoContrato;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoContrato;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.datogeneralempleadoSessionBean=new DatoGeneralEmpleadoSessionBean();
		this.datogeneralempleadoSessionBean.setConGuardarRelaciones(false);
		this.datogeneralempleadoSessionBean.setEsGuardarRelacionado(true);

		this.datogeneralempleadoBeanSwingJInternalFrame=null;//new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.datogeneralempleadoBeanSwingJInternalFramePopup=new DatoGeneralEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.datogeneralempleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado()) {

				DatoGeneralEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoContratoJInternalFrame.STIPO_TAMANIO_GENERAL;
				DatoGeneralEmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoContratoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.datogeneralempleadoSessionBean.setEsGuardarRelacionado(true);

				this.datogeneralempleadoBeanSwingJInternalFrame=new DatoGeneralEmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.datogeneralempleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.datogeneralempleadoBeanSwingJInternalFrame.setdatogeneralempleadoSessionBean(this.datogeneralempleadoSessionBean);

				//this.gridBagConstraintsTipoContrato = new GridBagConstraints();
				//this.gridBagConstraintsTipoContrato.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoContrato.gridx = 0;
				//this.jContentPaneDetalleTipoContrato.add(this.datogeneralempleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoContrato);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoContrato.add("Dato General Empleados",this.datogeneralempleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoContrato.setComponentAt(iIndexTab,this.datogeneralempleadoBeanSwingJInternalFrame.getContentPane());
				}

				//DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.datogeneralempleadoSessionBean.setEsGuardarRelacionado(false);
				this.datogeneralempleadoBeanSwingJInternalFrame=null;//new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.datogeneralempleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDatoGeneralEmpleado) {
					this.jTabbedPaneRelacionesTipoContrato.add("Dato General Empleados",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameEmpleado(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadoSessionBean=new EmpleadoSessionBean();
		this.empleadoSessionBean.setConGuardarRelaciones(false);
		this.empleadoSessionBean.setEsGuardarRelacionado(true);

		this.empleadoBeanSwingJInternalFrame=null;//new EmpleadoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadoBeanSwingJInternalFramePopup=new EmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadoSessionBean.getEsGuardarRelacionado()) {

				EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoContratoJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoContratoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadoSessionBean.setEsGuardarRelacionado(true);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadoBeanSwingJInternalFrame.setempleadoSessionBean(this.empleadoSessionBean);

				//this.gridBagConstraintsTipoContrato = new GridBagConstraints();
				//this.gridBagConstraintsTipoContrato.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoContrato.gridx = 0;
				//this.jContentPaneDetalleTipoContrato.add(this.empleadoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoContrato);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoContrato.add("Empleados",this.empleadoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoContrato.setComponentAt(iIndexTab,this.empleadoBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadoSessionBean.setEsGuardarRelacionado(false);
				this.empleadoBeanSwingJInternalFrame=null;//new EmpleadoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleado) {
					this.jTabbedPaneRelacionesTipoContrato.add("Empleados",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDatoGeneralEmpleadoBeanSwingJInternalFrame(List<TipoContrato> tipocontratos,TipoContrato tipocontrato,DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//datogeneralempleadoBeanSwingJInternalFrame=new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					datogeneralempleadoBeanSwingJInternalFrame.getDatoGeneralEmpleadoLogic().setConnexion(this.tipocontratoLogic.getConnexion());

					datogeneralempleadoBeanSwingJInternalFrame.settipocontratosForeignKey(tipocontratos);
					datogeneralempleadoBeanSwingJInternalFrame.settipocontratoForeignKey(tipocontrato);
					datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setisBusquedaDesdeForeignKeySesionTipoContrato(true);
					datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setlidTipoContratoActual(tipocontrato.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					datogeneralempleadoBeanSwingJInternalFrame.cargarCombosForeignKeyDatoGeneralEmpleado(datogeneralempleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					datogeneralempleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoContrato(true);
					datogeneralempleadoBeanSwingJInternalFrame.setid_tipo_contratoFK_IdTipoContrato(tipocontrato.getId());

					if(!this.conCargarFormDetalle) {
						datogeneralempleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					datogeneralempleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoContratoForeignKey(tipocontrato,1,false,true,true);
					datogeneralempleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					datogeneralempleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoContrato");
					datogeneralempleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoContrato");
					datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoGeneralEmpleado(true);
					datogeneralempleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDatoGeneralEmpleado("n",datogeneralempleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, datogeneralempleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingDatoGeneralEmpleado(false);
					datogeneralempleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					datogeneralempleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						datogeneralempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsDatoGeneralEmpleado("relacionado");
					} else {
						datogeneralempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsDatoGeneralEmpleado("no_relacionado");
					}

					datogeneralempleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionDatoGeneralEmpleado().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarEmpleadoBeanSwingJInternalFrame(List<TipoContrato> tipocontratos,TipoContrato tipocontrato,EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.tipocontratoLogic.getConnexion());

					empleadoBeanSwingJInternalFrame.settipocontratosForeignKey(tipocontratos);
					empleadoBeanSwingJInternalFrame.settipocontratoForeignKey(tipocontrato);
					empleadoBeanSwingJInternalFrame.empleadoSessionBean.setisBusquedaDesdeForeignKeySesionTipoContrato(true);
					empleadoBeanSwingJInternalFrame.empleadoSessionBean.setlidTipoContratoActual(tipocontrato.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadoBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleado(empleadoBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoContrato(true);
					empleadoBeanSwingJInternalFrame.setid_tipo_contratoFK_IdTipoContrato(tipocontrato.getId());

					if(!this.conCargarFormDetalle) {
						empleadoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoContratoForeignKey(tipocontrato,1,false,true,true);
					empleadoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoContrato");
					empleadoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoContrato");
					empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado(true);
					empleadoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleado("n",empleadoBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadoBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("relacionado");
					} else {
						empleadoBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleado("no_relacionado");
					}

					empleadoBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleado().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
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
