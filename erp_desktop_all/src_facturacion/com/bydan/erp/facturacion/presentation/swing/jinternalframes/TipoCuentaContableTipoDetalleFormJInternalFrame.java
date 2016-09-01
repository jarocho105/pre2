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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;



import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.TipoCuentaContableTipoConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class TipoCuentaContableTipoDetalleFormJInternalFrame extends TipoCuentaContableTipoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoCuentaContableTipo;
	
	protected JMenuBar jmenuBarDetalleTipoCuentaContableTipo;
	
	protected JMenu jmenuDetalleTipoCuentaContableTipo;
	protected JMenu jmenuDetalleArchivoTipoCuentaContableTipo;
	protected JMenu jmenuDetalleAccionesTipoCuentaContableTipo;
	protected JMenu jmenuDetalleDatosTipoCuentaContableTipo;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoCuentaContableTipo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoCuentaContableTipo;	
	protected GridBagConstraints gridBagConstraintsTipoCuentaContableTipo;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoCuentaContableTipoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoCuentaContableTipo;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoCuentaContableTipoSessionBean tipocuentacontabletipoSessionBean;
	
	

	public CuentaContableTipoBeanSwingJInternalFrame cuentacontabletipoBeanSwingJInternalFrame=null;
	public CuentaContableTipoBeanSwingJInternalFrame cuentacontabletipoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteCuentaContableTipo=false;
	public CuentaContableTipoSessionBean cuentacontabletipoSessionBean;
	
		
	
	public TipoCuentaContableTipoLogic tipocuentacontabletipoLogic;
	
	public JScrollPane jScrollPanelDatosTipoCuentaContableTipo;
	public JScrollPane jScrollPanelDatosEdicionTipoCuentaContableTipo;
	public JScrollPane jScrollPanelDatosGeneralTipoCuentaContableTipo;
	
	protected JPanel jPanelCamposTipoCuentaContableTipo;    
	protected JPanel jPanelCamposOcultosTipoCuentaContableTipo;    	
	protected JPanel jPanelAccionesTipoCuentaContableTipo;
	protected JPanel jPanelAccionesFormularioTipoCuentaContableTipo;
    
	
	
	protected Integer iXPanelCamposTipoCuentaContableTipo=0;
	protected Integer iYPanelCamposTipoCuentaContableTipo=0;
	
	protected Integer iXPanelCamposOcultosTipoCuentaContableTipo=0;
	protected Integer iYPanelCamposOcultosTipoCuentaContableTipo=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoCuentaContableTipo;
	public JButton jButtonModificarTipoCuentaContableTipo;
	public JButton jButtonActualizarTipoCuentaContableTipo;
    public JButton jButtonEliminarTipoCuentaContableTipo;
	public JButton jButtonCancelarTipoCuentaContableTipo;
    public JButton jButtonGuardarCambiosTipoCuentaContableTipo;
	public JButton jButtonGuardarCambiosTablaTipoCuentaContableTipo;
	protected JButton jButtonCerrarTipoCuentaContableTipo;
	
	
	protected JButton jButtonProcesarInformacionTipoCuentaContableTipo;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoCuentaContableTipo;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoCuentaContableTipo;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoCuentaContableTipo;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoCuentaContableTipo;
	protected JButton jButtonModificarToolBarTipoCuentaContableTipo;
	protected JButton jButtonActualizarToolBarTipoCuentaContableTipo;
    protected JButton jButtonEliminarToolBarTipoCuentaContableTipo;
	protected JButton jButtonCancelarToolBarTipoCuentaContableTipo;
    protected JButton jButtonGuardarCambiosToolBarTipoCuentaContableTipo;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoCuentaContableTipo;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoCuentaContableTipo;
	protected JButton jButtonCerrarToolBarTipoCuentaContableTipo;
	
	protected JButton jButtonProcesarInformacionToolBarTipoCuentaContableTipo;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoCuentaContableTipo;
	protected JMenuItem jMenuItemModificarTipoCuentaContableTipo;
	protected JMenuItem jMenuItemActualizarTipoCuentaContableTipo;
    protected JMenuItem jMenuItemEliminarTipoCuentaContableTipo;
	protected JMenuItem jMenuItemCancelarTipoCuentaContableTipo;
    protected JMenuItem jMenuItemGuardarCambiosTipoCuentaContableTipo;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoCuentaContableTipo;
	protected JMenuItem jMenuItemCerrarTipoCuentaContableTipo;
	protected JMenuItem jMenuItemDetalleCerrarTipoCuentaContableTipo;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoCuentaContableTipo;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoCuentaContableTipo;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoCuentaContableTipo;
	protected JMenuItem jMenuItemMostrarOcultarTipoCuentaContableTipo;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoCuentaContableTipo;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoCuentaContableTipo;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoCuentaContableTipo;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoCuentaContableTipo;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoCuentaContableTipo;
	public JLabel jLabelIdTipoCuentaContableTipo;
	public JTextFieldMe jTextFieldidTipoCuentaContableTipo;
	public JButton jButtonidTipoCuentaContableTipoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoCuentaContableTipo;
	public JLabel jLabelnombreTipoCuentaContableTipo;
	public JTextArea jTextAreanombreTipoCuentaContableTipo;
	public JScrollPane jscrollPanenombreTipoCuentaContableTipo;
	public JButton jButtonnombreTipoCuentaContableTipoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoCuentaContableTipo;
	
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
	
	public TipoCuentaContableTipoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoCuentaContableTipo=new JPanel();
				this.jPanelAccionesFormularioTipoCuentaContableTipo=new JPanel();
				this.jmenuBarDetalleTipoCuentaContableTipo=new JMenuBar();
				this.jTtoolBarDetalleTipoCuentaContableTipo=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuentaContableTipoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoCuentaContableTipo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoCuentaContableTipoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoCuentaContableTipo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuentaContableTipoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCuentaContableTipo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuentaContableTipoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoCuentaContableTipo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoCuentaContableTipoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoCuentaContableTipo No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoCuentaContableTipo() {
		return this.jButtonActualizarToolBarTipoCuentaContableTipo;
	}
	
	public JButton getjButtonEliminarToolBarTipoCuentaContableTipo() {
		return this.jButtonEliminarToolBarTipoCuentaContableTipo;
	}
	
	public JButton getjButtonCancelarToolBarTipoCuentaContableTipo() {
		return this.jButtonCancelarToolBarTipoCuentaContableTipo;
	}		
	
	public JButton getjButtonProcesarInformacionTipoCuentaContableTipo() {
		return this.jButtonProcesarInformacionTipoCuentaContableTipo;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoCuentaContableTipo)	{
		this.jButtonProcesarInformacionTipoCuentaContableTipo = jButtonProcesarInformacionTipoCuentaContableTipo;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoCuentaContableTipo() {
		return this.jComboBoxTiposAccionesTipoCuentaContableTipo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoCuentaContableTipo(
			JComboBox jComboBoxTiposRelacionesTipoCuentaContableTipo) {
		this.jComboBoxTiposRelacionesTipoCuentaContableTipo = jComboBoxTiposRelacionesTipoCuentaContableTipo;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoCuentaContableTipo(
			JComboBox jComboBoxTiposAccionesTipoCuentaContableTipo) {
		this.jComboBoxTiposAccionesTipoCuentaContableTipo = jComboBoxTiposAccionesTipoCuentaContableTipo;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoCuentaContableTipo() {
		return this.jComboBoxTiposAccionesFormularioTipoCuentaContableTipo;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoCuentaContableTipo(
			JComboBox jComboBoxTiposAccionesFormularioTipoCuentaContableTipo) {
		this.jComboBoxTiposAccionesFormularioTipoCuentaContableTipo = jComboBoxTiposAccionesFormularioTipoCuentaContableTipo;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipocuentacontabletipoSessionBean=new TipoCuentaContableTipoSessionBean();
		
		this.tipocuentacontabletipoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocuentacontabletipoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.cuentacontabletipoSessionBean=new CuentaContableTipoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoCuentaContableTipoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoCuentaContableTipoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoCuentaContableTipoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Cuenta Contable Tipo MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoCuentaContableTipoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoCuentaContableTipo= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoCuentaContableTipo=new JButtonMe();
				this.jButtonModificarToolBarTipoCuentaContableTipo=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoCuentaContableTipo,this.jTtoolBarDetalleTipoCuentaContableTipo,
							"actualizar","actualizar","Actualizar"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoCuentaContableTipo,this.jTtoolBarDetalleTipoCuentaContableTipo,
							"eliminar","eliminar","Eliminar"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoCuentaContableTipo,this.jTtoolBarDetalleTipoCuentaContableTipo,
							"cancelar","cancelar","Cancelar"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoCuentaContableTipo=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoCuentaContableTipo,this.jTtoolBarDetalleTipoCuentaContableTipo,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoCuentaContableTipo=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoCuentaContableTipo=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoCuentaContableTipo=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoCuentaContableTipo=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoCuentaContableTipo=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoCuentaContableTipo= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoCuentaContableTipo.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoCuentaContableTipo,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoCuentaContableTipo= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoCuentaContableTipo.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoCuentaContableTipo,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoCuentaContableTipo= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoCuentaContableTipo.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoCuentaContableTipo,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoCuentaContableTipo= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoCuentaContableTipo.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoCuentaContableTipo,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoCuentaContableTipo= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoCuentaContableTipo.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoCuentaContableTipo,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoCuentaContableTipo= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoCuentaContableTipo.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoCuentaContableTipo,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoCuentaContableTipo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoCuentaContableTipo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoCuentaContableTipo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoCuentaContableTipo= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoCuentaContableTipo.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoCuentaContableTipo,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoCuentaContableTipo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoCuentaContableTipo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoCuentaContableTipo,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoCuentaContableTipo= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoCuentaContableTipo.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoCuentaContableTipo,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoCuentaContableTipo.add(this.jMenuItemDetalleCerrarTipoCuentaContableTipo);
		
		this.jmenuDetalleAccionesTipoCuentaContableTipo.add(this.jMenuItemActualizarTipoCuentaContableTipo);
		this.jmenuDetalleAccionesTipoCuentaContableTipo.add(this.jMenuItemEliminarTipoCuentaContableTipo);
		this.jmenuDetalleAccionesTipoCuentaContableTipo.add(this.jMenuItemCancelarTipoCuentaContableTipo);		
		
		//this.jmenuDetalleDatosTipoCuentaContableTipo.add(this.jMenuItemDetalleAbrirOrderByTipoCuentaContableTipo);				
		this.jmenuDetalleDatosTipoCuentaContableTipo.add(this.jMenuItemDetalleMostarOcultarTipoCuentaContableTipo);				
				
		//this.jmenuDetalleAccionesTipoCuentaContableTipo.add(this.jMenuItemGuardarCambiosTipoCuentaContableTipo);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoCuentaContableTipo.add(this.jmenuDetalleArchivoTipoCuentaContableTipo);		
		this.jmenuBarDetalleTipoCuentaContableTipo.add(this.jmenuDetalleAccionesTipoCuentaContableTipo);		
		this.jmenuBarDetalleTipoCuentaContableTipo.add(this.jmenuDetalleDatosTipoCuentaContableTipo);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoCuentaContableTipo.add(this.jmenuDetalleTipoCuentaContableTipo);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoCuentaContableTipo);				
	}
	
	
	public void inicializarElementosCamposTipoCuentaContableTipo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoCuentaContableTipo = new JLabelMe();
		jLabelIdTipoCuentaContableTipo.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoCuentaContableTipo = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoCuentaContableTipo.setToolTipText(TipoCuentaContableTipoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoCuentaContableTipo= new GridBagLayout();

		this.jPanelidTipoCuentaContableTipo.setLayout(this.gridaBagLayoutTipoCuentaContableTipo);

		jTextFieldidTipoCuentaContableTipo = new JTextFieldMe();
		jTextFieldidTipoCuentaContableTipo.setText("Id");

		jTextFieldidTipoCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoCuentaContableTipo = new JLabelMe();
		this.jLabelnombreTipoCuentaContableTipo.setText(""+TipoCuentaContableTipoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoCuentaContableTipo.setToolTipText("Nombre");
		this.jLabelnombreTipoCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoCuentaContableTipo=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoCuentaContableTipo.setToolTipText(TipoCuentaContableTipoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoCuentaContableTipo = new GridBagLayout();
		this.jPanelnombreTipoCuentaContableTipo.setLayout(this.gridaBagLayoutTipoCuentaContableTipo);


		jTextAreanombreTipoCuentaContableTipo= new JTextAreaMe();
		jTextAreanombreTipoCuentaContableTipo.setEnabled(false);
		jTextAreanombreTipoCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoCuentaContableTipo.setLineWrap(true);
		jTextAreanombreTipoCuentaContableTipo.setWrapStyleWord(true);
		jTextAreanombreTipoCuentaContableTipo.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoCuentaContableTipo.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoCuentaContableTipo = new JScrollPane(jTextAreanombreTipoCuentaContableTipo);
		jscrollPanenombreTipoCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));

		this.jButtonnombreTipoCuentaContableTipoBusqueda= new JButtonMe();
		this.jButtonnombreTipoCuentaContableTipoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCuentaContableTipoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoCuentaContableTipoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoCuentaContableTipoBusqueda.setText("U");
		this.jButtonnombreTipoCuentaContableTipoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoCuentaContableTipoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoCuentaContableTipoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoCuentaContableTipo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoCuentaContableTipo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoCuentaContableTipoBusqueda"));

		if(this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoCuentaContableTipoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoCuentaContableTipo() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
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
		//this.jInternalFrameDetalleTipoCuentaContableTipo = new TipoCuentaContableTipoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Cuenta Contable Tipo DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoCuentaContableTipo= new GridBagLayout();
		

		
		String sToolTipTipoCuentaContableTipo="";
		sToolTipTipoCuentaContableTipo=TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoCuentaContableTipo+="(Facturacion.TipoCuentaContableTipo)";
		}
		
		if(!this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoCuentaContableTipo+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoCuentaContableTipo = new JButtonMe();
		this.jButtonModificarTipoCuentaContableTipo = new JButtonMe();
        this.jButtonActualizarTipoCuentaContableTipo = new JButtonMe();
        this.jButtonEliminarTipoCuentaContableTipo = new JButtonMe();
        this.jButtonCancelarTipoCuentaContableTipo = new JButtonMe();
        this.jButtonGuardarCambiosTipoCuentaContableTipo = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoCuentaContableTipo = new JButtonMe();
		this.jButtonCerrarTipoCuentaContableTipo = new JButtonMe();
		
		this.jScrollPanelDatosTipoCuentaContableTipo = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoCuentaContableTipo = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoCuentaContableTipo = new JScrollPane();
				
		
		
		this.jPanelCamposTipoCuentaContableTipo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoCuentaContableTipo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoCuentaContableTipo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoCuentaContableTipo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Cuenta Contable Tipo";
		
		if(!this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Cuenta Contable Tipos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoCuentaContableTipo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoCuentaContableTipo.setName("jPanelCamposTipoCuentaContableTipo"); 

		this.jPanelCamposOcultosTipoCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoCuentaContableTipo.setName("jPanelCamposOcultosTipoCuentaContableTipo"); 

        this.jPanelAccionesTipoCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoCuentaContableTipo.setToolTipText("Acciones");
        this.jPanelAccionesTipoCuentaContableTipo.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoCuentaContableTipo.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoCuentaContableTipo.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoCuentaContableTipo.setText("Nuevo");
		this.jButtonModificarTipoCuentaContableTipo.setText("Editar");
        this.jButtonActualizarTipoCuentaContableTipo.setText("Actualizar");
        this.jButtonEliminarTipoCuentaContableTipo.setText("Eliminar");
        this.jButtonCancelarTipoCuentaContableTipo.setText("Cancelar");
        this.jButtonGuardarCambiosTipoCuentaContableTipo.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoCuentaContableTipo.setText("Guardar");
		this.jButtonCerrarTipoCuentaContableTipo.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoCuentaContableTipo,"nuevo_button","Nuevo",this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoCuentaContableTipo,"modificar_button","Editar",this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoCuentaContableTipo,"actualizar_button","Actualizar",this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoCuentaContableTipo,"eliminar_button","Eliminar",this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoCuentaContableTipo,"cancelar_button","Cancelar",this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoCuentaContableTipo,"guardarcambios_button","Guardar",this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoCuentaContableTipo,"guardarcambiostabla_button","Guardar",this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoCuentaContableTipo,"cerrar_button","Salir",this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoCuentaContableTipo.setToolTipText("Nuevo"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoCuentaContableTipo.setToolTipText("Editar"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoCuentaContableTipo.setToolTipText("Actualizar"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoCuentaContableTipo.setToolTipText("Eliminar)"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoCuentaContableTipo.setToolTipText("Cancelar"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoCuentaContableTipo.setToolTipText("Guardar"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoCuentaContableTipo.setToolTipText("Guardar"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoCuentaContableTipo.setToolTipText("Salir"+" "+TipoCuentaContableTipoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoCuentaContableTipo";
		inputMap = this.jButtonNuevoTipoCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoCuentaContableTipo.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoCuentaContableTipo"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoCuentaContableTipo";
		inputMap = this.jButtonActualizarTipoCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoCuentaContableTipo"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoCuentaContableTipo";
		inputMap = this.jButtonEliminarTipoCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoCuentaContableTipo"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoCuentaContableTipo";
		inputMap = this.jButtonCancelarTipoCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoCuentaContableTipo"));
		
		//CERRAR		
		sMapKey = "CerrarTipoCuentaContableTipo";
		inputMap = this.jButtonCerrarTipoCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoCuentaContableTipo"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoCuentaContableTipo";
		inputMap = this.jButtonGuardarCambiosTablaTipoCuentaContableTipo.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoCuentaContableTipo.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoCuentaContableTipo"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoCuentaContableTipo = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoCuentaContableTipo.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoCuentaContableTipo.setToolTipText("Nuevo TipoCuentaContableTipo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoCuentaContableTipo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoCuentaContableTipo.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoCuentaContableTipo.setToolTipText("Sin Cerrar Ventana TipoCuentaContableTipo");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoCuentaContableTipo = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoCuentaContableTipo.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoCuentaContableTipo.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoCuentaContableTipo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoCuentaContableTipo.setText("Accion");
		this.jComboBoxTiposAccionesTipoCuentaContableTipo.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoCuentaContableTipo = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoCuentaContableTipo.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoCuentaContableTipo.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoCuentaContableTipo = new JLabelMe();
		
		this.jLabelAccionesTipoCuentaContableTipo.setText("Acciones");		
		this.jLabelAccionesTipoCuentaContableTipo.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCuentaContableTipo.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoCuentaContableTipo.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoCuentaContableTipo();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoCuentaContableTipo();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoCuentaContableTipo=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoCuentaContableTipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoCuentaContableTipo,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoCuentaContableTipo.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCuentaContableTipo.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoCuentaContableTipo.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoCuentaContableTipo.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCuentaContableTipo.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoCuentaContableTipo.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoCuentaContableTipo, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoCuentaContableTipo = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoCuentaContableTipo = new GridBagLayout();
		
		this.jPanelCamposTipoCuentaContableTipo.setLayout(gridaBagLayoutCamposTipoCuentaContableTipo);
		this.jPanelCamposOcultosTipoCuentaContableTipo.setLayout(gridaBagLayoutCamposOcultosTipoCuentaContableTipo);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsTipoCuentaContableTipo.gridx = 0;
	this.gridBagConstraintsTipoCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsTipoCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoCuentaContableTipo.add(jLabelIdTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);



	this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsTipoCuentaContableTipo.gridx = 1;
	this.gridBagConstraintsTipoCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsTipoCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoCuentaContableTipo.add(jTextFieldidTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);


	this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsTipoCuentaContableTipo.gridx = 0;
	this.gridBagConstraintsTipoCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsTipoCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoCuentaContableTipo.add(jLabelnombreTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		//this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = 0;
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = 2;
		this.gridBagConstraintsTipoCuentaContableTipo.ipadx = 0;
		this.gridBagConstraintsTipoCuentaContableTipo.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoCuentaContableTipo.add(jButtonnombreTipoCuentaContableTipoBusqueda, this.gridBagConstraintsTipoCuentaContableTipo);
	}

	this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoCuentaContableTipo.gridy = 0;
	this.gridBagConstraintsTipoCuentaContableTipo.gridx = 1;
	this.gridBagConstraintsTipoCuentaContableTipo.ipadx = 0;
	this.gridBagConstraintsTipoCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoCuentaContableTipo.add(jscrollPanenombreTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCuentaContableTipo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCuentaContableTipo.gridy = iYPanelCamposTipoCuentaContableTipo;
	this.gridBagConstraintsTipoCuentaContableTipo.gridx = iXPanelCamposTipoCuentaContableTipo++;
	this.gridBagConstraintsTipoCuentaContableTipo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCuentaContableTipo.add(this.jPanelidTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);



	if(iXPanelCamposTipoCuentaContableTipo % 1==0) {
		iXPanelCamposTipoCuentaContableTipo=0;
		iYPanelCamposTipoCuentaContableTipo++;
	}
	this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
	this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoCuentaContableTipo.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoCuentaContableTipo.gridy = iYPanelCamposTipoCuentaContableTipo;
	this.gridBagConstraintsTipoCuentaContableTipo.gridx = iXPanelCamposTipoCuentaContableTipo++;
	this.gridBagConstraintsTipoCuentaContableTipo.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoCuentaContableTipo.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoCuentaContableTipo.add(this.jPanelnombreTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);



	if(iXPanelCamposTipoCuentaContableTipo % 1==0) {
		iXPanelCamposTipoCuentaContableTipo=0;
		iYPanelCamposTipoCuentaContableTipo++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
		
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
			
		GridBagLayout gridaBagLayoutAccionesTipoCuentaContableTipo= new GridBagLayout();
		this.jPanelAccionesTipoCuentaContableTipo.setLayout(gridaBagLayoutAccionesTipoCuentaContableTipo);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoCuentaContableTipo= new GridBagLayout();
		this.jPanelAccionesFormularioTipoCuentaContableTipo.setLayout(gridaBagLayoutAccionesFormularioTipoCuentaContableTipo);
		
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCuentaContableTipo.add(this.jComboBoxTiposAccionesFormularioTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);

		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoCuentaContableTipo.add(this.jCheckBoxPostAccionNuevoTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipocuentacontabletipoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCuentaContableTipo.add(this.jCheckBoxPostAccionSinCerrarTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipocuentacontabletipoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoCuentaContableTipo.add(this.jCheckBoxPostAccionSinMensajeTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = 0;
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoCuentaContableTipo.add(this.jButtonModificarTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);							

		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = 0;
		this.gridBagConstraintsTipoCuentaContableTipo.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoCuentaContableTipo.add(this.jButtonEliminarTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
		
			
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = 0;		
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCuentaContableTipo.add(this.jButtonActualizarTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);


		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = 0;		
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoCuentaContableTipo.add(this.jButtonGuardarCambiosTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);	
		
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = 0;		
		this.gridBagConstraintsTipoCuentaContableTipo.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoCuentaContableTipo.add(this.jButtonCancelarTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoCuentaContableTipo = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoCuentaContableTipo);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipocuentacontabletipoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();						
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = 0;		
			//this.gridBagConstraintsTipoCuentaContableTipo.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoCuentaContableTipo.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoCuentaContableTipo.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoCuentaContableTipo.gridx =0;
		this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoCuentaContableTipo.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoCuentaContableTipoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoCuentaContableTipo = new TipoCuentaContableTipoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Cuenta Contable Tipo DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Cuenta Contable Tipo DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Cuenta Contable Tipo Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoCuentaContableTipoModel tipocuentacontabletipoModel=new TipoCuentaContableTipoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoCuentaContableTipoModel.TipoCuentaContableTipoFocusTraversalPolicy tipocuentacontabletipoFocusTraversalPolicy = tipocuentacontabletipoModel.new TipoCuentaContableTipoFocusTraversalPolicy(this);
			
			//tipocuentacontabletipoFocusTraversalPolicy.settipocuentacontabletipoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipocuentacontabletipoModel);
			
			
			this.jContentPaneDetalleTipoCuentaContableTipo = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoCuentaContableTipo = new GridBagLayout();	
			this.jContentPaneDetalleTipoCuentaContableTipo.setLayout(gridaBagLayoutDetalleTipoCuentaContableTipo);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoCuentaContableTipo = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
				this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoCuentaContableTipo.gridx = 0;
					
				
				this.jContentPaneDetalleTipoCuentaContableTipo.add(jTtoolBarDetalleTipoCuentaContableTipo, gridBagConstraintsTipoCuentaContableTipo);								
				
}
			
			this.jScrollPanelDatosEdicionTipoCuentaContableTipo=   new JScrollPane(jContentPaneDetalleTipoCuentaContableTipo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCuentaContableTipo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCuentaContableTipo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCuentaContableTipo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoCuentaContableTipo=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoCuentaContableTipo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCuentaContableTipo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoCuentaContableTipo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoCuentaContableTipo.gridx = 0;
	        
			this.jContentPaneDetalleTipoCuentaContableTipo.add(jPanelCamposTipoCuentaContableTipo, gridBagConstraintsTipoCuentaContableTipo);
			
			
			
			
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
						&& tipocuentacontabletipoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameCuentaContableTipo(this.puedeCargarPorParteCuentaContableTipo,false,-1);
					
					if(this.tipocuentacontabletipoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoCuentaContableTipo= new GridBagConstraints();
						this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoCuentaContableTipo.gridx = 0;
						this.jContentPaneDetalleTipoCuentaContableTipo.add(this.jTabbedPaneRelacionesTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoCuentaContableTipo.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameCuentaContableTipo(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoCuentaContableTipo.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
					this.gridBagConstraintsTipoCuentaContableTipo.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoCuentaContableTipo.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoCuentaContableTipo.gridx = 0;
					
				
					this.jContentPaneDetalleTipoCuentaContableTipo.add(jPanelCamposOcultosTipoCuentaContableTipo, gridBagConstraintsTipoCuentaContableTipo);
				
					this.jPanelCamposOcultosTipoCuentaContableTipo.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoCuentaContableTipo.gridx = 0;
	        this.gridBagConstraintsTipoCuentaContableTipo.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoCuentaContableTipo.add(this.jPanelAccionesFormularioTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);							
			
			
			
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
	        this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoCuentaContableTipo.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoCuentaContableTipo.add(this.jPanelAccionesTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoCuentaContableTipo);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoCuentaContableTipo=   new JScrollPane(this.jPanelCamposTipoCuentaContableTipo,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoCuentaContableTipo.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCuentaContableTipo.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoCuentaContableTipo.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = 0;
			this.gridBagConstraintsTipoCuentaContableTipo.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoCuentaContableTipo.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoCuentaContableTipo.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);			
			
			this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
			this.gridBagConstraintsTipoCuentaContableTipo.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoCuentaContableTipo.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
			
			
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaContableTipo.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
		
			
		this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
		this.gridBagConstraintsTipoCuentaContableTipo.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoCuentaContableTipo.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoCuentaContableTipo, this.gridBagConstraintsTipoCuentaContableTipo);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoCuentaContableTipo;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoCuentaContableTipo;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameCuentaContableTipo(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.cuentacontabletipoSessionBean=new CuentaContableTipoSessionBean();
		this.cuentacontabletipoSessionBean.setConGuardarRelaciones(false);
		this.cuentacontabletipoSessionBean.setEsGuardarRelacionado(true);

		this.cuentacontabletipoBeanSwingJInternalFrame=null;//new CuentaContableTipoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.cuentacontabletipoBeanSwingJInternalFramePopup=new CuentaContableTipoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.cuentacontabletipoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {

				CuentaContableTipoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoCuentaContableTipoJInternalFrame.STIPO_TAMANIO_GENERAL;
				CuentaContableTipoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoCuentaContableTipoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.cuentacontabletipoSessionBean.setEsGuardarRelacionado(true);

				this.cuentacontabletipoBeanSwingJInternalFrame=new CuentaContableTipoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.cuentacontabletipoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.cuentacontabletipoBeanSwingJInternalFrame.setcuentacontabletipoSessionBean(this.cuentacontabletipoSessionBean);

				//this.gridBagConstraintsTipoCuentaContableTipo = new GridBagConstraints();
				//this.gridBagConstraintsTipoCuentaContableTipo.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoCuentaContableTipo.gridx = 0;
				//this.jContentPaneDetalleTipoCuentaContableTipo.add(this.cuentacontabletipoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoCuentaContableTipo);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoCuentaContableTipo.add("Cuenta Contable Tipos",this.cuentacontabletipoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoCuentaContableTipo.setComponentAt(iIndexTab,this.cuentacontabletipoBeanSwingJInternalFrame.getContentPane());
				}

				//CuentaContableTipoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.cuentacontabletipoSessionBean.setEsGuardarRelacionado(false);
				this.cuentacontabletipoBeanSwingJInternalFrame=null;//new CuentaContableTipoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.cuentacontabletipoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteCuentaContableTipo) {
					this.jTabbedPaneRelacionesTipoCuentaContableTipo.add("Cuenta Contable Tipos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarCuentaContableTipoBeanSwingJInternalFrame(List<TipoCuentaContableTipo> tipocuentacontabletipos,TipoCuentaContableTipo tipocuentacontabletipo,CuentaContableTipoBeanSwingJInternalFrame cuentacontabletipoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//cuentacontabletipoBeanSwingJInternalFrame=new CuentaContableTipoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					cuentacontabletipoBeanSwingJInternalFrame.getCuentaContableTipoLogic().setConnexion(this.tipocuentacontabletipoLogic.getConnexion());

					cuentacontabletipoBeanSwingJInternalFrame.settipocuentacontabletiposForeignKey(tipocuentacontabletipos);
					cuentacontabletipoBeanSwingJInternalFrame.settipocuentacontabletipoForeignKey(tipocuentacontabletipo);
					cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoSessionBean.setisBusquedaDesdeForeignKeySesionTipoCuentaContableTipo(true);
					cuentacontabletipoBeanSwingJInternalFrame.cuentacontabletipoSessionBean.setlidTipoCuentaContableTipoActual(tipocuentacontabletipo.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					cuentacontabletipoBeanSwingJInternalFrame.cargarCombosForeignKeyCuentaContableTipo(cuentacontabletipoBeanSwingJInternalFrame.isCargarCombosDependencia);
					cuentacontabletipoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoCuentaContableTipo(true);
					cuentacontabletipoBeanSwingJInternalFrame.setid_tipo_cuenta_contable_tipoFK_IdTipoCuentaContableTipo(tipocuentacontabletipo.getId());

					if(!this.conCargarFormDetalle) {
						cuentacontabletipoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					cuentacontabletipoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoCuentaContableTipoForeignKey(tipocuentacontabletipo,1,false,true,true);
					cuentacontabletipoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					cuentacontabletipoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoCuentaContableTipo");
					cuentacontabletipoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoCuentaContableTipo");
					cuentacontabletipoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCuentaContableTipo(true);
					cuentacontabletipoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesCuentaContableTipo("n",cuentacontabletipoBeanSwingJInternalFrame.isGuardarCambiosEnLote, cuentacontabletipoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					cuentacontabletipoBeanSwingJInternalFrame.setAutoscrolls(true);
					cuentacontabletipoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						cuentacontabletipoBeanSwingJInternalFrame.actualizarEstadoPanelsCuentaContableTipo("relacionado");
					} else {
						cuentacontabletipoBeanSwingJInternalFrame.actualizarEstadoPanelsCuentaContableTipo("no_relacionado");
					}

					cuentacontabletipoBeanSwingJInternalFrame.getjButtonRecargarInformacionCuentaContableTipo().setVisible(false);

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
