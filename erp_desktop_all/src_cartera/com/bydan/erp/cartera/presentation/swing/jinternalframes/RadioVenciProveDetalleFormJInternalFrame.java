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
import com.bydan.erp.cartera.util.RadioVenciProveConstantesFunciones;

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
public class RadioVenciProveDetalleFormJInternalFrame extends RadioVenciProveBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleRadioVenciProve;
	
	protected JMenuBar jmenuBarDetalleRadioVenciProve;
	
	protected JMenu jmenuDetalleRadioVenciProve;
	protected JMenu jmenuDetalleArchivoRadioVenciProve;
	protected JMenu jmenuDetalleAccionesRadioVenciProve;
	protected JMenu jmenuDetalleDatosRadioVenciProve;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleRadioVenciProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRadioVenciProve;	
	protected GridBagConstraints gridBagConstraintsRadioVenciProve;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected RadioVenciProveBeanSwingJInternalFrameAdditional jInternalFrameDetalleRadioVenciProve;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoRadioVenciBeanSwingJInternalFrame tiporadiovenciBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporadiovenci="";
	
	public RadioVenciProveSessionBean radiovenciproveSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoRadioVenciSessionBean tiporadiovenciSessionBean;	
	
	public RadioVenciProveLogic radiovenciproveLogic;
	
	public JScrollPane jScrollPanelDatosRadioVenciProve;
	public JScrollPane jScrollPanelDatosEdicionRadioVenciProve;
	public JScrollPane jScrollPanelDatosGeneralRadioVenciProve;
	
	protected JPanel jPanelCamposRadioVenciProve;    
	protected JPanel jPanelCamposOcultosRadioVenciProve;    	
	protected JPanel jPanelAccionesRadioVenciProve;
	protected JPanel jPanelAccionesFormularioRadioVenciProve;
    
	
	
	protected Integer iXPanelCamposRadioVenciProve=0;
	protected Integer iYPanelCamposRadioVenciProve=0;
	
	protected Integer iXPanelCamposOcultosRadioVenciProve=0;
	protected Integer iYPanelCamposOcultosRadioVenciProve=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoRadioVenciProve;
	public JButton jButtonModificarRadioVenciProve;
	public JButton jButtonActualizarRadioVenciProve;
    public JButton jButtonEliminarRadioVenciProve;
	public JButton jButtonCancelarRadioVenciProve;
    public JButton jButtonGuardarCambiosRadioVenciProve;
	public JButton jButtonGuardarCambiosTablaRadioVenciProve;
	protected JButton jButtonCerrarRadioVenciProve;
	
	
	protected JButton jButtonProcesarInformacionRadioVenciProve;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoRadioVenciProve;
	protected JCheckBox jCheckBoxPostAccionSinCerrarRadioVenciProve;
	protected JCheckBox jCheckBoxPostAccionSinMensajeRadioVenciProve;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRadioVenciProve;
	protected JButton jButtonModificarToolBarRadioVenciProve;
	protected JButton jButtonActualizarToolBarRadioVenciProve;
    protected JButton jButtonEliminarToolBarRadioVenciProve;
	protected JButton jButtonCancelarToolBarRadioVenciProve;
    protected JButton jButtonGuardarCambiosToolBarRadioVenciProve;
	protected JButton jButtonGuardarCambiosTablaToolBarRadioVenciProve;
	protected JButton jButtonMostrarOcultarTablaToolBarRadioVenciProve;
	protected JButton jButtonCerrarToolBarRadioVenciProve;
	
	protected JButton jButtonProcesarInformacionToolBarRadioVenciProve;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRadioVenciProve;
	protected JMenuItem jMenuItemModificarRadioVenciProve;
	protected JMenuItem jMenuItemActualizarRadioVenciProve;
    protected JMenuItem jMenuItemEliminarRadioVenciProve;
	protected JMenuItem jMenuItemCancelarRadioVenciProve;
    protected JMenuItem jMenuItemGuardarCambiosRadioVenciProve;
	protected JMenuItem jMenuItemGuardarCambiosTablaRadioVenciProve;
	protected JMenuItem jMenuItemCerrarRadioVenciProve;
	protected JMenuItem jMenuItemDetalleCerrarRadioVenciProve;
	protected JMenuItem jMenuItemDetalleMostarOcultarRadioVenciProve;
	
	protected JMenuItem jMenuItemProcesarInformacionRadioVenciProve;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRadioVenciProve;
	protected JMenuItem jMenuItemMostrarOcultarRadioVenciProve;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRadioVenciProve;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRadioVenciProve;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRadioVenciProve;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioRadioVenciProve;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidRadioVenciProve;
	public JLabel jLabelIdRadioVenciProve;
	public JLabel jLabelidRadioVenciProve;
	public JButton jButtonidRadioVenciProveBusqueda= new JButtonMe();

	public JPanel jPaneldia_desdeRadioVenciProve;
	public JLabel jLabeldia_desdeRadioVenciProve;
	public JTextField jTextFielddia_desdeRadioVenciProve;
	public JButton jButtondia_desdeRadioVenciProveBusqueda= new JButtonMe();

	public JPanel jPaneldia_hastaRadioVenciProve;
	public JLabel jLabeldia_hastaRadioVenciProve;
	public JTextField jTextFielddia_hastaRadioVenciProve;
	public JButton jButtondia_hastaRadioVenciProveBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaRadioVenciProve;
	public JLabel jLabelid_empresaRadioVenciProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaRadioVenciProve;
	public JButton jButtonid_empresaRadioVenciProve= new JButtonMe();
	public JButton jButtonid_empresaRadioVenciProveUpdate= new JButtonMe();
	public JButton jButtonid_empresaRadioVenciProveBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_radio_venciRadioVenciProve;
	public JLabel jLabelid_tipo_radio_venciRadioVenciProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_radio_venciRadioVenciProve;
	public JButton jButtonid_tipo_radio_venciRadioVenciProve= new JButtonMe();
	public JButton jButtonid_tipo_radio_venciRadioVenciProveUpdate= new JButtonMe();
	public JButton jButtonid_tipo_radio_venciRadioVenciProveBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesRadioVenciProve;
	
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
	
	public RadioVenciProveDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposRadioVenciProve=new JPanel();
				this.jPanelAccionesFormularioRadioVenciProve=new JPanel();
				this.jmenuBarDetalleRadioVenciProve=new JMenuBar();
				this.jTtoolBarDetalleRadioVenciProve=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RadioVenciProveDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("RadioVenciProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public RadioVenciProveDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("RadioVenciProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RadioVenciProveDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RadioVenciProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RadioVenciProveDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RadioVenciProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RadioVenciProveDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RadioVenciProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarRadioVenciProve() {
		return this.jButtonActualizarToolBarRadioVenciProve;
	}
	
	public JButton getjButtonEliminarToolBarRadioVenciProve() {
		return this.jButtonEliminarToolBarRadioVenciProve;
	}
	
	public JButton getjButtonCancelarToolBarRadioVenciProve() {
		return this.jButtonCancelarToolBarRadioVenciProve;
	}		
	
	public JButton getjButtonProcesarInformacionRadioVenciProve() {
		return this.jButtonProcesarInformacionRadioVenciProve;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRadioVenciProve)	{
		this.jButtonProcesarInformacionRadioVenciProve = jButtonProcesarInformacionRadioVenciProve;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRadioVenciProve() {
		return this.jComboBoxTiposAccionesRadioVenciProve;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRadioVenciProve(
			JComboBox jComboBoxTiposRelacionesRadioVenciProve) {
		this.jComboBoxTiposRelacionesRadioVenciProve = jComboBoxTiposRelacionesRadioVenciProve;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRadioVenciProve(
			JComboBox jComboBoxTiposAccionesRadioVenciProve) {
		this.jComboBoxTiposAccionesRadioVenciProve = jComboBoxTiposAccionesRadioVenciProve;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRadioVenciProve() {
		return this.jComboBoxTiposAccionesFormularioRadioVenciProve;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRadioVenciProve(
			JComboBox jComboBoxTiposAccionesFormularioRadioVenciProve) {
		this.jComboBoxTiposAccionesFormularioRadioVenciProve = jComboBoxTiposAccionesFormularioRadioVenciProve;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.radiovenciproveSessionBean=new RadioVenciProveSessionBean();
		
		this.radiovenciproveSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.radiovenciproveSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.radiovenciproveSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RadioVenciProveJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RadioVenciProveJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RadioVenciProveJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Dias Vencidos MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {
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
	
		RadioVenciProveJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleRadioVenciProve= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarRadioVenciProve=new JButtonMe();
				this.jButtonModificarToolBarRadioVenciProve=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarRadioVenciProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarRadioVenciProve,this.jTtoolBarDetalleRadioVenciProve,
							"actualizar","actualizar","Actualizar"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarRadioVenciProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarRadioVenciProve,this.jTtoolBarDetalleRadioVenciProve,
							"eliminar","eliminar","Eliminar"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarRadioVenciProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarRadioVenciProve,this.jTtoolBarDetalleRadioVenciProve,
							"cancelar","cancelar","Cancelar"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarRadioVenciProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarRadioVenciProve,this.jTtoolBarDetalleRadioVenciProve,
							"guardarcambios","guardarcambios","Guardar"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarRadioVenciProve,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarRadioVenciProve,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarRadioVenciProve,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleRadioVenciProve=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleRadioVenciProve=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoRadioVenciProve=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesRadioVenciProve=new JMenuMe("Acciones");
		this.jmenuDetalleDatosRadioVenciProve=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRadioVenciProve= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRadioVenciProve.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRadioVenciProve,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarRadioVenciProve= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarRadioVenciProve.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarRadioVenciProve,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarRadioVenciProve= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarRadioVenciProve.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarRadioVenciProve,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarRadioVenciProve= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarRadioVenciProve.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarRadioVenciProve,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarRadioVenciProve= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarRadioVenciProve.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarRadioVenciProve,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosRadioVenciProve= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRadioVenciProve.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRadioVenciProve,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRadioVenciProve= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRadioVenciProve.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRadioVenciProve,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarRadioVenciProve= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarRadioVenciProve.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarRadioVenciProve,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRadioVenciProve= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRadioVenciProve.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRadioVenciProve,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRadioVenciProve= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRadioVenciProve.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRadioVenciProve,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoRadioVenciProve.add(this.jMenuItemDetalleCerrarRadioVenciProve);
		
		this.jmenuDetalleAccionesRadioVenciProve.add(this.jMenuItemActualizarRadioVenciProve);
		this.jmenuDetalleAccionesRadioVenciProve.add(this.jMenuItemEliminarRadioVenciProve);
		this.jmenuDetalleAccionesRadioVenciProve.add(this.jMenuItemCancelarRadioVenciProve);		
		
		//this.jmenuDetalleDatosRadioVenciProve.add(this.jMenuItemDetalleAbrirOrderByRadioVenciProve);				
		this.jmenuDetalleDatosRadioVenciProve.add(this.jMenuItemDetalleMostarOcultarRadioVenciProve);				
				
		//this.jmenuDetalleAccionesRadioVenciProve.add(this.jMenuItemGuardarCambiosRadioVenciProve);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleRadioVenciProve.add(this.jmenuDetalleArchivoRadioVenciProve);		
		this.jmenuBarDetalleRadioVenciProve.add(this.jmenuDetalleAccionesRadioVenciProve);		
		this.jmenuBarDetalleRadioVenciProve.add(this.jmenuDetalleDatosRadioVenciProve);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleRadioVenciProve);				
	}
	
	
	public void inicializarElementosCamposRadioVenciProve() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdRadioVenciProve = new JLabelMe();
		jLabelIdRadioVenciProve.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdRadioVenciProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRadioVenciProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRadioVenciProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdRadioVenciProve,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidRadioVenciProve = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidRadioVenciProve.setToolTipText(RadioVenciProveConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutRadioVenciProve= new GridBagLayout();

		this.jPanelidRadioVenciProve.setLayout(this.gridaBagLayoutRadioVenciProve);

		jLabelidRadioVenciProve = new JLabel();
		jLabelidRadioVenciProve.setText("Id");

		jLabelidRadioVenciProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRadioVenciProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRadioVenciProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldia_desdeRadioVenciProve = new JLabelMe();
		this.jLabeldia_desdeRadioVenciProve.setText(""+RadioVenciProveConstantesFunciones.LABEL_DIADESDE+" : *");
		this.jLabeldia_desdeRadioVenciProve.setToolTipText("Dia Desde");
		this.jLabeldia_desdeRadioVenciProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_desdeRadioVenciProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_desdeRadioVenciProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldia_desdeRadioVenciProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldia_desdeRadioVenciProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldia_desdeRadioVenciProve.setToolTipText(RadioVenciProveConstantesFunciones.LABEL_DIADESDE);
		this.gridaBagLayoutRadioVenciProve = new GridBagLayout();
		this.jPaneldia_desdeRadioVenciProve.setLayout(this.gridaBagLayoutRadioVenciProve);


		jTextFielddia_desdeRadioVenciProve= new JTextFieldMe();
		jTextFielddia_desdeRadioVenciProve.setEnabled(false);
		jTextFielddia_desdeRadioVenciProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_desdeRadioVenciProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_desdeRadioVenciProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddia_desdeRadioVenciProve,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddia_desdeRadioVenciProve.setText("0");

		this.jButtondia_desdeRadioVenciProveBusqueda= new JButtonMe();
		this.jButtondia_desdeRadioVenciProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_desdeRadioVenciProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_desdeRadioVenciProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondia_desdeRadioVenciProveBusqueda.setText("U");
		this.jButtondia_desdeRadioVenciProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondia_desdeRadioVenciProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondia_desdeRadioVenciProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddia_desdeRadioVenciProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddia_desdeRadioVenciProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dia_desdeRadioVenciProveBusqueda"));

		if(this.radiovenciproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondia_desdeRadioVenciProveBusqueda.setVisible(false);		}


					
		this.jLabeldia_hastaRadioVenciProve = new JLabelMe();
		this.jLabeldia_hastaRadioVenciProve.setText(""+RadioVenciProveConstantesFunciones.LABEL_DIAHASTA+" : *");
		this.jLabeldia_hastaRadioVenciProve.setToolTipText("Dia Hasta");
		this.jLabeldia_hastaRadioVenciProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_hastaRadioVenciProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldia_hastaRadioVenciProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldia_hastaRadioVenciProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldia_hastaRadioVenciProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldia_hastaRadioVenciProve.setToolTipText(RadioVenciProveConstantesFunciones.LABEL_DIAHASTA);
		this.gridaBagLayoutRadioVenciProve = new GridBagLayout();
		this.jPaneldia_hastaRadioVenciProve.setLayout(this.gridaBagLayoutRadioVenciProve);


		jTextFielddia_hastaRadioVenciProve= new JTextFieldMe();
		jTextFielddia_hastaRadioVenciProve.setEnabled(false);
		jTextFielddia_hastaRadioVenciProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_hastaRadioVenciProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddia_hastaRadioVenciProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddia_hastaRadioVenciProve,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddia_hastaRadioVenciProve.setText("0");

		this.jButtondia_hastaRadioVenciProveBusqueda= new JButtonMe();
		this.jButtondia_hastaRadioVenciProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_hastaRadioVenciProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondia_hastaRadioVenciProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondia_hastaRadioVenciProveBusqueda.setText("U");
		this.jButtondia_hastaRadioVenciProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondia_hastaRadioVenciProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondia_hastaRadioVenciProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddia_hastaRadioVenciProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddia_hastaRadioVenciProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"dia_hastaRadioVenciProveBusqueda"));

		if(this.radiovenciproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondia_hastaRadioVenciProveBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysRadioVenciProve() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaRadioVenciProve = new JLabelMe();
		this.jLabelid_empresaRadioVenciProve.setText(""+RadioVenciProveConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaRadioVenciProve.setToolTipText("Empresa");
		this.jLabelid_empresaRadioVenciProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRadioVenciProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRadioVenciProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaRadioVenciProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaRadioVenciProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaRadioVenciProve.setToolTipText(RadioVenciProveConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutRadioVenciProve = new GridBagLayout();
		this.jPanelid_empresaRadioVenciProve.setLayout(this.gridaBagLayoutRadioVenciProve);


		jComboBoxid_empresaRadioVenciProve= new JComboBoxMe();
		jComboBoxid_empresaRadioVenciProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRadioVenciProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRadioVenciProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaRadioVenciProve,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaRadioVenciProve.setEnabled(false);

		this.jButtonid_empresaRadioVenciProve= new JButtonMe();
		this.jButtonid_empresaRadioVenciProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRadioVenciProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRadioVenciProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRadioVenciProve.setText("Buscar");
		this.jButtonid_empresaRadioVenciProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaRadioVenciProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRadioVenciProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaRadioVenciProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRadioVenciProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRadioVenciProve"));

		this.jButtonid_empresaRadioVenciProveBusqueda= new JButtonMe();
		this.jButtonid_empresaRadioVenciProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRadioVenciProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRadioVenciProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRadioVenciProveBusqueda.setText("U");
		this.jButtonid_empresaRadioVenciProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaRadioVenciProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRadioVenciProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaRadioVenciProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRadioVenciProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRadioVenciProveBusqueda"));

		if(this.radiovenciproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaRadioVenciProveBusqueda.setVisible(false);		}

		this.jButtonid_empresaRadioVenciProveUpdate= new JButtonMe();
		this.jButtonid_empresaRadioVenciProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRadioVenciProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRadioVenciProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRadioVenciProveUpdate.setText("U");
		this.jButtonid_empresaRadioVenciProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaRadioVenciProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRadioVenciProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaRadioVenciProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRadioVenciProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRadioVenciProveUpdate"));



					
		this.jLabelid_tipo_radio_venciRadioVenciProve = new JLabelMe();
		this.jLabelid_tipo_radio_venciRadioVenciProve.setText(""+RadioVenciProveConstantesFunciones.LABEL_IDTIPORADIOVENCI+" : *");
		this.jLabelid_tipo_radio_venciRadioVenciProve.setToolTipText("Tipo Radio Vencimiento");
		this.jLabelid_tipo_radio_venciRadioVenciProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_radio_venciRadioVenciProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_radio_venciRadioVenciProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_radio_venciRadioVenciProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_radio_venciRadioVenciProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_radio_venciRadioVenciProve.setToolTipText(RadioVenciProveConstantesFunciones.LABEL_IDTIPORADIOVENCI);
		this.gridaBagLayoutRadioVenciProve = new GridBagLayout();
		this.jPanelid_tipo_radio_venciRadioVenciProve.setLayout(this.gridaBagLayoutRadioVenciProve);


		jComboBoxid_tipo_radio_venciRadioVenciProve= new JComboBoxMe();
		jComboBoxid_tipo_radio_venciRadioVenciProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_radio_venciRadioVenciProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_radio_venciRadioVenciProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_radio_venciRadioVenciProve,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_radio_venciRadioVenciProve= new JButtonMe();
		this.jButtonid_tipo_radio_venciRadioVenciProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_radio_venciRadioVenciProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_radio_venciRadioVenciProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_radio_venciRadioVenciProve.setText("Buscar");
		this.jButtonid_tipo_radio_venciRadioVenciProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_radio_venciRadioVenciProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_radio_venciRadioVenciProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_radio_venciRadioVenciProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_radio_venciRadioVenciProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_radio_venciRadioVenciProve"));

		this.jButtonid_tipo_radio_venciRadioVenciProveBusqueda= new JButtonMe();
		this.jButtonid_tipo_radio_venciRadioVenciProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_radio_venciRadioVenciProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_radio_venciRadioVenciProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_radio_venciRadioVenciProveBusqueda.setText("U");
		this.jButtonid_tipo_radio_venciRadioVenciProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_radio_venciRadioVenciProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_radio_venciRadioVenciProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_radio_venciRadioVenciProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_radio_venciRadioVenciProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_radio_venciRadioVenciProveBusqueda"));

		if(this.radiovenciproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_radio_venciRadioVenciProveBusqueda.setVisible(false);		}

		this.jButtonid_tipo_radio_venciRadioVenciProveUpdate= new JButtonMe();
		this.jButtonid_tipo_radio_venciRadioVenciProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_radio_venciRadioVenciProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_radio_venciRadioVenciProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_radio_venciRadioVenciProveUpdate.setText("U");
		this.jButtonid_tipo_radio_venciRadioVenciProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_radio_venciRadioVenciProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_radio_venciRadioVenciProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_radio_venciRadioVenciProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_radio_venciRadioVenciProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_radio_venciRadioVenciProveUpdate"));



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
		//this.jInternalFrameDetalleRadioVenciProve = new RadioVenciProveBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Dias Vencidos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRadioVenciProve= new GridBagLayout();
		

		
		String sToolTipRadioVenciProve="";
		sToolTipRadioVenciProve=RadioVenciProveConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRadioVenciProve+="(Cartera.RadioVenciProve)";
		}
		
		if(!this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {
			sToolTipRadioVenciProve+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoRadioVenciProve = new JButtonMe();
		this.jButtonModificarRadioVenciProve = new JButtonMe();
        this.jButtonActualizarRadioVenciProve = new JButtonMe();
        this.jButtonEliminarRadioVenciProve = new JButtonMe();
        this.jButtonCancelarRadioVenciProve = new JButtonMe();
        this.jButtonGuardarCambiosRadioVenciProve = new JButtonMe();
		this.jButtonGuardarCambiosTablaRadioVenciProve = new JButtonMe();
		this.jButtonCerrarRadioVenciProve = new JButtonMe();
		
		this.jScrollPanelDatosRadioVenciProve = new JScrollPane();   
        this.jScrollPanelDatosEdicionRadioVenciProve = new JScrollPane();
		this.jScrollPanelDatosGeneralRadioVenciProve = new JScrollPane();
				
		
		
		this.jPanelCamposRadioVenciProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosRadioVenciProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesRadioVenciProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioRadioVenciProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Dias Vencidos";
		
		if(!this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRadioVenciProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Dias Vencidoss" + this.sPath));
		} else {
			this.jScrollPanelDatosRadioVenciProve.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionRadioVenciProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralRadioVenciProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposRadioVenciProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposRadioVenciProve.setName("jPanelCamposRadioVenciProve"); 

		this.jPanelCamposOcultosRadioVenciProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosRadioVenciProve.setName("jPanelCamposOcultosRadioVenciProve"); 

        this.jPanelAccionesRadioVenciProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRadioVenciProve.setToolTipText("Acciones");
        this.jPanelAccionesRadioVenciProve.setName("Acciones"); 

		this.jPanelAccionesFormularioRadioVenciProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioRadioVenciProve.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRadioVenciProve.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionRadioVenciProve, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRadioVenciProve, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRadioVenciProve, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposRadioVenciProve, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosRadioVenciProve, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioRadioVenciProve, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoRadioVenciProve.setText("Nuevo");
		this.jButtonModificarRadioVenciProve.setText("Editar");
        this.jButtonActualizarRadioVenciProve.setText("Actualizar");
        this.jButtonEliminarRadioVenciProve.setText("Eliminar");
        this.jButtonCancelarRadioVenciProve.setText("Cancelar");
        this.jButtonGuardarCambiosRadioVenciProve.setText("Guardar");
		this.jButtonGuardarCambiosTablaRadioVenciProve.setText("Guardar");
		this.jButtonCerrarRadioVenciProve.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRadioVenciProve,"nuevo_button","Nuevo",this.radiovenciproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarRadioVenciProve,"modificar_button","Editar",this.radiovenciproveSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarRadioVenciProve,"actualizar_button","Actualizar",this.radiovenciproveSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarRadioVenciProve,"eliminar_button","Eliminar",this.radiovenciproveSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarRadioVenciProve,"cancelar_button","Cancelar",this.radiovenciproveSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosRadioVenciProve,"guardarcambios_button","Guardar",this.radiovenciproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRadioVenciProve,"guardarcambiostabla_button","Guardar",this.radiovenciproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRadioVenciProve,"cerrar_button","Salir",this.radiovenciproveSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarRadioVenciProve, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarRadioVenciProve, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarRadioVenciProve, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoRadioVenciProve.setToolTipText("Nuevo"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarRadioVenciProve.setToolTipText("Editar"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarRadioVenciProve.setToolTipText("Actualizar"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarRadioVenciProve.setToolTipText("Eliminar)"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarRadioVenciProve.setToolTipText("Cancelar"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosRadioVenciProve.setToolTipText("Guardar"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaRadioVenciProve.setToolTipText("Guardar"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRadioVenciProve.setToolTipText("Salir"+" "+RadioVenciProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRadioVenciProve";
		inputMap = this.jButtonNuevoRadioVenciProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRadioVenciProve.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRadioVenciProve"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarRadioVenciProve";
		inputMap = this.jButtonActualizarRadioVenciProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarRadioVenciProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarRadioVenciProve"));
		
		//ELIMINAR
		sMapKey = "EliminarRadioVenciProve";
		inputMap = this.jButtonEliminarRadioVenciProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarRadioVenciProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarRadioVenciProve"));
		
		//CANCELAR	
		sMapKey = "CancelarRadioVenciProve";
		inputMap = this.jButtonCancelarRadioVenciProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarRadioVenciProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarRadioVenciProve"));
		
		//CERRAR		
		sMapKey = "CerrarRadioVenciProve";
		inputMap = this.jButtonCerrarRadioVenciProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRadioVenciProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRadioVenciProve"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRadioVenciProve";
		inputMap = this.jButtonGuardarCambiosTablaRadioVenciProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRadioVenciProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRadioVenciProve"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoRadioVenciProve = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoRadioVenciProve.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoRadioVenciProve.setToolTipText("Nuevo RadioVenciProve");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoRadioVenciProve, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarRadioVenciProve = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarRadioVenciProve.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarRadioVenciProve.setToolTipText("Sin Cerrar Ventana RadioVenciProve");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarRadioVenciProve, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeRadioVenciProve = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeRadioVenciProve.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeRadioVenciProve.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeRadioVenciProve, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesRadioVenciProve = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRadioVenciProve.setText("Accion");
		this.jComboBoxTiposAccionesRadioVenciProve.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioRadioVenciProve = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRadioVenciProve.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioRadioVenciProve.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesRadioVenciProve = new JLabelMe();
		
		this.jLabelAccionesRadioVenciProve.setText("Acciones");		
		this.jLabelAccionesRadioVenciProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRadioVenciProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRadioVenciProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposRadioVenciProve();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysRadioVenciProve();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesRadioVenciProve=new JTabbedPane();
		this.jTabbedPaneRelacionesRadioVenciProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesRadioVenciProve,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesRadioVenciProve.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRadioVenciProve.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRadioVenciProve.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRadioVenciProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioRadioVenciProve.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRadioVenciProve.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRadioVenciProve.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRadioVenciProve, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposRadioVenciProve = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosRadioVenciProve = new GridBagLayout();
		
		this.jPanelCamposRadioVenciProve.setLayout(gridaBagLayoutCamposRadioVenciProve);
		this.jPanelCamposOcultosRadioVenciProve.setLayout(gridaBagLayoutCamposOcultosRadioVenciProve);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRadioVenciProve.gridy = 0;
	this.gridBagConstraintsRadioVenciProve.gridx = 0;
	this.gridBagConstraintsRadioVenciProve.ipadx = 0;
	this.gridBagConstraintsRadioVenciProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidRadioVenciProve.add(jLabelIdRadioVenciProve, this.gridBagConstraintsRadioVenciProve);



	this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRadioVenciProve.gridy = 0;
	this.gridBagConstraintsRadioVenciProve.gridx = 1;
	this.gridBagConstraintsRadioVenciProve.ipadx = 0;
	this.gridBagConstraintsRadioVenciProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidRadioVenciProve.add(jLabelidRadioVenciProve, this.gridBagConstraintsRadioVenciProve);


	this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRadioVenciProve.gridy = 0;
	this.gridBagConstraintsRadioVenciProve.gridx = 0;
	this.gridBagConstraintsRadioVenciProve.ipadx = 0;
	this.gridBagConstraintsRadioVenciProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaRadioVenciProve.add(jLabelid_empresaRadioVenciProve, this.gridBagConstraintsRadioVenciProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		//this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRadioVenciProve.gridy = 0;
		this.gridBagConstraintsRadioVenciProve.gridx = 2;
		this.gridBagConstraintsRadioVenciProve.ipadx = 0;
		this.gridBagConstraintsRadioVenciProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRadioVenciProve.add(jButtonid_empresaRadioVenciProveBusqueda, this.gridBagConstraintsRadioVenciProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		//this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRadioVenciProve.gridy = 0;
		this.gridBagConstraintsRadioVenciProve.gridx = 3;
		this.gridBagConstraintsRadioVenciProve.ipadx = 0;
		this.gridBagConstraintsRadioVenciProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRadioVenciProve.add(jButtonid_empresaRadioVenciProveUpdate, this.gridBagConstraintsRadioVenciProve);
	}

	this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRadioVenciProve.gridy = 0;
	this.gridBagConstraintsRadioVenciProve.gridx = 1;
	this.gridBagConstraintsRadioVenciProve.ipadx = 0;
	this.gridBagConstraintsRadioVenciProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaRadioVenciProve.add(jComboBoxid_empresaRadioVenciProve, this.gridBagConstraintsRadioVenciProve);


	this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRadioVenciProve.gridy = 0;
	this.gridBagConstraintsRadioVenciProve.gridx = 0;
	this.gridBagConstraintsRadioVenciProve.ipadx = 0;
	this.gridBagConstraintsRadioVenciProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_radio_venciRadioVenciProve.add(jLabelid_tipo_radio_venciRadioVenciProve, this.gridBagConstraintsRadioVenciProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		//this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRadioVenciProve.gridy = 0;
		this.gridBagConstraintsRadioVenciProve.gridx = 2;
		this.gridBagConstraintsRadioVenciProve.ipadx = 0;
		this.gridBagConstraintsRadioVenciProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_radio_venciRadioVenciProve.add(jButtonid_tipo_radio_venciRadioVenciProveBusqueda, this.gridBagConstraintsRadioVenciProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		//this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRadioVenciProve.gridy = 0;
		this.gridBagConstraintsRadioVenciProve.gridx = 3;
		this.gridBagConstraintsRadioVenciProve.ipadx = 0;
		this.gridBagConstraintsRadioVenciProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_radio_venciRadioVenciProve.add(jButtonid_tipo_radio_venciRadioVenciProveUpdate, this.gridBagConstraintsRadioVenciProve);
	}

	this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRadioVenciProve.gridy = 0;
	this.gridBagConstraintsRadioVenciProve.gridx = 1;
	this.gridBagConstraintsRadioVenciProve.ipadx = 0;
	this.gridBagConstraintsRadioVenciProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_radio_venciRadioVenciProve.add(jComboBoxid_tipo_radio_venciRadioVenciProve, this.gridBagConstraintsRadioVenciProve);


	this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRadioVenciProve.gridy = 0;
	this.gridBagConstraintsRadioVenciProve.gridx = 0;
	this.gridBagConstraintsRadioVenciProve.ipadx = 0;
	this.gridBagConstraintsRadioVenciProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldia_desdeRadioVenciProve.add(jLabeldia_desdeRadioVenciProve, this.gridBagConstraintsRadioVenciProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		//this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRadioVenciProve.gridy = 0;
		this.gridBagConstraintsRadioVenciProve.gridx = 2;
		this.gridBagConstraintsRadioVenciProve.ipadx = 0;
		this.gridBagConstraintsRadioVenciProve.insets = new Insets(0, 0, 0, 0);
		this.jPaneldia_desdeRadioVenciProve.add(jButtondia_desdeRadioVenciProveBusqueda, this.gridBagConstraintsRadioVenciProve);
	}

	this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRadioVenciProve.gridy = 0;
	this.gridBagConstraintsRadioVenciProve.gridx = 1;
	this.gridBagConstraintsRadioVenciProve.ipadx = 0;
	this.gridBagConstraintsRadioVenciProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldia_desdeRadioVenciProve.add(jTextFielddia_desdeRadioVenciProve, this.gridBagConstraintsRadioVenciProve);


	this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRadioVenciProve.gridy = 0;
	this.gridBagConstraintsRadioVenciProve.gridx = 0;
	this.gridBagConstraintsRadioVenciProve.ipadx = 0;
	this.gridBagConstraintsRadioVenciProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldia_hastaRadioVenciProve.add(jLabeldia_hastaRadioVenciProve, this.gridBagConstraintsRadioVenciProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		//this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRadioVenciProve.gridy = 0;
		this.gridBagConstraintsRadioVenciProve.gridx = 2;
		this.gridBagConstraintsRadioVenciProve.ipadx = 0;
		this.gridBagConstraintsRadioVenciProve.insets = new Insets(0, 0, 0, 0);
		this.jPaneldia_hastaRadioVenciProve.add(jButtondia_hastaRadioVenciProveBusqueda, this.gridBagConstraintsRadioVenciProve);
	}

	this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRadioVenciProve.gridy = 0;
	this.gridBagConstraintsRadioVenciProve.gridx = 1;
	this.gridBagConstraintsRadioVenciProve.ipadx = 0;
	this.gridBagConstraintsRadioVenciProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldia_hastaRadioVenciProve.add(jTextFielddia_hastaRadioVenciProve, this.gridBagConstraintsRadioVenciProve);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRadioVenciProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRadioVenciProve.gridy = iYPanelCamposRadioVenciProve;
	this.gridBagConstraintsRadioVenciProve.gridx = iXPanelCamposRadioVenciProve++;
	this.gridBagConstraintsRadioVenciProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRadioVenciProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRadioVenciProve.add(this.jPanelidRadioVenciProve, this.gridBagConstraintsRadioVenciProve);



	if(iXPanelCamposRadioVenciProve % 1==0) {
		iXPanelCamposRadioVenciProve=0;
		iYPanelCamposRadioVenciProve++;
	}
	this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRadioVenciProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRadioVenciProve.gridy = iYPanelCamposRadioVenciProve;
	this.gridBagConstraintsRadioVenciProve.gridx = iXPanelCamposRadioVenciProve++;
	this.gridBagConstraintsRadioVenciProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRadioVenciProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRadioVenciProve.add(this.jPanelid_tipo_radio_venciRadioVenciProve, this.gridBagConstraintsRadioVenciProve);



	if(iXPanelCamposRadioVenciProve % 1==0) {
		iXPanelCamposRadioVenciProve=0;
		iYPanelCamposRadioVenciProve++;
	}
	this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRadioVenciProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRadioVenciProve.gridy = iYPanelCamposRadioVenciProve;
	this.gridBagConstraintsRadioVenciProve.gridx = iXPanelCamposRadioVenciProve++;
	this.gridBagConstraintsRadioVenciProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRadioVenciProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRadioVenciProve.add(this.jPaneldia_desdeRadioVenciProve, this.gridBagConstraintsRadioVenciProve);



	if(iXPanelCamposRadioVenciProve % 1==0) {
		iXPanelCamposRadioVenciProve=0;
		iYPanelCamposRadioVenciProve++;
	}
	this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRadioVenciProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRadioVenciProve.gridy = iYPanelCamposRadioVenciProve;
	this.gridBagConstraintsRadioVenciProve.gridx = iXPanelCamposRadioVenciProve++;
	this.gridBagConstraintsRadioVenciProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRadioVenciProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRadioVenciProve.add(this.jPaneldia_hastaRadioVenciProve, this.gridBagConstraintsRadioVenciProve);



	if(iXPanelCamposRadioVenciProve % 1==0) {
		iXPanelCamposRadioVenciProve=0;
		iYPanelCamposRadioVenciProve++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
	this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRadioVenciProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRadioVenciProve.gridy = iYPanelCamposOcultosRadioVenciProve;
	this.gridBagConstraintsRadioVenciProve.gridx = iXPanelCamposOcultosRadioVenciProve++;
	this.gridBagConstraintsRadioVenciProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRadioVenciProve.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRadioVenciProve.add(this.jPanelid_empresaRadioVenciProve, this.gridBagConstraintsRadioVenciProve);



	if(iXPanelCamposOcultosRadioVenciProve % 1==0) {
		iXPanelCamposOcultosRadioVenciProve=0;
		iYPanelCamposOcultosRadioVenciProve++;
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
			
		GridBagLayout gridaBagLayoutAccionesRadioVenciProve= new GridBagLayout();
		this.jPanelAccionesRadioVenciProve.setLayout(gridaBagLayoutAccionesRadioVenciProve);
		
		GridBagLayout gridaBagLayoutAccionesFormularioRadioVenciProve= new GridBagLayout();
		this.jPanelAccionesFormularioRadioVenciProve.setLayout(gridaBagLayoutAccionesFormularioRadioVenciProve);
		
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRadioVenciProve.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRadioVenciProve.add(this.jComboBoxTiposAccionesFormularioRadioVenciProve, this.gridBagConstraintsRadioVenciProve);

		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRadioVenciProve.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRadioVenciProve.add(this.jCheckBoxPostAccionNuevoRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.radiovenciproveSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRadioVenciProve.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRadioVenciProve.add(this.jCheckBoxPostAccionSinCerrarRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.radiovenciproveSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.radiovenciproveSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRadioVenciProve.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRadioVenciProve.add(this.jCheckBoxPostAccionSinMensajeRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRadioVenciProve.gridy = 0;
		this.gridBagConstraintsRadioVenciProve.gridx = iPosXAccion++;
			
		this.jPanelAccionesRadioVenciProve.add(this.jButtonModificarRadioVenciProve, this.gridBagConstraintsRadioVenciProve);							

		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRadioVenciProve.gridy = 0;
		this.gridBagConstraintsRadioVenciProve.gridx =iPosXAccion++;
			
		this.jPanelAccionesRadioVenciProve.add(this.jButtonEliminarRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
		
			
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.gridy = 0;		
		this.gridBagConstraintsRadioVenciProve.gridx = iPosXAccion++;
		
		this.jPanelAccionesRadioVenciProve.add(this.jButtonActualizarRadioVenciProve, this.gridBagConstraintsRadioVenciProve);


		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.gridy = 0;		
		this.gridBagConstraintsRadioVenciProve.gridx = iPosXAccion++;
		
		this.jPanelAccionesRadioVenciProve.add(this.jButtonGuardarCambiosRadioVenciProve, this.gridBagConstraintsRadioVenciProve);	
		
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.gridy = 0;		
		this.gridBagConstraintsRadioVenciProve.gridx =iPosXAccion++;
		
		this.jPanelAccionesRadioVenciProve.add(this.jButtonCancelarRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRadioVenciProve = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRadioVenciProve);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.radiovenciproveSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();						
			this.gridBagConstraintsRadioVenciProve.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRadioVenciProve.gridx = 0;		
			//this.gridBagConstraintsRadioVenciProve.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRadioVenciProve.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRadioVenciProve.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRadioVenciProve.gridx =0;
		this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRadioVenciProve.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(RadioVenciProveJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleRadioVenciProve = new RadioVenciProveBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Dias Vencidos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Dias Vencidos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Dias Vencidos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			RadioVenciProveModel radiovenciproveModel=new RadioVenciProveModel(this);
			
			//SI USARA CLASE INTERNA
			//RadioVenciProveModel.RadioVenciProveFocusTraversalPolicy radiovenciproveFocusTraversalPolicy = radiovenciproveModel.new RadioVenciProveFocusTraversalPolicy(this);
			
			//radiovenciproveFocusTraversalPolicy.setradiovenciproveJInternalFrame(this);
			
			this.setFocusTraversalPolicy(radiovenciproveModel);
			
			
			this.jContentPaneDetalleRadioVenciProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleRadioVenciProve = new GridBagLayout();	
			this.jContentPaneDetalleRadioVenciProve.setLayout(gridaBagLayoutDetalleRadioVenciProve);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRadioVenciProve = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
				this.gridBagConstraintsRadioVenciProve.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsRadioVenciProve.gridx = 0;
					
				
				this.jContentPaneDetalleRadioVenciProve.add(jTtoolBarDetalleRadioVenciProve, gridBagConstraintsRadioVenciProve);								
				
}
			
			this.jScrollPanelDatosEdicionRadioVenciProve=   new JScrollPane(jContentPaneDetalleRadioVenciProve,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRadioVenciProve.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRadioVenciProve.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRadioVenciProve.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralRadioVenciProve=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRadioVenciProve.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRadioVenciProve.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRadioVenciProve.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			
			
	        this.gridBagConstraintsRadioVenciProve.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsRadioVenciProve.gridx = 0;
	        
			this.jContentPaneDetalleRadioVenciProve.add(jPanelCamposRadioVenciProve, gridBagConstraintsRadioVenciProve);
			
			
			
			
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
						&& radiovenciproveSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.radiovenciproveSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsRadioVenciProve= new GridBagConstraints();
						this.gridBagConstraintsRadioVenciProve.gridy = iGridyRelaciones++;
						this.gridBagConstraintsRadioVenciProve.gridx = 0;
						this.jContentPaneDetalleRadioVenciProve.add(this.jTabbedPaneRelacionesRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesRadioVenciProve.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosRadioVenciProve.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
					this.gridBagConstraintsRadioVenciProve.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsRadioVenciProve.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsRadioVenciProve.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsRadioVenciProve.gridx = 0;
					
				
					this.jContentPaneDetalleRadioVenciProve.add(jPanelCamposOcultosRadioVenciProve, gridBagConstraintsRadioVenciProve);
				
					this.jPanelCamposOcultosRadioVenciProve.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsRadioVenciProve.gridx = 0;
	        this.gridBagConstraintsRadioVenciProve.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleRadioVenciProve.add(this.jPanelAccionesFormularioRadioVenciProve, this.gridBagConstraintsRadioVenciProve);							
			
			
			
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
	        this.gridBagConstraintsRadioVenciProve.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsRadioVenciProve.gridx = 0;
	        
			
			this.jContentPaneDetalleRadioVenciProve.add(this.jPanelAccionesRadioVenciProve, this.gridBagConstraintsRadioVenciProve);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionRadioVenciProve);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionRadioVenciProve=   new JScrollPane(this.jPanelCamposRadioVenciProve,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRadioVenciProve.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRadioVenciProve.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRadioVenciProve.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsRadioVenciProve.gridx = 0;
			this.gridBagConstraintsRadioVenciProve.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsRadioVenciProve.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsRadioVenciProve.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRadioVenciProve.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioRadioVenciProve, this.gridBagConstraintsRadioVenciProve);			
			
			this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
			this.gridBagConstraintsRadioVenciProve.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRadioVenciProve.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesRadioVenciProve, this.gridBagConstraintsRadioVenciProve);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRadioVenciProve.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
			
			
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRadioVenciProve.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
		
			
		this.gridBagConstraintsRadioVenciProve = new GridBagConstraints();
		this.gridBagConstraintsRadioVenciProve.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRadioVenciProve.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRadioVenciProve, this.gridBagConstraintsRadioVenciProve);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralRadioVenciProve;//jContentPane;
		
		return jScrollPanelDatosEdicionRadioVenciProve;
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
