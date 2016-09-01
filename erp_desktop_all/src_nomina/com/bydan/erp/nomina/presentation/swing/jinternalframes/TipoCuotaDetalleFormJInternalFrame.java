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

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.util.TipoCuotaConstantesFunciones;

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
public class TipoCuotaDetalleFormJInternalFrame extends TipoCuotaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoCuota;
	
	protected JMenuBar jmenuBarDetalleTipoCuota;
	
	protected JMenu jmenuDetalleTipoCuota;
	protected JMenu jmenuDetalleArchivoTipoCuota;
	protected JMenu jmenuDetalleAccionesTipoCuota;
	protected JMenu jmenuDetalleDatosTipoCuota;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCuota;	
	protected GridBagConstraints gridBagConstraintsTipoCuota;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoCuotaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoCuota;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoCuotaSessionBean tipocuotaSessionBean;
	
	

	public PrestamoBeanSwingJInternalFrame prestamoBeanSwingJInternalFrame=null;
	public PrestamoBeanSwingJInternalFrame prestamoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePrestamo=false;
	public PrestamoSessionBean prestamoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoCuotaLogic tipocuotaLogic;
	
	public JScrollPane jScrollPanelDatosTipoCuota;
	public JScrollPane jScrollPanelDatosEdicionTipoCuota;
	public JScrollPane jScrollPanelDatosGeneralTipoCuota;
	
	protected JPanel jPanelCamposTipoCuota;    
	protected JPanel jPanelCamposOcultosTipoCuota;    	
	protected JPanel jPanelAccionesTipoCuota;
	protected JPanel jPanelAccionesFormularioTipoCuota;
    
	
	
	protected Integer iXPanelCamposTipoCuota=0;
	protected Integer iYPanelCamposTipoCuota=0;
	
	protected Integer iXPanelCamposOcultosTipoCuota=0;
	protected Integer iYPanelCamposOcultosTipoCuota=0;
	
	;
	
	protected JTabbedPane jTabbedPaneRelacionesFinformas_de_pagoTipoCuota;
	protected JButton jButtonRelacionesFinformas_de_pagoTipoCuota;
	protected JPanel jPanelAccionesRelacionesFinTipoCuota;
	protected JButton jButtonRelacionesFinNormalTipoCuota;
	Integer iPosXAccionesRelacionesFin=0;;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoCuota;
	public JButton jButtonModificarTipoCuota;
	public JButton jButtonActualizarTipoCuota;
    public JButton jButtonEliminarTipoCuota;
	public JButton jButtonCancelarTipoCuota;
    public JButton jButtonGuardarCambiosTipoCuota;
	public JButton jButtonGuardarCambiosTablaTipoCuota;
	protected JButton jButtonCerrarTipoCuota;
	
	
	protected JButton jButtonProcesarInformacionTipoCuota;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoCuota;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoCuota;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoCuota;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCuota;
	protected JButton jButtonModificarToolBarTipoCuota;
	protected JButton jButtonActualizarToolBarTipoCuota;
    protected JButton jButtonEliminarToolBarTipoCuota;
	protected JButton jButtonCancelarToolBarTipoCuota;
    protected JButton jButtonGuardarCambiosToolBarTipoCuota;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoCuota;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCuota;
	protected JButton jButtonCerrarToolBarTipoCuota;
	
	protected JButton jButtonProcesarInformacionToolBarTipoCuota;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCuota;
	protected JMenuItem jMenuItemModificarTipoCuota;
	protected JMenuItem jMenuItemActualizarTipoCuota;
    protected JMenuItem jMenuItemEliminarTipoCuota;
	protected JMenuItem jMenuItemCancelarTipoCuota;
    protected JMenuItem jMenuItemGuardarCambiosTipoCuota;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCuota;
	protected JMenuItem jMenuItemCerrarTipoCuota;
	protected JMenuItem jMenuItemDetalleCerrarTipoCuota;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCuota;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoCuota;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCuota;
	protected JMenuItem jMenuItemMostrarOcultarTipoCuota;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCuota;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCuota;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCuota;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoCuota;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoCuota;
	public JLabel jLabelIdTipoCuota;
	public JLabel jLabelidTipoCuota;
	public JButton jButtonidTipoCuotaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoCuota;
	public JLabel jLabelcodigoTipoCuota;
	public JTextField jTextFieldcodigoTipoCuota;
	public JButton jButtoncodigoTipoCuotaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoCuota;
	public JLabel jLabelnombreTipoCuota;
	public JTextArea jTextAreanombreTipoCuota;
	public JScrollPane jscrollPanenombreTipoCuota;
	public JButton jButtonnombreTipoCuotaBusqueda= new JButtonMe();

	public JPanel jPaneles_proveTipoCuota;
	public JLabel jLabeles_proveTipoCuota;
	public JCheckBox jCheckBoxes_proveTipoCuota;
	public JButton jButtones_proveTipoCuotaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoCuota;
	public JLabel jLabelid_empresaTipoCuota;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoCuota;
	public JButton jButtonid_empresaTipoCuota= new JButtonMe();
	public JButton jButtonid_empresaTipoCuotaUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoCuotaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoCuota;
	
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
	public int iHeightFormulario=462;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoCuotaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoCuota=new JPanel();
				this.jPanelAccionesFormularioTipoCuota=new JPanel();
				this.jmenuBarDetalleTipoCuota=new JMenuBar();
				this.jTtoolBarDetalleTipoCuota=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuotaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoCuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoCuotaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoCuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuotaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuotaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuotaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCuota No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoCuota() {
		return this.jButtonActualizarToolBarTipoCuota;
	}
	
	public JButton getjButtonEliminarToolBarTipoCuota() {
		return this.jButtonEliminarToolBarTipoCuota;
	}
	
	public JButton getjButtonCancelarToolBarTipoCuota() {
		return this.jButtonCancelarToolBarTipoCuota;
	}		
	
	public JButton getjButtonProcesarInformacionTipoCuota() {
		return this.jButtonProcesarInformacionTipoCuota;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCuota)	{
		this.jButtonProcesarInformacionTipoCuota = jButtonProcesarInformacionTipoCuota;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCuota() {
		return this.jComboBoxTiposAccionesTipoCuota;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCuota(
			JComboBox jComboBoxTiposRelacionesTipoCuota) {
		this.jComboBoxTiposRelacionesTipoCuota = jComboBoxTiposRelacionesTipoCuota;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCuota(
			JComboBox jComboBoxTiposAccionesTipoCuota) {
		this.jComboBoxTiposAccionesTipoCuota = jComboBoxTiposAccionesTipoCuota;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoCuota() {
		return this.jComboBoxTiposAccionesFormularioTipoCuota;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoCuota(
			JComboBox jComboBoxTiposAccionesFormularioTipoCuota) {
		this.jComboBoxTiposAccionesFormularioTipoCuota = jComboBoxTiposAccionesFormularioTipoCuota;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipocuotaSessionBean=new TipoCuotaSessionBean();
		
		this.tipocuotaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocuotaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocuotaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.prestamoSessionBean=new PrestamoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCuotaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCuotaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCuotaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Cuota MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipocuotaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoCuotaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoCuota= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoCuota=new JButtonMe();
				this.jButtonModificarToolBarTipoCuota=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoCuota,this.jTtoolBarDetalleTipoCuota,
							"actualizar","actualizar","Actualizar"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoCuota,this.jTtoolBarDetalleTipoCuota,
							"eliminar","eliminar","Eliminar"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoCuota,this.jTtoolBarDetalleTipoCuota,
							"cancelar","cancelar","Cancelar"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoCuota=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoCuota,this.jTtoolBarDetalleTipoCuota,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoCuota,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoCuota,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoCuota,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoCuota=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoCuota=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoCuota=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoCuota=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoCuota=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCuota= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCuota.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCuota,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoCuota= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoCuota.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoCuota,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoCuota= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoCuota.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoCuota,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoCuota= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoCuota.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoCuota,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoCuota= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoCuota.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoCuota,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoCuota= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCuota.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCuota,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCuota= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCuota.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCuota,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoCuota= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoCuota.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoCuota,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCuota= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCuota.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCuota,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCuota= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCuota.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCuota,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoCuota.add(this.jMenuItemDetalleCerrarTipoCuota);
		
		this.jmenuDetalleAccionesTipoCuota.add(this.jMenuItemActualizarTipoCuota);
		this.jmenuDetalleAccionesTipoCuota.add(this.jMenuItemEliminarTipoCuota);
		this.jmenuDetalleAccionesTipoCuota.add(this.jMenuItemCancelarTipoCuota);		
		
		//this.jmenuDetalleDatosTipoCuota.add(this.jMenuItemDetalleAbrirOrderByTipoCuota);				
		this.jmenuDetalleDatosTipoCuota.add(this.jMenuItemDetalleMostarOcultarTipoCuota);				
				
		//this.jmenuDetalleAccionesTipoCuota.add(this.jMenuItemGuardarCambiosTipoCuota);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoCuota.add(this.jmenuDetalleArchivoTipoCuota);		
		this.jmenuBarDetalleTipoCuota.add(this.jmenuDetalleAccionesTipoCuota);		
		this.jmenuBarDetalleTipoCuota.add(this.jmenuDetalleDatosTipoCuota);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoCuota.add(this.jmenuDetalleTipoCuota);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoCuota);				
	}
	
	
	public void inicializarElementosCamposTipoCuota() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoCuota = new JLabelMe();
		jLabelIdTipoCuota.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoCuota = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoCuota.setToolTipText(TipoCuotaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoCuota= new GridBagLayout();

		this.jPanelidTipoCuota.setLayout(this.gridaBagLayoutTipoCuota);

		jLabelidTipoCuota = new JLabel();
		jLabelidTipoCuota.setText("Id");

		jLabelidTipoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoCuota = new JLabelMe();
		this.jLabelcodigoTipoCuota.setText(""+TipoCuotaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoCuota.setToolTipText("Codigo");
		this.jLabelcodigoTipoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoCuota=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoCuota.setToolTipText(TipoCuotaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoCuota = new GridBagLayout();
		this.jPanelcodigoTipoCuota.setLayout(this.gridaBagLayoutTipoCuota);


		jTextFieldcodigoTipoCuota= new JTextFieldMe();

		jTextFieldcodigoTipoCuota.setEnabled(false);
		jTextFieldcodigoTipoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoCuotaBusqueda= new JButtonMe();
		this.jButtoncodigoTipoCuotaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCuotaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoCuotaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoCuotaBusqueda.setText("U");
		this.jButtoncodigoTipoCuotaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoCuotaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoCuotaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoCuotaBusqueda"));

		if(this.tipocuotaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoCuotaBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoCuota = new JLabelMe();
		this.jLabelnombreTipoCuota.setText(""+TipoCuotaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoCuota.setToolTipText("Nombre");
		this.jLabelnombreTipoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoCuota=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoCuota.setToolTipText(TipoCuotaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoCuota = new GridBagLayout();
		this.jPanelnombreTipoCuota.setLayout(this.gridaBagLayoutTipoCuota);


		jTextAreanombreTipoCuota= new JTextAreaMe();
		jTextAreanombreTipoCuota.setEnabled(false);
		jTextAreanombreTipoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCuota.setLineWrap(true);
		jTextAreanombreTipoCuota.setWrapStyleWord(true);
		jTextAreanombreTipoCuota.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoCuota.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoCuota = new JScrollPane(jTextAreanombreTipoCuota);
		jscrollPanenombreTipoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoCuotaBusqueda= new JButtonMe();
		this.jButtonnombreTipoCuotaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCuotaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCuotaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoCuotaBusqueda.setText("U");
		this.jButtonnombreTipoCuotaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoCuotaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoCuotaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoCuotaBusqueda"));

		if(this.tipocuotaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoCuotaBusqueda.setVisible(false);		}


					
		this.jLabeles_proveTipoCuota = new JLabelMe();
		this.jLabeles_proveTipoCuota.setText(""+TipoCuotaConstantesFunciones.LABEL_ESPROVE+" : *");
		this.jLabeles_proveTipoCuota.setToolTipText("Es Prove");
		this.jLabeles_proveTipoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_proveTipoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_proveTipoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_proveTipoCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_proveTipoCuota=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_proveTipoCuota.setToolTipText(TipoCuotaConstantesFunciones.LABEL_ESPROVE);
		this.gridaBagLayoutTipoCuota = new GridBagLayout();
		this.jPaneles_proveTipoCuota.setLayout(this.gridaBagLayoutTipoCuota);


		jCheckBoxes_proveTipoCuota= new JCheckBoxMe();
		jCheckBoxes_proveTipoCuota.setEnabled(false);

		jCheckBoxes_proveTipoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_proveTipoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_proveTipoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_proveTipoCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_proveTipoCuotaBusqueda= new JButtonMe();
		this.jButtones_proveTipoCuotaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_proveTipoCuotaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_proveTipoCuotaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_proveTipoCuotaBusqueda.setText("U");
		this.jButtones_proveTipoCuotaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_proveTipoCuotaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_proveTipoCuotaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_proveTipoCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_proveTipoCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_proveTipoCuotaBusqueda"));

		if(this.tipocuotaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_proveTipoCuotaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoCuota() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoCuota = new JLabelMe();
		this.jLabelid_empresaTipoCuota.setText(""+TipoCuotaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoCuota.setToolTipText("Empresa");
		this.jLabelid_empresaTipoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-56),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoCuota,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoCuota=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoCuota.setToolTipText(TipoCuotaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoCuota = new GridBagLayout();
		this.jPanelid_empresaTipoCuota.setLayout(this.gridaBagLayoutTipoCuota);


		jComboBoxid_empresaTipoCuota= new JComboBoxMe();
		jComboBoxid_empresaTipoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoCuota,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoCuota.setEnabled(false);

		this.jButtonid_empresaTipoCuota= new JButtonMe();
		this.jButtonid_empresaTipoCuota.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoCuota.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoCuota.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoCuota.setText("Buscar");
		this.jButtonid_empresaTipoCuota.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoCuota.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoCuota,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoCuota"));

		this.jButtonid_empresaTipoCuotaBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoCuotaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCuotaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCuotaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoCuotaBusqueda.setText("U");
		this.jButtonid_empresaTipoCuotaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoCuotaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoCuotaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoCuotaBusqueda"));

		if(this.tipocuotaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoCuotaBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoCuotaUpdate= new JButtonMe();
		this.jButtonid_empresaTipoCuotaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCuotaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoCuotaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoCuotaUpdate.setText("U");
		this.jButtonid_empresaTipoCuotaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoCuotaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoCuotaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoCuota.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoCuota.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoCuotaUpdate"));



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
		//this.jInternalFrameDetalleTipoCuota = new TipoCuotaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Cuota DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCuota= new GridBagLayout();
		

		
		String sToolTipTipoCuota="";
		sToolTipTipoCuota=TipoCuotaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCuota+="(Nomina.TipoCuota)";
		}
		
		if(!this.tipocuotaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCuota+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoCuota = new JButtonMe();
		this.jButtonModificarTipoCuota = new JButtonMe();
        this.jButtonActualizarTipoCuota = new JButtonMe();
        this.jButtonEliminarTipoCuota = new JButtonMe();
        this.jButtonCancelarTipoCuota = new JButtonMe();
        this.jButtonGuardarCambiosTipoCuota = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoCuota = new JButtonMe();
		this.jButtonCerrarTipoCuota = new JButtonMe();
		
		this.jScrollPanelDatosTipoCuota = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoCuota = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoCuota = new JScrollPane();
				
		
		
		this.jPanelCamposTipoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		
		this.jTabbedPaneRelacionesFinformas_de_pagoTipoCuota=new JTabbedPane();
		this.jTabbedPaneRelacionesFinformas_de_pagoTipoCuota.add("",new JPanel());
		this.jButtonRelacionesFinformas_de_pagoTipoCuota=new JButtonMe();
		this.jPanelAccionesRelacionesFinTipoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jButtonRelacionesFinNormalTipoCuota=new JButtonMe();;
		//}
		
		this.sPath=" <---> Acceso: Tipo Cuota";
		
		if(!this.tipocuotaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuotas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCuota.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoCuota.setName("jPanelCamposTipoCuota"); 

		this.jPanelCamposOcultosTipoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoCuota.setName("jPanelCamposOcultosTipoCuota"); 

        this.jPanelAccionesTipoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCuota.setToolTipText("Acciones");
        this.jPanelAccionesTipoCuota.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoCuota.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoCuota.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoCuota, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCuota, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCuota, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoCuota, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoCuota, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoCuota, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		
		this.jTabbedPaneRelacionesFinformas_de_pagoTipoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("formas_de_pago"));
		this.jTabbedPaneRelacionesFinformas_de_pagoTipoCuota.setName("jTabbedPaneRelacionesFinformas_de_pagoTipoCuota");
		this.jButtonRelacionesFinformas_de_pagoTipoCuota.setText("FORMAS DE PAGO");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRelacionesFinformas_de_pagoTipoCuota,"relaciones_fin_button","FORMAS DE PAGO",true);
		this.jButtonRelacionesFinformas_de_pagoTipoCuota.setToolTipText("FORMAS DE PAGO");

		this.jPanelAccionesRelacionesFinTipoCuota.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelAccionesRelacionesFinTipoCuota.setName("jPanelAccionesRelacionesFinTipoCuota");
		this.jButtonRelacionesFinNormalTipoCuota.setText("NORMAL");
		FuncionesSwing.addImagenButtonGeneral(this.jButtonRelacionesFinNormalTipoCuota,"relaciones_fin_button","NORMAL",true);
		this.jButtonRelacionesFinNormalTipoCuota.setToolTipText("NORMAL");;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoCuota.setText("Nuevo");
		this.jButtonModificarTipoCuota.setText("Editar");
        this.jButtonActualizarTipoCuota.setText("Actualizar");
        this.jButtonEliminarTipoCuota.setText("Eliminar");
        this.jButtonCancelarTipoCuota.setText("Cancelar");
        this.jButtonGuardarCambiosTipoCuota.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoCuota.setText("Guardar");
		this.jButtonCerrarTipoCuota.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCuota,"nuevo_button","Nuevo",this.tipocuotaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoCuota,"modificar_button","Editar",this.tipocuotaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoCuota,"actualizar_button","Actualizar",this.tipocuotaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoCuota,"eliminar_button","Eliminar",this.tipocuotaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoCuota,"cancelar_button","Cancelar",this.tipocuotaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoCuota,"guardarcambios_button","Guardar",this.tipocuotaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCuota,"guardarcambiostabla_button","Guardar",this.tipocuotaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCuota,"cerrar_button","Salir",this.tipocuotaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoCuota, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoCuota, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoCuota, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoCuota.setToolTipText("Nuevo"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoCuota.setToolTipText("Editar"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoCuota.setToolTipText("Actualizar"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoCuota.setToolTipText("Eliminar)"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoCuota.setToolTipText("Cancelar"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoCuota.setToolTipText("Guardar"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoCuota.setToolTipText("Guardar"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCuota.setToolTipText("Salir"+" "+TipoCuotaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCuota";
		inputMap = this.jButtonNuevoTipoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCuota.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCuota"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoCuota";
		inputMap = this.jButtonActualizarTipoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoCuota"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoCuota";
		inputMap = this.jButtonEliminarTipoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoCuota"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoCuota";
		inputMap = this.jButtonCancelarTipoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoCuota"));
		
		//CERRAR		
		sMapKey = "CerrarTipoCuota";
		inputMap = this.jButtonCerrarTipoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCuota"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCuota";
		inputMap = this.jButtonGuardarCambiosTablaTipoCuota.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCuota.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCuota"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoCuota = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoCuota.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoCuota.setToolTipText("Nuevo TipoCuota");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoCuota, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoCuota = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoCuota.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoCuota.setToolTipText("Sin Cerrar Ventana TipoCuota");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoCuota, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoCuota = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoCuota.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoCuota.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoCuota, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoCuota = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCuota.setText("Accion");
		this.jComboBoxTiposAccionesTipoCuota.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoCuota = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoCuota.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoCuota.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoCuota = new JLabelMe();
		
		this.jLabelAccionesTipoCuota.setText("Acciones");		
		this.jLabelAccionesTipoCuota.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCuota.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCuota.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoCuota();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoCuota();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoCuota=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoCuota.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoCuota,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoCuota.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCuota.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCuota.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCuota, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoCuota.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCuota.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCuota.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoCuota, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoCuota = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoCuota = new GridBagLayout();
		
		this.jPanelCamposTipoCuota.setLayout(gridaBagLayoutCamposTipoCuota);
		this.jPanelCamposOcultosTipoCuota.setLayout(gridaBagLayoutCamposOcultosTipoCuota);
		
		;
		
		this.jTabbedPaneRelacionesFinformas_de_pagoTipoCuota.setMinimumSize(new Dimension(this.getWidth(),TipoCuotaConstantesFunciones.ALTO_TABPANE_RELACIONES));
		this.jTabbedPaneRelacionesFinformas_de_pagoTipoCuota.setMaximumSize(new Dimension(this.getWidth(),TipoCuotaConstantesFunciones.ALTO_TABPANE_RELACIONES));
		this.jTabbedPaneRelacionesFinformas_de_pagoTipoCuota.setPreferredSize(new Dimension(this.getWidth(),TipoCuotaConstantesFunciones.ALTO_TABPANE_RELACIONES));
		GridBagLayout gridaBagLayoutAccionesRelacionesFinTipoCuota= new GridBagLayout();
		this.jPanelAccionesRelacionesFinTipoCuota.setLayout(gridaBagLayoutAccionesRelacionesFinTipoCuota);;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoCuota = new GridBagConstraints();
	this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuota.gridy = 0;
	this.gridBagConstraintsTipoCuota.gridx = 0;
	this.gridBagConstraintsTipoCuota.ipadx = 0;
	this.gridBagConstraintsTipoCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoCuota.add(jLabelIdTipoCuota, this.gridBagConstraintsTipoCuota);



	this.gridBagConstraintsTipoCuota = new GridBagConstraints();
	this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuota.gridy = 0;
	this.gridBagConstraintsTipoCuota.gridx = 1;
	this.gridBagConstraintsTipoCuota.ipadx = 0;
	this.gridBagConstraintsTipoCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoCuota.add(jLabelidTipoCuota, this.gridBagConstraintsTipoCuota);


	this.gridBagConstraintsTipoCuota = new GridBagConstraints();
	this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuota.gridy = 0;
	this.gridBagConstraintsTipoCuota.gridx = 0;
	this.gridBagConstraintsTipoCuota.ipadx = 0;
	this.gridBagConstraintsTipoCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoCuota.add(jLabelid_empresaTipoCuota, this.gridBagConstraintsTipoCuota);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		//this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuota.gridy = 0;
		this.gridBagConstraintsTipoCuota.gridx = 2;
		this.gridBagConstraintsTipoCuota.ipadx = 0;
		this.gridBagConstraintsTipoCuota.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoCuota.add(jButtonid_empresaTipoCuotaBusqueda, this.gridBagConstraintsTipoCuota);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		//this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuota.gridy = 0;
		this.gridBagConstraintsTipoCuota.gridx = 3;
		this.gridBagConstraintsTipoCuota.ipadx = 0;
		this.gridBagConstraintsTipoCuota.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoCuota.add(jButtonid_empresaTipoCuotaUpdate, this.gridBagConstraintsTipoCuota);
	}

	this.gridBagConstraintsTipoCuota = new GridBagConstraints();
	this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuota.gridy = 0;
	this.gridBagConstraintsTipoCuota.gridx = 1;
	this.gridBagConstraintsTipoCuota.ipadx = 0;
	this.gridBagConstraintsTipoCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoCuota.add(jComboBoxid_empresaTipoCuota, this.gridBagConstraintsTipoCuota);


	this.gridBagConstraintsTipoCuota = new GridBagConstraints();
	this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuota.gridy = 0;
	this.gridBagConstraintsTipoCuota.gridx = 0;
	this.gridBagConstraintsTipoCuota.ipadx = 0;
	this.gridBagConstraintsTipoCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoCuota.add(jLabelcodigoTipoCuota, this.gridBagConstraintsTipoCuota);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		//this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuota.gridy = 0;
		this.gridBagConstraintsTipoCuota.gridx = 2;
		this.gridBagConstraintsTipoCuota.ipadx = 0;
		this.gridBagConstraintsTipoCuota.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoCuota.add(jButtoncodigoTipoCuotaBusqueda, this.gridBagConstraintsTipoCuota);
	}

	this.gridBagConstraintsTipoCuota = new GridBagConstraints();
	this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuota.gridy = 0;
	this.gridBagConstraintsTipoCuota.gridx = 1;
	this.gridBagConstraintsTipoCuota.ipadx = 0;
	this.gridBagConstraintsTipoCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoCuota.add(jTextFieldcodigoTipoCuota, this.gridBagConstraintsTipoCuota);


	this.gridBagConstraintsTipoCuota = new GridBagConstraints();
	this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuota.gridy = 0;
	this.gridBagConstraintsTipoCuota.gridx = 0;
	this.gridBagConstraintsTipoCuota.ipadx = 0;
	this.gridBagConstraintsTipoCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoCuota.add(jLabelnombreTipoCuota, this.gridBagConstraintsTipoCuota);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		//this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuota.gridy = 0;
		this.gridBagConstraintsTipoCuota.gridx = 2;
		this.gridBagConstraintsTipoCuota.ipadx = 0;
		this.gridBagConstraintsTipoCuota.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoCuota.add(jButtonnombreTipoCuotaBusqueda, this.gridBagConstraintsTipoCuota);
	}

	this.gridBagConstraintsTipoCuota = new GridBagConstraints();
	this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuota.gridy = 0;
	this.gridBagConstraintsTipoCuota.gridx = 1;
	this.gridBagConstraintsTipoCuota.ipadx = 0;
	this.gridBagConstraintsTipoCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoCuota.add(jscrollPanenombreTipoCuota, this.gridBagConstraintsTipoCuota);


	this.gridBagConstraintsTipoCuota = new GridBagConstraints();
	this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuota.gridy = 0;
	this.gridBagConstraintsTipoCuota.gridx = 0;
	this.gridBagConstraintsTipoCuota.ipadx = 0;
	this.gridBagConstraintsTipoCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_proveTipoCuota.add(jLabeles_proveTipoCuota, this.gridBagConstraintsTipoCuota);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		//this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuota.gridy = 0;
		this.gridBagConstraintsTipoCuota.gridx = 2;
		this.gridBagConstraintsTipoCuota.ipadx = 0;
		this.gridBagConstraintsTipoCuota.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_proveTipoCuota.add(jButtones_proveTipoCuotaBusqueda, this.gridBagConstraintsTipoCuota);
	}

	this.gridBagConstraintsTipoCuota = new GridBagConstraints();
	this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuota.gridy = 0;
	this.gridBagConstraintsTipoCuota.gridx = 1;
	this.gridBagConstraintsTipoCuota.ipadx = 0;
	this.gridBagConstraintsTipoCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_proveTipoCuota.add(jCheckBoxes_proveTipoCuota, this.gridBagConstraintsTipoCuota);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoCuota = new GridBagConstraints();
	this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCuota.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCuota.gridy = iYPanelCamposTipoCuota;
	this.gridBagConstraintsTipoCuota.gridx = iXPanelCamposTipoCuota++;
	this.gridBagConstraintsTipoCuota.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCuota.add(this.jPanelidTipoCuota, this.gridBagConstraintsTipoCuota);



	if(iXPanelCamposTipoCuota % 1==0) {
		iXPanelCamposTipoCuota=0;
		iYPanelCamposTipoCuota++;
	}
	this.gridBagConstraintsTipoCuota = new GridBagConstraints();
	this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCuota.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCuota.gridy = iYPanelCamposTipoCuota;
	this.gridBagConstraintsTipoCuota.gridx = iXPanelCamposTipoCuota++;
	this.gridBagConstraintsTipoCuota.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCuota.add(this.jPanelcodigoTipoCuota, this.gridBagConstraintsTipoCuota);



	if(iXPanelCamposTipoCuota % 1==0) {
		iXPanelCamposTipoCuota=0;
		iYPanelCamposTipoCuota++;
	}
	this.gridBagConstraintsTipoCuota = new GridBagConstraints();
	this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCuota.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCuota.gridy = iYPanelCamposTipoCuota;
	this.gridBagConstraintsTipoCuota.gridx = iXPanelCamposTipoCuota++;
	this.gridBagConstraintsTipoCuota.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCuota.add(this.jPanelnombreTipoCuota, this.gridBagConstraintsTipoCuota);



	if(iXPanelCamposTipoCuota % 1==0) {
		iXPanelCamposTipoCuota=0;
		iYPanelCamposTipoCuota++;
	}
	this.gridBagConstraintsTipoCuota = new GridBagConstraints();
	this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCuota.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCuota.gridy = iYPanelCamposTipoCuota;
	this.gridBagConstraintsTipoCuota.gridx = iXPanelCamposTipoCuota++;
	this.gridBagConstraintsTipoCuota.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCuota.add(this.jPaneles_proveTipoCuota, this.gridBagConstraintsTipoCuota);



	if(iXPanelCamposTipoCuota % 1==0) {
		iXPanelCamposTipoCuota=0;
		iYPanelCamposTipoCuota++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoCuota = new GridBagConstraints();
	this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCuota.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCuota.gridy = iYPanelCamposOcultosTipoCuota;
	this.gridBagConstraintsTipoCuota.gridx = iXPanelCamposOcultosTipoCuota++;
	this.gridBagConstraintsTipoCuota.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCuota.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoCuota.add(this.jPanelid_empresaTipoCuota, this.gridBagConstraintsTipoCuota);



	if(iXPanelCamposOcultosTipoCuota % 1==0) {
		iXPanelCamposOcultosTipoCuota=0;
		iYPanelCamposOcultosTipoCuota++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoCuota= new GridBagLayout();
		this.jPanelAccionesTipoCuota.setLayout(gridaBagLayoutAccionesTipoCuota);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoCuota= new GridBagLayout();
		this.jPanelAccionesFormularioTipoCuota.setLayout(gridaBagLayoutAccionesFormularioTipoCuota);
		
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCuota.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCuota.add(this.jComboBoxTiposAccionesFormularioTipoCuota, this.gridBagConstraintsTipoCuota);

		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCuota.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCuota.add(this.jCheckBoxPostAccionNuevoTipoCuota, this.gridBagConstraintsTipoCuota);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipocuotaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCuota.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCuota.add(this.jCheckBoxPostAccionSinCerrarTipoCuota, this.gridBagConstraintsTipoCuota);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipocuotaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipocuotaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCuota.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCuota.add(this.jCheckBoxPostAccionSinMensajeTipoCuota, this.gridBagConstraintsTipoCuota);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuota.gridy = 0;
		this.gridBagConstraintsTipoCuota.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoCuota.add(this.jButtonModificarTipoCuota, this.gridBagConstraintsTipoCuota);							

		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuota.gridy = 0;
		this.gridBagConstraintsTipoCuota.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoCuota.add(this.jButtonEliminarTipoCuota, this.gridBagConstraintsTipoCuota);
		
			
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.gridy = 0;		
		this.gridBagConstraintsTipoCuota.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCuota.add(this.jButtonActualizarTipoCuota, this.gridBagConstraintsTipoCuota);


		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.gridy = 0;		
		this.gridBagConstraintsTipoCuota.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCuota.add(this.jButtonGuardarCambiosTipoCuota, this.gridBagConstraintsTipoCuota);	
		
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.gridy = 0;		
		this.gridBagConstraintsTipoCuota.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoCuota.add(this.jButtonCancelarTipoCuota, this.gridBagConstraintsTipoCuota);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCuota = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCuota);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocuotaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();						
			this.gridBagConstraintsTipoCuota.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCuota.gridx = 0;		
			//this.gridBagConstraintsTipoCuota.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuota.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCuota.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCuota.gridx =0;
		this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCuota.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCuota, this.gridBagConstraintsTipoCuota);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoCuotaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoCuota = new TipoCuotaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Cuota DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Cuota DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Cuota Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoCuotaModel tipocuotaModel=new TipoCuotaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoCuotaModel.TipoCuotaFocusTraversalPolicy tipocuotaFocusTraversalPolicy = tipocuotaModel.new TipoCuotaFocusTraversalPolicy(this);
			
			//tipocuotaFocusTraversalPolicy.settipocuotaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipocuotaModel);
			
			
			this.jContentPaneDetalleTipoCuota = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoCuota = new GridBagLayout();	
			this.jContentPaneDetalleTipoCuota.setLayout(gridaBagLayoutDetalleTipoCuota);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCuota = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoCuota = new GridBagConstraints();
				this.gridBagConstraintsTipoCuota.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoCuota.gridx = 0;
					
				
				this.jContentPaneDetalleTipoCuota.add(jTtoolBarDetalleTipoCuota, gridBagConstraintsTipoCuota);								
				
}
			
			this.jScrollPanelDatosEdicionTipoCuota=   new JScrollPane(jContentPaneDetalleTipoCuota,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCuota.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCuota.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCuota.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoCuota=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCuota.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCuota.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCuota.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoCuota.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoCuota.gridx = 0;
	        
			this.jContentPaneDetalleTipoCuota.add(jPanelCamposTipoCuota, gridBagConstraintsTipoCuota);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			
				this.gridBagConstraintsTipoCuota = new GridBagConstraints();
				//this.gridBagConstraintsTipoCuota.fill=GridBagConstraints.NONE;
				//this.gridBagConstraintsTipoCuota.anchor = GridBagConstraints.WEST;

				this.gridBagConstraintsTipoCuota.gridy = iGridyRelaciones++;
				this.gridBagConstraintsTipoCuota.gridx = 0;

				this.jContentPaneDetalleTipoCuota.add(this.jPanelAccionesRelacionesFinTipoCuota, gridBagConstraintsTipoCuota);;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				

				if(!PrestamoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.puedeCargarPorPartePrestamo=true;
				}
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						&& tipocuotaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFramePrestamo(this.puedeCargarPorPartePrestamo,false,-1);
					
					if(this.tipocuotaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoCuota= new GridBagConstraints();
						this.gridBagConstraintsTipoCuota.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoCuota.gridx = 0;
						this.jContentPaneDetalleTipoCuota.add(this.jTabbedPaneRelacionesTipoCuota, this.gridBagConstraintsTipoCuota);
					}
					
					//RELACIONES OTROS AGRUPADOS
					
				this.gridBagConstraintsTipoCuota = new GridBagConstraints();
				//this.gridBagConstraintsTipoCuota.fill=GridBagConstraints.NONE;
				//this.gridBagConstraintsTipoCuota.anchor = GridBagConstraints.WEST;

				this.gridBagConstraintsTipoCuota.gridy = iGridyRelaciones++;
				this.gridBagConstraintsTipoCuota.gridx = 0;

				this.jContentPaneDetalleTipoCuota.add(this.jTabbedPaneRelacionesFinformas_de_pagoTipoCuota, gridBagConstraintsTipoCuota);

				this.jTabbedPaneRelacionesFinformas_de_pagoTipoCuota.setVisible(false);

				this.gridBagConstraintsTipoCuota = new GridBagConstraints();
				this.gridBagConstraintsTipoCuota.gridy = 0;
				this.gridBagConstraintsTipoCuota.gridx = iPosXAccionesRelacionesFin++;
				this.jPanelAccionesRelacionesFinTipoCuota.add(this.jButtonRelacionesFinNormalTipoCuota, this.gridBagConstraintsTipoCuota);
				this.gridBagConstraintsTipoCuota = new GridBagConstraints();
				this.gridBagConstraintsTipoCuota.gridy = 0;
				this.gridBagConstraintsTipoCuota.gridx = iPosXAccionesRelacionesFin++;
				this.jPanelAccionesRelacionesFinTipoCuota.add(this.jButtonRelacionesFinformas_de_pagoTipoCuota, this.gridBagConstraintsTipoCuota);;
					
					} else {
						//this.jButtonNuevoRelacionesTipoCuota.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFramePrestamo(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoCuota.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoCuota = new GridBagConstraints();
					this.gridBagConstraintsTipoCuota.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoCuota.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoCuota.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoCuota.gridx = 0;
					
				
					this.jContentPaneDetalleTipoCuota.add(jPanelCamposOcultosTipoCuota, gridBagConstraintsTipoCuota);
				
					this.jPanelCamposOcultosTipoCuota.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoCuota.gridx = 0;
	        this.gridBagConstraintsTipoCuota.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoCuota.add(this.jPanelAccionesFormularioTipoCuota, this.gridBagConstraintsTipoCuota);							
			
			
			
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
	        this.gridBagConstraintsTipoCuota.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoCuota.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoCuota.add(this.jPanelAccionesTipoCuota, this.gridBagConstraintsTipoCuota);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoCuota);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoCuota=   new JScrollPane(this.jPanelCamposTipoCuota,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCuota.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCuota.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCuota.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoCuota.gridx = 0;
			this.gridBagConstraintsTipoCuota.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoCuota.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoCuota.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoCuota, this.gridBagConstraintsTipoCuota);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCuota.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoCuota, this.gridBagConstraintsTipoCuota);			
			
			this.gridBagConstraintsTipoCuota = new GridBagConstraints();
			this.gridBagConstraintsTipoCuota.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCuota.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoCuota, this.gridBagConstraintsTipoCuota);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuota.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCuota, this.gridBagConstraintsTipoCuota);
			
			
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuota.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCuota, this.gridBagConstraintsTipoCuota);
		
			
		this.gridBagConstraintsTipoCuota = new GridBagConstraints();
		this.gridBagConstraintsTipoCuota.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuota.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCuota, this.gridBagConstraintsTipoCuota);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoCuota;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoCuota;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFramePrestamo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.prestamoSessionBean=new PrestamoSessionBean();
		this.prestamoSessionBean.setConGuardarRelaciones(true);
		this.prestamoSessionBean.setEsGuardarRelacionado(true);

		this.prestamoBeanSwingJInternalFrame=null;//new PrestamoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.prestamoBeanSwingJInternalFramePopup=new PrestamoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.prestamoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.prestamoSessionBean.getEsGuardarRelacionado()) {

				PrestamoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoCuotaJInternalFrame.STIPO_TAMANIO_GENERAL;
				PrestamoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoCuotaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.prestamoSessionBean.setEsGuardarRelacionado(true);

				this.prestamoBeanSwingJInternalFrame=new PrestamoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,true,true,true,false);//false->4

				this.prestamoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.prestamoBeanSwingJInternalFrame.setprestamoSessionBean(this.prestamoSessionBean);

				//this.gridBagConstraintsTipoCuota = new GridBagConstraints();
				//this.gridBagConstraintsTipoCuota.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoCuota.gridx = 0;
				//this.jContentPaneDetalleTipoCuota.add(this.prestamoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoCuota);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesFinformas_de_pagoTipoCuota.add("Prestamos",this.prestamoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesFinformas_de_pagoTipoCuota.setComponentAt(iIndexTab,this.prestamoBeanSwingJInternalFrame.getContentPane());
				}

				//PrestamoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.prestamoSessionBean.setEsGuardarRelacionado(false);
				this.prestamoBeanSwingJInternalFrame=null;//new PrestamoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.prestamoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePrestamo) {
					this.jTabbedPaneRelacionesFinformas_de_pagoTipoCuota.add("Prestamos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarPrestamoBeanSwingJInternalFrame(List<TipoCuota> tipocuotas,TipoCuota tipocuota,PrestamoBeanSwingJInternalFrame prestamoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//prestamoBeanSwingJInternalFrame=new PrestamoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					prestamoBeanSwingJInternalFrame.getPrestamoLogic().setConnexion(this.tipocuotaLogic.getConnexion());

					prestamoBeanSwingJInternalFrame.settipocuotasForeignKey(tipocuotas);
					prestamoBeanSwingJInternalFrame.settipocuotaForeignKey(tipocuota);
					prestamoBeanSwingJInternalFrame.prestamoSessionBean.setisBusquedaDesdeForeignKeySesionTipoCuota(true);
					prestamoBeanSwingJInternalFrame.prestamoSessionBean.setlidTipoCuotaActual(tipocuota.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					prestamoBeanSwingJInternalFrame.cargarCombosForeignKeyPrestamo(prestamoBeanSwingJInternalFrame.isCargarCombosDependencia);
					prestamoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoCuota(true);
					prestamoBeanSwingJInternalFrame.setid_tipo_cuotaFK_IdTipoCuota(tipocuota.getId());

					if(!this.conCargarFormDetalle) {
						prestamoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					prestamoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoCuotaForeignKey(tipocuota,1,false,true,true);
					prestamoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					prestamoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoCuota");
					prestamoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoCuota");
					prestamoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPrestamo(true);
					prestamoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPrestamo("n",prestamoBeanSwingJInternalFrame.isGuardarCambiosEnLote, prestamoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					prestamoBeanSwingJInternalFrame.setAutoscrolls(true);
					prestamoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						prestamoBeanSwingJInternalFrame.actualizarEstadoPanelsPrestamo("relacionado");
					} else {
						prestamoBeanSwingJInternalFrame.actualizarEstadoPanelsPrestamo("no_relacionado");
					}

					prestamoBeanSwingJInternalFrame.getjButtonRecargarInformacionPrestamo().setVisible(false);

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
