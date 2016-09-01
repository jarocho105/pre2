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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.produccion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.produccion.util.TipoGastoProduEmpresaConstantesFunciones;

import com.bydan.erp.produccion.business.logic.*;
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
public class TipoGastoProduEmpresaDetalleFormJInternalFrame extends TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoGastoProduEmpresa;
	
	protected JMenuBar jmenuBarDetalleTipoGastoProduEmpresa;
	
	protected JMenu jmenuDetalleTipoGastoProduEmpresa;
	protected JMenu jmenuDetalleArchivoTipoGastoProduEmpresa;
	protected JMenu jmenuDetalleAccionesTipoGastoProduEmpresa;
	protected JMenu jmenuDetalleDatosTipoGastoProduEmpresa;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoGastoProduEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoGastoProduEmpresa;	
	protected GridBagConstraints gridBagConstraintsTipoGastoProduEmpresa;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoGastoProduEmpresa;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoGastoProduEmpresaSessionBean tipogastoproduempresaSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoGastoProduEmpresaLogic tipogastoproduempresaLogic;
	
	public JScrollPane jScrollPanelDatosTipoGastoProduEmpresa;
	public JScrollPane jScrollPanelDatosEdicionTipoGastoProduEmpresa;
	public JScrollPane jScrollPanelDatosGeneralTipoGastoProduEmpresa;
	
	protected JPanel jPanelCamposTipoGastoProduEmpresa;    
	protected JPanel jPanelCamposOcultosTipoGastoProduEmpresa;    	
	protected JPanel jPanelAccionesTipoGastoProduEmpresa;
	protected JPanel jPanelAccionesFormularioTipoGastoProduEmpresa;
    
	
	
	protected Integer iXPanelCamposTipoGastoProduEmpresa=0;
	protected Integer iYPanelCamposTipoGastoProduEmpresa=0;
	
	protected Integer iXPanelCamposOcultosTipoGastoProduEmpresa=0;
	protected Integer iYPanelCamposOcultosTipoGastoProduEmpresa=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoGastoProduEmpresa;
	public JButton jButtonModificarTipoGastoProduEmpresa;
	public JButton jButtonActualizarTipoGastoProduEmpresa;
    public JButton jButtonEliminarTipoGastoProduEmpresa;
	public JButton jButtonCancelarTipoGastoProduEmpresa;
    public JButton jButtonGuardarCambiosTipoGastoProduEmpresa;
	public JButton jButtonGuardarCambiosTablaTipoGastoProduEmpresa;
	protected JButton jButtonCerrarTipoGastoProduEmpresa;
	
	
	protected JButton jButtonProcesarInformacionTipoGastoProduEmpresa;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoGastoProduEmpresa;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoGastoProduEmpresa;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoGastoProduEmpresa;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoGastoProduEmpresa;
	protected JButton jButtonModificarToolBarTipoGastoProduEmpresa;
	protected JButton jButtonActualizarToolBarTipoGastoProduEmpresa;
    protected JButton jButtonEliminarToolBarTipoGastoProduEmpresa;
	protected JButton jButtonCancelarToolBarTipoGastoProduEmpresa;
    protected JButton jButtonGuardarCambiosToolBarTipoGastoProduEmpresa;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoGastoProduEmpresa;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoGastoProduEmpresa;
	protected JButton jButtonCerrarToolBarTipoGastoProduEmpresa;
	
	protected JButton jButtonProcesarInformacionToolBarTipoGastoProduEmpresa;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoGastoProduEmpresa;
	protected JMenuItem jMenuItemModificarTipoGastoProduEmpresa;
	protected JMenuItem jMenuItemActualizarTipoGastoProduEmpresa;
    protected JMenuItem jMenuItemEliminarTipoGastoProduEmpresa;
	protected JMenuItem jMenuItemCancelarTipoGastoProduEmpresa;
    protected JMenuItem jMenuItemGuardarCambiosTipoGastoProduEmpresa;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoGastoProduEmpresa;
	protected JMenuItem jMenuItemCerrarTipoGastoProduEmpresa;
	protected JMenuItem jMenuItemDetalleCerrarTipoGastoProduEmpresa;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoGastoProduEmpresa;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoGastoProduEmpresa;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoGastoProduEmpresa;
	protected JMenuItem jMenuItemMostrarOcultarTipoGastoProduEmpresa;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoGastoProduEmpresa;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoGastoProduEmpresa;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoGastoProduEmpresa;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoGastoProduEmpresa;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoGastoProduEmpresa;
	public JLabel jLabelIdTipoGastoProduEmpresa;
	public JLabel jLabelidTipoGastoProduEmpresa;
	public JButton jButtonidTipoGastoProduEmpresaBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoGastoProduEmpresa;
	public JLabel jLabelnombreTipoGastoProduEmpresa;
	public JTextArea jTextAreanombreTipoGastoProduEmpresa;
	public JScrollPane jscrollPanenombreTipoGastoProduEmpresa;
	public JButton jButtonnombreTipoGastoProduEmpresaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionTipoGastoProduEmpresa;
	public JLabel jLabeldescripcionTipoGastoProduEmpresa;
	public JTextArea jTextAreadescripcionTipoGastoProduEmpresa;
	public JScrollPane jscrollPanedescripcionTipoGastoProduEmpresa;
	public JButton jButtondescripcionTipoGastoProduEmpresaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoGastoProduEmpresa;
	public JLabel jLabelid_empresaTipoGastoProduEmpresa;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoGastoProduEmpresa;
	public JButton jButtonid_empresaTipoGastoProduEmpresa= new JButtonMe();
	public JButton jButtonid_empresaTipoGastoProduEmpresaUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoGastoProduEmpresaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoGastoProduEmpresa;
	
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
	
	public TipoGastoProduEmpresaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoGastoProduEmpresa=new JPanel();
				this.jPanelAccionesFormularioTipoGastoProduEmpresa=new JPanel();
				this.jmenuBarDetalleTipoGastoProduEmpresa=new JMenuBar();
				this.jTtoolBarDetalleTipoGastoProduEmpresa=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGastoProduEmpresaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoGastoProduEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoGastoProduEmpresaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoGastoProduEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGastoProduEmpresaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGastoProduEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGastoProduEmpresaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoGastoProduEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoGastoProduEmpresaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoGastoProduEmpresa No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoGastoProduEmpresa() {
		return this.jButtonActualizarToolBarTipoGastoProduEmpresa;
	}
	
	public JButton getjButtonEliminarToolBarTipoGastoProduEmpresa() {
		return this.jButtonEliminarToolBarTipoGastoProduEmpresa;
	}
	
	public JButton getjButtonCancelarToolBarTipoGastoProduEmpresa() {
		return this.jButtonCancelarToolBarTipoGastoProduEmpresa;
	}		
	
	public JButton getjButtonProcesarInformacionTipoGastoProduEmpresa() {
		return this.jButtonProcesarInformacionTipoGastoProduEmpresa;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoGastoProduEmpresa)	{
		this.jButtonProcesarInformacionTipoGastoProduEmpresa = jButtonProcesarInformacionTipoGastoProduEmpresa;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoGastoProduEmpresa() {
		return this.jComboBoxTiposAccionesTipoGastoProduEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoGastoProduEmpresa(
			JComboBox jComboBoxTiposRelacionesTipoGastoProduEmpresa) {
		this.jComboBoxTiposRelacionesTipoGastoProduEmpresa = jComboBoxTiposRelacionesTipoGastoProduEmpresa;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoGastoProduEmpresa(
			JComboBox jComboBoxTiposAccionesTipoGastoProduEmpresa) {
		this.jComboBoxTiposAccionesTipoGastoProduEmpresa = jComboBoxTiposAccionesTipoGastoProduEmpresa;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoGastoProduEmpresa() {
		return this.jComboBoxTiposAccionesFormularioTipoGastoProduEmpresa;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoGastoProduEmpresa(
			JComboBox jComboBoxTiposAccionesFormularioTipoGastoProduEmpresa) {
		this.jComboBoxTiposAccionesFormularioTipoGastoProduEmpresa = jComboBoxTiposAccionesFormularioTipoGastoProduEmpresa;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipogastoproduempresaSessionBean=new TipoGastoProduEmpresaSessionBean();
		
		this.tipogastoproduempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogastoproduempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoGastoProduEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoGastoProduEmpresaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoGastoProduEmpresaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Gasto Produccion Empresa MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoGastoProduEmpresaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoGastoProduEmpresa= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoGastoProduEmpresa=new JButtonMe();
				this.jButtonModificarToolBarTipoGastoProduEmpresa=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoGastoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoGastoProduEmpresa,this.jTtoolBarDetalleTipoGastoProduEmpresa,
							"actualizar","actualizar","Actualizar"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoGastoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoGastoProduEmpresa,this.jTtoolBarDetalleTipoGastoProduEmpresa,
							"eliminar","eliminar","Eliminar"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoGastoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoGastoProduEmpresa,this.jTtoolBarDetalleTipoGastoProduEmpresa,
							"cancelar","cancelar","Cancelar"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoGastoProduEmpresa=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoGastoProduEmpresa,this.jTtoolBarDetalleTipoGastoProduEmpresa,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoGastoProduEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoGastoProduEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoGastoProduEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoGastoProduEmpresa=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoGastoProduEmpresa=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoGastoProduEmpresa=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoGastoProduEmpresa=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoGastoProduEmpresa=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoGastoProduEmpresa= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoGastoProduEmpresa.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoGastoProduEmpresa,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoGastoProduEmpresa= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoGastoProduEmpresa.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoGastoProduEmpresa,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoGastoProduEmpresa= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoGastoProduEmpresa.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoGastoProduEmpresa,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoGastoProduEmpresa= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoGastoProduEmpresa.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoGastoProduEmpresa,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoGastoProduEmpresa= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoGastoProduEmpresa.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoGastoProduEmpresa,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoGastoProduEmpresa= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoGastoProduEmpresa.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoGastoProduEmpresa,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoGastoProduEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoGastoProduEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoGastoProduEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoGastoProduEmpresa= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoGastoProduEmpresa.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoGastoProduEmpresa,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoGastoProduEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoGastoProduEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoGastoProduEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoGastoProduEmpresa= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoGastoProduEmpresa.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoGastoProduEmpresa,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoGastoProduEmpresa.add(this.jMenuItemDetalleCerrarTipoGastoProduEmpresa);
		
		this.jmenuDetalleAccionesTipoGastoProduEmpresa.add(this.jMenuItemActualizarTipoGastoProduEmpresa);
		this.jmenuDetalleAccionesTipoGastoProduEmpresa.add(this.jMenuItemEliminarTipoGastoProduEmpresa);
		this.jmenuDetalleAccionesTipoGastoProduEmpresa.add(this.jMenuItemCancelarTipoGastoProduEmpresa);		
		
		//this.jmenuDetalleDatosTipoGastoProduEmpresa.add(this.jMenuItemDetalleAbrirOrderByTipoGastoProduEmpresa);				
		this.jmenuDetalleDatosTipoGastoProduEmpresa.add(this.jMenuItemDetalleMostarOcultarTipoGastoProduEmpresa);				
				
		//this.jmenuDetalleAccionesTipoGastoProduEmpresa.add(this.jMenuItemGuardarCambiosTipoGastoProduEmpresa);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoGastoProduEmpresa.add(this.jmenuDetalleArchivoTipoGastoProduEmpresa);		
		this.jmenuBarDetalleTipoGastoProduEmpresa.add(this.jmenuDetalleAccionesTipoGastoProduEmpresa);		
		this.jmenuBarDetalleTipoGastoProduEmpresa.add(this.jmenuDetalleDatosTipoGastoProduEmpresa);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoGastoProduEmpresa);				
	}
	
	
	public void inicializarElementosCamposTipoGastoProduEmpresa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoGastoProduEmpresa = new JLabelMe();
		jLabelIdTipoGastoProduEmpresa.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoGastoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoGastoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoGastoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoGastoProduEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoGastoProduEmpresa = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoGastoProduEmpresa.setToolTipText(TipoGastoProduEmpresaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoGastoProduEmpresa= new GridBagLayout();

		this.jPanelidTipoGastoProduEmpresa.setLayout(this.gridaBagLayoutTipoGastoProduEmpresa);

		jLabelidTipoGastoProduEmpresa = new JLabel();
		jLabelidTipoGastoProduEmpresa.setText("Id");

		jLabelidTipoGastoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoGastoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoGastoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreTipoGastoProduEmpresa = new JLabelMe();
		this.jLabelnombreTipoGastoProduEmpresa.setText(""+TipoGastoProduEmpresaConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoGastoProduEmpresa.setToolTipText("Nombre");
		this.jLabelnombreTipoGastoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoGastoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoGastoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoGastoProduEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoGastoProduEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoGastoProduEmpresa.setToolTipText(TipoGastoProduEmpresaConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoGastoProduEmpresa = new GridBagLayout();
		this.jPanelnombreTipoGastoProduEmpresa.setLayout(this.gridaBagLayoutTipoGastoProduEmpresa);


		jTextAreanombreTipoGastoProduEmpresa= new JTextAreaMe();
		jTextAreanombreTipoGastoProduEmpresa.setEnabled(false);
		jTextAreanombreTipoGastoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGastoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGastoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoGastoProduEmpresa.setLineWrap(true);
		jTextAreanombreTipoGastoProduEmpresa.setWrapStyleWord(true);
		jTextAreanombreTipoGastoProduEmpresa.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoGastoProduEmpresa.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoGastoProduEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoGastoProduEmpresa = new JScrollPane(jTextAreanombreTipoGastoProduEmpresa);
		jscrollPanenombreTipoGastoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoGastoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreTipoGastoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreTipoGastoProduEmpresaBusqueda= new JButtonMe();
		this.jButtonnombreTipoGastoProduEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoGastoProduEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoGastoProduEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoGastoProduEmpresaBusqueda.setText("U");
		this.jButtonnombreTipoGastoProduEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoGastoProduEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoGastoProduEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoGastoProduEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoGastoProduEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoGastoProduEmpresaBusqueda"));

		if(this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoGastoProduEmpresaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionTipoGastoProduEmpresa = new JLabelMe();
		this.jLabeldescripcionTipoGastoProduEmpresa.setText(""+TipoGastoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionTipoGastoProduEmpresa.setToolTipText("Descripcion");
		this.jLabeldescripcionTipoGastoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoGastoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTipoGastoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionTipoGastoProduEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionTipoGastoProduEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionTipoGastoProduEmpresa.setToolTipText(TipoGastoProduEmpresaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutTipoGastoProduEmpresa = new GridBagLayout();
		this.jPaneldescripcionTipoGastoProduEmpresa.setLayout(this.gridaBagLayoutTipoGastoProduEmpresa);


		jTextAreadescripcionTipoGastoProduEmpresa= new JTextAreaMe();
		jTextAreadescripcionTipoGastoProduEmpresa.setEnabled(false);
		jTextAreadescripcionTipoGastoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoGastoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoGastoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTipoGastoProduEmpresa.setLineWrap(true);
		jTextAreadescripcionTipoGastoProduEmpresa.setWrapStyleWord(true);
		jTextAreadescripcionTipoGastoProduEmpresa.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionTipoGastoProduEmpresa.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionTipoGastoProduEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionTipoGastoProduEmpresa = new JScrollPane(jTextAreadescripcionTipoGastoProduEmpresa);
		jscrollPanedescripcionTipoGastoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoGastoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionTipoGastoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionTipoGastoProduEmpresaBusqueda= new JButtonMe();
		this.jButtondescripcionTipoGastoProduEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoGastoProduEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTipoGastoProduEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionTipoGastoProduEmpresaBusqueda.setText("U");
		this.jButtondescripcionTipoGastoProduEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionTipoGastoProduEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionTipoGastoProduEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionTipoGastoProduEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionTipoGastoProduEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionTipoGastoProduEmpresaBusqueda"));

		if(this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionTipoGastoProduEmpresaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoGastoProduEmpresa() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoGastoProduEmpresa = new JLabelMe();
		this.jLabelid_empresaTipoGastoProduEmpresa.setText(""+TipoGastoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoGastoProduEmpresa.setToolTipText("Empresa");
		this.jLabelid_empresaTipoGastoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoGastoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoGastoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-43),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoGastoProduEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoGastoProduEmpresa=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoGastoProduEmpresa.setToolTipText(TipoGastoProduEmpresaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoGastoProduEmpresa = new GridBagLayout();
		this.jPanelid_empresaTipoGastoProduEmpresa.setLayout(this.gridaBagLayoutTipoGastoProduEmpresa);


		jComboBoxid_empresaTipoGastoProduEmpresa= new JComboBoxMe();
		jComboBoxid_empresaTipoGastoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoGastoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoGastoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoGastoProduEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoGastoProduEmpresa.setEnabled(false);

		this.jButtonid_empresaTipoGastoProduEmpresa= new JButtonMe();
		this.jButtonid_empresaTipoGastoProduEmpresa.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoGastoProduEmpresa.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoGastoProduEmpresa.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoGastoProduEmpresa.setText("Buscar");
		this.jButtonid_empresaTipoGastoProduEmpresa.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoGastoProduEmpresa.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoGastoProduEmpresa,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoGastoProduEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoGastoProduEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoGastoProduEmpresa"));

		this.jButtonid_empresaTipoGastoProduEmpresaBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoGastoProduEmpresaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoGastoProduEmpresaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoGastoProduEmpresaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoGastoProduEmpresaBusqueda.setText("U");
		this.jButtonid_empresaTipoGastoProduEmpresaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoGastoProduEmpresaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoGastoProduEmpresaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoGastoProduEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoGastoProduEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoGastoProduEmpresaBusqueda"));

		if(this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoGastoProduEmpresaBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoGastoProduEmpresaUpdate= new JButtonMe();
		this.jButtonid_empresaTipoGastoProduEmpresaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoGastoProduEmpresaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoGastoProduEmpresaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoGastoProduEmpresaUpdate.setText("U");
		this.jButtonid_empresaTipoGastoProduEmpresaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoGastoProduEmpresaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoGastoProduEmpresaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoGastoProduEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoGastoProduEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoGastoProduEmpresaUpdate"));



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
		//this.jInternalFrameDetalleTipoGastoProduEmpresa = new TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Gasto Produccion Empresa DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoGastoProduEmpresa= new GridBagLayout();
		

		
		String sToolTipTipoGastoProduEmpresa="";
		sToolTipTipoGastoProduEmpresa=TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoGastoProduEmpresa+="(Produccion.TipoGastoProduEmpresa)";
		}
		
		if(!this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoGastoProduEmpresa+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoGastoProduEmpresa = new JButtonMe();
		this.jButtonModificarTipoGastoProduEmpresa = new JButtonMe();
        this.jButtonActualizarTipoGastoProduEmpresa = new JButtonMe();
        this.jButtonEliminarTipoGastoProduEmpresa = new JButtonMe();
        this.jButtonCancelarTipoGastoProduEmpresa = new JButtonMe();
        this.jButtonGuardarCambiosTipoGastoProduEmpresa = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoGastoProduEmpresa = new JButtonMe();
		this.jButtonCerrarTipoGastoProduEmpresa = new JButtonMe();
		
		this.jScrollPanelDatosTipoGastoProduEmpresa = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoGastoProduEmpresa = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoGastoProduEmpresa = new JScrollPane();
				
		
		
		this.jPanelCamposTipoGastoProduEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoGastoProduEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoGastoProduEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoGastoProduEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Gasto Produccion Empresa";
		
		if(!this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoGastoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Gasto Produccion Empresas" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoGastoProduEmpresa.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoGastoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoGastoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoGastoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoGastoProduEmpresa.setName("jPanelCamposTipoGastoProduEmpresa"); 

		this.jPanelCamposOcultosTipoGastoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoGastoProduEmpresa.setName("jPanelCamposOcultosTipoGastoProduEmpresa"); 

        this.jPanelAccionesTipoGastoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoGastoProduEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesTipoGastoProduEmpresa.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoGastoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoGastoProduEmpresa.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoGastoProduEmpresa.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoGastoProduEmpresa.setText("Nuevo");
		this.jButtonModificarTipoGastoProduEmpresa.setText("Editar");
        this.jButtonActualizarTipoGastoProduEmpresa.setText("Actualizar");
        this.jButtonEliminarTipoGastoProduEmpresa.setText("Eliminar");
        this.jButtonCancelarTipoGastoProduEmpresa.setText("Cancelar");
        this.jButtonGuardarCambiosTipoGastoProduEmpresa.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoGastoProduEmpresa.setText("Guardar");
		this.jButtonCerrarTipoGastoProduEmpresa.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoGastoProduEmpresa,"nuevo_button","Nuevo",this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoGastoProduEmpresa,"modificar_button","Editar",this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoGastoProduEmpresa,"actualizar_button","Actualizar",this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoGastoProduEmpresa,"eliminar_button","Eliminar",this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoGastoProduEmpresa,"cancelar_button","Cancelar",this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoGastoProduEmpresa,"guardarcambios_button","Guardar",this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoGastoProduEmpresa,"guardarcambiostabla_button","Guardar",this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoGastoProduEmpresa,"cerrar_button","Salir",this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoGastoProduEmpresa.setToolTipText("Nuevo"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoGastoProduEmpresa.setToolTipText("Editar"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoGastoProduEmpresa.setToolTipText("Actualizar"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoGastoProduEmpresa.setToolTipText("Eliminar)"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoGastoProduEmpresa.setToolTipText("Cancelar"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoGastoProduEmpresa.setToolTipText("Guardar"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoGastoProduEmpresa.setToolTipText("Guardar"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoGastoProduEmpresa.setToolTipText("Salir"+" "+TipoGastoProduEmpresaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoGastoProduEmpresa";
		inputMap = this.jButtonNuevoTipoGastoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoGastoProduEmpresa.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoGastoProduEmpresa"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoGastoProduEmpresa";
		inputMap = this.jButtonActualizarTipoGastoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoGastoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoGastoProduEmpresa"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoGastoProduEmpresa";
		inputMap = this.jButtonEliminarTipoGastoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoGastoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoGastoProduEmpresa"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoGastoProduEmpresa";
		inputMap = this.jButtonCancelarTipoGastoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoGastoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoGastoProduEmpresa"));
		
		//CERRAR		
		sMapKey = "CerrarTipoGastoProduEmpresa";
		inputMap = this.jButtonCerrarTipoGastoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoGastoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoGastoProduEmpresa"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoGastoProduEmpresa";
		inputMap = this.jButtonGuardarCambiosTablaTipoGastoProduEmpresa.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoGastoProduEmpresa.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoGastoProduEmpresa"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoGastoProduEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoGastoProduEmpresa.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoGastoProduEmpresa.setToolTipText("Nuevo TipoGastoProduEmpresa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoGastoProduEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoGastoProduEmpresa.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoGastoProduEmpresa.setToolTipText("Sin Cerrar Ventana TipoGastoProduEmpresa");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoGastoProduEmpresa = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoGastoProduEmpresa.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoGastoProduEmpresa.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoGastoProduEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoGastoProduEmpresa.setText("Accion");
		this.jComboBoxTiposAccionesTipoGastoProduEmpresa.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoGastoProduEmpresa = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoGastoProduEmpresa.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoGastoProduEmpresa.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoGastoProduEmpresa = new JLabelMe();
		
		this.jLabelAccionesTipoGastoProduEmpresa.setText("Acciones");		
		this.jLabelAccionesTipoGastoProduEmpresa.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGastoProduEmpresa.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoGastoProduEmpresa.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoGastoProduEmpresa();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoGastoProduEmpresa();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoGastoProduEmpresa=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoGastoProduEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoGastoProduEmpresa,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoGastoProduEmpresa.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGastoProduEmpresa.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoGastoProduEmpresa.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoGastoProduEmpresa.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoGastoProduEmpresa.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoGastoProduEmpresa.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoGastoProduEmpresa, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoGastoProduEmpresa = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoGastoProduEmpresa = new GridBagLayout();
		
		this.jPanelCamposTipoGastoProduEmpresa.setLayout(gridaBagLayoutCamposTipoGastoProduEmpresa);
		this.jPanelCamposOcultosTipoGastoProduEmpresa.setLayout(gridaBagLayoutCamposOcultosTipoGastoProduEmpresa);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoProduEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 0;
	this.gridBagConstraintsTipoGastoProduEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoProduEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoGastoProduEmpresa.add(jLabelIdTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);



	this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoProduEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 1;
	this.gridBagConstraintsTipoGastoProduEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoProduEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoGastoProduEmpresa.add(jLabelidTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);


	this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoProduEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 0;
	this.gridBagConstraintsTipoGastoProduEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoProduEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoGastoProduEmpresa.add(jLabelid_empresaTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 2;
		this.gridBagConstraintsTipoGastoProduEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGastoProduEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoGastoProduEmpresa.add(jButtonid_empresaTipoGastoProduEmpresaBusqueda, this.gridBagConstraintsTipoGastoProduEmpresa);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 3;
		this.gridBagConstraintsTipoGastoProduEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGastoProduEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoGastoProduEmpresa.add(jButtonid_empresaTipoGastoProduEmpresaUpdate, this.gridBagConstraintsTipoGastoProduEmpresa);
	}

	this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoProduEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 1;
	this.gridBagConstraintsTipoGastoProduEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoProduEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoGastoProduEmpresa.add(jComboBoxid_empresaTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);


	this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoProduEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 0;
	this.gridBagConstraintsTipoGastoProduEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoProduEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoGastoProduEmpresa.add(jLabelnombreTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 2;
		this.gridBagConstraintsTipoGastoProduEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGastoProduEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoGastoProduEmpresa.add(jButtonnombreTipoGastoProduEmpresaBusqueda, this.gridBagConstraintsTipoGastoProduEmpresa);
	}

	this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoProduEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 1;
	this.gridBagConstraintsTipoGastoProduEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoProduEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoGastoProduEmpresa.add(jscrollPanenombreTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);


	this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoProduEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 0;
	this.gridBagConstraintsTipoGastoProduEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoProduEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionTipoGastoProduEmpresa.add(jLabeldescripcionTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		//this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 2;
		this.gridBagConstraintsTipoGastoProduEmpresa.ipadx = 0;
		this.gridBagConstraintsTipoGastoProduEmpresa.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionTipoGastoProduEmpresa.add(jButtondescripcionTipoGastoProduEmpresaBusqueda, this.gridBagConstraintsTipoGastoProduEmpresa);
	}

	this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoGastoProduEmpresa.gridy = 0;
	this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 1;
	this.gridBagConstraintsTipoGastoProduEmpresa.ipadx = 0;
	this.gridBagConstraintsTipoGastoProduEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionTipoGastoProduEmpresa.add(jscrollPanedescripcionTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGastoProduEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iYPanelCamposTipoGastoProduEmpresa;
	this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iXPanelCamposTipoGastoProduEmpresa++;
	this.gridBagConstraintsTipoGastoProduEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGastoProduEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGastoProduEmpresa.add(this.jPanelidTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);



	if(iXPanelCamposTipoGastoProduEmpresa % 1==0) {
		iXPanelCamposTipoGastoProduEmpresa=0;
		iYPanelCamposTipoGastoProduEmpresa++;
	}
	this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGastoProduEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iYPanelCamposTipoGastoProduEmpresa;
	this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iXPanelCamposTipoGastoProduEmpresa++;
	this.gridBagConstraintsTipoGastoProduEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGastoProduEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGastoProduEmpresa.add(this.jPanelnombreTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);



	if(iXPanelCamposTipoGastoProduEmpresa % 1==0) {
		iXPanelCamposTipoGastoProduEmpresa=0;
		iYPanelCamposTipoGastoProduEmpresa++;
	}
	this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGastoProduEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iYPanelCamposTipoGastoProduEmpresa;
	this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iXPanelCamposTipoGastoProduEmpresa++;
	this.gridBagConstraintsTipoGastoProduEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGastoProduEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoGastoProduEmpresa.add(this.jPaneldescripcionTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);



	if(iXPanelCamposTipoGastoProduEmpresa % 1==0) {
		iXPanelCamposTipoGastoProduEmpresa=0;
		iYPanelCamposTipoGastoProduEmpresa++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
	this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoGastoProduEmpresa.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iYPanelCamposOcultosTipoGastoProduEmpresa;
	this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iXPanelCamposOcultosTipoGastoProduEmpresa++;
	this.gridBagConstraintsTipoGastoProduEmpresa.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoGastoProduEmpresa.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoGastoProduEmpresa.add(this.jPanelid_empresaTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);



	if(iXPanelCamposOcultosTipoGastoProduEmpresa % 1==0) {
		iXPanelCamposOcultosTipoGastoProduEmpresa=0;
		iYPanelCamposOcultosTipoGastoProduEmpresa++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoGastoProduEmpresa= new GridBagLayout();
		this.jPanelAccionesTipoGastoProduEmpresa.setLayout(gridaBagLayoutAccionesTipoGastoProduEmpresa);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoGastoProduEmpresa= new GridBagLayout();
		this.jPanelAccionesFormularioTipoGastoProduEmpresa.setLayout(gridaBagLayoutAccionesFormularioTipoGastoProduEmpresa);
		
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoGastoProduEmpresa.add(this.jComboBoxTiposAccionesFormularioTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);

		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoGastoProduEmpresa.add(this.jCheckBoxPostAccionNuevoTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipogastoproduempresaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoGastoProduEmpresa.add(this.jCheckBoxPostAccionSinCerrarTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipogastoproduempresaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoGastoProduEmpresa.add(this.jCheckBoxPostAccionSinMensajeTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoGastoProduEmpresa.add(this.jButtonModificarTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);							

		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = 0;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoGastoProduEmpresa.add(this.jButtonEliminarTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
		
			
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoGastoProduEmpresa.add(this.jButtonActualizarTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);


		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoGastoProduEmpresa.add(this.jButtonGuardarCambiosTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);	
		
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = 0;		
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoGastoProduEmpresa.add(this.jButtonCancelarTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoGastoProduEmpresa = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoGastoProduEmpresa);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipogastoproduempresaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();						
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 0;		
			//this.gridBagConstraintsTipoGastoProduEmpresa.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoGastoProduEmpresa.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoGastoProduEmpresa.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx =0;
		this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoGastoProduEmpresa.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoGastoProduEmpresaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoGastoProduEmpresa = new TipoGastoProduEmpresaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Gasto Produccion Empresa DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Gasto Produccion Empresa DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Gasto Produccion Empresa Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoGastoProduEmpresaModel tipogastoproduempresaModel=new TipoGastoProduEmpresaModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoGastoProduEmpresaModel.TipoGastoProduEmpresaFocusTraversalPolicy tipogastoproduempresaFocusTraversalPolicy = tipogastoproduempresaModel.new TipoGastoProduEmpresaFocusTraversalPolicy(this);
			
			//tipogastoproduempresaFocusTraversalPolicy.settipogastoproduempresaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipogastoproduempresaModel);
			
			
			this.jContentPaneDetalleTipoGastoProduEmpresa = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoGastoProduEmpresa = new GridBagLayout();	
			this.jContentPaneDetalleTipoGastoProduEmpresa.setLayout(gridaBagLayoutDetalleTipoGastoProduEmpresa);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoGastoProduEmpresa = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
				this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 0;
					
				
				this.jContentPaneDetalleTipoGastoProduEmpresa.add(jTtoolBarDetalleTipoGastoProduEmpresa, gridBagConstraintsTipoGastoProduEmpresa);								
				
}
			
			this.jScrollPanelDatosEdicionTipoGastoProduEmpresa=   new JScrollPane(jContentPaneDetalleTipoGastoProduEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoGastoProduEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGastoProduEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGastoProduEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoGastoProduEmpresa=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoGastoProduEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGastoProduEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoGastoProduEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 0;
	        
			this.jContentPaneDetalleTipoGastoProduEmpresa.add(jPanelCamposTipoGastoProduEmpresa, gridBagConstraintsTipoGastoProduEmpresa);
			
			
			
			
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
						&& tipogastoproduempresaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.tipogastoproduempresaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoGastoProduEmpresa= new GridBagConstraints();
						this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 0;
						this.jContentPaneDetalleTipoGastoProduEmpresa.add(this.jTabbedPaneRelacionesTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoGastoProduEmpresa.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoGastoProduEmpresa.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
					this.gridBagConstraintsTipoGastoProduEmpresa.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoGastoProduEmpresa.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 0;
					
				
					this.jContentPaneDetalleTipoGastoProduEmpresa.add(jPanelCamposOcultosTipoGastoProduEmpresa, gridBagConstraintsTipoGastoProduEmpresa);
				
					this.jPanelCamposOcultosTipoGastoProduEmpresa.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 0;
	        this.gridBagConstraintsTipoGastoProduEmpresa.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoGastoProduEmpresa.add(this.jPanelAccionesFormularioTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);							
			
			
			
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
	        this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoGastoProduEmpresa.add(this.jPanelAccionesTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoGastoProduEmpresa);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoGastoProduEmpresa=   new JScrollPane(this.jPanelCamposTipoGastoProduEmpresa,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoGastoProduEmpresa.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGastoProduEmpresa.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoGastoProduEmpresa.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 0;
			this.gridBagConstraintsTipoGastoProduEmpresa.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoGastoProduEmpresa.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoGastoProduEmpresa.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);			
			
			this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
			this.gridBagConstraintsTipoGastoProduEmpresa.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
			
			
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
		
			
		this.gridBagConstraintsTipoGastoProduEmpresa = new GridBagConstraints();
		this.gridBagConstraintsTipoGastoProduEmpresa.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoGastoProduEmpresa.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoGastoProduEmpresa, this.gridBagConstraintsTipoGastoProduEmpresa);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoGastoProduEmpresa;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoGastoProduEmpresa;
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
