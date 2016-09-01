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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.facturacion.util.UtilidadesVentasConstantesFunciones;
import com.bydan.erp.facturacion.util.report.UtilidadesVentasParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.report.UtilidadesVentasParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.report.UtilidadesVentasBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.facturacion.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.facturacion.util.*;

import com.bydan.erp.facturacion.util.report.*;
import com.bydan.erp.facturacion.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.business.entity.report.*;
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

//import org.hibernate.collection.PersistentBag;

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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;

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
public class UtilidadesVentasBeanSwingJInternalFrame extends UtilidadesVentasJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(UtilidadesVentasBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<UtilidadesVentas> utilidadesventasValidator = new ClassValidator<UtilidadesVentas>(UtilidadesVentas.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public UtilidadesVentas utilidadesventas;	
	public UtilidadesVentas utilidadesventasAux;
	public UtilidadesVentas utilidadesventasAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public UtilidadesVentas utilidadesventasTotales;
	public Long idUtilidadesVentasActual;
	public Long iIdNuevoUtilidadesVentas=0L;
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

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
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
	
	public Boolean isPermisoTodoUtilidadesVentas;
	public Boolean isPermisoNuevoUtilidadesVentas;
	public Boolean isPermisoActualizarUtilidadesVentas;
	public Boolean isPermisoActualizarOriginalUtilidadesVentas;
	public Boolean isPermisoEliminarUtilidadesVentas;
	public Boolean isPermisoGuardarCambiosUtilidadesVentas;
	public Boolean isPermisoConsultaUtilidadesVentas;
	public Boolean isPermisoBusquedaUtilidadesVentas;
	public Boolean isPermisoReporteUtilidadesVentas;
	public Boolean isPermisoPaginacionMedioUtilidadesVentas;
	public Boolean isPermisoPaginacionAltoUtilidadesVentas;
	public Boolean isPermisoPaginacionTodoUtilidadesVentas;
	public Boolean isPermisoCopiarUtilidadesVentas;
	public Boolean isPermisoVerFormUtilidadesVentas;
	public Boolean isPermisoDuplicarUtilidadesVentas;
	public Boolean isPermisoOrdenUtilidadesVentas;
	
	
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
	
	public UtilidadesVentasParameterReturnGeneral utilidadesventasReturnGeneral;
	public UtilidadesVentasParameterReturnGeneral utilidadesventasParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoUtilidadesVentas=false;
	public Boolean esParaAccionDesdeFormularioUtilidadesVentas=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected UtilidadesVentasSessionBeanAdditional utilidadesventasSessionBeanAdditional=null;
	
	public UtilidadesVentasSessionBeanAdditional getUtilidadesVentasSessionBeanAdditional() {
		return this.utilidadesventasSessionBeanAdditional;
	}
	
	public void setUtilidadesVentasSessionBeanAdditional(UtilidadesVentasSessionBeanAdditional utilidadesventasSessionBeanAdditional) {
		try {
			this.utilidadesventasSessionBeanAdditional=utilidadesventasSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected UtilidadesVentasBeanSwingJInternalFrameAdditional utilidadesventasBeanSwingJInternalFrameAdditional=null;
	//public class UtilidadesVentasBeanSwingJInternalFrame
	
	public UtilidadesVentasBeanSwingJInternalFrameAdditional getUtilidadesVentasBeanSwingJInternalFrameAdditional() {
		return this.utilidadesventasBeanSwingJInternalFrameAdditional;
	}
	
	public void setUtilidadesVentasBeanSwingJInternalFrameAdditional(UtilidadesVentasBeanSwingJInternalFrameAdditional utilidadesventasBeanSwingJInternalFrameAdditional) {
		try {
			this.utilidadesventasBeanSwingJInternalFrameAdditional=utilidadesventasBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public UtilidadesVentasLogic utilidadesventasLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public UtilidadesVentas utilidadesventasBean;
	public UtilidadesVentasConstantesFunciones utilidadesventasConstantesFunciones;
	//public UtilidadesVentasParameterReturnGeneral utilidadesventasReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	
	//PARAMETROS
	
	
	//public List<UtilidadesVentas> utilidadesventass;	
	//public List<UtilidadesVentas> utilidadesventassEliminados;
	//public List<UtilidadesVentas> utilidadesventassAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoUtilidadesVentas=false;
	public Boolean isVisibilidadCeldaDuplicarUtilidadesVentas=true;
	public Boolean isVisibilidadCeldaCopiarUtilidadesVentas=true;
	public Boolean isVisibilidadCeldaVerFormUtilidadesVentas=true;
	public Boolean isVisibilidadCeldaOrdenUtilidadesVentas=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesUtilidadesVentas=false;
	public Boolean isVisibilidadCeldaModificarUtilidadesVentas=false;
	public Boolean isVisibilidadCeldaActualizarUtilidadesVentas=false;
	public Boolean isVisibilidadCeldaEliminarUtilidadesVentas=false;
	public Boolean isVisibilidadCeldaCancelarUtilidadesVentas=false;
	public Boolean isVisibilidadCeldaGuardarUtilidadesVentas=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosUtilidadesVentas=false;	
	
	
	public Boolean isVisibilidadBusquedaUtilidadesVentas=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoUtilidadesVentas() {
		return this.iIdNuevoUtilidadesVentas;
	}

	public void setiIdNuevoUtilidadesVentas(Long iIdNuevoUtilidadesVentas) {
		this.iIdNuevoUtilidadesVentas = iIdNuevoUtilidadesVentas;
	}
	
	public Long getidUtilidadesVentasActual() {
		return this.idUtilidadesVentasActual;
	}

	public void setidUtilidadesVentasActual(Long idUtilidadesVentasActual) {
		this.idUtilidadesVentasActual = idUtilidadesVentasActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public UtilidadesVentas getutilidadesventas() {
		return this.utilidadesventas;
	}

	public void setutilidadesventas(UtilidadesVentas utilidadesventas) {
		this.utilidadesventas = utilidadesventas;
	}
	
	public UtilidadesVentas getutilidadesventasAux() {
		return this.utilidadesventasAux;
	}

	public void setutilidadesventasAux(UtilidadesVentas utilidadesventasAux) {
		this.utilidadesventasAux = utilidadesventasAux;
	}				
	
	public UtilidadesVentas getutilidadesventasAnterior() {
		return this.utilidadesventasAnterior;
	}

	public void setutilidadesventasAnterior(UtilidadesVentas utilidadesventasAnterior) {
		this.utilidadesventasAnterior = utilidadesventasAnterior;
	}	
	
	public UtilidadesVentas getutilidadesventasTotales() {
		return this.utilidadesventasTotales;
	}

	public void setutilidadesventasTotales(UtilidadesVentas utilidadesventasTotales) {
		this.utilidadesventasTotales = utilidadesventasTotales;
	}	
	
	public UtilidadesVentas getutilidadesventasBean() {
		return this.utilidadesventasBean;
	}

	public void setutilidadesventasBean(UtilidadesVentas utilidadesventasBean) {
		this.utilidadesventasBean = utilidadesventasBean;
	}	
	
	public UtilidadesVentasParameterReturnGeneral getutilidadesventasReturnGeneral() {
		return this.utilidadesventasReturnGeneral;
	}

	public void setutilidadesventasReturnGeneral(UtilidadesVentasParameterReturnGeneral utilidadesventasReturnGeneral) {
		this.utilidadesventasReturnGeneral = utilidadesventasReturnGeneral;
	}	
	
	
	public Date fecha_emision_desdeBusquedaUtilidadesVentas=new Date();

	public Date getfecha_emision_desdeBusquedaUtilidadesVentas() {
		return this.fecha_emision_desdeBusquedaUtilidadesVentas;
	}

	public void setfecha_emision_desdeBusquedaUtilidadesVentas(Date fecha_emision_desdeBusquedaUtilidadesVentas) {
		this.fecha_emision_desdeBusquedaUtilidadesVentas = fecha_emision_desdeBusquedaUtilidadesVentas;
	}

;
	public Date fecha_emision_hastaBusquedaUtilidadesVentas=new Date();

	public Date getfecha_emision_hastaBusquedaUtilidadesVentas() {
		return this.fecha_emision_hastaBusquedaUtilidadesVentas;
	}

	public void setfecha_emision_hastaBusquedaUtilidadesVentas(Date fecha_emision_hastaBusquedaUtilidadesVentas) {
		this.fecha_emision_hastaBusquedaUtilidadesVentas = fecha_emision_hastaBusquedaUtilidadesVentas;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public UtilidadesVentasLogic getUtilidadesVentasLogic()	{		
		return utilidadesventasLogic;
	}

	public void setUtilidadesVentasLogic(UtilidadesVentasLogic utilidadesventasLogic) {
		this.utilidadesventasLogic = utilidadesventasLogic;
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
	
	public Boolean getIsEsNuevoUtilidadesVentas() {
		return isEsNuevoUtilidadesVentas;
	}

	public void setIsEsNuevoUtilidadesVentas(Boolean isEsNuevoUtilidadesVentas) {
		this.isEsNuevoUtilidadesVentas = isEsNuevoUtilidadesVentas;
	}

	public Boolean getEsParaAccionDesdeFormularioUtilidadesVentas() {
		return esParaAccionDesdeFormularioUtilidadesVentas;
	}
	
	public void setEsParaAccionDesdeFormularioUtilidadesVentas(Boolean esParaAccionDesdeFormularioUtilidadesVentas) {
		this.esParaAccionDesdeFormularioUtilidadesVentas = esParaAccionDesdeFormularioUtilidadesVentas;
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

			if(this.utilidadesventasSessionBean==null) {
				this.utilidadesventasSessionBean=new UtilidadesVentasSessionBean();
			}

			if(!this.utilidadesventasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(utilidadesventasSessionBean.getlidEmpresaActual());
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

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.utilidadesventasSessionBean==null) {
				this.utilidadesventasSessionBean=new UtilidadesVentasSessionBean();
			}

			if(!this.utilidadesventasSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(utilidadesventasSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
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

					if(this.utilidadesventas!=null) {
						this.utilidadesventas.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) {
						this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_empresaUtilidadesVentas.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaUtilidadesVentas.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) {
						if(this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_empresaUtilidadesVentas.getItemCount()>0) {
							this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_empresaUtilidadesVentas.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaUtilidadesVentasGenerico)throws Exception
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
				jComboBoxid_empresaUtilidadesVentasGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaUtilidadesVentasGenerico!=null && jComboBoxid_empresaUtilidadesVentasGenerico.getItemCount()>0) {
					jComboBoxid_empresaUtilidadesVentasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.utilidadesventas!=null) {
						this.utilidadesventas.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) {
						this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_sucursalUtilidadesVentas.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalUtilidadesVentas.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) {
						if(this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_sucursalUtilidadesVentas.getItemCount()>0) {
							this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_sucursalUtilidadesVentas.setSelectedIndex(0);
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

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalUtilidadesVentasGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalUtilidadesVentasGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalUtilidadesVentasGenerico!=null && jComboBoxid_sucursalUtilidadesVentasGenerico.getItemCount()>0) {
					jComboBoxid_sucursalUtilidadesVentasGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(UtilidadesVentas utilidadesventas,JComboBox jComboBoxid_empresaUtilidadesVentasGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaUtilidadesVentasGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_empresaUtilidadesVentas.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaUtilidadesVentasGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				utilidadesventas.setid_empresa(empresaAux.getId());
				utilidadesventas.setempresa_descripcion(UtilidadesVentasConstantesFunciones.getEmpresaDescripcion(empresaAux));
				utilidadesventas.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(UtilidadesVentas utilidadesventas,JComboBox jComboBoxid_sucursalUtilidadesVentasGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalUtilidadesVentasGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_sucursalUtilidadesVentas.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalUtilidadesVentasGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				utilidadesventas.setid_sucursal(sucursalAux.getId());
				utilidadesventas.setsucursal_descripcion(UtilidadesVentasConstantesFunciones.getSucursalDescripcion(sucursalAux));
				utilidadesventas.setSucursal(sucursalAux);			}
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

					if(!UtilidadesVentasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) { 
							this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_empresaUtilidadesVentas.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_empresaUtilidadesVentas.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) { 
					}

					if(!UtilidadesVentasJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!UtilidadesVentasJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) { 
							this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_sucursalUtilidadesVentas.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_sucursalUtilidadesVentas.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) { 
					}

					if(!UtilidadesVentasJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) {
							this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_empresaUtilidadesVentas.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) {
							this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_empresaUtilidadesVentas.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) {
							this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_sucursalUtilidadesVentas.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) {
							this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_sucursalUtilidadesVentas.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesUtilidadesVentas() throws Exception {
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
		
	public UtilidadesVentasParameterReturnGeneral getUtilidadesVentasParameterGeneral() {
		return this.utilidadesventasParameterGeneral;
	}
	
	public void setUtilidadesVentasParameterGeneral(UtilidadesVentasParameterReturnGeneral utilidadesventasParameterGeneral) {
		this.utilidadesventasParameterGeneral = utilidadesventasParameterGeneral;
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
	
	public Boolean getIsPermisoTodoUtilidadesVentas() {
		return isPermisoTodoUtilidadesVentas;
	}

	public void setIsPermisoTodoUtilidadesVentas(Boolean isPermisoTodoUtilidadesVentas) {
		this.isPermisoTodoUtilidadesVentas = isPermisoTodoUtilidadesVentas;
	}

	public Boolean getIsPermisoNuevoUtilidadesVentas() {
		return isPermisoNuevoUtilidadesVentas;
	}

	public void setIsPermisoNuevoUtilidadesVentas(Boolean isPermisoNuevoUtilidadesVentas) {
		this.isPermisoNuevoUtilidadesVentas = isPermisoNuevoUtilidadesVentas;
	}

	public Boolean getIsPermisoActualizarUtilidadesVentas() {
		return isPermisoActualizarUtilidadesVentas;
	}

	public void setIsPermisoActualizarUtilidadesVentas(Boolean isPermisoActualizarUtilidadesVentas) {
		this.isPermisoActualizarUtilidadesVentas = isPermisoActualizarUtilidadesVentas;
	}

	public Boolean getIsPermisoEliminarUtilidadesVentas() {
		return isPermisoEliminarUtilidadesVentas;
	}

	public void setIsPermisoEliminarUtilidadesVentas(Boolean isPermisoEliminarUtilidadesVentas) {
		this.isPermisoEliminarUtilidadesVentas = isPermisoEliminarUtilidadesVentas;
	}

	public Boolean getIsPermisoGuardarCambiosUtilidadesVentas() {
		return isPermisoGuardarCambiosUtilidadesVentas;
	}

	public void setIsPermisoGuardarCambiosUtilidadesVentas(Boolean isPermisoGuardarCambiosUtilidadesVentas) {
		this.isPermisoGuardarCambiosUtilidadesVentas = isPermisoGuardarCambiosUtilidadesVentas;
	}
	
	public Boolean getIsPermisoConsultaUtilidadesVentas() {
		return isPermisoConsultaUtilidadesVentas;
	}

	public void setIsPermisoConsultaUtilidadesVentas(Boolean isPermisoConsultaUtilidadesVentas) {
		this.isPermisoConsultaUtilidadesVentas = isPermisoConsultaUtilidadesVentas;
	}

	public Boolean getIsPermisoBusquedaUtilidadesVentas() {
		return isPermisoBusquedaUtilidadesVentas;
	}

	public void setIsPermisoBusquedaUtilidadesVentas(Boolean isPermisoBusquedaUtilidadesVentas) {
		this.isPermisoBusquedaUtilidadesVentas = isPermisoBusquedaUtilidadesVentas;
	}

	public Boolean getIsPermisoReporteUtilidadesVentas() {
		return isPermisoReporteUtilidadesVentas;
	}

	public void setIsPermisoReporteUtilidadesVentas(Boolean isPermisoReporteUtilidadesVentas) {
		this.isPermisoReporteUtilidadesVentas = isPermisoReporteUtilidadesVentas;
	}
	
	public Boolean getIsPermisoPaginacionMedioUtilidadesVentas() {
		return isPermisoPaginacionMedioUtilidadesVentas;
	}

	public void setIsPermisoPaginacionMedioUtilidadesVentas(Boolean isPermisoPaginacionMedioUtilidadesVentas) {
		this.isPermisoPaginacionMedioUtilidadesVentas = isPermisoPaginacionMedioUtilidadesVentas;
	}
	
	public Boolean getIsPermisoPaginacionTodoUtilidadesVentas() {
		return isPermisoPaginacionTodoUtilidadesVentas;
	}

	public void setIsPermisoPaginacionTodoUtilidadesVentas(Boolean isPermisoPaginacionTodoUtilidadesVentas) {
		this.isPermisoPaginacionTodoUtilidadesVentas = isPermisoPaginacionTodoUtilidadesVentas;
	}
	
	public Boolean getIsPermisoPaginacionAltoUtilidadesVentas() {
		return isPermisoPaginacionAltoUtilidadesVentas;
	}

	public void setIsPermisoPaginacionAltoUtilidadesVentas(Boolean isPermisoPaginacionAltoUtilidadesVentas) {
		this.isPermisoPaginacionAltoUtilidadesVentas = isPermisoPaginacionAltoUtilidadesVentas;
	}
	
	public Boolean getIsPermisoCopiarUtilidadesVentas() {
		return isPermisoCopiarUtilidadesVentas;
	}

	public void setIsPermisoCopiarUtilidadesVentas(Boolean isPermisoCopiarUtilidadesVentas) {
		this.isPermisoCopiarUtilidadesVentas = isPermisoCopiarUtilidadesVentas;
	}
	
	public Boolean getIsPermisoVerFormUtilidadesVentas() {
		return isPermisoVerFormUtilidadesVentas;
	}

	public void setIsPermisoVerFormUtilidadesVentas(Boolean isPermisoVerFormUtilidadesVentas) {
		this.isPermisoVerFormUtilidadesVentas = isPermisoVerFormUtilidadesVentas;
	}
	
	public Boolean getIsPermisoDuplicarUtilidadesVentas() {
		return isPermisoDuplicarUtilidadesVentas;
	}

	public void setIsPermisoDuplicarUtilidadesVentas(Boolean isPermisoDuplicarUtilidadesVentas) {
		this.isPermisoDuplicarUtilidadesVentas = isPermisoDuplicarUtilidadesVentas;
	}
	
	public Boolean getIsPermisoOrdenUtilidadesVentas() {
		return isPermisoOrdenUtilidadesVentas;
	}

	public void setIsPermisoOrdenUtilidadesVentas(Boolean isPermisoOrdenUtilidadesVentas) {
		this.isPermisoOrdenUtilidadesVentas = isPermisoOrdenUtilidadesVentas;
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
	
	public Boolean getIsVisibilidadCeldaNuevoUtilidadesVentas() {
		return isVisibilidadCeldaNuevoUtilidadesVentas;
	}

	public void setIsVisibilidadCeldaNuevoUtilidadesVentas(Boolean isVisibilidadCeldaNuevoUtilidadesVentas) {
		this.isVisibilidadCeldaNuevoUtilidadesVentas = isVisibilidadCeldaNuevoUtilidadesVentas;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarUtilidadesVentas() {
		return isVisibilidadCeldaDuplicarUtilidadesVentas;
	}

	public void setIsVisibilidadCeldaDuplicarUtilidadesVentas(Boolean isVisibilidadCeldaDuplicarUtilidadesVentas) {
		this.isVisibilidadCeldaDuplicarUtilidadesVentas = isVisibilidadCeldaDuplicarUtilidadesVentas;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarUtilidadesVentas() {
		return isVisibilidadCeldaCopiarUtilidadesVentas;
	}

	public void setIsVisibilidadCeldaCopiarUtilidadesVentas(Boolean isVisibilidadCeldaCopiarUtilidadesVentas) {
		this.isVisibilidadCeldaCopiarUtilidadesVentas = isVisibilidadCeldaCopiarUtilidadesVentas;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormUtilidadesVentas() {
		return isVisibilidadCeldaVerFormUtilidadesVentas;
	}

	public void setIsVisibilidadCeldaVerFormUtilidadesVentas(Boolean isVisibilidadCeldaVerFormUtilidadesVentas) {
		this.isVisibilidadCeldaVerFormUtilidadesVentas = isVisibilidadCeldaVerFormUtilidadesVentas;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenUtilidadesVentas() {
		return isVisibilidadCeldaOrdenUtilidadesVentas;
	}

	public void setIsVisibilidadCeldaOrdenUtilidadesVentas(Boolean isVisibilidadCeldaOrdenUtilidadesVentas) {
		this.isVisibilidadCeldaOrdenUtilidadesVentas = isVisibilidadCeldaOrdenUtilidadesVentas;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesUtilidadesVentas() {
		return isVisibilidadCeldaNuevoRelacionesUtilidadesVentas;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesUtilidadesVentas(Boolean isVisibilidadCeldaNuevoRelacionesUtilidadesVentas) {
		this.isVisibilidadCeldaNuevoRelacionesUtilidadesVentas = isVisibilidadCeldaNuevoRelacionesUtilidadesVentas;
	}
	
	public Boolean getIsVisibilidadCeldaModificarUtilidadesVentas() {
		return isVisibilidadCeldaModificarUtilidadesVentas;
	}

	public void setIsVisibilidadCeldaModificarUtilidadesVentas(Boolean isVisibilidadCeldaModificarUtilidadesVentas) {
		this.isVisibilidadCeldaModificarUtilidadesVentas = isVisibilidadCeldaModificarUtilidadesVentas;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarUtilidadesVentas() {
		return isVisibilidadCeldaActualizarUtilidadesVentas;
	}

	public void setIsVisibilidadCeldaActualizarUtilidadesVentas(Boolean isVisibilidadCeldaActualizarUtilidadesVentas) {
		this.isVisibilidadCeldaActualizarUtilidadesVentas = isVisibilidadCeldaActualizarUtilidadesVentas;
	}

	public Boolean getIsVisibilidadCeldaEliminarUtilidadesVentas() {
		return isVisibilidadCeldaEliminarUtilidadesVentas;
	}

	public void setIsVisibilidadCeldaEliminarUtilidadesVentas(Boolean isVisibilidadCeldaEliminarUtilidadesVentas) {
		this.isVisibilidadCeldaEliminarUtilidadesVentas = isVisibilidadCeldaEliminarUtilidadesVentas;
	}

	public Boolean getIsVisibilidadCeldaCancelarUtilidadesVentas() {
		return isVisibilidadCeldaCancelarUtilidadesVentas;
	}

	public void setIsVisibilidadCeldaCancelarUtilidadesVentas(Boolean isVisibilidadCeldaCancelarUtilidadesVentas) {
		this.isVisibilidadCeldaCancelarUtilidadesVentas = isVisibilidadCeldaCancelarUtilidadesVentas;
	}

	public Boolean getIsVisibilidadCeldaGuardarUtilidadesVentas() {
		return isVisibilidadCeldaGuardarUtilidadesVentas;
	}

	public void setIsVisibilidadCeldaGuardarUtilidadesVentas(Boolean isVisibilidadCeldaGuardarUtilidadesVentas) {
		this.isVisibilidadCeldaGuardarUtilidadesVentas = isVisibilidadCeldaGuardarUtilidadesVentas;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosUtilidadesVentas() {
		return isVisibilidadCeldaGuardarCambiosUtilidadesVentas;
	}

	public void setIsVisibilidadCeldaGuardarCambiosUtilidadesVentas(Boolean isVisibilidadCeldaGuardarCambiosUtilidadesVentas) {
		this.isVisibilidadCeldaGuardarCambiosUtilidadesVentas = isVisibilidadCeldaGuardarCambiosUtilidadesVentas;
	}
		
	public UtilidadesVentasSessionBean getutilidadesventasSessionBean() {
		return this.utilidadesventasSessionBean;
	}
	
	public void setutilidadesventasSessionBean(UtilidadesVentasSessionBean utilidadesventasSessionBean) {
		this.utilidadesventasSessionBean=utilidadesventasSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaUtilidadesVentas() {
		return this.isVisibilidadBusquedaUtilidadesVentas;
	}

	public void setisVisibilidadBusquedaUtilidadesVentas(Boolean isVisibilidadBusquedaUtilidadesVentas) {
		this.isVisibilidadBusquedaUtilidadesVentas=isVisibilidadBusquedaUtilidadesVentas;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(UtilidadesVentas utilidadesventas)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(utilidadesventas,null);
				this.setActualParaGuardarSucursalForeignKey(utilidadesventas,null);
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
	
	public void bugActualizarReferenciaActual(UtilidadesVentas utilidadesventas,UtilidadesVentas utilidadesventasAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalUtilidadesVentas(utilidadesventas);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		utilidadesventasAux.setId(utilidadesventas.getId());
		utilidadesventasAux.setVersionRow(utilidadesventas.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(UtilidadesVentas utilidadesventasLocal) throws Exception {
		
		if(this.utilidadesventasSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(UtilidadesVentas utilidadesventasLocal) throws Exception {	
		if(this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				utilidadesventasLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				utilidadesventasLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarUtilidadesVentasActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.utilidadesventas =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.utilidadesventas =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = utilidadesventasValidator.getInvalidValues(this.utilidadesventas);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(UtilidadesVentas utilidadesventas,List<UtilidadesVentas> utilidadesventass) throws Exception {
	}		
	
	public void actualizarSelectedLista(UtilidadesVentas utilidadesventas,List<UtilidadesVentas> utilidadesventass) throws Exception {
		try	{			
			UtilidadesVentasConstantesFunciones.actualizarSelectedLista(utilidadesventas,utilidadesventass);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<UtilidadesVentas> utilidadesventassLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				utilidadesventassLocal=this.utilidadesventasLogic.getUtilidadesVentass();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				utilidadesventassLocal=this.utilidadesventass;
			}
			//ARCHITECTURE
		
			for(UtilidadesVentas utilidadesventasLocal:utilidadesventassLocal) {
				if(this.permiteMantenimiento(utilidadesventasLocal) && utilidadesventasLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+UtilidadesVentasConstantesFunciones.getUtilidadesVentasLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(UtilidadesVentasConstantesFunciones.NOMBRECOMPLETOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadesVentas.jLabelnombre_completo_clienteUtilidadesVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UtilidadesVentasConstantesFunciones.NOMBRETIPOFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadesVentas.jLabelnombre_tipo_facturaUtilidadesVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UtilidadesVentasConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadesVentas.jLabelfecha_emisionUtilidadesVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UtilidadesVentasConstantesFunciones.NUMERODOCUMENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadesVentas.jLabelnumero_documentoUtilidadesVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UtilidadesVentasConstantesFunciones.TIPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadesVentas.jLabeltipoUtilidadesVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UtilidadesVentasConstantesFunciones.VENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadesVentas.jLabelventaUtilidadesVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UtilidadesVentasConstantesFunciones.COSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadesVentas.jLabelcostoUtilidadesVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UtilidadesVentasConstantesFunciones.UTILIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadesVentas.jLabelutilidadUtilidadesVentas,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(UtilidadesVentasConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadesVentas.jLabelporcentajeUtilidadesVentas,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadesVentas.jLabelnombre_completo_clienteUtilidadesVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadesVentas.jLabelnombre_tipo_facturaUtilidadesVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadesVentas.jLabelfecha_emisionUtilidadesVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadesVentas.jLabelnumero_documentoUtilidadesVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadesVentas.jLabeltipoUtilidadesVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadesVentas.jLabelventaUtilidadesVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadesVentas.jLabelcostoUtilidadesVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadesVentas.jLabelutilidadUtilidadesVentas,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormUtilidadesVentas.jLabelporcentajeUtilidadesVentas,"");
		
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
		this.iIdNuevoUtilidadesVentas--;	
		
		
		this.utilidadesventasAux=new UtilidadesVentas();
		
		this.utilidadesventasAux.setId(this.iIdNuevoUtilidadesVentas);
		this.utilidadesventasAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.utilidadesventasLogic.getUtilidadesVentass().add(this.utilidadesventasAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.utilidadesventass.add(this.utilidadesventasAux);
		}
		//ARCHITECTURE
		
		this.utilidadesventas=this.utilidadesventasAux;
		
		if(UtilidadesVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioUtilidadesVentas(this.utilidadesventas);
			this.setVariablesObjetoActualToFormularioForeignKeyUtilidadesVentas(this.utilidadesventas);
		}
				
		//this.setDefaultControlesUtilidadesVentas();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyUtilidadesVentas();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyUtilidadesVentas();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyUtilidadesVentas();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualUtilidadesVentas(this.utilidadesventasBean,this.utilidadesventas,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanUtilidadesVentas(this.utilidadesventasReturnGeneral,this.utilidadesventasBean,false);
		
		if(this.utilidadesventasReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyUtilidadesVentas(this.utilidadesventasReturnGeneral.getUtilidadesVentas());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioUtilidadesVentas(this.utilidadesventasReturnGeneral.getUtilidadesVentas());
		}
		
		if(this.utilidadesventasReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioUtilidadesVentas(this.utilidadesventasReturnGeneral.getUtilidadesVentas(),classes);//this.utilidadesventasBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.utilidadesventas,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyUtilidadesVentas();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyUtilidadesVentas();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			UtilidadesVentasBeanSwingJInternalFrameAdditional.RecargarFormUtilidadesVentas(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingUtilidadesVentas(false);
						
			if(utilidadesventasSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(UtilidadesVentasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUtilidadesVentas();
			}
			
			this.actualizarVisualTableDatosUtilidadesVentas();
			
			this.jTableDatosUtilidadesVentas.setRowSelectionInterval(this.getIndiceNuevoUtilidadesVentas(), this.getIndiceNuevoUtilidadesVentas());
			
			this.seleccionarFilaTablaUtilidadesVentasActual();
						
			this.actualizarEstadoCeldasBotonesUtilidadesVentas("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesUtilidadesVentas(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormUtilidadesVentas.jDateChooserfecha_emision_desdeUtilidadesVentas.setEnabled(isHabilitar && this.utilidadesventasConstantesFunciones.activarfecha_emision_desdeUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jDateChooserfecha_emision_hastaUtilidadesVentas.setEnabled(isHabilitar && this.utilidadesventasConstantesFunciones.activarfecha_emision_hastaUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jTextAreanombre_completo_clienteUtilidadesVentas.setEnabled(isHabilitar && this.utilidadesventasConstantesFunciones.activarnombre_completo_clienteUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jTextAreanombre_tipo_facturaUtilidadesVentas.setEnabled(isHabilitar && this.utilidadesventasConstantesFunciones.activarnombre_tipo_facturaUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jDateChooserfecha_emisionUtilidadesVentas.setEnabled(isHabilitar && this.utilidadesventasConstantesFunciones.activarfecha_emisionUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldnumero_documentoUtilidadesVentas.setEnabled(isHabilitar && this.utilidadesventasConstantesFunciones.activarnumero_documentoUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldtipoUtilidadesVentas.setEnabled(isHabilitar && this.utilidadesventasConstantesFunciones.activartipoUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldventaUtilidadesVentas.setEnabled(isHabilitar && this.utilidadesventasConstantesFunciones.activarventaUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldcostoUtilidadesVentas.setEnabled(isHabilitar && this.utilidadesventasConstantesFunciones.activarcostoUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldutilidadUtilidadesVentas.setEnabled(isHabilitar && this.utilidadesventasConstantesFunciones.activarutilidadUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldporcentajeUtilidadesVentas.setEnabled(isHabilitar && this.utilidadesventasConstantesFunciones.activarporcentajeUtilidadesVentas);	
		//
		this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_empresaUtilidadesVentas.setEnabled(isHabilitar && this.utilidadesventasConstantesFunciones.activarid_empresaUtilidadesVentas);//
		this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_sucursalUtilidadesVentas.setEnabled(isHabilitar && this.utilidadesventasConstantesFunciones.activarid_sucursalUtilidadesVentas);
	};
	
	public void setDefaultControlesUtilidadesVentas() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoUtilidadesVentas(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.utilidadesventasSessionBean.setConGuardarRelaciones(true);			
			this.utilidadesventasSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormUtilidadesVentas.jTabbedPaneRelacionesUtilidadesVentas.setVisible(true);
			
					
		} else {
			//this.utilidadesventasSessionBean.setConGuardarRelaciones(false);			
			this.utilidadesventasSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormUtilidadesVentas.jTabbedPaneRelacionesUtilidadesVentas.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoUtilidadesVentas() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UtilidadesVentas utilidadesventasAux:this.utilidadesventasLogic.getUtilidadesVentass()) {
				if(utilidadesventasAux.getId().equals(this.iIdNuevoUtilidadesVentas)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UtilidadesVentas utilidadesventasAux:this.utilidadesventass) {
				if(utilidadesventasAux.getId().equals(this.iIdNuevoUtilidadesVentas)) {
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
	
	public int getIndiceActualUtilidadesVentas(UtilidadesVentas utilidadesventas,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UtilidadesVentas utilidadesventasAux:this.utilidadesventasLogic.getUtilidadesVentass()) {
				if(utilidadesventasAux.getId().equals(utilidadesventas.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UtilidadesVentas utilidadesventasAux:this.utilidadesventass) {
				if(utilidadesventasAux.getId().equals(utilidadesventas.getId())) {
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
	
	public void setCamposBaseDesdeOriginalUtilidadesVentas(UtilidadesVentas utilidadesventasOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UtilidadesVentas utilidadesventasAux:this.utilidadesventasLogic.getUtilidadesVentass()) {
				if(utilidadesventasAux.getUtilidadesVentasOriginal().getId().equals(utilidadesventasOriginal.getId())) {
					existe=true;
					utilidadesventasOriginal.setId(utilidadesventasAux.getId());
					utilidadesventasOriginal.setVersionRow(utilidadesventasAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UtilidadesVentas utilidadesventasAux:this.utilidadesventass) {
				if(utilidadesventasAux.getUtilidadesVentasOriginal().getId().equals(utilidadesventasOriginal.getId())) {
					existe=true;
					utilidadesventasOriginal.setId(utilidadesventasAux.getId());
					utilidadesventasOriginal.setVersionRow(utilidadesventasAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosUtilidadesVentas(Boolean esParaCancelar) throws Exception {
		utilidadesventassAux=new ArrayList<UtilidadesVentas>();
		utilidadesventasAux=new UtilidadesVentas();
		
		if(!this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(UtilidadesVentas utilidadesventasAux:this.utilidadesventasLogic.getUtilidadesVentass()) {
					if(utilidadesventasAux.getId()<0) {
						utilidadesventassAux.add(utilidadesventasAux);
					}		
				}
				this.iIdNuevoUtilidadesVentas=0L;
				this.utilidadesventasLogic.getUtilidadesVentass().removeAll(utilidadesventassAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UtilidadesVentas utilidadesventasAux:this.utilidadesventass) {
					if(utilidadesventasAux.getId()<0) {
						utilidadesventassAux.add(utilidadesventasAux);
					}		
				}
				this.iIdNuevoUtilidadesVentas=0L;
				this.utilidadesventass.removeAll(utilidadesventassAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoUtilidadesVentas 
					&& this.utilidadesventasLogic.getUtilidadesVentass().size()>0
					) {
					utilidadesventasAux=this.utilidadesventasLogic.getUtilidadesVentass().get(this.utilidadesventasLogic.getUtilidadesVentass().size() - 1);
				
					if(utilidadesventasAux.getId()<0) {
						this.utilidadesventasLogic.getUtilidadesVentass().remove(utilidadesventasAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoUtilidadesVentas && this.utilidadesventass.size()>0) {
					utilidadesventasAux=this.utilidadesventass.get(this.utilidadesventass.size() - 1);
				
					if(utilidadesventasAux.getId()<0) {
						this.utilidadesventass.remove(utilidadesventasAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoUtilidadesVentas(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(utilidadesventas.getId()<0) {
				this.utilidadesventasLogic.getUtilidadesVentass().remove(this.utilidadesventas);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(utilidadesventas.getId()<0) {
				this.utilidadesventass.remove(this.utilidadesventas);
			}
		}			
	}
	
	public void setEstadosInicialesUtilidadesVentas(List<UtilidadesVentas> utilidadesventassAux) throws Exception {
		UtilidadesVentasConstantesFunciones.setEstadosInicialesUtilidadesVentas(utilidadesventassAux);
	}
	
	public void setEstadosInicialesUtilidadesVentas(UtilidadesVentas utilidadesventasAux) throws Exception {
		UtilidadesVentasConstantesFunciones.setEstadosInicialesUtilidadesVentas(utilidadesventasAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarUtilidadesVentasActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesUtilidadesVentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarUtilidadesVentasActual()) {
				if(!this.isEsNuevoUtilidadesVentas) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesUtilidadesVentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoUtilidadesVentas=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarUtilidadesVentasActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Utilidades Ventas ?", "MANTENIMIENTO DE Utilidades Ventas", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesUtilidadesVentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(UtilidadesVentas utilidadesventas) throws Exception {
		UtilidadesVentasConstantesFunciones.seleccionarAsignar(this.utilidadesventas,utilidadesventas);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarUtilidadesVentas=this.isPermisoActualizarOriginalUtilidadesVentas;
			
			
			this.seleccionarAsignar(utilidadesventas);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesUtilidadesVentas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.utilidadesventasSessionBean.setsFuncionBusquedaRapida(this.utilidadesventasSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoUtilidadesVentas) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosUtilidadesVentas(esParaCancelar);				
				this.cancelarNuevoUtilidadesVentas(esParaCancelar);								
			}
			
			this.utilidadesventas=new UtilidadesVentas();
			
			this.inicializarUtilidadesVentas();
			
			this.actualizarEstadoCeldasBotonesUtilidadesVentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarUtilidadesVentas() throws Exception {
		try {
			UtilidadesVentasConstantesFunciones.inicializarUtilidadesVentas(this.utilidadesventas);
			
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
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.utilidadesventasLogic.getUtilidadesVentass().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteUtilidadesVentass(String sAccionBusqueda,List<UtilidadesVentas> utilidadesventassParaReportes) throws Exception {
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
					sPathReporteFinal="UtilidadesVentas"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="UtilidadesVentasMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("UtilidadesVentasMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="UtilidadesVentas"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Utilidades Ventases");		
		parameters.put("busquedapor", UtilidadesVentasConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceUtilidadesVentas=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			UtilidadesVentasConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			UtilidadesVentasConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceUtilidadesVentas=new JRBeanArrayDataSource(UtilidadesVentasJInternalFrame.TraerUtilidadesVentasBeans(utilidadesventassParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceUtilidadesVentas);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+UtilidadesVentasConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+UtilidadesVentasConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(UtilidadesVentasBean.TraerUtilidadesVentasBeans(utilidadesventassParaReportes).toArray()));
							
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
				this.generarExcelReporteUtilidadesVentass(sAccionBusqueda,sTipoArchivoReporte,utilidadesventassParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalUtilidadesVentass(sAccionBusqueda,sTipoArchivoReporte,utilidadesventassParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoUtilidadesVentasActionPerformed(null);
					//this.generarExcelReporteUtilidadesVentass(sAccionBusqueda,sTipoArchivoReporte,utilidadesventassParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalUtilidadesVentass(sAccionBusqueda,sTipoArchivoReporte,utilidadesventassParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesUtilidadesVentass(sAccionBusqueda,sTipoArchivoReporte,utilidadesventassParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesUtilidadesVentass(sAccionBusqueda,sTipoArchivoReporte,utilidadesventassParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteUtilidadesVentass(String sAccionBusqueda,String sTipoArchivoReporte,List<UtilidadesVentas> utilidadesventassParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"utilidadesventas";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("UtilidadesVentass");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderUtilidadesVentas("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(UtilidadesVentas utilidadesventas : utilidadesventassParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			UtilidadesVentasConstantesFunciones.generarExcelReporteDataUtilidadesVentas("NORMAL",row,workbook,utilidadesventas,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidades Ventas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderUtilidadesVentas(String sTipo,Row row,Workbook workbook) {
		
		UtilidadesVentasConstantesFunciones.generarExcelReporteHeaderUtilidadesVentas(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalUtilidadesVentass(String sAccionBusqueda,String sTipoArchivoReporte,List<UtilidadesVentas> utilidadesventassParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"utilidadesventas_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("UtilidadesVentass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(UtilidadesVentas utilidadesventas : utilidadesventassParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(UtilidadesVentasConstantesFunciones.getUtilidadesVentasDescripcion(utilidadesventas));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadesVentasConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadesventas.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadesVentasConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadesventas.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadesventas.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadesventas.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadesVentasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadesventas.getnombre_completo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadesVentasConstantesFunciones.LABEL_NOMBRETIPOFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_NOMBRETIPOFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadesventas.getnombre_tipo_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadesventas.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadesVentasConstantesFunciones.LABEL_NUMERODOCUMENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_NUMERODOCUMENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadesventas.getnumero_documento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadesVentasConstantesFunciones.LABEL_TIPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_TIPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadesventas.gettipo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadesVentasConstantesFunciones.LABEL_VENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_VENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadesventas.getventa());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadesVentasConstantesFunciones.LABEL_COSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_COSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadesventas.getcosto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadesVentasConstantesFunciones.LABEL_UTILIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_UTILIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadesventas.getutilidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(UtilidadesVentasConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(utilidadesventas.getporcentaje());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidades Ventas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesUtilidadesVentass(String sAccionBusqueda,String sTipoArchivoReporte,List<UtilidadesVentas> utilidadesventassParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<UtilidadesVentas> utilidadesventassRespaldo=null;
		
		classes=UtilidadesVentasConstantesFunciones.getClassesRelationshipsOfUtilidadesVentas(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.utilidadesventasLogic.setDatosCliente(this.datosCliente);
		this.utilidadesventasLogic.setDatosDeep(this.datosDeep);
		this.utilidadesventasLogic.setIsConDeep(true);
		
		utilidadesventassRespaldo=this.utilidadesventasLogic.getUtilidadesVentass();
		
		this.utilidadesventasLogic.setUtilidadesVentass(utilidadesventassParaReportes);	
		this.utilidadesventasLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		utilidadesventassParaReportes=this.utilidadesventasLogic.getUtilidadesVentass();
		this.utilidadesventasLogic.setUtilidadesVentass(utilidadesventassRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"utilidadesventas_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("UtilidadesVentass");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderUtilidadesVentas("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(UtilidadesVentas utilidadesventas : utilidadesventassParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderUtilidadesVentas("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			UtilidadesVentasConstantesFunciones.generarExcelReporteDataUtilidadesVentas("NORMAL",row,workbook,utilidadesventas,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(UtilidadesVentasConstantesFunciones.getUtilidadesVentasDescripcion(utilidadesventas));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidades Ventas",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoUtilidadesVentas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUtilidadesVentas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoUtilidadesVentas.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUtilidadesVentas.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessUtilidadesVentas() throws Exception {		
		this.startProcessUtilidadesVentas(true);
	}
	
	public void startProcessUtilidadesVentas(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasUtilidadesVentas ,this.jPanelParametrosReportesUtilidadesVentas, this.jScrollPanelDatosUtilidadesVentas,this.jPanelPaginacionUtilidadesVentas, this.jScrollPanelDatosEdicionUtilidadesVentas, this.jPanelAccionesUtilidadesVentas,this.jPanelAccionesFormularioUtilidadesVentas,this.jmenuBarUtilidadesVentas,this.jmenuBarDetalleUtilidadesVentas,this.jTtoolBarUtilidadesVentas,this.jTtoolBarDetalleUtilidadesVentas);		
		
		final JTabbedPane jTabbedPaneBusquedasUtilidadesVentas=this.jTabbedPaneBusquedasUtilidadesVentas; 
		
		final JPanel jPanelParametrosReportesUtilidadesVentas=this.jPanelParametrosReportesUtilidadesVentas;
		//final JScrollPane jScrollPanelDatosUtilidadesVentas=this.jScrollPanelDatosUtilidadesVentas;
		final JTable jTableDatosUtilidadesVentas=this.jTableDatosUtilidadesVentas;		
		final JPanel jPanelPaginacionUtilidadesVentas=this.jPanelPaginacionUtilidadesVentas;
		//final JScrollPane jScrollPanelDatosEdicionUtilidadesVentas=this.jScrollPanelDatosEdicionUtilidadesVentas;
		final JPanel jPanelAccionesUtilidadesVentas=this.jPanelAccionesUtilidadesVentas;
		
		JPanel jPanelCamposAuxiliarUtilidadesVentas=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarUtilidadesVentas=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) {
			jPanelCamposAuxiliarUtilidadesVentas=this.jInternalFrameDetalleFormUtilidadesVentas.jPanelCamposUtilidadesVentas;
			jPanelAccionesFormularioAuxiliarUtilidadesVentas=this.jInternalFrameDetalleFormUtilidadesVentas.jPanelAccionesFormularioUtilidadesVentas;
		}
		
		final JPanel jPanelCamposUtilidadesVentas=jPanelCamposAuxiliarUtilidadesVentas;
		final JPanel jPanelAccionesFormularioUtilidadesVentas=jPanelAccionesFormularioAuxiliarUtilidadesVentas;
		
		
		final JMenuBar jmenuBarUtilidadesVentas=this.jmenuBarUtilidadesVentas;
		final JToolBar jTtoolBarUtilidadesVentas=this.jTtoolBarUtilidadesVentas;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarUtilidadesVentas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarUtilidadesVentas=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) {
			jmenuBarDetalleAuxiliarUtilidadesVentas=this.jInternalFrameDetalleFormUtilidadesVentas.jmenuBarDetalleUtilidadesVentas;
			jTtoolBarDetalleAuxiliarUtilidadesVentas=this.jInternalFrameDetalleFormUtilidadesVentas.jTtoolBarDetalleUtilidadesVentas;
		}
		
		final JMenuBar jmenuBarDetalleUtilidadesVentas=jmenuBarDetalleAuxiliarUtilidadesVentas;
		final JToolBar jTtoolBarDetalleUtilidadesVentas=jTtoolBarDetalleAuxiliarUtilidadesVentas;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasUtilidadesVentas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesUtilidadesVentas;
			processRunnable.jTableDatos=jTableDatosUtilidadesVentas;
			processRunnable.jPanelCampos=jPanelCamposUtilidadesVentas;
			processRunnable.jPanelPaginacion=jPanelPaginacionUtilidadesVentas;
			processRunnable.jPanelAcciones=jPanelAccionesUtilidadesVentas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioUtilidadesVentas;
			
			
			processRunnable.jmenuBar=jmenuBarUtilidadesVentas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleUtilidadesVentas;
			processRunnable.jTtoolBar=jTtoolBarUtilidadesVentas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleUtilidadesVentas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasUtilidadesVentas ,jPanelParametrosReportesUtilidadesVentas,jTableDatosUtilidadesVentas, /*jScrollPanelDatosUtilidadesVentas,*/jPanelCamposUtilidadesVentas,jPanelPaginacionUtilidadesVentas, /*jScrollPanelDatosEdicionUtilidadesVentas,*/ jPanelAccionesUtilidadesVentas,jPanelAccionesFormularioUtilidadesVentas,jmenuBarUtilidadesVentas,jmenuBarDetalleUtilidadesVentas,jTtoolBarUtilidadesVentas,jTtoolBarDetalleUtilidadesVentas);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasUtilidadesVentas ,jPanelParametrosReportesUtilidadesVentas, jScrollPanelDatosUtilidadesVentas,jPanelPaginacionUtilidadesVentas, jScrollPanelDatosEdicionUtilidadesVentas, jPanelAccionesUtilidadesVentas,jPanelAccionesFormularioUtilidadesVentas,jmenuBarUtilidadesVentas,jmenuBarDetalleUtilidadesVentas,jTtoolBarUtilidadesVentas,jTtoolBarDetalleUtilidadesVentas);
						
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
	
	public void finishProcessUtilidadesVentas() {// throws Exception 
		this.finishProcessUtilidadesVentas(true);
	}
	
	public void finishProcessUtilidadesVentas(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasUtilidadesVentas ,this.jPanelParametrosReportesUtilidadesVentas, this.jScrollPanelDatosUtilidadesVentas,this.jPanelPaginacionUtilidadesVentas, this.jScrollPanelDatosEdicionUtilidadesVentas, this.jPanelAccionesUtilidadesVentas,this.jPanelAccionesFormularioUtilidadesVentas,this.jmenuBarUtilidadesVentas,this.jmenuBarDetalleUtilidadesVentas,this.jTtoolBarUtilidadesVentas,this.jTtoolBarDetalleUtilidadesVentas);		
		
		final JTabbedPane jTabbedPaneBusquedasUtilidadesVentas=this.jTabbedPaneBusquedasUtilidadesVentas; 
		
		final JPanel jPanelParametrosReportesUtilidadesVentas=this.jPanelParametrosReportesUtilidadesVentas;
		//final JScrollPane jScrollPanelDatosUtilidadesVentas=this.jScrollPanelDatosUtilidadesVentas;
		final JTable jTableDatosUtilidadesVentas=this.jTableDatosUtilidadesVentas;		
		final JPanel jPanelPaginacionUtilidadesVentas=this.jPanelPaginacionUtilidadesVentas;
		//final JScrollPane jScrollPanelDatosEdicionUtilidadesVentas=this.jScrollPanelDatosEdicionUtilidadesVentas;
		final JPanel jPanelAccionesUtilidadesVentas=this.jPanelAccionesUtilidadesVentas;
		
		JPanel jPanelCamposAuxiliarUtilidadesVentas=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarUtilidadesVentas=new JPanel();
		
		if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) {
			jPanelCamposAuxiliarUtilidadesVentas=this.jInternalFrameDetalleFormUtilidadesVentas.jPanelCamposUtilidadesVentas;
			jPanelAccionesFormularioAuxiliarUtilidadesVentas=this.jInternalFrameDetalleFormUtilidadesVentas.jPanelAccionesFormularioUtilidadesVentas;
		}
		
		final JPanel jPanelCamposUtilidadesVentas=jPanelCamposAuxiliarUtilidadesVentas;
		final JPanel jPanelAccionesFormularioUtilidadesVentas=jPanelAccionesFormularioAuxiliarUtilidadesVentas;
		
		
		final JMenuBar jmenuBarUtilidadesVentas=this.jmenuBarUtilidadesVentas;		
		final JToolBar jTtoolBarUtilidadesVentas=this.jTtoolBarUtilidadesVentas;
				
		JMenuBar jmenuBarDetalleAuxiliarUtilidadesVentas=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarUtilidadesVentas=new JToolBar();
		
		if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) {
			jmenuBarDetalleAuxiliarUtilidadesVentas=this.jInternalFrameDetalleFormUtilidadesVentas.jmenuBarDetalleUtilidadesVentas;
			jTtoolBarDetalleAuxiliarUtilidadesVentas=this.jInternalFrameDetalleFormUtilidadesVentas.jTtoolBarDetalleUtilidadesVentas;		
		}
		
		final JMenuBar jmenuBarDetalleUtilidadesVentas=jmenuBarDetalleAuxiliarUtilidadesVentas;
		final JToolBar jTtoolBarDetalleUtilidadesVentas=jTtoolBarDetalleAuxiliarUtilidadesVentas;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasUtilidadesVentas;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesUtilidadesVentas;
			processRunnable.jTableDatos=jTableDatosUtilidadesVentas;
			processRunnable.jPanelCampos=jPanelCamposUtilidadesVentas;
			processRunnable.jPanelPaginacion=jPanelPaginacionUtilidadesVentas;
			processRunnable.jPanelAcciones=jPanelAccionesUtilidadesVentas;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioUtilidadesVentas;
			
			
			processRunnable.jmenuBar=jmenuBarUtilidadesVentas;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleUtilidadesVentas;
			processRunnable.jTtoolBar=jTtoolBarUtilidadesVentas;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleUtilidadesVentas;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasUtilidadesVentas ,jPanelParametrosReportesUtilidadesVentas, jTableDatosUtilidadesVentas,/*jScrollPanelDatosUtilidadesVentas,*/jPanelCamposUtilidadesVentas,jPanelPaginacionUtilidadesVentas, /*jScrollPanelDatosEdicionUtilidadesVentas,*/ jPanelAccionesUtilidadesVentas,jPanelAccionesFormularioUtilidadesVentas,jmenuBarUtilidadesVentas,jmenuBarDetalleUtilidadesVentas,jTtoolBarUtilidadesVentas,jTtoolBarDetalleUtilidadesVentas));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesUtilidadesVentas(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarUtilidadesVentas(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuUtilidadesVentas(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarUtilidadesVentas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarUtilidadesVentas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleUtilidadesVentas,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuUtilidadesVentas(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarUtilidadesVentas,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleUtilidadesVentas,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.utilidadesventasConstantesFunciones.getsFinalQueryUtilidadesVentas();
		String  finalQueryPaginacionTodos=this.utilidadesventasConstantesFunciones.getsFinalQueryUtilidadesVentas();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=UtilidadesVentasConstantesFunciones.getArrayColumnasGlobalesNoUtilidadesVentas(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=UtilidadesVentasConstantesFunciones.getArrayColumnasGlobalesUtilidadesVentas(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,UtilidadesVentasConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.utilidadesventassEliminados= new ArrayList<UtilidadesVentas>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessUtilidadesVentas();
		
				///*UtilidadesVentasSessionBean*/this.utilidadesventasSessionBean=new UtilidadesVentasSessionBean();
			
			if(this.utilidadesventasSessionBean==null) {
				this.utilidadesventasSessionBean=new UtilidadesVentasSessionBean();
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
					this.iNumeroPaginacion=UtilidadesVentasConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=UtilidadesVentasConstantesFunciones.getClassesForeignKeysOfUtilidadesVentas(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/utilidadesventas."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			utilidadesventassAux= new ArrayList<UtilidadesVentas>();
			
				
			utilidadesventasLogic.setDatosCliente(this.datosCliente);
			utilidadesventasLogic.setDatosDeep(this.datosDeep);
			utilidadesventasLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaUtilidadesVentas")) {
				this.sDetalleReporte=UtilidadesVentasConstantesFunciones.getDetalleIndiceBusquedaUtilidadesVentas(fecha_emision_desdeBusquedaUtilidadesVentas,fecha_emision_hastaBusquedaUtilidadesVentas);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					utilidadesventasLogic.getUtilidadesVentassBusquedaUtilidadesVentas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_emision_desdeBusquedaUtilidadesVentas,fecha_emision_hastaBusquedaUtilidadesVentas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UtilidadesVentasConstantesFunciones.getDetalleIndiceBusquedaUtilidadesVentas(fecha_emision_desdeBusquedaUtilidadesVentas,fecha_emision_hastaBusquedaUtilidadesVentas);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UtilidadesVentasConstantesFunciones.getDetalleIndiceBusquedaUtilidadesVentas(fecha_emision_desdeBusquedaUtilidadesVentas,fecha_emision_hastaBusquedaUtilidadesVentas);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=utilidadesventasLogic.getUtilidadesVentass()==null||utilidadesventasLogic.getUtilidadesVentass().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=utilidadesventass==null|| utilidadesventass.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadesventassAux=new ArrayList<UtilidadesVentas>();
						utilidadesventassAux.addAll(utilidadesventasLogic.getUtilidadesVentass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadesventassAux=new ArrayList<UtilidadesVentas>();
							utilidadesventassAux.addAll(utilidadesventass);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							utilidadesventasLogic.getUtilidadesVentassBusquedaUtilidadesVentas(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_emision_desdeBusquedaUtilidadesVentas,fecha_emision_hastaBusquedaUtilidadesVentas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=UtilidadesVentasConstantesFunciones.getDetalleIndiceBusquedaUtilidadesVentas(fecha_emision_desdeBusquedaUtilidadesVentas,fecha_emision_hastaBusquedaUtilidadesVentas);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=UtilidadesVentasConstantesFunciones.getDetalleIndiceBusquedaUtilidadesVentas(fecha_emision_desdeBusquedaUtilidadesVentas,fecha_emision_hastaBusquedaUtilidadesVentas);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteUtilidadesVentass("BusquedaUtilidadesVentas",utilidadesventasLogic.getUtilidadesVentass());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteUtilidadesVentass("BusquedaUtilidadesVentas",utilidadesventass);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadesventasLogic.setUtilidadesVentass(new ArrayList<UtilidadesVentas>());
						utilidadesventasLogic.getUtilidadesVentass().addAll(utilidadesventassAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadesventass=new ArrayList<UtilidadesVentas>();
							utilidadesventass.addAll(utilidadesventassAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesUtilidadesVentas();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessUtilidadesVentas();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=utilidadesventasLogic.getUtilidadesVentass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=utilidadesventass.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=utilidadesventasLogic.getUtilidadesVentass().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=utilidadesventass.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(UtilidadesVentas utilidadesventas) {
		Boolean permite=true;
		
		if(this.utilidadesventas.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=UtilidadesVentasConstantesFunciones.getOrderByListaUtilidadesVentas();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=UtilidadesVentasConstantesFunciones.getOrderByListaUtilidadesVentas();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UtilidadesVentas utilidadesventas:utilidadesventasLogic.getUtilidadesVentass()) {
				if(utilidadesventas.getsType().equals(Constantes2.S_TOTALES)) {
					utilidadesventasTotales=utilidadesventas;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UtilidadesVentas utilidadesventas:this.utilidadesventass) {
				if(utilidadesventas.getsType().equals(Constantes2.S_TOTALES)) {
					utilidadesventasTotales=utilidadesventas;
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
			this.utilidadesventasAux=new UtilidadesVentas();
			this.utilidadesventasAux.setsType(Constantes2.S_TOTALES);
			this.utilidadesventasAux.setIsNew(false);
			this.utilidadesventasAux.setIsChanged(false);
			this.utilidadesventasAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//UtilidadesVentasConstantesFunciones.TotalizarValoresFilaUtilidadesVentas(this.utilidadesventasLogic.getUtilidadesVentass(),this.utilidadesventasAux);
				
				//this.utilidadesventasLogic.getUtilidadesVentass().add(this.utilidadesventasAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				UtilidadesVentasConstantesFunciones.TotalizarValoresFilaUtilidadesVentas(this.utilidadesventass,this.utilidadesventasAux);
				
				this.utilidadesventass.add(this.utilidadesventasAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		utilidadesventasTotales=new UtilidadesVentas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.utilidadesventasLogic.getUtilidadesVentass().remove(utilidadesventasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.utilidadesventass.remove(utilidadesventasTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		utilidadesventasTotales=new UtilidadesVentas();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(UtilidadesVentas utilidadesventas:utilidadesventasLogic.getUtilidadesVentass()) {
				if(utilidadesventas.getsType().equals(Constantes2.S_TOTALES)) {
					utilidadesventasTotales=utilidadesventas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				UtilidadesVentasConstantesFunciones.TotalizarValoresFilaUtilidadesVentas(this.utilidadesventasLogic.getUtilidadesVentass(),utilidadesventasTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(UtilidadesVentas utilidadesventas:this.utilidadesventass) {
				if(utilidadesventas.getsType().equals(Constantes2.S_TOTALES)) {
					utilidadesventasTotales=utilidadesventas;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				UtilidadesVentasConstantesFunciones.TotalizarValoresFilaUtilidadesVentas(this.utilidadesventass,utilidadesventasTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getUtilidadesVentassBusquedaUtilidadesVentas()throws Exception {
		try {
			sAccionBusqueda="BusquedaUtilidadesVentas";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getUtilidadesVentassFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getUtilidadesVentassFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getUtilidadesVentassBusquedaUtilidadesVentas(String sFinalQuery,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//utilidadesventasLogic.getUtilidadesVentassBusquedaUtilidadesVentas(sFinalQuery,this.pagination,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getUtilidadesVentassFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//utilidadesventasLogic.getUtilidadesVentassFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getUtilidadesVentassFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//utilidadesventasLogic.getUtilidadesVentassFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosUtilidadesVentas() {
		this.isPermisoTodoUtilidadesVentas=false;
		this.isPermisoNuevoUtilidadesVentas=false;
		this.isPermisoActualizarUtilidadesVentas=false;
		this.isPermisoActualizarOriginalUtilidadesVentas=false;
		this.isPermisoEliminarUtilidadesVentas=false;
		this.isPermisoGuardarCambiosUtilidadesVentas=false;
		this.isPermisoConsultaUtilidadesVentas=true;
		this.isPermisoBusquedaUtilidadesVentas=true;
		this.isPermisoReporteUtilidadesVentas=true;
		this.isPermisoOrdenUtilidadesVentas=false;		
		this.isPermisoPaginacionMedioUtilidadesVentas=false;		
		this.isPermisoPaginacionAltoUtilidadesVentas=false;		
		this.isPermisoPaginacionTodoUtilidadesVentas=false;		
		this.isPermisoCopiarUtilidadesVentas=false;		
		this.isPermisoVerFormUtilidadesVentas=false;		
		this.isPermisoDuplicarUtilidadesVentas=false;
		this.isPermisoOrdenUtilidadesVentas=false;
	}
	
	public void setPermisosUsuarioUtilidadesVentas(Boolean isPermiso) {
		this.isPermisoTodoUtilidadesVentas=isPermiso;
		this.isPermisoNuevoUtilidadesVentas=isPermiso;
		this.isPermisoActualizarUtilidadesVentas=isPermiso;
		this.isPermisoActualizarOriginalUtilidadesVentas=isPermiso;
		this.isPermisoEliminarUtilidadesVentas=isPermiso;
		this.isPermisoGuardarCambiosUtilidadesVentas=isPermiso;
		this.isPermisoConsultaUtilidadesVentas=isPermiso;
		this.isPermisoBusquedaUtilidadesVentas=isPermiso;
		this.isPermisoReporteUtilidadesVentas=isPermiso;
		this.isPermisoOrdenUtilidadesVentas=isPermiso;		
		this.isPermisoPaginacionMedioUtilidadesVentas=isPermiso;		
		this.isPermisoPaginacionAltoUtilidadesVentas=isPermiso;		
		this.isPermisoPaginacionTodoUtilidadesVentas=isPermiso;		
		this.isPermisoCopiarUtilidadesVentas=isPermiso;		
		this.isPermisoVerFormUtilidadesVentas=isPermiso;		
		this.isPermisoDuplicarUtilidadesVentas=isPermiso;
		this.isPermisoOrdenUtilidadesVentas=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioUtilidadesVentas(Boolean isPermiso) {
		//this.isPermisoTodoUtilidadesVentas=isPermiso;
		this.isPermisoNuevoUtilidadesVentas=isPermiso;
		this.isPermisoActualizarUtilidadesVentas=isPermiso;
		this.isPermisoActualizarOriginalUtilidadesVentas=isPermiso;
		this.isPermisoEliminarUtilidadesVentas=isPermiso;
		this.isPermisoGuardarCambiosUtilidadesVentas=isPermiso;
		//this.isPermisoConsultaUtilidadesVentas=isPermiso;
		//this.isPermisoBusquedaUtilidadesVentas=isPermiso;
		//this.isPermisoReporteUtilidadesVentas=isPermiso;
		//this.isPermisoOrdenUtilidadesVentas=isPermiso;		
		//this.isPermisoPaginacionMedioUtilidadesVentas=isPermiso;		
		//this.isPermisoPaginacionAltoUtilidadesVentas=isPermiso;		
		//this.isPermisoPaginacionTodoUtilidadesVentas=isPermiso;		
		//this.isPermisoCopiarUtilidadesVentas=isPermiso;		
		//this.isPermisoDuplicarUtilidadesVentas=isPermiso;
		//this.isPermisoOrdenUtilidadesVentas=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioUtilidadesVentasClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(UtilidadesVentasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebUtilidadesVentas(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioUtilidadesVentasClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioUtilidadesVentasClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionUtilidadesVentasClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioUtilidadesVentasClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioUtilidadesVentas() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(UtilidadesVentasJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, UtilidadesVentasConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoUtilidadesVentas=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarUtilidadesVentas=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalUtilidadesVentas=this.isPermisoActualizarUtilidadesVentas;
			this.isPermisoEliminarUtilidadesVentas=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosUtilidadesVentas=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaUtilidadesVentas=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaUtilidadesVentas=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoUtilidadesVentas=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteUtilidadesVentas=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenUtilidadesVentas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioUtilidadesVentas=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoUtilidadesVentas=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoUtilidadesVentas=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarUtilidadesVentas=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormUtilidadesVentas=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarUtilidadesVentas=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenUtilidadesVentas=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosUtilidadesVentas.setToolTipText(this.jTableDatosUtilidadesVentas.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioUtilidadesVentas(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioUtilidadesVentas(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(UtilidadesVentasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(UtilidadesVentasJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioUtilidadesVentas() throws Exception {
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
	public void inicializarCombosForeignKeyUtilidadesVentasListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyUtilidadesVentasListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(UtilidadesVentasJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyUtilidadesVentas()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.utilidadesventasSessionBean==null) {
				this.utilidadesventasSessionBean=new UtilidadesVentasSessionBean();
			}

			if(!this.utilidadesventasSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.utilidadesventasSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyUtilidadesVentas()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyUtilidadesVentas(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyUtilidadesVentas()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyUtilidadesVentas();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyUtilidadesVentas(UtilidadesVentas utilidadesventas)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyUtilidadesVentas(UtilidadesVentas utilidadesventas,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyUtilidadesVentas()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyUtilidadesVentas()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyUtilidadesVentas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyUtilidadesVentas()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroUtilidadesVentas()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyUtilidadesVentas()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyUtilidadesVentas(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyUtilidadesVentas()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_empresaUtilidadesVentas!=null && this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_empresaUtilidadesVentas.getItemCount()>0) {
				this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_empresaUtilidadesVentas.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_sucursalUtilidadesVentas!=null && this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_sucursalUtilidadesVentas.getItemCount()>0) {
				this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_sucursalUtilidadesVentas.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public UtilidadesVentasBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public UtilidadesVentasBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public UtilidadesVentasBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.utilidadesventasSessionBean=new UtilidadesVentasSessionBean(); 
		this.utilidadesventasConstantesFunciones=new UtilidadesVentasConstantesFunciones(); 
		this.utilidadesventasBean=new UtilidadesVentas();//(this.utilidadesventasConstantesFunciones); 		
		this.utilidadesventasReturnGeneral=new UtilidadesVentasParameterReturnGeneral(); 
		
		this.utilidadesventasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.utilidadesventasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public UtilidadesVentasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public UtilidadesVentasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public UtilidadesVentasBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessUtilidadesVentas(true);
			
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
			
			this.utilidadesventasConstantesFunciones=new UtilidadesVentasConstantesFunciones(); 
			this.utilidadesventasBean=new UtilidadesVentas();//this.utilidadesventasConstantesFunciones); 			
			this.utilidadesventasReturnGeneral=new UtilidadesVentasParameterReturnGeneral(); 
		
			UtilidadesVentasBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Utilidades Ventas Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.utilidadesventas=new UtilidadesVentas();
			this.utilidadesventass = new ArrayList<UtilidadesVentas>();
			this.utilidadesventassAux = new ArrayList<UtilidadesVentas>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic=new UtilidadesVentasLogic();
				this.utilidadesventasLogic.getNewConnexionToDeep("");
			}
			
			//this.utilidadesventasSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.utilidadesventasSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormUtilidadesVentas);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoUtilidadesVentas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoUtilidadesVentas);	
					}
					
					if(this.jInternalFrameImportacionUtilidadesVentas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionUtilidadesVentas);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByUtilidadesVentas!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByUtilidadesVentas);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormUtilidadesVentas);
				this.jInternalFrameDetalleFormUtilidadesVentas.setVisible(false);
				this.jInternalFrameDetalleFormUtilidadesVentas.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoUtilidadesVentas!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoUtilidadesVentas);
					this.jInternalFrameReporteDinamicoUtilidadesVentas.setVisible(false);
					this.jInternalFrameReporteDinamicoUtilidadesVentas.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionUtilidadesVentas!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionUtilidadesVentas);
					this.jInternalFrameImportacionUtilidadesVentas.setVisible(false);
					this.jInternalFrameImportacionUtilidadesVentas.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByUtilidadesVentas!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByUtilidadesVentas);
					this.jInternalFrameOrderByUtilidadesVentas.setVisible(false);
					this.jInternalFrameOrderByUtilidadesVentas.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idUtilidadesVentasActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=UtilidadesVentasConstantesFunciones.INUMEROPAGINACION;
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
			
			this.utilidadesventasReturnGeneral=new UtilidadesVentasParameterReturnGeneral();
			
			this.utilidadesventasParameterGeneral=new UtilidadesVentasParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.utilidadesventasLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {
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
			
			if(UtilidadesVentasJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,UtilidadesVentasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.utilidadesventasSessionBean.getEsGuardarRelacionado(),this.utilidadesventasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,UtilidadesVentasConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.utilidadesventasSessionBean.getEsGuardarRelacionado(),this.utilidadesventasSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoUtilidadesVentas=false;
			this.isVisibilidadCeldaDuplicarUtilidadesVentas=true;
			this.isVisibilidadCeldaCopiarUtilidadesVentas=true;
			this.isVisibilidadCeldaVerFormUtilidadesVentas=true;
			this.isVisibilidadCeldaOrdenUtilidadesVentas=true;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadesVentas=false;
			this.isVisibilidadCeldaModificarUtilidadesVentas=false;
			this.isVisibilidadCeldaActualizarUtilidadesVentas=false;
			this.isVisibilidadCeldaEliminarUtilidadesVentas=false;
			this.isVisibilidadCeldaCancelarUtilidadesVentas=false;
			this.isVisibilidadCeldaGuardarUtilidadesVentas=false;
			this.isVisibilidadCeldaGuardarCambiosUtilidadesVentas=false;
			
			
			this.isVisibilidadBusquedaUtilidadesVentas=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesUtilidadesVentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosUtilidadesVentas();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioUtilidadesVentas(false);
			
			this.setPermisosUsuarioUtilidadesVentas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.utilidadesventasSessionBean.getEsGuardarRelacionado() 
				|| (this.utilidadesventasSessionBean.getEsGuardarRelacionado() && this.utilidadesventasSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioUtilidadesVentasClasesRelacionadas();
			}
			
			if(this.utilidadesventasSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioUtilidadesVentasClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!UtilidadesVentasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosUtilidadesVentas();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualUtilidadesVentas();
			}
			
			if(!this.isPermisoBusquedaUtilidadesVentas) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasUtilidadesVentas.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(UtilidadesVentasConstantesFunciones.getTiposSeleccionarUtilidadesVentas());
				
				this.tiposColumnasSelect=UtilidadesVentasConstantesFunciones.getTiposSeleccionarUtilidadesVentas(true);
				
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
			//if(!this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioUtilidadesVentas();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioUtilidadesVentas(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioUtilidadesVentas(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesUtilidadesVentas() ;
			
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
			this.sucursalLogic=new SucursalLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				utilidadesventasImplementable= (UtilidadesVentasImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+UtilidadesVentasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				utilidadesventasImplementableHome= (UtilidadesVentasImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+UtilidadesVentasConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.utilidadesventass= new ArrayList<UtilidadesVentas>();
			this.utilidadesventassEliminados= new ArrayList<UtilidadesVentas>();
						
			this.isEsNuevoUtilidadesVentas=false;
			this.esParaAccionDesdeFormularioUtilidadesVentas=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyUtilidadesVentas(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroUtilidadesVentas();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			UtilidadesVentasBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=UtilidadesVentasConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesUtilidadesVentas("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingUtilidadesVentas(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioUtilidadesVentas();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioUtilidadesVentas();
			}
			
			UtilidadesVentasBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasUtilidadesVentas.getTabCount(); i++) {
					this.jTabbedPaneBusquedasUtilidadesVentas.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasUtilidadesVentas.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessUtilidadesVentas(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga UtilidadesVentas: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectUtilidadesVentas() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesUtilidadesVentas")) {
				iIndex=this.jInternalFrameDetalleFormUtilidadesVentas.jTabbedPaneRelacionesUtilidadesVentas.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormUtilidadesVentas.jTabbedPaneRelacionesUtilidadesVentas.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessUtilidadesVentas();	
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
	
	public void cargarCombosForeignKeyUtilidadesVentas(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyUtilidadesVentas(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyUtilidadesVentas(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyUtilidadesVentasListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyUtilidadesVentas();
		
		this.cargarCombosFrameForeignKeyUtilidadesVentas();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyUtilidadesVentas();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyUtilidadesVentas();
		}
	}
	
	
	
	public void jButtonNuevoUtilidadesVentasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.utilidadesventasSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormUtilidadesVentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
			
			
			if(jTableDatosUtilidadesVentas.getRowCount()>=1) {
				jTableDatosUtilidadesVentas.removeRowSelectionInterval(0, jTableDatosUtilidadesVentas.getRowCount()-1);						
			}
			
			this.isEsNuevoUtilidadesVentas=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoUtilidadesVentas(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesUtilidadesVentas(true);			
			//this.utilidadesventas=new UtilidadesVentas();
			//this.utilidadesventas.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUtilidadesVentas(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUtilidadesVentas() ;
			
			if(UtilidadesVentasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUtilidadesVentas(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.utilidadesventas);	
			this.actualizarInformacion("INFO_PADRE",false,this.utilidadesventas);				
			
			UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
			
			if(this.utilidadesventasSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar UtilidadesVentas: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarUtilidadesVentasActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<UtilidadesVentas> utilidadesventassSeleccionados=new ArrayList<UtilidadesVentas>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosUtilidadesVentas.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosUtilidadesVentas.getSelectedRows().length;			
			}
			
			utilidadesventassSeleccionados=this.getUtilidadesVentassSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoUtilidadesVentas--;			
				//UtilidadesVentas utilidadesventasAux= new UtilidadesVentas();			
				//utilidadesventasAux.setId(this.iIdNuevoUtilidadesVentas);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//UtilidadesVentas utilidadesventasOrigen=new UtilidadesVentas();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(UtilidadesVentas utilidadesventasOrigen : utilidadesventassSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							utilidadesventasOrigen =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							utilidadesventasOrigen =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaUtilidadesVentas();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.utilidadesventas.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosUtilidadesVentas(utilidadesventasOrigen,this.utilidadesventas,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.utilidadesventasLogic.getUtilidadesVentass().add(this.utilidadesventasAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.utilidadesventass.add(this.utilidadesventasAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaUtilidadesVentas(false);
				
				this.jTableDatosUtilidadesVentas.setRowSelectionInterval(this.getIndiceNuevoUtilidadesVentas(), this.getIndiceNuevoUtilidadesVentas());
				
				int iLastRow =  this.jTableDatosUtilidadesVentas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosUtilidadesVentas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosUtilidadesVentas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaUtilidadesVentas(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarUtilidadesVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<UtilidadesVentas> utilidadesventassSeleccionados=new ArrayList<UtilidadesVentas>();									
		
			UtilidadesVentas utilidadesventasOrigen=new UtilidadesVentas();
			UtilidadesVentas utilidadesventasDestino=new UtilidadesVentas();
				
			utilidadesventassSeleccionados=this.getUtilidadesVentassSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosUtilidadesVentas.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || utilidadesventassSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosUtilidadesVentas.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadesventasOrigen =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						utilidadesventasOrigen =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						utilidadesventasDestino =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						utilidadesventasDestino =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				utilidadesventasOrigen =utilidadesventassSeleccionados.get(0);
				utilidadesventasDestino =utilidadesventassSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosUtilidadesVentas(utilidadesventasOrigen,utilidadesventasDestino,true,false);
				
				utilidadesventasDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(utilidadesventasDestino,utilidadesventasLogic.getUtilidadesVentass());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(utilidadesventasDestino,utilidadesventass);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaUtilidadesVentas(false);
				
				//this.jTableDatosUtilidadesVentas.setRowSelectionInterval(this.getIndiceNuevoUtilidadesVentas(), this.getIndiceNuevoUtilidadesVentas());
				
				int iLastRow =  this.jTableDatosUtilidadesVentas.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosUtilidadesVentas.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosUtilidadesVentas.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaUtilidadesVentas(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormUtilidadesVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormUtilidadesVentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormUtilidadesVentas.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarUtilidadesVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesUtilidadesVentas.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasUtilidadesVentas.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesUtilidadesVentas.setVisible(!isVisible);
			this.jPanelPaginacionUtilidadesVentas.setVisible(!isVisible);
			this.jPanelAccionesUtilidadesVentas.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarUtilidadesVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameUtilidadesVentas();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoUtilidadesVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoUtilidadesVentas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionUtilidadesVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionUtilidadesVentas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByUtilidadesVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByUtilidadesVentas();
			
			this.abrirFrameOrderByUtilidadesVentas();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByUtilidadesVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByUtilidadesVentas();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleUtilidadesVentas(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormUtilidadesVentas);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormUtilidadesVentas.isMaximum()) {
					this.jInternalFrameDetalleFormUtilidadesVentas.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormUtilidadesVentas.setSize(this.jInternalFrameDetalleFormUtilidadesVentas.iWidthFormulario,this.jInternalFrameDetalleFormUtilidadesVentas.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormUtilidadesVentas.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormUtilidadesVentas.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormUtilidadesVentas.isMaximum()) {
						this.jInternalFrameDetalleFormUtilidadesVentas.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormUtilidadesVentas.jContentPaneDetalleUtilidadesVentas.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormUtilidadesVentas.jTabbedPaneRelacionesUtilidadesVentas.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormUtilidadesVentas.jContentPaneDetalleUtilidadesVentas.getWidth(),UtilidadesVentasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormUtilidadesVentas.jTabbedPaneRelacionesUtilidadesVentas.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormUtilidadesVentas.jContentPaneDetalleUtilidadesVentas.getWidth(),UtilidadesVentasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormUtilidadesVentas.jTabbedPaneRelacionesUtilidadesVentas.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormUtilidadesVentas.jContentPaneDetalleUtilidadesVentas.getWidth(),UtilidadesVentasConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormUtilidadesVentas.setVisible(true);
	        this.jInternalFrameDetalleFormUtilidadesVentas.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByUtilidadesVentas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByUtilidadesVentas==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByUtilidadesVentas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUtilidadesVentas,false,this);
				} else {
					this.jInternalFrameOrderByUtilidadesVentas=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByUtilidadesVentas,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByUtilidadesVentas);
				this.jInternalFrameOrderByUtilidadesVentas.setVisible(false);
				this.jInternalFrameOrderByUtilidadesVentas.setSelected(false);
				
				this.jInternalFrameOrderByUtilidadesVentas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByUtilidadesVentas"));
				
				this.inicializarActualizarBindingTablaOrderByUtilidadesVentas();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionUtilidadesVentas() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionUtilidadesVentas==null) {
				
				this.jInternalFrameImportacionUtilidadesVentas=new ImportacionJInternalFrame(UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionUtilidadesVentas);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionUtilidadesVentas);
				this.jInternalFrameImportacionUtilidadesVentas.setVisible(false);
				this.jInternalFrameImportacionUtilidadesVentas.setSelected(false);


				this.jInternalFrameImportacionUtilidadesVentas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionUtilidadesVentas"));
				this.jInternalFrameImportacionUtilidadesVentas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionUtilidadesVentas"));
				this.jInternalFrameImportacionUtilidadesVentas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionUtilidadesVentas"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoUtilidadesVentas() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoUtilidadesVentas==null) {
				this.jInternalFrameReporteDinamicoUtilidadesVentas=new ReporteDinamicoJInternalFrame(UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoUtilidadesVentas);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoUtilidadesVentas);
				this.jInternalFrameReporteDinamicoUtilidadesVentas.setVisible(false);
				this.jInternalFrameReporteDinamicoUtilidadesVentas.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoUtilidadesVentas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUtilidadesVentas"));
				this.jInternalFrameReporteDinamicoUtilidadesVentas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUtilidadesVentas"));
				this.jInternalFrameReporteDinamicoUtilidadesVentas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUtilidadesVentas"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUtilidadesVentas();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleUtilidadesVentas() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormUtilidadesVentas);
			
	       	this.jInternalFrameDetalleFormUtilidadesVentas.setVisible(false);
	        this.jInternalFrameDetalleFormUtilidadesVentas.setSelected(false);
			
			//this.jInternalFrameDetalleFormUtilidadesVentas.dispose();
			//this.jInternalFrameDetalleFormUtilidadesVentas=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoUtilidadesVentas() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoUtilidadesVentas.setVisible(true);
	        this.jInternalFrameReporteDinamicoUtilidadesVentas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionUtilidadesVentas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionUtilidadesVentas.setVisible(true);
	        this.jInternalFrameImportacionUtilidadesVentas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByUtilidadesVentas() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByUtilidadesVentas.setVisible(true);
	        this.jInternalFrameOrderByUtilidadesVentas.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByUtilidadesVentas() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByUtilidadesVentas.setVisible(false);
	        this.jInternalFrameOrderByUtilidadesVentas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoUtilidadesVentas() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoUtilidadesVentas.setVisible(false);
	        this.jInternalFrameReporteDinamicoUtilidadesVentas.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionUtilidadesVentas() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionUtilidadesVentas.setVisible(false);
	        this.jInternalFrameImportacionUtilidadesVentas.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarUtilidadesVentasActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarUtilidadesVentas(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarUtilidadesVentas(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesUtilidadesVentas(true);
			//this.isEsNuevoUtilidadesVentas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventas =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.utilidadesventas =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesUtilidadesVentas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUtilidadesVentas(false) ;
			
			if(utilidadesventasSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(UtilidadesVentasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUtilidadesVentas(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUtilidadesVentas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaUtilidadesVentasActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventas =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadesventas =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarUtilidadesVentas(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormUtilidadesVentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesUtilidadesVentas(true);
			//this.isEsNuevoUtilidadesVentas=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventas =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.utilidadesventas =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.utilidadesventas.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesUtilidadesVentas("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesUtilidadesVentas(false) ;
			
			if(UtilidadesVentasJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleUtilidadesVentas(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUtilidadesVentas(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	
	public void jButtonActualizarUtilidadesVentasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesUtilidadesVentas(false);
			
			//if(!this.isEsNuevoUtilidadesVentas) {								
				int intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventas =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.utilidadesventas =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(UtilidadesVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.utilidadesventas,true);
				this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
				
			}
			
			if(this.permiteMantenimiento(this.utilidadesventas)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoUtilidadesVentas=true;
					this.inicializarActualizarBindingTablaUtilidadesVentas(false);
					this.isEsNuevoUtilidadesVentas=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoUtilidadesVentas=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoUtilidadesVentas=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesUtilidadesVentas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUtilidadesVentas(false);
				
				this.habilitarDeshabilitarControlesUtilidadesVentas(false);
			
												
				
				if(UtilidadesVentasJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleUtilidadesVentas();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoUtilidadesVentasActionPerformed(evt,utilidadesventasSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualUtilidadesVentas(this.utilidadesventas,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosUtilidadesVentas.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,utilidadesventasSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.utilidadesventas.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(UtilidadesVentas.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadesVentas.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarUtilidadesVentasActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventas =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
				this.utilidadesventas.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.utilidadesventas =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
				this.utilidadesventas.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.utilidadesventas)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((UtilidadesVentasModel) this.jTableDatosUtilidadesVentas.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoUtilidadesVentas=true;
				this.inicializarActualizarBindingTablaUtilidadesVentas(false);
				this.isEsNuevoUtilidadesVentas=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesUtilidadesVentas(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUtilidadesVentas(false);
				
				this.habilitarDeshabilitarControlesUtilidadesVentas(false);
				
				
				
				if(UtilidadesVentasJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleUtilidadesVentas();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarUtilidadesVentasActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosUtilidadesVentas.getRowCount()>=1) {
				jTableDatosUtilidadesVentas.removeRowSelectionInterval(0, jTableDatosUtilidadesVentas.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesUtilidadesVentas(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaUtilidadesVentas(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesUtilidadesVentas(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualUtilidadesVentas(false) ;
			
			this.isEsNuevoUtilidadesVentas=false;
			
			if(UtilidadesVentasJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleUtilidadesVentas();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosUtilidadesVentasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingUtilidadesVentas(false);
				
				//SI ES MANUAL
				if(UtilidadesVentasJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualUtilidadesVentas();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosUtilidadesVentasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoUtilidadesVentas--;			
			//UtilidadesVentas utilidadesventasAux= new UtilidadesVentas();			
			//utilidadesventasAux.setId(this.iIdNuevoUtilidadesVentas);
			
			if(this.jInternalFrameDetalleFormUtilidadesVentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaUtilidadesVentas();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
			
			this.utilidadesventas.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.utilidadesventasLogic.getUtilidadesVentass().add(this.utilidadesventasAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.utilidadesventass.add(this.utilidadesventasAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaUtilidadesVentas(false);
			
			this.jTableDatosUtilidadesVentas.setRowSelectionInterval(this.getIndiceNuevoUtilidadesVentas(), this.getIndiceNuevoUtilidadesVentas());
			
			int iLastRow =  this.jTableDatosUtilidadesVentas.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosUtilidadesVentas.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosUtilidadesVentas.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaUtilidadesVentas(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionUtilidadesVentasActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingUtilidadesVentas(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUtilidadesVentas(false);
			
			//SI ES MANUAL
			if(UtilidadesVentasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUtilidadesVentas();
			}
			
			//this.abrirFrameTreeUtilidadesVentas();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionUtilidadesVentasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionUtilidadesVentasActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionUtilidadesVentas.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionUtilidadesVentas.setFileImportacion(this.jInternalFrameImportacionUtilidadesVentas.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionUtilidadesVentas.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionUtilidadesVentas.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionUtilidadesVentas.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionUtilidadesVentas.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoUtilidadesVentasActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<UtilidadesVentas> utilidadesventassSeleccionados=new ArrayList<UtilidadesVentas>();		

		utilidadesventassSeleccionados=this.getUtilidadesVentassSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUtilidadesVentas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUtilidadesVentas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("UtilidadesVentasBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"UtilidadesVentasBaseDesign.jrxml";
			
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
			
			this.generarReporteUtilidadesVentass("Todos",utilidadesventassSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidades Ventas",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoUtilidadesVentas.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUtilidadesVentas.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case UtilidadesVentasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompletoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompletoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompletoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompletoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UtilidadesVentasConstantesFunciones.LABEL_NOMBRETIPOFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreTipoFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreTipoFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreTipoFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreTipoFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UtilidadesVentasConstantesFunciones.LABEL_NUMERODOCUMENTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroDocumento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroDocumento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroDocumento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroDocumento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UtilidadesVentasConstantesFunciones.LABEL_TIPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_po_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_po_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_po_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_po_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UtilidadesVentasConstantesFunciones.LABEL_VENTA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UtilidadesVentasConstantesFunciones.LABEL_COSTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UtilidadesVentasConstantesFunciones.LABEL_UTILIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ilidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ilidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ilidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ilidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case UtilidadesVentasConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoUtilidadesVentas.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoUtilidadesVentas.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoUtilidadesVentas.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case UtilidadesVentasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoria="nombre_completo_cliente";
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_NOMBRETIPOFACTURA:
					sNombreCampoCategoria="nombre_tipo_factura";
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_NUMERODOCUMENTO:
					sNombreCampoCategoria="numero_documento";
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_TIPO:
					sNombreCampoCategoria="tipo";
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_VENTA:
					sNombreCampoCategoria="venta";
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoria="costo";
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_UTILIDAD:
					sNombreCampoCategoria="utilidad";
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoUtilidadesVentas.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case UtilidadesVentasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					sNombreCampoCategoriaValor="nombre_completo_cliente";
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_NOMBRETIPOFACTURA:
					sNombreCampoCategoriaValor="nombre_tipo_factura";
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_NUMERODOCUMENTO:
					sNombreCampoCategoriaValor="numero_documento";
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_TIPO:
					sNombreCampoCategoriaValor="tipo";
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_VENTA:
					sNombreCampoCategoriaValor="venta";
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_COSTO:
					sNombreCampoCategoriaValor="costo";
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_UTILIDAD:
					sNombreCampoCategoriaValor="utilidad";
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoUtilidadesVentas.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoUtilidadesVentas.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case UtilidadesVentasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo_cliente");
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_NOMBRETIPOFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Tipo Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_tipo_factura");
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_NUMERODOCUMENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Documento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_documento");
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_TIPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tipo");
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_VENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Venta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"venta");
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_COSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo");
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_UTILIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Utilad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"utilidad");
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
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
	
	public void jButtonGenerarExcelReporteDinamicoUtilidadesVentasActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<UtilidadesVentas> utilidadesventassSeleccionados=new ArrayList<UtilidadesVentas>();		
		
		utilidadesventassSeleccionados=this.getUtilidadesVentassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"utilidadesventas";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("UtilidadesVentass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoUtilidadesVentas.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoUtilidadesVentas.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case UtilidadesVentasConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(UtilidadesVentas utilidadesventas:utilidadesventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadesventas.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(UtilidadesVentas utilidadesventas:utilidadesventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadesventas.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(UtilidadesVentas utilidadesventas:utilidadesventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadesventas.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(UtilidadesVentas utilidadesventas:utilidadesventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadesventas.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
					iRow++;

					for(UtilidadesVentas utilidadesventas:utilidadesventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadesventas.getnombre_completo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_NOMBRETIPOFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_NOMBRETIPOFACTURA);
					iRow++;

					for(UtilidadesVentas utilidadesventas:utilidadesventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadesventas.getnombre_tipo_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(UtilidadesVentas utilidadesventas:utilidadesventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadesventas.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_NUMERODOCUMENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_NUMERODOCUMENTO);
					iRow++;

					for(UtilidadesVentas utilidadesventas:utilidadesventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadesventas.getnumero_documento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_TIPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_TIPO);
					iRow++;

					for(UtilidadesVentas utilidadesventas:utilidadesventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadesventas.gettipo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_VENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_VENTA);
					iRow++;

					for(UtilidadesVentas utilidadesventas:utilidadesventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadesventas.getventa());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_COSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_COSTO);
					iRow++;

					for(UtilidadesVentas utilidadesventas:utilidadesventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadesventas.getcosto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_UTILIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_UTILIDAD);
					iRow++;

					for(UtilidadesVentas utilidadesventas:utilidadesventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadesventas.getutilidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case UtilidadesVentasConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(UtilidadesVentas utilidadesventas:utilidadesventassSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(utilidadesventas.getporcentaje());
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
			//	this.getFilaCabeceraExportarExcelUtilidadesVentas(row);				
			//	iRow++;
			//}				
			
			//for(UtilidadesVentas utilidadesventasAux:utilidadesventassSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelUtilidadesVentas(utilidadesventasAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidades Ventas",JOptionPane.INFORMATION_MESSAGE);
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
				this.utilidadesventasLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUtilidadesVentas(false);
			
			//SI ES MANUAL
			if(UtilidadesVentasJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualUtilidadesVentas();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresUtilidadesVentasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUtilidadesVentas(false);
			
			//SI ES MANUAL
			if(UtilidadesVentasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualUtilidadesVentas();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesUtilidadesVentasActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingUtilidadesVentas(false);
			
			//SI ES MANUAL
			if(UtilidadesVentasJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualUtilidadesVentas();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaUtilidadesVentas() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosUtilidadesVentas.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosUtilidadesVentas.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosUtilidadesVentas.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosUtilidadesVentas.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosUtilidadesVentas.setMinimumSize(dimensionMinimum);
		this.jTableDatosUtilidadesVentas.setMaximumSize(dimensionMaximum);
		this.jTableDatosUtilidadesVentas.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingUtilidadesVentas(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingUtilidadesVentas(esInicializar,true);
	}
	
	public void inicializarActualizarBindingUtilidadesVentas(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaUtilidadesVentas(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesUtilidadesVentas(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasUtilidadesVentas(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesUtilidadesVentas(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesUtilidadesVentas(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !UtilidadesVentasJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!UtilidadesVentasJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualUtilidadesVentas() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaUtilidadesVentas();
		
		this.inicializarActualizarBindingBotonesManualUtilidadesVentas(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualUtilidadesVentas();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesUtilidadesVentas() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualUtilidadesVentas(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualUtilidadesVentas(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosUtilidadesVentas.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosUtilidadesVentas.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteUtilidadesVentas.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormUtilidadesVentas.jCheckBoxPostAccionNuevoUtilidadesVentas.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormUtilidadesVentas.jCheckBoxPostAccionSinCerrarUtilidadesVentas.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormUtilidadesVentas.jCheckBoxPostAccionSinMensajeUtilidadesVentas.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosUtilidadesVentas.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosUtilidadesVentas.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteUtilidadesVentas.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) {
				this.jInternalFrameDetalleFormUtilidadesVentas.jCheckBoxPostAccionNuevoUtilidadesVentas.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormUtilidadesVentas.jCheckBoxPostAccionSinCerrarUtilidadesVentas.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormUtilidadesVentas.jCheckBoxPostAccionSinMensajeUtilidadesVentas.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionUtilidadesVentas.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionUtilidadesVentas.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxTiposAccionesFormularioUtilidadesVentas.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesUtilidadesVentas.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoUtilidadesVentas!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUtilidadesVentas.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesUtilidadesVentas.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesUtilidadesVentas.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarUtilidadesVentas.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesUtilidadesVentas.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoUtilidadesVentas!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoUtilidadesVentas.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesUtilidadesVentas.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralUtilidadesVentas.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesUtilidadesVentas(Boolean esInicializar) throws Exception {
		try	{	
			if(UtilidadesVentasJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualUtilidadesVentas(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesUtilidadesVentas() throws Exception {
		try	{
			if(UtilidadesVentasJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualUtilidadesVentas();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleUtilidadesVentas() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxTiposAccionesFormularioUtilidadesVentas.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxTiposAccionesFormularioUtilidadesVentas.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualUtilidadesVentas() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesUtilidadesVentas.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesUtilidadesVentas.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesUtilidadesVentas.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesUtilidadesVentas.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesUtilidadesVentas.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesUtilidadesVentas.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionUtilidadesVentas.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionUtilidadesVentas.addItem(reporte);
			}
			
			
			if(!this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionUtilidadesVentas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionUtilidadesVentas.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesUtilidadesVentas.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesUtilidadesVentas.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesUtilidadesVentas.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesUtilidadesVentas.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxTiposAccionesFormularioUtilidadesVentas.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxTiposAccionesFormularioUtilidadesVentas.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarUtilidadesVentas.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarUtilidadesVentas.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarUtilidadesVentas.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUtilidadesVentas();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualUtilidadesVentas() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoUtilidadesVentas!=null) {
				this.jInternalFrameReporteDinamicoUtilidadesVentas.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoUtilidadesVentas.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoUtilidadesVentas!=null) {
				this.jInternalFrameReporteDinamicoUtilidadesVentas.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoUtilidadesVentas.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoUtilidadesVentas!=null) {
				
				if(this.jInternalFrameReporteDinamicoUtilidadesVentas.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoUtilidadesVentas.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoUtilidadesVentas.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoUtilidadesVentas.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoUtilidadesVentas.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoUtilidadesVentas.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoUtilidadesVentas.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoUtilidadesVentas.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=UtilidadesVentasConstantesFunciones.getTiposSeleccionarUtilidadesVentas(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoUtilidadesVentas.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoUtilidadesVentas.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoUtilidadesVentas.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=UtilidadesVentasConstantesFunciones.getTiposSeleccionarUtilidadesVentas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoUtilidadesVentas.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoUtilidadesVentas.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoUtilidadesVentas.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=UtilidadesVentasConstantesFunciones.getTiposSeleccionarUtilidadesVentas(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoUtilidadesVentas.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoUtilidadesVentas.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoUtilidadesVentas.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoUtilidadesVentas.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualUtilidadesVentas()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_emision_desdeBusquedaUtilidadesVentas=new Date(this.jDateChooserfecha_emision_desdeBusquedaUtilidadesVentasUtilidadesVentas.getDate().getTime());
		this.fecha_emision_hastaBusquedaUtilidadesVentas=new Date(this.jDateChooserfecha_emision_hastaBusquedaUtilidadesVentasUtilidadesVentas.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasUtilidadesVentas(Boolean esInicializar) throws Exception {				
		if(UtilidadesVentasJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualUtilidadesVentas();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaUtilidadesVentas() throws Exception {
		this.inicializarActualizarBindingTablaUtilidadesVentas(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByUtilidadesVentas() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByUtilidadesVentas.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByUtilidadesVentas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUtilidadesVentas.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new UtilidadesVentasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByUtilidadesVentas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUtilidadesVentas.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new UtilidadesVentasPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosUtilidadesVentasOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadesVentasOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new UtilidadesVentasPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByUtilidadesVentas.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByUtilidadesVentas.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new UtilidadesVentasPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByUtilidadesVentas.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaUtilidadesVentas(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=utilidadesventasLogic.getUtilidadesVentass().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=utilidadesventass.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(UtilidadesVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosUtilidadesVentas.setModel(new UtilidadesVentasModel(this.utilidadesventasLogic.getUtilidadesVentass(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosUtilidadesVentas.setModel(new UtilidadesVentasModel(this.utilidadesventass,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByUtilidadesVentas!=null && this.jInternalFrameOrderByUtilidadesVentas.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByUtilidadesVentas();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosUtilidadesVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadesVentas,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new UtilidadesVentasPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO,utilidadesventasConstantesFunciones.resaltarSeleccionarUtilidadesVentas,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+UtilidadesVentasConstantesFunciones.SCLASSWEBTITULO,utilidadesventasConstantesFunciones.resaltarSeleccionarUtilidadesVentas,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosUtilidadesVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadesVentas,UtilidadesVentasConstantesFunciones.LABEL_ID));

		if(this.utilidadesventasConstantesFunciones.mostraridUtilidadesVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadesVentasConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.utilidadesventasConstantesFunciones.resaltaridUtilidadesVentas,this.utilidadesventasConstantesFunciones.activaridUtilidadesVentas,iSizeTabla,this,true,"idUtilidadesVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.utilidadesventasConstantesFunciones.resaltaridUtilidadesVentas,this.utilidadesventasConstantesFunciones.activaridUtilidadesVentas,this,true,"idUtilidadesVentas","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadesVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadesVentas,UtilidadesVentasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE));

		if(this.utilidadesventasConstantesFunciones.mostrarnombre_completo_clienteUtilidadesVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadesVentasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.utilidadesventasConstantesFunciones.resaltarnombre_completo_clienteUtilidadesVentas,this.utilidadesventasConstantesFunciones.activarnombre_completo_clienteUtilidadesVentas,iSizeTabla,this,true,"nombre_completo_clienteUtilidadesVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.utilidadesventasConstantesFunciones.resaltarnombre_completo_clienteUtilidadesVentas,this.utilidadesventasConstantesFunciones.activarnombre_completo_clienteUtilidadesVentas,this,true,"nombre_completo_clienteUtilidadesVentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UtilidadesVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadesVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadesVentas,UtilidadesVentasConstantesFunciones.LABEL_NOMBRETIPOFACTURA));

		if(this.utilidadesventasConstantesFunciones.mostrarnombre_tipo_facturaUtilidadesVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadesVentasConstantesFunciones.LABEL_NOMBRETIPOFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.utilidadesventasConstantesFunciones.resaltarnombre_tipo_facturaUtilidadesVentas,this.utilidadesventasConstantesFunciones.activarnombre_tipo_facturaUtilidadesVentas,iSizeTabla,this,true,"nombre_tipo_facturaUtilidadesVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.utilidadesventasConstantesFunciones.resaltarnombre_tipo_facturaUtilidadesVentas,this.utilidadesventasConstantesFunciones.activarnombre_tipo_facturaUtilidadesVentas,this,true,"nombre_tipo_facturaUtilidadesVentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UtilidadesVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadesVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadesVentas,UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISION));

		if(this.utilidadesventasConstantesFunciones.mostrarfecha_emisionUtilidadesVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.utilidadesventasConstantesFunciones.resaltarfecha_emisionUtilidadesVentas,this.utilidadesventasConstantesFunciones.activarfecha_emisionUtilidadesVentas,iSizeTabla,this,true,"fecha_emisionUtilidadesVentas","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.utilidadesventasConstantesFunciones.resaltarfecha_emisionUtilidadesVentas,this.utilidadesventasConstantesFunciones.activarfecha_emisionUtilidadesVentas,this,true,"fecha_emisionUtilidadesVentas","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new UtilidadesVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadesVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadesVentas,UtilidadesVentasConstantesFunciones.LABEL_NUMERODOCUMENTO));

		if(this.utilidadesventasConstantesFunciones.mostrarnumero_documentoUtilidadesVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadesVentasConstantesFunciones.LABEL_NUMERODOCUMENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.utilidadesventasConstantesFunciones.resaltarnumero_documentoUtilidadesVentas,this.utilidadesventasConstantesFunciones.activarnumero_documentoUtilidadesVentas,iSizeTabla,this,true,"numero_documentoUtilidadesVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.utilidadesventasConstantesFunciones.resaltarnumero_documentoUtilidadesVentas,this.utilidadesventasConstantesFunciones.activarnumero_documentoUtilidadesVentas,this,true,"numero_documentoUtilidadesVentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UtilidadesVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadesVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadesVentas,UtilidadesVentasConstantesFunciones.LABEL_TIPO));

		if(this.utilidadesventasConstantesFunciones.mostrartipoUtilidadesVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadesVentasConstantesFunciones.LABEL_TIPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.utilidadesventasConstantesFunciones.resaltartipoUtilidadesVentas,this.utilidadesventasConstantesFunciones.activartipoUtilidadesVentas,iSizeTabla,this,true,"tipoUtilidadesVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.utilidadesventasConstantesFunciones.resaltartipoUtilidadesVentas,this.utilidadesventasConstantesFunciones.activartipoUtilidadesVentas,this,true,"tipoUtilidadesVentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new UtilidadesVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadesVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadesVentas,UtilidadesVentasConstantesFunciones.LABEL_VENTA));

		if(this.utilidadesventasConstantesFunciones.mostrarventaUtilidadesVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadesVentasConstantesFunciones.LABEL_VENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.utilidadesventasConstantesFunciones.resaltarventaUtilidadesVentas,this.utilidadesventasConstantesFunciones.activarventaUtilidadesVentas,iSizeTabla,this,true,"ventaUtilidadesVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.utilidadesventasConstantesFunciones.resaltarventaUtilidadesVentas,this.utilidadesventasConstantesFunciones.activarventaUtilidadesVentas,this,true,"ventaUtilidadesVentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new UtilidadesVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadesVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadesVentas,UtilidadesVentasConstantesFunciones.LABEL_COSTO));

		if(this.utilidadesventasConstantesFunciones.mostrarcostoUtilidadesVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadesVentasConstantesFunciones.LABEL_COSTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.utilidadesventasConstantesFunciones.resaltarcostoUtilidadesVentas,this.utilidadesventasConstantesFunciones.activarcostoUtilidadesVentas,iSizeTabla,this,true,"costoUtilidadesVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.utilidadesventasConstantesFunciones.resaltarcostoUtilidadesVentas,this.utilidadesventasConstantesFunciones.activarcostoUtilidadesVentas,this,true,"costoUtilidadesVentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new UtilidadesVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadesVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadesVentas,UtilidadesVentasConstantesFunciones.LABEL_UTILIDAD));

		if(this.utilidadesventasConstantesFunciones.mostrarutilidadUtilidadesVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadesVentasConstantesFunciones.LABEL_UTILIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.utilidadesventasConstantesFunciones.resaltarutilidadUtilidadesVentas,this.utilidadesventasConstantesFunciones.activarutilidadUtilidadesVentas,iSizeTabla,this,true,"utilidadUtilidadesVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.utilidadesventasConstantesFunciones.resaltarutilidadUtilidadesVentas,this.utilidadesventasConstantesFunciones.activarutilidadUtilidadesVentas,this,true,"utilidadUtilidadesVentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new UtilidadesVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosUtilidadesVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosUtilidadesVentas,UtilidadesVentasConstantesFunciones.LABEL_PORCENTAJE));

		if(this.utilidadesventasConstantesFunciones.mostrarporcentajeUtilidadesVentas && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,UtilidadesVentasConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.utilidadesventasConstantesFunciones.resaltarporcentajeUtilidadesVentas,this.utilidadesventasConstantesFunciones.activarporcentajeUtilidadesVentas,iSizeTabla,this,true,"porcentajeUtilidadesVentas","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.utilidadesventasConstantesFunciones.resaltarporcentajeUtilidadesVentas,this.utilidadesventasConstantesFunciones.activarporcentajeUtilidadesVentas,this,true,"porcentajeUtilidadesVentas","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new UtilidadesVentasPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.utilidadesventasSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.utilidadesventasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.utilidadesventasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosUtilidadesVentas.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.utilidadesventasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.utilidadesventasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosUtilidadesVentas.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarUtilidadesVentas && this.isPermisoGuardarCambiosUtilidadesVentas) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.utilidadesventasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.utilidadesventasSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosUtilidadesVentas.addColumn(tableColumn);
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
			
			this.jTableDatosUtilidadesVentas.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarUtilidadesVentas && this.isPermisoGuardarCambiosUtilidadesVentas) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarUtilidadesVentas && this.isPermisoGuardarCambiosUtilidadesVentas) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosUtilidadesVentas.moveColumn(this.jTableDatosUtilidadesVentas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosUtilidadesVentas.moveColumn(this.jTableDatosUtilidadesVentas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosUtilidadesVentas.moveColumn(this.jTableDatosUtilidadesVentas.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosUtilidadesVentas.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosUtilidadesVentas.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosUtilidadesVentas,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!UtilidadesVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosUtilidadesVentas.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosUtilidadesVentas.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!UtilidadesVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!UtilidadesVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosUtilidadesVentas.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosUtilidadesVentas.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosUtilidadesVentas.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=utilidadesventasLogic.getUtilidadesVentass().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=utilidadesventass.size()-1;
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
		//this.jTableDatosUtilidadesVentas.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosUtilidadesVentas.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosUtilidadesVentas();
			
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
				
				//this.isEsNuevoUtilidadesVentas=false;
					
				UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
			
				if(this.utilidadesventasSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormUtilidadesVentas==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosUtilidadesVentas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosUtilidadesVentas.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventas =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadesventas =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.utilidadesventas.getsType().equals("DUPLICADO")
				   || this.utilidadesventas.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoUtilidadesVentas=true;
				
				} else {
					this.isEsNuevoUtilidadesVentas=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {
					if(this.utilidadesventas.getId()>=0 && !this.utilidadesventas.getIsNew()) {						
						this.isEsNuevoUtilidadesVentas=false;
						
					} else {
						this.isEsNuevoUtilidadesVentas=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoUtilidadesVentas(esRelaciones);						
				
				this.seleccionarUtilidadesVentas(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.utilidadesventas.getId()<0) {
					this.isEsNuevoUtilidadesVentas=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarUtilidadesVentas(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarUtilidadesVentas(evt,rowIndex);
				}	
				
				if(this.utilidadesventasSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion UtilidadesVentas: " + this.dDif); 
					}
				}								
				
				UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarUtilidadesVentas(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.utilidadesventas)) {
					if(this.utilidadesventas.getId()>0) {
						this.utilidadesventas.setIsDeleted(true);
						
						this.utilidadesventassEliminados.add(this.utilidadesventas);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.utilidadesventasLogic.getUtilidadesVentass().remove(this.utilidadesventas);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.utilidadesventass.remove(this.utilidadesventas);				
					}
					
					
					((UtilidadesVentasModel) this.jTableDatosUtilidadesVentas.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaUtilidadesVentas(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarUtilidadesVentas(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoUtilidadesVentas) {
			
			if(this.jInternalFrameDetalleFormUtilidadesVentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosUtilidadesVentas.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosUtilidadesVentas.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventas =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadesventas =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(UtilidadesVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioUtilidadesVentas(this.utilidadesventas);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesUtilidadesVentas("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesUtilidadesVentas(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualUtilidadesVentas() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoUtilidadesVentas(UtilidadesVentas utilidadesventas) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoUtilidadesVentas(utilidadesventas,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoUtilidadesVentas(UtilidadesVentas utilidadesventas,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioUtilidadesVentas(utilidadesventas);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyUtilidadesVentas(utilidadesventas,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyUtilidadesVentas(utilidadesventas);
	}
	
	public void setVariablesObjetoActualToFormularioUtilidadesVentas(UtilidadesVentas utilidadesventas) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormUtilidadesVentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormUtilidadesVentas.jLabelidUtilidadesVentas.setText(utilidadesventas.getId().toString());
			this.jInternalFrameDetalleFormUtilidadesVentas.jTextAreanombre_completo_clienteUtilidadesVentas.setText(utilidadesventas.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormUtilidadesVentas.jTextAreanombre_tipo_facturaUtilidadesVentas.setText(utilidadesventas.getnombre_tipo_factura());
			this.jInternalFrameDetalleFormUtilidadesVentas.jDateChooserfecha_emisionUtilidadesVentas.setDate(utilidadesventas.getfecha_emision());
			this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldnumero_documentoUtilidadesVentas.setText(utilidadesventas.getnumero_documento());
			this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldtipoUtilidadesVentas.setText(utilidadesventas.gettipo());
			this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldventaUtilidadesVentas.setText(utilidadesventas.getventa().toString());
			this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldcostoUtilidadesVentas.setText(utilidadesventas.getcosto().toString());
			this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldutilidadUtilidadesVentas.setText(utilidadesventas.getutilidad().toString());
			this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldporcentajeUtilidadesVentas.setText(utilidadesventas.getporcentaje().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,UtilidadesVentas utilidadesventasLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,utilidadesventasLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,UtilidadesVentas utilidadesventasLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				utilidadesventasLocal=this.utilidadesventas;
			} else {
				utilidadesventasLocal=this.utilidadesventasAnterior;
			}
		}
		
		if(this.permiteMantenimiento(utilidadesventasLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoUtilidadesVentas(utilidadesventasLocal,true);
					
					if(utilidadesventasSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(utilidadesventasLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(utilidadesventasLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoUtilidadesVentas(UtilidadesVentas utilidadesventas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualUtilidadesVentas(utilidadesventas,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(utilidadesventas);
	}
	
	public void setVariablesFormularioToObjetoActualUtilidadesVentas(UtilidadesVentas utilidadesventas,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualUtilidadesVentas(utilidadesventas,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualUtilidadesVentas(UtilidadesVentas utilidadesventas,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormUtilidadesVentas==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormUtilidadesVentas.jLabelidUtilidadesVentas.getText()==null || this.jInternalFrameDetalleFormUtilidadesVentas.jLabelidUtilidadesVentas.getText()=="" || this.jInternalFrameDetalleFormUtilidadesVentas.jLabelidUtilidadesVentas.getText()=="Id") {
				this.jInternalFrameDetalleFormUtilidadesVentas.jLabelidUtilidadesVentas.setText("0");
			}

			if(conColumnasBase) {utilidadesventas.setId(Long.parseLong(this.jInternalFrameDetalleFormUtilidadesVentas.jLabelidUtilidadesVentas.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UtilidadesVentasConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadesVentas.jLabelIdUtilidadesVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			utilidadesventas.setnombre_completo_cliente(this.jInternalFrameDetalleFormUtilidadesVentas.jTextAreanombre_completo_clienteUtilidadesVentas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UtilidadesVentasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadesVentas.jLabelnombre_completo_clienteUtilidadesVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			utilidadesventas.setnombre_tipo_factura(this.jInternalFrameDetalleFormUtilidadesVentas.jTextAreanombre_tipo_facturaUtilidadesVentas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UtilidadesVentasConstantesFunciones.LABEL_NOMBRETIPOFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadesVentas.jLabelnombre_tipo_facturaUtilidadesVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			utilidadesventas.setfecha_emision(this.jInternalFrameDetalleFormUtilidadesVentas.jDateChooserfecha_emisionUtilidadesVentas.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadesVentas.jLabelfecha_emisionUtilidadesVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			utilidadesventas.setnumero_documento(this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldnumero_documentoUtilidadesVentas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UtilidadesVentasConstantesFunciones.LABEL_NUMERODOCUMENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadesVentas.jLabelnumero_documentoUtilidadesVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			utilidadesventas.settipo(this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldtipoUtilidadesVentas.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UtilidadesVentasConstantesFunciones.LABEL_TIPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadesVentas.jLabeltipoUtilidadesVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			utilidadesventas.setventa(Double.parseDouble(this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldventaUtilidadesVentas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UtilidadesVentasConstantesFunciones.LABEL_VENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadesVentas.jLabelventaUtilidadesVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			utilidadesventas.setcosto(Double.parseDouble(this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldcostoUtilidadesVentas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UtilidadesVentasConstantesFunciones.LABEL_COSTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadesVentas.jLabelcostoUtilidadesVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			utilidadesventas.setutilidad(Double.parseDouble(this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldutilidadUtilidadesVentas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UtilidadesVentasConstantesFunciones.LABEL_UTILIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadesVentas.jLabelutilidadUtilidadesVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			utilidadesventas.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldporcentajeUtilidadesVentas.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+UtilidadesVentasConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormUtilidadesVentas.jLabelporcentajeUtilidadesVentas,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualUtilidadesVentas(UtilidadesVentas utilidadesventasBean,UtilidadesVentas utilidadesventas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosUtilidadesVentas(UtilidadesVentas utilidadesventasOrigen,UtilidadesVentas utilidadesventas,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && utilidadesventasOrigen.getId()!=null && !utilidadesventasOrigen.getId().equals(0L))) {utilidadesventas.setId(utilidadesventasOrigen.getId());}}
			if(conDefault || (!conDefault && utilidadesventasOrigen.getfecha_emision_desde()!=null && !utilidadesventasOrigen.getfecha_emision_desde().equals(new Date()))) {utilidadesventas.setfecha_emision_desde(utilidadesventasOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && utilidadesventasOrigen.getfecha_emision_hasta()!=null && !utilidadesventasOrigen.getfecha_emision_hasta().equals(new Date()))) {utilidadesventas.setfecha_emision_hasta(utilidadesventasOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && utilidadesventasOrigen.getnombre_completo_cliente()!=null && !utilidadesventasOrigen.getnombre_completo_cliente().equals(""))) {utilidadesventas.setnombre_completo_cliente(utilidadesventasOrigen.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && utilidadesventasOrigen.getnombre_tipo_factura()!=null && !utilidadesventasOrigen.getnombre_tipo_factura().equals(""))) {utilidadesventas.setnombre_tipo_factura(utilidadesventasOrigen.getnombre_tipo_factura());}
			if(conDefault || (!conDefault && utilidadesventasOrigen.getfecha_emision()!=null && !utilidadesventasOrigen.getfecha_emision().equals(new Date()))) {utilidadesventas.setfecha_emision(utilidadesventasOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && utilidadesventasOrigen.getnumero_documento()!=null && !utilidadesventasOrigen.getnumero_documento().equals(""))) {utilidadesventas.setnumero_documento(utilidadesventasOrigen.getnumero_documento());}
			if(conDefault || (!conDefault && utilidadesventasOrigen.gettipo()!=null && !utilidadesventasOrigen.gettipo().equals(""))) {utilidadesventas.settipo(utilidadesventasOrigen.gettipo());}
			if(conDefault || (!conDefault && utilidadesventasOrigen.getventa()!=null && !utilidadesventasOrigen.getventa().equals(0.0))) {utilidadesventas.setventa(utilidadesventasOrigen.getventa());}
			if(conDefault || (!conDefault && utilidadesventasOrigen.getcosto()!=null && !utilidadesventasOrigen.getcosto().equals(0.0))) {utilidadesventas.setcosto(utilidadesventasOrigen.getcosto());}
			if(conDefault || (!conDefault && utilidadesventasOrigen.getutilidad()!=null && !utilidadesventasOrigen.getutilidad().equals(0.0))) {utilidadesventas.setutilidad(utilidadesventasOrigen.getutilidad());}
			if(conDefault || (!conDefault && utilidadesventasOrigen.getporcentaje()!=null && !utilidadesventasOrigen.getporcentaje().equals(0.0))) {utilidadesventas.setporcentaje(utilidadesventasOrigen.getporcentaje());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioUtilidadesVentas(UtilidadesVentas utilidadesventas) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormUtilidadesVentas.jLabelidUtilidadesVentas.setText(utilidadesventas.getId().toString());
			this.jInternalFrameDetalleFormUtilidadesVentas.jTextAreanombre_completo_clienteUtilidadesVentas.setText(utilidadesventas.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormUtilidadesVentas.jTextAreanombre_tipo_facturaUtilidadesVentas.setText(utilidadesventas.getnombre_tipo_factura());
			this.jInternalFrameDetalleFormUtilidadesVentas.jDateChooserfecha_emisionUtilidadesVentas.setDate(utilidadesventas.getfecha_emision());
			this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldnumero_documentoUtilidadesVentas.setText(utilidadesventas.getnumero_documento());
			this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldtipoUtilidadesVentas.setText(utilidadesventas.gettipo());
			this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldventaUtilidadesVentas.setText(utilidadesventas.getventa().toString());
			this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldcostoUtilidadesVentas.setText(utilidadesventas.getcosto().toString());
			this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldutilidadUtilidadesVentas.setText(utilidadesventas.getutilidad().toString());
			this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldporcentajeUtilidadesVentas.setText(utilidadesventas.getporcentaje().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioUtilidadesVentas(UtilidadesVentasBean utilidadesventasBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormUtilidadesVentas.jLabelidUtilidadesVentas.setText(utilidadesventasBean.getId().toString());
			this.jInternalFrameDetalleFormUtilidadesVentas.jTextAreanombre_completo_clienteUtilidadesVentas.setText(utilidadesventasBean.getnombre_completo_cliente());
			this.jInternalFrameDetalleFormUtilidadesVentas.jTextAreanombre_tipo_facturaUtilidadesVentas.setText(utilidadesventasBean.getnombre_tipo_factura());
			this.jInternalFrameDetalleFormUtilidadesVentas.jDateChooserfecha_emisionUtilidadesVentas.setDate(utilidadesventasBean.getfecha_emision());
			this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldnumero_documentoUtilidadesVentas.setText(utilidadesventasBean.getnumero_documento());
			this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldtipoUtilidadesVentas.setText(utilidadesventasBean.gettipo());
			this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldventaUtilidadesVentas.setText(utilidadesventasBean.getventa().toString());
			this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldcostoUtilidadesVentas.setText(utilidadesventasBean.getcosto().toString());
			this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldutilidadUtilidadesVentas.setText(utilidadesventasBean.getutilidad().toString());
			this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldporcentajeUtilidadesVentas.setText(utilidadesventasBean.getporcentaje().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanUtilidadesVentas(UtilidadesVentasParameterReturnGeneral utilidadesventasReturnGeneral,UtilidadesVentasBean utilidadesventasBean,Boolean conDefault) throws Exception { 
		try {
			UtilidadesVentas utilidadesventasLocal=new UtilidadesVentas();
			
			utilidadesventasLocal=utilidadesventasReturnGeneral.getUtilidadesVentas();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && utilidadesventasLocal.getId()!=null && !utilidadesventasLocal.getId().equals(0L))) {utilidadesventasBean.setId(utilidadesventasLocal.getId());}}
			if(conDefault || (!conDefault && utilidadesventasLocal.getnombre_completo_cliente()!=null && !utilidadesventasLocal.getnombre_completo_cliente().equals(""))) {utilidadesventasBean.setnombre_completo_cliente(utilidadesventasLocal.getnombre_completo_cliente());}
			if(conDefault || (!conDefault && utilidadesventasLocal.getnombre_tipo_factura()!=null && !utilidadesventasLocal.getnombre_tipo_factura().equals(""))) {utilidadesventasBean.setnombre_tipo_factura(utilidadesventasLocal.getnombre_tipo_factura());}
			if(conDefault || (!conDefault && utilidadesventasLocal.getfecha_emision()!=null && !utilidadesventasLocal.getfecha_emision().equals(new Date()))) {utilidadesventasBean.setfecha_emision(utilidadesventasLocal.getfecha_emision());}
			if(conDefault || (!conDefault && utilidadesventasLocal.getnumero_documento()!=null && !utilidadesventasLocal.getnumero_documento().equals(""))) {utilidadesventasBean.setnumero_documento(utilidadesventasLocal.getnumero_documento());}
			if(conDefault || (!conDefault && utilidadesventasLocal.gettipo()!=null && !utilidadesventasLocal.gettipo().equals(""))) {utilidadesventasBean.settipo(utilidadesventasLocal.gettipo());}
			if(conDefault || (!conDefault && utilidadesventasLocal.getventa()!=null && !utilidadesventasLocal.getventa().equals(0.0))) {utilidadesventasBean.setventa(utilidadesventasLocal.getventa());}
			if(conDefault || (!conDefault && utilidadesventasLocal.getcosto()!=null && !utilidadesventasLocal.getcosto().equals(0.0))) {utilidadesventasBean.setcosto(utilidadesventasLocal.getcosto());}
			if(conDefault || (!conDefault && utilidadesventasLocal.getutilidad()!=null && !utilidadesventasLocal.getutilidad().equals(0.0))) {utilidadesventasBean.setutilidad(utilidadesventasLocal.getutilidad());}
			if(conDefault || (!conDefault && utilidadesventasLocal.getporcentaje()!=null && !utilidadesventasLocal.getporcentaje().equals(0.0))) {utilidadesventasBean.setporcentaje(utilidadesventasLocal.getporcentaje());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxUtilidadesVentasGenerico(Long idUtilidadesVentasSeleccionado,JComboBox jComboBoxUtilidadesVentas,List<UtilidadesVentas> utilidadesventassLocal)throws Exception {
		try {
			UtilidadesVentas  utilidadesventasTemp=null;

			for(UtilidadesVentas utilidadesventasAux:utilidadesventassLocal) {
				if(utilidadesventasAux.getId()!=null && utilidadesventasAux.getId().equals(idUtilidadesVentasSeleccionado)) {
					utilidadesventasTemp=utilidadesventasAux;
					break;
				}
			}

			jComboBoxUtilidadesVentas.setSelectedItem(utilidadesventasTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxUtilidadesVentasGenerico(JComboBox jComboBoxUtilidadesVentas,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxUtilidadesVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxUtilidadesVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxUtilidadesVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxUtilidadesVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxUtilidadesVentas.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxUtilidadesVentas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxUtilidadesVentas.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxUtilidadesVentas.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxUtilidadesVentas.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxUtilidadesVentas.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			utilidadesventas=(UtilidadesVentas) utilidadesventasLogic.getUtilidadesVentass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			utilidadesventas =(UtilidadesVentas) utilidadesventass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!utilidadesventas.getIsNew() && !utilidadesventas.getIsChanged() && !utilidadesventas.getIsDeleted()) {
				sDescripcion=utilidadesventas.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=utilidadesventas.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!utilidadesventas.getIsNew() && !utilidadesventas.getIsChanged() && !utilidadesventas.getIsDeleted()) {
				sDescripcion=utilidadesventas.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=utilidadesventas.getsucursal_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		UtilidadesVentas utilidadesventasRow=new UtilidadesVentas();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			utilidadesventasRow=(UtilidadesVentas) utilidadesventasLogic.getUtilidadesVentass().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			utilidadesventasRow=(UtilidadesVentas) utilidadesventass.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualUtilidadesVentas(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoUtilidadesVentas.setVisible((this.isVisibilidadCeldaNuevoUtilidadesVentas && this.isPermisoNuevoUtilidadesVentas));			
			this.jButtonDuplicarUtilidadesVentas.setVisible((this.isVisibilidadCeldaDuplicarUtilidadesVentas && this.isPermisoDuplicarUtilidadesVentas));			
			this.jButtonCopiarUtilidadesVentas.setVisible((this.isVisibilidadCeldaCopiarUtilidadesVentas && this.isPermisoCopiarUtilidadesVentas));
			this.jButtonVerFormUtilidadesVentas.setVisible((this.isVisibilidadCeldaVerFormUtilidadesVentas && this.isPermisoVerFormUtilidadesVentas));
			
			this.jButtonAbrirOrderByUtilidadesVentas.setVisible((this.isVisibilidadCeldaOrdenUtilidadesVentas && this.isPermisoOrdenUtilidadesVentas));			
			
			this.jButtonNuevoRelacionesUtilidadesVentas.setVisible((this.isVisibilidadCeldaNuevoRelacionesUtilidadesVentas && this.isPermisoNuevoUtilidadesVentas));			
			this.jButtonNuevoGuardarCambiosUtilidadesVentas.setVisible((this.isVisibilidadCeldaNuevoUtilidadesVentas && this.isPermisoNuevoUtilidadesVentas && this.isPermisoGuardarCambiosUtilidadesVentas));
			
			if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) {
			this.jInternalFrameDetalleFormUtilidadesVentas.jButtonModificarUtilidadesVentas.setVisible((this.isVisibilidadCeldaModificarUtilidadesVentas && this.isPermisoActualizarUtilidadesVentas));	
			this.jInternalFrameDetalleFormUtilidadesVentas.jButtonActualizarUtilidadesVentas.setVisible((this.isVisibilidadCeldaActualizarUtilidadesVentas && this.isPermisoActualizarUtilidadesVentas));	
			this.jInternalFrameDetalleFormUtilidadesVentas.jButtonEliminarUtilidadesVentas.setVisible((this.isVisibilidadCeldaEliminarUtilidadesVentas && this.isPermisoEliminarUtilidadesVentas));
			this.jInternalFrameDetalleFormUtilidadesVentas.jButtonCancelarUtilidadesVentas.setVisible(this.isVisibilidadCeldaCancelarUtilidadesVentas);							
			this.jInternalFrameDetalleFormUtilidadesVentas.jButtonGuardarCambiosUtilidadesVentas.setVisible((this.isVisibilidadCeldaGuardarUtilidadesVentas && this.isPermisoGuardarCambiosUtilidadesVentas));			
			
			}
						
			this.jButtonGuardarCambiosTablaUtilidadesVentas.setVisible((this.isVisibilidadCeldaGuardarCambiosUtilidadesVentas && this.isPermisoGuardarCambiosUtilidadesVentas));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarUtilidadesVentas.setVisible((this.isVisibilidadCeldaNuevoUtilidadesVentas && this.isPermisoNuevoUtilidadesVentas));						
			this.jButtonDuplicarToolBarUtilidadesVentas.setVisible((this.isVisibilidadCeldaDuplicarUtilidadesVentas && this.isPermisoDuplicarUtilidadesVentas));						
			this.jButtonCopiarToolBarUtilidadesVentas.setVisible((this.isVisibilidadCeldaCopiarUtilidadesVentas && this.isPermisoCopiarUtilidadesVentas));			
			this.jButtonVerFormToolBarUtilidadesVentas.setVisible((this.isVisibilidadCeldaVerFormUtilidadesVentas && this.isPermisoVerFormUtilidadesVentas));			
			this.jButtonAbrirOrderByToolBarUtilidadesVentas.setVisible((this.isVisibilidadCeldaOrdenUtilidadesVentas && this.isPermisoOrdenUtilidadesVentas));
			this.jButtonNuevoRelacionesToolBarUtilidadesVentas.setVisible((this.isVisibilidadCeldaNuevoRelacionesUtilidadesVentas && this.isPermisoNuevoUtilidadesVentas));			
			this.jButtonNuevoGuardarCambiosToolBarUtilidadesVentas.setVisible((this.isVisibilidadCeldaNuevoUtilidadesVentas && this.isPermisoNuevoUtilidadesVentas && this.isPermisoGuardarCambiosUtilidadesVentas));			
			
			if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) {
			this.jInternalFrameDetalleFormUtilidadesVentas.jButtonModificarToolBarUtilidadesVentas.setVisible((this.isVisibilidadCeldaModificarUtilidadesVentas && this.isPermisoActualizarUtilidadesVentas));	
			this.jInternalFrameDetalleFormUtilidadesVentas.jButtonActualizarToolBarUtilidadesVentas.setVisible((this.isVisibilidadCeldaActualizarUtilidadesVentas  && this.isPermisoActualizarUtilidadesVentas));	
			this.jInternalFrameDetalleFormUtilidadesVentas.jButtonEliminarToolBarUtilidadesVentas.setVisible((this.isVisibilidadCeldaEliminarUtilidadesVentas && this.isPermisoEliminarUtilidadesVentas));
			this.jInternalFrameDetalleFormUtilidadesVentas.jButtonCancelarToolBarUtilidadesVentas.setVisible(this.isVisibilidadCeldaCancelarUtilidadesVentas);				
			this.jInternalFrameDetalleFormUtilidadesVentas.jButtonGuardarCambiosToolBarUtilidadesVentas.setVisible((this.isVisibilidadCeldaGuardarUtilidadesVentas && this.isPermisoGuardarCambiosUtilidadesVentas));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarUtilidadesVentas.setVisible((this.isVisibilidadCeldaGuardarCambiosUtilidadesVentas && this.isPermisoGuardarCambiosUtilidadesVentas));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoUtilidadesVentas.setVisible((this.isVisibilidadCeldaNuevoUtilidadesVentas && this.isPermisoNuevoUtilidadesVentas));			
			this.jMenuItemDuplicarUtilidadesVentas.setVisible((this.isVisibilidadCeldaDuplicarUtilidadesVentas && this.isPermisoDuplicarUtilidadesVentas));			
			this.jMenuItemCopiarUtilidadesVentas.setVisible((this.isVisibilidadCeldaCopiarUtilidadesVentas && this.isPermisoCopiarUtilidadesVentas));			
			this.jMenuItemVerFormUtilidadesVentas.setVisible((this.isVisibilidadCeldaVerFormUtilidadesVentas && this.isPermisoVerFormUtilidadesVentas));			
			this.jMenuItemAbrirOrderByUtilidadesVentas.setVisible((this.isVisibilidadCeldaOrdenUtilidadesVentas && this.isPermisoOrdenUtilidadesVentas));			
			//this.jMenuItemMostrarOcultarUtilidadesVentas.setVisible((this.isVisibilidadCeldaOrdenUtilidadesVentas && this.isPermisoOrdenUtilidadesVentas));
			this.jMenuItemDetalleAbrirOrderByUtilidadesVentas.setVisible((this.isVisibilidadCeldaOrdenUtilidadesVentas && this.isPermisoOrdenUtilidadesVentas));			
			//this.jMenuItemDetalleMostrarOcultarUtilidadesVentas.setVisible((this.isVisibilidadCeldaOrdenUtilidadesVentas && this.isPermisoOrdenUtilidadesVentas));			
			this.jMenuItemNuevoRelacionesUtilidadesVentas.setVisible((this.isVisibilidadCeldaNuevoRelacionesUtilidadesVentas && this.isPermisoNuevoUtilidadesVentas));			
			this.jMenuItemNuevoGuardarCambiosUtilidadesVentas.setVisible((this.isVisibilidadCeldaNuevoUtilidadesVentas && this.isPermisoNuevoUtilidadesVentas && this.isPermisoGuardarCambiosUtilidadesVentas));									
			
			if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) {
			this.jInternalFrameDetalleFormUtilidadesVentas.jMenuItemModificarUtilidadesVentas.setVisible((this.isVisibilidadCeldaModificarUtilidadesVentas && this.isPermisoActualizarUtilidadesVentas));	
			this.jInternalFrameDetalleFormUtilidadesVentas.jMenuItemActualizarUtilidadesVentas.setVisible((this.isVisibilidadCeldaActualizarUtilidadesVentas && this.isPermisoActualizarUtilidadesVentas));	
			this.jInternalFrameDetalleFormUtilidadesVentas.jMenuItemEliminarUtilidadesVentas.setVisible((this.isVisibilidadCeldaEliminarUtilidadesVentas && this.isPermisoEliminarUtilidadesVentas));
			this.jInternalFrameDetalleFormUtilidadesVentas.jMenuItemCancelarUtilidadesVentas.setVisible(this.isVisibilidadCeldaCancelarUtilidadesVentas);				
			}
			
			this.jMenuItemGuardarCambiosUtilidadesVentas.setVisible((this.isVisibilidadCeldaGuardarUtilidadesVentas && this.isPermisoGuardarCambiosUtilidadesVentas));						
			this.jMenuItemGuardarCambiosTablaUtilidadesVentas.setVisible((this.isVisibilidadCeldaGuardarCambiosUtilidadesVentas && this.isPermisoGuardarCambiosUtilidadesVentas));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoUtilidadesVentas=this.jButtonNuevoUtilidadesVentas.isVisible();
			this.isVisibilidadCeldaDuplicarUtilidadesVentas=this.jButtonDuplicarUtilidadesVentas.isVisible();
			this.isVisibilidadCeldaCopiarUtilidadesVentas=this.jButtonCopiarUtilidadesVentas.isVisible();
			this.isVisibilidadCeldaVerFormUtilidadesVentas=this.jButtonVerFormUtilidadesVentas.isVisible();
			
			this.isVisibilidadCeldaOrdenUtilidadesVentas=this.jButtonAbrirOrderByUtilidadesVentas.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesUtilidadesVentas=this.jButtonNuevoRelacionesUtilidadesVentas.isVisible();
			this.isVisibilidadCeldaModificarUtilidadesVentas=this.jButtonModificarUtilidadesVentas.isVisible();
			
			if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) {
			this.isVisibilidadCeldaActualizarUtilidadesVentas=this.jInternalFrameDetalleFormUtilidadesVentas.jButtonActualizarUtilidadesVentas.isVisible();
			this.isVisibilidadCeldaEliminarUtilidadesVentas=this.jInternalFrameDetalleFormUtilidadesVentas.jButtonEliminarUtilidadesVentas.isVisible();
			this.isVisibilidadCeldaCancelarUtilidadesVentas=this.jInternalFrameDetalleFormUtilidadesVentas.jButtonCancelarUtilidadesVentas.isVisible();
			this.isVisibilidadCeldaGuardarUtilidadesVentas=this.jInternalFrameDetalleFormUtilidadesVentas.jButtonGuardarCambiosUtilidadesVentas.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosUtilidadesVentas=this.jButtonGuardarCambiosTablaUtilidadesVentas.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoUtilidadesVentas=this.jButtonNuevoToolBarUtilidadesVentas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesUtilidadesVentas=this.jButtonNuevoRelacionesToolBarUtilidadesVentas.isVisible();
			
			if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) {
			this.isVisibilidadCeldaModificarUtilidadesVentas=this.jInternalFrameDetalleFormUtilidadesVentas.jButtonModificarToolBarUtilidadesVentas.isVisible();
			this.isVisibilidadCeldaActualizarUtilidadesVentas=this.jInternalFrameDetalleFormUtilidadesVentas.jButtonActualizarToolBarUtilidadesVentas.isVisible();
			this.isVisibilidadCeldaEliminarUtilidadesVentas=this.jInternalFrameDetalleFormUtilidadesVentas.jButtonEliminarToolBarUtilidadesVentas.isVisible();
			this.isVisibilidadCeldaCancelarUtilidadesVentas=this.jInternalFrameDetalleFormUtilidadesVentas.jButtonCancelarToolBarUtilidadesVentas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarUtilidadesVentas=this.jButtonGuardarCambiosToolBarUtilidadesVentas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosUtilidadesVentas=this.jButtonGuardarCambiosTablaToolBarUtilidadesVentas.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoUtilidadesVentas=this.jMenuItemNuevoUtilidadesVentas.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesUtilidadesVentas=this.jMenuItemNuevoRelacionesUtilidadesVentas.isVisible();
			
			if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) {
			this.isVisibilidadCeldaModificarUtilidadesVentas=this.jInternalFrameDetalleFormUtilidadesVentas.jMenuItemModificarUtilidadesVentas.isVisible();
			this.isVisibilidadCeldaActualizarUtilidadesVentas=this.jInternalFrameDetalleFormUtilidadesVentas.jMenuItemActualizarUtilidadesVentas.isVisible();
			this.isVisibilidadCeldaEliminarUtilidadesVentas=this.jInternalFrameDetalleFormUtilidadesVentas.jMenuItemEliminarUtilidadesVentas.isVisible();
			this.isVisibilidadCeldaCancelarUtilidadesVentas=this.jInternalFrameDetalleFormUtilidadesVentas.jMenuItemCancelarUtilidadesVentas.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarUtilidadesVentas=this.jMenuItemGuardarCambiosUtilidadesVentas.isVisible();
			this.isVisibilidadCeldaGuardarCambiosUtilidadesVentas=this.jMenuItemGuardarCambiosTablaUtilidadesVentas.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesUtilidadesVentas(Boolean esInicializar) {
		if(UtilidadesVentasJInternalFrame.ISBINDING_MANUAL) {			
			if(this.utilidadesventasSessionBean.getConGuardarRelaciones()) {
				//if(this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesUtilidadesVentas();
			}
			
			this.inicializarActualizarBindingBotonesManualUtilidadesVentas(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualUtilidadesVentas() {
		this.jButtonNuevoUtilidadesVentas.setVisible(this.isPermisoNuevoUtilidadesVentas);			
		this.jButtonDuplicarUtilidadesVentas.setVisible(this.isPermisoDuplicarUtilidadesVentas);			
		this.jButtonCopiarUtilidadesVentas.setVisible(this.isPermisoCopiarUtilidadesVentas);			
		this.jButtonVerFormUtilidadesVentas.setVisible(this.isPermisoVerFormUtilidadesVentas);			
		
		this.jButtonAbrirOrderByUtilidadesVentas.setVisible(this.isPermisoOrdenUtilidadesVentas);					
		
		this.jButtonNuevoRelacionesUtilidadesVentas.setVisible(this.isPermisoNuevoUtilidadesVentas);			
		
		if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadesVentas.jButtonModificarUtilidadesVentas.setVisible(this.isPermisoActualizarUtilidadesVentas);	
			this.jInternalFrameDetalleFormUtilidadesVentas.jButtonActualizarUtilidadesVentas.setVisible(this.isPermisoActualizarUtilidadesVentas);	
			this.jInternalFrameDetalleFormUtilidadesVentas.jButtonEliminarUtilidadesVentas.setVisible(this.isPermisoEliminarUtilidadesVentas);
			this.jInternalFrameDetalleFormUtilidadesVentas.jButtonCancelarUtilidadesVentas.setVisible(this.isVisibilidadCeldaCancelarUtilidadesVentas);						
			this.jInternalFrameDetalleFormUtilidadesVentas.jButtonGuardarCambiosUtilidadesVentas.setVisible(this.isPermisoGuardarCambiosUtilidadesVentas);							
		}
		
		this.jButtonGuardarCambiosTablaUtilidadesVentas.setVisible(this.isPermisoActualizarUtilidadesVentas);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleUtilidadesVentas() {
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonModificarUtilidadesVentas.setVisible(this.isPermisoActualizarUtilidadesVentas);	
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonActualizarUtilidadesVentas.setVisible(this.isPermisoActualizarUtilidadesVentas);	
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonEliminarUtilidadesVentas.setVisible(this.isPermisoEliminarUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonCancelarUtilidadesVentas.setVisible(this.isVisibilidadCeldaCancelarUtilidadesVentas);							
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonGuardarCambiosUtilidadesVentas.setVisible((this.isVisibilidadCeldaGuardarUtilidadesVentas && this.isPermisoGuardarCambiosUtilidadesVentas));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosUtilidadesVentas() {
		if(UtilidadesVentasJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualUtilidadesVentas();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesUtilidadesVentas() {
	}
	
	public void jTableDatosUtilidadesVentasListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarUtilidadesVentas(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidUtilidadesVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.getutilidadesventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadesventas =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadesventas =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadesventas==null) {
						this.utilidadesventas = new UtilidadesVentas();
					}

					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.utilidadesventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
				}

				if(this.utilidadesventas.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.utilidadesventas.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadesVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaUtilidadesVentasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebUtilidadesVentas(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUtilidadesVentas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUtilidadesVentas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventas =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.utilidadesventas =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.getutilidadesventas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.utilidadesventasLogic.getConnexion());

				if(this.utilidadesventas.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.utilidadesventas.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUtilidadesVentas=(TitledBorder)this.jScrollPanelDatosUtilidadesVentas.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderUtilidadesVentas.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaUtilidadesVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.getutilidadesventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadesventas =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadesventas =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadesventas==null) {
						this.utilidadesventas = new UtilidadesVentas();
					}

					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.utilidadesventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
				}

				if(this.utilidadesventas.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.utilidadesventas.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadesVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalUtilidadesVentasUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebUtilidadesVentas(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosUtilidadesVentas.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosUtilidadesVentas.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventas =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.utilidadesventas =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.getutilidadesventas(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.utilidadesventasLogic.getConnexion());

				if(this.utilidadesventas.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.utilidadesventas.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderUtilidadesVentas=(TitledBorder)this.jScrollPanelDatosUtilidadesVentas.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderUtilidadesVentas.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalUtilidadesVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.getutilidadesventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadesventas =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadesventas =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadesventas==null) {
						this.utilidadesventas = new UtilidadesVentas();
					}

					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.utilidadesventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
				}

				if(this.utilidadesventas.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.utilidadesventas.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadesVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeUtilidadesVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.getutilidadesventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadesventas =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadesventas =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadesventas==null) {
						this.utilidadesventas = new UtilidadesVentas();
					}

					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.utilidadesventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
				}

				if(this.utilidadesventas.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.utilidadesventas.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadesVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaUtilidadesVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.getutilidadesventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadesventas =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadesventas =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadesventas==null) {
						this.utilidadesventas = new UtilidadesVentas();
					}

					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.utilidadesventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
				}

				if(this.utilidadesventas.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.utilidadesventas.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadesVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completo_clienteUtilidadesVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.getutilidadesventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadesventas =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadesventas =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadesventas==null) {
						this.utilidadesventas = new UtilidadesVentas();
					}

					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.utilidadesventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
				}

				if(this.utilidadesventas.getnombre_completo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo_cliente like '%"+this.utilidadesventas.getnombre_completo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadesVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_tipo_facturaUtilidadesVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.getutilidadesventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadesventas =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadesventas =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadesventas==null) {
						this.utilidadesventas = new UtilidadesVentas();
					}

					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.utilidadesventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
				}

				if(this.utilidadesventas.getnombre_tipo_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_tipo_factura like '%"+this.utilidadesventas.getnombre_tipo_factura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadesVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionUtilidadesVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.getutilidadesventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadesventas =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadesventas =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadesventas==null) {
						this.utilidadesventas = new UtilidadesVentas();
					}

					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.utilidadesventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
				}

				if(this.utilidadesventas.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.utilidadesventas.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadesVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_documentoUtilidadesVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.getutilidadesventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadesventas =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadesventas =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadesventas==null) {
						this.utilidadesventas = new UtilidadesVentas();
					}

					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.utilidadesventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
				}

				if(this.utilidadesventas.getnumero_documento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_documento like '%"+this.utilidadesventas.getnumero_documento()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadesVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontipoUtilidadesVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.getutilidadesventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadesventas =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadesventas =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadesventas==null) {
						this.utilidadesventas = new UtilidadesVentas();
					}

					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.utilidadesventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
				}

				if(this.utilidadesventas.gettipo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tipo like '%"+this.utilidadesventas.gettipo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadesVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonventaUtilidadesVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.getutilidadesventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadesventas =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadesventas =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadesventas==null) {
						this.utilidadesventas = new UtilidadesVentas();
					}

					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.utilidadesventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
				}

				if(this.utilidadesventas.getventa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where venta = "+this.utilidadesventas.getventa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadesVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncostoUtilidadesVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.getutilidadesventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadesventas =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadesventas =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadesventas==null) {
						this.utilidadesventas = new UtilidadesVentas();
					}

					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.utilidadesventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
				}

				if(this.utilidadesventas.getcosto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo = "+this.utilidadesventas.getcosto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadesVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonutilidadUtilidadesVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.getutilidadesventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadesventas =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadesventas =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadesventas==null) {
						this.utilidadesventas = new UtilidadesVentas();
					}

					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.utilidadesventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
				}

				if(this.utilidadesventas.getutilidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where utilidad = "+this.utilidadesventas.getutilidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadesVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeUtilidadesVentasBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.getutilidadesventas(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadesventas =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.utilidadesventas =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.utilidadesventas==null) {
						this.utilidadesventas = new UtilidadesVentas();
					}

					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.utilidadesventas,true);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);
				}

				if(this.utilidadesventas.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.utilidadesventas.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingUtilidadesVentas(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaUtilidadesVentasUtilidadesVentasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUtilidadesVentas(false,false);

			this.getUtilidadesVentassBusquedaUtilidadesVentas();

			this.inicializarActualizarBindingUtilidadesVentas(false);

			//if(UtilidadesVentasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUtilidadesVentas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaUtilidadesVentasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUtilidadesVentas(false,false);

			this.getUtilidadesVentassFK_IdEmpresa();

			this.inicializarActualizarBindingUtilidadesVentas(false);

			//if(UtilidadesVentasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUtilidadesVentas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalUtilidadesVentasActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingUtilidadesVentas(false,false);

			this.getUtilidadesVentassFK_IdSucursal();

			this.inicializarActualizarBindingUtilidadesVentas(false);

			//if(UtilidadesVentasBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingUtilidadesVentas(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.utilidadesventasLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameUtilidadesVentas() {
		if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) {
			this.jInternalFrameDetalleFormUtilidadesVentas.setVisible(false);	    			
			this.jInternalFrameDetalleFormUtilidadesVentas.dispose();
			this.jInternalFrameDetalleFormUtilidadesVentas=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoUtilidadesVentas!=null) {
			this.jInternalFrameReporteDinamicoUtilidadesVentas.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoUtilidadesVentas.dispose();
			this.jInternalFrameReporteDinamicoUtilidadesVentas=null;
		}
		
		if(this.jInternalFrameImportacionUtilidadesVentas!=null) {
			this.jInternalFrameImportacionUtilidadesVentas.setVisible(false);	    			
			this.jInternalFrameImportacionUtilidadesVentas.dispose();
			this.jInternalFrameImportacionUtilidadesVentas=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessUtilidadesVentas();
			
			UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
			
			
			if(sTipo.equals("NuevoUtilidadesVentas")) {
				jButtonNuevoUtilidadesVentasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarUtilidadesVentas")) {
				jButtonDuplicarUtilidadesVentasActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarUtilidadesVentas")) {
				jButtonCopiarUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("VerFormUtilidadesVentas")) {
				jButtonVerFormUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarUtilidadesVentas")) {
				jButtonNuevoUtilidadesVentasActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarUtilidadesVentas")) {
				jButtonDuplicarUtilidadesVentasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoUtilidadesVentas")) {
				jButtonNuevoUtilidadesVentasActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarUtilidadesVentas")) {
				jButtonDuplicarUtilidadesVentasActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesUtilidadesVentas")) {
				jButtonNuevoUtilidadesVentasActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarUtilidadesVentas")) {
				jButtonNuevoUtilidadesVentasActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesUtilidadesVentas")) {
				jButtonNuevoUtilidadesVentasActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarUtilidadesVentas")) {
				jButtonModificarUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarUtilidadesVentas")) {
				jButtonModificarUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarUtilidadesVentas")) {
				jButtonModificarUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarUtilidadesVentas")) {
				jButtonActualizarUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarUtilidadesVentas")) {
				jButtonActualizarUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarUtilidadesVentas")) {
				jButtonActualizarUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("EliminarUtilidadesVentas")) {
				jButtonEliminarUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarUtilidadesVentas")) {
				jButtonEliminarUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarUtilidadesVentas")) {
				jButtonEliminarUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("CancelarUtilidadesVentas")) {
				jButtonCancelarUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarUtilidadesVentas")) {
				jButtonCancelarUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarUtilidadesVentas")) {
				jButtonCancelarUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("CerrarUtilidadesVentas")) {
				jButtonCerrarUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarUtilidadesVentas")) {
				jButtonCerrarUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarUtilidadesVentas")) {
				jButtonCerrarUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarUtilidadesVentas")) {
				jButtonMostrarOcultarUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarUtilidadesVentas")) {
				jButtonCancelarUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosUtilidadesVentas")) {
				jButtonGuardarCambiosUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarUtilidadesVentas")) {
				jButtonGuardarCambiosUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarUtilidadesVentas")) {
				jButtonCopiarUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarUtilidadesVentas")) {
				jButtonVerFormUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosUtilidadesVentas")) {
				jButtonGuardarCambiosUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarUtilidadesVentas")) {
				jButtonCopiarUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormUtilidadesVentas")) {
				jButtonVerFormUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaUtilidadesVentas")) {
				jButtonGuardarCambiosUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarUtilidadesVentas")) {
				jButtonGuardarCambiosUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaUtilidadesVentas")) {
				jButtonGuardarCambiosUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionUtilidadesVentas")) {
				jButtonRecargarInformacionUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarUtilidadesVentas")) {
				jButtonRecargarInformacionUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionUtilidadesVentas")) {
				jButtonRecargarInformacionUtilidadesVentasActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresUtilidadesVentas")) {
				jButtonAnterioresUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarUtilidadesVentas")) {
				jButtonAnterioresUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreUtilidadesVentas")) {
				jButtonAnterioresUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesUtilidadesVentas")) {
				jButtonSiguientesUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarUtilidadesVentas")) {
				jButtonSiguientesUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesUtilidadesVentas")) {
				jButtonSiguientesUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByUtilidadesVentas") || sTipo.equals("MenuItemDetalleAbrirOrderByUtilidadesVentas")) {
				jButtonAbrirOrderByUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarUtilidadesVentas") || sTipo.equals("MenuItemDetalleMostrarOcultarUtilidadesVentas")) {
				jButtonMostrarOcultarUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosUtilidadesVentas")) {
				jButtonNuevoGuardarCambiosUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarUtilidadesVentas")) {
				jButtonNuevoGuardarCambiosUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosUtilidadesVentas")) {
				jButtonNuevoGuardarCambiosUtilidadesVentasActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoUtilidadesVentas")) {
				jButtonCerrarReporteDinamicoUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoUtilidadesVentas")) {
				jButtonGenerarReporteDinamicoUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoUtilidadesVentas")) {
				
				jButtonGenerarExcelReporteDinamicoUtilidadesVentasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionUtilidadesVentas")) {
				jButtonCerrarImportacionUtilidadesVentasActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionUtilidadesVentas")) {
				
				jButtonGenerarImportacionUtilidadesVentasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionUtilidadesVentas")) {
				
				jButtonAbrirImportacionUtilidadesVentasActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesUtilidadesVentas")) {
				jComboBoxTiposAccionesUtilidadesVentasActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesUtilidadesVentas")) {
				jComboBoxTiposRelacionesUtilidadesVentasActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioUtilidadesVentas")) {
				jComboBoxTiposAccionesUtilidadesVentasActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarUtilidadesVentas")) {
				
				jComboBoxTiposSeleccionarUtilidadesVentasActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralUtilidadesVentas")) {
				jTextFieldValorCampoGeneralUtilidadesVentasActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByUtilidadesVentas")) {
				jButtonAbrirOrderByUtilidadesVentasActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarUtilidadesVentas")) {
				jButtonAbrirOrderByUtilidadesVentasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByUtilidadesVentas")) {
				jButtonCerrarOrderByUtilidadesVentasActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idUtilidadesVentasBusqueda")) {
				this.jButtonidUtilidadesVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaUtilidadesVentasUpdate")) {
				this.jButtonid_empresaUtilidadesVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaUtilidadesVentasBusqueda")) {
				this.jButtonid_empresaUtilidadesVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalUtilidadesVentasUpdate")) {
				this.jButtonid_sucursalUtilidadesVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalUtilidadesVentasBusqueda")) {
				this.jButtonid_sucursalUtilidadesVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeUtilidadesVentasBusqueda")) {
				this.jButtonfecha_emision_desdeUtilidadesVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaUtilidadesVentasBusqueda")) {
				this.jButtonfecha_emision_hastaUtilidadesVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteUtilidadesVentasBusqueda")) {
				this.jButtonnombre_completo_clienteUtilidadesVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_facturaUtilidadesVentasBusqueda")) {
				this.jButtonnombre_tipo_facturaUtilidadesVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionUtilidadesVentasBusqueda")) {
				this.jButtonfecha_emisionUtilidadesVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_documentoUtilidadesVentasBusqueda")) {
				this.jButtonnumero_documentoUtilidadesVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipoUtilidadesVentasBusqueda")) {
				this.jButtontipoUtilidadesVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ventaUtilidadesVentasBusqueda")) {
				this.jButtonventaUtilidadesVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoUtilidadesVentasBusqueda")) {
				this.jButtoncostoUtilidadesVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("utilidadUtilidadesVentasBusqueda")) {
				this.jButtonutilidadUtilidadesVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeUtilidadesVentasBusqueda")) {
				this.jButtonporcentajeUtilidadesVentasBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaUtilidadesVentasUtilidadesVentas")) {
				this.jButtonBusquedaUtilidadesVentasUtilidadesVentasActionPerformed(evt);
			}
			
			;
			
			
			UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessUtilidadesVentas();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUtilidadesVentasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadesventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadesventas);
				
				UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
				
				


				
				UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadesVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadesVentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			UtilidadesVentas utilidadesventasLocal=null;
			
			if(!this.getEsControlTabla()) {
				utilidadesventasLocal=this.utilidadesventas;
			} else {
				utilidadesventasLocal=this.utilidadesventasAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadesventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadesventas);
				
				UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
							
				
				


				
				UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadesVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadesVentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadesVentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasAnterior =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadesventasAnterior =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
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
			
			UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
			
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
			
			


			
			UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUtilidadesVentasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadesventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadesventas);
				
				UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
								
						
				


				
				UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadesVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadesVentas.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadesventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadesventas);
				
				UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
								
				
				


				
				UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadesVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadesVentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadesVentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasAnterior =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadesventasAnterior =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadesventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadesventas);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadesVentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasAnterior =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadesventasAnterior =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadesVentasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadesventas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.utilidadesventas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadesventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadesventas);
				
				UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
							
				
				


				
				UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadesVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadesVentas.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUtilidadesVentasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadesventasAnterior =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.utilidadesventasAnterior =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
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
			
			UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
			
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
			
			


			
			UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadesVentasActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadesventas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.utilidadesventas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadesventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadesventas);
				
				UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
								
				
				


				
				UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadesVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadesVentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadesVentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasAnterior =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadesventasAnterior =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadesVentasActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadesventas);
			
			this.actualizarInformacion("INFO_PADRE",false,this.utilidadesventas);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUtilidadesVentasActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadesventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadesventas);
				
				UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosUtilidadesVentas")) {
					jCheckBoxSeleccionarTodosUtilidadesVentasItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosUtilidadesVentas")) {
					jCheckBoxSeleccionadosUtilidadesVentasItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarUtilidadesVentas")) {
					
				}
				
				


				
				
				UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadesVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadesVentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadesventas);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.utilidadesventas);
				
				UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
												
				
				


				
				
				UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadesVentas.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadesVentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUtilidadesVentasActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.utilidadesventasAnterior =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.utilidadesventasAnterior =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUtilidadesVentasActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadesventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadesventas);
				
				UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
				
				
				UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
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
			
			UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
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
			
			


			
			UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaUtilidadesVentasActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadesventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadesventas);
				
				UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadesVentas.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadesVentas.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.utilidadesventas);
				
				this.actualizarInformacion("INFO_PADRE",false,this.utilidadesventas);
				
				UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
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
				
				


				
				UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(UtilidadesVentas.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",UtilidadesVentas.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaUtilidadesVentasActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.utilidadesventasAnterior =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.utilidadesventasAnterior =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarUtilidadesVentas")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosUtilidadesVentasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosUtilidadesVentas.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.utilidadesventas =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.utilidadesventas =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.utilidadesventas);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarUtilidadesVentas")) {
				
				}
				
				UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarUtilidadesVentas")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosUtilidadesVentas.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarUtilidadesVentas")) {
			
			}
			
			UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessUtilidadesVentas();
			
			UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
			
			if(sTipo.equals("NuevoUtilidadesVentas")) {
				jButtonNuevoUtilidadesVentasActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarUtilidadesVentas")) {
				jButtonDuplicarUtilidadesVentasActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarUtilidadesVentas")) {
				jButtonCopiarUtilidadesVentasActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormUtilidadesVentas")) {
				jButtonVerFormUtilidadesVentasActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesUtilidadesVentas")) {
				jButtonNuevoUtilidadesVentasActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarUtilidadesVentas")) {
				jButtonModificarUtilidadesVentasActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarUtilidadesVentas")) {
				jButtonActualizarUtilidadesVentasActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarUtilidadesVentas")) {
				jButtonEliminarUtilidadesVentasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaUtilidadesVentas")) {
				jButtonGuardarCambiosUtilidadesVentasActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarUtilidadesVentas")) {
				jButtonCancelarUtilidadesVentasActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarUtilidadesVentas")) {
				jButtonCerrarUtilidadesVentasActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosUtilidadesVentas")) {
				jButtonGuardarCambiosUtilidadesVentasActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosUtilidadesVentas")) {
				jButtonNuevoGuardarCambiosUtilidadesVentasActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByUtilidadesVentas")) {
				jButtonAbrirOrderByUtilidadesVentasActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionUtilidadesVentas")) {
				jButtonRecargarInformacionUtilidadesVentasActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresUtilidadesVentas")) {
				jButtonAnterioresUtilidadesVentasActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesUtilidadesVentas")) {
				jButtonSiguientesUtilidadesVentasActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idUtilidadesVentasBusqueda")) {
				this.jButtonidUtilidadesVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaUtilidadesVentasUpdate")) {
				this.jButtonid_empresaUtilidadesVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaUtilidadesVentasBusqueda")) {
				this.jButtonid_empresaUtilidadesVentasBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalUtilidadesVentasUpdate")) {
				this.jButtonid_sucursalUtilidadesVentasUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalUtilidadesVentasBusqueda")) {
				this.jButtonid_sucursalUtilidadesVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeUtilidadesVentasBusqueda")) {
				this.jButtonfecha_emision_desdeUtilidadesVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaUtilidadesVentasBusqueda")) {
				this.jButtonfecha_emision_hastaUtilidadesVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completo_clienteUtilidadesVentasBusqueda")) {
				this.jButtonnombre_completo_clienteUtilidadesVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_tipo_facturaUtilidadesVentasBusqueda")) {
				this.jButtonnombre_tipo_facturaUtilidadesVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionUtilidadesVentasBusqueda")) {
				this.jButtonfecha_emisionUtilidadesVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_documentoUtilidadesVentasBusqueda")) {
				this.jButtonnumero_documentoUtilidadesVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipoUtilidadesVentasBusqueda")) {
				this.jButtontipoUtilidadesVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ventaUtilidadesVentasBusqueda")) {
				this.jButtonventaUtilidadesVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costoUtilidadesVentasBusqueda")) {
				this.jButtoncostoUtilidadesVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("utilidadUtilidadesVentasBusqueda")) {
				this.jButtonutilidadUtilidadesVentasBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeUtilidadesVentasBusqueda")) {
				this.jButtonporcentajeUtilidadesVentasBusquedaActionPerformed(evt);
			}
			
			UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessUtilidadesVentas();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameUtilidadesVentas")) {
				closingInternalFrameUtilidadesVentas();
				
			} else if(sTipo.equals("jButtonCancelarUtilidadesVentas")) {
				JInternalFrameBase jInternalFrameDetalleFormUtilidadesVentas = (JInternalFrameBase)evt.getSource();
	            	
	            UtilidadesVentasBeanSwingJInternalFrame jInternalFrameParent=(UtilidadesVentasBeanSwingJInternalFrame)jInternalFrameDetalleFormUtilidadesVentas.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarUtilidadesVentasActionPerformed(null);
			}
			
			UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.utilidadesventas,new Object(),this.utilidadesventasParameterGeneral,this.utilidadesventasReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormUtilidadesVentas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormUtilidadesVentas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormUtilidadesVentas(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.utilidadesventas)) {
			if(!esControlTabla) {
				if(UtilidadesVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.utilidadesventas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);			
				}
				
				if(this.utilidadesventasSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualUtilidadesVentas(this.utilidadesventas,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanUtilidadesVentas(this.utilidadesventasReturnGeneral,this.utilidadesventasBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.utilidadesventasSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanUtilidadesVentas(classes,this.utilidadesventasReturnGeneral,this.utilidadesventasBean,false);
					}
						
					if(this.utilidadesventasReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyUtilidadesVentas(this.utilidadesventasReturnGeneral.getUtilidadesVentas());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioUtilidadesVentas(this.utilidadesventasReturnGeneral.getUtilidadesVentas());	
					}
						
					if(this.utilidadesventasReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioUtilidadesVentas(this.utilidadesventasReturnGeneral.getUtilidadesVentas(),classes);//this.utilidadesventasBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioUtilidadesVentas(this.utilidadesventas,classes);//this.utilidadesventasBean);									
				}
			
				if(UtilidadesVentasJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualUtilidadesVentas(this.utilidadesventas,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysUtilidadesVentas(this.utilidadesventas);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.utilidadesventasAnterior!=null) {
						this.utilidadesventas=this.utilidadesventasAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.utilidadesventasSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.utilidadesventasSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.utilidadesventasReturnGeneral.getUtilidadesVentas(),utilidadesventasLogic.getUtilidadesVentass());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.utilidadesventasReturnGeneral.getUtilidadesVentas(),this.utilidadesventass);
				}
				//ARCHITECTURE
				
				//this.jTableDatosUtilidadesVentas.repaint();
				
				//((AbstractTableModel) this.jTableDatosUtilidadesVentas.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosUtilidadesVentas();
			}
		}
	}
	
	public void actualizarVisualTableDatosUtilidadesVentas() throws Exception {
		
		UtilidadesVentasModel utilidadesventasModel=(UtilidadesVentasModel)this.jTableDatosUtilidadesVentas.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			utilidadesventasModel.utilidadesventass=this.utilidadesventasLogic.getUtilidadesVentass();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			utilidadesventasModel.utilidadesventass=this.utilidadesventass;
		}
		
		
		((UtilidadesVentasModel) this.jTableDatosUtilidadesVentas.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaUtilidadesVentas() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getutilidadesventasAnterior(),this.utilidadesventasLogic.getUtilidadesVentass());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getutilidadesventasAnterior(),this.utilidadesventass);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosUtilidadesVentas();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioUtilidadesVentas(UtilidadesVentas utilidadesventas,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
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
										
				UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.utilidadesventas,new Object(),generalEntityParameterGeneral,this.utilidadesventasReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.utilidadesventasSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=UtilidadesVentasConstantesFunciones.getClassesRelationshipsOfUtilidadesVentas(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=UtilidadesVentasConstantesFunciones.getClassesRelationshipsFromStringsOfUtilidadesVentas(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormUtilidadesVentas(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				UtilidadesVentasBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.utilidadesventas,new Object(),generalEntityParameterGeneral,this.utilidadesventasReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioUtilidadesVentas(UtilidadesVentasBean utilidadesventasBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanUtilidadesVentas(ArrayList<Classe> classes,UtilidadesVentasReturnGeneral utilidadesventasReturnGeneral,UtilidadesVentasBean utilidadesventasBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualUtilidadesVentas(UtilidadesVentas utilidadesventas,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.utilidadesventas)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormUtilidadesVentas = new UtilidadesVentasDetalleFormJInternalFrame(jDesktopPane,this.utilidadesventasSessionBean.getConGuardarRelaciones(),this.utilidadesventasSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.setVisible(false);
		this.jInternalFrameDetalleFormUtilidadesVentas.setSelected(false);						
		
		this.jInternalFrameDetalleFormUtilidadesVentas.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormUtilidadesVentas.utilidadesventasLogic=this.utilidadesventasLogic;
		
		this.cargarCombosFrameForeignKeyUtilidadesVentas("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleUtilidadesVentas();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleUtilidadesVentas();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyUtilidadesVentas("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyUtilidadesVentas();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormUtilidadesVentas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarUtilidadesVentas"));
		
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonModificarUtilidadesVentas.addActionListener(new ButtonActionListener(this,"ModificarUtilidadesVentas"));

		
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonModificarToolBarUtilidadesVentas.addActionListener(new ButtonActionListener(this,"ModificarToolBarUtilidadesVentas"));
					
		this.jInternalFrameDetalleFormUtilidadesVentas.jMenuItemModificarUtilidadesVentas.addActionListener(new ButtonActionListener(this,"MenuItemModificarUtilidadesVentas"));		
		
		
		
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonActualizarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"ActualizarUtilidadesVentas"));
		
		
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonActualizarToolBarUtilidadesVentas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarUtilidadesVentas"));
						
		this.jInternalFrameDetalleFormUtilidadesVentas.jMenuItemActualizarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarUtilidadesVentas"));		
		
		
		
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonEliminarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"EliminarUtilidadesVentas"));
		
		
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonEliminarToolBarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"EliminarToolBarUtilidadesVentas"));
								
		this.jInternalFrameDetalleFormUtilidadesVentas.jMenuItemEliminarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarUtilidadesVentas"));		
		
		
		
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonCancelarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"CancelarUtilidadesVentas"));
		
		
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonCancelarToolBarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"CancelarToolBarUtilidadesVentas"));
					
		this.jInternalFrameDetalleFormUtilidadesVentas.jMenuItemCancelarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarUtilidadesVentas"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormUtilidadesVentas.jMenuItemDetalleCerrarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarUtilidadesVentas"));		
		
		
		
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonGuardarCambiosToolBarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUtilidadesVentas"));
		
		
		
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonGuardarCambiosToolBarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUtilidadesVentas"));
		
		
		
		this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxTiposAccionesFormularioUtilidadesVentas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioUtilidadesVentas"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonidUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"idUtilidadesVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonid_empresaUtilidadesVentasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaUtilidadesVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonid_empresaUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaUtilidadesVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonid_sucursalUtilidadesVentasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalUtilidadesVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonid_sucursalUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonfecha_emision_desdeUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonfecha_emision_hastaUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonnombre_completo_clienteUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonnombre_tipo_facturaUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_facturaUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonfecha_emisionUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonnumero_documentoUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"numero_documentoUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtontipoUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"tipoUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonventaUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"ventaUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtoncostoUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"costoUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonutilidadUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"utilidadUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonporcentajeUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeUtilidadesVentasBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormUtilidadesVentas.jTabbedPaneRelacionesUtilidadesVentas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesUtilidadesVentas"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameUtilidadesVentas"));
		
		if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadesVentas.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarUtilidadesVentas"));
		}
		
		this.jTableDatosUtilidadesVentas.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarUtilidadesVentas"));
		
		this.jTableDatosUtilidadesVentas.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarUtilidadesVentas"));
		
		this.jButtonNuevoUtilidadesVentas.addActionListener(new ButtonActionListener(this,"NuevoUtilidadesVentas"));
		
		this.jButtonDuplicarUtilidadesVentas.addActionListener(new ButtonActionListener(this,"DuplicarUtilidadesVentas"));
		
		this.jButtonCopiarUtilidadesVentas.addActionListener(new ButtonActionListener(this,"CopiarUtilidadesVentas"));
		
		this.jButtonVerFormUtilidadesVentas.addActionListener(new ButtonActionListener(this,"VerFormUtilidadesVentas"));
		
		
		this.jButtonNuevoToolBarUtilidadesVentas.addActionListener(new ButtonActionListener(this,"NuevoToolBarUtilidadesVentas"));
			
		this.jButtonDuplicarToolBarUtilidadesVentas.addActionListener(new ButtonActionListener(this,"DuplicarToolBarUtilidadesVentas"));
			
		this.jMenuItemNuevoUtilidadesVentas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoUtilidadesVentas"));
			
		this.jMenuItemDuplicarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarUtilidadesVentas"));		
		
		
		this.jButtonNuevoRelacionesUtilidadesVentas.addActionListener (new ButtonActionListener(this,"NuevoRelacionesUtilidadesVentas"));
		
		
		this.jButtonNuevoRelacionesToolBarUtilidadesVentas.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarUtilidadesVentas"));
			
		this.jMenuItemNuevoRelacionesUtilidadesVentas.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesUtilidadesVentas"));		
		
		
		if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadesVentas.jButtonModificarUtilidadesVentas.addActionListener(new ButtonActionListener(this,"ModificarUtilidadesVentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadesVentas.jButtonModificarToolBarUtilidadesVentas.addActionListener(new ButtonActionListener(this,"ModificarToolBarUtilidadesVentas"));
			
			this.jInternalFrameDetalleFormUtilidadesVentas.jMenuItemModificarUtilidadesVentas.addActionListener(new ButtonActionListener(this,"MenuItemModificarUtilidadesVentas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormUtilidadesVentas.jButtonActualizarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"ActualizarUtilidadesVentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadesVentas.jButtonActualizarToolBarUtilidadesVentas.addActionListener(new ButtonActionListener(this,"ActualizarToolBarUtilidadesVentas"));
				
			this.jInternalFrameDetalleFormUtilidadesVentas.jMenuItemActualizarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"MenuItemActualizarUtilidadesVentas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadesVentas.jButtonEliminarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"EliminarUtilidadesVentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadesVentas.jButtonEliminarToolBarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"EliminarToolBarUtilidadesVentas"));
						
			this.jInternalFrameDetalleFormUtilidadesVentas.jMenuItemEliminarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"MenuItemEliminarUtilidadesVentas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadesVentas.jButtonCancelarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"CancelarUtilidadesVentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadesVentas.jButtonCancelarToolBarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"CancelarToolBarUtilidadesVentas"));
			
			this.jInternalFrameDetalleFormUtilidadesVentas.jMenuItemCancelarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"MenuItemCancelarUtilidadesVentas"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarUtilidadesVentas"));		
		
		
		this.jButtonCerrarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"CerrarUtilidadesVentas"));
		
		
		this.jButtonCerrarToolBarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"CerrarToolBarUtilidadesVentas"));
			
		this.jMenuItemCerrarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"MenuItemCerrarUtilidadesVentas"));
			
		if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadesVentas.jMenuItemDetalleCerrarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarUtilidadesVentas"));		
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadesVentas.jButtonGuardarCambiosUtilidadesVentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosUtilidadesVentas"));
		}
		
		
		if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadesVentas.jButtonGuardarCambiosToolBarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarUtilidadesVentas"));
		}
		
		this.jButtonCopiarToolBarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"CopiarToolBarUtilidadesVentas"));
			
		this.jButtonVerFormToolBarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"VerFormToolBarUtilidadesVentas"));
		
		this.jMenuItemGuardarCambiosUtilidadesVentas.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosUtilidadesVentas"));
			
		this.jMenuItemCopiarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"MenuItemCopiarUtilidadesVentas"));		
		
		this.jMenuItemVerFormUtilidadesVentas.addActionListener (new ButtonActionListener(this,"MenuItemVerFormUtilidadesVentas"));		
		
		
		this.jButtonGuardarCambiosTablaUtilidadesVentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaUtilidadesVentas"));
		
		
		this.jButtonGuardarCambiosTablaToolBarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarUtilidadesVentas"));
			
		this.jMenuItemGuardarCambiosTablaUtilidadesVentas.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaUtilidadesVentas"));		
		
		
		
		this.jButtonRecargarInformacionUtilidadesVentas.addActionListener (new ButtonActionListener(this,"RecargarInformacionUtilidadesVentas"));
					
		this.jButtonRecargarInformacionToolBarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarUtilidadesVentas"));
		
		this.jMenuItemRecargarInformacionUtilidadesVentas.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionUtilidadesVentas"));		
		
		
		
		this.jButtonAnterioresUtilidadesVentas.addActionListener (new ButtonActionListener(this,"AnterioresUtilidadesVentas"));
		
		
		this.jButtonAnterioresToolBarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"AnterioresToolBarUtilidadesVentas"));
		
		this.jMenuItemAnterioresUtilidadesVentas.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresUtilidadesVentas"));		
		
		
		this.jButtonSiguientesUtilidadesVentas.addActionListener (new ButtonActionListener(this,"SiguientesUtilidadesVentas"));
		
		
		this.jButtonSiguientesToolBarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"SiguientesToolBarUtilidadesVentas"));
			
		this.jMenuItemSiguientesUtilidadesVentas.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesUtilidadesVentas"));
			
		this.jMenuItemAbrirOrderByUtilidadesVentas.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByUtilidadesVentas"));
			
		this.jMenuItemMostrarOcultarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarUtilidadesVentas"));
			
		this.jMenuItemDetalleAbrirOrderByUtilidadesVentas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByUtilidadesVentas"));
			
		this.jMenuItemDetalleMostarOcultarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarUtilidadesVentas"));		
		
		
		this.jButtonNuevoGuardarCambiosUtilidadesVentas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosUtilidadesVentas"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarUtilidadesVentas"));
			
		this.jMenuItemNuevoGuardarCambiosUtilidadesVentas.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosUtilidadesVentas"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosUtilidadesVentas.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosUtilidadesVentas"));

		this.jCheckBoxSeleccionadosUtilidadesVentas.addItemListener(new CheckBoxItemListener(this,"SeleccionadosUtilidadesVentas"));
		
		if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxTiposAccionesFormularioUtilidadesVentas.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioUtilidadesVentas"));
		}
		
		
		this.jComboBoxTiposRelacionesUtilidadesVentas.addActionListener (new ButtonActionListener(this,"TiposRelacionesUtilidadesVentas"));
			
		this.jComboBoxTiposAccionesUtilidadesVentas.addActionListener (new ButtonActionListener(this,"TiposAccionesUtilidadesVentas"));
					
		this.jComboBoxTiposSeleccionarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"TiposSeleccionarUtilidadesVentas"));
			
		this.jTextFieldValorCampoGeneralUtilidadesVentas.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralUtilidadesVentas"));		
		
		
		if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonidUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"idUtilidadesVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonid_empresaUtilidadesVentasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaUtilidadesVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonid_empresaUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaUtilidadesVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonid_sucursalUtilidadesVentasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalUtilidadesVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonid_sucursalUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonfecha_emision_desdeUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonfecha_emision_hastaUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonnombre_completo_clienteUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonnombre_tipo_facturaUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_facturaUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonfecha_emisionUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonnumero_documentoUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"numero_documentoUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtontipoUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"tipoUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonventaUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"ventaUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtoncostoUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"costoUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonutilidadUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"utilidadUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonporcentajeUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeUtilidadesVentasBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaUtilidadesVentasUtilidadesVentas.addActionListener(new ButtonActionListener(this,"BusquedaUtilidadesVentasUtilidadesVentas"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoUtilidadesVentas!=null) {
				this.jInternalFrameReporteDinamicoUtilidadesVentas.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUtilidadesVentas"));
				this.jInternalFrameReporteDinamicoUtilidadesVentas.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUtilidadesVentas"));
				this.jInternalFrameReporteDinamicoUtilidadesVentas.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUtilidadesVentas"));
			}
			
			//this.jButtonCerrarReporteDinamicoUtilidadesVentas.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoUtilidadesVentas"));				
			//this.jButtonGenerarReporteDinamicoUtilidadesVentas.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoUtilidadesVentas"));
			//this.jButtonGenerarExcelReporteDinamicoUtilidadesVentas.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoUtilidadesVentas"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionUtilidadesVentas!=null) {
				this.jInternalFrameImportacionUtilidadesVentas.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionUtilidadesVentas"));
				this.jInternalFrameImportacionUtilidadesVentas.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionUtilidadesVentas"));
				this.jInternalFrameImportacionUtilidadesVentas.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionUtilidadesVentas"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByUtilidadesVentas.addActionListener (new ButtonActionListener(this,"AbrirOrderByUtilidadesVentas"));
			
			this.jButtonAbrirOrderByToolBarUtilidadesVentas.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarUtilidadesVentas"));			
			
			if(this.jInternalFrameOrderByUtilidadesVentas!=null) {
				this.jInternalFrameOrderByUtilidadesVentas.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByUtilidadesVentas"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormUtilidadesVentas.jTabbedPaneRelacionesUtilidadesVentas.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesUtilidadesVentas"));
		
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
            		closingInternalFrameUtilidadesVentas();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormUtilidadesVentas.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormUtilidadesVentas = (JInternalFrameBase)event.getSource();
	            	
	            UtilidadesVentasBeanSwingJInternalFrame jInternalFrameParent=(UtilidadesVentasBeanSwingJInternalFrame)jInternalFrameDetalleFormUtilidadesVentas.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarUtilidadesVentasActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosUtilidadesVentas.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosUtilidadesVentasListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosUtilidadesVentas.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosUtilidadesVentas.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUtilidadesVentasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUtilidadesVentasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUtilidadesVentasActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoUtilidadesVentas";
		inputMap = this.jButtonNuevoUtilidadesVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoUtilidadesVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoUtilidadesVentasActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUtilidadesVentasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUtilidadesVentasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoUtilidadesVentasActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesUtilidadesVentas";
		inputMap = this.jButtonNuevoRelacionesUtilidadesVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesUtilidadesVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoUtilidadesVentasActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarUtilidadesVentas";
		inputMap = this.jButtonModificarUtilidadesVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarUtilidadesVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarUtilidadesVentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarUtilidadesVentas";
		inputMap = this.jButtonActualizarUtilidadesVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarUtilidadesVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarUtilidadesVentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarUtilidadesVentas";
		inputMap = this.jButtonEliminarUtilidadesVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarUtilidadesVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarUtilidadesVentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarUtilidadesVentas";
		inputMap = this.jButtonCancelarUtilidadesVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarUtilidadesVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarUtilidadesVentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarUtilidadesVentas";
		inputMap = this.jButtonCerrarUtilidadesVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarUtilidadesVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarUtilidadesVentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonGuardarCambiosUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosUtilidadesVentas";
		inputMap = this.jInternalFrameDetalleFormUtilidadesVentas.jButtonGuardarCambiosUtilidadesVentas.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonGuardarCambiosUtilidadesVentas.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosUtilidadesVentasActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosUtilidadesVentas.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosUtilidadesVentasItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesUtilidadesVentas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesUtilidadesVentasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarUtilidadesVentas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarUtilidadesVentasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralUtilidadesVentas.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralUtilidadesVentasActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonidUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"idUtilidadesVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonid_empresaUtilidadesVentasUpdate.addActionListener(new ButtonActionListener(this,"id_empresaUtilidadesVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonid_empresaUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaUtilidadesVentasBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonid_sucursalUtilidadesVentasUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalUtilidadesVentasUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonid_sucursalUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonfecha_emision_desdeUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonfecha_emision_hastaUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonnombre_completo_clienteUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completo_clienteUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonnombre_tipo_facturaUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"nombre_tipo_facturaUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonfecha_emisionUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonnumero_documentoUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"numero_documentoUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtontipoUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"tipoUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonventaUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"ventaUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtoncostoUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"costoUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonutilidadUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"utilidadUtilidadesVentasBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormUtilidadesVentas.jButtonporcentajeUtilidadesVentasBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeUtilidadesVentasBusqueda"));
		
		
		this.jButtonBusquedaUtilidadesVentasUtilidadesVentas.addActionListener(new ButtonActionListener(this,"BusquedaUtilidadesVentasUtilidadesVentas"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionUtilidadesVentas.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionUtilidadesVentasActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarUtilidadesVentasActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarUtilidadesVentas.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosUtilidadesVentas(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(UtilidadesVentas utilidadesventasAux:this.utilidadesventasLogic.getUtilidadesVentass()) {
					utilidadesventasAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UtilidadesVentas utilidadesventasAux:utilidadesventass) {
					utilidadesventasAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosUtilidadesVentasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingUtilidadesVentas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(UtilidadesVentas utilidadesventasAux:this.utilidadesventasLogic.getUtilidadesVentass()) {
						utilidadesventasAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(UtilidadesVentas utilidadesventasAux:utilidadesventass) {
						utilidadesventasAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(UtilidadesVentas utilidadesventasAux:this.utilidadesventasLogic.getUtilidadesVentass()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(UtilidadesVentas utilidadesventasAux:utilidadesventass) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaUtilidadesVentas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosUtilidadesVentas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosUtilidadesVentas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosUtilidadesVentas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosUtilidadesVentasItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingUtilidadesVentas(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosUtilidadesVentas.getSelectedRows();
			
			UtilidadesVentas utilidadesventasLocal=new UtilidadesVentas();
			
			//this.seleccionarTodosUtilidadesVentas(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					utilidadesventasLocal =(UtilidadesVentas) this.utilidadesventasLogic.getUtilidadesVentass().toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					utilidadesventasLocal =(UtilidadesVentas) this.utilidadesventass.toArray()[this.jTableDatosUtilidadesVentas.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				utilidadesventasLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(UtilidadesVentas utilidadesventasAux:this.utilidadesventasLogic.getUtilidadesVentass()) {
						utilidadesventasAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(UtilidadesVentas utilidadesventasAux:utilidadesventass) {
						utilidadesventasAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaUtilidadesVentas(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosUtilidadesVentas.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosUtilidadesVentas.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosUtilidadesVentas,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualUtilidadesVentasItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarUtilidadesVentasParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralUtilidadesVentasActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingUtilidadesVentas(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralUtilidadesVentas.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(UtilidadesVentas utilidadesventasAux:this.utilidadesventasLogic.getUtilidadesVentass()) {
				
						if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							utilidadesventasAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							utilidadesventasAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							utilidadesventasAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_NOMBRETIPOFACTURA)) {
							existe=true;
							utilidadesventasAux.setnombre_tipo_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							utilidadesventasAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_NUMERODOCUMENTO)) {
							existe=true;
							utilidadesventasAux.setnumero_documento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_TIPO)) {
							existe=true;
							utilidadesventasAux.settipo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_VENTA)) {
							existe=true;
							utilidadesventasAux.setventa(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							utilidadesventasAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_UTILIDAD)) {
							existe=true;
							utilidadesventasAux.setutilidad(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							utilidadesventasAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UtilidadesVentas utilidadesventasAux:utilidadesventass) {
					
						if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							utilidadesventasAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							utilidadesventasAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
							existe=true;
							utilidadesventasAux.setnombre_completo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_NOMBRETIPOFACTURA)) {
							existe=true;
							utilidadesventasAux.setnombre_tipo_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							utilidadesventasAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_NUMERODOCUMENTO)) {
							existe=true;
							utilidadesventasAux.setnumero_documento(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_TIPO)) {
							existe=true;
							utilidadesventasAux.settipo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_VENTA)) {
							existe=true;
							utilidadesventasAux.setventa(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_COSTO)) {
							existe=true;
							utilidadesventasAux.setcosto(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_UTILIDAD)) {
							existe=true;
							utilidadesventasAux.setutilidad(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							utilidadesventasAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaUtilidadesVentas(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesUtilidadesVentasActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingUtilidadesVentas(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioUtilidadesVentas=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesUtilidadesVentas.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxTiposAccionesFormularioUtilidadesVentas.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteUtilidadesVentas) {				
					conSplash=true;//false;										
					
					//this.startProcessUtilidadesVentas(conSplash);
				
					this.generarReporteUtilidadesVentassSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUtilidadesVentas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxTiposAccionesFormularioUtilidadesVentas.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoUtilidadesVentassSeleccionados();
				//this.jComboBoxTiposAccionesUtilidadesVentas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoUtilidadesVentassSeleccionados(false);
				//this.jComboBoxTiposAccionesUtilidadesVentas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoUtilidadesVentassSeleccionados(true);
				//this.jComboBoxTiposAccionesUtilidadesVentas.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessUtilidadesVentas();
				
				this.exportarUtilidadesVentassSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUtilidadesVentas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxTiposAccionesFormularioUtilidadesVentas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionUtilidadesVentass();
				//this.importarUtilidadesVentass();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUtilidadesVentas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxTiposAccionesFormularioUtilidadesVentas.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessUtilidadesVentas();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelUtilidadesVentassSeleccionados();
				//this.jComboBoxTiposAccionesUtilidadesVentas.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Utilidades Ventas", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessUtilidadesVentas();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoUtilidadesVentas)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyUtilidadesVentas(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Utilidades Ventas",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesUtilidadesVentas.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxTiposAccionesFormularioUtilidadesVentas.setSelectedIndex(0);					
				}	
			} 			
			else if(UtilidadesVentasBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteUtilidadesVentas) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessUtilidadesVentas(conSplash);
					
						//this.actualizarParametrosGeneralUtilidadesVentas();
						
						this.generarReporteProcesoAccionUtilidadesVentassSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesUtilidadesVentas.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxTiposAccionesFormularioUtilidadesVentas.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(UtilidadesVentasBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Utilidades VentasES SELECCIONADOS?", "MANTENIMIENTO DE Utilidades Ventas", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessUtilidadesVentas();
				
						this.actualizarParametrosGeneralUtilidadesVentas();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.utilidadesventasReturnGeneral=utilidadesventasLogic.procesarAccionUtilidadesVentassWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.utilidadesventasLogic.getUtilidadesVentass(),this.utilidadesventasParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarUtilidadesVentasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesUtilidadesVentas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxTiposAccionesFormularioUtilidadesVentas.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralUtilidadesVentas();
					
					UtilidadesVentasBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarUtilidadesVentasReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesUtilidadesVentas.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxTiposAccionesFormularioUtilidadesVentas.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessUtilidadesVentas(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesUtilidadesVentasActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessUtilidadesVentas();
			
			if(this.jInternalFrameDetalleFormUtilidadesVentas==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<UtilidadesVentas> utilidadesventassSeleccionados=new ArrayList<UtilidadesVentas>();		
			UtilidadesVentas utilidadesventas=new UtilidadesVentas();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingUtilidadesVentas(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesUtilidadesVentas.getSelectedItem();
			
			
			
			
			utilidadesventassSeleccionados=this.getUtilidadesVentassSeleccionados(true);
			//this.sTipoAccion;
			
			if(utilidadesventassSeleccionados.size()==1) {
				for(UtilidadesVentas utilidadesventasAux:utilidadesventassSeleccionados) {
					utilidadesventas=utilidadesventasAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessUtilidadesVentas();
			
      		//this.finishProcessUtilidadesVentas(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarUtilidadesVentasReturnGeneral() throws Exception {
		if(this.utilidadesventasReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.utilidadesventasReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.utilidadesventasReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.utilidadesventasReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.utilidadesventasReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.utilidadesventasReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingUtilidadesVentas(false);
		}
		
		if(this.utilidadesventasReturnGeneral.getConRetornoLista() || this.utilidadesventasReturnGeneral.getConRetornoObjeto()) {
			if(this.utilidadesventasReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.utilidadesventasLogic.setUtilidadesVentass(this.utilidadesventasReturnGeneral.getUtilidadesVentass());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingUtilidadesVentas(false);
		}
	}
	
	public void actualizarParametrosGeneralUtilidadesVentas() throws Exception {
		
		
	}
	
	public ArrayList<UtilidadesVentas> getUtilidadesVentassSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<UtilidadesVentas> utilidadesventassSeleccionados=new ArrayList<UtilidadesVentas>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioUtilidadesVentas) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(UtilidadesVentas utilidadesventasAux:utilidadesventasLogic.getUtilidadesVentass()) {
					if(utilidadesventasAux.getIsSelected()) {
						utilidadesventassSeleccionados.add(utilidadesventasAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(UtilidadesVentas utilidadesventasAux:this.utilidadesventass) {
					if(utilidadesventasAux.getIsSelected()) {
						utilidadesventassSeleccionados.add(utilidadesventasAux);				
					}
				}
			}
			
			if(utilidadesventassSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						utilidadesventassSeleccionados.addAll(this.utilidadesventasLogic.getUtilidadesVentass());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						utilidadesventassSeleccionados.addAll(this.utilidadesventass);				
					}
				}
			}
		} else {
			utilidadesventassSeleccionados.add(this.utilidadesventas);
		}
		
		return utilidadesventassSeleccionados;
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
	
	public void generarReporteUtilidadesVentassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalUtilidadesVentassSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoUtilidadesVentassSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoUtilidadesVentassSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoUtilidadesVentassSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Utilidades Ventas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesUtilidadesVentassSeleccionados() throws Exception {
		ArrayList<UtilidadesVentas> utilidadesventassSeleccionados=new ArrayList<UtilidadesVentas>();		
		
		utilidadesventassSeleccionados=this.getUtilidadesVentassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteUtilidadesVentass("Todos",utilidadesventassSeleccionados);
		
	}	
	
	public void generarReporteNormalUtilidadesVentassSeleccionados() throws Exception {
		ArrayList<UtilidadesVentas> utilidadesventassSeleccionados=new ArrayList<UtilidadesVentas>();		
		
		utilidadesventassSeleccionados=this.getUtilidadesVentassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteUtilidadesVentass("Todos",utilidadesventassSeleccionados);
	}		
	
	public void generarReporteProcesoAccionUtilidadesVentassSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<UtilidadesVentas> utilidadesventassSeleccionados=new ArrayList<UtilidadesVentas>();
		
		utilidadesventassSeleccionados=this.getUtilidadesVentassSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteUtilidadesVentass("Todos",utilidadesventassSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoUtilidadesVentassSeleccionados() throws Exception {
		ArrayList<UtilidadesVentas> utilidadesventassSeleccionados=new ArrayList<UtilidadesVentas>();		
		
		
		this.abrirInicializarFrameReporteDinamicoUtilidadesVentas();
		
		
		utilidadesventassSeleccionados=this.getUtilidadesVentassSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoUtilidadesVentas();
		
		
		//this.generarReporteUtilidadesVentass("Todos",utilidadesventassSeleccionados ,utilidadesventasImplementable,utilidadesventasImplementableHome);
	}
	
	public void mostrarImportacionUtilidadesVentass() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionUtilidadesVentas();
		
		this.abrirFrameImportacionUtilidadesVentas();		
		
			
		//this.generarReporteUtilidadesVentass("Todos",utilidadesventassSeleccionados ,utilidadesventasImplementable,utilidadesventasImplementableHome);
	}
	
	public void importarUtilidadesVentass() throws Exception {		
	
	}
	
	public void exportarUtilidadesVentassSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelUtilidadesVentassSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoUtilidadesVentassSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlUtilidadesVentassSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Utilidades Ventas",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoUtilidadesVentassSeleccionados() throws Exception {
		ArrayList<UtilidadesVentas> utilidadesventassSeleccionados=new ArrayList<UtilidadesVentas>();		
		
		utilidadesventassSeleccionados=this.getUtilidadesVentassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"utilidadesventas."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarUtilidadesVentas(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(UtilidadesVentas utilidadesventasAux:utilidadesventassSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarUtilidadesVentas(utilidadesventasAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//utilidadesventasAux.setsDetalleGeneralEntityReporte(utilidadesventasAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidades Ventas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarUtilidadesVentas(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=UtilidadesVentasConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadesVentasConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadesVentasConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadesVentasConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadesVentasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadesVentasConstantesFunciones.LABEL_NOMBRETIPOFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadesVentasConstantesFunciones.LABEL_NUMERODOCUMENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadesVentasConstantesFunciones.LABEL_TIPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadesVentasConstantesFunciones.LABEL_VENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadesVentasConstantesFunciones.LABEL_COSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadesVentasConstantesFunciones.LABEL_UTILIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=UtilidadesVentasConstantesFunciones.LABEL_PORCENTAJE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarUtilidadesVentas(UtilidadesVentas utilidadesventas,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=utilidadesventas.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadesventas.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadesventas.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadesventas.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadesventas.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadesventas.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadesventas.getnombre_completo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadesventas.getnombre_tipo_factura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadesventas.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadesventas.getnumero_documento();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadesventas.gettipo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadesventas.getventa().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadesventas.getcosto().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadesventas.getutilidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=utilidadesventas.getporcentaje().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelUtilidadesVentassSeleccionados() throws Exception {
		ArrayList<UtilidadesVentas> utilidadesventassSeleccionados=new ArrayList<UtilidadesVentas>();		
		
		utilidadesventassSeleccionados=this.getUtilidadesVentassSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"utilidadesventas.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("UtilidadesVentass");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelUtilidadesVentas(row);				
				iRow++;
			}				
			
			for(UtilidadesVentas utilidadesventasAux:utilidadesventassSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelUtilidadesVentas(utilidadesventasAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidades Ventas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlUtilidadesVentassSeleccionados() throws Exception {
		ArrayList<UtilidadesVentas> utilidadesventassSeleccionados=new ArrayList<UtilidadesVentas>();		
		
		utilidadesventassSeleccionados=this.getUtilidadesVentassSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"utilidadesventas.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("utilidadesventass");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("utilidadesventas");
			//elementRoot.appendChild(element);
		
			for(UtilidadesVentas utilidadesventasAux:utilidadesventassSeleccionados) {
				element = document.createElement("utilidadesventas");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlUtilidadesVentas(utilidadesventasAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Utilidades Ventas",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelUtilidadesVentas(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_NOMBRETIPOFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_NUMERODOCUMENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_TIPO);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_VENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_COSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_UTILIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(UtilidadesVentasConstantesFunciones.LABEL_PORCENTAJE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelUtilidadesVentas(UtilidadesVentas utilidadesventas,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadesventas.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadesventas.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadesventas.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadesventas.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadesventas.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadesventas.getnombre_completo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadesventas.getnombre_tipo_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadesventas.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadesventas.getnumero_documento());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadesventas.gettipo());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadesventas.getventa());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadesventas.getcosto());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadesventas.getutilidad());
		cell = row.createCell(iColumn++);cell.setCellValue(utilidadesventas.getporcentaje());				
	}
	
	public void setFilaDatosExportarXmlUtilidadesVentas(UtilidadesVentas utilidadesventas,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(UtilidadesVentasConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(utilidadesventas.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(UtilidadesVentasConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(utilidadesventas.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(UtilidadesVentasConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(utilidadesventas.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(UtilidadesVentasConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(utilidadesventas.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementfecha_emision_desde = document.createElement(UtilidadesVentasConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(utilidadesventas.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(UtilidadesVentasConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(utilidadesventas.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementnombre_completo_cliente = document.createElement(UtilidadesVentasConstantesFunciones.NOMBRECOMPLETOCLIENTE);
		elementnombre_completo_cliente.appendChild(document.createTextNode(utilidadesventas.getnombre_completo_cliente().trim()));
		element.appendChild(elementnombre_completo_cliente);

		Element elementnombre_tipo_factura = document.createElement(UtilidadesVentasConstantesFunciones.NOMBRETIPOFACTURA);
		elementnombre_tipo_factura.appendChild(document.createTextNode(utilidadesventas.getnombre_tipo_factura().trim()));
		element.appendChild(elementnombre_tipo_factura);

		Element elementfecha_emision = document.createElement(UtilidadesVentasConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(utilidadesventas.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementnumero_documento = document.createElement(UtilidadesVentasConstantesFunciones.NUMERODOCUMENTO);
		elementnumero_documento.appendChild(document.createTextNode(utilidadesventas.getnumero_documento().trim()));
		element.appendChild(elementnumero_documento);

		Element elementtipo = document.createElement(UtilidadesVentasConstantesFunciones.TIPO);
		elementtipo.appendChild(document.createTextNode(utilidadesventas.gettipo().trim()));
		element.appendChild(elementtipo);

		Element elementventa = document.createElement(UtilidadesVentasConstantesFunciones.VENTA);
		elementventa.appendChild(document.createTextNode(utilidadesventas.getventa().toString().trim()));
		element.appendChild(elementventa);

		Element elementcosto = document.createElement(UtilidadesVentasConstantesFunciones.COSTO);
		elementcosto.appendChild(document.createTextNode(utilidadesventas.getcosto().toString().trim()));
		element.appendChild(elementcosto);

		Element elementutilidad = document.createElement(UtilidadesVentasConstantesFunciones.UTILIDAD);
		elementutilidad.appendChild(document.createTextNode(utilidadesventas.getutilidad().toString().trim()));
		element.appendChild(elementutilidad);

		Element elementporcentaje = document.createElement(UtilidadesVentasConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(utilidadesventas.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);
	}
	
	public void generarReporteGroupGenericoUtilidadesVentassSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<UtilidadesVentas> utilidadesventassSeleccionados=new ArrayList<UtilidadesVentas>();
		
		utilidadesventassSeleccionados=this.getUtilidadesVentassSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoUtilidadesVentas(utilidadesventassSeleccionados);
		
		this.generarReporteUtilidadesVentass("Todos",utilidadesventassSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoUtilidadesVentas(ArrayList<UtilidadesVentas> utilidadesventassSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(UtilidadesVentas utilidadesventasAux:utilidadesventassSeleccionados) {
				utilidadesventasAux.setsDetalleGeneralEntityReporte(utilidadesventasAux.toString());
			
				if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					utilidadesventasAux.setsDescripcionGeneralEntityReporte1(utilidadesventasAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					utilidadesventasAux.setsDescripcionGeneralEntityReporte1(utilidadesventasAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					utilidadesventasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(utilidadesventasAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					utilidadesventasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(utilidadesventasAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE)) {
					existe=true;
					utilidadesventasAux.setsDescripcionGeneralEntityReporte1(utilidadesventasAux.getnombre_completo_cliente());
				}
				 else if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_NOMBRETIPOFACTURA)) {
					existe=true;
					utilidadesventasAux.setsDescripcionGeneralEntityReporte1(utilidadesventasAux.getnombre_tipo_factura());
				}
				 else if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					utilidadesventasAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(utilidadesventasAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_NUMERODOCUMENTO)) {
					existe=true;
					utilidadesventasAux.setsDescripcionGeneralEntityReporte1(utilidadesventasAux.getnumero_documento());
				}
				 else if(sTipoSeleccionar.equals(UtilidadesVentasConstantesFunciones.LABEL_TIPO)) {
					existe=true;
					utilidadesventasAux.setsDescripcionGeneralEntityReporte1(utilidadesventasAux.gettipo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,UtilidadesVentasConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesUtilidadesVentas(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoUtilidadesVentas=true;
				this.isVisibilidadCeldaNuevoRelacionesUtilidadesVentas=true;
				this.isVisibilidadCeldaGuardarCambiosUtilidadesVentas=true;
			}
			
			this.isVisibilidadCeldaModificarUtilidadesVentas=false;
			this.isVisibilidadCeldaActualizarUtilidadesVentas=false;
			this.isVisibilidadCeldaEliminarUtilidadesVentas=false;
			this.isVisibilidadCeldaCancelarUtilidadesVentas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUtilidadesVentas=true;
				} else {
					this.isVisibilidadCeldaGuardarUtilidadesVentas=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoUtilidadesVentas=false;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadesVentas=false;
			this.isVisibilidadCeldaGuardarCambiosUtilidadesVentas=false;
			this.isVisibilidadCeldaModificarUtilidadesVentas=false;
			this.isVisibilidadCeldaActualizarUtilidadesVentas=true;
			this.isVisibilidadCeldaEliminarUtilidadesVentas=false;
			this.isVisibilidadCeldaCancelarUtilidadesVentas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUtilidadesVentas=true;
				} else {
					this.isVisibilidadCeldaGuardarUtilidadesVentas=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoUtilidadesVentas=false;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadesVentas=false;
			this.isVisibilidadCeldaGuardarCambiosUtilidadesVentas=false;
			this.isVisibilidadCeldaModificarUtilidadesVentas=false;
			this.isVisibilidadCeldaActualizarUtilidadesVentas=true;
			this.isVisibilidadCeldaEliminarUtilidadesVentas=true;
			this.isVisibilidadCeldaCancelarUtilidadesVentas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUtilidadesVentas=true;
				} else {
					this.isVisibilidadCeldaGuardarUtilidadesVentas=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoUtilidadesVentas=false;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadesVentas=false;
			this.isVisibilidadCeldaGuardarCambiosUtilidadesVentas=false;
			this.isVisibilidadCeldaModificarUtilidadesVentas=false;
			this.isVisibilidadCeldaActualizarUtilidadesVentas=true;
			this.isVisibilidadCeldaEliminarUtilidadesVentas=false;
			this.isVisibilidadCeldaCancelarUtilidadesVentas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUtilidadesVentas=false;
				} else {
					this.isVisibilidadCeldaGuardarUtilidadesVentas=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoUtilidadesVentas=true;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadesVentas=true;
			this.isVisibilidadCeldaGuardarCambiosUtilidadesVentas=true;
			this.isVisibilidadCeldaModificarUtilidadesVentas=false;
			this.isVisibilidadCeldaActualizarUtilidadesVentas=false;
			this.isVisibilidadCeldaEliminarUtilidadesVentas=false;
			this.isVisibilidadCeldaCancelarUtilidadesVentas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUtilidadesVentas=true;
				} else {
					this.isVisibilidadCeldaGuardarUtilidadesVentas=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoUtilidadesVentas=false;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadesVentas=false;
			this.isVisibilidadCeldaGuardarCambiosUtilidadesVentas=false;
			this.isVisibilidadCeldaActualizarUtilidadesVentas=false;
			this.isVisibilidadCeldaEliminarUtilidadesVentas=false;
			this.isVisibilidadCeldaCancelarUtilidadesVentas=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUtilidadesVentas=false;
				} else {
					this.isVisibilidadCeldaGuardarUtilidadesVentas=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoUtilidadesVentas=false;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadesVentas=false;
			this.isVisibilidadCeldaGuardarCambiosUtilidadesVentas=false;
			this.isVisibilidadCeldaModificarUtilidadesVentas=true;
			this.isVisibilidadCeldaActualizarUtilidadesVentas=false;
			this.isVisibilidadCeldaEliminarUtilidadesVentas=false;
			this.isVisibilidadCeldaCancelarUtilidadesVentas=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarUtilidadesVentas=false;
				} else {
					this.isVisibilidadCeldaGuardarUtilidadesVentas=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(UtilidadesVentasJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoUtilidadesVentas=true;
			this.isVisibilidadCeldaNuevoRelacionesUtilidadesVentas=true;
			this.isVisibilidadCeldaGuardarCambiosUtilidadesVentas=true;
		} else {
			this.actualizarEstadoPanelsUtilidadesVentas(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarUtilidadesVentas=false;
			//this.isVisibilidadCeldaVerFormUtilidadesVentas=false;
			this.isVisibilidadCeldaDuplicarUtilidadesVentas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!utilidadesventasSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesUtilidadesVentas=false;
		} else {
			this.isVisibilidadCeldaNuevoUtilidadesVentas=false;
			this.isVisibilidadCeldaGuardarCambiosUtilidadesVentas=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(utilidadesventasSessionBean.getEsGuardarRelacionado()) {
			if(!utilidadesventasSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesUtilidadesVentas=false;												
			}
			
			this.jButtonCerrarUtilidadesVentas.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesUtilidadesVentas=false;
		}
		
		if(!this.permiteMantenimiento(this.utilidadesventas)) {
			this.isVisibilidadCeldaActualizarUtilidadesVentas=false;
			this.isVisibilidadCeldaEliminarUtilidadesVentas=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoUtilidadesVentas=false;
		this.isVisibilidadCeldaNuevoRelacionesUtilidadesVentas=false;
		this.isVisibilidadCeldaGuardarCambiosUtilidadesVentas=false;
		//this.isVisibilidadCeldaModificarUtilidadesVentas=true;
		this.isVisibilidadCeldaActualizarUtilidadesVentas=false;
		this.isVisibilidadCeldaEliminarUtilidadesVentas=false;
		//this.isVisibilidadCeldaCancelarUtilidadesVentas=true;			
		this.isVisibilidadCeldaGuardarUtilidadesVentas=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesUtilidadesVentas() {
	}
	
	public void actualizarEstadoPanelsUtilidadesVentas(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionUtilidadesVentas!=null) {
				this.jScrollPanelDatosEdicionUtilidadesVentas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadesVentas!=null) {
				this.jTabbedPaneBusquedasUtilidadesVentas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUtilidadesVentas!=null) {
				this.jScrollPanelDatosUtilidadesVentas.setVisible(true);
			}
			
			if(this.jPanelPaginacionUtilidadesVentas!=null) {
				this.jPanelPaginacionUtilidadesVentas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUtilidadesVentas!=null) {
				this.jPanelParametrosReportesUtilidadesVentas.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionUtilidadesVentas!=null) {
				this.jScrollPanelDatosEdicionUtilidadesVentas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadesVentas!=null) {
				this.jTabbedPaneBusquedasUtilidadesVentas.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosUtilidadesVentas!=null) {
				this.jScrollPanelDatosUtilidadesVentas.setVisible(false);
			}
			
			if(this.jPanelPaginacionUtilidadesVentas!=null) {
				this.jPanelPaginacionUtilidadesVentas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUtilidadesVentas!=null) {
				this.jPanelParametrosReportesUtilidadesVentas.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionUtilidadesVentas!=null) {
				this.jScrollPanelDatosEdicionUtilidadesVentas.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadesVentas!=null) {
				this.jTabbedPaneBusquedasUtilidadesVentas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosUtilidadesVentas!=null) {
				this.jScrollPanelDatosUtilidadesVentas.setVisible(false);
			}
			
			if(this.jPanelPaginacionUtilidadesVentas!=null) {
				this.jPanelPaginacionUtilidadesVentas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUtilidadesVentas!=null) {
				this.jPanelParametrosReportesUtilidadesVentas.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionUtilidadesVentas!=null) {
				this.jScrollPanelDatosEdicionUtilidadesVentas.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadesVentas!=null) {
				this.jTabbedPaneBusquedasUtilidadesVentas.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosUtilidadesVentas!=null) {
				this.jScrollPanelDatosUtilidadesVentas.setVisible(false);
			}
			
			if(this.jPanelPaginacionUtilidadesVentas!=null) {
				this.jPanelPaginacionUtilidadesVentas.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesUtilidadesVentas!=null) {
				this.jPanelParametrosReportesUtilidadesVentas.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionUtilidadesVentas!=null) {
				this.jScrollPanelDatosEdicionUtilidadesVentas.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadesVentas!=null) {
				this.jTabbedPaneBusquedasUtilidadesVentas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUtilidadesVentas!=null) {
				this.jScrollPanelDatosUtilidadesVentas.setVisible(true);
			}
			
			if(this.jPanelPaginacionUtilidadesVentas!=null) {
				this.jPanelPaginacionUtilidadesVentas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUtilidadesVentas!=null) {
				this.jPanelParametrosReportesUtilidadesVentas.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionUtilidadesVentas!=null) {
				this.jScrollPanelDatosEdicionUtilidadesVentas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadesVentas!=null) {
				this.jTabbedPaneBusquedasUtilidadesVentas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUtilidadesVentas!=null) {
				this.jScrollPanelDatosUtilidadesVentas.setVisible(true);
			}
			
			if(this.jPanelPaginacionUtilidadesVentas!=null) {
				this.jPanelPaginacionUtilidadesVentas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUtilidadesVentas!=null) {
				this.jPanelParametrosReportesUtilidadesVentas.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionUtilidadesVentas!=null) {
				this.jScrollPanelDatosEdicionUtilidadesVentas.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadesVentas!=null) {
				this.jTabbedPaneBusquedasUtilidadesVentas.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosUtilidadesVentas!=null) {
				this.jScrollPanelDatosUtilidadesVentas.setVisible(true);
			}
			
			if(this.jPanelPaginacionUtilidadesVentas!=null) {
				this.jPanelPaginacionUtilidadesVentas.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesUtilidadesVentas!=null) {
				this.jPanelParametrosReportesUtilidadesVentas.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasUtilidadesVentas!=null) {
					this.jTabbedPaneBusquedasUtilidadesVentas.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesUtilidadesVentas!=null) {
				this.jPanelParametrosReportesUtilidadesVentas.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.utilidadesventasSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasUtilidadesVentas!=null) {
				this.jTabbedPaneBusquedasUtilidadesVentas.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesUtilidadesVentas!=null) {
				this.jPanelParametrosReportesUtilidadesVentas.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaUtilidadesVentas=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaUtilidadesVentas) {this.jTabbedPaneBusquedasUtilidadesVentas.remove(jPanelBusquedaUtilidadesVentasUtilidadesVentas);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaUtilidadesVentas=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaUtilidadesVentas) {this.jTabbedPaneBusquedasUtilidadesVentas.remove(jPanelBusquedaUtilidadesVentasUtilidadesVentas);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaUtilidadesVentas(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioUtilidadesVentas() {
		this.updateBorderResaltarBusquedasFormularioUtilidadesVentas();
		this.updateVisibilidadBusquedasFormularioUtilidadesVentas();
		this.updateHabilitarBusquedasFormularioUtilidadesVentas();
	}
	
	public void updateBorderResaltarBusquedasFormularioUtilidadesVentas() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasUtilidadesVentas.getComponents().length>0) {
	

		if(this.utilidadesventasConstantesFunciones.resaltarBusquedaUtilidadesVentasUtilidadesVentas!=null) {
			index= this.jTabbedPaneBusquedasUtilidadesVentas.indexOfComponent(this.jPanelBusquedaUtilidadesVentasUtilidadesVentas);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUtilidadesVentas.getComponent(index);
				jPanel.setBorder(this.utilidadesventasConstantesFunciones.resaltarBusquedaUtilidadesVentasUtilidadesVentas);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioUtilidadesVentas() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasUtilidadesVentas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasUtilidadesVentas.indexOfComponent(this.jPanelBusquedaUtilidadesVentasUtilidadesVentas);
			jPanel=(JPanel)this.jTabbedPaneBusquedasUtilidadesVentas.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.utilidadesventasConstantesFunciones.mostrarBusquedaUtilidadesVentasUtilidadesVentas);
			if(!this.utilidadesventasConstantesFunciones.mostrarBusquedaUtilidadesVentasUtilidadesVentas && index>-1) {
				this.jTabbedPaneBusquedasUtilidadesVentas.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioUtilidadesVentas() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasUtilidadesVentas.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasUtilidadesVentas.indexOfComponent(this.jPanelBusquedaUtilidadesVentasUtilidadesVentas);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasUtilidadesVentas.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.utilidadesventasConstantesFunciones.activarBusquedaUtilidadesVentasUtilidadesVentas);
				this.jTabbedPaneBusquedasUtilidadesVentas.setEnabledAt(index,this.utilidadesventasConstantesFunciones.activarBusquedaUtilidadesVentasUtilidadesVentas);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaUtilidadesVentas(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaUtilidadesVentas")) {
			index= this.jTabbedPaneBusquedasUtilidadesVentas.indexOfComponent(this.jPanelBusquedaUtilidadesVentasUtilidadesVentas);

			this.jTabbedPaneBusquedasUtilidadesVentas.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasUtilidadesVentas.getComponent(index);

			this.utilidadesventasConstantesFunciones.setResaltarBusquedaUtilidadesVentasUtilidadesVentas(resaltar);

			jPanel.setBorder(this.utilidadesventasConstantesFunciones.resaltarBusquedaUtilidadesVentasUtilidadesVentas);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarUtilidadesVentas.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioUtilidadesVentas() throws Exception {

		if(this.jInternalFrameDetalleFormUtilidadesVentas==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioUtilidadesVentas();
		this.updateVisibilidadResaltarControlesFormularioUtilidadesVentas();
		this.updateHabilitarResaltarControlesFormularioUtilidadesVentas();
		
	}
	
	public void updateBorderResaltarControlesFormularioUtilidadesVentas() throws Exception {
		if(this.jInternalFrameDetalleFormUtilidadesVentas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.utilidadesventasConstantesFunciones.resaltaridUtilidadesVentas!=null && this.jInternalFrameDetalleFormUtilidadesVentas!=null) {this.jInternalFrameDetalleFormUtilidadesVentas.jLabelidUtilidadesVentas.setBorder(this.utilidadesventasConstantesFunciones.resaltaridUtilidadesVentas);}
		if(this.utilidadesventasConstantesFunciones.resaltarid_empresaUtilidadesVentas!=null && this.jInternalFrameDetalleFormUtilidadesVentas!=null) {this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_empresaUtilidadesVentas.setBorder(this.utilidadesventasConstantesFunciones.resaltarid_empresaUtilidadesVentas);}
		if(this.utilidadesventasConstantesFunciones.resaltarid_sucursalUtilidadesVentas!=null && this.jInternalFrameDetalleFormUtilidadesVentas!=null) {this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_sucursalUtilidadesVentas.setBorder(this.utilidadesventasConstantesFunciones.resaltarid_sucursalUtilidadesVentas);}
		if(this.utilidadesventasConstantesFunciones.resaltarfecha_emision_desdeUtilidadesVentas!=null && this.jInternalFrameDetalleFormUtilidadesVentas!=null) {this.jInternalFrameDetalleFormUtilidadesVentas.jDateChooserfecha_emision_desdeUtilidadesVentas.setBorder(this.utilidadesventasConstantesFunciones.resaltarfecha_emision_desdeUtilidadesVentas);}
		if(this.utilidadesventasConstantesFunciones.resaltarfecha_emision_hastaUtilidadesVentas!=null && this.jInternalFrameDetalleFormUtilidadesVentas!=null) {this.jInternalFrameDetalleFormUtilidadesVentas.jDateChooserfecha_emision_hastaUtilidadesVentas.setBorder(this.utilidadesventasConstantesFunciones.resaltarfecha_emision_hastaUtilidadesVentas);}
		if(this.utilidadesventasConstantesFunciones.resaltarnombre_completo_clienteUtilidadesVentas!=null && this.jInternalFrameDetalleFormUtilidadesVentas!=null) {this.jInternalFrameDetalleFormUtilidadesVentas.jTextAreanombre_completo_clienteUtilidadesVentas.setBorder(this.utilidadesventasConstantesFunciones.resaltarnombre_completo_clienteUtilidadesVentas);}
		if(this.utilidadesventasConstantesFunciones.resaltarnombre_tipo_facturaUtilidadesVentas!=null && this.jInternalFrameDetalleFormUtilidadesVentas!=null) {this.jInternalFrameDetalleFormUtilidadesVentas.jTextAreanombre_tipo_facturaUtilidadesVentas.setBorder(this.utilidadesventasConstantesFunciones.resaltarnombre_tipo_facturaUtilidadesVentas);}
		if(this.utilidadesventasConstantesFunciones.resaltarfecha_emisionUtilidadesVentas!=null && this.jInternalFrameDetalleFormUtilidadesVentas!=null) {this.jInternalFrameDetalleFormUtilidadesVentas.jDateChooserfecha_emisionUtilidadesVentas.setBorder(this.utilidadesventasConstantesFunciones.resaltarfecha_emisionUtilidadesVentas);}
		if(this.utilidadesventasConstantesFunciones.resaltarnumero_documentoUtilidadesVentas!=null && this.jInternalFrameDetalleFormUtilidadesVentas!=null) {this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldnumero_documentoUtilidadesVentas.setBorder(this.utilidadesventasConstantesFunciones.resaltarnumero_documentoUtilidadesVentas);}
		if(this.utilidadesventasConstantesFunciones.resaltartipoUtilidadesVentas!=null && this.jInternalFrameDetalleFormUtilidadesVentas!=null) {this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldtipoUtilidadesVentas.setBorder(this.utilidadesventasConstantesFunciones.resaltartipoUtilidadesVentas);}
		if(this.utilidadesventasConstantesFunciones.resaltarventaUtilidadesVentas!=null && this.jInternalFrameDetalleFormUtilidadesVentas!=null) {this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldventaUtilidadesVentas.setBorder(this.utilidadesventasConstantesFunciones.resaltarventaUtilidadesVentas);}
		if(this.utilidadesventasConstantesFunciones.resaltarcostoUtilidadesVentas!=null && this.jInternalFrameDetalleFormUtilidadesVentas!=null) {this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldcostoUtilidadesVentas.setBorder(this.utilidadesventasConstantesFunciones.resaltarcostoUtilidadesVentas);}
		if(this.utilidadesventasConstantesFunciones.resaltarutilidadUtilidadesVentas!=null && this.jInternalFrameDetalleFormUtilidadesVentas!=null) {this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldutilidadUtilidadesVentas.setBorder(this.utilidadesventasConstantesFunciones.resaltarutilidadUtilidadesVentas);}
		if(this.utilidadesventasConstantesFunciones.resaltarporcentajeUtilidadesVentas!=null && this.jInternalFrameDetalleFormUtilidadesVentas!=null) {this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldporcentajeUtilidadesVentas.setBorder(this.utilidadesventasConstantesFunciones.resaltarporcentajeUtilidadesVentas);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioUtilidadesVentas() throws Exception {		
		if(this.jInternalFrameDetalleFormUtilidadesVentas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) {
	
		//this.jInternalFrameDetalleFormUtilidadesVentas.jLabelidUtilidadesVentas.setVisible(this.utilidadesventasConstantesFunciones.mostraridUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jPanelidUtilidadesVentas.setVisible(this.utilidadesventasConstantesFunciones.mostraridUtilidadesVentas);
		//this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_empresaUtilidadesVentas.setVisible(this.utilidadesventasConstantesFunciones.mostrarid_empresaUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jPanelid_empresaUtilidadesVentas.setVisible(this.utilidadesventasConstantesFunciones.mostrarid_empresaUtilidadesVentas);
		//this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_sucursalUtilidadesVentas.setVisible(this.utilidadesventasConstantesFunciones.mostrarid_sucursalUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jPanelid_sucursalUtilidadesVentas.setVisible(this.utilidadesventasConstantesFunciones.mostrarid_sucursalUtilidadesVentas);
		//this.jInternalFrameDetalleFormUtilidadesVentas.jDateChooserfecha_emision_desdeUtilidadesVentas.setVisible(this.utilidadesventasConstantesFunciones.mostrarfecha_emision_desdeUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jPanelfecha_emision_desdeUtilidadesVentas.setVisible(this.utilidadesventasConstantesFunciones.mostrarfecha_emision_desdeUtilidadesVentas);
		//this.jInternalFrameDetalleFormUtilidadesVentas.jDateChooserfecha_emision_hastaUtilidadesVentas.setVisible(this.utilidadesventasConstantesFunciones.mostrarfecha_emision_hastaUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jPanelfecha_emision_hastaUtilidadesVentas.setVisible(this.utilidadesventasConstantesFunciones.mostrarfecha_emision_hastaUtilidadesVentas);
		//this.jInternalFrameDetalleFormUtilidadesVentas.jTextAreanombre_completo_clienteUtilidadesVentas.setVisible(this.utilidadesventasConstantesFunciones.mostrarnombre_completo_clienteUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jPanelnombre_completo_clienteUtilidadesVentas.setVisible(this.utilidadesventasConstantesFunciones.mostrarnombre_completo_clienteUtilidadesVentas);
		//this.jInternalFrameDetalleFormUtilidadesVentas.jTextAreanombre_tipo_facturaUtilidadesVentas.setVisible(this.utilidadesventasConstantesFunciones.mostrarnombre_tipo_facturaUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jPanelnombre_tipo_facturaUtilidadesVentas.setVisible(this.utilidadesventasConstantesFunciones.mostrarnombre_tipo_facturaUtilidadesVentas);
		//this.jInternalFrameDetalleFormUtilidadesVentas.jDateChooserfecha_emisionUtilidadesVentas.setVisible(this.utilidadesventasConstantesFunciones.mostrarfecha_emisionUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jPanelfecha_emisionUtilidadesVentas.setVisible(this.utilidadesventasConstantesFunciones.mostrarfecha_emisionUtilidadesVentas);
		//this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldnumero_documentoUtilidadesVentas.setVisible(this.utilidadesventasConstantesFunciones.mostrarnumero_documentoUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jPanelnumero_documentoUtilidadesVentas.setVisible(this.utilidadesventasConstantesFunciones.mostrarnumero_documentoUtilidadesVentas);
		//this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldtipoUtilidadesVentas.setVisible(this.utilidadesventasConstantesFunciones.mostrartipoUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jPaneltipoUtilidadesVentas.setVisible(this.utilidadesventasConstantesFunciones.mostrartipoUtilidadesVentas);
		//this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldventaUtilidadesVentas.setVisible(this.utilidadesventasConstantesFunciones.mostrarventaUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jPanelventaUtilidadesVentas.setVisible(this.utilidadesventasConstantesFunciones.mostrarventaUtilidadesVentas);
		//this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldcostoUtilidadesVentas.setVisible(this.utilidadesventasConstantesFunciones.mostrarcostoUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jPanelcostoUtilidadesVentas.setVisible(this.utilidadesventasConstantesFunciones.mostrarcostoUtilidadesVentas);
		//this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldutilidadUtilidadesVentas.setVisible(this.utilidadesventasConstantesFunciones.mostrarutilidadUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jPanelutilidadUtilidadesVentas.setVisible(this.utilidadesventasConstantesFunciones.mostrarutilidadUtilidadesVentas);
		//this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldporcentajeUtilidadesVentas.setVisible(this.utilidadesventasConstantesFunciones.mostrarporcentajeUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jPanelporcentajeUtilidadesVentas.setVisible(this.utilidadesventasConstantesFunciones.mostrarporcentajeUtilidadesVentas);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioUtilidadesVentas() throws Exception {
		if(this.jInternalFrameDetalleFormUtilidadesVentas==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormUtilidadesVentas!=null) {
	
		this.jInternalFrameDetalleFormUtilidadesVentas.jLabelidUtilidadesVentas.setEnabled(this.utilidadesventasConstantesFunciones.activaridUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_empresaUtilidadesVentas.setEnabled(this.utilidadesventasConstantesFunciones.activarid_empresaUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jComboBoxid_sucursalUtilidadesVentas.setEnabled(this.utilidadesventasConstantesFunciones.activarid_sucursalUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jDateChooserfecha_emision_desdeUtilidadesVentas.setEnabled(this.utilidadesventasConstantesFunciones.activarfecha_emision_desdeUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jDateChooserfecha_emision_hastaUtilidadesVentas.setEnabled(this.utilidadesventasConstantesFunciones.activarfecha_emision_hastaUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jTextAreanombre_completo_clienteUtilidadesVentas.setEnabled(this.utilidadesventasConstantesFunciones.activarnombre_completo_clienteUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jTextAreanombre_tipo_facturaUtilidadesVentas.setEnabled(this.utilidadesventasConstantesFunciones.activarnombre_tipo_facturaUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jDateChooserfecha_emisionUtilidadesVentas.setEnabled(this.utilidadesventasConstantesFunciones.activarfecha_emisionUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldnumero_documentoUtilidadesVentas.setEnabled(this.utilidadesventasConstantesFunciones.activarnumero_documentoUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldtipoUtilidadesVentas.setEnabled(this.utilidadesventasConstantesFunciones.activartipoUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldventaUtilidadesVentas.setEnabled(this.utilidadesventasConstantesFunciones.activarventaUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldcostoUtilidadesVentas.setEnabled(this.utilidadesventasConstantesFunciones.activarcostoUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldutilidadUtilidadesVentas.setEnabled(this.utilidadesventasConstantesFunciones.activarutilidadUtilidadesVentas);
		this.jInternalFrameDetalleFormUtilidadesVentas.jTextFieldporcentajeUtilidadesVentas.setEnabled(this.utilidadesventasConstantesFunciones.activarporcentajeUtilidadesVentas);
		}
	}
	
		
}