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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.RadioVenciClienteProveConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class RadioVenciClienteProveDetalleFormJInternalFrame extends RadioVenciClienteProveBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleRadioVenciClienteProve;
	
	protected JMenuBar jmenuBarDetalleRadioVenciClienteProve;
	
	protected JMenu jmenuDetalleRadioVenciClienteProve;
	protected JMenu jmenuDetalleArchivoRadioVenciClienteProve;
	protected JMenu jmenuDetalleAccionesRadioVenciClienteProve;
	protected JMenu jmenuDetalleDatosRadioVenciClienteProve;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleRadioVenciClienteProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRadioVenciClienteProve;	
	protected GridBagConstraints gridBagConstraintsRadioVenciClienteProve;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected RadioVenciClienteProveBeanSwingJInternalFrameAdditional jInternalFrameDetalleRadioVenciClienteProve;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoRadioVenciBeanSwingJInternalFrame tiporadiovenciBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporadiovenci="";
	
	public RadioVenciClienteProveSessionBean radiovenciclienteproveSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoRadioVenciSessionBean tiporadiovenciSessionBean;	
	
	public RadioVenciClienteProveLogic radiovenciclienteproveLogic;
	
	public JScrollPane jScrollPanelDatosRadioVenciClienteProve;
	public JScrollPane jScrollPanelDatosEdicionRadioVenciClienteProve;
	public JScrollPane jScrollPanelDatosGeneralRadioVenciClienteProve;
	
	protected JPanel jPanelCamposRadioVenciClienteProve;    
	protected JPanel jPanelCamposOcultosRadioVenciClienteProve;    	
	protected JPanel jPanelAccionesRadioVenciClienteProve;
	protected JPanel jPanelAccionesFormularioRadioVenciClienteProve;
    
	
	
	protected Integer iXPanelCamposRadioVenciClienteProve=0;
	protected Integer iYPanelCamposRadioVenciClienteProve=0;
	
	protected Integer iXPanelCamposOcultosRadioVenciClienteProve=0;
	protected Integer iYPanelCamposOcultosRadioVenciClienteProve=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoRadioVenciClienteProve;
	public JButton jButtonModificarRadioVenciClienteProve;
	public JButton jButtonActualizarRadioVenciClienteProve;
    public JButton jButtonEliminarRadioVenciClienteProve;
	public JButton jButtonCancelarRadioVenciClienteProve;
    public JButton jButtonGuardarCambiosRadioVenciClienteProve;
	public JButton jButtonGuardarCambiosTablaRadioVenciClienteProve;
	protected JButton jButtonCerrarRadioVenciClienteProve;
	
	
	protected JButton jButtonProcesarInformacionRadioVenciClienteProve;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoRadioVenciClienteProve;
	protected JCheckBox jCheckBoxPostAccionSinCerrarRadioVenciClienteProve;
	protected JCheckBox jCheckBoxPostAccionSinMensajeRadioVenciClienteProve;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRadioVenciClienteProve;
	protected JButton jButtonModificarToolBarRadioVenciClienteProve;
	protected JButton jButtonActualizarToolBarRadioVenciClienteProve;
    protected JButton jButtonEliminarToolBarRadioVenciClienteProve;
	protected JButton jButtonCancelarToolBarRadioVenciClienteProve;
    protected JButton jButtonGuardarCambiosToolBarRadioVenciClienteProve;
	protected JButton jButtonGuardarCambiosTablaToolBarRadioVenciClienteProve;
	protected JButton jButtonMostrarOcultarTablaToolBarRadioVenciClienteProve;
	protected JButton jButtonCerrarToolBarRadioVenciClienteProve;
	
	protected JButton jButtonProcesarInformacionToolBarRadioVenciClienteProve;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRadioVenciClienteProve;
	protected JMenuItem jMenuItemModificarRadioVenciClienteProve;
	protected JMenuItem jMenuItemActualizarRadioVenciClienteProve;
    protected JMenuItem jMenuItemEliminarRadioVenciClienteProve;
	protected JMenuItem jMenuItemCancelarRadioVenciClienteProve;
    protected JMenuItem jMenuItemGuardarCambiosRadioVenciClienteProve;
	protected JMenuItem jMenuItemGuardarCambiosTablaRadioVenciClienteProve;
	protected JMenuItem jMenuItemCerrarRadioVenciClienteProve;
	protected JMenuItem jMenuItemDetalleCerrarRadioVenciClienteProve;
	protected JMenuItem jMenuItemDetalleMostarOcultarRadioVenciClienteProve;
	
	protected JMenuItem jMenuItemProcesarInformacionRadioVenciClienteProve;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRadioVenciClienteProve;
	protected JMenuItem jMenuItemMostrarOcultarRadioVenciClienteProve;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRadioVenciClienteProve;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRadioVenciClienteProve;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRadioVenciClienteProve;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioRadioVenciClienteProve;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidRadioVenciClienteProve;
	public JLabel jLabelIdRadioVenciClienteProve;
	public JLabel jLabelidRadioVenciClienteProve;
	public JButton jButtonidRadioVenciClienteProveBusqueda= new JButtonMe();

	public JPanel jPaneldia_desdeRadioVenciClienteProve;
	public JLabel jLabeldia_desdeRadioVenciClienteProve;
	public JTextField jTextFielddia_desdeRadioVenciClienteProve;
	public JButton jButtondia_desdeRadioVenciClienteProveBusqueda= new JButtonMe();

	public JPanel jPaneldia_hastaRadioVenciClienteProve;
	public JLabel jLabeldia_hastaRadioVenciClienteProve;
	public JTextField jTextFielddia_hastaRadioVenciClienteProve;
	public JButton jButtondia_hastaRadioVenciClienteProveBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaRadioVenciClienteProve;
	public JLabel jLabelid_empresaRadioVenciClienteProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaRadioVenciClienteProve;
	public JButton jButtonid_empresaRadioVenciClienteProve= new JButtonMe();
	public JButton jButtonid_empresaRadioVenciClienteProveUpdate= new JButtonMe();
	public JButton jButtonid_empresaRadioVenciClienteProveBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_radio_venciRadioVenciClienteProve;
	public JLabel jLabelid_tipo_radio_venciRadioVenciClienteProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_radio_venciRadioVenciClienteProve;
	public JButton jButtonid_tipo_radio_venciRadioVenciClienteProve= new JButtonMe();
	public JButton jButtonid_tipo_radio_venciRadioVenciClienteProveUpdate= new JButtonMe();
	public JButton jButtonid_tipo_radio_venciRadioVenciClienteProveBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesRadioVenciClienteProve;
	
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
	public int iHeightFormulario=286;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public RadioVenciClienteProveDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposRadioVenciClienteProve=new JPanel();
				this.jPanelAccionesFormularioRadioVenciClienteProve=new JPanel();
				this.jmenuBarDetalleRadioVenciClienteProve=new JMenuBar();
				this.jTtoolBarDetalleRadioVenciClienteProve=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RadioVenciClienteProveDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("RadioVenciClienteProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public RadioVenciClienteProveDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("RadioVenciClienteProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RadioVenciClienteProveDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RadioVenciClienteProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RadioVenciClienteProveDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RadioVenciClienteProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RadioVenciClienteProveDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RadioVenciClienteProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarRadioVenciClienteProve() {
		return this.jButtonActualizarToolBarRadioVenciClienteProve;
	}
	
	public JButton getjButtonEliminarToolBarRadioVenciClienteProve() {
		return this.jButtonEliminarToolBarRadioVenciClienteProve;
	}
	
	public JButton getjButtonCancelarToolBarRadioVenciClienteProve() {
		return this.jButtonCancelarToolBarRadioVenciClienteProve;
	}		
	
	public JButton getjButtonProcesarInformacionRadioVenciClienteProve() {
		return this.jButtonProcesarInformacionRadioVenciClienteProve;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRadioVenciClienteProve)	{
		this.jButtonProcesarInformacionRadioVenciClienteProve = jButtonProcesarInformacionRadioVenciClienteProve;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRadioVenciClienteProve() {
		return this.jComboBoxTiposAccionesRadioVenciClienteProve;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRadioVenciClienteProve(
			JComboBox jComboBoxTiposRelacionesRadioVenciClienteProve) {
		this.jComboBoxTiposRelacionesRadioVenciClienteProve = jComboBoxTiposRelacionesRadioVenciClienteProve;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRadioVenciClienteProve(
			JComboBox jComboBoxTiposAccionesRadioVenciClienteProve) {
		this.jComboBoxTiposAccionesRadioVenciClienteProve = jComboBoxTiposAccionesRadioVenciClienteProve;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRadioVenciClienteProve() {
		return this.jComboBoxTiposAccionesFormularioRadioVenciClienteProve;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRadioVenciClienteProve(
			JComboBox jComboBoxTiposAccionesFormularioRadioVenciClienteProve) {
		this.jComboBoxTiposAccionesFormularioRadioVenciClienteProve = jComboBoxTiposAccionesFormularioRadioVenciClienteProve;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.radiovenciclienteproveSessionBean=new RadioVenciClienteProveSessionBean();
		
		this.radiovenciclienteproveSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.radiovenciclienteproveSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RadioVenciClienteProveJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RadioVenciClienteProveJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RadioVenciClienteProveJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Dias Por Vencer MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
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
	
		RadioVenciClienteProveJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleRadioVenciClienteProve= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarRadioVenciClienteProve=new JButtonMe();
				this.jButtonModificarToolBarRadioVenciClienteProve=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarRadioVenciClienteProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarRadioVenciClienteProve,this.jTtoolBarDetalleRadioVenciClienteProve,
							"actualizar","actualizar","Actualizar"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarRadioVenciClienteProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarRadioVenciClienteProve,this.jTtoolBarDetalleRadioVenciClienteProve,
							"eliminar","eliminar","Eliminar"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarRadioVenciClienteProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarRadioVenciClienteProve,this.jTtoolBarDetalleRadioVenciClienteProve,
							"cancelar","cancelar","Cancelar"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarRadioVenciClienteProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarRadioVenciClienteProve,this.jTtoolBarDetalleRadioVenciClienteProve,
							"guardarcambios","guardarcambios","Guardar"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarRadioVenciClienteProve,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarRadioVenciClienteProve,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarRadioVenciClienteProve,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleRadioVenciClienteProve=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleRadioVenciClienteProve=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoRadioVenciClienteProve=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesRadioVenciClienteProve=new JMenuMe("Acciones");
		this.jmenuDetalleDatosRadioVenciClienteProve=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRadioVenciClienteProve= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRadioVenciClienteProve.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRadioVenciClienteProve,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarRadioVenciClienteProve= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarRadioVenciClienteProve.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarRadioVenciClienteProve,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarRadioVenciClienteProve= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarRadioVenciClienteProve.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarRadioVenciClienteProve,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarRadioVenciClienteProve= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarRadioVenciClienteProve.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarRadioVenciClienteProve,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarRadioVenciClienteProve= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarRadioVenciClienteProve.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarRadioVenciClienteProve,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosRadioVenciClienteProve= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRadioVenciClienteProve.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRadioVenciClienteProve,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRadioVenciClienteProve= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRadioVenciClienteProve.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRadioVenciClienteProve,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarRadioVenciClienteProve= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarRadioVenciClienteProve.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarRadioVenciClienteProve,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRadioVenciClienteProve= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRadioVenciClienteProve.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRadioVenciClienteProve,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRadioVenciClienteProve= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRadioVenciClienteProve.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRadioVenciClienteProve,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoRadioVenciClienteProve.add(this.jMenuItemDetalleCerrarRadioVenciClienteProve);
		
		this.jmenuDetalleAccionesRadioVenciClienteProve.add(this.jMenuItemActualizarRadioVenciClienteProve);
		this.jmenuDetalleAccionesRadioVenciClienteProve.add(this.jMenuItemEliminarRadioVenciClienteProve);
		this.jmenuDetalleAccionesRadioVenciClienteProve.add(this.jMenuItemCancelarRadioVenciClienteProve);		
		
		//this.jmenuDetalleDatosRadioVenciClienteProve.add(this.jMenuItemDetalleAbrirOrderByRadioVenciClienteProve);				
		this.jmenuDetalleDatosRadioVenciClienteProve.add(this.jMenuItemDetalleMostarOcultarRadioVenciClienteProve);				
				
		//this.jmenuDetalleAccionesRadioVenciClienteProve.add(this.jMenuItemGuardarCambiosRadioVenciClienteProve);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleRadioVenciClienteProve.add(this.jmenuDetalleArchivoRadioVenciClienteProve);		
		this.jmenuBarDetalleRadioVenciClienteProve.add(this.jmenuDetalleAccionesRadioVenciClienteProve);		
		this.jmenuBarDetalleRadioVenciClienteProve.add(this.jmenuDetalleDatosRadioVenciClienteProve);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleRadioVenciClienteProve);				
	}
	
	
	public void inicializarElementosCamposRadioVenciClienteProve() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdRadioVenciClienteProve = new JLabelMe();
		jLabelIdRadioVenciClienteProve.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdRadioVenciClienteProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRadioVenciClienteProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRadioVenciClienteProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdRadioVenciClienteProve,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidRadioVenciClienteProve = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidRadioVenciClienteProve.setToolTipText(RadioVenciClienteProveConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutRadioVenciClienteProve= new GridBagLayout();

		this.jPanelidRadioVenciClienteProve.setLayout(this.gridaBagLayoutRadioVenciClienteProve);

		jLabelidRadioVenciClienteProve = new JLabel();
		jLabelidRadioVenciClienteProve.setText("Id");

		jLabelidRadioVenciClienteProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRadioVenciClienteProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRadioVenciClienteProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldia_desdeRadioVenciClienteProve = new JLabelMe();
		this.jLabeldia_desdeRadioVenciClienteProve.setText(""+RadioVenciClienteProveConstantesFunciones.LABEL_DIADESDE+" : *");
		this.jLabeldia_desdeRadioVenciClienteProve.setToolTipText("Dia Desde");
		this.jLabeldia_desdeRadioVenciClienteProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_desdeRadioVenciClienteProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_desdeRadioVenciClienteProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldia_desdeRadioVenciClienteProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldia_desdeRadioVenciClienteProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldia_desdeRadioVenciClienteProve.setToolTipText(RadioVenciClienteProveConstantesFunciones.LABEL_DIADESDE);
		this.gridaBagLayoutRadioVenciClienteProve = new GridBagLayout();
		this.jPaneldia_desdeRadioVenciClienteProve.setLayout(this.gridaBagLayoutRadioVenciClienteProve);


		jTextFielddia_desdeRadioVenciClienteProve= new JTextFieldMe();
		jTextFielddia_desdeRadioVenciClienteProve.setEnabled(false);
		jTextFielddia_desdeRadioVenciClienteProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_desdeRadioVenciClienteProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_desdeRadioVenciClienteProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddia_desdeRadioVenciClienteProve,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddia_desdeRadioVenciClienteProve.setText("0");

		this.jButtondia_desdeRadioVenciClienteProveBusqueda= new JButtonMe();
		this.jButtondia_desdeRadioVenciClienteProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_desdeRadioVenciClienteProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_desdeRadioVenciClienteProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondia_desdeRadioVenciClienteProveBusqueda.setText("U");
		this.jButtondia_desdeRadioVenciClienteProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondia_desdeRadioVenciClienteProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondia_desdeRadioVenciClienteProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddia_desdeRadioVenciClienteProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddia_desdeRadioVenciClienteProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dia_desdeRadioVenciClienteProveBusqueda"));

		if(this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondia_desdeRadioVenciClienteProveBusqueda.setVisible(false);		}


					
		this.jLabeldia_hastaRadioVenciClienteProve = new JLabelMe();
		this.jLabeldia_hastaRadioVenciClienteProve.setText(""+RadioVenciClienteProveConstantesFunciones.LABEL_DIAHASTA+" : *");
		this.jLabeldia_hastaRadioVenciClienteProve.setToolTipText("Dia Hasta");
		this.jLabeldia_hastaRadioVenciClienteProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_hastaRadioVenciClienteProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_hastaRadioVenciClienteProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldia_hastaRadioVenciClienteProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldia_hastaRadioVenciClienteProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldia_hastaRadioVenciClienteProve.setToolTipText(RadioVenciClienteProveConstantesFunciones.LABEL_DIAHASTA);
		this.gridaBagLayoutRadioVenciClienteProve = new GridBagLayout();
		this.jPaneldia_hastaRadioVenciClienteProve.setLayout(this.gridaBagLayoutRadioVenciClienteProve);


		jTextFielddia_hastaRadioVenciClienteProve= new JTextFieldMe();
		jTextFielddia_hastaRadioVenciClienteProve.setEnabled(false);
		jTextFielddia_hastaRadioVenciClienteProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_hastaRadioVenciClienteProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_hastaRadioVenciClienteProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddia_hastaRadioVenciClienteProve,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddia_hastaRadioVenciClienteProve.setText("0");

		this.jButtondia_hastaRadioVenciClienteProveBusqueda= new JButtonMe();
		this.jButtondia_hastaRadioVenciClienteProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_hastaRadioVenciClienteProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_hastaRadioVenciClienteProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondia_hastaRadioVenciClienteProveBusqueda.setText("U");
		this.jButtondia_hastaRadioVenciClienteProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondia_hastaRadioVenciClienteProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondia_hastaRadioVenciClienteProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddia_hastaRadioVenciClienteProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddia_hastaRadioVenciClienteProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dia_hastaRadioVenciClienteProveBusqueda"));

		if(this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondia_hastaRadioVenciClienteProveBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysRadioVenciClienteProve() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaRadioVenciClienteProve = new JLabelMe();
		this.jLabelid_empresaRadioVenciClienteProve.setText(""+RadioVenciClienteProveConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaRadioVenciClienteProve.setToolTipText("Empresa");
		this.jLabelid_empresaRadioVenciClienteProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRadioVenciClienteProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRadioVenciClienteProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaRadioVenciClienteProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaRadioVenciClienteProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaRadioVenciClienteProve.setToolTipText(RadioVenciClienteProveConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutRadioVenciClienteProve = new GridBagLayout();
		this.jPanelid_empresaRadioVenciClienteProve.setLayout(this.gridaBagLayoutRadioVenciClienteProve);


		jComboBoxid_empresaRadioVenciClienteProve= new JComboBoxMe();
		jComboBoxid_empresaRadioVenciClienteProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRadioVenciClienteProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRadioVenciClienteProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaRadioVenciClienteProve,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaRadioVenciClienteProve.setEnabled(false);

		this.jButtonid_empresaRadioVenciClienteProve= new JButtonMe();
		this.jButtonid_empresaRadioVenciClienteProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRadioVenciClienteProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRadioVenciClienteProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRadioVenciClienteProve.setText("Buscar");
		this.jButtonid_empresaRadioVenciClienteProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaRadioVenciClienteProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRadioVenciClienteProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaRadioVenciClienteProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRadioVenciClienteProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRadioVenciClienteProve"));

		this.jButtonid_empresaRadioVenciClienteProveBusqueda= new JButtonMe();
		this.jButtonid_empresaRadioVenciClienteProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRadioVenciClienteProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRadioVenciClienteProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRadioVenciClienteProveBusqueda.setText("U");
		this.jButtonid_empresaRadioVenciClienteProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaRadioVenciClienteProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRadioVenciClienteProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaRadioVenciClienteProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRadioVenciClienteProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRadioVenciClienteProveBusqueda"));

		if(this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaRadioVenciClienteProveBusqueda.setVisible(false);		}

		this.jButtonid_empresaRadioVenciClienteProveUpdate= new JButtonMe();
		this.jButtonid_empresaRadioVenciClienteProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRadioVenciClienteProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRadioVenciClienteProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRadioVenciClienteProveUpdate.setText("U");
		this.jButtonid_empresaRadioVenciClienteProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaRadioVenciClienteProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRadioVenciClienteProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaRadioVenciClienteProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRadioVenciClienteProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRadioVenciClienteProveUpdate"));



					
		this.jLabelid_tipo_radio_venciRadioVenciClienteProve = new JLabelMe();
		this.jLabelid_tipo_radio_venciRadioVenciClienteProve.setText(""+RadioVenciClienteProveConstantesFunciones.LABEL_IDTIPORADIOVENCI+" : *");
		this.jLabelid_tipo_radio_venciRadioVenciClienteProve.setToolTipText("Tipo Radio Vencimiento");
		this.jLabelid_tipo_radio_venciRadioVenciClienteProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_radio_venciRadioVenciClienteProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_radio_venciRadioVenciClienteProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_radio_venciRadioVenciClienteProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_radio_venciRadioVenciClienteProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_radio_venciRadioVenciClienteProve.setToolTipText(RadioVenciClienteProveConstantesFunciones.LABEL_IDTIPORADIOVENCI);
		this.gridaBagLayoutRadioVenciClienteProve = new GridBagLayout();
		this.jPanelid_tipo_radio_venciRadioVenciClienteProve.setLayout(this.gridaBagLayoutRadioVenciClienteProve);


		jComboBoxid_tipo_radio_venciRadioVenciClienteProve= new JComboBoxMe();
		jComboBoxid_tipo_radio_venciRadioVenciClienteProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_radio_venciRadioVenciClienteProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_radio_venciRadioVenciClienteProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_radio_venciRadioVenciClienteProve,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_radio_venciRadioVenciClienteProve= new JButtonMe();
		this.jButtonid_tipo_radio_venciRadioVenciClienteProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_radio_venciRadioVenciClienteProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_radio_venciRadioVenciClienteProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_radio_venciRadioVenciClienteProve.setText("Buscar");
		this.jButtonid_tipo_radio_venciRadioVenciClienteProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_radio_venciRadioVenciClienteProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_radio_venciRadioVenciClienteProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_radio_venciRadioVenciClienteProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_radio_venciRadioVenciClienteProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_radio_venciRadioVenciClienteProve"));

		this.jButtonid_tipo_radio_venciRadioVenciClienteProveBusqueda= new JButtonMe();
		this.jButtonid_tipo_radio_venciRadioVenciClienteProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_radio_venciRadioVenciClienteProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_radio_venciRadioVenciClienteProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_radio_venciRadioVenciClienteProveBusqueda.setText("U");
		this.jButtonid_tipo_radio_venciRadioVenciClienteProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_radio_venciRadioVenciClienteProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_radio_venciRadioVenciClienteProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_radio_venciRadioVenciClienteProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_radio_venciRadioVenciClienteProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_radio_venciRadioVenciClienteProveBusqueda"));

		if(this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_radio_venciRadioVenciClienteProveBusqueda.setVisible(false);		}

		this.jButtonid_tipo_radio_venciRadioVenciClienteProveUpdate= new JButtonMe();
		this.jButtonid_tipo_radio_venciRadioVenciClienteProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_radio_venciRadioVenciClienteProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_radio_venciRadioVenciClienteProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_radio_venciRadioVenciClienteProveUpdate.setText("U");
		this.jButtonid_tipo_radio_venciRadioVenciClienteProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_radio_venciRadioVenciClienteProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_radio_venciRadioVenciClienteProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_radio_venciRadioVenciClienteProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_radio_venciRadioVenciClienteProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_radio_venciRadioVenciClienteProveUpdate"));



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
		//this.jInternalFrameDetalleRadioVenciClienteProve = new RadioVenciClienteProveBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Dias Por Vencer DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRadioVenciClienteProve= new GridBagLayout();
		

		
		String sToolTipRadioVenciClienteProve="";
		sToolTipRadioVenciClienteProve=RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRadioVenciClienteProve+="(Cartera.RadioVenciClienteProve)";
		}
		
		if(!this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
			sToolTipRadioVenciClienteProve+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoRadioVenciClienteProve = new JButtonMe();
		this.jButtonModificarRadioVenciClienteProve = new JButtonMe();
        this.jButtonActualizarRadioVenciClienteProve = new JButtonMe();
        this.jButtonEliminarRadioVenciClienteProve = new JButtonMe();
        this.jButtonCancelarRadioVenciClienteProve = new JButtonMe();
        this.jButtonGuardarCambiosRadioVenciClienteProve = new JButtonMe();
		this.jButtonGuardarCambiosTablaRadioVenciClienteProve = new JButtonMe();
		this.jButtonCerrarRadioVenciClienteProve = new JButtonMe();
		
		this.jScrollPanelDatosRadioVenciClienteProve = new JScrollPane();   
        this.jScrollPanelDatosEdicionRadioVenciClienteProve = new JScrollPane();
		this.jScrollPanelDatosGeneralRadioVenciClienteProve = new JScrollPane();
				
		
		
		this.jPanelCamposRadioVenciClienteProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosRadioVenciClienteProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesRadioVenciClienteProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioRadioVenciClienteProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Dias Por Vencer";
		
		if(!this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRadioVenciClienteProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dias Por Vencers" + this.sPath));
		} else {
			this.jScrollPanelDatosRadioVenciClienteProve.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionRadioVenciClienteProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralRadioVenciClienteProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposRadioVenciClienteProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposRadioVenciClienteProve.setName("jPanelCamposRadioVenciClienteProve"); 

		this.jPanelCamposOcultosRadioVenciClienteProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosRadioVenciClienteProve.setName("jPanelCamposOcultosRadioVenciClienteProve"); 

        this.jPanelAccionesRadioVenciClienteProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRadioVenciClienteProve.setToolTipText("Acciones");
        this.jPanelAccionesRadioVenciClienteProve.setName("Acciones"); 

		this.jPanelAccionesFormularioRadioVenciClienteProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioRadioVenciClienteProve.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRadioVenciClienteProve.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoRadioVenciClienteProve.setText("Nuevo");
		this.jButtonModificarRadioVenciClienteProve.setText("Editar");
        this.jButtonActualizarRadioVenciClienteProve.setText("Actualizar");
        this.jButtonEliminarRadioVenciClienteProve.setText("Eliminar");
        this.jButtonCancelarRadioVenciClienteProve.setText("Cancelar");
        this.jButtonGuardarCambiosRadioVenciClienteProve.setText("Guardar");
		this.jButtonGuardarCambiosTablaRadioVenciClienteProve.setText("Guardar");
		this.jButtonCerrarRadioVenciClienteProve.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRadioVenciClienteProve,"nuevo_button","Nuevo",this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarRadioVenciClienteProve,"modificar_button","Editar",this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarRadioVenciClienteProve,"actualizar_button","Actualizar",this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarRadioVenciClienteProve,"eliminar_button","Eliminar",this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarRadioVenciClienteProve,"cancelar_button","Cancelar",this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosRadioVenciClienteProve,"guardarcambios_button","Guardar",this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRadioVenciClienteProve,"guardarcambiostabla_button","Guardar",this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRadioVenciClienteProve,"cerrar_button","Salir",this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoRadioVenciClienteProve.setToolTipText("Nuevo"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarRadioVenciClienteProve.setToolTipText("Editar"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarRadioVenciClienteProve.setToolTipText("Actualizar"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarRadioVenciClienteProve.setToolTipText("Eliminar)"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarRadioVenciClienteProve.setToolTipText("Cancelar"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosRadioVenciClienteProve.setToolTipText("Guardar"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaRadioVenciClienteProve.setToolTipText("Guardar"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRadioVenciClienteProve.setToolTipText("Salir"+" "+RadioVenciClienteProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRadioVenciClienteProve";
		inputMap = this.jButtonNuevoRadioVenciClienteProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRadioVenciClienteProve.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRadioVenciClienteProve"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarRadioVenciClienteProve";
		inputMap = this.jButtonActualizarRadioVenciClienteProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarRadioVenciClienteProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarRadioVenciClienteProve"));
		
		//ELIMINAR
		sMapKey = "EliminarRadioVenciClienteProve";
		inputMap = this.jButtonEliminarRadioVenciClienteProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarRadioVenciClienteProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarRadioVenciClienteProve"));
		
		//CANCELAR	
		sMapKey = "CancelarRadioVenciClienteProve";
		inputMap = this.jButtonCancelarRadioVenciClienteProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarRadioVenciClienteProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarRadioVenciClienteProve"));
		
		//CERRAR		
		sMapKey = "CerrarRadioVenciClienteProve";
		inputMap = this.jButtonCerrarRadioVenciClienteProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRadioVenciClienteProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRadioVenciClienteProve"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRadioVenciClienteProve";
		inputMap = this.jButtonGuardarCambiosTablaRadioVenciClienteProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRadioVenciClienteProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRadioVenciClienteProve"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoRadioVenciClienteProve = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoRadioVenciClienteProve.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoRadioVenciClienteProve.setToolTipText("Nuevo RadioVenciClienteProve");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarRadioVenciClienteProve = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarRadioVenciClienteProve.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarRadioVenciClienteProve.setToolTipText("Sin Cerrar Ventana RadioVenciClienteProve");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeRadioVenciClienteProve = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeRadioVenciClienteProve.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeRadioVenciClienteProve.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesRadioVenciClienteProve = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRadioVenciClienteProve.setText("Accion");
		this.jComboBoxTiposAccionesRadioVenciClienteProve.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioRadioVenciClienteProve = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRadioVenciClienteProve.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioRadioVenciClienteProve.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesRadioVenciClienteProve = new JLabelMe();
		
		this.jLabelAccionesRadioVenciClienteProve.setText("Acciones");		
		this.jLabelAccionesRadioVenciClienteProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRadioVenciClienteProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRadioVenciClienteProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposRadioVenciClienteProve();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysRadioVenciClienteProve();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesRadioVenciClienteProve=new JTabbedPane();
		this.jTabbedPaneRelacionesRadioVenciClienteProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesRadioVenciClienteProve,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesRadioVenciClienteProve.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRadioVenciClienteProve.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRadioVenciClienteProve.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioRadioVenciClienteProve.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRadioVenciClienteProve.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRadioVenciClienteProve.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRadioVenciClienteProve, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposRadioVenciClienteProve = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosRadioVenciClienteProve = new GridBagLayout();
		
		this.jPanelCamposRadioVenciClienteProve.setLayout(gridaBagLayoutCamposRadioVenciClienteProve);
		this.jPanelCamposOcultosRadioVenciClienteProve.setLayout(gridaBagLayoutCamposOcultosRadioVenciClienteProve);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRadioVenciClienteProve.gridy = 0;
	this.gridBagConstraintsRadioVenciClienteProve.gridx = 0;
	this.gridBagConstraintsRadioVenciClienteProve.ipadx = 0;
	this.gridBagConstraintsRadioVenciClienteProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidRadioVenciClienteProve.add(jLabelIdRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);



	this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRadioVenciClienteProve.gridy = 0;
	this.gridBagConstraintsRadioVenciClienteProve.gridx = 1;
	this.gridBagConstraintsRadioVenciClienteProve.ipadx = 0;
	this.gridBagConstraintsRadioVenciClienteProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidRadioVenciClienteProve.add(jLabelidRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);


	this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRadioVenciClienteProve.gridy = 0;
	this.gridBagConstraintsRadioVenciClienteProve.gridx = 0;
	this.gridBagConstraintsRadioVenciClienteProve.ipadx = 0;
	this.gridBagConstraintsRadioVenciClienteProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaRadioVenciClienteProve.add(jLabelid_empresaRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		//this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRadioVenciClienteProve.gridy = 0;
		this.gridBagConstraintsRadioVenciClienteProve.gridx = 2;
		this.gridBagConstraintsRadioVenciClienteProve.ipadx = 0;
		this.gridBagConstraintsRadioVenciClienteProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRadioVenciClienteProve.add(jButtonid_empresaRadioVenciClienteProveBusqueda, this.gridBagConstraintsRadioVenciClienteProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		//this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRadioVenciClienteProve.gridy = 0;
		this.gridBagConstraintsRadioVenciClienteProve.gridx = 3;
		this.gridBagConstraintsRadioVenciClienteProve.ipadx = 0;
		this.gridBagConstraintsRadioVenciClienteProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRadioVenciClienteProve.add(jButtonid_empresaRadioVenciClienteProveUpdate, this.gridBagConstraintsRadioVenciClienteProve);
	}

	this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRadioVenciClienteProve.gridy = 0;
	this.gridBagConstraintsRadioVenciClienteProve.gridx = 1;
	this.gridBagConstraintsRadioVenciClienteProve.ipadx = 0;
	this.gridBagConstraintsRadioVenciClienteProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaRadioVenciClienteProve.add(jComboBoxid_empresaRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);


	this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRadioVenciClienteProve.gridy = 0;
	this.gridBagConstraintsRadioVenciClienteProve.gridx = 0;
	this.gridBagConstraintsRadioVenciClienteProve.ipadx = 0;
	this.gridBagConstraintsRadioVenciClienteProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_radio_venciRadioVenciClienteProve.add(jLabelid_tipo_radio_venciRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		//this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRadioVenciClienteProve.gridy = 0;
		this.gridBagConstraintsRadioVenciClienteProve.gridx = 2;
		this.gridBagConstraintsRadioVenciClienteProve.ipadx = 0;
		this.gridBagConstraintsRadioVenciClienteProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_radio_venciRadioVenciClienteProve.add(jButtonid_tipo_radio_venciRadioVenciClienteProveBusqueda, this.gridBagConstraintsRadioVenciClienteProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		//this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRadioVenciClienteProve.gridy = 0;
		this.gridBagConstraintsRadioVenciClienteProve.gridx = 3;
		this.gridBagConstraintsRadioVenciClienteProve.ipadx = 0;
		this.gridBagConstraintsRadioVenciClienteProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_radio_venciRadioVenciClienteProve.add(jButtonid_tipo_radio_venciRadioVenciClienteProveUpdate, this.gridBagConstraintsRadioVenciClienteProve);
	}

	this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRadioVenciClienteProve.gridy = 0;
	this.gridBagConstraintsRadioVenciClienteProve.gridx = 1;
	this.gridBagConstraintsRadioVenciClienteProve.ipadx = 0;
	this.gridBagConstraintsRadioVenciClienteProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_radio_venciRadioVenciClienteProve.add(jComboBoxid_tipo_radio_venciRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);


	this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRadioVenciClienteProve.gridy = 0;
	this.gridBagConstraintsRadioVenciClienteProve.gridx = 0;
	this.gridBagConstraintsRadioVenciClienteProve.ipadx = 0;
	this.gridBagConstraintsRadioVenciClienteProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldia_desdeRadioVenciClienteProve.add(jLabeldia_desdeRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		//this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRadioVenciClienteProve.gridy = 0;
		this.gridBagConstraintsRadioVenciClienteProve.gridx = 2;
		this.gridBagConstraintsRadioVenciClienteProve.ipadx = 0;
		this.gridBagConstraintsRadioVenciClienteProve.insets = new Insets(0, 0, 0, 0);
		this.jPaneldia_desdeRadioVenciClienteProve.add(jButtondia_desdeRadioVenciClienteProveBusqueda, this.gridBagConstraintsRadioVenciClienteProve);
	}

	this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRadioVenciClienteProve.gridy = 0;
	this.gridBagConstraintsRadioVenciClienteProve.gridx = 1;
	this.gridBagConstraintsRadioVenciClienteProve.ipadx = 0;
	this.gridBagConstraintsRadioVenciClienteProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldia_desdeRadioVenciClienteProve.add(jTextFielddia_desdeRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);


	this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRadioVenciClienteProve.gridy = 0;
	this.gridBagConstraintsRadioVenciClienteProve.gridx = 0;
	this.gridBagConstraintsRadioVenciClienteProve.ipadx = 0;
	this.gridBagConstraintsRadioVenciClienteProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldia_hastaRadioVenciClienteProve.add(jLabeldia_hastaRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		//this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRadioVenciClienteProve.gridy = 0;
		this.gridBagConstraintsRadioVenciClienteProve.gridx = 2;
		this.gridBagConstraintsRadioVenciClienteProve.ipadx = 0;
		this.gridBagConstraintsRadioVenciClienteProve.insets = new Insets(0, 0, 0, 0);
		this.jPaneldia_hastaRadioVenciClienteProve.add(jButtondia_hastaRadioVenciClienteProveBusqueda, this.gridBagConstraintsRadioVenciClienteProve);
	}

	this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRadioVenciClienteProve.gridy = 0;
	this.gridBagConstraintsRadioVenciClienteProve.gridx = 1;
	this.gridBagConstraintsRadioVenciClienteProve.ipadx = 0;
	this.gridBagConstraintsRadioVenciClienteProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldia_hastaRadioVenciClienteProve.add(jTextFielddia_hastaRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRadioVenciClienteProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRadioVenciClienteProve.gridy = iYPanelCamposRadioVenciClienteProve;
	this.gridBagConstraintsRadioVenciClienteProve.gridx = iXPanelCamposRadioVenciClienteProve++;
	this.gridBagConstraintsRadioVenciClienteProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRadioVenciClienteProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRadioVenciClienteProve.add(this.jPanelidRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);



	if(iXPanelCamposRadioVenciClienteProve % 1==0) {
		iXPanelCamposRadioVenciClienteProve=0;
		iYPanelCamposRadioVenciClienteProve++;
	}
	this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRadioVenciClienteProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRadioVenciClienteProve.gridy = iYPanelCamposRadioVenciClienteProve;
	this.gridBagConstraintsRadioVenciClienteProve.gridx = iXPanelCamposRadioVenciClienteProve++;
	this.gridBagConstraintsRadioVenciClienteProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRadioVenciClienteProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRadioVenciClienteProve.add(this.jPanelid_tipo_radio_venciRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);



	if(iXPanelCamposRadioVenciClienteProve % 1==0) {
		iXPanelCamposRadioVenciClienteProve=0;
		iYPanelCamposRadioVenciClienteProve++;
	}
	this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRadioVenciClienteProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRadioVenciClienteProve.gridy = iYPanelCamposRadioVenciClienteProve;
	this.gridBagConstraintsRadioVenciClienteProve.gridx = iXPanelCamposRadioVenciClienteProve++;
	this.gridBagConstraintsRadioVenciClienteProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRadioVenciClienteProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRadioVenciClienteProve.add(this.jPaneldia_desdeRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);



	if(iXPanelCamposRadioVenciClienteProve % 1==0) {
		iXPanelCamposRadioVenciClienteProve=0;
		iYPanelCamposRadioVenciClienteProve++;
	}
	this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRadioVenciClienteProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRadioVenciClienteProve.gridy = iYPanelCamposRadioVenciClienteProve;
	this.gridBagConstraintsRadioVenciClienteProve.gridx = iXPanelCamposRadioVenciClienteProve++;
	this.gridBagConstraintsRadioVenciClienteProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRadioVenciClienteProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRadioVenciClienteProve.add(this.jPaneldia_hastaRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);



	if(iXPanelCamposRadioVenciClienteProve % 1==0) {
		iXPanelCamposRadioVenciClienteProve=0;
		iYPanelCamposRadioVenciClienteProve++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRadioVenciClienteProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRadioVenciClienteProve.gridy = iYPanelCamposOcultosRadioVenciClienteProve;
	this.gridBagConstraintsRadioVenciClienteProve.gridx = iXPanelCamposOcultosRadioVenciClienteProve++;
	this.gridBagConstraintsRadioVenciClienteProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRadioVenciClienteProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRadioVenciClienteProve.add(this.jPanelid_empresaRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);



	if(iXPanelCamposOcultosRadioVenciClienteProve % 1==0) {
		iXPanelCamposOcultosRadioVenciClienteProve=0;
		iYPanelCamposOcultosRadioVenciClienteProve++;
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
			
		GridBagLayout gridaBagLayoutAccionesRadioVenciClienteProve= new GridBagLayout();
		this.jPanelAccionesRadioVenciClienteProve.setLayout(gridaBagLayoutAccionesRadioVenciClienteProve);
		
		GridBagLayout gridaBagLayoutAccionesFormularioRadioVenciClienteProve= new GridBagLayout();
		this.jPanelAccionesFormularioRadioVenciClienteProve.setLayout(gridaBagLayoutAccionesFormularioRadioVenciClienteProve);
		
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRadioVenciClienteProve.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRadioVenciClienteProve.add(this.jComboBoxTiposAccionesFormularioRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);

		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRadioVenciClienteProve.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRadioVenciClienteProve.add(this.jCheckBoxPostAccionNuevoRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.radiovenciclienteproveSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRadioVenciClienteProve.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRadioVenciClienteProve.add(this.jCheckBoxPostAccionSinCerrarRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.radiovenciclienteproveSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRadioVenciClienteProve.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRadioVenciClienteProve.add(this.jCheckBoxPostAccionSinMensajeRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRadioVenciClienteProve.gridy = 0;
		this.gridBagConstraintsRadioVenciClienteProve.gridx = iPosXAccion++;
			
		this.jPanelAccionesRadioVenciClienteProve.add(this.jButtonModificarRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);							

		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRadioVenciClienteProve.gridy = 0;
		this.gridBagConstraintsRadioVenciClienteProve.gridx =iPosXAccion++;
			
		this.jPanelAccionesRadioVenciClienteProve.add(this.jButtonEliminarRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
		
			
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.gridy = 0;		
		this.gridBagConstraintsRadioVenciClienteProve.gridx = iPosXAccion++;
		
		this.jPanelAccionesRadioVenciClienteProve.add(this.jButtonActualizarRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);


		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.gridy = 0;		
		this.gridBagConstraintsRadioVenciClienteProve.gridx = iPosXAccion++;
		
		this.jPanelAccionesRadioVenciClienteProve.add(this.jButtonGuardarCambiosRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);	
		
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.gridy = 0;		
		this.gridBagConstraintsRadioVenciClienteProve.gridx =iPosXAccion++;
		
		this.jPanelAccionesRadioVenciClienteProve.add(this.jButtonCancelarRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRadioVenciClienteProve = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRadioVenciClienteProve);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.radiovenciclienteproveSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();						
			this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRadioVenciClienteProve.gridx = 0;		
			//this.gridBagConstraintsRadioVenciClienteProve.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciClienteProve.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRadioVenciClienteProve.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRadioVenciClienteProve.gridx =0;
		this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRadioVenciClienteProve.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(RadioVenciClienteProveJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleRadioVenciClienteProve = new RadioVenciClienteProveBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Dias Por Vencer DATOS");
			
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
			
	        //this.setTitle("[FOR] - Dias Por Vencer DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Dias Por Vencer Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			RadioVenciClienteProveModel radiovenciclienteproveModel=new RadioVenciClienteProveModel(this);
			
			//SI USARA CLASE INTERNA
			//RadioVenciClienteProveModel.RadioVenciClienteProveFocusTraversalPolicy radiovenciclienteproveFocusTraversalPolicy = radiovenciclienteproveModel.new RadioVenciClienteProveFocusTraversalPolicy(this);
			
			//radiovenciclienteproveFocusTraversalPolicy.setradiovenciclienteproveJInternalFrame(this);
			
			this.setFocusTraversalPolicy(radiovenciclienteproveModel);
			
			
			this.jContentPaneDetalleRadioVenciClienteProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleRadioVenciClienteProve = new GridBagLayout();	
			this.jContentPaneDetalleRadioVenciClienteProve.setLayout(gridaBagLayoutDetalleRadioVenciClienteProve);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRadioVenciClienteProve = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
				this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsRadioVenciClienteProve.gridx = 0;
					
				
				this.jContentPaneDetalleRadioVenciClienteProve.add(jTtoolBarDetalleRadioVenciClienteProve, gridBagConstraintsRadioVenciClienteProve);								
				
}
			
			this.jScrollPanelDatosEdicionRadioVenciClienteProve=   new JScrollPane(jContentPaneDetalleRadioVenciClienteProve,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRadioVenciClienteProve.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRadioVenciClienteProve.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRadioVenciClienteProve.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralRadioVenciClienteProve=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRadioVenciClienteProve.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRadioVenciClienteProve.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRadioVenciClienteProve.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			
			
	        this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsRadioVenciClienteProve.gridx = 0;
	        
			this.jContentPaneDetalleRadioVenciClienteProve.add(jPanelCamposRadioVenciClienteProve, gridBagConstraintsRadioVenciClienteProve);
			
			
			
			
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
						&& radiovenciclienteproveSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.radiovenciclienteproveSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsRadioVenciClienteProve= new GridBagConstraints();
						this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyRelaciones++;
						this.gridBagConstraintsRadioVenciClienteProve.gridx = 0;
						this.jContentPaneDetalleRadioVenciClienteProve.add(this.jTabbedPaneRelacionesRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesRadioVenciClienteProve.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosRadioVenciClienteProve.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
					this.gridBagConstraintsRadioVenciClienteProve.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsRadioVenciClienteProve.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsRadioVenciClienteProve.gridx = 0;
					
				
					this.jContentPaneDetalleRadioVenciClienteProve.add(jPanelCamposOcultosRadioVenciClienteProve, gridBagConstraintsRadioVenciClienteProve);
				
					this.jPanelCamposOcultosRadioVenciClienteProve.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsRadioVenciClienteProve.gridx = 0;
	        this.gridBagConstraintsRadioVenciClienteProve.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleRadioVenciClienteProve.add(this.jPanelAccionesFormularioRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);							
			
			
			
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
	        this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsRadioVenciClienteProve.gridx = 0;
	        
			
			this.jContentPaneDetalleRadioVenciClienteProve.add(this.jPanelAccionesRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionRadioVenciClienteProve);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionRadioVenciClienteProve=   new JScrollPane(this.jPanelCamposRadioVenciClienteProve,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRadioVenciClienteProve.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRadioVenciClienteProve.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRadioVenciClienteProve.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsRadioVenciClienteProve.gridx = 0;
			this.gridBagConstraintsRadioVenciClienteProve.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsRadioVenciClienteProve.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsRadioVenciClienteProve.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRadioVenciClienteProve.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);			
			
			this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciClienteProve.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRadioVenciClienteProve.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRadioVenciClienteProve.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
			
			
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRadioVenciClienteProve.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
		
			
		this.gridBagConstraintsRadioVenciClienteProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciClienteProve.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRadioVenciClienteProve.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRadioVenciClienteProve, this.gridBagConstraintsRadioVenciClienteProve);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralRadioVenciClienteProve;//jContentPane;
		
		return jScrollPanelDatosEdicionRadioVenciClienteProve;
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
