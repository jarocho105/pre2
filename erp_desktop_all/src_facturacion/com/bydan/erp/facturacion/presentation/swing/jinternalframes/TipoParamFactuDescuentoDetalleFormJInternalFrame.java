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
import com.bydan.erp.facturacion.util.TipoParamFactuDescuentoConstantesFunciones;

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
public class TipoParamFactuDescuentoDetalleFormJInternalFrame extends TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoParamFactuDescuento;
	
	protected JMenuBar jmenuBarDetalleTipoParamFactuDescuento;
	
	protected JMenu jmenuDetalleTipoParamFactuDescuento;
	protected JMenu jmenuDetalleArchivoTipoParamFactuDescuento;
	protected JMenu jmenuDetalleAccionesTipoParamFactuDescuento;
	protected JMenu jmenuDetalleDatosTipoParamFactuDescuento;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoParamFactuDescuento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoParamFactuDescuento;	
	protected GridBagConstraints gridBagConstraintsTipoParamFactuDescuento;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoParamFactuDescuento;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	
	
	public TipoParamFactuDescuentoSessionBean tipoparamfactudescuentoSessionBean;
	
	
	
		
	
	public TipoParamFactuDescuentoLogic tipoparamfactudescuentoLogic;
	
	public JScrollPane jScrollPanelDatosTipoParamFactuDescuento;
	public JScrollPane jScrollPanelDatosEdicionTipoParamFactuDescuento;
	public JScrollPane jScrollPanelDatosGeneralTipoParamFactuDescuento;
	
	protected JPanel jPanelCamposTipoParamFactuDescuento;    
	protected JPanel jPanelCamposOcultosTipoParamFactuDescuento;    	
	protected JPanel jPanelAccionesTipoParamFactuDescuento;
	protected JPanel jPanelAccionesFormularioTipoParamFactuDescuento;
    
	
	
	protected Integer iXPanelCamposTipoParamFactuDescuento=0;
	protected Integer iYPanelCamposTipoParamFactuDescuento=0;
	
	protected Integer iXPanelCamposOcultosTipoParamFactuDescuento=0;
	protected Integer iYPanelCamposOcultosTipoParamFactuDescuento=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoParamFactuDescuento;
	public JButton jButtonModificarTipoParamFactuDescuento;
	public JButton jButtonActualizarTipoParamFactuDescuento;
    public JButton jButtonEliminarTipoParamFactuDescuento;
	public JButton jButtonCancelarTipoParamFactuDescuento;
    public JButton jButtonGuardarCambiosTipoParamFactuDescuento;
	public JButton jButtonGuardarCambiosTablaTipoParamFactuDescuento;
	protected JButton jButtonCerrarTipoParamFactuDescuento;
	
	
	protected JButton jButtonProcesarInformacionTipoParamFactuDescuento;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoParamFactuDescuento;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoParamFactuDescuento;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoParamFactuDescuento;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoParamFactuDescuento;
	protected JButton jButtonModificarToolBarTipoParamFactuDescuento;
	protected JButton jButtonActualizarToolBarTipoParamFactuDescuento;
    protected JButton jButtonEliminarToolBarTipoParamFactuDescuento;
	protected JButton jButtonCancelarToolBarTipoParamFactuDescuento;
    protected JButton jButtonGuardarCambiosToolBarTipoParamFactuDescuento;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoParamFactuDescuento;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoParamFactuDescuento;
	protected JButton jButtonCerrarToolBarTipoParamFactuDescuento;
	
	protected JButton jButtonProcesarInformacionToolBarTipoParamFactuDescuento;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoParamFactuDescuento;
	protected JMenuItem jMenuItemModificarTipoParamFactuDescuento;
	protected JMenuItem jMenuItemActualizarTipoParamFactuDescuento;
    protected JMenuItem jMenuItemEliminarTipoParamFactuDescuento;
	protected JMenuItem jMenuItemCancelarTipoParamFactuDescuento;
    protected JMenuItem jMenuItemGuardarCambiosTipoParamFactuDescuento;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoParamFactuDescuento;
	protected JMenuItem jMenuItemCerrarTipoParamFactuDescuento;
	protected JMenuItem jMenuItemDetalleCerrarTipoParamFactuDescuento;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoParamFactuDescuento;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoParamFactuDescuento;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoParamFactuDescuento;
	protected JMenuItem jMenuItemMostrarOcultarTipoParamFactuDescuento;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoParamFactuDescuento;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoParamFactuDescuento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoParamFactuDescuento;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoParamFactuDescuento;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoParamFactuDescuento;
	public JLabel jLabelIdTipoParamFactuDescuento;
	public JTextFieldMe jTextFieldidTipoParamFactuDescuento;
	public JButton jButtonidTipoParamFactuDescuentoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoParamFactuDescuento;
	public JLabel jLabelnombreTipoParamFactuDescuento;
	public JTextArea jTextAreanombreTipoParamFactuDescuento;
	public JScrollPane jscrollPanenombreTipoParamFactuDescuento;
	public JButton jButtonnombreTipoParamFactuDescuentoBusqueda= new JButtonMe();

	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoParamFactuDescuento;
	
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
	
	public TipoParamFactuDescuentoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoParamFactuDescuento=new JPanel();
				this.jPanelAccionesFormularioTipoParamFactuDescuento=new JPanel();
				this.jmenuBarDetalleTipoParamFactuDescuento=new JMenuBar();
				this.jTtoolBarDetalleTipoParamFactuDescuento=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParamFactuDescuentoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoParamFactuDescuento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoParamFactuDescuentoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoParamFactuDescuento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParamFactuDescuentoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoParamFactuDescuento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParamFactuDescuentoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoParamFactuDescuento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoParamFactuDescuentoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoParamFactuDescuento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoParamFactuDescuento() {
		return this.jButtonActualizarToolBarTipoParamFactuDescuento;
	}
	
	public JButton getjButtonEliminarToolBarTipoParamFactuDescuento() {
		return this.jButtonEliminarToolBarTipoParamFactuDescuento;
	}
	
	public JButton getjButtonCancelarToolBarTipoParamFactuDescuento() {
		return this.jButtonCancelarToolBarTipoParamFactuDescuento;
	}		
	
	public JButton getjButtonProcesarInformacionTipoParamFactuDescuento() {
		return this.jButtonProcesarInformacionTipoParamFactuDescuento;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoParamFactuDescuento)	{
		this.jButtonProcesarInformacionTipoParamFactuDescuento = jButtonProcesarInformacionTipoParamFactuDescuento;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoParamFactuDescuento() {
		return this.jComboBoxTiposAccionesTipoParamFactuDescuento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoParamFactuDescuento(
			JComboBox jComboBoxTiposRelacionesTipoParamFactuDescuento) {
		this.jComboBoxTiposRelacionesTipoParamFactuDescuento = jComboBoxTiposRelacionesTipoParamFactuDescuento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoParamFactuDescuento(
			JComboBox jComboBoxTiposAccionesTipoParamFactuDescuento) {
		this.jComboBoxTiposAccionesTipoParamFactuDescuento = jComboBoxTiposAccionesTipoParamFactuDescuento;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoParamFactuDescuento() {
		return this.jComboBoxTiposAccionesFormularioTipoParamFactuDescuento;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoParamFactuDescuento(
			JComboBox jComboBoxTiposAccionesFormularioTipoParamFactuDescuento) {
		this.jComboBoxTiposAccionesFormularioTipoParamFactuDescuento = jComboBoxTiposAccionesFormularioTipoParamFactuDescuento;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipoparamfactudescuentoSessionBean=new TipoParamFactuDescuentoSessionBean();
		
		this.tipoparamfactudescuentoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoparamfactudescuentoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoParamFactuDescuentoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoParamFactuDescuentoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoParamFactuDescuentoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Descuento MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoParamFactuDescuentoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoParamFactuDescuento= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoParamFactuDescuento=new JButtonMe();
				this.jButtonModificarToolBarTipoParamFactuDescuento=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoParamFactuDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoParamFactuDescuento,this.jTtoolBarDetalleTipoParamFactuDescuento,
							"actualizar","actualizar","Actualizar"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoParamFactuDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoParamFactuDescuento,this.jTtoolBarDetalleTipoParamFactuDescuento,
							"eliminar","eliminar","Eliminar"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoParamFactuDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoParamFactuDescuento,this.jTtoolBarDetalleTipoParamFactuDescuento,
							"cancelar","cancelar","Cancelar"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoParamFactuDescuento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoParamFactuDescuento,this.jTtoolBarDetalleTipoParamFactuDescuento,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoParamFactuDescuento,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoParamFactuDescuento,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoParamFactuDescuento,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoParamFactuDescuento=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoParamFactuDescuento=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoParamFactuDescuento=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoParamFactuDescuento=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoParamFactuDescuento=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoParamFactuDescuento= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoParamFactuDescuento.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoParamFactuDescuento,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoParamFactuDescuento= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoParamFactuDescuento.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoParamFactuDescuento,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoParamFactuDescuento= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoParamFactuDescuento.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoParamFactuDescuento,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoParamFactuDescuento= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoParamFactuDescuento.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoParamFactuDescuento,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoParamFactuDescuento= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoParamFactuDescuento.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoParamFactuDescuento,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoParamFactuDescuento= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoParamFactuDescuento.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoParamFactuDescuento,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoParamFactuDescuento= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoParamFactuDescuento.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoParamFactuDescuento,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoParamFactuDescuento= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoParamFactuDescuento.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoParamFactuDescuento,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoParamFactuDescuento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoParamFactuDescuento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoParamFactuDescuento,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoParamFactuDescuento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoParamFactuDescuento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoParamFactuDescuento,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoParamFactuDescuento.add(this.jMenuItemDetalleCerrarTipoParamFactuDescuento);
		
		this.jmenuDetalleAccionesTipoParamFactuDescuento.add(this.jMenuItemActualizarTipoParamFactuDescuento);
		this.jmenuDetalleAccionesTipoParamFactuDescuento.add(this.jMenuItemEliminarTipoParamFactuDescuento);
		this.jmenuDetalleAccionesTipoParamFactuDescuento.add(this.jMenuItemCancelarTipoParamFactuDescuento);		
		
		//this.jmenuDetalleDatosTipoParamFactuDescuento.add(this.jMenuItemDetalleAbrirOrderByTipoParamFactuDescuento);				
		this.jmenuDetalleDatosTipoParamFactuDescuento.add(this.jMenuItemDetalleMostarOcultarTipoParamFactuDescuento);				
				
		//this.jmenuDetalleAccionesTipoParamFactuDescuento.add(this.jMenuItemGuardarCambiosTipoParamFactuDescuento);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoParamFactuDescuento.add(this.jmenuDetalleArchivoTipoParamFactuDescuento);		
		this.jmenuBarDetalleTipoParamFactuDescuento.add(this.jmenuDetalleAccionesTipoParamFactuDescuento);		
		this.jmenuBarDetalleTipoParamFactuDescuento.add(this.jmenuDetalleDatosTipoParamFactuDescuento);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoParamFactuDescuento);				
	}
	
	
	public void inicializarElementosCamposTipoParamFactuDescuento() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoParamFactuDescuento = new JLabelMe();
		jLabelIdTipoParamFactuDescuento.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoParamFactuDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoParamFactuDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoParamFactuDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoParamFactuDescuento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoParamFactuDescuento = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoParamFactuDescuento.setToolTipText(TipoParamFactuDescuentoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoParamFactuDescuento= new GridBagLayout();

		this.jPanelidTipoParamFactuDescuento.setLayout(this.gridaBagLayoutTipoParamFactuDescuento);

		jTextFieldidTipoParamFactuDescuento = new JTextFieldMe();
		jTextFieldidTipoParamFactuDescuento.setText("Id");

		jTextFieldidTipoParamFactuDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoParamFactuDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jTextFieldidTipoParamFactuDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoParamFactuDescuento = new JLabelMe();
		this.jLabelnombreTipoParamFactuDescuento.setText(""+TipoParamFactuDescuentoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoParamFactuDescuento.setToolTipText("Nombre");
		this.jLabelnombreTipoParamFactuDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoParamFactuDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoParamFactuDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoParamFactuDescuento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoParamFactuDescuento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoParamFactuDescuento.setToolTipText(TipoParamFactuDescuentoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoParamFactuDescuento = new GridBagLayout();
		this.jPanelnombreTipoParamFactuDescuento.setLayout(this.gridaBagLayoutTipoParamFactuDescuento);


		jTextAreanombreTipoParamFactuDescuento= new JTextAreaMe();
		jTextAreanombreTipoParamFactuDescuento.setEnabled(false);
		jTextAreanombreTipoParamFactuDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoParamFactuDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoParamFactuDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoParamFactuDescuento.setLineWrap(true);
		jTextAreanombreTipoParamFactuDescuento.setWrapStyleWord(true);
		jTextAreanombreTipoParamFactuDescuento.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoParamFactuDescuento.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoParamFactuDescuento,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoParamFactuDescuento = new JScrollPane(jTextAreanombreTipoParamFactuDescuento);
		jscrollPanenombreTipoParamFactuDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoParamFactuDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoParamFactuDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));

		this.jButtonnombreTipoParamFactuDescuentoBusqueda= new JButtonMe();
		this.jButtonnombreTipoParamFactuDescuentoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoParamFactuDescuentoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoParamFactuDescuentoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoParamFactuDescuentoBusqueda.setText("U");
		this.jButtonnombreTipoParamFactuDescuentoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoParamFactuDescuentoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoParamFactuDescuentoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoParamFactuDescuento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoParamFactuDescuento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoParamFactuDescuentoBusqueda"));

		if(this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoParamFactuDescuentoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoParamFactuDescuento() {
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
		//this.jInternalFrameDetalleTipoParamFactuDescuento = new TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Descuento DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoParamFactuDescuento= new GridBagLayout();
		

		
		String sToolTipTipoParamFactuDescuento="";
		sToolTipTipoParamFactuDescuento=TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoParamFactuDescuento+="(Facturacion.TipoParamFactuDescuento)";
		}
		
		if(!this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoParamFactuDescuento+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoParamFactuDescuento = new JButtonMe();
		this.jButtonModificarTipoParamFactuDescuento = new JButtonMe();
        this.jButtonActualizarTipoParamFactuDescuento = new JButtonMe();
        this.jButtonEliminarTipoParamFactuDescuento = new JButtonMe();
        this.jButtonCancelarTipoParamFactuDescuento = new JButtonMe();
        this.jButtonGuardarCambiosTipoParamFactuDescuento = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoParamFactuDescuento = new JButtonMe();
		this.jButtonCerrarTipoParamFactuDescuento = new JButtonMe();
		
		this.jScrollPanelDatosTipoParamFactuDescuento = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoParamFactuDescuento = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoParamFactuDescuento = new JScrollPane();
				
		
		
		this.jPanelCamposTipoParamFactuDescuento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoParamFactuDescuento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoParamFactuDescuento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoParamFactuDescuento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Descuento";
		
		if(!this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoParamFactuDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Descuentos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoParamFactuDescuento.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoParamFactuDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoParamFactuDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoParamFactuDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoParamFactuDescuento.setName("jPanelCamposTipoParamFactuDescuento"); 

		this.jPanelCamposOcultosTipoParamFactuDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoParamFactuDescuento.setName("jPanelCamposOcultosTipoParamFactuDescuento"); 

        this.jPanelAccionesTipoParamFactuDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoParamFactuDescuento.setToolTipText("Acciones");
        this.jPanelAccionesTipoParamFactuDescuento.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoParamFactuDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoParamFactuDescuento.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoParamFactuDescuento.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoParamFactuDescuento.setText("Nuevo");
		this.jButtonModificarTipoParamFactuDescuento.setText("Editar");
        this.jButtonActualizarTipoParamFactuDescuento.setText("Actualizar");
        this.jButtonEliminarTipoParamFactuDescuento.setText("Eliminar");
        this.jButtonCancelarTipoParamFactuDescuento.setText("Cancelar");
        this.jButtonGuardarCambiosTipoParamFactuDescuento.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoParamFactuDescuento.setText("Guardar");
		this.jButtonCerrarTipoParamFactuDescuento.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoParamFactuDescuento,"nuevo_button","Nuevo",this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoParamFactuDescuento,"modificar_button","Editar",this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoParamFactuDescuento,"actualizar_button","Actualizar",this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoParamFactuDescuento,"eliminar_button","Eliminar",this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoParamFactuDescuento,"cancelar_button","Cancelar",this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoParamFactuDescuento,"guardarcambios_button","Guardar",this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoParamFactuDescuento,"guardarcambiostabla_button","Guardar",this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoParamFactuDescuento,"cerrar_button","Salir",this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoParamFactuDescuento.setToolTipText("Nuevo"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoParamFactuDescuento.setToolTipText("Editar"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoParamFactuDescuento.setToolTipText("Actualizar"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoParamFactuDescuento.setToolTipText("Eliminar)"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoParamFactuDescuento.setToolTipText("Cancelar"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoParamFactuDescuento.setToolTipText("Guardar"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoParamFactuDescuento.setToolTipText("Guardar"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoParamFactuDescuento.setToolTipText("Salir"+" "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoParamFactuDescuento";
		inputMap = this.jButtonNuevoTipoParamFactuDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoParamFactuDescuento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoParamFactuDescuento"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoParamFactuDescuento";
		inputMap = this.jButtonActualizarTipoParamFactuDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoParamFactuDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoParamFactuDescuento"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoParamFactuDescuento";
		inputMap = this.jButtonEliminarTipoParamFactuDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoParamFactuDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoParamFactuDescuento"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoParamFactuDescuento";
		inputMap = this.jButtonCancelarTipoParamFactuDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoParamFactuDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoParamFactuDescuento"));
		
		//CERRAR		
		sMapKey = "CerrarTipoParamFactuDescuento";
		inputMap = this.jButtonCerrarTipoParamFactuDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoParamFactuDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoParamFactuDescuento"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoParamFactuDescuento";
		inputMap = this.jButtonGuardarCambiosTablaTipoParamFactuDescuento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoParamFactuDescuento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoParamFactuDescuento"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoParamFactuDescuento = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoParamFactuDescuento.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoParamFactuDescuento.setToolTipText("Nuevo TipoParamFactuDescuento");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoParamFactuDescuento = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoParamFactuDescuento.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoParamFactuDescuento.setToolTipText("Sin Cerrar Ventana TipoParamFactuDescuento");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoParamFactuDescuento = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoParamFactuDescuento.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoParamFactuDescuento.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoParamFactuDescuento = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoParamFactuDescuento.setText("Accion");
		this.jComboBoxTiposAccionesTipoParamFactuDescuento.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoParamFactuDescuento = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoParamFactuDescuento.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoParamFactuDescuento.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoParamFactuDescuento = new JLabelMe();
		
		this.jLabelAccionesTipoParamFactuDescuento.setText("Acciones");		
		this.jLabelAccionesTipoParamFactuDescuento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoParamFactuDescuento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoParamFactuDescuento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoParamFactuDescuento();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoParamFactuDescuento();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoParamFactuDescuento=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoParamFactuDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoParamFactuDescuento,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoParamFactuDescuento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoParamFactuDescuento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoParamFactuDescuento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoParamFactuDescuento.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoParamFactuDescuento.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoParamFactuDescuento.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoParamFactuDescuento, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoParamFactuDescuento = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoParamFactuDescuento = new GridBagLayout();
		
		this.jPanelCamposTipoParamFactuDescuento.setLayout(gridaBagLayoutCamposTipoParamFactuDescuento);
		this.jPanelCamposOcultosTipoParamFactuDescuento.setLayout(gridaBagLayoutCamposOcultosTipoParamFactuDescuento);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
	this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParamFactuDescuento.gridy = 0;
	this.gridBagConstraintsTipoParamFactuDescuento.gridx = 0;
	this.gridBagConstraintsTipoParamFactuDescuento.ipadx = 0;
	this.gridBagConstraintsTipoParamFactuDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoParamFactuDescuento.add(jLabelIdTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);



	this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
	this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParamFactuDescuento.gridy = 0;
	this.gridBagConstraintsTipoParamFactuDescuento.gridx = 1;
	this.gridBagConstraintsTipoParamFactuDescuento.ipadx = 0;
	this.gridBagConstraintsTipoParamFactuDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoParamFactuDescuento.add(jTextFieldidTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);


	this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
	this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParamFactuDescuento.gridy = 0;
	this.gridBagConstraintsTipoParamFactuDescuento.gridx = 0;
	this.gridBagConstraintsTipoParamFactuDescuento.ipadx = 0;
	this.gridBagConstraintsTipoParamFactuDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoParamFactuDescuento.add(jLabelnombreTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		//this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = 0;
		this.gridBagConstraintsTipoParamFactuDescuento.gridx = 2;
		this.gridBagConstraintsTipoParamFactuDescuento.ipadx = 0;
		this.gridBagConstraintsTipoParamFactuDescuento.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoParamFactuDescuento.add(jButtonnombreTipoParamFactuDescuentoBusqueda, this.gridBagConstraintsTipoParamFactuDescuento);
	}

	this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
	this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoParamFactuDescuento.gridy = 0;
	this.gridBagConstraintsTipoParamFactuDescuento.gridx = 1;
	this.gridBagConstraintsTipoParamFactuDescuento.ipadx = 0;
	this.gridBagConstraintsTipoParamFactuDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoParamFactuDescuento.add(jscrollPanenombreTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
	this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoParamFactuDescuento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoParamFactuDescuento.gridy = iYPanelCamposTipoParamFactuDescuento;
	this.gridBagConstraintsTipoParamFactuDescuento.gridx = iXPanelCamposTipoParamFactuDescuento++;
	this.gridBagConstraintsTipoParamFactuDescuento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoParamFactuDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoParamFactuDescuento.add(this.jPanelidTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);



	if(iXPanelCamposTipoParamFactuDescuento % 1==0) {
		iXPanelCamposTipoParamFactuDescuento=0;
		iYPanelCamposTipoParamFactuDescuento++;
	}
	this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
	this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoParamFactuDescuento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoParamFactuDescuento.gridy = iYPanelCamposTipoParamFactuDescuento;
	this.gridBagConstraintsTipoParamFactuDescuento.gridx = iXPanelCamposTipoParamFactuDescuento++;
	this.gridBagConstraintsTipoParamFactuDescuento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoParamFactuDescuento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoParamFactuDescuento.add(this.jPanelnombreTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);



	if(iXPanelCamposTipoParamFactuDescuento % 1==0) {
		iXPanelCamposTipoParamFactuDescuento=0;
		iYPanelCamposTipoParamFactuDescuento++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoParamFactuDescuento= new GridBagLayout();
		this.jPanelAccionesTipoParamFactuDescuento.setLayout(gridaBagLayoutAccionesTipoParamFactuDescuento);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoParamFactuDescuento= new GridBagLayout();
		this.jPanelAccionesFormularioTipoParamFactuDescuento.setLayout(gridaBagLayoutAccionesFormularioTipoParamFactuDescuento);
		
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoParamFactuDescuento.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoParamFactuDescuento.add(this.jComboBoxTiposAccionesFormularioTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);

		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoParamFactuDescuento.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoParamFactuDescuento.add(this.jCheckBoxPostAccionNuevoTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipoparamfactudescuentoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoParamFactuDescuento.add(this.jCheckBoxPostAccionSinCerrarTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipoparamfactudescuentoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoParamFactuDescuento.add(this.jCheckBoxPostAccionSinMensajeTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = 0;
		this.gridBagConstraintsTipoParamFactuDescuento.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoParamFactuDescuento.add(this.jButtonModificarTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);							

		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = 0;
		this.gridBagConstraintsTipoParamFactuDescuento.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoParamFactuDescuento.add(this.jButtonEliminarTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
		
			
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = 0;		
		this.gridBagConstraintsTipoParamFactuDescuento.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoParamFactuDescuento.add(this.jButtonActualizarTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);


		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = 0;		
		this.gridBagConstraintsTipoParamFactuDescuento.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoParamFactuDescuento.add(this.jButtonGuardarCambiosTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);	
		
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = 0;		
		this.gridBagConstraintsTipoParamFactuDescuento.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoParamFactuDescuento.add(this.jButtonCancelarTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoParamFactuDescuento = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoParamFactuDescuento);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();						
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = 0;		
			//this.gridBagConstraintsTipoParamFactuDescuento.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoParamFactuDescuento.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoParamFactuDescuento.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoParamFactuDescuento.gridx =0;
		this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoParamFactuDescuento.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoParamFactuDescuentoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoParamFactuDescuento = new TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Descuento DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Descuento DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Descuento Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoParamFactuDescuentoModel tipoparamfactudescuentoModel=new TipoParamFactuDescuentoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoParamFactuDescuentoModel.TipoParamFactuDescuentoFocusTraversalPolicy tipoparamfactudescuentoFocusTraversalPolicy = tipoparamfactudescuentoModel.new TipoParamFactuDescuentoFocusTraversalPolicy(this);
			
			//tipoparamfactudescuentoFocusTraversalPolicy.settipoparamfactudescuentoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipoparamfactudescuentoModel);
			
			
			this.jContentPaneDetalleTipoParamFactuDescuento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoParamFactuDescuento = new GridBagLayout();	
			this.jContentPaneDetalleTipoParamFactuDescuento.setLayout(gridaBagLayoutDetalleTipoParamFactuDescuento);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoParamFactuDescuento = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
				this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoParamFactuDescuento.gridx = 0;
					
				
				this.jContentPaneDetalleTipoParamFactuDescuento.add(jTtoolBarDetalleTipoParamFactuDescuento, gridBagConstraintsTipoParamFactuDescuento);								
				
}
			
			this.jScrollPanelDatosEdicionTipoParamFactuDescuento=   new JScrollPane(jContentPaneDetalleTipoParamFactuDescuento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoParamFactuDescuento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoParamFactuDescuento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoParamFactuDescuento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoParamFactuDescuento=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoParamFactuDescuento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoParamFactuDescuento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoParamFactuDescuento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoParamFactuDescuento.gridx = 0;
	        
			this.jContentPaneDetalleTipoParamFactuDescuento.add(jPanelCamposTipoParamFactuDescuento, gridBagConstraintsTipoParamFactuDescuento);
			
			
			
			
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
						&& tipoparamfactudescuentoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipoparamfactudescuentoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoParamFactuDescuento= new GridBagConstraints();
						this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoParamFactuDescuento.gridx = 0;
						this.jContentPaneDetalleTipoParamFactuDescuento.add(this.jTabbedPaneRelacionesTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoParamFactuDescuento.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoParamFactuDescuento.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
					this.gridBagConstraintsTipoParamFactuDescuento.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoParamFactuDescuento.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoParamFactuDescuento.gridx = 0;
					
				
					this.jContentPaneDetalleTipoParamFactuDescuento.add(jPanelCamposOcultosTipoParamFactuDescuento, gridBagConstraintsTipoParamFactuDescuento);
				
					this.jPanelCamposOcultosTipoParamFactuDescuento.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoParamFactuDescuento.gridx = 0;
	        this.gridBagConstraintsTipoParamFactuDescuento.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoParamFactuDescuento.add(this.jPanelAccionesFormularioTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);							
			
			
			
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
	        this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoParamFactuDescuento.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoParamFactuDescuento.add(this.jPanelAccionesTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoParamFactuDescuento);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoParamFactuDescuento=   new JScrollPane(this.jPanelCamposTipoParamFactuDescuento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoParamFactuDescuento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoParamFactuDescuento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoParamFactuDescuento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = 0;
			this.gridBagConstraintsTipoParamFactuDescuento.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoParamFactuDescuento.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoParamFactuDescuento.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);			
			
			this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
			this.gridBagConstraintsTipoParamFactuDescuento.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoParamFactuDescuento.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuDescuento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
			
			
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuDescuento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
		
			
		this.gridBagConstraintsTipoParamFactuDescuento = new GridBagConstraints();
		this.gridBagConstraintsTipoParamFactuDescuento.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoParamFactuDescuento.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoParamFactuDescuento, this.gridBagConstraintsTipoParamFactuDescuento);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoParamFactuDescuento;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoParamFactuDescuento;
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
