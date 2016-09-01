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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.inventario.util.PrioridadPedidoConstantesFunciones;
import com.bydan.erp.inventario.util.PrioridadPedidoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.PrioridadPedidoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.PrioridadPedidoBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class PrioridadPedidoBeanSwingJInternalFrame extends PrioridadPedidoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PrioridadPedidoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PrioridadPedido> prioridadpedidoValidator = new ClassValidator<PrioridadPedido>(PrioridadPedido.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PrioridadPedido prioridadpedido;	
	public PrioridadPedido prioridadpedidoAux;
	public PrioridadPedido prioridadpedidoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PrioridadPedido prioridadpedidoTotales;
	public Long idPrioridadPedidoActual;
	public Long iIdNuevoPrioridadPedido=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

		
	
	
	
	
	
	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoPrioridadPedido;
	public Boolean isPermisoNuevoPrioridadPedido;
	public Boolean isPermisoActualizarPrioridadPedido;
	public Boolean isPermisoActualizarOriginalPrioridadPedido;
	public Boolean isPermisoEliminarPrioridadPedido;
	public Boolean isPermisoGuardarCambiosPrioridadPedido;
	public Boolean isPermisoConsultaPrioridadPedido;
	public Boolean isPermisoBusquedaPrioridadPedido;
	public Boolean isPermisoReportePrioridadPedido;
	public Boolean isPermisoPaginacionMedioPrioridadPedido;
	public Boolean isPermisoPaginacionAltoPrioridadPedido;
	public Boolean isPermisoPaginacionTodoPrioridadPedido;
	public Boolean isPermisoCopiarPrioridadPedido;
	public Boolean isPermisoVerFormPrioridadPedido;
	public Boolean isPermisoDuplicarPrioridadPedido;
	public Boolean isPermisoOrdenPrioridadPedido;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public PrioridadPedidoParameterReturnGeneral prioridadpedidoReturnGeneral;
	public PrioridadPedidoParameterReturnGeneral prioridadpedidoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPrioridadPedido=false;
	public Boolean esParaAccionDesdeFormularioPrioridadPedido=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PrioridadPedidoSessionBeanAdditional prioridadpedidoSessionBeanAdditional=null;
	
	public PrioridadPedidoSessionBeanAdditional getPrioridadPedidoSessionBeanAdditional() {
		return this.prioridadpedidoSessionBeanAdditional;
	}
	
	public void setPrioridadPedidoSessionBeanAdditional(PrioridadPedidoSessionBeanAdditional prioridadpedidoSessionBeanAdditional) {
		try {
			this.prioridadpedidoSessionBeanAdditional=prioridadpedidoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PrioridadPedidoBeanSwingJInternalFrameAdditional prioridadpedidoBeanSwingJInternalFrameAdditional=null;
	//public class PrioridadPedidoBeanSwingJInternalFrame
	
	public PrioridadPedidoBeanSwingJInternalFrameAdditional getPrioridadPedidoBeanSwingJInternalFrameAdditional() {
		return this.prioridadpedidoBeanSwingJInternalFrameAdditional;
	}
	
	public void setPrioridadPedidoBeanSwingJInternalFrameAdditional(PrioridadPedidoBeanSwingJInternalFrameAdditional prioridadpedidoBeanSwingJInternalFrameAdditional) {
		try {
			this.prioridadpedidoBeanSwingJInternalFrameAdditional=prioridadpedidoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PrioridadPedidoLogic prioridadpedidoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PrioridadPedido prioridadpedidoBean;
	public PrioridadPedidoConstantesFunciones prioridadpedidoConstantesFunciones;
	//public PrioridadPedidoParameterReturnGeneral prioridadpedidoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<PrioridadPedido> prioridadpedidos;	
	//public List<PrioridadPedido> prioridadpedidosEliminados;
	//public List<PrioridadPedido> prioridadpedidosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPrioridadPedido=false;
	public Boolean isVisibilidadCeldaDuplicarPrioridadPedido=true;
	public Boolean isVisibilidadCeldaCopiarPrioridadPedido=true;
	public Boolean isVisibilidadCeldaVerFormPrioridadPedido=true;
	public Boolean isVisibilidadCeldaOrdenPrioridadPedido=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPrioridadPedido=false;
	public Boolean isVisibilidadCeldaModificarPrioridadPedido=false;
	public Boolean isVisibilidadCeldaActualizarPrioridadPedido=false;
	public Boolean isVisibilidadCeldaEliminarPrioridadPedido=false;
	public Boolean isVisibilidadCeldaCancelarPrioridadPedido=false;
	public Boolean isVisibilidadCeldaGuardarPrioridadPedido=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPrioridadPedido=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoPrioridadPedido() {
		return this.iIdNuevoPrioridadPedido;
	}

	public void setiIdNuevoPrioridadPedido(Long iIdNuevoPrioridadPedido) {
		this.iIdNuevoPrioridadPedido = iIdNuevoPrioridadPedido;
	}
	
	public Long getidPrioridadPedidoActual() {
		return this.idPrioridadPedidoActual;
	}

	public void setidPrioridadPedidoActual(Long idPrioridadPedidoActual) {
		this.idPrioridadPedidoActual = idPrioridadPedidoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PrioridadPedido getprioridadpedido() {
		return this.prioridadpedido;
	}

	public void setprioridadpedido(PrioridadPedido prioridadpedido) {
		this.prioridadpedido = prioridadpedido;
	}
	
	public PrioridadPedido getprioridadpedidoAux() {
		return this.prioridadpedidoAux;
	}

	public void setprioridadpedidoAux(PrioridadPedido prioridadpedidoAux) {
		this.prioridadpedidoAux = prioridadpedidoAux;
	}				
	
	public PrioridadPedido getprioridadpedidoAnterior() {
		return this.prioridadpedidoAnterior;
	}

	public void setprioridadpedidoAnterior(PrioridadPedido prioridadpedidoAnterior) {
		this.prioridadpedidoAnterior = prioridadpedidoAnterior;
	}	
	
	public PrioridadPedido getprioridadpedidoTotales() {
		return this.prioridadpedidoTotales;
	}

	public void setprioridadpedidoTotales(PrioridadPedido prioridadpedidoTotales) {
		this.prioridadpedidoTotales = prioridadpedidoTotales;
	}	
	
	public PrioridadPedido getprioridadpedidoBean() {
		return this.prioridadpedidoBean;
	}

	public void setprioridadpedidoBean(PrioridadPedido prioridadpedidoBean) {
		this.prioridadpedidoBean = prioridadpedidoBean;
	}	
	
	public PrioridadPedidoParameterReturnGeneral getprioridadpedidoReturnGeneral() {
		return this.prioridadpedidoReturnGeneral;
	}

	public void setprioridadpedidoReturnGeneral(PrioridadPedidoParameterReturnGeneral prioridadpedidoReturnGeneral) {
		this.prioridadpedidoReturnGeneral = prioridadpedidoReturnGeneral;
	}	
	
	
	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PrioridadPedidoLogic getPrioridadPedidoLogic()	{		
		return prioridadpedidoLogic;
	}

	public void setPrioridadPedidoLogic(PrioridadPedidoLogic prioridadpedidoLogic) {
		this.prioridadpedidoLogic = prioridadpedidoLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoPrioridadPedido() {
		return isEsNuevoPrioridadPedido;
	}

	public void setIsEsNuevoPrioridadPedido(Boolean isEsNuevoPrioridadPedido) {
		this.isEsNuevoPrioridadPedido = isEsNuevoPrioridadPedido;
	}

	public Boolean getEsParaAccionDesdeFormularioPrioridadPedido() {
		return esParaAccionDesdeFormularioPrioridadPedido;
	}
	
	public void setEsParaAccionDesdeFormularioPrioridadPedido(Boolean esParaAccionDesdeFormularioPrioridadPedido) {
		this.esParaAccionDesdeFormularioPrioridadPedido = esParaAccionDesdeFormularioPrioridadPedido;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.prioridadpedidoSessionBean==null) {
				this.prioridadpedidoSessionBean=new PrioridadPedidoSessionBean();
			}

			if(!this.prioridadpedidoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(prioridadpedidoSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.prioridadpedido!=null) {
						this.prioridadpedido.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPrioridadPedido!=null) {
						this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxid_empresaPrioridadPedido.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPrioridadPedido.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPrioridadPedido!=null) {
						if(this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxid_empresaPrioridadPedido.getItemCount()>0) {
							this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxid_empresaPrioridadPedido.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPrioridadPedidoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaPrioridadPedidoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPrioridadPedidoGenerico!=null && jComboBoxid_empresaPrioridadPedidoGenerico.getItemCount()>0) {
					jComboBoxid_empresaPrioridadPedidoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PrioridadPedido prioridadpedido,JComboBox jComboBoxid_empresaPrioridadPedidoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPrioridadPedidoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxid_empresaPrioridadPedido.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPrioridadPedidoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				prioridadpedido.setid_empresa(empresaAux.getId());
				prioridadpedido.setempresa_descripcion(PrioridadPedidoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				prioridadpedido.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPrioridadPedido!=null) { 
							this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxid_empresaPrioridadPedido.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxid_empresaPrioridadPedido.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPrioridadPedido!=null) { 
					}

					if(!PrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPrioridadPedido!=null) {
							this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxid_empresaPrioridadPedido.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPrioridadPedido!=null) {
							this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxid_empresaPrioridadPedido.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPrioridadPedido() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PrioridadPedidoConstantesFunciones.refrescarForeignKeysDescripcionesPrioridadPedido(this.prioridadpedidoLogic.getPrioridadPedidos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PrioridadPedidoConstantesFunciones.refrescarForeignKeysDescripcionesPrioridadPedido(this.prioridadpedidos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//prioridadpedidoLogic.setPrioridadPedidos(this.prioridadpedidos);
			prioridadpedidoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public PrioridadPedidoParameterReturnGeneral getPrioridadPedidoParameterGeneral() {
		return this.prioridadpedidoParameterGeneral;
	}
	
	public void setPrioridadPedidoParameterGeneral(PrioridadPedidoParameterReturnGeneral prioridadpedidoParameterGeneral) {
		this.prioridadpedidoParameterGeneral = prioridadpedidoParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoPrioridadPedido() {
		return isPermisoTodoPrioridadPedido;
	}

	public void setIsPermisoTodoPrioridadPedido(Boolean isPermisoTodoPrioridadPedido) {
		this.isPermisoTodoPrioridadPedido = isPermisoTodoPrioridadPedido;
	}

	public Boolean getIsPermisoNuevoPrioridadPedido() {
		return isPermisoNuevoPrioridadPedido;
	}

	public void setIsPermisoNuevoPrioridadPedido(Boolean isPermisoNuevoPrioridadPedido) {
		this.isPermisoNuevoPrioridadPedido = isPermisoNuevoPrioridadPedido;
	}

	public Boolean getIsPermisoActualizarPrioridadPedido() {
		return isPermisoActualizarPrioridadPedido;
	}

	public void setIsPermisoActualizarPrioridadPedido(Boolean isPermisoActualizarPrioridadPedido) {
		this.isPermisoActualizarPrioridadPedido = isPermisoActualizarPrioridadPedido;
	}

	public Boolean getIsPermisoEliminarPrioridadPedido() {
		return isPermisoEliminarPrioridadPedido;
	}

	public void setIsPermisoEliminarPrioridadPedido(Boolean isPermisoEliminarPrioridadPedido) {
		this.isPermisoEliminarPrioridadPedido = isPermisoEliminarPrioridadPedido;
	}

	public Boolean getIsPermisoGuardarCambiosPrioridadPedido() {
		return isPermisoGuardarCambiosPrioridadPedido;
	}

	public void setIsPermisoGuardarCambiosPrioridadPedido(Boolean isPermisoGuardarCambiosPrioridadPedido) {
		this.isPermisoGuardarCambiosPrioridadPedido = isPermisoGuardarCambiosPrioridadPedido;
	}
	
	public Boolean getIsPermisoConsultaPrioridadPedido() {
		return isPermisoConsultaPrioridadPedido;
	}

	public void setIsPermisoConsultaPrioridadPedido(Boolean isPermisoConsultaPrioridadPedido) {
		this.isPermisoConsultaPrioridadPedido = isPermisoConsultaPrioridadPedido;
	}

	public Boolean getIsPermisoBusquedaPrioridadPedido() {
		return isPermisoBusquedaPrioridadPedido;
	}

	public void setIsPermisoBusquedaPrioridadPedido(Boolean isPermisoBusquedaPrioridadPedido) {
		this.isPermisoBusquedaPrioridadPedido = isPermisoBusquedaPrioridadPedido;
	}

	public Boolean getIsPermisoReportePrioridadPedido() {
		return isPermisoReportePrioridadPedido;
	}

	public void setIsPermisoReportePrioridadPedido(Boolean isPermisoReportePrioridadPedido) {
		this.isPermisoReportePrioridadPedido = isPermisoReportePrioridadPedido;
	}
	
	public Boolean getIsPermisoPaginacionMedioPrioridadPedido() {
		return isPermisoPaginacionMedioPrioridadPedido;
	}

	public void setIsPermisoPaginacionMedioPrioridadPedido(Boolean isPermisoPaginacionMedioPrioridadPedido) {
		this.isPermisoPaginacionMedioPrioridadPedido = isPermisoPaginacionMedioPrioridadPedido;
	}
	
	public Boolean getIsPermisoPaginacionTodoPrioridadPedido() {
		return isPermisoPaginacionTodoPrioridadPedido;
	}

	public void setIsPermisoPaginacionTodoPrioridadPedido(Boolean isPermisoPaginacionTodoPrioridadPedido) {
		this.isPermisoPaginacionTodoPrioridadPedido = isPermisoPaginacionTodoPrioridadPedido;
	}
	
	public Boolean getIsPermisoPaginacionAltoPrioridadPedido() {
		return isPermisoPaginacionAltoPrioridadPedido;
	}

	public void setIsPermisoPaginacionAltoPrioridadPedido(Boolean isPermisoPaginacionAltoPrioridadPedido) {
		this.isPermisoPaginacionAltoPrioridadPedido = isPermisoPaginacionAltoPrioridadPedido;
	}
	
	public Boolean getIsPermisoCopiarPrioridadPedido() {
		return isPermisoCopiarPrioridadPedido;
	}

	public void setIsPermisoCopiarPrioridadPedido(Boolean isPermisoCopiarPrioridadPedido) {
		this.isPermisoCopiarPrioridadPedido = isPermisoCopiarPrioridadPedido;
	}
	
	public Boolean getIsPermisoVerFormPrioridadPedido() {
		return isPermisoVerFormPrioridadPedido;
	}

	public void setIsPermisoVerFormPrioridadPedido(Boolean isPermisoVerFormPrioridadPedido) {
		this.isPermisoVerFormPrioridadPedido = isPermisoVerFormPrioridadPedido;
	}
	
	public Boolean getIsPermisoDuplicarPrioridadPedido() {
		return isPermisoDuplicarPrioridadPedido;
	}

	public void setIsPermisoDuplicarPrioridadPedido(Boolean isPermisoDuplicarPrioridadPedido) {
		this.isPermisoDuplicarPrioridadPedido = isPermisoDuplicarPrioridadPedido;
	}
	
	public Boolean getIsPermisoOrdenPrioridadPedido() {
		return isPermisoOrdenPrioridadPedido;
	}

	public void setIsPermisoOrdenPrioridadPedido(Boolean isPermisoOrdenPrioridadPedido) {
		this.isPermisoOrdenPrioridadPedido = isPermisoOrdenPrioridadPedido;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoPrioridadPedido() {
		return isVisibilidadCeldaNuevoPrioridadPedido;
	}

	public void setIsVisibilidadCeldaNuevoPrioridadPedido(Boolean isVisibilidadCeldaNuevoPrioridadPedido) {
		this.isVisibilidadCeldaNuevoPrioridadPedido = isVisibilidadCeldaNuevoPrioridadPedido;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPrioridadPedido() {
		return isVisibilidadCeldaDuplicarPrioridadPedido;
	}

	public void setIsVisibilidadCeldaDuplicarPrioridadPedido(Boolean isVisibilidadCeldaDuplicarPrioridadPedido) {
		this.isVisibilidadCeldaDuplicarPrioridadPedido = isVisibilidadCeldaDuplicarPrioridadPedido;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPrioridadPedido() {
		return isVisibilidadCeldaCopiarPrioridadPedido;
	}

	public void setIsVisibilidadCeldaCopiarPrioridadPedido(Boolean isVisibilidadCeldaCopiarPrioridadPedido) {
		this.isVisibilidadCeldaCopiarPrioridadPedido = isVisibilidadCeldaCopiarPrioridadPedido;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPrioridadPedido() {
		return isVisibilidadCeldaVerFormPrioridadPedido;
	}

	public void setIsVisibilidadCeldaVerFormPrioridadPedido(Boolean isVisibilidadCeldaVerFormPrioridadPedido) {
		this.isVisibilidadCeldaVerFormPrioridadPedido = isVisibilidadCeldaVerFormPrioridadPedido;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPrioridadPedido() {
		return isVisibilidadCeldaOrdenPrioridadPedido;
	}

	public void setIsVisibilidadCeldaOrdenPrioridadPedido(Boolean isVisibilidadCeldaOrdenPrioridadPedido) {
		this.isVisibilidadCeldaOrdenPrioridadPedido = isVisibilidadCeldaOrdenPrioridadPedido;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPrioridadPedido() {
		return isVisibilidadCeldaNuevoRelacionesPrioridadPedido;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPrioridadPedido(Boolean isVisibilidadCeldaNuevoRelacionesPrioridadPedido) {
		this.isVisibilidadCeldaNuevoRelacionesPrioridadPedido = isVisibilidadCeldaNuevoRelacionesPrioridadPedido;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPrioridadPedido() {
		return isVisibilidadCeldaModificarPrioridadPedido;
	}

	public void setIsVisibilidadCeldaModificarPrioridadPedido(Boolean isVisibilidadCeldaModificarPrioridadPedido) {
		this.isVisibilidadCeldaModificarPrioridadPedido = isVisibilidadCeldaModificarPrioridadPedido;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPrioridadPedido() {
		return isVisibilidadCeldaActualizarPrioridadPedido;
	}

	public void setIsVisibilidadCeldaActualizarPrioridadPedido(Boolean isVisibilidadCeldaActualizarPrioridadPedido) {
		this.isVisibilidadCeldaActualizarPrioridadPedido = isVisibilidadCeldaActualizarPrioridadPedido;
	}

	public Boolean getIsVisibilidadCeldaEliminarPrioridadPedido() {
		return isVisibilidadCeldaEliminarPrioridadPedido;
	}

	public void setIsVisibilidadCeldaEliminarPrioridadPedido(Boolean isVisibilidadCeldaEliminarPrioridadPedido) {
		this.isVisibilidadCeldaEliminarPrioridadPedido = isVisibilidadCeldaEliminarPrioridadPedido;
	}

	public Boolean getIsVisibilidadCeldaCancelarPrioridadPedido() {
		return isVisibilidadCeldaCancelarPrioridadPedido;
	}

	public void setIsVisibilidadCeldaCancelarPrioridadPedido(Boolean isVisibilidadCeldaCancelarPrioridadPedido) {
		this.isVisibilidadCeldaCancelarPrioridadPedido = isVisibilidadCeldaCancelarPrioridadPedido;
	}

	public Boolean getIsVisibilidadCeldaGuardarPrioridadPedido() {
		return isVisibilidadCeldaGuardarPrioridadPedido;
	}

	public void setIsVisibilidadCeldaGuardarPrioridadPedido(Boolean isVisibilidadCeldaGuardarPrioridadPedido) {
		this.isVisibilidadCeldaGuardarPrioridadPedido = isVisibilidadCeldaGuardarPrioridadPedido;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPrioridadPedido() {
		return isVisibilidadCeldaGuardarCambiosPrioridadPedido;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPrioridadPedido(Boolean isVisibilidadCeldaGuardarCambiosPrioridadPedido) {
		this.isVisibilidadCeldaGuardarCambiosPrioridadPedido = isVisibilidadCeldaGuardarCambiosPrioridadPedido;
	}
		
	public PrioridadPedidoSessionBean getprioridadpedidoSessionBean() {
		return this.prioridadpedidoSessionBean;
	}
	
	public void setprioridadpedidoSessionBean(PrioridadPedidoSessionBean prioridadpedidoSessionBean) {
		this.prioridadpedidoSessionBean=prioridadpedidoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPrioridadPedido(PrioridadPedido prioridadpedido)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(prioridadpedido,null);
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(PrioridadPedido prioridadpedido,PrioridadPedido prioridadpedidoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPrioridadPedido(prioridadpedido);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		prioridadpedidoAux.setId(prioridadpedido.getId());
		prioridadpedidoAux.setVersionRow(prioridadpedido.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPrioridadPedido();
		
			int intSelectedRow = this.jTableDatosPrioridadPedido.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prioridadpedido =(PrioridadPedido) this.prioridadpedidoLogic.getPrioridadPedidos().toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.prioridadpedido =(PrioridadPedido) this.prioridadpedidos.toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PrioridadPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPrioridadPedido(this.prioridadpedido,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPrioridadPedido(this.prioridadpedido);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = prioridadpedidoValidator.getInvalidValues(this.prioridadpedido);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			prioridadpedidoLogic.setDatosCliente(datosCliente);
			prioridadpedidoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				prioridadpedidoAux=new  PrioridadPedido();
				
				prioridadpedidoAux.setIsNew(true);
				prioridadpedidoAux.setIsChanged(true);
				
				prioridadpedidoAux.setPrioridadPedidoOriginal(this.prioridadpedido);
				
				prioridadpedidoAux.setId(this.prioridadpedido.getId());	
				prioridadpedidoAux.setVersionRow(this.prioridadpedido.getVersionRow());	
				prioridadpedidoAux.setid_empresa(this.prioridadpedido.getid_empresa());	
				prioridadpedidoAux.setnombre(this.prioridadpedido.getnombre());	
				prioridadpedidoAux.setdia(this.prioridadpedido.getdia());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.prioridadpedidoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.prioridadpedidoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(prioridadpedidoAux,prioridadpedidoLogic.getPrioridadPedidos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(prioridadpedidoAux,prioridadpedidos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.prioridadpedidoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.prioridadpedidoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						prioridadpedidoLogic.savePrioridadPedidos();//WithConnection
						//prioridadpedidoLogic.getSetVersionRowPrioridadPedidos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.prioridadpedido,prioridadpedidoAux);
					
					this.refrescarForeignKeysDescripcionesPrioridadPedido();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.prioridadpedidoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								prioridadpedidoLogic.savePrioridadPedidoRelaciones(prioridadpedidoAux);//WithConnection
								//prioridadpedidoLogic.getSetVersionRowPrioridadPedidos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.prioridadpedido,prioridadpedidoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.prioridadpedidoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.prioridadpedidoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(prioridadpedidoAux,prioridadpedidoLogic.getPrioridadPedidos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(prioridadpedidoAux,prioridadpedidos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.prioridadpedido,prioridadpedidoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				prioridadpedidoAux=new  PrioridadPedido();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.prioridadpedidoSessionBean.getEsGuardarRelacionado() 
					|| (this.prioridadpedidoSessionBean.getEsGuardarRelacionado() && this.prioridadpedido.getId()>=0)) {
						
					prioridadpedidoAux.setIsNew(false);
				}
				
				prioridadpedidoAux.setIsDeleted(false);
			
				prioridadpedidoAux.setId(this.prioridadpedido.getId());	
				prioridadpedidoAux.setVersionRow(this.prioridadpedido.getVersionRow());	
				prioridadpedidoAux.setid_empresa(this.prioridadpedido.getid_empresa());	
				prioridadpedidoAux.setnombre(this.prioridadpedido.getnombre());	
				prioridadpedidoAux.setdia(this.prioridadpedido.getdia());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(prioridadpedidoAux,prioridadpedidoLogic.getPrioridadPedidos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(prioridadpedidoAux,prioridadpedidos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.prioridadpedidoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.prioridadpedidoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						prioridadpedidoLogic.savePrioridadPedidos();//WithConnection
						//prioridadpedidoLogic.getSetVersionRowPrioridadPedidos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.prioridadpedido,prioridadpedidoAux);
					
					this.refrescarForeignKeysDescripcionesPrioridadPedido();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.prioridadpedidoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								prioridadpedidoLogic.savePrioridadPedidoRelaciones(prioridadpedidoAux);//WithConnection
								//prioridadpedidoLogic.getSetVersionRowPrioridadPedidos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.prioridadpedido,prioridadpedidoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.prioridadpedidoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.prioridadpedidoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(prioridadpedidoAux,prioridadpedidoLogic.getPrioridadPedidos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(prioridadpedidoAux,prioridadpedidos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.prioridadpedido,prioridadpedidoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				prioridadpedidoAux=new  PrioridadPedido();
				
				prioridadpedidoAux.setIsNew(false);
				prioridadpedidoAux.setIsChanged(false);
				
				prioridadpedidoAux.setIsDeleted(true);
				
				prioridadpedidoAux.setId(this.prioridadpedido.getId());	
				prioridadpedidoAux.setVersionRow(this.prioridadpedido.getVersionRow());	
				prioridadpedidoAux.setid_empresa(this.prioridadpedido.getid_empresa());	
				prioridadpedidoAux.setnombre(this.prioridadpedido.getnombre());	
				prioridadpedidoAux.setdia(this.prioridadpedido.getdia());	
				
				if(this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.prioridadpedidoAux.getId()>=0) {	
						this.prioridadpedidosEliminados.add(prioridadpedidoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(prioridadpedidoAux,prioridadpedidoLogic.getPrioridadPedidos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(prioridadpedidoAux,prioridadpedidos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.prioridadpedidoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.prioridadpedidoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						prioridadpedidoLogic.savePrioridadPedidos();//WithConnection
						//prioridadpedidoLogic.getSetVersionRowPrioridadPedidos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.prioridadpedidoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								prioridadpedidoLogic.savePrioridadPedidoRelaciones(prioridadpedidoAux);//WithConnection
								//prioridadpedidoLogic.getSetVersionRowPrioridadPedidos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.prioridadpedidoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.prioridadpedidoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(prioridadpedidoAux,prioridadpedidoLogic.getPrioridadPedidos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(prioridadpedidoAux,prioridadpedidos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prioridadpedidoLogic.getPrioridadPedidos().addAll(this.prioridadpedidosEliminados);
					
					prioridadpedidoLogic.savePrioridadPedidos();//WithConnection
					//prioridadpedidoLogic.getSetVersionRowPrioridadPedidos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPrioridadPedido();
				
				this.prioridadpedidosEliminados= new ArrayList<PrioridadPedido>();		
			}
			
			if(this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Prioridad Pedido GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Prioridad Pedido",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.prioridadpedido=prioridadpedidoAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessPrioridadPedido();
      	}
		
	}	
	
	public void actualizarRelaciones(PrioridadPedido prioridadpedidoLocal) throws Exception {
		
		if(this.prioridadpedidoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PrioridadPedido prioridadpedidoLocal) throws Exception {	
		if(this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				prioridadpedidoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPrioridadPedidoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPrioridadPedido.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.prioridadpedido =(PrioridadPedido) this.prioridadpedidoLogic.getPrioridadPedidos().toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.prioridadpedido =(PrioridadPedido) this.prioridadpedidos.toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = prioridadpedidoValidator.getInvalidValues(this.prioridadpedido);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PrioridadPedido prioridadpedido,List<PrioridadPedido> prioridadpedidos) throws Exception {
		try	{		
			PrioridadPedidoConstantesFunciones.actualizarLista(prioridadpedido,prioridadpedidos,this.prioridadpedidoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PrioridadPedido prioridadpedido,List<PrioridadPedido> prioridadpedidos) throws Exception {
		try	{			
			PrioridadPedidoConstantesFunciones.actualizarSelectedLista(prioridadpedido,prioridadpedidos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PrioridadPedido> prioridadpedidosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				prioridadpedidosLocal=this.prioridadpedidoLogic.getPrioridadPedidos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				prioridadpedidosLocal=this.prioridadpedidos;
			}
			//ARCHITECTURE
		
			for(PrioridadPedido prioridadpedidoLocal:prioridadpedidosLocal) {
				if(this.permiteMantenimiento(prioridadpedidoLocal) && prioridadpedidoLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+PrioridadPedidoConstantesFunciones.getPrioridadPedidoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PrioridadPedidoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrioridadPedido.jLabelid_empresaPrioridadPedido,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PrioridadPedidoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrioridadPedido.jLabelnombrePrioridadPedido,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PrioridadPedidoConstantesFunciones.DIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrioridadPedido.jLabeldiaPrioridadPedido,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormPrioridadPedido!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrioridadPedido.jLabelid_empresaPrioridadPedido,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrioridadPedido.jLabelnombrePrioridadPedido,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPrioridadPedido.jLabeldiaPrioridadPedido,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoPrioridadPedido--;	
		
		
		this.prioridadpedidoAux=new PrioridadPedido();
		
		this.prioridadpedidoAux.setId(this.iIdNuevoPrioridadPedido);
		this.prioridadpedidoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.prioridadpedidoLogic.getPrioridadPedidos().add(this.prioridadpedidoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.prioridadpedidos.add(this.prioridadpedidoAux);
		}
		//ARCHITECTURE
		
		this.prioridadpedido=this.prioridadpedidoAux;
		
		if(PrioridadPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPrioridadPedido(this.prioridadpedido);
			this.setVariablesObjetoActualToFormularioForeignKeyPrioridadPedido(this.prioridadpedido);
		}
				
		//this.setDefaultControlesPrioridadPedido();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPrioridadPedido();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPrioridadPedido();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPrioridadPedido();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPrioridadPedido(this.prioridadpedidoBean,this.prioridadpedido,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPrioridadPedido(this.prioridadpedido);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PrioridadPedidoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.prioridadpedidoSessionBean.getConGuardarRelaciones()) {
			classes=PrioridadPedidoConstantesFunciones.getClassesRelationshipsOfPrioridadPedido(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.prioridadpedidoReturnGeneral=prioridadpedidoLogic.procesarEventosPrioridadPedidosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.prioridadpedidoLogic.getPrioridadPedidos(),this.prioridadpedido,this.prioridadpedidoParameterGeneral,this.isEsNuevoPrioridadPedido,classes);//this.prioridadpedidoLogic.getPrioridadPedido()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPrioridadPedido(this.prioridadpedidoReturnGeneral,this.prioridadpedidoBean,false);
		
		if(this.prioridadpedidoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPrioridadPedido(this.prioridadpedidoReturnGeneral.getPrioridadPedido());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPrioridadPedido(this.prioridadpedidoReturnGeneral.getPrioridadPedido());
		}
		
		if(this.prioridadpedidoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPrioridadPedido(this.prioridadpedidoReturnGeneral.getPrioridadPedido(),classes);//this.prioridadpedidoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPrioridadPedido(this.prioridadpedido,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPrioridadPedido();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPrioridadPedido();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PrioridadPedidoBeanSwingJInternalFrameAdditional.RecargarFormPrioridadPedido(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPrioridadPedido(false);
						
			if(prioridadpedidoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPrioridadPedido();
			}
			
			this.actualizarVisualTableDatosPrioridadPedido();
			
			this.jTableDatosPrioridadPedido.setRowSelectionInterval(this.getIndiceNuevoPrioridadPedido(), this.getIndiceNuevoPrioridadPedido());
			
			this.seleccionarFilaTablaPrioridadPedidoActual();
						
			this.actualizarEstadoCeldasBotonesPrioridadPedido("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPrioridadPedido(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPrioridadPedido.jTextFieldnombrePrioridadPedido.setEnabled(isHabilitar && this.prioridadpedidoConstantesFunciones.activarnombrePrioridadPedido);
		this.jInternalFrameDetalleFormPrioridadPedido.jTextFielddiaPrioridadPedido.setEnabled(isHabilitar && this.prioridadpedidoConstantesFunciones.activardiaPrioridadPedido);	
		//
		this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxid_empresaPrioridadPedido.setEnabled(isHabilitar && this.prioridadpedidoConstantesFunciones.activarid_empresaPrioridadPedido);
	};
	
	public void setDefaultControlesPrioridadPedido() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPrioridadPedido(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.prioridadpedidoSessionBean.setConGuardarRelaciones(true);			
			this.prioridadpedidoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPrioridadPedido.jTabbedPaneRelacionesPrioridadPedido.setVisible(true);
			
					
		} else {
			//this.prioridadpedidoSessionBean.setConGuardarRelaciones(false);			
			this.prioridadpedidoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPrioridadPedido.jTabbedPaneRelacionesPrioridadPedido.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPrioridadPedido() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PrioridadPedido prioridadpedidoAux:this.prioridadpedidoLogic.getPrioridadPedidos()) {
				if(prioridadpedidoAux.getId().equals(this.iIdNuevoPrioridadPedido)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PrioridadPedido prioridadpedidoAux:this.prioridadpedidos) {
				if(prioridadpedidoAux.getId().equals(this.iIdNuevoPrioridadPedido)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualPrioridadPedido(PrioridadPedido prioridadpedido,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PrioridadPedido prioridadpedidoAux:this.prioridadpedidoLogic.getPrioridadPedidos()) {
				if(prioridadpedidoAux.getId().equals(prioridadpedido.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PrioridadPedido prioridadpedidoAux:this.prioridadpedidos) {
				if(prioridadpedidoAux.getId().equals(prioridadpedido.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalPrioridadPedido(PrioridadPedido prioridadpedidoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PrioridadPedido prioridadpedidoAux:this.prioridadpedidoLogic.getPrioridadPedidos()) {
				if(prioridadpedidoAux.getPrioridadPedidoOriginal().getId().equals(prioridadpedidoOriginal.getId())) {
					existe=true;
					prioridadpedidoOriginal.setId(prioridadpedidoAux.getId());
					prioridadpedidoOriginal.setVersionRow(prioridadpedidoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PrioridadPedido prioridadpedidoAux:this.prioridadpedidos) {
				if(prioridadpedidoAux.getPrioridadPedidoOriginal().getId().equals(prioridadpedidoOriginal.getId())) {
					existe=true;
					prioridadpedidoOriginal.setId(prioridadpedidoAux.getId());
					prioridadpedidoOriginal.setVersionRow(prioridadpedidoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPrioridadPedido(Boolean esParaCancelar) throws Exception {
		prioridadpedidosAux=new ArrayList<PrioridadPedido>();
		prioridadpedidoAux=new PrioridadPedido();
		
		if(!this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PrioridadPedido prioridadpedidoAux:this.prioridadpedidoLogic.getPrioridadPedidos()) {
					if(prioridadpedidoAux.getId()<0) {
						prioridadpedidosAux.add(prioridadpedidoAux);
					}		
				}
				this.iIdNuevoPrioridadPedido=0L;
				this.prioridadpedidoLogic.getPrioridadPedidos().removeAll(prioridadpedidosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PrioridadPedido prioridadpedidoAux:this.prioridadpedidos) {
					if(prioridadpedidoAux.getId()<0) {
						prioridadpedidosAux.add(prioridadpedidoAux);
					}		
				}
				this.iIdNuevoPrioridadPedido=0L;
				this.prioridadpedidos.removeAll(prioridadpedidosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPrioridadPedido 
					&& this.prioridadpedidoLogic.getPrioridadPedidos().size()>0
					) {
					prioridadpedidoAux=this.prioridadpedidoLogic.getPrioridadPedidos().get(this.prioridadpedidoLogic.getPrioridadPedidos().size() - 1);
				
					if(prioridadpedidoAux.getId()<0) {
						this.prioridadpedidoLogic.getPrioridadPedidos().remove(prioridadpedidoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPrioridadPedido && this.prioridadpedidos.size()>0) {
					prioridadpedidoAux=this.prioridadpedidos.get(this.prioridadpedidos.size() - 1);
				
					if(prioridadpedidoAux.getId()<0) {
						this.prioridadpedidos.remove(prioridadpedidoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPrioridadPedido(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(prioridadpedido.getId()<0) {
				this.prioridadpedidoLogic.getPrioridadPedidos().remove(this.prioridadpedido);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(prioridadpedido.getId()<0) {
				this.prioridadpedidos.remove(this.prioridadpedido);
			}
		}			
	}
	
	public void setEstadosInicialesPrioridadPedido(List<PrioridadPedido> prioridadpedidosAux) throws Exception {
		PrioridadPedidoConstantesFunciones.setEstadosInicialesPrioridadPedido(prioridadpedidosAux);
	}
	
	public void setEstadosInicialesPrioridadPedido(PrioridadPedido prioridadpedidoAux) throws Exception {
		PrioridadPedidoConstantesFunciones.setEstadosInicialesPrioridadPedido(prioridadpedidoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPrioridadPedidoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPrioridadPedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPrioridadPedidoActual()) {
				if(!this.isEsNuevoPrioridadPedido) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPrioridadPedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPrioridadPedido=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPrioridadPedidoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Prioridad Pedido ?", "MANTENIMIENTO DE Prioridad Pedido", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPrioridadPedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PrioridadPedido prioridadpedido) throws Exception {
		PrioridadPedidoConstantesFunciones.seleccionarAsignar(this.prioridadpedido,prioridadpedido);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPrioridadPedido=this.isPermisoActualizarOriginalPrioridadPedido;
			
			
			this.seleccionarAsignar(prioridadpedido);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PrioridadPedidoConstantesFunciones.quitarEspaciosPrioridadPedido(this.prioridadpedido,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPrioridadPedido("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.prioridadpedidoSessionBean.setsFuncionBusquedaRapida(this.prioridadpedidoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPrioridadPedido) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPrioridadPedido(esParaCancelar);				
				this.cancelarNuevoPrioridadPedido(esParaCancelar);								
			}
			
			this.prioridadpedido=new PrioridadPedido();
			
			this.inicializarPrioridadPedido();
			
			this.actualizarEstadoCeldasBotonesPrioridadPedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPrioridadPedido() throws Exception {
		try {
			PrioridadPedidoConstantesFunciones.inicializarPrioridadPedido(this.prioridadpedido);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.prioridadpedidoLogic.getPrioridadPedidos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePrioridadPedidos(String sAccionBusqueda,List<PrioridadPedido> prioridadpedidosParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="PrioridadPedido"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PrioridadPedidoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PrioridadPedidoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PrioridadPedido"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Prioridad Pedidoes");		
		parameters.put("busquedapor", PrioridadPedidoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePrioridadPedido=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PrioridadPedidoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PrioridadPedidoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePrioridadPedido=new JRBeanArrayDataSource(PrioridadPedidoJInternalFrame.TraerPrioridadPedidoBeans(prioridadpedidosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePrioridadPedido);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PrioridadPedidoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PrioridadPedidoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PrioridadPedidoBean.TraerPrioridadPedidoBeans(prioridadpedidosParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReportePrioridadPedidos(sAccionBusqueda,sTipoArchivoReporte,prioridadpedidosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPrioridadPedidos(sAccionBusqueda,sTipoArchivoReporte,prioridadpedidosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPrioridadPedidoActionPerformed(null);
					//this.generarExcelReportePrioridadPedidos(sAccionBusqueda,sTipoArchivoReporte,prioridadpedidosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPrioridadPedidos(sAccionBusqueda,sTipoArchivoReporte,prioridadpedidosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPrioridadPedidos(sAccionBusqueda,sTipoArchivoReporte,prioridadpedidosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPrioridadPedidos(sAccionBusqueda,sTipoArchivoReporte,prioridadpedidosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePrioridadPedidos(String sAccionBusqueda,String sTipoArchivoReporte,List<PrioridadPedido> prioridadpedidosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"prioridadpedido";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PrioridadPedidos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPrioridadPedido("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PrioridadPedido prioridadpedido : prioridadpedidosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PrioridadPedidoConstantesFunciones.generarExcelReporteDataPrioridadPedido("NORMAL",row,workbook,prioridadpedido,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Prioridad Pedido",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPrioridadPedido(String sTipo,Row row,Workbook workbook) {
		
		PrioridadPedidoConstantesFunciones.generarExcelReporteHeaderPrioridadPedido(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPrioridadPedidos(String sAccionBusqueda,String sTipoArchivoReporte,List<PrioridadPedido> prioridadpedidosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"prioridadpedido_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PrioridadPedidos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PrioridadPedido prioridadpedido : prioridadpedidosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PrioridadPedidoConstantesFunciones.getPrioridadPedidoDescripcion(prioridadpedido));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrioridadPedidoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrioridadPedidoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(prioridadpedido.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrioridadPedidoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrioridadPedidoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(prioridadpedido.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PrioridadPedidoConstantesFunciones.LABEL_DIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PrioridadPedidoConstantesFunciones.LABEL_DIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(prioridadpedido.getdia());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Prioridad Pedido",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPrioridadPedidos(String sAccionBusqueda,String sTipoArchivoReporte,List<PrioridadPedido> prioridadpedidosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PrioridadPedido> prioridadpedidosRespaldo=null;
		
		classes=PrioridadPedidoConstantesFunciones.getClassesRelationshipsOfPrioridadPedido(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.prioridadpedidoLogic.setDatosCliente(this.datosCliente);
		this.prioridadpedidoLogic.setDatosDeep(this.datosDeep);
		this.prioridadpedidoLogic.setIsConDeep(true);
		
		prioridadpedidosRespaldo=this.prioridadpedidoLogic.getPrioridadPedidos();
		
		this.prioridadpedidoLogic.setPrioridadPedidos(prioridadpedidosParaReportes);	
		this.prioridadpedidoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		prioridadpedidosParaReportes=this.prioridadpedidoLogic.getPrioridadPedidos();
		this.prioridadpedidoLogic.setPrioridadPedidos(prioridadpedidosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"prioridadpedido_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PrioridadPedidos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPrioridadPedido("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PrioridadPedido prioridadpedido : prioridadpedidosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPrioridadPedido("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PrioridadPedidoConstantesFunciones.generarExcelReporteDataPrioridadPedido("NORMAL",row,workbook,prioridadpedido,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PrioridadPedidoConstantesFunciones.getPrioridadPedidoDescripcion(prioridadpedido));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Prioridad Pedido",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPrioridadPedido.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPrioridadPedido.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPrioridadPedido.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPrioridadPedido.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPrioridadPedido() throws Exception {		
		this.startProcessPrioridadPedido(true);
	}
	
	public void startProcessPrioridadPedido(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPrioridadPedido ,this.jPanelParametrosReportesPrioridadPedido, this.jScrollPanelDatosPrioridadPedido,this.jPanelPaginacionPrioridadPedido, this.jScrollPanelDatosEdicionPrioridadPedido, this.jPanelAccionesPrioridadPedido,this.jPanelAccionesFormularioPrioridadPedido,this.jmenuBarPrioridadPedido,this.jmenuBarDetallePrioridadPedido,this.jTtoolBarPrioridadPedido,this.jTtoolBarDetallePrioridadPedido);		
		
		final JTabbedPane jTabbedPaneBusquedasPrioridadPedido=this.jTabbedPaneBusquedasPrioridadPedido; 
		
		final JPanel jPanelParametrosReportesPrioridadPedido=this.jPanelParametrosReportesPrioridadPedido;
		//final JScrollPane jScrollPanelDatosPrioridadPedido=this.jScrollPanelDatosPrioridadPedido;
		final JTable jTableDatosPrioridadPedido=this.jTableDatosPrioridadPedido;		
		final JPanel jPanelPaginacionPrioridadPedido=this.jPanelPaginacionPrioridadPedido;
		//final JScrollPane jScrollPanelDatosEdicionPrioridadPedido=this.jScrollPanelDatosEdicionPrioridadPedido;
		final JPanel jPanelAccionesPrioridadPedido=this.jPanelAccionesPrioridadPedido;
		
		JPanel jPanelCamposAuxiliarPrioridadPedido=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPrioridadPedido=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPrioridadPedido!=null) {
			jPanelCamposAuxiliarPrioridadPedido=this.jInternalFrameDetalleFormPrioridadPedido.jPanelCamposPrioridadPedido;
			jPanelAccionesFormularioAuxiliarPrioridadPedido=this.jInternalFrameDetalleFormPrioridadPedido.jPanelAccionesFormularioPrioridadPedido;
		}
		
		final JPanel jPanelCamposPrioridadPedido=jPanelCamposAuxiliarPrioridadPedido;
		final JPanel jPanelAccionesFormularioPrioridadPedido=jPanelAccionesFormularioAuxiliarPrioridadPedido;
		
		
		final JMenuBar jmenuBarPrioridadPedido=this.jmenuBarPrioridadPedido;
		final JToolBar jTtoolBarPrioridadPedido=this.jTtoolBarPrioridadPedido;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPrioridadPedido=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPrioridadPedido=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPrioridadPedido!=null) {
			jmenuBarDetalleAuxiliarPrioridadPedido=this.jInternalFrameDetalleFormPrioridadPedido.jmenuBarDetallePrioridadPedido;
			jTtoolBarDetalleAuxiliarPrioridadPedido=this.jInternalFrameDetalleFormPrioridadPedido.jTtoolBarDetallePrioridadPedido;
		}
		
		final JMenuBar jmenuBarDetallePrioridadPedido=jmenuBarDetalleAuxiliarPrioridadPedido;
		final JToolBar jTtoolBarDetallePrioridadPedido=jTtoolBarDetalleAuxiliarPrioridadPedido;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPrioridadPedido;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPrioridadPedido;
			processRunnable.jTableDatos=jTableDatosPrioridadPedido;
			processRunnable.jPanelCampos=jPanelCamposPrioridadPedido;
			processRunnable.jPanelPaginacion=jPanelPaginacionPrioridadPedido;
			processRunnable.jPanelAcciones=jPanelAccionesPrioridadPedido;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPrioridadPedido;
			
			
			processRunnable.jmenuBar=jmenuBarPrioridadPedido;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePrioridadPedido;
			processRunnable.jTtoolBar=jTtoolBarPrioridadPedido;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePrioridadPedido;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPrioridadPedido ,jPanelParametrosReportesPrioridadPedido,jTableDatosPrioridadPedido, /*jScrollPanelDatosPrioridadPedido,*/jPanelCamposPrioridadPedido,jPanelPaginacionPrioridadPedido, /*jScrollPanelDatosEdicionPrioridadPedido,*/ jPanelAccionesPrioridadPedido,jPanelAccionesFormularioPrioridadPedido,jmenuBarPrioridadPedido,jmenuBarDetallePrioridadPedido,jTtoolBarPrioridadPedido,jTtoolBarDetallePrioridadPedido);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPrioridadPedido ,jPanelParametrosReportesPrioridadPedido, jScrollPanelDatosPrioridadPedido,jPanelPaginacionPrioridadPedido, jScrollPanelDatosEdicionPrioridadPedido, jPanelAccionesPrioridadPedido,jPanelAccionesFormularioPrioridadPedido,jmenuBarPrioridadPedido,jmenuBarDetallePrioridadPedido,jTtoolBarPrioridadPedido,jTtoolBarDetallePrioridadPedido);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessPrioridadPedido() {// throws Exception 
		this.finishProcessPrioridadPedido(true);
	}
	
	public void finishProcessPrioridadPedido(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPrioridadPedido ,this.jPanelParametrosReportesPrioridadPedido, this.jScrollPanelDatosPrioridadPedido,this.jPanelPaginacionPrioridadPedido, this.jScrollPanelDatosEdicionPrioridadPedido, this.jPanelAccionesPrioridadPedido,this.jPanelAccionesFormularioPrioridadPedido,this.jmenuBarPrioridadPedido,this.jmenuBarDetallePrioridadPedido,this.jTtoolBarPrioridadPedido,this.jTtoolBarDetallePrioridadPedido);		
		
		final JTabbedPane jTabbedPaneBusquedasPrioridadPedido=this.jTabbedPaneBusquedasPrioridadPedido; 
		
		final JPanel jPanelParametrosReportesPrioridadPedido=this.jPanelParametrosReportesPrioridadPedido;
		//final JScrollPane jScrollPanelDatosPrioridadPedido=this.jScrollPanelDatosPrioridadPedido;
		final JTable jTableDatosPrioridadPedido=this.jTableDatosPrioridadPedido;		
		final JPanel jPanelPaginacionPrioridadPedido=this.jPanelPaginacionPrioridadPedido;
		//final JScrollPane jScrollPanelDatosEdicionPrioridadPedido=this.jScrollPanelDatosEdicionPrioridadPedido;
		final JPanel jPanelAccionesPrioridadPedido=this.jPanelAccionesPrioridadPedido;
		
		JPanel jPanelCamposAuxiliarPrioridadPedido=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPrioridadPedido=new JPanel();
		
		if(this.jInternalFrameDetalleFormPrioridadPedido!=null) {
			jPanelCamposAuxiliarPrioridadPedido=this.jInternalFrameDetalleFormPrioridadPedido.jPanelCamposPrioridadPedido;
			jPanelAccionesFormularioAuxiliarPrioridadPedido=this.jInternalFrameDetalleFormPrioridadPedido.jPanelAccionesFormularioPrioridadPedido;
		}
		
		final JPanel jPanelCamposPrioridadPedido=jPanelCamposAuxiliarPrioridadPedido;
		final JPanel jPanelAccionesFormularioPrioridadPedido=jPanelAccionesFormularioAuxiliarPrioridadPedido;
		
		
		final JMenuBar jmenuBarPrioridadPedido=this.jmenuBarPrioridadPedido;		
		final JToolBar jTtoolBarPrioridadPedido=this.jTtoolBarPrioridadPedido;
				
		JMenuBar jmenuBarDetalleAuxiliarPrioridadPedido=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPrioridadPedido=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPrioridadPedido!=null) {
			jmenuBarDetalleAuxiliarPrioridadPedido=this.jInternalFrameDetalleFormPrioridadPedido.jmenuBarDetallePrioridadPedido;
			jTtoolBarDetalleAuxiliarPrioridadPedido=this.jInternalFrameDetalleFormPrioridadPedido.jTtoolBarDetallePrioridadPedido;		
		}
		
		final JMenuBar jmenuBarDetallePrioridadPedido=jmenuBarDetalleAuxiliarPrioridadPedido;
		final JToolBar jTtoolBarDetallePrioridadPedido=jTtoolBarDetalleAuxiliarPrioridadPedido;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPrioridadPedido;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPrioridadPedido;
			processRunnable.jTableDatos=jTableDatosPrioridadPedido;
			processRunnable.jPanelCampos=jPanelCamposPrioridadPedido;
			processRunnable.jPanelPaginacion=jPanelPaginacionPrioridadPedido;
			processRunnable.jPanelAcciones=jPanelAccionesPrioridadPedido;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPrioridadPedido;
			
			
			processRunnable.jmenuBar=jmenuBarPrioridadPedido;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePrioridadPedido;
			processRunnable.jTtoolBar=jTtoolBarPrioridadPedido;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePrioridadPedido;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPrioridadPedido ,jPanelParametrosReportesPrioridadPedido, jTableDatosPrioridadPedido,/*jScrollPanelDatosPrioridadPedido,*/jPanelCamposPrioridadPedido,jPanelPaginacionPrioridadPedido, /*jScrollPanelDatosEdicionPrioridadPedido,*/ jPanelAccionesPrioridadPedido,jPanelAccionesFormularioPrioridadPedido,jmenuBarPrioridadPedido,jmenuBarDetallePrioridadPedido,jTtoolBarPrioridadPedido,jTtoolBarDetallePrioridadPedido));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPrioridadPedido(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPrioridadPedido(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPrioridadPedido(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPrioridadPedido(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPrioridadPedido,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePrioridadPedido,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPrioridadPedido(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPrioridadPedido,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePrioridadPedido,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.prioridadpedidoConstantesFunciones.getsFinalQueryPrioridadPedido();
		String  finalQueryPaginacionTodos=this.prioridadpedidoConstantesFunciones.getsFinalQueryPrioridadPedido();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=PrioridadPedidoConstantesFunciones.getArrayColumnasGlobalesNoPrioridadPedido(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PrioridadPedidoConstantesFunciones.getArrayColumnasGlobalesPrioridadPedido(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PrioridadPedidoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.prioridadpedidosEliminados= new ArrayList<PrioridadPedido>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPrioridadPedido();
		
				///*PrioridadPedidoSessionBean*/this.prioridadpedidoSessionBean=new PrioridadPedidoSessionBean();
			
			if(this.prioridadpedidoSessionBean==null) {
				this.prioridadpedidoSessionBean=new PrioridadPedidoSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=PrioridadPedidoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PrioridadPedidoConstantesFunciones.getClassesForeignKeysOfPrioridadPedido(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/prioridadpedido."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			prioridadpedidosAux= new ArrayList<PrioridadPedido>();
			
				
			prioridadpedidoLogic.setDatosCliente(this.datosCliente);
			prioridadpedidoLogic.setDatosDeep(this.datosDeep);
			prioridadpedidoLogic.setIsConDeep(true);
			
			
			prioridadpedidoLogic.getPrioridadPedidoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					prioridadpedidoLogic.getTodosPrioridadPedidos(finalQueryGlobal,pagination);
					
					//prioridadpedidoLogic.getTodosPrioridadPedidosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(prioridadpedidoLogic.getPrioridadPedidos()==null|| prioridadpedidoLogic.getPrioridadPedidos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							prioridadpedidosAux= new ArrayList<PrioridadPedido>();
							prioridadpedidosAux.addAll(prioridadpedidoLogic.getPrioridadPedidos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							prioridadpedidosAux= new ArrayList<PrioridadPedido>();
							prioridadpedidosAux.addAll(prioridadpedidos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							prioridadpedidoLogic.getTodosPrioridadPedidos(finalQueryGlobal+"",this.pagination);												
							
							//prioridadpedidoLogic.getTodosPrioridadPedidosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePrioridadPedidos("Todos",prioridadpedidoLogic.getPrioridadPedidos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							prioridadpedidoLogic.setPrioridadPedidos(new ArrayList<PrioridadPedido>());					
							prioridadpedidoLogic.getPrioridadPedidos().addAll(prioridadpedidosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							prioridadpedidos=new ArrayList<PrioridadPedido>();
							prioridadpedidos.addAll(prioridadpedidosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPrioridadPedido=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPrioridadPedido=this.idActual;
				
				} else if(this.idPrioridadPedidoActual!=null && this.idPrioridadPedidoActual!=0L) {
					idPrioridadPedido=idPrioridadPedidoActual;
				}
				
					
				this.sDetalleReporte=PrioridadPedidoConstantesFunciones.getDetalleIndicePorId(idPrioridadPedido);
				
				this.prioridadpedidos=new ArrayList<PrioridadPedido>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					prioridadpedidoLogic.getEntity(idPrioridadPedido);
					
					//prioridadpedidoLogic.getEntityWithConnection(idPrioridadPedido);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					prioridadpedidoLogic.setPrioridadPedidos(new ArrayList<PrioridadPedido>());
					prioridadpedidoLogic.getPrioridadPedidos().add(prioridadpedidoLogic.getPrioridadPedido());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.prioridadpedidos=new ArrayList<PrioridadPedido>();
					this.prioridadpedidos.add(prioridadpedido);
				}
				
				if(prioridadpedidoLogic.getPrioridadPedido()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=PrioridadPedidoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					prioridadpedidoLogic.getPrioridadPedidosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrioridadPedidoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrioridadPedidoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=prioridadpedidoLogic.getPrioridadPedidos()==null||prioridadpedidoLogic.getPrioridadPedidos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=prioridadpedidos==null|| prioridadpedidos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						prioridadpedidosAux=new ArrayList<PrioridadPedido>();
						prioridadpedidosAux.addAll(prioridadpedidoLogic.getPrioridadPedidos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							prioridadpedidosAux=new ArrayList<PrioridadPedido>();
							prioridadpedidosAux.addAll(prioridadpedidos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							prioridadpedidoLogic.getPrioridadPedidosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrioridadPedidoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrioridadPedidoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePrioridadPedidos("BusquedaPorNombre",prioridadpedidoLogic.getPrioridadPedidos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePrioridadPedidos("BusquedaPorNombre",prioridadpedidos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						prioridadpedidoLogic.setPrioridadPedidos(new ArrayList<PrioridadPedido>());
						prioridadpedidoLogic.getPrioridadPedidos().addAll(prioridadpedidosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							prioridadpedidos=new ArrayList<PrioridadPedido>();
							prioridadpedidos.addAll(prioridadpedidosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=PrioridadPedidoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					prioridadpedidoLogic.getPrioridadPedidosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrioridadPedidoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrioridadPedidoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=prioridadpedidoLogic.getPrioridadPedidos()==null||prioridadpedidoLogic.getPrioridadPedidos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=prioridadpedidos==null|| prioridadpedidos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						prioridadpedidosAux=new ArrayList<PrioridadPedido>();
						prioridadpedidosAux.addAll(prioridadpedidoLogic.getPrioridadPedidos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							prioridadpedidosAux=new ArrayList<PrioridadPedido>();
							prioridadpedidosAux.addAll(prioridadpedidos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							prioridadpedidoLogic.getPrioridadPedidosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PrioridadPedidoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PrioridadPedidoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePrioridadPedidos("FK_IdEmpresa",prioridadpedidoLogic.getPrioridadPedidos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePrioridadPedidos("FK_IdEmpresa",prioridadpedidos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						prioridadpedidoLogic.setPrioridadPedidos(new ArrayList<PrioridadPedido>());
						prioridadpedidoLogic.getPrioridadPedidos().addAll(prioridadpedidosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							prioridadpedidos=new ArrayList<PrioridadPedido>();
							prioridadpedidos.addAll(prioridadpedidosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPrioridadPedido();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPrioridadPedido();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=prioridadpedidoLogic.getPrioridadPedidos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=prioridadpedidos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=prioridadpedidoLogic.getPrioridadPedidos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=prioridadpedidos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PrioridadPedido prioridadpedido) {
		Boolean permite=true;
		
		if(this.prioridadpedido.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PrioridadPedidoConstantesFunciones.getOrderByListaPrioridadPedido();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PrioridadPedidoConstantesFunciones.getOrderByListaPrioridadPedido();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PrioridadPedido prioridadpedido:prioridadpedidoLogic.getPrioridadPedidos()) {
				if(prioridadpedido.getsType().equals(Constantes2.S_TOTALES)) {
					prioridadpedidoTotales=prioridadpedido;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PrioridadPedido prioridadpedido:this.prioridadpedidos) {
				if(prioridadpedido.getsType().equals(Constantes2.S_TOTALES)) {
					prioridadpedidoTotales=prioridadpedido;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.prioridadpedidoAux=new PrioridadPedido();
			this.prioridadpedidoAux.setsType(Constantes2.S_TOTALES);
			this.prioridadpedidoAux.setIsNew(false);
			this.prioridadpedidoAux.setIsChanged(false);
			this.prioridadpedidoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PrioridadPedidoConstantesFunciones.TotalizarValoresFilaPrioridadPedido(this.prioridadpedidoLogic.getPrioridadPedidos(),this.prioridadpedidoAux);
				
				this.prioridadpedidoLogic.getPrioridadPedidos().add(this.prioridadpedidoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PrioridadPedidoConstantesFunciones.TotalizarValoresFilaPrioridadPedido(this.prioridadpedidos,this.prioridadpedidoAux);
				
				this.prioridadpedidos.add(this.prioridadpedidoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		prioridadpedidoTotales=new PrioridadPedido();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.prioridadpedidoLogic.getPrioridadPedidos().remove(prioridadpedidoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.prioridadpedidos.remove(prioridadpedidoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		prioridadpedidoTotales=new PrioridadPedido();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PrioridadPedido prioridadpedido:prioridadpedidoLogic.getPrioridadPedidos()) {
				if(prioridadpedido.getsType().equals(Constantes2.S_TOTALES)) {
					prioridadpedidoTotales=prioridadpedido;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PrioridadPedidoConstantesFunciones.TotalizarValoresFilaPrioridadPedido(this.prioridadpedidoLogic.getPrioridadPedidos(),prioridadpedidoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PrioridadPedido prioridadpedido:this.prioridadpedidos) {
				if(prioridadpedido.getsType().equals(Constantes2.S_TOTALES)) {
					prioridadpedidoTotales=prioridadpedido;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PrioridadPedidoConstantesFunciones.TotalizarValoresFilaPrioridadPedido(this.prioridadpedidos,prioridadpedidoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPrioridadPedidosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPrioridadPedidosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPrioridadPedidosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					prioridadpedidoLogic.getPrioridadPedidosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPrioridadPedidosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					prioridadpedidoLogic.getPrioridadPedidosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosPrioridadPedido() {
		this.isPermisoTodoPrioridadPedido=false;
		this.isPermisoNuevoPrioridadPedido=false;
		this.isPermisoActualizarPrioridadPedido=false;
		this.isPermisoActualizarOriginalPrioridadPedido=false;
		this.isPermisoEliminarPrioridadPedido=false;
		this.isPermisoGuardarCambiosPrioridadPedido=false;
		this.isPermisoConsultaPrioridadPedido=false;
		this.isPermisoBusquedaPrioridadPedido=false;
		this.isPermisoReportePrioridadPedido=false;		
		this.isPermisoOrdenPrioridadPedido=false;		
		this.isPermisoPaginacionMedioPrioridadPedido=false;		
		this.isPermisoPaginacionAltoPrioridadPedido=false;
		this.isPermisoPaginacionTodoPrioridadPedido=false;
		this.isPermisoCopiarPrioridadPedido=false;		
		this.isPermisoVerFormPrioridadPedido=false;		
		this.isPermisoDuplicarPrioridadPedido=false;		
		this.isPermisoOrdenPrioridadPedido=false;		
	}
	
	public void setPermisosUsuarioPrioridadPedido(Boolean isPermiso) {
		this.isPermisoTodoPrioridadPedido=isPermiso;
		this.isPermisoNuevoPrioridadPedido=isPermiso;
		this.isPermisoActualizarPrioridadPedido=isPermiso;
		this.isPermisoActualizarOriginalPrioridadPedido=isPermiso;
		this.isPermisoEliminarPrioridadPedido=isPermiso;
		this.isPermisoGuardarCambiosPrioridadPedido=isPermiso;
		this.isPermisoConsultaPrioridadPedido=isPermiso;
		this.isPermisoBusquedaPrioridadPedido=isPermiso;
		this.isPermisoReportePrioridadPedido=isPermiso;
		this.isPermisoOrdenPrioridadPedido=isPermiso;		
		this.isPermisoPaginacionMedioPrioridadPedido=isPermiso;		
		this.isPermisoPaginacionAltoPrioridadPedido=isPermiso;		
		this.isPermisoPaginacionTodoPrioridadPedido=isPermiso;		
		this.isPermisoCopiarPrioridadPedido=isPermiso;		
		this.isPermisoVerFormPrioridadPedido=isPermiso;		
		this.isPermisoDuplicarPrioridadPedido=isPermiso;
		this.isPermisoOrdenPrioridadPedido=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPrioridadPedido(Boolean isPermiso) {
		//this.isPermisoTodoPrioridadPedido=isPermiso;
		this.isPermisoNuevoPrioridadPedido=isPermiso;
		this.isPermisoActualizarPrioridadPedido=isPermiso;
		this.isPermisoActualizarOriginalPrioridadPedido=isPermiso;
		this.isPermisoEliminarPrioridadPedido=isPermiso;
		this.isPermisoGuardarCambiosPrioridadPedido=isPermiso;
		//this.isPermisoConsultaPrioridadPedido=isPermiso;
		//this.isPermisoBusquedaPrioridadPedido=isPermiso;
		//this.isPermisoReportePrioridadPedido=isPermiso;
		//this.isPermisoOrdenPrioridadPedido=isPermiso;		
		//this.isPermisoPaginacionMedioPrioridadPedido=isPermiso;		
		//this.isPermisoPaginacionAltoPrioridadPedido=isPermiso;		
		//this.isPermisoPaginacionTodoPrioridadPedido=isPermiso;		
		//this.isPermisoCopiarPrioridadPedido=isPermiso;		
		//this.isPermisoDuplicarPrioridadPedido=isPermiso;
		//this.isPermisoOrdenPrioridadPedido=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPrioridadPedidoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PrioridadPedidoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebPrioridadPedido(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPrioridadPedidoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPrioridadPedidoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPrioridadPedidoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPrioridadPedidoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPrioridadPedido() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PrioridadPedidoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PrioridadPedidoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPrioridadPedido=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPrioridadPedido=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPrioridadPedido=this.isPermisoActualizarPrioridadPedido;
			this.isPermisoEliminarPrioridadPedido=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPrioridadPedido=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPrioridadPedido=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPrioridadPedido=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPrioridadPedido=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePrioridadPedido=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPrioridadPedido=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPrioridadPedido=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPrioridadPedido=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPrioridadPedido=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPrioridadPedido=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPrioridadPedido=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPrioridadPedido=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPrioridadPedido=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPrioridadPedido.setToolTipText(this.jTableDatosPrioridadPedido.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPrioridadPedido(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPrioridadPedido(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PrioridadPedidoJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(PrioridadPedidoJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioPrioridadPedido() throws Exception {
		Reporte reporte=null;
		
		
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyPrioridadPedidoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPrioridadPedidoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PrioridadPedidoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPrioridadPedidoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyPrioridadPedidoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PrioridadPedidoParameterReturnGeneral prioridadpedidoReturnGeneral=new PrioridadPedidoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.prioridadpedidoConstantesFunciones.cargarid_empresaPrioridadPedido)
					 || (this.esRecargarFks && this.prioridadpedidoConstantesFunciones.cargarid_empresaPrioridadPedido)) {

					if(!this.prioridadpedidoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+prioridadpedidoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				prioridadpedidoReturnGeneral=prioridadpedidoLogic.cargarCombosLoteForeignKeyPrioridadPedido(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=prioridadpedidoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPrioridadPedido()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.prioridadpedidoSessionBean==null) {
				this.prioridadpedidoSessionBean=new PrioridadPedidoSessionBean();
			}

			if(!this.prioridadpedidoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyPrioridadPedido()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPrioridadPedido(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPrioridadPedido()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPrioridadPedido();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPrioridadPedido(PrioridadPedido prioridadpedido)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPrioridadPedido(PrioridadPedido prioridadpedido,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPrioridadPedido()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPrioridadPedido()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPrioridadPedido()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPrioridadPedido()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPrioridadPedido()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPrioridadPedido()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPrioridadPedido(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPrioridadPedido()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxid_empresaPrioridadPedido!=null && this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxid_empresaPrioridadPedido.getItemCount()>0) {
				this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxid_empresaPrioridadPedido.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public PrioridadPedidoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PrioridadPedidoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PrioridadPedidoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.prioridadpedidoSessionBean=new PrioridadPedidoSessionBean(); 
		this.prioridadpedidoConstantesFunciones=new PrioridadPedidoConstantesFunciones(); 
		this.prioridadpedidoBean=new PrioridadPedido();//(this.prioridadpedidoConstantesFunciones); 		
		this.prioridadpedidoReturnGeneral=new PrioridadPedidoParameterReturnGeneral(); 
		
		this.prioridadpedidoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.prioridadpedidoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PrioridadPedidoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PrioridadPedidoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PrioridadPedidoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPrioridadPedido(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.prioridadpedidoConstantesFunciones=new PrioridadPedidoConstantesFunciones(); 
			this.prioridadpedidoBean=new PrioridadPedido();//this.prioridadpedidoConstantesFunciones); 			
			this.prioridadpedidoReturnGeneral=new PrioridadPedidoParameterReturnGeneral(); 
		
			PrioridadPedidoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Prioridad Pedido Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.prioridadpedido=new PrioridadPedido();
			this.prioridadpedidos = new ArrayList<PrioridadPedido>();
			this.prioridadpedidosAux = new ArrayList<PrioridadPedido>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic=new PrioridadPedidoLogic();
				this.prioridadpedidoLogic.getNewConnexionToDeep("");
			}
			
			//this.prioridadpedidoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.prioridadpedidoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPrioridadPedido);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPrioridadPedido!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPrioridadPedido);	
					}
					
					if(this.jInternalFrameImportacionPrioridadPedido!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPrioridadPedido);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPrioridadPedido!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPrioridadPedido);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPrioridadPedido!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPrioridadPedido);
				this.jInternalFrameDetalleFormPrioridadPedido.setVisible(false);
				this.jInternalFrameDetalleFormPrioridadPedido.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPrioridadPedido!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPrioridadPedido);
					this.jInternalFrameReporteDinamicoPrioridadPedido.setVisible(false);
					this.jInternalFrameReporteDinamicoPrioridadPedido.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPrioridadPedido!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPrioridadPedido);
					this.jInternalFrameImportacionPrioridadPedido.setVisible(false);
					this.jInternalFrameImportacionPrioridadPedido.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPrioridadPedido!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPrioridadPedido);
					this.jInternalFrameOrderByPrioridadPedido.setVisible(false);
					this.jInternalFrameOrderByPrioridadPedido.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPrioridadPedidoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PrioridadPedidoConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.prioridadpedidoReturnGeneral=new PrioridadPedidoParameterReturnGeneral();
			
			this.prioridadpedidoParameterGeneral=new PrioridadPedidoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.prioridadpedidoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(PrioridadPedidoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PrioridadPedidoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.prioridadpedidoSessionBean.getEsGuardarRelacionado(),this.prioridadpedidoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PrioridadPedidoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.prioridadpedidoSessionBean.getEsGuardarRelacionado(),this.prioridadpedidoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoPrioridadPedido=false;
			this.isVisibilidadCeldaDuplicarPrioridadPedido=true;
			this.isVisibilidadCeldaCopiarPrioridadPedido=true;
			this.isVisibilidadCeldaVerFormPrioridadPedido=true;
			this.isVisibilidadCeldaOrdenPrioridadPedido=true;
			this.isVisibilidadCeldaNuevoRelacionesPrioridadPedido=false;
			this.isVisibilidadCeldaModificarPrioridadPedido=false;
			this.isVisibilidadCeldaActualizarPrioridadPedido=false;
			this.isVisibilidadCeldaEliminarPrioridadPedido=false;
			this.isVisibilidadCeldaCancelarPrioridadPedido=false;
			this.isVisibilidadCeldaGuardarPrioridadPedido=false;
			this.isVisibilidadCeldaGuardarCambiosPrioridadPedido=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPrioridadPedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPrioridadPedido();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPrioridadPedido(false);
			
			this.setPermisosUsuarioPrioridadPedido();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.prioridadpedidoSessionBean.getEsGuardarRelacionado() 
				|| (this.prioridadpedidoSessionBean.getEsGuardarRelacionado() && this.prioridadpedidoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPrioridadPedidoClasesRelacionadas();
			}
			
			if(this.prioridadpedidoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPrioridadPedidoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPrioridadPedido();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPrioridadPedido();
			}
			
			if(!this.isPermisoBusquedaPrioridadPedido) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPrioridadPedido.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPrioridadPedido,this.isPermisoPaginacionMedioPrioridadPedido,this.isPermisoPaginacionTodoPrioridadPedido);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PrioridadPedidoConstantesFunciones.getTiposSeleccionarPrioridadPedido());
				
				this.tiposColumnasSelect=PrioridadPedidoConstantesFunciones.getTiposSeleccionarPrioridadPedido(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPrioridadPedido();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioPrioridadPedido(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioPrioridadPedido(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPrioridadPedido() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				prioridadpedidoImplementable= (PrioridadPedidoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PrioridadPedidoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				prioridadpedidoImplementableHome= (PrioridadPedidoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PrioridadPedidoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.prioridadpedidos= new ArrayList<PrioridadPedido>();
			this.prioridadpedidosEliminados= new ArrayList<PrioridadPedido>();
						
			this.isEsNuevoPrioridadPedido=false;
			this.esParaAccionDesdeFormularioPrioridadPedido=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPrioridadPedido(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPrioridadPedido();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PrioridadPedidoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PrioridadPedidoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPrioridadPedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPrioridadPedido(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPrioridadPedido!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPrioridadPedido();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPrioridadPedido();
			}
			
			PrioridadPedidoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPrioridadPedido.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPrioridadPedido.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPrioridadPedido.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPrioridadPedido(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PrioridadPedido: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPrioridadPedido() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPrioridadPedido")) {
				iIndex=this.jInternalFrameDetalleFormPrioridadPedido.jTabbedPaneRelacionesPrioridadPedido.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPrioridadPedido.jTabbedPaneRelacionesPrioridadPedido.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPrioridadPedido.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPrioridadPedido();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyPrioridadPedido(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPrioridadPedido(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPrioridadPedido(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPrioridadPedidoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPrioridadPedido();
		
		this.cargarCombosFrameForeignKeyPrioridadPedido();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPrioridadPedido();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPrioridadPedido();
		}
	}
	
	
	
	public void jButtonNuevoPrioridadPedidoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.prioridadpedidoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPrioridadPedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
			
			
			if(jTableDatosPrioridadPedido.getRowCount()>=1) {
				jTableDatosPrioridadPedido.removeRowSelectionInterval(0, jTableDatosPrioridadPedido.getRowCount()-1);						
			}
			
			this.isEsNuevoPrioridadPedido=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPrioridadPedido(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPrioridadPedido(true);			
			//this.prioridadpedido=new PrioridadPedido();
			//this.prioridadpedido.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPrioridadPedido(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPrioridadPedido() ;
			
			if(PrioridadPedidoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePrioridadPedido(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.prioridadpedido);	
			this.actualizarInformacion("INFO_PADRE",false,this.prioridadpedido);				
			
			PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
			
			if(this.prioridadpedidoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PrioridadPedido: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPrioridadPedidoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PrioridadPedido> prioridadpedidosSeleccionados=new ArrayList<PrioridadPedido>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPrioridadPedido.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPrioridadPedido.getSelectedRows().length;			
			}
			
			prioridadpedidosSeleccionados=this.getPrioridadPedidosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPrioridadPedido--;			
				//PrioridadPedido prioridadpedidoAux= new PrioridadPedido();			
				//prioridadpedidoAux.setId(this.iIdNuevoPrioridadPedido);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PrioridadPedido prioridadpedidoOrigen=new PrioridadPedido();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PrioridadPedido prioridadpedidoOrigen : prioridadpedidosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPrioridadPedido.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							prioridadpedidoOrigen =(PrioridadPedido) this.prioridadpedidoLogic.getPrioridadPedidos().toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							prioridadpedidoOrigen =(PrioridadPedido) this.prioridadpedidos.toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPrioridadPedido();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.prioridadpedido.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPrioridadPedido(prioridadpedidoOrigen,this.prioridadpedido,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPrioridadPedido(this.prioridadpedido);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.prioridadpedidoLogic.getPrioridadPedidos().add(this.prioridadpedidoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.prioridadpedidos.add(this.prioridadpedidoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPrioridadPedido(false);
				
				this.jTableDatosPrioridadPedido.setRowSelectionInterval(this.getIndiceNuevoPrioridadPedido(), this.getIndiceNuevoPrioridadPedido());
				
				int iLastRow =  this.jTableDatosPrioridadPedido.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPrioridadPedido.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPrioridadPedido.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPrioridadPedido(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PrioridadPedido> prioridadpedidosSeleccionados=new ArrayList<PrioridadPedido>();									
		
			PrioridadPedido prioridadpedidoOrigen=new PrioridadPedido();
			PrioridadPedido prioridadpedidoDestino=new PrioridadPedido();
				
			prioridadpedidosSeleccionados=this.getPrioridadPedidosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPrioridadPedido.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || prioridadpedidosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPrioridadPedido.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						prioridadpedidoOrigen =(PrioridadPedido) this.prioridadpedidoLogic.getPrioridadPedidos().toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						prioridadpedidoOrigen =(PrioridadPedido) this.prioridadpedidos.toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						prioridadpedidoDestino =(PrioridadPedido) this.prioridadpedidoLogic.getPrioridadPedidos().toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						prioridadpedidoDestino =(PrioridadPedido) this.prioridadpedidos.toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				prioridadpedidoOrigen =prioridadpedidosSeleccionados.get(0);
				prioridadpedidoDestino =prioridadpedidosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPrioridadPedido(prioridadpedidoOrigen,prioridadpedidoDestino,true,false);
				
				prioridadpedidoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(prioridadpedidoDestino,prioridadpedidoLogic.getPrioridadPedidos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(prioridadpedidoDestino,prioridadpedidos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPrioridadPedido(false);
				
				//this.jTableDatosPrioridadPedido.setRowSelectionInterval(this.getIndiceNuevoPrioridadPedido(), this.getIndiceNuevoPrioridadPedido());
				
				int iLastRow =  this.jTableDatosPrioridadPedido.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPrioridadPedido.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPrioridadPedido.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPrioridadPedido(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPrioridadPedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPrioridadPedido.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPrioridadPedido.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPrioridadPedido.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPrioridadPedido.setVisible(!isVisible);
			this.jPanelPaginacionPrioridadPedido.setVisible(!isVisible);
			this.jPanelAccionesPrioridadPedido.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePrioridadPedido();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPrioridadPedido();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPrioridadPedido();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPrioridadPedido();
			
			this.abrirFrameOrderByPrioridadPedido();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPrioridadPedido();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePrioridadPedido(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPrioridadPedido);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPrioridadPedido.isMaximum()) {
					this.jInternalFrameDetalleFormPrioridadPedido.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPrioridadPedido.setSize(this.jInternalFrameDetalleFormPrioridadPedido.iWidthFormulario,this.jInternalFrameDetalleFormPrioridadPedido.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPrioridadPedido.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPrioridadPedido.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPrioridadPedido.isMaximum()) {
						this.jInternalFrameDetalleFormPrioridadPedido.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPrioridadPedido.jContentPaneDetallePrioridadPedido.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPrioridadPedido.jTabbedPaneRelacionesPrioridadPedido.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPrioridadPedido.jContentPaneDetallePrioridadPedido.getWidth(),PrioridadPedidoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPrioridadPedido.jTabbedPaneRelacionesPrioridadPedido.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPrioridadPedido.jContentPaneDetallePrioridadPedido.getWidth(),PrioridadPedidoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPrioridadPedido.jTabbedPaneRelacionesPrioridadPedido.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPrioridadPedido.jContentPaneDetallePrioridadPedido.getWidth(),PrioridadPedidoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPrioridadPedido.setVisible(true);
	        this.jInternalFrameDetalleFormPrioridadPedido.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPrioridadPedido() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPrioridadPedido==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPrioridadPedido=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPrioridadPedido,false,this);
				} else {
					this.jInternalFrameOrderByPrioridadPedido=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPrioridadPedido,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPrioridadPedido);
				this.jInternalFrameOrderByPrioridadPedido.setVisible(false);
				this.jInternalFrameOrderByPrioridadPedido.setSelected(false);
				
				this.jInternalFrameOrderByPrioridadPedido.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPrioridadPedido"));
				
				this.inicializarActualizarBindingTablaOrderByPrioridadPedido();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPrioridadPedido() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPrioridadPedido==null) {
				
				this.jInternalFrameImportacionPrioridadPedido=new ImportacionJInternalFrame(PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPrioridadPedido);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPrioridadPedido);
				this.jInternalFrameImportacionPrioridadPedido.setVisible(false);
				this.jInternalFrameImportacionPrioridadPedido.setSelected(false);


				this.jInternalFrameImportacionPrioridadPedido.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPrioridadPedido"));
				this.jInternalFrameImportacionPrioridadPedido.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPrioridadPedido"));
				this.jInternalFrameImportacionPrioridadPedido.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPrioridadPedido"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPrioridadPedido() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPrioridadPedido==null) {
				this.jInternalFrameReporteDinamicoPrioridadPedido=new ReporteDinamicoJInternalFrame(PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPrioridadPedido);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPrioridadPedido);
				this.jInternalFrameReporteDinamicoPrioridadPedido.setVisible(false);
				this.jInternalFrameReporteDinamicoPrioridadPedido.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPrioridadPedido.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPrioridadPedido"));
				this.jInternalFrameReporteDinamicoPrioridadPedido.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPrioridadPedido"));
				this.jInternalFrameReporteDinamicoPrioridadPedido.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPrioridadPedido"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPrioridadPedido();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetallePrioridadPedido() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPrioridadPedido);
			
	       	this.jInternalFrameDetalleFormPrioridadPedido.setVisible(false);
	        this.jInternalFrameDetalleFormPrioridadPedido.setSelected(false);
			
			//this.jInternalFrameDetalleFormPrioridadPedido.dispose();
			//this.jInternalFrameDetalleFormPrioridadPedido=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPrioridadPedido() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPrioridadPedido.setVisible(true);
	        this.jInternalFrameReporteDinamicoPrioridadPedido.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPrioridadPedido() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPrioridadPedido.setVisible(true);
	        this.jInternalFrameImportacionPrioridadPedido.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPrioridadPedido() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPrioridadPedido.setVisible(true);
	        this.jInternalFrameOrderByPrioridadPedido.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPrioridadPedido() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPrioridadPedido.setVisible(false);
	        this.jInternalFrameOrderByPrioridadPedido.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPrioridadPedido() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPrioridadPedido.setVisible(false);
	        this.jInternalFrameReporteDinamicoPrioridadPedido.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPrioridadPedido() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPrioridadPedido.setVisible(false);
	        this.jInternalFrameImportacionPrioridadPedido.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPrioridadPedido(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPrioridadPedido(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPrioridadPedido.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPrioridadPedido(true);
			//this.isEsNuevoPrioridadPedido=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedido =(PrioridadPedido) this.prioridadpedidoLogic.getPrioridadPedidos().toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.prioridadpedido =(PrioridadPedido) this.prioridadpedidos.toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPrioridadPedido("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPrioridadPedido(false) ;
			
			if(prioridadpedidoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PrioridadPedidoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePrioridadPedido(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPrioridadPedido(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPrioridadPedidoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPrioridadPedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prioridadpedido =(PrioridadPedido) this.prioridadpedidoLogic.getPrioridadPedidos().toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.prioridadpedido =(PrioridadPedido) this.prioridadpedidos.toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPrioridadPedido(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPrioridadPedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPrioridadPedido.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPrioridadPedido(true);
			//this.isEsNuevoPrioridadPedido=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedido =(PrioridadPedido) this.prioridadpedidoLogic.getPrioridadPedidos().toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.prioridadpedido =(PrioridadPedido) this.prioridadpedidos.toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.prioridadpedido.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPrioridadPedido("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPrioridadPedido(false) ;
			
			if(PrioridadPedidoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePrioridadPedido(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPrioridadPedido(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPrioridadPedido(false);
			
			//if(!this.isEsNuevoPrioridadPedido) {								
				int intSelectedRow = this.jTableDatosPrioridadPedido.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prioridadpedido =(PrioridadPedido) this.prioridadpedidoLogic.getPrioridadPedidos().toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.prioridadpedido =(PrioridadPedido) this.prioridadpedidos.toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PrioridadPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPrioridadPedido(this.prioridadpedido,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPrioridadPedido(this.prioridadpedido);
				
			}
			
			if(this.permiteMantenimiento(this.prioridadpedido)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPrioridadPedido=true;
					this.inicializarActualizarBindingTablaPrioridadPedido(false);
					this.isEsNuevoPrioridadPedido=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPrioridadPedido=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPrioridadPedido=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPrioridadPedido(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPrioridadPedido(false);
				
				this.habilitarDeshabilitarControlesPrioridadPedido(false);
			
												
				
				if(PrioridadPedidoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePrioridadPedido();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPrioridadPedidoActionPerformed(evt,prioridadpedidoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPrioridadPedido(this.prioridadpedido,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPrioridadPedido.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,prioridadpedidoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.prioridadpedido.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PrioridadPedido.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PrioridadPedido.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPrioridadPedido.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedido =(PrioridadPedido) this.prioridadpedidoLogic.getPrioridadPedidos().toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				this.prioridadpedido.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.prioridadpedido =(PrioridadPedido) this.prioridadpedidos.toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				this.prioridadpedido.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.prioridadpedido)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PrioridadPedidoModel) this.jTableDatosPrioridadPedido.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPrioridadPedido=true;
				this.inicializarActualizarBindingTablaPrioridadPedido(false);
				this.isEsNuevoPrioridadPedido=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPrioridadPedido(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPrioridadPedido(false);
				
				this.habilitarDeshabilitarControlesPrioridadPedido(false);
				
				
				
				if(PrioridadPedidoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePrioridadPedido();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPrioridadPedido.getRowCount()>=1) {
				jTableDatosPrioridadPedido.removeRowSelectionInterval(0, jTableDatosPrioridadPedido.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPrioridadPedido(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPrioridadPedido(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPrioridadPedido(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPrioridadPedido(false) ;
			
			this.isEsNuevoPrioridadPedido=false;
			
			if(PrioridadPedidoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePrioridadPedido();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPrioridadPedido(false);
				
				//SI ES MANUAL
				if(PrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPrioridadPedido();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPrioridadPedido--;			
			//PrioridadPedido prioridadpedidoAux= new PrioridadPedido();			
			//prioridadpedidoAux.setId(this.iIdNuevoPrioridadPedido);
			
			if(this.jInternalFrameDetalleFormPrioridadPedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPrioridadPedido();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPrioridadPedido(this.prioridadpedido);
			
			this.prioridadpedido.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.prioridadpedidoLogic.getPrioridadPedidos().add(this.prioridadpedidoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.prioridadpedidos.add(this.prioridadpedidoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPrioridadPedido(false);
			
			this.jTableDatosPrioridadPedido.setRowSelectionInterval(this.getIndiceNuevoPrioridadPedido(), this.getIndiceNuevoPrioridadPedido());
			
			int iLastRow =  this.jTableDatosPrioridadPedido.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPrioridadPedido.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPrioridadPedido.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPrioridadPedido(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPrioridadPedido(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPrioridadPedido(false);
			
			//SI ES MANUAL
			if(PrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPrioridadPedido();
			}
			
			//this.abrirFrameTreePrioridadPedido();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Prioridad PedidoES ?", "MANTENIMIENTO DE Prioridad Pedido", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPrioridadPedido.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPrioridadPedido();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.prioridadpedidoReturnGeneral=prioridadpedidoLogic.procesarImportacionPrioridadPedidosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.prioridadpedidoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPrioridadPedidoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPrioridadPedido.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPrioridadPedido.setFileImportacion(this.jInternalFrameImportacionPrioridadPedido.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPrioridadPedido.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPrioridadPedido.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPrioridadPedido.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPrioridadPedido.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PrioridadPedido> prioridadpedidosSeleccionados=new ArrayList<PrioridadPedido>();		

		prioridadpedidosSeleccionados=this.getPrioridadPedidosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPrioridadPedido.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPrioridadPedido.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PrioridadPedidoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PrioridadPedidoBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReportePrioridadPedidos("Todos",prioridadpedidosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Prioridad Pedido",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoPrioridadPedido.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPrioridadPedido.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PrioridadPedidoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PrioridadPedidoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PrioridadPedidoConstantesFunciones.LABEL_DIA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_a_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_a_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_a_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_a_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoPrioridadPedido.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPrioridadPedido.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPrioridadPedido.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PrioridadPedidoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case PrioridadPedidoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case PrioridadPedidoConstantesFunciones.LABEL_DIA:
					sNombreCampoCategoria="dia";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPrioridadPedido.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PrioridadPedidoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case PrioridadPedidoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case PrioridadPedidoConstantesFunciones.LABEL_DIA:
					sNombreCampoCategoriaValor="dia";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPrioridadPedido.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPrioridadPedido.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PrioridadPedidoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case PrioridadPedidoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case PrioridadPedidoConstantesFunciones.LABEL_DIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dia");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PrioridadPedido> prioridadpedidosSeleccionados=new ArrayList<PrioridadPedido>();		
		
		prioridadpedidosSeleccionados=this.getPrioridadPedidosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"prioridadpedido";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("PrioridadPedidos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPrioridadPedido.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPrioridadPedido.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PrioridadPedidoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrioridadPedidoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PrioridadPedido prioridadpedido:prioridadpedidosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(prioridadpedido.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PrioridadPedidoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrioridadPedidoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(PrioridadPedido prioridadpedido:prioridadpedidosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(prioridadpedido.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PrioridadPedidoConstantesFunciones.LABEL_DIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PrioridadPedidoConstantesFunciones.LABEL_DIA);
					iRow++;

					for(PrioridadPedido prioridadpedido:prioridadpedidosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(prioridadpedido.getdia());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelPrioridadPedido(row);				
			//	iRow++;
			//}				
			
			//for(PrioridadPedido prioridadpedidoAux:prioridadpedidosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPrioridadPedido(prioridadpedidoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Prioridad Pedido",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPrioridadPedido(false);
			
			//SI ES MANUAL
			if(PrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPrioridadPedido();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPrioridadPedido(false);
			
			//SI ES MANUAL
			if(PrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPrioridadPedido();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPrioridadPedido(false);
			
			//SI ES MANUAL
			if(PrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPrioridadPedido();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPrioridadPedido() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPrioridadPedido.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPrioridadPedido.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPrioridadPedido.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPrioridadPedido.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPrioridadPedido.setMinimumSize(dimensionMinimum);
		this.jTableDatosPrioridadPedido.setMaximumSize(dimensionMaximum);
		this.jTableDatosPrioridadPedido.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPrioridadPedido(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPrioridadPedido(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPrioridadPedido(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPrioridadPedido(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPrioridadPedido(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPrioridadPedido(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPrioridadPedido(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPrioridadPedido(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PrioridadPedidoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPrioridadPedido() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPrioridadPedido();
		
		this.inicializarActualizarBindingBotonesManualPrioridadPedido(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPrioridadPedido();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPrioridadPedido() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPrioridadPedido(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPrioridadPedido(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPrioridadPedido.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPrioridadPedido.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePrioridadPedido.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPrioridadPedido!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPrioridadPedido.jCheckBoxPostAccionNuevoPrioridadPedido.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPrioridadPedido.jCheckBoxPostAccionSinCerrarPrioridadPedido.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPrioridadPedido.jCheckBoxPostAccionSinMensajePrioridadPedido.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPrioridadPedido.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPrioridadPedido.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePrioridadPedido.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPrioridadPedido!=null) {
				this.jInternalFrameDetalleFormPrioridadPedido.jCheckBoxPostAccionNuevoPrioridadPedido.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPrioridadPedido.jCheckBoxPostAccionSinCerrarPrioridadPedido.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPrioridadPedido.jCheckBoxPostAccionSinMensajePrioridadPedido.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPrioridadPedido.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPrioridadPedido.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPrioridadPedido!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxTiposAccionesFormularioPrioridadPedido.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPrioridadPedido.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPrioridadPedido!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPrioridadPedido.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPrioridadPedido.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPrioridadPedido.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPrioridadPedido.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPrioridadPedido.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPrioridadPedido!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPrioridadPedido.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPrioridadPedido.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPrioridadPedido.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPrioridadPedido(Boolean esInicializar) throws Exception {
		try	{	
			if(PrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPrioridadPedido(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPrioridadPedido() throws Exception {
		try	{
			if(PrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPrioridadPedido();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePrioridadPedido() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxTiposAccionesFormularioPrioridadPedido.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxTiposAccionesFormularioPrioridadPedido.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPrioridadPedido() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPrioridadPedido.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPrioridadPedido.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPrioridadPedido.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPrioridadPedido.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPrioridadPedido.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPrioridadPedido.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPrioridadPedido.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPrioridadPedido.addItem(reporte);
			}
			
			
			if(!this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPrioridadPedido.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPrioridadPedido.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPrioridadPedido.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPrioridadPedido.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPrioridadPedido.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPrioridadPedido.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxTiposAccionesFormularioPrioridadPedido.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxTiposAccionesFormularioPrioridadPedido.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPrioridadPedido.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPrioridadPedido.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPrioridadPedido.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPrioridadPedido();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPrioridadPedido() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPrioridadPedido!=null) {
				this.jInternalFrameReporteDinamicoPrioridadPedido.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPrioridadPedido.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPrioridadPedido!=null) {
				this.jInternalFrameReporteDinamicoPrioridadPedido.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPrioridadPedido.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPrioridadPedido!=null) {
				
				if(this.jInternalFrameReporteDinamicoPrioridadPedido.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPrioridadPedido.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPrioridadPedido.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPrioridadPedido.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPrioridadPedido.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPrioridadPedido.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPrioridadPedido()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextFieldnombreBusquedaPorNombrePrioridadPedido.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPrioridadPedido(Boolean esInicializar) throws Exception {				
		if(PrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPrioridadPedido();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPrioridadPedido() throws Exception {
		this.inicializarActualizarBindingTablaPrioridadPedido(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPrioridadPedido() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPrioridadPedido.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPrioridadPedido.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPrioridadPedido.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PrioridadPedidoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPrioridadPedido.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPrioridadPedido.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PrioridadPedidoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPrioridadPedidoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrioridadPedidoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PrioridadPedidoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPrioridadPedido.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPrioridadPedido.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PrioridadPedidoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPrioridadPedido.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPrioridadPedido(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=prioridadpedidoLogic.getPrioridadPedidos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=prioridadpedidos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PrioridadPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPrioridadPedido.setModel(new PrioridadPedidoModel(this.prioridadpedidoLogic.getPrioridadPedidos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPrioridadPedido.setModel(new PrioridadPedidoModel(this.prioridadpedidos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPrioridadPedido!=null && this.jInternalFrameOrderByPrioridadPedido.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPrioridadPedido();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPrioridadPedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrioridadPedido,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PrioridadPedidoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO,prioridadpedidoConstantesFunciones.resaltarSeleccionarPrioridadPedido,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PrioridadPedidoConstantesFunciones.SCLASSWEBTITULO,prioridadpedidoConstantesFunciones.resaltarSeleccionarPrioridadPedido,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPrioridadPedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrioridadPedido,PrioridadPedidoConstantesFunciones.LABEL_ID));

		if(this.prioridadpedidoConstantesFunciones.mostraridPrioridadPedido && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrioridadPedidoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.prioridadpedidoConstantesFunciones.resaltaridPrioridadPedido,this.prioridadpedidoConstantesFunciones.activaridPrioridadPedido,this,true,"idPrioridadPedido","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.prioridadpedidoConstantesFunciones.resaltaridPrioridadPedido,this.prioridadpedidoConstantesFunciones.activaridPrioridadPedido,this,true,"idPrioridadPedido","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrioridadPedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrioridadPedido,PrioridadPedidoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.prioridadpedidoConstantesFunciones.mostrarid_empresaPrioridadPedido && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrioridadPedidoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.prioridadpedidoConstantesFunciones.resaltarid_empresaPrioridadPedido,this,this.prioridadpedidoConstantesFunciones.activarid_empresaPrioridadPedido));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.prioridadpedidoConstantesFunciones.resaltarid_empresaPrioridadPedido,this,this.prioridadpedidoConstantesFunciones.activarid_empresaPrioridadPedido,false,"id_empresaPrioridadPedido","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PrioridadPedidoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrioridadPedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrioridadPedido,PrioridadPedidoConstantesFunciones.LABEL_NOMBRE));

		if(this.prioridadpedidoConstantesFunciones.mostrarnombrePrioridadPedido && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrioridadPedidoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.prioridadpedidoConstantesFunciones.resaltarnombrePrioridadPedido,this.prioridadpedidoConstantesFunciones.activarnombrePrioridadPedido,this,true,"nombrePrioridadPedido","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.prioridadpedidoConstantesFunciones.resaltarnombrePrioridadPedido,this.prioridadpedidoConstantesFunciones.activarnombrePrioridadPedido,this,true,"nombrePrioridadPedido","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PrioridadPedidoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPrioridadPedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPrioridadPedido,PrioridadPedidoConstantesFunciones.LABEL_DIA));

		if(this.prioridadpedidoConstantesFunciones.mostrardiaPrioridadPedido && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PrioridadPedidoConstantesFunciones.LABEL_DIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.prioridadpedidoConstantesFunciones.resaltardiaPrioridadPedido,this.prioridadpedidoConstantesFunciones.activardiaPrioridadPedido,this,true,"diaPrioridadPedido","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.prioridadpedidoConstantesFunciones.resaltardiaPrioridadPedido,this.prioridadpedidoConstantesFunciones.activardiaPrioridadPedido,this,true,"diaPrioridadPedido","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PrioridadPedidoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.prioridadpedidoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.prioridadpedidoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.prioridadpedidoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPrioridadPedido.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.prioridadpedidoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.prioridadpedidoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPrioridadPedido.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPrioridadPedido && this.isPermisoGuardarCambiosPrioridadPedido) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.prioridadpedidoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.prioridadpedidoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPrioridadPedido.addColumn(tableColumn);
				}
			}			
						
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosPrioridadPedido.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPrioridadPedido && this.isPermisoGuardarCambiosPrioridadPedido) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPrioridadPedido && this.isPermisoGuardarCambiosPrioridadPedido) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPrioridadPedido.moveColumn(this.jTableDatosPrioridadPedido.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPrioridadPedido.moveColumn(this.jTableDatosPrioridadPedido.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPrioridadPedido.moveColumn(this.jTableDatosPrioridadPedido.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPrioridadPedido.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPrioridadPedido.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPrioridadPedido,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PrioridadPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPrioridadPedido.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPrioridadPedido.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PrioridadPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PrioridadPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPrioridadPedido.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPrioridadPedido.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPrioridadPedido.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=prioridadpedidoLogic.getPrioridadPedidos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=prioridadpedidos.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosPrioridadPedido.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPrioridadPedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPrioridadPedido();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoPrioridadPedido=false;
					
				PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
			
				if(this.prioridadpedidoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPrioridadPedido==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPrioridadPedido.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPrioridadPedido.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prioridadpedido =(PrioridadPedido) this.prioridadpedidoLogic.getPrioridadPedidos().toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.prioridadpedido =(PrioridadPedido) this.prioridadpedidos.toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.prioridadpedido.getsType().equals("DUPLICADO")
				   || this.prioridadpedido.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPrioridadPedido=true;
				
				} else {
					this.isEsNuevoPrioridadPedido=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {
					if(this.prioridadpedido.getId()>=0 && !this.prioridadpedido.getIsNew()) {						
						this.isEsNuevoPrioridadPedido=false;
						
					} else {
						this.isEsNuevoPrioridadPedido=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPrioridadPedido(esRelaciones);						
				
				this.seleccionarPrioridadPedido(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.prioridadpedido.getId()<0) {
					this.isEsNuevoPrioridadPedido=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPrioridadPedido(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPrioridadPedido(evt,rowIndex);
				}	
				
				if(this.prioridadpedidoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PrioridadPedido: " + this.dDif); 
					}
				}								
				
				PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPrioridadPedido(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.prioridadpedido)) {
					if(this.prioridadpedido.getId()>0) {
						this.prioridadpedido.setIsDeleted(true);
						
						this.prioridadpedidosEliminados.add(this.prioridadpedido);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.prioridadpedidoLogic.getPrioridadPedidos().remove(this.prioridadpedido);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.prioridadpedidos.remove(this.prioridadpedido);				
					}
					
					
					((PrioridadPedidoModel) this.jTableDatosPrioridadPedido.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPrioridadPedido(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPrioridadPedido(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPrioridadPedido) {
			
			if(this.jInternalFrameDetalleFormPrioridadPedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPrioridadPedido.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPrioridadPedido.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prioridadpedido =(PrioridadPedido) this.prioridadpedidoLogic.getPrioridadPedidos().toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.prioridadpedido =(PrioridadPedido) this.prioridadpedidos.toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PrioridadPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPrioridadPedido(this.prioridadpedido);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.prioridadpedidoConstantesFunciones.cargarid_empresaPrioridadPedido || this.prioridadpedidoConstantesFunciones.event_dependid_empresaPrioridadPedido) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.prioridadpedido.getid_empresa());
									//this.inicializarActualizarBindingPrioridadPedido(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(prioridadpedido.getEmpresa()!=null) {
							this.empresasForeignKey.add(prioridadpedido.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.prioridadpedido.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPrioridadPedido("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPrioridadPedido(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPrioridadPedido() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPrioridadPedido(PrioridadPedido prioridadpedido) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPrioridadPedido(prioridadpedido,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPrioridadPedido(PrioridadPedido prioridadpedido,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPrioridadPedido(prioridadpedido);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPrioridadPedido(prioridadpedido,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPrioridadPedido(prioridadpedido);
	}
	
	public void setVariablesObjetoActualToFormularioPrioridadPedido(PrioridadPedido prioridadpedido) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPrioridadPedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPrioridadPedido.jLabelidPrioridadPedido.setText(prioridadpedido.getId().toString());
			this.jInternalFrameDetalleFormPrioridadPedido.jTextFieldnombrePrioridadPedido.setText(prioridadpedido.getnombre());
			this.jInternalFrameDetalleFormPrioridadPedido.jTextFielddiaPrioridadPedido.setText(prioridadpedido.getdia().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PrioridadPedido prioridadpedidoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,prioridadpedidoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PrioridadPedido prioridadpedidoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				prioridadpedidoLocal=this.prioridadpedido;
			} else {
				prioridadpedidoLocal=this.prioridadpedidoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(prioridadpedidoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPrioridadPedido(prioridadpedidoLocal,true);
					
					if(prioridadpedidoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(prioridadpedidoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(prioridadpedidoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPrioridadPedido(PrioridadPedido prioridadpedido,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPrioridadPedido(prioridadpedido,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPrioridadPedido(prioridadpedido);
	}
	
	public void setVariablesFormularioToObjetoActualPrioridadPedido(PrioridadPedido prioridadpedido,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPrioridadPedido(prioridadpedido,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPrioridadPedido(PrioridadPedido prioridadpedido,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPrioridadPedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPrioridadPedido.jLabelidPrioridadPedido.getText()==null || this.jInternalFrameDetalleFormPrioridadPedido.jLabelidPrioridadPedido.getText()=="" || this.jInternalFrameDetalleFormPrioridadPedido.jLabelidPrioridadPedido.getText()=="Id") {
				this.jInternalFrameDetalleFormPrioridadPedido.jLabelidPrioridadPedido.setText("0");
			}

			if(conColumnasBase) {prioridadpedido.setId(Long.parseLong(this.jInternalFrameDetalleFormPrioridadPedido.jLabelidPrioridadPedido.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PrioridadPedidoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrioridadPedido.jLabelIdPrioridadPedido,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			prioridadpedido.setnombre(this.jInternalFrameDetalleFormPrioridadPedido.jTextFieldnombrePrioridadPedido.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PrioridadPedidoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrioridadPedido.jLabelnombrePrioridadPedido,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			prioridadpedido.setdia(Integer.parseInt(this.jInternalFrameDetalleFormPrioridadPedido.jTextFielddiaPrioridadPedido.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PrioridadPedidoConstantesFunciones.LABEL_DIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPrioridadPedido.jLabeldiaPrioridadPedido,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPrioridadPedido(PrioridadPedido prioridadpedidoBean,PrioridadPedido prioridadpedido,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPrioridadPedido(PrioridadPedido prioridadpedidoOrigen,PrioridadPedido prioridadpedido,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && prioridadpedidoOrigen.getId()!=null && !prioridadpedidoOrigen.getId().equals(0L))) {prioridadpedido.setId(prioridadpedidoOrigen.getId());}}
			if(conDefault || (!conDefault && prioridadpedidoOrigen.getnombre()!=null && !prioridadpedidoOrigen.getnombre().equals(""))) {prioridadpedido.setnombre(prioridadpedidoOrigen.getnombre());}
			if(conDefault || (!conDefault && prioridadpedidoOrigen.getdia()!=null && !prioridadpedidoOrigen.getdia().equals(0))) {prioridadpedido.setdia(prioridadpedidoOrigen.getdia());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPrioridadPedido(PrioridadPedido prioridadpedido) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPrioridadPedido.jLabelidPrioridadPedido.setText(prioridadpedido.getId().toString());
			this.jInternalFrameDetalleFormPrioridadPedido.jTextFieldnombrePrioridadPedido.setText(prioridadpedido.getnombre());
			this.jInternalFrameDetalleFormPrioridadPedido.jTextFielddiaPrioridadPedido.setText(prioridadpedido.getdia().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPrioridadPedido(PrioridadPedidoBean prioridadpedidoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPrioridadPedido.jLabelidPrioridadPedido.setText(prioridadpedidoBean.getId().toString());
			this.jInternalFrameDetalleFormPrioridadPedido.jTextFieldnombrePrioridadPedido.setText(prioridadpedidoBean.getnombre());
			this.jInternalFrameDetalleFormPrioridadPedido.jTextFielddiaPrioridadPedido.setText(prioridadpedidoBean.getdia().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPrioridadPedido(PrioridadPedidoParameterReturnGeneral prioridadpedidoReturnGeneral,PrioridadPedidoBean prioridadpedidoBean,Boolean conDefault) throws Exception { 
		try {
			PrioridadPedido prioridadpedidoLocal=new PrioridadPedido();
			
			prioridadpedidoLocal=prioridadpedidoReturnGeneral.getPrioridadPedido();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && prioridadpedidoLocal.getId()!=null && !prioridadpedidoLocal.getId().equals(0L))) {prioridadpedidoBean.setId(prioridadpedidoLocal.getId());}}
			if(conDefault || (!conDefault && prioridadpedidoLocal.getnombre()!=null && !prioridadpedidoLocal.getnombre().equals(""))) {prioridadpedidoBean.setnombre(prioridadpedidoLocal.getnombre());}
			if(conDefault || (!conDefault && prioridadpedidoLocal.getdia()!=null && !prioridadpedidoLocal.getdia().equals(0))) {prioridadpedidoBean.setdia(prioridadpedidoLocal.getdia());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPrioridadPedidoGenerico(Long idPrioridadPedidoSeleccionado,JComboBox jComboBoxPrioridadPedido,List<PrioridadPedido> prioridadpedidosLocal)throws Exception {
		try {
			PrioridadPedido  prioridadpedidoTemp=null;

			for(PrioridadPedido prioridadpedidoAux:prioridadpedidosLocal) {
				if(prioridadpedidoAux.getId()!=null && prioridadpedidoAux.getId().equals(idPrioridadPedidoSeleccionado)) {
					prioridadpedidoTemp=prioridadpedidoAux;
					break;
				}
			}

			jComboBoxPrioridadPedido.setSelectedItem(prioridadpedidoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPrioridadPedidoGenerico(JComboBox jComboBoxPrioridadPedido,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxPrioridadPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPrioridadPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPrioridadPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPrioridadPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPrioridadPedido.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPrioridadPedido.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPrioridadPedido.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPrioridadPedido.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPrioridadPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPrioridadPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			prioridadpedido=(PrioridadPedido) prioridadpedidoLogic.getPrioridadPedidos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			prioridadpedido =(PrioridadPedido) prioridadpedidos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!prioridadpedido.getIsNew() && !prioridadpedido.getIsChanged() && !prioridadpedido.getIsDeleted()) {
				sDescripcion=prioridadpedido.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=prioridadpedido.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PrioridadPedido prioridadpedidoRow=new PrioridadPedido();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			prioridadpedidoRow=(PrioridadPedido) prioridadpedidoLogic.getPrioridadPedidos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			prioridadpedidoRow=(PrioridadPedido) prioridadpedidos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPrioridadPedido(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPrioridadPedido.setVisible((this.isVisibilidadCeldaNuevoPrioridadPedido && this.isPermisoNuevoPrioridadPedido));			
			this.jButtonDuplicarPrioridadPedido.setVisible((this.isVisibilidadCeldaDuplicarPrioridadPedido && this.isPermisoDuplicarPrioridadPedido));			
			this.jButtonCopiarPrioridadPedido.setVisible((this.isVisibilidadCeldaCopiarPrioridadPedido && this.isPermisoCopiarPrioridadPedido));
			this.jButtonVerFormPrioridadPedido.setVisible((this.isVisibilidadCeldaVerFormPrioridadPedido && this.isPermisoVerFormPrioridadPedido));
			
			this.jButtonAbrirOrderByPrioridadPedido.setVisible((this.isVisibilidadCeldaOrdenPrioridadPedido && this.isPermisoOrdenPrioridadPedido));			
			
			this.jButtonNuevoRelacionesPrioridadPedido.setVisible((this.isVisibilidadCeldaNuevoRelacionesPrioridadPedido && this.isPermisoNuevoPrioridadPedido));			
			this.jButtonNuevoGuardarCambiosPrioridadPedido.setVisible((this.isVisibilidadCeldaNuevoPrioridadPedido && this.isPermisoNuevoPrioridadPedido && this.isPermisoGuardarCambiosPrioridadPedido));
			
			if(this.jInternalFrameDetalleFormPrioridadPedido!=null) {
			this.jInternalFrameDetalleFormPrioridadPedido.jButtonModificarPrioridadPedido.setVisible((this.isVisibilidadCeldaModificarPrioridadPedido && this.isPermisoActualizarPrioridadPedido));	
			this.jInternalFrameDetalleFormPrioridadPedido.jButtonActualizarPrioridadPedido.setVisible((this.isVisibilidadCeldaActualizarPrioridadPedido && this.isPermisoActualizarPrioridadPedido));	
			this.jInternalFrameDetalleFormPrioridadPedido.jButtonEliminarPrioridadPedido.setVisible((this.isVisibilidadCeldaEliminarPrioridadPedido && this.isPermisoEliminarPrioridadPedido));
			this.jInternalFrameDetalleFormPrioridadPedido.jButtonCancelarPrioridadPedido.setVisible(this.isVisibilidadCeldaCancelarPrioridadPedido);							
			this.jInternalFrameDetalleFormPrioridadPedido.jButtonGuardarCambiosPrioridadPedido.setVisible((this.isVisibilidadCeldaGuardarPrioridadPedido && this.isPermisoGuardarCambiosPrioridadPedido));			
			
			}
						
			this.jButtonGuardarCambiosTablaPrioridadPedido.setVisible((this.isVisibilidadCeldaGuardarCambiosPrioridadPedido && this.isPermisoGuardarCambiosPrioridadPedido));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPrioridadPedido.setVisible((this.isVisibilidadCeldaNuevoPrioridadPedido && this.isPermisoNuevoPrioridadPedido));						
			this.jButtonDuplicarToolBarPrioridadPedido.setVisible((this.isVisibilidadCeldaDuplicarPrioridadPedido && this.isPermisoDuplicarPrioridadPedido));						
			this.jButtonCopiarToolBarPrioridadPedido.setVisible((this.isVisibilidadCeldaCopiarPrioridadPedido && this.isPermisoCopiarPrioridadPedido));			
			this.jButtonVerFormToolBarPrioridadPedido.setVisible((this.isVisibilidadCeldaVerFormPrioridadPedido && this.isPermisoVerFormPrioridadPedido));			
			this.jButtonAbrirOrderByToolBarPrioridadPedido.setVisible((this.isVisibilidadCeldaOrdenPrioridadPedido && this.isPermisoOrdenPrioridadPedido));
			this.jButtonNuevoRelacionesToolBarPrioridadPedido.setVisible((this.isVisibilidadCeldaNuevoRelacionesPrioridadPedido && this.isPermisoNuevoPrioridadPedido));			
			this.jButtonNuevoGuardarCambiosToolBarPrioridadPedido.setVisible((this.isVisibilidadCeldaNuevoPrioridadPedido && this.isPermisoNuevoPrioridadPedido && this.isPermisoGuardarCambiosPrioridadPedido));			
			
			if(this.jInternalFrameDetalleFormPrioridadPedido!=null) {
			this.jInternalFrameDetalleFormPrioridadPedido.jButtonModificarToolBarPrioridadPedido.setVisible((this.isVisibilidadCeldaModificarPrioridadPedido && this.isPermisoActualizarPrioridadPedido));	
			this.jInternalFrameDetalleFormPrioridadPedido.jButtonActualizarToolBarPrioridadPedido.setVisible((this.isVisibilidadCeldaActualizarPrioridadPedido  && this.isPermisoActualizarPrioridadPedido));	
			this.jInternalFrameDetalleFormPrioridadPedido.jButtonEliminarToolBarPrioridadPedido.setVisible((this.isVisibilidadCeldaEliminarPrioridadPedido && this.isPermisoEliminarPrioridadPedido));
			this.jInternalFrameDetalleFormPrioridadPedido.jButtonCancelarToolBarPrioridadPedido.setVisible(this.isVisibilidadCeldaCancelarPrioridadPedido);				
			this.jInternalFrameDetalleFormPrioridadPedido.jButtonGuardarCambiosToolBarPrioridadPedido.setVisible((this.isVisibilidadCeldaGuardarPrioridadPedido && this.isPermisoGuardarCambiosPrioridadPedido));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPrioridadPedido.setVisible((this.isVisibilidadCeldaGuardarCambiosPrioridadPedido && this.isPermisoGuardarCambiosPrioridadPedido));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPrioridadPedido.setVisible((this.isVisibilidadCeldaNuevoPrioridadPedido && this.isPermisoNuevoPrioridadPedido));			
			this.jMenuItemDuplicarPrioridadPedido.setVisible((this.isVisibilidadCeldaDuplicarPrioridadPedido && this.isPermisoDuplicarPrioridadPedido));			
			this.jMenuItemCopiarPrioridadPedido.setVisible((this.isVisibilidadCeldaCopiarPrioridadPedido && this.isPermisoCopiarPrioridadPedido));			
			this.jMenuItemVerFormPrioridadPedido.setVisible((this.isVisibilidadCeldaVerFormPrioridadPedido && this.isPermisoVerFormPrioridadPedido));			
			this.jMenuItemAbrirOrderByPrioridadPedido.setVisible((this.isVisibilidadCeldaOrdenPrioridadPedido && this.isPermisoOrdenPrioridadPedido));			
			//this.jMenuItemMostrarOcultarPrioridadPedido.setVisible((this.isVisibilidadCeldaOrdenPrioridadPedido && this.isPermisoOrdenPrioridadPedido));
			this.jMenuItemDetalleAbrirOrderByPrioridadPedido.setVisible((this.isVisibilidadCeldaOrdenPrioridadPedido && this.isPermisoOrdenPrioridadPedido));			
			//this.jMenuItemDetalleMostrarOcultarPrioridadPedido.setVisible((this.isVisibilidadCeldaOrdenPrioridadPedido && this.isPermisoOrdenPrioridadPedido));			
			this.jMenuItemNuevoRelacionesPrioridadPedido.setVisible((this.isVisibilidadCeldaNuevoRelacionesPrioridadPedido && this.isPermisoNuevoPrioridadPedido));			
			this.jMenuItemNuevoGuardarCambiosPrioridadPedido.setVisible((this.isVisibilidadCeldaNuevoPrioridadPedido && this.isPermisoNuevoPrioridadPedido && this.isPermisoGuardarCambiosPrioridadPedido));									
			
			if(this.jInternalFrameDetalleFormPrioridadPedido!=null) {
			this.jInternalFrameDetalleFormPrioridadPedido.jMenuItemModificarPrioridadPedido.setVisible((this.isVisibilidadCeldaModificarPrioridadPedido && this.isPermisoActualizarPrioridadPedido));	
			this.jInternalFrameDetalleFormPrioridadPedido.jMenuItemActualizarPrioridadPedido.setVisible((this.isVisibilidadCeldaActualizarPrioridadPedido && this.isPermisoActualizarPrioridadPedido));	
			this.jInternalFrameDetalleFormPrioridadPedido.jMenuItemEliminarPrioridadPedido.setVisible((this.isVisibilidadCeldaEliminarPrioridadPedido && this.isPermisoEliminarPrioridadPedido));
			this.jInternalFrameDetalleFormPrioridadPedido.jMenuItemCancelarPrioridadPedido.setVisible(this.isVisibilidadCeldaCancelarPrioridadPedido);				
			}
			
			this.jMenuItemGuardarCambiosPrioridadPedido.setVisible((this.isVisibilidadCeldaGuardarPrioridadPedido && this.isPermisoGuardarCambiosPrioridadPedido));						
			this.jMenuItemGuardarCambiosTablaPrioridadPedido.setVisible((this.isVisibilidadCeldaGuardarCambiosPrioridadPedido && this.isPermisoGuardarCambiosPrioridadPedido));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPrioridadPedido=this.jButtonNuevoPrioridadPedido.isVisible();
			this.isVisibilidadCeldaDuplicarPrioridadPedido=this.jButtonDuplicarPrioridadPedido.isVisible();
			this.isVisibilidadCeldaCopiarPrioridadPedido=this.jButtonCopiarPrioridadPedido.isVisible();
			this.isVisibilidadCeldaVerFormPrioridadPedido=this.jButtonVerFormPrioridadPedido.isVisible();
			
			this.isVisibilidadCeldaOrdenPrioridadPedido=this.jButtonAbrirOrderByPrioridadPedido.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPrioridadPedido=this.jButtonNuevoRelacionesPrioridadPedido.isVisible();
			this.isVisibilidadCeldaModificarPrioridadPedido=this.jButtonModificarPrioridadPedido.isVisible();
			
			if(this.jInternalFrameDetalleFormPrioridadPedido!=null) {
			this.isVisibilidadCeldaActualizarPrioridadPedido=this.jInternalFrameDetalleFormPrioridadPedido.jButtonActualizarPrioridadPedido.isVisible();
			this.isVisibilidadCeldaEliminarPrioridadPedido=this.jInternalFrameDetalleFormPrioridadPedido.jButtonEliminarPrioridadPedido.isVisible();
			this.isVisibilidadCeldaCancelarPrioridadPedido=this.jInternalFrameDetalleFormPrioridadPedido.jButtonCancelarPrioridadPedido.isVisible();
			this.isVisibilidadCeldaGuardarPrioridadPedido=this.jInternalFrameDetalleFormPrioridadPedido.jButtonGuardarCambiosPrioridadPedido.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPrioridadPedido=this.jButtonGuardarCambiosTablaPrioridadPedido.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPrioridadPedido=this.jButtonNuevoToolBarPrioridadPedido.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPrioridadPedido=this.jButtonNuevoRelacionesToolBarPrioridadPedido.isVisible();
			
			if(this.jInternalFrameDetalleFormPrioridadPedido!=null) {
			this.isVisibilidadCeldaModificarPrioridadPedido=this.jInternalFrameDetalleFormPrioridadPedido.jButtonModificarToolBarPrioridadPedido.isVisible();
			this.isVisibilidadCeldaActualizarPrioridadPedido=this.jInternalFrameDetalleFormPrioridadPedido.jButtonActualizarToolBarPrioridadPedido.isVisible();
			this.isVisibilidadCeldaEliminarPrioridadPedido=this.jInternalFrameDetalleFormPrioridadPedido.jButtonEliminarToolBarPrioridadPedido.isVisible();
			this.isVisibilidadCeldaCancelarPrioridadPedido=this.jInternalFrameDetalleFormPrioridadPedido.jButtonCancelarToolBarPrioridadPedido.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPrioridadPedido=this.jButtonGuardarCambiosToolBarPrioridadPedido.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPrioridadPedido=this.jButtonGuardarCambiosTablaToolBarPrioridadPedido.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPrioridadPedido=this.jMenuItemNuevoPrioridadPedido.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPrioridadPedido=this.jMenuItemNuevoRelacionesPrioridadPedido.isVisible();
			
			if(this.jInternalFrameDetalleFormPrioridadPedido!=null) {
			this.isVisibilidadCeldaModificarPrioridadPedido=this.jInternalFrameDetalleFormPrioridadPedido.jMenuItemModificarPrioridadPedido.isVisible();
			this.isVisibilidadCeldaActualizarPrioridadPedido=this.jInternalFrameDetalleFormPrioridadPedido.jMenuItemActualizarPrioridadPedido.isVisible();
			this.isVisibilidadCeldaEliminarPrioridadPedido=this.jInternalFrameDetalleFormPrioridadPedido.jMenuItemEliminarPrioridadPedido.isVisible();
			this.isVisibilidadCeldaCancelarPrioridadPedido=this.jInternalFrameDetalleFormPrioridadPedido.jMenuItemCancelarPrioridadPedido.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPrioridadPedido=this.jMenuItemGuardarCambiosPrioridadPedido.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPrioridadPedido=this.jMenuItemGuardarCambiosTablaPrioridadPedido.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPrioridadPedido(Boolean esInicializar) {
		if(PrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.prioridadpedidoSessionBean.getConGuardarRelaciones()) {
				//if(this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPrioridadPedido();
			}
			
			this.inicializarActualizarBindingBotonesManualPrioridadPedido(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPrioridadPedido() {
		this.jButtonNuevoPrioridadPedido.setVisible(this.isPermisoNuevoPrioridadPedido);			
		this.jButtonDuplicarPrioridadPedido.setVisible(this.isPermisoDuplicarPrioridadPedido);			
		this.jButtonCopiarPrioridadPedido.setVisible(this.isPermisoCopiarPrioridadPedido);			
		this.jButtonVerFormPrioridadPedido.setVisible(this.isPermisoVerFormPrioridadPedido);			
		
		this.jButtonAbrirOrderByPrioridadPedido.setVisible(this.isPermisoOrdenPrioridadPedido);					
		
		this.jButtonNuevoRelacionesPrioridadPedido.setVisible(this.isPermisoNuevoPrioridadPedido);			
		
		if(this.jInternalFrameDetalleFormPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrioridadPedido.jButtonModificarPrioridadPedido.setVisible(this.isPermisoActualizarPrioridadPedido);	
			this.jInternalFrameDetalleFormPrioridadPedido.jButtonActualizarPrioridadPedido.setVisible(this.isPermisoActualizarPrioridadPedido);	
			this.jInternalFrameDetalleFormPrioridadPedido.jButtonEliminarPrioridadPedido.setVisible(this.isPermisoEliminarPrioridadPedido);
			this.jInternalFrameDetalleFormPrioridadPedido.jButtonCancelarPrioridadPedido.setVisible(this.isVisibilidadCeldaCancelarPrioridadPedido);						
			this.jInternalFrameDetalleFormPrioridadPedido.jButtonGuardarCambiosPrioridadPedido.setVisible(this.isPermisoGuardarCambiosPrioridadPedido);							
		}
		
		this.jButtonGuardarCambiosTablaPrioridadPedido.setVisible(this.isPermisoActualizarPrioridadPedido);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePrioridadPedido() {
		this.jInternalFrameDetalleFormPrioridadPedido.jButtonModificarPrioridadPedido.setVisible(this.isPermisoActualizarPrioridadPedido);	
		this.jInternalFrameDetalleFormPrioridadPedido.jButtonActualizarPrioridadPedido.setVisible(this.isPermisoActualizarPrioridadPedido);	
		this.jInternalFrameDetalleFormPrioridadPedido.jButtonEliminarPrioridadPedido.setVisible(this.isPermisoEliminarPrioridadPedido);
		this.jInternalFrameDetalleFormPrioridadPedido.jButtonCancelarPrioridadPedido.setVisible(this.isVisibilidadCeldaCancelarPrioridadPedido);							
		this.jInternalFrameDetalleFormPrioridadPedido.jButtonGuardarCambiosPrioridadPedido.setVisible((this.isVisibilidadCeldaGuardarPrioridadPedido && this.isPermisoGuardarCambiosPrioridadPedido));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPrioridadPedido() {
		if(PrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPrioridadPedido();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPrioridadPedido() {
	}
	
	public void jTableDatosPrioridadPedidoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPrioridadPedido(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPrioridadPedidoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prioridadpedidoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrioridadPedido.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrioridadPedido(this.getprioridadpedido(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrioridadPedido(this.prioridadpedido);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prioridadpedido =(PrioridadPedido) this.prioridadpedidoLogic.getPrioridadPedidos().toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.prioridadpedido =(PrioridadPedido) this.prioridadpedidos.toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.prioridadpedido==null) {
						this.prioridadpedido = new PrioridadPedido();
					}

					this.setVariablesFormularioToObjetoActualPrioridadPedido(this.prioridadpedido,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrioridadPedido(this.prioridadpedido);
				}

				if(this.prioridadpedido.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.prioridadpedido.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrioridadPedido(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prioridadpedidoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prioridadpedidoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prioridadpedidoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPrioridadPedidoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPrioridadPedido(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrioridadPedido.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPrioridadPedido.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPrioridadPedido.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prioridadpedido =(PrioridadPedido) this.prioridadpedidoLogic.getPrioridadPedidos().toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.prioridadpedido =(PrioridadPedido) this.prioridadpedidos.toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPrioridadPedido(this.getprioridadpedido(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPrioridadPedido(this.prioridadpedido);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.prioridadpedidoLogic.getConnexion());

				if(this.prioridadpedido.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.prioridadpedido.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPrioridadPedido=(TitledBorder)this.jScrollPanelDatosPrioridadPedido.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPrioridadPedido.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPrioridadPedidoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prioridadpedidoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrioridadPedido.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrioridadPedido(this.getprioridadpedido(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrioridadPedido(this.prioridadpedido);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prioridadpedido =(PrioridadPedido) this.prioridadpedidoLogic.getPrioridadPedidos().toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.prioridadpedido =(PrioridadPedido) this.prioridadpedidos.toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.prioridadpedido==null) {
						this.prioridadpedido = new PrioridadPedido();
					}

					this.setVariablesFormularioToObjetoActualPrioridadPedido(this.prioridadpedido,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrioridadPedido(this.prioridadpedido);
				}

				if(this.prioridadpedido.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.prioridadpedido.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrioridadPedido(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prioridadpedidoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prioridadpedidoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prioridadpedidoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombrePrioridadPedidoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prioridadpedidoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrioridadPedido.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrioridadPedido(this.getprioridadpedido(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrioridadPedido(this.prioridadpedido);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prioridadpedido =(PrioridadPedido) this.prioridadpedidoLogic.getPrioridadPedidos().toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.prioridadpedido =(PrioridadPedido) this.prioridadpedidos.toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.prioridadpedido==null) {
						this.prioridadpedido = new PrioridadPedido();
					}

					this.setVariablesFormularioToObjetoActualPrioridadPedido(this.prioridadpedido,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrioridadPedido(this.prioridadpedido);
				}

				if(this.prioridadpedido.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.prioridadpedido.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrioridadPedido(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prioridadpedidoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prioridadpedidoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prioridadpedidoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondiaPrioridadPedidoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prioridadpedidoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPrioridadPedido.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPrioridadPedido(this.getprioridadpedido(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrioridadPedido(this.prioridadpedido);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prioridadpedido =(PrioridadPedido) this.prioridadpedidoLogic.getPrioridadPedidos().toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.prioridadpedido =(PrioridadPedido) this.prioridadpedidos.toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.prioridadpedido==null) {
						this.prioridadpedido = new PrioridadPedido();
					}

					this.setVariablesFormularioToObjetoActualPrioridadPedido(this.prioridadpedido,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPrioridadPedido(this.prioridadpedido);
				}

				if(this.prioridadpedido.getdia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dia = "+this.prioridadpedido.getdia().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPrioridadPedido(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prioridadpedidoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prioridadpedidoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prioridadpedidoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombrePrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPrioridadPedido(false,false);

			this.getPrioridadPedidosBusquedaPorNombre();

			this.inicializarActualizarBindingPrioridadPedido(false);

			//if(PrioridadPedidoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPrioridadPedido(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPrioridadPedido(false,false);

			this.getPrioridadPedidosFK_IdEmpresa();

			this.inicializarActualizarBindingPrioridadPedido(false);

			//if(PrioridadPedidoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPrioridadPedido(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.prioridadpedidoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePrioridadPedido() {
		if(this.jInternalFrameDetalleFormPrioridadPedido!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPrioridadPedido!=null) {
			this.jInternalFrameDetalleFormPrioridadPedido.setVisible(false);	    			
			this.jInternalFrameDetalleFormPrioridadPedido.dispose();
			this.jInternalFrameDetalleFormPrioridadPedido=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPrioridadPedido!=null) {
			this.jInternalFrameReporteDinamicoPrioridadPedido.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPrioridadPedido.dispose();
			this.jInternalFrameReporteDinamicoPrioridadPedido=null;
		}
		
		if(this.jInternalFrameImportacionPrioridadPedido!=null) {
			this.jInternalFrameImportacionPrioridadPedido.setVisible(false);	    			
			this.jInternalFrameImportacionPrioridadPedido.dispose();
			this.jInternalFrameImportacionPrioridadPedido=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPrioridadPedido();
			
			PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
			
			
			if(sTipo.equals("NuevoPrioridadPedido")) {
				jButtonNuevoPrioridadPedidoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPrioridadPedido")) {
				jButtonDuplicarPrioridadPedidoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPrioridadPedido")) {
				jButtonCopiarPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("VerFormPrioridadPedido")) {
				jButtonVerFormPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPrioridadPedido")) {
				jButtonNuevoPrioridadPedidoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPrioridadPedido")) {
				jButtonDuplicarPrioridadPedidoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPrioridadPedido")) {
				jButtonNuevoPrioridadPedidoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPrioridadPedido")) {
				jButtonDuplicarPrioridadPedidoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPrioridadPedido")) {
				jButtonNuevoPrioridadPedidoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPrioridadPedido")) {
				jButtonNuevoPrioridadPedidoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPrioridadPedido")) {
				jButtonNuevoPrioridadPedidoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPrioridadPedido")) {
				jButtonModificarPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPrioridadPedido")) {
				jButtonModificarPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPrioridadPedido")) {
				jButtonModificarPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPrioridadPedido")) {
				jButtonActualizarPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPrioridadPedido")) {
				jButtonActualizarPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPrioridadPedido")) {
				jButtonActualizarPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("EliminarPrioridadPedido")) {
				jButtonEliminarPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPrioridadPedido")) {
				jButtonEliminarPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPrioridadPedido")) {
				jButtonEliminarPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("CancelarPrioridadPedido")) {
				jButtonCancelarPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPrioridadPedido")) {
				jButtonCancelarPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPrioridadPedido")) {
				jButtonCancelarPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("CerrarPrioridadPedido")) {
				jButtonCerrarPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPrioridadPedido")) {
				jButtonCerrarPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPrioridadPedido")) {
				jButtonCerrarPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPrioridadPedido")) {
				jButtonMostrarOcultarPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPrioridadPedido")) {
				jButtonCancelarPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPrioridadPedido")) {
				jButtonGuardarCambiosPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPrioridadPedido")) {
				jButtonGuardarCambiosPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPrioridadPedido")) {
				jButtonCopiarPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPrioridadPedido")) {
				jButtonVerFormPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPrioridadPedido")) {
				jButtonGuardarCambiosPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPrioridadPedido")) {
				jButtonCopiarPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPrioridadPedido")) {
				jButtonVerFormPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPrioridadPedido")) {
				jButtonGuardarCambiosPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPrioridadPedido")) {
				jButtonGuardarCambiosPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPrioridadPedido")) {
				jButtonGuardarCambiosPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPrioridadPedido")) {
				jButtonRecargarInformacionPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPrioridadPedido")) {
				jButtonRecargarInformacionPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPrioridadPedido")) {
				jButtonRecargarInformacionPrioridadPedidoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPrioridadPedido")) {
				jButtonAnterioresPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPrioridadPedido")) {
				jButtonAnterioresPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePrioridadPedido")) {
				jButtonAnterioresPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPrioridadPedido")) {
				jButtonSiguientesPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPrioridadPedido")) {
				jButtonSiguientesPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPrioridadPedido")) {
				jButtonSiguientesPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPrioridadPedido") || sTipo.equals("MenuItemDetalleAbrirOrderByPrioridadPedido")) {
				jButtonAbrirOrderByPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPrioridadPedido") || sTipo.equals("MenuItemDetalleMostrarOcultarPrioridadPedido")) {
				jButtonMostrarOcultarPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPrioridadPedido")) {
				jButtonNuevoGuardarCambiosPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPrioridadPedido")) {
				jButtonNuevoGuardarCambiosPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPrioridadPedido")) {
				jButtonNuevoGuardarCambiosPrioridadPedidoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPrioridadPedido")) {
				jButtonCerrarReporteDinamicoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPrioridadPedido")) {
				jButtonGenerarReporteDinamicoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPrioridadPedido")) {
				
				jButtonGenerarExcelReporteDinamicoPrioridadPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPrioridadPedido")) {
				jButtonCerrarImportacionPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPrioridadPedido")) {
				
				jButtonGenerarImportacionPrioridadPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPrioridadPedido")) {
				
				jButtonAbrirImportacionPrioridadPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPrioridadPedido")) {
				jComboBoxTiposAccionesPrioridadPedidoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPrioridadPedido")) {
				jComboBoxTiposRelacionesPrioridadPedidoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPrioridadPedido")) {
				jComboBoxTiposAccionesPrioridadPedidoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPrioridadPedido")) {
				
				jComboBoxTiposSeleccionarPrioridadPedidoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPrioridadPedido")) {
				jTextFieldValorCampoGeneralPrioridadPedidoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPrioridadPedido")) {
				jButtonAbrirOrderByPrioridadPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPrioridadPedido")) {
				jButtonAbrirOrderByPrioridadPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPrioridadPedido")) {
				jButtonCerrarOrderByPrioridadPedidoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPrioridadPedidoBusqueda")) {
				this.jButtonidPrioridadPedidoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPrioridadPedidoUpdate")) {
				this.jButtonid_empresaPrioridadPedidoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPrioridadPedidoBusqueda")) {
				this.jButtonid_empresaPrioridadPedidoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePrioridadPedidoBusqueda")) {
				this.jButtonnombrePrioridadPedidoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("diaPrioridadPedidoBusqueda")) {
				this.jButtondiaPrioridadPedidoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombrePrioridadPedido")) {
				this.jButtonBusquedaPorNombrePrioridadPedidoActionPerformed(evt);
			}
			
			;
			
			
			PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPrioridadPedido();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPrioridadPedidoActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prioridadpedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prioridadpedido);
				
				PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
				
				


				
				PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PrioridadPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PrioridadPedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PrioridadPedido prioridadpedidoLocal=null;
			
			if(!this.getEsControlTabla()) {
				prioridadpedidoLocal=this.prioridadpedido;
			} else {
				prioridadpedidoLocal=this.prioridadpedidoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prioridadpedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prioridadpedido);
				
				PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
							
				
				


				
				PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PrioridadPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PrioridadPedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPrioridadPedidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPrioridadPedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prioridadpedidoAnterior =(PrioridadPedido) this.prioridadpedidoLogic.getPrioridadPedidos().toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.prioridadpedidoAnterior =(PrioridadPedido) this.prioridadpedidos.toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPrioridadPedidoActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prioridadpedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prioridadpedido);
				
				PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
								
						
				


				
				PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PrioridadPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PrioridadPedido.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prioridadpedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prioridadpedido);
				
				PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
								
				
				


				
				PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PrioridadPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PrioridadPedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPrioridadPedidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPrioridadPedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prioridadpedidoAnterior =(PrioridadPedido) this.prioridadpedidoLogic.getPrioridadPedidos().toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.prioridadpedidoAnterior =(PrioridadPedido) this.prioridadpedidos.toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prioridadpedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prioridadpedido);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPrioridadPedidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPrioridadPedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prioridadpedidoAnterior =(PrioridadPedido) this.prioridadpedidoLogic.getPrioridadPedidos().toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.prioridadpedidoAnterior =(PrioridadPedido) this.prioridadpedidos.toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPrioridadPedidoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.prioridadpedido);
			
			this.actualizarInformacion("INFO_PADRE",false,this.prioridadpedido);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prioridadpedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prioridadpedido);
				
				PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
							
				
				


				
				PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PrioridadPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PrioridadPedido.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPrioridadPedidoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPrioridadPedido.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prioridadpedidoAnterior =(PrioridadPedido) this.prioridadpedidoLogic.getPrioridadPedidos().toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.prioridadpedidoAnterior =(PrioridadPedido) this.prioridadpedidos.toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPrioridadPedidoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.prioridadpedido);
			
			this.actualizarInformacion("INFO_PADRE",false,this.prioridadpedido);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prioridadpedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prioridadpedido);
				
				PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
								
				
				


				
				PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PrioridadPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PrioridadPedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPrioridadPedidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPrioridadPedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prioridadpedidoAnterior =(PrioridadPedido) this.prioridadpedidoLogic.getPrioridadPedidos().toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.prioridadpedidoAnterior =(PrioridadPedido) this.prioridadpedidos.toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPrioridadPedidoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.prioridadpedido);
			
			this.actualizarInformacion("INFO_PADRE",false,this.prioridadpedido);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPrioridadPedidoActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prioridadpedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prioridadpedido);
				
				PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPrioridadPedido")) {
					jCheckBoxSeleccionarTodosPrioridadPedidoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPrioridadPedido")) {
					jCheckBoxSeleccionadosPrioridadPedidoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPrioridadPedido")) {
					
				}
				
				


				
				
				PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PrioridadPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PrioridadPedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.prioridadpedido);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.prioridadpedido);
				
				PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
												
				
				


				
				
				PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PrioridadPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PrioridadPedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPrioridadPedidoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPrioridadPedido.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.prioridadpedidoAnterior =(PrioridadPedido) this.prioridadpedidoLogic.getPrioridadPedidos().toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.prioridadpedidoAnterior =(PrioridadPedido) this.prioridadpedidos.toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPrioridadPedidoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prioridadpedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prioridadpedido);
				
				PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
				
				
				PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPrioridadPedidoActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prioridadpedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prioridadpedido);
				
				PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PrioridadPedido.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PrioridadPedido.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.prioridadpedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.prioridadpedido);
				
				PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PrioridadPedido.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PrioridadPedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPrioridadPedidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPrioridadPedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.prioridadpedidoAnterior =(PrioridadPedido) this.prioridadpedidoLogic.getPrioridadPedidos().toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.prioridadpedidoAnterior =(PrioridadPedido) this.prioridadpedidos.toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPrioridadPedido")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPrioridadPedidoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPrioridadPedido.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.prioridadpedido =(PrioridadPedido) this.prioridadpedidoLogic.getPrioridadPedidos().toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.prioridadpedido =(PrioridadPedido) this.prioridadpedidos.toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.prioridadpedido);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPrioridadPedido")) {
				
				}
				
				PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPrioridadPedido")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPrioridadPedido.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPrioridadPedido")) {
			
			}
			
			PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPrioridadPedido();
			
			PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
			
			if(sTipo.equals("NuevoPrioridadPedido")) {
				jButtonNuevoPrioridadPedidoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPrioridadPedido")) {
				jButtonDuplicarPrioridadPedidoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPrioridadPedido")) {
				jButtonCopiarPrioridadPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPrioridadPedido")) {
				jButtonVerFormPrioridadPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPrioridadPedido")) {
				jButtonNuevoPrioridadPedidoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPrioridadPedido")) {
				jButtonModificarPrioridadPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPrioridadPedido")) {
				jButtonActualizarPrioridadPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPrioridadPedido")) {
				jButtonEliminarPrioridadPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPrioridadPedido")) {
				jButtonGuardarCambiosPrioridadPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPrioridadPedido")) {
				jButtonCancelarPrioridadPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPrioridadPedido")) {
				jButtonCerrarPrioridadPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPrioridadPedido")) {
				jButtonGuardarCambiosPrioridadPedidoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPrioridadPedido")) {
				jButtonNuevoGuardarCambiosPrioridadPedidoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPrioridadPedido")) {
				jButtonAbrirOrderByPrioridadPedidoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPrioridadPedido")) {
				jButtonRecargarInformacionPrioridadPedidoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPrioridadPedido")) {
				jButtonAnterioresPrioridadPedidoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPrioridadPedido")) {
				jButtonSiguientesPrioridadPedidoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPrioridadPedidoBusqueda")) {
				this.jButtonidPrioridadPedidoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPrioridadPedidoUpdate")) {
				this.jButtonid_empresaPrioridadPedidoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPrioridadPedidoBusqueda")) {
				this.jButtonid_empresaPrioridadPedidoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePrioridadPedidoBusqueda")) {
				this.jButtonnombrePrioridadPedidoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("diaPrioridadPedidoBusqueda")) {
				this.jButtondiaPrioridadPedidoBusquedaActionPerformed(evt);
			}
			
			PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPrioridadPedido();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePrioridadPedido")) {
				closingInternalFramePrioridadPedido();
				
			} else if(sTipo.equals("jButtonCancelarPrioridadPedido")) {
				JInternalFrameBase jInternalFrameDetalleFormPrioridadPedido = (JInternalFrameBase)evt.getSource();
	            	
	            PrioridadPedidoBeanSwingJInternalFrame jInternalFrameParent=(PrioridadPedidoBeanSwingJInternalFrame)jInternalFrameDetalleFormPrioridadPedido.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPrioridadPedidoActionPerformed(null);
			}
			
			PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.prioridadpedido,new Object(),this.prioridadpedidoParameterGeneral,this.prioridadpedidoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPrioridadPedido(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPrioridadPedido(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPrioridadPedido(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.prioridadpedido)) {
			if(!esControlTabla) {
				if(PrioridadPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPrioridadPedido(this.prioridadpedido,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPrioridadPedido(this.prioridadpedido);			
				}
				
				if(this.prioridadpedidoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPrioridadPedido(this.prioridadpedido,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.prioridadpedidoReturnGeneral=prioridadpedidoLogic.procesarEventosPrioridadPedidosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.prioridadpedidoLogic.getPrioridadPedidos(),this.prioridadpedido,this.prioridadpedidoParameterGeneral,this.isEsNuevoPrioridadPedido,classes);//this.prioridadpedidoLogic.getPrioridadPedido()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPrioridadPedido(this.prioridadpedidoReturnGeneral,this.prioridadpedidoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.prioridadpedidoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPrioridadPedido(classes,this.prioridadpedidoReturnGeneral,this.prioridadpedidoBean,false);
					}
						
					if(this.prioridadpedidoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPrioridadPedido(this.prioridadpedidoReturnGeneral.getPrioridadPedido());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPrioridadPedido(this.prioridadpedidoReturnGeneral.getPrioridadPedido());	
					}
						
					if(this.prioridadpedidoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPrioridadPedido(this.prioridadpedidoReturnGeneral.getPrioridadPedido(),classes);//this.prioridadpedidoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPrioridadPedido(this.prioridadpedido,classes);//this.prioridadpedidoBean);									
				}
			
				if(PrioridadPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPrioridadPedido(this.prioridadpedido,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPrioridadPedido(this.prioridadpedido);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.prioridadpedidoAnterior!=null) {
						this.prioridadpedido=this.prioridadpedidoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.prioridadpedidoReturnGeneral=prioridadpedidoLogic.procesarEventosPrioridadPedidosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.prioridadpedidoLogic.getPrioridadPedidos(),this.prioridadpedido,this.prioridadpedidoParameterGeneral,this.isEsNuevoPrioridadPedido,classes);//this.prioridadpedidoLogic.getPrioridadPedido()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.prioridadpedidoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.prioridadpedidoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.prioridadpedidoReturnGeneral.getPrioridadPedido(),prioridadpedidoLogic.getPrioridadPedidos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.prioridadpedidoReturnGeneral.getPrioridadPedido(),this.prioridadpedidos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPrioridadPedido.repaint();
				
				//((AbstractTableModel) this.jTableDatosPrioridadPedido.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPrioridadPedido();
			}
		}
	}
	
	public void actualizarVisualTableDatosPrioridadPedido() throws Exception {
		
		PrioridadPedidoModel prioridadpedidoModel=(PrioridadPedidoModel)this.jTableDatosPrioridadPedido.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			prioridadpedidoModel.prioridadpedidos=this.prioridadpedidoLogic.getPrioridadPedidos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			prioridadpedidoModel.prioridadpedidos=this.prioridadpedidos;
		}
		
		
		((PrioridadPedidoModel) this.jTableDatosPrioridadPedido.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPrioridadPedido() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getprioridadpedidoAnterior(),this.prioridadpedidoLogic.getPrioridadPedidos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getprioridadpedidoAnterior(),this.prioridadpedidos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPrioridadPedido();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPrioridadPedido(PrioridadPedido prioridadpedido,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.prioridadpedido,new Object(),generalEntityParameterGeneral,this.prioridadpedidoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.prioridadpedidoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PrioridadPedidoConstantesFunciones.getClassesRelationshipsOfPrioridadPedido(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PrioridadPedidoConstantesFunciones.getClassesRelationshipsFromStringsOfPrioridadPedido(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPrioridadPedido(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.prioridadpedido,new Object(),generalEntityParameterGeneral,this.prioridadpedidoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPrioridadPedido(PrioridadPedidoBean prioridadpedidoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPrioridadPedido(ArrayList<Classe> classes,PrioridadPedidoReturnGeneral prioridadpedidoReturnGeneral,PrioridadPedidoBean prioridadpedidoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPrioridadPedido(PrioridadPedido prioridadpedido,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.prioridadpedido)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPrioridadPedido = new PrioridadPedidoDetalleFormJInternalFrame(jDesktopPane,this.prioridadpedidoSessionBean.getConGuardarRelaciones(),this.prioridadpedidoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPrioridadPedido);
		this.jInternalFrameDetalleFormPrioridadPedido.setVisible(false);
		this.jInternalFrameDetalleFormPrioridadPedido.setSelected(false);						
		
		this.jInternalFrameDetalleFormPrioridadPedido.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPrioridadPedido.prioridadpedidoLogic=this.prioridadpedidoLogic;
		
		this.cargarCombosFrameForeignKeyPrioridadPedido("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePrioridadPedido();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePrioridadPedido();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPrioridadPedido("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPrioridadPedido();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPrioridadPedido.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPrioridadPedido"));
		
		this.jInternalFrameDetalleFormPrioridadPedido.jButtonModificarPrioridadPedido.addActionListener(new ButtonActionListener(this,"ModificarPrioridadPedido"));

		
		this.jInternalFrameDetalleFormPrioridadPedido.jButtonModificarToolBarPrioridadPedido.addActionListener(new ButtonActionListener(this,"ModificarToolBarPrioridadPedido"));
					
		this.jInternalFrameDetalleFormPrioridadPedido.jMenuItemModificarPrioridadPedido.addActionListener(new ButtonActionListener(this,"MenuItemModificarPrioridadPedido"));		
		
		
		
		this.jInternalFrameDetalleFormPrioridadPedido.jButtonActualizarPrioridadPedido.addActionListener (new ButtonActionListener(this,"ActualizarPrioridadPedido"));
		
		
		this.jInternalFrameDetalleFormPrioridadPedido.jButtonActualizarToolBarPrioridadPedido.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPrioridadPedido"));
						
		this.jInternalFrameDetalleFormPrioridadPedido.jMenuItemActualizarPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPrioridadPedido"));		
		
		
		
		this.jInternalFrameDetalleFormPrioridadPedido.jButtonEliminarPrioridadPedido.addActionListener (new ButtonActionListener(this,"EliminarPrioridadPedido"));
		
		
		this.jInternalFrameDetalleFormPrioridadPedido.jButtonEliminarToolBarPrioridadPedido.addActionListener (new ButtonActionListener(this,"EliminarToolBarPrioridadPedido"));
								
		this.jInternalFrameDetalleFormPrioridadPedido.jMenuItemEliminarPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPrioridadPedido"));		
		
		
		
		this.jInternalFrameDetalleFormPrioridadPedido.jButtonCancelarPrioridadPedido.addActionListener (new ButtonActionListener(this,"CancelarPrioridadPedido"));
		
		
		this.jInternalFrameDetalleFormPrioridadPedido.jButtonCancelarToolBarPrioridadPedido.addActionListener (new ButtonActionListener(this,"CancelarToolBarPrioridadPedido"));
					
		this.jInternalFrameDetalleFormPrioridadPedido.jMenuItemCancelarPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPrioridadPedido"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPrioridadPedido.jMenuItemDetalleCerrarPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPrioridadPedido"));		
		
		
		
		this.jInternalFrameDetalleFormPrioridadPedido.jButtonGuardarCambiosToolBarPrioridadPedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPrioridadPedido"));
		
		
		
		this.jInternalFrameDetalleFormPrioridadPedido.jButtonGuardarCambiosToolBarPrioridadPedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPrioridadPedido"));
		
		
		
		this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxTiposAccionesFormularioPrioridadPedido.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPrioridadPedido"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrioridadPedido.jButtonidPrioridadPedidoBusqueda.addActionListener(new ButtonActionListener(this,"idPrioridadPedidoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrioridadPedido.jButtonid_empresaPrioridadPedidoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPrioridadPedidoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrioridadPedido.jButtonid_empresaPrioridadPedidoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPrioridadPedidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrioridadPedido.jButtonnombrePrioridadPedidoBusqueda.addActionListener(new ButtonActionListener(this,"nombrePrioridadPedidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrioridadPedido.jButtondiaPrioridadPedidoBusqueda.addActionListener(new ButtonActionListener(this,"diaPrioridadPedidoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPrioridadPedido.jTabbedPaneRelacionesPrioridadPedido.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPrioridadPedido"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePrioridadPedido"));
		
		if(this.jInternalFrameDetalleFormPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrioridadPedido.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPrioridadPedido"));
		}
		
		this.jTableDatosPrioridadPedido.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPrioridadPedido"));
		
		this.jTableDatosPrioridadPedido.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPrioridadPedido"));
		
		this.jButtonNuevoPrioridadPedido.addActionListener(new ButtonActionListener(this,"NuevoPrioridadPedido"));
		
		this.jButtonDuplicarPrioridadPedido.addActionListener(new ButtonActionListener(this,"DuplicarPrioridadPedido"));
		
		this.jButtonCopiarPrioridadPedido.addActionListener(new ButtonActionListener(this,"CopiarPrioridadPedido"));
		
		this.jButtonVerFormPrioridadPedido.addActionListener(new ButtonActionListener(this,"VerFormPrioridadPedido"));
		
		
		this.jButtonNuevoToolBarPrioridadPedido.addActionListener(new ButtonActionListener(this,"NuevoToolBarPrioridadPedido"));
			
		this.jButtonDuplicarToolBarPrioridadPedido.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPrioridadPedido"));
			
		this.jMenuItemNuevoPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPrioridadPedido"));
			
		this.jMenuItemDuplicarPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPrioridadPedido"));		
		
		
		this.jButtonNuevoRelacionesPrioridadPedido.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPrioridadPedido"));
		
		
		this.jButtonNuevoRelacionesToolBarPrioridadPedido.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPrioridadPedido"));
			
		this.jMenuItemNuevoRelacionesPrioridadPedido.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPrioridadPedido"));		
		
		
		if(this.jInternalFrameDetalleFormPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrioridadPedido.jButtonModificarPrioridadPedido.addActionListener(new ButtonActionListener(this,"ModificarPrioridadPedido"));
		}
		
		
		if(this.jInternalFrameDetalleFormPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrioridadPedido.jButtonModificarToolBarPrioridadPedido.addActionListener(new ButtonActionListener(this,"ModificarToolBarPrioridadPedido"));
			
			this.jInternalFrameDetalleFormPrioridadPedido.jMenuItemModificarPrioridadPedido.addActionListener(new ButtonActionListener(this,"MenuItemModificarPrioridadPedido"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPrioridadPedido.jButtonActualizarPrioridadPedido.addActionListener (new ButtonActionListener(this,"ActualizarPrioridadPedido"));
		}
		
		
		if(this.jInternalFrameDetalleFormPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrioridadPedido.jButtonActualizarToolBarPrioridadPedido.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPrioridadPedido"));
				
			this.jInternalFrameDetalleFormPrioridadPedido.jMenuItemActualizarPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPrioridadPedido"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrioridadPedido.jButtonEliminarPrioridadPedido.addActionListener (new ButtonActionListener(this,"EliminarPrioridadPedido"));
		}
		
		
		if(this.jInternalFrameDetalleFormPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrioridadPedido.jButtonEliminarToolBarPrioridadPedido.addActionListener (new ButtonActionListener(this,"EliminarToolBarPrioridadPedido"));
						
			this.jInternalFrameDetalleFormPrioridadPedido.jMenuItemEliminarPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPrioridadPedido"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrioridadPedido.jButtonCancelarPrioridadPedido.addActionListener (new ButtonActionListener(this,"CancelarPrioridadPedido"));
		}
		
		
		if(this.jInternalFrameDetalleFormPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrioridadPedido.jButtonCancelarToolBarPrioridadPedido.addActionListener (new ButtonActionListener(this,"CancelarToolBarPrioridadPedido"));
			
			this.jInternalFrameDetalleFormPrioridadPedido.jMenuItemCancelarPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPrioridadPedido"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPrioridadPedido.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPrioridadPedido"));		
		
		
		this.jButtonCerrarPrioridadPedido.addActionListener (new ButtonActionListener(this,"CerrarPrioridadPedido"));
		
		
		this.jButtonCerrarToolBarPrioridadPedido.addActionListener (new ButtonActionListener(this,"CerrarToolBarPrioridadPedido"));
			
		this.jMenuItemCerrarPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPrioridadPedido"));
			
		if(this.jInternalFrameDetalleFormPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrioridadPedido.jMenuItemDetalleCerrarPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPrioridadPedido"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrioridadPedido.jButtonGuardarCambiosPrioridadPedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosPrioridadPedido"));
		}
		
		
		if(this.jInternalFrameDetalleFormPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrioridadPedido.jButtonGuardarCambiosToolBarPrioridadPedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPrioridadPedido"));
		}
		
		this.jButtonCopiarToolBarPrioridadPedido.addActionListener (new ButtonActionListener(this,"CopiarToolBarPrioridadPedido"));
			
		this.jButtonVerFormToolBarPrioridadPedido.addActionListener (new ButtonActionListener(this,"VerFormToolBarPrioridadPedido"));
		
		this.jMenuItemGuardarCambiosPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPrioridadPedido"));
			
		this.jMenuItemCopiarPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPrioridadPedido"));		
		
		this.jMenuItemVerFormPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPrioridadPedido"));		
		
		
		this.jButtonGuardarCambiosTablaPrioridadPedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPrioridadPedido"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPrioridadPedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPrioridadPedido"));
			
		this.jMenuItemGuardarCambiosTablaPrioridadPedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPrioridadPedido"));		
		
		
		
		this.jButtonRecargarInformacionPrioridadPedido.addActionListener (new ButtonActionListener(this,"RecargarInformacionPrioridadPedido"));
					
		this.jButtonRecargarInformacionToolBarPrioridadPedido.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPrioridadPedido"));
		
		this.jMenuItemRecargarInformacionPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPrioridadPedido"));		
		
		
		
		this.jButtonAnterioresPrioridadPedido.addActionListener (new ButtonActionListener(this,"AnterioresPrioridadPedido"));
		
		
		this.jButtonAnterioresToolBarPrioridadPedido.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPrioridadPedido"));
		
		this.jMenuItemAnterioresPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPrioridadPedido"));		
		
		
		this.jButtonSiguientesPrioridadPedido.addActionListener (new ButtonActionListener(this,"SiguientesPrioridadPedido"));
		
		
		this.jButtonSiguientesToolBarPrioridadPedido.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPrioridadPedido"));
			
		this.jMenuItemSiguientesPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPrioridadPedido"));
			
		this.jMenuItemAbrirOrderByPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPrioridadPedido"));
			
		this.jMenuItemMostrarOcultarPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPrioridadPedido"));
			
		this.jMenuItemDetalleAbrirOrderByPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPrioridadPedido"));
			
		this.jMenuItemDetalleMostarOcultarPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPrioridadPedido"));		
		
		
		this.jButtonNuevoGuardarCambiosPrioridadPedido.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPrioridadPedido"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPrioridadPedido.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPrioridadPedido"));
			
		this.jMenuItemNuevoGuardarCambiosPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPrioridadPedido"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPrioridadPedido.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPrioridadPedido"));

		this.jCheckBoxSeleccionadosPrioridadPedido.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPrioridadPedido"));
		
		if(this.jInternalFrameDetalleFormPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxTiposAccionesFormularioPrioridadPedido.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPrioridadPedido"));
		}
		
		
		this.jComboBoxTiposRelacionesPrioridadPedido.addActionListener (new ButtonActionListener(this,"TiposRelacionesPrioridadPedido"));
			
		this.jComboBoxTiposAccionesPrioridadPedido.addActionListener (new ButtonActionListener(this,"TiposAccionesPrioridadPedido"));
					
		this.jComboBoxTiposSeleccionarPrioridadPedido.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPrioridadPedido"));
			
		this.jTextFieldValorCampoGeneralPrioridadPedido.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPrioridadPedido"));		
		
		
		if(this.jInternalFrameDetalleFormPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrioridadPedido.jButtonidPrioridadPedidoBusqueda.addActionListener(new ButtonActionListener(this,"idPrioridadPedidoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrioridadPedido.jButtonid_empresaPrioridadPedidoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPrioridadPedidoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrioridadPedido.jButtonid_empresaPrioridadPedidoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPrioridadPedidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrioridadPedido.jButtonnombrePrioridadPedidoBusqueda.addActionListener(new ButtonActionListener(this,"nombrePrioridadPedidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrioridadPedido.jButtondiaPrioridadPedidoBusqueda.addActionListener(new ButtonActionListener(this,"diaPrioridadPedidoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombrePrioridadPedido.addActionListener(new ButtonActionListener(this,"BusquedaPorNombrePrioridadPedido"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPrioridadPedido!=null) {
				this.jInternalFrameReporteDinamicoPrioridadPedido.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPrioridadPedido"));
				this.jInternalFrameReporteDinamicoPrioridadPedido.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPrioridadPedido"));
				this.jInternalFrameReporteDinamicoPrioridadPedido.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPrioridadPedido"));
			}
			
			//this.jButtonCerrarReporteDinamicoPrioridadPedido.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPrioridadPedido"));				
			//this.jButtonGenerarReporteDinamicoPrioridadPedido.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPrioridadPedido"));
			//this.jButtonGenerarExcelReporteDinamicoPrioridadPedido.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPrioridadPedido"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPrioridadPedido!=null) {
				this.jInternalFrameImportacionPrioridadPedido.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPrioridadPedido"));
				this.jInternalFrameImportacionPrioridadPedido.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPrioridadPedido"));
				this.jInternalFrameImportacionPrioridadPedido.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPrioridadPedido"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPrioridadPedido.addActionListener (new ButtonActionListener(this,"AbrirOrderByPrioridadPedido"));
			
			this.jButtonAbrirOrderByToolBarPrioridadPedido.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPrioridadPedido"));			
			
			if(this.jInternalFrameOrderByPrioridadPedido!=null) {
				this.jInternalFrameOrderByPrioridadPedido.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPrioridadPedido"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPrioridadPedido.jTabbedPaneRelacionesPrioridadPedido.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPrioridadPedido"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFramePrioridadPedido();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPrioridadPedido.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPrioridadPedido = (JInternalFrameBase)event.getSource();
	            	
	            PrioridadPedidoBeanSwingJInternalFrame jInternalFrameParent=(PrioridadPedidoBeanSwingJInternalFrame)jInternalFrameDetalleFormPrioridadPedido.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPrioridadPedidoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPrioridadPedido.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPrioridadPedidoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPrioridadPedido.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPrioridadPedido.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPrioridadPedidoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPrioridadPedidoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPrioridadPedidoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPrioridadPedido";
		inputMap = this.jButtonNuevoPrioridadPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPrioridadPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPrioridadPedidoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPrioridadPedidoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPrioridadPedidoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPrioridadPedidoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPrioridadPedido";
		inputMap = this.jButtonNuevoRelacionesPrioridadPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPrioridadPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPrioridadPedidoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPrioridadPedido";
		inputMap = this.jButtonModificarPrioridadPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPrioridadPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPrioridadPedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPrioridadPedido";
		inputMap = this.jButtonActualizarPrioridadPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPrioridadPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPrioridadPedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPrioridadPedido";
		inputMap = this.jButtonEliminarPrioridadPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPrioridadPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPrioridadPedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPrioridadPedido";
		inputMap = this.jButtonCancelarPrioridadPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPrioridadPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPrioridadPedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPrioridadPedido";
		inputMap = this.jButtonCerrarPrioridadPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPrioridadPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPrioridadPedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPrioridadPedido.jButtonGuardarCambiosPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPrioridadPedido";
		inputMap = this.jInternalFrameDetalleFormPrioridadPedido.jButtonGuardarCambiosPrioridadPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPrioridadPedido.jButtonGuardarCambiosPrioridadPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPrioridadPedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPrioridadPedido.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPrioridadPedidoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPrioridadPedido.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPrioridadPedidoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPrioridadPedido.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPrioridadPedidoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPrioridadPedido.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPrioridadPedidoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrioridadPedido.jButtonidPrioridadPedidoBusqueda.addActionListener(new ButtonActionListener(this,"idPrioridadPedidoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPrioridadPedido.jButtonid_empresaPrioridadPedidoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPrioridadPedidoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrioridadPedido.jButtonid_empresaPrioridadPedidoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPrioridadPedidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrioridadPedido.jButtonnombrePrioridadPedidoBusqueda.addActionListener(new ButtonActionListener(this,"nombrePrioridadPedidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPrioridadPedido.jButtondiaPrioridadPedidoBusqueda.addActionListener(new ButtonActionListener(this,"diaPrioridadPedidoBusqueda"));
		
		
		this.jButtonBusquedaPorNombrePrioridadPedido.addActionListener(new ButtonActionListener(this,"BusquedaPorNombrePrioridadPedido"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPrioridadPedidoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPrioridadPedido.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPrioridadPedido(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PrioridadPedido prioridadpedidoAux:this.prioridadpedidoLogic.getPrioridadPedidos()) {
					prioridadpedidoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PrioridadPedido prioridadpedidoAux:prioridadpedidos) {
					prioridadpedidoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPrioridadPedidoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPrioridadPedido(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PrioridadPedido prioridadpedidoAux:this.prioridadpedidoLogic.getPrioridadPedidos()) {
						prioridadpedidoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PrioridadPedido prioridadpedidoAux:prioridadpedidos) {
						prioridadpedidoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PrioridadPedido prioridadpedidoAux:this.prioridadpedidoLogic.getPrioridadPedidos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PrioridadPedido prioridadpedidoAux:prioridadpedidos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPrioridadPedido(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPrioridadPedido.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPrioridadPedido.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPrioridadPedido,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPrioridadPedidoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPrioridadPedido(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPrioridadPedido.getSelectedRows();
			
			PrioridadPedido prioridadpedidoLocal=new PrioridadPedido();
			
			//this.seleccionarTodosPrioridadPedido(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					prioridadpedidoLocal =(PrioridadPedido) this.prioridadpedidoLogic.getPrioridadPedidos().toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					prioridadpedidoLocal =(PrioridadPedido) this.prioridadpedidos.toArray()[this.jTableDatosPrioridadPedido.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				prioridadpedidoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PrioridadPedido prioridadpedidoAux:this.prioridadpedidoLogic.getPrioridadPedidos()) {
						prioridadpedidoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PrioridadPedido prioridadpedidoAux:prioridadpedidos) {
						prioridadpedidoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPrioridadPedido(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPrioridadPedido.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPrioridadPedido.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPrioridadPedido,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPrioridadPedidoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPrioridadPedidoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPrioridadPedidoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPrioridadPedido(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPrioridadPedido.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PrioridadPedido prioridadpedidoAux:this.prioridadpedidoLogic.getPrioridadPedidos()) {
				
						if(sTipoSeleccionar.equals(PrioridadPedidoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							prioridadpedidoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PrioridadPedidoConstantesFunciones.LABEL_DIA)) {
							existe=true;
							prioridadpedidoAux.setdia(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PrioridadPedido prioridadpedidoAux:prioridadpedidos) {
					
						if(sTipoSeleccionar.equals(PrioridadPedidoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							prioridadpedidoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PrioridadPedidoConstantesFunciones.LABEL_DIA)) {
							existe=true;
							prioridadpedidoAux.setdia(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPrioridadPedido(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPrioridadPedidoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPrioridadPedido(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPrioridadPedido=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPrioridadPedido.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxTiposAccionesFormularioPrioridadPedido.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePrioridadPedido) {				
					conSplash=true;//false;										
					
					//this.startProcessPrioridadPedido(conSplash);
				
					this.generarReportePrioridadPedidosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPrioridadPedido.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxTiposAccionesFormularioPrioridadPedido.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPrioridadPedidosSeleccionados();
				//this.jComboBoxTiposAccionesPrioridadPedido.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPrioridadPedidosSeleccionados(false);
				//this.jComboBoxTiposAccionesPrioridadPedido.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPrioridadPedidosSeleccionados(true);
				//this.jComboBoxTiposAccionesPrioridadPedido.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPrioridadPedido();
				
				this.exportarPrioridadPedidosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPrioridadPedido.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxTiposAccionesFormularioPrioridadPedido.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPrioridadPedidos();
				//this.importarPrioridadPedidos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPrioridadPedido.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxTiposAccionesFormularioPrioridadPedido.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPrioridadPedido();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPrioridadPedidosSeleccionados();
				//this.jComboBoxTiposAccionesPrioridadPedido.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Prioridad Pedido", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPrioridadPedido();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPrioridadPedido)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPrioridadPedido(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Prioridad Pedido",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPrioridadPedido.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxTiposAccionesFormularioPrioridadPedido.setSelectedIndex(0);					
				}	
			} 			
			else if(PrioridadPedidoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePrioridadPedido) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPrioridadPedido(conSplash);
					
						//this.actualizarParametrosGeneralPrioridadPedido();
						
						this.generarReporteProcesoAccionPrioridadPedidosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPrioridadPedido.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxTiposAccionesFormularioPrioridadPedido.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PrioridadPedidoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Prioridad PedidoES SELECCIONADOS?", "MANTENIMIENTO DE Prioridad Pedido", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPrioridadPedido();
				
						this.actualizarParametrosGeneralPrioridadPedido();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.prioridadpedidoReturnGeneral=prioridadpedidoLogic.procesarAccionPrioridadPedidosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.prioridadpedidoLogic.getPrioridadPedidos(),this.prioridadpedidoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPrioridadPedidoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPrioridadPedido.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxTiposAccionesFormularioPrioridadPedido.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPrioridadPedido();
					
					PrioridadPedidoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPrioridadPedidoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPrioridadPedido.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxTiposAccionesFormularioPrioridadPedido.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPrioridadPedido(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPrioridadPedidoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPrioridadPedido();
			
			if(this.jInternalFrameDetalleFormPrioridadPedido==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PrioridadPedido> prioridadpedidosSeleccionados=new ArrayList<PrioridadPedido>();		
			PrioridadPedido prioridadpedido=new PrioridadPedido();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPrioridadPedido(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPrioridadPedido.getSelectedItem();
			
			
			
			
			prioridadpedidosSeleccionados=this.getPrioridadPedidosSeleccionados(true);
			//this.sTipoAccion;
			
			if(prioridadpedidosSeleccionados.size()==1) {
				for(PrioridadPedido prioridadpedidoAux:prioridadpedidosSeleccionados) {
					prioridadpedido=prioridadpedidoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPrioridadPedido();
			
      		//this.finishProcessPrioridadPedido(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPrioridadPedidoReturnGeneral() throws Exception {
		if(this.prioridadpedidoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.prioridadpedidoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.prioridadpedidoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.prioridadpedidoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.prioridadpedidoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.prioridadpedidoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPrioridadPedido(false);
		}
		
		if(this.prioridadpedidoReturnGeneral.getConRetornoLista() || this.prioridadpedidoReturnGeneral.getConRetornoObjeto()) {
			if(this.prioridadpedidoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.prioridadpedidoLogic.setPrioridadPedidos(this.prioridadpedidoReturnGeneral.getPrioridadPedidos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.prioridadpedidoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.prioridadpedidoLogic.setPrioridadPedido(this.prioridadpedidoReturnGeneral.getPrioridadPedido());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPrioridadPedido(false);
		}
	}
	
	public void actualizarParametrosGeneralPrioridadPedido() throws Exception {
		
		
	}
	
	public ArrayList<PrioridadPedido> getPrioridadPedidosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PrioridadPedido> prioridadpedidosSeleccionados=new ArrayList<PrioridadPedido>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPrioridadPedido) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PrioridadPedido prioridadpedidoAux:prioridadpedidoLogic.getPrioridadPedidos()) {
					if(prioridadpedidoAux.getIsSelected()) {
						prioridadpedidosSeleccionados.add(prioridadpedidoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PrioridadPedido prioridadpedidoAux:this.prioridadpedidos) {
					if(prioridadpedidoAux.getIsSelected()) {
						prioridadpedidosSeleccionados.add(prioridadpedidoAux);				
					}
				}
			}
			
			if(prioridadpedidosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						prioridadpedidosSeleccionados.addAll(this.prioridadpedidoLogic.getPrioridadPedidos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						prioridadpedidosSeleccionados.addAll(this.prioridadpedidos);				
					}
				}
			}
		} else {
			prioridadpedidosSeleccionados.add(this.prioridadpedido);
		}
		
		return prioridadpedidosSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReportePrioridadPedidosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPrioridadPedidosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPrioridadPedidosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPrioridadPedidosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPrioridadPedidosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Prioridad Pedido",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPrioridadPedidosSeleccionados() throws Exception {
		ArrayList<PrioridadPedido> prioridadpedidosSeleccionados=new ArrayList<PrioridadPedido>();		
		
		prioridadpedidosSeleccionados=this.getPrioridadPedidosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePrioridadPedidos("Todos",prioridadpedidosSeleccionados);
		
	}	
	
	public void generarReporteNormalPrioridadPedidosSeleccionados() throws Exception {
		ArrayList<PrioridadPedido> prioridadpedidosSeleccionados=new ArrayList<PrioridadPedido>();		
		
		prioridadpedidosSeleccionados=this.getPrioridadPedidosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePrioridadPedidos("Todos",prioridadpedidosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPrioridadPedidosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PrioridadPedido> prioridadpedidosSeleccionados=new ArrayList<PrioridadPedido>();
		
		prioridadpedidosSeleccionados=this.getPrioridadPedidosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePrioridadPedidos("Todos",prioridadpedidosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPrioridadPedidosSeleccionados() throws Exception {
		ArrayList<PrioridadPedido> prioridadpedidosSeleccionados=new ArrayList<PrioridadPedido>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPrioridadPedido();
		
		
		prioridadpedidosSeleccionados=this.getPrioridadPedidosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPrioridadPedido();
		
		
		//this.generarReportePrioridadPedidos("Todos",prioridadpedidosSeleccionados ,prioridadpedidoImplementable,prioridadpedidoImplementableHome);
	}
	
	public void mostrarImportacionPrioridadPedidos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPrioridadPedido();
		
		this.abrirFrameImportacionPrioridadPedido();		
		
			
		//this.generarReportePrioridadPedidos("Todos",prioridadpedidosSeleccionados ,prioridadpedidoImplementable,prioridadpedidoImplementableHome);
	}
	
	public void importarPrioridadPedidos() throws Exception {		
	
	}
	
	public void exportarPrioridadPedidosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPrioridadPedidosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPrioridadPedidosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPrioridadPedidosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Prioridad Pedido",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPrioridadPedidosSeleccionados() throws Exception {
		ArrayList<PrioridadPedido> prioridadpedidosSeleccionados=new ArrayList<PrioridadPedido>();		
		
		prioridadpedidosSeleccionados=this.getPrioridadPedidosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"prioridadpedido."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPrioridadPedido(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PrioridadPedido prioridadpedidoAux:prioridadpedidosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPrioridadPedido(prioridadpedidoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//prioridadpedidoAux.setsDetalleGeneralEntityReporte(prioridadpedidoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Prioridad Pedido",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPrioridadPedido(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PrioridadPedidoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrioridadPedidoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrioridadPedidoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrioridadPedidoConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PrioridadPedidoConstantesFunciones.LABEL_DIA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPrioridadPedido(PrioridadPedido prioridadpedido,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=prioridadpedido.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=prioridadpedido.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=prioridadpedido.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=prioridadpedido.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=prioridadpedido.getdia().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPrioridadPedidosSeleccionados() throws Exception {
		ArrayList<PrioridadPedido> prioridadpedidosSeleccionados=new ArrayList<PrioridadPedido>();		
		
		prioridadpedidosSeleccionados=this.getPrioridadPedidosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"prioridadpedido.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PrioridadPedidos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPrioridadPedido(row);				
				iRow++;
			}				
			
			for(PrioridadPedido prioridadpedidoAux:prioridadpedidosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPrioridadPedido(prioridadpedidoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Prioridad Pedido",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPrioridadPedidosSeleccionados() throws Exception {
		ArrayList<PrioridadPedido> prioridadpedidosSeleccionados=new ArrayList<PrioridadPedido>();		
		
		prioridadpedidosSeleccionados=this.getPrioridadPedidosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"prioridadpedido.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("prioridadpedidos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("prioridadpedido");
			//elementRoot.appendChild(element);
		
			for(PrioridadPedido prioridadpedidoAux:prioridadpedidosSeleccionados) {
				element = document.createElement("prioridadpedido");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPrioridadPedido(prioridadpedidoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Prioridad Pedido",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPrioridadPedido(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PrioridadPedidoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PrioridadPedidoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PrioridadPedidoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PrioridadPedidoConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(PrioridadPedidoConstantesFunciones.LABEL_DIA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPrioridadPedido(PrioridadPedido prioridadpedido,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(prioridadpedido.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(prioridadpedido.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(prioridadpedido.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(prioridadpedido.getdia());				
	}
	
	public void setFilaDatosExportarXmlPrioridadPedido(PrioridadPedido prioridadpedido,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PrioridadPedidoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(prioridadpedido.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PrioridadPedidoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(prioridadpedido.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PrioridadPedidoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(prioridadpedido.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(PrioridadPedidoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(prioridadpedido.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdia = document.createElement(PrioridadPedidoConstantesFunciones.DIA);
		elementdia.appendChild(document.createTextNode(prioridadpedido.getdia().toString().trim()));
		element.appendChild(elementdia);
	}
	
	public void generarReporteGroupGenericoPrioridadPedidosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PrioridadPedido> prioridadpedidosSeleccionados=new ArrayList<PrioridadPedido>();
		
		prioridadpedidosSeleccionados=this.getPrioridadPedidosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoPrioridadPedido(prioridadpedidosSeleccionados);
		
		this.generarReportePrioridadPedidos("Todos",prioridadpedidosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPrioridadPedido(ArrayList<PrioridadPedido> prioridadpedidosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PrioridadPedido prioridadpedidoAux:prioridadpedidosSeleccionados) {
				prioridadpedidoAux.setsDetalleGeneralEntityReporte(prioridadpedidoAux.toString());
			
				if(sTipoSeleccionar.equals(PrioridadPedidoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					prioridadpedidoAux.setsDescripcionGeneralEntityReporte1(prioridadpedidoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PrioridadPedidoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					prioridadpedidoAux.setsDescripcionGeneralEntityReporte1(prioridadpedidoAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(PrioridadPedidoConstantesFunciones.LABEL_DIA)) {
					existe=true;
					prioridadpedidoAux.setsDescripcionGeneralEntityReporte1(prioridadpedidoAux.getdia().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPrioridadPedido(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPrioridadPedido=true;
				this.isVisibilidadCeldaNuevoRelacionesPrioridadPedido=true;
				this.isVisibilidadCeldaGuardarCambiosPrioridadPedido=true;
			}
			
			this.isVisibilidadCeldaModificarPrioridadPedido=false;
			this.isVisibilidadCeldaActualizarPrioridadPedido=false;
			this.isVisibilidadCeldaEliminarPrioridadPedido=false;
			this.isVisibilidadCeldaCancelarPrioridadPedido=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPrioridadPedido=true;
				} else {
					this.isVisibilidadCeldaGuardarPrioridadPedido=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPrioridadPedido=false;
			this.isVisibilidadCeldaNuevoRelacionesPrioridadPedido=false;
			this.isVisibilidadCeldaGuardarCambiosPrioridadPedido=false;
			this.isVisibilidadCeldaModificarPrioridadPedido=false;
			this.isVisibilidadCeldaActualizarPrioridadPedido=true;
			this.isVisibilidadCeldaEliminarPrioridadPedido=false;
			this.isVisibilidadCeldaCancelarPrioridadPedido=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPrioridadPedido=true;
				} else {
					this.isVisibilidadCeldaGuardarPrioridadPedido=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPrioridadPedido=false;
			this.isVisibilidadCeldaNuevoRelacionesPrioridadPedido=false;
			this.isVisibilidadCeldaGuardarCambiosPrioridadPedido=false;
			this.isVisibilidadCeldaModificarPrioridadPedido=false;
			this.isVisibilidadCeldaActualizarPrioridadPedido=true;
			this.isVisibilidadCeldaEliminarPrioridadPedido=true;
			this.isVisibilidadCeldaCancelarPrioridadPedido=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPrioridadPedido=true;
				} else {
					this.isVisibilidadCeldaGuardarPrioridadPedido=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPrioridadPedido=false;
			this.isVisibilidadCeldaNuevoRelacionesPrioridadPedido=false;
			this.isVisibilidadCeldaGuardarCambiosPrioridadPedido=false;
			this.isVisibilidadCeldaModificarPrioridadPedido=false;
			this.isVisibilidadCeldaActualizarPrioridadPedido=true;
			this.isVisibilidadCeldaEliminarPrioridadPedido=false;
			this.isVisibilidadCeldaCancelarPrioridadPedido=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPrioridadPedido=false;
				} else {
					this.isVisibilidadCeldaGuardarPrioridadPedido=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPrioridadPedido=true;
			this.isVisibilidadCeldaNuevoRelacionesPrioridadPedido=true;
			this.isVisibilidadCeldaGuardarCambiosPrioridadPedido=true;
			this.isVisibilidadCeldaModificarPrioridadPedido=false;
			this.isVisibilidadCeldaActualizarPrioridadPedido=false;
			this.isVisibilidadCeldaEliminarPrioridadPedido=false;
			this.isVisibilidadCeldaCancelarPrioridadPedido=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPrioridadPedido=true;
				} else {
					this.isVisibilidadCeldaGuardarPrioridadPedido=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPrioridadPedido=false;
			this.isVisibilidadCeldaNuevoRelacionesPrioridadPedido=false;
			this.isVisibilidadCeldaGuardarCambiosPrioridadPedido=false;
			this.isVisibilidadCeldaActualizarPrioridadPedido=false;
			this.isVisibilidadCeldaEliminarPrioridadPedido=false;
			this.isVisibilidadCeldaCancelarPrioridadPedido=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPrioridadPedido=false;
				} else {
					this.isVisibilidadCeldaGuardarPrioridadPedido=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPrioridadPedido=false;
			this.isVisibilidadCeldaNuevoRelacionesPrioridadPedido=false;
			this.isVisibilidadCeldaGuardarCambiosPrioridadPedido=false;
			this.isVisibilidadCeldaModificarPrioridadPedido=true;
			this.isVisibilidadCeldaActualizarPrioridadPedido=false;
			this.isVisibilidadCeldaEliminarPrioridadPedido=false;
			this.isVisibilidadCeldaCancelarPrioridadPedido=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPrioridadPedido=false;
				} else {
					this.isVisibilidadCeldaGuardarPrioridadPedido=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PrioridadPedidoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPrioridadPedido=true;
			this.isVisibilidadCeldaNuevoRelacionesPrioridadPedido=true;
			this.isVisibilidadCeldaGuardarCambiosPrioridadPedido=true;
		} else {
			this.actualizarEstadoPanelsPrioridadPedido(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPrioridadPedido=false;
			//this.isVisibilidadCeldaVerFormPrioridadPedido=false;
			this.isVisibilidadCeldaDuplicarPrioridadPedido=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!prioridadpedidoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPrioridadPedido=false;
		} else {
			this.isVisibilidadCeldaNuevoPrioridadPedido=false;
			this.isVisibilidadCeldaGuardarCambiosPrioridadPedido=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(prioridadpedidoSessionBean.getEsGuardarRelacionado()) {
			if(!prioridadpedidoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPrioridadPedido=false;												
			}
			
			this.jButtonCerrarPrioridadPedido.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPrioridadPedido=false;
		}
		
		if(!this.permiteMantenimiento(this.prioridadpedido)) {
			this.isVisibilidadCeldaActualizarPrioridadPedido=false;
			this.isVisibilidadCeldaEliminarPrioridadPedido=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPrioridadPedido() {
	}
	
	public void actualizarEstadoPanelsPrioridadPedido(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPrioridadPedido!=null) {
				this.jScrollPanelDatosEdicionPrioridadPedido.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPrioridadPedido!=null) {
				this.jTabbedPaneBusquedasPrioridadPedido.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPrioridadPedido!=null) {
				this.jScrollPanelDatosPrioridadPedido.setVisible(true);
			}
			
			if(this.jPanelPaginacionPrioridadPedido!=null) {
				this.jPanelPaginacionPrioridadPedido.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPrioridadPedido!=null) {
				this.jPanelParametrosReportesPrioridadPedido.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPrioridadPedido!=null) {
				this.jScrollPanelDatosEdicionPrioridadPedido.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPrioridadPedido!=null) {
				this.jTabbedPaneBusquedasPrioridadPedido.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPrioridadPedido!=null) {
				this.jScrollPanelDatosPrioridadPedido.setVisible(false);
			}
			
			if(this.jPanelPaginacionPrioridadPedido!=null) {
				this.jPanelPaginacionPrioridadPedido.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPrioridadPedido!=null) {
				this.jPanelParametrosReportesPrioridadPedido.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPrioridadPedido!=null) {
				this.jScrollPanelDatosEdicionPrioridadPedido.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPrioridadPedido!=null) {
				this.jTabbedPaneBusquedasPrioridadPedido.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPrioridadPedido!=null) {
				this.jScrollPanelDatosPrioridadPedido.setVisible(false);
			}
			
			if(this.jPanelPaginacionPrioridadPedido!=null) {
				this.jPanelPaginacionPrioridadPedido.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPrioridadPedido!=null) {
				this.jPanelParametrosReportesPrioridadPedido.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPrioridadPedido!=null) {
				this.jScrollPanelDatosEdicionPrioridadPedido.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPrioridadPedido!=null) {
				this.jTabbedPaneBusquedasPrioridadPedido.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPrioridadPedido!=null) {
				this.jScrollPanelDatosPrioridadPedido.setVisible(false);
			}
			
			if(this.jPanelPaginacionPrioridadPedido!=null) {
				this.jPanelPaginacionPrioridadPedido.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPrioridadPedido!=null) {
				this.jPanelParametrosReportesPrioridadPedido.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPrioridadPedido!=null) {
				this.jScrollPanelDatosEdicionPrioridadPedido.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPrioridadPedido!=null) {
				this.jTabbedPaneBusquedasPrioridadPedido.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPrioridadPedido!=null) {
				this.jScrollPanelDatosPrioridadPedido.setVisible(true);
			}
			
			if(this.jPanelPaginacionPrioridadPedido!=null) {
				this.jPanelPaginacionPrioridadPedido.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPrioridadPedido!=null) {
				this.jPanelParametrosReportesPrioridadPedido.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPrioridadPedido!=null) {
				this.jScrollPanelDatosEdicionPrioridadPedido.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPrioridadPedido!=null) {
				this.jTabbedPaneBusquedasPrioridadPedido.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPrioridadPedido!=null) {
				this.jScrollPanelDatosPrioridadPedido.setVisible(true);
			}
			
			if(this.jPanelPaginacionPrioridadPedido!=null) {
				this.jPanelPaginacionPrioridadPedido.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPrioridadPedido!=null) {
				this.jPanelParametrosReportesPrioridadPedido.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPrioridadPedido!=null) {
				this.jScrollPanelDatosEdicionPrioridadPedido.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPrioridadPedido!=null) {
				this.jTabbedPaneBusquedasPrioridadPedido.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPrioridadPedido!=null) {
				this.jScrollPanelDatosPrioridadPedido.setVisible(true);
			}
			
			if(this.jPanelPaginacionPrioridadPedido!=null) {
				this.jPanelPaginacionPrioridadPedido.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPrioridadPedido!=null) {
				this.jPanelParametrosReportesPrioridadPedido.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPrioridadPedido!=null) {
					this.jTabbedPaneBusquedasPrioridadPedido.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPrioridadPedido!=null) {
				this.jPanelParametrosReportesPrioridadPedido.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.prioridadpedidoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPrioridadPedido!=null) {
				this.jTabbedPaneBusquedasPrioridadPedido.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPrioridadPedido!=null) {
				this.jPanelParametrosReportesPrioridadPedido.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasPrioridadPedido.remove(jPanelBusquedaPorNombrePrioridadPedido);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PrioridadPedidoSessionBean prioridadpedidoSessionBean=new PrioridadPedidoSessionBean();
		
		if(this.prioridadpedidoSessionBean==null) {
			this.prioridadpedidoSessionBean=new PrioridadPedidoSessionBean();
		}
		
		this.prioridadpedidoSessionBean.setsUltimaBusquedaPrioridadPedido(this.getsAccionBusqueda());
		this.prioridadpedidoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.prioridadpedidoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			prioridadpedidoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			prioridadpedidoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PrioridadPedidoSessionBean prioridadpedidoSessionBean=new PrioridadPedidoSessionBean();
		
		if(this.prioridadpedidoSessionBean==null) {
			this.prioridadpedidoSessionBean=new PrioridadPedidoSessionBean();
		}
		
		if(this.prioridadpedidoSessionBean.getsUltimaBusquedaPrioridadPedido()!=null&&!this.prioridadpedidoSessionBean.getsUltimaBusquedaPrioridadPedido().equals("")) {
			this.setsAccionBusqueda(prioridadpedidoSessionBean.getsUltimaBusquedaPrioridadPedido());
			this.setiNumeroPaginacion(prioridadpedidoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(prioridadpedidoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(prioridadpedidoSessionBean.getnombre());
				prioridadpedidoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(prioridadpedidoSessionBean.getid_empresa());
				prioridadpedidoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.prioridadpedidoSessionBean.setsUltimaBusquedaPrioridadPedido("");
		this.prioridadpedidoSessionBean.setiNumeroPaginacion(PrioridadPedidoConstantesFunciones.INUMEROPAGINACION);
		this.prioridadpedidoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPrioridadPedido(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPrioridadPedido() {
		this.updateBorderResaltarBusquedasFormularioPrioridadPedido();
		this.updateVisibilidadBusquedasFormularioPrioridadPedido();
		this.updateHabilitarBusquedasFormularioPrioridadPedido();
	}
	
	public void updateBorderResaltarBusquedasFormularioPrioridadPedido() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPrioridadPedido.getComponents().length>0) {
	

		if(this.prioridadpedidoConstantesFunciones.resaltarBusquedaPorNombrePrioridadPedido!=null) {
			index= this.jTabbedPaneBusquedasPrioridadPedido.indexOfComponent(this.jPanelBusquedaPorNombrePrioridadPedido);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPrioridadPedido.getComponent(index);
				jPanel.setBorder(this.prioridadpedidoConstantesFunciones.resaltarBusquedaPorNombrePrioridadPedido);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPrioridadPedido() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPrioridadPedido.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPrioridadPedido.indexOfComponent(this.jPanelBusquedaPorNombrePrioridadPedido);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPrioridadPedido.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.prioridadpedidoConstantesFunciones.mostrarBusquedaPorNombrePrioridadPedido);
			if(!this.prioridadpedidoConstantesFunciones.mostrarBusquedaPorNombrePrioridadPedido && index>-1) {
				this.jTabbedPaneBusquedasPrioridadPedido.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPrioridadPedido() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPrioridadPedido.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPrioridadPedido.indexOfComponent(this.jPanelBusquedaPorNombrePrioridadPedido);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPrioridadPedido.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.prioridadpedidoConstantesFunciones.activarBusquedaPorNombrePrioridadPedido);
				this.jTabbedPaneBusquedasPrioridadPedido.setEnabledAt(index,this.prioridadpedidoConstantesFunciones.activarBusquedaPorNombrePrioridadPedido);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPrioridadPedido(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasPrioridadPedido.indexOfComponent(this.jPanelBusquedaPorNombrePrioridadPedido);

			this.jTabbedPaneBusquedasPrioridadPedido.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPrioridadPedido.getComponent(index);

			this.prioridadpedidoConstantesFunciones.setResaltarBusquedaPorNombrePrioridadPedido(resaltar);

			jPanel.setBorder(this.prioridadpedidoConstantesFunciones.resaltarBusquedaPorNombrePrioridadPedido);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPrioridadPedido.setBorder(resaltar);
			
		}
	}	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioPrioridadPedido() throws Exception {

		if(this.jInternalFrameDetalleFormPrioridadPedido==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPrioridadPedido();
		this.updateVisibilidadResaltarControlesFormularioPrioridadPedido();
		this.updateHabilitarResaltarControlesFormularioPrioridadPedido();
		
	}
	
	public void updateBorderResaltarControlesFormularioPrioridadPedido() throws Exception {
		if(this.jInternalFrameDetalleFormPrioridadPedido==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.prioridadpedidoConstantesFunciones.resaltaridPrioridadPedido!=null && this.jInternalFrameDetalleFormPrioridadPedido!=null) {this.jInternalFrameDetalleFormPrioridadPedido.jLabelidPrioridadPedido.setBorder(this.prioridadpedidoConstantesFunciones.resaltaridPrioridadPedido);}
		if(this.prioridadpedidoConstantesFunciones.resaltarid_empresaPrioridadPedido!=null && this.jInternalFrameDetalleFormPrioridadPedido!=null) {this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxid_empresaPrioridadPedido.setBorder(this.prioridadpedidoConstantesFunciones.resaltarid_empresaPrioridadPedido);}
		if(this.prioridadpedidoConstantesFunciones.resaltarnombrePrioridadPedido!=null && this.jInternalFrameDetalleFormPrioridadPedido!=null) {this.jInternalFrameDetalleFormPrioridadPedido.jTextFieldnombrePrioridadPedido.setBorder(this.prioridadpedidoConstantesFunciones.resaltarnombrePrioridadPedido);}
		if(this.prioridadpedidoConstantesFunciones.resaltardiaPrioridadPedido!=null && this.jInternalFrameDetalleFormPrioridadPedido!=null) {this.jInternalFrameDetalleFormPrioridadPedido.jTextFielddiaPrioridadPedido.setBorder(this.prioridadpedidoConstantesFunciones.resaltardiaPrioridadPedido);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPrioridadPedido() throws Exception {		
		if(this.jInternalFrameDetalleFormPrioridadPedido==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPrioridadPedido!=null) {
	
		//this.jInternalFrameDetalleFormPrioridadPedido.jLabelidPrioridadPedido.setVisible(this.prioridadpedidoConstantesFunciones.mostraridPrioridadPedido);
		this.jInternalFrameDetalleFormPrioridadPedido.jPanelidPrioridadPedido.setVisible(this.prioridadpedidoConstantesFunciones.mostraridPrioridadPedido);
		//this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxid_empresaPrioridadPedido.setVisible(this.prioridadpedidoConstantesFunciones.mostrarid_empresaPrioridadPedido);
		this.jInternalFrameDetalleFormPrioridadPedido.jPanelid_empresaPrioridadPedido.setVisible(this.prioridadpedidoConstantesFunciones.mostrarid_empresaPrioridadPedido);
		//this.jInternalFrameDetalleFormPrioridadPedido.jTextFieldnombrePrioridadPedido.setVisible(this.prioridadpedidoConstantesFunciones.mostrarnombrePrioridadPedido);
		this.jInternalFrameDetalleFormPrioridadPedido.jPanelnombrePrioridadPedido.setVisible(this.prioridadpedidoConstantesFunciones.mostrarnombrePrioridadPedido);
		//this.jInternalFrameDetalleFormPrioridadPedido.jTextFielddiaPrioridadPedido.setVisible(this.prioridadpedidoConstantesFunciones.mostrardiaPrioridadPedido);
		this.jInternalFrameDetalleFormPrioridadPedido.jPaneldiaPrioridadPedido.setVisible(this.prioridadpedidoConstantesFunciones.mostrardiaPrioridadPedido);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPrioridadPedido() throws Exception {
		if(this.jInternalFrameDetalleFormPrioridadPedido==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPrioridadPedido!=null) {
	
		this.jInternalFrameDetalleFormPrioridadPedido.jLabelidPrioridadPedido.setEnabled(this.prioridadpedidoConstantesFunciones.activaridPrioridadPedido);
		this.jInternalFrameDetalleFormPrioridadPedido.jComboBoxid_empresaPrioridadPedido.setEnabled(this.prioridadpedidoConstantesFunciones.activarid_empresaPrioridadPedido);
		this.jInternalFrameDetalleFormPrioridadPedido.jTextFieldnombrePrioridadPedido.setEnabled(this.prioridadpedidoConstantesFunciones.activarnombrePrioridadPedido);
		this.jInternalFrameDetalleFormPrioridadPedido.jTextFielddiaPrioridadPedido.setEnabled(this.prioridadpedidoConstantesFunciones.activardiaPrioridadPedido);
		}
	}
	
		
}