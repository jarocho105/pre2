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

import com.bydan.erp.comisiones.util.ComisionMarcaConstantesFunciones;
import com.bydan.erp.comisiones.util.ComisionMarcaParameterReturnGeneral;
//import com.bydan.erp.comisiones.util.ComisionMarcaParameterGeneral;
//import com.bydan.erp.comisiones.presentation.report.source.ComisionMarcaBean;
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
public class ComisionMarcaBeanSwingJInternalFrame extends ComisionMarcaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ComisionMarcaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ComisionMarca> comisionmarcaValidator = new ClassValidator<ComisionMarca>(ComisionMarca.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ComisionMarca comisionmarca;	
	public ComisionMarca comisionmarcaAux;
	public ComisionMarca comisionmarcaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ComisionMarca comisionmarcaTotales;
	public Long idComisionMarcaActual;
	public Long iIdNuevoComisionMarca=0L;
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

	public String sFinalQueryComboLineaGrupo="";

	public List<Linea> lineagruposForeignKey;

	public List<Linea> getlineagruposForeignKey() {
		return lineagruposForeignKey;
	}

	public void setlineagruposForeignKey(List<Linea> lineagruposForeignKey) {
		this.lineagruposForeignKey = lineagruposForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineagrupoForeignKey;

	public Linea getlineagrupoForeignKey() {
		return lineagrupoForeignKey;
	}

	public void setlineagrupoForeignKey(Linea lineagrupoForeignKey) {
		this.lineagrupoForeignKey = lineagrupoForeignKey;
	}

	public String sFinalQueryComboLineaCategoria="";

	public List<Linea> lineacategoriasForeignKey;

	public List<Linea> getlineacategoriasForeignKey() {
		return lineacategoriasForeignKey;
	}

	public void setlineacategoriasForeignKey(List<Linea> lineacategoriasForeignKey) {
		this.lineacategoriasForeignKey = lineacategoriasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineacategoriaForeignKey;

	public Linea getlineacategoriaForeignKey() {
		return lineacategoriaForeignKey;
	}

	public void setlineacategoriaForeignKey(Linea lineacategoriaForeignKey) {
		this.lineacategoriaForeignKey = lineacategoriaForeignKey;
	}

	public String sFinalQueryComboLineaMarca="";

	public List<Linea> lineamarcasForeignKey;

	public List<Linea> getlineamarcasForeignKey() {
		return lineamarcasForeignKey;
	}

	public void setlineamarcasForeignKey(List<Linea> lineamarcasForeignKey) {
		this.lineamarcasForeignKey = lineamarcasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Linea lineamarcaForeignKey;

	public Linea getlineamarcaForeignKey() {
		return lineamarcaForeignKey;
	}

	public void setlineamarcaForeignKey(Linea lineamarcaForeignKey) {
		this.lineamarcaForeignKey = lineamarcaForeignKey;
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
	
	public Boolean isPermisoTodoComisionMarca;
	public Boolean isPermisoNuevoComisionMarca;
	public Boolean isPermisoActualizarComisionMarca;
	public Boolean isPermisoActualizarOriginalComisionMarca;
	public Boolean isPermisoEliminarComisionMarca;
	public Boolean isPermisoGuardarCambiosComisionMarca;
	public Boolean isPermisoConsultaComisionMarca;
	public Boolean isPermisoBusquedaComisionMarca;
	public Boolean isPermisoReporteComisionMarca;
	public Boolean isPermisoPaginacionMedioComisionMarca;
	public Boolean isPermisoPaginacionAltoComisionMarca;
	public Boolean isPermisoPaginacionTodoComisionMarca;
	public Boolean isPermisoCopiarComisionMarca;
	public Boolean isPermisoVerFormComisionMarca;
	public Boolean isPermisoDuplicarComisionMarca;
	public Boolean isPermisoOrdenComisionMarca;
	
	
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
	
	public ComisionMarcaParameterReturnGeneral comisionmarcaReturnGeneral;
	public ComisionMarcaParameterReturnGeneral comisionmarcaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoComisionMarca=false;
	public Boolean esParaAccionDesdeFormularioComisionMarca=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ComisionMarcaSessionBeanAdditional comisionmarcaSessionBeanAdditional=null;
	
	public ComisionMarcaSessionBeanAdditional getComisionMarcaSessionBeanAdditional() {
		return this.comisionmarcaSessionBeanAdditional;
	}
	
	public void setComisionMarcaSessionBeanAdditional(ComisionMarcaSessionBeanAdditional comisionmarcaSessionBeanAdditional) {
		try {
			this.comisionmarcaSessionBeanAdditional=comisionmarcaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ComisionMarcaBeanSwingJInternalFrameAdditional comisionmarcaBeanSwingJInternalFrameAdditional=null;
	//public class ComisionMarcaBeanSwingJInternalFrame
	
	public ComisionMarcaBeanSwingJInternalFrameAdditional getComisionMarcaBeanSwingJInternalFrameAdditional() {
		return this.comisionmarcaBeanSwingJInternalFrameAdditional;
	}
	
	public void setComisionMarcaBeanSwingJInternalFrameAdditional(ComisionMarcaBeanSwingJInternalFrameAdditional comisionmarcaBeanSwingJInternalFrameAdditional) {
		try {
			this.comisionmarcaBeanSwingJInternalFrameAdditional=comisionmarcaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ComisionMarcaLogic comisionmarcaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ComisionMarca comisionmarcaBean;
	public ComisionMarcaConstantesFunciones comisionmarcaConstantesFunciones;
	//public ComisionMarcaParameterReturnGeneral comisionmarcaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ComisionConfigLogic comisionconfigLogic;
	public VendedorLogic vendedorLogic;
	public LineaLogic lineaLogic;
	public LineaLogic lineagrupoLogic;
	public LineaLogic lineacategoriaLogic;
	public LineaLogic lineamarcaLogic;
	public EstadoComisionLogic estadocomisionLogic;
	
	//PARAMETROS
	
	
	//public List<ComisionMarca> comisionmarcas;	
	//public List<ComisionMarca> comisionmarcasEliminados;
	//public List<ComisionMarca> comisionmarcasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoComisionMarca=false;
	public Boolean isVisibilidadCeldaDuplicarComisionMarca=true;
	public Boolean isVisibilidadCeldaCopiarComisionMarca=true;
	public Boolean isVisibilidadCeldaVerFormComisionMarca=true;
	public Boolean isVisibilidadCeldaOrdenComisionMarca=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesComisionMarca=false;
	public Boolean isVisibilidadCeldaModificarComisionMarca=false;
	public Boolean isVisibilidadCeldaActualizarComisionMarca=false;
	public Boolean isVisibilidadCeldaEliminarComisionMarca=false;
	public Boolean isVisibilidadCeldaCancelarComisionMarca=false;
	public Boolean isVisibilidadCeldaGuardarComisionMarca=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosComisionMarca=false;	
	
	
	public Boolean isVisibilidadFK_IdComisionConfig=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstadoComision=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaCategoria=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdLineaMarca=false;
	public Boolean isVisibilidadFK_IdVendedor=false;
	
	public Long getiIdNuevoComisionMarca() {
		return this.iIdNuevoComisionMarca;
	}

	public void setiIdNuevoComisionMarca(Long iIdNuevoComisionMarca) {
		this.iIdNuevoComisionMarca = iIdNuevoComisionMarca;
	}
	
	public Long getidComisionMarcaActual() {
		return this.idComisionMarcaActual;
	}

	public void setidComisionMarcaActual(Long idComisionMarcaActual) {
		this.idComisionMarcaActual = idComisionMarcaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ComisionMarca getcomisionmarca() {
		return this.comisionmarca;
	}

	public void setcomisionmarca(ComisionMarca comisionmarca) {
		this.comisionmarca = comisionmarca;
	}
	
	public ComisionMarca getcomisionmarcaAux() {
		return this.comisionmarcaAux;
	}

	public void setcomisionmarcaAux(ComisionMarca comisionmarcaAux) {
		this.comisionmarcaAux = comisionmarcaAux;
	}				
	
	public ComisionMarca getcomisionmarcaAnterior() {
		return this.comisionmarcaAnterior;
	}

	public void setcomisionmarcaAnterior(ComisionMarca comisionmarcaAnterior) {
		this.comisionmarcaAnterior = comisionmarcaAnterior;
	}	
	
	public ComisionMarca getcomisionmarcaTotales() {
		return this.comisionmarcaTotales;
	}

	public void setcomisionmarcaTotales(ComisionMarca comisionmarcaTotales) {
		this.comisionmarcaTotales = comisionmarcaTotales;
	}	
	
	public ComisionMarca getcomisionmarcaBean() {
		return this.comisionmarcaBean;
	}

	public void setcomisionmarcaBean(ComisionMarca comisionmarcaBean) {
		this.comisionmarcaBean = comisionmarcaBean;
	}	
	
	public ComisionMarcaParameterReturnGeneral getcomisionmarcaReturnGeneral() {
		return this.comisionmarcaReturnGeneral;
	}

	public void setcomisionmarcaReturnGeneral(ComisionMarcaParameterReturnGeneral comisionmarcaReturnGeneral) {
		this.comisionmarcaReturnGeneral = comisionmarcaReturnGeneral;
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

	public Long id_linea_categoriaFK_IdLineaCategoria=-1L;

	public Long getid_linea_categoriaFK_IdLineaCategoria() {
		return this.id_linea_categoriaFK_IdLineaCategoria;
	}

	public void setid_linea_categoriaFK_IdLineaCategoria(Long id_linea_categoriaFK_IdLineaCategoria) {
		this.id_linea_categoriaFK_IdLineaCategoria = id_linea_categoriaFK_IdLineaCategoria;
	}

	public Long id_linea_grupoFK_IdLineaGrupo=-1L;

	public Long getid_linea_grupoFK_IdLineaGrupo() {
		return this.id_linea_grupoFK_IdLineaGrupo;
	}

	public void setid_linea_grupoFK_IdLineaGrupo(Long id_linea_grupoFK_IdLineaGrupo) {
		this.id_linea_grupoFK_IdLineaGrupo = id_linea_grupoFK_IdLineaGrupo;
	}

	public Long id_linea_marcaFK_IdLineaMarca=-1L;

	public Long getid_linea_marcaFK_IdLineaMarca() {
		return this.id_linea_marcaFK_IdLineaMarca;
	}

	public void setid_linea_marcaFK_IdLineaMarca(Long id_linea_marcaFK_IdLineaMarca) {
		this.id_linea_marcaFK_IdLineaMarca = id_linea_marcaFK_IdLineaMarca;
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
	
	
	public ComisionMarcaLogic getComisionMarcaLogic()	{		
		return comisionmarcaLogic;
	}

	public void setComisionMarcaLogic(ComisionMarcaLogic comisionmarcaLogic) {
		this.comisionmarcaLogic = comisionmarcaLogic;
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
	
	public Boolean getIsEsNuevoComisionMarca() {
		return isEsNuevoComisionMarca;
	}

	public void setIsEsNuevoComisionMarca(Boolean isEsNuevoComisionMarca) {
		this.isEsNuevoComisionMarca = isEsNuevoComisionMarca;
	}

	public Boolean getEsParaAccionDesdeFormularioComisionMarca() {
		return esParaAccionDesdeFormularioComisionMarca;
	}
	
	public void setEsParaAccionDesdeFormularioComisionMarca(Boolean esParaAccionDesdeFormularioComisionMarca) {
		this.esParaAccionDesdeFormularioComisionMarca = esParaAccionDesdeFormularioComisionMarca;
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

			if(this.comisionmarcaSessionBean==null) {
				this.comisionmarcaSessionBean=new ComisionMarcaSessionBean();
			}

			if(!this.comisionmarcaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(comisionmarcaSessionBean.getlidEmpresaActual());
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

			if(this.comisionmarcaSessionBean==null) {
				this.comisionmarcaSessionBean=new ComisionMarcaSessionBean();
			}

			if(!this.comisionmarcaSessionBean.getisBusquedaDesdeForeignKeySesionComisionConfig()) {
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
					comisionconfigLogic.getEntityWithConnection(comisionmarcaSessionBean.getlidComisionConfigActual());
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

			if(this.comisionmarcaSessionBean==null) {
				this.comisionmarcaSessionBean=new ComisionMarcaSessionBean();
			}

			if(!this.comisionmarcaSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
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
					vendedorLogic.getEntityWithConnection(comisionmarcaSessionBean.getlidVendedorActual());
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

			if(this.comisionmarcaSessionBean==null) {
				this.comisionmarcaSessionBean=new ComisionMarcaSessionBean();
			}

			if(!this.comisionmarcaSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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
					lineaLogic.getEntityWithConnection(comisionmarcaSessionBean.getlidLineaActual());
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

	public void cargarCombosLineaGruposForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineagruposForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.comisionmarcaSessionBean==null) {
				this.comisionmarcaSessionBean=new ComisionMarcaSessionBean();
			}

			if(!this.comisionmarcaSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineagrupoLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineagruposForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaGrupo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(comisionmarcaSessionBean.getlidLineaGrupoActual());
					this.lineagruposForeignKey.add(lineaLogic.getLinea());
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

	public void cargarCombosLineaCategoriasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineacategoriasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.comisionmarcaSessionBean==null) {
				this.comisionmarcaSessionBean=new ComisionMarcaSessionBean();
			}

			if(!this.comisionmarcaSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineacategoriaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineacategoriasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaCategoria(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(comisionmarcaSessionBean.getlidLineaCategoriaActual());
					this.lineacategoriasForeignKey.add(lineaLogic.getLinea());
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

	public void cargarCombosLineaMarcasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.lineamarcasForeignKey=new ArrayList<Linea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			LineaLogic lineaLogic=new LineaLogic();

			//lineaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

			if(this.comisionmarcaSessionBean==null) {
				this.comisionmarcaSessionBean=new ComisionMarcaSessionBean();
			}

			if(!this.comisionmarcaSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//lineamarcaLogic.getLineaDataAccess().setIsForForeingKeyData(true);

					lineaLogic.getTodosLineasWithConnection(sFinalQuery,new Pagination());

					this.lineamarcasForeignKey=lineaLogic.getLineas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaLineaMarca(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaLogic.getEntityWithConnection(comisionmarcaSessionBean.getlidLineaMarcaActual());
					this.lineamarcasForeignKey.add(lineaLogic.getLinea());
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

			if(this.comisionmarcaSessionBean==null) {
				this.comisionmarcaSessionBean=new ComisionMarcaSessionBean();
			}

			if(!this.comisionmarcaSessionBean.getisBusquedaDesdeForeignKeySesionEstadoComision()) {
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
					estadocomisionLogic.getEntityWithConnection(comisionmarcaSessionBean.getlidEstadoComisionActual());
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

					if(this.comisionmarca!=null) {
						this.comisionmarca.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormComisionMarca!=null) {
						this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_empresaComisionMarca.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaComisionMarca.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormComisionMarca!=null) {
						if(this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_empresaComisionMarca.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_empresaComisionMarca.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaComisionMarcaGenerico)throws Exception
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
				jComboBoxid_empresaComisionMarcaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaComisionMarcaGenerico!=null && jComboBoxid_empresaComisionMarcaGenerico.getItemCount()>0) {
					jComboBoxid_empresaComisionMarcaGenerico.setSelectedIndex(0);
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

					if(this.comisionmarca!=null) {
						this.comisionmarca.setComisionConfig(comisionconfigTemp);
					}

					if(this.jInternalFrameDetalleFormComisionMarca!=null) {
						this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_comision_configComisionMarca.setSelectedItem(comisionconfigTemp);
					}
				} else {
					//jComboBoxid_comision_configComisionMarca.setSelectedItem(comisionconfigTemp);
					if(this.jInternalFrameDetalleFormComisionMarca!=null) {
						if(this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_comision_configComisionMarca.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_comision_configComisionMarca.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdComisionConfig") || sFormularioTipoBusqueda.equals("Todos")){
					if(comisionconfigTemp!=null && jComboBoxid_comision_configFK_IdComisionConfigComisionMarca!=null) {
						jComboBoxid_comision_configFK_IdComisionConfigComisionMarca.setSelectedItem(comisionconfigTemp);
					} else {
						if(jComboBoxid_comision_configFK_IdComisionConfigComisionMarca!=null) {
							//jComboBoxid_comision_configFK_IdComisionConfigComisionMarca.setSelectedItem(comisionconfigTemp);
							if(jComboBoxid_comision_configFK_IdComisionConfigComisionMarca.getItemCount()>0) {
								jComboBoxid_comision_configFK_IdComisionConfigComisionMarca.setSelectedIndex(0);
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
	public void setActualComisionConfigForeignKeyGenerico(Long idComisionConfigSeleccionado,JComboBox jComboBoxid_comision_configComisionMarcaGenerico)throws Exception
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
				jComboBoxid_comision_configComisionMarcaGenerico.setSelectedItem(comisionconfigTemp);
			} else {
				if(jComboBoxid_comision_configComisionMarcaGenerico!=null && jComboBoxid_comision_configComisionMarcaGenerico.getItemCount()>0) {
					jComboBoxid_comision_configComisionMarcaGenerico.setSelectedIndex(0);
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

					if(this.comisionmarca!=null) {
						this.comisionmarca.setVendedor(vendedorTemp);
					}

					if(this.jInternalFrameDetalleFormComisionMarca!=null) {
						this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_vendedorComisionMarca.setSelectedItem(vendedorTemp);
					}
				} else {
					//jComboBoxid_vendedorComisionMarca.setSelectedItem(vendedorTemp);
					if(this.jInternalFrameDetalleFormComisionMarca!=null) {
						if(this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_vendedorComisionMarca.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_vendedorComisionMarca.setSelectedIndex(0);
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
	public void setActualVendedorForeignKeyGenerico(Long idVendedorSeleccionado,JComboBox jComboBoxid_vendedorComisionMarcaGenerico)throws Exception
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
				jComboBoxid_vendedorComisionMarcaGenerico.setSelectedItem(vendedorTemp);
			} else {
				if(jComboBoxid_vendedorComisionMarcaGenerico!=null && jComboBoxid_vendedorComisionMarcaGenerico.getItemCount()>0) {
					jComboBoxid_vendedorComisionMarcaGenerico.setSelectedIndex(0);
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

					if(this.comisionmarca!=null) {
						this.comisionmarca.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormComisionMarca!=null) {
						this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_lineaComisionMarca.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaComisionMarca.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormComisionMarca!=null) {
						if(this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_lineaComisionMarca.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_lineaComisionMarca.setSelectedIndex(0);
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
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaComisionMarcaGenerico)throws Exception
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
				jComboBoxid_lineaComisionMarcaGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaComisionMarcaGenerico!=null && jComboBoxid_lineaComisionMarcaGenerico.getItemCount()>0) {
					jComboBoxid_lineaComisionMarcaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaGrupoForeignKey(Long idLineaGrupoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineagrupoTemp!=null) {

					if(this.comisionmarca!=null) {
						this.comisionmarca.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormComisionMarca!=null) {
						this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_grupoComisionMarca.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoComisionMarca.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormComisionMarca!=null) {
						if(this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_grupoComisionMarca.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_grupoComisionMarca.setSelectedIndex(0);
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

	public String getActualLineaGrupoForeignKeyDescripcion(Long idLineaGrupoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineagrupoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoComisionMarcaGenerico)throws Exception
	{
		try
		{
			Linea  lineagrupoTemp=null;

			for(Linea lineagrupoAux:lineagruposForeignKey) {
				if(lineagrupoAux.getId()!=null && lineagrupoAux.getId().equals(idLineaGrupoSeleccionado)) {
					lineagrupoTemp=lineagrupoAux;
					break;
				}
			}

			if(lineagrupoTemp!=null) {
				jComboBoxid_linea_grupoComisionMarcaGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoComisionMarcaGenerico!=null && jComboBoxid_linea_grupoComisionMarcaGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoComisionMarcaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaCategoriaForeignKey(Long idLineaCategoriaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineacategoriaTemp!=null) {

					if(this.comisionmarca!=null) {
						this.comisionmarca.setLineaCategoria(lineacategoriaTemp);
					}

					if(this.jInternalFrameDetalleFormComisionMarca!=null) {
						this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_categoriaComisionMarca.setSelectedItem(lineacategoriaTemp);
					}
				} else {
					//jComboBoxid_linea_categoriaComisionMarca.setSelectedItem(lineacategoriaTemp);
					if(this.jInternalFrameDetalleFormComisionMarca!=null) {
						if(this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_categoriaComisionMarca.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_categoriaComisionMarca.setSelectedIndex(0);
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

	public String getActualLineaCategoriaForeignKeyDescripcion(Long idLineaCategoriaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineacategoriaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaCategoriaForeignKeyGenerico(Long idLineaCategoriaSeleccionado,JComboBox jComboBoxid_linea_categoriaComisionMarcaGenerico)throws Exception
	{
		try
		{
			Linea  lineacategoriaTemp=null;

			for(Linea lineacategoriaAux:lineacategoriasForeignKey) {
				if(lineacategoriaAux.getId()!=null && lineacategoriaAux.getId().equals(idLineaCategoriaSeleccionado)) {
					lineacategoriaTemp=lineacategoriaAux;
					break;
				}
			}

			if(lineacategoriaTemp!=null) {
				jComboBoxid_linea_categoriaComisionMarcaGenerico.setSelectedItem(lineacategoriaTemp);
			} else {
				if(jComboBoxid_linea_categoriaComisionMarcaGenerico!=null && jComboBoxid_linea_categoriaComisionMarcaGenerico.getItemCount()>0) {
					jComboBoxid_linea_categoriaComisionMarcaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualLineaMarcaForeignKey(Long idLineaMarcaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(lineamarcaTemp!=null) {

					if(this.comisionmarca!=null) {
						this.comisionmarca.setLineaMarca(lineamarcaTemp);
					}

					if(this.jInternalFrameDetalleFormComisionMarca!=null) {
						this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_marcaComisionMarca.setSelectedItem(lineamarcaTemp);
					}
				} else {
					//jComboBoxid_linea_marcaComisionMarca.setSelectedItem(lineamarcaTemp);
					if(this.jInternalFrameDetalleFormComisionMarca!=null) {
						if(this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_marcaComisionMarca.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_marcaComisionMarca.setSelectedIndex(0);
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

	public String getActualLineaMarcaForeignKeyDescripcion(Long idLineaMarcaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}


			sDescripcion=LineaConstantesFunciones.getLineaDescripcion(lineamarcaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualLineaMarcaForeignKeyGenerico(Long idLineaMarcaSeleccionado,JComboBox jComboBoxid_linea_marcaComisionMarcaGenerico)throws Exception
	{
		try
		{
			Linea  lineamarcaTemp=null;

			for(Linea lineamarcaAux:lineamarcasForeignKey) {
				if(lineamarcaAux.getId()!=null && lineamarcaAux.getId().equals(idLineaMarcaSeleccionado)) {
					lineamarcaTemp=lineamarcaAux;
					break;
				}
			}

			if(lineamarcaTemp!=null) {
				jComboBoxid_linea_marcaComisionMarcaGenerico.setSelectedItem(lineamarcaTemp);
			} else {
				if(jComboBoxid_linea_marcaComisionMarcaGenerico!=null && jComboBoxid_linea_marcaComisionMarcaGenerico.getItemCount()>0) {
					jComboBoxid_linea_marcaComisionMarcaGenerico.setSelectedIndex(0);
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

					if(this.comisionmarca!=null) {
						this.comisionmarca.setEstadoComision(estadocomisionTemp);
					}

					if(this.jInternalFrameDetalleFormComisionMarca!=null) {
						this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_estado_comisionComisionMarca.setSelectedItem(estadocomisionTemp);
					}
				} else {
					//jComboBoxid_estado_comisionComisionMarca.setSelectedItem(estadocomisionTemp);
					if(this.jInternalFrameDetalleFormComisionMarca!=null) {
						if(this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_estado_comisionComisionMarca.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_estado_comisionComisionMarca.setSelectedIndex(0);
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
	public void setActualEstadoComisionForeignKeyGenerico(Long idEstadoComisionSeleccionado,JComboBox jComboBoxid_estado_comisionComisionMarcaGenerico)throws Exception
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
				jComboBoxid_estado_comisionComisionMarcaGenerico.setSelectedItem(estadocomisionTemp);
			} else {
				if(jComboBoxid_estado_comisionComisionMarcaGenerico!=null && jComboBoxid_estado_comisionComisionMarcaGenerico.getItemCount()>0) {
					jComboBoxid_estado_comisionComisionMarcaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ComisionMarca comisionmarca,JComboBox jComboBoxid_empresaComisionMarcaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaComisionMarcaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_empresaComisionMarca.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaComisionMarcaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				comisionmarca.setid_empresa(empresaAux.getId());
				comisionmarca.setempresa_descripcion(ComisionMarcaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				comisionmarca.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarComisionConfigForeignKey(ComisionMarca comisionmarca,JComboBox jComboBoxid_comision_configComisionMarcaGenerico)throws Exception
	{
		try
		{
			ComisionConfig  comisionconfigAux=new ComisionConfig();

			if(jComboBoxid_comision_configComisionMarcaGenerico==null) {
				comisionconfigAux=(ComisionConfig)this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_comision_configComisionMarca.getSelectedItem();
			} else {
				comisionconfigAux=(ComisionConfig)jComboBoxid_comision_configComisionMarcaGenerico.getSelectedItem();
			}

			if(comisionconfigAux!=null && comisionconfigAux.getId()!=null) {
				comisionmarca.setid_comision_config(comisionconfigAux.getId());
				comisionmarca.setcomisionconfig_descripcion(ComisionMarcaConstantesFunciones.getComisionConfigDescripcion(comisionconfigAux));
				comisionmarca.setComisionConfig(comisionconfigAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarVendedorForeignKey(ComisionMarca comisionmarca,JComboBox jComboBoxid_vendedorComisionMarcaGenerico)throws Exception
	{
		try
		{
			Vendedor  vendedorAux=new Vendedor();

			if(jComboBoxid_vendedorComisionMarcaGenerico==null) {
				vendedorAux=(Vendedor)this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_vendedorComisionMarca.getSelectedItem();
			} else {
				vendedorAux=(Vendedor)jComboBoxid_vendedorComisionMarcaGenerico.getSelectedItem();
			}

			if(vendedorAux!=null && vendedorAux.getId()!=null) {
				comisionmarca.setid_vendedor(vendedorAux.getId());
				comisionmarca.setvendedor_descripcion(ComisionMarcaConstantesFunciones.getVendedorDescripcion(vendedorAux));
				comisionmarca.setVendedor(vendedorAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(ComisionMarca comisionmarca,JComboBox jComboBoxid_lineaComisionMarcaGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaComisionMarcaGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_lineaComisionMarca.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaComisionMarcaGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				comisionmarca.setid_linea(lineaAux.getId());
				comisionmarca.setlinea_descripcion(ComisionMarcaConstantesFunciones.getLineaDescripcion(lineaAux));
				comisionmarca.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(ComisionMarca comisionmarca,JComboBox jComboBoxid_linea_grupoComisionMarcaGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoComisionMarcaGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_grupoComisionMarca.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoComisionMarcaGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				comisionmarca.setid_linea_grupo(lineaAux.getId());
				comisionmarca.setlineagrupo_descripcion(ComisionMarcaConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				comisionmarca.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaCategoriaForeignKey(ComisionMarca comisionmarca,JComboBox jComboBoxid_linea_categoriaComisionMarcaGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_categoriaComisionMarcaGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_categoriaComisionMarca.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_categoriaComisionMarcaGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				comisionmarca.setid_linea_categoria(lineaAux.getId());
				comisionmarca.setlineacategoria_descripcion(ComisionMarcaConstantesFunciones.getLineaCategoriaDescripcion(lineaAux));
				comisionmarca.setLineaCategoria(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaMarcaForeignKey(ComisionMarca comisionmarca,JComboBox jComboBoxid_linea_marcaComisionMarcaGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_marcaComisionMarcaGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_marcaComisionMarca.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_marcaComisionMarcaGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				comisionmarca.setid_linea_marca(lineaAux.getId());
				comisionmarca.setlineamarca_descripcion(ComisionMarcaConstantesFunciones.getLineaMarcaDescripcion(lineaAux));
				comisionmarca.setLineaMarca(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstadoComisionForeignKey(ComisionMarca comisionmarca,JComboBox jComboBoxid_estado_comisionComisionMarcaGenerico)throws Exception
	{
		try
		{
			EstadoComision  estadocomisionAux=new EstadoComision();

			if(jComboBoxid_estado_comisionComisionMarcaGenerico==null) {
				estadocomisionAux=(EstadoComision)this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_estado_comisionComisionMarca.getSelectedItem();
			} else {
				estadocomisionAux=(EstadoComision)jComboBoxid_estado_comisionComisionMarcaGenerico.getSelectedItem();
			}

			if(estadocomisionAux!=null && estadocomisionAux.getId()!=null) {
				comisionmarca.setid_estado_comision(estadocomisionAux.getId());
				comisionmarca.setestadocomision_descripcion(ComisionMarcaConstantesFunciones.getEstadoComisionDescripcion(estadocomisionAux));
				comisionmarca.setEstadoComision(estadocomisionAux);			}
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

					if(!ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionMarca!=null) { 
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_empresaComisionMarca.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_empresaComisionMarca.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionMarca!=null) { 
					}

					if(!ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionMarca!=null) { 
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_comision_configComisionMarca.removeAllItems();

							for(ComisionConfig comisionconfig:this.comisionconfigsForeignKey) {
								this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_comision_configComisionMarca.addItem(comisionconfig);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionMarca!=null) { 
					}

					if(!ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdComisionConfig") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_comision_configFK_IdComisionConfigComisionMarca.removeAllItems();

							for(ComisionConfig comisionconfig:this.comisionconfigsForeignKey) {
								this.jComboBoxid_comision_configFK_IdComisionConfigComisionMarca.addItem(comisionconfig);
							}
						}

						if(!ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionMarca!=null) { 
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_vendedorComisionMarca.removeAllItems();

							for(Vendedor vendedor:this.vendedorsForeignKey) {
								this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_vendedorComisionMarca.addItem(vendedor);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionMarca!=null) { 
					}

					if(!ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionMarca!=null) { 
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_lineaComisionMarca.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_lineaComisionMarca.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionMarca!=null) { 
					}

					if(!ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaGruposForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionMarca!=null) { 
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_grupoComisionMarca.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_grupoComisionMarca.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionMarca!=null) { 
					}

					if(!ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaCategoriasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionMarca!=null) { 
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_categoriaComisionMarca.removeAllItems();

							for(Linea lineacategoria:this.lineacategoriasForeignKey) {
								this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_categoriaComisionMarca.addItem(lineacategoria);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionMarca!=null) { 
					}

					if(!ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameLineaMarcasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingLinea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionMarca!=null) { 
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_marcaComisionMarca.removeAllItems();

							for(Linea lineamarca:this.lineamarcasForeignKey) {
								this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_marcaComisionMarca.addItem(lineamarca);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionMarca!=null) { 
					}

					if(!ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionMarca!=null) { 
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_estado_comisionComisionMarca.removeAllItems();

							for(EstadoComision estadocomision:this.estadocomisionsForeignKey) {
								this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_estado_comisionComisionMarca.addItem(estadocomision);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionMarca!=null) { 
					}

					if(!ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormComisionMarca!=null) {
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_empresaComisionMarca.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionMarca!=null) {
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_empresaComisionMarca.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormComisionMarca!=null) {
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_comision_configComisionMarca.setSelectedItem(comisionconfig);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionMarca!=null) {
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_comision_configComisionMarca.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_comision_configFK_IdComisionConfigComisionMarca.setSelectedItem(comisionconfig);
						} else {
							this.jComboBoxid_comision_configFK_IdComisionConfigComisionMarca.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormComisionMarca!=null) {
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_vendedorComisionMarca.setSelectedItem(vendedor);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionMarca!=null) {
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_vendedorComisionMarca.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormComisionMarca!=null) {
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_lineaComisionMarca.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionMarca!=null) {
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_lineaComisionMarca.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameLineaGrupoForeignKey(Linea lineagrupo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormComisionMarca!=null) {
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_grupoComisionMarca.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionMarca!=null) {
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_grupoComisionMarca.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameLineaCategoriaForeignKey(Linea lineacategoria,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormComisionMarca!=null) {
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_categoriaComisionMarca.setSelectedItem(lineacategoria);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionMarca!=null) {
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_categoriaComisionMarca.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameLineaMarcaForeignKey(Linea lineamarca,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormComisionMarca!=null) {
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_marcaComisionMarca.setSelectedItem(lineamarca);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionMarca!=null) {
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_marcaComisionMarca.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormComisionMarca!=null) {
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_estado_comisionComisionMarca.setSelectedItem(estadocomision);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionMarca!=null) {
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_estado_comisionComisionMarca.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesComisionMarca() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ComisionMarcaConstantesFunciones.refrescarForeignKeysDescripcionesComisionMarca(this.comisionmarcaLogic.getComisionMarcas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ComisionMarcaConstantesFunciones.refrescarForeignKeysDescripcionesComisionMarca(this.comisionmarcas);
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
			//comisionmarcaLogic.setComisionMarcas(this.comisionmarcas);
			comisionmarcaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ComisionMarcaParameterReturnGeneral getComisionMarcaParameterGeneral() {
		return this.comisionmarcaParameterGeneral;
	}
	
	public void setComisionMarcaParameterGeneral(ComisionMarcaParameterReturnGeneral comisionmarcaParameterGeneral) {
		this.comisionmarcaParameterGeneral = comisionmarcaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoComisionMarca() {
		return isPermisoTodoComisionMarca;
	}

	public void setIsPermisoTodoComisionMarca(Boolean isPermisoTodoComisionMarca) {
		this.isPermisoTodoComisionMarca = isPermisoTodoComisionMarca;
	}

	public Boolean getIsPermisoNuevoComisionMarca() {
		return isPermisoNuevoComisionMarca;
	}

	public void setIsPermisoNuevoComisionMarca(Boolean isPermisoNuevoComisionMarca) {
		this.isPermisoNuevoComisionMarca = isPermisoNuevoComisionMarca;
	}

	public Boolean getIsPermisoActualizarComisionMarca() {
		return isPermisoActualizarComisionMarca;
	}

	public void setIsPermisoActualizarComisionMarca(Boolean isPermisoActualizarComisionMarca) {
		this.isPermisoActualizarComisionMarca = isPermisoActualizarComisionMarca;
	}

	public Boolean getIsPermisoEliminarComisionMarca() {
		return isPermisoEliminarComisionMarca;
	}

	public void setIsPermisoEliminarComisionMarca(Boolean isPermisoEliminarComisionMarca) {
		this.isPermisoEliminarComisionMarca = isPermisoEliminarComisionMarca;
	}

	public Boolean getIsPermisoGuardarCambiosComisionMarca() {
		return isPermisoGuardarCambiosComisionMarca;
	}

	public void setIsPermisoGuardarCambiosComisionMarca(Boolean isPermisoGuardarCambiosComisionMarca) {
		this.isPermisoGuardarCambiosComisionMarca = isPermisoGuardarCambiosComisionMarca;
	}
	
	public Boolean getIsPermisoConsultaComisionMarca() {
		return isPermisoConsultaComisionMarca;
	}

	public void setIsPermisoConsultaComisionMarca(Boolean isPermisoConsultaComisionMarca) {
		this.isPermisoConsultaComisionMarca = isPermisoConsultaComisionMarca;
	}

	public Boolean getIsPermisoBusquedaComisionMarca() {
		return isPermisoBusquedaComisionMarca;
	}

	public void setIsPermisoBusquedaComisionMarca(Boolean isPermisoBusquedaComisionMarca) {
		this.isPermisoBusquedaComisionMarca = isPermisoBusquedaComisionMarca;
	}

	public Boolean getIsPermisoReporteComisionMarca() {
		return isPermisoReporteComisionMarca;
	}

	public void setIsPermisoReporteComisionMarca(Boolean isPermisoReporteComisionMarca) {
		this.isPermisoReporteComisionMarca = isPermisoReporteComisionMarca;
	}
	
	public Boolean getIsPermisoPaginacionMedioComisionMarca() {
		return isPermisoPaginacionMedioComisionMarca;
	}

	public void setIsPermisoPaginacionMedioComisionMarca(Boolean isPermisoPaginacionMedioComisionMarca) {
		this.isPermisoPaginacionMedioComisionMarca = isPermisoPaginacionMedioComisionMarca;
	}
	
	public Boolean getIsPermisoPaginacionTodoComisionMarca() {
		return isPermisoPaginacionTodoComisionMarca;
	}

	public void setIsPermisoPaginacionTodoComisionMarca(Boolean isPermisoPaginacionTodoComisionMarca) {
		this.isPermisoPaginacionTodoComisionMarca = isPermisoPaginacionTodoComisionMarca;
	}
	
	public Boolean getIsPermisoPaginacionAltoComisionMarca() {
		return isPermisoPaginacionAltoComisionMarca;
	}

	public void setIsPermisoPaginacionAltoComisionMarca(Boolean isPermisoPaginacionAltoComisionMarca) {
		this.isPermisoPaginacionAltoComisionMarca = isPermisoPaginacionAltoComisionMarca;
	}
	
	public Boolean getIsPermisoCopiarComisionMarca() {
		return isPermisoCopiarComisionMarca;
	}

	public void setIsPermisoCopiarComisionMarca(Boolean isPermisoCopiarComisionMarca) {
		this.isPermisoCopiarComisionMarca = isPermisoCopiarComisionMarca;
	}
	
	public Boolean getIsPermisoVerFormComisionMarca() {
		return isPermisoVerFormComisionMarca;
	}

	public void setIsPermisoVerFormComisionMarca(Boolean isPermisoVerFormComisionMarca) {
		this.isPermisoVerFormComisionMarca = isPermisoVerFormComisionMarca;
	}
	
	public Boolean getIsPermisoDuplicarComisionMarca() {
		return isPermisoDuplicarComisionMarca;
	}

	public void setIsPermisoDuplicarComisionMarca(Boolean isPermisoDuplicarComisionMarca) {
		this.isPermisoDuplicarComisionMarca = isPermisoDuplicarComisionMarca;
	}
	
	public Boolean getIsPermisoOrdenComisionMarca() {
		return isPermisoOrdenComisionMarca;
	}

	public void setIsPermisoOrdenComisionMarca(Boolean isPermisoOrdenComisionMarca) {
		this.isPermisoOrdenComisionMarca = isPermisoOrdenComisionMarca;
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
	
	public Boolean getIsVisibilidadCeldaNuevoComisionMarca() {
		return isVisibilidadCeldaNuevoComisionMarca;
	}

	public void setIsVisibilidadCeldaNuevoComisionMarca(Boolean isVisibilidadCeldaNuevoComisionMarca) {
		this.isVisibilidadCeldaNuevoComisionMarca = isVisibilidadCeldaNuevoComisionMarca;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarComisionMarca() {
		return isVisibilidadCeldaDuplicarComisionMarca;
	}

	public void setIsVisibilidadCeldaDuplicarComisionMarca(Boolean isVisibilidadCeldaDuplicarComisionMarca) {
		this.isVisibilidadCeldaDuplicarComisionMarca = isVisibilidadCeldaDuplicarComisionMarca;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarComisionMarca() {
		return isVisibilidadCeldaCopiarComisionMarca;
	}

	public void setIsVisibilidadCeldaCopiarComisionMarca(Boolean isVisibilidadCeldaCopiarComisionMarca) {
		this.isVisibilidadCeldaCopiarComisionMarca = isVisibilidadCeldaCopiarComisionMarca;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormComisionMarca() {
		return isVisibilidadCeldaVerFormComisionMarca;
	}

	public void setIsVisibilidadCeldaVerFormComisionMarca(Boolean isVisibilidadCeldaVerFormComisionMarca) {
		this.isVisibilidadCeldaVerFormComisionMarca = isVisibilidadCeldaVerFormComisionMarca;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenComisionMarca() {
		return isVisibilidadCeldaOrdenComisionMarca;
	}

	public void setIsVisibilidadCeldaOrdenComisionMarca(Boolean isVisibilidadCeldaOrdenComisionMarca) {
		this.isVisibilidadCeldaOrdenComisionMarca = isVisibilidadCeldaOrdenComisionMarca;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesComisionMarca() {
		return isVisibilidadCeldaNuevoRelacionesComisionMarca;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesComisionMarca(Boolean isVisibilidadCeldaNuevoRelacionesComisionMarca) {
		this.isVisibilidadCeldaNuevoRelacionesComisionMarca = isVisibilidadCeldaNuevoRelacionesComisionMarca;
	}
	
	public Boolean getIsVisibilidadCeldaModificarComisionMarca() {
		return isVisibilidadCeldaModificarComisionMarca;
	}

	public void setIsVisibilidadCeldaModificarComisionMarca(Boolean isVisibilidadCeldaModificarComisionMarca) {
		this.isVisibilidadCeldaModificarComisionMarca = isVisibilidadCeldaModificarComisionMarca;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarComisionMarca() {
		return isVisibilidadCeldaActualizarComisionMarca;
	}

	public void setIsVisibilidadCeldaActualizarComisionMarca(Boolean isVisibilidadCeldaActualizarComisionMarca) {
		this.isVisibilidadCeldaActualizarComisionMarca = isVisibilidadCeldaActualizarComisionMarca;
	}

	public Boolean getIsVisibilidadCeldaEliminarComisionMarca() {
		return isVisibilidadCeldaEliminarComisionMarca;
	}

	public void setIsVisibilidadCeldaEliminarComisionMarca(Boolean isVisibilidadCeldaEliminarComisionMarca) {
		this.isVisibilidadCeldaEliminarComisionMarca = isVisibilidadCeldaEliminarComisionMarca;
	}

	public Boolean getIsVisibilidadCeldaCancelarComisionMarca() {
		return isVisibilidadCeldaCancelarComisionMarca;
	}

	public void setIsVisibilidadCeldaCancelarComisionMarca(Boolean isVisibilidadCeldaCancelarComisionMarca) {
		this.isVisibilidadCeldaCancelarComisionMarca = isVisibilidadCeldaCancelarComisionMarca;
	}

	public Boolean getIsVisibilidadCeldaGuardarComisionMarca() {
		return isVisibilidadCeldaGuardarComisionMarca;
	}

	public void setIsVisibilidadCeldaGuardarComisionMarca(Boolean isVisibilidadCeldaGuardarComisionMarca) {
		this.isVisibilidadCeldaGuardarComisionMarca = isVisibilidadCeldaGuardarComisionMarca;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosComisionMarca() {
		return isVisibilidadCeldaGuardarCambiosComisionMarca;
	}

	public void setIsVisibilidadCeldaGuardarCambiosComisionMarca(Boolean isVisibilidadCeldaGuardarCambiosComisionMarca) {
		this.isVisibilidadCeldaGuardarCambiosComisionMarca = isVisibilidadCeldaGuardarCambiosComisionMarca;
	}
		
	public ComisionMarcaSessionBean getcomisionmarcaSessionBean() {
		return this.comisionmarcaSessionBean;
	}
	
	public void setcomisionmarcaSessionBean(ComisionMarcaSessionBean comisionmarcaSessionBean) {
		this.comisionmarcaSessionBean=comisionmarcaSessionBean;
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

	public Boolean getisVisibilidadFK_IdLineaCategoria() {
		return this.isVisibilidadFK_IdLineaCategoria;
	}

	public void setisVisibilidadFK_IdLineaCategoria(Boolean isVisibilidadFK_IdLineaCategoria) {
		this.isVisibilidadFK_IdLineaCategoria=isVisibilidadFK_IdLineaCategoria;
	}

	public Boolean getisVisibilidadFK_IdLineaGrupo() {
		return this.isVisibilidadFK_IdLineaGrupo;
	}

	public void setisVisibilidadFK_IdLineaGrupo(Boolean isVisibilidadFK_IdLineaGrupo) {
		this.isVisibilidadFK_IdLineaGrupo=isVisibilidadFK_IdLineaGrupo;
	}

	public Boolean getisVisibilidadFK_IdLineaMarca() {
		return this.isVisibilidadFK_IdLineaMarca;
	}

	public void setisVisibilidadFK_IdLineaMarca(Boolean isVisibilidadFK_IdLineaMarca) {
		this.isVisibilidadFK_IdLineaMarca=isVisibilidadFK_IdLineaMarca;
	}

	public Boolean getisVisibilidadFK_IdVendedor() {
		return this.isVisibilidadFK_IdVendedor;
	}

	public void setisVisibilidadFK_IdVendedor(Boolean isVisibilidadFK_IdVendedor) {
		this.isVisibilidadFK_IdVendedor=isVisibilidadFK_IdVendedor;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysComisionMarca(ComisionMarca comisionmarca)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(comisionmarca,null);
				this.setActualParaGuardarComisionConfigForeignKey(comisionmarca,null);
				this.setActualParaGuardarVendedorForeignKey(comisionmarca,null);
				this.setActualParaGuardarLineaForeignKey(comisionmarca,null);
				this.setActualParaGuardarLineaGrupoForeignKey(comisionmarca,null);
				this.setActualParaGuardarLineaCategoriaForeignKey(comisionmarca,null);
				this.setActualParaGuardarLineaMarcaForeignKey(comisionmarca,null);
				this.setActualParaGuardarEstadoComisionForeignKey(comisionmarca,null);
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
	
	public void bugActualizarReferenciaActual(ComisionMarca comisionmarca,ComisionMarca comisionmarcaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalComisionMarca(comisionmarca);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		comisionmarcaAux.setId(comisionmarca.getId());
		comisionmarcaAux.setVersionRow(comisionmarca.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessComisionMarca();
		
			int intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarca =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.comisionmarca =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ComisionMarcaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualComisionMarca(this.comisionmarca,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = comisionmarcaValidator.getInvalidValues(this.comisionmarca);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			comisionmarcaLogic.setDatosCliente(datosCliente);
			comisionmarcaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				comisionmarcaAux=new  ComisionMarca();
				
				comisionmarcaAux.setIsNew(true);
				comisionmarcaAux.setIsChanged(true);
				
				comisionmarcaAux.setComisionMarcaOriginal(this.comisionmarca);
				
				comisionmarcaAux.setId(this.comisionmarca.getId());	
				comisionmarcaAux.setVersionRow(this.comisionmarca.getVersionRow());	
				comisionmarcaAux.setid_empresa(this.comisionmarca.getid_empresa());	
				comisionmarcaAux.setid_comision_config(this.comisionmarca.getid_comision_config());	
				comisionmarcaAux.setid_vendedor(this.comisionmarca.getid_vendedor());	
				comisionmarcaAux.setid_linea(this.comisionmarca.getid_linea());	
				comisionmarcaAux.setid_linea_grupo(this.comisionmarca.getid_linea_grupo());	
				comisionmarcaAux.setid_linea_categoria(this.comisionmarca.getid_linea_categoria());	
				comisionmarcaAux.setid_linea_marca(this.comisionmarca.getid_linea_marca());	
				comisionmarcaAux.setid_estado_comision(this.comisionmarca.getid_estado_comision());	
				comisionmarcaAux.setporcentaje(this.comisionmarca.getporcentaje());	
				comisionmarcaAux.setdescripcion(this.comisionmarca.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.comisionmarcaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.comisionmarcaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(comisionmarcaAux,comisionmarcaLogic.getComisionMarcas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisionmarcaAux,comisionmarcas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.comisionmarcaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.comisionmarcaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionmarcaLogic.saveComisionMarcas();//WithConnection
						//comisionmarcaLogic.getSetVersionRowComisionMarcas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.comisionmarca,comisionmarcaAux);
					
					this.refrescarForeignKeysDescripcionesComisionMarca();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.comisionmarcaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								comisionmarcaLogic.saveComisionMarcaRelaciones(comisionmarcaAux);//WithConnection
								//comisionmarcaLogic.getSetVersionRowComisionMarcas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.comisionmarca,comisionmarcaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.comisionmarcaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.comisionmarcaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(comisionmarcaAux,comisionmarcaLogic.getComisionMarcas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(comisionmarcaAux,comisionmarcas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.comisionmarca,comisionmarcaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				comisionmarcaAux=new  ComisionMarca();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.comisionmarcaSessionBean.getEsGuardarRelacionado() 
					|| (this.comisionmarcaSessionBean.getEsGuardarRelacionado() && this.comisionmarca.getId()>=0)) {
						
					comisionmarcaAux.setIsNew(false);
				}
				
				comisionmarcaAux.setIsDeleted(false);
			
				comisionmarcaAux.setId(this.comisionmarca.getId());	
				comisionmarcaAux.setVersionRow(this.comisionmarca.getVersionRow());	
				comisionmarcaAux.setid_empresa(this.comisionmarca.getid_empresa());	
				comisionmarcaAux.setid_comision_config(this.comisionmarca.getid_comision_config());	
				comisionmarcaAux.setid_vendedor(this.comisionmarca.getid_vendedor());	
				comisionmarcaAux.setid_linea(this.comisionmarca.getid_linea());	
				comisionmarcaAux.setid_linea_grupo(this.comisionmarca.getid_linea_grupo());	
				comisionmarcaAux.setid_linea_categoria(this.comisionmarca.getid_linea_categoria());	
				comisionmarcaAux.setid_linea_marca(this.comisionmarca.getid_linea_marca());	
				comisionmarcaAux.setid_estado_comision(this.comisionmarca.getid_estado_comision());	
				comisionmarcaAux.setporcentaje(this.comisionmarca.getporcentaje());	
				comisionmarcaAux.setdescripcion(this.comisionmarca.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(comisionmarcaAux,comisionmarcaLogic.getComisionMarcas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisionmarcaAux,comisionmarcas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.comisionmarcaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.comisionmarcaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionmarcaLogic.saveComisionMarcas();//WithConnection
						//comisionmarcaLogic.getSetVersionRowComisionMarcas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.comisionmarca,comisionmarcaAux);
					
					this.refrescarForeignKeysDescripcionesComisionMarca();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.comisionmarcaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								comisionmarcaLogic.saveComisionMarcaRelaciones(comisionmarcaAux);//WithConnection
								//comisionmarcaLogic.getSetVersionRowComisionMarcas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.comisionmarca,comisionmarcaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.comisionmarcaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.comisionmarcaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(comisionmarcaAux,comisionmarcaLogic.getComisionMarcas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(comisionmarcaAux,comisionmarcas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.comisionmarca,comisionmarcaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				comisionmarcaAux=new  ComisionMarca();
				
				comisionmarcaAux.setIsNew(false);
				comisionmarcaAux.setIsChanged(false);
				
				comisionmarcaAux.setIsDeleted(true);
				
				comisionmarcaAux.setId(this.comisionmarca.getId());	
				comisionmarcaAux.setVersionRow(this.comisionmarca.getVersionRow());	
				comisionmarcaAux.setid_empresa(this.comisionmarca.getid_empresa());	
				comisionmarcaAux.setid_comision_config(this.comisionmarca.getid_comision_config());	
				comisionmarcaAux.setid_vendedor(this.comisionmarca.getid_vendedor());	
				comisionmarcaAux.setid_linea(this.comisionmarca.getid_linea());	
				comisionmarcaAux.setid_linea_grupo(this.comisionmarca.getid_linea_grupo());	
				comisionmarcaAux.setid_linea_categoria(this.comisionmarca.getid_linea_categoria());	
				comisionmarcaAux.setid_linea_marca(this.comisionmarca.getid_linea_marca());	
				comisionmarcaAux.setid_estado_comision(this.comisionmarca.getid_estado_comision());	
				comisionmarcaAux.setporcentaje(this.comisionmarca.getporcentaje());	
				comisionmarcaAux.setdescripcion(this.comisionmarca.getdescripcion());	
				
				if(this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.comisionmarcaAux.getId()>=0) {	
						this.comisionmarcasEliminados.add(comisionmarcaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(comisionmarcaAux,comisionmarcaLogic.getComisionMarcas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisionmarcaAux,comisionmarcas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.comisionmarcaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.comisionmarcaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionmarcaLogic.saveComisionMarcas();//WithConnection
						//comisionmarcaLogic.getSetVersionRowComisionMarcas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.comisionmarcaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								comisionmarcaLogic.saveComisionMarcaRelaciones(comisionmarcaAux);//WithConnection
								//comisionmarcaLogic.getSetVersionRowComisionMarcas();//WithConnection
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
							if(this.comisionmarcaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.comisionmarcaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(comisionmarcaAux,comisionmarcaLogic.getComisionMarcas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(comisionmarcaAux,comisionmarcas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.getComisionMarcas().addAll(this.comisionmarcasEliminados);
					
					comisionmarcaLogic.saveComisionMarcas();//WithConnection
					//comisionmarcaLogic.getSetVersionRowComisionMarcas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesComisionMarca();
				
				this.comisionmarcasEliminados= new ArrayList<ComisionMarca>();		
			}
			
			if(this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Comision Marca GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Comision Marca",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.comisionmarca=comisionmarcaAux;
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
      		//this.finishProcessComisionMarca();
      	}
		
	}	
	
	public void actualizarRelaciones(ComisionMarca comisionmarcaLocal) throws Exception {
		
		if(this.comisionmarcaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ComisionMarca comisionmarcaLocal) throws Exception {	
		if(this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				comisionmarcaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ComisionConfigDetalleFormJInternalFrame.class)) {
				ComisionConfigBeanSwingJInternalFrame comisionconfigBeanSwingJInternalFrameLocal=(ComisionConfigBeanSwingJInternalFrame) ((ComisionConfigDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				comisionconfigBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoComisionConfig(comisionconfigBeanSwingJInternalFrameLocal.getcomisionconfig(),true);
				comisionconfigBeanSwingJInternalFrameLocal.actualizarLista(comisionconfigBeanSwingJInternalFrameLocal.comisionconfig,this.comisionconfigsForeignKey);

				comisionconfigBeanSwingJInternalFrameLocal.actualizarRelaciones(comisionconfigBeanSwingJInternalFrameLocal.comisionconfig);

				comisionmarcaLocal.setComisionConfig(comisionconfigBeanSwingJInternalFrameLocal.comisionconfig);

				this.addItemDefectoCombosForeignKeyComisionConfig();
				this.cargarCombosFrameComisionConfigsForeignKey("Formulario");
				this.setActualComisionConfigForeignKey(comisionconfigBeanSwingJInternalFrameLocal.comisionconfig.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(VendedorDetalleFormJInternalFrame.class)) {
				VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrameLocal=(VendedorBeanSwingJInternalFrame) ((VendedorDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				vendedorBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoVendedor(vendedorBeanSwingJInternalFrameLocal.getvendedor(),true);
				vendedorBeanSwingJInternalFrameLocal.actualizarLista(vendedorBeanSwingJInternalFrameLocal.vendedor,this.vendedorsForeignKey);

				vendedorBeanSwingJInternalFrameLocal.actualizarRelaciones(vendedorBeanSwingJInternalFrameLocal.vendedor);

				comisionmarcaLocal.setVendedor(vendedorBeanSwingJInternalFrameLocal.vendedor);

				this.addItemDefectoCombosForeignKeyVendedor();
				this.cargarCombosFrameVendedorsForeignKey("Formulario");
				this.setActualVendedorForeignKey(vendedorBeanSwingJInternalFrameLocal.vendedor.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				comisionmarcaLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				comisionmarcaLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineacategoriaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineacategoriaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineacategoriaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineacategoriaBeanSwingJInternalFrameLocal.actualizarLista(lineacategoriaBeanSwingJInternalFrameLocal.linea,this.lineacategoriasForeignKey);

				lineacategoriaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				comisionmarcaLocal.setLineaCategoria(lineacategoriaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey("Formulario");
				this.setActualLineaCategoriaForeignKey(lineacategoriaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineamarcaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineamarcaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineamarcaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineamarcaBeanSwingJInternalFrameLocal.actualizarLista(lineamarcaBeanSwingJInternalFrameLocal.linea,this.lineamarcasForeignKey);

				lineamarcaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineamarcaBeanSwingJInternalFrameLocal.linea);

				comisionmarcaLocal.setLineaMarca(lineamarcaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey("Formulario");
				this.setActualLineaMarcaForeignKey(lineamarcaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstadoComisionDetalleFormJInternalFrame.class)) {
				EstadoComisionBeanSwingJInternalFrame estadocomisionBeanSwingJInternalFrameLocal=(EstadoComisionBeanSwingJInternalFrame) ((EstadoComisionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estadocomisionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstadoComision(estadocomisionBeanSwingJInternalFrameLocal.getestadocomision(),true);
				estadocomisionBeanSwingJInternalFrameLocal.actualizarLista(estadocomisionBeanSwingJInternalFrameLocal.estadocomision,this.estadocomisionsForeignKey);

				estadocomisionBeanSwingJInternalFrameLocal.actualizarRelaciones(estadocomisionBeanSwingJInternalFrameLocal.estadocomision);

				comisionmarcaLocal.setEstadoComision(estadocomisionBeanSwingJInternalFrameLocal.estadocomision);

				this.addItemDefectoCombosForeignKeyEstadoComision();
				this.cargarCombosFrameEstadoComisionsForeignKey("Formulario");
				this.setActualEstadoComisionForeignKey(estadocomisionBeanSwingJInternalFrameLocal.estadocomision.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarComisionMarcaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.comisionmarca =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.comisionmarca =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = comisionmarcaValidator.getInvalidValues(this.comisionmarca);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ComisionMarca comisionmarca,List<ComisionMarca> comisionmarcas) throws Exception {
		try	{		
			ComisionMarcaConstantesFunciones.actualizarLista(comisionmarca,comisionmarcas,this.comisionmarcaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ComisionMarca comisionmarca,List<ComisionMarca> comisionmarcas) throws Exception {
		try	{			
			ComisionMarcaConstantesFunciones.actualizarSelectedLista(comisionmarca,comisionmarcas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ComisionMarca> comisionmarcasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				comisionmarcasLocal=this.comisionmarcaLogic.getComisionMarcas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				comisionmarcasLocal=this.comisionmarcas;
			}
			//ARCHITECTURE
		
			for(ComisionMarca comisionmarcaLocal:comisionmarcasLocal) {
				if(this.permiteMantenimiento(comisionmarcaLocal) && comisionmarcaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ComisionMarcaConstantesFunciones.getComisionMarcaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ComisionMarcaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionMarca.jLabelid_empresaComisionMarca,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionMarcaConstantesFunciones.IDCOMISIONCONFIG)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionMarca.jLabelid_comision_configComisionMarca,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionMarcaConstantesFunciones.IDVENDEDOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionMarca.jLabelid_vendedorComisionMarca,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionMarcaConstantesFunciones.IDLINEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionMarca.jLabelid_lineaComisionMarca,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionMarcaConstantesFunciones.IDLINEAGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionMarca.jLabelid_linea_grupoComisionMarca,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionMarcaConstantesFunciones.IDLINEACATEGORIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionMarca.jLabelid_linea_categoriaComisionMarca,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionMarcaConstantesFunciones.IDLINEAMARCA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionMarca.jLabelid_linea_marcaComisionMarca,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionMarcaConstantesFunciones.IDESTADOCOMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionMarca.jLabelid_estado_comisionComisionMarca,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionMarcaConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionMarca.jLabelporcentajeComisionMarca,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionMarcaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionMarca.jLabeldescripcionComisionMarca,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormComisionMarca!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionMarca.jLabelid_empresaComisionMarca,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionMarca.jLabelid_comision_configComisionMarca,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionMarca.jLabelid_vendedorComisionMarca,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionMarca.jLabelid_lineaComisionMarca,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionMarca.jLabelid_linea_grupoComisionMarca,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionMarca.jLabelid_linea_categoriaComisionMarca,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionMarca.jLabelid_linea_marcaComisionMarca,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionMarca.jLabelid_estado_comisionComisionMarca,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionMarca.jLabelporcentajeComisionMarca,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionMarca.jLabeldescripcionComisionMarca,"");
		
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
		this.iIdNuevoComisionMarca--;	
		
		
		this.comisionmarcaAux=new ComisionMarca();
		
		this.comisionmarcaAux.setId(this.iIdNuevoComisionMarca);
		this.comisionmarcaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.comisionmarcaLogic.getComisionMarcas().add(this.comisionmarcaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.comisionmarcas.add(this.comisionmarcaAux);
		}
		//ARCHITECTURE
		
		this.comisionmarca=this.comisionmarcaAux;
		
		if(ComisionMarcaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioComisionMarca(this.comisionmarca);
			this.setVariablesObjetoActualToFormularioForeignKeyComisionMarca(this.comisionmarca);
		}
				
		//this.setDefaultControlesComisionMarca();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyComisionMarca();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyComisionMarca();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyComisionMarca();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualComisionMarca(this.comisionmarcaBean,this.comisionmarca,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ComisionMarcaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.comisionmarcaSessionBean.getConGuardarRelaciones()) {
			classes=ComisionMarcaConstantesFunciones.getClassesRelationshipsOfComisionMarca(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.comisionmarcaReturnGeneral=comisionmarcaLogic.procesarEventosComisionMarcasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comisionmarcaLogic.getComisionMarcas(),this.comisionmarca,this.comisionmarcaParameterGeneral,this.isEsNuevoComisionMarca,classes);//this.comisionmarcaLogic.getComisionMarca()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanComisionMarca(this.comisionmarcaReturnGeneral,this.comisionmarcaBean,false);
		
		if(this.comisionmarcaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyComisionMarca(this.comisionmarcaReturnGeneral.getComisionMarca());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioComisionMarca(this.comisionmarcaReturnGeneral.getComisionMarca());
		}
		
		if(this.comisionmarcaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioComisionMarca(this.comisionmarcaReturnGeneral.getComisionMarca(),classes);//this.comisionmarcaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualComisionMarca(this.comisionmarca,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyComisionMarca();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyComisionMarca();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ComisionMarcaBeanSwingJInternalFrameAdditional.RecargarFormComisionMarca(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingComisionMarca(false);
						
			if(comisionmarcaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComisionMarca();
			}
			
			this.actualizarVisualTableDatosComisionMarca();
			
			this.jTableDatosComisionMarca.setRowSelectionInterval(this.getIndiceNuevoComisionMarca(), this.getIndiceNuevoComisionMarca());
			
			this.seleccionarFilaTablaComisionMarcaActual();
						
			this.actualizarEstadoCeldasBotonesComisionMarca("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesComisionMarca(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormComisionMarca.jTextFieldporcentajeComisionMarca.setEnabled(isHabilitar && this.comisionmarcaConstantesFunciones.activarporcentajeComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jTextAreadescripcionComisionMarca.setEnabled(isHabilitar && this.comisionmarcaConstantesFunciones.activardescripcionComisionMarca);	
		//
		this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_empresaComisionMarca.setEnabled(isHabilitar && this.comisionmarcaConstantesFunciones.activarid_empresaComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_comision_configComisionMarca.setEnabled(isHabilitar && this.comisionmarcaConstantesFunciones.activarid_comision_configComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_vendedorComisionMarca.setEnabled(isHabilitar && this.comisionmarcaConstantesFunciones.activarid_vendedorComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_lineaComisionMarca.setEnabled(isHabilitar && this.comisionmarcaConstantesFunciones.activarid_lineaComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_grupoComisionMarca.setEnabled(isHabilitar && this.comisionmarcaConstantesFunciones.activarid_linea_grupoComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_categoriaComisionMarca.setEnabled(isHabilitar && this.comisionmarcaConstantesFunciones.activarid_linea_categoriaComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_marcaComisionMarca.setEnabled(isHabilitar && this.comisionmarcaConstantesFunciones.activarid_linea_marcaComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_estado_comisionComisionMarca.setEnabled(isHabilitar && this.comisionmarcaConstantesFunciones.activarid_estado_comisionComisionMarca);
	};
	
	public void setDefaultControlesComisionMarca() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoComisionMarca(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.comisionmarcaSessionBean.setConGuardarRelaciones(true);			
			this.comisionmarcaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormComisionMarca.jTabbedPaneRelacionesComisionMarca.setVisible(true);
			
					
		} else {
			//this.comisionmarcaSessionBean.setConGuardarRelaciones(false);			
			this.comisionmarcaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormComisionMarca.jTabbedPaneRelacionesComisionMarca.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoComisionMarca() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionMarca comisionmarcaAux:this.comisionmarcaLogic.getComisionMarcas()) {
				if(comisionmarcaAux.getId().equals(this.iIdNuevoComisionMarca)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionMarca comisionmarcaAux:this.comisionmarcas) {
				if(comisionmarcaAux.getId().equals(this.iIdNuevoComisionMarca)) {
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
	
	public int getIndiceActualComisionMarca(ComisionMarca comisionmarca,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionMarca comisionmarcaAux:this.comisionmarcaLogic.getComisionMarcas()) {
				if(comisionmarcaAux.getId().equals(comisionmarca.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionMarca comisionmarcaAux:this.comisionmarcas) {
				if(comisionmarcaAux.getId().equals(comisionmarca.getId())) {
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
	
	public void setCamposBaseDesdeOriginalComisionMarca(ComisionMarca comisionmarcaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionMarca comisionmarcaAux:this.comisionmarcaLogic.getComisionMarcas()) {
				if(comisionmarcaAux.getComisionMarcaOriginal().getId().equals(comisionmarcaOriginal.getId())) {
					existe=true;
					comisionmarcaOriginal.setId(comisionmarcaAux.getId());
					comisionmarcaOriginal.setVersionRow(comisionmarcaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionMarca comisionmarcaAux:this.comisionmarcas) {
				if(comisionmarcaAux.getComisionMarcaOriginal().getId().equals(comisionmarcaOriginal.getId())) {
					existe=true;
					comisionmarcaOriginal.setId(comisionmarcaAux.getId());
					comisionmarcaOriginal.setVersionRow(comisionmarcaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosComisionMarca(Boolean esParaCancelar) throws Exception {
		comisionmarcasAux=new ArrayList<ComisionMarca>();
		comisionmarcaAux=new ComisionMarca();
		
		if(!this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ComisionMarca comisionmarcaAux:this.comisionmarcaLogic.getComisionMarcas()) {
					if(comisionmarcaAux.getId()<0) {
						comisionmarcasAux.add(comisionmarcaAux);
					}		
				}
				this.iIdNuevoComisionMarca=0L;
				this.comisionmarcaLogic.getComisionMarcas().removeAll(comisionmarcasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComisionMarca comisionmarcaAux:this.comisionmarcas) {
					if(comisionmarcaAux.getId()<0) {
						comisionmarcasAux.add(comisionmarcaAux);
					}		
				}
				this.iIdNuevoComisionMarca=0L;
				this.comisionmarcas.removeAll(comisionmarcasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoComisionMarca 
					&& this.comisionmarcaLogic.getComisionMarcas().size()>0
					) {
					comisionmarcaAux=this.comisionmarcaLogic.getComisionMarcas().get(this.comisionmarcaLogic.getComisionMarcas().size() - 1);
				
					if(comisionmarcaAux.getId()<0) {
						this.comisionmarcaLogic.getComisionMarcas().remove(comisionmarcaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoComisionMarca && this.comisionmarcas.size()>0) {
					comisionmarcaAux=this.comisionmarcas.get(this.comisionmarcas.size() - 1);
				
					if(comisionmarcaAux.getId()<0) {
						this.comisionmarcas.remove(comisionmarcaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoComisionMarca(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(comisionmarca.getId()<0) {
				this.comisionmarcaLogic.getComisionMarcas().remove(this.comisionmarca);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(comisionmarca.getId()<0) {
				this.comisionmarcas.remove(this.comisionmarca);
			}
		}			
	}
	
	public void setEstadosInicialesComisionMarca(List<ComisionMarca> comisionmarcasAux) throws Exception {
		ComisionMarcaConstantesFunciones.setEstadosInicialesComisionMarca(comisionmarcasAux);
	}
	
	public void setEstadosInicialesComisionMarca(ComisionMarca comisionmarcaAux) throws Exception {
		ComisionMarcaConstantesFunciones.setEstadosInicialesComisionMarca(comisionmarcaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarComisionMarcaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesComisionMarca("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarComisionMarcaActual()) {
				if(!this.isEsNuevoComisionMarca) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesComisionMarca("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoComisionMarca=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarComisionMarcaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Comision Marca ?", "MANTENIMIENTO DE Comision Marca", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesComisionMarca("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ComisionMarca comisionmarca) throws Exception {
		ComisionMarcaConstantesFunciones.seleccionarAsignar(this.comisionmarca,comisionmarca);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarComisionMarca=this.isPermisoActualizarOriginalComisionMarca;
			
			
			this.seleccionarAsignar(comisionmarca);
			
			

			idVendedorActual=comisionmarca.getid_vendedor();
			this.seleccionarVendedorActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ComisionMarcaConstantesFunciones.quitarEspaciosComisionMarca(this.comisionmarca,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesComisionMarca("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.comisionmarcaSessionBean.setsFuncionBusquedaRapida(this.comisionmarcaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoComisionMarca) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosComisionMarca(esParaCancelar);				
				this.cancelarNuevoComisionMarca(esParaCancelar);								
			}
			
			this.comisionmarca=new ComisionMarca();
			
			this.inicializarComisionMarca();
			
			this.actualizarEstadoCeldasBotonesComisionMarca("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarComisionMarca() throws Exception {
		try {
			ComisionMarcaConstantesFunciones.inicializarComisionMarca(this.comisionmarca);
			
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
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.comisionmarcaLogic.getComisionMarcas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteComisionMarcas(String sAccionBusqueda,List<ComisionMarca> comisionmarcasParaReportes) throws Exception {
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
					sPathReporteFinal="ComisionMarca"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ComisionMarcaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ComisionMarcaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ComisionMarca"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Comision Marcas");		
		parameters.put("busquedapor", ComisionMarcaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceComisionMarca=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ComisionMarcaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ComisionMarcaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceComisionMarca=new JRBeanArrayDataSource(ComisionMarcaJInternalFrame.TraerComisionMarcaBeans(comisionmarcasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceComisionMarca);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ComisionMarcaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ComisionMarcaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ComisionMarcaBean.TraerComisionMarcaBeans(comisionmarcasParaReportes).toArray()));
							
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
				this.generarExcelReporteComisionMarcas(sAccionBusqueda,sTipoArchivoReporte,comisionmarcasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalComisionMarcas(sAccionBusqueda,sTipoArchivoReporte,comisionmarcasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoComisionMarcaActionPerformed(null);
					//this.generarExcelReporteComisionMarcas(sAccionBusqueda,sTipoArchivoReporte,comisionmarcasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalComisionMarcas(sAccionBusqueda,sTipoArchivoReporte,comisionmarcasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesComisionMarcas(sAccionBusqueda,sTipoArchivoReporte,comisionmarcasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesComisionMarcas(sAccionBusqueda,sTipoArchivoReporte,comisionmarcasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteComisionMarcas(String sAccionBusqueda,String sTipoArchivoReporte,List<ComisionMarca> comisionmarcasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionmarca";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComisionMarcas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderComisionMarca("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ComisionMarca comisionmarca : comisionmarcasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ComisionMarcaConstantesFunciones.generarExcelReporteDataComisionMarca("NORMAL",row,workbook,comisionmarca,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Marca",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderComisionMarca(String sTipo,Row row,Workbook workbook) {
		
		ComisionMarcaConstantesFunciones.generarExcelReporteHeaderComisionMarca(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalComisionMarcas(String sAccionBusqueda,String sTipoArchivoReporte,List<ComisionMarca> comisionmarcasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionmarca_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComisionMarcas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ComisionMarca comisionmarca : comisionmarcasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ComisionMarcaConstantesFunciones.getComisionMarcaDescripcion(comisionmarca));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionMarcaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionmarca.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionMarcaConstantesFunciones.LABEL_IDCOMISIONCONFIG))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_IDCOMISIONCONFIG);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionmarca.getcomisionconfig_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionMarcaConstantesFunciones.LABEL_IDVENDEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_IDVENDEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionmarca.getvendedor_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionMarcaConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionmarca.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionMarcaConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionmarca.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionMarcaConstantesFunciones.LABEL_IDLINEACATEGORIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_IDLINEACATEGORIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionmarca.getlineacategoria_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionMarcaConstantesFunciones.LABEL_IDLINEAMARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_IDLINEAMARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionmarca.getlineamarca_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionMarcaConstantesFunciones.LABEL_IDESTADOCOMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_IDESTADOCOMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionmarca.getestadocomision_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionMarcaConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionmarca.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionMarcaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionmarca.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Marca",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesComisionMarcas(String sAccionBusqueda,String sTipoArchivoReporte,List<ComisionMarca> comisionmarcasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ComisionMarca> comisionmarcasRespaldo=null;
		
		classes=ComisionMarcaConstantesFunciones.getClassesRelationshipsOfComisionMarca(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.comisionmarcaLogic.setDatosCliente(this.datosCliente);
		this.comisionmarcaLogic.setDatosDeep(this.datosDeep);
		this.comisionmarcaLogic.setIsConDeep(true);
		
		comisionmarcasRespaldo=this.comisionmarcaLogic.getComisionMarcas();
		
		this.comisionmarcaLogic.setComisionMarcas(comisionmarcasParaReportes);	
		this.comisionmarcaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		comisionmarcasParaReportes=this.comisionmarcaLogic.getComisionMarcas();
		this.comisionmarcaLogic.setComisionMarcas(comisionmarcasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionmarca_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComisionMarcas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderComisionMarca("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ComisionMarca comisionmarca : comisionmarcasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderComisionMarca("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ComisionMarcaConstantesFunciones.generarExcelReporteDataComisionMarca("NORMAL",row,workbook,comisionmarca,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ComisionMarcaConstantesFunciones.getComisionMarcaDescripcion(comisionmarca));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Marca",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoComisionMarca.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionMarca.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoComisionMarca.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionMarca.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessComisionMarca() throws Exception {		
		this.startProcessComisionMarca(true);
	}
	
	public void startProcessComisionMarca(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasComisionMarca ,this.jPanelParametrosReportesComisionMarca, this.jScrollPanelDatosComisionMarca,this.jPanelPaginacionComisionMarca, this.jScrollPanelDatosEdicionComisionMarca, this.jPanelAccionesComisionMarca,this.jPanelAccionesFormularioComisionMarca,this.jmenuBarComisionMarca,this.jmenuBarDetalleComisionMarca,this.jTtoolBarComisionMarca,this.jTtoolBarDetalleComisionMarca);		
		
		final JTabbedPane jTabbedPaneBusquedasComisionMarca=this.jTabbedPaneBusquedasComisionMarca; 
		
		final JPanel jPanelParametrosReportesComisionMarca=this.jPanelParametrosReportesComisionMarca;
		//final JScrollPane jScrollPanelDatosComisionMarca=this.jScrollPanelDatosComisionMarca;
		final JTable jTableDatosComisionMarca=this.jTableDatosComisionMarca;		
		final JPanel jPanelPaginacionComisionMarca=this.jPanelPaginacionComisionMarca;
		//final JScrollPane jScrollPanelDatosEdicionComisionMarca=this.jScrollPanelDatosEdicionComisionMarca;
		final JPanel jPanelAccionesComisionMarca=this.jPanelAccionesComisionMarca;
		
		JPanel jPanelCamposAuxiliarComisionMarca=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarComisionMarca=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormComisionMarca!=null) {
			jPanelCamposAuxiliarComisionMarca=this.jInternalFrameDetalleFormComisionMarca.jPanelCamposComisionMarca;
			jPanelAccionesFormularioAuxiliarComisionMarca=this.jInternalFrameDetalleFormComisionMarca.jPanelAccionesFormularioComisionMarca;
		}
		
		final JPanel jPanelCamposComisionMarca=jPanelCamposAuxiliarComisionMarca;
		final JPanel jPanelAccionesFormularioComisionMarca=jPanelAccionesFormularioAuxiliarComisionMarca;
		
		
		final JMenuBar jmenuBarComisionMarca=this.jmenuBarComisionMarca;
		final JToolBar jTtoolBarComisionMarca=this.jTtoolBarComisionMarca;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarComisionMarca=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarComisionMarca=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormComisionMarca!=null) {
			jmenuBarDetalleAuxiliarComisionMarca=this.jInternalFrameDetalleFormComisionMarca.jmenuBarDetalleComisionMarca;
			jTtoolBarDetalleAuxiliarComisionMarca=this.jInternalFrameDetalleFormComisionMarca.jTtoolBarDetalleComisionMarca;
		}
		
		final JMenuBar jmenuBarDetalleComisionMarca=jmenuBarDetalleAuxiliarComisionMarca;
		final JToolBar jTtoolBarDetalleComisionMarca=jTtoolBarDetalleAuxiliarComisionMarca;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasComisionMarca;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesComisionMarca;
			processRunnable.jTableDatos=jTableDatosComisionMarca;
			processRunnable.jPanelCampos=jPanelCamposComisionMarca;
			processRunnable.jPanelPaginacion=jPanelPaginacionComisionMarca;
			processRunnable.jPanelAcciones=jPanelAccionesComisionMarca;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioComisionMarca;
			
			
			processRunnable.jmenuBar=jmenuBarComisionMarca;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleComisionMarca;
			processRunnable.jTtoolBar=jTtoolBarComisionMarca;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleComisionMarca;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasComisionMarca ,jPanelParametrosReportesComisionMarca,jTableDatosComisionMarca, /*jScrollPanelDatosComisionMarca,*/jPanelCamposComisionMarca,jPanelPaginacionComisionMarca, /*jScrollPanelDatosEdicionComisionMarca,*/ jPanelAccionesComisionMarca,jPanelAccionesFormularioComisionMarca,jmenuBarComisionMarca,jmenuBarDetalleComisionMarca,jTtoolBarComisionMarca,jTtoolBarDetalleComisionMarca);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasComisionMarca ,jPanelParametrosReportesComisionMarca, jScrollPanelDatosComisionMarca,jPanelPaginacionComisionMarca, jScrollPanelDatosEdicionComisionMarca, jPanelAccionesComisionMarca,jPanelAccionesFormularioComisionMarca,jmenuBarComisionMarca,jmenuBarDetalleComisionMarca,jTtoolBarComisionMarca,jTtoolBarDetalleComisionMarca);
						
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
	
	public void finishProcessComisionMarca() {// throws Exception 
		this.finishProcessComisionMarca(true);
	}
	
	public void finishProcessComisionMarca(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasComisionMarca ,this.jPanelParametrosReportesComisionMarca, this.jScrollPanelDatosComisionMarca,this.jPanelPaginacionComisionMarca, this.jScrollPanelDatosEdicionComisionMarca, this.jPanelAccionesComisionMarca,this.jPanelAccionesFormularioComisionMarca,this.jmenuBarComisionMarca,this.jmenuBarDetalleComisionMarca,this.jTtoolBarComisionMarca,this.jTtoolBarDetalleComisionMarca);		
		
		final JTabbedPane jTabbedPaneBusquedasComisionMarca=this.jTabbedPaneBusquedasComisionMarca; 
		
		final JPanel jPanelParametrosReportesComisionMarca=this.jPanelParametrosReportesComisionMarca;
		//final JScrollPane jScrollPanelDatosComisionMarca=this.jScrollPanelDatosComisionMarca;
		final JTable jTableDatosComisionMarca=this.jTableDatosComisionMarca;		
		final JPanel jPanelPaginacionComisionMarca=this.jPanelPaginacionComisionMarca;
		//final JScrollPane jScrollPanelDatosEdicionComisionMarca=this.jScrollPanelDatosEdicionComisionMarca;
		final JPanel jPanelAccionesComisionMarca=this.jPanelAccionesComisionMarca;
		
		JPanel jPanelCamposAuxiliarComisionMarca=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarComisionMarca=new JPanel();
		
		if(this.jInternalFrameDetalleFormComisionMarca!=null) {
			jPanelCamposAuxiliarComisionMarca=this.jInternalFrameDetalleFormComisionMarca.jPanelCamposComisionMarca;
			jPanelAccionesFormularioAuxiliarComisionMarca=this.jInternalFrameDetalleFormComisionMarca.jPanelAccionesFormularioComisionMarca;
		}
		
		final JPanel jPanelCamposComisionMarca=jPanelCamposAuxiliarComisionMarca;
		final JPanel jPanelAccionesFormularioComisionMarca=jPanelAccionesFormularioAuxiliarComisionMarca;
		
		
		final JMenuBar jmenuBarComisionMarca=this.jmenuBarComisionMarca;		
		final JToolBar jTtoolBarComisionMarca=this.jTtoolBarComisionMarca;
				
		JMenuBar jmenuBarDetalleAuxiliarComisionMarca=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarComisionMarca=new JToolBar();
		
		if(this.jInternalFrameDetalleFormComisionMarca!=null) {
			jmenuBarDetalleAuxiliarComisionMarca=this.jInternalFrameDetalleFormComisionMarca.jmenuBarDetalleComisionMarca;
			jTtoolBarDetalleAuxiliarComisionMarca=this.jInternalFrameDetalleFormComisionMarca.jTtoolBarDetalleComisionMarca;		
		}
		
		final JMenuBar jmenuBarDetalleComisionMarca=jmenuBarDetalleAuxiliarComisionMarca;
		final JToolBar jTtoolBarDetalleComisionMarca=jTtoolBarDetalleAuxiliarComisionMarca;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasComisionMarca;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesComisionMarca;
			processRunnable.jTableDatos=jTableDatosComisionMarca;
			processRunnable.jPanelCampos=jPanelCamposComisionMarca;
			processRunnable.jPanelPaginacion=jPanelPaginacionComisionMarca;
			processRunnable.jPanelAcciones=jPanelAccionesComisionMarca;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioComisionMarca;
			
			
			processRunnable.jmenuBar=jmenuBarComisionMarca;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleComisionMarca;
			processRunnable.jTtoolBar=jTtoolBarComisionMarca;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleComisionMarca;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasComisionMarca ,jPanelParametrosReportesComisionMarca, jTableDatosComisionMarca,/*jScrollPanelDatosComisionMarca,*/jPanelCamposComisionMarca,jPanelPaginacionComisionMarca, /*jScrollPanelDatosEdicionComisionMarca,*/ jPanelAccionesComisionMarca,jPanelAccionesFormularioComisionMarca,jmenuBarComisionMarca,jmenuBarDetalleComisionMarca,jTtoolBarComisionMarca,jTtoolBarDetalleComisionMarca));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesComisionMarca(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarComisionMarca(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuComisionMarca(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarComisionMarca(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarComisionMarca,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleComisionMarca,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuComisionMarca(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarComisionMarca,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleComisionMarca,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.comisionmarcaConstantesFunciones.getsFinalQueryComisionMarca();
		String  finalQueryPaginacionTodos=this.comisionmarcaConstantesFunciones.getsFinalQueryComisionMarca();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ComisionMarcaConstantesFunciones.getArrayColumnasGlobalesNoComisionMarca(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ComisionMarcaConstantesFunciones.getArrayColumnasGlobalesComisionMarca(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ComisionMarcaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.comisionmarcasEliminados= new ArrayList<ComisionMarca>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessComisionMarca();
		
				///*ComisionMarcaSessionBean*/this.comisionmarcaSessionBean=new ComisionMarcaSessionBean();
			
			if(this.comisionmarcaSessionBean==null) {
				this.comisionmarcaSessionBean=new ComisionMarcaSessionBean();
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
					this.iNumeroPaginacion=ComisionMarcaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ComisionMarcaConstantesFunciones.getClassesForeignKeysOfComisionMarca(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/comisionmarca."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			comisionmarcasAux= new ArrayList<ComisionMarca>();
			
				
			comisionmarcaLogic.setDatosCliente(this.datosCliente);
			comisionmarcaLogic.setDatosDeep(this.datosDeep);
			comisionmarcaLogic.setIsConDeep(true);
			
			
			comisionmarcaLogic.getComisionMarcaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					comisionmarcaLogic.getTodosComisionMarcas(finalQueryGlobal,pagination);
					
					//comisionmarcaLogic.getTodosComisionMarcasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(comisionmarcaLogic.getComisionMarcas()==null|| comisionmarcaLogic.getComisionMarcas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							comisionmarcasAux= new ArrayList<ComisionMarca>();
							comisionmarcasAux.addAll(comisionmarcaLogic.getComisionMarcas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionmarcasAux= new ArrayList<ComisionMarca>();
							comisionmarcasAux.addAll(comisionmarcas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							comisionmarcaLogic.getTodosComisionMarcas(finalQueryGlobal+"",this.pagination);												
							
							//comisionmarcaLogic.getTodosComisionMarcasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteComisionMarcas("Todos",comisionmarcaLogic.getComisionMarcas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							comisionmarcaLogic.setComisionMarcas(new ArrayList<ComisionMarca>());					
							comisionmarcaLogic.getComisionMarcas().addAll(comisionmarcasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionmarcas=new ArrayList<ComisionMarca>();
							comisionmarcas.addAll(comisionmarcasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idComisionMarca=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idComisionMarca=this.idActual;
				
				} else if(this.idComisionMarcaActual!=null && this.idComisionMarcaActual!=0L) {
					idComisionMarca=idComisionMarcaActual;
				}
				
					
				this.sDetalleReporte=ComisionMarcaConstantesFunciones.getDetalleIndicePorId(idComisionMarca);
				
				this.comisionmarcas=new ArrayList<ComisionMarca>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					comisionmarcaLogic.getEntity(idComisionMarca);
					
					//comisionmarcaLogic.getEntityWithConnection(idComisionMarca);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionmarcaLogic.setComisionMarcas(new ArrayList<ComisionMarca>());
					comisionmarcaLogic.getComisionMarcas().add(comisionmarcaLogic.getComisionMarca());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionmarcas=new ArrayList<ComisionMarca>();
					this.comisionmarcas.add(comisionmarca);
				}
				
				if(comisionmarcaLogic.getComisionMarca()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdComisionConfig")) {
				this.sDetalleReporte=ComisionMarcaConstantesFunciones.getDetalleIndiceFK_IdComisionConfig(id_comision_configFK_IdComisionConfig);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					comisionmarcaLogic.getComisionMarcasFK_IdComisionConfig(finalQueryGlobal,pagination,id_comision_configFK_IdComisionConfig);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComisionMarcaConstantesFunciones.getDetalleIndiceFK_IdComisionConfig(id_comision_configFK_IdComisionConfig);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComisionMarcaConstantesFunciones.getDetalleIndiceFK_IdComisionConfig(id_comision_configFK_IdComisionConfig);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=comisionmarcaLogic.getComisionMarcas()==null||comisionmarcaLogic.getComisionMarcas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=comisionmarcas==null|| comisionmarcas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionmarcasAux=new ArrayList<ComisionMarca>();
						comisionmarcasAux.addAll(comisionmarcaLogic.getComisionMarcas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionmarcasAux=new ArrayList<ComisionMarca>();
							comisionmarcasAux.addAll(comisionmarcas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							comisionmarcaLogic.getComisionMarcasFK_IdComisionConfig(finalQueryGlobal,pagination,id_comision_configFK_IdComisionConfig);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComisionMarcaConstantesFunciones.getDetalleIndiceFK_IdComisionConfig(id_comision_configFK_IdComisionConfig);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComisionMarcaConstantesFunciones.getDetalleIndiceFK_IdComisionConfig(id_comision_configFK_IdComisionConfig);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteComisionMarcas("FK_IdComisionConfig",comisionmarcaLogic.getComisionMarcas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteComisionMarcas("FK_IdComisionConfig",comisionmarcas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionmarcaLogic.setComisionMarcas(new ArrayList<ComisionMarca>());
						comisionmarcaLogic.getComisionMarcas().addAll(comisionmarcasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionmarcas=new ArrayList<ComisionMarca>();
							comisionmarcas.addAll(comisionmarcasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ComisionMarcaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					comisionmarcaLogic.getComisionMarcasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComisionMarcaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComisionMarcaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=comisionmarcaLogic.getComisionMarcas()==null||comisionmarcaLogic.getComisionMarcas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=comisionmarcas==null|| comisionmarcas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionmarcasAux=new ArrayList<ComisionMarca>();
						comisionmarcasAux.addAll(comisionmarcaLogic.getComisionMarcas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionmarcasAux=new ArrayList<ComisionMarca>();
							comisionmarcasAux.addAll(comisionmarcas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							comisionmarcaLogic.getComisionMarcasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComisionMarcaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComisionMarcaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteComisionMarcas("FK_IdEmpresa",comisionmarcaLogic.getComisionMarcas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteComisionMarcas("FK_IdEmpresa",comisionmarcas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionmarcaLogic.setComisionMarcas(new ArrayList<ComisionMarca>());
						comisionmarcaLogic.getComisionMarcas().addAll(comisionmarcasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionmarcas=new ArrayList<ComisionMarca>();
							comisionmarcas.addAll(comisionmarcasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesComisionMarca();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessComisionMarca();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=comisionmarcaLogic.getComisionMarcas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comisionmarcas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=comisionmarcaLogic.getComisionMarcas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comisionmarcas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ComisionMarca comisionmarca) {
		Boolean permite=true;
		
		if(this.comisionmarca.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ComisionMarcaConstantesFunciones.getOrderByListaComisionMarca();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ComisionMarcaConstantesFunciones.getOrderByListaComisionMarca();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionMarca comisionmarca:comisionmarcaLogic.getComisionMarcas()) {
				if(comisionmarca.getsType().equals(Constantes2.S_TOTALES)) {
					comisionmarcaTotales=comisionmarca;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionMarca comisionmarca:this.comisionmarcas) {
				if(comisionmarca.getsType().equals(Constantes2.S_TOTALES)) {
					comisionmarcaTotales=comisionmarca;
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
			this.comisionmarcaAux=new ComisionMarca();
			this.comisionmarcaAux.setsType(Constantes2.S_TOTALES);
			this.comisionmarcaAux.setIsNew(false);
			this.comisionmarcaAux.setIsChanged(false);
			this.comisionmarcaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ComisionMarcaConstantesFunciones.TotalizarValoresFilaComisionMarca(this.comisionmarcaLogic.getComisionMarcas(),this.comisionmarcaAux);
				
				this.comisionmarcaLogic.getComisionMarcas().add(this.comisionmarcaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ComisionMarcaConstantesFunciones.TotalizarValoresFilaComisionMarca(this.comisionmarcas,this.comisionmarcaAux);
				
				this.comisionmarcas.add(this.comisionmarcaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		comisionmarcaTotales=new ComisionMarca();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.comisionmarcaLogic.getComisionMarcas().remove(comisionmarcaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.comisionmarcas.remove(comisionmarcaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		comisionmarcaTotales=new ComisionMarca();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionMarca comisionmarca:comisionmarcaLogic.getComisionMarcas()) {
				if(comisionmarca.getsType().equals(Constantes2.S_TOTALES)) {
					comisionmarcaTotales=comisionmarca;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ComisionMarcaConstantesFunciones.TotalizarValoresFilaComisionMarca(this.comisionmarcaLogic.getComisionMarcas(),comisionmarcaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionMarca comisionmarca:this.comisionmarcas) {
				if(comisionmarca.getsType().equals(Constantes2.S_TOTALES)) {
					comisionmarcaTotales=comisionmarca;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ComisionMarcaConstantesFunciones.TotalizarValoresFilaComisionMarca(this.comisionmarcas,comisionmarcaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getComisionMarcasFK_IdComisionConfig()throws Exception {
		try {
			sAccionBusqueda="FK_IdComisionConfig";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComisionMarcasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComisionMarcasFK_IdEstadoComision()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstadoComision";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComisionMarcasFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComisionMarcasFK_IdLineaCategoria()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaCategoria";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComisionMarcasFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComisionMarcasFK_IdLineaMarca()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaMarca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComisionMarcasFK_IdVendedor()throws Exception {
		try {
			sAccionBusqueda="FK_IdVendedor";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getComisionMarcasFK_IdComisionConfig(String sFinalQuery,Long id_comision_config)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionmarcaLogic.getComisionMarcasFK_IdComisionConfig(sFinalQuery,this.pagination,id_comision_config);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComisionMarcasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionmarcaLogic.getComisionMarcasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComisionMarcasFK_IdEstadoComision(String sFinalQuery,Long id_estado_comision)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionmarcaLogic.getComisionMarcasFK_IdEstadoComision(sFinalQuery,this.pagination,id_estado_comision);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComisionMarcasFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionmarcaLogic.getComisionMarcasFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComisionMarcasFK_IdLineaCategoria(String sFinalQuery,Long id_linea_categoria)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionmarcaLogic.getComisionMarcasFK_IdLineaCategoria(sFinalQuery,this.pagination,id_linea_categoria);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComisionMarcasFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionmarcaLogic.getComisionMarcasFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComisionMarcasFK_IdLineaMarca(String sFinalQuery,Long id_linea_marca)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionmarcaLogic.getComisionMarcasFK_IdLineaMarca(sFinalQuery,this.pagination,id_linea_marca);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComisionMarcasFK_IdVendedor(String sFinalQuery,Long id_vendedor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionmarcaLogic.getComisionMarcasFK_IdVendedor(sFinalQuery,this.pagination,id_vendedor);
				
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
	
	public void inicializarPermisosComisionMarca() {
		this.isPermisoTodoComisionMarca=false;
		this.isPermisoNuevoComisionMarca=false;
		this.isPermisoActualizarComisionMarca=false;
		this.isPermisoActualizarOriginalComisionMarca=false;
		this.isPermisoEliminarComisionMarca=false;
		this.isPermisoGuardarCambiosComisionMarca=false;
		this.isPermisoConsultaComisionMarca=false;
		this.isPermisoBusquedaComisionMarca=false;
		this.isPermisoReporteComisionMarca=false;		
		this.isPermisoOrdenComisionMarca=false;		
		this.isPermisoPaginacionMedioComisionMarca=false;		
		this.isPermisoPaginacionAltoComisionMarca=false;
		this.isPermisoPaginacionTodoComisionMarca=false;
		this.isPermisoCopiarComisionMarca=false;		
		this.isPermisoVerFormComisionMarca=false;		
		this.isPermisoDuplicarComisionMarca=false;		
		this.isPermisoOrdenComisionMarca=false;		
	}
	
	public void setPermisosUsuarioComisionMarca(Boolean isPermiso) {
		this.isPermisoTodoComisionMarca=isPermiso;
		this.isPermisoNuevoComisionMarca=isPermiso;
		this.isPermisoActualizarComisionMarca=isPermiso;
		this.isPermisoActualizarOriginalComisionMarca=isPermiso;
		this.isPermisoEliminarComisionMarca=isPermiso;
		this.isPermisoGuardarCambiosComisionMarca=isPermiso;
		this.isPermisoConsultaComisionMarca=isPermiso;
		this.isPermisoBusquedaComisionMarca=isPermiso;
		this.isPermisoReporteComisionMarca=isPermiso;
		this.isPermisoOrdenComisionMarca=isPermiso;		
		this.isPermisoPaginacionMedioComisionMarca=isPermiso;		
		this.isPermisoPaginacionAltoComisionMarca=isPermiso;		
		this.isPermisoPaginacionTodoComisionMarca=isPermiso;		
		this.isPermisoCopiarComisionMarca=isPermiso;		
		this.isPermisoVerFormComisionMarca=isPermiso;		
		this.isPermisoDuplicarComisionMarca=isPermiso;
		this.isPermisoOrdenComisionMarca=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioComisionMarca(Boolean isPermiso) {
		//this.isPermisoTodoComisionMarca=isPermiso;
		this.isPermisoNuevoComisionMarca=isPermiso;
		this.isPermisoActualizarComisionMarca=isPermiso;
		this.isPermisoActualizarOriginalComisionMarca=isPermiso;
		this.isPermisoEliminarComisionMarca=isPermiso;
		this.isPermisoGuardarCambiosComisionMarca=isPermiso;
		//this.isPermisoConsultaComisionMarca=isPermiso;
		//this.isPermisoBusquedaComisionMarca=isPermiso;
		//this.isPermisoReporteComisionMarca=isPermiso;
		//this.isPermisoOrdenComisionMarca=isPermiso;		
		//this.isPermisoPaginacionMedioComisionMarca=isPermiso;		
		//this.isPermisoPaginacionAltoComisionMarca=isPermiso;		
		//this.isPermisoPaginacionTodoComisionMarca=isPermiso;		
		//this.isPermisoCopiarComisionMarca=isPermiso;		
		//this.isPermisoDuplicarComisionMarca=isPermiso;
		//this.isPermisoOrdenComisionMarca=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioComisionMarcaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ComisionMarcaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebComisionMarca(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioComisionMarcaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioComisionMarcaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionComisionMarcaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioComisionMarcaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioComisionMarca() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ComisionMarcaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ComisionMarcaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoComisionMarca=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarComisionMarca=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalComisionMarca=this.isPermisoActualizarComisionMarca;
			this.isPermisoEliminarComisionMarca=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosComisionMarca=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaComisionMarca=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaComisionMarca=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoComisionMarca=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteComisionMarca=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenComisionMarca=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioComisionMarca=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoComisionMarca=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoComisionMarca=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarComisionMarca=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormComisionMarca=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarComisionMarca=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenComisionMarca=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosComisionMarca.setToolTipText(this.jTableDatosComisionMarca.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioComisionMarca(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioComisionMarca(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ComisionMarcaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ComisionMarcaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioComisionMarca() throws Exception {
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
	public void inicializarCombosForeignKeyComisionMarcaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.comisionconfigsForeignKey=new ArrayList();
				this.vendedorsForeignKey=new ArrayList();
				this.lineasForeignKey=new ArrayList();
				this.lineagruposForeignKey=new ArrayList();
				this.lineacategoriasForeignKey=new ArrayList();
				this.lineamarcasForeignKey=new ArrayList();
				this.estadocomisionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyComisionMarcaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ComisionMarcaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyComisionMarcaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyComisionConfigListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyVendedorListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaCategoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaMarcaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyLineaGrupoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if(cargarCombosDependencia && (this.lineagruposForeignKey==null||this.lineagruposForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaGruposForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaCategoriaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if(cargarCombosDependencia && (this.lineacategoriasForeignKey==null||this.lineacategoriasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaCategoriasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaMarcaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if(cargarCombosDependencia && (this.lineamarcasForeignKey==null||this.lineamarcasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=LineaConstantesFunciones.SFINALQUERY;

				this.cargarCombosLineaMarcasForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyComisionMarcaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ComisionMarcaParameterReturnGeneral comisionmarcaReturnGeneral=new ComisionMarcaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.comisionmarcaConstantesFunciones.cargarid_empresaComisionMarca)
					 || (this.esRecargarFks && this.comisionmarcaConstantesFunciones.cargarid_empresaComisionMarca)) {

					if(!this.comisionmarcaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+comisionmarcaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalComisionConfig="";

				if(((this.comisionconfigsForeignKey==null||this.comisionconfigsForeignKey.size()<=0) && this.comisionmarcaConstantesFunciones.cargarid_comision_configComisionMarca)
					 || (this.esRecargarFks && this.comisionmarcaConstantesFunciones.cargarid_comision_configComisionMarca)) {

					if(!this.comisionmarcaSessionBean.getisBusquedaDesdeForeignKeySesionComisionConfig()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ComisionConfigConstantesFunciones.getArrayColumnasGlobalesComisionConfig(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalComisionConfig=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ComisionConfigConstantesFunciones.TABLENAME);

						finalQueryGlobalComisionConfig=Funciones.GetFinalQueryAppend(finalQueryGlobalComisionConfig, "");
						finalQueryGlobalComisionConfig+=ComisionConfigConstantesFunciones.SFINALQUERY;

						//this.cargarCombosComisionConfigsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalComisionConfig=" WHERE " + ConstantesSql.ID + "="+comisionmarcaSessionBean.getlidComisionConfigActual();
					}
				} else {
					finalQueryGlobalComisionConfig="NONE";
				}


				String finalQueryGlobalVendedor="";

				if(((this.vendedorsForeignKey==null||this.vendedorsForeignKey.size()<=0) && this.comisionmarcaConstantesFunciones.cargarid_vendedorComisionMarca)
					 || (this.esRecargarFks && this.comisionmarcaConstantesFunciones.cargarid_vendedorComisionMarca)) {

					if(!this.comisionmarcaSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=VendedorConstantesFunciones.getArrayColumnasGlobalesVendedor(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalVendedor=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,VendedorConstantesFunciones.TABLENAME);

						finalQueryGlobalVendedor=Funciones.GetFinalQueryAppend(finalQueryGlobalVendedor, "");
						finalQueryGlobalVendedor+=VendedorConstantesFunciones.SFINALQUERY;

						//this.cargarCombosVendedorsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalVendedor=" WHERE " + ConstantesSql.ID + "="+comisionmarcaSessionBean.getlidVendedorActual();
					}
				} else {
					finalQueryGlobalVendedor="NONE";
				}


				String finalQueryGlobalLinea="";

				if(((this.lineasForeignKey==null||this.lineasForeignKey.size()<=0) && this.comisionmarcaConstantesFunciones.cargarid_lineaComisionMarca)
					 || (this.esRecargarFks && this.comisionmarcaConstantesFunciones.cargarid_lineaComisionMarca)) {

					if(!this.comisionmarcaSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalLinea=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

						finalQueryGlobalLinea=Funciones.GetFinalQueryAppend(finalQueryGlobalLinea, "id_nivel_linea=1");
						finalQueryGlobalLinea+=LineaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosLineasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalLinea=" WHERE " + ConstantesSql.ID + "="+comisionmarcaSessionBean.getlidLineaActual();
					}
				} else {
					finalQueryGlobalLinea="NONE";
				}


				String finalQueryGlobalLineaGrupo="";

				if(cargarCombosDependencia && ((this.lineagruposForeignKey==null||this.lineagruposForeignKey.size()<=0) && this.comisionmarcaConstantesFunciones.cargarid_linea_grupoComisionMarca)
					 || (this.esRecargarFks && this.comisionmarcaConstantesFunciones.cargarid_linea_grupoComisionMarca)) {

					if(!this.comisionmarcaSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalLineaGrupo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

						finalQueryGlobalLineaGrupo=Funciones.GetFinalQueryAppend(finalQueryGlobalLineaGrupo, "");
						finalQueryGlobalLineaGrupo+=LineaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosLineaGruposForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalLineaGrupo=" WHERE " + ConstantesSql.ID + "="+comisionmarcaSessionBean.getlidLineaGrupoActual();
					}
				} else {
					finalQueryGlobalLineaGrupo="NONE";
				}


				String finalQueryGlobalLineaCategoria="";

				if(cargarCombosDependencia && ((this.lineacategoriasForeignKey==null||this.lineacategoriasForeignKey.size()<=0) && this.comisionmarcaConstantesFunciones.cargarid_linea_categoriaComisionMarca)
					 || (this.esRecargarFks && this.comisionmarcaConstantesFunciones.cargarid_linea_categoriaComisionMarca)) {

					if(!this.comisionmarcaSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalLineaCategoria=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

						finalQueryGlobalLineaCategoria=Funciones.GetFinalQueryAppend(finalQueryGlobalLineaCategoria, "");
						finalQueryGlobalLineaCategoria+=LineaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosLineaCategoriasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalLineaCategoria=" WHERE " + ConstantesSql.ID + "="+comisionmarcaSessionBean.getlidLineaCategoriaActual();
					}
				} else {
					finalQueryGlobalLineaCategoria="NONE";
				}


				String finalQueryGlobalLineaMarca="";

				if(cargarCombosDependencia && ((this.lineamarcasForeignKey==null||this.lineamarcasForeignKey.size()<=0) && this.comisionmarcaConstantesFunciones.cargarid_linea_marcaComisionMarca)
					 || (this.esRecargarFks && this.comisionmarcaConstantesFunciones.cargarid_linea_marcaComisionMarca)) {

					if(!this.comisionmarcaSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalLineaMarca=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

						finalQueryGlobalLineaMarca=Funciones.GetFinalQueryAppend(finalQueryGlobalLineaMarca, "");
						finalQueryGlobalLineaMarca+=LineaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosLineaMarcasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalLineaMarca=" WHERE " + ConstantesSql.ID + "="+comisionmarcaSessionBean.getlidLineaMarcaActual();
					}
				} else {
					finalQueryGlobalLineaMarca="NONE";
				}


				String finalQueryGlobalEstadoComision="";

				if(((this.estadocomisionsForeignKey==null||this.estadocomisionsForeignKey.size()<=0) && this.comisionmarcaConstantesFunciones.cargarid_estado_comisionComisionMarca)
					 || (this.esRecargarFks && this.comisionmarcaConstantesFunciones.cargarid_estado_comisionComisionMarca)) {

					if(!this.comisionmarcaSessionBean.getisBusquedaDesdeForeignKeySesionEstadoComision()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstadoComisionConstantesFunciones.getArrayColumnasGlobalesEstadoComision(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstadoComision=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoComisionConstantesFunciones.TABLENAME);

						finalQueryGlobalEstadoComision=Funciones.GetFinalQueryAppend(finalQueryGlobalEstadoComision, "");
						finalQueryGlobalEstadoComision+=EstadoComisionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstadoComisionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstadoComision=" WHERE " + ConstantesSql.ID + "="+comisionmarcaSessionBean.getlidEstadoComisionActual();
					}
				} else {
					finalQueryGlobalEstadoComision="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				comisionmarcaReturnGeneral=comisionmarcaLogic.cargarCombosLoteForeignKeyComisionMarca(finalQueryGlobalEmpresa,finalQueryGlobalComisionConfig,finalQueryGlobalVendedor,finalQueryGlobalLinea,finalQueryGlobalLineaGrupo,finalQueryGlobalLineaCategoria,finalQueryGlobalLineaMarca,finalQueryGlobalEstadoComision);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=comisionmarcaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalComisionConfig.equals("NONE")) {
				this.comisionconfigsForeignKey=comisionmarcaReturnGeneral.getcomisionconfigsForeignKey();
			}

			if(!finalQueryGlobalVendedor.equals("NONE")) {
				this.vendedorsForeignKey=comisionmarcaReturnGeneral.getvendedorsForeignKey();
			}

			if(!finalQueryGlobalLinea.equals("NONE")) {
				this.lineasForeignKey=comisionmarcaReturnGeneral.getlineasForeignKey();
			}

			if(!finalQueryGlobalLineaGrupo.equals("NONE")) {
				this.lineagruposForeignKey=comisionmarcaReturnGeneral.getlineagruposForeignKey();
			}

			if(!finalQueryGlobalLineaCategoria.equals("NONE")) {
				this.lineacategoriasForeignKey=comisionmarcaReturnGeneral.getlineacategoriasForeignKey();
			}

			if(!finalQueryGlobalLineaMarca.equals("NONE")) {
				this.lineamarcasForeignKey=comisionmarcaReturnGeneral.getlineamarcasForeignKey();
			}

			if(!finalQueryGlobalEstadoComision.equals("NONE")) {
				this.estadocomisionsForeignKey=comisionmarcaReturnGeneral.getestadocomisionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyComisionMarca()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyComisionConfig();
			this.addItemDefectoCombosForeignKeyVendedor();
			this.addItemDefectoCombosForeignKeyLinea();
			this.addItemDefectoCombosForeignKeyLineaGrupo();
			this.addItemDefectoCombosForeignKeyLineaCategoria();
			this.addItemDefectoCombosForeignKeyLineaMarca();
			this.addItemDefectoCombosForeignKeyEstadoComision();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.comisionmarcaSessionBean==null) {
				this.comisionmarcaSessionBean=new ComisionMarcaSessionBean();
			}

			if(!this.comisionmarcaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.comisionmarcaSessionBean.getisBusquedaDesdeForeignKeySesionComisionConfig()) {
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

			if(!this.comisionmarcaSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
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

			if(!this.comisionmarcaSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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

	public void addItemDefectoCombosForeignKeyLineaGrupo()throws Exception {
		try {

			if(!this.comisionmarcaSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
				Linea lineagrupo=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineagrupo,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineagrupo.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineagruposForeignKey,lineagrupo,true)) {

					this.lineagruposForeignKey.add(0,lineagrupo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaCategoria()throws Exception {
		try {

			if(!this.comisionmarcaSessionBean.getisBusquedaDesdeForeignKeySesionLineaCategoria()) {
				Linea lineacategoria=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineacategoria,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineacategoria.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineacategoriasForeignKey,lineacategoria,true)) {

					this.lineacategoriasForeignKey.add(0,lineacategoria);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyLineaMarca()throws Exception {
		try {

			if(!this.comisionmarcaSessionBean.getisBusquedaDesdeForeignKeySesionLineaMarca()) {
				Linea lineamarca=new Linea();
				LineaConstantesFunciones.setLineaDescripcion(lineamarca,Constantes.SMENSAJE_ESCOJA_OPCION);
				lineamarca.setId(null);

				if(!LineaConstantesFunciones.ExisteEnLista(this.lineamarcasForeignKey,lineamarca,true)) {

					this.lineamarcasForeignKey.add(0,lineamarca);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstadoComision()throws Exception {
		try {

			if(!this.comisionmarcaSessionBean.getisBusquedaDesdeForeignKeySesionEstadoComision()) {
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
	
	public void initActionsCombosTodosForeignKeyComisionMarca()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyLinea("Todos");
			this.initActionsCombosForeignKeyLineaGrupo("Todos");
			this.initActionsCombosForeignKeyLineaCategoria("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyComisionMarca(String sFormularioTipoBusqueda)throws Exception {
		try {
			
			this.initActionsCombosForeignKeyLinea(sFormularioTipoBusqueda);
			this.initActionsCombosForeignKeyLineaGrupo(sFormularioTipoBusqueda);
			this.initActionsCombosForeignKeyLineaCategoria(sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyLinea(JComboBox jComboBoxLineaGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Linea lineaLocal=(Linea)jComboBoxLineaGenerico.getSelectedItem();

			if(lineaLocal!=null  && lineaLocal.getId()!=null  && lineaLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_linea="+lineaLocal.getId();
			}
			//REDEFINE

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboLineaGrupo=sFinalQueryCombo;

			this.lineagruposForeignKey=new ArrayList<Linea>();
			this.cargarCombosForeignKeyLineaGrupo(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyLineaGrupo(JComboBox jComboBoxLineaGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Linea lineaLocal=(Linea)jComboBoxLineaGenerico.getSelectedItem();

			if(lineaLocal!=null  && lineaLocal.getId()!=null  && lineaLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_linea_grupo="+lineaLocal.getId();
			}
			//REDEFINE

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboLineaCategoria=sFinalQueryCombo;

			this.lineacategoriasForeignKey=new ArrayList<Linea>();
			this.cargarCombosForeignKeyLineaCategoria(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void procesarActionsCombosForeignKeyLineaCategoria(JComboBox jComboBoxLineaGenerico,String sFormularioTipoBusqueda)throws Exception {
		try {
			String sFinalQueryCombo="";
			Linea lineaLocal=(Linea)jComboBoxLineaGenerico.getSelectedItem();

			if(lineaLocal!=null  && lineaLocal.getId()!=null  && lineaLocal.getId()>0) {
				sFinalQueryCombo="  WHERE  id_linea_categoria="+lineaLocal.getId();
			}
			//REDEFINE

			//COPIA PARA VENTANA BUSQUEDA
			this.sFinalQueryComboLineaMarca=sFinalQueryCombo;

			this.lineamarcasForeignKey=new ArrayList<Linea>();
			this.cargarCombosForeignKeyLineaMarca(true,false,false,sFinalQueryCombo,sFormularioTipoBusqueda);
		} catch(Exception e) {
			throw e;
		}
	}
	
	



	public void initActionsCombosForeignKeyLinea(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormComisionMarca!=null) {
						this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_lineaComisionMarca.addItemListener(new ComboBoxItemListener(this,"id_lineaComisionMarca"));
						this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_lineaComisionMarca.addFocusListener(new ComboBoxFocusListener(this,"id_lineaComisionMarca"));
					}
				} else {
					if(this.jInternalFrameDetalleFormComisionMarca!=null) {
						this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_lineaComisionMarca.addActionListener(new ComboBoxActionListener(this,"id_lineaComisionMarca"));
						this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_lineaComisionMarca.addFocusListener(new ComboBoxFocusListener(this,"id_lineaComisionMarca"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void initActionsCombosForeignKeyLineaGrupo(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormComisionMarca!=null) {
						this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_grupoComisionMarca.addItemListener(new ComboBoxItemListener(this,"id_linea_grupoComisionMarca"));
						this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_grupoComisionMarca.addFocusListener(new ComboBoxFocusListener(this,"id_linea_grupoComisionMarca"));
					}
				} else {
					if(this.jInternalFrameDetalleFormComisionMarca!=null) {
						this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_grupoComisionMarca.addActionListener(new ComboBoxActionListener(this,"id_linea_grupoComisionMarca"));
						this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_grupoComisionMarca.addFocusListener(new ComboBoxFocusListener(this,"id_linea_grupoComisionMarca"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void initActionsCombosForeignKeyLineaCategoria(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormComisionMarca!=null) {
						this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_categoriaComisionMarca.addItemListener(new ComboBoxItemListener(this,"id_linea_categoriaComisionMarca"));
						this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_categoriaComisionMarca.addFocusListener(new ComboBoxFocusListener(this,"id_linea_categoriaComisionMarca"));
					}
				} else {
					if(this.jInternalFrameDetalleFormComisionMarca!=null) {
						this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_categoriaComisionMarca.addActionListener(new ComboBoxActionListener(this,"id_linea_categoriaComisionMarca"));
						this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_categoriaComisionMarca.addFocusListener(new ComboBoxFocusListener(this,"id_linea_categoriaComisionMarca"));
					}
				}
			}

			if(sFormularioTipoBusqueda.equals("Todos")) {

				if(!this.conCargarMinimo) {
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesGlobalesCombosForeignKeyComisionMarca()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyComisionMarca();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyComisionMarca(ComisionMarca comisionmarca)throws Exception {	
		try {
			
			this.setActualComisionConfigForeignKey(comisionmarca.getid_comision_config(),false,"Formulario");
			this.setActualVendedorForeignKey(comisionmarca.getid_vendedor(),false,"Formulario");
			this.setActualLineaForeignKey(comisionmarca.getid_linea(),false,"Formulario");
			this.setActualLineaGrupoForeignKey(comisionmarca.getid_linea_grupo(),false,"Formulario");
			this.setActualLineaCategoriaForeignKey(comisionmarca.getid_linea_categoria(),false,"Formulario");
			this.setActualLineaMarcaForeignKey(comisionmarca.getid_linea_marca(),false,"Formulario");
			this.setActualEstadoComisionForeignKey(comisionmarca.getid_estado_comision(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyComisionMarca(ComisionMarca comisionmarca,String sTipoEvento)throws Exception {	
		try {
			
			

				if(comisionmarca.getVendedor()!=null && !sTipoEvento.equals("id_vendedorComisionMarca")) { //sTipoEvento Evita Bucle Infinito

					this.vendedorsForeignKey=new ArrayList<Vendedor>();
					this.vendedorsForeignKey.add(comisionmarca.getVendedor());

					this.addItemDefectoCombosForeignKeyVendedor();
					this.cargarCombosFrameVendedorsForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyComisionMarca()throws Exception {	
		try {
			
			this.setActualComisionConfigForeignKey(this.comisionmarcaConstantesFunciones.getid_comision_config(),false,"Formulario");
			this.setActualVendedorForeignKey(this.comisionmarcaConstantesFunciones.getid_vendedor(),false,"Formulario");
			this.setActualLineaForeignKey(this.comisionmarcaConstantesFunciones.getid_linea(),false,"Formulario");
			this.setActualLineaGrupoForeignKey(this.comisionmarcaConstantesFunciones.getid_linea_grupo(),false,"Formulario");
			this.setActualLineaCategoriaForeignKey(this.comisionmarcaConstantesFunciones.getid_linea_categoria(),false,"Formulario");
			this.setActualLineaMarcaForeignKey(this.comisionmarcaConstantesFunciones.getid_linea_marca(),false,"Formulario");
			this.setActualEstadoComisionForeignKey(this.comisionmarcaConstantesFunciones.getid_estado_comision(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyComisionMarca()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyComisionMarca()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyComisionMarca()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroComisionMarca()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyComisionMarca()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameComisionConfigsForeignKey("Todos");
			this.cargarCombosFrameVendedorsForeignKey("Todos");
			this.cargarCombosFrameLineasForeignKey("Todos");
			this.cargarCombosFrameLineaGruposForeignKey("Todos");
			this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
			this.cargarCombosFrameLineaMarcasForeignKey("Todos");
			this.cargarCombosFrameEstadoComisionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyComisionMarca(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameComisionConfigsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameVendedorsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstadoComisionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyComisionMarca()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_empresaComisionMarca!=null && this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_empresaComisionMarca.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_empresaComisionMarca.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_comision_configComisionMarca!=null && this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_comision_configComisionMarca.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_comision_configComisionMarca.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_vendedorComisionMarca!=null && this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_vendedorComisionMarca.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_vendedorComisionMarca.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_lineaComisionMarca!=null && this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_lineaComisionMarca.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_lineaComisionMarca.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_grupoComisionMarca!=null && this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_grupoComisionMarca.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_grupoComisionMarca.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_categoriaComisionMarca!=null && this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_categoriaComisionMarca.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_categoriaComisionMarca.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_marcaComisionMarca!=null && this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_marcaComisionMarca.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_marcaComisionMarca.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_estado_comisionComisionMarca!=null && this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_estado_comisionComisionMarca.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_estado_comisionComisionMarca.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	







	public void recargarFormComisionMarcaLinea(JComboBox<?> jComboBoxGenericoLinea,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormComisionMarcaid_linea_grupo(jComboBoxGenericoLinea,sFormularioTipoBusqueda,"Linea",false);
	}

	public void recargarFormComisionMarcaLineaGrupo(JComboBox<?> jComboBoxGenericoLinea,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormComisionMarcaid_linea_categoria(jComboBoxGenericoLinea,sFormularioTipoBusqueda,"LineaGrupo",false);
	}

	public void recargarFormComisionMarcaLineaCategoria(JComboBox<?> jComboBoxGenericoLinea,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormComisionMarcaid_linea_marca(jComboBoxGenericoLinea,sFormularioTipoBusqueda,"LineaCategoria",false);
	}




	
	



	public void recargarFormComisionMarcaid_linea_grupo(JComboBox<?> jComboBoxGenericoLinea,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Linea")){
				this.setActualParaGuardarLineaForeignKey(this.comisionmarca,jComboBoxGenericoLinea);
			}

			if(this.comisionmarca.getid_linea()!=null && this.comisionmarca.getid_linea()!=0L) {
				sFinalQuery+="  WHERE  id_linea="+this.comisionmarca.getid_linea();
			} else {
				sFinalQuery+="  WHERE  id_linea=-1";
			}



			//BUCLE RECURSIVO
			this.setActualLineaGrupoForeignKey(this.comisionmarca.getid_linea(),true,sFormularioTipoBusqueda);

			this.cargarCombosLineaGruposForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}



	public void recargarFormComisionMarcaid_linea_categoria(JComboBox<?> jComboBoxGenericoLinea,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("LineaGrupo")){
				this.setActualParaGuardarLineaGrupoForeignKey(this.comisionmarca,jComboBoxGenericoLinea);
			}

			if(this.comisionmarca.getid_linea_grupo()!=null && this.comisionmarca.getid_linea_grupo()!=0L) {
				sFinalQuery+="  WHERE  id_linea="+this.comisionmarca.getid_linea_grupo();
			} else {
				sFinalQuery+="  WHERE  id_linea=-1";
			}



			//BUCLE RECURSIVO
			this.setActualLineaCategoriaForeignKey(this.comisionmarca.getid_linea_grupo(),true,sFormularioTipoBusqueda);

			this.cargarCombosLineaCategoriasForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}



	public void recargarFormComisionMarcaid_linea_marca(JComboBox<?> jComboBoxGenericoLinea,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("LineaCategoria")){
				this.setActualParaGuardarLineaCategoriaForeignKey(this.comisionmarca,jComboBoxGenericoLinea);
			}

			if(this.comisionmarca.getid_linea_categoria()!=null && this.comisionmarca.getid_linea_categoria()!=0L) {
				sFinalQuery+="  WHERE  id_linea="+this.comisionmarca.getid_linea_categoria();
			} else {
				sFinalQuery+="  WHERE  id_linea=-1";
			}



			//BUCLE RECURSIVO
			this.setActualLineaMarcaForeignKey(this.comisionmarca.getid_linea_categoria(),true,sFormularioTipoBusqueda);

			this.cargarCombosLineaMarcasForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public ComisionMarcaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ComisionMarcaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ComisionMarcaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.comisionmarcaSessionBean=new ComisionMarcaSessionBean(); 
		this.comisionmarcaConstantesFunciones=new ComisionMarcaConstantesFunciones(); 
		this.comisionmarcaBean=new ComisionMarca();//(this.comisionmarcaConstantesFunciones); 		
		this.comisionmarcaReturnGeneral=new ComisionMarcaParameterReturnGeneral(); 
		
		this.comisionmarcaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comisionmarcaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ComisionMarcaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ComisionMarcaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ComisionMarcaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessComisionMarca(true);
			
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
			
			this.comisionmarcaConstantesFunciones=new ComisionMarcaConstantesFunciones(); 
			this.comisionmarcaBean=new ComisionMarca();//this.comisionmarcaConstantesFunciones); 			
			this.comisionmarcaReturnGeneral=new ComisionMarcaParameterReturnGeneral(); 
		
			ComisionMarcaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Comision Marca Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.comisionmarca=new ComisionMarca();
			this.comisionmarcas = new ArrayList<ComisionMarca>();
			this.comisionmarcasAux = new ArrayList<ComisionMarca>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic=new ComisionMarcaLogic();
				this.comisionmarcaLogic.getNewConnexionToDeep("");
			}
			
			//this.comisionmarcaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.comisionmarcaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormComisionMarca);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoComisionMarca!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoComisionMarca);	
					}
					
					if(this.jInternalFrameImportacionComisionMarca!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionComisionMarca);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByComisionMarca!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByComisionMarca);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormComisionMarca!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormComisionMarca);
				this.jInternalFrameDetalleFormComisionMarca.setVisible(false);
				this.jInternalFrameDetalleFormComisionMarca.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoComisionMarca!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoComisionMarca);
					this.jInternalFrameReporteDinamicoComisionMarca.setVisible(false);
					this.jInternalFrameReporteDinamicoComisionMarca.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionComisionMarca!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionComisionMarca);
					this.jInternalFrameImportacionComisionMarca.setVisible(false);
					this.jInternalFrameImportacionComisionMarca.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByComisionMarca!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByComisionMarca);
					this.jInternalFrameOrderByComisionMarca.setVisible(false);
					this.jInternalFrameOrderByComisionMarca.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idComisionMarcaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ComisionMarcaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.comisionmarcaReturnGeneral=new ComisionMarcaParameterReturnGeneral();
			
			this.comisionmarcaParameterGeneral=new ComisionMarcaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.comisionmarcaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ComisionMarcaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ComisionMarcaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.comisionmarcaSessionBean.getEsGuardarRelacionado(),this.comisionmarcaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ComisionMarcaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.comisionmarcaSessionBean.getEsGuardarRelacionado(),this.comisionmarcaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoComisionMarca=false;
			this.isVisibilidadCeldaDuplicarComisionMarca=true;
			this.isVisibilidadCeldaCopiarComisionMarca=true;
			this.isVisibilidadCeldaVerFormComisionMarca=true;
			this.isVisibilidadCeldaOrdenComisionMarca=true;
			this.isVisibilidadCeldaNuevoRelacionesComisionMarca=false;
			this.isVisibilidadCeldaModificarComisionMarca=false;
			this.isVisibilidadCeldaActualizarComisionMarca=false;
			this.isVisibilidadCeldaEliminarComisionMarca=false;
			this.isVisibilidadCeldaCancelarComisionMarca=false;
			this.isVisibilidadCeldaGuardarComisionMarca=false;
			this.isVisibilidadCeldaGuardarCambiosComisionMarca=false;
			
			
			this.isVisibilidadFK_IdComisionConfig=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstadoComision=true;
			this.isVisibilidadFK_IdLinea=true;
			this.isVisibilidadFK_IdLineaCategoria=true;
			this.isVisibilidadFK_IdLineaGrupo=true;
			this.isVisibilidadFK_IdLineaMarca=true;
			this.isVisibilidadFK_IdVendedor=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesComisionMarca("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosComisionMarca();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioComisionMarca(false);
			
			this.setPermisosUsuarioComisionMarca();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comisionmarcaSessionBean.getEsGuardarRelacionado() 
				|| (this.comisionmarcaSessionBean.getEsGuardarRelacionado() && this.comisionmarcaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioComisionMarcaClasesRelacionadas();
			}
			
			if(this.comisionmarcaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioComisionMarcaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosComisionMarca();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualComisionMarca();
			}
			
			if(!this.isPermisoBusquedaComisionMarca) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasComisionMarca.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioComisionMarca,this.isPermisoPaginacionMedioComisionMarca,this.isPermisoPaginacionTodoComisionMarca);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ComisionMarcaConstantesFunciones.getTiposSeleccionarComisionMarca());
				
				this.tiposColumnasSelect=ComisionMarcaConstantesFunciones.getTiposSeleccionarComisionMarca(true);
				
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
			//if(!this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioComisionMarca();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioComisionMarca(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioComisionMarca(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesComisionMarca() ;
			
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
			this.lineagrupoLogic=new LineaLogic();
			this.lineacategoriaLogic=new LineaLogic();
			this.lineamarcaLogic=new LineaLogic();
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
				comisionmarcaImplementable= (ComisionMarcaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ComisionMarcaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				comisionmarcaImplementableHome= (ComisionMarcaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ComisionMarcaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.comisionmarcas= new ArrayList<ComisionMarca>();
			this.comisionmarcasEliminados= new ArrayList<ComisionMarca>();
						
			this.isEsNuevoComisionMarca=false;
			this.esParaAccionDesdeFormularioComisionMarca=false;
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
			this.lineagruposForeignKey=new ArrayList<Linea>() ;
			this.lineacategoriasForeignKey=new ArrayList<Linea>() ;
			this.lineamarcasForeignKey=new ArrayList<Linea>() ;
			this.estadocomisionsForeignKey=new ArrayList<EstadoComision>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyComisionMarca(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroComisionMarca();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ComisionMarcaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ComisionMarcaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesComisionMarca("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingComisionMarca(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormComisionMarca!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioComisionMarca();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioComisionMarca();
			}
			
			ComisionMarcaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasComisionMarca.getTabCount(); i++) {
					this.jTabbedPaneBusquedasComisionMarca.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasComisionMarca.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessComisionMarca(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ComisionMarca: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectComisionMarca() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesComisionMarca")) {
				iIndex=this.jInternalFrameDetalleFormComisionMarca.jTabbedPaneRelacionesComisionMarca.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormComisionMarca.jTabbedPaneRelacionesComisionMarca.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessComisionMarca();	
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
	
	public void cargarCombosForeignKeyComisionMarca(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyComisionMarca(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyComisionMarca(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyComisionMarcaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyComisionMarca();
		
		this.cargarCombosFrameForeignKeyComisionMarca();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyComisionMarca();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyComisionMarca();
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
					this.initActionsCombosForeignKeyLinea("Todos");
				}

			this.recargarComboTablaLinea(this.lineasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaGrupo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyLineaGrupo("Todos");
				}

			this.recargarComboTablaLineaGrupo(this.lineagruposForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaCategoria(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaCategoriaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaCategoria();
				this.cargarCombosFrameLineaCategoriasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyLineaCategoria("Todos");
				}

			this.recargarComboTablaLineaCategoria(this.lineacategoriasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyLineaMarca(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyLineaMarcaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyLineaMarca();
				this.cargarCombosFrameLineaMarcasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
					this.initActionsCombosForeignKeyLineaCategoria("Todos");
				}

			this.recargarComboTablaLineaMarca(this.lineamarcasForeignKey);

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
					this.initActionsCombosForeignKeyLineaCategoria("Todos");
				}

			this.recargarComboTablaEstadoComision(this.estadocomisionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoComisionMarcaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.comisionmarcaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormComisionMarca==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
			
			
			if(jTableDatosComisionMarca.getRowCount()>=1) {
				jTableDatosComisionMarca.removeRowSelectionInterval(0, jTableDatosComisionMarca.getRowCount()-1);						
			}
			
			this.isEsNuevoComisionMarca=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoComisionMarca(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesComisionMarca(true);			
			//this.comisionmarca=new ComisionMarca();
			//this.comisionmarca.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComisionMarca(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisionMarca() ;
			
			if(ComisionMarcaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComisionMarca(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.comisionmarca);	
			this.actualizarInformacion("INFO_PADRE",false,this.comisionmarca);				
			
			ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
			
			if(this.comisionmarcaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ComisionMarca: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarComisionMarcaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ComisionMarca> comisionmarcasSeleccionados=new ArrayList<ComisionMarca>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosComisionMarca.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosComisionMarca.getSelectedRows().length;			
			}
			
			comisionmarcasSeleccionados=this.getComisionMarcasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoComisionMarca--;			
				//ComisionMarca comisionmarcaAux= new ComisionMarca();			
				//comisionmarcaAux.setId(this.iIdNuevoComisionMarca);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ComisionMarca comisionmarcaOrigen=new ComisionMarca();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ComisionMarca comisionmarcaOrigen : comisionmarcasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							comisionmarcaOrigen =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionmarcaOrigen =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaComisionMarca();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.comisionmarca.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosComisionMarca(comisionmarcaOrigen,this.comisionmarca,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.comisionmarcaLogic.getComisionMarcas().add(this.comisionmarcaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.comisionmarcas.add(this.comisionmarcaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaComisionMarca(false);
				
				this.jTableDatosComisionMarca.setRowSelectionInterval(this.getIndiceNuevoComisionMarca(), this.getIndiceNuevoComisionMarca());
				
				int iLastRow =  this.jTableDatosComisionMarca.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosComisionMarca.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosComisionMarca.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaComisionMarca(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarComisionMarcaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ComisionMarca> comisionmarcasSeleccionados=new ArrayList<ComisionMarca>();									
		
			ComisionMarca comisionmarcaOrigen=new ComisionMarca();
			ComisionMarca comisionmarcaDestino=new ComisionMarca();
				
			comisionmarcasSeleccionados=this.getComisionMarcasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosComisionMarca.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || comisionmarcasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosComisionMarca.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionmarcaOrigen =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						comisionmarcaOrigen =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionmarcaDestino =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						comisionmarcaDestino =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				comisionmarcaOrigen =comisionmarcasSeleccionados.get(0);
				comisionmarcaDestino =comisionmarcasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosComisionMarca(comisionmarcaOrigen,comisionmarcaDestino,true,false);
				
				comisionmarcaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(comisionmarcaDestino,comisionmarcaLogic.getComisionMarcas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisionmarcaDestino,comisionmarcas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaComisionMarca(false);
				
				//this.jTableDatosComisionMarca.setRowSelectionInterval(this.getIndiceNuevoComisionMarca(), this.getIndiceNuevoComisionMarca());
				
				int iLastRow =  this.jTableDatosComisionMarca.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosComisionMarca.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosComisionMarca.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaComisionMarca(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormComisionMarcaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormComisionMarca==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormComisionMarca.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarComisionMarcaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesComisionMarca.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasComisionMarca.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesComisionMarca.setVisible(!isVisible);
			this.jPanelPaginacionComisionMarca.setVisible(!isVisible);
			this.jPanelAccionesComisionMarca.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarComisionMarcaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameComisionMarca();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoComisionMarcaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoComisionMarca();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionComisionMarcaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionComisionMarca();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByComisionMarcaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByComisionMarca();
			
			this.abrirFrameOrderByComisionMarca();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByComisionMarcaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByComisionMarca();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleComisionMarca(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormComisionMarca);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormComisionMarca.isMaximum()) {
					this.jInternalFrameDetalleFormComisionMarca.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormComisionMarca.setSize(this.jInternalFrameDetalleFormComisionMarca.iWidthFormulario,this.jInternalFrameDetalleFormComisionMarca.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormComisionMarca.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormComisionMarca.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormComisionMarca.isMaximum()) {
						this.jInternalFrameDetalleFormComisionMarca.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormComisionMarca.jContentPaneDetalleComisionMarca.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormComisionMarca.jTabbedPaneRelacionesComisionMarca.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormComisionMarca.jContentPaneDetalleComisionMarca.getWidth(),ComisionMarcaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormComisionMarca.jTabbedPaneRelacionesComisionMarca.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormComisionMarca.jContentPaneDetalleComisionMarca.getWidth(),ComisionMarcaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormComisionMarca.jTabbedPaneRelacionesComisionMarca.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormComisionMarca.jContentPaneDetalleComisionMarca.getWidth(),ComisionMarcaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormComisionMarca.setVisible(true);
	        this.jInternalFrameDetalleFormComisionMarca.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByComisionMarca() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByComisionMarca==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByComisionMarca=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisionMarca,false,this);
				} else {
					this.jInternalFrameOrderByComisionMarca=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisionMarca,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByComisionMarca);
				this.jInternalFrameOrderByComisionMarca.setVisible(false);
				this.jInternalFrameOrderByComisionMarca.setSelected(false);
				
				this.jInternalFrameOrderByComisionMarca.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByComisionMarca"));
				
				this.inicializarActualizarBindingTablaOrderByComisionMarca();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionComisionMarca() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionComisionMarca==null) {
				
				this.jInternalFrameImportacionComisionMarca=new ImportacionJInternalFrame(ComisionMarcaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionComisionMarca);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionComisionMarca);
				this.jInternalFrameImportacionComisionMarca.setVisible(false);
				this.jInternalFrameImportacionComisionMarca.setSelected(false);


				this.jInternalFrameImportacionComisionMarca.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionComisionMarca"));
				this.jInternalFrameImportacionComisionMarca.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionComisionMarca"));
				this.jInternalFrameImportacionComisionMarca.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionComisionMarca"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoComisionMarca() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoComisionMarca==null) {
				this.jInternalFrameReporteDinamicoComisionMarca=new ReporteDinamicoJInternalFrame(ComisionMarcaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoComisionMarca);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoComisionMarca);
				this.jInternalFrameReporteDinamicoComisionMarca.setVisible(false);
				this.jInternalFrameReporteDinamicoComisionMarca.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoComisionMarca.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComisionMarca"));
				this.jInternalFrameReporteDinamicoComisionMarca.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComisionMarca"));
				this.jInternalFrameReporteDinamicoComisionMarca.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComisionMarca"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComisionMarca();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleComisionMarca() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormComisionMarca);
			
	       	this.jInternalFrameDetalleFormComisionMarca.setVisible(false);
	        this.jInternalFrameDetalleFormComisionMarca.setSelected(false);
			
			//this.jInternalFrameDetalleFormComisionMarca.dispose();
			//this.jInternalFrameDetalleFormComisionMarca=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoComisionMarca() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoComisionMarca.setVisible(true);
	        this.jInternalFrameReporteDinamicoComisionMarca.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionComisionMarca() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionComisionMarca.setVisible(true);
	        this.jInternalFrameImportacionComisionMarca.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByComisionMarca() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByComisionMarca.setVisible(true);
	        this.jInternalFrameOrderByComisionMarca.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByComisionMarca() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByComisionMarca.setVisible(false);
	        this.jInternalFrameOrderByComisionMarca.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoComisionMarca() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoComisionMarca.setVisible(false);
	        this.jInternalFrameReporteDinamicoComisionMarca.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionComisionMarca() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionComisionMarca.setVisible(false);
	        this.jInternalFrameImportacionComisionMarca.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderComisionMarca=(TitledBorder)this.jScrollPanelDatosComisionMarca.getBorder();
						TitledBorder titledBorderVendedor=(TitledBorder)vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

						titledBorderVendedor.setTitle(titledBorderComisionMarca.getTitle() + " -> Vendedor");


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
						TitledBorder titledBorderComisionMarca=(TitledBorder)this.jScrollPanelDatosComisionMarca.getBorder();
						TitledBorder titledBorderLinea=(TitledBorder)lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

						titledBorderLinea.setTitle(titledBorderComisionMarca.getTitle() + " -> Linea");


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

				public void abrirFrameTreeLineaGrupo(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeLinea);
						LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.sTipoBusqueda="LineaGrupo";
						}

						lineaBeanSwingJInternalFrame.getTodosLineaArbol();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setLineas(lineaBeanSwingJInternalFrame.lineasArbol);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.CargarTreeLinea();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setVisible(true);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.jInternalFrameParent=this;
						TitledBorder titledBorderComisionMarca=(TitledBorder)this.jScrollPanelDatosComisionMarca.getBorder();
						TitledBorder titledBorderLineaGrupo=(TitledBorder)lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

						titledBorderLineaGrupo.setTitle(titledBorderComisionMarca.getTitle() + " -> Linea");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,lineaBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(lineaBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeLineaGrupo(LineaBeanSwingJInternalFrame jInternalFrameTreeLinea) throws Exception {
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

				public void abrirFrameTreeLineaCategoria(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeLinea);
						LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.sTipoBusqueda="LineaCategoria";
						}

						lineaBeanSwingJInternalFrame.getTodosLineaArbol();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setLineas(lineaBeanSwingJInternalFrame.lineasArbol);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.CargarTreeLinea();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setVisible(true);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.jInternalFrameParent=this;
						TitledBorder titledBorderComisionMarca=(TitledBorder)this.jScrollPanelDatosComisionMarca.getBorder();
						TitledBorder titledBorderLineaCategoria=(TitledBorder)lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

						titledBorderLineaCategoria.setTitle(titledBorderComisionMarca.getTitle() + " -> Linea");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,lineaBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(lineaBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeLineaCategoria(LineaBeanSwingJInternalFrame jInternalFrameTreeLinea) throws Exception {
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

				public void abrirFrameTreeLineaMarca(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeLinea);
						LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.sTipoBusqueda="LineaMarca";
						}

						lineaBeanSwingJInternalFrame.getTodosLineaArbol();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setLineas(lineaBeanSwingJInternalFrame.lineasArbol);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.CargarTreeLinea();
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setVisible(true);
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						lineaBeanSwingJInternalFrame.jInternalFrameTreeLinea.jInternalFrameParent=this;
						TitledBorder titledBorderComisionMarca=(TitledBorder)this.jScrollPanelDatosComisionMarca.getBorder();
						TitledBorder titledBorderLineaMarca=(TitledBorder)lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

						titledBorderLineaMarca.setTitle(titledBorderComisionMarca.getTitle() + " -> Linea");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,lineaBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(lineaBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeLineaMarca(LineaBeanSwingJInternalFrame jInternalFrameTreeLinea) throws Exception {
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
	
	public void jButtonModificarComisionMarcaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarComisionMarca(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarComisionMarca(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesComisionMarca(true);
			//this.isEsNuevoComisionMarca=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarca =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comisionmarca =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesComisionMarca("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComisionMarca(false) ;
			
			if(comisionmarcaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ComisionMarcaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComisionMarca(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisionMarca(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaComisionMarcaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarca =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionmarca =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarComisionMarca(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormComisionMarca==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesComisionMarca(true);
			//this.isEsNuevoComisionMarca=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarca =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comisionmarca =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.comisionmarca.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesComisionMarca("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesComisionMarca(false) ;
			
			if(ComisionMarcaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComisionMarca(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisionMarca(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Vendedor")) {
				if(!this.comisionmarcaConstantesFunciones.cargarid_vendedorComisionMarca) {
					this.cargarCombosVendedorsForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingComisionMarca(false,false);
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
		TableColumn tableColumnComisionConfig=this.jTableDatosComisionMarca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionMarca,ComisionMarcaConstantesFunciones.LABEL_IDCOMISIONCONFIG));
		TableCellEditor tableCellEditorComisionConfig =tableColumnComisionConfig.getCellEditor();

		ComisionConfigTableCell comisionconfigTableCellFk=(ComisionConfigTableCell)tableCellEditorComisionConfig;

		if(comisionconfigTableCellFk!=null) {
			comisionconfigTableCellFk.setcomisionconfigsForeignKey(comisionconfigsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComisionMarca.getSelectedRow();

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
		TableColumn tableColumnVendedor=this.jTableDatosComisionMarca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionMarca,ComisionMarcaConstantesFunciones.LABEL_IDVENDEDOR));
		TableCellEditor tableCellEditorVendedor =tableColumnVendedor.getCellEditor();

		VendedorTableCell vendedorTableCellFk=(VendedorTableCell)tableCellEditorVendedor;

		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.setvendedorsForeignKey(vendedorsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComisionMarca.getSelectedRow();

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
		TableColumn tableColumnLinea=this.jTableDatosComisionMarca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionMarca,ComisionMarcaConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComisionMarca.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaGrupo(List<Linea> lineagruposForeignKey)throws Exception{
		TableColumn tableColumnLineaGrupo=this.jTableDatosComisionMarca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionMarca,ComisionMarcaConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComisionMarca.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineagruposForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaCategoria(List<Linea> lineacategoriasForeignKey)throws Exception{
		TableColumn tableColumnLineaCategoria=this.jTableDatosComisionMarca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionMarca,ComisionMarcaConstantesFunciones.LABEL_IDLINEACATEGORIA));
		TableCellEditor tableCellEditorLineaCategoria =tableColumnLineaCategoria.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaCategoria;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineacategoriasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComisionMarca.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineacategoriasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaLineaMarca(List<Linea> lineamarcasForeignKey)throws Exception{
		TableColumn tableColumnLineaMarca=this.jTableDatosComisionMarca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionMarca,ComisionMarcaConstantesFunciones.LABEL_IDLINEAMARCA));
		TableCellEditor tableCellEditorLineaMarca =tableColumnLineaMarca.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaMarca;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineamarcasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComisionMarca.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineamarcasForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstadoComision(List<EstadoComision> estadocomisionsForeignKey)throws Exception{
		TableColumn tableColumnEstadoComision=this.jTableDatosComisionMarca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionMarca,ComisionMarcaConstantesFunciones.LABEL_IDESTADOCOMISION));
		TableCellEditor tableCellEditorEstadoComision =tableColumnEstadoComision.getCellEditor();

		EstadoComisionTableCell estadocomisionTableCellFk=(EstadoComisionTableCell)tableCellEditorEstadoComision;

		if(estadocomisionTableCellFk!=null) {
			estadocomisionTableCellFk.setestadocomisionsForeignKey(estadocomisionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComisionMarca.getSelectedRow();

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
	
	public void jButtonActualizarComisionMarcaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesComisionMarca(false);
			
			//if(!this.isEsNuevoComisionMarca) {								
				int intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarca =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionmarca =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ComisionMarcaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualComisionMarca(this.comisionmarca,true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);
				
			}
			
			if(this.permiteMantenimiento(this.comisionmarca)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoComisionMarca=true;
					this.inicializarActualizarBindingTablaComisionMarca(false);
					this.isEsNuevoComisionMarca=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoComisionMarca=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoComisionMarca=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesComisionMarca(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComisionMarca(false);
				
				this.habilitarDeshabilitarControlesComisionMarca(false);
			
												
				
				if(ComisionMarcaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleComisionMarca();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoComisionMarcaActionPerformed(evt,comisionmarcaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualComisionMarca(this.comisionmarca,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosComisionMarca.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,comisionmarcaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.comisionmarca.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ComisionMarca.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionMarca.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarComisionMarcaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarca =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				this.comisionmarca.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comisionmarca =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				this.comisionmarca.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.comisionmarca)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ComisionMarcaModel) this.jTableDatosComisionMarca.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoComisionMarca=true;
				this.inicializarActualizarBindingTablaComisionMarca(false);
				this.isEsNuevoComisionMarca=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesComisionMarca(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComisionMarca(false);
				
				this.habilitarDeshabilitarControlesComisionMarca(false);
				
				
				
				if(ComisionMarcaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleComisionMarca();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarComisionMarcaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosComisionMarca.getRowCount()>=1) {
				jTableDatosComisionMarca.removeRowSelectionInterval(0, jTableDatosComisionMarca.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesComisionMarca(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaComisionMarca(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComisionMarca(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisionMarca(false) ;
			
			this.isEsNuevoComisionMarca=false;
			
			if(ComisionMarcaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleComisionMarca();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosComisionMarcaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingComisionMarca(false);
				
				//SI ES MANUAL
				if(ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualComisionMarca();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosComisionMarcaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoComisionMarca--;			
			//ComisionMarca comisionmarcaAux= new ComisionMarca();			
			//comisionmarcaAux.setId(this.iIdNuevoComisionMarca);
			
			if(this.jInternalFrameDetalleFormComisionMarca==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaComisionMarca();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);
			
			this.comisionmarca.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.comisionmarcaLogic.getComisionMarcas().add(this.comisionmarcaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.comisionmarcas.add(this.comisionmarcaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaComisionMarca(false);
			
			this.jTableDatosComisionMarca.setRowSelectionInterval(this.getIndiceNuevoComisionMarca(), this.getIndiceNuevoComisionMarca());
			
			int iLastRow =  this.jTableDatosComisionMarca.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosComisionMarca.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosComisionMarca.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaComisionMarca(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionComisionMarcaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingComisionMarca(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisionMarca(false);
			
			//SI ES MANUAL
			if(ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComisionMarca();
			}
			
			//this.abrirFrameTreeComisionMarca();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionComisionMarcaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Comision MarcaS ?", "MANTENIMIENTO DE Comision Marca", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionComisionMarca.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralComisionMarca();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.comisionmarcaReturnGeneral=comisionmarcaLogic.procesarImportacionComisionMarcasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.comisionmarcaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarComisionMarcaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionComisionMarcaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionComisionMarca.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionComisionMarca.setFileImportacion(this.jInternalFrameImportacionComisionMarca.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionComisionMarca.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionComisionMarca.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionComisionMarca.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionComisionMarca.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoComisionMarcaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ComisionMarca> comisionmarcasSeleccionados=new ArrayList<ComisionMarca>();		

		comisionmarcasSeleccionados=this.getComisionMarcasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisionMarca.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisionMarca.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ComisionMarcaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ComisionMarcaBaseDesign.jrxml";
			
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
			
			this.generarReporteComisionMarcas("Todos",comisionmarcasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Marca",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoComisionMarca.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionMarca.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ComisionMarcaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDCOMISIONCONFIG:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ComisionConfig_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ComisionConfig_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ComisionConfig_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ComisionConfig_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDVENDEDOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Vendedor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Vendedor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Vendedor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Vendedor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDLINEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Linea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Linea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Linea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Linea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDLINEAGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_LineaGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_LineaGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_LineaGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_LineaGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_LineaCategoria_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_LineaCategoria_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_LineaCategoria_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_LineaCategoria_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDLINEAMARCA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_LineaMarca_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_LineaMarca_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_LineaMarca_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_LineaMarca_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDESTADOCOMISION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EstadoComision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EstadoComision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EstadoComision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EstadoComision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionMarcaConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionMarcaConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoComisionMarca.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoComisionMarca.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoComisionMarca.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ComisionMarcaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDCOMISIONCONFIG:
					sNombreCampoCategoria="id_comision_config";
					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDVENDEDOR:
					sNombreCampoCategoria="id_vendedor";
					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDLINEA:
					sNombreCampoCategoria="id_linea";
					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDLINEAGRUPO:
					sNombreCampoCategoria="id_linea_grupo";
					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDLINEACATEGORIA:
					sNombreCampoCategoria="id_linea_categoria";
					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDLINEAMARCA:
					sNombreCampoCategoria="id_linea_marca";
					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDESTADOCOMISION:
					sNombreCampoCategoria="id_estado_comision";
					break;

				case ComisionMarcaConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case ComisionMarcaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoComisionMarca.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ComisionMarcaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDCOMISIONCONFIG:
					sNombreCampoCategoriaValor="id_comision_config";
					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDVENDEDOR:
					sNombreCampoCategoriaValor="id_vendedor";
					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDLINEA:
					sNombreCampoCategoriaValor="id_linea";
					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDLINEAGRUPO:
					sNombreCampoCategoriaValor="id_linea_grupo";
					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDLINEACATEGORIA:
					sNombreCampoCategoriaValor="id_linea_categoria";
					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDLINEAMARCA:
					sNombreCampoCategoriaValor="id_linea_marca";
					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDESTADOCOMISION:
					sNombreCampoCategoriaValor="id_estado_comision";
					break;

				case ComisionMarcaConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case ComisionMarcaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoComisionMarca.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionMarca.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ComisionMarcaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDCOMISIONCONFIG:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Configuracion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_comision_config");
					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDVENDEDOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Vendedor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_vendedor");
					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDLINEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea");
					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDLINEAGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea_grupo");
					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDLINEACATEGORIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea Categoria",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea_categoria");
					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDLINEAMARCA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea Marca",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea_marca");
					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDESTADOCOMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estado_comision");
					break;

				case ComisionMarcaConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case ComisionMarcaConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoComisionMarcaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ComisionMarca> comisionmarcasSeleccionados=new ArrayList<ComisionMarca>();		
		
		comisionmarcasSeleccionados=this.getComisionMarcasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionmarca";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ComisionMarcas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoComisionMarca.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionMarca.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ComisionMarcaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ComisionMarca comisionmarca:comisionmarcasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionmarca.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDCOMISIONCONFIG:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_IDCOMISIONCONFIG);
					iRow++;

					for(ComisionMarca comisionmarca:comisionmarcasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionmarca.getcomisionconfig_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDVENDEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_IDVENDEDOR);
					iRow++;

					for(ComisionMarca comisionmarca:comisionmarcasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionmarca.getvendedor_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(ComisionMarca comisionmarca:comisionmarcasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionmarca.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(ComisionMarca comisionmarca:comisionmarcasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionmarca.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDLINEACATEGORIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_IDLINEACATEGORIA);
					iRow++;

					for(ComisionMarca comisionmarca:comisionmarcasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionmarca.getlineacategoria_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDLINEAMARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_IDLINEAMARCA);
					iRow++;

					for(ComisionMarca comisionmarca:comisionmarcasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionmarca.getlineamarca_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionMarcaConstantesFunciones.LABEL_IDESTADOCOMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_IDESTADOCOMISION);
					iRow++;

					for(ComisionMarca comisionmarca:comisionmarcasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionmarca.getestadocomision_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionMarcaConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(ComisionMarca comisionmarca:comisionmarcasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionmarca.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionMarcaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ComisionMarca comisionmarca:comisionmarcasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionmarca.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelComisionMarca(row);				
			//	iRow++;
			//}				
			
			//for(ComisionMarca comisionmarcaAux:comisionmarcasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelComisionMarca(comisionmarcaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Marca",JOptionPane.INFORMATION_MESSAGE);
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
				this.comisionmarcaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisionMarca(false);
			
			//SI ES MANUAL
			if(ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComisionMarca();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresComisionMarcaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisionMarca(false);
			
			//SI ES MANUAL
			if(ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualComisionMarca();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesComisionMarcaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisionMarca(false);
			
			//SI ES MANUAL
			if(ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualComisionMarca();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaComisionMarca() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosComisionMarca.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosComisionMarca.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosComisionMarca.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosComisionMarca.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosComisionMarca.setMinimumSize(dimensionMinimum);
		this.jTableDatosComisionMarca.setMaximumSize(dimensionMaximum);
		this.jTableDatosComisionMarca.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingComisionMarca(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingComisionMarca(esInicializar,true);
	}
	
	public void inicializarActualizarBindingComisionMarca(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaComisionMarca(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesComisionMarca(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasComisionMarca(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesComisionMarca(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesComisionMarca(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ComisionMarcaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualComisionMarca() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaComisionMarca();
		
		this.inicializarActualizarBindingBotonesManualComisionMarca(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualComisionMarca();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesComisionMarca() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualComisionMarca(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualComisionMarca(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosComisionMarca.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosComisionMarca.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteComisionMarca.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormComisionMarca!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormComisionMarca.jCheckBoxPostAccionNuevoComisionMarca.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormComisionMarca.jCheckBoxPostAccionSinCerrarComisionMarca.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormComisionMarca.jCheckBoxPostAccionSinMensajeComisionMarca.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosComisionMarca.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosComisionMarca.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteComisionMarca.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormComisionMarca!=null) {
				this.jInternalFrameDetalleFormComisionMarca.jCheckBoxPostAccionNuevoComisionMarca.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormComisionMarca.jCheckBoxPostAccionSinCerrarComisionMarca.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormComisionMarca.jCheckBoxPostAccionSinMensajeComisionMarca.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionComisionMarca.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionComisionMarca.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormComisionMarca!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormComisionMarca.jComboBoxTiposAccionesFormularioComisionMarca.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesComisionMarca.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoComisionMarca!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisionMarca.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesComisionMarca.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesComisionMarca.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarComisionMarca.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesComisionMarca.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoComisionMarca!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisionMarca.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesComisionMarca.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralComisionMarca.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesComisionMarca(Boolean esInicializar) throws Exception {
		try	{	
			if(ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualComisionMarca(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesComisionMarca() throws Exception {
		try	{
			if(ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualComisionMarca();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleComisionMarca() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormComisionMarca.jComboBoxTiposAccionesFormularioComisionMarca.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormComisionMarca.jComboBoxTiposAccionesFormularioComisionMarca.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualComisionMarca() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesComisionMarca.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesComisionMarca.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesComisionMarca.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesComisionMarca.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesComisionMarca.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesComisionMarca.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionComisionMarca.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionComisionMarca.addItem(reporte);
			}
			
			
			if(!this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionComisionMarca.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionComisionMarca.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesComisionMarca.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesComisionMarca.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesComisionMarca.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesComisionMarca.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormComisionMarca!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormComisionMarca.jComboBoxTiposAccionesFormularioComisionMarca.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormComisionMarca.jComboBoxTiposAccionesFormularioComisionMarca.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarComisionMarca.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarComisionMarca.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarComisionMarca.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComisionMarca();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComisionMarca() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoComisionMarca!=null) {
				this.jInternalFrameReporteDinamicoComisionMarca.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoComisionMarca.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoComisionMarca!=null) {
				this.jInternalFrameReporteDinamicoComisionMarca.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoComisionMarca.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoComisionMarca!=null) {
				
				if(this.jInternalFrameReporteDinamicoComisionMarca.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoComisionMarca.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComisionMarca.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoComisionMarca.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoComisionMarca.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComisionMarca.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoComisionMarca.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoComisionMarca.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ComisionMarcaConstantesFunciones.getTiposSeleccionarComisionMarca(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoComisionMarca.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoComisionMarca.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoComisionMarca.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ComisionMarcaConstantesFunciones.getTiposSeleccionarComisionMarca(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoComisionMarca.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoComisionMarca.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoComisionMarca.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ComisionMarcaConstantesFunciones.getTiposSeleccionarComisionMarca(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComisionMarca.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoComisionMarca.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoComisionMarca.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoComisionMarca.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualComisionMarca()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_comision_configFK_IdComisionConfigComisionMarca.getSelectedItem()!=null){this.id_comision_configFK_IdComisionConfig=((ComisionConfig)this.jComboBoxid_comision_configFK_IdComisionConfigComisionMarca.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasComisionMarca(Boolean esInicializar) throws Exception {				
		if(ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualComisionMarca();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaComisionMarca() throws Exception {
		this.inicializarActualizarBindingTablaComisionMarca(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByComisionMarca() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByComisionMarca.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByComisionMarca.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComisionMarca.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ComisionMarcaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByComisionMarca.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComisionMarca.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ComisionMarcaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosComisionMarcaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionMarcaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ComisionMarcaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByComisionMarca.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComisionMarca.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ComisionMarcaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByComisionMarca.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaComisionMarca(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=comisionmarcaLogic.getComisionMarcas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=comisionmarcas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ComisionMarcaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosComisionMarca.setModel(new ComisionMarcaModel(this.comisionmarcaLogic.getComisionMarcas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosComisionMarca.setModel(new ComisionMarcaModel(this.comisionmarcas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByComisionMarca!=null && this.jInternalFrameOrderByComisionMarca.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByComisionMarca();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosComisionMarca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionMarca,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ComisionMarcaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO,comisionmarcaConstantesFunciones.resaltarSeleccionarComisionMarca,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ComisionMarcaConstantesFunciones.SCLASSWEBTITULO,comisionmarcaConstantesFunciones.resaltarSeleccionarComisionMarca,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosComisionMarca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionMarca,ComisionMarcaConstantesFunciones.LABEL_ID));

		if(this.comisionmarcaConstantesFunciones.mostraridComisionMarca && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionMarcaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comisionmarcaConstantesFunciones.resaltaridComisionMarca,this.comisionmarcaConstantesFunciones.activaridComisionMarca,iSizeTabla,this,true,"idComisionMarca","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisionmarcaConstantesFunciones.resaltaridComisionMarca,this.comisionmarcaConstantesFunciones.activaridComisionMarca,this,true,"idComisionMarca","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionMarca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionMarca,ComisionMarcaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.comisionmarcaConstantesFunciones.mostrarid_empresaComisionMarca && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionMarcaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.comisionmarcaConstantesFunciones.resaltarid_empresaComisionMarca,this,this.comisionmarcaConstantesFunciones.activarid_empresaComisionMarca,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.comisionmarcaConstantesFunciones.resaltarid_empresaComisionMarca,this,this.comisionmarcaConstantesFunciones.activarid_empresaComisionMarca,false,"id_empresaComisionMarca","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionMarcaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionMarca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionMarca,ComisionMarcaConstantesFunciones.LABEL_IDCOMISIONCONFIG));

		if(this.comisionmarcaConstantesFunciones.mostrarid_comision_configComisionMarca && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionMarcaConstantesFunciones.LABEL_IDCOMISIONCONFIG,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ComisionConfigTableCell(this.comisionconfigsForeignKey,this.comisionmarcaConstantesFunciones.resaltarid_comision_configComisionMarca,this,this.comisionmarcaConstantesFunciones.activarid_comision_configComisionMarca,iSizeTabla));
			tableColumn.setCellEditor(new ComisionConfigTableCell(this.comisionconfigsForeignKey,this.comisionmarcaConstantesFunciones.resaltarid_comision_configComisionMarca,this,this.comisionmarcaConstantesFunciones.activarid_comision_configComisionMarca,true,"id_comision_configComisionMarca","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionMarcaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionMarca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionMarca,ComisionMarcaConstantesFunciones.LABEL_IDVENDEDOR));

		if(this.comisionmarcaConstantesFunciones.mostrarid_vendedorComisionMarca && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionMarcaConstantesFunciones.LABEL_IDVENDEDOR,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new VendedorTableCell(this.vendedorsForeignKey,this.comisionmarcaConstantesFunciones.resaltarid_vendedorComisionMarca,this,this.comisionmarcaConstantesFunciones.activarid_vendedorComisionMarca,iSizeTabla));
			tableColumn.setCellEditor(new VendedorTableCell(this.vendedorsForeignKey,this.comisionmarcaConstantesFunciones.resaltarid_vendedorComisionMarca,this,this.comisionmarcaConstantesFunciones.activarid_vendedorComisionMarca,true,"id_vendedorComisionMarca","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionMarcaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionMarca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionMarca,ComisionMarcaConstantesFunciones.LABEL_IDLINEA));

		if(this.comisionmarcaConstantesFunciones.mostrarid_lineaComisionMarca && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionMarcaConstantesFunciones.LABEL_IDLINEA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineasForeignKey,this.comisionmarcaConstantesFunciones.resaltarid_lineaComisionMarca,this,this.comisionmarcaConstantesFunciones.activarid_lineaComisionMarca,iSizeTabla));
			tableColumn.setCellEditor(new LineaTableCell(this.lineasForeignKey,this.comisionmarcaConstantesFunciones.resaltarid_lineaComisionMarca,this,this.comisionmarcaConstantesFunciones.activarid_lineaComisionMarca,true,"id_lineaComisionMarca","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionMarcaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionMarca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionMarca,ComisionMarcaConstantesFunciones.LABEL_IDLINEAGRUPO));

		if(this.comisionmarcaConstantesFunciones.mostrarid_linea_grupoComisionMarca && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionMarcaConstantesFunciones.LABEL_IDLINEAGRUPO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineagruposForeignKey,this.comisionmarcaConstantesFunciones.resaltarid_linea_grupoComisionMarca,this,this.comisionmarcaConstantesFunciones.activarid_linea_grupoComisionMarca,iSizeTabla));
			tableColumn.setCellEditor(new LineaTableCell(this.lineagruposForeignKey,this.comisionmarcaConstantesFunciones.resaltarid_linea_grupoComisionMarca,this,this.comisionmarcaConstantesFunciones.activarid_linea_grupoComisionMarca,true,"id_linea_grupoComisionMarca","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionMarcaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionMarca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionMarca,ComisionMarcaConstantesFunciones.LABEL_IDLINEACATEGORIA));

		if(this.comisionmarcaConstantesFunciones.mostrarid_linea_categoriaComisionMarca && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionMarcaConstantesFunciones.LABEL_IDLINEACATEGORIA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineacategoriasForeignKey,this.comisionmarcaConstantesFunciones.resaltarid_linea_categoriaComisionMarca,this,this.comisionmarcaConstantesFunciones.activarid_linea_categoriaComisionMarca,iSizeTabla));
			tableColumn.setCellEditor(new LineaTableCell(this.lineacategoriasForeignKey,this.comisionmarcaConstantesFunciones.resaltarid_linea_categoriaComisionMarca,this,this.comisionmarcaConstantesFunciones.activarid_linea_categoriaComisionMarca,true,"id_linea_categoriaComisionMarca","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionMarcaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionMarca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionMarca,ComisionMarcaConstantesFunciones.LABEL_IDLINEAMARCA));

		if(this.comisionmarcaConstantesFunciones.mostrarid_linea_marcaComisionMarca && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionMarcaConstantesFunciones.LABEL_IDLINEAMARCA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineamarcasForeignKey,this.comisionmarcaConstantesFunciones.resaltarid_linea_marcaComisionMarca,this,this.comisionmarcaConstantesFunciones.activarid_linea_marcaComisionMarca,iSizeTabla));
			tableColumn.setCellEditor(new LineaTableCell(this.lineamarcasForeignKey,this.comisionmarcaConstantesFunciones.resaltarid_linea_marcaComisionMarca,this,this.comisionmarcaConstantesFunciones.activarid_linea_marcaComisionMarca,true,"id_linea_marcaComisionMarca","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionMarcaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionMarca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionMarca,ComisionMarcaConstantesFunciones.LABEL_IDESTADOCOMISION));

		if(this.comisionmarcaConstantesFunciones.mostrarid_estado_comisionComisionMarca && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionMarcaConstantesFunciones.LABEL_IDESTADOCOMISION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstadoComisionTableCell(this.estadocomisionsForeignKey,this.comisionmarcaConstantesFunciones.resaltarid_estado_comisionComisionMarca,this,this.comisionmarcaConstantesFunciones.activarid_estado_comisionComisionMarca,iSizeTabla));
			tableColumn.setCellEditor(new EstadoComisionTableCell(this.estadocomisionsForeignKey,this.comisionmarcaConstantesFunciones.resaltarid_estado_comisionComisionMarca,this,this.comisionmarcaConstantesFunciones.activarid_estado_comisionComisionMarca,true,"id_estado_comisionComisionMarca","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionMarcaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionMarca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionMarca,ComisionMarcaConstantesFunciones.LABEL_PORCENTAJE));

		if(this.comisionmarcaConstantesFunciones.mostrarporcentajeComisionMarca && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionMarcaConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comisionmarcaConstantesFunciones.resaltarporcentajeComisionMarca,this.comisionmarcaConstantesFunciones.activarporcentajeComisionMarca,iSizeTabla,this,true,"porcentajeComisionMarca","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisionmarcaConstantesFunciones.resaltarporcentajeComisionMarca,this.comisionmarcaConstantesFunciones.activarporcentajeComisionMarca,this,true,"porcentajeComisionMarca","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComisionMarcaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionMarca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionMarca,ComisionMarcaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.comisionmarcaConstantesFunciones.mostrardescripcionComisionMarca && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionMarcaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comisionmarcaConstantesFunciones.resaltardescripcionComisionMarca,this.comisionmarcaConstantesFunciones.activardescripcionComisionMarca,iSizeTabla,this,true,"descripcionComisionMarca","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisionmarcaConstantesFunciones.resaltardescripcionComisionMarca,this.comisionmarcaConstantesFunciones.activardescripcionComisionMarca,this,true,"descripcionComisionMarca","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionMarcaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.comisionmarcaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.comisionmarcaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.comisionmarcaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosComisionMarca.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.comisionmarcaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.comisionmarcaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosComisionMarca.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarComisionMarca && this.isPermisoGuardarCambiosComisionMarca) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.comisionmarcaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.comisionmarcaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosComisionMarca.addColumn(tableColumn);
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
			
			this.jTableDatosComisionMarca.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarComisionMarca && this.isPermisoGuardarCambiosComisionMarca) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarComisionMarca && this.isPermisoGuardarCambiosComisionMarca) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosComisionMarca.moveColumn(this.jTableDatosComisionMarca.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosComisionMarca.moveColumn(this.jTableDatosComisionMarca.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosComisionMarca.moveColumn(this.jTableDatosComisionMarca.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosComisionMarca.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosComisionMarca.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosComisionMarca,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ComisionMarcaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosComisionMarca.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosComisionMarca.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ComisionMarcaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ComisionMarcaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosComisionMarca.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosComisionMarca.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosComisionMarca.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=comisionmarcaLogic.getComisionMarcas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=comisionmarcas.size()-1;
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
		//this.jTableDatosComisionMarca.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosComisionMarca.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosComisionMarca();
			
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
				
				//this.isEsNuevoComisionMarca=false;
					
				ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
			
				if(this.comisionmarcaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormComisionMarca==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosComisionMarca.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosComisionMarca.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarca =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionmarca =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.comisionmarca.getsType().equals("DUPLICADO")
				   || this.comisionmarca.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoComisionMarca=true;
				
				} else {
					this.isEsNuevoComisionMarca=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
					if(this.comisionmarca.getId()>=0 && !this.comisionmarca.getIsNew()) {						
						this.isEsNuevoComisionMarca=false;
						
					} else {
						this.isEsNuevoComisionMarca=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoComisionMarca(esRelaciones);						
				
				this.seleccionarComisionMarca(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.comisionmarca.getId()<0) {
					this.isEsNuevoComisionMarca=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarComisionMarca(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarComisionMarca(evt,rowIndex);
				}	
				
				if(this.comisionmarcaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ComisionMarca: " + this.dDif); 
					}
				}								
				
				ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarComisionMarca(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.comisionmarca)) {
					if(this.comisionmarca.getId()>0) {
						this.comisionmarca.setIsDeleted(true);
						
						this.comisionmarcasEliminados.add(this.comisionmarca);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.comisionmarcaLogic.getComisionMarcas().remove(this.comisionmarca);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.comisionmarcas.remove(this.comisionmarca);				
					}
					
					
					((ComisionMarcaModel) this.jTableDatosComisionMarca.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaComisionMarca(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarComisionMarca(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoComisionMarca) {
			
			if(this.jInternalFrameDetalleFormComisionMarca==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosComisionMarca.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosComisionMarca.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarca =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionmarca =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ComisionMarcaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioComisionMarca(this.comisionmarca);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.comisionmarcaConstantesFunciones.cargarid_empresaComisionMarca || this.comisionmarcaConstantesFunciones.event_dependid_empresaComisionMarca) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.comisionmarca.getid_empresa());
									//this.inicializarActualizarBindingComisionMarca(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(comisionmarca.getEmpresa()!=null) {
							this.empresasForeignKey.add(comisionmarca.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.comisionmarca.getid_empresa(),false,"Formulario");

					//ComisionConfig
					if(!this.comisionmarcaConstantesFunciones.cargarid_comision_configComisionMarca || this.comisionmarcaConstantesFunciones.event_dependid_comision_configComisionMarca) {
						//this.cargarCombosComisionConfigsForeignKeyLista(" where id="+this.comisionmarca.getid_comision_config());
									//this.inicializarActualizarBindingComisionMarca(false,false);
						this.comisionconfigsForeignKey=new ArrayList<ComisionConfig>();

						if(comisionmarca.getComisionConfig()!=null) {
							this.comisionconfigsForeignKey.add(comisionmarca.getComisionConfig());
						}

						this.addItemDefectoCombosForeignKeyComisionConfig();
						this.cargarCombosFrameComisionConfigsForeignKey("Todos");
					}
					this.setActualComisionConfigForeignKey(this.comisionmarca.getid_comision_config(),false,"Formulario");

					//Vendedor
					if(!this.comisionmarcaConstantesFunciones.cargarid_vendedorComisionMarca || this.comisionmarcaConstantesFunciones.event_dependid_vendedorComisionMarca) {
						//this.cargarCombosVendedorsForeignKeyLista(" where id="+this.comisionmarca.getid_vendedor());
									//this.inicializarActualizarBindingComisionMarca(false,false);
						this.vendedorsForeignKey=new ArrayList<Vendedor>();

						if(comisionmarca.getVendedor()!=null) {
							this.vendedorsForeignKey.add(comisionmarca.getVendedor());
						}

						this.addItemDefectoCombosForeignKeyVendedor();
						this.cargarCombosFrameVendedorsForeignKey("Todos");
					}
					this.setActualVendedorForeignKey(this.comisionmarca.getid_vendedor(),false,"Formulario");

					//Linea
					if(!this.comisionmarcaConstantesFunciones.cargarid_lineaComisionMarca || this.comisionmarcaConstantesFunciones.event_dependid_lineaComisionMarca) {
						//this.cargarCombosLineasForeignKeyLista(" where id="+this.comisionmarca.getid_linea());
									//this.inicializarActualizarBindingComisionMarca(false,false);
						this.lineasForeignKey=new ArrayList<Linea>();

						if(comisionmarca.getLinea()!=null) {
							this.lineasForeignKey.add(comisionmarca.getLinea());
						}

						this.addItemDefectoCombosForeignKeyLinea();
						this.cargarCombosFrameLineasForeignKey("Todos");
					}
					this.setActualLineaForeignKey(this.comisionmarca.getid_linea(),false,"Formulario");

					//LineaGrupo
					if(!this.comisionmarcaConstantesFunciones.cargarid_linea_grupoComisionMarca || this.comisionmarcaConstantesFunciones.event_dependid_linea_grupoComisionMarca) {
						//this.cargarCombosLineaGruposForeignKeyLista(" where id="+this.comisionmarca.getid_linea_grupo());
									//this.inicializarActualizarBindingComisionMarca(false,false);
						this.lineagruposForeignKey=new ArrayList<Linea>();

						if(comisionmarca.getLineaGrupo()!=null) {
							this.lineagruposForeignKey.add(comisionmarca.getLineaGrupo());
						}

						this.addItemDefectoCombosForeignKeyLineaGrupo();
						this.cargarCombosFrameLineaGruposForeignKey("Todos");
					}
					this.setActualLineaGrupoForeignKey(this.comisionmarca.getid_linea_grupo(),false,"Formulario");

					//LineaCategoria
					if(!this.comisionmarcaConstantesFunciones.cargarid_linea_categoriaComisionMarca || this.comisionmarcaConstantesFunciones.event_dependid_linea_categoriaComisionMarca) {
						//this.cargarCombosLineaCategoriasForeignKeyLista(" where id="+this.comisionmarca.getid_linea_categoria());
									//this.inicializarActualizarBindingComisionMarca(false,false);
						this.lineacategoriasForeignKey=new ArrayList<Linea>();

						if(comisionmarca.getLineaCategoria()!=null) {
							this.lineacategoriasForeignKey.add(comisionmarca.getLineaCategoria());
						}

						this.addItemDefectoCombosForeignKeyLineaCategoria();
						this.cargarCombosFrameLineaCategoriasForeignKey("Todos");
					}
					this.setActualLineaCategoriaForeignKey(this.comisionmarca.getid_linea_categoria(),false,"Formulario");

					//LineaMarca
					if(!this.comisionmarcaConstantesFunciones.cargarid_linea_marcaComisionMarca || this.comisionmarcaConstantesFunciones.event_dependid_linea_marcaComisionMarca) {
						//this.cargarCombosLineaMarcasForeignKeyLista(" where id="+this.comisionmarca.getid_linea_marca());
									//this.inicializarActualizarBindingComisionMarca(false,false);
						this.lineamarcasForeignKey=new ArrayList<Linea>();

						if(comisionmarca.getLineaMarca()!=null) {
							this.lineamarcasForeignKey.add(comisionmarca.getLineaMarca());
						}

						this.addItemDefectoCombosForeignKeyLineaMarca();
						this.cargarCombosFrameLineaMarcasForeignKey("Todos");
					}
					this.setActualLineaMarcaForeignKey(this.comisionmarca.getid_linea_marca(),false,"Formulario");

					//EstadoComision
					if(!this.comisionmarcaConstantesFunciones.cargarid_estado_comisionComisionMarca || this.comisionmarcaConstantesFunciones.event_dependid_estado_comisionComisionMarca) {
						//this.cargarCombosEstadoComisionsForeignKeyLista(" where id="+this.comisionmarca.getid_estado_comision());
									//this.inicializarActualizarBindingComisionMarca(false,false);
						this.estadocomisionsForeignKey=new ArrayList<EstadoComision>();

						if(comisionmarca.getEstadoComision()!=null) {
							this.estadocomisionsForeignKey.add(comisionmarca.getEstadoComision());
						}

						this.addItemDefectoCombosForeignKeyEstadoComision();
						this.cargarCombosFrameEstadoComisionsForeignKey("Todos");
					}
					this.setActualEstadoComisionForeignKey(this.comisionmarca.getid_estado_comision(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesComisionMarca("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesComisionMarca(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComisionMarca() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoComisionMarca(ComisionMarca comisionmarca) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoComisionMarca(comisionmarca,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoComisionMarca(ComisionMarca comisionmarca,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioComisionMarca(comisionmarca);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyComisionMarca(comisionmarca,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyComisionMarca(comisionmarca);
	}
	
	public void setVariablesObjetoActualToFormularioComisionMarca(ComisionMarca comisionmarca) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormComisionMarca==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormComisionMarca.jLabelidComisionMarca.setText(comisionmarca.getId().toString());
			this.jInternalFrameDetalleFormComisionMarca.jTextFieldporcentajeComisionMarca.setText(comisionmarca.getporcentaje().toString());
			this.jInternalFrameDetalleFormComisionMarca.jTextAreadescripcionComisionMarca.setText(comisionmarca.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ComisionMarca comisionmarcaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,comisionmarcaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ComisionMarca comisionmarcaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				comisionmarcaLocal=this.comisionmarca;
			} else {
				comisionmarcaLocal=this.comisionmarcaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(comisionmarcaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoComisionMarca(comisionmarcaLocal,true);
					
					if(comisionmarcaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(comisionmarcaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(comisionmarcaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoComisionMarca(ComisionMarca comisionmarca,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualComisionMarca(comisionmarca,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(comisionmarca);
	}
	
	public void setVariablesFormularioToObjetoActualComisionMarca(ComisionMarca comisionmarca,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualComisionMarca(comisionmarca,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualComisionMarca(ComisionMarca comisionmarca,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormComisionMarca==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormComisionMarca.jLabelidComisionMarca.getText()==null || this.jInternalFrameDetalleFormComisionMarca.jLabelidComisionMarca.getText()=="" || this.jInternalFrameDetalleFormComisionMarca.jLabelidComisionMarca.getText()=="Id") {
				this.jInternalFrameDetalleFormComisionMarca.jLabelidComisionMarca.setText("0");
			}

			if(conColumnasBase) {comisionmarca.setId(Long.parseLong(this.jInternalFrameDetalleFormComisionMarca.jLabelidComisionMarca.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionMarcaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionMarca.jLabelIdComisionMarca,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comisionmarca.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormComisionMarca.jTextFieldporcentajeComisionMarca.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionMarcaConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionMarca.jLabelporcentajeComisionMarca,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comisionmarca.setdescripcion(this.jInternalFrameDetalleFormComisionMarca.jTextAreadescripcionComisionMarca.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionMarcaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionMarca.jLabeldescripcionComisionMarca,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualComisionMarca(ComisionMarca comisionmarcaBean,ComisionMarca comisionmarca,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && comisionmarcaBean.getid_comision_config()!=null && !comisionmarcaBean.getid_comision_config().equals(-1L))) {comisionmarca.setid_comision_config(comisionmarcaBean.getid_comision_config());}
			if(conDefault || (!conDefault && comisionmarcaBean.getid_vendedor()!=null && !comisionmarcaBean.getid_vendedor().equals(-1L))) {comisionmarca.setid_vendedor(comisionmarcaBean.getid_vendedor());}
			if(conDefault || (!conDefault && comisionmarcaBean.getid_linea()!=null && !comisionmarcaBean.getid_linea().equals(-1L))) {comisionmarca.setid_linea(comisionmarcaBean.getid_linea());}
			if(conDefault || (!conDefault && comisionmarcaBean.getid_linea_grupo()!=null && !comisionmarcaBean.getid_linea_grupo().equals(-1L))) {comisionmarca.setid_linea_grupo(comisionmarcaBean.getid_linea_grupo());}
			if(conDefault || (!conDefault && comisionmarcaBean.getid_linea_categoria()!=null && !comisionmarcaBean.getid_linea_categoria().equals(-1L))) {comisionmarca.setid_linea_categoria(comisionmarcaBean.getid_linea_categoria());}
			if(conDefault || (!conDefault && comisionmarcaBean.getid_linea_marca()!=null && !comisionmarcaBean.getid_linea_marca().equals(-1L))) {comisionmarca.setid_linea_marca(comisionmarcaBean.getid_linea_marca());}
			if(conDefault || (!conDefault && comisionmarcaBean.getid_estado_comision()!=null && !comisionmarcaBean.getid_estado_comision().equals(-1L))) {comisionmarca.setid_estado_comision(comisionmarcaBean.getid_estado_comision());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosComisionMarca(ComisionMarca comisionmarcaOrigen,ComisionMarca comisionmarca,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && comisionmarcaOrigen.getId()!=null && !comisionmarcaOrigen.getId().equals(0L))) {comisionmarca.setId(comisionmarcaOrigen.getId());}}
			if(conDefault || (!conDefault && comisionmarcaOrigen.getid_comision_config()!=null && !comisionmarcaOrigen.getid_comision_config().equals(-1L))) {comisionmarca.setid_comision_config(comisionmarcaOrigen.getid_comision_config());}
			if(conDefault || (!conDefault && comisionmarcaOrigen.getid_vendedor()!=null && !comisionmarcaOrigen.getid_vendedor().equals(-1L))) {comisionmarca.setid_vendedor(comisionmarcaOrigen.getid_vendedor());}
			if(conDefault || (!conDefault && comisionmarcaOrigen.getid_linea()!=null && !comisionmarcaOrigen.getid_linea().equals(-1L))) {comisionmarca.setid_linea(comisionmarcaOrigen.getid_linea());}
			if(conDefault || (!conDefault && comisionmarcaOrigen.getid_linea_grupo()!=null && !comisionmarcaOrigen.getid_linea_grupo().equals(-1L))) {comisionmarca.setid_linea_grupo(comisionmarcaOrigen.getid_linea_grupo());}
			if(conDefault || (!conDefault && comisionmarcaOrigen.getid_linea_categoria()!=null && !comisionmarcaOrigen.getid_linea_categoria().equals(-1L))) {comisionmarca.setid_linea_categoria(comisionmarcaOrigen.getid_linea_categoria());}
			if(conDefault || (!conDefault && comisionmarcaOrigen.getid_linea_marca()!=null && !comisionmarcaOrigen.getid_linea_marca().equals(-1L))) {comisionmarca.setid_linea_marca(comisionmarcaOrigen.getid_linea_marca());}
			if(conDefault || (!conDefault && comisionmarcaOrigen.getid_estado_comision()!=null && !comisionmarcaOrigen.getid_estado_comision().equals(-1L))) {comisionmarca.setid_estado_comision(comisionmarcaOrigen.getid_estado_comision());}
			if(conDefault || (!conDefault && comisionmarcaOrigen.getporcentaje()!=null && !comisionmarcaOrigen.getporcentaje().equals(0.0))) {comisionmarca.setporcentaje(comisionmarcaOrigen.getporcentaje());}
			if(conDefault || (!conDefault && comisionmarcaOrigen.getdescripcion()!=null && !comisionmarcaOrigen.getdescripcion().equals(""))) {comisionmarca.setdescripcion(comisionmarcaOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioComisionMarca(ComisionMarca comisionmarca) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormComisionMarca.jLabelidComisionMarca.setText(comisionmarca.getId().toString());
			this.jInternalFrameDetalleFormComisionMarca.jTextFieldporcentajeComisionMarca.setText(comisionmarca.getporcentaje().toString());
			this.jInternalFrameDetalleFormComisionMarca.jTextAreadescripcionComisionMarca.setText(comisionmarca.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioComisionMarca(ComisionMarcaBean comisionmarcaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormComisionMarca.jLabelidComisionMarca.setText(comisionmarcaBean.getId().toString());
			this.jInternalFrameDetalleFormComisionMarca.jTextFieldporcentajeComisionMarca.setText(comisionmarcaBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormComisionMarca.jTextAreadescripcionComisionMarca.setText(comisionmarcaBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanComisionMarca(ComisionMarcaParameterReturnGeneral comisionmarcaReturnGeneral,ComisionMarcaBean comisionmarcaBean,Boolean conDefault) throws Exception { 
		try {
			ComisionMarca comisionmarcaLocal=new ComisionMarca();
			
			comisionmarcaLocal=comisionmarcaReturnGeneral.getComisionMarca();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && comisionmarcaLocal.getId()!=null && !comisionmarcaLocal.getId().equals(0L))) {comisionmarcaBean.setId(comisionmarcaLocal.getId());}}
			if(conDefault || (!conDefault && comisionmarcaLocal.getid_comision_config()!=null && !comisionmarcaLocal.getid_comision_config().equals(-1L))) {comisionmarcaBean.setid_comision_config(comisionmarcaLocal.getid_comision_config());}
			if(conDefault || (!conDefault && comisionmarcaLocal.getid_vendedor()!=null && !comisionmarcaLocal.getid_vendedor().equals(-1L))) {comisionmarcaBean.setid_vendedor(comisionmarcaLocal.getid_vendedor());}
			if(conDefault || (!conDefault && comisionmarcaLocal.getid_linea()!=null && !comisionmarcaLocal.getid_linea().equals(-1L))) {comisionmarcaBean.setid_linea(comisionmarcaLocal.getid_linea());}
			if(conDefault || (!conDefault && comisionmarcaLocal.getid_linea_grupo()!=null && !comisionmarcaLocal.getid_linea_grupo().equals(-1L))) {comisionmarcaBean.setid_linea_grupo(comisionmarcaLocal.getid_linea_grupo());}
			if(conDefault || (!conDefault && comisionmarcaLocal.getid_linea_categoria()!=null && !comisionmarcaLocal.getid_linea_categoria().equals(-1L))) {comisionmarcaBean.setid_linea_categoria(comisionmarcaLocal.getid_linea_categoria());}
			if(conDefault || (!conDefault && comisionmarcaLocal.getid_linea_marca()!=null && !comisionmarcaLocal.getid_linea_marca().equals(-1L))) {comisionmarcaBean.setid_linea_marca(comisionmarcaLocal.getid_linea_marca());}
			if(conDefault || (!conDefault && comisionmarcaLocal.getid_estado_comision()!=null && !comisionmarcaLocal.getid_estado_comision().equals(-1L))) {comisionmarcaBean.setid_estado_comision(comisionmarcaLocal.getid_estado_comision());}
			if(conDefault || (!conDefault && comisionmarcaLocal.getporcentaje()!=null && !comisionmarcaLocal.getporcentaje().equals(0.0))) {comisionmarcaBean.setporcentaje(comisionmarcaLocal.getporcentaje());}
			if(conDefault || (!conDefault && comisionmarcaLocal.getdescripcion()!=null && !comisionmarcaLocal.getdescripcion().equals(""))) {comisionmarcaBean.setdescripcion(comisionmarcaLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxComisionMarcaGenerico(Long idComisionMarcaSeleccionado,JComboBox jComboBoxComisionMarca,List<ComisionMarca> comisionmarcasLocal)throws Exception {
		try {
			ComisionMarca  comisionmarcaTemp=null;

			for(ComisionMarca comisionmarcaAux:comisionmarcasLocal) {
				if(comisionmarcaAux.getId()!=null && comisionmarcaAux.getId().equals(idComisionMarcaSeleccionado)) {
					comisionmarcaTemp=comisionmarcaAux;
					break;
				}
			}

			jComboBoxComisionMarca.setSelectedItem(comisionmarcaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxComisionMarcaGenerico(JComboBox jComboBoxComisionMarca,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxComisionMarca.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxComisionMarca.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxComisionMarca.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxComisionMarca.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxComisionMarca.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxComisionMarca.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comisionmarca=(ComisionMarca) comisionmarcaLogic.getComisionMarcas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			comisionmarca =(ComisionMarca) comisionmarcas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!comisionmarca.getIsNew() && !comisionmarca.getIsChanged() && !comisionmarca.getIsDeleted()) {
				sDescripcion=comisionmarca.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=comisionmarca.getempresa_descripcion();
			}
		}

		if(sTipo.equals("ComisionConfig")) {
			//sDescripcion=this.getActualComisionConfigForeignKeyDescripcion((Long)value);
			if(!comisionmarca.getIsNew() && !comisionmarca.getIsChanged() && !comisionmarca.getIsDeleted()) {
				sDescripcion=comisionmarca.getcomisionconfig_descripcion();
			} else {
				//sDescripcion=this.getActualComisionConfigForeignKeyDescripcion((Long)value);
				sDescripcion=comisionmarca.getcomisionconfig_descripcion();
			}
		}

		if(sTipo.equals("Vendedor")) {
			//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
			if(!comisionmarca.getIsNew() && !comisionmarca.getIsChanged() && !comisionmarca.getIsDeleted()) {
				sDescripcion=comisionmarca.getvendedor_descripcion();
			} else {
				//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
				sDescripcion=comisionmarca.getvendedor_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!comisionmarca.getIsNew() && !comisionmarca.getIsChanged() && !comisionmarca.getIsDeleted()) {
				sDescripcion=comisionmarca.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=comisionmarca.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!comisionmarca.getIsNew() && !comisionmarca.getIsChanged() && !comisionmarca.getIsDeleted()) {
				sDescripcion=comisionmarca.getlineagrupo_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=comisionmarca.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("LineaCategoria")) {
			//sDescripcion=this.getActualLineaCategoriaForeignKeyDescripcion((Long)value);
			if(!comisionmarca.getIsNew() && !comisionmarca.getIsChanged() && !comisionmarca.getIsDeleted()) {
				sDescripcion=comisionmarca.getlineacategoria_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=comisionmarca.getlineacategoria_descripcion();
			}
		}

		if(sTipo.equals("LineaMarca")) {
			//sDescripcion=this.getActualLineaMarcaForeignKeyDescripcion((Long)value);
			if(!comisionmarca.getIsNew() && !comisionmarca.getIsChanged() && !comisionmarca.getIsDeleted()) {
				sDescripcion=comisionmarca.getlineamarca_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=comisionmarca.getlineamarca_descripcion();
			}
		}

		if(sTipo.equals("EstadoComision")) {
			//sDescripcion=this.getActualEstadoComisionForeignKeyDescripcion((Long)value);
			if(!comisionmarca.getIsNew() && !comisionmarca.getIsChanged() && !comisionmarca.getIsDeleted()) {
				sDescripcion=comisionmarca.getestadocomision_descripcion();
			} else {
				//sDescripcion=this.getActualEstadoComisionForeignKeyDescripcion((Long)value);
				sDescripcion=comisionmarca.getestadocomision_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ComisionMarca comisionmarcaRow=new ComisionMarca();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comisionmarcaRow=(ComisionMarca) comisionmarcaLogic.getComisionMarcas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			comisionmarcaRow=(ComisionMarca) comisionmarcas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualComisionMarca(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoComisionMarca.setVisible((this.isVisibilidadCeldaNuevoComisionMarca && this.isPermisoNuevoComisionMarca));			
			this.jButtonDuplicarComisionMarca.setVisible((this.isVisibilidadCeldaDuplicarComisionMarca && this.isPermisoDuplicarComisionMarca));			
			this.jButtonCopiarComisionMarca.setVisible((this.isVisibilidadCeldaCopiarComisionMarca && this.isPermisoCopiarComisionMarca));
			this.jButtonVerFormComisionMarca.setVisible((this.isVisibilidadCeldaVerFormComisionMarca && this.isPermisoVerFormComisionMarca));
			
			this.jButtonAbrirOrderByComisionMarca.setVisible((this.isVisibilidadCeldaOrdenComisionMarca && this.isPermisoOrdenComisionMarca));			
			
			this.jButtonNuevoRelacionesComisionMarca.setVisible((this.isVisibilidadCeldaNuevoRelacionesComisionMarca && this.isPermisoNuevoComisionMarca));			
			this.jButtonNuevoGuardarCambiosComisionMarca.setVisible((this.isVisibilidadCeldaNuevoComisionMarca && this.isPermisoNuevoComisionMarca && this.isPermisoGuardarCambiosComisionMarca));
			
			if(this.jInternalFrameDetalleFormComisionMarca!=null) {
			this.jInternalFrameDetalleFormComisionMarca.jButtonModificarComisionMarca.setVisible((this.isVisibilidadCeldaModificarComisionMarca && this.isPermisoActualizarComisionMarca));	
			this.jInternalFrameDetalleFormComisionMarca.jButtonActualizarComisionMarca.setVisible((this.isVisibilidadCeldaActualizarComisionMarca && this.isPermisoActualizarComisionMarca));	
			this.jInternalFrameDetalleFormComisionMarca.jButtonEliminarComisionMarca.setVisible((this.isVisibilidadCeldaEliminarComisionMarca && this.isPermisoEliminarComisionMarca));
			this.jInternalFrameDetalleFormComisionMarca.jButtonCancelarComisionMarca.setVisible(this.isVisibilidadCeldaCancelarComisionMarca);							
			this.jInternalFrameDetalleFormComisionMarca.jButtonGuardarCambiosComisionMarca.setVisible((this.isVisibilidadCeldaGuardarComisionMarca && this.isPermisoGuardarCambiosComisionMarca));			
			
			}
						
			this.jButtonGuardarCambiosTablaComisionMarca.setVisible((this.isVisibilidadCeldaGuardarCambiosComisionMarca && this.isPermisoGuardarCambiosComisionMarca));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarComisionMarca.setVisible((this.isVisibilidadCeldaNuevoComisionMarca && this.isPermisoNuevoComisionMarca));						
			this.jButtonDuplicarToolBarComisionMarca.setVisible((this.isVisibilidadCeldaDuplicarComisionMarca && this.isPermisoDuplicarComisionMarca));						
			this.jButtonCopiarToolBarComisionMarca.setVisible((this.isVisibilidadCeldaCopiarComisionMarca && this.isPermisoCopiarComisionMarca));			
			this.jButtonVerFormToolBarComisionMarca.setVisible((this.isVisibilidadCeldaVerFormComisionMarca && this.isPermisoVerFormComisionMarca));			
			this.jButtonAbrirOrderByToolBarComisionMarca.setVisible((this.isVisibilidadCeldaOrdenComisionMarca && this.isPermisoOrdenComisionMarca));
			this.jButtonNuevoRelacionesToolBarComisionMarca.setVisible((this.isVisibilidadCeldaNuevoRelacionesComisionMarca && this.isPermisoNuevoComisionMarca));			
			this.jButtonNuevoGuardarCambiosToolBarComisionMarca.setVisible((this.isVisibilidadCeldaNuevoComisionMarca && this.isPermisoNuevoComisionMarca && this.isPermisoGuardarCambiosComisionMarca));			
			
			if(this.jInternalFrameDetalleFormComisionMarca!=null) {
			this.jInternalFrameDetalleFormComisionMarca.jButtonModificarToolBarComisionMarca.setVisible((this.isVisibilidadCeldaModificarComisionMarca && this.isPermisoActualizarComisionMarca));	
			this.jInternalFrameDetalleFormComisionMarca.jButtonActualizarToolBarComisionMarca.setVisible((this.isVisibilidadCeldaActualizarComisionMarca  && this.isPermisoActualizarComisionMarca));	
			this.jInternalFrameDetalleFormComisionMarca.jButtonEliminarToolBarComisionMarca.setVisible((this.isVisibilidadCeldaEliminarComisionMarca && this.isPermisoEliminarComisionMarca));
			this.jInternalFrameDetalleFormComisionMarca.jButtonCancelarToolBarComisionMarca.setVisible(this.isVisibilidadCeldaCancelarComisionMarca);				
			this.jInternalFrameDetalleFormComisionMarca.jButtonGuardarCambiosToolBarComisionMarca.setVisible((this.isVisibilidadCeldaGuardarComisionMarca && this.isPermisoGuardarCambiosComisionMarca));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarComisionMarca.setVisible((this.isVisibilidadCeldaGuardarCambiosComisionMarca && this.isPermisoGuardarCambiosComisionMarca));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoComisionMarca.setVisible((this.isVisibilidadCeldaNuevoComisionMarca && this.isPermisoNuevoComisionMarca));			
			this.jMenuItemDuplicarComisionMarca.setVisible((this.isVisibilidadCeldaDuplicarComisionMarca && this.isPermisoDuplicarComisionMarca));			
			this.jMenuItemCopiarComisionMarca.setVisible((this.isVisibilidadCeldaCopiarComisionMarca && this.isPermisoCopiarComisionMarca));			
			this.jMenuItemVerFormComisionMarca.setVisible((this.isVisibilidadCeldaVerFormComisionMarca && this.isPermisoVerFormComisionMarca));			
			this.jMenuItemAbrirOrderByComisionMarca.setVisible((this.isVisibilidadCeldaOrdenComisionMarca && this.isPermisoOrdenComisionMarca));			
			//this.jMenuItemMostrarOcultarComisionMarca.setVisible((this.isVisibilidadCeldaOrdenComisionMarca && this.isPermisoOrdenComisionMarca));
			this.jMenuItemDetalleAbrirOrderByComisionMarca.setVisible((this.isVisibilidadCeldaOrdenComisionMarca && this.isPermisoOrdenComisionMarca));			
			//this.jMenuItemDetalleMostrarOcultarComisionMarca.setVisible((this.isVisibilidadCeldaOrdenComisionMarca && this.isPermisoOrdenComisionMarca));			
			this.jMenuItemNuevoRelacionesComisionMarca.setVisible((this.isVisibilidadCeldaNuevoRelacionesComisionMarca && this.isPermisoNuevoComisionMarca));			
			this.jMenuItemNuevoGuardarCambiosComisionMarca.setVisible((this.isVisibilidadCeldaNuevoComisionMarca && this.isPermisoNuevoComisionMarca && this.isPermisoGuardarCambiosComisionMarca));									
			
			if(this.jInternalFrameDetalleFormComisionMarca!=null) {
			this.jInternalFrameDetalleFormComisionMarca.jMenuItemModificarComisionMarca.setVisible((this.isVisibilidadCeldaModificarComisionMarca && this.isPermisoActualizarComisionMarca));	
			this.jInternalFrameDetalleFormComisionMarca.jMenuItemActualizarComisionMarca.setVisible((this.isVisibilidadCeldaActualizarComisionMarca && this.isPermisoActualizarComisionMarca));	
			this.jInternalFrameDetalleFormComisionMarca.jMenuItemEliminarComisionMarca.setVisible((this.isVisibilidadCeldaEliminarComisionMarca && this.isPermisoEliminarComisionMarca));
			this.jInternalFrameDetalleFormComisionMarca.jMenuItemCancelarComisionMarca.setVisible(this.isVisibilidadCeldaCancelarComisionMarca);				
			}
			
			this.jMenuItemGuardarCambiosComisionMarca.setVisible((this.isVisibilidadCeldaGuardarComisionMarca && this.isPermisoGuardarCambiosComisionMarca));						
			this.jMenuItemGuardarCambiosTablaComisionMarca.setVisible((this.isVisibilidadCeldaGuardarCambiosComisionMarca && this.isPermisoGuardarCambiosComisionMarca));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoComisionMarca=this.jButtonNuevoComisionMarca.isVisible();
			this.isVisibilidadCeldaDuplicarComisionMarca=this.jButtonDuplicarComisionMarca.isVisible();
			this.isVisibilidadCeldaCopiarComisionMarca=this.jButtonCopiarComisionMarca.isVisible();
			this.isVisibilidadCeldaVerFormComisionMarca=this.jButtonVerFormComisionMarca.isVisible();
			
			this.isVisibilidadCeldaOrdenComisionMarca=this.jButtonAbrirOrderByComisionMarca.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesComisionMarca=this.jButtonNuevoRelacionesComisionMarca.isVisible();
			this.isVisibilidadCeldaModificarComisionMarca=this.jButtonModificarComisionMarca.isVisible();
			
			if(this.jInternalFrameDetalleFormComisionMarca!=null) {
			this.isVisibilidadCeldaActualizarComisionMarca=this.jInternalFrameDetalleFormComisionMarca.jButtonActualizarComisionMarca.isVisible();
			this.isVisibilidadCeldaEliminarComisionMarca=this.jInternalFrameDetalleFormComisionMarca.jButtonEliminarComisionMarca.isVisible();
			this.isVisibilidadCeldaCancelarComisionMarca=this.jInternalFrameDetalleFormComisionMarca.jButtonCancelarComisionMarca.isVisible();
			this.isVisibilidadCeldaGuardarComisionMarca=this.jInternalFrameDetalleFormComisionMarca.jButtonGuardarCambiosComisionMarca.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosComisionMarca=this.jButtonGuardarCambiosTablaComisionMarca.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoComisionMarca=this.jButtonNuevoToolBarComisionMarca.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesComisionMarca=this.jButtonNuevoRelacionesToolBarComisionMarca.isVisible();
			
			if(this.jInternalFrameDetalleFormComisionMarca!=null) {
			this.isVisibilidadCeldaModificarComisionMarca=this.jInternalFrameDetalleFormComisionMarca.jButtonModificarToolBarComisionMarca.isVisible();
			this.isVisibilidadCeldaActualizarComisionMarca=this.jInternalFrameDetalleFormComisionMarca.jButtonActualizarToolBarComisionMarca.isVisible();
			this.isVisibilidadCeldaEliminarComisionMarca=this.jInternalFrameDetalleFormComisionMarca.jButtonEliminarToolBarComisionMarca.isVisible();
			this.isVisibilidadCeldaCancelarComisionMarca=this.jInternalFrameDetalleFormComisionMarca.jButtonCancelarToolBarComisionMarca.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarComisionMarca=this.jButtonGuardarCambiosToolBarComisionMarca.isVisible();
			this.isVisibilidadCeldaGuardarCambiosComisionMarca=this.jButtonGuardarCambiosTablaToolBarComisionMarca.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoComisionMarca=this.jMenuItemNuevoComisionMarca.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesComisionMarca=this.jMenuItemNuevoRelacionesComisionMarca.isVisible();
			
			if(this.jInternalFrameDetalleFormComisionMarca!=null) {
			this.isVisibilidadCeldaModificarComisionMarca=this.jInternalFrameDetalleFormComisionMarca.jMenuItemModificarComisionMarca.isVisible();
			this.isVisibilidadCeldaActualizarComisionMarca=this.jInternalFrameDetalleFormComisionMarca.jMenuItemActualizarComisionMarca.isVisible();
			this.isVisibilidadCeldaEliminarComisionMarca=this.jInternalFrameDetalleFormComisionMarca.jMenuItemEliminarComisionMarca.isVisible();
			this.isVisibilidadCeldaCancelarComisionMarca=this.jInternalFrameDetalleFormComisionMarca.jMenuItemCancelarComisionMarca.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarComisionMarca=this.jMenuItemGuardarCambiosComisionMarca.isVisible();
			this.isVisibilidadCeldaGuardarCambiosComisionMarca=this.jMenuItemGuardarCambiosTablaComisionMarca.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesComisionMarca(Boolean esInicializar) {
		if(ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.comisionmarcaSessionBean.getConGuardarRelaciones()) {
				//if(this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesComisionMarca();
			}
			
			this.inicializarActualizarBindingBotonesManualComisionMarca(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualComisionMarca() {
		this.jButtonNuevoComisionMarca.setVisible(this.isPermisoNuevoComisionMarca);			
		this.jButtonDuplicarComisionMarca.setVisible(this.isPermisoDuplicarComisionMarca);			
		this.jButtonCopiarComisionMarca.setVisible(this.isPermisoCopiarComisionMarca);			
		this.jButtonVerFormComisionMarca.setVisible(this.isPermisoVerFormComisionMarca);			
		
		this.jButtonAbrirOrderByComisionMarca.setVisible(this.isPermisoOrdenComisionMarca);					
		
		this.jButtonNuevoRelacionesComisionMarca.setVisible(this.isPermisoNuevoComisionMarca);			
		
		if(this.jInternalFrameDetalleFormComisionMarca!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionMarca.jButtonModificarComisionMarca.setVisible(this.isPermisoActualizarComisionMarca);	
			this.jInternalFrameDetalleFormComisionMarca.jButtonActualizarComisionMarca.setVisible(this.isPermisoActualizarComisionMarca);	
			this.jInternalFrameDetalleFormComisionMarca.jButtonEliminarComisionMarca.setVisible(this.isPermisoEliminarComisionMarca);
			this.jInternalFrameDetalleFormComisionMarca.jButtonCancelarComisionMarca.setVisible(this.isVisibilidadCeldaCancelarComisionMarca);						
			this.jInternalFrameDetalleFormComisionMarca.jButtonGuardarCambiosComisionMarca.setVisible(this.isPermisoGuardarCambiosComisionMarca);							
		}
		
		this.jButtonGuardarCambiosTablaComisionMarca.setVisible(this.isPermisoActualizarComisionMarca);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleComisionMarca() {
		this.jInternalFrameDetalleFormComisionMarca.jButtonModificarComisionMarca.setVisible(this.isPermisoActualizarComisionMarca);	
		this.jInternalFrameDetalleFormComisionMarca.jButtonActualizarComisionMarca.setVisible(this.isPermisoActualizarComisionMarca);	
		this.jInternalFrameDetalleFormComisionMarca.jButtonEliminarComisionMarca.setVisible(this.isPermisoEliminarComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jButtonCancelarComisionMarca.setVisible(this.isVisibilidadCeldaCancelarComisionMarca);							
		this.jInternalFrameDetalleFormComisionMarca.jButtonGuardarCambiosComisionMarca.setVisible((this.isVisibilidadCeldaGuardarComisionMarca && this.isPermisoGuardarCambiosComisionMarca));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosComisionMarca() {
		if(ComisionMarcaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualComisionMarca();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesComisionMarca() {
	}
	
	public void jTableDatosComisionMarcaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarComisionMarca(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidComisionMarcaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionMarca(this.getcomisionmarca(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionmarca =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionmarca =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionmarca==null) {
						this.comisionmarca = new ComisionMarca();
					}

					this.setVariablesFormularioToObjetoActualComisionMarca(this.comisionmarca,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);
				}

				if(this.comisionmarca.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.comisionmarca.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionMarca(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaComisionMarcaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebComisionMarca(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionMarca.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionMarca.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarca =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionmarca =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionMarca(this.getcomisionmarca(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.comisionmarcaLogic.getConnexion());

				if(this.comisionmarca.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.comisionmarca.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionMarca=(TitledBorder)this.jScrollPanelDatosComisionMarca.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderComisionMarca.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaComisionMarcaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionMarca(this.getcomisionmarca(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionmarca =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionmarca =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionmarca==null) {
						this.comisionmarca = new ComisionMarca();
					}

					this.setVariablesFormularioToObjetoActualComisionMarca(this.comisionmarca,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);
				}

				if(this.comisionmarca.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.comisionmarca.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionMarca(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_comision_configComisionMarcaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocomisionconfig=true;

			idTienePermisocomisionconfig=this.tienePermisosUsuarioEnPaginaWebComisionMarca(ComisionConfigConstantesFunciones.CLASSNAME);

			if(idTienePermisocomisionconfig) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionMarca.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionMarca.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarca =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionmarca =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionMarca(this.getcomisionmarca(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);

				this.comisionconfigBeanSwingJInternalFrame=new ComisionConfigBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.comisionconfigBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.comisionconfigBeanSwingJInternalFrame.getComisionConfigLogic().setConnexion(this.comisionmarcaLogic.getConnexion());

				if(this.comisionmarca.getid_comision_config()!=null) {
					this.comisionconfigBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.comisionconfigBeanSwingJInternalFrame.setIdActual(this.comisionmarca.getid_comision_config());
					this.comisionconfigBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.comisionconfigBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.comisionconfigBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionConfig();
				}

				JInternalFrameBase jinternalFrame =this.comisionconfigBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionMarca=(TitledBorder)this.jScrollPanelDatosComisionMarca.getBorder();
				TitledBorder titledBordercomisionconfig=(TitledBorder)this.comisionconfigBeanSwingJInternalFrame.jScrollPanelDatosComisionConfig.getBorder();

				titledBordercomisionconfig.setTitle(titledBorderComisionMarca.getTitle() + " -> Comision Config");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_comision_configComisionMarcaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionMarca(this.getcomisionmarca(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionmarca =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionmarca =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionmarca==null) {
						this.comisionmarca = new ComisionMarca();
					}

					this.setVariablesFormularioToObjetoActualComisionMarca(this.comisionmarca,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);
				}

				if(this.comisionmarca.getid_comision_config()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_comision_config = "+this.comisionmarca.getid_comision_config().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionMarca(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_vendedorComisionMarcaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderComisionMarca=null;
			TitledBorder titledBordervendedor=null;

			if(!this.jScrollPanelDatosComisionMarca.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderComisionMarca=(TitledBorder)this.jScrollPanelDatosComisionMarca.getBorder();
				titledBordervendedor=(TitledBorder)this.vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

				titledBordervendedor.setTitle(titledBorderComisionMarca.getTitle() + " -> Vendedor");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_vendedorComisionMarcaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisovendedor=true;

			idTienePermisovendedor=this.tienePermisosUsuarioEnPaginaWebComisionMarca(VendedorConstantesFunciones.CLASSNAME);

			if(idTienePermisovendedor) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionMarca.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionMarca.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarca =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionmarca =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionMarca(this.getcomisionmarca(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);

				this.vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.vendedorBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.vendedorBeanSwingJInternalFrame.getVendedorLogic().setConnexion(this.comisionmarcaLogic.getConnexion());

				if(this.comisionmarca.getid_vendedor()!=null) {
					this.vendedorBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.vendedorBeanSwingJInternalFrame.setIdActual(this.comisionmarca.getid_vendedor());
					this.vendedorBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaVendedor();
				}

				JInternalFrameBase jinternalFrame =this.vendedorBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionMarca=(TitledBorder)this.jScrollPanelDatosComisionMarca.getBorder();
				TitledBorder titledBordervendedor=(TitledBorder)this.vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

				titledBordervendedor.setTitle(titledBorderComisionMarca.getTitle() + " -> Vendedor");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_vendedorComisionMarcaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionMarca(this.getcomisionmarca(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionmarca =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionmarca =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionmarca==null) {
						this.comisionmarca = new ComisionMarca();
					}

					this.setVariablesFormularioToObjetoActualComisionMarca(this.comisionmarca,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);
				}

				if(this.comisionmarca.getid_vendedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_vendedor = "+this.comisionmarca.getid_vendedor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionMarca(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaComisionMarcaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebComisionMarca(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionMarca.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionMarca.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarca =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionmarca =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionMarca(this.getcomisionmarca(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.comisionmarcaLogic.getConnexion());

				if(this.comisionmarca.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.comisionmarca.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionMarca=(TitledBorder)this.jScrollPanelDatosComisionMarca.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderComisionMarca.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaComisionMarcaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionMarca(this.getcomisionmarca(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionmarca =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionmarca =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionmarca==null) {
						this.comisionmarca = new ComisionMarca();
					}

					this.setVariablesFormularioToObjetoActualComisionMarca(this.comisionmarca,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);
				}

				if(this.comisionmarca.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.comisionmarca.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionMarca(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoComisionMarcaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebComisionMarca(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionMarca.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionMarca.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarca =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionmarca =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionMarca(this.getcomisionmarca(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.comisionmarcaLogic.getConnexion());

				if(this.comisionmarca.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.comisionmarca.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionMarca=(TitledBorder)this.jScrollPanelDatosComisionMarca.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderComisionMarca.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoComisionMarcaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionMarca(this.getcomisionmarca(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionmarca =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionmarca =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionmarca==null) {
						this.comisionmarca = new ComisionMarca();
					}

					this.setVariablesFormularioToObjetoActualComisionMarca(this.comisionmarca,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);
				}

				if(this.comisionmarca.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.comisionmarca.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionMarca(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_categoriaComisionMarcaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineacategoria=true;

			idTienePermisolineacategoria=this.tienePermisosUsuarioEnPaginaWebComisionMarca(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineacategoria) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionMarca.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionMarca.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarca =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionmarca =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionMarca(this.getcomisionmarca(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);

				this.lineacategoriaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineacategoriaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineacategoriaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.comisionmarcaLogic.getConnexion());

				if(this.comisionmarca.getid_linea_categoria()!=null) {
					this.lineacategoriaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineacategoriaBeanSwingJInternalFrame.setIdActual(this.comisionmarca.getid_linea_categoria());
					this.lineacategoriaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineacategoriaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineacategoriaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionMarca=(TitledBorder)this.jScrollPanelDatosComisionMarca.getBorder();
				TitledBorder titledBorderlineacategoria=(TitledBorder)this.lineacategoriaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineacategoria.setTitle(titledBorderComisionMarca.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_categoriaComisionMarcaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionMarca(this.getcomisionmarca(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionmarca =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionmarca =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionmarca==null) {
						this.comisionmarca = new ComisionMarca();
					}

					this.setVariablesFormularioToObjetoActualComisionMarca(this.comisionmarca,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);
				}

				if(this.comisionmarca.getid_linea_categoria()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_categoria = "+this.comisionmarca.getid_linea_categoria().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionMarca(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_marcaComisionMarcaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineamarca=true;

			idTienePermisolineamarca=this.tienePermisosUsuarioEnPaginaWebComisionMarca(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineamarca) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionMarca.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionMarca.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarca =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionmarca =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionMarca(this.getcomisionmarca(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);

				this.lineamarcaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineamarcaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineamarcaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.comisionmarcaLogic.getConnexion());

				if(this.comisionmarca.getid_linea_marca()!=null) {
					this.lineamarcaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineamarcaBeanSwingJInternalFrame.setIdActual(this.comisionmarca.getid_linea_marca());
					this.lineamarcaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineamarcaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineamarcaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionMarca=(TitledBorder)this.jScrollPanelDatosComisionMarca.getBorder();
				TitledBorder titledBorderlineamarca=(TitledBorder)this.lineamarcaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineamarca.setTitle(titledBorderComisionMarca.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_marcaComisionMarcaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionMarca(this.getcomisionmarca(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionmarca =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionmarca =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionmarca==null) {
						this.comisionmarca = new ComisionMarca();
					}

					this.setVariablesFormularioToObjetoActualComisionMarca(this.comisionmarca,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);
				}

				if(this.comisionmarca.getid_linea_marca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_marca = "+this.comisionmarca.getid_linea_marca().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionMarca(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estado_comisionComisionMarcaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestadocomision=true;

			idTienePermisoestadocomision=this.tienePermisosUsuarioEnPaginaWebComisionMarca(EstadoComisionConstantesFunciones.CLASSNAME);

			if(idTienePermisoestadocomision) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionMarca.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionMarca.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarca =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionmarca =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionMarca(this.getcomisionmarca(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);

				this.estadocomisionBeanSwingJInternalFrame=new EstadoComisionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estadocomisionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estadocomisionBeanSwingJInternalFrame.getEstadoComisionLogic().setConnexion(this.comisionmarcaLogic.getConnexion());

				if(this.comisionmarca.getid_estado_comision()!=null) {
					this.estadocomisionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estadocomisionBeanSwingJInternalFrame.setIdActual(this.comisionmarca.getid_estado_comision());
					this.estadocomisionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estadocomisionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estadocomisionBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstadoComision();
				}

				JInternalFrameBase jinternalFrame =this.estadocomisionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionMarca=(TitledBorder)this.jScrollPanelDatosComisionMarca.getBorder();
				TitledBorder titledBorderestadocomision=(TitledBorder)this.estadocomisionBeanSwingJInternalFrame.jScrollPanelDatosEstadoComision.getBorder();

				titledBorderestadocomision.setTitle(titledBorderComisionMarca.getTitle() + " -> Estado Comision");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estado_comisionComisionMarcaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionMarca(this.getcomisionmarca(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionmarca =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionmarca =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionmarca==null) {
						this.comisionmarca = new ComisionMarca();
					}

					this.setVariablesFormularioToObjetoActualComisionMarca(this.comisionmarca,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);
				}

				if(this.comisionmarca.getid_estado_comision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estado_comision = "+this.comisionmarca.getid_estado_comision().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionMarca(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeComisionMarcaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionMarca(this.getcomisionmarca(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionmarca =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionmarca =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionmarca==null) {
						this.comisionmarca = new ComisionMarca();
					}

					this.setVariablesFormularioToObjetoActualComisionMarca(this.comisionmarca,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);
				}

				if(this.comisionmarca.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.comisionmarca.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionMarca(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionComisionMarcaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionMarca(this.getcomisionmarca(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionmarca =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionmarca =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionmarca==null) {
						this.comisionmarca = new ComisionMarca();
					}

					this.setVariablesFormularioToObjetoActualComisionMarca(this.comisionmarca,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);
				}

				if(this.comisionmarca.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.comisionmarca.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionMarca(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdComisionConfigComisionMarcaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionMarca(false,false);

			this.getComisionMarcasFK_IdComisionConfig();

			this.inicializarActualizarBindingComisionMarca(false);

			//if(ComisionMarcaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionMarca(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaComisionMarcaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionMarca(false,false);

			this.getComisionMarcasFK_IdEmpresa();

			this.inicializarActualizarBindingComisionMarca(false);

			//if(ComisionMarcaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionMarca(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstadoComisionComisionMarcaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionMarca(false,false);

			this.getComisionMarcasFK_IdEstadoComision();

			this.inicializarActualizarBindingComisionMarca(false);

			//if(ComisionMarcaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionMarca(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaComisionMarcaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionMarca(false,false);

			this.getComisionMarcasFK_IdLinea();

			this.inicializarActualizarBindingComisionMarca(false);

			//if(ComisionMarcaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionMarca(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaCategoriaComisionMarcaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionMarca(false,false);

			this.getComisionMarcasFK_IdLineaCategoria();

			this.inicializarActualizarBindingComisionMarca(false);

			//if(ComisionMarcaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionMarca(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoComisionMarcaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionMarca(false,false);

			this.getComisionMarcasFK_IdLineaGrupo();

			this.inicializarActualizarBindingComisionMarca(false);

			//if(ComisionMarcaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionMarca(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaMarcaComisionMarcaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionMarca(false,false);

			this.getComisionMarcasFK_IdLineaMarca();

			this.inicializarActualizarBindingComisionMarca(false);

			//if(ComisionMarcaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionMarca(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdVendedorComisionMarcaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionMarca(false,false);

			this.getComisionMarcasFK_IdVendedor();

			this.inicializarActualizarBindingComisionMarca(false);

			//if(ComisionMarcaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionMarca(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionmarcaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameComisionMarca() {
		if(this.jInternalFrameDetalleFormComisionMarca!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormComisionMarca!=null) {
			this.jInternalFrameDetalleFormComisionMarca.setVisible(false);	    			
			this.jInternalFrameDetalleFormComisionMarca.dispose();
			this.jInternalFrameDetalleFormComisionMarca=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoComisionMarca!=null) {
			this.jInternalFrameReporteDinamicoComisionMarca.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoComisionMarca.dispose();
			this.jInternalFrameReporteDinamicoComisionMarca=null;
		}
		
		if(this.jInternalFrameImportacionComisionMarca!=null) {
			this.jInternalFrameImportacionComisionMarca.setVisible(false);	    			
			this.jInternalFrameImportacionComisionMarca.dispose();
			this.jInternalFrameImportacionComisionMarca=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessComisionMarca();
			
			ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
			
			
			if(sTipo.equals("NuevoComisionMarca")) {
				jButtonNuevoComisionMarcaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarComisionMarca")) {
				jButtonDuplicarComisionMarcaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarComisionMarca")) {
				jButtonCopiarComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("VerFormComisionMarca")) {
				jButtonVerFormComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarComisionMarca")) {
				jButtonNuevoComisionMarcaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarComisionMarca")) {
				jButtonDuplicarComisionMarcaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoComisionMarca")) {
				jButtonNuevoComisionMarcaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarComisionMarca")) {
				jButtonDuplicarComisionMarcaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesComisionMarca")) {
				jButtonNuevoComisionMarcaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarComisionMarca")) {
				jButtonNuevoComisionMarcaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesComisionMarca")) {
				jButtonNuevoComisionMarcaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarComisionMarca")) {
				jButtonModificarComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarComisionMarca")) {
				jButtonModificarComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarComisionMarca")) {
				jButtonModificarComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarComisionMarca")) {
				jButtonActualizarComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarComisionMarca")) {
				jButtonActualizarComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarComisionMarca")) {
				jButtonActualizarComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("EliminarComisionMarca")) {
				jButtonEliminarComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarComisionMarca")) {
				jButtonEliminarComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarComisionMarca")) {
				jButtonEliminarComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("CancelarComisionMarca")) {
				jButtonCancelarComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarComisionMarca")) {
				jButtonCancelarComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarComisionMarca")) {
				jButtonCancelarComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("CerrarComisionMarca")) {
				jButtonCerrarComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarComisionMarca")) {
				jButtonCerrarComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarComisionMarca")) {
				jButtonCerrarComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarComisionMarca")) {
				jButtonMostrarOcultarComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarComisionMarca")) {
				jButtonCancelarComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosComisionMarca")) {
				jButtonGuardarCambiosComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarComisionMarca")) {
				jButtonGuardarCambiosComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarComisionMarca")) {
				jButtonCopiarComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarComisionMarca")) {
				jButtonVerFormComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosComisionMarca")) {
				jButtonGuardarCambiosComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarComisionMarca")) {
				jButtonCopiarComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormComisionMarca")) {
				jButtonVerFormComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaComisionMarca")) {
				jButtonGuardarCambiosComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarComisionMarca")) {
				jButtonGuardarCambiosComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaComisionMarca")) {
				jButtonGuardarCambiosComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionComisionMarca")) {
				jButtonRecargarInformacionComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarComisionMarca")) {
				jButtonRecargarInformacionComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionComisionMarca")) {
				jButtonRecargarInformacionComisionMarcaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresComisionMarca")) {
				jButtonAnterioresComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarComisionMarca")) {
				jButtonAnterioresComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreComisionMarca")) {
				jButtonAnterioresComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesComisionMarca")) {
				jButtonSiguientesComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarComisionMarca")) {
				jButtonSiguientesComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesComisionMarca")) {
				jButtonSiguientesComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByComisionMarca") || sTipo.equals("MenuItemDetalleAbrirOrderByComisionMarca")) {
				jButtonAbrirOrderByComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarComisionMarca") || sTipo.equals("MenuItemDetalleMostrarOcultarComisionMarca")) {
				jButtonMostrarOcultarComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosComisionMarca")) {
				jButtonNuevoGuardarCambiosComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarComisionMarca")) {
				jButtonNuevoGuardarCambiosComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosComisionMarca")) {
				jButtonNuevoGuardarCambiosComisionMarcaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoComisionMarca")) {
				jButtonCerrarReporteDinamicoComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoComisionMarca")) {
				jButtonGenerarReporteDinamicoComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoComisionMarca")) {
				
				jButtonGenerarExcelReporteDinamicoComisionMarcaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionComisionMarca")) {
				jButtonCerrarImportacionComisionMarcaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionComisionMarca")) {
				
				jButtonGenerarImportacionComisionMarcaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionComisionMarca")) {
				
				jButtonAbrirImportacionComisionMarcaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesComisionMarca")) {
				jComboBoxTiposAccionesComisionMarcaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesComisionMarca")) {
				jComboBoxTiposRelacionesComisionMarcaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioComisionMarca")) {
				jComboBoxTiposAccionesComisionMarcaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarComisionMarca")) {
				
				jComboBoxTiposSeleccionarComisionMarcaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralComisionMarca")) {
				jTextFieldValorCampoGeneralComisionMarcaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByComisionMarca")) {
				jButtonAbrirOrderByComisionMarcaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarComisionMarca")) {
				jButtonAbrirOrderByComisionMarcaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByComisionMarca")) {
				jButtonCerrarOrderByComisionMarcaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idComisionMarcaBusqueda")) {
				this.jButtonidComisionMarcaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaComisionMarcaUpdate")) {
				this.jButtonid_empresaComisionMarcaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaComisionMarcaBusqueda")) {
				this.jButtonid_empresaComisionMarcaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_comision_configComisionMarcaUpdate")) {
				this.jButtonid_comision_configComisionMarcaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_comision_configComisionMarcaBusqueda")) {
				this.jButtonid_comision_configComisionMarcaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_vendedorComisionMarca")) {
				this.jButtonid_vendedorComisionMarcaActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_vendedorComisionMarcaArbol")) {
				this.abrirFrameTreeVendedor("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorComisionMarcaUpdate")) {
				this.jButtonid_vendedorComisionMarcaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorComisionMarcaBusqueda")) {
				this.jButtonid_vendedorComisionMarcaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaComisionMarcaUpdate")) {
				this.jButtonid_lineaComisionMarcaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaComisionMarcaBusqueda")) {
				this.jButtonid_lineaComisionMarcaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoComisionMarcaUpdate")) {
				this.jButtonid_linea_grupoComisionMarcaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoComisionMarcaBusqueda")) {
				this.jButtonid_linea_grupoComisionMarcaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaComisionMarcaUpdate")) {
				this.jButtonid_linea_categoriaComisionMarcaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaComisionMarcaBusqueda")) {
				this.jButtonid_linea_categoriaComisionMarcaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaComisionMarcaUpdate")) {
				this.jButtonid_linea_marcaComisionMarcaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaComisionMarcaBusqueda")) {
				this.jButtonid_linea_marcaComisionMarcaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_comisionComisionMarcaUpdate")) {
				this.jButtonid_estado_comisionComisionMarcaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_comisionComisionMarcaBusqueda")) {
				this.jButtonid_estado_comisionComisionMarcaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeComisionMarcaBusqueda")) {
				this.jButtonporcentajeComisionMarcaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionComisionMarcaBusqueda")) {
				this.jButtondescripcionComisionMarcaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdComisionConfigComisionMarca")) {
				this.jButtonFK_IdComisionConfigComisionMarcaActionPerformed(evt);
			}
			
			;
			
			
			ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessComisionMarca();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionMarcaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionmarca);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionmarca);
				
				ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
				
				


				
				ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionMarca.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionMarca.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ComisionMarca comisionmarcaLocal=null;
			
			if(!this.getEsControlTabla()) {
				comisionmarcaLocal=this.comisionmarca;
			} else {
				comisionmarcaLocal=this.comisionmarcaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionmarca);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionmarca);
				
				ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
							
				
				


				
				ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionMarca.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionMarca.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionMarcaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaAnterior =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionmarcaAnterior =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
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
			
			ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
			
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
			
			


			
			ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionMarcaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionmarca);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionmarca);
				
				ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
								
						
				


				
				ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionMarca.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionMarca.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionmarca);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionmarca);
				
				ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
								
				
				


				
				ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionMarca.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionMarca.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionMarcaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaAnterior =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionmarcaAnterior =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionmarca);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionmarca);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionMarcaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaAnterior =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionmarcaAnterior =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionMarcaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionmarca);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comisionmarca);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionmarca);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionmarca);
				
				ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
							
				
				


				
				ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionMarca.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionMarca.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionMarcaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionmarcaAnterior =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.comisionmarcaAnterior =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
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
			
			ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
			
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
			
			


			
			ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionMarcaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionmarca);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comisionmarca);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionmarca);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionmarca);
				
				ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
								
				
				


				
				ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionMarca.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionMarca.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionMarcaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaAnterior =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionmarcaAnterior =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionMarcaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionmarca);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comisionmarca);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionMarcaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionmarca);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionmarca);
				
				ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosComisionMarca")) {
					jCheckBoxSeleccionarTodosComisionMarcaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosComisionMarca")) {
					jCheckBoxSeleccionadosComisionMarcaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarComisionMarca")) {
					
				}
				
				


				
				
				ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionMarca.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionMarca.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionmarca);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.comisionmarca);
				
				ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
												
				
				


				
				
				ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionMarca.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionMarca.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionMarcaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionmarcaAnterior =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.comisionmarcaAnterior =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionMarcaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionmarca);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionmarca);
				
				ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
				
				
				ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
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
			
			ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
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
			
			


			if(sTipo.equals("id_lineaComisionMarca")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_lineaComisionMarca;
				}

				if(this.comisionmarcaSessionBean.getConGuardarRelaciones()) {
					//classes=ComisionMarcaConstantesFunciones.getClassesRelationshipsOfComisionMarca(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyLinea(jComboBoxGenerico,"Formulario");

				this.recargarFormComisionMarca(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("id_linea_grupoComisionMarca")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_grupoComisionMarca;
				}

				if(this.comisionmarcaSessionBean.getConGuardarRelaciones()) {
					//classes=ComisionMarcaConstantesFunciones.getClassesRelationshipsOfComisionMarca(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyLineaGrupo(jComboBoxGenerico,"Formulario");

				this.recargarFormComisionMarca(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("id_linea_categoriaComisionMarca")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_categoriaComisionMarca;
				}

				if(this.comisionmarcaSessionBean.getConGuardarRelaciones()) {
					//classes=ComisionMarcaConstantesFunciones.getClassesRelationshipsOfComisionMarca(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyLineaCategoria(jComboBoxGenerico,"Formulario");

				this.recargarFormComisionMarca(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			
			ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionMarcaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionmarca);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionmarca);
				
				ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_lineaComisionMarca")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_lineaComisionMarca;
				}

				if(this.comisionmarcaSessionBean.getConGuardarRelaciones()) {
					//classes=ComisionMarcaConstantesFunciones.getClassesRelationshipsOfComisionMarca(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyLinea(jComboBoxGenerico,"Formulario");

				this.recargarFormComisionMarca(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("id_linea_grupoComisionMarca")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_grupoComisionMarca;
				}

				if(this.comisionmarcaSessionBean.getConGuardarRelaciones()) {
					//classes=ComisionMarcaConstantesFunciones.getClassesRelationshipsOfComisionMarca(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyLineaGrupo(jComboBoxGenerico,"Formulario");

				this.recargarFormComisionMarca(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("id_linea_categoriaComisionMarca")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_categoriaComisionMarca;
				}

				if(this.comisionmarcaSessionBean.getConGuardarRelaciones()) {
					//classes=ComisionMarcaConstantesFunciones.getClassesRelationshipsOfComisionMarca(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyLineaCategoria(jComboBoxGenerico,"Formulario");

				this.recargarFormComisionMarca(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
				
				ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionMarca.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionMarca.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionmarca);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionmarca);
				
				ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
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
				
				


			if(sTipo.equals("id_lineaComisionMarca")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_lineaComisionMarca;
				}

				if(this.comisionmarcaSessionBean.getConGuardarRelaciones()) {
					//classes=ComisionMarcaConstantesFunciones.getClassesRelationshipsOfComisionMarca(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyLinea(jComboBoxGenerico,"Formulario");

				this.recargarFormComisionMarca(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("id_linea_grupoComisionMarca")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_grupoComisionMarca;
				}

				if(this.comisionmarcaSessionBean.getConGuardarRelaciones()) {
					//classes=ComisionMarcaConstantesFunciones.getClassesRelationshipsOfComisionMarca(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyLineaGrupo(jComboBoxGenerico,"Formulario");

				this.recargarFormComisionMarca(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			 else if(sTipo.equals("id_linea_categoriaComisionMarca")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_categoriaComisionMarca;
				}

				if(this.comisionmarcaSessionBean.getConGuardarRelaciones()) {
					//classes=ComisionMarcaConstantesFunciones.getClassesRelationshipsOfComisionMarca(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyLineaCategoria(jComboBoxGenerico,"Formulario");

				this.recargarFormComisionMarca(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
				
				ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionMarca.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionMarca.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionMarcaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionmarcaAnterior =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionmarcaAnterior =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarComisionMarca")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosComisionMarcaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosComisionMarca.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.comisionmarca =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.comisionmarca =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.comisionmarca);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarComisionMarca")) {
				
				}
				
				ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarComisionMarca")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosComisionMarca.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarComisionMarca")) {
			
			}
			
			ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessComisionMarca();
			
			ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
			
			if(sTipo.equals("NuevoComisionMarca")) {
				jButtonNuevoComisionMarcaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarComisionMarca")) {
				jButtonDuplicarComisionMarcaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarComisionMarca")) {
				jButtonCopiarComisionMarcaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormComisionMarca")) {
				jButtonVerFormComisionMarcaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesComisionMarca")) {
				jButtonNuevoComisionMarcaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarComisionMarca")) {
				jButtonModificarComisionMarcaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarComisionMarca")) {
				jButtonActualizarComisionMarcaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarComisionMarca")) {
				jButtonEliminarComisionMarcaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaComisionMarca")) {
				jButtonGuardarCambiosComisionMarcaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarComisionMarca")) {
				jButtonCancelarComisionMarcaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarComisionMarca")) {
				jButtonCerrarComisionMarcaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosComisionMarca")) {
				jButtonGuardarCambiosComisionMarcaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosComisionMarca")) {
				jButtonNuevoGuardarCambiosComisionMarcaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByComisionMarca")) {
				jButtonAbrirOrderByComisionMarcaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionComisionMarca")) {
				jButtonRecargarInformacionComisionMarcaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresComisionMarca")) {
				jButtonAnterioresComisionMarcaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesComisionMarca")) {
				jButtonSiguientesComisionMarcaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idComisionMarcaBusqueda")) {
				this.jButtonidComisionMarcaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaComisionMarcaUpdate")) {
				this.jButtonid_empresaComisionMarcaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaComisionMarcaBusqueda")) {
				this.jButtonid_empresaComisionMarcaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_comision_configComisionMarcaUpdate")) {
				this.jButtonid_comision_configComisionMarcaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_comision_configComisionMarcaBusqueda")) {
				this.jButtonid_comision_configComisionMarcaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_vendedorComisionMarca")) {
				this.jButtonid_vendedorComisionMarcaActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_vendedorComisionMarcaArbol")) {
				this.abrirFrameTreeVendedor("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorComisionMarcaUpdate")) {
				this.jButtonid_vendedorComisionMarcaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorComisionMarcaBusqueda")) {
				this.jButtonid_vendedorComisionMarcaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaComisionMarcaUpdate")) {
				this.jButtonid_lineaComisionMarcaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaComisionMarcaBusqueda")) {
				this.jButtonid_lineaComisionMarcaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoComisionMarcaUpdate")) {
				this.jButtonid_linea_grupoComisionMarcaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoComisionMarcaBusqueda")) {
				this.jButtonid_linea_grupoComisionMarcaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_categoriaComisionMarcaUpdate")) {
				this.jButtonid_linea_categoriaComisionMarcaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_categoriaComisionMarcaBusqueda")) {
				this.jButtonid_linea_categoriaComisionMarcaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_marcaComisionMarcaUpdate")) {
				this.jButtonid_linea_marcaComisionMarcaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_marcaComisionMarcaBusqueda")) {
				this.jButtonid_linea_marcaComisionMarcaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_comisionComisionMarcaUpdate")) {
				this.jButtonid_estado_comisionComisionMarcaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_comisionComisionMarcaBusqueda")) {
				this.jButtonid_estado_comisionComisionMarcaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeComisionMarcaBusqueda")) {
				this.jButtonporcentajeComisionMarcaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionComisionMarcaBusqueda")) {
				this.jButtondescripcionComisionMarcaBusquedaActionPerformed(evt);
			}
			
			ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessComisionMarca();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameComisionMarca")) {
				closingInternalFrameComisionMarca();
				
			} else if(sTipo.equals("jButtonCancelarComisionMarca")) {
				JInternalFrameBase jInternalFrameDetalleFormComisionMarca = (JInternalFrameBase)evt.getSource();
	            	
	            ComisionMarcaBeanSwingJInternalFrame jInternalFrameParent=(ComisionMarcaBeanSwingJInternalFrame)jInternalFrameDetalleFormComisionMarca.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarComisionMarcaActionPerformed(null);
			}
			
			ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.comisionmarca,new Object(),this.comisionmarcaParameterGeneral,this.comisionmarcaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormComisionMarca(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormComisionMarca(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormComisionMarca(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.comisionmarca)) {
			if(!esControlTabla) {
				if(ComisionMarcaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualComisionMarca(this.comisionmarca,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);			
				}
				
				if(this.comisionmarcaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualComisionMarca(this.comisionmarca,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.comisionmarcaReturnGeneral=comisionmarcaLogic.procesarEventosComisionMarcasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisionmarcaLogic.getComisionMarcas(),this.comisionmarca,this.comisionmarcaParameterGeneral,this.isEsNuevoComisionMarca,classes);//this.comisionmarcaLogic.getComisionMarca()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanComisionMarca(this.comisionmarcaReturnGeneral,this.comisionmarcaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.comisionmarcaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanComisionMarca(classes,this.comisionmarcaReturnGeneral,this.comisionmarcaBean,false);
					}
						
					if(this.comisionmarcaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyComisionMarca(this.comisionmarcaReturnGeneral.getComisionMarca());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioComisionMarca(this.comisionmarcaReturnGeneral.getComisionMarca());	
					}
						
					if(this.comisionmarcaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioComisionMarca(this.comisionmarcaReturnGeneral.getComisionMarca(),classes);//this.comisionmarcaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioComisionMarca(this.comisionmarca,classes);//this.comisionmarcaBean);									
				}
			
				if(ComisionMarcaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualComisionMarca(this.comisionmarca,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionMarca(this.comisionmarca);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.comisionmarcaAnterior!=null) {
						this.comisionmarca=this.comisionmarcaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.comisionmarcaReturnGeneral=comisionmarcaLogic.procesarEventosComisionMarcasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisionmarcaLogic.getComisionMarcas(),this.comisionmarca,this.comisionmarcaParameterGeneral,this.isEsNuevoComisionMarca,classes);//this.comisionmarcaLogic.getComisionMarca()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.comisionmarcaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.comisionmarcaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.comisionmarcaReturnGeneral.getComisionMarca(),comisionmarcaLogic.getComisionMarcas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.comisionmarcaReturnGeneral.getComisionMarca(),this.comisionmarcas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosComisionMarca.repaint();
				
				//((AbstractTableModel) this.jTableDatosComisionMarca.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosComisionMarca();
			}
		}
	}
	
	public void actualizarVisualTableDatosComisionMarca() throws Exception {
		
		ComisionMarcaModel comisionmarcaModel=(ComisionMarcaModel)this.jTableDatosComisionMarca.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comisionmarcaModel.comisionmarcas=this.comisionmarcaLogic.getComisionMarcas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			comisionmarcaModel.comisionmarcas=this.comisionmarcas;
		}
		
		
		((ComisionMarcaModel) this.jTableDatosComisionMarca.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaComisionMarca() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcomisionmarcaAnterior(),this.comisionmarcaLogic.getComisionMarcas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcomisionmarcaAnterior(),this.comisionmarcas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosComisionMarca();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioComisionMarca(ComisionMarca comisionmarca,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
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
										
				ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisionmarca,new Object(),generalEntityParameterGeneral,this.comisionmarcaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.comisionmarcaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ComisionMarcaConstantesFunciones.getClassesRelationshipsOfComisionMarca(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ComisionMarcaConstantesFunciones.getClassesRelationshipsFromStringsOfComisionMarca(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormComisionMarca(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ComisionMarcaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisionmarca,new Object(),generalEntityParameterGeneral,this.comisionmarcaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioComisionMarca(ComisionMarcaBean comisionmarcaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanComisionMarca(ArrayList<Classe> classes,ComisionMarcaReturnGeneral comisionmarcaReturnGeneral,ComisionMarcaBean comisionmarcaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualComisionMarca(ComisionMarca comisionmarca,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.comisionmarca)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormComisionMarca = new ComisionMarcaDetalleFormJInternalFrame(jDesktopPane,this.comisionmarcaSessionBean.getConGuardarRelaciones(),this.comisionmarcaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.setVisible(false);
		this.jInternalFrameDetalleFormComisionMarca.setSelected(false);						
		
		this.jInternalFrameDetalleFormComisionMarca.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormComisionMarca.comisionmarcaLogic=this.comisionmarcaLogic;
		
		this.cargarCombosFrameForeignKeyComisionMarca("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleComisionMarca();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleComisionMarca();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyComisionMarca("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyComisionMarca();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormComisionMarca.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarComisionMarca"));
		
		this.jInternalFrameDetalleFormComisionMarca.jButtonModificarComisionMarca.addActionListener(new ButtonActionListener(this,"ModificarComisionMarca"));

		
		this.jInternalFrameDetalleFormComisionMarca.jButtonModificarToolBarComisionMarca.addActionListener(new ButtonActionListener(this,"ModificarToolBarComisionMarca"));
					
		this.jInternalFrameDetalleFormComisionMarca.jMenuItemModificarComisionMarca.addActionListener(new ButtonActionListener(this,"MenuItemModificarComisionMarca"));		
		
		
		
		this.jInternalFrameDetalleFormComisionMarca.jButtonActualizarComisionMarca.addActionListener (new ButtonActionListener(this,"ActualizarComisionMarca"));
		
		
		this.jInternalFrameDetalleFormComisionMarca.jButtonActualizarToolBarComisionMarca.addActionListener(new ButtonActionListener(this,"ActualizarToolBarComisionMarca"));
						
		this.jInternalFrameDetalleFormComisionMarca.jMenuItemActualizarComisionMarca.addActionListener (new ButtonActionListener(this,"MenuItemActualizarComisionMarca"));		
		
		
		
		this.jInternalFrameDetalleFormComisionMarca.jButtonEliminarComisionMarca.addActionListener (new ButtonActionListener(this,"EliminarComisionMarca"));
		
		
		this.jInternalFrameDetalleFormComisionMarca.jButtonEliminarToolBarComisionMarca.addActionListener (new ButtonActionListener(this,"EliminarToolBarComisionMarca"));
								
		this.jInternalFrameDetalleFormComisionMarca.jMenuItemEliminarComisionMarca.addActionListener (new ButtonActionListener(this,"MenuItemEliminarComisionMarca"));		
		
		
		
		this.jInternalFrameDetalleFormComisionMarca.jButtonCancelarComisionMarca.addActionListener (new ButtonActionListener(this,"CancelarComisionMarca"));
		
		
		this.jInternalFrameDetalleFormComisionMarca.jButtonCancelarToolBarComisionMarca.addActionListener (new ButtonActionListener(this,"CancelarToolBarComisionMarca"));
					
		this.jInternalFrameDetalleFormComisionMarca.jMenuItemCancelarComisionMarca.addActionListener (new ButtonActionListener(this,"MenuItemCancelarComisionMarca"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormComisionMarca.jMenuItemDetalleCerrarComisionMarca.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarComisionMarca"));		
		
		
		
		this.jInternalFrameDetalleFormComisionMarca.jButtonGuardarCambiosToolBarComisionMarca.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComisionMarca"));
		
		
		
		this.jInternalFrameDetalleFormComisionMarca.jButtonGuardarCambiosToolBarComisionMarca.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComisionMarca"));
		
		
		
		this.jInternalFrameDetalleFormComisionMarca.jComboBoxTiposAccionesFormularioComisionMarca.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioComisionMarca"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonidComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"idComisionMarcaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_empresaComisionMarcaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComisionMarcaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_empresaComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComisionMarcaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_comision_configComisionMarcaUpdate.addActionListener(new ButtonActionListener(this,"id_comision_configComisionMarcaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_comision_configComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"id_comision_configComisionMarcaBusqueda"));
		//jButtonid_vendedorComisionMarca.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_vendedorComisionMarcaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_vendedorComisionMarca.addActionListener(new ButtonActionListener(this,"id_vendedorComisionMarca"));
		//jButtonid_vendedorComisionMarcaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeVendedor("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_vendedorComisionMarcaArbol.addActionListener(new ButtonActionListener(this,"id_vendedorComisionMarcaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_vendedorComisionMarcaUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorComisionMarcaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_vendedorComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorComisionMarcaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_lineaComisionMarcaUpdate.addActionListener(new ButtonActionListener(this,"id_lineaComisionMarcaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_lineaComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaComisionMarcaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_linea_grupoComisionMarcaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoComisionMarcaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_linea_grupoComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoComisionMarcaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_linea_categoriaComisionMarcaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaComisionMarcaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_linea_categoriaComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaComisionMarcaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_linea_marcaComisionMarcaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaComisionMarcaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_linea_marcaComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaComisionMarcaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_estado_comisionComisionMarcaUpdate.addActionListener(new ButtonActionListener(this,"id_estado_comisionComisionMarcaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_estado_comisionComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_comisionComisionMarcaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonporcentajeComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeComisionMarcaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtondescripcionComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionComisionMarcaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormComisionMarca.jTabbedPaneRelacionesComisionMarca.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesComisionMarca"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameComisionMarca"));
		
		if(this.jInternalFrameDetalleFormComisionMarca!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionMarca.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarComisionMarca"));
		}
		
		this.jTableDatosComisionMarca.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarComisionMarca"));
		
		this.jTableDatosComisionMarca.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarComisionMarca"));
		
		this.jButtonNuevoComisionMarca.addActionListener(new ButtonActionListener(this,"NuevoComisionMarca"));
		
		this.jButtonDuplicarComisionMarca.addActionListener(new ButtonActionListener(this,"DuplicarComisionMarca"));
		
		this.jButtonCopiarComisionMarca.addActionListener(new ButtonActionListener(this,"CopiarComisionMarca"));
		
		this.jButtonVerFormComisionMarca.addActionListener(new ButtonActionListener(this,"VerFormComisionMarca"));
		
		
		this.jButtonNuevoToolBarComisionMarca.addActionListener(new ButtonActionListener(this,"NuevoToolBarComisionMarca"));
			
		this.jButtonDuplicarToolBarComisionMarca.addActionListener(new ButtonActionListener(this,"DuplicarToolBarComisionMarca"));
			
		this.jMenuItemNuevoComisionMarca.addActionListener (new ButtonActionListener(this,"MenuItemNuevoComisionMarca"));
			
		this.jMenuItemDuplicarComisionMarca.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarComisionMarca"));		
		
		
		this.jButtonNuevoRelacionesComisionMarca.addActionListener (new ButtonActionListener(this,"NuevoRelacionesComisionMarca"));
		
		
		this.jButtonNuevoRelacionesToolBarComisionMarca.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarComisionMarca"));
			
		this.jMenuItemNuevoRelacionesComisionMarca.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesComisionMarca"));		
		
		
		if(this.jInternalFrameDetalleFormComisionMarca!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionMarca.jButtonModificarComisionMarca.addActionListener(new ButtonActionListener(this,"ModificarComisionMarca"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionMarca!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionMarca.jButtonModificarToolBarComisionMarca.addActionListener(new ButtonActionListener(this,"ModificarToolBarComisionMarca"));
			
			this.jInternalFrameDetalleFormComisionMarca.jMenuItemModificarComisionMarca.addActionListener(new ButtonActionListener(this,"MenuItemModificarComisionMarca"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisionMarca!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormComisionMarca.jButtonActualizarComisionMarca.addActionListener (new ButtonActionListener(this,"ActualizarComisionMarca"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionMarca!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionMarca.jButtonActualizarToolBarComisionMarca.addActionListener(new ButtonActionListener(this,"ActualizarToolBarComisionMarca"));
				
			this.jInternalFrameDetalleFormComisionMarca.jMenuItemActualizarComisionMarca.addActionListener (new ButtonActionListener(this,"MenuItemActualizarComisionMarca"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisionMarca!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionMarca.jButtonEliminarComisionMarca.addActionListener (new ButtonActionListener(this,"EliminarComisionMarca"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionMarca!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionMarca.jButtonEliminarToolBarComisionMarca.addActionListener (new ButtonActionListener(this,"EliminarToolBarComisionMarca"));
						
			this.jInternalFrameDetalleFormComisionMarca.jMenuItemEliminarComisionMarca.addActionListener (new ButtonActionListener(this,"MenuItemEliminarComisionMarca"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisionMarca!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionMarca.jButtonCancelarComisionMarca.addActionListener (new ButtonActionListener(this,"CancelarComisionMarca"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionMarca!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionMarca.jButtonCancelarToolBarComisionMarca.addActionListener (new ButtonActionListener(this,"CancelarToolBarComisionMarca"));
			
			this.jInternalFrameDetalleFormComisionMarca.jMenuItemCancelarComisionMarca.addActionListener (new ButtonActionListener(this,"MenuItemCancelarComisionMarca"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarComisionMarca.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarComisionMarca"));		
		
		
		this.jButtonCerrarComisionMarca.addActionListener (new ButtonActionListener(this,"CerrarComisionMarca"));
		
		
		this.jButtonCerrarToolBarComisionMarca.addActionListener (new ButtonActionListener(this,"CerrarToolBarComisionMarca"));
			
		this.jMenuItemCerrarComisionMarca.addActionListener (new ButtonActionListener(this,"MenuItemCerrarComisionMarca"));
			
		if(this.jInternalFrameDetalleFormComisionMarca!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionMarca.jMenuItemDetalleCerrarComisionMarca.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarComisionMarca"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisionMarca!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionMarca.jButtonGuardarCambiosComisionMarca.addActionListener (new ButtonActionListener(this,"GuardarCambiosComisionMarca"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionMarca!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionMarca.jButtonGuardarCambiosToolBarComisionMarca.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComisionMarca"));
		}
		
		this.jButtonCopiarToolBarComisionMarca.addActionListener (new ButtonActionListener(this,"CopiarToolBarComisionMarca"));
			
		this.jButtonVerFormToolBarComisionMarca.addActionListener (new ButtonActionListener(this,"VerFormToolBarComisionMarca"));
		
		this.jMenuItemGuardarCambiosComisionMarca.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosComisionMarca"));
			
		this.jMenuItemCopiarComisionMarca.addActionListener (new ButtonActionListener(this,"MenuItemCopiarComisionMarca"));		
		
		this.jMenuItemVerFormComisionMarca.addActionListener (new ButtonActionListener(this,"MenuItemVerFormComisionMarca"));		
		
		
		this.jButtonGuardarCambiosTablaComisionMarca.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaComisionMarca"));
		
		
		this.jButtonGuardarCambiosTablaToolBarComisionMarca.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarComisionMarca"));
			
		this.jMenuItemGuardarCambiosTablaComisionMarca.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaComisionMarca"));		
		
		
		
		this.jButtonRecargarInformacionComisionMarca.addActionListener (new ButtonActionListener(this,"RecargarInformacionComisionMarca"));
					
		this.jButtonRecargarInformacionToolBarComisionMarca.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarComisionMarca"));
		
		this.jMenuItemRecargarInformacionComisionMarca.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionComisionMarca"));		
		
		
		
		this.jButtonAnterioresComisionMarca.addActionListener (new ButtonActionListener(this,"AnterioresComisionMarca"));
		
		
		this.jButtonAnterioresToolBarComisionMarca.addActionListener (new ButtonActionListener(this,"AnterioresToolBarComisionMarca"));
		
		this.jMenuItemAnterioresComisionMarca.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresComisionMarca"));		
		
		
		this.jButtonSiguientesComisionMarca.addActionListener (new ButtonActionListener(this,"SiguientesComisionMarca"));
		
		
		this.jButtonSiguientesToolBarComisionMarca.addActionListener (new ButtonActionListener(this,"SiguientesToolBarComisionMarca"));
			
		this.jMenuItemSiguientesComisionMarca.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesComisionMarca"));
			
		this.jMenuItemAbrirOrderByComisionMarca.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByComisionMarca"));
			
		this.jMenuItemMostrarOcultarComisionMarca.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarComisionMarca"));
			
		this.jMenuItemDetalleAbrirOrderByComisionMarca.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByComisionMarca"));
			
		this.jMenuItemDetalleMostarOcultarComisionMarca.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarComisionMarca"));		
		
		
		this.jButtonNuevoGuardarCambiosComisionMarca.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosComisionMarca"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarComisionMarca.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarComisionMarca"));
			
		this.jMenuItemNuevoGuardarCambiosComisionMarca.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosComisionMarca"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosComisionMarca.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosComisionMarca"));

		this.jCheckBoxSeleccionadosComisionMarca.addItemListener(new CheckBoxItemListener(this,"SeleccionadosComisionMarca"));
		
		if(this.jInternalFrameDetalleFormComisionMarca!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionMarca.jComboBoxTiposAccionesFormularioComisionMarca.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioComisionMarca"));
		}
		
		
		this.jComboBoxTiposRelacionesComisionMarca.addActionListener (new ButtonActionListener(this,"TiposRelacionesComisionMarca"));
			
		this.jComboBoxTiposAccionesComisionMarca.addActionListener (new ButtonActionListener(this,"TiposAccionesComisionMarca"));
					
		this.jComboBoxTiposSeleccionarComisionMarca.addActionListener (new ButtonActionListener(this,"TiposSeleccionarComisionMarca"));
			
		this.jTextFieldValorCampoGeneralComisionMarca.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralComisionMarca"));		
		
		
		if(this.jInternalFrameDetalleFormComisionMarca!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonidComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"idComisionMarcaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_empresaComisionMarcaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComisionMarcaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_empresaComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComisionMarcaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_comision_configComisionMarcaUpdate.addActionListener(new ButtonActionListener(this,"id_comision_configComisionMarcaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_comision_configComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"id_comision_configComisionMarcaBusqueda"));
		//jButtonid_vendedorComisionMarca.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_vendedorComisionMarcaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_vendedorComisionMarca.addActionListener(new ButtonActionListener(this,"id_vendedorComisionMarca"));
		//jButtonid_vendedorComisionMarcaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeVendedor("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_vendedorComisionMarcaArbol.addActionListener(new ButtonActionListener(this,"id_vendedorComisionMarcaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_vendedorComisionMarcaUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorComisionMarcaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_vendedorComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorComisionMarcaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_lineaComisionMarcaUpdate.addActionListener(new ButtonActionListener(this,"id_lineaComisionMarcaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_lineaComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaComisionMarcaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_linea_grupoComisionMarcaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoComisionMarcaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_linea_grupoComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoComisionMarcaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_linea_categoriaComisionMarcaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaComisionMarcaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_linea_categoriaComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaComisionMarcaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_linea_marcaComisionMarcaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaComisionMarcaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_linea_marcaComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaComisionMarcaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_estado_comisionComisionMarcaUpdate.addActionListener(new ButtonActionListener(this,"id_estado_comisionComisionMarcaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_estado_comisionComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_comisionComisionMarcaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonporcentajeComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeComisionMarcaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtondescripcionComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionComisionMarcaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdComisionConfigComisionMarca.addActionListener(new ButtonActionListener(this,"FK_IdComisionConfigComisionMarca"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoComisionMarca!=null) {
				this.jInternalFrameReporteDinamicoComisionMarca.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComisionMarca"));
				this.jInternalFrameReporteDinamicoComisionMarca.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComisionMarca"));
				this.jInternalFrameReporteDinamicoComisionMarca.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComisionMarca"));
			}
			
			//this.jButtonCerrarReporteDinamicoComisionMarca.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComisionMarca"));				
			//this.jButtonGenerarReporteDinamicoComisionMarca.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComisionMarca"));
			//this.jButtonGenerarExcelReporteDinamicoComisionMarca.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComisionMarca"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionComisionMarca!=null) {
				this.jInternalFrameImportacionComisionMarca.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionComisionMarca"));
				this.jInternalFrameImportacionComisionMarca.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionComisionMarca"));
				this.jInternalFrameImportacionComisionMarca.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionComisionMarca"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByComisionMarca.addActionListener (new ButtonActionListener(this,"AbrirOrderByComisionMarca"));
			
			this.jButtonAbrirOrderByToolBarComisionMarca.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarComisionMarca"));			
			
			if(this.jInternalFrameOrderByComisionMarca!=null) {
				this.jInternalFrameOrderByComisionMarca.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByComisionMarca"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormComisionMarca!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormComisionMarca!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionMarca.jTabbedPaneRelacionesComisionMarca.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesComisionMarca"));
		
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
            		closingInternalFrameComisionMarca();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormComisionMarca.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormComisionMarca = (JInternalFrameBase)event.getSource();
	            	
	            ComisionMarcaBeanSwingJInternalFrame jInternalFrameParent=(ComisionMarcaBeanSwingJInternalFrame)jInternalFrameDetalleFormComisionMarca.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarComisionMarcaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosComisionMarca.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosComisionMarcaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosComisionMarca.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosComisionMarca.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionMarcaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionMarcaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionMarcaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoComisionMarca";
		inputMap = this.jButtonNuevoComisionMarca.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoComisionMarca.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoComisionMarcaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionMarcaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionMarcaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionMarcaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesComisionMarca";
		inputMap = this.jButtonNuevoRelacionesComisionMarca.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesComisionMarca.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoComisionMarcaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarComisionMarca";
		inputMap = this.jButtonModificarComisionMarca.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarComisionMarca.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarComisionMarcaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarComisionMarca";
		inputMap = this.jButtonActualizarComisionMarca.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarComisionMarca.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarComisionMarcaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarComisionMarca";
		inputMap = this.jButtonEliminarComisionMarca.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarComisionMarca.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarComisionMarcaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarComisionMarca";
		inputMap = this.jButtonCancelarComisionMarca.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarComisionMarca.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarComisionMarcaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarComisionMarca";
		inputMap = this.jButtonCerrarComisionMarca.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarComisionMarca.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarComisionMarcaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormComisionMarca.jButtonGuardarCambiosComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosComisionMarca";
		inputMap = this.jInternalFrameDetalleFormComisionMarca.jButtonGuardarCambiosComisionMarca.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormComisionMarca.jButtonGuardarCambiosComisionMarca.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosComisionMarcaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosComisionMarca.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosComisionMarcaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesComisionMarca.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesComisionMarcaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarComisionMarca.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarComisionMarcaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralComisionMarca.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralComisionMarcaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonidComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"idComisionMarcaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_empresaComisionMarcaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComisionMarcaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_empresaComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComisionMarcaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_comision_configComisionMarcaUpdate.addActionListener(new ButtonActionListener(this,"id_comision_configComisionMarcaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_comision_configComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"id_comision_configComisionMarcaBusqueda"));
		//jButtonid_vendedorComisionMarca.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_vendedorComisionMarcaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_vendedorComisionMarca.addActionListener(new ButtonActionListener(this,"id_vendedorComisionMarca"));
		//jButtonid_vendedorComisionMarcaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeVendedor("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_vendedorComisionMarcaArbol.addActionListener(new ButtonActionListener(this,"id_vendedorComisionMarcaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_vendedorComisionMarcaUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorComisionMarcaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_vendedorComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorComisionMarcaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_lineaComisionMarcaUpdate.addActionListener(new ButtonActionListener(this,"id_lineaComisionMarcaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_lineaComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaComisionMarcaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_linea_grupoComisionMarcaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoComisionMarcaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_linea_grupoComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoComisionMarcaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_linea_categoriaComisionMarcaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_categoriaComisionMarcaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_linea_categoriaComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_categoriaComisionMarcaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_linea_marcaComisionMarcaUpdate.addActionListener(new ButtonActionListener(this,"id_linea_marcaComisionMarcaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_linea_marcaComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_marcaComisionMarcaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_estado_comisionComisionMarcaUpdate.addActionListener(new ButtonActionListener(this,"id_estado_comisionComisionMarcaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonid_estado_comisionComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_comisionComisionMarcaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtonporcentajeComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeComisionMarcaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionMarca.jButtondescripcionComisionMarcaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionComisionMarcaBusqueda"));
		
		
		this.jButtonFK_IdComisionConfigComisionMarca.addActionListener(new ButtonActionListener(this,"FK_IdComisionConfigComisionMarca"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionComisionMarca.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionComisionMarcaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarComisionMarcaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarComisionMarca.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosComisionMarca(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ComisionMarca comisionmarcaAux:this.comisionmarcaLogic.getComisionMarcas()) {
					comisionmarcaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComisionMarca comisionmarcaAux:comisionmarcas) {
					comisionmarcaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosComisionMarcaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingComisionMarca(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ComisionMarca comisionmarcaAux:this.comisionmarcaLogic.getComisionMarcas()) {
						comisionmarcaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComisionMarca comisionmarcaAux:comisionmarcas) {
						comisionmarcaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ComisionMarca comisionmarcaAux:this.comisionmarcaLogic.getComisionMarcas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComisionMarca comisionmarcaAux:comisionmarcas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaComisionMarca(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosComisionMarca.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosComisionMarca.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosComisionMarca,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosComisionMarcaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingComisionMarca(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosComisionMarca.getSelectedRows();
			
			ComisionMarca comisionmarcaLocal=new ComisionMarca();
			
			//this.seleccionarTodosComisionMarca(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionmarcaLocal =(ComisionMarca) this.comisionmarcaLogic.getComisionMarcas().toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					comisionmarcaLocal =(ComisionMarca) this.comisionmarcas.toArray()[this.jTableDatosComisionMarca.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				comisionmarcaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ComisionMarca comisionmarcaAux:this.comisionmarcaLogic.getComisionMarcas()) {
						comisionmarcaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComisionMarca comisionmarcaAux:comisionmarcas) {
						comisionmarcaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaComisionMarca(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosComisionMarca.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosComisionMarca.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosComisionMarca,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualComisionMarcaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarComisionMarcaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralComisionMarcaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingComisionMarca(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralComisionMarca.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ComisionMarca comisionmarcaAux:this.comisionmarcaLogic.getComisionMarcas()) {
				
						if(sTipoSeleccionar.equals(ComisionMarcaConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							comisionmarcaAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComisionMarcaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							comisionmarcaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComisionMarca comisionmarcaAux:comisionmarcas) {
					
						if(sTipoSeleccionar.equals(ComisionMarcaConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							comisionmarcaAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComisionMarcaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							comisionmarcaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaComisionMarca(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesComisionMarcaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingComisionMarca(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioComisionMarca=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesComisionMarca.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormComisionMarca.jComboBoxTiposAccionesFormularioComisionMarca.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteComisionMarca) {				
					conSplash=true;//false;										
					
					//this.startProcessComisionMarca(conSplash);
				
					this.generarReporteComisionMarcasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisionMarca.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisionMarca.jComboBoxTiposAccionesFormularioComisionMarca.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoComisionMarcasSeleccionados();
				//this.jComboBoxTiposAccionesComisionMarca.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoComisionMarcasSeleccionados(false);
				//this.jComboBoxTiposAccionesComisionMarca.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoComisionMarcasSeleccionados(true);
				//this.jComboBoxTiposAccionesComisionMarca.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessComisionMarca();
				
				this.exportarComisionMarcasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisionMarca.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisionMarca.jComboBoxTiposAccionesFormularioComisionMarca.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionComisionMarcas();
				//this.importarComisionMarcas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisionMarca.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisionMarca.jComboBoxTiposAccionesFormularioComisionMarca.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessComisionMarca();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelComisionMarcasSeleccionados();
				//this.jComboBoxTiposAccionesComisionMarca.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Comision Marca", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessComisionMarca();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoComisionMarca)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyComisionMarca(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Comision Marca",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisionMarca.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisionMarca.jComboBoxTiposAccionesFormularioComisionMarca.setSelectedIndex(0);					
				}	
			} 			
			else if(ComisionMarcaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteComisionMarca) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessComisionMarca(conSplash);
					
						//this.actualizarParametrosGeneralComisionMarca();
						
						this.generarReporteProcesoAccionComisionMarcasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesComisionMarca.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormComisionMarca.jComboBoxTiposAccionesFormularioComisionMarca.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ComisionMarcaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Comision MarcaS SELECCIONADOS?", "MANTENIMIENTO DE Comision Marca", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessComisionMarca();
				
						this.actualizarParametrosGeneralComisionMarca();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.comisionmarcaReturnGeneral=comisionmarcaLogic.procesarAccionComisionMarcasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.comisionmarcaLogic.getComisionMarcas(),this.comisionmarcaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarComisionMarcaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesComisionMarca.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormComisionMarca.jComboBoxTiposAccionesFormularioComisionMarca.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralComisionMarca();
					
					ComisionMarcaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarComisionMarcaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesComisionMarca.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormComisionMarca.jComboBoxTiposAccionesFormularioComisionMarca.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessComisionMarca(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesComisionMarcaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessComisionMarca();
			
			if(this.jInternalFrameDetalleFormComisionMarca==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ComisionMarca> comisionmarcasSeleccionados=new ArrayList<ComisionMarca>();		
			ComisionMarca comisionmarca=new ComisionMarca();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingComisionMarca(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesComisionMarca.getSelectedItem();
			
			
			
			
			comisionmarcasSeleccionados=this.getComisionMarcasSeleccionados(true);
			//this.sTipoAccion;
			
			if(comisionmarcasSeleccionados.size()==1) {
				for(ComisionMarca comisionmarcaAux:comisionmarcasSeleccionados) {
					comisionmarca=comisionmarcaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessComisionMarca();
			
      		//this.finishProcessComisionMarca(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarComisionMarcaReturnGeneral() throws Exception {
		if(this.comisionmarcaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.comisionmarcaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.comisionmarcaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.comisionmarcaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.comisionmarcaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.comisionmarcaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingComisionMarca(false);
		}
		
		if(this.comisionmarcaReturnGeneral.getConRetornoLista() || this.comisionmarcaReturnGeneral.getConRetornoObjeto()) {
			if(this.comisionmarcaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.comisionmarcaLogic.setComisionMarcas(this.comisionmarcaReturnGeneral.getComisionMarcas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.comisionmarcaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.comisionmarcaLogic.setComisionMarca(this.comisionmarcaReturnGeneral.getComisionMarca());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingComisionMarca(false);
		}
	}
	
	public void actualizarParametrosGeneralComisionMarca() throws Exception {
		
		
	}
	
	public ArrayList<ComisionMarca> getComisionMarcasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ComisionMarca> comisionmarcasSeleccionados=new ArrayList<ComisionMarca>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioComisionMarca) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ComisionMarca comisionmarcaAux:comisionmarcaLogic.getComisionMarcas()) {
					if(comisionmarcaAux.getIsSelected()) {
						comisionmarcasSeleccionados.add(comisionmarcaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComisionMarca comisionmarcaAux:this.comisionmarcas) {
					if(comisionmarcaAux.getIsSelected()) {
						comisionmarcasSeleccionados.add(comisionmarcaAux);				
					}
				}
			}
			
			if(comisionmarcasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						comisionmarcasSeleccionados.addAll(this.comisionmarcaLogic.getComisionMarcas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						comisionmarcasSeleccionados.addAll(this.comisionmarcas);				
					}
				}
			}
		} else {
			comisionmarcasSeleccionados.add(this.comisionmarca);
		}
		
		return comisionmarcasSeleccionados;
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
	
	public void generarReporteComisionMarcasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalComisionMarcasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoComisionMarcasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoComisionMarcasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoComisionMarcasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Comision Marca",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesComisionMarcasSeleccionados() throws Exception {
		ArrayList<ComisionMarca> comisionmarcasSeleccionados=new ArrayList<ComisionMarca>();		
		
		comisionmarcasSeleccionados=this.getComisionMarcasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteComisionMarcas("Todos",comisionmarcasSeleccionados);
		
	}	
	
	public void generarReporteNormalComisionMarcasSeleccionados() throws Exception {
		ArrayList<ComisionMarca> comisionmarcasSeleccionados=new ArrayList<ComisionMarca>();		
		
		comisionmarcasSeleccionados=this.getComisionMarcasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteComisionMarcas("Todos",comisionmarcasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionComisionMarcasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ComisionMarca> comisionmarcasSeleccionados=new ArrayList<ComisionMarca>();
		
		comisionmarcasSeleccionados=this.getComisionMarcasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteComisionMarcas("Todos",comisionmarcasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoComisionMarcasSeleccionados() throws Exception {
		ArrayList<ComisionMarca> comisionmarcasSeleccionados=new ArrayList<ComisionMarca>();		
		
		
		this.abrirInicializarFrameReporteDinamicoComisionMarca();
		
		
		comisionmarcasSeleccionados=this.getComisionMarcasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoComisionMarca();
		
		
		//this.generarReporteComisionMarcas("Todos",comisionmarcasSeleccionados ,comisionmarcaImplementable,comisionmarcaImplementableHome);
	}
	
	public void mostrarImportacionComisionMarcas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionComisionMarca();
		
		this.abrirFrameImportacionComisionMarca();		
		
			
		//this.generarReporteComisionMarcas("Todos",comisionmarcasSeleccionados ,comisionmarcaImplementable,comisionmarcaImplementableHome);
	}
	
	public void importarComisionMarcas() throws Exception {		
	
	}
	
	public void exportarComisionMarcasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelComisionMarcasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoComisionMarcasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlComisionMarcasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Comision Marca",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoComisionMarcasSeleccionados() throws Exception {
		ArrayList<ComisionMarca> comisionmarcasSeleccionados=new ArrayList<ComisionMarca>();		
		
		comisionmarcasSeleccionados=this.getComisionMarcasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionmarca."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarComisionMarca(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ComisionMarca comisionmarcaAux:comisionmarcasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarComisionMarca(comisionmarcaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//comisionmarcaAux.setsDetalleGeneralEntityReporte(comisionmarcaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Marca",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarComisionMarca(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ComisionMarcaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionMarcaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionMarcaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionMarcaConstantesFunciones.LABEL_IDCOMISIONCONFIG;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionMarcaConstantesFunciones.LABEL_IDVENDEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionMarcaConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionMarcaConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionMarcaConstantesFunciones.LABEL_IDLINEACATEGORIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionMarcaConstantesFunciones.LABEL_IDLINEAMARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionMarcaConstantesFunciones.LABEL_IDESTADOCOMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionMarcaConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionMarcaConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarComisionMarca(ComisionMarca comisionmarca,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=comisionmarca.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionmarca.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionmarca.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionmarca.getcomisionconfig_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionmarca.getvendedor_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionmarca.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionmarca.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionmarca.getlineacategoria_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionmarca.getlineamarca_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionmarca.getestadocomision_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionmarca.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionmarca.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelComisionMarcasSeleccionados() throws Exception {
		ArrayList<ComisionMarca> comisionmarcasSeleccionados=new ArrayList<ComisionMarca>();		
		
		comisionmarcasSeleccionados=this.getComisionMarcasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionmarca.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ComisionMarcas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelComisionMarca(row);				
				iRow++;
			}				
			
			for(ComisionMarca comisionmarcaAux:comisionmarcasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelComisionMarca(comisionmarcaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Marca",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlComisionMarcasSeleccionados() throws Exception {
		ArrayList<ComisionMarca> comisionmarcasSeleccionados=new ArrayList<ComisionMarca>();		
		
		comisionmarcasSeleccionados=this.getComisionMarcasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionmarca.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("comisionmarcas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("comisionmarca");
			//elementRoot.appendChild(element);
		
			for(ComisionMarca comisionmarcaAux:comisionmarcasSeleccionados) {
				element = document.createElement("comisionmarca");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlComisionMarca(comisionmarcaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Marca",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelComisionMarca(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_IDCOMISIONCONFIG);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_IDVENDEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_IDLINEACATEGORIA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_IDLINEAMARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_IDESTADOCOMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionMarcaConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelComisionMarca(ComisionMarca comisionmarca,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(comisionmarca.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionmarca.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionmarca.getcomisionconfig_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionmarca.getvendedor_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionmarca.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionmarca.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionmarca.getlineacategoria_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionmarca.getlineamarca_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionmarca.getestadocomision_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionmarca.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionmarca.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlComisionMarca(ComisionMarca comisionmarca,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ComisionMarcaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(comisionmarca.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ComisionMarcaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(comisionmarca.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ComisionMarcaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(comisionmarca.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcomisionconfig_descripcion = document.createElement(ComisionMarcaConstantesFunciones.IDCOMISIONCONFIG);
		elementcomisionconfig_descripcion.appendChild(document.createTextNode(comisionmarca.getcomisionconfig_descripcion()));
		element.appendChild(elementcomisionconfig_descripcion);

		Element elementvendedor_descripcion = document.createElement(ComisionMarcaConstantesFunciones.IDVENDEDOR);
		elementvendedor_descripcion.appendChild(document.createTextNode(comisionmarca.getvendedor_descripcion()));
		element.appendChild(elementvendedor_descripcion);

		Element elementlinea_descripcion = document.createElement(ComisionMarcaConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(comisionmarca.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(ComisionMarcaConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(comisionmarca.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementlineacategoria_descripcion = document.createElement(ComisionMarcaConstantesFunciones.IDLINEACATEGORIA);
		elementlineacategoria_descripcion.appendChild(document.createTextNode(comisionmarca.getlineacategoria_descripcion()));
		element.appendChild(elementlineacategoria_descripcion);

		Element elementlineamarca_descripcion = document.createElement(ComisionMarcaConstantesFunciones.IDLINEAMARCA);
		elementlineamarca_descripcion.appendChild(document.createTextNode(comisionmarca.getlineamarca_descripcion()));
		element.appendChild(elementlineamarca_descripcion);

		Element elementestadocomision_descripcion = document.createElement(ComisionMarcaConstantesFunciones.IDESTADOCOMISION);
		elementestadocomision_descripcion.appendChild(document.createTextNode(comisionmarca.getestadocomision_descripcion()));
		element.appendChild(elementestadocomision_descripcion);

		Element elementporcentaje = document.createElement(ComisionMarcaConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(comisionmarca.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementdescripcion = document.createElement(ComisionMarcaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(comisionmarca.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoComisionMarcasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ComisionMarca> comisionmarcasSeleccionados=new ArrayList<ComisionMarca>();
		
		comisionmarcasSeleccionados=this.getComisionMarcasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoComisionMarca(comisionmarcasSeleccionados);
		
		this.generarReporteComisionMarcas("Todos",comisionmarcasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoComisionMarca(ArrayList<ComisionMarca> comisionmarcasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ComisionMarca comisionmarcaAux:comisionmarcasSeleccionados) {
				comisionmarcaAux.setsDetalleGeneralEntityReporte(comisionmarcaAux.toString());
			
				if(sTipoSeleccionar.equals(ComisionMarcaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					comisionmarcaAux.setsDescripcionGeneralEntityReporte1(comisionmarcaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionMarcaConstantesFunciones.LABEL_IDCOMISIONCONFIG)) {
					existe=true;
					comisionmarcaAux.setsDescripcionGeneralEntityReporte1(comisionmarcaAux.getcomisionconfig_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionMarcaConstantesFunciones.LABEL_IDVENDEDOR)) {
					existe=true;
					comisionmarcaAux.setsDescripcionGeneralEntityReporte1(comisionmarcaAux.getvendedor_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionMarcaConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					comisionmarcaAux.setsDescripcionGeneralEntityReporte1(comisionmarcaAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionMarcaConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					comisionmarcaAux.setsDescripcionGeneralEntityReporte1(comisionmarcaAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionMarcaConstantesFunciones.LABEL_IDLINEACATEGORIA)) {
					existe=true;
					comisionmarcaAux.setsDescripcionGeneralEntityReporte1(comisionmarcaAux.getlineacategoria_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionMarcaConstantesFunciones.LABEL_IDLINEAMARCA)) {
					existe=true;
					comisionmarcaAux.setsDescripcionGeneralEntityReporte1(comisionmarcaAux.getlineamarca_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionMarcaConstantesFunciones.LABEL_IDESTADOCOMISION)) {
					existe=true;
					comisionmarcaAux.setsDescripcionGeneralEntityReporte1(comisionmarcaAux.getestadocomision_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionMarcaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					comisionmarcaAux.setsDescripcionGeneralEntityReporte1(comisionmarcaAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionMarcaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesComisionMarca(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoComisionMarca=true;
				this.isVisibilidadCeldaNuevoRelacionesComisionMarca=true;
				this.isVisibilidadCeldaGuardarCambiosComisionMarca=true;
			}
			
			this.isVisibilidadCeldaModificarComisionMarca=false;
			this.isVisibilidadCeldaActualizarComisionMarca=false;
			this.isVisibilidadCeldaEliminarComisionMarca=false;
			this.isVisibilidadCeldaCancelarComisionMarca=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionMarca=true;
				} else {
					this.isVisibilidadCeldaGuardarComisionMarca=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoComisionMarca=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionMarca=false;
			this.isVisibilidadCeldaGuardarCambiosComisionMarca=false;
			this.isVisibilidadCeldaModificarComisionMarca=false;
			this.isVisibilidadCeldaActualizarComisionMarca=true;
			this.isVisibilidadCeldaEliminarComisionMarca=false;
			this.isVisibilidadCeldaCancelarComisionMarca=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionMarca=true;
				} else {
					this.isVisibilidadCeldaGuardarComisionMarca=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoComisionMarca=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionMarca=false;
			this.isVisibilidadCeldaGuardarCambiosComisionMarca=false;
			this.isVisibilidadCeldaModificarComisionMarca=false;
			this.isVisibilidadCeldaActualizarComisionMarca=true;
			this.isVisibilidadCeldaEliminarComisionMarca=true;
			this.isVisibilidadCeldaCancelarComisionMarca=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionMarca=true;
				} else {
					this.isVisibilidadCeldaGuardarComisionMarca=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoComisionMarca=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionMarca=false;
			this.isVisibilidadCeldaGuardarCambiosComisionMarca=false;
			this.isVisibilidadCeldaModificarComisionMarca=false;
			this.isVisibilidadCeldaActualizarComisionMarca=true;
			this.isVisibilidadCeldaEliminarComisionMarca=false;
			this.isVisibilidadCeldaCancelarComisionMarca=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionMarca=false;
				} else {
					this.isVisibilidadCeldaGuardarComisionMarca=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoComisionMarca=true;
			this.isVisibilidadCeldaNuevoRelacionesComisionMarca=true;
			this.isVisibilidadCeldaGuardarCambiosComisionMarca=true;
			this.isVisibilidadCeldaModificarComisionMarca=false;
			this.isVisibilidadCeldaActualizarComisionMarca=false;
			this.isVisibilidadCeldaEliminarComisionMarca=false;
			this.isVisibilidadCeldaCancelarComisionMarca=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionMarca=true;
				} else {
					this.isVisibilidadCeldaGuardarComisionMarca=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoComisionMarca=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionMarca=false;
			this.isVisibilidadCeldaGuardarCambiosComisionMarca=false;
			this.isVisibilidadCeldaActualizarComisionMarca=false;
			this.isVisibilidadCeldaEliminarComisionMarca=false;
			this.isVisibilidadCeldaCancelarComisionMarca=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionMarca=false;
				} else {
					this.isVisibilidadCeldaGuardarComisionMarca=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoComisionMarca=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionMarca=false;
			this.isVisibilidadCeldaGuardarCambiosComisionMarca=false;
			this.isVisibilidadCeldaModificarComisionMarca=true;
			this.isVisibilidadCeldaActualizarComisionMarca=false;
			this.isVisibilidadCeldaEliminarComisionMarca=false;
			this.isVisibilidadCeldaCancelarComisionMarca=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionMarca=false;
				} else {
					this.isVisibilidadCeldaGuardarComisionMarca=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ComisionMarcaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoComisionMarca=true;
			this.isVisibilidadCeldaNuevoRelacionesComisionMarca=true;
			this.isVisibilidadCeldaGuardarCambiosComisionMarca=true;
		} else {
			this.actualizarEstadoPanelsComisionMarca(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarComisionMarca=false;
			//this.isVisibilidadCeldaVerFormComisionMarca=false;
			this.isVisibilidadCeldaDuplicarComisionMarca=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!comisionmarcaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesComisionMarca=false;
		} else {
			this.isVisibilidadCeldaNuevoComisionMarca=false;
			this.isVisibilidadCeldaGuardarCambiosComisionMarca=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(comisionmarcaSessionBean.getEsGuardarRelacionado()) {
			if(!comisionmarcaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesComisionMarca=false;												
			}
			
			this.jButtonCerrarComisionMarca.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesComisionMarca=false;
		}
		
		if(!this.permiteMantenimiento(this.comisionmarca)) {
			this.isVisibilidadCeldaActualizarComisionMarca=false;
			this.isVisibilidadCeldaEliminarComisionMarca=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesComisionMarca() {
	}
	
	public void actualizarEstadoPanelsComisionMarca(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionComisionMarca!=null) {
				this.jScrollPanelDatosEdicionComisionMarca.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionMarca!=null) {
				this.jTabbedPaneBusquedasComisionMarca.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComisionMarca!=null) {
				this.jScrollPanelDatosComisionMarca.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisionMarca!=null) {
				this.jPanelPaginacionComisionMarca.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisionMarca!=null) {
				this.jPanelParametrosReportesComisionMarca.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionComisionMarca!=null) {
				this.jScrollPanelDatosEdicionComisionMarca.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionMarca!=null) {
				this.jTabbedPaneBusquedasComisionMarca.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosComisionMarca!=null) {
				this.jScrollPanelDatosComisionMarca.setVisible(false);
			}
			
			if(this.jPanelPaginacionComisionMarca!=null) {
				this.jPanelPaginacionComisionMarca.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComisionMarca!=null) {
				this.jPanelParametrosReportesComisionMarca.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionComisionMarca!=null) {
				this.jScrollPanelDatosEdicionComisionMarca.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionMarca!=null) {
				this.jTabbedPaneBusquedasComisionMarca.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosComisionMarca!=null) {
				this.jScrollPanelDatosComisionMarca.setVisible(false);
			}
			
			if(this.jPanelPaginacionComisionMarca!=null) {
				this.jPanelPaginacionComisionMarca.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComisionMarca!=null) {
				this.jPanelParametrosReportesComisionMarca.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionComisionMarca!=null) {
				this.jScrollPanelDatosEdicionComisionMarca.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionMarca!=null) {
				this.jTabbedPaneBusquedasComisionMarca.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosComisionMarca!=null) {
				this.jScrollPanelDatosComisionMarca.setVisible(false);
			}
			
			if(this.jPanelPaginacionComisionMarca!=null) {
				this.jPanelPaginacionComisionMarca.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComisionMarca!=null) {
				this.jPanelParametrosReportesComisionMarca.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionComisionMarca!=null) {
				this.jScrollPanelDatosEdicionComisionMarca.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionMarca!=null) {
				this.jTabbedPaneBusquedasComisionMarca.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComisionMarca!=null) {
				this.jScrollPanelDatosComisionMarca.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisionMarca!=null) {
				this.jPanelPaginacionComisionMarca.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisionMarca!=null) {
				this.jPanelParametrosReportesComisionMarca.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionComisionMarca!=null) {
				this.jScrollPanelDatosEdicionComisionMarca.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionMarca!=null) {
				this.jTabbedPaneBusquedasComisionMarca.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComisionMarca!=null) {
				this.jScrollPanelDatosComisionMarca.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisionMarca!=null) {
				this.jPanelPaginacionComisionMarca.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisionMarca!=null) {
				this.jPanelParametrosReportesComisionMarca.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionComisionMarca!=null) {
				this.jScrollPanelDatosEdicionComisionMarca.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionMarca!=null) {
				this.jTabbedPaneBusquedasComisionMarca.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComisionMarca!=null) {
				this.jScrollPanelDatosComisionMarca.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisionMarca!=null) {
				this.jPanelPaginacionComisionMarca.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisionMarca!=null) {
				this.jPanelParametrosReportesComisionMarca.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasComisionMarca!=null) {
					this.jTabbedPaneBusquedasComisionMarca.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesComisionMarca!=null) {
				this.jPanelParametrosReportesComisionMarca.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.comisionmarcaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionMarca!=null) {
				this.jTabbedPaneBusquedasComisionMarca.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesComisionMarca!=null) {
				this.jPanelParametrosReportesComisionMarca.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdComisionConfig=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdComisionConfig) {this.jTabbedPaneBusquedasComisionMarca.remove(jPanelFK_IdComisionConfigComisionMarca);}
		}
		
	}

	public void setVisibilidadBusquedasParaComisionConfig(Boolean isParaComisionConfig){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaComisionConfigNegation=!isParaComisionConfig;

			this.isVisibilidadFK_IdComisionConfig=isParaComisionConfig;
			if(!this.isVisibilidadFK_IdComisionConfig) {this.jTabbedPaneBusquedasComisionMarca.remove(jPanelFK_IdComisionConfigComisionMarca);}
		}
		
	}

	public void setVisibilidadBusquedasParaVendedor(Boolean isParaVendedor){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaVendedorNegation=!isParaVendedor;

			this.isVisibilidadFK_IdComisionConfig=isParaVendedorNegation;
			if(!this.isVisibilidadFK_IdComisionConfig) {this.jTabbedPaneBusquedasComisionMarca.remove(jPanelFK_IdComisionConfigComisionMarca);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadFK_IdComisionConfig=isParaLineaNegation;
			if(!this.isVisibilidadFK_IdComisionConfig) {this.jTabbedPaneBusquedasComisionMarca.remove(jPanelFK_IdComisionConfigComisionMarca);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadFK_IdComisionConfig=isParaLineaGrupoNegation;
			if(!this.isVisibilidadFK_IdComisionConfig) {this.jTabbedPaneBusquedasComisionMarca.remove(jPanelFK_IdComisionConfigComisionMarca);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaCategoria(Boolean isParaLineaCategoria){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaCategoriaNegation=!isParaLineaCategoria;

			this.isVisibilidadFK_IdComisionConfig=isParaLineaCategoriaNegation;
			if(!this.isVisibilidadFK_IdComisionConfig) {this.jTabbedPaneBusquedasComisionMarca.remove(jPanelFK_IdComisionConfigComisionMarca);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaMarca(Boolean isParaLineaMarca){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaMarcaNegation=!isParaLineaMarca;

			this.isVisibilidadFK_IdComisionConfig=isParaLineaMarcaNegation;
			if(!this.isVisibilidadFK_IdComisionConfig) {this.jTabbedPaneBusquedasComisionMarca.remove(jPanelFK_IdComisionConfigComisionMarca);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstadoComision(Boolean isParaEstadoComision){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstadoComisionNegation=!isParaEstadoComision;

			this.isVisibilidadFK_IdComisionConfig=isParaEstadoComisionNegation;
			if(!this.isVisibilidadFK_IdComisionConfig) {this.jTabbedPaneBusquedasComisionMarca.remove(jPanelFK_IdComisionConfigComisionMarca);}
		}
		
	}
	
	
	
	

	public String registrarSesionComisionMarcaParaBusquedaVendedores() throws Exception {
		Boolean isPaginaPopupVendedor=false;

		try {

			if(comisionmarcaSessionBean==null) {
				comisionmarcaSessionBean=new ComisionMarcaSessionBean();
			}

			if(vendedorSessionBean==null) {
				vendedorSessionBean=new VendedorSessionBean();
			}

			vendedorSessionBean.setsPathNavegacionActual(comisionmarcaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+VendedorConstantesFunciones.SCLASSWEBTITULO);
			vendedorSessionBean.setisPermiteRecargarInformacion(false);
			vendedorSessionBean.setisPaginaPopup(true);
			isPaginaPopupVendedor=vendedorSessionBean.getisPaginaPopup();
			vendedorSessionBean.setisPaginaPopup(false);
			vendedorSessionBean.setEstaModoBusqueda(true);
			vendedorSessionBean.setsFuncionBusquedaRapida("window.opener.comisionmarcaFuncionGeneral.setCombosCodigoDesdeBusquedaid_vendedor(TO_REPLACE);");
			vendedorSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeVendedor(true);
			vendedorSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeVendedor(ComisionMarcaConstantesFunciones.SNOMBREOPCION);
			//vendedorSessionBean.setisBusquedaDesdeForeignKeySesionComisionMarca(true);
			//vendedorSessionBean.setlidComisionMarcaActual(this.idComisionMarcaActual);

			comisionmarcaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyComisionMarca(true);
			comisionmarcaSessionBean.setlIdComisionMarcaActualForeignKey(this.idComisionMarcaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ComisionMarcaSessionBean comisionmarcaSessionBean=new ComisionMarcaSessionBean();
		
		if(this.comisionmarcaSessionBean==null) {
			this.comisionmarcaSessionBean=new ComisionMarcaSessionBean();
		}
		
		this.comisionmarcaSessionBean.setsUltimaBusquedaComisionMarca(this.getsAccionBusqueda());
		this.comisionmarcaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.comisionmarcaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdComisionConfig")) {
			comisionmarcaSessionBean.setid_comision_config(this.getid_comision_configFK_IdComisionConfig());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			comisionmarcaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ComisionMarcaSessionBean comisionmarcaSessionBean=new ComisionMarcaSessionBean();
		
		if(this.comisionmarcaSessionBean==null) {
			this.comisionmarcaSessionBean=new ComisionMarcaSessionBean();
		}
		
		if(this.comisionmarcaSessionBean.getsUltimaBusquedaComisionMarca()!=null&&!this.comisionmarcaSessionBean.getsUltimaBusquedaComisionMarca().equals("")) {
			this.setsAccionBusqueda(comisionmarcaSessionBean.getsUltimaBusquedaComisionMarca());
			this.setiNumeroPaginacion(comisionmarcaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(comisionmarcaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdComisionConfig")) {
				this.setid_comision_configFK_IdComisionConfig(comisionmarcaSessionBean.getid_comision_config());
				comisionmarcaSessionBean.setid_comision_config(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(comisionmarcaSessionBean.getid_empresa());
				comisionmarcaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.comisionmarcaSessionBean.setsUltimaBusquedaComisionMarca("");
		this.comisionmarcaSessionBean.setiNumeroPaginacion(ComisionMarcaConstantesFunciones.INUMEROPAGINACION);
		this.comisionmarcaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaComisionMarca(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioComisionMarca() {
		this.updateBorderResaltarBusquedasFormularioComisionMarca();
		this.updateVisibilidadBusquedasFormularioComisionMarca();
		this.updateHabilitarBusquedasFormularioComisionMarca();
	}
	
	public void updateBorderResaltarBusquedasFormularioComisionMarca() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasComisionMarca.getComponents().length>0) {
	

		if(this.comisionmarcaConstantesFunciones.resaltarFK_IdComisionConfigComisionMarca!=null) {
			index= this.jTabbedPaneBusquedasComisionMarca.indexOfComponent(this.jPanelFK_IdComisionConfigComisionMarca);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasComisionMarca.getComponent(index);
				jPanel.setBorder(this.comisionmarcaConstantesFunciones.resaltarFK_IdComisionConfigComisionMarca);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioComisionMarca() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasComisionMarca.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasComisionMarca.indexOfComponent(this.jPanelFK_IdComisionConfigComisionMarca);
			jPanel=(JPanel)this.jTabbedPaneBusquedasComisionMarca.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.comisionmarcaConstantesFunciones.mostrarFK_IdComisionConfigComisionMarca);
			if(!this.comisionmarcaConstantesFunciones.mostrarFK_IdComisionConfigComisionMarca && index>-1) {
				this.jTabbedPaneBusquedasComisionMarca.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioComisionMarca() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasComisionMarca.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasComisionMarca.indexOfComponent(this.jPanelFK_IdComisionConfigComisionMarca);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasComisionMarca.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.comisionmarcaConstantesFunciones.activarFK_IdComisionConfigComisionMarca);
				this.jTabbedPaneBusquedasComisionMarca.setEnabledAt(index,this.comisionmarcaConstantesFunciones.activarFK_IdComisionConfigComisionMarca);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaComisionMarca(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdComisionConfig")) {
			index= this.jTabbedPaneBusquedasComisionMarca.indexOfComponent(this.jPanelFK_IdComisionConfigComisionMarca);

			this.jTabbedPaneBusquedasComisionMarca.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasComisionMarca.getComponent(index);

			this.comisionmarcaConstantesFunciones.setResaltarFK_IdComisionConfigComisionMarca(resaltar);

			jPanel.setBorder(this.comisionmarcaConstantesFunciones.resaltarFK_IdComisionConfigComisionMarca);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarComisionMarca.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioComisionMarca() throws Exception {

		if(this.jInternalFrameDetalleFormComisionMarca==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioComisionMarca();
		this.updateVisibilidadResaltarControlesFormularioComisionMarca();
		this.updateHabilitarResaltarControlesFormularioComisionMarca();
		
	}
	
	public void updateBorderResaltarControlesFormularioComisionMarca() throws Exception {
		if(this.jInternalFrameDetalleFormComisionMarca==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.comisionmarcaConstantesFunciones.resaltaridComisionMarca!=null && this.jInternalFrameDetalleFormComisionMarca!=null) {this.jInternalFrameDetalleFormComisionMarca.jLabelidComisionMarca.setBorder(this.comisionmarcaConstantesFunciones.resaltaridComisionMarca);}
		if(this.comisionmarcaConstantesFunciones.resaltarid_empresaComisionMarca!=null && this.jInternalFrameDetalleFormComisionMarca!=null) {this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_empresaComisionMarca.setBorder(this.comisionmarcaConstantesFunciones.resaltarid_empresaComisionMarca);}
		if(this.comisionmarcaConstantesFunciones.resaltarid_comision_configComisionMarca!=null && this.jInternalFrameDetalleFormComisionMarca!=null) {this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_comision_configComisionMarca.setBorder(this.comisionmarcaConstantesFunciones.resaltarid_comision_configComisionMarca);}
		if(this.comisionmarcaConstantesFunciones.resaltarid_vendedorComisionMarca!=null && this.jInternalFrameDetalleFormComisionMarca!=null) {this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_vendedorComisionMarca.setBorder(this.comisionmarcaConstantesFunciones.resaltarid_vendedorComisionMarca);}
		if(this.comisionmarcaConstantesFunciones.resaltarid_lineaComisionMarca!=null && this.jInternalFrameDetalleFormComisionMarca!=null) {this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_lineaComisionMarca.setBorder(this.comisionmarcaConstantesFunciones.resaltarid_lineaComisionMarca);}
		if(this.comisionmarcaConstantesFunciones.resaltarid_linea_grupoComisionMarca!=null && this.jInternalFrameDetalleFormComisionMarca!=null) {this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_grupoComisionMarca.setBorder(this.comisionmarcaConstantesFunciones.resaltarid_linea_grupoComisionMarca);}
		if(this.comisionmarcaConstantesFunciones.resaltarid_linea_categoriaComisionMarca!=null && this.jInternalFrameDetalleFormComisionMarca!=null) {this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_categoriaComisionMarca.setBorder(this.comisionmarcaConstantesFunciones.resaltarid_linea_categoriaComisionMarca);}
		if(this.comisionmarcaConstantesFunciones.resaltarid_linea_marcaComisionMarca!=null && this.jInternalFrameDetalleFormComisionMarca!=null) {this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_marcaComisionMarca.setBorder(this.comisionmarcaConstantesFunciones.resaltarid_linea_marcaComisionMarca);}
		if(this.comisionmarcaConstantesFunciones.resaltarid_estado_comisionComisionMarca!=null && this.jInternalFrameDetalleFormComisionMarca!=null) {this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_estado_comisionComisionMarca.setBorder(this.comisionmarcaConstantesFunciones.resaltarid_estado_comisionComisionMarca);}
		if(this.comisionmarcaConstantesFunciones.resaltarporcentajeComisionMarca!=null && this.jInternalFrameDetalleFormComisionMarca!=null) {this.jInternalFrameDetalleFormComisionMarca.jTextFieldporcentajeComisionMarca.setBorder(this.comisionmarcaConstantesFunciones.resaltarporcentajeComisionMarca);}
		if(this.comisionmarcaConstantesFunciones.resaltardescripcionComisionMarca!=null && this.jInternalFrameDetalleFormComisionMarca!=null) {this.jInternalFrameDetalleFormComisionMarca.jTextAreadescripcionComisionMarca.setBorder(this.comisionmarcaConstantesFunciones.resaltardescripcionComisionMarca);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioComisionMarca() throws Exception {		
		if(this.jInternalFrameDetalleFormComisionMarca==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormComisionMarca!=null) {
	
		//this.jInternalFrameDetalleFormComisionMarca.jLabelidComisionMarca.setVisible(this.comisionmarcaConstantesFunciones.mostraridComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jPanelidComisionMarca.setVisible(this.comisionmarcaConstantesFunciones.mostraridComisionMarca);
		//this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_empresaComisionMarca.setVisible(this.comisionmarcaConstantesFunciones.mostrarid_empresaComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jPanelid_empresaComisionMarca.setVisible(this.comisionmarcaConstantesFunciones.mostrarid_empresaComisionMarca);
		//this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_comision_configComisionMarca.setVisible(this.comisionmarcaConstantesFunciones.mostrarid_comision_configComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jPanelid_comision_configComisionMarca.setVisible(this.comisionmarcaConstantesFunciones.mostrarid_comision_configComisionMarca);
		//this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_vendedorComisionMarca.setVisible(this.comisionmarcaConstantesFunciones.mostrarid_vendedorComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jPanelid_vendedorComisionMarca.setVisible(this.comisionmarcaConstantesFunciones.mostrarid_vendedorComisionMarca);
			this.jInternalFrameDetalleFormComisionMarca.jButtonid_vendedorComisionMarca.setVisible(this.comisionmarcaConstantesFunciones.mostrarid_vendedorComisionMarca);
		//this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_lineaComisionMarca.setVisible(this.comisionmarcaConstantesFunciones.mostrarid_lineaComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jPanelid_lineaComisionMarca.setVisible(this.comisionmarcaConstantesFunciones.mostrarid_lineaComisionMarca);
		//this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_grupoComisionMarca.setVisible(this.comisionmarcaConstantesFunciones.mostrarid_linea_grupoComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jPanelid_linea_grupoComisionMarca.setVisible(this.comisionmarcaConstantesFunciones.mostrarid_linea_grupoComisionMarca);
		//this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_categoriaComisionMarca.setVisible(this.comisionmarcaConstantesFunciones.mostrarid_linea_categoriaComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jPanelid_linea_categoriaComisionMarca.setVisible(this.comisionmarcaConstantesFunciones.mostrarid_linea_categoriaComisionMarca);
		//this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_marcaComisionMarca.setVisible(this.comisionmarcaConstantesFunciones.mostrarid_linea_marcaComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jPanelid_linea_marcaComisionMarca.setVisible(this.comisionmarcaConstantesFunciones.mostrarid_linea_marcaComisionMarca);
		//this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_estado_comisionComisionMarca.setVisible(this.comisionmarcaConstantesFunciones.mostrarid_estado_comisionComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jPanelid_estado_comisionComisionMarca.setVisible(this.comisionmarcaConstantesFunciones.mostrarid_estado_comisionComisionMarca);
		//this.jInternalFrameDetalleFormComisionMarca.jTextFieldporcentajeComisionMarca.setVisible(this.comisionmarcaConstantesFunciones.mostrarporcentajeComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jPanelporcentajeComisionMarca.setVisible(this.comisionmarcaConstantesFunciones.mostrarporcentajeComisionMarca);
		//this.jInternalFrameDetalleFormComisionMarca.jTextAreadescripcionComisionMarca.setVisible(this.comisionmarcaConstantesFunciones.mostrardescripcionComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jPaneldescripcionComisionMarca.setVisible(this.comisionmarcaConstantesFunciones.mostrardescripcionComisionMarca);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioComisionMarca() throws Exception {
		if(this.jInternalFrameDetalleFormComisionMarca==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormComisionMarca!=null) {
	
		this.jInternalFrameDetalleFormComisionMarca.jLabelidComisionMarca.setEnabled(this.comisionmarcaConstantesFunciones.activaridComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_empresaComisionMarca.setEnabled(this.comisionmarcaConstantesFunciones.activarid_empresaComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_comision_configComisionMarca.setEnabled(this.comisionmarcaConstantesFunciones.activarid_comision_configComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_vendedorComisionMarca.setEnabled(this.comisionmarcaConstantesFunciones.activarid_vendedorComisionMarca);
			this.jInternalFrameDetalleFormComisionMarca.jButtonid_vendedorComisionMarca.setEnabled(this.comisionmarcaConstantesFunciones.activarid_vendedorComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_lineaComisionMarca.setEnabled(this.comisionmarcaConstantesFunciones.activarid_lineaComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_grupoComisionMarca.setEnabled(this.comisionmarcaConstantesFunciones.activarid_linea_grupoComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_categoriaComisionMarca.setEnabled(this.comisionmarcaConstantesFunciones.activarid_linea_categoriaComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_linea_marcaComisionMarca.setEnabled(this.comisionmarcaConstantesFunciones.activarid_linea_marcaComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jComboBoxid_estado_comisionComisionMarca.setEnabled(this.comisionmarcaConstantesFunciones.activarid_estado_comisionComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jTextFieldporcentajeComisionMarca.setEnabled(this.comisionmarcaConstantesFunciones.activarporcentajeComisionMarca);
		this.jInternalFrameDetalleFormComisionMarca.jTextAreadescripcionComisionMarca.setEnabled(this.comisionmarcaConstantesFunciones.activardescripcionComisionMarca);
		}
	}
	
		
}