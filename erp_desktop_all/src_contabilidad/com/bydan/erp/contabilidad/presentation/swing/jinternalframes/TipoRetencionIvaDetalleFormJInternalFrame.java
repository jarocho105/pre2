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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.TipoRetencionIvaConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class TipoRetencionIvaDetalleFormJInternalFrame extends TipoRetencionIvaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoRetencionIva;
	
	protected JMenuBar jmenuBarDetalleTipoRetencionIva;
	
	protected JMenu jmenuDetalleTipoRetencionIva;
	protected JMenu jmenuDetalleArchivoTipoRetencionIva;
	protected JMenu jmenuDetalleAccionesTipoRetencionIva;
	protected JMenu jmenuDetalleDatosTipoRetencionIva;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoRetencionIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoRetencionIva;	
	protected GridBagConstraints gridBagConstraintsTipoRetencionIva;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoRetencionIvaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoRetencionIva;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoRetencionIvaSessionBean tiporetencionivaSessionBean;
	
	

	public TransaccionLocalBeanSwingJInternalFrame transaccionlocalBeanSwingJInternalFrame=null;
	public TransaccionLocalBeanSwingJInternalFrame transaccionlocalBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTransaccionLocal=false;
	public TransaccionLocalSessionBean transaccionlocalSessionBean;

	public TarjetaCreditoBeanSwingJInternalFrame tarjetacreditoBeanSwingJInternalFrame=null;
	public TarjetaCreditoBeanSwingJInternalFrame tarjetacreditoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTarjetaCredito=false;
	public TarjetaCreditoSessionBean tarjetacreditoSessionBean;
	
		
	
	public TipoRetencionIvaLogic tiporetencionivaLogic;
	
	public JScrollPane jScrollPanelDatosTipoRetencionIva;
	public JScrollPane jScrollPanelDatosEdicionTipoRetencionIva;
	public JScrollPane jScrollPanelDatosGeneralTipoRetencionIva;
	
	protected JPanel jPanelCamposTipoRetencionIva;    
	protected JPanel jPanelCamposOcultosTipoRetencionIva;    	
	protected JPanel jPanelAccionesTipoRetencionIva;
	protected JPanel jPanelAccionesFormularioTipoRetencionIva;
    
	
	
	protected Integer iXPanelCamposTipoRetencionIva=0;
	protected Integer iYPanelCamposTipoRetencionIva=0;
	
	protected Integer iXPanelCamposOcultosTipoRetencionIva=0;
	protected Integer iYPanelCamposOcultosTipoRetencionIva=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoRetencionIva;
	public JButton jButtonModificarTipoRetencionIva;
	public JButton jButtonActualizarTipoRetencionIva;
    public JButton jButtonEliminarTipoRetencionIva;
	public JButton jButtonCancelarTipoRetencionIva;
    public JButton jButtonGuardarCambiosTipoRetencionIva;
	public JButton jButtonGuardarCambiosTablaTipoRetencionIva;
	protected JButton jButtonCerrarTipoRetencionIva;
	
	
	protected JButton jButtonProcesarInformacionTipoRetencionIva;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoRetencionIva;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoRetencionIva;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoRetencionIva;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoRetencionIva;
	protected JButton jButtonModificarToolBarTipoRetencionIva;
	protected JButton jButtonActualizarToolBarTipoRetencionIva;
    protected JButton jButtonEliminarToolBarTipoRetencionIva;
	protected JButton jButtonCancelarToolBarTipoRetencionIva;
    protected JButton jButtonGuardarCambiosToolBarTipoRetencionIva;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoRetencionIva;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoRetencionIva;
	protected JButton jButtonCerrarToolBarTipoRetencionIva;
	
	protected JButton jButtonProcesarInformacionToolBarTipoRetencionIva;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoRetencionIva;
	protected JMenuItem jMenuItemModificarTipoRetencionIva;
	protected JMenuItem jMenuItemActualizarTipoRetencionIva;
    protected JMenuItem jMenuItemEliminarTipoRetencionIva;
	protected JMenuItem jMenuItemCancelarTipoRetencionIva;
    protected JMenuItem jMenuItemGuardarCambiosTipoRetencionIva;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoRetencionIva;
	protected JMenuItem jMenuItemCerrarTipoRetencionIva;
	protected JMenuItem jMenuItemDetalleCerrarTipoRetencionIva;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoRetencionIva;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoRetencionIva;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoRetencionIva;
	protected JMenuItem jMenuItemMostrarOcultarTipoRetencionIva;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoRetencionIva;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoRetencionIva;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoRetencionIva;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoRetencionIva;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoRetencionIva;
	public JLabel jLabelIdTipoRetencionIva;
	public JTextFieldMe jTextFieldidTipoRetencionIva;
	public JButton jButtonidTipoRetencionIvaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoRetencionIva;
	public JLabel jLabelcodigoTipoRetencionIva;
	public JTextField jTextFieldcodigoTipoRetencionIva;
	public JButton jButtoncodigoTipoRetencionIvaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoRetencionIva;
	public JLabel jLabelnombreTipoRetencionIva;
	public JTextArea jTextAreanombreTipoRetencionIva;
	public JScrollPane jscrollPanenombreTipoRetencionIva;
	public JButton jButtonnombreTipoRetencionIvaBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoRetencionIva;
	
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
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoRetencionIvaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoRetencionIva=new JPanel();
				this.jPanelAccionesFormularioTipoRetencionIva=new JPanel();
				this.jmenuBarDetalleTipoRetencionIva=new JMenuBar();
				this.jTtoolBarDetalleTipoRetencionIva=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRetencionIvaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoRetencionIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoRetencionIvaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoRetencionIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRetencionIvaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRetencionIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRetencionIvaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoRetencionIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoRetencionIvaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoRetencionIva No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoRetencionIva() {
		return this.jButtonActualizarToolBarTipoRetencionIva;
	}
	
	public JButton getjButtonEliminarToolBarTipoRetencionIva() {
		return this.jButtonEliminarToolBarTipoRetencionIva;
	}
	
	public JButton getjButtonCancelarToolBarTipoRetencionIva() {
		return this.jButtonCancelarToolBarTipoRetencionIva;
	}		
	
	public JButton getjButtonProcesarInformacionTipoRetencionIva() {
		return this.jButtonProcesarInformacionTipoRetencionIva;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoRetencionIva)	{
		this.jButtonProcesarInformacionTipoRetencionIva = jButtonProcesarInformacionTipoRetencionIva;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoRetencionIva() {
		return this.jComboBoxTiposAccionesTipoRetencionIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoRetencionIva(
			JComboBox jComboBoxTiposRelacionesTipoRetencionIva) {
		this.jComboBoxTiposRelacionesTipoRetencionIva = jComboBoxTiposRelacionesTipoRetencionIva;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoRetencionIva(
			JComboBox jComboBoxTiposAccionesTipoRetencionIva) {
		this.jComboBoxTiposAccionesTipoRetencionIva = jComboBoxTiposAccionesTipoRetencionIva;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoRetencionIva() {
		return this.jComboBoxTiposAccionesFormularioTipoRetencionIva;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoRetencionIva(
			JComboBox jComboBoxTiposAccionesFormularioTipoRetencionIva) {
		this.jComboBoxTiposAccionesFormularioTipoRetencionIva = jComboBoxTiposAccionesFormularioTipoRetencionIva;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tiporetencionivaSessionBean=new TipoRetencionIvaSessionBean();
		
		this.tiporetencionivaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporetencionivaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tiporetencionivaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.transaccionlocalSessionBean=new TransaccionLocalSessionBean();
		//this.tarjetacreditoSessionBean=new TarjetaCreditoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoRetencionIvaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoRetencionIvaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoRetencionIvaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Retencion Iva MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoRetencionIvaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoRetencionIva= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoRetencionIva=new JButtonMe();
				this.jButtonModificarToolBarTipoRetencionIva=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoRetencionIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoRetencionIva,this.jTtoolBarDetalleTipoRetencionIva,
							"actualizar","actualizar","Actualizar"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoRetencionIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoRetencionIva,this.jTtoolBarDetalleTipoRetencionIva,
							"eliminar","eliminar","Eliminar"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoRetencionIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoRetencionIva,this.jTtoolBarDetalleTipoRetencionIva,
							"cancelar","cancelar","Cancelar"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoRetencionIva=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoRetencionIva,this.jTtoolBarDetalleTipoRetencionIva,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoRetencionIva,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoRetencionIva,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoRetencionIva,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoRetencionIva=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoRetencionIva=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoRetencionIva=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoRetencionIva=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoRetencionIva=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoRetencionIva= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoRetencionIva.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoRetencionIva,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoRetencionIva= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoRetencionIva.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoRetencionIva,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoRetencionIva= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoRetencionIva.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoRetencionIva,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoRetencionIva= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoRetencionIva.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoRetencionIva,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoRetencionIva= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoRetencionIva.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoRetencionIva,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoRetencionIva= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoRetencionIva.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoRetencionIva,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoRetencionIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoRetencionIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoRetencionIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoRetencionIva= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoRetencionIva.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoRetencionIva,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoRetencionIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoRetencionIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoRetencionIva,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoRetencionIva= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoRetencionIva.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoRetencionIva,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoRetencionIva.add(this.jMenuItemDetalleCerrarTipoRetencionIva);
		
		this.jmenuDetalleAccionesTipoRetencionIva.add(this.jMenuItemActualizarTipoRetencionIva);
		this.jmenuDetalleAccionesTipoRetencionIva.add(this.jMenuItemEliminarTipoRetencionIva);
		this.jmenuDetalleAccionesTipoRetencionIva.add(this.jMenuItemCancelarTipoRetencionIva);		
		
		//this.jmenuDetalleDatosTipoRetencionIva.add(this.jMenuItemDetalleAbrirOrderByTipoRetencionIva);				
		this.jmenuDetalleDatosTipoRetencionIva.add(this.jMenuItemDetalleMostarOcultarTipoRetencionIva);				
				
		//this.jmenuDetalleAccionesTipoRetencionIva.add(this.jMenuItemGuardarCambiosTipoRetencionIva);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoRetencionIva.add(this.jmenuDetalleArchivoTipoRetencionIva);		
		this.jmenuBarDetalleTipoRetencionIva.add(this.jmenuDetalleAccionesTipoRetencionIva);		
		this.jmenuBarDetalleTipoRetencionIva.add(this.jmenuDetalleDatosTipoRetencionIva);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoRetencionIva.add(this.jmenuDetalleTipoRetencionIva);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoRetencionIva);				
	}
	
	
	public void inicializarElementosCamposTipoRetencionIva() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoRetencionIva = new JLabelMe();
		jLabelIdTipoRetencionIva.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoRetencionIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoRetencionIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoRetencionIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoRetencionIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoRetencionIva = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoRetencionIva.setToolTipText(TipoRetencionIvaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoRetencionIva= new GridBagLayout();

		this.jPanelidTipoRetencionIva.setLayout(this.gridaBagLayoutTipoRetencionIva);

		jTextFieldidTipoRetencionIva = new JTextFieldMe();
		jTextFieldidTipoRetencionIva.setText("Id");

		jTextFieldidTipoRetencionIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoRetencionIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoRetencionIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoRetencionIva = new JLabelMe();
		this.jLabelcodigoTipoRetencionIva.setText(""+TipoRetencionIvaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoRetencionIva.setToolTipText("Codigo");
		this.jLabelcodigoTipoRetencionIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoRetencionIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoRetencionIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoRetencionIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoRetencionIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoRetencionIva.setToolTipText(TipoRetencionIvaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoRetencionIva = new GridBagLayout();
		this.jPanelcodigoTipoRetencionIva.setLayout(this.gridaBagLayoutTipoRetencionIva);


		jTextFieldcodigoTipoRetencionIva= new JTextFieldMe();

		jTextFieldcodigoTipoRetencionIva.setEnabled(false);
		jTextFieldcodigoTipoRetencionIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoRetencionIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoRetencionIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoRetencionIva,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoRetencionIvaBusqueda= new JButtonMe();
		this.jButtoncodigoTipoRetencionIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoRetencionIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoRetencionIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoRetencionIvaBusqueda.setText("U");
		this.jButtoncodigoTipoRetencionIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoRetencionIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoRetencionIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoRetencionIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoRetencionIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoRetencionIvaBusqueda"));

		if(this.tiporetencionivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoRetencionIvaBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoRetencionIva = new JLabelMe();
		this.jLabelnombreTipoRetencionIva.setText(""+TipoRetencionIvaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoRetencionIva.setToolTipText("Nombre");
		this.jLabelnombreTipoRetencionIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoRetencionIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoRetencionIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoRetencionIva,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoRetencionIva=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoRetencionIva.setToolTipText(TipoRetencionIvaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoRetencionIva = new GridBagLayout();
		this.jPanelnombreTipoRetencionIva.setLayout(this.gridaBagLayoutTipoRetencionIva);


		jTextAreanombreTipoRetencionIva= new JTextAreaMe();
		jTextAreanombreTipoRetencionIva.setEnabled(false);
		jTextAreanombreTipoRetencionIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRetencionIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRetencionIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoRetencionIva.setLineWrap(true);
		jTextAreanombreTipoRetencionIva.setWrapStyleWord(true);
		jTextAreanombreTipoRetencionIva.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoRetencionIva.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoRetencionIva,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoRetencionIva = new JScrollPane(jTextAreanombreTipoRetencionIva);
		jscrollPanenombreTipoRetencionIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoRetencionIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoRetencionIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoRetencionIvaBusqueda= new JButtonMe();
		this.jButtonnombreTipoRetencionIvaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoRetencionIvaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoRetencionIvaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoRetencionIvaBusqueda.setText("U");
		this.jButtonnombreTipoRetencionIvaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoRetencionIvaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoRetencionIvaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoRetencionIva.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoRetencionIva.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoRetencionIvaBusqueda"));

		if(this.tiporetencionivaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoRetencionIvaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoRetencionIva() {
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
		//this.jInternalFrameDetalleTipoRetencionIva = new TipoRetencionIvaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Retencion Iva DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoRetencionIva= new GridBagLayout();
		

		
		String sToolTipTipoRetencionIva="";
		sToolTipTipoRetencionIva=TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoRetencionIva+="(Contabilidad.TipoRetencionIva)";
		}
		
		if(!this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoRetencionIva+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoRetencionIva = new JButtonMe();
		this.jButtonModificarTipoRetencionIva = new JButtonMe();
        this.jButtonActualizarTipoRetencionIva = new JButtonMe();
        this.jButtonEliminarTipoRetencionIva = new JButtonMe();
        this.jButtonCancelarTipoRetencionIva = new JButtonMe();
        this.jButtonGuardarCambiosTipoRetencionIva = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoRetencionIva = new JButtonMe();
		this.jButtonCerrarTipoRetencionIva = new JButtonMe();
		
		this.jScrollPanelDatosTipoRetencionIva = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoRetencionIva = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoRetencionIva = new JScrollPane();
				
		
		
		this.jPanelCamposTipoRetencionIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoRetencionIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoRetencionIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoRetencionIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Retencion Iva";
		
		if(!this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoRetencionIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Retencion Ivas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoRetencionIva.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoRetencionIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoRetencionIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoRetencionIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoRetencionIva.setName("jPanelCamposTipoRetencionIva"); 

		this.jPanelCamposOcultosTipoRetencionIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoRetencionIva.setName("jPanelCamposOcultosTipoRetencionIva"); 

        this.jPanelAccionesTipoRetencionIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoRetencionIva.setToolTipText("Acciones");
        this.jPanelAccionesTipoRetencionIva.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoRetencionIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoRetencionIva.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoRetencionIva.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoRetencionIva.setText("Nuevo");
		this.jButtonModificarTipoRetencionIva.setText("Editar");
        this.jButtonActualizarTipoRetencionIva.setText("Actualizar");
        this.jButtonEliminarTipoRetencionIva.setText("Eliminar");
        this.jButtonCancelarTipoRetencionIva.setText("Cancelar");
        this.jButtonGuardarCambiosTipoRetencionIva.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoRetencionIva.setText("Guardar");
		this.jButtonCerrarTipoRetencionIva.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoRetencionIva,"nuevo_button","Nuevo",this.tiporetencionivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoRetencionIva,"modificar_button","Editar",this.tiporetencionivaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoRetencionIva,"actualizar_button","Actualizar",this.tiporetencionivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoRetencionIva,"eliminar_button","Eliminar",this.tiporetencionivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoRetencionIva,"cancelar_button","Cancelar",this.tiporetencionivaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoRetencionIva,"guardarcambios_button","Guardar",this.tiporetencionivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoRetencionIva,"guardarcambiostabla_button","Guardar",this.tiporetencionivaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoRetencionIva,"cerrar_button","Salir",this.tiporetencionivaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoRetencionIva.setToolTipText("Nuevo"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoRetencionIva.setToolTipText("Editar"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoRetencionIva.setToolTipText("Actualizar"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoRetencionIva.setToolTipText("Eliminar)"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoRetencionIva.setToolTipText("Cancelar"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoRetencionIva.setToolTipText("Guardar"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoRetencionIva.setToolTipText("Guardar"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoRetencionIva.setToolTipText("Salir"+" "+TipoRetencionIvaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoRetencionIva";
		inputMap = this.jButtonNuevoTipoRetencionIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoRetencionIva.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoRetencionIva"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoRetencionIva";
		inputMap = this.jButtonActualizarTipoRetencionIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoRetencionIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoRetencionIva"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoRetencionIva";
		inputMap = this.jButtonEliminarTipoRetencionIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoRetencionIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoRetencionIva"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoRetencionIva";
		inputMap = this.jButtonCancelarTipoRetencionIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoRetencionIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoRetencionIva"));
		
		//CERRAR		
		sMapKey = "CerrarTipoRetencionIva";
		inputMap = this.jButtonCerrarTipoRetencionIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoRetencionIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoRetencionIva"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoRetencionIva";
		inputMap = this.jButtonGuardarCambiosTablaTipoRetencionIva.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoRetencionIva.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoRetencionIva"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoRetencionIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoRetencionIva.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoRetencionIva.setToolTipText("Nuevo TipoRetencionIva");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoRetencionIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoRetencionIva.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoRetencionIva.setToolTipText("Sin Cerrar Ventana TipoRetencionIva");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoRetencionIva = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoRetencionIva.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoRetencionIva.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoRetencionIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoRetencionIva.setText("Accion");
		this.jComboBoxTiposAccionesTipoRetencionIva.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoRetencionIva = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoRetencionIva.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoRetencionIva.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoRetencionIva = new JLabelMe();
		
		this.jLabelAccionesTipoRetencionIva.setText("Acciones");		
		this.jLabelAccionesTipoRetencionIva.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRetencionIva.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoRetencionIva.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoRetencionIva();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoRetencionIva();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoRetencionIva=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoRetencionIva.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoRetencionIva,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoRetencionIva.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRetencionIva.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoRetencionIva.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoRetencionIva.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoRetencionIva.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoRetencionIva.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoRetencionIva, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoRetencionIva = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoRetencionIva = new GridBagLayout();
		
		this.jPanelCamposTipoRetencionIva.setLayout(gridaBagLayoutCamposTipoRetencionIva);
		this.jPanelCamposOcultosTipoRetencionIva.setLayout(gridaBagLayoutCamposOcultosTipoRetencionIva);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionIva.gridx = 0;
	this.gridBagConstraintsTipoRetencionIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoRetencionIva.add(jLabelIdTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);



	this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionIva.gridx = 1;
	this.gridBagConstraintsTipoRetencionIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoRetencionIva.add(jTextFieldidTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);


	this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionIva.gridx = 0;
	this.gridBagConstraintsTipoRetencionIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoRetencionIva.add(jLabelcodigoTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionIva.gridy = 0;
		this.gridBagConstraintsTipoRetencionIva.gridx = 2;
		this.gridBagConstraintsTipoRetencionIva.ipadx = 0;
		this.gridBagConstraintsTipoRetencionIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoRetencionIva.add(jButtoncodigoTipoRetencionIvaBusqueda, this.gridBagConstraintsTipoRetencionIva);
	}

	this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionIva.gridx = 1;
	this.gridBagConstraintsTipoRetencionIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoRetencionIva.add(jTextFieldcodigoTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);


	this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionIva.gridx = 0;
	this.gridBagConstraintsTipoRetencionIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoRetencionIva.add(jLabelnombreTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		//this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoRetencionIva.gridy = 0;
		this.gridBagConstraintsTipoRetencionIva.gridx = 2;
		this.gridBagConstraintsTipoRetencionIva.ipadx = 0;
		this.gridBagConstraintsTipoRetencionIva.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoRetencionIva.add(jButtonnombreTipoRetencionIvaBusqueda, this.gridBagConstraintsTipoRetencionIva);
	}

	this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoRetencionIva.gridy = 0;
	this.gridBagConstraintsTipoRetencionIva.gridx = 1;
	this.gridBagConstraintsTipoRetencionIva.ipadx = 0;
	this.gridBagConstraintsTipoRetencionIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoRetencionIva.add(jscrollPanenombreTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRetencionIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRetencionIva.gridy = iYPanelCamposTipoRetencionIva;
	this.gridBagConstraintsTipoRetencionIva.gridx = iXPanelCamposTipoRetencionIva++;
	this.gridBagConstraintsTipoRetencionIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRetencionIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRetencionIva.add(this.jPanelidTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);



	if(iXPanelCamposTipoRetencionIva % 1==0) {
		iXPanelCamposTipoRetencionIva=0;
		iYPanelCamposTipoRetencionIva++;
	}
	this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRetencionIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRetencionIva.gridy = iYPanelCamposTipoRetencionIva;
	this.gridBagConstraintsTipoRetencionIva.gridx = iXPanelCamposTipoRetencionIva++;
	this.gridBagConstraintsTipoRetencionIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRetencionIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRetencionIva.add(this.jPanelcodigoTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);



	if(iXPanelCamposTipoRetencionIva % 1==0) {
		iXPanelCamposTipoRetencionIva=0;
		iYPanelCamposTipoRetencionIva++;
	}
	this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
	this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoRetencionIva.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoRetencionIva.gridy = iYPanelCamposTipoRetencionIva;
	this.gridBagConstraintsTipoRetencionIva.gridx = iXPanelCamposTipoRetencionIva++;
	this.gridBagConstraintsTipoRetencionIva.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoRetencionIva.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoRetencionIva.add(this.jPanelnombreTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);



	if(iXPanelCamposTipoRetencionIva % 1==0) {
		iXPanelCamposTipoRetencionIva=0;
		iYPanelCamposTipoRetencionIva++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoRetencionIva= new GridBagLayout();
		this.jPanelAccionesTipoRetencionIva.setLayout(gridaBagLayoutAccionesTipoRetencionIva);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoRetencionIva= new GridBagLayout();
		this.jPanelAccionesFormularioTipoRetencionIva.setLayout(gridaBagLayoutAccionesFormularioTipoRetencionIva);
		
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoRetencionIva.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoRetencionIva.add(this.jComboBoxTiposAccionesFormularioTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);

		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoRetencionIva.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoRetencionIva.add(this.jCheckBoxPostAccionNuevoTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tiporetencionivaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoRetencionIva.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoRetencionIva.add(this.jCheckBoxPostAccionSinCerrarTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tiporetencionivaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tiporetencionivaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoRetencionIva.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoRetencionIva.add(this.jCheckBoxPostAccionSinMensajeTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencionIva.gridy = 0;
		this.gridBagConstraintsTipoRetencionIva.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoRetencionIva.add(this.jButtonModificarTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);							

		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoRetencionIva.gridy = 0;
		this.gridBagConstraintsTipoRetencionIva.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoRetencionIva.add(this.jButtonEliminarTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
		
			
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.gridy = 0;		
		this.gridBagConstraintsTipoRetencionIva.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoRetencionIva.add(this.jButtonActualizarTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);


		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.gridy = 0;		
		this.gridBagConstraintsTipoRetencionIva.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoRetencionIva.add(this.jButtonGuardarCambiosTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);	
		
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.gridy = 0;		
		this.gridBagConstraintsTipoRetencionIva.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoRetencionIva.add(this.jButtonCancelarTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoRetencionIva = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoRetencionIva);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tiporetencionivaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();						
			this.gridBagConstraintsTipoRetencionIva.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoRetencionIva.gridx = 0;		
			//this.gridBagConstraintsTipoRetencionIva.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoRetencionIva.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoRetencionIva.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoRetencionIva.gridx =0;
		this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoRetencionIva.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoRetencionIvaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoRetencionIva = new TipoRetencionIvaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Retencion Iva DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Retencion Iva DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Retencion Iva Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoRetencionIvaModel tiporetencionivaModel=new TipoRetencionIvaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoRetencionIvaModel.TipoRetencionIvaFocusTraversalPolicy tiporetencionivaFocusTraversalPolicy = tiporetencionivaModel.new TipoRetencionIvaFocusTraversalPolicy(this);
			
			//tiporetencionivaFocusTraversalPolicy.settiporetencionivaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tiporetencionivaModel);
			
			
			this.jContentPaneDetalleTipoRetencionIva = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoRetencionIva = new GridBagLayout();	
			this.jContentPaneDetalleTipoRetencionIva.setLayout(gridaBagLayoutDetalleTipoRetencionIva);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoRetencionIva = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
				this.gridBagConstraintsTipoRetencionIva.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoRetencionIva.gridx = 0;
					
				
				this.jContentPaneDetalleTipoRetencionIva.add(jTtoolBarDetalleTipoRetencionIva, gridBagConstraintsTipoRetencionIva);								
				
}
			
			this.jScrollPanelDatosEdicionTipoRetencionIva=   new JScrollPane(jContentPaneDetalleTipoRetencionIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoRetencionIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRetencionIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRetencionIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoRetencionIva=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoRetencionIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRetencionIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoRetencionIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoRetencionIva.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoRetencionIva.gridx = 0;
	        
			this.jContentPaneDetalleTipoRetencionIva.add(jPanelCamposTipoRetencionIva, gridBagConstraintsTipoRetencionIva);
			
			
			
			
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
						&& tiporetencionivaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameTarjetaCredito(this.puedeCargarPorParteTarjetaCredito,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTransaccionLocal(this.puedeCargarPorParteTransaccionLocal,false,-1);
					
					if(this.tiporetencionivaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoRetencionIva= new GridBagConstraints();
						this.gridBagConstraintsTipoRetencionIva.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoRetencionIva.gridx = 0;
						this.jContentPaneDetalleTipoRetencionIva.add(this.jTabbedPaneRelacionesTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoRetencionIva.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameTarjetaCredito(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTransaccionLocal(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoRetencionIva.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
					this.gridBagConstraintsTipoRetencionIva.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoRetencionIva.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoRetencionIva.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoRetencionIva.gridx = 0;
					
				
					this.jContentPaneDetalleTipoRetencionIva.add(jPanelCamposOcultosTipoRetencionIva, gridBagConstraintsTipoRetencionIva);
				
					this.jPanelCamposOcultosTipoRetencionIva.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsTipoRetencionIva.gridx = 0;
	        this.gridBagConstraintsTipoRetencionIva.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoRetencionIva.add(this.jPanelAccionesFormularioTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);							
			
			
			
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
	        this.gridBagConstraintsTipoRetencionIva.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsTipoRetencionIva.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoRetencionIva.add(this.jPanelAccionesTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoRetencionIva);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoRetencionIva=   new JScrollPane(this.jPanelCamposTipoRetencionIva,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoRetencionIva.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRetencionIva.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoRetencionIva.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoRetencionIva.gridx = 0;
			this.gridBagConstraintsTipoRetencionIva.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoRetencionIva.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoRetencionIva.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoRetencionIva.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);			
			
			this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
			this.gridBagConstraintsTipoRetencionIva.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoRetencionIva.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRetencionIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
			
			
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoRetencionIva.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
		
			
		this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
		this.gridBagConstraintsTipoRetencionIva.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoRetencionIva.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoRetencionIva, this.gridBagConstraintsTipoRetencionIva);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoRetencionIva;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoRetencionIva;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameTarjetaCredito(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.tarjetacreditoSessionBean=new TarjetaCreditoSessionBean();
		this.tarjetacreditoSessionBean.setConGuardarRelaciones(false);
		this.tarjetacreditoSessionBean.setEsGuardarRelacionado(true);

		this.tarjetacreditoBeanSwingJInternalFrame=null;//new TarjetaCreditoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.tarjetacreditoBeanSwingJInternalFramePopup=new TarjetaCreditoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.tarjetacreditoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado()) {

				TarjetaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoRetencionIvaJInternalFrame.STIPO_TAMANIO_GENERAL;
				TarjetaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoRetencionIvaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.tarjetacreditoSessionBean.setEsGuardarRelacionado(true);

				this.tarjetacreditoBeanSwingJInternalFrame=new TarjetaCreditoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.tarjetacreditoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.tarjetacreditoBeanSwingJInternalFrame.settarjetacreditoSessionBean(this.tarjetacreditoSessionBean);

				//this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
				//this.gridBagConstraintsTipoRetencionIva.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoRetencionIva.gridx = 0;
				//this.jContentPaneDetalleTipoRetencionIva.add(this.tarjetacreditoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoRetencionIva);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoRetencionIva.add("Tarjeta Creditos",this.tarjetacreditoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoRetencionIva.setComponentAt(iIndexTab,this.tarjetacreditoBeanSwingJInternalFrame.getContentPane());
				}

				//TarjetaCreditoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.tarjetacreditoSessionBean.setEsGuardarRelacionado(false);
				this.tarjetacreditoBeanSwingJInternalFrame=null;//new TarjetaCreditoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.tarjetacreditoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTarjetaCredito) {
					this.jTabbedPaneRelacionesTipoRetencionIva.add("Tarjeta Creditos",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameTransaccionLocal(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.transaccionlocalSessionBean=new TransaccionLocalSessionBean();
		this.transaccionlocalSessionBean.setConGuardarRelaciones(false);
		this.transaccionlocalSessionBean.setEsGuardarRelacionado(true);

		this.transaccionlocalBeanSwingJInternalFrame=null;//new TransaccionLocalBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.transaccionlocalBeanSwingJInternalFramePopup=new TransaccionLocalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.transaccionlocalBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.transaccionlocalSessionBean.getEsGuardarRelacionado()) {

				TransaccionLocalJInternalFrame.STIPO_TAMANIO_GENERAL=TipoRetencionIvaJInternalFrame.STIPO_TAMANIO_GENERAL;
				TransaccionLocalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoRetencionIvaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.transaccionlocalSessionBean.setEsGuardarRelacionado(true);

				this.transaccionlocalBeanSwingJInternalFrame=new TransaccionLocalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.transaccionlocalBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.transaccionlocalBeanSwingJInternalFrame.settransaccionlocalSessionBean(this.transaccionlocalSessionBean);

				//this.gridBagConstraintsTipoRetencionIva = new GridBagConstraints();
				//this.gridBagConstraintsTipoRetencionIva.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoRetencionIva.gridx = 0;
				//this.jContentPaneDetalleTipoRetencionIva.add(this.transaccionlocalBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoRetencionIva);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoRetencionIva.add("Transaccion Locales",this.transaccionlocalBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoRetencionIva.setComponentAt(iIndexTab,this.transaccionlocalBeanSwingJInternalFrame.getContentPane());
				}

				//TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.transaccionlocalSessionBean.setEsGuardarRelacionado(false);
				this.transaccionlocalBeanSwingJInternalFrame=null;//new TransaccionLocalBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.transaccionlocalSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTransaccionLocal) {
					this.jTabbedPaneRelacionesTipoRetencionIva.add("Transaccion Locales",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarTransaccionLocalBeanSwingJInternalFrame(List<TipoRetencionIva> tiporetencionivas,TipoRetencionIva tiporetencioniva,TransaccionLocalBeanSwingJInternalFrame transaccionlocalBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//transaccionlocalBeanSwingJInternalFrame=new TransaccionLocalBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					transaccionlocalBeanSwingJInternalFrame.getTransaccionLocalLogic().setConnexion(this.tiporetencionivaLogic.getConnexion());

					transaccionlocalBeanSwingJInternalFrame.settiporetencionivasForeignKey(tiporetencionivas);
					transaccionlocalBeanSwingJInternalFrame.settiporetencionivaForeignKey(tiporetencioniva);
					transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setisBusquedaDesdeForeignKeySesionTipoRetencionIva(true);
					transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setlidTipoRetencionIvaActual(tiporetencioniva.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					transaccionlocalBeanSwingJInternalFrame.cargarCombosForeignKeyTransaccionLocal(transaccionlocalBeanSwingJInternalFrame.isCargarCombosDependencia);
					transaccionlocalBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoRetencionIva(true);
					transaccionlocalBeanSwingJInternalFrame.setid_tipo_retencion_ivaFK_IdTipoRetencionIva(tiporetencioniva.getId());

					if(!this.conCargarFormDetalle) {
						transaccionlocalBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					transaccionlocalBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoRetencionIvaForeignKey(tiporetencioniva,1,false,true,true);
					transaccionlocalBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					transaccionlocalBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoRetencionIva");
					transaccionlocalBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoRetencionIva");
					transaccionlocalBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccionLocal(true);
					transaccionlocalBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTransaccionLocal("n",transaccionlocalBeanSwingJInternalFrame.isGuardarCambiosEnLote, transaccionlocalBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					transaccionlocalBeanSwingJInternalFrame.setAutoscrolls(true);
					transaccionlocalBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						transaccionlocalBeanSwingJInternalFrame.actualizarEstadoPanelsTransaccionLocal("relacionado");
					} else {
						transaccionlocalBeanSwingJInternalFrame.actualizarEstadoPanelsTransaccionLocal("no_relacionado");
					}

					transaccionlocalBeanSwingJInternalFrame.getjButtonRecargarInformacionTransaccionLocal().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarTarjetaCreditoBeanSwingJInternalFrame(List<TipoRetencionIva> tiporetencionivas,TipoRetencionIva tiporetencioniva,TarjetaCreditoBeanSwingJInternalFrame tarjetacreditoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//tarjetacreditoBeanSwingJInternalFrame=new TarjetaCreditoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					tarjetacreditoBeanSwingJInternalFrame.getTarjetaCreditoLogic().setConnexion(this.tiporetencionivaLogic.getConnexion());

					tarjetacreditoBeanSwingJInternalFrame.settiporetencionivasForeignKey(tiporetencionivas);
					tarjetacreditoBeanSwingJInternalFrame.settiporetencionivaForeignKey(tiporetencioniva);
					tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.setisBusquedaDesdeForeignKeySesionTipoRetencionIva(true);
					tarjetacreditoBeanSwingJInternalFrame.tarjetacreditoSessionBean.setlidTipoRetencionIvaActual(tiporetencioniva.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					tarjetacreditoBeanSwingJInternalFrame.cargarCombosForeignKeyTarjetaCredito(tarjetacreditoBeanSwingJInternalFrame.isCargarCombosDependencia);
					tarjetacreditoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoRetencionIva(true);
					tarjetacreditoBeanSwingJInternalFrame.setid_tipo_retencion_ivaFK_IdTipoRetencionIva(tiporetencioniva.getId());

					if(!this.conCargarFormDetalle) {
						tarjetacreditoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					tarjetacreditoBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoRetencionIvaForeignKey(tiporetencioniva,1,false,true,true);
					tarjetacreditoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					tarjetacreditoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoRetencionIva");
					tarjetacreditoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoRetencionIva");
					tarjetacreditoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTarjetaCredito(true);
					tarjetacreditoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTarjetaCredito("n",tarjetacreditoBeanSwingJInternalFrame.isGuardarCambiosEnLote, tarjetacreditoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					tarjetacreditoBeanSwingJInternalFrame.setAutoscrolls(true);
					tarjetacreditoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						tarjetacreditoBeanSwingJInternalFrame.actualizarEstadoPanelsTarjetaCredito("relacionado");
					} else {
						tarjetacreditoBeanSwingJInternalFrame.actualizarEstadoPanelsTarjetaCredito("no_relacionado");
					}

					tarjetacreditoBeanSwingJInternalFrame.getjButtonRecargarInformacionTarjetaCredito().setVisible(false);

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
