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


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.TipoDevolucionEmpresaConstantesFunciones;

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
public class TipoDevolucionEmpresaDetalleFormJInternalFrame extends TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoDevolucionEmpresa;
	
	protected JMenuBar jmenuBarDetalleTipoDevolucionEmpresa;
	
	protected JMenu jmenuDetalleTipoDevolucionEmpresa;
	protected JMenu jmenuDetalleArchivoTipoDevolucionEmpresa;
	protected JMenu jmenuDetalleAccionesTipoDevolucionEmpresa;
	protected JMenu jmenuDetalleDatosTipoDevolucionEmpresa;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoDevolucionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDevolucionEmpresa;	
	protected GridBagConstraints gridBagConstraintsTipoDevolucionEmpresa;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoDevolucionEmpresa;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoDevolucionEmpresaSessionBean tipodevolucionempresaSessionBean;
	
	

	public DetaNotaCreditoSoliBeanSwingJInternalFrame detanotacreditosoliBeanSwingJInternalFrame=null;
	public DetaNotaCreditoSoliBeanSwingJInternalFrame detanotacreditosoliBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetaNotaCreditoSoli=false;
	public DetaNotaCreditoSoliSessionBean detanotacreditosoliSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoDevolucionEmpresaLogic tipodevolucionempresaLogic;
	
	public JScrollPane jScrollPanelDatosTipoDevolucionEmpresa;
	public JScrollPane jScrollPanelDatosEdicionTipoDevolucionEmpresa;
	public JScrollPane jScrollPanelDatosGeneralTipoDevolucionEmpresa;
	
	protected JPanel jPanelCamposTipoDevolucionEmpresa;    
	protected JPanel jPanelCamposOcultosTipoDevolucionEmpresa;    	
	protected JPanel jPanelAccionesTipoDevolucionEmpresa;
	protected JPanel jPanelAccionesFormularioTipoDevolucionEmpresa;
    
	
	
	protected Integer iXPanelCamposTipoDevolucionEmpresa=0;
	protected Integer iYPanelCamposTipoDevolucionEmpresa=0;
	
	protected Integer iXPanelCamposOcultosTipoDevolucionEmpresa=0;
	protected Integer iYPanelCamposOcultosTipoDevolucionEmpresa=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoDevolucionEmpresa;
	public JButton jButtonModificarTipoDevolucionEmpresa;
	public JButton jButtonActualizarTipoDevolucionEmpresa;
    public JButton jButtonEliminarTipoDevolucionEmpresa;
	public JButton jButtonCancelarTipoDevolucionEmpresa;
    public JButton jButtonGuardarCambiosTipoDevolucionEmpresa;
	public JButton jButtonGuardarCambiosTablaTipoDevolucionEmpresa;
	protected JButton jButtonCerrarTipoDevolucionEmpresa;
	
	
	protected JButton jButtonProcesarInformacionTipoDevolucionEmpresa;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoDevolucionEmpresa;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoDevolucionEmpresa;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoDevolucionEmpresa;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDevolucionEmpresa;
	protected JButton jButtonModificarToolBarTipoDevolucionEmpresa;
	protected JButton jButtonActualizarToolBarTipoDevolucionEmpresa;
    protected JButton jButtonEliminarToolBarTipoDevolucionEmpresa;
	protected JButton jButtonCancelarToolBarTipoDevolucionEmpresa;
    protected JButton jButtonGuardarCambiosToolBarTipoDevolucionEmpresa;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoDevolucionEmpresa;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDevolucionEmpresa;
	protected JButton jButtonCerrarToolBarTipoDevolucionEmpresa;
	
	protected JButton jButtonProcesarInformacionToolBarTipoDevolucionEmpresa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDevolucionEmpresa;
	protected JMenuItem jMenuItemModificarTipoDevolucionEmpresa;
	protected JMenuItem jMenuItemActualizarTipoDevolucionEmpresa;
    protected JMenuItem jMenuItemEliminarTipoDevolucionEmpresa;
	protected JMenuItem jMenuItemCancelarTipoDevolucionEmpresa;
    protected JMenuItem jMenuItemGuardarCambiosTipoDevolucionEmpresa;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDevolucionEmpresa;
	protected JMenuItem jMenuItemCerrarTipoDevolucionEmpresa;
	protected JMenuItem jMenuItemDetalleCerrarTipoDevolucionEmpresa;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDevolucionEmpresa;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoDevolucionEmpresa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDevolucionEmpresa;
	protected JMenuItem jMenuItemMostrarOcultarTipoDevolucionEmpresa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDevolucionEmpresa;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDevolucionEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDevolucionEmpresa;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoDevolucionEmpresa;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoDevolucionEmpresa;
	public JLabel jLabelIdTipoDevolucionEmpresa;
	public JLabel jLabelidTipoDevolucionEmpresa;
	public JButton jButtonidTipoDevolucionEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoDevolucionEmpresa;
	public JLabel jLabelcodigoTipoDevolucionEmpresa;
	public JTextField jTextFieldcodigoTipoDevolucionEmpresa;
	public JButton jButtoncodigoTipoDevolucionEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoDevolucionEmpresa;
	public JLabel jLabelnombreTipoDevolucionEmpresa;
	public JTextArea jTextAreanombreTipoDevolucionEmpresa;
	public JScrollPane jscrollPanenombreTipoDevolucionEmpresa;
	public JButton jButtonnombreTipoDevolucionEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoTipoDevolucionEmpresa;
	public JLabel jLabelesta_activoTipoDevolucionEmpresa;
	public JCheckBox jCheckBoxesta_activoTipoDevolucionEmpresa;
	public JButton jButtonesta_activoTipoDevolucionEmpresaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoDevolucionEmpresa;
	public JLabel jLabelid_empresaTipoDevolucionEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoDevolucionEmpresa;
	public JButton jButtonid_empresaTipoDevolucionEmpresa= new JButtonMe();
	public JButton jButtonid_empresaTipoDevolucionEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoDevolucionEmpresaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoDevolucionEmpresa;
	
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
	
	public TipoDevolucionEmpresaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoDevolucionEmpresa=new JPanel();
				this.jPanelAccionesFormularioTipoDevolucionEmpresa=new JPanel();
				this.jmenuBarDetalleTipoDevolucionEmpresa=new JMenuBar();
				this.jTtoolBarDetalleTipoDevolucionEmpresa=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDevolucionEmpresaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoDevolucionEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoDevolucionEmpresaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoDevolucionEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDevolucionEmpresaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDevolucionEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDevolucionEmpresaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDevolucionEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDevolucionEmpresaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDevolucionEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoDevolucionEmpresa() {
		return this.jButtonActualizarToolBarTipoDevolucionEmpresa;
	}
	
	public JButton getjButtonEliminarToolBarTipoDevolucionEmpresa() {
		return this.jButtonEliminarToolBarTipoDevolucionEmpresa;
	}
	
	public JButton getjButtonCancelarToolBarTipoDevolucionEmpresa() {
		return this.jButtonCancelarToolBarTipoDevolucionEmpresa;
	}		
	
	public JButton getjButtonProcesarInformacionTipoDevolucionEmpresa() {
		return this.jButtonProcesarInformacionTipoDevolucionEmpresa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDevolucionEmpresa)	{
		this.jButtonProcesarInformacionTipoDevolucionEmpresa = jButtonProcesarInformacionTipoDevolucionEmpresa;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDevolucionEmpresa() {
		return this.jComboBoxTiposAccionesTipoDevolucionEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDevolucionEmpresa(
			JComboBox jComboBoxTiposRelacionesTipoDevolucionEmpresa) {
		this.jComboBoxTiposRelacionesTipoDevolucionEmpresa = jComboBoxTiposRelacionesTipoDevolucionEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDevolucionEmpresa(
			JComboBox jComboBoxTiposAccionesTipoDevolucionEmpresa) {
		this.jComboBoxTiposAccionesTipoDevolucionEmpresa = jComboBoxTiposAccionesTipoDevolucionEmpresa;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoDevolucionEmpresa() {
		return this.jComboBoxTiposAccionesFormularioTipoDevolucionEmpresa;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoDevolucionEmpresa(
			JComboBox jComboBoxTiposAccionesFormularioTipoDevolucionEmpresa) {
		this.jComboBoxTiposAccionesFormularioTipoDevolucionEmpresa = jComboBoxTiposAccionesFormularioTipoDevolucionEmpresa;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipodevolucionempresaSessionBean=new TipoDevolucionEmpresaSessionBean();
		
		this.tipodevolucionempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodevolucionempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detanotacreditosoliSessionBean=new DetaNotaCreditoSoliSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDevolucionEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDevolucionEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDevolucionEmpresaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Devolucion Empresa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoDevolucionEmpresaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoDevolucionEmpresa= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoDevolucionEmpresa=new JButtonMe();
				this.jButtonModificarToolBarTipoDevolucionEmpresa=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoDevolucionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoDevolucionEmpresa,this.jTtoolBarDetalleTipoDevolucionEmpresa,
							"actualizar","actualizar","Actualizar"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoDevolucionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoDevolucionEmpresa,this.jTtoolBarDetalleTipoDevolucionEmpresa,
							"eliminar","eliminar","Eliminar"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoDevolucionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoDevolucionEmpresa,this.jTtoolBarDetalleTipoDevolucionEmpresa,
							"cancelar","cancelar","Cancelar"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoDevolucionEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoDevolucionEmpresa,this.jTtoolBarDetalleTipoDevolucionEmpresa,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoDevolucionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoDevolucionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoDevolucionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoDevolucionEmpresa=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoDevolucionEmpresa=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoDevolucionEmpresa=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoDevolucionEmpresa=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoDevolucionEmpresa=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDevolucionEmpresa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDevolucionEmpresa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDevolucionEmpresa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoDevolucionEmpresa= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoDevolucionEmpresa.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoDevolucionEmpresa,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoDevolucionEmpresa= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoDevolucionEmpresa.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoDevolucionEmpresa,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoDevolucionEmpresa= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoDevolucionEmpresa.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoDevolucionEmpresa,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoDevolucionEmpresa= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoDevolucionEmpresa.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoDevolucionEmpresa,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoDevolucionEmpresa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDevolucionEmpresa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDevolucionEmpresa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDevolucionEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDevolucionEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDevolucionEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoDevolucionEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoDevolucionEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoDevolucionEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDevolucionEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDevolucionEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDevolucionEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDevolucionEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDevolucionEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDevolucionEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoDevolucionEmpresa.add(this.jMenuItemDetalleCerrarTipoDevolucionEmpresa);
		
		this.jmenuDetalleAccionesTipoDevolucionEmpresa.add(this.jMenuItemActualizarTipoDevolucionEmpresa);
		this.jmenuDetalleAccionesTipoDevolucionEmpresa.add(this.jMenuItemEliminarTipoDevolucionEmpresa);
		this.jmenuDetalleAccionesTipoDevolucionEmpresa.add(this.jMenuItemCancelarTipoDevolucionEmpresa);		
		
		//this.jmenuDetalleDatosTipoDevolucionEmpresa.add(this.jMenuItemDetalleAbrirOrderByTipoDevolucionEmpresa);				
		this.jmenuDetalleDatosTipoDevolucionEmpresa.add(this.jMenuItemDetalleMostarOcultarTipoDevolucionEmpresa);				
				
		//this.jmenuDetalleAccionesTipoDevolucionEmpresa.add(this.jMenuItemGuardarCambiosTipoDevolucionEmpresa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoDevolucionEmpresa.add(this.jmenuDetalleArchivoTipoDevolucionEmpresa);		
		this.jmenuBarDetalleTipoDevolucionEmpresa.add(this.jmenuDetalleAccionesTipoDevolucionEmpresa);		
		this.jmenuBarDetalleTipoDevolucionEmpresa.add(this.jmenuDetalleDatosTipoDevolucionEmpresa);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoDevolucionEmpresa.add(this.jmenuDetalleTipoDevolucionEmpresa);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoDevolucionEmpresa);				
	}
	
	
	public void inicializarElementosCamposTipoDevolucionEmpresa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoDevolucionEmpresa = new JLabelMe();
		jLabelIdTipoDevolucionEmpresa.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoDevolucionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDevolucionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDevolucionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoDevolucionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoDevolucionEmpresa = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoDevolucionEmpresa.setToolTipText(TipoDevolucionEmpresaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoDevolucionEmpresa= new GridBagLayout();

		this.jPanelidTipoDevolucionEmpresa.setLayout(this.gridaBagLayoutTipoDevolucionEmpresa);

		jLabelidTipoDevolucionEmpresa = new JLabel();
		jLabelidTipoDevolucionEmpresa.setText("Id");

		jLabelidTipoDevolucionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoDevolucionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoDevolucionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoDevolucionEmpresa = new JLabelMe();
		this.jLabelcodigoTipoDevolucionEmpresa.setText(""+TipoDevolucionEmpresaConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoDevolucionEmpresa.setToolTipText("Codigo");
		this.jLabelcodigoTipoDevolucionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoDevolucionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoDevolucionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoDevolucionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoDevolucionEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoDevolucionEmpresa.setToolTipText(TipoDevolucionEmpresaConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoDevolucionEmpresa = new GridBagLayout();
		this.jPanelcodigoTipoDevolucionEmpresa.setLayout(this.gridaBagLayoutTipoDevolucionEmpresa);


		jTextFieldcodigoTipoDevolucionEmpresa= new JTextFieldMe();

		jTextFieldcodigoTipoDevolucionEmpresa.setEnabled(false);
		jTextFieldcodigoTipoDevolucionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoDevolucionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoDevolucionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoDevolucionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoDevolucionEmpresaBusqueda= new JButtonMe();
		this.jButtoncodigoTipoDevolucionEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoDevolucionEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoDevolucionEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoDevolucionEmpresaBusqueda.setText("U");
		this.jButtoncodigoTipoDevolucionEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoDevolucionEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoDevolucionEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoDevolucionEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoDevolucionEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoDevolucionEmpresaBusqueda"));

		if(this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoDevolucionEmpresaBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoDevolucionEmpresa = new JLabelMe();
		this.jLabelnombreTipoDevolucionEmpresa.setText(""+TipoDevolucionEmpresaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoDevolucionEmpresa.setToolTipText("Nombre");
		this.jLabelnombreTipoDevolucionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDevolucionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDevolucionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoDevolucionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoDevolucionEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoDevolucionEmpresa.setToolTipText(TipoDevolucionEmpresaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoDevolucionEmpresa = new GridBagLayout();
		this.jPanelnombreTipoDevolucionEmpresa.setLayout(this.gridaBagLayoutTipoDevolucionEmpresa);


		jTextAreanombreTipoDevolucionEmpresa= new JTextAreaMe();
		jTextAreanombreTipoDevolucionEmpresa.setEnabled(false);
		jTextAreanombreTipoDevolucionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDevolucionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDevolucionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDevolucionEmpresa.setLineWrap(true);
		jTextAreanombreTipoDevolucionEmpresa.setWrapStyleWord(true);
		jTextAreanombreTipoDevolucionEmpresa.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoDevolucionEmpresa.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoDevolucionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoDevolucionEmpresa = new JScrollPane(jTextAreanombreTipoDevolucionEmpresa);
		jscrollPanenombreTipoDevolucionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanenombreTipoDevolucionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanenombreTipoDevolucionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));

		this.jButtonnombreTipoDevolucionEmpresaBusqueda= new JButtonMe();
		this.jButtonnombreTipoDevolucionEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDevolucionEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDevolucionEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoDevolucionEmpresaBusqueda.setText("U");
		this.jButtonnombreTipoDevolucionEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoDevolucionEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoDevolucionEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoDevolucionEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoDevolucionEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoDevolucionEmpresaBusqueda"));

		if(this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoDevolucionEmpresaBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoTipoDevolucionEmpresa = new JLabelMe();
		this.jLabelesta_activoTipoDevolucionEmpresa.setText(""+TipoDevolucionEmpresaConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoTipoDevolucionEmpresa.setToolTipText("Esta Activo");
		this.jLabelesta_activoTipoDevolucionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoTipoDevolucionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoTipoDevolucionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoTipoDevolucionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoTipoDevolucionEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoTipoDevolucionEmpresa.setToolTipText(TipoDevolucionEmpresaConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutTipoDevolucionEmpresa = new GridBagLayout();
		this.jPanelesta_activoTipoDevolucionEmpresa.setLayout(this.gridaBagLayoutTipoDevolucionEmpresa);


		jCheckBoxesta_activoTipoDevolucionEmpresa= new JCheckBoxMe();
		jCheckBoxesta_activoTipoDevolucionEmpresa.setEnabled(false);

		jCheckBoxesta_activoTipoDevolucionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoTipoDevolucionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoTipoDevolucionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoTipoDevolucionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoTipoDevolucionEmpresaBusqueda= new JButtonMe();
		this.jButtonesta_activoTipoDevolucionEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoTipoDevolucionEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoTipoDevolucionEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoTipoDevolucionEmpresaBusqueda.setText("U");
		this.jButtonesta_activoTipoDevolucionEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoTipoDevolucionEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoTipoDevolucionEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoTipoDevolucionEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoTipoDevolucionEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoTipoDevolucionEmpresaBusqueda"));

		if(this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoTipoDevolucionEmpresaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoDevolucionEmpresa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoDevolucionEmpresa = new JLabelMe();
		this.jLabelid_empresaTipoDevolucionEmpresa.setText(""+TipoDevolucionEmpresaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoDevolucionEmpresa.setToolTipText("Empresa");
		this.jLabelid_empresaTipoDevolucionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoDevolucionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoDevolucionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoDevolucionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoDevolucionEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoDevolucionEmpresa.setToolTipText(TipoDevolucionEmpresaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoDevolucionEmpresa = new GridBagLayout();
		this.jPanelid_empresaTipoDevolucionEmpresa.setLayout(this.gridaBagLayoutTipoDevolucionEmpresa);


		jComboBoxid_empresaTipoDevolucionEmpresa= new JComboBoxMe();
		jComboBoxid_empresaTipoDevolucionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoDevolucionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoDevolucionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoDevolucionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoDevolucionEmpresa.setEnabled(false);

		this.jButtonid_empresaTipoDevolucionEmpresa= new JButtonMe();
		this.jButtonid_empresaTipoDevolucionEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoDevolucionEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoDevolucionEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoDevolucionEmpresa.setText("Buscar");
		this.jButtonid_empresaTipoDevolucionEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoDevolucionEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoDevolucionEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoDevolucionEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoDevolucionEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoDevolucionEmpresa"));

		this.jButtonid_empresaTipoDevolucionEmpresaBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoDevolucionEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDevolucionEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDevolucionEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoDevolucionEmpresaBusqueda.setText("U");
		this.jButtonid_empresaTipoDevolucionEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoDevolucionEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoDevolucionEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoDevolucionEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoDevolucionEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoDevolucionEmpresaBusqueda"));

		if(this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoDevolucionEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoDevolucionEmpresaUpdate= new JButtonMe();
		this.jButtonid_empresaTipoDevolucionEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDevolucionEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDevolucionEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoDevolucionEmpresaUpdate.setText("U");
		this.jButtonid_empresaTipoDevolucionEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoDevolucionEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoDevolucionEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoDevolucionEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoDevolucionEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoDevolucionEmpresaUpdate"));



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
		//this.jInternalFrameDetalleTipoDevolucionEmpresa = new TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Devolucion Empresa DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDevolucionEmpresa= new GridBagLayout();
		

		
		String sToolTipTipoDevolucionEmpresa="";
		sToolTipTipoDevolucionEmpresa=TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDevolucionEmpresa+="(Facturacion.TipoDevolucionEmpresa)";
		}
		
		if(!this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDevolucionEmpresa+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoDevolucionEmpresa = new JButtonMe();
		this.jButtonModificarTipoDevolucionEmpresa = new JButtonMe();
        this.jButtonActualizarTipoDevolucionEmpresa = new JButtonMe();
        this.jButtonEliminarTipoDevolucionEmpresa = new JButtonMe();
        this.jButtonCancelarTipoDevolucionEmpresa = new JButtonMe();
        this.jButtonGuardarCambiosTipoDevolucionEmpresa = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoDevolucionEmpresa = new JButtonMe();
		this.jButtonCerrarTipoDevolucionEmpresa = new JButtonMe();
		
		this.jScrollPanelDatosTipoDevolucionEmpresa = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoDevolucionEmpresa = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoDevolucionEmpresa = new JScrollPane();
				
		
		
		this.jPanelCamposTipoDevolucionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoDevolucionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoDevolucionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoDevolucionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Devolucion Empresa";
		
		if(!this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDevolucionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Devolucion Empresas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDevolucionEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoDevolucionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoDevolucionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoDevolucionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoDevolucionEmpresa.setName("jPanelCamposTipoDevolucionEmpresa"); 

		this.jPanelCamposOcultosTipoDevolucionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoDevolucionEmpresa.setName("jPanelCamposOcultosTipoDevolucionEmpresa"); 

        this.jPanelAccionesTipoDevolucionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDevolucionEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesTipoDevolucionEmpresa.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoDevolucionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoDevolucionEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoDevolucionEmpresa.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoDevolucionEmpresa.setText("Nuevo");
		this.jButtonModificarTipoDevolucionEmpresa.setText("Editar");
        this.jButtonActualizarTipoDevolucionEmpresa.setText("Actualizar");
        this.jButtonEliminarTipoDevolucionEmpresa.setText("Eliminar");
        this.jButtonCancelarTipoDevolucionEmpresa.setText("Cancelar");
        this.jButtonGuardarCambiosTipoDevolucionEmpresa.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoDevolucionEmpresa.setText("Guardar");
		this.jButtonCerrarTipoDevolucionEmpresa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDevolucionEmpresa,"nuevo_button","Nuevo",this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoDevolucionEmpresa,"modificar_button","Editar",this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoDevolucionEmpresa,"actualizar_button","Actualizar",this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoDevolucionEmpresa,"eliminar_button","Eliminar",this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoDevolucionEmpresa,"cancelar_button","Cancelar",this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoDevolucionEmpresa,"guardarcambios_button","Guardar",this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDevolucionEmpresa,"guardarcambiostabla_button","Guardar",this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDevolucionEmpresa,"cerrar_button","Salir",this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoDevolucionEmpresa.setToolTipText("Nuevo"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoDevolucionEmpresa.setToolTipText("Editar"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoDevolucionEmpresa.setToolTipText("Actualizar"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoDevolucionEmpresa.setToolTipText("Eliminar)"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoDevolucionEmpresa.setToolTipText("Cancelar"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoDevolucionEmpresa.setToolTipText("Guardar"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoDevolucionEmpresa.setToolTipText("Guardar"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDevolucionEmpresa.setToolTipText("Salir"+" "+TipoDevolucionEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDevolucionEmpresa";
		inputMap = this.jButtonNuevoTipoDevolucionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDevolucionEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDevolucionEmpresa"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoDevolucionEmpresa";
		inputMap = this.jButtonActualizarTipoDevolucionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoDevolucionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoDevolucionEmpresa"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoDevolucionEmpresa";
		inputMap = this.jButtonEliminarTipoDevolucionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoDevolucionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoDevolucionEmpresa"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoDevolucionEmpresa";
		inputMap = this.jButtonCancelarTipoDevolucionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoDevolucionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoDevolucionEmpresa"));
		
		//CERRAR		
		sMapKey = "CerrarTipoDevolucionEmpresa";
		inputMap = this.jButtonCerrarTipoDevolucionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDevolucionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDevolucionEmpresa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDevolucionEmpresa";
		inputMap = this.jButtonGuardarCambiosTablaTipoDevolucionEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDevolucionEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDevolucionEmpresa"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoDevolucionEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoDevolucionEmpresa.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoDevolucionEmpresa.setToolTipText("Nuevo TipoDevolucionEmpresa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoDevolucionEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoDevolucionEmpresa.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoDevolucionEmpresa.setToolTipText("Sin Cerrar Ventana TipoDevolucionEmpresa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoDevolucionEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoDevolucionEmpresa.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoDevolucionEmpresa.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoDevolucionEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDevolucionEmpresa.setText("Accion");
		this.jComboBoxTiposAccionesTipoDevolucionEmpresa.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoDevolucionEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoDevolucionEmpresa.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoDevolucionEmpresa.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoDevolucionEmpresa = new JLabelMe();
		
		this.jLabelAccionesTipoDevolucionEmpresa.setText("Acciones");		
		this.jLabelAccionesTipoDevolucionEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDevolucionEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDevolucionEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoDevolucionEmpresa();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoDevolucionEmpresa();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoDevolucionEmpresa=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoDevolucionEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoDevolucionEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoDevolucionEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDevolucionEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDevolucionEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoDevolucionEmpresa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDevolucionEmpresa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDevolucionEmpresa.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoDevolucionEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoDevolucionEmpresa = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoDevolucionEmpresa = new GridBagLayout();
		
		this.jPanelCamposTipoDevolucionEmpresa.setLayout(gridaBagLayoutCamposTipoDevolucionEmpresa);
		this.jPanelCamposOcultosTipoDevolucionEmpresa.setLayout(gridaBagLayoutCamposOcultosTipoDevolucionEmpresa);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 0;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;
	this.gridBagConstraintsTipoDevolucionEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoDevolucionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoDevolucionEmpresa.add(jLabelIdTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);



	this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 0;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 1;
	this.gridBagConstraintsTipoDevolucionEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoDevolucionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoDevolucionEmpresa.add(jLabelidTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);


	this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 0;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;
	this.gridBagConstraintsTipoDevolucionEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoDevolucionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoDevolucionEmpresa.add(jLabelid_empresaTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 0;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 2;
		this.gridBagConstraintsTipoDevolucionEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoDevolucionEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoDevolucionEmpresa.add(jButtonid_empresaTipoDevolucionEmpresaBusqueda, this.gridBagConstraintsTipoDevolucionEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 0;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 3;
		this.gridBagConstraintsTipoDevolucionEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoDevolucionEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoDevolucionEmpresa.add(jButtonid_empresaTipoDevolucionEmpresaUpdate, this.gridBagConstraintsTipoDevolucionEmpresa);
	}

	this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 0;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 1;
	this.gridBagConstraintsTipoDevolucionEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoDevolucionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoDevolucionEmpresa.add(jComboBoxid_empresaTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);


	this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 0;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;
	this.gridBagConstraintsTipoDevolucionEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoDevolucionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoDevolucionEmpresa.add(jLabelcodigoTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 0;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 2;
		this.gridBagConstraintsTipoDevolucionEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoDevolucionEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoDevolucionEmpresa.add(jButtoncodigoTipoDevolucionEmpresaBusqueda, this.gridBagConstraintsTipoDevolucionEmpresa);
	}

	this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 0;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 1;
	this.gridBagConstraintsTipoDevolucionEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoDevolucionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoDevolucionEmpresa.add(jTextFieldcodigoTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);


	this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 0;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;
	this.gridBagConstraintsTipoDevolucionEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoDevolucionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoDevolucionEmpresa.add(jLabelnombreTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 0;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 2;
		this.gridBagConstraintsTipoDevolucionEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoDevolucionEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoDevolucionEmpresa.add(jButtonnombreTipoDevolucionEmpresaBusqueda, this.gridBagConstraintsTipoDevolucionEmpresa);
	}

	this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 0;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 1;
	this.gridBagConstraintsTipoDevolucionEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoDevolucionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoDevolucionEmpresa.add(jscrollPanenombreTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);


	this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 0;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;
	this.gridBagConstraintsTipoDevolucionEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoDevolucionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoTipoDevolucionEmpresa.add(jLabelesta_activoTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 0;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 2;
		this.gridBagConstraintsTipoDevolucionEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoDevolucionEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoTipoDevolucionEmpresa.add(jButtonesta_activoTipoDevolucionEmpresaBusqueda, this.gridBagConstraintsTipoDevolucionEmpresa);
	}

	this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 0;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 1;
	this.gridBagConstraintsTipoDevolucionEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoDevolucionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoTipoDevolucionEmpresa.add(jCheckBoxesta_activoTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iYPanelCamposTipoDevolucionEmpresa;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iXPanelCamposTipoDevolucionEmpresa++;
	this.gridBagConstraintsTipoDevolucionEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDevolucionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDevolucionEmpresa.add(this.jPanelidTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);



	if(iXPanelCamposTipoDevolucionEmpresa % 1==0) {
		iXPanelCamposTipoDevolucionEmpresa=0;
		iYPanelCamposTipoDevolucionEmpresa++;
	}
	this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iYPanelCamposTipoDevolucionEmpresa;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iXPanelCamposTipoDevolucionEmpresa++;
	this.gridBagConstraintsTipoDevolucionEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDevolucionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDevolucionEmpresa.add(this.jPanelcodigoTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);



	if(iXPanelCamposTipoDevolucionEmpresa % 1==0) {
		iXPanelCamposTipoDevolucionEmpresa=0;
		iYPanelCamposTipoDevolucionEmpresa++;
	}
	this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iYPanelCamposTipoDevolucionEmpresa;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iXPanelCamposTipoDevolucionEmpresa++;
	this.gridBagConstraintsTipoDevolucionEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDevolucionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDevolucionEmpresa.add(this.jPanelnombreTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);



	if(iXPanelCamposTipoDevolucionEmpresa % 1==0) {
		iXPanelCamposTipoDevolucionEmpresa=0;
		iYPanelCamposTipoDevolucionEmpresa++;
	}
	this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iYPanelCamposTipoDevolucionEmpresa;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iXPanelCamposTipoDevolucionEmpresa++;
	this.gridBagConstraintsTipoDevolucionEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDevolucionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDevolucionEmpresa.add(this.jPanelesta_activoTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);



	if(iXPanelCamposTipoDevolucionEmpresa % 1==0) {
		iXPanelCamposTipoDevolucionEmpresa=0;
		iYPanelCamposTipoDevolucionEmpresa++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iYPanelCamposOcultosTipoDevolucionEmpresa;
	this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iXPanelCamposOcultosTipoDevolucionEmpresa++;
	this.gridBagConstraintsTipoDevolucionEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDevolucionEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoDevolucionEmpresa.add(this.jPanelid_empresaTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);



	if(iXPanelCamposOcultosTipoDevolucionEmpresa % 1==0) {
		iXPanelCamposOcultosTipoDevolucionEmpresa=0;
		iYPanelCamposOcultosTipoDevolucionEmpresa++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoDevolucionEmpresa= new GridBagLayout();
		this.jPanelAccionesTipoDevolucionEmpresa.setLayout(gridaBagLayoutAccionesTipoDevolucionEmpresa);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoDevolucionEmpresa= new GridBagLayout();
		this.jPanelAccionesFormularioTipoDevolucionEmpresa.setLayout(gridaBagLayoutAccionesFormularioTipoDevolucionEmpresa);
		
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDevolucionEmpresa.add(this.jComboBoxTiposAccionesFormularioTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);

		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDevolucionEmpresa.add(this.jCheckBoxPostAccionNuevoTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipodevolucionempresaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDevolucionEmpresa.add(this.jCheckBoxPostAccionSinCerrarTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipodevolucionempresaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDevolucionEmpresa.add(this.jCheckBoxPostAccionSinMensajeTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 0;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoDevolucionEmpresa.add(this.jButtonModificarTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);							

		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 0;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoDevolucionEmpresa.add(this.jButtonEliminarTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
		
			
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDevolucionEmpresa.add(this.jButtonActualizarTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);


		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDevolucionEmpresa.add(this.jButtonGuardarCambiosTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);	
		
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoDevolucionEmpresa.add(this.jButtonCancelarTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDevolucionEmpresa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDevolucionEmpresa);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodevolucionempresaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();						
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;		
			//this.gridBagConstraintsTipoDevolucionEmpresa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDevolucionEmpresa.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx =0;
		this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDevolucionEmpresa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoDevolucionEmpresaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoDevolucionEmpresa = new TipoDevolucionEmpresaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Devolucion Empresa DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Devolucion Empresa DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Devolucion Empresa Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoDevolucionEmpresaModel tipodevolucionempresaModel=new TipoDevolucionEmpresaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoDevolucionEmpresaModel.TipoDevolucionEmpresaFocusTraversalPolicy tipodevolucionempresaFocusTraversalPolicy = tipodevolucionempresaModel.new TipoDevolucionEmpresaFocusTraversalPolicy(this);
			
			//tipodevolucionempresaFocusTraversalPolicy.settipodevolucionempresaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipodevolucionempresaModel);
			
			
			this.jContentPaneDetalleTipoDevolucionEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoDevolucionEmpresa = new GridBagLayout();	
			this.jContentPaneDetalleTipoDevolucionEmpresa.setLayout(gridaBagLayoutDetalleTipoDevolucionEmpresa);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDevolucionEmpresa = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;
					
				
				this.jContentPaneDetalleTipoDevolucionEmpresa.add(jTtoolBarDetalleTipoDevolucionEmpresa, gridBagConstraintsTipoDevolucionEmpresa);								
				
}
			
			this.jScrollPanelDatosEdicionTipoDevolucionEmpresa=   new JScrollPane(jContentPaneDetalleTipoDevolucionEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDevolucionEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDevolucionEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDevolucionEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoDevolucionEmpresa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDevolucionEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDevolucionEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDevolucionEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;
	        
			this.jContentPaneDetalleTipoDevolucionEmpresa.add(jPanelCamposTipoDevolucionEmpresa, gridBagConstraintsTipoDevolucionEmpresa);
			
			
			
			
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
						&& tipodevolucionempresaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetaNotaCreditoSoli(this.puedeCargarPorParteDetaNotaCreditoSoli,false,-1);
					
					if(this.tipodevolucionempresaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoDevolucionEmpresa= new GridBagConstraints();
						this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;
						this.jContentPaneDetalleTipoDevolucionEmpresa.add(this.jTabbedPaneRelacionesTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoDevolucionEmpresa.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetaNotaCreditoSoli(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoDevolucionEmpresa.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
					this.gridBagConstraintsTipoDevolucionEmpresa.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;
					
				
					this.jContentPaneDetalleTipoDevolucionEmpresa.add(jPanelCamposOcultosTipoDevolucionEmpresa, gridBagConstraintsTipoDevolucionEmpresa);
				
					this.jPanelCamposOcultosTipoDevolucionEmpresa.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;
	        this.gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoDevolucionEmpresa.add(this.jPanelAccionesFormularioTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);							
			
			
			
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
	        this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoDevolucionEmpresa.add(this.jPanelAccionesTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoDevolucionEmpresa);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoDevolucionEmpresa=   new JScrollPane(this.jPanelCamposTipoDevolucionEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDevolucionEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDevolucionEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDevolucionEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;
			this.gridBagConstraintsTipoDevolucionEmpresa.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoDevolucionEmpresa.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoDevolucionEmpresa.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);			
			
			this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoDevolucionEmpresa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
			
			
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
		
			
		this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoDevolucionEmpresa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDevolucionEmpresa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDevolucionEmpresa, this.gridBagConstraintsTipoDevolucionEmpresa);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoDevolucionEmpresa;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoDevolucionEmpresa;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetaNotaCreditoSoli(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detanotacreditosoliSessionBean=new DetaNotaCreditoSoliSessionBean();
		this.detanotacreditosoliSessionBean.setConGuardarRelaciones(false);
		this.detanotacreditosoliSessionBean.setEsGuardarRelacionado(true);

		this.detanotacreditosoliBeanSwingJInternalFrame=null;//new DetaNotaCreditoSoliBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detanotacreditosoliBeanSwingJInternalFramePopup=new DetaNotaCreditoSoliBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detanotacreditosoliBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado()) {

				DetaNotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL=TipoDevolucionEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetaNotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoDevolucionEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detanotacreditosoliSessionBean.setEsGuardarRelacionado(true);

				this.detanotacreditosoliBeanSwingJInternalFrame=new DetaNotaCreditoSoliBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detanotacreditosoliBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detanotacreditosoliBeanSwingJInternalFrame.setdetanotacreditosoliSessionBean(this.detanotacreditosoliSessionBean);

				//this.gridBagConstraintsTipoDevolucionEmpresa = new GridBagConstraints();
				//this.gridBagConstraintsTipoDevolucionEmpresa.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoDevolucionEmpresa.gridx = 0;
				//this.jContentPaneDetalleTipoDevolucionEmpresa.add(this.detanotacreditosoliBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoDevolucionEmpresa);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoDevolucionEmpresa.add("Detalle  Solicitud Nota Credits",this.detanotacreditosoliBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoDevolucionEmpresa.setComponentAt(iIndexTab,this.detanotacreditosoliBeanSwingJInternalFrame.getContentPane());
				}

				//DetaNotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detanotacreditosoliSessionBean.setEsGuardarRelacionado(false);
				this.detanotacreditosoliBeanSwingJInternalFrame=null;//new DetaNotaCreditoSoliBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetaNotaCreditoSoli) {
					this.jTabbedPaneRelacionesTipoDevolucionEmpresa.add("Detalle  Solicitud Nota Credits",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetaNotaCreditoSoliBeanSwingJInternalFrame(List<TipoDevolucionEmpresa> tipodevolucionempresas,TipoDevolucionEmpresa tipodevolucionempresa,DetaNotaCreditoSoliBeanSwingJInternalFrame detanotacreditosoliBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detanotacreditosoliBeanSwingJInternalFrame=new DetaNotaCreditoSoliBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detanotacreditosoliBeanSwingJInternalFrame.getDetaNotaCreditoSoliLogic().setConnexion(this.tipodevolucionempresaLogic.getConnexion());

					detanotacreditosoliBeanSwingJInternalFrame.settipodevolucionempresasForeignKey(tipodevolucionempresas);
					detanotacreditosoliBeanSwingJInternalFrame.settipodevolucionempresaForeignKey(tipodevolucionempresa);
					detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliSessionBean.setisBusquedaDesdeForeignKeySesionTipoDevolucionEmpresa(true);
					detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliSessionBean.setlidTipoDevolucionEmpresaActual(tipodevolucionempresa.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detanotacreditosoliBeanSwingJInternalFrame.cargarCombosForeignKeyDetaNotaCreditoSoli(detanotacreditosoliBeanSwingJInternalFrame.isCargarCombosDependencia);
					detanotacreditosoliBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoDevolucionEmpresa(true);
					detanotacreditosoliBeanSwingJInternalFrame.setid_tipo_devolucion_empresaFK_IdTipoDevolucionEmpresa(tipodevolucionempresa.getId());

					if(!this.conCargarFormDetalle) {
						detanotacreditosoliBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detanotacreditosoliBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoDevolucionEmpresaForeignKey(tipodevolucionempresa,1,false,true,true);
					detanotacreditosoliBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detanotacreditosoliBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoDevolucionEmpresa");
					detanotacreditosoliBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoDevolucionEmpresa");
					detanotacreditosoliBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetaNotaCreditoSoli(true);
					detanotacreditosoliBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetaNotaCreditoSoli("n",detanotacreditosoliBeanSwingJInternalFrame.isGuardarCambiosEnLote, detanotacreditosoliBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detanotacreditosoliBeanSwingJInternalFrame.setAutoscrolls(true);
					detanotacreditosoliBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detanotacreditosoliBeanSwingJInternalFrame.actualizarEstadoPanelsDetaNotaCreditoSoli("relacionado");
					} else {
						detanotacreditosoliBeanSwingJInternalFrame.actualizarEstadoPanelsDetaNotaCreditoSoli("no_relacionado");
					}

					detanotacreditosoliBeanSwingJInternalFrame.getjButtonRecargarInformacionDetaNotaCreditoSoli().setVisible(false);

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
