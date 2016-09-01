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
package com.bydan.erp.comisiones.presentation.swing.jinternalframes;




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

import com.bydan.erp.comisiones.util.ComisionLineaConstantesFunciones;
import com.bydan.erp.comisiones.util.ComisionLineaParameterReturnGeneral;
//import com.bydan.erp.comisiones.util.ComisionLineaParameterGeneral;
//import com.bydan.erp.comisiones.presentation.report.source.ComisionLineaBean;
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

import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.comisiones.resources.reportes.AuxiliarReportes;


import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.comisiones.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.comisiones.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ComisionLineaBeanSwingJInternalFrame extends ComisionLineaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ComisionLineaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ComisionLinea> comisionlineaValidator = new ClassValidator<ComisionLinea>(ComisionLinea.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ComisionLinea comisionlinea;	
	public ComisionLinea comisionlineaAux;
	public ComisionLinea comisionlineaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ComisionLinea comisionlineaTotales;
	public Long idComisionLineaActual;
	public Long iIdNuevoComisionLinea=0L;
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

	public String sFinalQueryComboComisionConfig="";

	public List<ComisionConfig> comisionconfigsForeignKey;

	public List<ComisionConfig> getcomisionconfigsForeignKey() {
		return comisionconfigsForeignKey;
	}

	public void setcomisionconfigsForeignKey(List<ComisionConfig> comisionconfigsForeignKey) {
		this.comisionconfigsForeignKey = comisionconfigsForeignKey;
	}

	//OBJETO FK ACTUAL
	public ComisionConfig comisionconfigForeignKey;

	public ComisionConfig getcomisionconfigForeignKey() {
		return comisionconfigForeignKey;
	}

	public void setcomisionconfigForeignKey(ComisionConfig comisionconfigForeignKey) {
		this.comisionconfigForeignKey = comisionconfigForeignKey;
	}

	public String sFinalQueryComboVendedor="";

	public List<Vendedor> vendedorsForeignKey;

	public List<Vendedor> getvendedorsForeignKey() {
		return vendedorsForeignKey;
	}

	public void setvendedorsForeignKey(List<Vendedor> vendedorsForeignKey) {
		this.vendedorsForeignKey = vendedorsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Vendedor vendedorForeignKey;

	public Vendedor getvendedorForeignKey() {
		return vendedorForeignKey;
	}

	public void setvendedorForeignKey(Vendedor vendedorForeignKey) {
		this.vendedorForeignKey = vendedorForeignKey;
	}

	public String sFinalQueryComboLinea="";

	public List<Linea> lineasForeignKey;

	public List<Linea> getlineasForeignKey() {
		return lineasForeignKey;
	}

	public void setlineasForeignKey(List<Linea> lineasForeignKey) {
		this.lineasForeignKey = lineasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineaForeignKey;

	public Linea getlineaForeignKey() {
		return lineaForeignKey;
	}

	public void setlineaForeignKey(Linea lineaForeignKey) {
		this.lineaForeignKey = lineaForeignKey;
	}

	public String sFinalQueryComboEstadoComision="";

	public List<EstadoComision> estadocomisionsForeignKey;

	public List<EstadoComision> getestadocomisionsForeignKey() {
		return estadocomisionsForeignKey;
	}

	public void setestadocomisionsForeignKey(List<EstadoComision> estadocomisionsForeignKey) {
		this.estadocomisionsForeignKey = estadocomisionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public EstadoComision estadocomisionForeignKey;

	public EstadoComision getestadocomisionForeignKey() {
		return estadocomisionForeignKey;
	}

	public void setestadocomisionForeignKey(EstadoComision estadocomisionForeignKey) {
		this.estadocomisionForeignKey = estadocomisionForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idVendedorActual=0L;

	public Long getidVendedorActual() {
		return idVendedorActual;
	}

	public void setidVendedorActual(Long idVendedorActual) {
		this.idVendedorActual= idVendedorActual;
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
	
	public Boolean isPermisoTodoComisionLinea;
	public Boolean isPermisoNuevoComisionLinea;
	public Boolean isPermisoActualizarComisionLinea;
	public Boolean isPermisoActualizarOriginalComisionLinea;
	public Boolean isPermisoEliminarComisionLinea;
	public Boolean isPermisoGuardarCambiosComisionLinea;
	public Boolean isPermisoConsultaComisionLinea;
	public Boolean isPermisoBusquedaComisionLinea;
	public Boolean isPermisoReporteComisionLinea;
	public Boolean isPermisoPaginacionMedioComisionLinea;
	public Boolean isPermisoPaginacionAltoComisionLinea;
	public Boolean isPermisoPaginacionTodoComisionLinea;
	public Boolean isPermisoCopiarComisionLinea;
	public Boolean isPermisoVerFormComisionLinea;
	public Boolean isPermisoDuplicarComisionLinea;
	public Boolean isPermisoOrdenComisionLinea;
	
	
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
	
	public ComisionLineaParameterReturnGeneral comisionlineaReturnGeneral;
	public ComisionLineaParameterReturnGeneral comisionlineaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoComisionLinea=false;
	public Boolean esParaAccionDesdeFormularioComisionLinea=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ComisionLineaSessionBeanAdditional comisionlineaSessionBeanAdditional=null;
	
	public ComisionLineaSessionBeanAdditional getComisionLineaSessionBeanAdditional() {
		return this.comisionlineaSessionBeanAdditional;
	}
	
	public void setComisionLineaSessionBeanAdditional(ComisionLineaSessionBeanAdditional comisionlineaSessionBeanAdditional) {
		try {
			this.comisionlineaSessionBeanAdditional=comisionlineaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ComisionLineaBeanSwingJInternalFrameAdditional comisionlineaBeanSwingJInternalFrameAdditional=null;
	//public class ComisionLineaBeanSwingJInternalFrame
	
	public ComisionLineaBeanSwingJInternalFrameAdditional getComisionLineaBeanSwingJInternalFrameAdditional() {
		return this.comisionlineaBeanSwingJInternalFrameAdditional;
	}
	
	public void setComisionLineaBeanSwingJInternalFrameAdditional(ComisionLineaBeanSwingJInternalFrameAdditional comisionlineaBeanSwingJInternalFrameAdditional) {
		try {
			this.comisionlineaBeanSwingJInternalFrameAdditional=comisionlineaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ComisionLineaLogic comisionlineaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ComisionLinea comisionlineaBean;
	public ComisionLineaConstantesFunciones comisionlineaConstantesFunciones;
	//public ComisionLineaParameterReturnGeneral comisionlineaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ComisionConfigLogic comisionconfigLogic;
	public VendedorLogic vendedorLogic;
	public LineaLogic lineaLogic;
	public EstadoComisionLogic estadocomisionLogic;
	
	//PARAMETROS
	
	
	//public List<ComisionLinea> comisionlineas;	
	//public List<ComisionLinea> comisionlineasEliminados;
	//public List<ComisionLinea> comisionlineasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoComisionLinea=false;
	public Boolean isVisibilidadCeldaDuplicarComisionLinea=true;
	public Boolean isVisibilidadCeldaCopiarComisionLinea=true;
	public Boolean isVisibilidadCeldaVerFormComisionLinea=true;
	public Boolean isVisibilidadCeldaOrdenComisionLinea=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesComisionLinea=false;
	public Boolean isVisibilidadCeldaModificarComisionLinea=false;
	public Boolean isVisibilidadCeldaActualizarComisionLinea=false;
	public Boolean isVisibilidadCeldaEliminarComisionLinea=false;
	public Boolean isVisibilidadCeldaCancelarComisionLinea=false;
	public Boolean isVisibilidadCeldaGuardarComisionLinea=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosComisionLinea=false;	
	
	
	public Boolean isVisibilidadFK_IdComisionConfig=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstadoComision=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdVendedor=false;
	
	public Long getiIdNuevoComisionLinea() {
		return this.iIdNuevoComisionLinea;
	}

	public void setiIdNuevoComisionLinea(Long iIdNuevoComisionLinea) {
		this.iIdNuevoComisionLinea = iIdNuevoComisionLinea;
	}
	
	public Long getidComisionLineaActual() {
		return this.idComisionLineaActual;
	}

	public void setidComisionLineaActual(Long idComisionLineaActual) {
		this.idComisionLineaActual = idComisionLineaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ComisionLinea getcomisionlinea() {
		return this.comisionlinea;
	}

	public void setcomisionlinea(ComisionLinea comisionlinea) {
		this.comisionlinea = comisionlinea;
	}
	
	public ComisionLinea getcomisionlineaAux() {
		return this.comisionlineaAux;
	}

	public void setcomisionlineaAux(ComisionLinea comisionlineaAux) {
		this.comisionlineaAux = comisionlineaAux;
	}				
	
	public ComisionLinea getcomisionlineaAnterior() {
		return this.comisionlineaAnterior;
	}

	public void setcomisionlineaAnterior(ComisionLinea comisionlineaAnterior) {
		this.comisionlineaAnterior = comisionlineaAnterior;
	}	
	
	public ComisionLinea getcomisionlineaTotales() {
		return this.comisionlineaTotales;
	}

	public void setcomisionlineaTotales(ComisionLinea comisionlineaTotales) {
		this.comisionlineaTotales = comisionlineaTotales;
	}	
	
	public ComisionLinea getcomisionlineaBean() {
		return this.comisionlineaBean;
	}

	public void setcomisionlineaBean(ComisionLinea comisionlineaBean) {
		this.comisionlineaBean = comisionlineaBean;
	}	
	
	public ComisionLineaParameterReturnGeneral getcomisionlineaReturnGeneral() {
		return this.comisionlineaReturnGeneral;
	}

	public void setcomisionlineaReturnGeneral(ComisionLineaParameterReturnGeneral comisionlineaReturnGeneral) {
		this.comisionlineaReturnGeneral = comisionlineaReturnGeneral;
	}	
	
	
	public Long id_comision_configFK_IdComisionConfig=-1L;

	public Long getid_comision_configFK_IdComisionConfig() {
		return this.id_comision_configFK_IdComisionConfig;
	}

	public void setid_comision_configFK_IdComisionConfig(Long id_comision_configFK_IdComisionConfig) {
		this.id_comision_configFK_IdComisionConfig = id_comision_configFK_IdComisionConfig;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_estado_comisionFK_IdEstadoComision=-1L;

	public Long getid_estado_comisionFK_IdEstadoComision() {
		return this.id_estado_comisionFK_IdEstadoComision;
	}

	public void setid_estado_comisionFK_IdEstadoComision(Long id_estado_comisionFK_IdEstadoComision) {
		this.id_estado_comisionFK_IdEstadoComision = id_estado_comisionFK_IdEstadoComision;
	}

	public Long id_lineaFK_IdLinea=-1L;

	public Long getid_lineaFK_IdLinea() {
		return this.id_lineaFK_IdLinea;
	}

	public void setid_lineaFK_IdLinea(Long id_lineaFK_IdLinea) {
		this.id_lineaFK_IdLinea = id_lineaFK_IdLinea;
	}

	public Long id_vendedorFK_IdVendedor=-1L;

	public Long getid_vendedorFK_IdVendedor() {
		return this.id_vendedorFK_IdVendedor;
	}

	public void setid_vendedorFK_IdVendedor(Long id_vendedorFK_IdVendedor) {
		this.id_vendedorFK_IdVendedor = id_vendedorFK_IdVendedor;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ComisionLineaLogic getComisionLineaLogic()	{		
		return comisionlineaLogic;
	}

	public void setComisionLineaLogic(ComisionLineaLogic comisionlineaLogic) {
		this.comisionlineaLogic = comisionlineaLogic;
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
	
	public Boolean getIsEsNuevoComisionLinea() {
		return isEsNuevoComisionLinea;
	}

	public void setIsEsNuevoComisionLinea(Boolean isEsNuevoComisionLinea) {
		this.isEsNuevoComisionLinea = isEsNuevoComisionLinea;
	}

	public Boolean getEsParaAccionDesdeFormularioComisionLinea() {
		return esParaAccionDesdeFormularioComisionLinea;
	}
	
	public void setEsParaAccionDesdeFormularioComisionLinea(Boolean esParaAccionDesdeFormularioComisionLinea) {
		this.esParaAccionDesdeFormularioComisionLinea = esParaAccionDesdeFormularioComisionLinea;
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

			if(this.comisionlineaSessionBean==null) {
				this.comisionlineaSessionBean=new ComisionLineaSessionBean();
			}

			if(!this.comisionlineaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(comisionlineaSessionBean.getlidEmpresaActual());
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

	public void cargarCombosComisionConfigsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.comisionconfigsForeignKey=new ArrayList<ComisionConfig>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ComisionConfigLogic comisionconfigLogic=new ComisionConfigLogic();

			//comisionconfigLogic.getComisionConfigDataAccess().setIsForForeingKeyData(true);

			if(this.comisionlineaSessionBean==null) {
				this.comisionlineaSessionBean=new ComisionLineaSessionBean();
			}

			if(!this.comisionlineaSessionBean.getisBusquedaDesdeForeignKeySesionComisionConfig()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comisionconfigLogic.getComisionConfigDataAccess().setIsForForeingKeyData(true);

					comisionconfigLogic.getTodosComisionConfigsWithConnection(sFinalQuery,new Pagination());

					this.comisionconfigsForeignKey=comisionconfigLogic.getComisionConfigs();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaComisionConfig(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionconfigLogic.getEntityWithConnection(comisionlineaSessionBean.getlidComisionConfigActual());
					this.comisionconfigsForeignKey.add(comisionconfigLogic.getComisionConfig());
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

	public void cargarCombosVendedorsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.vendedorsForeignKey=new ArrayList<Vendedor>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			VendedorLogic vendedorLogic=new VendedorLogic();

			//vendedorLogic.getVendedorDataAccess().setIsForForeingKeyData(true);

			if(this.comisionlineaSessionBean==null) {
				this.comisionlineaSessionBean=new ComisionLineaSessionBean();
			}

			if(!this.comisionlineaSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//vendedorLogic.getVendedorDataAccess().setIsForForeingKeyData(true);

					vendedorLogic.getTodosVendedorsWithConnection(sFinalQuery,new Pagination());

					this.vendedorsForeignKey=vendedorLogic.getVendedors();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaVendedor(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorLogic.getEntityWithConnection(comisionlineaSessionBean.getlidVendedorActual());
					this.vendedorsForeignKey.add(vendedorLogic.getVendedor());
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

	public void cargarCombosLineasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.comisionlineaSessionBean==null) {
				this.comisionlineaSessionBean=new ComisionLineaSessionBean();
			}

			if(!this.comisionlineaSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLinea(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(comisionlineaSessionBean.getlidLineaActual());
					this.lineasForeignKey.add(lineaLogic.getLinea());
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

	public void cargarCombosEstadoComisionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estadocomisionsForeignKey=new ArrayList<EstadoComision>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstadoComisionLogic estadocomisionLogic=new EstadoComisionLogic();

			//estadocomisionLogic.getEstadoComisionDataAccess().setIsForForeingKeyData(true);

			if(this.comisionlineaSessionBean==null) {
				this.comisionlineaSessionBean=new ComisionLineaSessionBean();
			}

			if(!this.comisionlineaSessionBean.getisBusquedaDesdeForeignKeySesionEstadoComision()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadocomisionLogic.getEstadoComisionDataAccess().setIsForForeingKeyData(true);

					estadocomisionLogic.getTodosEstadoComisionsWithConnection(sFinalQuery,new Pagination());

					this.estadocomisionsForeignKey=estadocomisionLogic.getEstadoComisions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstadoComision(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadocomisionLogic.getEntityWithConnection(comisionlineaSessionBean.getlidEstadoComisionActual());
					this.estadocomisionsForeignKey.add(estadocomisionLogic.getEstadoComision());
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

					if(this.comisionlinea!=null) {
						this.comisionlinea.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormComisionLinea!=null) {
						this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_empresaComisionLinea.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaComisionLinea.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormComisionLinea!=null) {
						if(this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_empresaComisionLinea.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_empresaComisionLinea.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaComisionLineaGenerico)throws Exception
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
				jComboBoxid_empresaComisionLineaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaComisionLineaGenerico!=null && jComboBoxid_empresaComisionLineaGenerico.getItemCount()>0) {
					jComboBoxid_empresaComisionLineaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualComisionConfigForeignKey(Long idComisionConfigSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			ComisionConfig  comisionconfigTemp=null;

			for(ComisionConfig comisionconfigAux:comisionconfigsForeignKey) {
				if(comisionconfigAux.getId()!=null && comisionconfigAux.getId().equals(idComisionConfigSeleccionado)) {
					comisionconfigTemp=comisionconfigAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(comisionconfigTemp!=null) {

					if(this.comisionlinea!=null) {
						this.comisionlinea.setComisionConfig(comisionconfigTemp);
					}

					if(this.jInternalFrameDetalleFormComisionLinea!=null) {
						this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_comision_configComisionLinea.setSelectedItem(comisionconfigTemp);
					}
				} else {
					//jComboBoxid_comision_configComisionLinea.setSelectedItem(comisionconfigTemp);
					if(this.jInternalFrameDetalleFormComisionLinea!=null) {
						if(this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_comision_configComisionLinea.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_comision_configComisionLinea.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdComisionConfig") || sFormularioTipoBusqueda.equals("Todos")){
					if(comisionconfigTemp!=null && jComboBoxid_comision_configFK_IdComisionConfigComisionLinea!=null) {
						jComboBoxid_comision_configFK_IdComisionConfigComisionLinea.setSelectedItem(comisionconfigTemp);
					} else {
						if(jComboBoxid_comision_configFK_IdComisionConfigComisionLinea!=null) {
							//jComboBoxid_comision_configFK_IdComisionConfigComisionLinea.setSelectedItem(comisionconfigTemp);
							if(jComboBoxid_comision_configFK_IdComisionConfigComisionLinea.getItemCount()>0) {
								jComboBoxid_comision_configFK_IdComisionConfigComisionLinea.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualComisionConfigForeignKeyDescripcion(Long idComisionConfigSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			ComisionConfig  comisionconfigTemp=null;

			for(ComisionConfig comisionconfigAux:comisionconfigsForeignKey) {
				if(comisionconfigAux.getId()!=null && comisionconfigAux.getId().equals(idComisionConfigSeleccionado)) {
					comisionconfigTemp=comisionconfigAux;
					break;
				}
			}


			sDescripcion=ComisionConfigConstantesFunciones.getComisionConfigDescripcion(comisionconfigTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualComisionConfigForeignKeyGenerico(Long idComisionConfigSeleccionado,JComboBox jComboBoxid_comision_configComisionLineaGenerico)throws Exception
	{
		try
		{
			ComisionConfig  comisionconfigTemp=null;

			for(ComisionConfig comisionconfigAux:comisionconfigsForeignKey) {
				if(comisionconfigAux.getId()!=null && comisionconfigAux.getId().equals(idComisionConfigSeleccionado)) {
					comisionconfigTemp=comisionconfigAux;
					break;
				}
			}

			if(comisionconfigTemp!=null) {
				jComboBoxid_comision_configComisionLineaGenerico.setSelectedItem(comisionconfigTemp);
			} else {
				if(jComboBoxid_comision_configComisionLineaGenerico!=null && jComboBoxid_comision_configComisionLineaGenerico.getItemCount()>0) {
					jComboBoxid_comision_configComisionLineaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualVendedorForeignKey(Long idVendedorSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(vendedorTemp!=null) {

					if(this.comisionlinea!=null) {
						this.comisionlinea.setVendedor(vendedorTemp);
					}

					if(this.jInternalFrameDetalleFormComisionLinea!=null) {
						this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_vendedorComisionLinea.setSelectedItem(vendedorTemp);
					}
				} else {
					//jComboBoxid_vendedorComisionLinea.setSelectedItem(vendedorTemp);
					if(this.jInternalFrameDetalleFormComisionLinea!=null) {
						if(this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_vendedorComisionLinea.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_vendedorComisionLinea.setSelectedIndex(0);
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

	public String getActualVendedorForeignKeyDescripcion(Long idVendedorSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}


			sDescripcion=VendedorConstantesFunciones.getVendedorDescripcion(vendedorTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualVendedorForeignKeyGenerico(Long idVendedorSeleccionado,JComboBox jComboBoxid_vendedorComisionLineaGenerico)throws Exception
	{
		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}

			if(vendedorTemp!=null) {
				jComboBoxid_vendedorComisionLineaGenerico.setSelectedItem(vendedorTemp);
			} else {
				if(jComboBoxid_vendedorComisionLineaGenerico!=null && jComboBoxid_vendedorComisionLineaGenerico.getItemCount()>0) {
					jComboBoxid_vendedorComisionLineaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaForeignKey(Long idLineaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineaTemp!=null) {

					if(this.comisionlinea!=null) {
						this.comisionlinea.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormComisionLinea!=null) {
						this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_lineaComisionLinea.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaComisionLinea.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormComisionLinea!=null) {
						if(this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_lineaComisionLinea.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_lineaComisionLinea.setSelectedIndex(0);
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

	public String getActualLineaForeignKeyDescripcion(Long idLineaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaComisionLineaGenerico)throws Exception
	{
		try
		{
			Linea  lineaTemp=null;

			for(Linea lineaAux:lineasForeignKey) {
				if(lineaAux.getId()!=null && lineaAux.getId().equals(idLineaSeleccionado)) {
					lineaTemp=lineaAux;
					break;
				}
			}

			if(lineaTemp!=null) {
				jComboBoxid_lineaComisionLineaGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaComisionLineaGenerico!=null && jComboBoxid_lineaComisionLineaGenerico.getItemCount()>0) {
					jComboBoxid_lineaComisionLineaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstadoComisionForeignKey(Long idEstadoComisionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			EstadoComision  estadocomisionTemp=null;

			for(EstadoComision estadocomisionAux:estadocomisionsForeignKey) {
				if(estadocomisionAux.getId()!=null && estadocomisionAux.getId().equals(idEstadoComisionSeleccionado)) {
					estadocomisionTemp=estadocomisionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estadocomisionTemp!=null) {

					if(this.comisionlinea!=null) {
						this.comisionlinea.setEstadoComision(estadocomisionTemp);
					}

					if(this.jInternalFrameDetalleFormComisionLinea!=null) {
						this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_estado_comisionComisionLinea.setSelectedItem(estadocomisionTemp);
					}
				} else {
					//jComboBoxid_estado_comisionComisionLinea.setSelectedItem(estadocomisionTemp);
					if(this.jInternalFrameDetalleFormComisionLinea!=null) {
						if(this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_estado_comisionComisionLinea.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_estado_comisionComisionLinea.setSelectedIndex(0);
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

	public String getActualEstadoComisionForeignKeyDescripcion(Long idEstadoComisionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			EstadoComision  estadocomisionTemp=null;

			for(EstadoComision estadocomisionAux:estadocomisionsForeignKey) {
				if(estadocomisionAux.getId()!=null && estadocomisionAux.getId().equals(idEstadoComisionSeleccionado)) {
					estadocomisionTemp=estadocomisionAux;
					break;
				}
			}


			sDescripcion=EstadoComisionConstantesFunciones.getEstadoComisionDescripcion(estadocomisionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstadoComisionForeignKeyGenerico(Long idEstadoComisionSeleccionado,JComboBox jComboBoxid_estado_comisionComisionLineaGenerico)throws Exception
	{
		try
		{
			EstadoComision  estadocomisionTemp=null;

			for(EstadoComision estadocomisionAux:estadocomisionsForeignKey) {
				if(estadocomisionAux.getId()!=null && estadocomisionAux.getId().equals(idEstadoComisionSeleccionado)) {
					estadocomisionTemp=estadocomisionAux;
					break;
				}
			}

			if(estadocomisionTemp!=null) {
				jComboBoxid_estado_comisionComisionLineaGenerico.setSelectedItem(estadocomisionTemp);
			} else {
				if(jComboBoxid_estado_comisionComisionLineaGenerico!=null && jComboBoxid_estado_comisionComisionLineaGenerico.getItemCount()>0) {
					jComboBoxid_estado_comisionComisionLineaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ComisionLinea comisionlinea,JComboBox jComboBoxid_empresaComisionLineaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaComisionLineaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_empresaComisionLinea.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaComisionLineaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				comisionlinea.setid_empresa(empresaAux.getId());
				comisionlinea.setempresa_descripcion(ComisionLineaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				comisionlinea.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarComisionConfigForeignKey(ComisionLinea comisionlinea,JComboBox jComboBoxid_comision_configComisionLineaGenerico)throws Exception
	{
		try
		{
			ComisionConfig  comisionconfigAux=new ComisionConfig();

			if(jComboBoxid_comision_configComisionLineaGenerico==null) {
				comisionconfigAux=(ComisionConfig)this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_comision_configComisionLinea.getSelectedItem();
			} else {
				comisionconfigAux=(ComisionConfig)jComboBoxid_comision_configComisionLineaGenerico.getSelectedItem();
			}

			if(comisionconfigAux!=null && comisionconfigAux.getId()!=null) {
				comisionlinea.setid_comision_config(comisionconfigAux.getId());
				comisionlinea.setcomisionconfig_descripcion(ComisionLineaConstantesFunciones.getComisionConfigDescripcion(comisionconfigAux));
				comisionlinea.setComisionConfig(comisionconfigAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarVendedorForeignKey(ComisionLinea comisionlinea,JComboBox jComboBoxid_vendedorComisionLineaGenerico)throws Exception
	{
		try
		{
			Vendedor  vendedorAux=new Vendedor();

			if(jComboBoxid_vendedorComisionLineaGenerico==null) {
				vendedorAux=(Vendedor)this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_vendedorComisionLinea.getSelectedItem();
			} else {
				vendedorAux=(Vendedor)jComboBoxid_vendedorComisionLineaGenerico.getSelectedItem();
			}

			if(vendedorAux!=null && vendedorAux.getId()!=null) {
				comisionlinea.setid_vendedor(vendedorAux.getId());
				comisionlinea.setvendedor_descripcion(ComisionLineaConstantesFunciones.getVendedorDescripcion(vendedorAux));
				comisionlinea.setVendedor(vendedorAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(ComisionLinea comisionlinea,JComboBox jComboBoxid_lineaComisionLineaGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaComisionLineaGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_lineaComisionLinea.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaComisionLineaGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				comisionlinea.setid_linea(lineaAux.getId());
				comisionlinea.setlinea_descripcion(ComisionLineaConstantesFunciones.getLineaDescripcion(lineaAux));
				comisionlinea.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstadoComisionForeignKey(ComisionLinea comisionlinea,JComboBox jComboBoxid_estado_comisionComisionLineaGenerico)throws Exception
	{
		try
		{
			EstadoComision  estadocomisionAux=new EstadoComision();

			if(jComboBoxid_estado_comisionComisionLineaGenerico==null) {
				estadocomisionAux=(EstadoComision)this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_estado_comisionComisionLinea.getSelectedItem();
			} else {
				estadocomisionAux=(EstadoComision)jComboBoxid_estado_comisionComisionLineaGenerico.getSelectedItem();
			}

			if(estadocomisionAux!=null && estadocomisionAux.getId()!=null) {
				comisionlinea.setid_estado_comision(estadocomisionAux.getId());
				comisionlinea.setestadocomision_descripcion(ComisionLineaConstantesFunciones.getEstadoComisionDescripcion(estadocomisionAux));
				comisionlinea.setEstadoComision(estadocomisionAux);			}
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

					if(!ComisionLineaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionLinea!=null) { 
							this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_empresaComisionLinea.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_empresaComisionLinea.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionLinea!=null) { 
					}

					if(!ComisionLineaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameComisionConfigsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingComisionConfig=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ComisionLineaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionLinea!=null) { 
							this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_comision_configComisionLinea.removeAllItems();

							for(ComisionConfig comisionconfig:this.comisionconfigsForeignKey) {
								this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_comision_configComisionLinea.addItem(comisionconfig);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionLinea!=null) { 
					}

					if(!ComisionLineaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdComisionConfig") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ComisionLineaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_comision_configFK_IdComisionConfigComisionLinea.removeAllItems();

							for(ComisionConfig comisionconfig:this.comisionconfigsForeignKey) {
								this.jComboBoxid_comision_configFK_IdComisionConfigComisionLinea.addItem(comisionconfig);
							}
						}

						if(!ComisionLineaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameVendedorsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingVendedor=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ComisionLineaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionLinea!=null) { 
							this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_vendedorComisionLinea.removeAllItems();

							for(Vendedor vendedor:this.vendedorsForeignKey) {
								this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_vendedorComisionLinea.addItem(vendedor);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionLinea!=null) { 
					}

					if(!ComisionLineaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ComisionLineaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionLinea!=null) { 
							this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_lineaComisionLinea.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_lineaComisionLinea.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionLinea!=null) { 
					}

					if(!ComisionLineaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstadoComisionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstadoComision=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ComisionLineaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionLinea!=null) { 
							this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_estado_comisionComisionLinea.removeAllItems();

							for(EstadoComision estadocomision:this.estadocomisionsForeignKey) {
								this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_estado_comisionComisionLinea.addItem(estadocomision);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionLinea!=null) { 
					}

					if(!ComisionLineaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormComisionLinea!=null) {
							this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_empresaComisionLinea.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionLinea!=null) {
							this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_empresaComisionLinea.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameComisionConfigForeignKey(ComisionConfig comisionconfig,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormComisionLinea!=null) {
							this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_comision_configComisionLinea.setSelectedItem(comisionconfig);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionLinea!=null) {
							this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_comision_configComisionLinea.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_comision_configFK_IdComisionConfigComisionLinea.setSelectedItem(comisionconfig);
						} else {
							this.jComboBoxid_comision_configFK_IdComisionConfigComisionLinea.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameVendedorForeignKey(Vendedor vendedor,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormComisionLinea!=null) {
							this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_vendedorComisionLinea.setSelectedItem(vendedor);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionLinea!=null) {
							this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_vendedorComisionLinea.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameLineaForeignKey(Linea linea,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormComisionLinea!=null) {
							this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_lineaComisionLinea.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionLinea!=null) {
							this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_lineaComisionLinea.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEstadoComisionForeignKey(EstadoComision estadocomision,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormComisionLinea!=null) {
							this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_estado_comisionComisionLinea.setSelectedItem(estadocomision);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionLinea!=null) {
							this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_estado_comisionComisionLinea.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesComisionLinea() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ComisionLineaConstantesFunciones.refrescarForeignKeysDescripcionesComisionLinea(this.comisionlineaLogic.getComisionLineas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ComisionLineaConstantesFunciones.refrescarForeignKeysDescripcionesComisionLinea(this.comisionlineas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(ComisionConfig.class));
		classes.add(new Classe(Vendedor.class));
		classes.add(new Classe(Linea.class));
		classes.add(new Classe(EstadoComision.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//comisionlineaLogic.setComisionLineas(this.comisionlineas);
			comisionlineaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ComisionLineaParameterReturnGeneral getComisionLineaParameterGeneral() {
		return this.comisionlineaParameterGeneral;
	}
	
	public void setComisionLineaParameterGeneral(ComisionLineaParameterReturnGeneral comisionlineaParameterGeneral) {
		this.comisionlineaParameterGeneral = comisionlineaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoComisionLinea() {
		return isPermisoTodoComisionLinea;
	}

	public void setIsPermisoTodoComisionLinea(Boolean isPermisoTodoComisionLinea) {
		this.isPermisoTodoComisionLinea = isPermisoTodoComisionLinea;
	}

	public Boolean getIsPermisoNuevoComisionLinea() {
		return isPermisoNuevoComisionLinea;
	}

	public void setIsPermisoNuevoComisionLinea(Boolean isPermisoNuevoComisionLinea) {
		this.isPermisoNuevoComisionLinea = isPermisoNuevoComisionLinea;
	}

	public Boolean getIsPermisoActualizarComisionLinea() {
		return isPermisoActualizarComisionLinea;
	}

	public void setIsPermisoActualizarComisionLinea(Boolean isPermisoActualizarComisionLinea) {
		this.isPermisoActualizarComisionLinea = isPermisoActualizarComisionLinea;
	}

	public Boolean getIsPermisoEliminarComisionLinea() {
		return isPermisoEliminarComisionLinea;
	}

	public void setIsPermisoEliminarComisionLinea(Boolean isPermisoEliminarComisionLinea) {
		this.isPermisoEliminarComisionLinea = isPermisoEliminarComisionLinea;
	}

	public Boolean getIsPermisoGuardarCambiosComisionLinea() {
		return isPermisoGuardarCambiosComisionLinea;
	}

	public void setIsPermisoGuardarCambiosComisionLinea(Boolean isPermisoGuardarCambiosComisionLinea) {
		this.isPermisoGuardarCambiosComisionLinea = isPermisoGuardarCambiosComisionLinea;
	}
	
	public Boolean getIsPermisoConsultaComisionLinea() {
		return isPermisoConsultaComisionLinea;
	}

	public void setIsPermisoConsultaComisionLinea(Boolean isPermisoConsultaComisionLinea) {
		this.isPermisoConsultaComisionLinea = isPermisoConsultaComisionLinea;
	}

	public Boolean getIsPermisoBusquedaComisionLinea() {
		return isPermisoBusquedaComisionLinea;
	}

	public void setIsPermisoBusquedaComisionLinea(Boolean isPermisoBusquedaComisionLinea) {
		this.isPermisoBusquedaComisionLinea = isPermisoBusquedaComisionLinea;
	}

	public Boolean getIsPermisoReporteComisionLinea() {
		return isPermisoReporteComisionLinea;
	}

	public void setIsPermisoReporteComisionLinea(Boolean isPermisoReporteComisionLinea) {
		this.isPermisoReporteComisionLinea = isPermisoReporteComisionLinea;
	}
	
	public Boolean getIsPermisoPaginacionMedioComisionLinea() {
		return isPermisoPaginacionMedioComisionLinea;
	}

	public void setIsPermisoPaginacionMedioComisionLinea(Boolean isPermisoPaginacionMedioComisionLinea) {
		this.isPermisoPaginacionMedioComisionLinea = isPermisoPaginacionMedioComisionLinea;
	}
	
	public Boolean getIsPermisoPaginacionTodoComisionLinea() {
		return isPermisoPaginacionTodoComisionLinea;
	}

	public void setIsPermisoPaginacionTodoComisionLinea(Boolean isPermisoPaginacionTodoComisionLinea) {
		this.isPermisoPaginacionTodoComisionLinea = isPermisoPaginacionTodoComisionLinea;
	}
	
	public Boolean getIsPermisoPaginacionAltoComisionLinea() {
		return isPermisoPaginacionAltoComisionLinea;
	}

	public void setIsPermisoPaginacionAltoComisionLinea(Boolean isPermisoPaginacionAltoComisionLinea) {
		this.isPermisoPaginacionAltoComisionLinea = isPermisoPaginacionAltoComisionLinea;
	}
	
	public Boolean getIsPermisoCopiarComisionLinea() {
		return isPermisoCopiarComisionLinea;
	}

	public void setIsPermisoCopiarComisionLinea(Boolean isPermisoCopiarComisionLinea) {
		this.isPermisoCopiarComisionLinea = isPermisoCopiarComisionLinea;
	}
	
	public Boolean getIsPermisoVerFormComisionLinea() {
		return isPermisoVerFormComisionLinea;
	}

	public void setIsPermisoVerFormComisionLinea(Boolean isPermisoVerFormComisionLinea) {
		this.isPermisoVerFormComisionLinea = isPermisoVerFormComisionLinea;
	}
	
	public Boolean getIsPermisoDuplicarComisionLinea() {
		return isPermisoDuplicarComisionLinea;
	}

	public void setIsPermisoDuplicarComisionLinea(Boolean isPermisoDuplicarComisionLinea) {
		this.isPermisoDuplicarComisionLinea = isPermisoDuplicarComisionLinea;
	}
	
	public Boolean getIsPermisoOrdenComisionLinea() {
		return isPermisoOrdenComisionLinea;
	}

	public void setIsPermisoOrdenComisionLinea(Boolean isPermisoOrdenComisionLinea) {
		this.isPermisoOrdenComisionLinea = isPermisoOrdenComisionLinea;
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
	
	public Boolean getIsVisibilidadCeldaNuevoComisionLinea() {
		return isVisibilidadCeldaNuevoComisionLinea;
	}

	public void setIsVisibilidadCeldaNuevoComisionLinea(Boolean isVisibilidadCeldaNuevoComisionLinea) {
		this.isVisibilidadCeldaNuevoComisionLinea = isVisibilidadCeldaNuevoComisionLinea;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarComisionLinea() {
		return isVisibilidadCeldaDuplicarComisionLinea;
	}

	public void setIsVisibilidadCeldaDuplicarComisionLinea(Boolean isVisibilidadCeldaDuplicarComisionLinea) {
		this.isVisibilidadCeldaDuplicarComisionLinea = isVisibilidadCeldaDuplicarComisionLinea;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarComisionLinea() {
		return isVisibilidadCeldaCopiarComisionLinea;
	}

	public void setIsVisibilidadCeldaCopiarComisionLinea(Boolean isVisibilidadCeldaCopiarComisionLinea) {
		this.isVisibilidadCeldaCopiarComisionLinea = isVisibilidadCeldaCopiarComisionLinea;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormComisionLinea() {
		return isVisibilidadCeldaVerFormComisionLinea;
	}

	public void setIsVisibilidadCeldaVerFormComisionLinea(Boolean isVisibilidadCeldaVerFormComisionLinea) {
		this.isVisibilidadCeldaVerFormComisionLinea = isVisibilidadCeldaVerFormComisionLinea;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenComisionLinea() {
		return isVisibilidadCeldaOrdenComisionLinea;
	}

	public void setIsVisibilidadCeldaOrdenComisionLinea(Boolean isVisibilidadCeldaOrdenComisionLinea) {
		this.isVisibilidadCeldaOrdenComisionLinea = isVisibilidadCeldaOrdenComisionLinea;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesComisionLinea() {
		return isVisibilidadCeldaNuevoRelacionesComisionLinea;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesComisionLinea(Boolean isVisibilidadCeldaNuevoRelacionesComisionLinea) {
		this.isVisibilidadCeldaNuevoRelacionesComisionLinea = isVisibilidadCeldaNuevoRelacionesComisionLinea;
	}
	
	public Boolean getIsVisibilidadCeldaModificarComisionLinea() {
		return isVisibilidadCeldaModificarComisionLinea;
	}

	public void setIsVisibilidadCeldaModificarComisionLinea(Boolean isVisibilidadCeldaModificarComisionLinea) {
		this.isVisibilidadCeldaModificarComisionLinea = isVisibilidadCeldaModificarComisionLinea;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarComisionLinea() {
		return isVisibilidadCeldaActualizarComisionLinea;
	}

	public void setIsVisibilidadCeldaActualizarComisionLinea(Boolean isVisibilidadCeldaActualizarComisionLinea) {
		this.isVisibilidadCeldaActualizarComisionLinea = isVisibilidadCeldaActualizarComisionLinea;
	}

	public Boolean getIsVisibilidadCeldaEliminarComisionLinea() {
		return isVisibilidadCeldaEliminarComisionLinea;
	}

	public void setIsVisibilidadCeldaEliminarComisionLinea(Boolean isVisibilidadCeldaEliminarComisionLinea) {
		this.isVisibilidadCeldaEliminarComisionLinea = isVisibilidadCeldaEliminarComisionLinea;
	}

	public Boolean getIsVisibilidadCeldaCancelarComisionLinea() {
		return isVisibilidadCeldaCancelarComisionLinea;
	}

	public void setIsVisibilidadCeldaCancelarComisionLinea(Boolean isVisibilidadCeldaCancelarComisionLinea) {
		this.isVisibilidadCeldaCancelarComisionLinea = isVisibilidadCeldaCancelarComisionLinea;
	}

	public Boolean getIsVisibilidadCeldaGuardarComisionLinea() {
		return isVisibilidadCeldaGuardarComisionLinea;
	}

	public void setIsVisibilidadCeldaGuardarComisionLinea(Boolean isVisibilidadCeldaGuardarComisionLinea) {
		this.isVisibilidadCeldaGuardarComisionLinea = isVisibilidadCeldaGuardarComisionLinea;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosComisionLinea() {
		return isVisibilidadCeldaGuardarCambiosComisionLinea;
	}

	public void setIsVisibilidadCeldaGuardarCambiosComisionLinea(Boolean isVisibilidadCeldaGuardarCambiosComisionLinea) {
		this.isVisibilidadCeldaGuardarCambiosComisionLinea = isVisibilidadCeldaGuardarCambiosComisionLinea;
	}
		
	public ComisionLineaSessionBean getcomisionlineaSessionBean() {
		return this.comisionlineaSessionBean;
	}
	
	public void setcomisionlineaSessionBean(ComisionLineaSessionBean comisionlineaSessionBean) {
		this.comisionlineaSessionBean=comisionlineaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdComisionConfig() {
		return this.isVisibilidadFK_IdComisionConfig;
	}

	public void setisVisibilidadFK_IdComisionConfig(Boolean isVisibilidadFK_IdComisionConfig) {
		this.isVisibilidadFK_IdComisionConfig=isVisibilidadFK_IdComisionConfig;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdEstadoComision() {
		return this.isVisibilidadFK_IdEstadoComision;
	}

	public void setisVisibilidadFK_IdEstadoComision(Boolean isVisibilidadFK_IdEstadoComision) {
		this.isVisibilidadFK_IdEstadoComision=isVisibilidadFK_IdEstadoComision;
	}

	public Boolean getisVisibilidadFK_IdLinea() {
		return this.isVisibilidadFK_IdLinea;
	}

	public void setisVisibilidadFK_IdLinea(Boolean isVisibilidadFK_IdLinea) {
		this.isVisibilidadFK_IdLinea=isVisibilidadFK_IdLinea;
	}

	public Boolean getisVisibilidadFK_IdVendedor() {
		return this.isVisibilidadFK_IdVendedor;
	}

	public void setisVisibilidadFK_IdVendedor(Boolean isVisibilidadFK_IdVendedor) {
		this.isVisibilidadFK_IdVendedor=isVisibilidadFK_IdVendedor;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysComisionLinea(ComisionLinea comisionlinea)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(comisionlinea,null);
				this.setActualParaGuardarComisionConfigForeignKey(comisionlinea,null);
				this.setActualParaGuardarVendedorForeignKey(comisionlinea,null);
				this.setActualParaGuardarLineaForeignKey(comisionlinea,null);
				this.setActualParaGuardarEstadoComisionForeignKey(comisionlinea,null);
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
	
	public void bugActualizarReferenciaActual(ComisionLinea comisionlinea,ComisionLinea comisionlineaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalComisionLinea(comisionlinea);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		comisionlineaAux.setId(comisionlinea.getId());
		comisionlineaAux.setVersionRow(comisionlinea.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessComisionLinea();
		
			int intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlinea =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.comisionlinea =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ComisionLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualComisionLinea(this.comisionlinea,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysComisionLinea(this.comisionlinea);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = comisionlineaValidator.getInvalidValues(this.comisionlinea);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			comisionlineaLogic.setDatosCliente(datosCliente);
			comisionlineaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				comisionlineaAux=new  ComisionLinea();
				
				comisionlineaAux.setIsNew(true);
				comisionlineaAux.setIsChanged(true);
				
				comisionlineaAux.setComisionLineaOriginal(this.comisionlinea);
				
				comisionlineaAux.setId(this.comisionlinea.getId());	
				comisionlineaAux.setVersionRow(this.comisionlinea.getVersionRow());	
				comisionlineaAux.setid_empresa(this.comisionlinea.getid_empresa());	
				comisionlineaAux.setid_comision_config(this.comisionlinea.getid_comision_config());	
				comisionlineaAux.setid_vendedor(this.comisionlinea.getid_vendedor());	
				comisionlineaAux.setid_linea(this.comisionlinea.getid_linea());	
				comisionlineaAux.setid_estado_comision(this.comisionlinea.getid_estado_comision());	
				comisionlineaAux.setporcentaje(this.comisionlinea.getporcentaje());	
				comisionlineaAux.setdescripcion(this.comisionlinea.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.comisionlineaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.comisionlineaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(comisionlineaAux,comisionlineaLogic.getComisionLineas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisionlineaAux,comisionlineas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.comisionlineaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.comisionlineaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionlineaLogic.saveComisionLineas();//WithConnection
						//comisionlineaLogic.getSetVersionRowComisionLineas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.comisionlinea,comisionlineaAux);
					
					this.refrescarForeignKeysDescripcionesComisionLinea();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.comisionlineaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								comisionlineaLogic.saveComisionLineaRelaciones(comisionlineaAux);//WithConnection
								//comisionlineaLogic.getSetVersionRowComisionLineas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.comisionlinea,comisionlineaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.comisionlineaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.comisionlineaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(comisionlineaAux,comisionlineaLogic.getComisionLineas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(comisionlineaAux,comisionlineas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.comisionlinea,comisionlineaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				comisionlineaAux=new  ComisionLinea();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.comisionlineaSessionBean.getEsGuardarRelacionado() 
					|| (this.comisionlineaSessionBean.getEsGuardarRelacionado() && this.comisionlinea.getId()>=0)) {
						
					comisionlineaAux.setIsNew(false);
				}
				
				comisionlineaAux.setIsDeleted(false);
			
				comisionlineaAux.setId(this.comisionlinea.getId());	
				comisionlineaAux.setVersionRow(this.comisionlinea.getVersionRow());	
				comisionlineaAux.setid_empresa(this.comisionlinea.getid_empresa());	
				comisionlineaAux.setid_comision_config(this.comisionlinea.getid_comision_config());	
				comisionlineaAux.setid_vendedor(this.comisionlinea.getid_vendedor());	
				comisionlineaAux.setid_linea(this.comisionlinea.getid_linea());	
				comisionlineaAux.setid_estado_comision(this.comisionlinea.getid_estado_comision());	
				comisionlineaAux.setporcentaje(this.comisionlinea.getporcentaje());	
				comisionlineaAux.setdescripcion(this.comisionlinea.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(comisionlineaAux,comisionlineaLogic.getComisionLineas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisionlineaAux,comisionlineas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.comisionlineaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.comisionlineaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionlineaLogic.saveComisionLineas();//WithConnection
						//comisionlineaLogic.getSetVersionRowComisionLineas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.comisionlinea,comisionlineaAux);
					
					this.refrescarForeignKeysDescripcionesComisionLinea();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.comisionlineaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								comisionlineaLogic.saveComisionLineaRelaciones(comisionlineaAux);//WithConnection
								//comisionlineaLogic.getSetVersionRowComisionLineas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.comisionlinea,comisionlineaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.comisionlineaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.comisionlineaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(comisionlineaAux,comisionlineaLogic.getComisionLineas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(comisionlineaAux,comisionlineas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.comisionlinea,comisionlineaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				comisionlineaAux=new  ComisionLinea();
				
				comisionlineaAux.setIsNew(false);
				comisionlineaAux.setIsChanged(false);
				
				comisionlineaAux.setIsDeleted(true);
				
				comisionlineaAux.setId(this.comisionlinea.getId());	
				comisionlineaAux.setVersionRow(this.comisionlinea.getVersionRow());	
				comisionlineaAux.setid_empresa(this.comisionlinea.getid_empresa());	
				comisionlineaAux.setid_comision_config(this.comisionlinea.getid_comision_config());	
				comisionlineaAux.setid_vendedor(this.comisionlinea.getid_vendedor());	
				comisionlineaAux.setid_linea(this.comisionlinea.getid_linea());	
				comisionlineaAux.setid_estado_comision(this.comisionlinea.getid_estado_comision());	
				comisionlineaAux.setporcentaje(this.comisionlinea.getporcentaje());	
				comisionlineaAux.setdescripcion(this.comisionlinea.getdescripcion());	
				
				if(this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.comisionlineaAux.getId()>=0) {	
						this.comisionlineasEliminados.add(comisionlineaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(comisionlineaAux,comisionlineaLogic.getComisionLineas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisionlineaAux,comisionlineas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.comisionlineaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.comisionlineaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionlineaLogic.saveComisionLineas();//WithConnection
						//comisionlineaLogic.getSetVersionRowComisionLineas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.comisionlineaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								comisionlineaLogic.saveComisionLineaRelaciones(comisionlineaAux);//WithConnection
								//comisionlineaLogic.getSetVersionRowComisionLineas();//WithConnection
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
							if(this.comisionlineaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.comisionlineaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(comisionlineaAux,comisionlineaLogic.getComisionLineas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(comisionlineaAux,comisionlineas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.getComisionLineas().addAll(this.comisionlineasEliminados);
					
					comisionlineaLogic.saveComisionLineas();//WithConnection
					//comisionlineaLogic.getSetVersionRowComisionLineas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesComisionLinea();
				
				this.comisionlineasEliminados= new ArrayList<ComisionLinea>();		
			}
			
			if(this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionlineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Comision Linea GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Comision Linea",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.comisionlinea=comisionlineaAux;
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
      		//this.finishProcessComisionLinea();
      	}
		
	}	
	
	public void actualizarRelaciones(ComisionLinea comisionlineaLocal) throws Exception {
		
		if(this.comisionlineaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ComisionLinea comisionlineaLocal) throws Exception {	
		if(this.comisionlineaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				comisionlineaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ComisionConfigDetalleFormJInternalFrame.class)) {
				ComisionConfigBeanSwingJInternalFrame comisionconfigBeanSwingJInternalFrameLocal=(ComisionConfigBeanSwingJInternalFrame) ((ComisionConfigDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				comisionconfigBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoComisionConfig(comisionconfigBeanSwingJInternalFrameLocal.getcomisionconfig(),true);
				comisionconfigBeanSwingJInternalFrameLocal.actualizarLista(comisionconfigBeanSwingJInternalFrameLocal.comisionconfig,this.comisionconfigsForeignKey);

				comisionconfigBeanSwingJInternalFrameLocal.actualizarRelaciones(comisionconfigBeanSwingJInternalFrameLocal.comisionconfig);

				comisionlineaLocal.setComisionConfig(comisionconfigBeanSwingJInternalFrameLocal.comisionconfig);

				this.addItemDefectoCombosForeignKeyComisionConfig();
				this.cargarCombosFrameComisionConfigsForeignKey("Formulario");
				this.setActualComisionConfigForeignKey(comisionconfigBeanSwingJInternalFrameLocal.comisionconfig.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(VendedorDetalleFormJInternalFrame.class)) {
				VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrameLocal=(VendedorBeanSwingJInternalFrame) ((VendedorDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				vendedorBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoVendedor(vendedorBeanSwingJInternalFrameLocal.getvendedor(),true);
				vendedorBeanSwingJInternalFrameLocal.actualizarLista(vendedorBeanSwingJInternalFrameLocal.vendedor,this.vendedorsForeignKey);

				vendedorBeanSwingJInternalFrameLocal.actualizarRelaciones(vendedorBeanSwingJInternalFrameLocal.vendedor);

				comisionlineaLocal.setVendedor(vendedorBeanSwingJInternalFrameLocal.vendedor);

				this.addItemDefectoCombosForeignKeyVendedor();
				this.cargarCombosFrameVendedorsForeignKey("Formulario");
				this.setActualVendedorForeignKey(vendedorBeanSwingJInternalFrameLocal.vendedor.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				comisionlineaLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstadoComisionDetalleFormJInternalFrame.class)) {
				EstadoComisionBeanSwingJInternalFrame estadocomisionBeanSwingJInternalFrameLocal=(EstadoComisionBeanSwingJInternalFrame) ((EstadoComisionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estadocomisionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstadoComision(estadocomisionBeanSwingJInternalFrameLocal.getestadocomision(),true);
				estadocomisionBeanSwingJInternalFrameLocal.actualizarLista(estadocomisionBeanSwingJInternalFrameLocal.estadocomision,this.estadocomisionsForeignKey);

				estadocomisionBeanSwingJInternalFrameLocal.actualizarRelaciones(estadocomisionBeanSwingJInternalFrameLocal.estadocomision);

				comisionlineaLocal.setEstadoComision(estadocomisionBeanSwingJInternalFrameLocal.estadocomision);

				this.addItemDefectoCombosForeignKeyEstadoComision();
				this.cargarCombosFrameEstadoComisionsForeignKey("Formulario");
				this.setActualEstadoComisionForeignKey(estadocomisionBeanSwingJInternalFrameLocal.estadocomision.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarComisionLineaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.comisionlinea =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.comisionlinea =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = comisionlineaValidator.getInvalidValues(this.comisionlinea);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ComisionLinea comisionlinea,List<ComisionLinea> comisionlineas) throws Exception {
		try	{		
			ComisionLineaConstantesFunciones.actualizarLista(comisionlinea,comisionlineas,this.comisionlineaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ComisionLinea comisionlinea,List<ComisionLinea> comisionlineas) throws Exception {
		try	{			
			ComisionLineaConstantesFunciones.actualizarSelectedLista(comisionlinea,comisionlineas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ComisionLinea> comisionlineasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				comisionlineasLocal=this.comisionlineaLogic.getComisionLineas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				comisionlineasLocal=this.comisionlineas;
			}
			//ARCHITECTURE
		
			for(ComisionLinea comisionlineaLocal:comisionlineasLocal) {
				if(this.permiteMantenimiento(comisionlineaLocal) && comisionlineaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ComisionLineaConstantesFunciones.getComisionLineaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ComisionLineaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionLinea.jLabelid_empresaComisionLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionLineaConstantesFunciones.IDCOMISIONCONFIG)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionLinea.jLabelid_comision_configComisionLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionLineaConstantesFunciones.IDVENDEDOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionLinea.jLabelid_vendedorComisionLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionLineaConstantesFunciones.IDLINEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionLinea.jLabelid_lineaComisionLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionLineaConstantesFunciones.IDESTADOCOMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionLinea.jLabelid_estado_comisionComisionLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionLineaConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionLinea.jLabelporcentajeComisionLinea,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionLineaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionLinea.jLabeldescripcionComisionLinea,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormComisionLinea!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionLinea.jLabelid_empresaComisionLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionLinea.jLabelid_comision_configComisionLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionLinea.jLabelid_vendedorComisionLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionLinea.jLabelid_lineaComisionLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionLinea.jLabelid_estado_comisionComisionLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionLinea.jLabelporcentajeComisionLinea,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionLinea.jLabeldescripcionComisionLinea,"");
		
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
		this.iIdNuevoComisionLinea--;	
		
		
		this.comisionlineaAux=new ComisionLinea();
		
		this.comisionlineaAux.setId(this.iIdNuevoComisionLinea);
		this.comisionlineaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.comisionlineaLogic.getComisionLineas().add(this.comisionlineaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.comisionlineas.add(this.comisionlineaAux);
		}
		//ARCHITECTURE
		
		this.comisionlinea=this.comisionlineaAux;
		
		if(ComisionLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioComisionLinea(this.comisionlinea);
			this.setVariablesObjetoActualToFormularioForeignKeyComisionLinea(this.comisionlinea);
		}
				
		//this.setDefaultControlesComisionLinea();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyComisionLinea();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyComisionLinea();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyComisionLinea();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualComisionLinea(this.comisionlineaBean,this.comisionlinea,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysComisionLinea(this.comisionlinea);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ComisionLineaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.comisionlineaSessionBean.getConGuardarRelaciones()) {
			classes=ComisionLineaConstantesFunciones.getClassesRelationshipsOfComisionLinea(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.comisionlineaReturnGeneral=comisionlineaLogic.procesarEventosComisionLineasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comisionlineaLogic.getComisionLineas(),this.comisionlinea,this.comisionlineaParameterGeneral,this.isEsNuevoComisionLinea,classes);//this.comisionlineaLogic.getComisionLinea()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanComisionLinea(this.comisionlineaReturnGeneral,this.comisionlineaBean,false);
		
		if(this.comisionlineaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyComisionLinea(this.comisionlineaReturnGeneral.getComisionLinea());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioComisionLinea(this.comisionlineaReturnGeneral.getComisionLinea());
		}
		
		if(this.comisionlineaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioComisionLinea(this.comisionlineaReturnGeneral.getComisionLinea(),classes);//this.comisionlineaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualComisionLinea(this.comisionlinea,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyComisionLinea();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyComisionLinea();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ComisionLineaBeanSwingJInternalFrameAdditional.RecargarFormComisionLinea(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingComisionLinea(false);
						
			if(comisionlineaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ComisionLineaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComisionLinea();
			}
			
			this.actualizarVisualTableDatosComisionLinea();
			
			this.jTableDatosComisionLinea.setRowSelectionInterval(this.getIndiceNuevoComisionLinea(), this.getIndiceNuevoComisionLinea());
			
			this.seleccionarFilaTablaComisionLineaActual();
						
			this.actualizarEstadoCeldasBotonesComisionLinea("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesComisionLinea(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormComisionLinea.jTextFieldporcentajeComisionLinea.setEnabled(isHabilitar && this.comisionlineaConstantesFunciones.activarporcentajeComisionLinea);
		this.jInternalFrameDetalleFormComisionLinea.jTextAreadescripcionComisionLinea.setEnabled(isHabilitar && this.comisionlineaConstantesFunciones.activardescripcionComisionLinea);	
		//
		this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_empresaComisionLinea.setEnabled(isHabilitar && this.comisionlineaConstantesFunciones.activarid_empresaComisionLinea);
		this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_comision_configComisionLinea.setEnabled(isHabilitar && this.comisionlineaConstantesFunciones.activarid_comision_configComisionLinea);
		this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_vendedorComisionLinea.setEnabled(isHabilitar && this.comisionlineaConstantesFunciones.activarid_vendedorComisionLinea);
		this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_lineaComisionLinea.setEnabled(isHabilitar && this.comisionlineaConstantesFunciones.activarid_lineaComisionLinea);
		this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_estado_comisionComisionLinea.setEnabled(isHabilitar && this.comisionlineaConstantesFunciones.activarid_estado_comisionComisionLinea);
	};
	
	public void setDefaultControlesComisionLinea() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoComisionLinea(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.comisionlineaSessionBean.setConGuardarRelaciones(true);			
			this.comisionlineaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormComisionLinea.jTabbedPaneRelacionesComisionLinea.setVisible(true);
			
					
		} else {
			//this.comisionlineaSessionBean.setConGuardarRelaciones(false);			
			this.comisionlineaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormComisionLinea.jTabbedPaneRelacionesComisionLinea.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoComisionLinea() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionLinea comisionlineaAux:this.comisionlineaLogic.getComisionLineas()) {
				if(comisionlineaAux.getId().equals(this.iIdNuevoComisionLinea)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionLinea comisionlineaAux:this.comisionlineas) {
				if(comisionlineaAux.getId().equals(this.iIdNuevoComisionLinea)) {
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
	
	public int getIndiceActualComisionLinea(ComisionLinea comisionlinea,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionLinea comisionlineaAux:this.comisionlineaLogic.getComisionLineas()) {
				if(comisionlineaAux.getId().equals(comisionlinea.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionLinea comisionlineaAux:this.comisionlineas) {
				if(comisionlineaAux.getId().equals(comisionlinea.getId())) {
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
	
	public void setCamposBaseDesdeOriginalComisionLinea(ComisionLinea comisionlineaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionLinea comisionlineaAux:this.comisionlineaLogic.getComisionLineas()) {
				if(comisionlineaAux.getComisionLineaOriginal().getId().equals(comisionlineaOriginal.getId())) {
					existe=true;
					comisionlineaOriginal.setId(comisionlineaAux.getId());
					comisionlineaOriginal.setVersionRow(comisionlineaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionLinea comisionlineaAux:this.comisionlineas) {
				if(comisionlineaAux.getComisionLineaOriginal().getId().equals(comisionlineaOriginal.getId())) {
					existe=true;
					comisionlineaOriginal.setId(comisionlineaAux.getId());
					comisionlineaOriginal.setVersionRow(comisionlineaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosComisionLinea(Boolean esParaCancelar) throws Exception {
		comisionlineasAux=new ArrayList<ComisionLinea>();
		comisionlineaAux=new ComisionLinea();
		
		if(!this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ComisionLinea comisionlineaAux:this.comisionlineaLogic.getComisionLineas()) {
					if(comisionlineaAux.getId()<0) {
						comisionlineasAux.add(comisionlineaAux);
					}		
				}
				this.iIdNuevoComisionLinea=0L;
				this.comisionlineaLogic.getComisionLineas().removeAll(comisionlineasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComisionLinea comisionlineaAux:this.comisionlineas) {
					if(comisionlineaAux.getId()<0) {
						comisionlineasAux.add(comisionlineaAux);
					}		
				}
				this.iIdNuevoComisionLinea=0L;
				this.comisionlineas.removeAll(comisionlineasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoComisionLinea 
					&& this.comisionlineaLogic.getComisionLineas().size()>0
					) {
					comisionlineaAux=this.comisionlineaLogic.getComisionLineas().get(this.comisionlineaLogic.getComisionLineas().size() - 1);
				
					if(comisionlineaAux.getId()<0) {
						this.comisionlineaLogic.getComisionLineas().remove(comisionlineaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoComisionLinea && this.comisionlineas.size()>0) {
					comisionlineaAux=this.comisionlineas.get(this.comisionlineas.size() - 1);
				
					if(comisionlineaAux.getId()<0) {
						this.comisionlineas.remove(comisionlineaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoComisionLinea(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(comisionlinea.getId()<0) {
				this.comisionlineaLogic.getComisionLineas().remove(this.comisionlinea);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(comisionlinea.getId()<0) {
				this.comisionlineas.remove(this.comisionlinea);
			}
		}			
	}
	
	public void setEstadosInicialesComisionLinea(List<ComisionLinea> comisionlineasAux) throws Exception {
		ComisionLineaConstantesFunciones.setEstadosInicialesComisionLinea(comisionlineasAux);
	}
	
	public void setEstadosInicialesComisionLinea(ComisionLinea comisionlineaAux) throws Exception {
		ComisionLineaConstantesFunciones.setEstadosInicialesComisionLinea(comisionlineaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarComisionLineaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesComisionLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarComisionLineaActual()) {
				if(!this.isEsNuevoComisionLinea) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesComisionLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoComisionLinea=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarComisionLineaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Comision Linea ?", "MANTENIMIENTO DE Comision Linea", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesComisionLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ComisionLinea comisionlinea) throws Exception {
		ComisionLineaConstantesFunciones.seleccionarAsignar(this.comisionlinea,comisionlinea);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarComisionLinea=this.isPermisoActualizarOriginalComisionLinea;
			
			
			this.seleccionarAsignar(comisionlinea);
			
			

			idVendedorActual=comisionlinea.getid_vendedor();
			this.seleccionarVendedorActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ComisionLineaConstantesFunciones.quitarEspaciosComisionLinea(this.comisionlinea,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesComisionLinea("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.comisionlineaSessionBean.setsFuncionBusquedaRapida(this.comisionlineaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarVendedorActual() throws Exception {
		try	{
			Vendedor vendedorAux=new Vendedor();

			if(this.idVendedorActual != null && this.idVendedorActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorLogic.getEntityWithConnection(this.idVendedorActual);
					vendedorAux= vendedorLogic.getVendedor();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				vendedorsForeignKey=new ArrayList<Vendedor>();
				vendedorsForeignKey.add(vendedorAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoComisionLinea) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosComisionLinea(esParaCancelar);				
				this.cancelarNuevoComisionLinea(esParaCancelar);								
			}
			
			this.comisionlinea=new ComisionLinea();
			
			this.inicializarComisionLinea();
			
			this.actualizarEstadoCeldasBotonesComisionLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarComisionLinea() throws Exception {
		try {
			ComisionLineaConstantesFunciones.inicializarComisionLinea(this.comisionlinea);
			
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
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.comisionlineaLogic.getComisionLineas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteComisionLineas(String sAccionBusqueda,List<ComisionLinea> comisionlineasParaReportes) throws Exception {
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
					sPathReporteFinal="ComisionLinea"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ComisionLineaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ComisionLineaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ComisionLinea"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Comision Lineas");		
		parameters.put("busquedapor", ComisionLineaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceComisionLinea=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ComisionLineaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ComisionLineaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceComisionLinea=new JRBeanArrayDataSource(ComisionLineaJInternalFrame.TraerComisionLineaBeans(comisionlineasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceComisionLinea);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ComisionLineaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ComisionLineaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ComisionLineaBean.TraerComisionLineaBeans(comisionlineasParaReportes).toArray()));
							
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
				this.generarExcelReporteComisionLineas(sAccionBusqueda,sTipoArchivoReporte,comisionlineasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalComisionLineas(sAccionBusqueda,sTipoArchivoReporte,comisionlineasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoComisionLineaActionPerformed(null);
					//this.generarExcelReporteComisionLineas(sAccionBusqueda,sTipoArchivoReporte,comisionlineasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalComisionLineas(sAccionBusqueda,sTipoArchivoReporte,comisionlineasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesComisionLineas(sAccionBusqueda,sTipoArchivoReporte,comisionlineasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesComisionLineas(sAccionBusqueda,sTipoArchivoReporte,comisionlineasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteComisionLineas(String sAccionBusqueda,String sTipoArchivoReporte,List<ComisionLinea> comisionlineasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionlinea";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComisionLineas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderComisionLinea("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ComisionLinea comisionlinea : comisionlineasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ComisionLineaConstantesFunciones.generarExcelReporteDataComisionLinea("NORMAL",row,workbook,comisionlinea,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionlineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Linea",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderComisionLinea(String sTipo,Row row,Workbook workbook) {
		
		ComisionLineaConstantesFunciones.generarExcelReporteHeaderComisionLinea(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalComisionLineas(String sAccionBusqueda,String sTipoArchivoReporte,List<ComisionLinea> comisionlineasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionlinea_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComisionLineas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ComisionLinea comisionlinea : comisionlineasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ComisionLineaConstantesFunciones.getComisionLineaDescripcion(comisionlinea));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionLineaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionLineaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionlinea.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionLineaConstantesFunciones.LABEL_IDCOMISIONCONFIG))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionLineaConstantesFunciones.LABEL_IDCOMISIONCONFIG);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionlinea.getcomisionconfig_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionLineaConstantesFunciones.LABEL_IDVENDEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionLineaConstantesFunciones.LABEL_IDVENDEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionlinea.getvendedor_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionLineaConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionLineaConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionlinea.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionLineaConstantesFunciones.LABEL_IDESTADOCOMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionLineaConstantesFunciones.LABEL_IDESTADOCOMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionlinea.getestadocomision_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionLineaConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionLineaConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionlinea.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionLineaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionLineaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionlinea.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionlineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Linea",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesComisionLineas(String sAccionBusqueda,String sTipoArchivoReporte,List<ComisionLinea> comisionlineasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ComisionLinea> comisionlineasRespaldo=null;
		
		classes=ComisionLineaConstantesFunciones.getClassesRelationshipsOfComisionLinea(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.comisionlineaLogic.setDatosCliente(this.datosCliente);
		this.comisionlineaLogic.setDatosDeep(this.datosDeep);
		this.comisionlineaLogic.setIsConDeep(true);
		
		comisionlineasRespaldo=this.comisionlineaLogic.getComisionLineas();
		
		this.comisionlineaLogic.setComisionLineas(comisionlineasParaReportes);	
		this.comisionlineaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		comisionlineasParaReportes=this.comisionlineaLogic.getComisionLineas();
		this.comisionlineaLogic.setComisionLineas(comisionlineasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionlinea_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComisionLineas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderComisionLinea("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ComisionLinea comisionlinea : comisionlineasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderComisionLinea("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ComisionLineaConstantesFunciones.generarExcelReporteDataComisionLinea("NORMAL",row,workbook,comisionlinea,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ComisionLineaConstantesFunciones.getComisionLineaDescripcion(comisionlinea));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionlineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Linea",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoComisionLinea.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionLinea.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoComisionLinea.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionLinea.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessComisionLinea() throws Exception {		
		this.startProcessComisionLinea(true);
	}
	
	public void startProcessComisionLinea(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasComisionLinea ,this.jPanelParametrosReportesComisionLinea, this.jScrollPanelDatosComisionLinea,this.jPanelPaginacionComisionLinea, this.jScrollPanelDatosEdicionComisionLinea, this.jPanelAccionesComisionLinea,this.jPanelAccionesFormularioComisionLinea,this.jmenuBarComisionLinea,this.jmenuBarDetalleComisionLinea,this.jTtoolBarComisionLinea,this.jTtoolBarDetalleComisionLinea);		
		
		final JTabbedPane jTabbedPaneBusquedasComisionLinea=this.jTabbedPaneBusquedasComisionLinea; 
		
		final JPanel jPanelParametrosReportesComisionLinea=this.jPanelParametrosReportesComisionLinea;
		//final JScrollPane jScrollPanelDatosComisionLinea=this.jScrollPanelDatosComisionLinea;
		final JTable jTableDatosComisionLinea=this.jTableDatosComisionLinea;		
		final JPanel jPanelPaginacionComisionLinea=this.jPanelPaginacionComisionLinea;
		//final JScrollPane jScrollPanelDatosEdicionComisionLinea=this.jScrollPanelDatosEdicionComisionLinea;
		final JPanel jPanelAccionesComisionLinea=this.jPanelAccionesComisionLinea;
		
		JPanel jPanelCamposAuxiliarComisionLinea=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarComisionLinea=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormComisionLinea!=null) {
			jPanelCamposAuxiliarComisionLinea=this.jInternalFrameDetalleFormComisionLinea.jPanelCamposComisionLinea;
			jPanelAccionesFormularioAuxiliarComisionLinea=this.jInternalFrameDetalleFormComisionLinea.jPanelAccionesFormularioComisionLinea;
		}
		
		final JPanel jPanelCamposComisionLinea=jPanelCamposAuxiliarComisionLinea;
		final JPanel jPanelAccionesFormularioComisionLinea=jPanelAccionesFormularioAuxiliarComisionLinea;
		
		
		final JMenuBar jmenuBarComisionLinea=this.jmenuBarComisionLinea;
		final JToolBar jTtoolBarComisionLinea=this.jTtoolBarComisionLinea;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarComisionLinea=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarComisionLinea=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormComisionLinea!=null) {
			jmenuBarDetalleAuxiliarComisionLinea=this.jInternalFrameDetalleFormComisionLinea.jmenuBarDetalleComisionLinea;
			jTtoolBarDetalleAuxiliarComisionLinea=this.jInternalFrameDetalleFormComisionLinea.jTtoolBarDetalleComisionLinea;
		}
		
		final JMenuBar jmenuBarDetalleComisionLinea=jmenuBarDetalleAuxiliarComisionLinea;
		final JToolBar jTtoolBarDetalleComisionLinea=jTtoolBarDetalleAuxiliarComisionLinea;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasComisionLinea;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesComisionLinea;
			processRunnable.jTableDatos=jTableDatosComisionLinea;
			processRunnable.jPanelCampos=jPanelCamposComisionLinea;
			processRunnable.jPanelPaginacion=jPanelPaginacionComisionLinea;
			processRunnable.jPanelAcciones=jPanelAccionesComisionLinea;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioComisionLinea;
			
			
			processRunnable.jmenuBar=jmenuBarComisionLinea;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleComisionLinea;
			processRunnable.jTtoolBar=jTtoolBarComisionLinea;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleComisionLinea;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasComisionLinea ,jPanelParametrosReportesComisionLinea,jTableDatosComisionLinea, /*jScrollPanelDatosComisionLinea,*/jPanelCamposComisionLinea,jPanelPaginacionComisionLinea, /*jScrollPanelDatosEdicionComisionLinea,*/ jPanelAccionesComisionLinea,jPanelAccionesFormularioComisionLinea,jmenuBarComisionLinea,jmenuBarDetalleComisionLinea,jTtoolBarComisionLinea,jTtoolBarDetalleComisionLinea);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasComisionLinea ,jPanelParametrosReportesComisionLinea, jScrollPanelDatosComisionLinea,jPanelPaginacionComisionLinea, jScrollPanelDatosEdicionComisionLinea, jPanelAccionesComisionLinea,jPanelAccionesFormularioComisionLinea,jmenuBarComisionLinea,jmenuBarDetalleComisionLinea,jTtoolBarComisionLinea,jTtoolBarDetalleComisionLinea);
						
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
	
	public void finishProcessComisionLinea() {// throws Exception 
		this.finishProcessComisionLinea(true);
	}
	
	public void finishProcessComisionLinea(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasComisionLinea ,this.jPanelParametrosReportesComisionLinea, this.jScrollPanelDatosComisionLinea,this.jPanelPaginacionComisionLinea, this.jScrollPanelDatosEdicionComisionLinea, this.jPanelAccionesComisionLinea,this.jPanelAccionesFormularioComisionLinea,this.jmenuBarComisionLinea,this.jmenuBarDetalleComisionLinea,this.jTtoolBarComisionLinea,this.jTtoolBarDetalleComisionLinea);		
		
		final JTabbedPane jTabbedPaneBusquedasComisionLinea=this.jTabbedPaneBusquedasComisionLinea; 
		
		final JPanel jPanelParametrosReportesComisionLinea=this.jPanelParametrosReportesComisionLinea;
		//final JScrollPane jScrollPanelDatosComisionLinea=this.jScrollPanelDatosComisionLinea;
		final JTable jTableDatosComisionLinea=this.jTableDatosComisionLinea;		
		final JPanel jPanelPaginacionComisionLinea=this.jPanelPaginacionComisionLinea;
		//final JScrollPane jScrollPanelDatosEdicionComisionLinea=this.jScrollPanelDatosEdicionComisionLinea;
		final JPanel jPanelAccionesComisionLinea=this.jPanelAccionesComisionLinea;
		
		JPanel jPanelCamposAuxiliarComisionLinea=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarComisionLinea=new JPanel();
		
		if(this.jInternalFrameDetalleFormComisionLinea!=null) {
			jPanelCamposAuxiliarComisionLinea=this.jInternalFrameDetalleFormComisionLinea.jPanelCamposComisionLinea;
			jPanelAccionesFormularioAuxiliarComisionLinea=this.jInternalFrameDetalleFormComisionLinea.jPanelAccionesFormularioComisionLinea;
		}
		
		final JPanel jPanelCamposComisionLinea=jPanelCamposAuxiliarComisionLinea;
		final JPanel jPanelAccionesFormularioComisionLinea=jPanelAccionesFormularioAuxiliarComisionLinea;
		
		
		final JMenuBar jmenuBarComisionLinea=this.jmenuBarComisionLinea;		
		final JToolBar jTtoolBarComisionLinea=this.jTtoolBarComisionLinea;
				
		JMenuBar jmenuBarDetalleAuxiliarComisionLinea=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarComisionLinea=new JToolBar();
		
		if(this.jInternalFrameDetalleFormComisionLinea!=null) {
			jmenuBarDetalleAuxiliarComisionLinea=this.jInternalFrameDetalleFormComisionLinea.jmenuBarDetalleComisionLinea;
			jTtoolBarDetalleAuxiliarComisionLinea=this.jInternalFrameDetalleFormComisionLinea.jTtoolBarDetalleComisionLinea;		
		}
		
		final JMenuBar jmenuBarDetalleComisionLinea=jmenuBarDetalleAuxiliarComisionLinea;
		final JToolBar jTtoolBarDetalleComisionLinea=jTtoolBarDetalleAuxiliarComisionLinea;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasComisionLinea;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesComisionLinea;
			processRunnable.jTableDatos=jTableDatosComisionLinea;
			processRunnable.jPanelCampos=jPanelCamposComisionLinea;
			processRunnable.jPanelPaginacion=jPanelPaginacionComisionLinea;
			processRunnable.jPanelAcciones=jPanelAccionesComisionLinea;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioComisionLinea;
			
			
			processRunnable.jmenuBar=jmenuBarComisionLinea;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleComisionLinea;
			processRunnable.jTtoolBar=jTtoolBarComisionLinea;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleComisionLinea;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasComisionLinea ,jPanelParametrosReportesComisionLinea, jTableDatosComisionLinea,/*jScrollPanelDatosComisionLinea,*/jPanelCamposComisionLinea,jPanelPaginacionComisionLinea, /*jScrollPanelDatosEdicionComisionLinea,*/ jPanelAccionesComisionLinea,jPanelAccionesFormularioComisionLinea,jmenuBarComisionLinea,jmenuBarDetalleComisionLinea,jTtoolBarComisionLinea,jTtoolBarDetalleComisionLinea));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesComisionLinea(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarComisionLinea(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuComisionLinea(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarComisionLinea(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarComisionLinea,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleComisionLinea,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuComisionLinea(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarComisionLinea,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleComisionLinea,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.comisionlineaConstantesFunciones.getsFinalQueryComisionLinea();
		String  finalQueryPaginacionTodos=this.comisionlineaConstantesFunciones.getsFinalQueryComisionLinea();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ComisionLineaConstantesFunciones.getArrayColumnasGlobalesNoComisionLinea(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ComisionLineaConstantesFunciones.getArrayColumnasGlobalesComisionLinea(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ComisionLineaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.comisionlineasEliminados= new ArrayList<ComisionLinea>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessComisionLinea();
		
				///*ComisionLineaSessionBean*/this.comisionlineaSessionBean=new ComisionLineaSessionBean();
			
			if(this.comisionlineaSessionBean==null) {
				this.comisionlineaSessionBean=new ComisionLineaSessionBean();
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
					this.iNumeroPaginacion=ComisionLineaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ComisionLineaConstantesFunciones.getClassesForeignKeysOfComisionLinea(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/comisionlinea."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			comisionlineasAux= new ArrayList<ComisionLinea>();
			
				
			comisionlineaLogic.setDatosCliente(this.datosCliente);
			comisionlineaLogic.setDatosDeep(this.datosDeep);
			comisionlineaLogic.setIsConDeep(true);
			
			
			comisionlineaLogic.getComisionLineaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					comisionlineaLogic.getTodosComisionLineas(finalQueryGlobal,pagination);
					
					//comisionlineaLogic.getTodosComisionLineasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(comisionlineaLogic.getComisionLineas()==null|| comisionlineaLogic.getComisionLineas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							comisionlineasAux= new ArrayList<ComisionLinea>();
							comisionlineasAux.addAll(comisionlineaLogic.getComisionLineas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionlineasAux= new ArrayList<ComisionLinea>();
							comisionlineasAux.addAll(comisionlineas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							comisionlineaLogic.getTodosComisionLineas(finalQueryGlobal+"",this.pagination);												
							
							//comisionlineaLogic.getTodosComisionLineasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteComisionLineas("Todos",comisionlineaLogic.getComisionLineas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							comisionlineaLogic.setComisionLineas(new ArrayList<ComisionLinea>());					
							comisionlineaLogic.getComisionLineas().addAll(comisionlineasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionlineas=new ArrayList<ComisionLinea>();
							comisionlineas.addAll(comisionlineasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idComisionLinea=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idComisionLinea=this.idActual;
				
				} else if(this.idComisionLineaActual!=null && this.idComisionLineaActual!=0L) {
					idComisionLinea=idComisionLineaActual;
				}
				
					
				this.sDetalleReporte=ComisionLineaConstantesFunciones.getDetalleIndicePorId(idComisionLinea);
				
				this.comisionlineas=new ArrayList<ComisionLinea>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					comisionlineaLogic.getEntity(idComisionLinea);
					
					//comisionlineaLogic.getEntityWithConnection(idComisionLinea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionlineaLogic.setComisionLineas(new ArrayList<ComisionLinea>());
					comisionlineaLogic.getComisionLineas().add(comisionlineaLogic.getComisionLinea());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionlineas=new ArrayList<ComisionLinea>();
					this.comisionlineas.add(comisionlinea);
				}
				
				if(comisionlineaLogic.getComisionLinea()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdComisionConfig")) {
				this.sDetalleReporte=ComisionLineaConstantesFunciones.getDetalleIndiceFK_IdComisionConfig(id_comision_configFK_IdComisionConfig);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					comisionlineaLogic.getComisionLineasFK_IdComisionConfig(finalQueryGlobal,pagination,id_comision_configFK_IdComisionConfig);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComisionLineaConstantesFunciones.getDetalleIndiceFK_IdComisionConfig(id_comision_configFK_IdComisionConfig);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComisionLineaConstantesFunciones.getDetalleIndiceFK_IdComisionConfig(id_comision_configFK_IdComisionConfig);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=comisionlineaLogic.getComisionLineas()==null||comisionlineaLogic.getComisionLineas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=comisionlineas==null|| comisionlineas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionlineasAux=new ArrayList<ComisionLinea>();
						comisionlineasAux.addAll(comisionlineaLogic.getComisionLineas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionlineasAux=new ArrayList<ComisionLinea>();
							comisionlineasAux.addAll(comisionlineas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							comisionlineaLogic.getComisionLineasFK_IdComisionConfig(finalQueryGlobal,pagination,id_comision_configFK_IdComisionConfig);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComisionLineaConstantesFunciones.getDetalleIndiceFK_IdComisionConfig(id_comision_configFK_IdComisionConfig);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComisionLineaConstantesFunciones.getDetalleIndiceFK_IdComisionConfig(id_comision_configFK_IdComisionConfig);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteComisionLineas("FK_IdComisionConfig",comisionlineaLogic.getComisionLineas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteComisionLineas("FK_IdComisionConfig",comisionlineas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionlineaLogic.setComisionLineas(new ArrayList<ComisionLinea>());
						comisionlineaLogic.getComisionLineas().addAll(comisionlineasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionlineas=new ArrayList<ComisionLinea>();
							comisionlineas.addAll(comisionlineasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ComisionLineaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					comisionlineaLogic.getComisionLineasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComisionLineaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComisionLineaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=comisionlineaLogic.getComisionLineas()==null||comisionlineaLogic.getComisionLineas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=comisionlineas==null|| comisionlineas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionlineasAux=new ArrayList<ComisionLinea>();
						comisionlineasAux.addAll(comisionlineaLogic.getComisionLineas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionlineasAux=new ArrayList<ComisionLinea>();
							comisionlineasAux.addAll(comisionlineas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							comisionlineaLogic.getComisionLineasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComisionLineaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComisionLineaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteComisionLineas("FK_IdEmpresa",comisionlineaLogic.getComisionLineas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteComisionLineas("FK_IdEmpresa",comisionlineas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionlineaLogic.setComisionLineas(new ArrayList<ComisionLinea>());
						comisionlineaLogic.getComisionLineas().addAll(comisionlineasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionlineas=new ArrayList<ComisionLinea>();
							comisionlineas.addAll(comisionlineasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesComisionLinea();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessComisionLinea();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=comisionlineaLogic.getComisionLineas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comisionlineas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=comisionlineaLogic.getComisionLineas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comisionlineas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ComisionLinea comisionlinea) {
		Boolean permite=true;
		
		if(this.comisionlinea.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ComisionLineaConstantesFunciones.getOrderByListaComisionLinea();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ComisionLineaConstantesFunciones.getOrderByListaComisionLinea();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionLinea comisionlinea:comisionlineaLogic.getComisionLineas()) {
				if(comisionlinea.getsType().equals(Constantes2.S_TOTALES)) {
					comisionlineaTotales=comisionlinea;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionLinea comisionlinea:this.comisionlineas) {
				if(comisionlinea.getsType().equals(Constantes2.S_TOTALES)) {
					comisionlineaTotales=comisionlinea;
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
			this.comisionlineaAux=new ComisionLinea();
			this.comisionlineaAux.setsType(Constantes2.S_TOTALES);
			this.comisionlineaAux.setIsNew(false);
			this.comisionlineaAux.setIsChanged(false);
			this.comisionlineaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ComisionLineaConstantesFunciones.TotalizarValoresFilaComisionLinea(this.comisionlineaLogic.getComisionLineas(),this.comisionlineaAux);
				
				this.comisionlineaLogic.getComisionLineas().add(this.comisionlineaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ComisionLineaConstantesFunciones.TotalizarValoresFilaComisionLinea(this.comisionlineas,this.comisionlineaAux);
				
				this.comisionlineas.add(this.comisionlineaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		comisionlineaTotales=new ComisionLinea();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.comisionlineaLogic.getComisionLineas().remove(comisionlineaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.comisionlineas.remove(comisionlineaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		comisionlineaTotales=new ComisionLinea();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionLinea comisionlinea:comisionlineaLogic.getComisionLineas()) {
				if(comisionlinea.getsType().equals(Constantes2.S_TOTALES)) {
					comisionlineaTotales=comisionlinea;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ComisionLineaConstantesFunciones.TotalizarValoresFilaComisionLinea(this.comisionlineaLogic.getComisionLineas(),comisionlineaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionLinea comisionlinea:this.comisionlineas) {
				if(comisionlinea.getsType().equals(Constantes2.S_TOTALES)) {
					comisionlineaTotales=comisionlinea;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ComisionLineaConstantesFunciones.TotalizarValoresFilaComisionLinea(this.comisionlineas,comisionlineaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getComisionLineasFK_IdComisionConfig()throws Exception {
		try {
			sAccionBusqueda="FK_IdComisionConfig";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComisionLineasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComisionLineasFK_IdEstadoComision()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstadoComision";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComisionLineasFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComisionLineasFK_IdVendedor()throws Exception {
		try {
			sAccionBusqueda="FK_IdVendedor";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getComisionLineasFK_IdComisionConfig(String sFinalQuery,Long id_comision_config)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionlineaLogic.getComisionLineasFK_IdComisionConfig(sFinalQuery,this.pagination,id_comision_config);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComisionLineasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionlineaLogic.getComisionLineasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComisionLineasFK_IdEstadoComision(String sFinalQuery,Long id_estado_comision)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionlineaLogic.getComisionLineasFK_IdEstadoComision(sFinalQuery,this.pagination,id_estado_comision);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComisionLineasFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionlineaLogic.getComisionLineasFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComisionLineasFK_IdVendedor(String sFinalQuery,Long id_vendedor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionlineaLogic.getComisionLineasFK_IdVendedor(sFinalQuery,this.pagination,id_vendedor);
				
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
	
	public void inicializarPermisosComisionLinea() {
		this.isPermisoTodoComisionLinea=false;
		this.isPermisoNuevoComisionLinea=false;
		this.isPermisoActualizarComisionLinea=false;
		this.isPermisoActualizarOriginalComisionLinea=false;
		this.isPermisoEliminarComisionLinea=false;
		this.isPermisoGuardarCambiosComisionLinea=false;
		this.isPermisoConsultaComisionLinea=false;
		this.isPermisoBusquedaComisionLinea=false;
		this.isPermisoReporteComisionLinea=false;		
		this.isPermisoOrdenComisionLinea=false;		
		this.isPermisoPaginacionMedioComisionLinea=false;		
		this.isPermisoPaginacionAltoComisionLinea=false;
		this.isPermisoPaginacionTodoComisionLinea=false;
		this.isPermisoCopiarComisionLinea=false;		
		this.isPermisoVerFormComisionLinea=false;		
		this.isPermisoDuplicarComisionLinea=false;		
		this.isPermisoOrdenComisionLinea=false;		
	}
	
	public void setPermisosUsuarioComisionLinea(Boolean isPermiso) {
		this.isPermisoTodoComisionLinea=isPermiso;
		this.isPermisoNuevoComisionLinea=isPermiso;
		this.isPermisoActualizarComisionLinea=isPermiso;
		this.isPermisoActualizarOriginalComisionLinea=isPermiso;
		this.isPermisoEliminarComisionLinea=isPermiso;
		this.isPermisoGuardarCambiosComisionLinea=isPermiso;
		this.isPermisoConsultaComisionLinea=isPermiso;
		this.isPermisoBusquedaComisionLinea=isPermiso;
		this.isPermisoReporteComisionLinea=isPermiso;
		this.isPermisoOrdenComisionLinea=isPermiso;		
		this.isPermisoPaginacionMedioComisionLinea=isPermiso;		
		this.isPermisoPaginacionAltoComisionLinea=isPermiso;		
		this.isPermisoPaginacionTodoComisionLinea=isPermiso;		
		this.isPermisoCopiarComisionLinea=isPermiso;		
		this.isPermisoVerFormComisionLinea=isPermiso;		
		this.isPermisoDuplicarComisionLinea=isPermiso;
		this.isPermisoOrdenComisionLinea=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioComisionLinea(Boolean isPermiso) {
		//this.isPermisoTodoComisionLinea=isPermiso;
		this.isPermisoNuevoComisionLinea=isPermiso;
		this.isPermisoActualizarComisionLinea=isPermiso;
		this.isPermisoActualizarOriginalComisionLinea=isPermiso;
		this.isPermisoEliminarComisionLinea=isPermiso;
		this.isPermisoGuardarCambiosComisionLinea=isPermiso;
		//this.isPermisoConsultaComisionLinea=isPermiso;
		//this.isPermisoBusquedaComisionLinea=isPermiso;
		//this.isPermisoReporteComisionLinea=isPermiso;
		//this.isPermisoOrdenComisionLinea=isPermiso;		
		//this.isPermisoPaginacionMedioComisionLinea=isPermiso;		
		//this.isPermisoPaginacionAltoComisionLinea=isPermiso;		
		//this.isPermisoPaginacionTodoComisionLinea=isPermiso;		
		//this.isPermisoCopiarComisionLinea=isPermiso;		
		//this.isPermisoDuplicarComisionLinea=isPermiso;
		//this.isPermisoOrdenComisionLinea=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioComisionLineaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ComisionLineaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebComisionLinea(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioComisionLineaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioComisionLineaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionComisionLineaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioComisionLineaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioComisionLinea() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ComisionLineaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ComisionLineaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoComisionLinea=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarComisionLinea=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalComisionLinea=this.isPermisoActualizarComisionLinea;
			this.isPermisoEliminarComisionLinea=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosComisionLinea=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaComisionLinea=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaComisionLinea=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoComisionLinea=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteComisionLinea=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenComisionLinea=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioComisionLinea=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoComisionLinea=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoComisionLinea=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarComisionLinea=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormComisionLinea=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarComisionLinea=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenComisionLinea=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosComisionLinea.setToolTipText(this.jTableDatosComisionLinea.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioComisionLinea(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioComisionLinea(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ComisionLineaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ComisionLineaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioComisionLinea() throws Exception {
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
	public void inicializarCombosForeignKeyComisionLineaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.comisionconfigsForeignKey=new ArrayList();
				this.vendedorsForeignKey=new ArrayList();
				this.lineasForeignKey=new ArrayList();
				this.estadocomisionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyComisionLineaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ComisionLineaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyComisionLineaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyComisionConfigListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyVendedorListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstadoComisionListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyComisionConfigListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.comisionconfigsForeignKey==null||this.comisionconfigsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ComisionConfigConstantesFunciones.getArrayColumnasGlobalesComisionConfig(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ComisionConfigConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ComisionConfigConstantesFunciones.SFINALQUERY;

				this.cargarCombosComisionConfigsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyVendedorListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.vendedorsForeignKey==null||this.vendedorsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=VendedorConstantesFunciones.getArrayColumnasGlobalesVendedor(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,VendedorConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=VendedorConstantesFunciones.SFINALQUERY;

				this.cargarCombosVendedorsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.lineasForeignKey==null||this.lineasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "id_nivel_linea=1");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoComisionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estadocomisionsForeignKey==null||this.estadocomisionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstadoComisionConstantesFunciones.getArrayColumnasGlobalesEstadoComision(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoComisionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstadoComisionConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstadoComisionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyComisionLineaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ComisionLineaParameterReturnGeneral comisionlineaReturnGeneral=new ComisionLineaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.comisionlineaConstantesFunciones.cargarid_empresaComisionLinea)
					 || (this.esRecargarFks && this.comisionlineaConstantesFunciones.cargarid_empresaComisionLinea)) {

					if(!this.comisionlineaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+comisionlineaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalComisionConfig="";

				if(((this.comisionconfigsForeignKey==null||this.comisionconfigsForeignKey.size()<=0) && this.comisionlineaConstantesFunciones.cargarid_comision_configComisionLinea)
					 || (this.esRecargarFks && this.comisionlineaConstantesFunciones.cargarid_comision_configComisionLinea)) {

					if(!this.comisionlineaSessionBean.getisBusquedaDesdeForeignKeySesionComisionConfig()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ComisionConfigConstantesFunciones.getArrayColumnasGlobalesComisionConfig(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalComisionConfig=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ComisionConfigConstantesFunciones.TABLENAME);

						finalQueryGlobalComisionConfig=Funciones.GetFinalQueryAppend(finalQueryGlobalComisionConfig, "");
						finalQueryGlobalComisionConfig+=ComisionConfigConstantesFunciones.SFINALQUERY;

						//this.cargarCombosComisionConfigsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalComisionConfig=" WHERE " + ConstantesSql.ID + "="+comisionlineaSessionBean.getlidComisionConfigActual();
					}
				} else {
					finalQueryGlobalComisionConfig="NONE";
				}


				String finalQueryGlobalVendedor="";

				if(((this.vendedorsForeignKey==null||this.vendedorsForeignKey.size()<=0) && this.comisionlineaConstantesFunciones.cargarid_vendedorComisionLinea)
					 || (this.esRecargarFks && this.comisionlineaConstantesFunciones.cargarid_vendedorComisionLinea)) {

					if(!this.comisionlineaSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=VendedorConstantesFunciones.getArrayColumnasGlobalesVendedor(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalVendedor=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,VendedorConstantesFunciones.TABLENAME);

						finalQueryGlobalVendedor=Funciones.GetFinalQueryAppend(finalQueryGlobalVendedor, "");
						finalQueryGlobalVendedor+=VendedorConstantesFunciones.SFINALQUERY;

						//this.cargarCombosVendedorsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalVendedor=" WHERE " + ConstantesSql.ID + "="+comisionlineaSessionBean.getlidVendedorActual();
					}
				} else {
					finalQueryGlobalVendedor="NONE";
				}


				String finalQueryGlobalLinea="";

				if(((this.lineasForeignKey==null||this.lineasForeignKey.size()<=0) && this.comisionlineaConstantesFunciones.cargarid_lineaComisionLinea)
					 || (this.esRecargarFks && this.comisionlineaConstantesFunciones.cargarid_lineaComisionLinea)) {

					if(!this.comisionlineaSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalLinea=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

						finalQueryGlobalLinea=Funciones.GetFinalQueryAppend(finalQueryGlobalLinea, "id_nivel_linea=1");
						finalQueryGlobalLinea+=LineaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosLineasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalLinea=" WHERE " + ConstantesSql.ID + "="+comisionlineaSessionBean.getlidLineaActual();
					}
				} else {
					finalQueryGlobalLinea="NONE";
				}


				String finalQueryGlobalEstadoComision="";

				if(((this.estadocomisionsForeignKey==null||this.estadocomisionsForeignKey.size()<=0) && this.comisionlineaConstantesFunciones.cargarid_estado_comisionComisionLinea)
					 || (this.esRecargarFks && this.comisionlineaConstantesFunciones.cargarid_estado_comisionComisionLinea)) {

					if(!this.comisionlineaSessionBean.getisBusquedaDesdeForeignKeySesionEstadoComision()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstadoComisionConstantesFunciones.getArrayColumnasGlobalesEstadoComision(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstadoComision=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoComisionConstantesFunciones.TABLENAME);

						finalQueryGlobalEstadoComision=Funciones.GetFinalQueryAppend(finalQueryGlobalEstadoComision, "");
						finalQueryGlobalEstadoComision+=EstadoComisionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstadoComisionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstadoComision=" WHERE " + ConstantesSql.ID + "="+comisionlineaSessionBean.getlidEstadoComisionActual();
					}
				} else {
					finalQueryGlobalEstadoComision="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				comisionlineaReturnGeneral=comisionlineaLogic.cargarCombosLoteForeignKeyComisionLinea(finalQueryGlobalEmpresa,finalQueryGlobalComisionConfig,finalQueryGlobalVendedor,finalQueryGlobalLinea,finalQueryGlobalEstadoComision);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=comisionlineaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalComisionConfig.equals("NONE")) {
				this.comisionconfigsForeignKey=comisionlineaReturnGeneral.getcomisionconfigsForeignKey();
			}

			if(!finalQueryGlobalVendedor.equals("NONE")) {
				this.vendedorsForeignKey=comisionlineaReturnGeneral.getvendedorsForeignKey();
			}

			if(!finalQueryGlobalLinea.equals("NONE")) {
				this.lineasForeignKey=comisionlineaReturnGeneral.getlineasForeignKey();
			}

			if(!finalQueryGlobalEstadoComision.equals("NONE")) {
				this.estadocomisionsForeignKey=comisionlineaReturnGeneral.getestadocomisionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyComisionLinea()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyComisionConfig();
			this.addItemDefectoCombosForeignKeyVendedor();
			this.addItemDefectoCombosForeignKeyLinea();
			this.addItemDefectoCombosForeignKeyEstadoComision();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.comisionlineaSessionBean==null) {
				this.comisionlineaSessionBean=new ComisionLineaSessionBean();
			}

			if(!this.comisionlineaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyComisionConfig()throws Exception {
		try {

			if(!this.comisionlineaSessionBean.getisBusquedaDesdeForeignKeySesionComisionConfig()) {
				ComisionConfig comisionconfig=new ComisionConfig();
				ComisionConfigConstantesFunciones.setComisionConfigDescripcion(comisionconfig,Constantes.SMENSAJE_ESCOJA_OPCION);
				comisionconfig.setId(null);

				if(!ComisionConfigConstantesFunciones.ExisteEnLista(this.comisionconfigsForeignKey,comisionconfig,true)) {

					this.comisionconfigsForeignKey.add(0,comisionconfig);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyVendedor()throws Exception {
		try {

			if(!this.comisionlineaSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
				Vendedor vendedor=new Vendedor();
				VendedorConstantesFunciones.setVendedorDescripcion(vendedor,Constantes.SMENSAJE_ESCOJA_OPCION);
				vendedor.setId(null);

				if(!VendedorConstantesFunciones.ExisteEnLista(this.vendedorsForeignKey,vendedor,true)) {

					this.vendedorsForeignKey.add(0,vendedor);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLinea()throws Exception {
		try {

			if(!this.comisionlineaSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
				Linea linea=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(linea,Constantes.SMENSAJE_ESCOJA_OPCION);
				linea.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineasForeignKey,linea,true)) {

					this.lineasForeignKey.add(0,linea);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstadoComision()throws Exception {
		try {

			if(!this.comisionlineaSessionBean.getisBusquedaDesdeForeignKeySesionEstadoComision()) {
				EstadoComision estadocomision=new EstadoComision();
				EstadoComisionConstantesFunciones.setEstadoComisionDescripcion(estadocomision,Constantes.SMENSAJE_ESCOJA_OPCION);
				estadocomision.setId(null);

				if(!EstadoComisionConstantesFunciones.ExisteEnLista(this.estadocomisionsForeignKey,estadocomision,true)) {

					this.estadocomisionsForeignKey.add(0,estadocomision);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyComisionLinea()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyComisionLinea(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyComisionLinea()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyComisionLinea();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyComisionLinea(ComisionLinea comisionlinea)throws Exception {	
		try {
			
			this.setActualComisionConfigForeignKey(comisionlinea.getid_comision_config(),false,"Formulario");
			this.setActualVendedorForeignKey(comisionlinea.getid_vendedor(),false,"Formulario");
			this.setActualLineaForeignKey(comisionlinea.getid_linea(),false,"Formulario");
			this.setActualEstadoComisionForeignKey(comisionlinea.getid_estado_comision(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyComisionLinea(ComisionLinea comisionlinea,String sTipoEvento)throws Exception {	
		try {
			
			

				if(comisionlinea.getVendedor()!=null && !sTipoEvento.equals("id_vendedorComisionLinea")) { //sTipoEvento Evita Bucle Infinito

					this.vendedorsForeignKey=new ArrayList<Vendedor>();
					this.vendedorsForeignKey.add(comisionlinea.getVendedor());

					this.addItemDefectoCombosForeignKeyVendedor();
					this.cargarCombosFrameVendedorsForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyComisionLinea()throws Exception {	
		try {
			
			this.setActualComisionConfigForeignKey(this.comisionlineaConstantesFunciones.getid_comision_config(),false,"Formulario");
			this.setActualVendedorForeignKey(this.comisionlineaConstantesFunciones.getid_vendedor(),false,"Formulario");
			this.setActualLineaForeignKey(this.comisionlineaConstantesFunciones.getid_linea(),false,"Formulario");
			this.setActualEstadoComisionForeignKey(this.comisionlineaConstantesFunciones.getid_estado_comision(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyComisionLinea()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyComisionLinea()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyComisionLinea()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroComisionLinea()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyComisionLinea()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameComisionConfigsForeignKey("Todos");
			this.cargarCombosFrameVendedorsForeignKey("Todos");
			this.cargarCombosFrameLineasForeignKey("Todos");
			this.cargarCombosFrameEstadoComisionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyComisionLinea(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameComisionConfigsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameVendedorsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstadoComisionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyComisionLinea()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_empresaComisionLinea!=null && this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_empresaComisionLinea.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_empresaComisionLinea.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_comision_configComisionLinea!=null && this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_comision_configComisionLinea.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_comision_configComisionLinea.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_vendedorComisionLinea!=null && this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_vendedorComisionLinea.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_vendedorComisionLinea.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_lineaComisionLinea!=null && this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_lineaComisionLinea.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_lineaComisionLinea.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_estado_comisionComisionLinea!=null && this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_estado_comisionComisionLinea.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_estado_comisionComisionLinea.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public ComisionLineaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ComisionLineaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ComisionLineaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.comisionlineaSessionBean=new ComisionLineaSessionBean(); 
		this.comisionlineaConstantesFunciones=new ComisionLineaConstantesFunciones(); 
		this.comisionlineaBean=new ComisionLinea();//(this.comisionlineaConstantesFunciones); 		
		this.comisionlineaReturnGeneral=new ComisionLineaParameterReturnGeneral(); 
		
		this.comisionlineaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comisionlineaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ComisionLineaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ComisionLineaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ComisionLineaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessComisionLinea(true);
			
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
			
			this.comisionlineaConstantesFunciones=new ComisionLineaConstantesFunciones(); 
			this.comisionlineaBean=new ComisionLinea();//this.comisionlineaConstantesFunciones); 			
			this.comisionlineaReturnGeneral=new ComisionLineaParameterReturnGeneral(); 
		
			ComisionLineaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Comision Linea Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.comisionlinea=new ComisionLinea();
			this.comisionlineas = new ArrayList<ComisionLinea>();
			this.comisionlineasAux = new ArrayList<ComisionLinea>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic=new ComisionLineaLogic();
				this.comisionlineaLogic.getNewConnexionToDeep("");
			}
			
			//this.comisionlineaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.comisionlineaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormComisionLinea);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoComisionLinea!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoComisionLinea);	
					}
					
					if(this.jInternalFrameImportacionComisionLinea!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionComisionLinea);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByComisionLinea!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByComisionLinea);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormComisionLinea!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormComisionLinea);
				this.jInternalFrameDetalleFormComisionLinea.setVisible(false);
				this.jInternalFrameDetalleFormComisionLinea.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoComisionLinea!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoComisionLinea);
					this.jInternalFrameReporteDinamicoComisionLinea.setVisible(false);
					this.jInternalFrameReporteDinamicoComisionLinea.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionComisionLinea!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionComisionLinea);
					this.jInternalFrameImportacionComisionLinea.setVisible(false);
					this.jInternalFrameImportacionComisionLinea.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByComisionLinea!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByComisionLinea);
					this.jInternalFrameOrderByComisionLinea.setVisible(false);
					this.jInternalFrameOrderByComisionLinea.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idComisionLineaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ComisionLineaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.comisionlineaReturnGeneral=new ComisionLineaParameterReturnGeneral();
			
			this.comisionlineaParameterGeneral=new ComisionLineaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.comisionlineaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ComisionLineaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ComisionLineaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.comisionlineaSessionBean.getEsGuardarRelacionado(),this.comisionlineaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ComisionLineaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.comisionlineaSessionBean.getEsGuardarRelacionado(),this.comisionlineaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoComisionLinea=false;
			this.isVisibilidadCeldaDuplicarComisionLinea=true;
			this.isVisibilidadCeldaCopiarComisionLinea=true;
			this.isVisibilidadCeldaVerFormComisionLinea=true;
			this.isVisibilidadCeldaOrdenComisionLinea=true;
			this.isVisibilidadCeldaNuevoRelacionesComisionLinea=false;
			this.isVisibilidadCeldaModificarComisionLinea=false;
			this.isVisibilidadCeldaActualizarComisionLinea=false;
			this.isVisibilidadCeldaEliminarComisionLinea=false;
			this.isVisibilidadCeldaCancelarComisionLinea=false;
			this.isVisibilidadCeldaGuardarComisionLinea=false;
			this.isVisibilidadCeldaGuardarCambiosComisionLinea=false;
			
			
			this.isVisibilidadFK_IdComisionConfig=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstadoComision=true;
			this.isVisibilidadFK_IdLinea=true;
			this.isVisibilidadFK_IdVendedor=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesComisionLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosComisionLinea();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioComisionLinea(false);
			
			this.setPermisosUsuarioComisionLinea();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comisionlineaSessionBean.getEsGuardarRelacionado() 
				|| (this.comisionlineaSessionBean.getEsGuardarRelacionado() && this.comisionlineaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioComisionLineaClasesRelacionadas();
			}
			
			if(this.comisionlineaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioComisionLineaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ComisionLineaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosComisionLinea();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualComisionLinea();
			}
			
			if(!this.isPermisoBusquedaComisionLinea) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasComisionLinea.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comisionlineaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioComisionLinea,this.isPermisoPaginacionMedioComisionLinea,this.isPermisoPaginacionTodoComisionLinea);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ComisionLineaConstantesFunciones.getTiposSeleccionarComisionLinea());
				
				this.tiposColumnasSelect=ComisionLineaConstantesFunciones.getTiposSeleccionarComisionLinea(true);
				
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
			//if(!this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioComisionLinea();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioComisionLinea(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioComisionLinea(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesComisionLinea() ;
			
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
			this.comisionconfigLogic=new ComisionConfigLogic();
			this.vendedorLogic=new VendedorLogic();
			this.lineaLogic=new LineaLogic();
			this.estadocomisionLogic=new EstadoComisionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				comisionlineaImplementable= (ComisionLineaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ComisionLineaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				comisionlineaImplementableHome= (ComisionLineaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ComisionLineaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.comisionlineas= new ArrayList<ComisionLinea>();
			this.comisionlineasEliminados= new ArrayList<ComisionLinea>();
						
			this.isEsNuevoComisionLinea=false;
			this.esParaAccionDesdeFormularioComisionLinea=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idVendedorActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.comisionconfigsForeignKey=new ArrayList<ComisionConfig>() ;
			this.vendedorsForeignKey=new ArrayList<Vendedor>() ;
			this.lineasForeignKey=new ArrayList<Linea>() ;
			this.estadocomisionsForeignKey=new ArrayList<EstadoComision>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyComisionLinea(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroComisionLinea();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ComisionLineaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ComisionLineaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesComisionLinea("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingComisionLinea(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormComisionLinea!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioComisionLinea();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioComisionLinea();
			}
			
			ComisionLineaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasComisionLinea.getTabCount(); i++) {
					this.jTabbedPaneBusquedasComisionLinea.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasComisionLinea.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessComisionLinea(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ComisionLinea: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectComisionLinea() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesComisionLinea")) {
				iIndex=this.jInternalFrameDetalleFormComisionLinea.jTabbedPaneRelacionesComisionLinea.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormComisionLinea.jTabbedPaneRelacionesComisionLinea.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessComisionLinea();	
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
	
	public void cargarCombosForeignKeyComisionLinea(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyComisionLinea(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyComisionLinea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyComisionLineaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyComisionLinea();
		
		this.cargarCombosFrameForeignKeyComisionLinea();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyComisionLinea();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyComisionLinea();
		}
	}
	
	

	public void cargarCombosForeignKeyComisionConfig(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyComisionConfigListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyComisionConfig();
				this.cargarCombosFrameComisionConfigsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaComisionConfig(this.comisionconfigsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyVendedor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyVendedorListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyVendedor();
				this.cargarCombosFrameVendedorsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaVendedor(this.vendedorsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLinea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaLinea(this.lineasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoComision(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstadoComisionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstadoComision();
				this.cargarCombosFrameEstadoComisionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstadoComision(this.estadocomisionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoComisionLineaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.comisionlineaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormComisionLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
			
			
			if(jTableDatosComisionLinea.getRowCount()>=1) {
				jTableDatosComisionLinea.removeRowSelectionInterval(0, jTableDatosComisionLinea.getRowCount()-1);						
			}
			
			this.isEsNuevoComisionLinea=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoComisionLinea(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesComisionLinea(true);			
			//this.comisionlinea=new ComisionLinea();
			//this.comisionlinea.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComisionLinea(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisionLinea() ;
			
			if(ComisionLineaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComisionLinea(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.comisionlinea);	
			this.actualizarInformacion("INFO_PADRE",false,this.comisionlinea);				
			
			ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
			
			if(this.comisionlineaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ComisionLinea: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarComisionLineaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ComisionLinea> comisionlineasSeleccionados=new ArrayList<ComisionLinea>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosComisionLinea.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosComisionLinea.getSelectedRows().length;			
			}
			
			comisionlineasSeleccionados=this.getComisionLineasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoComisionLinea--;			
				//ComisionLinea comisionlineaAux= new ComisionLinea();			
				//comisionlineaAux.setId(this.iIdNuevoComisionLinea);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ComisionLinea comisionlineaOrigen=new ComisionLinea();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ComisionLinea comisionlineaOrigen : comisionlineasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							comisionlineaOrigen =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionlineaOrigen =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaComisionLinea();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.comisionlinea.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosComisionLinea(comisionlineaOrigen,this.comisionlinea,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysComisionLinea(this.comisionlinea);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.comisionlineaLogic.getComisionLineas().add(this.comisionlineaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.comisionlineas.add(this.comisionlineaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaComisionLinea(false);
				
				this.jTableDatosComisionLinea.setRowSelectionInterval(this.getIndiceNuevoComisionLinea(), this.getIndiceNuevoComisionLinea());
				
				int iLastRow =  this.jTableDatosComisionLinea.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosComisionLinea.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosComisionLinea.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaComisionLinea(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarComisionLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ComisionLinea> comisionlineasSeleccionados=new ArrayList<ComisionLinea>();									
		
			ComisionLinea comisionlineaOrigen=new ComisionLinea();
			ComisionLinea comisionlineaDestino=new ComisionLinea();
				
			comisionlineasSeleccionados=this.getComisionLineasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosComisionLinea.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || comisionlineasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosComisionLinea.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionlineaOrigen =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						comisionlineaOrigen =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionlineaDestino =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						comisionlineaDestino =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				comisionlineaOrigen =comisionlineasSeleccionados.get(0);
				comisionlineaDestino =comisionlineasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosComisionLinea(comisionlineaOrigen,comisionlineaDestino,true,false);
				
				comisionlineaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(comisionlineaDestino,comisionlineaLogic.getComisionLineas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisionlineaDestino,comisionlineas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaComisionLinea(false);
				
				//this.jTableDatosComisionLinea.setRowSelectionInterval(this.getIndiceNuevoComisionLinea(), this.getIndiceNuevoComisionLinea());
				
				int iLastRow =  this.jTableDatosComisionLinea.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosComisionLinea.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosComisionLinea.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaComisionLinea(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormComisionLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormComisionLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormComisionLinea.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarComisionLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesComisionLinea.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasComisionLinea.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesComisionLinea.setVisible(!isVisible);
			this.jPanelPaginacionComisionLinea.setVisible(!isVisible);
			this.jPanelAccionesComisionLinea.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarComisionLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameComisionLinea();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoComisionLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoComisionLinea();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionComisionLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionComisionLinea();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByComisionLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByComisionLinea();
			
			this.abrirFrameOrderByComisionLinea();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByComisionLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByComisionLinea();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleComisionLinea(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormComisionLinea);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormComisionLinea.isMaximum()) {
					this.jInternalFrameDetalleFormComisionLinea.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormComisionLinea.setSize(this.jInternalFrameDetalleFormComisionLinea.iWidthFormulario,this.jInternalFrameDetalleFormComisionLinea.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormComisionLinea.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormComisionLinea.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormComisionLinea.isMaximum()) {
						this.jInternalFrameDetalleFormComisionLinea.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormComisionLinea.jContentPaneDetalleComisionLinea.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormComisionLinea.jTabbedPaneRelacionesComisionLinea.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormComisionLinea.jContentPaneDetalleComisionLinea.getWidth(),ComisionLineaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormComisionLinea.jTabbedPaneRelacionesComisionLinea.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormComisionLinea.jContentPaneDetalleComisionLinea.getWidth(),ComisionLineaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormComisionLinea.jTabbedPaneRelacionesComisionLinea.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormComisionLinea.jContentPaneDetalleComisionLinea.getWidth(),ComisionLineaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormComisionLinea.setVisible(true);
	        this.jInternalFrameDetalleFormComisionLinea.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByComisionLinea() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByComisionLinea==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByComisionLinea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisionLinea,false,this);
				} else {
					this.jInternalFrameOrderByComisionLinea=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisionLinea,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByComisionLinea);
				this.jInternalFrameOrderByComisionLinea.setVisible(false);
				this.jInternalFrameOrderByComisionLinea.setSelected(false);
				
				this.jInternalFrameOrderByComisionLinea.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByComisionLinea"));
				
				this.inicializarActualizarBindingTablaOrderByComisionLinea();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionComisionLinea() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionComisionLinea==null) {
				
				this.jInternalFrameImportacionComisionLinea=new ImportacionJInternalFrame(ComisionLineaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionComisionLinea);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionComisionLinea);
				this.jInternalFrameImportacionComisionLinea.setVisible(false);
				this.jInternalFrameImportacionComisionLinea.setSelected(false);


				this.jInternalFrameImportacionComisionLinea.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionComisionLinea"));
				this.jInternalFrameImportacionComisionLinea.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionComisionLinea"));
				this.jInternalFrameImportacionComisionLinea.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionComisionLinea"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoComisionLinea() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoComisionLinea==null) {
				this.jInternalFrameReporteDinamicoComisionLinea=new ReporteDinamicoJInternalFrame(ComisionLineaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoComisionLinea);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoComisionLinea);
				this.jInternalFrameReporteDinamicoComisionLinea.setVisible(false);
				this.jInternalFrameReporteDinamicoComisionLinea.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoComisionLinea.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComisionLinea"));
				this.jInternalFrameReporteDinamicoComisionLinea.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComisionLinea"));
				this.jInternalFrameReporteDinamicoComisionLinea.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComisionLinea"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComisionLinea();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleComisionLinea() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormComisionLinea);
			
	       	this.jInternalFrameDetalleFormComisionLinea.setVisible(false);
	        this.jInternalFrameDetalleFormComisionLinea.setSelected(false);
			
			//this.jInternalFrameDetalleFormComisionLinea.dispose();
			//this.jInternalFrameDetalleFormComisionLinea=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoComisionLinea() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoComisionLinea.setVisible(true);
	        this.jInternalFrameReporteDinamicoComisionLinea.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionComisionLinea() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionComisionLinea.setVisible(true);
	        this.jInternalFrameImportacionComisionLinea.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByComisionLinea() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByComisionLinea.setVisible(true);
	        this.jInternalFrameOrderByComisionLinea.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByComisionLinea() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByComisionLinea.setVisible(false);
	        this.jInternalFrameOrderByComisionLinea.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoComisionLinea() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoComisionLinea.setVisible(false);
	        this.jInternalFrameReporteDinamicoComisionLinea.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionComisionLinea() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionComisionLinea.setVisible(false);
	        this.jInternalFrameImportacionComisionLinea.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeVendedor(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeVendedor);
						VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						vendedorBeanSwingJInternalFrame.setJInternalFrameParent(this);
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.sTipoBusqueda="Vendedor";
						}

						vendedorBeanSwingJInternalFrame.getTodosVendedorArbol();
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.setVendedors(vendedorBeanSwingJInternalFrame.vendedorsArbol);
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.CargarTreeVendedor();
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.setVisible(true);
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.jInternalFrameParent=this;
						TitledBorder titledBorderComisionLinea=(TitledBorder)this.jScrollPanelDatosComisionLinea.getBorder();
						TitledBorder titledBorderVendedor=(TitledBorder)vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

						titledBorderVendedor.setTitle(titledBorderComisionLinea.getTitle() + " -> Vendedor");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,vendedorBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(vendedorBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeVendedor(VendedorBeanSwingJInternalFrame jInternalFrameTreeVendedor) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeVendedor);
						jInternalFrameTreeVendedor.setVisible(false);
						jInternalFrameTreeVendedor.setSelected(false);
						//jInternalFrameTreeVendedor.dispose();
						//jInternalFrameTreeVendedor=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}

				public void abrirFrameTreeLinea(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeLinea);
						LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.sTipoBusqueda="Linea";
						}

						lineaBeanSwingJInternalFrame.getTodosLineaArbol();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setLineas(lineaBeanSwingJInternalFrame.lineasArbol);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.CargarTreeLinea();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setVisible(true);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.jInternalFrameParent=this;
						TitledBorder titledBorderComisionLinea=(TitledBorder)this.jScrollPanelDatosComisionLinea.getBorder();
						TitledBorder titledBorderLinea=(TitledBorder)lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

						titledBorderLinea.setTitle(titledBorderComisionLinea.getTitle() + " -> Linea");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,lineaBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(lineaBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeLinea(LineaBeanSwingJInternalFrame jInternalFrameTreeLinea) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeLinea);
						jInternalFrameTreeLinea.setVisible(false);
						jInternalFrameTreeLinea.setSelected(false);
						//jInternalFrameTreeLinea.dispose();
						//jInternalFrameTreeLinea=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarComisionLineaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarComisionLinea(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarComisionLinea(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesComisionLinea(true);
			//this.isEsNuevoComisionLinea=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlinea =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comisionlinea =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesComisionLinea("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComisionLinea(false) ;
			
			if(comisionlineaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ComisionLineaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComisionLinea(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisionLinea(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaComisionLineaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlinea =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionlinea =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarComisionLinea(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormComisionLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesComisionLinea(true);
			//this.isEsNuevoComisionLinea=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlinea =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comisionlinea =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.comisionlinea.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesComisionLinea("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesComisionLinea(false) ;
			
			if(ComisionLineaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComisionLinea(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisionLinea(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Vendedor")) {
				if(!this.comisionlineaConstantesFunciones.cargarid_vendedorComisionLinea) {
					this.cargarCombosVendedorsForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingComisionLinea(false,false);
					this.cargarCombosFrameVendedorsForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_vendedor (id);

				this.recargarComboTablaVendedor(this.vendedorsForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaComisionConfig(List<ComisionConfig> comisionconfigsForeignKey)throws Exception{
		TableColumn tableColumnComisionConfig=this.jTableDatosComisionLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionLinea,ComisionLineaConstantesFunciones.LABEL_IDCOMISIONCONFIG));
		TableCellEditor tableCellEditorComisionConfig =tableColumnComisionConfig.getCellEditor();

		ComisionConfigTableCell comisionconfigTableCellFk=(ComisionConfigTableCell)tableCellEditorComisionConfig;

		if(comisionconfigTableCellFk!=null) {
			comisionconfigTableCellFk.setcomisionconfigsForeignKey(comisionconfigsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComisionLinea.getSelectedRow();

		//if(intSelectedRow<=0) {
			//comisionconfigTableCellFk.setRowActual(intSelectedRow);
			//comisionconfigTableCellFk.setcomisionconfigsForeignKeyActual(comisionconfigsForeignKey);
		//}


		if(comisionconfigTableCellFk!=null) {
			comisionconfigTableCellFk.RecargarComisionConfigsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaVendedor(List<Vendedor> vendedorsForeignKey)throws Exception{
		TableColumn tableColumnVendedor=this.jTableDatosComisionLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionLinea,ComisionLineaConstantesFunciones.LABEL_IDVENDEDOR));
		TableCellEditor tableCellEditorVendedor =tableColumnVendedor.getCellEditor();

		VendedorTableCell vendedorTableCellFk=(VendedorTableCell)tableCellEditorVendedor;

		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.setvendedorsForeignKey(vendedorsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComisionLinea.getSelectedRow();

		//if(intSelectedRow<=0) {
			//vendedorTableCellFk.setRowActual(intSelectedRow);
			//vendedorTableCellFk.setvendedorsForeignKeyActual(vendedorsForeignKey);
		//}


		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.RecargarVendedorsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLinea(List<Linea> lineasForeignKey)throws Exception{
		TableColumn tableColumnLinea=this.jTableDatosComisionLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionLinea,ComisionLineaConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComisionLinea.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstadoComision(List<EstadoComision> estadocomisionsForeignKey)throws Exception{
		TableColumn tableColumnEstadoComision=this.jTableDatosComisionLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionLinea,ComisionLineaConstantesFunciones.LABEL_IDESTADOCOMISION));
		TableCellEditor tableCellEditorEstadoComision =tableColumnEstadoComision.getCellEditor();

		EstadoComisionTableCell estadocomisionTableCellFk=(EstadoComisionTableCell)tableCellEditorEstadoComision;

		if(estadocomisionTableCellFk!=null) {
			estadocomisionTableCellFk.setestadocomisionsForeignKey(estadocomisionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComisionLinea.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estadocomisionTableCellFk.setRowActual(intSelectedRow);
			//estadocomisionTableCellFk.setestadocomisionsForeignKeyActual(estadocomisionsForeignKey);
		//}


		if(estadocomisionTableCellFk!=null) {
			estadocomisionTableCellFk.RecargarEstadoComisionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_vendedor (Long id) throws Exception {
		this.setActualVendedorForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarComisionLineaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesComisionLinea(false);
			
			//if(!this.isEsNuevoComisionLinea) {								
				int intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlinea =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionlinea =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ComisionLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualComisionLinea(this.comisionlinea,true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionLinea(this.comisionlinea);
				
			}
			
			if(this.permiteMantenimiento(this.comisionlinea)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoComisionLinea=true;
					this.inicializarActualizarBindingTablaComisionLinea(false);
					this.isEsNuevoComisionLinea=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoComisionLinea=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoComisionLinea=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesComisionLinea(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComisionLinea(false);
				
				this.habilitarDeshabilitarControlesComisionLinea(false);
			
												
				
				if(ComisionLineaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleComisionLinea();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoComisionLineaActionPerformed(evt,comisionlineaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualComisionLinea(this.comisionlinea,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosComisionLinea.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,comisionlineaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.comisionlinea.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ComisionLinea.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionLinea.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarComisionLineaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlinea =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				this.comisionlinea.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comisionlinea =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				this.comisionlinea.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.comisionlinea)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ComisionLineaModel) this.jTableDatosComisionLinea.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoComisionLinea=true;
				this.inicializarActualizarBindingTablaComisionLinea(false);
				this.isEsNuevoComisionLinea=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesComisionLinea(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComisionLinea(false);
				
				this.habilitarDeshabilitarControlesComisionLinea(false);
				
				
				
				if(ComisionLineaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleComisionLinea();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarComisionLineaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosComisionLinea.getRowCount()>=1) {
				jTableDatosComisionLinea.removeRowSelectionInterval(0, jTableDatosComisionLinea.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesComisionLinea(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaComisionLinea(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComisionLinea(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisionLinea(false) ;
			
			this.isEsNuevoComisionLinea=false;
			
			if(ComisionLineaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleComisionLinea();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosComisionLineaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingComisionLinea(false);
				
				//SI ES MANUAL
				if(ComisionLineaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualComisionLinea();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosComisionLineaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoComisionLinea--;			
			//ComisionLinea comisionlineaAux= new ComisionLinea();			
			//comisionlineaAux.setId(this.iIdNuevoComisionLinea);
			
			if(this.jInternalFrameDetalleFormComisionLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaComisionLinea();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysComisionLinea(this.comisionlinea);
			
			this.comisionlinea.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.comisionlineaLogic.getComisionLineas().add(this.comisionlineaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.comisionlineas.add(this.comisionlineaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaComisionLinea(false);
			
			this.jTableDatosComisionLinea.setRowSelectionInterval(this.getIndiceNuevoComisionLinea(), this.getIndiceNuevoComisionLinea());
			
			int iLastRow =  this.jTableDatosComisionLinea.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosComisionLinea.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosComisionLinea.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaComisionLinea(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionComisionLineaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingComisionLinea(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisionLinea(false);
			
			//SI ES MANUAL
			if(ComisionLineaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComisionLinea();
			}
			
			//this.abrirFrameTreeComisionLinea();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionComisionLineaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Comision LineaS ?", "MANTENIMIENTO DE Comision Linea", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionComisionLinea.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralComisionLinea();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.comisionlineaReturnGeneral=comisionlineaLogic.procesarImportacionComisionLineasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.comisionlineaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarComisionLineaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionComisionLineaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionComisionLinea.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionComisionLinea.setFileImportacion(this.jInternalFrameImportacionComisionLinea.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionComisionLinea.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionComisionLinea.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionComisionLinea.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionComisionLinea.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoComisionLineaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ComisionLinea> comisionlineasSeleccionados=new ArrayList<ComisionLinea>();		

		comisionlineasSeleccionados=this.getComisionLineasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisionLinea.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisionLinea.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ComisionLineaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ComisionLineaBaseDesign.jrxml";
			
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
			
			this.generarReporteComisionLineas("Todos",comisionlineasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionlineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Linea",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoComisionLinea.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionLinea.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ComisionLineaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionLineaConstantesFunciones.LABEL_IDCOMISIONCONFIG:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ComisionConfig_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ComisionConfig_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ComisionConfig_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ComisionConfig_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionLineaConstantesFunciones.LABEL_IDVENDEDOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Vendedor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Vendedor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Vendedor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Vendedor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionLineaConstantesFunciones.LABEL_IDLINEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Linea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Linea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Linea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Linea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionLineaConstantesFunciones.LABEL_IDESTADOCOMISION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EstadoComision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EstadoComision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EstadoComision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EstadoComision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionLineaConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionLineaConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoComisionLinea.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoComisionLinea.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoComisionLinea.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ComisionLineaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ComisionLineaConstantesFunciones.LABEL_IDCOMISIONCONFIG:
					sNombreCampoCategoria="id_comision_config";
					break;

				case ComisionLineaConstantesFunciones.LABEL_IDVENDEDOR:
					sNombreCampoCategoria="id_vendedor";
					break;

				case ComisionLineaConstantesFunciones.LABEL_IDLINEA:
					sNombreCampoCategoria="id_linea";
					break;

				case ComisionLineaConstantesFunciones.LABEL_IDESTADOCOMISION:
					sNombreCampoCategoria="id_estado_comision";
					break;

				case ComisionLineaConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case ComisionLineaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoComisionLinea.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ComisionLineaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ComisionLineaConstantesFunciones.LABEL_IDCOMISIONCONFIG:
					sNombreCampoCategoriaValor="id_comision_config";
					break;

				case ComisionLineaConstantesFunciones.LABEL_IDVENDEDOR:
					sNombreCampoCategoriaValor="id_vendedor";
					break;

				case ComisionLineaConstantesFunciones.LABEL_IDLINEA:
					sNombreCampoCategoriaValor="id_linea";
					break;

				case ComisionLineaConstantesFunciones.LABEL_IDESTADOCOMISION:
					sNombreCampoCategoriaValor="id_estado_comision";
					break;

				case ComisionLineaConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case ComisionLineaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoComisionLinea.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionLinea.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ComisionLineaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ComisionLineaConstantesFunciones.LABEL_IDCOMISIONCONFIG:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Configuracion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_comision_config");
					break;

				case ComisionLineaConstantesFunciones.LABEL_IDVENDEDOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Vendedor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_vendedor");
					break;

				case ComisionLineaConstantesFunciones.LABEL_IDLINEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea");
					break;

				case ComisionLineaConstantesFunciones.LABEL_IDESTADOCOMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estado_comision");
					break;

				case ComisionLineaConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case ComisionLineaConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoComisionLineaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ComisionLinea> comisionlineasSeleccionados=new ArrayList<ComisionLinea>();		
		
		comisionlineasSeleccionados=this.getComisionLineasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionlinea";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ComisionLineas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoComisionLinea.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionLinea.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ComisionLineaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionLineaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ComisionLinea comisionlinea:comisionlineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionlinea.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionLineaConstantesFunciones.LABEL_IDCOMISIONCONFIG:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionLineaConstantesFunciones.LABEL_IDCOMISIONCONFIG);
					iRow++;

					for(ComisionLinea comisionlinea:comisionlineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionlinea.getcomisionconfig_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionLineaConstantesFunciones.LABEL_IDVENDEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionLineaConstantesFunciones.LABEL_IDVENDEDOR);
					iRow++;

					for(ComisionLinea comisionlinea:comisionlineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionlinea.getvendedor_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionLineaConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionLineaConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(ComisionLinea comisionlinea:comisionlineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionlinea.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionLineaConstantesFunciones.LABEL_IDESTADOCOMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionLineaConstantesFunciones.LABEL_IDESTADOCOMISION);
					iRow++;

					for(ComisionLinea comisionlinea:comisionlineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionlinea.getestadocomision_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionLineaConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionLineaConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(ComisionLinea comisionlinea:comisionlineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionlinea.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionLineaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionLineaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ComisionLinea comisionlinea:comisionlineasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionlinea.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelComisionLinea(row);				
			//	iRow++;
			//}				
			
			//for(ComisionLinea comisionlineaAux:comisionlineasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelComisionLinea(comisionlineaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionlineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Linea",JOptionPane.INFORMATION_MESSAGE);
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
				this.comisionlineaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisionLinea(false);
			
			//SI ES MANUAL
			if(ComisionLineaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComisionLinea();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresComisionLineaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisionLinea(false);
			
			//SI ES MANUAL
			if(ComisionLineaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualComisionLinea();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesComisionLineaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisionLinea(false);
			
			//SI ES MANUAL
			if(ComisionLineaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualComisionLinea();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaComisionLinea() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosComisionLinea.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosComisionLinea.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosComisionLinea.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosComisionLinea.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosComisionLinea.setMinimumSize(dimensionMinimum);
		this.jTableDatosComisionLinea.setMaximumSize(dimensionMaximum);
		this.jTableDatosComisionLinea.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingComisionLinea(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingComisionLinea(esInicializar,true);
	}
	
	public void inicializarActualizarBindingComisionLinea(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaComisionLinea(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesComisionLinea(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasComisionLinea(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesComisionLinea(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesComisionLinea(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ComisionLineaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ComisionLineaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualComisionLinea() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaComisionLinea();
		
		this.inicializarActualizarBindingBotonesManualComisionLinea(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualComisionLinea();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesComisionLinea() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualComisionLinea(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualComisionLinea(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosComisionLinea.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosComisionLinea.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteComisionLinea.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormComisionLinea!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormComisionLinea.jCheckBoxPostAccionNuevoComisionLinea.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormComisionLinea.jCheckBoxPostAccionSinCerrarComisionLinea.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormComisionLinea.jCheckBoxPostAccionSinMensajeComisionLinea.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosComisionLinea.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosComisionLinea.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteComisionLinea.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormComisionLinea!=null) {
				this.jInternalFrameDetalleFormComisionLinea.jCheckBoxPostAccionNuevoComisionLinea.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormComisionLinea.jCheckBoxPostAccionSinCerrarComisionLinea.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormComisionLinea.jCheckBoxPostAccionSinMensajeComisionLinea.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionComisionLinea.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionComisionLinea.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormComisionLinea!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormComisionLinea.jComboBoxTiposAccionesFormularioComisionLinea.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesComisionLinea.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoComisionLinea!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisionLinea.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesComisionLinea.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesComisionLinea.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarComisionLinea.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesComisionLinea.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoComisionLinea!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisionLinea.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesComisionLinea.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralComisionLinea.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesComisionLinea(Boolean esInicializar) throws Exception {
		try	{	
			if(ComisionLineaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualComisionLinea(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesComisionLinea() throws Exception {
		try	{
			if(ComisionLineaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualComisionLinea();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleComisionLinea() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormComisionLinea.jComboBoxTiposAccionesFormularioComisionLinea.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormComisionLinea.jComboBoxTiposAccionesFormularioComisionLinea.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualComisionLinea() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesComisionLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesComisionLinea.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesComisionLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesComisionLinea.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesComisionLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesComisionLinea.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionComisionLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionComisionLinea.addItem(reporte);
			}
			
			
			if(!this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionComisionLinea.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionComisionLinea.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesComisionLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesComisionLinea.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesComisionLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesComisionLinea.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormComisionLinea!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormComisionLinea.jComboBoxTiposAccionesFormularioComisionLinea.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormComisionLinea.jComboBoxTiposAccionesFormularioComisionLinea.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarComisionLinea.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarComisionLinea.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarComisionLinea.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComisionLinea();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComisionLinea() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoComisionLinea!=null) {
				this.jInternalFrameReporteDinamicoComisionLinea.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoComisionLinea.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoComisionLinea!=null) {
				this.jInternalFrameReporteDinamicoComisionLinea.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoComisionLinea.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoComisionLinea!=null) {
				
				if(this.jInternalFrameReporteDinamicoComisionLinea.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoComisionLinea.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComisionLinea.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoComisionLinea.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoComisionLinea.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComisionLinea.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoComisionLinea.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoComisionLinea.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ComisionLineaConstantesFunciones.getTiposSeleccionarComisionLinea(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoComisionLinea.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoComisionLinea.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoComisionLinea.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ComisionLineaConstantesFunciones.getTiposSeleccionarComisionLinea(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoComisionLinea.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoComisionLinea.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoComisionLinea.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ComisionLineaConstantesFunciones.getTiposSeleccionarComisionLinea(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComisionLinea.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoComisionLinea.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoComisionLinea.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoComisionLinea.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualComisionLinea()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_comision_configFK_IdComisionConfigComisionLinea.getSelectedItem()!=null){this.id_comision_configFK_IdComisionConfig=((ComisionConfig)this.jComboBoxid_comision_configFK_IdComisionConfigComisionLinea.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasComisionLinea(Boolean esInicializar) throws Exception {				
		if(ComisionLineaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualComisionLinea();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaComisionLinea() throws Exception {
		this.inicializarActualizarBindingTablaComisionLinea(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByComisionLinea() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByComisionLinea.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByComisionLinea.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComisionLinea.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ComisionLineaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByComisionLinea.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComisionLinea.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ComisionLineaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosComisionLineaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionLineaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ComisionLineaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByComisionLinea.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComisionLinea.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ComisionLineaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByComisionLinea.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaComisionLinea(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=comisionlineaLogic.getComisionLineas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=comisionlineas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ComisionLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosComisionLinea.setModel(new ComisionLineaModel(this.comisionlineaLogic.getComisionLineas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosComisionLinea.setModel(new ComisionLineaModel(this.comisionlineas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByComisionLinea!=null && this.jInternalFrameOrderByComisionLinea.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByComisionLinea();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosComisionLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionLinea,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ComisionLineaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO,comisionlineaConstantesFunciones.resaltarSeleccionarComisionLinea,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ComisionLineaConstantesFunciones.SCLASSWEBTITULO,comisionlineaConstantesFunciones.resaltarSeleccionarComisionLinea,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosComisionLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionLinea,ComisionLineaConstantesFunciones.LABEL_ID));

		if(this.comisionlineaConstantesFunciones.mostraridComisionLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionLineaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comisionlineaConstantesFunciones.resaltaridComisionLinea,this.comisionlineaConstantesFunciones.activaridComisionLinea,iSizeTabla,this,true,"idComisionLinea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisionlineaConstantesFunciones.resaltaridComisionLinea,this.comisionlineaConstantesFunciones.activaridComisionLinea,this,true,"idComisionLinea","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionLinea,ComisionLineaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.comisionlineaConstantesFunciones.mostrarid_empresaComisionLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionLineaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.comisionlineaConstantesFunciones.resaltarid_empresaComisionLinea,this,this.comisionlineaConstantesFunciones.activarid_empresaComisionLinea,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.comisionlineaConstantesFunciones.resaltarid_empresaComisionLinea,this,this.comisionlineaConstantesFunciones.activarid_empresaComisionLinea,false,"id_empresaComisionLinea","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionLineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionLinea,ComisionLineaConstantesFunciones.LABEL_IDCOMISIONCONFIG));

		if(this.comisionlineaConstantesFunciones.mostrarid_comision_configComisionLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionLineaConstantesFunciones.LABEL_IDCOMISIONCONFIG,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ComisionConfigTableCell(this.comisionconfigsForeignKey,this.comisionlineaConstantesFunciones.resaltarid_comision_configComisionLinea,this,this.comisionlineaConstantesFunciones.activarid_comision_configComisionLinea,iSizeTabla));
			tableColumn.setCellEditor(new ComisionConfigTableCell(this.comisionconfigsForeignKey,this.comisionlineaConstantesFunciones.resaltarid_comision_configComisionLinea,this,this.comisionlineaConstantesFunciones.activarid_comision_configComisionLinea,true,"id_comision_configComisionLinea","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionLineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionLinea,ComisionLineaConstantesFunciones.LABEL_IDVENDEDOR));

		if(this.comisionlineaConstantesFunciones.mostrarid_vendedorComisionLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionLineaConstantesFunciones.LABEL_IDVENDEDOR,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new VendedorTableCell(this.vendedorsForeignKey,this.comisionlineaConstantesFunciones.resaltarid_vendedorComisionLinea,this,this.comisionlineaConstantesFunciones.activarid_vendedorComisionLinea,iSizeTabla));
			tableColumn.setCellEditor(new VendedorTableCell(this.vendedorsForeignKey,this.comisionlineaConstantesFunciones.resaltarid_vendedorComisionLinea,this,this.comisionlineaConstantesFunciones.activarid_vendedorComisionLinea,true,"id_vendedorComisionLinea","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionLineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionLinea,ComisionLineaConstantesFunciones.LABEL_IDLINEA));

		if(this.comisionlineaConstantesFunciones.mostrarid_lineaComisionLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionLineaConstantesFunciones.LABEL_IDLINEA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineasForeignKey,this.comisionlineaConstantesFunciones.resaltarid_lineaComisionLinea,this,this.comisionlineaConstantesFunciones.activarid_lineaComisionLinea,iSizeTabla));
			tableColumn.setCellEditor(new LineaTableCell(this.lineasForeignKey,this.comisionlineaConstantesFunciones.resaltarid_lineaComisionLinea,this,this.comisionlineaConstantesFunciones.activarid_lineaComisionLinea,true,"id_lineaComisionLinea","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionLineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionLinea,ComisionLineaConstantesFunciones.LABEL_IDESTADOCOMISION));

		if(this.comisionlineaConstantesFunciones.mostrarid_estado_comisionComisionLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionLineaConstantesFunciones.LABEL_IDESTADOCOMISION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstadoComisionTableCell(this.estadocomisionsForeignKey,this.comisionlineaConstantesFunciones.resaltarid_estado_comisionComisionLinea,this,this.comisionlineaConstantesFunciones.activarid_estado_comisionComisionLinea,iSizeTabla));
			tableColumn.setCellEditor(new EstadoComisionTableCell(this.estadocomisionsForeignKey,this.comisionlineaConstantesFunciones.resaltarid_estado_comisionComisionLinea,this,this.comisionlineaConstantesFunciones.activarid_estado_comisionComisionLinea,true,"id_estado_comisionComisionLinea","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionLineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionLinea,ComisionLineaConstantesFunciones.LABEL_PORCENTAJE));

		if(this.comisionlineaConstantesFunciones.mostrarporcentajeComisionLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionLineaConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comisionlineaConstantesFunciones.resaltarporcentajeComisionLinea,this.comisionlineaConstantesFunciones.activarporcentajeComisionLinea,iSizeTabla,this,true,"porcentajeComisionLinea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisionlineaConstantesFunciones.resaltarporcentajeComisionLinea,this.comisionlineaConstantesFunciones.activarporcentajeComisionLinea,this,true,"porcentajeComisionLinea","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComisionLineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionLinea,ComisionLineaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.comisionlineaConstantesFunciones.mostrardescripcionComisionLinea && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionLineaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comisionlineaConstantesFunciones.resaltardescripcionComisionLinea,this.comisionlineaConstantesFunciones.activardescripcionComisionLinea,iSizeTabla,this,true,"descripcionComisionLinea","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisionlineaConstantesFunciones.resaltardescripcionComisionLinea,this.comisionlineaConstantesFunciones.activardescripcionComisionLinea,this,true,"descripcionComisionLinea","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionLineaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.comisionlineaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.comisionlineaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.comisionlineaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosComisionLinea.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.comisionlineaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.comisionlineaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosComisionLinea.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarComisionLinea && this.isPermisoGuardarCambiosComisionLinea) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.comisionlineaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.comisionlineaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosComisionLinea.addColumn(tableColumn);
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
			
			this.jTableDatosComisionLinea.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarComisionLinea && this.isPermisoGuardarCambiosComisionLinea) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarComisionLinea && this.isPermisoGuardarCambiosComisionLinea) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosComisionLinea.moveColumn(this.jTableDatosComisionLinea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosComisionLinea.moveColumn(this.jTableDatosComisionLinea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosComisionLinea.moveColumn(this.jTableDatosComisionLinea.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosComisionLinea.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosComisionLinea.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosComisionLinea,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ComisionLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosComisionLinea.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosComisionLinea.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ComisionLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ComisionLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosComisionLinea.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosComisionLinea.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosComisionLinea.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=comisionlineaLogic.getComisionLineas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=comisionlineas.size()-1;
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
		//this.jTableDatosComisionLinea.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosComisionLinea.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosComisionLinea();
			
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
				
				//this.isEsNuevoComisionLinea=false;
					
				ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
			
				if(this.comisionlineaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormComisionLinea==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosComisionLinea.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosComisionLinea.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlinea =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionlinea =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.comisionlinea.getsType().equals("DUPLICADO")
				   || this.comisionlinea.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoComisionLinea=true;
				
				} else {
					this.isEsNuevoComisionLinea=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
					if(this.comisionlinea.getId()>=0 && !this.comisionlinea.getIsNew()) {						
						this.isEsNuevoComisionLinea=false;
						
					} else {
						this.isEsNuevoComisionLinea=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoComisionLinea(esRelaciones);						
				
				this.seleccionarComisionLinea(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.comisionlinea.getId()<0) {
					this.isEsNuevoComisionLinea=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarComisionLinea(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarComisionLinea(evt,rowIndex);
				}	
				
				if(this.comisionlineaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ComisionLinea: " + this.dDif); 
					}
				}								
				
				ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarComisionLinea(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.comisionlinea)) {
					if(this.comisionlinea.getId()>0) {
						this.comisionlinea.setIsDeleted(true);
						
						this.comisionlineasEliminados.add(this.comisionlinea);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.comisionlineaLogic.getComisionLineas().remove(this.comisionlinea);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.comisionlineas.remove(this.comisionlinea);				
					}
					
					
					((ComisionLineaModel) this.jTableDatosComisionLinea.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaComisionLinea(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarComisionLinea(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoComisionLinea) {
			
			if(this.jInternalFrameDetalleFormComisionLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosComisionLinea.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosComisionLinea.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlinea =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionlinea =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ComisionLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioComisionLinea(this.comisionlinea);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.comisionlineaConstantesFunciones.cargarid_empresaComisionLinea || this.comisionlineaConstantesFunciones.event_dependid_empresaComisionLinea) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.comisionlinea.getid_empresa());
									//this.inicializarActualizarBindingComisionLinea(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(comisionlinea.getEmpresa()!=null) {
							this.empresasForeignKey.add(comisionlinea.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.comisionlinea.getid_empresa(),false,"Formulario");

					//ComisionConfig
					if(!this.comisionlineaConstantesFunciones.cargarid_comision_configComisionLinea || this.comisionlineaConstantesFunciones.event_dependid_comision_configComisionLinea) {
						//this.cargarCombosComisionConfigsForeignKeyLista(" where id="+this.comisionlinea.getid_comision_config());
									//this.inicializarActualizarBindingComisionLinea(false,false);
						this.comisionconfigsForeignKey=new ArrayList<ComisionConfig>();

						if(comisionlinea.getComisionConfig()!=null) {
							this.comisionconfigsForeignKey.add(comisionlinea.getComisionConfig());
						}

						this.addItemDefectoCombosForeignKeyComisionConfig();
						this.cargarCombosFrameComisionConfigsForeignKey("Todos");
					}
					this.setActualComisionConfigForeignKey(this.comisionlinea.getid_comision_config(),false,"Formulario");

					//Vendedor
					if(!this.comisionlineaConstantesFunciones.cargarid_vendedorComisionLinea || this.comisionlineaConstantesFunciones.event_dependid_vendedorComisionLinea) {
						//this.cargarCombosVendedorsForeignKeyLista(" where id="+this.comisionlinea.getid_vendedor());
									//this.inicializarActualizarBindingComisionLinea(false,false);
						this.vendedorsForeignKey=new ArrayList<Vendedor>();

						if(comisionlinea.getVendedor()!=null) {
							this.vendedorsForeignKey.add(comisionlinea.getVendedor());
						}

						this.addItemDefectoCombosForeignKeyVendedor();
						this.cargarCombosFrameVendedorsForeignKey("Todos");
					}
					this.setActualVendedorForeignKey(this.comisionlinea.getid_vendedor(),false,"Formulario");

					//Linea
					if(!this.comisionlineaConstantesFunciones.cargarid_lineaComisionLinea || this.comisionlineaConstantesFunciones.event_dependid_lineaComisionLinea) {
						//this.cargarCombosLineasForeignKeyLista(" where id="+this.comisionlinea.getid_linea());
									//this.inicializarActualizarBindingComisionLinea(false,false);
						this.lineasForeignKey=new ArrayList<Linea>();

						if(comisionlinea.getLinea()!=null) {
							this.lineasForeignKey.add(comisionlinea.getLinea());
						}

						this.addItemDefectoCombosForeignKeyLinea();
						this.cargarCombosFrameLineasForeignKey("Todos");
					}
					this.setActualLineaForeignKey(this.comisionlinea.getid_linea(),false,"Formulario");

					//EstadoComision
					if(!this.comisionlineaConstantesFunciones.cargarid_estado_comisionComisionLinea || this.comisionlineaConstantesFunciones.event_dependid_estado_comisionComisionLinea) {
						//this.cargarCombosEstadoComisionsForeignKeyLista(" where id="+this.comisionlinea.getid_estado_comision());
									//this.inicializarActualizarBindingComisionLinea(false,false);
						this.estadocomisionsForeignKey=new ArrayList<EstadoComision>();

						if(comisionlinea.getEstadoComision()!=null) {
							this.estadocomisionsForeignKey.add(comisionlinea.getEstadoComision());
						}

						this.addItemDefectoCombosForeignKeyEstadoComision();
						this.cargarCombosFrameEstadoComisionsForeignKey("Todos");
					}
					this.setActualEstadoComisionForeignKey(this.comisionlinea.getid_estado_comision(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesComisionLinea("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesComisionLinea(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComisionLinea() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoComisionLinea(ComisionLinea comisionlinea) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoComisionLinea(comisionlinea,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoComisionLinea(ComisionLinea comisionlinea,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioComisionLinea(comisionlinea);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyComisionLinea(comisionlinea,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyComisionLinea(comisionlinea);
	}
	
	public void setVariablesObjetoActualToFormularioComisionLinea(ComisionLinea comisionlinea) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormComisionLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormComisionLinea.jLabelidComisionLinea.setText(comisionlinea.getId().toString());
			this.jInternalFrameDetalleFormComisionLinea.jTextFieldporcentajeComisionLinea.setText(comisionlinea.getporcentaje().toString());
			this.jInternalFrameDetalleFormComisionLinea.jTextAreadescripcionComisionLinea.setText(comisionlinea.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ComisionLinea comisionlineaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,comisionlineaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ComisionLinea comisionlineaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				comisionlineaLocal=this.comisionlinea;
			} else {
				comisionlineaLocal=this.comisionlineaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(comisionlineaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoComisionLinea(comisionlineaLocal,true);
					
					if(comisionlineaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(comisionlineaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(comisionlineaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoComisionLinea(ComisionLinea comisionlinea,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualComisionLinea(comisionlinea,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysComisionLinea(comisionlinea);
	}
	
	public void setVariablesFormularioToObjetoActualComisionLinea(ComisionLinea comisionlinea,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualComisionLinea(comisionlinea,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualComisionLinea(ComisionLinea comisionlinea,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormComisionLinea==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormComisionLinea.jLabelidComisionLinea.getText()==null || this.jInternalFrameDetalleFormComisionLinea.jLabelidComisionLinea.getText()=="" || this.jInternalFrameDetalleFormComisionLinea.jLabelidComisionLinea.getText()=="Id") {
				this.jInternalFrameDetalleFormComisionLinea.jLabelidComisionLinea.setText("0");
			}

			if(conColumnasBase) {comisionlinea.setId(Long.parseLong(this.jInternalFrameDetalleFormComisionLinea.jLabelidComisionLinea.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionLineaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionLinea.jLabelIdComisionLinea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comisionlinea.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormComisionLinea.jTextFieldporcentajeComisionLinea.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionLineaConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionLinea.jLabelporcentajeComisionLinea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comisionlinea.setdescripcion(this.jInternalFrameDetalleFormComisionLinea.jTextAreadescripcionComisionLinea.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionLineaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionLinea.jLabeldescripcionComisionLinea,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualComisionLinea(ComisionLinea comisionlineaBean,ComisionLinea comisionlinea,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && comisionlineaBean.getid_comision_config()!=null && !comisionlineaBean.getid_comision_config().equals(-1L))) {comisionlinea.setid_comision_config(comisionlineaBean.getid_comision_config());}
			if(conDefault || (!conDefault && comisionlineaBean.getid_vendedor()!=null && !comisionlineaBean.getid_vendedor().equals(-1L))) {comisionlinea.setid_vendedor(comisionlineaBean.getid_vendedor());}
			if(conDefault || (!conDefault && comisionlineaBean.getid_linea()!=null && !comisionlineaBean.getid_linea().equals(-1L))) {comisionlinea.setid_linea(comisionlineaBean.getid_linea());}
			if(conDefault || (!conDefault && comisionlineaBean.getid_estado_comision()!=null && !comisionlineaBean.getid_estado_comision().equals(-1L))) {comisionlinea.setid_estado_comision(comisionlineaBean.getid_estado_comision());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosComisionLinea(ComisionLinea comisionlineaOrigen,ComisionLinea comisionlinea,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && comisionlineaOrigen.getId()!=null && !comisionlineaOrigen.getId().equals(0L))) {comisionlinea.setId(comisionlineaOrigen.getId());}}
			if(conDefault || (!conDefault && comisionlineaOrigen.getid_comision_config()!=null && !comisionlineaOrigen.getid_comision_config().equals(-1L))) {comisionlinea.setid_comision_config(comisionlineaOrigen.getid_comision_config());}
			if(conDefault || (!conDefault && comisionlineaOrigen.getid_vendedor()!=null && !comisionlineaOrigen.getid_vendedor().equals(-1L))) {comisionlinea.setid_vendedor(comisionlineaOrigen.getid_vendedor());}
			if(conDefault || (!conDefault && comisionlineaOrigen.getid_linea()!=null && !comisionlineaOrigen.getid_linea().equals(-1L))) {comisionlinea.setid_linea(comisionlineaOrigen.getid_linea());}
			if(conDefault || (!conDefault && comisionlineaOrigen.getid_estado_comision()!=null && !comisionlineaOrigen.getid_estado_comision().equals(-1L))) {comisionlinea.setid_estado_comision(comisionlineaOrigen.getid_estado_comision());}
			if(conDefault || (!conDefault && comisionlineaOrigen.getporcentaje()!=null && !comisionlineaOrigen.getporcentaje().equals(0.0))) {comisionlinea.setporcentaje(comisionlineaOrigen.getporcentaje());}
			if(conDefault || (!conDefault && comisionlineaOrigen.getdescripcion()!=null && !comisionlineaOrigen.getdescripcion().equals(""))) {comisionlinea.setdescripcion(comisionlineaOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioComisionLinea(ComisionLinea comisionlinea) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormComisionLinea.jLabelidComisionLinea.setText(comisionlinea.getId().toString());
			this.jInternalFrameDetalleFormComisionLinea.jTextFieldporcentajeComisionLinea.setText(comisionlinea.getporcentaje().toString());
			this.jInternalFrameDetalleFormComisionLinea.jTextAreadescripcionComisionLinea.setText(comisionlinea.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioComisionLinea(ComisionLineaBean comisionlineaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormComisionLinea.jLabelidComisionLinea.setText(comisionlineaBean.getId().toString());
			this.jInternalFrameDetalleFormComisionLinea.jTextFieldporcentajeComisionLinea.setText(comisionlineaBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormComisionLinea.jTextAreadescripcionComisionLinea.setText(comisionlineaBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanComisionLinea(ComisionLineaParameterReturnGeneral comisionlineaReturnGeneral,ComisionLineaBean comisionlineaBean,Boolean conDefault) throws Exception { 
		try {
			ComisionLinea comisionlineaLocal=new ComisionLinea();
			
			comisionlineaLocal=comisionlineaReturnGeneral.getComisionLinea();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && comisionlineaLocal.getId()!=null && !comisionlineaLocal.getId().equals(0L))) {comisionlineaBean.setId(comisionlineaLocal.getId());}}
			if(conDefault || (!conDefault && comisionlineaLocal.getid_comision_config()!=null && !comisionlineaLocal.getid_comision_config().equals(-1L))) {comisionlineaBean.setid_comision_config(comisionlineaLocal.getid_comision_config());}
			if(conDefault || (!conDefault && comisionlineaLocal.getid_vendedor()!=null && !comisionlineaLocal.getid_vendedor().equals(-1L))) {comisionlineaBean.setid_vendedor(comisionlineaLocal.getid_vendedor());}
			if(conDefault || (!conDefault && comisionlineaLocal.getid_linea()!=null && !comisionlineaLocal.getid_linea().equals(-1L))) {comisionlineaBean.setid_linea(comisionlineaLocal.getid_linea());}
			if(conDefault || (!conDefault && comisionlineaLocal.getid_estado_comision()!=null && !comisionlineaLocal.getid_estado_comision().equals(-1L))) {comisionlineaBean.setid_estado_comision(comisionlineaLocal.getid_estado_comision());}
			if(conDefault || (!conDefault && comisionlineaLocal.getporcentaje()!=null && !comisionlineaLocal.getporcentaje().equals(0.0))) {comisionlineaBean.setporcentaje(comisionlineaLocal.getporcentaje());}
			if(conDefault || (!conDefault && comisionlineaLocal.getdescripcion()!=null && !comisionlineaLocal.getdescripcion().equals(""))) {comisionlineaBean.setdescripcion(comisionlineaLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxComisionLineaGenerico(Long idComisionLineaSeleccionado,JComboBox jComboBoxComisionLinea,List<ComisionLinea> comisionlineasLocal)throws Exception {
		try {
			ComisionLinea  comisionlineaTemp=null;

			for(ComisionLinea comisionlineaAux:comisionlineasLocal) {
				if(comisionlineaAux.getId()!=null && comisionlineaAux.getId().equals(idComisionLineaSeleccionado)) {
					comisionlineaTemp=comisionlineaAux;
					break;
				}
			}

			jComboBoxComisionLinea.setSelectedItem(comisionlineaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxComisionLineaGenerico(JComboBox jComboBoxComisionLinea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxComisionLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxComisionLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxComisionLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxComisionLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxComisionLinea.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxComisionLinea.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxComisionLinea.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxComisionLinea.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxComisionLinea.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxComisionLinea.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comisionlinea=(ComisionLinea) comisionlineaLogic.getComisionLineas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			comisionlinea =(ComisionLinea) comisionlineas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!comisionlinea.getIsNew() && !comisionlinea.getIsChanged() && !comisionlinea.getIsDeleted()) {
				sDescripcion=comisionlinea.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=comisionlinea.getempresa_descripcion();
			}
		}

		if(sTipo.equals("ComisionConfig")) {
			//sDescripcion=this.getActualComisionConfigForeignKeyDescripcion((Long)value);
			if(!comisionlinea.getIsNew() && !comisionlinea.getIsChanged() && !comisionlinea.getIsDeleted()) {
				sDescripcion=comisionlinea.getcomisionconfig_descripcion();
			} else {
				//sDescripcion=this.getActualComisionConfigForeignKeyDescripcion((Long)value);
				sDescripcion=comisionlinea.getcomisionconfig_descripcion();
			}
		}

		if(sTipo.equals("Vendedor")) {
			//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
			if(!comisionlinea.getIsNew() && !comisionlinea.getIsChanged() && !comisionlinea.getIsDeleted()) {
				sDescripcion=comisionlinea.getvendedor_descripcion();
			} else {
				//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
				sDescripcion=comisionlinea.getvendedor_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!comisionlinea.getIsNew() && !comisionlinea.getIsChanged() && !comisionlinea.getIsDeleted()) {
				sDescripcion=comisionlinea.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=comisionlinea.getlinea_descripcion();
			}
		}

		if(sTipo.equals("EstadoComision")) {
			//sDescripcion=this.getActualEstadoComisionForeignKeyDescripcion((Long)value);
			if(!comisionlinea.getIsNew() && !comisionlinea.getIsChanged() && !comisionlinea.getIsDeleted()) {
				sDescripcion=comisionlinea.getestadocomision_descripcion();
			} else {
				//sDescripcion=this.getActualEstadoComisionForeignKeyDescripcion((Long)value);
				sDescripcion=comisionlinea.getestadocomision_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ComisionLinea comisionlineaRow=new ComisionLinea();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comisionlineaRow=(ComisionLinea) comisionlineaLogic.getComisionLineas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			comisionlineaRow=(ComisionLinea) comisionlineas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualComisionLinea(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoComisionLinea.setVisible((this.isVisibilidadCeldaNuevoComisionLinea && this.isPermisoNuevoComisionLinea));			
			this.jButtonDuplicarComisionLinea.setVisible((this.isVisibilidadCeldaDuplicarComisionLinea && this.isPermisoDuplicarComisionLinea));			
			this.jButtonCopiarComisionLinea.setVisible((this.isVisibilidadCeldaCopiarComisionLinea && this.isPermisoCopiarComisionLinea));
			this.jButtonVerFormComisionLinea.setVisible((this.isVisibilidadCeldaVerFormComisionLinea && this.isPermisoVerFormComisionLinea));
			
			this.jButtonAbrirOrderByComisionLinea.setVisible((this.isVisibilidadCeldaOrdenComisionLinea && this.isPermisoOrdenComisionLinea));			
			
			this.jButtonNuevoRelacionesComisionLinea.setVisible((this.isVisibilidadCeldaNuevoRelacionesComisionLinea && this.isPermisoNuevoComisionLinea));			
			this.jButtonNuevoGuardarCambiosComisionLinea.setVisible((this.isVisibilidadCeldaNuevoComisionLinea && this.isPermisoNuevoComisionLinea && this.isPermisoGuardarCambiosComisionLinea));
			
			if(this.jInternalFrameDetalleFormComisionLinea!=null) {
			this.jInternalFrameDetalleFormComisionLinea.jButtonModificarComisionLinea.setVisible((this.isVisibilidadCeldaModificarComisionLinea && this.isPermisoActualizarComisionLinea));	
			this.jInternalFrameDetalleFormComisionLinea.jButtonActualizarComisionLinea.setVisible((this.isVisibilidadCeldaActualizarComisionLinea && this.isPermisoActualizarComisionLinea));	
			this.jInternalFrameDetalleFormComisionLinea.jButtonEliminarComisionLinea.setVisible((this.isVisibilidadCeldaEliminarComisionLinea && this.isPermisoEliminarComisionLinea));
			this.jInternalFrameDetalleFormComisionLinea.jButtonCancelarComisionLinea.setVisible(this.isVisibilidadCeldaCancelarComisionLinea);							
			this.jInternalFrameDetalleFormComisionLinea.jButtonGuardarCambiosComisionLinea.setVisible((this.isVisibilidadCeldaGuardarComisionLinea && this.isPermisoGuardarCambiosComisionLinea));			
			
			}
						
			this.jButtonGuardarCambiosTablaComisionLinea.setVisible((this.isVisibilidadCeldaGuardarCambiosComisionLinea && this.isPermisoGuardarCambiosComisionLinea));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarComisionLinea.setVisible((this.isVisibilidadCeldaNuevoComisionLinea && this.isPermisoNuevoComisionLinea));						
			this.jButtonDuplicarToolBarComisionLinea.setVisible((this.isVisibilidadCeldaDuplicarComisionLinea && this.isPermisoDuplicarComisionLinea));						
			this.jButtonCopiarToolBarComisionLinea.setVisible((this.isVisibilidadCeldaCopiarComisionLinea && this.isPermisoCopiarComisionLinea));			
			this.jButtonVerFormToolBarComisionLinea.setVisible((this.isVisibilidadCeldaVerFormComisionLinea && this.isPermisoVerFormComisionLinea));			
			this.jButtonAbrirOrderByToolBarComisionLinea.setVisible((this.isVisibilidadCeldaOrdenComisionLinea && this.isPermisoOrdenComisionLinea));
			this.jButtonNuevoRelacionesToolBarComisionLinea.setVisible((this.isVisibilidadCeldaNuevoRelacionesComisionLinea && this.isPermisoNuevoComisionLinea));			
			this.jButtonNuevoGuardarCambiosToolBarComisionLinea.setVisible((this.isVisibilidadCeldaNuevoComisionLinea && this.isPermisoNuevoComisionLinea && this.isPermisoGuardarCambiosComisionLinea));			
			
			if(this.jInternalFrameDetalleFormComisionLinea!=null) {
			this.jInternalFrameDetalleFormComisionLinea.jButtonModificarToolBarComisionLinea.setVisible((this.isVisibilidadCeldaModificarComisionLinea && this.isPermisoActualizarComisionLinea));	
			this.jInternalFrameDetalleFormComisionLinea.jButtonActualizarToolBarComisionLinea.setVisible((this.isVisibilidadCeldaActualizarComisionLinea  && this.isPermisoActualizarComisionLinea));	
			this.jInternalFrameDetalleFormComisionLinea.jButtonEliminarToolBarComisionLinea.setVisible((this.isVisibilidadCeldaEliminarComisionLinea && this.isPermisoEliminarComisionLinea));
			this.jInternalFrameDetalleFormComisionLinea.jButtonCancelarToolBarComisionLinea.setVisible(this.isVisibilidadCeldaCancelarComisionLinea);				
			this.jInternalFrameDetalleFormComisionLinea.jButtonGuardarCambiosToolBarComisionLinea.setVisible((this.isVisibilidadCeldaGuardarComisionLinea && this.isPermisoGuardarCambiosComisionLinea));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarComisionLinea.setVisible((this.isVisibilidadCeldaGuardarCambiosComisionLinea && this.isPermisoGuardarCambiosComisionLinea));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoComisionLinea.setVisible((this.isVisibilidadCeldaNuevoComisionLinea && this.isPermisoNuevoComisionLinea));			
			this.jMenuItemDuplicarComisionLinea.setVisible((this.isVisibilidadCeldaDuplicarComisionLinea && this.isPermisoDuplicarComisionLinea));			
			this.jMenuItemCopiarComisionLinea.setVisible((this.isVisibilidadCeldaCopiarComisionLinea && this.isPermisoCopiarComisionLinea));			
			this.jMenuItemVerFormComisionLinea.setVisible((this.isVisibilidadCeldaVerFormComisionLinea && this.isPermisoVerFormComisionLinea));			
			this.jMenuItemAbrirOrderByComisionLinea.setVisible((this.isVisibilidadCeldaOrdenComisionLinea && this.isPermisoOrdenComisionLinea));			
			//this.jMenuItemMostrarOcultarComisionLinea.setVisible((this.isVisibilidadCeldaOrdenComisionLinea && this.isPermisoOrdenComisionLinea));
			this.jMenuItemDetalleAbrirOrderByComisionLinea.setVisible((this.isVisibilidadCeldaOrdenComisionLinea && this.isPermisoOrdenComisionLinea));			
			//this.jMenuItemDetalleMostrarOcultarComisionLinea.setVisible((this.isVisibilidadCeldaOrdenComisionLinea && this.isPermisoOrdenComisionLinea));			
			this.jMenuItemNuevoRelacionesComisionLinea.setVisible((this.isVisibilidadCeldaNuevoRelacionesComisionLinea && this.isPermisoNuevoComisionLinea));			
			this.jMenuItemNuevoGuardarCambiosComisionLinea.setVisible((this.isVisibilidadCeldaNuevoComisionLinea && this.isPermisoNuevoComisionLinea && this.isPermisoGuardarCambiosComisionLinea));									
			
			if(this.jInternalFrameDetalleFormComisionLinea!=null) {
			this.jInternalFrameDetalleFormComisionLinea.jMenuItemModificarComisionLinea.setVisible((this.isVisibilidadCeldaModificarComisionLinea && this.isPermisoActualizarComisionLinea));	
			this.jInternalFrameDetalleFormComisionLinea.jMenuItemActualizarComisionLinea.setVisible((this.isVisibilidadCeldaActualizarComisionLinea && this.isPermisoActualizarComisionLinea));	
			this.jInternalFrameDetalleFormComisionLinea.jMenuItemEliminarComisionLinea.setVisible((this.isVisibilidadCeldaEliminarComisionLinea && this.isPermisoEliminarComisionLinea));
			this.jInternalFrameDetalleFormComisionLinea.jMenuItemCancelarComisionLinea.setVisible(this.isVisibilidadCeldaCancelarComisionLinea);				
			}
			
			this.jMenuItemGuardarCambiosComisionLinea.setVisible((this.isVisibilidadCeldaGuardarComisionLinea && this.isPermisoGuardarCambiosComisionLinea));						
			this.jMenuItemGuardarCambiosTablaComisionLinea.setVisible((this.isVisibilidadCeldaGuardarCambiosComisionLinea && this.isPermisoGuardarCambiosComisionLinea));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoComisionLinea=this.jButtonNuevoComisionLinea.isVisible();
			this.isVisibilidadCeldaDuplicarComisionLinea=this.jButtonDuplicarComisionLinea.isVisible();
			this.isVisibilidadCeldaCopiarComisionLinea=this.jButtonCopiarComisionLinea.isVisible();
			this.isVisibilidadCeldaVerFormComisionLinea=this.jButtonVerFormComisionLinea.isVisible();
			
			this.isVisibilidadCeldaOrdenComisionLinea=this.jButtonAbrirOrderByComisionLinea.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesComisionLinea=this.jButtonNuevoRelacionesComisionLinea.isVisible();
			this.isVisibilidadCeldaModificarComisionLinea=this.jButtonModificarComisionLinea.isVisible();
			
			if(this.jInternalFrameDetalleFormComisionLinea!=null) {
			this.isVisibilidadCeldaActualizarComisionLinea=this.jInternalFrameDetalleFormComisionLinea.jButtonActualizarComisionLinea.isVisible();
			this.isVisibilidadCeldaEliminarComisionLinea=this.jInternalFrameDetalleFormComisionLinea.jButtonEliminarComisionLinea.isVisible();
			this.isVisibilidadCeldaCancelarComisionLinea=this.jInternalFrameDetalleFormComisionLinea.jButtonCancelarComisionLinea.isVisible();
			this.isVisibilidadCeldaGuardarComisionLinea=this.jInternalFrameDetalleFormComisionLinea.jButtonGuardarCambiosComisionLinea.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosComisionLinea=this.jButtonGuardarCambiosTablaComisionLinea.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoComisionLinea=this.jButtonNuevoToolBarComisionLinea.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesComisionLinea=this.jButtonNuevoRelacionesToolBarComisionLinea.isVisible();
			
			if(this.jInternalFrameDetalleFormComisionLinea!=null) {
			this.isVisibilidadCeldaModificarComisionLinea=this.jInternalFrameDetalleFormComisionLinea.jButtonModificarToolBarComisionLinea.isVisible();
			this.isVisibilidadCeldaActualizarComisionLinea=this.jInternalFrameDetalleFormComisionLinea.jButtonActualizarToolBarComisionLinea.isVisible();
			this.isVisibilidadCeldaEliminarComisionLinea=this.jInternalFrameDetalleFormComisionLinea.jButtonEliminarToolBarComisionLinea.isVisible();
			this.isVisibilidadCeldaCancelarComisionLinea=this.jInternalFrameDetalleFormComisionLinea.jButtonCancelarToolBarComisionLinea.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarComisionLinea=this.jButtonGuardarCambiosToolBarComisionLinea.isVisible();
			this.isVisibilidadCeldaGuardarCambiosComisionLinea=this.jButtonGuardarCambiosTablaToolBarComisionLinea.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoComisionLinea=this.jMenuItemNuevoComisionLinea.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesComisionLinea=this.jMenuItemNuevoRelacionesComisionLinea.isVisible();
			
			if(this.jInternalFrameDetalleFormComisionLinea!=null) {
			this.isVisibilidadCeldaModificarComisionLinea=this.jInternalFrameDetalleFormComisionLinea.jMenuItemModificarComisionLinea.isVisible();
			this.isVisibilidadCeldaActualizarComisionLinea=this.jInternalFrameDetalleFormComisionLinea.jMenuItemActualizarComisionLinea.isVisible();
			this.isVisibilidadCeldaEliminarComisionLinea=this.jInternalFrameDetalleFormComisionLinea.jMenuItemEliminarComisionLinea.isVisible();
			this.isVisibilidadCeldaCancelarComisionLinea=this.jInternalFrameDetalleFormComisionLinea.jMenuItemCancelarComisionLinea.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarComisionLinea=this.jMenuItemGuardarCambiosComisionLinea.isVisible();
			this.isVisibilidadCeldaGuardarCambiosComisionLinea=this.jMenuItemGuardarCambiosTablaComisionLinea.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesComisionLinea(Boolean esInicializar) {
		if(ComisionLineaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.comisionlineaSessionBean.getConGuardarRelaciones()) {
				//if(this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesComisionLinea();
			}
			
			this.inicializarActualizarBindingBotonesManualComisionLinea(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualComisionLinea() {
		this.jButtonNuevoComisionLinea.setVisible(this.isPermisoNuevoComisionLinea);			
		this.jButtonDuplicarComisionLinea.setVisible(this.isPermisoDuplicarComisionLinea);			
		this.jButtonCopiarComisionLinea.setVisible(this.isPermisoCopiarComisionLinea);			
		this.jButtonVerFormComisionLinea.setVisible(this.isPermisoVerFormComisionLinea);			
		
		this.jButtonAbrirOrderByComisionLinea.setVisible(this.isPermisoOrdenComisionLinea);					
		
		this.jButtonNuevoRelacionesComisionLinea.setVisible(this.isPermisoNuevoComisionLinea);			
		
		if(this.jInternalFrameDetalleFormComisionLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionLinea.jButtonModificarComisionLinea.setVisible(this.isPermisoActualizarComisionLinea);	
			this.jInternalFrameDetalleFormComisionLinea.jButtonActualizarComisionLinea.setVisible(this.isPermisoActualizarComisionLinea);	
			this.jInternalFrameDetalleFormComisionLinea.jButtonEliminarComisionLinea.setVisible(this.isPermisoEliminarComisionLinea);
			this.jInternalFrameDetalleFormComisionLinea.jButtonCancelarComisionLinea.setVisible(this.isVisibilidadCeldaCancelarComisionLinea);						
			this.jInternalFrameDetalleFormComisionLinea.jButtonGuardarCambiosComisionLinea.setVisible(this.isPermisoGuardarCambiosComisionLinea);							
		}
		
		this.jButtonGuardarCambiosTablaComisionLinea.setVisible(this.isPermisoActualizarComisionLinea);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleComisionLinea() {
		this.jInternalFrameDetalleFormComisionLinea.jButtonModificarComisionLinea.setVisible(this.isPermisoActualizarComisionLinea);	
		this.jInternalFrameDetalleFormComisionLinea.jButtonActualizarComisionLinea.setVisible(this.isPermisoActualizarComisionLinea);	
		this.jInternalFrameDetalleFormComisionLinea.jButtonEliminarComisionLinea.setVisible(this.isPermisoEliminarComisionLinea);
		this.jInternalFrameDetalleFormComisionLinea.jButtonCancelarComisionLinea.setVisible(this.isVisibilidadCeldaCancelarComisionLinea);							
		this.jInternalFrameDetalleFormComisionLinea.jButtonGuardarCambiosComisionLinea.setVisible((this.isVisibilidadCeldaGuardarComisionLinea && this.isPermisoGuardarCambiosComisionLinea));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosComisionLinea() {
		if(ComisionLineaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualComisionLinea();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesComisionLinea() {
	}
	
	public void jTableDatosComisionLineaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarComisionLinea(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidComisionLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionLinea(this.getcomisionlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionLinea(this.comisionlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionlinea =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionlinea =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionlinea==null) {
						this.comisionlinea = new ComisionLinea();
					}

					this.setVariablesFormularioToObjetoActualComisionLinea(this.comisionlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionLinea(this.comisionlinea);
				}

				if(this.comisionlinea.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.comisionlinea.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaComisionLineaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebComisionLinea(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionLinea.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionLinea.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlinea =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionlinea =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionLinea(this.getcomisionlinea(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionLinea(this.comisionlinea);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.comisionlineaLogic.getConnexion());

				if(this.comisionlinea.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.comisionlinea.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionLinea=(TitledBorder)this.jScrollPanelDatosComisionLinea.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderComisionLinea.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaComisionLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionLinea(this.getcomisionlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionLinea(this.comisionlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionlinea =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionlinea =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionlinea==null) {
						this.comisionlinea = new ComisionLinea();
					}

					this.setVariablesFormularioToObjetoActualComisionLinea(this.comisionlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionLinea(this.comisionlinea);
				}

				if(this.comisionlinea.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.comisionlinea.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_comision_configComisionLineaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocomisionconfig=true;

			idTienePermisocomisionconfig=this.tienePermisosUsuarioEnPaginaWebComisionLinea(ComisionConfigConstantesFunciones.CLASSNAME);

			if(idTienePermisocomisionconfig) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionLinea.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionLinea.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlinea =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionlinea =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionLinea(this.getcomisionlinea(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionLinea(this.comisionlinea);

				this.comisionconfigBeanSwingJInternalFrame=new ComisionConfigBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.comisionconfigBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.comisionconfigBeanSwingJInternalFrame.getComisionConfigLogic().setConnexion(this.comisionlineaLogic.getConnexion());

				if(this.comisionlinea.getid_comision_config()!=null) {
					this.comisionconfigBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.comisionconfigBeanSwingJInternalFrame.setIdActual(this.comisionlinea.getid_comision_config());
					this.comisionconfigBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.comisionconfigBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.comisionconfigBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionConfig();
				}

				JInternalFrameBase jinternalFrame =this.comisionconfigBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionLinea=(TitledBorder)this.jScrollPanelDatosComisionLinea.getBorder();
				TitledBorder titledBordercomisionconfig=(TitledBorder)this.comisionconfigBeanSwingJInternalFrame.jScrollPanelDatosComisionConfig.getBorder();

				titledBordercomisionconfig.setTitle(titledBorderComisionLinea.getTitle() + " -> Comision Config");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_comision_configComisionLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionLinea(this.getcomisionlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionLinea(this.comisionlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionlinea =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionlinea =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionlinea==null) {
						this.comisionlinea = new ComisionLinea();
					}

					this.setVariablesFormularioToObjetoActualComisionLinea(this.comisionlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionLinea(this.comisionlinea);
				}

				if(this.comisionlinea.getid_comision_config()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_comision_config = "+this.comisionlinea.getid_comision_config().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_vendedorComisionLineaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.vendedorBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.vendedorBeanSwingJInternalFrame.sTipoBusqueda="Vendedor";

			if(!this.sFinalQueryGeneral_vendedor.equals("")) {
				this.vendedorBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_vendedor);
				this.vendedorBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.vendedorBeanSwingJInternalFrame.procesarBusqueda(this.vendedorBeanSwingJInternalFrame.sAccionBusqueda);
				this.vendedorBeanSwingJInternalFrame.inicializarActualizarBindingVendedor(false);
			}

			if(!this.sFinalQueryComboVendedor.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.vendedorBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderComisionLinea=null;
			TitledBorder titledBordervendedor=null;

			if(!this.jScrollPanelDatosComisionLinea.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderComisionLinea=(TitledBorder)this.jScrollPanelDatosComisionLinea.getBorder();
				titledBordervendedor=(TitledBorder)this.vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

				titledBordervendedor.setTitle(titledBorderComisionLinea.getTitle() + " -> Vendedor");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_vendedorComisionLineaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisovendedor=true;

			idTienePermisovendedor=this.tienePermisosUsuarioEnPaginaWebComisionLinea(VendedorConstantesFunciones.CLASSNAME);

			if(idTienePermisovendedor) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionLinea.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionLinea.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlinea =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionlinea =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionLinea(this.getcomisionlinea(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionLinea(this.comisionlinea);

				this.vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.vendedorBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.vendedorBeanSwingJInternalFrame.getVendedorLogic().setConnexion(this.comisionlineaLogic.getConnexion());

				if(this.comisionlinea.getid_vendedor()!=null) {
					this.vendedorBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.vendedorBeanSwingJInternalFrame.setIdActual(this.comisionlinea.getid_vendedor());
					this.vendedorBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaVendedor();
				}

				JInternalFrameBase jinternalFrame =this.vendedorBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionLinea=(TitledBorder)this.jScrollPanelDatosComisionLinea.getBorder();
				TitledBorder titledBordervendedor=(TitledBorder)this.vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

				titledBordervendedor.setTitle(titledBorderComisionLinea.getTitle() + " -> Vendedor");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_vendedorComisionLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionLinea(this.getcomisionlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionLinea(this.comisionlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionlinea =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionlinea =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionlinea==null) {
						this.comisionlinea = new ComisionLinea();
					}

					this.setVariablesFormularioToObjetoActualComisionLinea(this.comisionlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionLinea(this.comisionlinea);
				}

				if(this.comisionlinea.getid_vendedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_vendedor = "+this.comisionlinea.getid_vendedor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaComisionLineaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebComisionLinea(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionLinea.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionLinea.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlinea =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionlinea =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionLinea(this.getcomisionlinea(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionLinea(this.comisionlinea);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.comisionlineaLogic.getConnexion());

				if(this.comisionlinea.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.comisionlinea.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionLinea=(TitledBorder)this.jScrollPanelDatosComisionLinea.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderComisionLinea.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaComisionLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionLinea(this.getcomisionlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionLinea(this.comisionlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionlinea =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionlinea =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionlinea==null) {
						this.comisionlinea = new ComisionLinea();
					}

					this.setVariablesFormularioToObjetoActualComisionLinea(this.comisionlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionLinea(this.comisionlinea);
				}

				if(this.comisionlinea.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.comisionlinea.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estado_comisionComisionLineaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestadocomision=true;

			idTienePermisoestadocomision=this.tienePermisosUsuarioEnPaginaWebComisionLinea(EstadoComisionConstantesFunciones.CLASSNAME);

			if(idTienePermisoestadocomision) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionLinea.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionLinea.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlinea =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionlinea =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionLinea(this.getcomisionlinea(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionLinea(this.comisionlinea);

				this.estadocomisionBeanSwingJInternalFrame=new EstadoComisionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estadocomisionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estadocomisionBeanSwingJInternalFrame.getEstadoComisionLogic().setConnexion(this.comisionlineaLogic.getConnexion());

				if(this.comisionlinea.getid_estado_comision()!=null) {
					this.estadocomisionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estadocomisionBeanSwingJInternalFrame.setIdActual(this.comisionlinea.getid_estado_comision());
					this.estadocomisionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estadocomisionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estadocomisionBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstadoComision();
				}

				JInternalFrameBase jinternalFrame =this.estadocomisionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionLinea=(TitledBorder)this.jScrollPanelDatosComisionLinea.getBorder();
				TitledBorder titledBorderestadocomision=(TitledBorder)this.estadocomisionBeanSwingJInternalFrame.jScrollPanelDatosEstadoComision.getBorder();

				titledBorderestadocomision.setTitle(titledBorderComisionLinea.getTitle() + " -> Estado Comision");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estado_comisionComisionLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionLinea(this.getcomisionlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionLinea(this.comisionlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionlinea =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionlinea =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionlinea==null) {
						this.comisionlinea = new ComisionLinea();
					}

					this.setVariablesFormularioToObjetoActualComisionLinea(this.comisionlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionLinea(this.comisionlinea);
				}

				if(this.comisionlinea.getid_estado_comision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estado_comision = "+this.comisionlinea.getid_estado_comision().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeComisionLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionLinea(this.getcomisionlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionLinea(this.comisionlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionlinea =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionlinea =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionlinea==null) {
						this.comisionlinea = new ComisionLinea();
					}

					this.setVariablesFormularioToObjetoActualComisionLinea(this.comisionlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionLinea(this.comisionlinea);
				}

				if(this.comisionlinea.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.comisionlinea.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionComisionLineaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionLinea(this.getcomisionlinea(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionLinea(this.comisionlinea);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionlinea =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionlinea =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionlinea==null) {
						this.comisionlinea = new ComisionLinea();
					}

					this.setVariablesFormularioToObjetoActualComisionLinea(this.comisionlinea,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionLinea(this.comisionlinea);
				}

				if(this.comisionlinea.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.comisionlinea.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionLinea(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdComisionConfigComisionLineaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionLinea(false,false);

			this.getComisionLineasFK_IdComisionConfig();

			this.inicializarActualizarBindingComisionLinea(false);

			//if(ComisionLineaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionLinea(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaComisionLineaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionLinea(false,false);

			this.getComisionLineasFK_IdEmpresa();

			this.inicializarActualizarBindingComisionLinea(false);

			//if(ComisionLineaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionLinea(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstadoComisionComisionLineaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionLinea(false,false);

			this.getComisionLineasFK_IdEstadoComision();

			this.inicializarActualizarBindingComisionLinea(false);

			//if(ComisionLineaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionLinea(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaComisionLineaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionLinea(false,false);

			this.getComisionLineasFK_IdLinea();

			this.inicializarActualizarBindingComisionLinea(false);

			//if(ComisionLineaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionLinea(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdVendedorComisionLineaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionLinea(false,false);

			this.getComisionLineasFK_IdVendedor();

			this.inicializarActualizarBindingComisionLinea(false);

			//if(ComisionLineaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionLinea(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionlineaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameComisionLinea() {
		if(this.jInternalFrameDetalleFormComisionLinea!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormComisionLinea!=null) {
			this.jInternalFrameDetalleFormComisionLinea.setVisible(false);	    			
			this.jInternalFrameDetalleFormComisionLinea.dispose();
			this.jInternalFrameDetalleFormComisionLinea=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoComisionLinea!=null) {
			this.jInternalFrameReporteDinamicoComisionLinea.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoComisionLinea.dispose();
			this.jInternalFrameReporteDinamicoComisionLinea=null;
		}
		
		if(this.jInternalFrameImportacionComisionLinea!=null) {
			this.jInternalFrameImportacionComisionLinea.setVisible(false);	    			
			this.jInternalFrameImportacionComisionLinea.dispose();
			this.jInternalFrameImportacionComisionLinea=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessComisionLinea();
			
			ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
			
			
			if(sTipo.equals("NuevoComisionLinea")) {
				jButtonNuevoComisionLineaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarComisionLinea")) {
				jButtonDuplicarComisionLineaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarComisionLinea")) {
				jButtonCopiarComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("VerFormComisionLinea")) {
				jButtonVerFormComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarComisionLinea")) {
				jButtonNuevoComisionLineaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarComisionLinea")) {
				jButtonDuplicarComisionLineaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoComisionLinea")) {
				jButtonNuevoComisionLineaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarComisionLinea")) {
				jButtonDuplicarComisionLineaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesComisionLinea")) {
				jButtonNuevoComisionLineaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarComisionLinea")) {
				jButtonNuevoComisionLineaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesComisionLinea")) {
				jButtonNuevoComisionLineaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarComisionLinea")) {
				jButtonModificarComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarComisionLinea")) {
				jButtonModificarComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarComisionLinea")) {
				jButtonModificarComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarComisionLinea")) {
				jButtonActualizarComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarComisionLinea")) {
				jButtonActualizarComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarComisionLinea")) {
				jButtonActualizarComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("EliminarComisionLinea")) {
				jButtonEliminarComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarComisionLinea")) {
				jButtonEliminarComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarComisionLinea")) {
				jButtonEliminarComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("CancelarComisionLinea")) {
				jButtonCancelarComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarComisionLinea")) {
				jButtonCancelarComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarComisionLinea")) {
				jButtonCancelarComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("CerrarComisionLinea")) {
				jButtonCerrarComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarComisionLinea")) {
				jButtonCerrarComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarComisionLinea")) {
				jButtonCerrarComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarComisionLinea")) {
				jButtonMostrarOcultarComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarComisionLinea")) {
				jButtonCancelarComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosComisionLinea")) {
				jButtonGuardarCambiosComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarComisionLinea")) {
				jButtonGuardarCambiosComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarComisionLinea")) {
				jButtonCopiarComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarComisionLinea")) {
				jButtonVerFormComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosComisionLinea")) {
				jButtonGuardarCambiosComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarComisionLinea")) {
				jButtonCopiarComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormComisionLinea")) {
				jButtonVerFormComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaComisionLinea")) {
				jButtonGuardarCambiosComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarComisionLinea")) {
				jButtonGuardarCambiosComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaComisionLinea")) {
				jButtonGuardarCambiosComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionComisionLinea")) {
				jButtonRecargarInformacionComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarComisionLinea")) {
				jButtonRecargarInformacionComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionComisionLinea")) {
				jButtonRecargarInformacionComisionLineaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresComisionLinea")) {
				jButtonAnterioresComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarComisionLinea")) {
				jButtonAnterioresComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreComisionLinea")) {
				jButtonAnterioresComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesComisionLinea")) {
				jButtonSiguientesComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarComisionLinea")) {
				jButtonSiguientesComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesComisionLinea")) {
				jButtonSiguientesComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByComisionLinea") || sTipo.equals("MenuItemDetalleAbrirOrderByComisionLinea")) {
				jButtonAbrirOrderByComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarComisionLinea") || sTipo.equals("MenuItemDetalleMostrarOcultarComisionLinea")) {
				jButtonMostrarOcultarComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosComisionLinea")) {
				jButtonNuevoGuardarCambiosComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarComisionLinea")) {
				jButtonNuevoGuardarCambiosComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosComisionLinea")) {
				jButtonNuevoGuardarCambiosComisionLineaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoComisionLinea")) {
				jButtonCerrarReporteDinamicoComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoComisionLinea")) {
				jButtonGenerarReporteDinamicoComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoComisionLinea")) {
				
				jButtonGenerarExcelReporteDinamicoComisionLineaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionComisionLinea")) {
				jButtonCerrarImportacionComisionLineaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionComisionLinea")) {
				
				jButtonGenerarImportacionComisionLineaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionComisionLinea")) {
				
				jButtonAbrirImportacionComisionLineaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesComisionLinea")) {
				jComboBoxTiposAccionesComisionLineaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesComisionLinea")) {
				jComboBoxTiposRelacionesComisionLineaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioComisionLinea")) {
				jComboBoxTiposAccionesComisionLineaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarComisionLinea")) {
				
				jComboBoxTiposSeleccionarComisionLineaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralComisionLinea")) {
				jTextFieldValorCampoGeneralComisionLineaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByComisionLinea")) {
				jButtonAbrirOrderByComisionLineaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarComisionLinea")) {
				jButtonAbrirOrderByComisionLineaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByComisionLinea")) {
				jButtonCerrarOrderByComisionLineaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idComisionLineaBusqueda")) {
				this.jButtonidComisionLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaComisionLineaUpdate")) {
				this.jButtonid_empresaComisionLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaComisionLineaBusqueda")) {
				this.jButtonid_empresaComisionLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_comision_configComisionLineaUpdate")) {
				this.jButtonid_comision_configComisionLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_comision_configComisionLineaBusqueda")) {
				this.jButtonid_comision_configComisionLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_vendedorComisionLinea")) {
				this.jButtonid_vendedorComisionLineaActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_vendedorComisionLineaArbol")) {
				this.abrirFrameTreeVendedor("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorComisionLineaUpdate")) {
				this.jButtonid_vendedorComisionLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorComisionLineaBusqueda")) {
				this.jButtonid_vendedorComisionLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaComisionLineaUpdate")) {
				this.jButtonid_lineaComisionLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaComisionLineaBusqueda")) {
				this.jButtonid_lineaComisionLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_comisionComisionLineaUpdate")) {
				this.jButtonid_estado_comisionComisionLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_comisionComisionLineaBusqueda")) {
				this.jButtonid_estado_comisionComisionLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeComisionLineaBusqueda")) {
				this.jButtonporcentajeComisionLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionComisionLineaBusqueda")) {
				this.jButtondescripcionComisionLineaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdComisionConfigComisionLinea")) {
				this.jButtonFK_IdComisionConfigComisionLineaActionPerformed(evt);
			}
			
			;
			
			
			ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessComisionLinea();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionLineaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionlinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionlinea);
				
				ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
				
				


				
				ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionLinea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ComisionLinea comisionlineaLocal=null;
			
			if(!this.getEsControlTabla()) {
				comisionlineaLocal=this.comisionlinea;
			} else {
				comisionlineaLocal=this.comisionlineaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionlinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionlinea);
				
				ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
							
				
				


				
				ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionLinea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionLineaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaAnterior =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionlineaAnterior =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
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
			
			ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
			
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
			
			


			
			ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionLineaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionlinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionlinea);
				
				ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
								
						
				


				
				ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionLinea.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionlinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionlinea);
				
				ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
								
				
				


				
				ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionLinea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionLineaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaAnterior =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionlineaAnterior =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionlinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionlinea);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionLineaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaAnterior =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionlineaAnterior =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionLineaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionlinea);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comisionlinea);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionlinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionlinea);
				
				ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
							
				
				


				
				ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionLinea.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionLineaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionlineaAnterior =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.comisionlineaAnterior =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
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
			
			ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
			
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
			
			


			
			ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionLineaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionlinea);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comisionlinea);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionlinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionlinea);
				
				ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
								
				
				


				
				ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionLinea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionLineaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaAnterior =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionlineaAnterior =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionLineaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionlinea);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comisionlinea);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionLineaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionlinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionlinea);
				
				ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosComisionLinea")) {
					jCheckBoxSeleccionarTodosComisionLineaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosComisionLinea")) {
					jCheckBoxSeleccionadosComisionLineaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarComisionLinea")) {
					
				}
				
				


				
				
				ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionLinea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionlinea);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.comisionlinea);
				
				ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
												
				
				


				
				
				ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionLinea.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionLinea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionLineaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionlineaAnterior =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.comisionlineaAnterior =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionLineaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionlinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionlinea);
				
				ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
				
				
				ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
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
			
			ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
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
			
			


			
			ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionLineaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionlinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionlinea);
				
				ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionLinea.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionLinea.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionlinea);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionlinea);
				
				ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
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
				
				


				
				ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionLinea.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionLinea.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionLineaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionlineaAnterior =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionlineaAnterior =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarComisionLinea")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosComisionLineaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosComisionLinea.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.comisionlinea =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.comisionlinea =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.comisionlinea);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarComisionLinea")) {
				
				}
				
				ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarComisionLinea")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosComisionLinea.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarComisionLinea")) {
			
			}
			
			ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessComisionLinea();
			
			ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
			
			if(sTipo.equals("NuevoComisionLinea")) {
				jButtonNuevoComisionLineaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarComisionLinea")) {
				jButtonDuplicarComisionLineaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarComisionLinea")) {
				jButtonCopiarComisionLineaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormComisionLinea")) {
				jButtonVerFormComisionLineaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesComisionLinea")) {
				jButtonNuevoComisionLineaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarComisionLinea")) {
				jButtonModificarComisionLineaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarComisionLinea")) {
				jButtonActualizarComisionLineaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarComisionLinea")) {
				jButtonEliminarComisionLineaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaComisionLinea")) {
				jButtonGuardarCambiosComisionLineaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarComisionLinea")) {
				jButtonCancelarComisionLineaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarComisionLinea")) {
				jButtonCerrarComisionLineaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosComisionLinea")) {
				jButtonGuardarCambiosComisionLineaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosComisionLinea")) {
				jButtonNuevoGuardarCambiosComisionLineaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByComisionLinea")) {
				jButtonAbrirOrderByComisionLineaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionComisionLinea")) {
				jButtonRecargarInformacionComisionLineaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresComisionLinea")) {
				jButtonAnterioresComisionLineaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesComisionLinea")) {
				jButtonSiguientesComisionLineaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idComisionLineaBusqueda")) {
				this.jButtonidComisionLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaComisionLineaUpdate")) {
				this.jButtonid_empresaComisionLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaComisionLineaBusqueda")) {
				this.jButtonid_empresaComisionLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_comision_configComisionLineaUpdate")) {
				this.jButtonid_comision_configComisionLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_comision_configComisionLineaBusqueda")) {
				this.jButtonid_comision_configComisionLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_vendedorComisionLinea")) {
				this.jButtonid_vendedorComisionLineaActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_vendedorComisionLineaArbol")) {
				this.abrirFrameTreeVendedor("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorComisionLineaUpdate")) {
				this.jButtonid_vendedorComisionLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorComisionLineaBusqueda")) {
				this.jButtonid_vendedorComisionLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaComisionLineaUpdate")) {
				this.jButtonid_lineaComisionLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaComisionLineaBusqueda")) {
				this.jButtonid_lineaComisionLineaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_comisionComisionLineaUpdate")) {
				this.jButtonid_estado_comisionComisionLineaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_comisionComisionLineaBusqueda")) {
				this.jButtonid_estado_comisionComisionLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeComisionLineaBusqueda")) {
				this.jButtonporcentajeComisionLineaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionComisionLineaBusqueda")) {
				this.jButtondescripcionComisionLineaBusquedaActionPerformed(evt);
			}
			
			ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessComisionLinea();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameComisionLinea")) {
				closingInternalFrameComisionLinea();
				
			} else if(sTipo.equals("jButtonCancelarComisionLinea")) {
				JInternalFrameBase jInternalFrameDetalleFormComisionLinea = (JInternalFrameBase)evt.getSource();
	            	
	            ComisionLineaBeanSwingJInternalFrame jInternalFrameParent=(ComisionLineaBeanSwingJInternalFrame)jInternalFrameDetalleFormComisionLinea.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarComisionLineaActionPerformed(null);
			}
			
			ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.comisionlinea,new Object(),this.comisionlineaParameterGeneral,this.comisionlineaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormComisionLinea(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormComisionLinea(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormComisionLinea(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.comisionlinea)) {
			if(!esControlTabla) {
				if(ComisionLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualComisionLinea(this.comisionlinea,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionLinea(this.comisionlinea);			
				}
				
				if(this.comisionlineaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualComisionLinea(this.comisionlinea,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.comisionlineaReturnGeneral=comisionlineaLogic.procesarEventosComisionLineasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisionlineaLogic.getComisionLineas(),this.comisionlinea,this.comisionlineaParameterGeneral,this.isEsNuevoComisionLinea,classes);//this.comisionlineaLogic.getComisionLinea()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanComisionLinea(this.comisionlineaReturnGeneral,this.comisionlineaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.comisionlineaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanComisionLinea(classes,this.comisionlineaReturnGeneral,this.comisionlineaBean,false);
					}
						
					if(this.comisionlineaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyComisionLinea(this.comisionlineaReturnGeneral.getComisionLinea());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioComisionLinea(this.comisionlineaReturnGeneral.getComisionLinea());	
					}
						
					if(this.comisionlineaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioComisionLinea(this.comisionlineaReturnGeneral.getComisionLinea(),classes);//this.comisionlineaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioComisionLinea(this.comisionlinea,classes);//this.comisionlineaBean);									
				}
			
				if(ComisionLineaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualComisionLinea(this.comisionlinea,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionLinea(this.comisionlinea);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.comisionlineaAnterior!=null) {
						this.comisionlinea=this.comisionlineaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.comisionlineaReturnGeneral=comisionlineaLogic.procesarEventosComisionLineasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisionlineaLogic.getComisionLineas(),this.comisionlinea,this.comisionlineaParameterGeneral,this.isEsNuevoComisionLinea,classes);//this.comisionlineaLogic.getComisionLinea()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.comisionlineaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.comisionlineaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.comisionlineaReturnGeneral.getComisionLinea(),comisionlineaLogic.getComisionLineas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.comisionlineaReturnGeneral.getComisionLinea(),this.comisionlineas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosComisionLinea.repaint();
				
				//((AbstractTableModel) this.jTableDatosComisionLinea.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosComisionLinea();
			}
		}
	}
	
	public void actualizarVisualTableDatosComisionLinea() throws Exception {
		
		ComisionLineaModel comisionlineaModel=(ComisionLineaModel)this.jTableDatosComisionLinea.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comisionlineaModel.comisionlineas=this.comisionlineaLogic.getComisionLineas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			comisionlineaModel.comisionlineas=this.comisionlineas;
		}
		
		
		((ComisionLineaModel) this.jTableDatosComisionLinea.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaComisionLinea() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcomisionlineaAnterior(),this.comisionlineaLogic.getComisionLineas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcomisionlineaAnterior(),this.comisionlineas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosComisionLinea();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioComisionLinea(ComisionLinea comisionlinea,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
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
										
				ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisionlinea,new Object(),generalEntityParameterGeneral,this.comisionlineaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.comisionlineaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ComisionLineaConstantesFunciones.getClassesRelationshipsOfComisionLinea(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ComisionLineaConstantesFunciones.getClassesRelationshipsFromStringsOfComisionLinea(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormComisionLinea(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ComisionLineaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisionlinea,new Object(),generalEntityParameterGeneral,this.comisionlineaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioComisionLinea(ComisionLineaBean comisionlineaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanComisionLinea(ArrayList<Classe> classes,ComisionLineaReturnGeneral comisionlineaReturnGeneral,ComisionLineaBean comisionlineaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualComisionLinea(ComisionLinea comisionlinea,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.comisionlinea)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormComisionLinea = new ComisionLineaDetalleFormJInternalFrame(jDesktopPane,this.comisionlineaSessionBean.getConGuardarRelaciones(),this.comisionlineaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormComisionLinea);
		this.jInternalFrameDetalleFormComisionLinea.setVisible(false);
		this.jInternalFrameDetalleFormComisionLinea.setSelected(false);						
		
		this.jInternalFrameDetalleFormComisionLinea.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormComisionLinea.comisionlineaLogic=this.comisionlineaLogic;
		
		this.cargarCombosFrameForeignKeyComisionLinea("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleComisionLinea();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleComisionLinea();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyComisionLinea("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyComisionLinea();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormComisionLinea.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarComisionLinea"));
		
		this.jInternalFrameDetalleFormComisionLinea.jButtonModificarComisionLinea.addActionListener(new ButtonActionListener(this,"ModificarComisionLinea"));

		
		this.jInternalFrameDetalleFormComisionLinea.jButtonModificarToolBarComisionLinea.addActionListener(new ButtonActionListener(this,"ModificarToolBarComisionLinea"));
					
		this.jInternalFrameDetalleFormComisionLinea.jMenuItemModificarComisionLinea.addActionListener(new ButtonActionListener(this,"MenuItemModificarComisionLinea"));		
		
		
		
		this.jInternalFrameDetalleFormComisionLinea.jButtonActualizarComisionLinea.addActionListener (new ButtonActionListener(this,"ActualizarComisionLinea"));
		
		
		this.jInternalFrameDetalleFormComisionLinea.jButtonActualizarToolBarComisionLinea.addActionListener(new ButtonActionListener(this,"ActualizarToolBarComisionLinea"));
						
		this.jInternalFrameDetalleFormComisionLinea.jMenuItemActualizarComisionLinea.addActionListener (new ButtonActionListener(this,"MenuItemActualizarComisionLinea"));		
		
		
		
		this.jInternalFrameDetalleFormComisionLinea.jButtonEliminarComisionLinea.addActionListener (new ButtonActionListener(this,"EliminarComisionLinea"));
		
		
		this.jInternalFrameDetalleFormComisionLinea.jButtonEliminarToolBarComisionLinea.addActionListener (new ButtonActionListener(this,"EliminarToolBarComisionLinea"));
								
		this.jInternalFrameDetalleFormComisionLinea.jMenuItemEliminarComisionLinea.addActionListener (new ButtonActionListener(this,"MenuItemEliminarComisionLinea"));		
		
		
		
		this.jInternalFrameDetalleFormComisionLinea.jButtonCancelarComisionLinea.addActionListener (new ButtonActionListener(this,"CancelarComisionLinea"));
		
		
		this.jInternalFrameDetalleFormComisionLinea.jButtonCancelarToolBarComisionLinea.addActionListener (new ButtonActionListener(this,"CancelarToolBarComisionLinea"));
					
		this.jInternalFrameDetalleFormComisionLinea.jMenuItemCancelarComisionLinea.addActionListener (new ButtonActionListener(this,"MenuItemCancelarComisionLinea"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormComisionLinea.jMenuItemDetalleCerrarComisionLinea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarComisionLinea"));		
		
		
		
		this.jInternalFrameDetalleFormComisionLinea.jButtonGuardarCambiosToolBarComisionLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComisionLinea"));
		
		
		
		this.jInternalFrameDetalleFormComisionLinea.jButtonGuardarCambiosToolBarComisionLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComisionLinea"));
		
		
		
		this.jInternalFrameDetalleFormComisionLinea.jComboBoxTiposAccionesFormularioComisionLinea.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioComisionLinea"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionLinea.jButtonidComisionLineaBusqueda.addActionListener(new ButtonActionListener(this,"idComisionLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_empresaComisionLineaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComisionLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_empresaComisionLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComisionLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_comision_configComisionLineaUpdate.addActionListener(new ButtonActionListener(this,"id_comision_configComisionLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_comision_configComisionLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_comision_configComisionLineaBusqueda"));
		//jButtonid_vendedorComisionLinea.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_vendedorComisionLineaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_vendedorComisionLinea.addActionListener(new ButtonActionListener(this,"id_vendedorComisionLinea"));
		//jButtonid_vendedorComisionLineaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeVendedor("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_vendedorComisionLineaArbol.addActionListener(new ButtonActionListener(this,"id_vendedorComisionLineaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_vendedorComisionLineaUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorComisionLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_vendedorComisionLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorComisionLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_lineaComisionLineaUpdate.addActionListener(new ButtonActionListener(this,"id_lineaComisionLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_lineaComisionLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaComisionLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_estado_comisionComisionLineaUpdate.addActionListener(new ButtonActionListener(this,"id_estado_comisionComisionLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_estado_comisionComisionLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_comisionComisionLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionLinea.jButtonporcentajeComisionLineaBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeComisionLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionLinea.jButtondescripcionComisionLineaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionComisionLineaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormComisionLinea.jTabbedPaneRelacionesComisionLinea.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesComisionLinea"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameComisionLinea"));
		
		if(this.jInternalFrameDetalleFormComisionLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionLinea.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarComisionLinea"));
		}
		
		this.jTableDatosComisionLinea.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarComisionLinea"));
		
		this.jTableDatosComisionLinea.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarComisionLinea"));
		
		this.jButtonNuevoComisionLinea.addActionListener(new ButtonActionListener(this,"NuevoComisionLinea"));
		
		this.jButtonDuplicarComisionLinea.addActionListener(new ButtonActionListener(this,"DuplicarComisionLinea"));
		
		this.jButtonCopiarComisionLinea.addActionListener(new ButtonActionListener(this,"CopiarComisionLinea"));
		
		this.jButtonVerFormComisionLinea.addActionListener(new ButtonActionListener(this,"VerFormComisionLinea"));
		
		
		this.jButtonNuevoToolBarComisionLinea.addActionListener(new ButtonActionListener(this,"NuevoToolBarComisionLinea"));
			
		this.jButtonDuplicarToolBarComisionLinea.addActionListener(new ButtonActionListener(this,"DuplicarToolBarComisionLinea"));
			
		this.jMenuItemNuevoComisionLinea.addActionListener (new ButtonActionListener(this,"MenuItemNuevoComisionLinea"));
			
		this.jMenuItemDuplicarComisionLinea.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarComisionLinea"));		
		
		
		this.jButtonNuevoRelacionesComisionLinea.addActionListener (new ButtonActionListener(this,"NuevoRelacionesComisionLinea"));
		
		
		this.jButtonNuevoRelacionesToolBarComisionLinea.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarComisionLinea"));
			
		this.jMenuItemNuevoRelacionesComisionLinea.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesComisionLinea"));		
		
		
		if(this.jInternalFrameDetalleFormComisionLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionLinea.jButtonModificarComisionLinea.addActionListener(new ButtonActionListener(this,"ModificarComisionLinea"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionLinea.jButtonModificarToolBarComisionLinea.addActionListener(new ButtonActionListener(this,"ModificarToolBarComisionLinea"));
			
			this.jInternalFrameDetalleFormComisionLinea.jMenuItemModificarComisionLinea.addActionListener(new ButtonActionListener(this,"MenuItemModificarComisionLinea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisionLinea!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormComisionLinea.jButtonActualizarComisionLinea.addActionListener (new ButtonActionListener(this,"ActualizarComisionLinea"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionLinea.jButtonActualizarToolBarComisionLinea.addActionListener(new ButtonActionListener(this,"ActualizarToolBarComisionLinea"));
				
			this.jInternalFrameDetalleFormComisionLinea.jMenuItemActualizarComisionLinea.addActionListener (new ButtonActionListener(this,"MenuItemActualizarComisionLinea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisionLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionLinea.jButtonEliminarComisionLinea.addActionListener (new ButtonActionListener(this,"EliminarComisionLinea"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionLinea.jButtonEliminarToolBarComisionLinea.addActionListener (new ButtonActionListener(this,"EliminarToolBarComisionLinea"));
						
			this.jInternalFrameDetalleFormComisionLinea.jMenuItemEliminarComisionLinea.addActionListener (new ButtonActionListener(this,"MenuItemEliminarComisionLinea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisionLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionLinea.jButtonCancelarComisionLinea.addActionListener (new ButtonActionListener(this,"CancelarComisionLinea"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionLinea.jButtonCancelarToolBarComisionLinea.addActionListener (new ButtonActionListener(this,"CancelarToolBarComisionLinea"));
			
			this.jInternalFrameDetalleFormComisionLinea.jMenuItemCancelarComisionLinea.addActionListener (new ButtonActionListener(this,"MenuItemCancelarComisionLinea"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarComisionLinea.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarComisionLinea"));		
		
		
		this.jButtonCerrarComisionLinea.addActionListener (new ButtonActionListener(this,"CerrarComisionLinea"));
		
		
		this.jButtonCerrarToolBarComisionLinea.addActionListener (new ButtonActionListener(this,"CerrarToolBarComisionLinea"));
			
		this.jMenuItemCerrarComisionLinea.addActionListener (new ButtonActionListener(this,"MenuItemCerrarComisionLinea"));
			
		if(this.jInternalFrameDetalleFormComisionLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionLinea.jMenuItemDetalleCerrarComisionLinea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarComisionLinea"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisionLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionLinea.jButtonGuardarCambiosComisionLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosComisionLinea"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionLinea.jButtonGuardarCambiosToolBarComisionLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComisionLinea"));
		}
		
		this.jButtonCopiarToolBarComisionLinea.addActionListener (new ButtonActionListener(this,"CopiarToolBarComisionLinea"));
			
		this.jButtonVerFormToolBarComisionLinea.addActionListener (new ButtonActionListener(this,"VerFormToolBarComisionLinea"));
		
		this.jMenuItemGuardarCambiosComisionLinea.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosComisionLinea"));
			
		this.jMenuItemCopiarComisionLinea.addActionListener (new ButtonActionListener(this,"MenuItemCopiarComisionLinea"));		
		
		this.jMenuItemVerFormComisionLinea.addActionListener (new ButtonActionListener(this,"MenuItemVerFormComisionLinea"));		
		
		
		this.jButtonGuardarCambiosTablaComisionLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaComisionLinea"));
		
		
		this.jButtonGuardarCambiosTablaToolBarComisionLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarComisionLinea"));
			
		this.jMenuItemGuardarCambiosTablaComisionLinea.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaComisionLinea"));		
		
		
		
		this.jButtonRecargarInformacionComisionLinea.addActionListener (new ButtonActionListener(this,"RecargarInformacionComisionLinea"));
					
		this.jButtonRecargarInformacionToolBarComisionLinea.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarComisionLinea"));
		
		this.jMenuItemRecargarInformacionComisionLinea.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionComisionLinea"));		
		
		
		
		this.jButtonAnterioresComisionLinea.addActionListener (new ButtonActionListener(this,"AnterioresComisionLinea"));
		
		
		this.jButtonAnterioresToolBarComisionLinea.addActionListener (new ButtonActionListener(this,"AnterioresToolBarComisionLinea"));
		
		this.jMenuItemAnterioresComisionLinea.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresComisionLinea"));		
		
		
		this.jButtonSiguientesComisionLinea.addActionListener (new ButtonActionListener(this,"SiguientesComisionLinea"));
		
		
		this.jButtonSiguientesToolBarComisionLinea.addActionListener (new ButtonActionListener(this,"SiguientesToolBarComisionLinea"));
			
		this.jMenuItemSiguientesComisionLinea.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesComisionLinea"));
			
		this.jMenuItemAbrirOrderByComisionLinea.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByComisionLinea"));
			
		this.jMenuItemMostrarOcultarComisionLinea.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarComisionLinea"));
			
		this.jMenuItemDetalleAbrirOrderByComisionLinea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByComisionLinea"));
			
		this.jMenuItemDetalleMostarOcultarComisionLinea.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarComisionLinea"));		
		
		
		this.jButtonNuevoGuardarCambiosComisionLinea.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosComisionLinea"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarComisionLinea.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarComisionLinea"));
			
		this.jMenuItemNuevoGuardarCambiosComisionLinea.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosComisionLinea"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosComisionLinea.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosComisionLinea"));

		this.jCheckBoxSeleccionadosComisionLinea.addItemListener(new CheckBoxItemListener(this,"SeleccionadosComisionLinea"));
		
		if(this.jInternalFrameDetalleFormComisionLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionLinea.jComboBoxTiposAccionesFormularioComisionLinea.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioComisionLinea"));
		}
		
		
		this.jComboBoxTiposRelacionesComisionLinea.addActionListener (new ButtonActionListener(this,"TiposRelacionesComisionLinea"));
			
		this.jComboBoxTiposAccionesComisionLinea.addActionListener (new ButtonActionListener(this,"TiposAccionesComisionLinea"));
					
		this.jComboBoxTiposSeleccionarComisionLinea.addActionListener (new ButtonActionListener(this,"TiposSeleccionarComisionLinea"));
			
		this.jTextFieldValorCampoGeneralComisionLinea.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralComisionLinea"));		
		
		
		if(this.jInternalFrameDetalleFormComisionLinea!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionLinea.jButtonidComisionLineaBusqueda.addActionListener(new ButtonActionListener(this,"idComisionLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_empresaComisionLineaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComisionLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_empresaComisionLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComisionLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_comision_configComisionLineaUpdate.addActionListener(new ButtonActionListener(this,"id_comision_configComisionLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_comision_configComisionLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_comision_configComisionLineaBusqueda"));
		//jButtonid_vendedorComisionLinea.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_vendedorComisionLineaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_vendedorComisionLinea.addActionListener(new ButtonActionListener(this,"id_vendedorComisionLinea"));
		//jButtonid_vendedorComisionLineaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeVendedor("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_vendedorComisionLineaArbol.addActionListener(new ButtonActionListener(this,"id_vendedorComisionLineaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_vendedorComisionLineaUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorComisionLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_vendedorComisionLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorComisionLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_lineaComisionLineaUpdate.addActionListener(new ButtonActionListener(this,"id_lineaComisionLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_lineaComisionLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaComisionLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_estado_comisionComisionLineaUpdate.addActionListener(new ButtonActionListener(this,"id_estado_comisionComisionLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_estado_comisionComisionLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_comisionComisionLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionLinea.jButtonporcentajeComisionLineaBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeComisionLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionLinea.jButtondescripcionComisionLineaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionComisionLineaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdComisionConfigComisionLinea.addActionListener(new ButtonActionListener(this,"FK_IdComisionConfigComisionLinea"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoComisionLinea!=null) {
				this.jInternalFrameReporteDinamicoComisionLinea.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComisionLinea"));
				this.jInternalFrameReporteDinamicoComisionLinea.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComisionLinea"));
				this.jInternalFrameReporteDinamicoComisionLinea.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComisionLinea"));
			}
			
			//this.jButtonCerrarReporteDinamicoComisionLinea.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComisionLinea"));				
			//this.jButtonGenerarReporteDinamicoComisionLinea.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComisionLinea"));
			//this.jButtonGenerarExcelReporteDinamicoComisionLinea.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComisionLinea"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionComisionLinea!=null) {
				this.jInternalFrameImportacionComisionLinea.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionComisionLinea"));
				this.jInternalFrameImportacionComisionLinea.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionComisionLinea"));
				this.jInternalFrameImportacionComisionLinea.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionComisionLinea"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByComisionLinea.addActionListener (new ButtonActionListener(this,"AbrirOrderByComisionLinea"));
			
			this.jButtonAbrirOrderByToolBarComisionLinea.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarComisionLinea"));			
			
			if(this.jInternalFrameOrderByComisionLinea!=null) {
				this.jInternalFrameOrderByComisionLinea.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByComisionLinea"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormComisionLinea!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormComisionLinea!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionLinea.jTabbedPaneRelacionesComisionLinea.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesComisionLinea"));
		
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
            		closingInternalFrameComisionLinea();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormComisionLinea.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormComisionLinea = (JInternalFrameBase)event.getSource();
	            	
	            ComisionLineaBeanSwingJInternalFrame jInternalFrameParent=(ComisionLineaBeanSwingJInternalFrame)jInternalFrameDetalleFormComisionLinea.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarComisionLineaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosComisionLinea.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosComisionLineaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosComisionLinea.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosComisionLinea.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionLineaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionLineaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionLineaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoComisionLinea";
		inputMap = this.jButtonNuevoComisionLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoComisionLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoComisionLineaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionLineaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionLineaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionLineaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesComisionLinea";
		inputMap = this.jButtonNuevoRelacionesComisionLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesComisionLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoComisionLineaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarComisionLinea";
		inputMap = this.jButtonModificarComisionLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarComisionLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarComisionLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarComisionLinea";
		inputMap = this.jButtonActualizarComisionLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarComisionLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarComisionLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarComisionLinea";
		inputMap = this.jButtonEliminarComisionLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarComisionLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarComisionLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarComisionLinea";
		inputMap = this.jButtonCancelarComisionLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarComisionLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarComisionLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarComisionLinea";
		inputMap = this.jButtonCerrarComisionLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarComisionLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarComisionLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormComisionLinea.jButtonGuardarCambiosComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosComisionLinea";
		inputMap = this.jInternalFrameDetalleFormComisionLinea.jButtonGuardarCambiosComisionLinea.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormComisionLinea.jButtonGuardarCambiosComisionLinea.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosComisionLineaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosComisionLinea.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosComisionLineaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesComisionLinea.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesComisionLineaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarComisionLinea.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarComisionLineaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralComisionLinea.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralComisionLineaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionLinea.jButtonidComisionLineaBusqueda.addActionListener(new ButtonActionListener(this,"idComisionLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_empresaComisionLineaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComisionLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_empresaComisionLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComisionLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_comision_configComisionLineaUpdate.addActionListener(new ButtonActionListener(this,"id_comision_configComisionLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_comision_configComisionLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_comision_configComisionLineaBusqueda"));
		//jButtonid_vendedorComisionLinea.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_vendedorComisionLineaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_vendedorComisionLinea.addActionListener(new ButtonActionListener(this,"id_vendedorComisionLinea"));
		//jButtonid_vendedorComisionLineaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeVendedor("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_vendedorComisionLineaArbol.addActionListener(new ButtonActionListener(this,"id_vendedorComisionLineaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_vendedorComisionLineaUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorComisionLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_vendedorComisionLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorComisionLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_lineaComisionLineaUpdate.addActionListener(new ButtonActionListener(this,"id_lineaComisionLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_lineaComisionLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaComisionLineaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_estado_comisionComisionLineaUpdate.addActionListener(new ButtonActionListener(this,"id_estado_comisionComisionLineaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionLinea.jButtonid_estado_comisionComisionLineaBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_comisionComisionLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionLinea.jButtonporcentajeComisionLineaBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeComisionLineaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionLinea.jButtondescripcionComisionLineaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionComisionLineaBusqueda"));
		
		
		this.jButtonFK_IdComisionConfigComisionLinea.addActionListener(new ButtonActionListener(this,"FK_IdComisionConfigComisionLinea"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionComisionLinea.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionComisionLineaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarComisionLineaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarComisionLinea.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosComisionLinea(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ComisionLinea comisionlineaAux:this.comisionlineaLogic.getComisionLineas()) {
					comisionlineaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComisionLinea comisionlineaAux:comisionlineas) {
					comisionlineaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosComisionLineaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingComisionLinea(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ComisionLinea comisionlineaAux:this.comisionlineaLogic.getComisionLineas()) {
						comisionlineaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComisionLinea comisionlineaAux:comisionlineas) {
						comisionlineaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ComisionLinea comisionlineaAux:this.comisionlineaLogic.getComisionLineas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComisionLinea comisionlineaAux:comisionlineas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaComisionLinea(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosComisionLinea.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosComisionLinea.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosComisionLinea,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosComisionLineaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingComisionLinea(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosComisionLinea.getSelectedRows();
			
			ComisionLinea comisionlineaLocal=new ComisionLinea();
			
			//this.seleccionarTodosComisionLinea(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionlineaLocal =(ComisionLinea) this.comisionlineaLogic.getComisionLineas().toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					comisionlineaLocal =(ComisionLinea) this.comisionlineas.toArray()[this.jTableDatosComisionLinea.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				comisionlineaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ComisionLinea comisionlineaAux:this.comisionlineaLogic.getComisionLineas()) {
						comisionlineaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComisionLinea comisionlineaAux:comisionlineas) {
						comisionlineaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaComisionLinea(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosComisionLinea.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosComisionLinea.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosComisionLinea,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualComisionLineaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarComisionLineaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralComisionLineaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingComisionLinea(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralComisionLinea.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ComisionLinea comisionlineaAux:this.comisionlineaLogic.getComisionLineas()) {
				
						if(sTipoSeleccionar.equals(ComisionLineaConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							comisionlineaAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComisionLineaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							comisionlineaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComisionLinea comisionlineaAux:comisionlineas) {
					
						if(sTipoSeleccionar.equals(ComisionLineaConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							comisionlineaAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComisionLineaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							comisionlineaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaComisionLinea(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesComisionLineaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingComisionLinea(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioComisionLinea=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesComisionLinea.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormComisionLinea.jComboBoxTiposAccionesFormularioComisionLinea.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteComisionLinea) {				
					conSplash=true;//false;										
					
					//this.startProcessComisionLinea(conSplash);
				
					this.generarReporteComisionLineasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisionLinea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisionLinea.jComboBoxTiposAccionesFormularioComisionLinea.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoComisionLineasSeleccionados();
				//this.jComboBoxTiposAccionesComisionLinea.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoComisionLineasSeleccionados(false);
				//this.jComboBoxTiposAccionesComisionLinea.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoComisionLineasSeleccionados(true);
				//this.jComboBoxTiposAccionesComisionLinea.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessComisionLinea();
				
				this.exportarComisionLineasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisionLinea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisionLinea.jComboBoxTiposAccionesFormularioComisionLinea.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionComisionLineas();
				//this.importarComisionLineas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisionLinea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisionLinea.jComboBoxTiposAccionesFormularioComisionLinea.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessComisionLinea();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelComisionLineasSeleccionados();
				//this.jComboBoxTiposAccionesComisionLinea.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Comision Linea", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessComisionLinea();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoComisionLinea)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyComisionLinea(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Comision Linea",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisionLinea.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisionLinea.jComboBoxTiposAccionesFormularioComisionLinea.setSelectedIndex(0);					
				}	
			} 			
			else if(ComisionLineaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteComisionLinea) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessComisionLinea(conSplash);
					
						//this.actualizarParametrosGeneralComisionLinea();
						
						this.generarReporteProcesoAccionComisionLineasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesComisionLinea.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormComisionLinea.jComboBoxTiposAccionesFormularioComisionLinea.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ComisionLineaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Comision LineaS SELECCIONADOS?", "MANTENIMIENTO DE Comision Linea", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessComisionLinea();
				
						this.actualizarParametrosGeneralComisionLinea();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.comisionlineaReturnGeneral=comisionlineaLogic.procesarAccionComisionLineasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.comisionlineaLogic.getComisionLineas(),this.comisionlineaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarComisionLineaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesComisionLinea.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormComisionLinea.jComboBoxTiposAccionesFormularioComisionLinea.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralComisionLinea();
					
					ComisionLineaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarComisionLineaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesComisionLinea.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormComisionLinea.jComboBoxTiposAccionesFormularioComisionLinea.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessComisionLinea(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesComisionLineaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessComisionLinea();
			
			if(this.jInternalFrameDetalleFormComisionLinea==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ComisionLinea> comisionlineasSeleccionados=new ArrayList<ComisionLinea>();		
			ComisionLinea comisionlinea=new ComisionLinea();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingComisionLinea(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesComisionLinea.getSelectedItem();
			
			
			
			
			comisionlineasSeleccionados=this.getComisionLineasSeleccionados(true);
			//this.sTipoAccion;
			
			if(comisionlineasSeleccionados.size()==1) {
				for(ComisionLinea comisionlineaAux:comisionlineasSeleccionados) {
					comisionlinea=comisionlineaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessComisionLinea();
			
      		//this.finishProcessComisionLinea(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarComisionLineaReturnGeneral() throws Exception {
		if(this.comisionlineaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.comisionlineaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.comisionlineaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.comisionlineaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.comisionlineaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.comisionlineaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingComisionLinea(false);
		}
		
		if(this.comisionlineaReturnGeneral.getConRetornoLista() || this.comisionlineaReturnGeneral.getConRetornoObjeto()) {
			if(this.comisionlineaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.comisionlineaLogic.setComisionLineas(this.comisionlineaReturnGeneral.getComisionLineas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.comisionlineaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.comisionlineaLogic.setComisionLinea(this.comisionlineaReturnGeneral.getComisionLinea());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingComisionLinea(false);
		}
	}
	
	public void actualizarParametrosGeneralComisionLinea() throws Exception {
		
		
	}
	
	public ArrayList<ComisionLinea> getComisionLineasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ComisionLinea> comisionlineasSeleccionados=new ArrayList<ComisionLinea>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioComisionLinea) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ComisionLinea comisionlineaAux:comisionlineaLogic.getComisionLineas()) {
					if(comisionlineaAux.getIsSelected()) {
						comisionlineasSeleccionados.add(comisionlineaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComisionLinea comisionlineaAux:this.comisionlineas) {
					if(comisionlineaAux.getIsSelected()) {
						comisionlineasSeleccionados.add(comisionlineaAux);				
					}
				}
			}
			
			if(comisionlineasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						comisionlineasSeleccionados.addAll(this.comisionlineaLogic.getComisionLineas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						comisionlineasSeleccionados.addAll(this.comisionlineas);				
					}
				}
			}
		} else {
			comisionlineasSeleccionados.add(this.comisionlinea);
		}
		
		return comisionlineasSeleccionados;
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
	
	public void generarReporteComisionLineasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalComisionLineasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoComisionLineasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoComisionLineasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoComisionLineasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Comision Linea",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesComisionLineasSeleccionados() throws Exception {
		ArrayList<ComisionLinea> comisionlineasSeleccionados=new ArrayList<ComisionLinea>();		
		
		comisionlineasSeleccionados=this.getComisionLineasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteComisionLineas("Todos",comisionlineasSeleccionados);
		
	}	
	
	public void generarReporteNormalComisionLineasSeleccionados() throws Exception {
		ArrayList<ComisionLinea> comisionlineasSeleccionados=new ArrayList<ComisionLinea>();		
		
		comisionlineasSeleccionados=this.getComisionLineasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteComisionLineas("Todos",comisionlineasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionComisionLineasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ComisionLinea> comisionlineasSeleccionados=new ArrayList<ComisionLinea>();
		
		comisionlineasSeleccionados=this.getComisionLineasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteComisionLineas("Todos",comisionlineasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoComisionLineasSeleccionados() throws Exception {
		ArrayList<ComisionLinea> comisionlineasSeleccionados=new ArrayList<ComisionLinea>();		
		
		
		this.abrirInicializarFrameReporteDinamicoComisionLinea();
		
		
		comisionlineasSeleccionados=this.getComisionLineasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoComisionLinea();
		
		
		//this.generarReporteComisionLineas("Todos",comisionlineasSeleccionados ,comisionlineaImplementable,comisionlineaImplementableHome);
	}
	
	public void mostrarImportacionComisionLineas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionComisionLinea();
		
		this.abrirFrameImportacionComisionLinea();		
		
			
		//this.generarReporteComisionLineas("Todos",comisionlineasSeleccionados ,comisionlineaImplementable,comisionlineaImplementableHome);
	}
	
	public void importarComisionLineas() throws Exception {		
	
	}
	
	public void exportarComisionLineasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelComisionLineasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoComisionLineasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlComisionLineasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Comision Linea",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoComisionLineasSeleccionados() throws Exception {
		ArrayList<ComisionLinea> comisionlineasSeleccionados=new ArrayList<ComisionLinea>();		
		
		comisionlineasSeleccionados=this.getComisionLineasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionlinea."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarComisionLinea(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ComisionLinea comisionlineaAux:comisionlineasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarComisionLinea(comisionlineaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//comisionlineaAux.setsDetalleGeneralEntityReporte(comisionlineaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionlineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Linea",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarComisionLinea(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ComisionLineaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionLineaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionLineaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionLineaConstantesFunciones.LABEL_IDCOMISIONCONFIG;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionLineaConstantesFunciones.LABEL_IDVENDEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionLineaConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionLineaConstantesFunciones.LABEL_IDESTADOCOMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionLineaConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionLineaConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarComisionLinea(ComisionLinea comisionlinea,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=comisionlinea.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionlinea.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionlinea.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionlinea.getcomisionconfig_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionlinea.getvendedor_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionlinea.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionlinea.getestadocomision_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionlinea.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionlinea.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelComisionLineasSeleccionados() throws Exception {
		ArrayList<ComisionLinea> comisionlineasSeleccionados=new ArrayList<ComisionLinea>();		
		
		comisionlineasSeleccionados=this.getComisionLineasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionlinea.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ComisionLineas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelComisionLinea(row);				
				iRow++;
			}				
			
			for(ComisionLinea comisionlineaAux:comisionlineasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelComisionLinea(comisionlineaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionlineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Linea",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlComisionLineasSeleccionados() throws Exception {
		ArrayList<ComisionLinea> comisionlineasSeleccionados=new ArrayList<ComisionLinea>();		
		
		comisionlineasSeleccionados=this.getComisionLineasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionlinea.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("comisionlineas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("comisionlinea");
			//elementRoot.appendChild(element);
		
			for(ComisionLinea comisionlineaAux:comisionlineasSeleccionados) {
				element = document.createElement("comisionlinea");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlComisionLinea(comisionlineaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionlineaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Linea",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelComisionLinea(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionLineaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionLineaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ComisionLineaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionLineaConstantesFunciones.LABEL_IDCOMISIONCONFIG);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionLineaConstantesFunciones.LABEL_IDVENDEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionLineaConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionLineaConstantesFunciones.LABEL_IDESTADOCOMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionLineaConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionLineaConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelComisionLinea(ComisionLinea comisionlinea,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(comisionlinea.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionlinea.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionlinea.getcomisionconfig_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionlinea.getvendedor_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionlinea.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionlinea.getestadocomision_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionlinea.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionlinea.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlComisionLinea(ComisionLinea comisionlinea,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ComisionLineaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(comisionlinea.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ComisionLineaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(comisionlinea.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ComisionLineaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(comisionlinea.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcomisionconfig_descripcion = document.createElement(ComisionLineaConstantesFunciones.IDCOMISIONCONFIG);
		elementcomisionconfig_descripcion.appendChild(document.createTextNode(comisionlinea.getcomisionconfig_descripcion()));
		element.appendChild(elementcomisionconfig_descripcion);

		Element elementvendedor_descripcion = document.createElement(ComisionLineaConstantesFunciones.IDVENDEDOR);
		elementvendedor_descripcion.appendChild(document.createTextNode(comisionlinea.getvendedor_descripcion()));
		element.appendChild(elementvendedor_descripcion);

		Element elementlinea_descripcion = document.createElement(ComisionLineaConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(comisionlinea.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementestadocomision_descripcion = document.createElement(ComisionLineaConstantesFunciones.IDESTADOCOMISION);
		elementestadocomision_descripcion.appendChild(document.createTextNode(comisionlinea.getestadocomision_descripcion()));
		element.appendChild(elementestadocomision_descripcion);

		Element elementporcentaje = document.createElement(ComisionLineaConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(comisionlinea.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementdescripcion = document.createElement(ComisionLineaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(comisionlinea.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoComisionLineasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ComisionLinea> comisionlineasSeleccionados=new ArrayList<ComisionLinea>();
		
		comisionlineasSeleccionados=this.getComisionLineasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoComisionLinea(comisionlineasSeleccionados);
		
		this.generarReporteComisionLineas("Todos",comisionlineasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoComisionLinea(ArrayList<ComisionLinea> comisionlineasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ComisionLinea comisionlineaAux:comisionlineasSeleccionados) {
				comisionlineaAux.setsDetalleGeneralEntityReporte(comisionlineaAux.toString());
			
				if(sTipoSeleccionar.equals(ComisionLineaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					comisionlineaAux.setsDescripcionGeneralEntityReporte1(comisionlineaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionLineaConstantesFunciones.LABEL_IDCOMISIONCONFIG)) {
					existe=true;
					comisionlineaAux.setsDescripcionGeneralEntityReporte1(comisionlineaAux.getcomisionconfig_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionLineaConstantesFunciones.LABEL_IDVENDEDOR)) {
					existe=true;
					comisionlineaAux.setsDescripcionGeneralEntityReporte1(comisionlineaAux.getvendedor_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionLineaConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					comisionlineaAux.setsDescripcionGeneralEntityReporte1(comisionlineaAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionLineaConstantesFunciones.LABEL_IDESTADOCOMISION)) {
					existe=true;
					comisionlineaAux.setsDescripcionGeneralEntityReporte1(comisionlineaAux.getestadocomision_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionLineaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					comisionlineaAux.setsDescripcionGeneralEntityReporte1(comisionlineaAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionLineaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesComisionLinea(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoComisionLinea=true;
				this.isVisibilidadCeldaNuevoRelacionesComisionLinea=true;
				this.isVisibilidadCeldaGuardarCambiosComisionLinea=true;
			}
			
			this.isVisibilidadCeldaModificarComisionLinea=false;
			this.isVisibilidadCeldaActualizarComisionLinea=false;
			this.isVisibilidadCeldaEliminarComisionLinea=false;
			this.isVisibilidadCeldaCancelarComisionLinea=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionLinea=true;
				} else {
					this.isVisibilidadCeldaGuardarComisionLinea=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoComisionLinea=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionLinea=false;
			this.isVisibilidadCeldaGuardarCambiosComisionLinea=false;
			this.isVisibilidadCeldaModificarComisionLinea=false;
			this.isVisibilidadCeldaActualizarComisionLinea=true;
			this.isVisibilidadCeldaEliminarComisionLinea=false;
			this.isVisibilidadCeldaCancelarComisionLinea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionLinea=true;
				} else {
					this.isVisibilidadCeldaGuardarComisionLinea=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoComisionLinea=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionLinea=false;
			this.isVisibilidadCeldaGuardarCambiosComisionLinea=false;
			this.isVisibilidadCeldaModificarComisionLinea=false;
			this.isVisibilidadCeldaActualizarComisionLinea=true;
			this.isVisibilidadCeldaEliminarComisionLinea=true;
			this.isVisibilidadCeldaCancelarComisionLinea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionLinea=true;
				} else {
					this.isVisibilidadCeldaGuardarComisionLinea=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoComisionLinea=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionLinea=false;
			this.isVisibilidadCeldaGuardarCambiosComisionLinea=false;
			this.isVisibilidadCeldaModificarComisionLinea=false;
			this.isVisibilidadCeldaActualizarComisionLinea=true;
			this.isVisibilidadCeldaEliminarComisionLinea=false;
			this.isVisibilidadCeldaCancelarComisionLinea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionLinea=false;
				} else {
					this.isVisibilidadCeldaGuardarComisionLinea=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoComisionLinea=true;
			this.isVisibilidadCeldaNuevoRelacionesComisionLinea=true;
			this.isVisibilidadCeldaGuardarCambiosComisionLinea=true;
			this.isVisibilidadCeldaModificarComisionLinea=false;
			this.isVisibilidadCeldaActualizarComisionLinea=false;
			this.isVisibilidadCeldaEliminarComisionLinea=false;
			this.isVisibilidadCeldaCancelarComisionLinea=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionLinea=true;
				} else {
					this.isVisibilidadCeldaGuardarComisionLinea=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoComisionLinea=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionLinea=false;
			this.isVisibilidadCeldaGuardarCambiosComisionLinea=false;
			this.isVisibilidadCeldaActualizarComisionLinea=false;
			this.isVisibilidadCeldaEliminarComisionLinea=false;
			this.isVisibilidadCeldaCancelarComisionLinea=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionLinea=false;
				} else {
					this.isVisibilidadCeldaGuardarComisionLinea=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoComisionLinea=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionLinea=false;
			this.isVisibilidadCeldaGuardarCambiosComisionLinea=false;
			this.isVisibilidadCeldaModificarComisionLinea=true;
			this.isVisibilidadCeldaActualizarComisionLinea=false;
			this.isVisibilidadCeldaEliminarComisionLinea=false;
			this.isVisibilidadCeldaCancelarComisionLinea=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionLinea=false;
				} else {
					this.isVisibilidadCeldaGuardarComisionLinea=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ComisionLineaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoComisionLinea=true;
			this.isVisibilidadCeldaNuevoRelacionesComisionLinea=true;
			this.isVisibilidadCeldaGuardarCambiosComisionLinea=true;
		} else {
			this.actualizarEstadoPanelsComisionLinea(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarComisionLinea=false;
			//this.isVisibilidadCeldaVerFormComisionLinea=false;
			this.isVisibilidadCeldaDuplicarComisionLinea=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!comisionlineaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesComisionLinea=false;
		} else {
			this.isVisibilidadCeldaNuevoComisionLinea=false;
			this.isVisibilidadCeldaGuardarCambiosComisionLinea=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(comisionlineaSessionBean.getEsGuardarRelacionado()) {
			if(!comisionlineaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesComisionLinea=false;												
			}
			
			this.jButtonCerrarComisionLinea.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesComisionLinea=false;
		}
		
		if(!this.permiteMantenimiento(this.comisionlinea)) {
			this.isVisibilidadCeldaActualizarComisionLinea=false;
			this.isVisibilidadCeldaEliminarComisionLinea=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesComisionLinea() {
	}
	
	public void actualizarEstadoPanelsComisionLinea(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionComisionLinea!=null) {
				this.jScrollPanelDatosEdicionComisionLinea.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionLinea!=null) {
				this.jTabbedPaneBusquedasComisionLinea.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComisionLinea!=null) {
				this.jScrollPanelDatosComisionLinea.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisionLinea!=null) {
				this.jPanelPaginacionComisionLinea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisionLinea!=null) {
				this.jPanelParametrosReportesComisionLinea.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionComisionLinea!=null) {
				this.jScrollPanelDatosEdicionComisionLinea.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionLinea!=null) {
				this.jTabbedPaneBusquedasComisionLinea.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosComisionLinea!=null) {
				this.jScrollPanelDatosComisionLinea.setVisible(false);
			}
			
			if(this.jPanelPaginacionComisionLinea!=null) {
				this.jPanelPaginacionComisionLinea.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComisionLinea!=null) {
				this.jPanelParametrosReportesComisionLinea.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionComisionLinea!=null) {
				this.jScrollPanelDatosEdicionComisionLinea.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionLinea!=null) {
				this.jTabbedPaneBusquedasComisionLinea.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosComisionLinea!=null) {
				this.jScrollPanelDatosComisionLinea.setVisible(false);
			}
			
			if(this.jPanelPaginacionComisionLinea!=null) {
				this.jPanelPaginacionComisionLinea.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComisionLinea!=null) {
				this.jPanelParametrosReportesComisionLinea.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionComisionLinea!=null) {
				this.jScrollPanelDatosEdicionComisionLinea.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionLinea!=null) {
				this.jTabbedPaneBusquedasComisionLinea.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosComisionLinea!=null) {
				this.jScrollPanelDatosComisionLinea.setVisible(false);
			}
			
			if(this.jPanelPaginacionComisionLinea!=null) {
				this.jPanelPaginacionComisionLinea.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComisionLinea!=null) {
				this.jPanelParametrosReportesComisionLinea.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionComisionLinea!=null) {
				this.jScrollPanelDatosEdicionComisionLinea.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionLinea!=null) {
				this.jTabbedPaneBusquedasComisionLinea.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComisionLinea!=null) {
				this.jScrollPanelDatosComisionLinea.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisionLinea!=null) {
				this.jPanelPaginacionComisionLinea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisionLinea!=null) {
				this.jPanelParametrosReportesComisionLinea.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionComisionLinea!=null) {
				this.jScrollPanelDatosEdicionComisionLinea.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionLinea!=null) {
				this.jTabbedPaneBusquedasComisionLinea.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComisionLinea!=null) {
				this.jScrollPanelDatosComisionLinea.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisionLinea!=null) {
				this.jPanelPaginacionComisionLinea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisionLinea!=null) {
				this.jPanelParametrosReportesComisionLinea.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionComisionLinea!=null) {
				this.jScrollPanelDatosEdicionComisionLinea.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionLinea!=null) {
				this.jTabbedPaneBusquedasComisionLinea.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComisionLinea!=null) {
				this.jScrollPanelDatosComisionLinea.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisionLinea!=null) {
				this.jPanelPaginacionComisionLinea.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisionLinea!=null) {
				this.jPanelParametrosReportesComisionLinea.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasComisionLinea!=null) {
					this.jTabbedPaneBusquedasComisionLinea.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesComisionLinea!=null) {
				this.jPanelParametrosReportesComisionLinea.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.comisionlineaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionLinea!=null) {
				this.jTabbedPaneBusquedasComisionLinea.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesComisionLinea!=null) {
				this.jPanelParametrosReportesComisionLinea.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdComisionConfig=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdComisionConfig) {this.jTabbedPaneBusquedasComisionLinea.remove(jPanelFK_IdComisionConfigComisionLinea);}
		}
		
	}

	public void setVisibilidadBusquedasParaComisionConfig(Boolean isParaComisionConfig){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaComisionConfigNegation=!isParaComisionConfig;

			this.isVisibilidadFK_IdComisionConfig=isParaComisionConfig;
			if(!this.isVisibilidadFK_IdComisionConfig) {this.jTabbedPaneBusquedasComisionLinea.remove(jPanelFK_IdComisionConfigComisionLinea);}
		}
		
	}

	public void setVisibilidadBusquedasParaVendedor(Boolean isParaVendedor){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaVendedorNegation=!isParaVendedor;

			this.isVisibilidadFK_IdComisionConfig=isParaVendedorNegation;
			if(!this.isVisibilidadFK_IdComisionConfig) {this.jTabbedPaneBusquedasComisionLinea.remove(jPanelFK_IdComisionConfigComisionLinea);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadFK_IdComisionConfig=isParaLineaNegation;
			if(!this.isVisibilidadFK_IdComisionConfig) {this.jTabbedPaneBusquedasComisionLinea.remove(jPanelFK_IdComisionConfigComisionLinea);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstadoComision(Boolean isParaEstadoComision){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstadoComisionNegation=!isParaEstadoComision;

			this.isVisibilidadFK_IdComisionConfig=isParaEstadoComisionNegation;
			if(!this.isVisibilidadFK_IdComisionConfig) {this.jTabbedPaneBusquedasComisionLinea.remove(jPanelFK_IdComisionConfigComisionLinea);}
		}
		
	}
	
	
	
	

	public String registrarSesionComisionLineaParaBusquedaVendedores() throws Exception {
		Boolean isPaginaPopupVendedor=false;

		try {

			if(comisionlineaSessionBean==null) {
				comisionlineaSessionBean=new ComisionLineaSessionBean();
			}

			if(vendedorSessionBean==null) {
				vendedorSessionBean=new VendedorSessionBean();
			}

			vendedorSessionBean.setsPathNavegacionActual(comisionlineaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+VendedorConstantesFunciones.SCLASSWEBTITULO);
			vendedorSessionBean.setisPermiteRecargarInformacion(false);
			vendedorSessionBean.setisPaginaPopup(true);
			isPaginaPopupVendedor=vendedorSessionBean.getisPaginaPopup();
			vendedorSessionBean.setisPaginaPopup(false);
			vendedorSessionBean.setEstaModoBusqueda(true);
			vendedorSessionBean.setsFuncionBusquedaRapida("window.opener.comisionlineaFuncionGeneral.setCombosCodigoDesdeBusquedaid_vendedor(TO_REPLACE);");
			vendedorSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeVendedor(true);
			vendedorSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeVendedor(ComisionLineaConstantesFunciones.SNOMBREOPCION);
			//vendedorSessionBean.setisBusquedaDesdeForeignKeySesionComisionLinea(true);
			//vendedorSessionBean.setlidComisionLineaActual(this.idComisionLineaActual);

			comisionlineaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyComisionLinea(true);
			comisionlineaSessionBean.setlIdComisionLineaActualForeignKey(this.idComisionLineaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ComisionLineaSessionBean comisionlineaSessionBean=new ComisionLineaSessionBean();
		
		if(this.comisionlineaSessionBean==null) {
			this.comisionlineaSessionBean=new ComisionLineaSessionBean();
		}
		
		this.comisionlineaSessionBean.setsUltimaBusquedaComisionLinea(this.getsAccionBusqueda());
		this.comisionlineaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.comisionlineaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdComisionConfig")) {
			comisionlineaSessionBean.setid_comision_config(this.getid_comision_configFK_IdComisionConfig());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			comisionlineaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ComisionLineaSessionBean comisionlineaSessionBean=new ComisionLineaSessionBean();
		
		if(this.comisionlineaSessionBean==null) {
			this.comisionlineaSessionBean=new ComisionLineaSessionBean();
		}
		
		if(this.comisionlineaSessionBean.getsUltimaBusquedaComisionLinea()!=null&&!this.comisionlineaSessionBean.getsUltimaBusquedaComisionLinea().equals("")) {
			this.setsAccionBusqueda(comisionlineaSessionBean.getsUltimaBusquedaComisionLinea());
			this.setiNumeroPaginacion(comisionlineaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(comisionlineaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdComisionConfig")) {
				this.setid_comision_configFK_IdComisionConfig(comisionlineaSessionBean.getid_comision_config());
				comisionlineaSessionBean.setid_comision_config(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(comisionlineaSessionBean.getid_empresa());
				comisionlineaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.comisionlineaSessionBean.setsUltimaBusquedaComisionLinea("");
		this.comisionlineaSessionBean.setiNumeroPaginacion(ComisionLineaConstantesFunciones.INUMEROPAGINACION);
		this.comisionlineaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaComisionLinea(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioComisionLinea() {
		this.updateBorderResaltarBusquedasFormularioComisionLinea();
		this.updateVisibilidadBusquedasFormularioComisionLinea();
		this.updateHabilitarBusquedasFormularioComisionLinea();
	}
	
	public void updateBorderResaltarBusquedasFormularioComisionLinea() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasComisionLinea.getComponents().length>0) {
	

		if(this.comisionlineaConstantesFunciones.resaltarFK_IdComisionConfigComisionLinea!=null) {
			index= this.jTabbedPaneBusquedasComisionLinea.indexOfComponent(this.jPanelFK_IdComisionConfigComisionLinea);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasComisionLinea.getComponent(index);
				jPanel.setBorder(this.comisionlineaConstantesFunciones.resaltarFK_IdComisionConfigComisionLinea);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioComisionLinea() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasComisionLinea.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasComisionLinea.indexOfComponent(this.jPanelFK_IdComisionConfigComisionLinea);
			jPanel=(JPanel)this.jTabbedPaneBusquedasComisionLinea.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.comisionlineaConstantesFunciones.mostrarFK_IdComisionConfigComisionLinea);
			if(!this.comisionlineaConstantesFunciones.mostrarFK_IdComisionConfigComisionLinea && index>-1) {
				this.jTabbedPaneBusquedasComisionLinea.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioComisionLinea() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasComisionLinea.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasComisionLinea.indexOfComponent(this.jPanelFK_IdComisionConfigComisionLinea);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasComisionLinea.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.comisionlineaConstantesFunciones.activarFK_IdComisionConfigComisionLinea);
				this.jTabbedPaneBusquedasComisionLinea.setEnabledAt(index,this.comisionlineaConstantesFunciones.activarFK_IdComisionConfigComisionLinea);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaComisionLinea(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdComisionConfig")) {
			index= this.jTabbedPaneBusquedasComisionLinea.indexOfComponent(this.jPanelFK_IdComisionConfigComisionLinea);

			this.jTabbedPaneBusquedasComisionLinea.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasComisionLinea.getComponent(index);

			this.comisionlineaConstantesFunciones.setResaltarFK_IdComisionConfigComisionLinea(resaltar);

			jPanel.setBorder(this.comisionlineaConstantesFunciones.resaltarFK_IdComisionConfigComisionLinea);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarComisionLinea.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioComisionLinea() throws Exception {

		if(this.jInternalFrameDetalleFormComisionLinea==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioComisionLinea();
		this.updateVisibilidadResaltarControlesFormularioComisionLinea();
		this.updateHabilitarResaltarControlesFormularioComisionLinea();
		
	}
	
	public void updateBorderResaltarControlesFormularioComisionLinea() throws Exception {
		if(this.jInternalFrameDetalleFormComisionLinea==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.comisionlineaConstantesFunciones.resaltaridComisionLinea!=null && this.jInternalFrameDetalleFormComisionLinea!=null) {this.jInternalFrameDetalleFormComisionLinea.jLabelidComisionLinea.setBorder(this.comisionlineaConstantesFunciones.resaltaridComisionLinea);}
		if(this.comisionlineaConstantesFunciones.resaltarid_empresaComisionLinea!=null && this.jInternalFrameDetalleFormComisionLinea!=null) {this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_empresaComisionLinea.setBorder(this.comisionlineaConstantesFunciones.resaltarid_empresaComisionLinea);}
		if(this.comisionlineaConstantesFunciones.resaltarid_comision_configComisionLinea!=null && this.jInternalFrameDetalleFormComisionLinea!=null) {this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_comision_configComisionLinea.setBorder(this.comisionlineaConstantesFunciones.resaltarid_comision_configComisionLinea);}
		if(this.comisionlineaConstantesFunciones.resaltarid_vendedorComisionLinea!=null && this.jInternalFrameDetalleFormComisionLinea!=null) {this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_vendedorComisionLinea.setBorder(this.comisionlineaConstantesFunciones.resaltarid_vendedorComisionLinea);}
		if(this.comisionlineaConstantesFunciones.resaltarid_lineaComisionLinea!=null && this.jInternalFrameDetalleFormComisionLinea!=null) {this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_lineaComisionLinea.setBorder(this.comisionlineaConstantesFunciones.resaltarid_lineaComisionLinea);}
		if(this.comisionlineaConstantesFunciones.resaltarid_estado_comisionComisionLinea!=null && this.jInternalFrameDetalleFormComisionLinea!=null) {this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_estado_comisionComisionLinea.setBorder(this.comisionlineaConstantesFunciones.resaltarid_estado_comisionComisionLinea);}
		if(this.comisionlineaConstantesFunciones.resaltarporcentajeComisionLinea!=null && this.jInternalFrameDetalleFormComisionLinea!=null) {this.jInternalFrameDetalleFormComisionLinea.jTextFieldporcentajeComisionLinea.setBorder(this.comisionlineaConstantesFunciones.resaltarporcentajeComisionLinea);}
		if(this.comisionlineaConstantesFunciones.resaltardescripcionComisionLinea!=null && this.jInternalFrameDetalleFormComisionLinea!=null) {this.jInternalFrameDetalleFormComisionLinea.jTextAreadescripcionComisionLinea.setBorder(this.comisionlineaConstantesFunciones.resaltardescripcionComisionLinea);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioComisionLinea() throws Exception {		
		if(this.jInternalFrameDetalleFormComisionLinea==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormComisionLinea!=null) {
	
		//this.jInternalFrameDetalleFormComisionLinea.jLabelidComisionLinea.setVisible(this.comisionlineaConstantesFunciones.mostraridComisionLinea);
		this.jInternalFrameDetalleFormComisionLinea.jPanelidComisionLinea.setVisible(this.comisionlineaConstantesFunciones.mostraridComisionLinea);
		//this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_empresaComisionLinea.setVisible(this.comisionlineaConstantesFunciones.mostrarid_empresaComisionLinea);
		this.jInternalFrameDetalleFormComisionLinea.jPanelid_empresaComisionLinea.setVisible(this.comisionlineaConstantesFunciones.mostrarid_empresaComisionLinea);
		//this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_comision_configComisionLinea.setVisible(this.comisionlineaConstantesFunciones.mostrarid_comision_configComisionLinea);
		this.jInternalFrameDetalleFormComisionLinea.jPanelid_comision_configComisionLinea.setVisible(this.comisionlineaConstantesFunciones.mostrarid_comision_configComisionLinea);
		//this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_vendedorComisionLinea.setVisible(this.comisionlineaConstantesFunciones.mostrarid_vendedorComisionLinea);
		this.jInternalFrameDetalleFormComisionLinea.jPanelid_vendedorComisionLinea.setVisible(this.comisionlineaConstantesFunciones.mostrarid_vendedorComisionLinea);
			this.jInternalFrameDetalleFormComisionLinea.jButtonid_vendedorComisionLinea.setVisible(this.comisionlineaConstantesFunciones.mostrarid_vendedorComisionLinea);
		//this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_lineaComisionLinea.setVisible(this.comisionlineaConstantesFunciones.mostrarid_lineaComisionLinea);
		this.jInternalFrameDetalleFormComisionLinea.jPanelid_lineaComisionLinea.setVisible(this.comisionlineaConstantesFunciones.mostrarid_lineaComisionLinea);
		//this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_estado_comisionComisionLinea.setVisible(this.comisionlineaConstantesFunciones.mostrarid_estado_comisionComisionLinea);
		this.jInternalFrameDetalleFormComisionLinea.jPanelid_estado_comisionComisionLinea.setVisible(this.comisionlineaConstantesFunciones.mostrarid_estado_comisionComisionLinea);
		//this.jInternalFrameDetalleFormComisionLinea.jTextFieldporcentajeComisionLinea.setVisible(this.comisionlineaConstantesFunciones.mostrarporcentajeComisionLinea);
		this.jInternalFrameDetalleFormComisionLinea.jPanelporcentajeComisionLinea.setVisible(this.comisionlineaConstantesFunciones.mostrarporcentajeComisionLinea);
		//this.jInternalFrameDetalleFormComisionLinea.jTextAreadescripcionComisionLinea.setVisible(this.comisionlineaConstantesFunciones.mostrardescripcionComisionLinea);
		this.jInternalFrameDetalleFormComisionLinea.jPaneldescripcionComisionLinea.setVisible(this.comisionlineaConstantesFunciones.mostrardescripcionComisionLinea);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioComisionLinea() throws Exception {
		if(this.jInternalFrameDetalleFormComisionLinea==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormComisionLinea!=null) {
	
		this.jInternalFrameDetalleFormComisionLinea.jLabelidComisionLinea.setEnabled(this.comisionlineaConstantesFunciones.activaridComisionLinea);
		this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_empresaComisionLinea.setEnabled(this.comisionlineaConstantesFunciones.activarid_empresaComisionLinea);
		this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_comision_configComisionLinea.setEnabled(this.comisionlineaConstantesFunciones.activarid_comision_configComisionLinea);
		this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_vendedorComisionLinea.setEnabled(this.comisionlineaConstantesFunciones.activarid_vendedorComisionLinea);
			this.jInternalFrameDetalleFormComisionLinea.jButtonid_vendedorComisionLinea.setEnabled(this.comisionlineaConstantesFunciones.activarid_vendedorComisionLinea);
		this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_lineaComisionLinea.setEnabled(this.comisionlineaConstantesFunciones.activarid_lineaComisionLinea);
		this.jInternalFrameDetalleFormComisionLinea.jComboBoxid_estado_comisionComisionLinea.setEnabled(this.comisionlineaConstantesFunciones.activarid_estado_comisionComisionLinea);
		this.jInternalFrameDetalleFormComisionLinea.jTextFieldporcentajeComisionLinea.setEnabled(this.comisionlineaConstantesFunciones.activarporcentajeComisionLinea);
		this.jInternalFrameDetalleFormComisionLinea.jTextAreadescripcionComisionLinea.setEnabled(this.comisionlineaConstantesFunciones.activardescripcionComisionLinea);
		}
	}
	
		
}