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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.TipoValoracionConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class TipoValoracionDetalleFormJInternalFrame extends TipoValoracionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoValoracion;
	
	protected JMenuBar jmenuBarDetalleTipoValoracion;
	
	protected JMenu jmenuDetalleTipoValoracion;
	protected JMenu jmenuDetalleArchivoTipoValoracion;
	protected JMenu jmenuDetalleAccionesTipoValoracion;
	protected JMenu jmenuDetalleDatosTipoValoracion;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoValoracion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoValoracion;	
	protected GridBagConstraints gridBagConstraintsTipoValoracion;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoValoracionBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoValoracion;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoValoracionSessionBean tipovaloracionSessionBean;
	
	

	public ReferenciaBancariaBeanSwingJInternalFrame referenciabancariaBeanSwingJInternalFrame=null;
	public ReferenciaBancariaBeanSwingJInternalFrame referenciabancariaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteReferenciaBancaria=false;
	public ReferenciaBancariaSessionBean referenciabancariaSessionBean;

	public LunaSistemaSolarBeanSwingJInternalFrame lunasistemasolarBeanSwingJInternalFrame=null;
	public LunaSistemaSolarBeanSwingJInternalFrame lunasistemasolarBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteLunaSistemaSolar=false;
	public LunaSistemaSolarSessionBean lunasistemasolarSessionBean;

	public PlanetaSistemaSolarBeanSwingJInternalFrame planetasistemasolarBeanSwingJInternalFrame=null;
	public PlanetaSistemaSolarBeanSwingJInternalFrame planetasistemasolarBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorPartePlanetaSistemaSolar=false;
	public PlanetaSistemaSolarSessionBean planetasistemasolarSessionBean;

	public ReferenciaComercialBeanSwingJInternalFrame referenciacomercialBeanSwingJInternalFrame=null;
	public ReferenciaComercialBeanSwingJInternalFrame referenciacomercialBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteReferenciaComercial=false;
	public ReferenciaComercialSessionBean referenciacomercialSessionBean;
	
		
	
	public TipoValoracionLogic tipovaloracionLogic;
	
	public JScrollPane jScrollPanelDatosTipoValoracion;
	public JScrollPane jScrollPanelDatosEdicionTipoValoracion;
	public JScrollPane jScrollPanelDatosGeneralTipoValoracion;
	
	protected JPanel jPanelCamposTipoValoracion;    
	protected JPanel jPanelCamposOcultosTipoValoracion;    	
	protected JPanel jPanelAccionesTipoValoracion;
	protected JPanel jPanelAccionesFormularioTipoValoracion;
    
	
	
	protected Integer iXPanelCamposTipoValoracion=0;
	protected Integer iYPanelCamposTipoValoracion=0;
	
	protected Integer iXPanelCamposOcultosTipoValoracion=0;
	protected Integer iYPanelCamposOcultosTipoValoracion=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoValoracion;
	public JButton jButtonModificarTipoValoracion;
	public JButton jButtonActualizarTipoValoracion;
    public JButton jButtonEliminarTipoValoracion;
	public JButton jButtonCancelarTipoValoracion;
    public JButton jButtonGuardarCambiosTipoValoracion;
	public JButton jButtonGuardarCambiosTablaTipoValoracion;
	protected JButton jButtonCerrarTipoValoracion;
	
	
	protected JButton jButtonProcesarInformacionTipoValoracion;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoValoracion;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoValoracion;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoValoracion;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoValoracion;
	protected JButton jButtonModificarToolBarTipoValoracion;
	protected JButton jButtonActualizarToolBarTipoValoracion;
    protected JButton jButtonEliminarToolBarTipoValoracion;
	protected JButton jButtonCancelarToolBarTipoValoracion;
    protected JButton jButtonGuardarCambiosToolBarTipoValoracion;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoValoracion;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoValoracion;
	protected JButton jButtonCerrarToolBarTipoValoracion;
	
	protected JButton jButtonProcesarInformacionToolBarTipoValoracion;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoValoracion;
	protected JMenuItem jMenuItemModificarTipoValoracion;
	protected JMenuItem jMenuItemActualizarTipoValoracion;
    protected JMenuItem jMenuItemEliminarTipoValoracion;
	protected JMenuItem jMenuItemCancelarTipoValoracion;
    protected JMenuItem jMenuItemGuardarCambiosTipoValoracion;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoValoracion;
	protected JMenuItem jMenuItemCerrarTipoValoracion;
	protected JMenuItem jMenuItemDetalleCerrarTipoValoracion;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoValoracion;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoValoracion;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoValoracion;
	protected JMenuItem jMenuItemMostrarOcultarTipoValoracion;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoValoracion;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoValoracion;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoValoracion;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoValoracion;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoValoracion;
	public JLabel jLabelIdTipoValoracion;
	public JTextFieldMe jTextFieldidTipoValoracion;
	public JButton jButtonidTipoValoracionBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoValoracion;
	public JLabel jLabelcodigoTipoValoracion;
	public JTextField jTextFieldcodigoTipoValoracion;
	public JButton jButtoncodigoTipoValoracionBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoValoracion;
	public JLabel jLabelnombreTipoValoracion;
	public JTextArea jTextAreanombreTipoValoracion;
	public JScrollPane jscrollPanenombreTipoValoracion;
	public JButton jButtonnombreTipoValoracionBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoValoracion;
	
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
	
	public TipoValoracionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoValoracion=new JPanel();
				this.jPanelAccionesFormularioTipoValoracion=new JPanel();
				this.jmenuBarDetalleTipoValoracion=new JMenuBar();
				this.jTtoolBarDetalleTipoValoracion=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoValoracionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoValoracion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoValoracionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoValoracion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoValoracionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoValoracion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoValoracionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoValoracion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoValoracionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoValoracion No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoValoracion() {
		return this.jButtonActualizarToolBarTipoValoracion;
	}
	
	public JButton getjButtonEliminarToolBarTipoValoracion() {
		return this.jButtonEliminarToolBarTipoValoracion;
	}
	
	public JButton getjButtonCancelarToolBarTipoValoracion() {
		return this.jButtonCancelarToolBarTipoValoracion;
	}		
	
	public JButton getjButtonProcesarInformacionTipoValoracion() {
		return this.jButtonProcesarInformacionTipoValoracion;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoValoracion)	{
		this.jButtonProcesarInformacionTipoValoracion = jButtonProcesarInformacionTipoValoracion;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoValoracion() {
		return this.jComboBoxTiposAccionesTipoValoracion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoValoracion(
			JComboBox jComboBoxTiposRelacionesTipoValoracion) {
		this.jComboBoxTiposRelacionesTipoValoracion = jComboBoxTiposRelacionesTipoValoracion;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoValoracion(
			JComboBox jComboBoxTiposAccionesTipoValoracion) {
		this.jComboBoxTiposAccionesTipoValoracion = jComboBoxTiposAccionesTipoValoracion;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoValoracion() {
		return this.jComboBoxTiposAccionesFormularioTipoValoracion;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoValoracion(
			JComboBox jComboBoxTiposAccionesFormularioTipoValoracion) {
		this.jComboBoxTiposAccionesFormularioTipoValoracion = jComboBoxTiposAccionesFormularioTipoValoracion;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipovaloracionSessionBean=new TipoValoracionSessionBean();
		
		this.tipovaloracionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipovaloracionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipovaloracionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.referenciabancariaSessionBean=new ReferenciaBancariaSessionBean();
		//this.lunasistemasolarSessionBean=new LunaSistemaSolarSessionBean();
		//this.planetasistemasolarSessionBean=new PlanetaSistemaSolarSessionBean();
		//this.referenciacomercialSessionBean=new ReferenciaComercialSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoValoracionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoValoracionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoValoracionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Valoracion MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 910) {
			iHeight=910;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoValoracionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoValoracion= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoValoracion=new JButtonMe();
				this.jButtonModificarToolBarTipoValoracion=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoValoracion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoValoracion,this.jTtoolBarDetalleTipoValoracion,
							"actualizar","actualizar","Actualizar"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoValoracion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoValoracion,this.jTtoolBarDetalleTipoValoracion,
							"eliminar","eliminar","Eliminar"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoValoracion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoValoracion,this.jTtoolBarDetalleTipoValoracion,
							"cancelar","cancelar","Cancelar"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoValoracion=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoValoracion,this.jTtoolBarDetalleTipoValoracion,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoValoracion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoValoracion,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoValoracion,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoValoracion=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoValoracion=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoValoracion=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoValoracion=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoValoracion=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoValoracion= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoValoracion.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoValoracion,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoValoracion= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoValoracion.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoValoracion,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoValoracion= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoValoracion.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoValoracion,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoValoracion= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoValoracion.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoValoracion,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoValoracion= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoValoracion.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoValoracion,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoValoracion= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoValoracion.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoValoracion,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoValoracion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoValoracion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoValoracion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoValoracion= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoValoracion.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoValoracion,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoValoracion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoValoracion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoValoracion,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoValoracion= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoValoracion.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoValoracion,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoValoracion.add(this.jMenuItemDetalleCerrarTipoValoracion);
		
		this.jmenuDetalleAccionesTipoValoracion.add(this.jMenuItemActualizarTipoValoracion);
		this.jmenuDetalleAccionesTipoValoracion.add(this.jMenuItemEliminarTipoValoracion);
		this.jmenuDetalleAccionesTipoValoracion.add(this.jMenuItemCancelarTipoValoracion);		
		
		//this.jmenuDetalleDatosTipoValoracion.add(this.jMenuItemDetalleAbrirOrderByTipoValoracion);				
		this.jmenuDetalleDatosTipoValoracion.add(this.jMenuItemDetalleMostarOcultarTipoValoracion);				
				
		//this.jmenuDetalleAccionesTipoValoracion.add(this.jMenuItemGuardarCambiosTipoValoracion);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoValoracion.add(this.jmenuDetalleArchivoTipoValoracion);		
		this.jmenuBarDetalleTipoValoracion.add(this.jmenuDetalleAccionesTipoValoracion);		
		this.jmenuBarDetalleTipoValoracion.add(this.jmenuDetalleDatosTipoValoracion);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoValoracion.add(this.jmenuDetalleTipoValoracion);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoValoracion);				
	}
	
	
	public void inicializarElementosCamposTipoValoracion() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoValoracion = new JLabelMe();
		jLabelIdTipoValoracion.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoValoracion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoValoracion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoValoracion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoValoracion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoValoracion = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoValoracion.setToolTipText(TipoValoracionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoValoracion= new GridBagLayout();

		this.jPanelidTipoValoracion.setLayout(this.gridaBagLayoutTipoValoracion);

		jTextFieldidTipoValoracion = new JTextFieldMe();
		jTextFieldidTipoValoracion.setText("Id");

		jTextFieldidTipoValoracion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoValoracion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoValoracion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoValoracion = new JLabelMe();
		this.jLabelcodigoTipoValoracion.setText(""+TipoValoracionConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoValoracion.setToolTipText("Codigo");
		this.jLabelcodigoTipoValoracion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoValoracion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoValoracion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoValoracion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoValoracion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoValoracion.setToolTipText(TipoValoracionConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoValoracion = new GridBagLayout();
		this.jPanelcodigoTipoValoracion.setLayout(this.gridaBagLayoutTipoValoracion);


		jTextFieldcodigoTipoValoracion= new JTextFieldMe();

		jTextFieldcodigoTipoValoracion.setEnabled(false);
		jTextFieldcodigoTipoValoracion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoValoracion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoValoracion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoValoracion,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoValoracionBusqueda= new JButtonMe();
		this.jButtoncodigoTipoValoracionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoValoracionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoValoracionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoValoracionBusqueda.setText("U");
		this.jButtoncodigoTipoValoracionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoValoracionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoValoracionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoValoracion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoValoracion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoValoracionBusqueda"));

		if(this.tipovaloracionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoValoracionBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoValoracion = new JLabelMe();
		this.jLabelnombreTipoValoracion.setText(""+TipoValoracionConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoValoracion.setToolTipText("Nombre");
		this.jLabelnombreTipoValoracion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoValoracion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoValoracion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoValoracion,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoValoracion=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoValoracion.setToolTipText(TipoValoracionConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoValoracion = new GridBagLayout();
		this.jPanelnombreTipoValoracion.setLayout(this.gridaBagLayoutTipoValoracion);


		jTextAreanombreTipoValoracion= new JTextAreaMe();
		jTextAreanombreTipoValoracion.setEnabled(false);
		jTextAreanombreTipoValoracion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoValoracion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoValoracion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoValoracion.setLineWrap(true);
		jTextAreanombreTipoValoracion.setWrapStyleWord(true);
		jTextAreanombreTipoValoracion.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoValoracion.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoValoracion,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoValoracion = new JScrollPane(jTextAreanombreTipoValoracion);
		jscrollPanenombreTipoValoracion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoValoracion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoValoracion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoValoracionBusqueda= new JButtonMe();
		this.jButtonnombreTipoValoracionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoValoracionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoValoracionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoValoracionBusqueda.setText("U");
		this.jButtonnombreTipoValoracionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoValoracionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoValoracionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoValoracion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoValoracion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoValoracionBusqueda"));

		if(this.tipovaloracionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoValoracionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoValoracion() {
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
		//this.jInternalFrameDetalleTipoValoracion = new TipoValoracionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Valoracion DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoValoracion= new GridBagLayout();
		

		
		String sToolTipTipoValoracion="";
		sToolTipTipoValoracion=TipoValoracionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoValoracion+="(Seguridad.TipoValoracion)";
		}
		
		if(!this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoValoracion+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoValoracion = new JButtonMe();
		this.jButtonModificarTipoValoracion = new JButtonMe();
        this.jButtonActualizarTipoValoracion = new JButtonMe();
        this.jButtonEliminarTipoValoracion = new JButtonMe();
        this.jButtonCancelarTipoValoracion = new JButtonMe();
        this.jButtonGuardarCambiosTipoValoracion = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoValoracion = new JButtonMe();
		this.jButtonCerrarTipoValoracion = new JButtonMe();
		
		this.jScrollPanelDatosTipoValoracion = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoValoracion = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoValoracion = new JScrollPane();
				
		
		
		this.jPanelCamposTipoValoracion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoValoracion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoValoracion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoValoracion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Valoracion";
		
		if(!this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoValoracion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Valoracions" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoValoracion.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoValoracion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoValoracion.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoValoracion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoValoracion.setName("jPanelCamposTipoValoracion"); 

		this.jPanelCamposOcultosTipoValoracion.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoValoracion.setName("jPanelCamposOcultosTipoValoracion"); 

        this.jPanelAccionesTipoValoracion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoValoracion.setToolTipText("Acciones");
        this.jPanelAccionesTipoValoracion.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoValoracion.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoValoracion.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoValoracion.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoValoracion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoValoracion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoValoracion, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoValoracion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoValoracion, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoValoracion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoValoracion.setText("Nuevo");
		this.jButtonModificarTipoValoracion.setText("Editar");
        this.jButtonActualizarTipoValoracion.setText("Actualizar");
        this.jButtonEliminarTipoValoracion.setText("Eliminar");
        this.jButtonCancelarTipoValoracion.setText("Cancelar");
        this.jButtonGuardarCambiosTipoValoracion.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoValoracion.setText("Guardar");
		this.jButtonCerrarTipoValoracion.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoValoracion,"nuevo_button","Nuevo",this.tipovaloracionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoValoracion,"modificar_button","Editar",this.tipovaloracionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoValoracion,"actualizar_button","Actualizar",this.tipovaloracionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoValoracion,"eliminar_button","Eliminar",this.tipovaloracionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoValoracion,"cancelar_button","Cancelar",this.tipovaloracionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoValoracion,"guardarcambios_button","Guardar",this.tipovaloracionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoValoracion,"guardarcambiostabla_button","Guardar",this.tipovaloracionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoValoracion,"cerrar_button","Salir",this.tipovaloracionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoValoracion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoValoracion, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoValoracion, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoValoracion.setToolTipText("Nuevo"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoValoracion.setToolTipText("Editar"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoValoracion.setToolTipText("Actualizar"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoValoracion.setToolTipText("Eliminar)"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoValoracion.setToolTipText("Cancelar"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoValoracion.setToolTipText("Guardar"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoValoracion.setToolTipText("Guardar"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoValoracion.setToolTipText("Salir"+" "+TipoValoracionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoValoracion";
		inputMap = this.jButtonNuevoTipoValoracion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoValoracion.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoValoracion"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoValoracion";
		inputMap = this.jButtonActualizarTipoValoracion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoValoracion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoValoracion"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoValoracion";
		inputMap = this.jButtonEliminarTipoValoracion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoValoracion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoValoracion"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoValoracion";
		inputMap = this.jButtonCancelarTipoValoracion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoValoracion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoValoracion"));
		
		//CERRAR		
		sMapKey = "CerrarTipoValoracion";
		inputMap = this.jButtonCerrarTipoValoracion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoValoracion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoValoracion"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoValoracion";
		inputMap = this.jButtonGuardarCambiosTablaTipoValoracion.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoValoracion.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoValoracion"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoValoracion = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoValoracion.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoValoracion.setToolTipText("Nuevo TipoValoracion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoValoracion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoValoracion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoValoracion.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoValoracion.setToolTipText("Sin Cerrar Ventana TipoValoracion");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoValoracion, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoValoracion = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoValoracion.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoValoracion.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoValoracion, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoValoracion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoValoracion.setText("Accion");
		this.jComboBoxTiposAccionesTipoValoracion.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoValoracion = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoValoracion.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoValoracion.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoValoracion = new JLabelMe();
		
		this.jLabelAccionesTipoValoracion.setText("Acciones");		
		this.jLabelAccionesTipoValoracion.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoValoracion.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoValoracion.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoValoracion();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoValoracion();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoValoracion=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoValoracion.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoValoracion,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoValoracion.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoValoracion.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoValoracion.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoValoracion, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoValoracion.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoValoracion.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoValoracion.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoValoracion, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoValoracion = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoValoracion = new GridBagLayout();
		
		this.jPanelCamposTipoValoracion.setLayout(gridaBagLayoutCamposTipoValoracion);
		this.jPanelCamposOcultosTipoValoracion.setLayout(gridaBagLayoutCamposOcultosTipoValoracion);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
	this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoValoracion.gridy = 0;
	this.gridBagConstraintsTipoValoracion.gridx = 0;
	this.gridBagConstraintsTipoValoracion.ipadx = 0;
	this.gridBagConstraintsTipoValoracion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoValoracion.add(jLabelIdTipoValoracion, this.gridBagConstraintsTipoValoracion);



	this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
	this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoValoracion.gridy = 0;
	this.gridBagConstraintsTipoValoracion.gridx = 1;
	this.gridBagConstraintsTipoValoracion.ipadx = 0;
	this.gridBagConstraintsTipoValoracion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoValoracion.add(jTextFieldidTipoValoracion, this.gridBagConstraintsTipoValoracion);


	this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
	this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoValoracion.gridy = 0;
	this.gridBagConstraintsTipoValoracion.gridx = 0;
	this.gridBagConstraintsTipoValoracion.ipadx = 0;
	this.gridBagConstraintsTipoValoracion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoValoracion.add(jLabelcodigoTipoValoracion, this.gridBagConstraintsTipoValoracion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		//this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoValoracion.gridy = 0;
		this.gridBagConstraintsTipoValoracion.gridx = 2;
		this.gridBagConstraintsTipoValoracion.ipadx = 0;
		this.gridBagConstraintsTipoValoracion.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoValoracion.add(jButtoncodigoTipoValoracionBusqueda, this.gridBagConstraintsTipoValoracion);
	}

	this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
	this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoValoracion.gridy = 0;
	this.gridBagConstraintsTipoValoracion.gridx = 1;
	this.gridBagConstraintsTipoValoracion.ipadx = 0;
	this.gridBagConstraintsTipoValoracion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoValoracion.add(jTextFieldcodigoTipoValoracion, this.gridBagConstraintsTipoValoracion);


	this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
	this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoValoracion.gridy = 0;
	this.gridBagConstraintsTipoValoracion.gridx = 0;
	this.gridBagConstraintsTipoValoracion.ipadx = 0;
	this.gridBagConstraintsTipoValoracion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoValoracion.add(jLabelnombreTipoValoracion, this.gridBagConstraintsTipoValoracion);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		//this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoValoracion.gridy = 0;
		this.gridBagConstraintsTipoValoracion.gridx = 2;
		this.gridBagConstraintsTipoValoracion.ipadx = 0;
		this.gridBagConstraintsTipoValoracion.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoValoracion.add(jButtonnombreTipoValoracionBusqueda, this.gridBagConstraintsTipoValoracion);
	}

	this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
	this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoValoracion.gridy = 0;
	this.gridBagConstraintsTipoValoracion.gridx = 1;
	this.gridBagConstraintsTipoValoracion.ipadx = 0;
	this.gridBagConstraintsTipoValoracion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoValoracion.add(jscrollPanenombreTipoValoracion, this.gridBagConstraintsTipoValoracion);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
	this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoValoracion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoValoracion.gridy = iYPanelCamposTipoValoracion;
	this.gridBagConstraintsTipoValoracion.gridx = iXPanelCamposTipoValoracion++;
	this.gridBagConstraintsTipoValoracion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoValoracion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoValoracion.add(this.jPanelidTipoValoracion, this.gridBagConstraintsTipoValoracion);



	if(iXPanelCamposTipoValoracion % 1==0) {
		iXPanelCamposTipoValoracion=0;
		iYPanelCamposTipoValoracion++;
	}
	this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
	this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoValoracion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoValoracion.gridy = iYPanelCamposTipoValoracion;
	this.gridBagConstraintsTipoValoracion.gridx = iXPanelCamposTipoValoracion++;
	this.gridBagConstraintsTipoValoracion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoValoracion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoValoracion.add(this.jPanelcodigoTipoValoracion, this.gridBagConstraintsTipoValoracion);



	if(iXPanelCamposTipoValoracion % 1==0) {
		iXPanelCamposTipoValoracion=0;
		iYPanelCamposTipoValoracion++;
	}
	this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
	this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoValoracion.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoValoracion.gridy = iYPanelCamposTipoValoracion;
	this.gridBagConstraintsTipoValoracion.gridx = iXPanelCamposTipoValoracion++;
	this.gridBagConstraintsTipoValoracion.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoValoracion.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoValoracion.add(this.jPanelnombreTipoValoracion, this.gridBagConstraintsTipoValoracion);



	if(iXPanelCamposTipoValoracion % 1==0) {
		iXPanelCamposTipoValoracion=0;
		iYPanelCamposTipoValoracion++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoValoracion= new GridBagLayout();
		this.jPanelAccionesTipoValoracion.setLayout(gridaBagLayoutAccionesTipoValoracion);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoValoracion= new GridBagLayout();
		this.jPanelAccionesFormularioTipoValoracion.setLayout(gridaBagLayoutAccionesFormularioTipoValoracion);
		
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoValoracion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoValoracion.add(this.jComboBoxTiposAccionesFormularioTipoValoracion, this.gridBagConstraintsTipoValoracion);

		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoValoracion.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoValoracion.add(this.jCheckBoxPostAccionNuevoTipoValoracion, this.gridBagConstraintsTipoValoracion);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipovaloracionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoValoracion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoValoracion.add(this.jCheckBoxPostAccionSinCerrarTipoValoracion, this.gridBagConstraintsTipoValoracion);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipovaloracionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipovaloracionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoValoracion.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoValoracion.add(this.jCheckBoxPostAccionSinMensajeTipoValoracion, this.gridBagConstraintsTipoValoracion);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoValoracion.gridy = 0;
		this.gridBagConstraintsTipoValoracion.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoValoracion.add(this.jButtonModificarTipoValoracion, this.gridBagConstraintsTipoValoracion);							

		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoValoracion.gridy = 0;
		this.gridBagConstraintsTipoValoracion.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoValoracion.add(this.jButtonEliminarTipoValoracion, this.gridBagConstraintsTipoValoracion);
		
			
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.gridy = 0;		
		this.gridBagConstraintsTipoValoracion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoValoracion.add(this.jButtonActualizarTipoValoracion, this.gridBagConstraintsTipoValoracion);


		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.gridy = 0;		
		this.gridBagConstraintsTipoValoracion.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoValoracion.add(this.jButtonGuardarCambiosTipoValoracion, this.gridBagConstraintsTipoValoracion);	
		
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.gridy = 0;		
		this.gridBagConstraintsTipoValoracion.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoValoracion.add(this.jButtonCancelarTipoValoracion, this.gridBagConstraintsTipoValoracion);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoValoracion = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoValoracion);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipovaloracionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();						
			this.gridBagConstraintsTipoValoracion.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoValoracion.gridx = 0;		
			//this.gridBagConstraintsTipoValoracion.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoValoracion.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoValoracion.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoValoracion.gridx =0;
		this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoValoracion.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoValoracion, this.gridBagConstraintsTipoValoracion);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoValoracionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoValoracion = new TipoValoracionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Valoracion DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Valoracion DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Valoracion Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoValoracionModel tipovaloracionModel=new TipoValoracionModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoValoracionModel.TipoValoracionFocusTraversalPolicy tipovaloracionFocusTraversalPolicy = tipovaloracionModel.new TipoValoracionFocusTraversalPolicy(this);
			
			//tipovaloracionFocusTraversalPolicy.settipovaloracionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipovaloracionModel);
			
			
			this.jContentPaneDetalleTipoValoracion = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoValoracion = new GridBagLayout();	
			this.jContentPaneDetalleTipoValoracion.setLayout(gridaBagLayoutDetalleTipoValoracion);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoValoracion = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
				this.gridBagConstraintsTipoValoracion.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoValoracion.gridx = 0;
					
				
				this.jContentPaneDetalleTipoValoracion.add(jTtoolBarDetalleTipoValoracion, gridBagConstraintsTipoValoracion);								
				
}
			
			this.jScrollPanelDatosEdicionTipoValoracion=   new JScrollPane(jContentPaneDetalleTipoValoracion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoValoracion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoValoracion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoValoracion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoValoracion=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoValoracion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoValoracion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoValoracion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoValoracion.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoValoracion.gridx = 0;
	        
			this.jContentPaneDetalleTipoValoracion.add(jPanelCamposTipoValoracion, gridBagConstraintsTipoValoracion);
			
			
			
			
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
						&& tipovaloracionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameLunaSistemaSolar(this.puedeCargarPorParteLunaSistemaSolar,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePlanetaSistemaSolar(this.puedeCargarPorPartePlanetaSistemaSolar,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameReferenciaBancaria(this.puedeCargarPorParteReferenciaBancaria,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameReferenciaComercial(this.puedeCargarPorParteReferenciaComercial,false,-1);
					
					if(this.tipovaloracionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoValoracion= new GridBagConstraints();
						this.gridBagConstraintsTipoValoracion.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoValoracion.gridx = 0;
						this.jContentPaneDetalleTipoValoracion.add(this.jTabbedPaneRelacionesTipoValoracion, this.gridBagConstraintsTipoValoracion);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoValoracion.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameLunaSistemaSolar(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFramePlanetaSistemaSolar(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameReferenciaBancaria(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameReferenciaComercial(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoValoracion.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
					this.gridBagConstraintsTipoValoracion.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoValoracion.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoValoracion.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoValoracion.gridx = 0;
					
				
					this.jContentPaneDetalleTipoValoracion.add(jPanelCamposOcultosTipoValoracion, gridBagConstraintsTipoValoracion);
				
					this.jPanelCamposOcultosTipoValoracion.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.gridy = iGridyRelaciones++;//13;		
	        this.gridBagConstraintsTipoValoracion.gridx = 0;
	        this.gridBagConstraintsTipoValoracion.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoValoracion.add(this.jPanelAccionesFormularioTipoValoracion, this.gridBagConstraintsTipoValoracion);							
			
			
			
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
	        this.gridBagConstraintsTipoValoracion.gridy = iGridyRelaciones;//13;		
	        this.gridBagConstraintsTipoValoracion.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoValoracion.add(this.jPanelAccionesTipoValoracion, this.gridBagConstraintsTipoValoracion);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoValoracion);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoValoracion=   new JScrollPane(this.jPanelCamposTipoValoracion,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoValoracion.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoValoracion.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoValoracion.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoValoracion.gridx = 0;
			this.gridBagConstraintsTipoValoracion.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoValoracion.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoValoracion.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoValoracion, this.gridBagConstraintsTipoValoracion);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoValoracion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoValoracion, this.gridBagConstraintsTipoValoracion);			
			
			this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
			this.gridBagConstraintsTipoValoracion.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoValoracion.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoValoracion, this.gridBagConstraintsTipoValoracion);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoValoracion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoValoracion, this.gridBagConstraintsTipoValoracion);
			
			
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoValoracion.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoValoracion, this.gridBagConstraintsTipoValoracion);
		
			
		this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
		this.gridBagConstraintsTipoValoracion.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoValoracion.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoValoracion, this.gridBagConstraintsTipoValoracion);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoValoracion;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoValoracion;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameLunaSistemaSolar(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.lunasistemasolarSessionBean=new LunaSistemaSolarSessionBean();
		this.lunasistemasolarSessionBean.setConGuardarRelaciones(false);
		this.lunasistemasolarSessionBean.setEsGuardarRelacionado(true);

		this.lunasistemasolarBeanSwingJInternalFrame=null;//new LunaSistemaSolarBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.lunasistemasolarBeanSwingJInternalFramePopup=new LunaSistemaSolarBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.lunasistemasolarBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {

				LunaSistemaSolarJInternalFrame.STIPO_TAMANIO_GENERAL=TipoValoracionJInternalFrame.STIPO_TAMANIO_GENERAL;
				LunaSistemaSolarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoValoracionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.lunasistemasolarSessionBean.setEsGuardarRelacionado(true);

				this.lunasistemasolarBeanSwingJInternalFrame=new LunaSistemaSolarBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.lunasistemasolarBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.lunasistemasolarBeanSwingJInternalFrame.setlunasistemasolarSessionBean(this.lunasistemasolarSessionBean);

				//this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
				//this.gridBagConstraintsTipoValoracion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoValoracion.gridx = 0;
				//this.jContentPaneDetalleTipoValoracion.add(this.lunasistemasolarBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoValoracion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoValoracion.add("Luna Sistema Solares",this.lunasistemasolarBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoValoracion.setComponentAt(iIndexTab,this.lunasistemasolarBeanSwingJInternalFrame.getContentPane());
				}

				//LunaSistemaSolarJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.lunasistemasolarSessionBean.setEsGuardarRelacionado(false);
				this.lunasistemasolarBeanSwingJInternalFrame=null;//new LunaSistemaSolarBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.lunasistemasolarSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteLunaSistemaSolar) {
					this.jTabbedPaneRelacionesTipoValoracion.add("Luna Sistema Solares",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFramePlanetaSistemaSolar(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.planetasistemasolarSessionBean=new PlanetaSistemaSolarSessionBean();
		this.planetasistemasolarSessionBean.setConGuardarRelaciones(false);
		this.planetasistemasolarSessionBean.setEsGuardarRelacionado(true);

		this.planetasistemasolarBeanSwingJInternalFrame=null;//new PlanetaSistemaSolarBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.planetasistemasolarBeanSwingJInternalFramePopup=new PlanetaSistemaSolarBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.planetasistemasolarBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {

				PlanetaSistemaSolarJInternalFrame.STIPO_TAMANIO_GENERAL=TipoValoracionJInternalFrame.STIPO_TAMANIO_GENERAL;
				PlanetaSistemaSolarJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoValoracionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.planetasistemasolarSessionBean.setEsGuardarRelacionado(true);

				this.planetasistemasolarBeanSwingJInternalFrame=new PlanetaSistemaSolarBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.planetasistemasolarBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.planetasistemasolarBeanSwingJInternalFrame.setplanetasistemasolarSessionBean(this.planetasistemasolarSessionBean);

				//this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
				//this.gridBagConstraintsTipoValoracion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoValoracion.gridx = 0;
				//this.jContentPaneDetalleTipoValoracion.add(this.planetasistemasolarBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoValoracion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoValoracion.add("Planeta Sistema Solares",this.planetasistemasolarBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoValoracion.setComponentAt(iIndexTab,this.planetasistemasolarBeanSwingJInternalFrame.getContentPane());
				}

				//PlanetaSistemaSolarJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.planetasistemasolarSessionBean.setEsGuardarRelacionado(false);
				this.planetasistemasolarBeanSwingJInternalFrame=null;//new PlanetaSistemaSolarBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.planetasistemasolarSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorPartePlanetaSistemaSolar) {
					this.jTabbedPaneRelacionesTipoValoracion.add("Planeta Sistema Solares",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameReferenciaBancaria(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.referenciabancariaSessionBean=new ReferenciaBancariaSessionBean();
		this.referenciabancariaSessionBean.setConGuardarRelaciones(false);
		this.referenciabancariaSessionBean.setEsGuardarRelacionado(true);

		this.referenciabancariaBeanSwingJInternalFrame=null;//new ReferenciaBancariaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.referenciabancariaBeanSwingJInternalFramePopup=new ReferenciaBancariaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.referenciabancariaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {

				ReferenciaBancariaJInternalFrame.STIPO_TAMANIO_GENERAL=TipoValoracionJInternalFrame.STIPO_TAMANIO_GENERAL;
				ReferenciaBancariaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoValoracionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.referenciabancariaSessionBean.setEsGuardarRelacionado(true);

				this.referenciabancariaBeanSwingJInternalFrame=new ReferenciaBancariaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.referenciabancariaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.referenciabancariaBeanSwingJInternalFrame.setreferenciabancariaSessionBean(this.referenciabancariaSessionBean);

				//this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
				//this.gridBagConstraintsTipoValoracion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoValoracion.gridx = 0;
				//this.jContentPaneDetalleTipoValoracion.add(this.referenciabancariaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoValoracion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoValoracion.add("Referencia Bancarias",this.referenciabancariaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoValoracion.setComponentAt(iIndexTab,this.referenciabancariaBeanSwingJInternalFrame.getContentPane());
				}

				//ReferenciaBancariaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.referenciabancariaSessionBean.setEsGuardarRelacionado(false);
				this.referenciabancariaBeanSwingJInternalFrame=null;//new ReferenciaBancariaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.referenciabancariaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteReferenciaBancaria) {
					this.jTabbedPaneRelacionesTipoValoracion.add("Referencia Bancarias",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameReferenciaComercial(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.referenciacomercialSessionBean=new ReferenciaComercialSessionBean();
		this.referenciacomercialSessionBean.setConGuardarRelaciones(false);
		this.referenciacomercialSessionBean.setEsGuardarRelacionado(true);

		this.referenciacomercialBeanSwingJInternalFrame=null;//new ReferenciaComercialBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.referenciacomercialBeanSwingJInternalFramePopup=new ReferenciaComercialBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.referenciacomercialBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {

				ReferenciaComercialJInternalFrame.STIPO_TAMANIO_GENERAL=TipoValoracionJInternalFrame.STIPO_TAMANIO_GENERAL;
				ReferenciaComercialJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoValoracionJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.referenciacomercialSessionBean.setEsGuardarRelacionado(true);

				this.referenciacomercialBeanSwingJInternalFrame=new ReferenciaComercialBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.referenciacomercialBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.referenciacomercialBeanSwingJInternalFrame.setreferenciacomercialSessionBean(this.referenciacomercialSessionBean);

				//this.gridBagConstraintsTipoValoracion = new GridBagConstraints();
				//this.gridBagConstraintsTipoValoracion.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoValoracion.gridx = 0;
				//this.jContentPaneDetalleTipoValoracion.add(this.referenciacomercialBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoValoracion);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoValoracion.add("Referencia Comerciales",this.referenciacomercialBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoValoracion.setComponentAt(iIndexTab,this.referenciacomercialBeanSwingJInternalFrame.getContentPane());
				}

				//ReferenciaComercialJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.referenciacomercialSessionBean.setEsGuardarRelacionado(false);
				this.referenciacomercialBeanSwingJInternalFrame=null;//new ReferenciaComercialBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.referenciacomercialSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteReferenciaComercial) {
					this.jTabbedPaneRelacionesTipoValoracion.add("Referencia Comerciales",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarReferenciaBancariaBeanSwingJInternalFrame(List<TipoValoracion> tipovaloracions,TipoValoracion tipovaloracion,ReferenciaBancariaBeanSwingJInternalFrame referenciabancariaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//referenciabancariaBeanSwingJInternalFrame=new ReferenciaBancariaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					referenciabancariaBeanSwingJInternalFrame.getReferenciaBancariaLogic().setConnexion(this.tipovaloracionLogic.getConnexion());

					referenciabancariaBeanSwingJInternalFrame.settipovaloracionsForeignKey(tipovaloracions);
					referenciabancariaBeanSwingJInternalFrame.settipovaloracionForeignKey(tipovaloracion);
					referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.setisBusquedaDesdeForeignKeySesionTipoValoracion(true);
					referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.setlidTipoValoracionActual(tipovaloracion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					referenciabancariaBeanSwingJInternalFrame.cargarCombosForeignKeyReferenciaBancaria(referenciabancariaBeanSwingJInternalFrame.isCargarCombosDependencia);
					referenciabancariaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoValoracion(true);
					referenciabancariaBeanSwingJInternalFrame.setid_tipo_valoracionFK_IdTipoValoracion(tipovaloracion.getId());

					if(!this.conCargarFormDetalle) {
						referenciabancariaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					referenciabancariaBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoValoracionForeignKey(tipovaloracion,1,false,true,true);
					referenciabancariaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					referenciabancariaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoValoracion");
					referenciabancariaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoValoracion");
					referenciabancariaBeanSwingJInternalFrame.inicializarActualizarBindingTablaReferenciaBancaria(true);
					referenciabancariaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesReferenciaBancaria("n",referenciabancariaBeanSwingJInternalFrame.isGuardarCambiosEnLote, referenciabancariaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					referenciabancariaBeanSwingJInternalFrame.setAutoscrolls(true);
					referenciabancariaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						referenciabancariaBeanSwingJInternalFrame.actualizarEstadoPanelsReferenciaBancaria("relacionado");
					} else {
						referenciabancariaBeanSwingJInternalFrame.actualizarEstadoPanelsReferenciaBancaria("no_relacionado");
					}

					referenciabancariaBeanSwingJInternalFrame.getjButtonRecargarInformacionReferenciaBancaria().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarLunaSistemaSolarBeanSwingJInternalFrame(List<TipoValoracion> tipovaloracions,TipoValoracion tipovaloracion,LunaSistemaSolarBeanSwingJInternalFrame lunasistemasolarBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//lunasistemasolarBeanSwingJInternalFrame=new LunaSistemaSolarBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					lunasistemasolarBeanSwingJInternalFrame.getLunaSistemaSolarLogic().setConnexion(this.tipovaloracionLogic.getConnexion());

					lunasistemasolarBeanSwingJInternalFrame.settipovaloracionsForeignKey(tipovaloracions);
					lunasistemasolarBeanSwingJInternalFrame.settipovaloracionForeignKey(tipovaloracion);
					lunasistemasolarBeanSwingJInternalFrame.lunasistemasolarSessionBean.setisBusquedaDesdeForeignKeySesionTipoValoracion(true);
					lunasistemasolarBeanSwingJInternalFrame.lunasistemasolarSessionBean.setlidTipoValoracionActual(tipovaloracion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					lunasistemasolarBeanSwingJInternalFrame.cargarCombosForeignKeyLunaSistemaSolar(lunasistemasolarBeanSwingJInternalFrame.isCargarCombosDependencia);
					lunasistemasolarBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoValoracion(true);
					lunasistemasolarBeanSwingJInternalFrame.setid_tipo_valoracionFK_IdTipoValoracion(tipovaloracion.getId());

					if(!this.conCargarFormDetalle) {
						lunasistemasolarBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					lunasistemasolarBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoValoracionForeignKey(tipovaloracion,1,false,true,true);
					lunasistemasolarBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					lunasistemasolarBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoValoracion");
					lunasistemasolarBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoValoracion");
					lunasistemasolarBeanSwingJInternalFrame.inicializarActualizarBindingTablaLunaSistemaSolar(true);
					lunasistemasolarBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesLunaSistemaSolar("n",lunasistemasolarBeanSwingJInternalFrame.isGuardarCambiosEnLote, lunasistemasolarBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					lunasistemasolarBeanSwingJInternalFrame.setAutoscrolls(true);
					lunasistemasolarBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						lunasistemasolarBeanSwingJInternalFrame.actualizarEstadoPanelsLunaSistemaSolar("relacionado");
					} else {
						lunasistemasolarBeanSwingJInternalFrame.actualizarEstadoPanelsLunaSistemaSolar("no_relacionado");
					}

					lunasistemasolarBeanSwingJInternalFrame.getjButtonRecargarInformacionLunaSistemaSolar().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarPlanetaSistemaSolarBeanSwingJInternalFrame(List<TipoValoracion> tipovaloracions,TipoValoracion tipovaloracion,PlanetaSistemaSolarBeanSwingJInternalFrame planetasistemasolarBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//planetasistemasolarBeanSwingJInternalFrame=new PlanetaSistemaSolarBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					planetasistemasolarBeanSwingJInternalFrame.getPlanetaSistemaSolarLogic().setConnexion(this.tipovaloracionLogic.getConnexion());

					planetasistemasolarBeanSwingJInternalFrame.settipovaloracionsForeignKey(tipovaloracions);
					planetasistemasolarBeanSwingJInternalFrame.settipovaloracionForeignKey(tipovaloracion);
					planetasistemasolarBeanSwingJInternalFrame.planetasistemasolarSessionBean.setisBusquedaDesdeForeignKeySesionTipoValoracion(true);
					planetasistemasolarBeanSwingJInternalFrame.planetasistemasolarSessionBean.setlidTipoValoracionActual(tipovaloracion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					planetasistemasolarBeanSwingJInternalFrame.cargarCombosForeignKeyPlanetaSistemaSolar(planetasistemasolarBeanSwingJInternalFrame.isCargarCombosDependencia);
					planetasistemasolarBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoValoracion(true);
					planetasistemasolarBeanSwingJInternalFrame.setid_tipo_valoracionFK_IdTipoValoracion(tipovaloracion.getId());

					if(!this.conCargarFormDetalle) {
						planetasistemasolarBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					planetasistemasolarBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoValoracionForeignKey(tipovaloracion,1,false,true,true);
					planetasistemasolarBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					planetasistemasolarBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoValoracion");
					planetasistemasolarBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoValoracion");
					planetasistemasolarBeanSwingJInternalFrame.inicializarActualizarBindingTablaPlanetaSistemaSolar(true);
					planetasistemasolarBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesPlanetaSistemaSolar("n",planetasistemasolarBeanSwingJInternalFrame.isGuardarCambiosEnLote, planetasistemasolarBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					planetasistemasolarBeanSwingJInternalFrame.setAutoscrolls(true);
					planetasistemasolarBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						planetasistemasolarBeanSwingJInternalFrame.actualizarEstadoPanelsPlanetaSistemaSolar("relacionado");
					} else {
						planetasistemasolarBeanSwingJInternalFrame.actualizarEstadoPanelsPlanetaSistemaSolar("no_relacionado");
					}

					planetasistemasolarBeanSwingJInternalFrame.getjButtonRecargarInformacionPlanetaSistemaSolar().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarReferenciaComercialBeanSwingJInternalFrame(List<TipoValoracion> tipovaloracions,TipoValoracion tipovaloracion,ReferenciaComercialBeanSwingJInternalFrame referenciacomercialBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//referenciacomercialBeanSwingJInternalFrame=new ReferenciaComercialBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					referenciacomercialBeanSwingJInternalFrame.getReferenciaComercialLogic().setConnexion(this.tipovaloracionLogic.getConnexion());

					referenciacomercialBeanSwingJInternalFrame.settipovaloracionsForeignKey(tipovaloracions);
					referenciacomercialBeanSwingJInternalFrame.settipovaloracionForeignKey(tipovaloracion);
					referenciacomercialBeanSwingJInternalFrame.referenciacomercialSessionBean.setisBusquedaDesdeForeignKeySesionTipoValoracion(true);
					referenciacomercialBeanSwingJInternalFrame.referenciacomercialSessionBean.setlidTipoValoracionActual(tipovaloracion.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					referenciacomercialBeanSwingJInternalFrame.cargarCombosForeignKeyReferenciaComercial(referenciacomercialBeanSwingJInternalFrame.isCargarCombosDependencia);
					referenciacomercialBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoValoracion(true);
					referenciacomercialBeanSwingJInternalFrame.setid_tipo_valoracionFK_IdTipoValoracion(tipovaloracion.getId());

					if(!this.conCargarFormDetalle) {
						referenciacomercialBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					referenciacomercialBeanSwingJInternalFrame.setSelectedItemCombosFrameTipoValoracionForeignKey(tipovaloracion,1,false,true,true);
					referenciacomercialBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					referenciacomercialBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoValoracion");
					referenciacomercialBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoValoracion");
					referenciacomercialBeanSwingJInternalFrame.inicializarActualizarBindingTablaReferenciaComercial(true);
					referenciacomercialBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesReferenciaComercial("n",referenciacomercialBeanSwingJInternalFrame.isGuardarCambiosEnLote, referenciacomercialBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					referenciacomercialBeanSwingJInternalFrame.setAutoscrolls(true);
					referenciacomercialBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						referenciacomercialBeanSwingJInternalFrame.actualizarEstadoPanelsReferenciaComercial("relacionado");
					} else {
						referenciacomercialBeanSwingJInternalFrame.actualizarEstadoPanelsReferenciaComercial("no_relacionado");
					}

					referenciacomercialBeanSwingJInternalFrame.getjButtonRecargarInformacionReferenciaComercial().setVisible(false);

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
