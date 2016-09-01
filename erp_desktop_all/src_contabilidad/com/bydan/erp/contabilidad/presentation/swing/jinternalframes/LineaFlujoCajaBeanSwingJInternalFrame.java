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

import com.bydan.erp.contabilidad.util.LineaFlujoCajaConstantesFunciones;
import com.bydan.erp.contabilidad.util.LineaFlujoCajaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.LineaFlujoCajaParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.LineaFlujoCajaBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
public class LineaFlujoCajaBeanSwingJInternalFrame extends LineaFlujoCajaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(LineaFlujoCajaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<LineaFlujoCaja> lineaflujocajaValidator = new ClassValidator<LineaFlujoCaja>(LineaFlujoCaja.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public LineaFlujoCaja lineaflujocaja;	
	public LineaFlujoCaja lineaflujocajaAux;
	public LineaFlujoCaja lineaflujocajaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public LineaFlujoCaja lineaflujocajaTotales;
	public Long idLineaFlujoCajaActual;
	public Long iIdNuevoLineaFlujoCaja=0L;
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

	public String sFinalQueryComboTipoGrupoFlujoCaja="";

	public List<TipoGrupoFlujoCaja> tipogrupoflujocajasForeignKey;

	public List<TipoGrupoFlujoCaja> gettipogrupoflujocajasForeignKey() {
		return tipogrupoflujocajasForeignKey;
	}

	public void settipogrupoflujocajasForeignKey(List<TipoGrupoFlujoCaja> tipogrupoflujocajasForeignKey) {
		this.tipogrupoflujocajasForeignKey = tipogrupoflujocajasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoGrupoFlujoCaja tipogrupoflujocajaForeignKey;

	public TipoGrupoFlujoCaja gettipogrupoflujocajaForeignKey() {
		return tipogrupoflujocajaForeignKey;
	}

	public void settipogrupoflujocajaForeignKey(TipoGrupoFlujoCaja tipogrupoflujocajaForeignKey) {
		this.tipogrupoflujocajaForeignKey = tipogrupoflujocajaForeignKey;
	}

	public String sFinalQueryComboTipoLineaFlujoCaja="";

	public List<TipoLineaFlujoCaja> tipolineaflujocajasForeignKey;

	public List<TipoLineaFlujoCaja> gettipolineaflujocajasForeignKey() {
		return tipolineaflujocajasForeignKey;
	}

	public void settipolineaflujocajasForeignKey(List<TipoLineaFlujoCaja> tipolineaflujocajasForeignKey) {
		this.tipolineaflujocajasForeignKey = tipolineaflujocajasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoLineaFlujoCaja tipolineaflujocajaForeignKey;

	public TipoLineaFlujoCaja gettipolineaflujocajaForeignKey() {
		return tipolineaflujocajaForeignKey;
	}

	public void settipolineaflujocajaForeignKey(TipoLineaFlujoCaja tipolineaflujocajaForeignKey) {
		this.tipolineaflujocajaForeignKey = tipolineaflujocajaForeignKey;
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
	
	public Boolean isPermisoTodoLineaFlujoCaja;
	public Boolean isPermisoNuevoLineaFlujoCaja;
	public Boolean isPermisoActualizarLineaFlujoCaja;
	public Boolean isPermisoActualizarOriginalLineaFlujoCaja;
	public Boolean isPermisoEliminarLineaFlujoCaja;
	public Boolean isPermisoGuardarCambiosLineaFlujoCaja;
	public Boolean isPermisoConsultaLineaFlujoCaja;
	public Boolean isPermisoBusquedaLineaFlujoCaja;
	public Boolean isPermisoReporteLineaFlujoCaja;
	public Boolean isPermisoPaginacionMedioLineaFlujoCaja;
	public Boolean isPermisoPaginacionAltoLineaFlujoCaja;
	public Boolean isPermisoPaginacionTodoLineaFlujoCaja;
	public Boolean isPermisoCopiarLineaFlujoCaja;
	public Boolean isPermisoVerFormLineaFlujoCaja;
	public Boolean isPermisoDuplicarLineaFlujoCaja;
	public Boolean isPermisoOrdenLineaFlujoCaja;
	
	
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
	
	public LineaFlujoCajaParameterReturnGeneral lineaflujocajaReturnGeneral;
	public LineaFlujoCajaParameterReturnGeneral lineaflujocajaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoLineaFlujoCaja=false;
	public Boolean esParaAccionDesdeFormularioLineaFlujoCaja=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected LineaFlujoCajaSessionBeanAdditional lineaflujocajaSessionBeanAdditional=null;
	
	public LineaFlujoCajaSessionBeanAdditional getLineaFlujoCajaSessionBeanAdditional() {
		return this.lineaflujocajaSessionBeanAdditional;
	}
	
	public void setLineaFlujoCajaSessionBeanAdditional(LineaFlujoCajaSessionBeanAdditional lineaflujocajaSessionBeanAdditional) {
		try {
			this.lineaflujocajaSessionBeanAdditional=lineaflujocajaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected LineaFlujoCajaBeanSwingJInternalFrameAdditional lineaflujocajaBeanSwingJInternalFrameAdditional=null;
	//public class LineaFlujoCajaBeanSwingJInternalFrame
	
	public LineaFlujoCajaBeanSwingJInternalFrameAdditional getLineaFlujoCajaBeanSwingJInternalFrameAdditional() {
		return this.lineaflujocajaBeanSwingJInternalFrameAdditional;
	}
	
	public void setLineaFlujoCajaBeanSwingJInternalFrameAdditional(LineaFlujoCajaBeanSwingJInternalFrameAdditional lineaflujocajaBeanSwingJInternalFrameAdditional) {
		try {
			this.lineaflujocajaBeanSwingJInternalFrameAdditional=lineaflujocajaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public LineaFlujoCajaLogic lineaflujocajaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public LineaFlujoCaja lineaflujocajaBean;
	public LineaFlujoCajaConstantesFunciones lineaflujocajaConstantesFunciones;
	//public LineaFlujoCajaParameterReturnGeneral lineaflujocajaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public TipoGrupoFlujoCajaLogic tipogrupoflujocajaLogic;
	public TipoLineaFlujoCajaLogic tipolineaflujocajaLogic;
	
	//PARAMETROS
	
	
	//public List<LineaFlujoCaja> lineaflujocajas;	
	//public List<LineaFlujoCaja> lineaflujocajasEliminados;
	//public List<LineaFlujoCaja> lineaflujocajasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoLineaFlujoCaja=false;
	public Boolean isVisibilidadCeldaDuplicarLineaFlujoCaja=true;
	public Boolean isVisibilidadCeldaCopiarLineaFlujoCaja=true;
	public Boolean isVisibilidadCeldaVerFormLineaFlujoCaja=true;
	public Boolean isVisibilidadCeldaOrdenLineaFlujoCaja=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesLineaFlujoCaja=false;
	public Boolean isVisibilidadCeldaModificarLineaFlujoCaja=false;
	public Boolean isVisibilidadCeldaActualizarLineaFlujoCaja=false;
	public Boolean isVisibilidadCeldaEliminarLineaFlujoCaja=false;
	public Boolean isVisibilidadCeldaCancelarLineaFlujoCaja=false;
	public Boolean isVisibilidadCeldaGuardarLineaFlujoCaja=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosLineaFlujoCaja=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdTipoGrupoFlujoCaja=false;
	public Boolean isVisibilidadFK_IdTipoLineaFlujoCaja=false;
	
	public Long getiIdNuevoLineaFlujoCaja() {
		return this.iIdNuevoLineaFlujoCaja;
	}

	public void setiIdNuevoLineaFlujoCaja(Long iIdNuevoLineaFlujoCaja) {
		this.iIdNuevoLineaFlujoCaja = iIdNuevoLineaFlujoCaja;
	}
	
	public Long getidLineaFlujoCajaActual() {
		return this.idLineaFlujoCajaActual;
	}

	public void setidLineaFlujoCajaActual(Long idLineaFlujoCajaActual) {
		this.idLineaFlujoCajaActual = idLineaFlujoCajaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public LineaFlujoCaja getlineaflujocaja() {
		return this.lineaflujocaja;
	}

	public void setlineaflujocaja(LineaFlujoCaja lineaflujocaja) {
		this.lineaflujocaja = lineaflujocaja;
	}
	
	public LineaFlujoCaja getlineaflujocajaAux() {
		return this.lineaflujocajaAux;
	}

	public void setlineaflujocajaAux(LineaFlujoCaja lineaflujocajaAux) {
		this.lineaflujocajaAux = lineaflujocajaAux;
	}				
	
	public LineaFlujoCaja getlineaflujocajaAnterior() {
		return this.lineaflujocajaAnterior;
	}

	public void setlineaflujocajaAnterior(LineaFlujoCaja lineaflujocajaAnterior) {
		this.lineaflujocajaAnterior = lineaflujocajaAnterior;
	}	
	
	public LineaFlujoCaja getlineaflujocajaTotales() {
		return this.lineaflujocajaTotales;
	}

	public void setlineaflujocajaTotales(LineaFlujoCaja lineaflujocajaTotales) {
		this.lineaflujocajaTotales = lineaflujocajaTotales;
	}	
	
	public LineaFlujoCaja getlineaflujocajaBean() {
		return this.lineaflujocajaBean;
	}

	public void setlineaflujocajaBean(LineaFlujoCaja lineaflujocajaBean) {
		this.lineaflujocajaBean = lineaflujocajaBean;
	}	
	
	public LineaFlujoCajaParameterReturnGeneral getlineaflujocajaReturnGeneral() {
		return this.lineaflujocajaReturnGeneral;
	}

	public void setlineaflujocajaReturnGeneral(LineaFlujoCajaParameterReturnGeneral lineaflujocajaReturnGeneral) {
		this.lineaflujocajaReturnGeneral = lineaflujocajaReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
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

	public Long id_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja=-1L;

	public Long getid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja() {
		return this.id_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja;
	}

	public void setid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja(Long id_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja) {
		this.id_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja = id_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja;
	}

	public Long id_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCaja=-1L;

	public Long getid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCaja() {
		return this.id_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCaja;
	}

	public void setid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCaja(Long id_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCaja) {
		this.id_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCaja = id_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCaja;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public LineaFlujoCajaLogic getLineaFlujoCajaLogic()	{		
		return lineaflujocajaLogic;
	}

	public void setLineaFlujoCajaLogic(LineaFlujoCajaLogic lineaflujocajaLogic) {
		this.lineaflujocajaLogic = lineaflujocajaLogic;
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
	
	public Boolean getIsEsNuevoLineaFlujoCaja() {
		return isEsNuevoLineaFlujoCaja;
	}

	public void setIsEsNuevoLineaFlujoCaja(Boolean isEsNuevoLineaFlujoCaja) {
		this.isEsNuevoLineaFlujoCaja = isEsNuevoLineaFlujoCaja;
	}

	public Boolean getEsParaAccionDesdeFormularioLineaFlujoCaja() {
		return esParaAccionDesdeFormularioLineaFlujoCaja;
	}
	
	public void setEsParaAccionDesdeFormularioLineaFlujoCaja(Boolean esParaAccionDesdeFormularioLineaFlujoCaja) {
		this.esParaAccionDesdeFormularioLineaFlujoCaja = esParaAccionDesdeFormularioLineaFlujoCaja;
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

			if(this.lineaflujocajaSessionBean==null) {
				this.lineaflujocajaSessionBean=new LineaFlujoCajaSessionBean();
			}

			if(!this.lineaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(lineaflujocajaSessionBean.getlidEmpresaActual());
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

	public void cargarCombosTipoGrupoFlujoCajasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipogrupoflujocajasForeignKey=new ArrayList<TipoGrupoFlujoCaja>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoGrupoFlujoCajaLogic tipogrupoflujocajaLogic=new TipoGrupoFlujoCajaLogic();

			//tipogrupoflujocajaLogic.getTipoGrupoFlujoCajaDataAccess().setIsForForeingKeyData(true);

			if(this.lineaflujocajaSessionBean==null) {
				this.lineaflujocajaSessionBean=new LineaFlujoCajaSessionBean();
			}

			if(!this.lineaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionTipoGrupoFlujoCaja()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipogrupoflujocajaLogic.getTipoGrupoFlujoCajaDataAccess().setIsForForeingKeyData(true);

					tipogrupoflujocajaLogic.getTodosTipoGrupoFlujoCajasWithConnection(sFinalQuery,new Pagination());

					this.tipogrupoflujocajasForeignKey=tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoGrupoFlujoCaja(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogrupoflujocajaLogic.getEntityWithConnection(lineaflujocajaSessionBean.getlidTipoGrupoFlujoCajaActual());
					this.tipogrupoflujocajasForeignKey.add(tipogrupoflujocajaLogic.getTipoGrupoFlujoCaja());
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

	public void cargarCombosTipoLineaFlujoCajasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipolineaflujocajasForeignKey=new ArrayList<TipoLineaFlujoCaja>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoLineaFlujoCajaLogic tipolineaflujocajaLogic=new TipoLineaFlujoCajaLogic();

			//tipolineaflujocajaLogic.getTipoLineaFlujoCajaDataAccess().setIsForForeingKeyData(true);

			if(this.lineaflujocajaSessionBean==null) {
				this.lineaflujocajaSessionBean=new LineaFlujoCajaSessionBean();
			}

			if(!this.lineaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionTipoLineaFlujoCaja()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipolineaflujocajaLogic.getTipoLineaFlujoCajaDataAccess().setIsForForeingKeyData(true);

					tipolineaflujocajaLogic.getTodosTipoLineaFlujoCajasWithConnection(sFinalQuery,new Pagination());

					this.tipolineaflujocajasForeignKey=tipolineaflujocajaLogic.getTipoLineaFlujoCajas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoLineaFlujoCaja(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipolineaflujocajaLogic.getEntityWithConnection(lineaflujocajaSessionBean.getlidTipoLineaFlujoCajaActual());
					this.tipolineaflujocajasForeignKey.add(tipolineaflujocajaLogic.getTipoLineaFlujoCaja());
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

					if(this.lineaflujocaja!=null) {
						this.lineaflujocaja.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
						this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_empresaLineaFlujoCaja.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaLineaFlujoCaja.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
						if(this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_empresaLineaFlujoCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_empresaLineaFlujoCaja.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaLineaFlujoCajaGenerico)throws Exception
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
				jComboBoxid_empresaLineaFlujoCajaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaLineaFlujoCajaGenerico!=null && jComboBoxid_empresaLineaFlujoCajaGenerico.getItemCount()>0) {
					jComboBoxid_empresaLineaFlujoCajaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoGrupoFlujoCajaForeignKey(Long idTipoGrupoFlujoCajaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoGrupoFlujoCaja  tipogrupoflujocajaTemp=null;

			for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:tipogrupoflujocajasForeignKey) {
				if(tipogrupoflujocajaAux.getId()!=null && tipogrupoflujocajaAux.getId().equals(idTipoGrupoFlujoCajaSeleccionado)) {
					tipogrupoflujocajaTemp=tipogrupoflujocajaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipogrupoflujocajaTemp!=null) {

					if(this.lineaflujocaja!=null) {
						this.lineaflujocaja.setTipoGrupoFlujoCaja(tipogrupoflujocajaTemp);
					}

					if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
						this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCaja.setSelectedItem(tipogrupoflujocajaTemp);
					}
				} else {
					//jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCaja.setSelectedItem(tipogrupoflujocajaTemp);
					if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
						if(this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCaja.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoGrupoFlujoCaja") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipogrupoflujocajaTemp!=null && jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja!=null) {
						jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.setSelectedItem(tipogrupoflujocajaTemp);
					} else {
						if(jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja!=null) {
							//jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.setSelectedItem(tipogrupoflujocajaTemp);
							if(jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.getItemCount()>0) {
								jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.setSelectedIndex(0);
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

	public String getActualTipoGrupoFlujoCajaForeignKeyDescripcion(Long idTipoGrupoFlujoCajaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoGrupoFlujoCaja  tipogrupoflujocajaTemp=null;

			for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:tipogrupoflujocajasForeignKey) {
				if(tipogrupoflujocajaAux.getId()!=null && tipogrupoflujocajaAux.getId().equals(idTipoGrupoFlujoCajaSeleccionado)) {
					tipogrupoflujocajaTemp=tipogrupoflujocajaAux;
					break;
				}
			}


			sDescripcion=TipoGrupoFlujoCajaConstantesFunciones.getTipoGrupoFlujoCajaDescripcion(tipogrupoflujocajaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoGrupoFlujoCajaForeignKeyGenerico(Long idTipoGrupoFlujoCajaSeleccionado,JComboBox jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCajaGenerico)throws Exception
	{
		try
		{
			TipoGrupoFlujoCaja  tipogrupoflujocajaTemp=null;

			for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:tipogrupoflujocajasForeignKey) {
				if(tipogrupoflujocajaAux.getId()!=null && tipogrupoflujocajaAux.getId().equals(idTipoGrupoFlujoCajaSeleccionado)) {
					tipogrupoflujocajaTemp=tipogrupoflujocajaAux;
					break;
				}
			}

			if(tipogrupoflujocajaTemp!=null) {
				jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCajaGenerico.setSelectedItem(tipogrupoflujocajaTemp);
			} else {
				if(jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCajaGenerico!=null && jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCajaGenerico.getItemCount()>0) {
					jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCajaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoLineaFlujoCajaForeignKey(Long idTipoLineaFlujoCajaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoLineaFlujoCaja  tipolineaflujocajaTemp=null;

			for(TipoLineaFlujoCaja tipolineaflujocajaAux:tipolineaflujocajasForeignKey) {
				if(tipolineaflujocajaAux.getId()!=null && tipolineaflujocajaAux.getId().equals(idTipoLineaFlujoCajaSeleccionado)) {
					tipolineaflujocajaTemp=tipolineaflujocajaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipolineaflujocajaTemp!=null) {

					if(this.lineaflujocaja!=null) {
						this.lineaflujocaja.setTipoLineaFlujoCaja(tipolineaflujocajaTemp);
					}

					if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
						this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCaja.setSelectedItem(tipolineaflujocajaTemp);
					}
				} else {
					//jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCaja.setSelectedItem(tipolineaflujocajaTemp);
					if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
						if(this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCaja.getItemCount()>0) {
							this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCaja.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoLineaFlujoCaja") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipolineaflujocajaTemp!=null && jComboBoxid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja!=null) {
						jComboBoxid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja.setSelectedItem(tipolineaflujocajaTemp);
					} else {
						if(jComboBoxid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja!=null) {
							//jComboBoxid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja.setSelectedItem(tipolineaflujocajaTemp);
							if(jComboBoxid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja.getItemCount()>0) {
								jComboBoxid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja.setSelectedIndex(0);
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

	public String getActualTipoLineaFlujoCajaForeignKeyDescripcion(Long idTipoLineaFlujoCajaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoLineaFlujoCaja  tipolineaflujocajaTemp=null;

			for(TipoLineaFlujoCaja tipolineaflujocajaAux:tipolineaflujocajasForeignKey) {
				if(tipolineaflujocajaAux.getId()!=null && tipolineaflujocajaAux.getId().equals(idTipoLineaFlujoCajaSeleccionado)) {
					tipolineaflujocajaTemp=tipolineaflujocajaAux;
					break;
				}
			}


			sDescripcion=TipoLineaFlujoCajaConstantesFunciones.getTipoLineaFlujoCajaDescripcion(tipolineaflujocajaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoLineaFlujoCajaForeignKeyGenerico(Long idTipoLineaFlujoCajaSeleccionado,JComboBox jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCajaGenerico)throws Exception
	{
		try
		{
			TipoLineaFlujoCaja  tipolineaflujocajaTemp=null;

			for(TipoLineaFlujoCaja tipolineaflujocajaAux:tipolineaflujocajasForeignKey) {
				if(tipolineaflujocajaAux.getId()!=null && tipolineaflujocajaAux.getId().equals(idTipoLineaFlujoCajaSeleccionado)) {
					tipolineaflujocajaTemp=tipolineaflujocajaAux;
					break;
				}
			}

			if(tipolineaflujocajaTemp!=null) {
				jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCajaGenerico.setSelectedItem(tipolineaflujocajaTemp);
			} else {
				if(jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCajaGenerico!=null && jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCajaGenerico.getItemCount()>0) {
					jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCajaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(LineaFlujoCaja lineaflujocaja,JComboBox jComboBoxid_empresaLineaFlujoCajaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaLineaFlujoCajaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_empresaLineaFlujoCaja.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaLineaFlujoCajaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				lineaflujocaja.setid_empresa(empresaAux.getId());
				lineaflujocaja.setempresa_descripcion(LineaFlujoCajaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				lineaflujocaja.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoGrupoFlujoCajaForeignKey(LineaFlujoCaja lineaflujocaja,JComboBox jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCajaGenerico)throws Exception
	{
		try
		{
			TipoGrupoFlujoCaja  tipogrupoflujocajaAux=new TipoGrupoFlujoCaja();

			if(jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCajaGenerico==null) {
				tipogrupoflujocajaAux=(TipoGrupoFlujoCaja)this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCaja.getSelectedItem();
			} else {
				tipogrupoflujocajaAux=(TipoGrupoFlujoCaja)jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCajaGenerico.getSelectedItem();
			}

			if(tipogrupoflujocajaAux!=null && tipogrupoflujocajaAux.getId()!=null) {
				lineaflujocaja.setid_tipo_grupo_flujo_caja(tipogrupoflujocajaAux.getId());
				lineaflujocaja.settipogrupoflujocaja_descripcion(LineaFlujoCajaConstantesFunciones.getTipoGrupoFlujoCajaDescripcion(tipogrupoflujocajaAux));
				lineaflujocaja.setTipoGrupoFlujoCaja(tipogrupoflujocajaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoLineaFlujoCajaForeignKey(LineaFlujoCaja lineaflujocaja,JComboBox jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCajaGenerico)throws Exception
	{
		try
		{
			TipoLineaFlujoCaja  tipolineaflujocajaAux=new TipoLineaFlujoCaja();

			if(jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCajaGenerico==null) {
				tipolineaflujocajaAux=(TipoLineaFlujoCaja)this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCaja.getSelectedItem();
			} else {
				tipolineaflujocajaAux=(TipoLineaFlujoCaja)jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCajaGenerico.getSelectedItem();
			}

			if(tipolineaflujocajaAux!=null && tipolineaflujocajaAux.getId()!=null) {
				lineaflujocaja.setid_tipo_linea_flujo_caja(tipolineaflujocajaAux.getId());
				lineaflujocaja.settipolineaflujocaja_descripcion(LineaFlujoCajaConstantesFunciones.getTipoLineaFlujoCajaDescripcion(tipolineaflujocajaAux));
				lineaflujocaja.setTipoLineaFlujoCaja(tipolineaflujocajaAux);			}
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

					if(!LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) { 
							this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_empresaLineaFlujoCaja.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_empresaLineaFlujoCaja.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) { 
					}

					if(!LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoGrupoFlujoCajasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoGrupoFlujoCaja=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) { 
							this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCaja.removeAllItems();

							for(TipoGrupoFlujoCaja tipogrupoflujocaja:this.tipogrupoflujocajasForeignKey) {
								this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCaja.addItem(tipogrupoflujocaja);
							}
						}
					}

					if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) { 
					}

					if(!LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoGrupoFlujoCaja") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.removeAllItems();

							for(TipoGrupoFlujoCaja tipogrupoflujocaja:this.tipogrupoflujocajasForeignKey) {
								this.jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.addItem(tipogrupoflujocaja);
							}
						}

						if(!LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoLineaFlujoCajasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoLineaFlujoCaja=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) { 
							this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCaja.removeAllItems();

							for(TipoLineaFlujoCaja tipolineaflujocaja:this.tipolineaflujocajasForeignKey) {
								this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCaja.addItem(tipolineaflujocaja);
							}
						}
					}

					if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) { 
					}

					if(!LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoLineaFlujoCaja") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja.removeAllItems();

							for(TipoLineaFlujoCaja tipolineaflujocaja:this.tipolineaflujocajasForeignKey) {
								this.jComboBoxid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja.addItem(tipolineaflujocaja);
							}
						}

						if(!LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
							this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_empresaLineaFlujoCaja.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
							this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_empresaLineaFlujoCaja.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTipoGrupoFlujoCajaForeignKey(TipoGrupoFlujoCaja tipogrupoflujocaja,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
							this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCaja.setSelectedItem(tipogrupoflujocaja);
						}
					} else {
						if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
							this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCaja.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.setSelectedItem(tipogrupoflujocaja);
						} else {
							this.jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoLineaFlujoCajaForeignKey(TipoLineaFlujoCaja tipolineaflujocaja,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
							this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCaja.setSelectedItem(tipolineaflujocaja);
						}
					} else {
						if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
							this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCaja.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja.setSelectedItem(tipolineaflujocaja);
						} else {
							this.jComboBoxid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesLineaFlujoCaja() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			LineaFlujoCajaConstantesFunciones.refrescarForeignKeysDescripcionesLineaFlujoCaja(this.lineaflujocajaLogic.getLineaFlujoCajas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			LineaFlujoCajaConstantesFunciones.refrescarForeignKeysDescripcionesLineaFlujoCaja(this.lineaflujocajas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(TipoGrupoFlujoCaja.class));
		classes.add(new Classe(TipoLineaFlujoCaja.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//lineaflujocajaLogic.setLineaFlujoCajas(this.lineaflujocajas);
			lineaflujocajaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public LineaFlujoCajaParameterReturnGeneral getLineaFlujoCajaParameterGeneral() {
		return this.lineaflujocajaParameterGeneral;
	}
	
	public void setLineaFlujoCajaParameterGeneral(LineaFlujoCajaParameterReturnGeneral lineaflujocajaParameterGeneral) {
		this.lineaflujocajaParameterGeneral = lineaflujocajaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoLineaFlujoCaja() {
		return isPermisoTodoLineaFlujoCaja;
	}

	public void setIsPermisoTodoLineaFlujoCaja(Boolean isPermisoTodoLineaFlujoCaja) {
		this.isPermisoTodoLineaFlujoCaja = isPermisoTodoLineaFlujoCaja;
	}

	public Boolean getIsPermisoNuevoLineaFlujoCaja() {
		return isPermisoNuevoLineaFlujoCaja;
	}

	public void setIsPermisoNuevoLineaFlujoCaja(Boolean isPermisoNuevoLineaFlujoCaja) {
		this.isPermisoNuevoLineaFlujoCaja = isPermisoNuevoLineaFlujoCaja;
	}

	public Boolean getIsPermisoActualizarLineaFlujoCaja() {
		return isPermisoActualizarLineaFlujoCaja;
	}

	public void setIsPermisoActualizarLineaFlujoCaja(Boolean isPermisoActualizarLineaFlujoCaja) {
		this.isPermisoActualizarLineaFlujoCaja = isPermisoActualizarLineaFlujoCaja;
	}

	public Boolean getIsPermisoEliminarLineaFlujoCaja() {
		return isPermisoEliminarLineaFlujoCaja;
	}

	public void setIsPermisoEliminarLineaFlujoCaja(Boolean isPermisoEliminarLineaFlujoCaja) {
		this.isPermisoEliminarLineaFlujoCaja = isPermisoEliminarLineaFlujoCaja;
	}

	public Boolean getIsPermisoGuardarCambiosLineaFlujoCaja() {
		return isPermisoGuardarCambiosLineaFlujoCaja;
	}

	public void setIsPermisoGuardarCambiosLineaFlujoCaja(Boolean isPermisoGuardarCambiosLineaFlujoCaja) {
		this.isPermisoGuardarCambiosLineaFlujoCaja = isPermisoGuardarCambiosLineaFlujoCaja;
	}
	
	public Boolean getIsPermisoConsultaLineaFlujoCaja() {
		return isPermisoConsultaLineaFlujoCaja;
	}

	public void setIsPermisoConsultaLineaFlujoCaja(Boolean isPermisoConsultaLineaFlujoCaja) {
		this.isPermisoConsultaLineaFlujoCaja = isPermisoConsultaLineaFlujoCaja;
	}

	public Boolean getIsPermisoBusquedaLineaFlujoCaja() {
		return isPermisoBusquedaLineaFlujoCaja;
	}

	public void setIsPermisoBusquedaLineaFlujoCaja(Boolean isPermisoBusquedaLineaFlujoCaja) {
		this.isPermisoBusquedaLineaFlujoCaja = isPermisoBusquedaLineaFlujoCaja;
	}

	public Boolean getIsPermisoReporteLineaFlujoCaja() {
		return isPermisoReporteLineaFlujoCaja;
	}

	public void setIsPermisoReporteLineaFlujoCaja(Boolean isPermisoReporteLineaFlujoCaja) {
		this.isPermisoReporteLineaFlujoCaja = isPermisoReporteLineaFlujoCaja;
	}
	
	public Boolean getIsPermisoPaginacionMedioLineaFlujoCaja() {
		return isPermisoPaginacionMedioLineaFlujoCaja;
	}

	public void setIsPermisoPaginacionMedioLineaFlujoCaja(Boolean isPermisoPaginacionMedioLineaFlujoCaja) {
		this.isPermisoPaginacionMedioLineaFlujoCaja = isPermisoPaginacionMedioLineaFlujoCaja;
	}
	
	public Boolean getIsPermisoPaginacionTodoLineaFlujoCaja() {
		return isPermisoPaginacionTodoLineaFlujoCaja;
	}

	public void setIsPermisoPaginacionTodoLineaFlujoCaja(Boolean isPermisoPaginacionTodoLineaFlujoCaja) {
		this.isPermisoPaginacionTodoLineaFlujoCaja = isPermisoPaginacionTodoLineaFlujoCaja;
	}
	
	public Boolean getIsPermisoPaginacionAltoLineaFlujoCaja() {
		return isPermisoPaginacionAltoLineaFlujoCaja;
	}

	public void setIsPermisoPaginacionAltoLineaFlujoCaja(Boolean isPermisoPaginacionAltoLineaFlujoCaja) {
		this.isPermisoPaginacionAltoLineaFlujoCaja = isPermisoPaginacionAltoLineaFlujoCaja;
	}
	
	public Boolean getIsPermisoCopiarLineaFlujoCaja() {
		return isPermisoCopiarLineaFlujoCaja;
	}

	public void setIsPermisoCopiarLineaFlujoCaja(Boolean isPermisoCopiarLineaFlujoCaja) {
		this.isPermisoCopiarLineaFlujoCaja = isPermisoCopiarLineaFlujoCaja;
	}
	
	public Boolean getIsPermisoVerFormLineaFlujoCaja() {
		return isPermisoVerFormLineaFlujoCaja;
	}

	public void setIsPermisoVerFormLineaFlujoCaja(Boolean isPermisoVerFormLineaFlujoCaja) {
		this.isPermisoVerFormLineaFlujoCaja = isPermisoVerFormLineaFlujoCaja;
	}
	
	public Boolean getIsPermisoDuplicarLineaFlujoCaja() {
		return isPermisoDuplicarLineaFlujoCaja;
	}

	public void setIsPermisoDuplicarLineaFlujoCaja(Boolean isPermisoDuplicarLineaFlujoCaja) {
		this.isPermisoDuplicarLineaFlujoCaja = isPermisoDuplicarLineaFlujoCaja;
	}
	
	public Boolean getIsPermisoOrdenLineaFlujoCaja() {
		return isPermisoOrdenLineaFlujoCaja;
	}

	public void setIsPermisoOrdenLineaFlujoCaja(Boolean isPermisoOrdenLineaFlujoCaja) {
		this.isPermisoOrdenLineaFlujoCaja = isPermisoOrdenLineaFlujoCaja;
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
	
	public Boolean getIsVisibilidadCeldaNuevoLineaFlujoCaja() {
		return isVisibilidadCeldaNuevoLineaFlujoCaja;
	}

	public void setIsVisibilidadCeldaNuevoLineaFlujoCaja(Boolean isVisibilidadCeldaNuevoLineaFlujoCaja) {
		this.isVisibilidadCeldaNuevoLineaFlujoCaja = isVisibilidadCeldaNuevoLineaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarLineaFlujoCaja() {
		return isVisibilidadCeldaDuplicarLineaFlujoCaja;
	}

	public void setIsVisibilidadCeldaDuplicarLineaFlujoCaja(Boolean isVisibilidadCeldaDuplicarLineaFlujoCaja) {
		this.isVisibilidadCeldaDuplicarLineaFlujoCaja = isVisibilidadCeldaDuplicarLineaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarLineaFlujoCaja() {
		return isVisibilidadCeldaCopiarLineaFlujoCaja;
	}

	public void setIsVisibilidadCeldaCopiarLineaFlujoCaja(Boolean isVisibilidadCeldaCopiarLineaFlujoCaja) {
		this.isVisibilidadCeldaCopiarLineaFlujoCaja = isVisibilidadCeldaCopiarLineaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormLineaFlujoCaja() {
		return isVisibilidadCeldaVerFormLineaFlujoCaja;
	}

	public void setIsVisibilidadCeldaVerFormLineaFlujoCaja(Boolean isVisibilidadCeldaVerFormLineaFlujoCaja) {
		this.isVisibilidadCeldaVerFormLineaFlujoCaja = isVisibilidadCeldaVerFormLineaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenLineaFlujoCaja() {
		return isVisibilidadCeldaOrdenLineaFlujoCaja;
	}

	public void setIsVisibilidadCeldaOrdenLineaFlujoCaja(Boolean isVisibilidadCeldaOrdenLineaFlujoCaja) {
		this.isVisibilidadCeldaOrdenLineaFlujoCaja = isVisibilidadCeldaOrdenLineaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesLineaFlujoCaja() {
		return isVisibilidadCeldaNuevoRelacionesLineaFlujoCaja;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesLineaFlujoCaja(Boolean isVisibilidadCeldaNuevoRelacionesLineaFlujoCaja) {
		this.isVisibilidadCeldaNuevoRelacionesLineaFlujoCaja = isVisibilidadCeldaNuevoRelacionesLineaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaModificarLineaFlujoCaja() {
		return isVisibilidadCeldaModificarLineaFlujoCaja;
	}

	public void setIsVisibilidadCeldaModificarLineaFlujoCaja(Boolean isVisibilidadCeldaModificarLineaFlujoCaja) {
		this.isVisibilidadCeldaModificarLineaFlujoCaja = isVisibilidadCeldaModificarLineaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarLineaFlujoCaja() {
		return isVisibilidadCeldaActualizarLineaFlujoCaja;
	}

	public void setIsVisibilidadCeldaActualizarLineaFlujoCaja(Boolean isVisibilidadCeldaActualizarLineaFlujoCaja) {
		this.isVisibilidadCeldaActualizarLineaFlujoCaja = isVisibilidadCeldaActualizarLineaFlujoCaja;
	}

	public Boolean getIsVisibilidadCeldaEliminarLineaFlujoCaja() {
		return isVisibilidadCeldaEliminarLineaFlujoCaja;
	}

	public void setIsVisibilidadCeldaEliminarLineaFlujoCaja(Boolean isVisibilidadCeldaEliminarLineaFlujoCaja) {
		this.isVisibilidadCeldaEliminarLineaFlujoCaja = isVisibilidadCeldaEliminarLineaFlujoCaja;
	}

	public Boolean getIsVisibilidadCeldaCancelarLineaFlujoCaja() {
		return isVisibilidadCeldaCancelarLineaFlujoCaja;
	}

	public void setIsVisibilidadCeldaCancelarLineaFlujoCaja(Boolean isVisibilidadCeldaCancelarLineaFlujoCaja) {
		this.isVisibilidadCeldaCancelarLineaFlujoCaja = isVisibilidadCeldaCancelarLineaFlujoCaja;
	}

	public Boolean getIsVisibilidadCeldaGuardarLineaFlujoCaja() {
		return isVisibilidadCeldaGuardarLineaFlujoCaja;
	}

	public void setIsVisibilidadCeldaGuardarLineaFlujoCaja(Boolean isVisibilidadCeldaGuardarLineaFlujoCaja) {
		this.isVisibilidadCeldaGuardarLineaFlujoCaja = isVisibilidadCeldaGuardarLineaFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosLineaFlujoCaja() {
		return isVisibilidadCeldaGuardarCambiosLineaFlujoCaja;
	}

	public void setIsVisibilidadCeldaGuardarCambiosLineaFlujoCaja(Boolean isVisibilidadCeldaGuardarCambiosLineaFlujoCaja) {
		this.isVisibilidadCeldaGuardarCambiosLineaFlujoCaja = isVisibilidadCeldaGuardarCambiosLineaFlujoCaja;
	}
		
	public LineaFlujoCajaSessionBean getlineaflujocajaSessionBean() {
		return this.lineaflujocajaSessionBean;
	}
	
	public void setlineaflujocajaSessionBean(LineaFlujoCajaSessionBean lineaflujocajaSessionBean) {
		this.lineaflujocajaSessionBean=lineaflujocajaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
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

	public Boolean getisVisibilidadFK_IdTipoGrupoFlujoCaja() {
		return this.isVisibilidadFK_IdTipoGrupoFlujoCaja;
	}

	public void setisVisibilidadFK_IdTipoGrupoFlujoCaja(Boolean isVisibilidadFK_IdTipoGrupoFlujoCaja) {
		this.isVisibilidadFK_IdTipoGrupoFlujoCaja=isVisibilidadFK_IdTipoGrupoFlujoCaja;
	}

	public Boolean getisVisibilidadFK_IdTipoLineaFlujoCaja() {
		return this.isVisibilidadFK_IdTipoLineaFlujoCaja;
	}

	public void setisVisibilidadFK_IdTipoLineaFlujoCaja(Boolean isVisibilidadFK_IdTipoLineaFlujoCaja) {
		this.isVisibilidadFK_IdTipoLineaFlujoCaja=isVisibilidadFK_IdTipoLineaFlujoCaja;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysLineaFlujoCaja(LineaFlujoCaja lineaflujocaja)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(lineaflujocaja,null);
				this.setActualParaGuardarTipoGrupoFlujoCajaForeignKey(lineaflujocaja,null);
				this.setActualParaGuardarTipoLineaFlujoCajaForeignKey(lineaflujocaja,null);
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
	
	public void bugActualizarReferenciaActual(LineaFlujoCaja lineaflujocaja,LineaFlujoCaja lineaflujocajaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalLineaFlujoCaja(lineaflujocaja);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		lineaflujocajaAux.setId(lineaflujocaja.getId());
		lineaflujocajaAux.setVersionRow(lineaflujocaja.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessLineaFlujoCaja();
		
			int intSelectedRow = this.jTableDatosLineaFlujoCaja.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualLineaFlujoCaja(this.lineaflujocaja,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysLineaFlujoCaja(this.lineaflujocaja);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = lineaflujocajaValidator.getInvalidValues(this.lineaflujocaja);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			lineaflujocajaLogic.setDatosCliente(datosCliente);
			lineaflujocajaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				lineaflujocajaAux=new  LineaFlujoCaja();
				
				lineaflujocajaAux.setIsNew(true);
				lineaflujocajaAux.setIsChanged(true);
				
				lineaflujocajaAux.setLineaFlujoCajaOriginal(this.lineaflujocaja);
				
				lineaflujocajaAux.setId(this.lineaflujocaja.getId());	
				lineaflujocajaAux.setVersionRow(this.lineaflujocaja.getVersionRow());	
				lineaflujocajaAux.setid_empresa(this.lineaflujocaja.getid_empresa());	
				lineaflujocajaAux.setid_tipo_grupo_flujo_caja(this.lineaflujocaja.getid_tipo_grupo_flujo_caja());	
				lineaflujocajaAux.setcodigo(this.lineaflujocaja.getcodigo());	
				lineaflujocajaAux.setnombre(this.lineaflujocaja.getnombre());	
				lineaflujocajaAux.setid_tipo_linea_flujo_caja(this.lineaflujocaja.getid_tipo_linea_flujo_caja());	
				lineaflujocajaAux.setes_consolidado(this.lineaflujocaja.getes_consolidado());	
				lineaflujocajaAux.setesta_proyeccion(this.lineaflujocaja.getesta_proyeccion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.lineaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.lineaflujocajaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(lineaflujocajaAux,lineaflujocajaLogic.getLineaFlujoCajas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(lineaflujocajaAux,lineaflujocajas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.lineaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.lineaflujocajaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						lineaflujocajaLogic.saveLineaFlujoCajas();//WithConnection
						//lineaflujocajaLogic.getSetVersionRowLineaFlujoCajas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.lineaflujocaja,lineaflujocajaAux);
					
					this.refrescarForeignKeysDescripcionesLineaFlujoCaja();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.lineaflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								lineaflujocajaLogic.saveLineaFlujoCajaRelaciones(lineaflujocajaAux);//WithConnection
								//lineaflujocajaLogic.getSetVersionRowLineaFlujoCajas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.lineaflujocaja,lineaflujocajaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.lineaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.lineaflujocajaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(lineaflujocajaAux,lineaflujocajaLogic.getLineaFlujoCajas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(lineaflujocajaAux,lineaflujocajas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.lineaflujocaja,lineaflujocajaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				lineaflujocajaAux=new  LineaFlujoCaja();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.lineaflujocajaSessionBean.getEsGuardarRelacionado() 
					|| (this.lineaflujocajaSessionBean.getEsGuardarRelacionado() && this.lineaflujocaja.getId()>=0)) {
						
					lineaflujocajaAux.setIsNew(false);
				}
				
				lineaflujocajaAux.setIsDeleted(false);
			
				lineaflujocajaAux.setId(this.lineaflujocaja.getId());	
				lineaflujocajaAux.setVersionRow(this.lineaflujocaja.getVersionRow());	
				lineaflujocajaAux.setid_empresa(this.lineaflujocaja.getid_empresa());	
				lineaflujocajaAux.setid_tipo_grupo_flujo_caja(this.lineaflujocaja.getid_tipo_grupo_flujo_caja());	
				lineaflujocajaAux.setcodigo(this.lineaflujocaja.getcodigo());	
				lineaflujocajaAux.setnombre(this.lineaflujocaja.getnombre());	
				lineaflujocajaAux.setid_tipo_linea_flujo_caja(this.lineaflujocaja.getid_tipo_linea_flujo_caja());	
				lineaflujocajaAux.setes_consolidado(this.lineaflujocaja.getes_consolidado());	
				lineaflujocajaAux.setesta_proyeccion(this.lineaflujocaja.getesta_proyeccion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(lineaflujocajaAux,lineaflujocajaLogic.getLineaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(lineaflujocajaAux,lineaflujocajas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.lineaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.lineaflujocajaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						lineaflujocajaLogic.saveLineaFlujoCajas();//WithConnection
						//lineaflujocajaLogic.getSetVersionRowLineaFlujoCajas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.lineaflujocaja,lineaflujocajaAux);
					
					this.refrescarForeignKeysDescripcionesLineaFlujoCaja();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.lineaflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								lineaflujocajaLogic.saveLineaFlujoCajaRelaciones(lineaflujocajaAux);//WithConnection
								//lineaflujocajaLogic.getSetVersionRowLineaFlujoCajas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.lineaflujocaja,lineaflujocajaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.lineaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.lineaflujocajaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(lineaflujocajaAux,lineaflujocajaLogic.getLineaFlujoCajas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(lineaflujocajaAux,lineaflujocajas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.lineaflujocaja,lineaflujocajaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				lineaflujocajaAux=new  LineaFlujoCaja();
				
				lineaflujocajaAux.setIsNew(false);
				lineaflujocajaAux.setIsChanged(false);
				
				lineaflujocajaAux.setIsDeleted(true);
				
				lineaflujocajaAux.setId(this.lineaflujocaja.getId());	
				lineaflujocajaAux.setVersionRow(this.lineaflujocaja.getVersionRow());	
				lineaflujocajaAux.setid_empresa(this.lineaflujocaja.getid_empresa());	
				lineaflujocajaAux.setid_tipo_grupo_flujo_caja(this.lineaflujocaja.getid_tipo_grupo_flujo_caja());	
				lineaflujocajaAux.setcodigo(this.lineaflujocaja.getcodigo());	
				lineaflujocajaAux.setnombre(this.lineaflujocaja.getnombre());	
				lineaflujocajaAux.setid_tipo_linea_flujo_caja(this.lineaflujocaja.getid_tipo_linea_flujo_caja());	
				lineaflujocajaAux.setes_consolidado(this.lineaflujocaja.getes_consolidado());	
				lineaflujocajaAux.setesta_proyeccion(this.lineaflujocaja.getesta_proyeccion());	
				
				if(this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.lineaflujocajaAux.getId()>=0) {	
						this.lineaflujocajasEliminados.add(lineaflujocajaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(lineaflujocajaAux,lineaflujocajaLogic.getLineaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(lineaflujocajaAux,lineaflujocajas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.lineaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.lineaflujocajaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						lineaflujocajaLogic.saveLineaFlujoCajas();//WithConnection
						//lineaflujocajaLogic.getSetVersionRowLineaFlujoCajas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.lineaflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								lineaflujocajaLogic.saveLineaFlujoCajaRelaciones(lineaflujocajaAux);//WithConnection
								//lineaflujocajaLogic.getSetVersionRowLineaFlujoCajas();//WithConnection
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
							if(this.lineaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.lineaflujocajaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(lineaflujocajaAux,lineaflujocajaLogic.getLineaFlujoCajas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(lineaflujocajaAux,lineaflujocajas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.getLineaFlujoCajas().addAll(this.lineaflujocajasEliminados);
					
					lineaflujocajaLogic.saveLineaFlujoCajas();//WithConnection
					//lineaflujocajaLogic.getSetVersionRowLineaFlujoCajas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesLineaFlujoCaja();
				
				this.lineaflujocajasEliminados= new ArrayList<LineaFlujoCaja>();		
			}
			
			if(this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Linea Flujo Caja GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Linea Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.lineaflujocaja=lineaflujocajaAux;
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
      		//this.finishProcessLineaFlujoCaja();
      	}
		
	}	
	
	public void actualizarRelaciones(LineaFlujoCaja lineaflujocajaLocal) throws Exception {
		
		if(this.lineaflujocajaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(LineaFlujoCaja lineaflujocajaLocal) throws Exception {	
		if(this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				lineaflujocajaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoGrupoFlujoCajaDetalleFormJInternalFrame.class)) {
				TipoGrupoFlujoCajaBeanSwingJInternalFrame tipogrupoflujocajaBeanSwingJInternalFrameLocal=(TipoGrupoFlujoCajaBeanSwingJInternalFrame) ((TipoGrupoFlujoCajaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipogrupoflujocajaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoGrupoFlujoCaja(tipogrupoflujocajaBeanSwingJInternalFrameLocal.gettipogrupoflujocaja(),true);
				tipogrupoflujocajaBeanSwingJInternalFrameLocal.actualizarLista(tipogrupoflujocajaBeanSwingJInternalFrameLocal.tipogrupoflujocaja,this.tipogrupoflujocajasForeignKey);

				tipogrupoflujocajaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipogrupoflujocajaBeanSwingJInternalFrameLocal.tipogrupoflujocaja);

				lineaflujocajaLocal.setTipoGrupoFlujoCaja(tipogrupoflujocajaBeanSwingJInternalFrameLocal.tipogrupoflujocaja);

				this.addItemDefectoCombosForeignKeyTipoGrupoFlujoCaja();
				this.cargarCombosFrameTipoGrupoFlujoCajasForeignKey("Formulario");
				this.setActualTipoGrupoFlujoCajaForeignKey(tipogrupoflujocajaBeanSwingJInternalFrameLocal.tipogrupoflujocaja.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoLineaFlujoCajaDetalleFormJInternalFrame.class)) {
				TipoLineaFlujoCajaBeanSwingJInternalFrame tipolineaflujocajaBeanSwingJInternalFrameLocal=(TipoLineaFlujoCajaBeanSwingJInternalFrame) ((TipoLineaFlujoCajaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipolineaflujocajaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoLineaFlujoCaja(tipolineaflujocajaBeanSwingJInternalFrameLocal.gettipolineaflujocaja(),true);
				tipolineaflujocajaBeanSwingJInternalFrameLocal.actualizarLista(tipolineaflujocajaBeanSwingJInternalFrameLocal.tipolineaflujocaja,this.tipolineaflujocajasForeignKey);

				tipolineaflujocajaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipolineaflujocajaBeanSwingJInternalFrameLocal.tipolineaflujocaja);

				lineaflujocajaLocal.setTipoLineaFlujoCaja(tipolineaflujocajaBeanSwingJInternalFrameLocal.tipolineaflujocaja);

				this.addItemDefectoCombosForeignKeyTipoLineaFlujoCaja();
				this.cargarCombosFrameTipoLineaFlujoCajasForeignKey("Formulario");
				this.setActualTipoLineaFlujoCajaForeignKey(tipolineaflujocajaBeanSwingJInternalFrameLocal.tipolineaflujocaja.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarLineaFlujoCajaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosLineaFlujoCaja.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = lineaflujocajaValidator.getInvalidValues(this.lineaflujocaja);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(LineaFlujoCaja lineaflujocaja,List<LineaFlujoCaja> lineaflujocajas) throws Exception {
		try	{		
			LineaFlujoCajaConstantesFunciones.actualizarLista(lineaflujocaja,lineaflujocajas,this.lineaflujocajaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(LineaFlujoCaja lineaflujocaja,List<LineaFlujoCaja> lineaflujocajas) throws Exception {
		try	{			
			LineaFlujoCajaConstantesFunciones.actualizarSelectedLista(lineaflujocaja,lineaflujocajas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<LineaFlujoCaja> lineaflujocajasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				lineaflujocajasLocal=this.lineaflujocajaLogic.getLineaFlujoCajas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				lineaflujocajasLocal=this.lineaflujocajas;
			}
			//ARCHITECTURE
		
			for(LineaFlujoCaja lineaflujocajaLocal:lineaflujocajasLocal) {
				if(this.permiteMantenimiento(lineaflujocajaLocal) && lineaflujocajaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+LineaFlujoCajaConstantesFunciones.getLineaFlujoCajaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(LineaFlujoCajaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLineaFlujoCaja.jLabelid_empresaLineaFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LineaFlujoCajaConstantesFunciones.IDTIPOGRUPOFLUJOCAJA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLineaFlujoCaja.jLabelid_tipo_grupo_flujo_cajaLineaFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LineaFlujoCajaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLineaFlujoCaja.jLabelcodigoLineaFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LineaFlujoCajaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLineaFlujoCaja.jLabelnombreLineaFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LineaFlujoCajaConstantesFunciones.IDTIPOLINEAFLUJOCAJA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLineaFlujoCaja.jLabelid_tipo_linea_flujo_cajaLineaFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LineaFlujoCajaConstantesFunciones.ESCONSOLIDADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLineaFlujoCaja.jLabeles_consolidadoLineaFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(LineaFlujoCajaConstantesFunciones.ESTAPROYECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLineaFlujoCaja.jLabelesta_proyeccionLineaFlujoCaja,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLineaFlujoCaja.jLabelid_empresaLineaFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLineaFlujoCaja.jLabelid_tipo_grupo_flujo_cajaLineaFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLineaFlujoCaja.jLabelcodigoLineaFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLineaFlujoCaja.jLabelnombreLineaFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLineaFlujoCaja.jLabelid_tipo_linea_flujo_cajaLineaFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLineaFlujoCaja.jLabeles_consolidadoLineaFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormLineaFlujoCaja.jLabelesta_proyeccionLineaFlujoCaja,"");
		
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
		this.iIdNuevoLineaFlujoCaja--;	
		
		
		this.lineaflujocajaAux=new LineaFlujoCaja();
		
		this.lineaflujocajaAux.setId(this.iIdNuevoLineaFlujoCaja);
		this.lineaflujocajaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.lineaflujocajaLogic.getLineaFlujoCajas().add(this.lineaflujocajaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.lineaflujocajas.add(this.lineaflujocajaAux);
		}
		//ARCHITECTURE
		
		this.lineaflujocaja=this.lineaflujocajaAux;
		
		if(LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioLineaFlujoCaja(this.lineaflujocaja);
			this.setVariablesObjetoActualToFormularioForeignKeyLineaFlujoCaja(this.lineaflujocaja);
		}
				
		//this.setDefaultControlesLineaFlujoCaja();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyLineaFlujoCaja();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyLineaFlujoCaja();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyLineaFlujoCaja();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualLineaFlujoCaja(this.lineaflujocajaBean,this.lineaflujocaja,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysLineaFlujoCaja(this.lineaflujocaja);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.lineaflujocajaSessionBean.getConGuardarRelaciones()) {
			classes=LineaFlujoCajaConstantesFunciones.getClassesRelationshipsOfLineaFlujoCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.lineaflujocajaReturnGeneral=lineaflujocajaLogic.procesarEventosLineaFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.lineaflujocajaLogic.getLineaFlujoCajas(),this.lineaflujocaja,this.lineaflujocajaParameterGeneral,this.isEsNuevoLineaFlujoCaja,classes);//this.lineaflujocajaLogic.getLineaFlujoCaja()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanLineaFlujoCaja(this.lineaflujocajaReturnGeneral,this.lineaflujocajaBean,false);
		
		if(this.lineaflujocajaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyLineaFlujoCaja(this.lineaflujocajaReturnGeneral.getLineaFlujoCaja());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioLineaFlujoCaja(this.lineaflujocajaReturnGeneral.getLineaFlujoCaja());
		}
		
		if(this.lineaflujocajaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioLineaFlujoCaja(this.lineaflujocajaReturnGeneral.getLineaFlujoCaja(),classes);//this.lineaflujocajaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualLineaFlujoCaja(this.lineaflujocaja,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyLineaFlujoCaja();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyLineaFlujoCaja();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			LineaFlujoCajaBeanSwingJInternalFrameAdditional.RecargarFormLineaFlujoCaja(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingLineaFlujoCaja(false);
						
			if(lineaflujocajaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualLineaFlujoCaja();
			}
			
			this.actualizarVisualTableDatosLineaFlujoCaja();
			
			this.jTableDatosLineaFlujoCaja.setRowSelectionInterval(this.getIndiceNuevoLineaFlujoCaja(), this.getIndiceNuevoLineaFlujoCaja());
			
			this.seleccionarFilaTablaLineaFlujoCajaActual();
						
			this.actualizarEstadoCeldasBotonesLineaFlujoCaja("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesLineaFlujoCaja(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormLineaFlujoCaja.jTextFieldcodigoLineaFlujoCaja.setEnabled(isHabilitar && this.lineaflujocajaConstantesFunciones.activarcodigoLineaFlujoCaja);
		this.jInternalFrameDetalleFormLineaFlujoCaja.jTextAreanombreLineaFlujoCaja.setEnabled(isHabilitar && this.lineaflujocajaConstantesFunciones.activarnombreLineaFlujoCaja);
		this.jInternalFrameDetalleFormLineaFlujoCaja.jCheckBoxes_consolidadoLineaFlujoCaja.setEnabled(isHabilitar && this.lineaflujocajaConstantesFunciones.activares_consolidadoLineaFlujoCaja);
		this.jInternalFrameDetalleFormLineaFlujoCaja.jCheckBoxesta_proyeccionLineaFlujoCaja.setEnabled(isHabilitar && this.lineaflujocajaConstantesFunciones.activaresta_proyeccionLineaFlujoCaja);	
		//
		this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_empresaLineaFlujoCaja.setEnabled(isHabilitar && this.lineaflujocajaConstantesFunciones.activarid_empresaLineaFlujoCaja);
		this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCaja.setEnabled(isHabilitar && this.lineaflujocajaConstantesFunciones.activarid_tipo_grupo_flujo_cajaLineaFlujoCaja);
		this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCaja.setEnabled(isHabilitar && this.lineaflujocajaConstantesFunciones.activarid_tipo_linea_flujo_cajaLineaFlujoCaja);
	};
	
	public void setDefaultControlesLineaFlujoCaja() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoLineaFlujoCaja(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.lineaflujocajaSessionBean.setConGuardarRelaciones(true);			
			this.lineaflujocajaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormLineaFlujoCaja.jTabbedPaneRelacionesLineaFlujoCaja.setVisible(true);
			
					
		} else {
			//this.lineaflujocajaSessionBean.setConGuardarRelaciones(false);			
			this.lineaflujocajaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormLineaFlujoCaja.jTabbedPaneRelacionesLineaFlujoCaja.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoLineaFlujoCaja() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LineaFlujoCaja lineaflujocajaAux:this.lineaflujocajaLogic.getLineaFlujoCajas()) {
				if(lineaflujocajaAux.getId().equals(this.iIdNuevoLineaFlujoCaja)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LineaFlujoCaja lineaflujocajaAux:this.lineaflujocajas) {
				if(lineaflujocajaAux.getId().equals(this.iIdNuevoLineaFlujoCaja)) {
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
	
	public int getIndiceActualLineaFlujoCaja(LineaFlujoCaja lineaflujocaja,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LineaFlujoCaja lineaflujocajaAux:this.lineaflujocajaLogic.getLineaFlujoCajas()) {
				if(lineaflujocajaAux.getId().equals(lineaflujocaja.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LineaFlujoCaja lineaflujocajaAux:this.lineaflujocajas) {
				if(lineaflujocajaAux.getId().equals(lineaflujocaja.getId())) {
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
	
	public void setCamposBaseDesdeOriginalLineaFlujoCaja(LineaFlujoCaja lineaflujocajaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LineaFlujoCaja lineaflujocajaAux:this.lineaflujocajaLogic.getLineaFlujoCajas()) {
				if(lineaflujocajaAux.getLineaFlujoCajaOriginal().getId().equals(lineaflujocajaOriginal.getId())) {
					existe=true;
					lineaflujocajaOriginal.setId(lineaflujocajaAux.getId());
					lineaflujocajaOriginal.setVersionRow(lineaflujocajaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LineaFlujoCaja lineaflujocajaAux:this.lineaflujocajas) {
				if(lineaflujocajaAux.getLineaFlujoCajaOriginal().getId().equals(lineaflujocajaOriginal.getId())) {
					existe=true;
					lineaflujocajaOriginal.setId(lineaflujocajaAux.getId());
					lineaflujocajaOriginal.setVersionRow(lineaflujocajaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosLineaFlujoCaja(Boolean esParaCancelar) throws Exception {
		lineaflujocajasAux=new ArrayList<LineaFlujoCaja>();
		lineaflujocajaAux=new LineaFlujoCaja();
		
		if(!this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(LineaFlujoCaja lineaflujocajaAux:this.lineaflujocajaLogic.getLineaFlujoCajas()) {
					if(lineaflujocajaAux.getId()<0) {
						lineaflujocajasAux.add(lineaflujocajaAux);
					}		
				}
				this.iIdNuevoLineaFlujoCaja=0L;
				this.lineaflujocajaLogic.getLineaFlujoCajas().removeAll(lineaflujocajasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(LineaFlujoCaja lineaflujocajaAux:this.lineaflujocajas) {
					if(lineaflujocajaAux.getId()<0) {
						lineaflujocajasAux.add(lineaflujocajaAux);
					}		
				}
				this.iIdNuevoLineaFlujoCaja=0L;
				this.lineaflujocajas.removeAll(lineaflujocajasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoLineaFlujoCaja 
					&& this.lineaflujocajaLogic.getLineaFlujoCajas().size()>0
					) {
					lineaflujocajaAux=this.lineaflujocajaLogic.getLineaFlujoCajas().get(this.lineaflujocajaLogic.getLineaFlujoCajas().size() - 1);
				
					if(lineaflujocajaAux.getId()<0) {
						this.lineaflujocajaLogic.getLineaFlujoCajas().remove(lineaflujocajaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoLineaFlujoCaja && this.lineaflujocajas.size()>0) {
					lineaflujocajaAux=this.lineaflujocajas.get(this.lineaflujocajas.size() - 1);
				
					if(lineaflujocajaAux.getId()<0) {
						this.lineaflujocajas.remove(lineaflujocajaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoLineaFlujoCaja(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(lineaflujocaja.getId()<0) {
				this.lineaflujocajaLogic.getLineaFlujoCajas().remove(this.lineaflujocaja);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(lineaflujocaja.getId()<0) {
				this.lineaflujocajas.remove(this.lineaflujocaja);
			}
		}			
	}
	
	public void setEstadosInicialesLineaFlujoCaja(List<LineaFlujoCaja> lineaflujocajasAux) throws Exception {
		LineaFlujoCajaConstantesFunciones.setEstadosInicialesLineaFlujoCaja(lineaflujocajasAux);
	}
	
	public void setEstadosInicialesLineaFlujoCaja(LineaFlujoCaja lineaflujocajaAux) throws Exception {
		LineaFlujoCajaConstantesFunciones.setEstadosInicialesLineaFlujoCaja(lineaflujocajaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarLineaFlujoCajaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesLineaFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarLineaFlujoCajaActual()) {
				if(!this.isEsNuevoLineaFlujoCaja) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesLineaFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoLineaFlujoCaja=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarLineaFlujoCajaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Linea Flujo Caja ?", "MANTENIMIENTO DE Linea Flujo Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesLineaFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(LineaFlujoCaja lineaflujocaja) throws Exception {
		LineaFlujoCajaConstantesFunciones.seleccionarAsignar(this.lineaflujocaja,lineaflujocaja);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarLineaFlujoCaja=this.isPermisoActualizarOriginalLineaFlujoCaja;
			
			
			this.seleccionarAsignar(lineaflujocaja);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			LineaFlujoCajaConstantesFunciones.quitarEspaciosLineaFlujoCaja(this.lineaflujocaja,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesLineaFlujoCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.lineaflujocajaSessionBean.setsFuncionBusquedaRapida(this.lineaflujocajaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoLineaFlujoCaja) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosLineaFlujoCaja(esParaCancelar);				
				this.cancelarNuevoLineaFlujoCaja(esParaCancelar);								
			}
			
			this.lineaflujocaja=new LineaFlujoCaja();
			
			this.inicializarLineaFlujoCaja();
			
			this.actualizarEstadoCeldasBotonesLineaFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarLineaFlujoCaja() throws Exception {
		try {
			LineaFlujoCajaConstantesFunciones.inicializarLineaFlujoCaja(this.lineaflujocaja);
			
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
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.lineaflujocajaLogic.getLineaFlujoCajas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteLineaFlujoCajas(String sAccionBusqueda,List<LineaFlujoCaja> lineaflujocajasParaReportes) throws Exception {
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
					sPathReporteFinal="LineaFlujoCaja"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="LineaFlujoCajaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("LineaFlujoCajaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="LineaFlujoCaja"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Linea Flujo Cajas");		
		parameters.put("busquedapor", LineaFlujoCajaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceLineaFlujoCaja=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			LineaFlujoCajaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			LineaFlujoCajaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceLineaFlujoCaja=new JRBeanArrayDataSource(LineaFlujoCajaJInternalFrame.TraerLineaFlujoCajaBeans(lineaflujocajasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceLineaFlujoCaja);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+LineaFlujoCajaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+LineaFlujoCajaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(LineaFlujoCajaBean.TraerLineaFlujoCajaBeans(lineaflujocajasParaReportes).toArray()));
							
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
				this.generarExcelReporteLineaFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,lineaflujocajasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalLineaFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,lineaflujocajasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoLineaFlujoCajaActionPerformed(null);
					//this.generarExcelReporteLineaFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,lineaflujocajasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalLineaFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,lineaflujocajasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesLineaFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,lineaflujocajasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesLineaFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,lineaflujocajasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteLineaFlujoCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<LineaFlujoCaja> lineaflujocajasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"lineaflujocaja";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("LineaFlujoCajas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderLineaFlujoCaja("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(LineaFlujoCaja lineaflujocaja : lineaflujocajasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			LineaFlujoCajaConstantesFunciones.generarExcelReporteDataLineaFlujoCaja("NORMAL",row,workbook,lineaflujocaja,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderLineaFlujoCaja(String sTipo,Row row,Workbook workbook) {
		
		LineaFlujoCajaConstantesFunciones.generarExcelReporteHeaderLineaFlujoCaja(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalLineaFlujoCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<LineaFlujoCaja> lineaflujocajasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"lineaflujocaja_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("LineaFlujoCajas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(LineaFlujoCaja lineaflujocaja : lineaflujocajasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(LineaFlujoCajaConstantesFunciones.getLineaFlujoCajaDescripcion(lineaflujocaja));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(lineaflujocaja.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(lineaflujocaja.gettipogrupoflujocaja_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LineaFlujoCajaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LineaFlujoCajaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(lineaflujocaja.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LineaFlujoCajaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LineaFlujoCajaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(lineaflujocaja.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOLINEAFLUJOCAJA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOLINEAFLUJOCAJA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(lineaflujocaja.gettipolineaflujocaja_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LineaFlujoCajaConstantesFunciones.LABEL_ESCONSOLIDADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LineaFlujoCajaConstantesFunciones.LABEL_ESCONSOLIDADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(lineaflujocaja.getes_consolidado()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(LineaFlujoCajaConstantesFunciones.LABEL_ESTAPROYECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(LineaFlujoCajaConstantesFunciones.LABEL_ESTAPROYECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(lineaflujocaja.getesta_proyeccion()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesLineaFlujoCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<LineaFlujoCaja> lineaflujocajasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<LineaFlujoCaja> lineaflujocajasRespaldo=null;
		
		classes=LineaFlujoCajaConstantesFunciones.getClassesRelationshipsOfLineaFlujoCaja(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.lineaflujocajaLogic.setDatosCliente(this.datosCliente);
		this.lineaflujocajaLogic.setDatosDeep(this.datosDeep);
		this.lineaflujocajaLogic.setIsConDeep(true);
		
		lineaflujocajasRespaldo=this.lineaflujocajaLogic.getLineaFlujoCajas();
		
		this.lineaflujocajaLogic.setLineaFlujoCajas(lineaflujocajasParaReportes);	
		this.lineaflujocajaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		lineaflujocajasParaReportes=this.lineaflujocajaLogic.getLineaFlujoCajas();
		this.lineaflujocajaLogic.setLineaFlujoCajas(lineaflujocajasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"lineaflujocaja_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("LineaFlujoCajas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderLineaFlujoCaja("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(LineaFlujoCaja lineaflujocaja : lineaflujocajasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderLineaFlujoCaja("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			LineaFlujoCajaConstantesFunciones.generarExcelReporteDataLineaFlujoCaja("NORMAL",row,workbook,lineaflujocaja,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(LineaFlujoCajaConstantesFunciones.getLineaFlujoCajaDescripcion(lineaflujocaja));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessLineaFlujoCaja() throws Exception {		
		this.startProcessLineaFlujoCaja(true);
	}
	
	public void startProcessLineaFlujoCaja(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasLineaFlujoCaja ,this.jPanelParametrosReportesLineaFlujoCaja, this.jScrollPanelDatosLineaFlujoCaja,this.jPanelPaginacionLineaFlujoCaja, this.jScrollPanelDatosEdicionLineaFlujoCaja, this.jPanelAccionesLineaFlujoCaja,this.jPanelAccionesFormularioLineaFlujoCaja,this.jmenuBarLineaFlujoCaja,this.jmenuBarDetalleLineaFlujoCaja,this.jTtoolBarLineaFlujoCaja,this.jTtoolBarDetalleLineaFlujoCaja);		
		
		final JTabbedPane jTabbedPaneBusquedasLineaFlujoCaja=this.jTabbedPaneBusquedasLineaFlujoCaja; 
		
		final JPanel jPanelParametrosReportesLineaFlujoCaja=this.jPanelParametrosReportesLineaFlujoCaja;
		//final JScrollPane jScrollPanelDatosLineaFlujoCaja=this.jScrollPanelDatosLineaFlujoCaja;
		final JTable jTableDatosLineaFlujoCaja=this.jTableDatosLineaFlujoCaja;		
		final JPanel jPanelPaginacionLineaFlujoCaja=this.jPanelPaginacionLineaFlujoCaja;
		//final JScrollPane jScrollPanelDatosEdicionLineaFlujoCaja=this.jScrollPanelDatosEdicionLineaFlujoCaja;
		final JPanel jPanelAccionesLineaFlujoCaja=this.jPanelAccionesLineaFlujoCaja;
		
		JPanel jPanelCamposAuxiliarLineaFlujoCaja=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarLineaFlujoCaja=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
			jPanelCamposAuxiliarLineaFlujoCaja=this.jInternalFrameDetalleFormLineaFlujoCaja.jPanelCamposLineaFlujoCaja;
			jPanelAccionesFormularioAuxiliarLineaFlujoCaja=this.jInternalFrameDetalleFormLineaFlujoCaja.jPanelAccionesFormularioLineaFlujoCaja;
		}
		
		final JPanel jPanelCamposLineaFlujoCaja=jPanelCamposAuxiliarLineaFlujoCaja;
		final JPanel jPanelAccionesFormularioLineaFlujoCaja=jPanelAccionesFormularioAuxiliarLineaFlujoCaja;
		
		
		final JMenuBar jmenuBarLineaFlujoCaja=this.jmenuBarLineaFlujoCaja;
		final JToolBar jTtoolBarLineaFlujoCaja=this.jTtoolBarLineaFlujoCaja;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarLineaFlujoCaja=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarLineaFlujoCaja=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
			jmenuBarDetalleAuxiliarLineaFlujoCaja=this.jInternalFrameDetalleFormLineaFlujoCaja.jmenuBarDetalleLineaFlujoCaja;
			jTtoolBarDetalleAuxiliarLineaFlujoCaja=this.jInternalFrameDetalleFormLineaFlujoCaja.jTtoolBarDetalleLineaFlujoCaja;
		}
		
		final JMenuBar jmenuBarDetalleLineaFlujoCaja=jmenuBarDetalleAuxiliarLineaFlujoCaja;
		final JToolBar jTtoolBarDetalleLineaFlujoCaja=jTtoolBarDetalleAuxiliarLineaFlujoCaja;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasLineaFlujoCaja;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesLineaFlujoCaja;
			processRunnable.jTableDatos=jTableDatosLineaFlujoCaja;
			processRunnable.jPanelCampos=jPanelCamposLineaFlujoCaja;
			processRunnable.jPanelPaginacion=jPanelPaginacionLineaFlujoCaja;
			processRunnable.jPanelAcciones=jPanelAccionesLineaFlujoCaja;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioLineaFlujoCaja;
			
			
			processRunnable.jmenuBar=jmenuBarLineaFlujoCaja;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleLineaFlujoCaja;
			processRunnable.jTtoolBar=jTtoolBarLineaFlujoCaja;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleLineaFlujoCaja;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasLineaFlujoCaja ,jPanelParametrosReportesLineaFlujoCaja,jTableDatosLineaFlujoCaja, /*jScrollPanelDatosLineaFlujoCaja,*/jPanelCamposLineaFlujoCaja,jPanelPaginacionLineaFlujoCaja, /*jScrollPanelDatosEdicionLineaFlujoCaja,*/ jPanelAccionesLineaFlujoCaja,jPanelAccionesFormularioLineaFlujoCaja,jmenuBarLineaFlujoCaja,jmenuBarDetalleLineaFlujoCaja,jTtoolBarLineaFlujoCaja,jTtoolBarDetalleLineaFlujoCaja);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasLineaFlujoCaja ,jPanelParametrosReportesLineaFlujoCaja, jScrollPanelDatosLineaFlujoCaja,jPanelPaginacionLineaFlujoCaja, jScrollPanelDatosEdicionLineaFlujoCaja, jPanelAccionesLineaFlujoCaja,jPanelAccionesFormularioLineaFlujoCaja,jmenuBarLineaFlujoCaja,jmenuBarDetalleLineaFlujoCaja,jTtoolBarLineaFlujoCaja,jTtoolBarDetalleLineaFlujoCaja);
						
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
	
	public void finishProcessLineaFlujoCaja() {// throws Exception 
		this.finishProcessLineaFlujoCaja(true);
	}
	
	public void finishProcessLineaFlujoCaja(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasLineaFlujoCaja ,this.jPanelParametrosReportesLineaFlujoCaja, this.jScrollPanelDatosLineaFlujoCaja,this.jPanelPaginacionLineaFlujoCaja, this.jScrollPanelDatosEdicionLineaFlujoCaja, this.jPanelAccionesLineaFlujoCaja,this.jPanelAccionesFormularioLineaFlujoCaja,this.jmenuBarLineaFlujoCaja,this.jmenuBarDetalleLineaFlujoCaja,this.jTtoolBarLineaFlujoCaja,this.jTtoolBarDetalleLineaFlujoCaja);		
		
		final JTabbedPane jTabbedPaneBusquedasLineaFlujoCaja=this.jTabbedPaneBusquedasLineaFlujoCaja; 
		
		final JPanel jPanelParametrosReportesLineaFlujoCaja=this.jPanelParametrosReportesLineaFlujoCaja;
		//final JScrollPane jScrollPanelDatosLineaFlujoCaja=this.jScrollPanelDatosLineaFlujoCaja;
		final JTable jTableDatosLineaFlujoCaja=this.jTableDatosLineaFlujoCaja;		
		final JPanel jPanelPaginacionLineaFlujoCaja=this.jPanelPaginacionLineaFlujoCaja;
		//final JScrollPane jScrollPanelDatosEdicionLineaFlujoCaja=this.jScrollPanelDatosEdicionLineaFlujoCaja;
		final JPanel jPanelAccionesLineaFlujoCaja=this.jPanelAccionesLineaFlujoCaja;
		
		JPanel jPanelCamposAuxiliarLineaFlujoCaja=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarLineaFlujoCaja=new JPanel();
		
		if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
			jPanelCamposAuxiliarLineaFlujoCaja=this.jInternalFrameDetalleFormLineaFlujoCaja.jPanelCamposLineaFlujoCaja;
			jPanelAccionesFormularioAuxiliarLineaFlujoCaja=this.jInternalFrameDetalleFormLineaFlujoCaja.jPanelAccionesFormularioLineaFlujoCaja;
		}
		
		final JPanel jPanelCamposLineaFlujoCaja=jPanelCamposAuxiliarLineaFlujoCaja;
		final JPanel jPanelAccionesFormularioLineaFlujoCaja=jPanelAccionesFormularioAuxiliarLineaFlujoCaja;
		
		
		final JMenuBar jmenuBarLineaFlujoCaja=this.jmenuBarLineaFlujoCaja;		
		final JToolBar jTtoolBarLineaFlujoCaja=this.jTtoolBarLineaFlujoCaja;
				
		JMenuBar jmenuBarDetalleAuxiliarLineaFlujoCaja=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarLineaFlujoCaja=new JToolBar();
		
		if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
			jmenuBarDetalleAuxiliarLineaFlujoCaja=this.jInternalFrameDetalleFormLineaFlujoCaja.jmenuBarDetalleLineaFlujoCaja;
			jTtoolBarDetalleAuxiliarLineaFlujoCaja=this.jInternalFrameDetalleFormLineaFlujoCaja.jTtoolBarDetalleLineaFlujoCaja;		
		}
		
		final JMenuBar jmenuBarDetalleLineaFlujoCaja=jmenuBarDetalleAuxiliarLineaFlujoCaja;
		final JToolBar jTtoolBarDetalleLineaFlujoCaja=jTtoolBarDetalleAuxiliarLineaFlujoCaja;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasLineaFlujoCaja;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesLineaFlujoCaja;
			processRunnable.jTableDatos=jTableDatosLineaFlujoCaja;
			processRunnable.jPanelCampos=jPanelCamposLineaFlujoCaja;
			processRunnable.jPanelPaginacion=jPanelPaginacionLineaFlujoCaja;
			processRunnable.jPanelAcciones=jPanelAccionesLineaFlujoCaja;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioLineaFlujoCaja;
			
			
			processRunnable.jmenuBar=jmenuBarLineaFlujoCaja;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleLineaFlujoCaja;
			processRunnable.jTtoolBar=jTtoolBarLineaFlujoCaja;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleLineaFlujoCaja;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasLineaFlujoCaja ,jPanelParametrosReportesLineaFlujoCaja, jTableDatosLineaFlujoCaja,/*jScrollPanelDatosLineaFlujoCaja,*/jPanelCamposLineaFlujoCaja,jPanelPaginacionLineaFlujoCaja, /*jScrollPanelDatosEdicionLineaFlujoCaja,*/ jPanelAccionesLineaFlujoCaja,jPanelAccionesFormularioLineaFlujoCaja,jmenuBarLineaFlujoCaja,jmenuBarDetalleLineaFlujoCaja,jTtoolBarLineaFlujoCaja,jTtoolBarDetalleLineaFlujoCaja));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesLineaFlujoCaja(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarLineaFlujoCaja(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuLineaFlujoCaja(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarLineaFlujoCaja(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarLineaFlujoCaja,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleLineaFlujoCaja,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuLineaFlujoCaja(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarLineaFlujoCaja,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleLineaFlujoCaja,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.lineaflujocajaConstantesFunciones.getsFinalQueryLineaFlujoCaja();
		String  finalQueryPaginacionTodos=this.lineaflujocajaConstantesFunciones.getsFinalQueryLineaFlujoCaja();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=LineaFlujoCajaConstantesFunciones.getArrayColumnasGlobalesNoLineaFlujoCaja(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=LineaFlujoCajaConstantesFunciones.getArrayColumnasGlobalesLineaFlujoCaja(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,LineaFlujoCajaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.lineaflujocajasEliminados= new ArrayList<LineaFlujoCaja>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessLineaFlujoCaja();
		
				///*LineaFlujoCajaSessionBean*/this.lineaflujocajaSessionBean=new LineaFlujoCajaSessionBean();
			
			if(this.lineaflujocajaSessionBean==null) {
				this.lineaflujocajaSessionBean=new LineaFlujoCajaSessionBean();
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
					this.iNumeroPaginacion=LineaFlujoCajaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=LineaFlujoCajaConstantesFunciones.getClassesForeignKeysOfLineaFlujoCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/lineaflujocaja."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			lineaflujocajasAux= new ArrayList<LineaFlujoCaja>();
			
				
			lineaflujocajaLogic.setDatosCliente(this.datosCliente);
			lineaflujocajaLogic.setDatosDeep(this.datosDeep);
			lineaflujocajaLogic.setIsConDeep(true);
			
			
			lineaflujocajaLogic.getLineaFlujoCajaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					lineaflujocajaLogic.getTodosLineaFlujoCajas(finalQueryGlobal,pagination);
					
					//lineaflujocajaLogic.getTodosLineaFlujoCajasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(lineaflujocajaLogic.getLineaFlujoCajas()==null|| lineaflujocajaLogic.getLineaFlujoCajas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							lineaflujocajasAux= new ArrayList<LineaFlujoCaja>();
							lineaflujocajasAux.addAll(lineaflujocajaLogic.getLineaFlujoCajas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineaflujocajasAux= new ArrayList<LineaFlujoCaja>();
							lineaflujocajasAux.addAll(lineaflujocajas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							lineaflujocajaLogic.getTodosLineaFlujoCajas(finalQueryGlobal+"",this.pagination);												
							
							//lineaflujocajaLogic.getTodosLineaFlujoCajasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteLineaFlujoCajas("Todos",lineaflujocajaLogic.getLineaFlujoCajas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							lineaflujocajaLogic.setLineaFlujoCajas(new ArrayList<LineaFlujoCaja>());					
							lineaflujocajaLogic.getLineaFlujoCajas().addAll(lineaflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineaflujocajas=new ArrayList<LineaFlujoCaja>();
							lineaflujocajas.addAll(lineaflujocajasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idLineaFlujoCaja=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idLineaFlujoCaja=this.idActual;
				
				} else if(this.idLineaFlujoCajaActual!=null && this.idLineaFlujoCajaActual!=0L) {
					idLineaFlujoCaja=idLineaFlujoCajaActual;
				}
				
					
				this.sDetalleReporte=LineaFlujoCajaConstantesFunciones.getDetalleIndicePorId(idLineaFlujoCaja);
				
				this.lineaflujocajas=new ArrayList<LineaFlujoCaja>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					lineaflujocajaLogic.getEntity(idLineaFlujoCaja);
					
					//lineaflujocajaLogic.getEntityWithConnection(idLineaFlujoCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaflujocajaLogic.setLineaFlujoCajas(new ArrayList<LineaFlujoCaja>());
					lineaflujocajaLogic.getLineaFlujoCajas().add(lineaflujocajaLogic.getLineaFlujoCaja());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.lineaflujocajas=new ArrayList<LineaFlujoCaja>();
					this.lineaflujocajas.add(lineaflujocaja);
				}
				
				if(lineaflujocajaLogic.getLineaFlujoCaja()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=LineaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					lineaflujocajaLogic.getLineaFlujoCajasBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=lineaflujocajaLogic.getLineaFlujoCajas()==null||lineaflujocajaLogic.getLineaFlujoCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=lineaflujocajas==null|| lineaflujocajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						lineaflujocajasAux=new ArrayList<LineaFlujoCaja>();
						lineaflujocajasAux.addAll(lineaflujocajaLogic.getLineaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineaflujocajasAux=new ArrayList<LineaFlujoCaja>();
							lineaflujocajasAux.addAll(lineaflujocajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							lineaflujocajaLogic.getLineaFlujoCajasBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLineaFlujoCajas("BusquedaPorCodigo",lineaflujocajaLogic.getLineaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLineaFlujoCajas("BusquedaPorCodigo",lineaflujocajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						lineaflujocajaLogic.setLineaFlujoCajas(new ArrayList<LineaFlujoCaja>());
						lineaflujocajaLogic.getLineaFlujoCajas().addAll(lineaflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineaflujocajas=new ArrayList<LineaFlujoCaja>();
							lineaflujocajas.addAll(lineaflujocajasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=LineaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					lineaflujocajaLogic.getLineaFlujoCajasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=lineaflujocajaLogic.getLineaFlujoCajas()==null||lineaflujocajaLogic.getLineaFlujoCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=lineaflujocajas==null|| lineaflujocajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						lineaflujocajasAux=new ArrayList<LineaFlujoCaja>();
						lineaflujocajasAux.addAll(lineaflujocajaLogic.getLineaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineaflujocajasAux=new ArrayList<LineaFlujoCaja>();
							lineaflujocajasAux.addAll(lineaflujocajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							lineaflujocajaLogic.getLineaFlujoCajasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLineaFlujoCajas("BusquedaPorNombre",lineaflujocajaLogic.getLineaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLineaFlujoCajas("BusquedaPorNombre",lineaflujocajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						lineaflujocajaLogic.setLineaFlujoCajas(new ArrayList<LineaFlujoCaja>());
						lineaflujocajaLogic.getLineaFlujoCajas().addAll(lineaflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineaflujocajas=new ArrayList<LineaFlujoCaja>();
							lineaflujocajas.addAll(lineaflujocajasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=LineaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					lineaflujocajaLogic.getLineaFlujoCajasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=lineaflujocajaLogic.getLineaFlujoCajas()==null||lineaflujocajaLogic.getLineaFlujoCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=lineaflujocajas==null|| lineaflujocajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						lineaflujocajasAux=new ArrayList<LineaFlujoCaja>();
						lineaflujocajasAux.addAll(lineaflujocajaLogic.getLineaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineaflujocajasAux=new ArrayList<LineaFlujoCaja>();
							lineaflujocajasAux.addAll(lineaflujocajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							lineaflujocajaLogic.getLineaFlujoCajasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLineaFlujoCajas("FK_IdEmpresa",lineaflujocajaLogic.getLineaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLineaFlujoCajas("FK_IdEmpresa",lineaflujocajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						lineaflujocajaLogic.setLineaFlujoCajas(new ArrayList<LineaFlujoCaja>());
						lineaflujocajaLogic.getLineaFlujoCajas().addAll(lineaflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineaflujocajas=new ArrayList<LineaFlujoCaja>();
							lineaflujocajas.addAll(lineaflujocajasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoGrupoFlujoCaja")) {
				this.sDetalleReporte=LineaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdTipoGrupoFlujoCaja(id_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					lineaflujocajaLogic.getLineaFlujoCajasFK_IdTipoGrupoFlujoCaja(finalQueryGlobal,pagination,id_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdTipoGrupoFlujoCaja(id_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdTipoGrupoFlujoCaja(id_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=lineaflujocajaLogic.getLineaFlujoCajas()==null||lineaflujocajaLogic.getLineaFlujoCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=lineaflujocajas==null|| lineaflujocajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						lineaflujocajasAux=new ArrayList<LineaFlujoCaja>();
						lineaflujocajasAux.addAll(lineaflujocajaLogic.getLineaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineaflujocajasAux=new ArrayList<LineaFlujoCaja>();
							lineaflujocajasAux.addAll(lineaflujocajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							lineaflujocajaLogic.getLineaFlujoCajasFK_IdTipoGrupoFlujoCaja(finalQueryGlobal,pagination,id_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdTipoGrupoFlujoCaja(id_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdTipoGrupoFlujoCaja(id_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLineaFlujoCajas("FK_IdTipoGrupoFlujoCaja",lineaflujocajaLogic.getLineaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLineaFlujoCajas("FK_IdTipoGrupoFlujoCaja",lineaflujocajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						lineaflujocajaLogic.setLineaFlujoCajas(new ArrayList<LineaFlujoCaja>());
						lineaflujocajaLogic.getLineaFlujoCajas().addAll(lineaflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineaflujocajas=new ArrayList<LineaFlujoCaja>();
							lineaflujocajas.addAll(lineaflujocajasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoLineaFlujoCaja")) {
				this.sDetalleReporte=LineaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdTipoLineaFlujoCaja(id_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCaja);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					lineaflujocajaLogic.getLineaFlujoCajasFK_IdTipoLineaFlujoCaja(finalQueryGlobal,pagination,id_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdTipoLineaFlujoCaja(id_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCaja);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdTipoLineaFlujoCaja(id_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCaja);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=lineaflujocajaLogic.getLineaFlujoCajas()==null||lineaflujocajaLogic.getLineaFlujoCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=lineaflujocajas==null|| lineaflujocajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						lineaflujocajasAux=new ArrayList<LineaFlujoCaja>();
						lineaflujocajasAux.addAll(lineaflujocajaLogic.getLineaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineaflujocajasAux=new ArrayList<LineaFlujoCaja>();
							lineaflujocajasAux.addAll(lineaflujocajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							lineaflujocajaLogic.getLineaFlujoCajasFK_IdTipoLineaFlujoCaja(finalQueryGlobal,pagination,id_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=LineaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdTipoLineaFlujoCaja(id_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCaja);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=LineaFlujoCajaConstantesFunciones.getDetalleIndiceFK_IdTipoLineaFlujoCaja(id_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCaja);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteLineaFlujoCajas("FK_IdTipoLineaFlujoCaja",lineaflujocajaLogic.getLineaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteLineaFlujoCajas("FK_IdTipoLineaFlujoCaja",lineaflujocajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						lineaflujocajaLogic.setLineaFlujoCajas(new ArrayList<LineaFlujoCaja>());
						lineaflujocajaLogic.getLineaFlujoCajas().addAll(lineaflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineaflujocajas=new ArrayList<LineaFlujoCaja>();
							lineaflujocajas.addAll(lineaflujocajasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesLineaFlujoCaja();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessLineaFlujoCaja();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=lineaflujocajaLogic.getLineaFlujoCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=lineaflujocajas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=lineaflujocajaLogic.getLineaFlujoCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=lineaflujocajas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(LineaFlujoCaja lineaflujocaja) {
		Boolean permite=true;
		
		if(this.lineaflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=LineaFlujoCajaConstantesFunciones.getOrderByListaLineaFlujoCaja();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=LineaFlujoCajaConstantesFunciones.getOrderByListaLineaFlujoCaja();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LineaFlujoCaja lineaflujocaja:lineaflujocajaLogic.getLineaFlujoCajas()) {
				if(lineaflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
					lineaflujocajaTotales=lineaflujocaja;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LineaFlujoCaja lineaflujocaja:this.lineaflujocajas) {
				if(lineaflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
					lineaflujocajaTotales=lineaflujocaja;
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
			this.lineaflujocajaAux=new LineaFlujoCaja();
			this.lineaflujocajaAux.setsType(Constantes2.S_TOTALES);
			this.lineaflujocajaAux.setIsNew(false);
			this.lineaflujocajaAux.setIsChanged(false);
			this.lineaflujocajaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				LineaFlujoCajaConstantesFunciones.TotalizarValoresFilaLineaFlujoCaja(this.lineaflujocajaLogic.getLineaFlujoCajas(),this.lineaflujocajaAux);
				
				this.lineaflujocajaLogic.getLineaFlujoCajas().add(this.lineaflujocajaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				LineaFlujoCajaConstantesFunciones.TotalizarValoresFilaLineaFlujoCaja(this.lineaflujocajas,this.lineaflujocajaAux);
				
				this.lineaflujocajas.add(this.lineaflujocajaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		lineaflujocajaTotales=new LineaFlujoCaja();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.lineaflujocajaLogic.getLineaFlujoCajas().remove(lineaflujocajaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.lineaflujocajas.remove(lineaflujocajaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		lineaflujocajaTotales=new LineaFlujoCaja();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(LineaFlujoCaja lineaflujocaja:lineaflujocajaLogic.getLineaFlujoCajas()) {
				if(lineaflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
					lineaflujocajaTotales=lineaflujocaja;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				LineaFlujoCajaConstantesFunciones.TotalizarValoresFilaLineaFlujoCaja(this.lineaflujocajaLogic.getLineaFlujoCajas(),lineaflujocajaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(LineaFlujoCaja lineaflujocaja:this.lineaflujocajas) {
				if(lineaflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
					lineaflujocajaTotales=lineaflujocaja;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				LineaFlujoCajaConstantesFunciones.TotalizarValoresFilaLineaFlujoCaja(this.lineaflujocajas,lineaflujocajaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getLineaFlujoCajasBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getLineaFlujoCajasBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getLineaFlujoCajasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getLineaFlujoCajasFK_IdTipoGrupoFlujoCaja()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoGrupoFlujoCaja";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getLineaFlujoCajasFK_IdTipoLineaFlujoCaja()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoLineaFlujoCaja";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getLineaFlujoCajaPorEmpresaPorTipoLineaFlujo()throws Exception {
		try {
			sAccionBusqueda="PorEmpresaPorTipoLineaFlujo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getLineaFlujoCajasBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaflujocajaLogic.getLineaFlujoCajasBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getLineaFlujoCajasBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaflujocajaLogic.getLineaFlujoCajasBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getLineaFlujoCajasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaflujocajaLogic.getLineaFlujoCajasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getLineaFlujoCajasFK_IdTipoGrupoFlujoCaja(String sFinalQuery,Long id_tipo_grupo_flujo_caja)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaflujocajaLogic.getLineaFlujoCajasFK_IdTipoGrupoFlujoCaja(sFinalQuery,this.pagination,id_tipo_grupo_flujo_caja);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getLineaFlujoCajasFK_IdTipoLineaFlujoCaja(String sFinalQuery,Long id_tipo_linea_flujo_caja)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaflujocajaLogic.getLineaFlujoCajasFK_IdTipoLineaFlujoCaja(sFinalQuery,this.pagination,id_tipo_linea_flujo_caja);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getLineaFlujoCajaPorEmpresaPorTipoLineaFlujo(Long id_empresa,Long id_tipo_linea_flujo_caja)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaflujocajaLogic.getLineaFlujoCajaPorEmpresaPorTipoLineaFlujo(id_empresa,id_tipo_linea_flujo_caja);
				
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
	
	public void inicializarPermisosLineaFlujoCaja() {
		this.isPermisoTodoLineaFlujoCaja=false;
		this.isPermisoNuevoLineaFlujoCaja=false;
		this.isPermisoActualizarLineaFlujoCaja=false;
		this.isPermisoActualizarOriginalLineaFlujoCaja=false;
		this.isPermisoEliminarLineaFlujoCaja=false;
		this.isPermisoGuardarCambiosLineaFlujoCaja=false;
		this.isPermisoConsultaLineaFlujoCaja=false;
		this.isPermisoBusquedaLineaFlujoCaja=false;
		this.isPermisoReporteLineaFlujoCaja=false;		
		this.isPermisoOrdenLineaFlujoCaja=false;		
		this.isPermisoPaginacionMedioLineaFlujoCaja=false;		
		this.isPermisoPaginacionAltoLineaFlujoCaja=false;
		this.isPermisoPaginacionTodoLineaFlujoCaja=false;
		this.isPermisoCopiarLineaFlujoCaja=false;		
		this.isPermisoVerFormLineaFlujoCaja=false;		
		this.isPermisoDuplicarLineaFlujoCaja=false;		
		this.isPermisoOrdenLineaFlujoCaja=false;		
	}
	
	public void setPermisosUsuarioLineaFlujoCaja(Boolean isPermiso) {
		this.isPermisoTodoLineaFlujoCaja=isPermiso;
		this.isPermisoNuevoLineaFlujoCaja=isPermiso;
		this.isPermisoActualizarLineaFlujoCaja=isPermiso;
		this.isPermisoActualizarOriginalLineaFlujoCaja=isPermiso;
		this.isPermisoEliminarLineaFlujoCaja=isPermiso;
		this.isPermisoGuardarCambiosLineaFlujoCaja=isPermiso;
		this.isPermisoConsultaLineaFlujoCaja=isPermiso;
		this.isPermisoBusquedaLineaFlujoCaja=isPermiso;
		this.isPermisoReporteLineaFlujoCaja=isPermiso;
		this.isPermisoOrdenLineaFlujoCaja=isPermiso;		
		this.isPermisoPaginacionMedioLineaFlujoCaja=isPermiso;		
		this.isPermisoPaginacionAltoLineaFlujoCaja=isPermiso;		
		this.isPermisoPaginacionTodoLineaFlujoCaja=isPermiso;		
		this.isPermisoCopiarLineaFlujoCaja=isPermiso;		
		this.isPermisoVerFormLineaFlujoCaja=isPermiso;		
		this.isPermisoDuplicarLineaFlujoCaja=isPermiso;
		this.isPermisoOrdenLineaFlujoCaja=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioLineaFlujoCaja(Boolean isPermiso) {
		//this.isPermisoTodoLineaFlujoCaja=isPermiso;
		this.isPermisoNuevoLineaFlujoCaja=isPermiso;
		this.isPermisoActualizarLineaFlujoCaja=isPermiso;
		this.isPermisoActualizarOriginalLineaFlujoCaja=isPermiso;
		this.isPermisoEliminarLineaFlujoCaja=isPermiso;
		this.isPermisoGuardarCambiosLineaFlujoCaja=isPermiso;
		//this.isPermisoConsultaLineaFlujoCaja=isPermiso;
		//this.isPermisoBusquedaLineaFlujoCaja=isPermiso;
		//this.isPermisoReporteLineaFlujoCaja=isPermiso;
		//this.isPermisoOrdenLineaFlujoCaja=isPermiso;		
		//this.isPermisoPaginacionMedioLineaFlujoCaja=isPermiso;		
		//this.isPermisoPaginacionAltoLineaFlujoCaja=isPermiso;		
		//this.isPermisoPaginacionTodoLineaFlujoCaja=isPermiso;		
		//this.isPermisoCopiarLineaFlujoCaja=isPermiso;		
		//this.isPermisoDuplicarLineaFlujoCaja=isPermiso;
		//this.isPermisoOrdenLineaFlujoCaja=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioLineaFlujoCajaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(LineaFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebLineaFlujoCaja(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioLineaFlujoCajaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioLineaFlujoCajaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionLineaFlujoCajaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioLineaFlujoCajaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioLineaFlujoCaja() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(LineaFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, LineaFlujoCajaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoLineaFlujoCaja=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarLineaFlujoCaja=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalLineaFlujoCaja=this.isPermisoActualizarLineaFlujoCaja;
			this.isPermisoEliminarLineaFlujoCaja=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosLineaFlujoCaja=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaLineaFlujoCaja=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaLineaFlujoCaja=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoLineaFlujoCaja=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteLineaFlujoCaja=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenLineaFlujoCaja=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioLineaFlujoCaja=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoLineaFlujoCaja=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoLineaFlujoCaja=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarLineaFlujoCaja=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormLineaFlujoCaja=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarLineaFlujoCaja=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenLineaFlujoCaja=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosLineaFlujoCaja.setToolTipText(this.jTableDatosLineaFlujoCaja.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioLineaFlujoCaja(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioLineaFlujoCaja(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(LineaFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(LineaFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioLineaFlujoCaja() throws Exception {
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
	public void inicializarCombosForeignKeyLineaFlujoCajaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.tipogrupoflujocajasForeignKey=new ArrayList();
				this.tipolineaflujocajasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyLineaFlujoCajaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(LineaFlujoCajaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyLineaFlujoCajaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoGrupoFlujoCajaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoLineaFlujoCajaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoGrupoFlujoCajaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipogrupoflujocajasForeignKey==null||this.tipogrupoflujocajasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoGrupoFlujoCajaConstantesFunciones.getArrayColumnasGlobalesTipoGrupoFlujoCaja(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoGrupoFlujoCajaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoGrupoFlujoCajaConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoGrupoFlujoCajasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoLineaFlujoCajaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipolineaflujocajasForeignKey==null||this.tipolineaflujocajasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoLineaFlujoCajaConstantesFunciones.getArrayColumnasGlobalesTipoLineaFlujoCaja(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoLineaFlujoCajaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoLineaFlujoCajaConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoLineaFlujoCajasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyLineaFlujoCajaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			LineaFlujoCajaParameterReturnGeneral lineaflujocajaReturnGeneral=new LineaFlujoCajaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.lineaflujocajaConstantesFunciones.cargarid_empresaLineaFlujoCaja)
					 || (this.esRecargarFks && this.lineaflujocajaConstantesFunciones.cargarid_empresaLineaFlujoCaja)) {

					if(!this.lineaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+lineaflujocajaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalTipoGrupoFlujoCaja="";

				if(((this.tipogrupoflujocajasForeignKey==null||this.tipogrupoflujocajasForeignKey.size()<=0) && this.lineaflujocajaConstantesFunciones.cargarid_tipo_grupo_flujo_cajaLineaFlujoCaja)
					 || (this.esRecargarFks && this.lineaflujocajaConstantesFunciones.cargarid_tipo_grupo_flujo_cajaLineaFlujoCaja)) {

					if(!this.lineaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionTipoGrupoFlujoCaja()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoGrupoFlujoCajaConstantesFunciones.getArrayColumnasGlobalesTipoGrupoFlujoCaja(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoGrupoFlujoCaja=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoGrupoFlujoCajaConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoGrupoFlujoCaja=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoGrupoFlujoCaja, "");
						finalQueryGlobalTipoGrupoFlujoCaja+=TipoGrupoFlujoCajaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoGrupoFlujoCajasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoGrupoFlujoCaja=" WHERE " + ConstantesSql.ID + "="+lineaflujocajaSessionBean.getlidTipoGrupoFlujoCajaActual();
					}
				} else {
					finalQueryGlobalTipoGrupoFlujoCaja="NONE";
				}


				String finalQueryGlobalTipoLineaFlujoCaja="";

				if(((this.tipolineaflujocajasForeignKey==null||this.tipolineaflujocajasForeignKey.size()<=0) && this.lineaflujocajaConstantesFunciones.cargarid_tipo_linea_flujo_cajaLineaFlujoCaja)
					 || (this.esRecargarFks && this.lineaflujocajaConstantesFunciones.cargarid_tipo_linea_flujo_cajaLineaFlujoCaja)) {

					if(!this.lineaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionTipoLineaFlujoCaja()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoLineaFlujoCajaConstantesFunciones.getArrayColumnasGlobalesTipoLineaFlujoCaja(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoLineaFlujoCaja=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoLineaFlujoCajaConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoLineaFlujoCaja=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoLineaFlujoCaja, "");
						finalQueryGlobalTipoLineaFlujoCaja+=TipoLineaFlujoCajaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoLineaFlujoCajasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoLineaFlujoCaja=" WHERE " + ConstantesSql.ID + "="+lineaflujocajaSessionBean.getlidTipoLineaFlujoCajaActual();
					}
				} else {
					finalQueryGlobalTipoLineaFlujoCaja="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				lineaflujocajaReturnGeneral=lineaflujocajaLogic.cargarCombosLoteForeignKeyLineaFlujoCaja(finalQueryGlobalEmpresa,finalQueryGlobalTipoGrupoFlujoCaja,finalQueryGlobalTipoLineaFlujoCaja);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=lineaflujocajaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalTipoGrupoFlujoCaja.equals("NONE")) {
				this.tipogrupoflujocajasForeignKey=lineaflujocajaReturnGeneral.gettipogrupoflujocajasForeignKey();
			}

			if(!finalQueryGlobalTipoLineaFlujoCaja.equals("NONE")) {
				this.tipolineaflujocajasForeignKey=lineaflujocajaReturnGeneral.gettipolineaflujocajasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyLineaFlujoCaja()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyTipoGrupoFlujoCaja();
			this.addItemDefectoCombosForeignKeyTipoLineaFlujoCaja();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.lineaflujocajaSessionBean==null) {
				this.lineaflujocajaSessionBean=new LineaFlujoCajaSessionBean();
			}

			if(!this.lineaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyTipoGrupoFlujoCaja()throws Exception {
		try {

			if(!this.lineaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionTipoGrupoFlujoCaja()) {
				TipoGrupoFlujoCaja tipogrupoflujocaja=new TipoGrupoFlujoCaja();
				TipoGrupoFlujoCajaConstantesFunciones.setTipoGrupoFlujoCajaDescripcion(tipogrupoflujocaja,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipogrupoflujocaja.setId(null);

				if(!TipoGrupoFlujoCajaConstantesFunciones.ExisteEnLista(this.tipogrupoflujocajasForeignKey,tipogrupoflujocaja,true)) {

					this.tipogrupoflujocajasForeignKey.add(0,tipogrupoflujocaja);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoLineaFlujoCaja()throws Exception {
		try {

			if(!this.lineaflujocajaSessionBean.getisBusquedaDesdeForeignKeySesionTipoLineaFlujoCaja()) {
				TipoLineaFlujoCaja tipolineaflujocaja=new TipoLineaFlujoCaja();
				TipoLineaFlujoCajaConstantesFunciones.setTipoLineaFlujoCajaDescripcion(tipolineaflujocaja,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipolineaflujocaja.setId(null);

				if(!TipoLineaFlujoCajaConstantesFunciones.ExisteEnLista(this.tipolineaflujocajasForeignKey,tipolineaflujocaja,true)) {

					this.tipolineaflujocajasForeignKey.add(0,tipolineaflujocaja);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyLineaFlujoCaja()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyLineaFlujoCaja(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyLineaFlujoCaja()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyLineaFlujoCaja();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyLineaFlujoCaja(LineaFlujoCaja lineaflujocaja)throws Exception {	
		try {
			
			this.setActualTipoGrupoFlujoCajaForeignKey(lineaflujocaja.getid_tipo_grupo_flujo_caja(),false,"Formulario");
			this.setActualTipoLineaFlujoCajaForeignKey(lineaflujocaja.getid_tipo_linea_flujo_caja(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyLineaFlujoCaja(LineaFlujoCaja lineaflujocaja,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyLineaFlujoCaja()throws Exception {	
		try {
			
			this.setActualTipoGrupoFlujoCajaForeignKey(this.lineaflujocajaConstantesFunciones.getid_tipo_grupo_flujo_caja(),false,"Formulario");
			this.setActualTipoLineaFlujoCajaForeignKey(this.lineaflujocajaConstantesFunciones.getid_tipo_linea_flujo_caja(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyLineaFlujoCaja()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyLineaFlujoCaja()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyLineaFlujoCaja()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroLineaFlujoCaja()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyLineaFlujoCaja()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameTipoGrupoFlujoCajasForeignKey("Todos");
			this.cargarCombosFrameTipoLineaFlujoCajasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyLineaFlujoCaja(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoGrupoFlujoCajasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoLineaFlujoCajasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyLineaFlujoCaja()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_empresaLineaFlujoCaja!=null && this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_empresaLineaFlujoCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_empresaLineaFlujoCaja.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCaja!=null && this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCaja.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCaja!=null && this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCaja.getItemCount()>0) {
				this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCaja.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public LineaFlujoCajaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public LineaFlujoCajaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public LineaFlujoCajaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.lineaflujocajaSessionBean=new LineaFlujoCajaSessionBean(); 
		this.lineaflujocajaConstantesFunciones=new LineaFlujoCajaConstantesFunciones(); 
		this.lineaflujocajaBean=new LineaFlujoCaja();//(this.lineaflujocajaConstantesFunciones); 		
		this.lineaflujocajaReturnGeneral=new LineaFlujoCajaParameterReturnGeneral(); 
		
		this.lineaflujocajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.lineaflujocajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public LineaFlujoCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public LineaFlujoCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public LineaFlujoCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessLineaFlujoCaja(true);
			
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
			
			this.lineaflujocajaConstantesFunciones=new LineaFlujoCajaConstantesFunciones(); 
			this.lineaflujocajaBean=new LineaFlujoCaja();//this.lineaflujocajaConstantesFunciones); 			
			this.lineaflujocajaReturnGeneral=new LineaFlujoCajaParameterReturnGeneral(); 
		
			LineaFlujoCajaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Linea Flujo Caja Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.lineaflujocaja=new LineaFlujoCaja();
			this.lineaflujocajas = new ArrayList<LineaFlujoCaja>();
			this.lineaflujocajasAux = new ArrayList<LineaFlujoCaja>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic=new LineaFlujoCajaLogic();
				this.lineaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			//this.lineaflujocajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.lineaflujocajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormLineaFlujoCaja);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoLineaFlujoCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoLineaFlujoCaja);	
					}
					
					if(this.jInternalFrameImportacionLineaFlujoCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionLineaFlujoCaja);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByLineaFlujoCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByLineaFlujoCaja);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormLineaFlujoCaja);
				this.jInternalFrameDetalleFormLineaFlujoCaja.setVisible(false);
				this.jInternalFrameDetalleFormLineaFlujoCaja.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoLineaFlujoCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoLineaFlujoCaja);
					this.jInternalFrameReporteDinamicoLineaFlujoCaja.setVisible(false);
					this.jInternalFrameReporteDinamicoLineaFlujoCaja.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionLineaFlujoCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionLineaFlujoCaja);
					this.jInternalFrameImportacionLineaFlujoCaja.setVisible(false);
					this.jInternalFrameImportacionLineaFlujoCaja.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByLineaFlujoCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByLineaFlujoCaja);
					this.jInternalFrameOrderByLineaFlujoCaja.setVisible(false);
					this.jInternalFrameOrderByLineaFlujoCaja.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idLineaFlujoCajaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=LineaFlujoCajaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.lineaflujocajaReturnGeneral=new LineaFlujoCajaParameterReturnGeneral();
			
			this.lineaflujocajaParameterGeneral=new LineaFlujoCajaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.lineaflujocajaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(LineaFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,LineaFlujoCajaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.lineaflujocajaSessionBean.getEsGuardarRelacionado(),this.lineaflujocajaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,LineaFlujoCajaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.lineaflujocajaSessionBean.getEsGuardarRelacionado(),this.lineaflujocajaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoLineaFlujoCaja=false;
			this.isVisibilidadCeldaDuplicarLineaFlujoCaja=true;
			this.isVisibilidadCeldaCopiarLineaFlujoCaja=true;
			this.isVisibilidadCeldaVerFormLineaFlujoCaja=true;
			this.isVisibilidadCeldaOrdenLineaFlujoCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesLineaFlujoCaja=false;
			this.isVisibilidadCeldaModificarLineaFlujoCaja=false;
			this.isVisibilidadCeldaActualizarLineaFlujoCaja=false;
			this.isVisibilidadCeldaEliminarLineaFlujoCaja=false;
			this.isVisibilidadCeldaCancelarLineaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarLineaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosLineaFlujoCaja=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdTipoGrupoFlujoCaja=true;
			this.isVisibilidadFK_IdTipoLineaFlujoCaja=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesLineaFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosLineaFlujoCaja();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioLineaFlujoCaja(false);
			
			this.setPermisosUsuarioLineaFlujoCaja();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.lineaflujocajaSessionBean.getEsGuardarRelacionado() 
				|| (this.lineaflujocajaSessionBean.getEsGuardarRelacionado() && this.lineaflujocajaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioLineaFlujoCajaClasesRelacionadas();
			}
			
			if(this.lineaflujocajaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioLineaFlujoCajaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosLineaFlujoCaja();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualLineaFlujoCaja();
			}
			
			if(!this.isPermisoBusquedaLineaFlujoCaja) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasLineaFlujoCaja.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioLineaFlujoCaja,this.isPermisoPaginacionMedioLineaFlujoCaja,this.isPermisoPaginacionTodoLineaFlujoCaja);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(LineaFlujoCajaConstantesFunciones.getTiposSeleccionarLineaFlujoCaja());
				
				this.tiposColumnasSelect=LineaFlujoCajaConstantesFunciones.getTiposSeleccionarLineaFlujoCaja(true);
				
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
			//if(!this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioLineaFlujoCaja();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioLineaFlujoCaja(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioLineaFlujoCaja(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesLineaFlujoCaja() ;
			
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
			this.tipogrupoflujocajaLogic=new TipoGrupoFlujoCajaLogic();
			this.tipolineaflujocajaLogic=new TipoLineaFlujoCajaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				lineaflujocajaImplementable= (LineaFlujoCajaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+LineaFlujoCajaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				lineaflujocajaImplementableHome= (LineaFlujoCajaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+LineaFlujoCajaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.lineaflujocajas= new ArrayList<LineaFlujoCaja>();
			this.lineaflujocajasEliminados= new ArrayList<LineaFlujoCaja>();
						
			this.isEsNuevoLineaFlujoCaja=false;
			this.esParaAccionDesdeFormularioLineaFlujoCaja=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.tipogrupoflujocajasForeignKey=new ArrayList<TipoGrupoFlujoCaja>() ;
			this.tipolineaflujocajasForeignKey=new ArrayList<TipoLineaFlujoCaja>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyLineaFlujoCaja(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroLineaFlujoCaja();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			LineaFlujoCajaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=LineaFlujoCajaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesLineaFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingLineaFlujoCaja(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioLineaFlujoCaja();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioLineaFlujoCaja();
			}
			
			LineaFlujoCajaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasLineaFlujoCaja.getTabCount(); i++) {
					this.jTabbedPaneBusquedasLineaFlujoCaja.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasLineaFlujoCaja.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessLineaFlujoCaja(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga LineaFlujoCaja: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectLineaFlujoCaja() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesLineaFlujoCaja")) {
				iIndex=this.jInternalFrameDetalleFormLineaFlujoCaja.jTabbedPaneRelacionesLineaFlujoCaja.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormLineaFlujoCaja.jTabbedPaneRelacionesLineaFlujoCaja.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosLineaFlujoCaja.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessLineaFlujoCaja();	
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
	
	public void cargarCombosForeignKeyLineaFlujoCaja(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyLineaFlujoCaja(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyLineaFlujoCaja(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyLineaFlujoCajaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyLineaFlujoCaja();
		
		this.cargarCombosFrameForeignKeyLineaFlujoCaja();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyLineaFlujoCaja();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyLineaFlujoCaja();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoGrupoFlujoCaja(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoGrupoFlujoCajaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoGrupoFlujoCaja();
				this.cargarCombosFrameTipoGrupoFlujoCajasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoGrupoFlujoCaja(this.tipogrupoflujocajasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoLineaFlujoCaja(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoLineaFlujoCajaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoLineaFlujoCaja();
				this.cargarCombosFrameTipoLineaFlujoCajasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoLineaFlujoCaja(this.tipolineaflujocajasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoLineaFlujoCajaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.lineaflujocajaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormLineaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
			
			
			if(jTableDatosLineaFlujoCaja.getRowCount()>=1) {
				jTableDatosLineaFlujoCaja.removeRowSelectionInterval(0, jTableDatosLineaFlujoCaja.getRowCount()-1);						
			}
			
			this.isEsNuevoLineaFlujoCaja=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoLineaFlujoCaja(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesLineaFlujoCaja(true);			
			//this.lineaflujocaja=new LineaFlujoCaja();
			//this.lineaflujocaja.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesLineaFlujoCaja(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLineaFlujoCaja() ;
			
			if(LineaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleLineaFlujoCaja(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.lineaflujocaja);	
			this.actualizarInformacion("INFO_PADRE",false,this.lineaflujocaja);				
			
			LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
			
			if(this.lineaflujocajaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar LineaFlujoCaja: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarLineaFlujoCajaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<LineaFlujoCaja> lineaflujocajasSeleccionados=new ArrayList<LineaFlujoCaja>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosLineaFlujoCaja.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosLineaFlujoCaja.getSelectedRows().length;			
			}
			
			lineaflujocajasSeleccionados=this.getLineaFlujoCajasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoLineaFlujoCaja--;			
				//LineaFlujoCaja lineaflujocajaAux= new LineaFlujoCaja();			
				//lineaflujocajaAux.setId(this.iIdNuevoLineaFlujoCaja);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//LineaFlujoCaja lineaflujocajaOrigen=new LineaFlujoCaja();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(LineaFlujoCaja lineaflujocajaOrigen : lineaflujocajasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosLineaFlujoCaja.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							lineaflujocajaOrigen =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							lineaflujocajaOrigen =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaLineaFlujoCaja();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.lineaflujocaja.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosLineaFlujoCaja(lineaflujocajaOrigen,this.lineaflujocaja,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysLineaFlujoCaja(this.lineaflujocaja);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.lineaflujocajaLogic.getLineaFlujoCajas().add(this.lineaflujocajaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.lineaflujocajas.add(this.lineaflujocajaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaLineaFlujoCaja(false);
				
				this.jTableDatosLineaFlujoCaja.setRowSelectionInterval(this.getIndiceNuevoLineaFlujoCaja(), this.getIndiceNuevoLineaFlujoCaja());
				
				int iLastRow =  this.jTableDatosLineaFlujoCaja.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosLineaFlujoCaja.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosLineaFlujoCaja.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaLineaFlujoCaja(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<LineaFlujoCaja> lineaflujocajasSeleccionados=new ArrayList<LineaFlujoCaja>();									
		
			LineaFlujoCaja lineaflujocajaOrigen=new LineaFlujoCaja();
			LineaFlujoCaja lineaflujocajaDestino=new LineaFlujoCaja();
				
			lineaflujocajasSeleccionados=this.getLineaFlujoCajasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosLineaFlujoCaja.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || lineaflujocajasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosLineaFlujoCaja.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						lineaflujocajaOrigen =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						lineaflujocajaOrigen =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						lineaflujocajaDestino =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						lineaflujocajaDestino =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				lineaflujocajaOrigen =lineaflujocajasSeleccionados.get(0);
				lineaflujocajaDestino =lineaflujocajasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosLineaFlujoCaja(lineaflujocajaOrigen,lineaflujocajaDestino,true,false);
				
				lineaflujocajaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(lineaflujocajaDestino,lineaflujocajaLogic.getLineaFlujoCajas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(lineaflujocajaDestino,lineaflujocajas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaLineaFlujoCaja(false);
				
				//this.jTableDatosLineaFlujoCaja.setRowSelectionInterval(this.getIndiceNuevoLineaFlujoCaja(), this.getIndiceNuevoLineaFlujoCaja());
				
				int iLastRow =  this.jTableDatosLineaFlujoCaja.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosLineaFlujoCaja.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosLineaFlujoCaja.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaLineaFlujoCaja(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormLineaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormLineaFlujoCaja.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesLineaFlujoCaja.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasLineaFlujoCaja.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesLineaFlujoCaja.setVisible(!isVisible);
			this.jPanelPaginacionLineaFlujoCaja.setVisible(!isVisible);
			this.jPanelAccionesLineaFlujoCaja.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameLineaFlujoCaja();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoLineaFlujoCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionLineaFlujoCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByLineaFlujoCaja();
			
			this.abrirFrameOrderByLineaFlujoCaja();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByLineaFlujoCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleLineaFlujoCaja(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormLineaFlujoCaja);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormLineaFlujoCaja.isMaximum()) {
					this.jInternalFrameDetalleFormLineaFlujoCaja.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormLineaFlujoCaja.setSize(this.jInternalFrameDetalleFormLineaFlujoCaja.iWidthFormulario,this.jInternalFrameDetalleFormLineaFlujoCaja.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormLineaFlujoCaja.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormLineaFlujoCaja.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormLineaFlujoCaja.isMaximum()) {
						this.jInternalFrameDetalleFormLineaFlujoCaja.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormLineaFlujoCaja.jContentPaneDetalleLineaFlujoCaja.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormLineaFlujoCaja.jTabbedPaneRelacionesLineaFlujoCaja.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormLineaFlujoCaja.jContentPaneDetalleLineaFlujoCaja.getWidth(),LineaFlujoCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormLineaFlujoCaja.jTabbedPaneRelacionesLineaFlujoCaja.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormLineaFlujoCaja.jContentPaneDetalleLineaFlujoCaja.getWidth(),LineaFlujoCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormLineaFlujoCaja.jTabbedPaneRelacionesLineaFlujoCaja.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormLineaFlujoCaja.jContentPaneDetalleLineaFlujoCaja.getWidth(),LineaFlujoCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormLineaFlujoCaja.setVisible(true);
	        this.jInternalFrameDetalleFormLineaFlujoCaja.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByLineaFlujoCaja() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByLineaFlujoCaja==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByLineaFlujoCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLineaFlujoCaja,false,this);
				} else {
					this.jInternalFrameOrderByLineaFlujoCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByLineaFlujoCaja,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByLineaFlujoCaja);
				this.jInternalFrameOrderByLineaFlujoCaja.setVisible(false);
				this.jInternalFrameOrderByLineaFlujoCaja.setSelected(false);
				
				this.jInternalFrameOrderByLineaFlujoCaja.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByLineaFlujoCaja"));
				
				this.inicializarActualizarBindingTablaOrderByLineaFlujoCaja();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionLineaFlujoCaja() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionLineaFlujoCaja==null) {
				
				this.jInternalFrameImportacionLineaFlujoCaja=new ImportacionJInternalFrame(LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionLineaFlujoCaja);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionLineaFlujoCaja);
				this.jInternalFrameImportacionLineaFlujoCaja.setVisible(false);
				this.jInternalFrameImportacionLineaFlujoCaja.setSelected(false);


				this.jInternalFrameImportacionLineaFlujoCaja.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionLineaFlujoCaja"));
				this.jInternalFrameImportacionLineaFlujoCaja.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionLineaFlujoCaja"));
				this.jInternalFrameImportacionLineaFlujoCaja.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionLineaFlujoCaja"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoLineaFlujoCaja() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoLineaFlujoCaja==null) {
				this.jInternalFrameReporteDinamicoLineaFlujoCaja=new ReporteDinamicoJInternalFrame(LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoLineaFlujoCaja);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoLineaFlujoCaja);
				this.jInternalFrameReporteDinamicoLineaFlujoCaja.setVisible(false);
				this.jInternalFrameReporteDinamicoLineaFlujoCaja.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoLineaFlujoCaja"));
				this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoLineaFlujoCaja"));
				this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoLineaFlujoCaja"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualLineaFlujoCaja();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleLineaFlujoCaja() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormLineaFlujoCaja);
			
	       	this.jInternalFrameDetalleFormLineaFlujoCaja.setVisible(false);
	        this.jInternalFrameDetalleFormLineaFlujoCaja.setSelected(false);
			
			//this.jInternalFrameDetalleFormLineaFlujoCaja.dispose();
			//this.jInternalFrameDetalleFormLineaFlujoCaja=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoLineaFlujoCaja() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoLineaFlujoCaja.setVisible(true);
	        this.jInternalFrameReporteDinamicoLineaFlujoCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionLineaFlujoCaja() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionLineaFlujoCaja.setVisible(true);
	        this.jInternalFrameImportacionLineaFlujoCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByLineaFlujoCaja() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByLineaFlujoCaja.setVisible(true);
	        this.jInternalFrameOrderByLineaFlujoCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByLineaFlujoCaja() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByLineaFlujoCaja.setVisible(false);
	        this.jInternalFrameOrderByLineaFlujoCaja.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoLineaFlujoCaja() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoLineaFlujoCaja.setVisible(false);
	        this.jInternalFrameReporteDinamicoLineaFlujoCaja.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionLineaFlujoCaja() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionLineaFlujoCaja.setVisible(false);
	        this.jInternalFrameImportacionLineaFlujoCaja.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarLineaFlujoCaja(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarLineaFlujoCaja(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosLineaFlujoCaja.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesLineaFlujoCaja(true);
			//this.isEsNuevoLineaFlujoCaja=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesLineaFlujoCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesLineaFlujoCaja(false) ;
			
			if(lineaflujocajaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(LineaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleLineaFlujoCaja(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLineaFlujoCaja(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaLineaFlujoCajaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosLineaFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarLineaFlujoCaja(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormLineaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosLineaFlujoCaja.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesLineaFlujoCaja(true);
			//this.isEsNuevoLineaFlujoCaja=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.lineaflujocaja.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesLineaFlujoCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesLineaFlujoCaja(false) ;
			
			if(LineaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleLineaFlujoCaja(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLineaFlujoCaja(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaTipoGrupoFlujoCaja(List<TipoGrupoFlujoCaja> tipogrupoflujocajasForeignKey)throws Exception{
		TableColumn tableColumnTipoGrupoFlujoCaja=this.jTableDatosLineaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaFlujoCaja,LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA));
		TableCellEditor tableCellEditorTipoGrupoFlujoCaja =tableColumnTipoGrupoFlujoCaja.getCellEditor();

		TipoGrupoFlujoCajaTableCell tipogrupoflujocajaTableCellFk=(TipoGrupoFlujoCajaTableCell)tableCellEditorTipoGrupoFlujoCaja;

		if(tipogrupoflujocajaTableCellFk!=null) {
			tipogrupoflujocajaTableCellFk.settipogrupoflujocajasForeignKey(tipogrupoflujocajasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosLineaFlujoCaja.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipogrupoflujocajaTableCellFk.setRowActual(intSelectedRow);
			//tipogrupoflujocajaTableCellFk.settipogrupoflujocajasForeignKeyActual(tipogrupoflujocajasForeignKey);
		//}


		if(tipogrupoflujocajaTableCellFk!=null) {
			tipogrupoflujocajaTableCellFk.RecargarTipoGrupoFlujoCajasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoLineaFlujoCaja(List<TipoLineaFlujoCaja> tipolineaflujocajasForeignKey)throws Exception{
		TableColumn tableColumnTipoLineaFlujoCaja=this.jTableDatosLineaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaFlujoCaja,LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOLINEAFLUJOCAJA));
		TableCellEditor tableCellEditorTipoLineaFlujoCaja =tableColumnTipoLineaFlujoCaja.getCellEditor();

		TipoLineaFlujoCajaTableCell tipolineaflujocajaTableCellFk=(TipoLineaFlujoCajaTableCell)tableCellEditorTipoLineaFlujoCaja;

		if(tipolineaflujocajaTableCellFk!=null) {
			tipolineaflujocajaTableCellFk.settipolineaflujocajasForeignKey(tipolineaflujocajasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosLineaFlujoCaja.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipolineaflujocajaTableCellFk.setRowActual(intSelectedRow);
			//tipolineaflujocajaTableCellFk.settipolineaflujocajasForeignKeyActual(tipolineaflujocajasForeignKey);
		//}


		if(tipolineaflujocajaTableCellFk!=null) {
			tipolineaflujocajaTableCellFk.RecargarTipoLineaFlujoCajasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesLineaFlujoCaja(false);
			
			//if(!this.isEsNuevoLineaFlujoCaja) {								
				int intSelectedRow = this.jTableDatosLineaFlujoCaja.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualLineaFlujoCaja(this.lineaflujocaja,true);
				this.setVariablesFormularioToObjetoActualForeignKeysLineaFlujoCaja(this.lineaflujocaja);
				
			}
			
			if(this.permiteMantenimiento(this.lineaflujocaja)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoLineaFlujoCaja=true;
					this.inicializarActualizarBindingTablaLineaFlujoCaja(false);
					this.isEsNuevoLineaFlujoCaja=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoLineaFlujoCaja=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoLineaFlujoCaja=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesLineaFlujoCaja(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualLineaFlujoCaja(false);
				
				this.habilitarDeshabilitarControlesLineaFlujoCaja(false);
			
												
				
				if(LineaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleLineaFlujoCaja();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoLineaFlujoCajaActionPerformed(evt,lineaflujocajaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualLineaFlujoCaja(this.lineaflujocaja,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosLineaFlujoCaja.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,lineaflujocajaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.lineaflujocaja.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(LineaFlujoCaja.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaFlujoCaja.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosLineaFlujoCaja.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				this.lineaflujocaja.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				this.lineaflujocaja.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.lineaflujocaja)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((LineaFlujoCajaModel) this.jTableDatosLineaFlujoCaja.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoLineaFlujoCaja=true;
				this.inicializarActualizarBindingTablaLineaFlujoCaja(false);
				this.isEsNuevoLineaFlujoCaja=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesLineaFlujoCaja(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualLineaFlujoCaja(false);
				
				this.habilitarDeshabilitarControlesLineaFlujoCaja(false);
				
				
				
				if(LineaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleLineaFlujoCaja();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosLineaFlujoCaja.getRowCount()>=1) {
				jTableDatosLineaFlujoCaja.removeRowSelectionInterval(0, jTableDatosLineaFlujoCaja.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesLineaFlujoCaja(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaLineaFlujoCaja(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesLineaFlujoCaja(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualLineaFlujoCaja(false) ;
			
			this.isEsNuevoLineaFlujoCaja=false;
			
			if(LineaFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleLineaFlujoCaja();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingLineaFlujoCaja(false);
				
				//SI ES MANUAL
				if(LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualLineaFlujoCaja();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoLineaFlujoCaja--;			
			//LineaFlujoCaja lineaflujocajaAux= new LineaFlujoCaja();			
			//lineaflujocajaAux.setId(this.iIdNuevoLineaFlujoCaja);
			
			if(this.jInternalFrameDetalleFormLineaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaLineaFlujoCaja();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysLineaFlujoCaja(this.lineaflujocaja);
			
			this.lineaflujocaja.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.lineaflujocajaLogic.getLineaFlujoCajas().add(this.lineaflujocajaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.lineaflujocajas.add(this.lineaflujocajaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaLineaFlujoCaja(false);
			
			this.jTableDatosLineaFlujoCaja.setRowSelectionInterval(this.getIndiceNuevoLineaFlujoCaja(), this.getIndiceNuevoLineaFlujoCaja());
			
			int iLastRow =  this.jTableDatosLineaFlujoCaja.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosLineaFlujoCaja.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosLineaFlujoCaja.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaLineaFlujoCaja(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingLineaFlujoCaja(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLineaFlujoCaja(false);
			
			//SI ES MANUAL
			if(LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualLineaFlujoCaja();
			}
			
			//this.abrirFrameTreeLineaFlujoCaja();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Linea Flujo CajaS ?", "MANTENIMIENTO DE Linea Flujo Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionLineaFlujoCaja.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralLineaFlujoCaja();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.lineaflujocajaReturnGeneral=lineaflujocajaLogic.procesarImportacionLineaFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.lineaflujocajaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarLineaFlujoCajaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionLineaFlujoCaja.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionLineaFlujoCaja.setFileImportacion(this.jInternalFrameImportacionLineaFlujoCaja.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionLineaFlujoCaja.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionLineaFlujoCaja.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionLineaFlujoCaja.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionLineaFlujoCaja.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<LineaFlujoCaja> lineaflujocajasSeleccionados=new ArrayList<LineaFlujoCaja>();		

		lineaflujocajasSeleccionados=this.getLineaFlujoCajasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("LineaFlujoCajaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"LineaFlujoCajaBaseDesign.jrxml";
			
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
			
			this.generarReporteLineaFlujoCajas("Todos",lineaflujocajasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case LineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoGrupoFlujoCaja_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoGrupoFlujoCaja_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoGrupoFlujoCaja_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoGrupoFlujoCaja_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOLINEAFLUJOCAJA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoLineaFlujoCaja_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoLineaFlujoCaja_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoLineaFlujoCaja_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoLineaFlujoCaja_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_ESCONSOLIDADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Consolidado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Consolidado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Consolidado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Consolidado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_ESTAPROYECCION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taProyeccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taProyeccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taProyeccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taProyeccion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case LineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA:
					sNombreCampoCategoria="id_tipo_grupo_flujo_caja";
					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOLINEAFLUJOCAJA:
					sNombreCampoCategoria="id_tipo_linea_flujo_caja";
					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_ESCONSOLIDADO:
					sNombreCampoCategoria="es_consolidado";
					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_ESTAPROYECCION:
					sNombreCampoCategoria="esta_proyeccion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case LineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA:
					sNombreCampoCategoriaValor="id_tipo_grupo_flujo_caja";
					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOLINEAFLUJOCAJA:
					sNombreCampoCategoriaValor="id_tipo_linea_flujo_caja";
					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_ESCONSOLIDADO:
					sNombreCampoCategoriaValor="es_consolidado";
					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_ESTAPROYECCION:
					sNombreCampoCategoriaValor="esta_proyeccion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case LineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Grupo Flujo Caja",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_grupo_flujo_caja");
					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOLINEAFLUJOCAJA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Linea Flujo Caja",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_linea_flujo_caja");
					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_ESCONSOLIDADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Consolidado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_consolidado");
					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_ESTAPROYECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Esta Proyeccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esta_proyeccion");
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
	
	public void jButtonGenerarExcelReporteDinamicoLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<LineaFlujoCaja> lineaflujocajasSeleccionados=new ArrayList<LineaFlujoCaja>();		
		
		lineaflujocajasSeleccionados=this.getLineaFlujoCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"lineaflujocaja";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("LineaFlujoCajas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case LineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(LineaFlujoCaja lineaflujocaja:lineaflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(lineaflujocaja.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA);
					iRow++;

					for(LineaFlujoCaja lineaflujocaja:lineaflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(lineaflujocaja.gettipogrupoflujocaja_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LineaFlujoCajaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(LineaFlujoCaja lineaflujocaja:lineaflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(lineaflujocaja.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LineaFlujoCajaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(LineaFlujoCaja lineaflujocaja:lineaflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(lineaflujocaja.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOLINEAFLUJOCAJA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOLINEAFLUJOCAJA);
					iRow++;

					for(LineaFlujoCaja lineaflujocaja:lineaflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(lineaflujocaja.gettipolineaflujocaja_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_ESCONSOLIDADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LineaFlujoCajaConstantesFunciones.LABEL_ESCONSOLIDADO);
					iRow++;

					for(LineaFlujoCaja lineaflujocaja:lineaflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(lineaflujocaja.getes_consolidado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case LineaFlujoCajaConstantesFunciones.LABEL_ESTAPROYECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(LineaFlujoCajaConstantesFunciones.LABEL_ESTAPROYECCION);
					iRow++;

					for(LineaFlujoCaja lineaflujocaja:lineaflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(lineaflujocaja.getesta_proyeccion());
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
			//	this.getFilaCabeceraExportarExcelLineaFlujoCaja(row);				
			//	iRow++;
			//}				
			
			//for(LineaFlujoCaja lineaflujocajaAux:lineaflujocajasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelLineaFlujoCaja(lineaflujocajaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
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
				this.lineaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLineaFlujoCaja(false);
			
			//SI ES MANUAL
			if(LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualLineaFlujoCaja();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLineaFlujoCaja(false);
			
			//SI ES MANUAL
			if(LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualLineaFlujoCaja();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingLineaFlujoCaja(false);
			
			//SI ES MANUAL
			if(LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualLineaFlujoCaja();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaLineaFlujoCaja() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosLineaFlujoCaja.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosLineaFlujoCaja.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosLineaFlujoCaja.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosLineaFlujoCaja.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosLineaFlujoCaja.setMinimumSize(dimensionMinimum);
		this.jTableDatosLineaFlujoCaja.setMaximumSize(dimensionMaximum);
		this.jTableDatosLineaFlujoCaja.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingLineaFlujoCaja(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingLineaFlujoCaja(esInicializar,true);
	}
	
	public void inicializarActualizarBindingLineaFlujoCaja(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaLineaFlujoCaja(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesLineaFlujoCaja(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasLineaFlujoCaja(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesLineaFlujoCaja(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesLineaFlujoCaja(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualLineaFlujoCaja() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaLineaFlujoCaja();
		
		this.inicializarActualizarBindingBotonesManualLineaFlujoCaja(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualLineaFlujoCaja();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesLineaFlujoCaja() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualLineaFlujoCaja(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualLineaFlujoCaja(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosLineaFlujoCaja.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosLineaFlujoCaja.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteLineaFlujoCaja.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormLineaFlujoCaja.jCheckBoxPostAccionNuevoLineaFlujoCaja.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormLineaFlujoCaja.jCheckBoxPostAccionSinCerrarLineaFlujoCaja.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormLineaFlujoCaja.jCheckBoxPostAccionSinMensajeLineaFlujoCaja.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosLineaFlujoCaja.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosLineaFlujoCaja.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteLineaFlujoCaja.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
				this.jInternalFrameDetalleFormLineaFlujoCaja.jCheckBoxPostAccionNuevoLineaFlujoCaja.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormLineaFlujoCaja.jCheckBoxPostAccionSinCerrarLineaFlujoCaja.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormLineaFlujoCaja.jCheckBoxPostAccionSinMensajeLineaFlujoCaja.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionLineaFlujoCaja.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionLineaFlujoCaja.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxTiposAccionesFormularioLineaFlujoCaja.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesLineaFlujoCaja.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoLineaFlujoCaja!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesLineaFlujoCaja.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesLineaFlujoCaja.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarLineaFlujoCaja.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesLineaFlujoCaja.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoLineaFlujoCaja!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesLineaFlujoCaja.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralLineaFlujoCaja.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesLineaFlujoCaja(Boolean esInicializar) throws Exception {
		try	{	
			if(LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualLineaFlujoCaja(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesLineaFlujoCaja() throws Exception {
		try	{
			if(LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualLineaFlujoCaja();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleLineaFlujoCaja() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxTiposAccionesFormularioLineaFlujoCaja.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxTiposAccionesFormularioLineaFlujoCaja.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualLineaFlujoCaja() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesLineaFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesLineaFlujoCaja.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesLineaFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesLineaFlujoCaja.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesLineaFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesLineaFlujoCaja.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionLineaFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionLineaFlujoCaja.addItem(reporte);
			}
			
			
			if(!this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionLineaFlujoCaja.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionLineaFlujoCaja.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesLineaFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesLineaFlujoCaja.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesLineaFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesLineaFlujoCaja.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxTiposAccionesFormularioLineaFlujoCaja.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxTiposAccionesFormularioLineaFlujoCaja.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarLineaFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarLineaFlujoCaja.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarLineaFlujoCaja.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualLineaFlujoCaja();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualLineaFlujoCaja() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoLineaFlujoCaja!=null) {
				this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoLineaFlujoCaja!=null) {
				this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoLineaFlujoCaja!=null) {
				
				if(this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualLineaFlujoCaja()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoLineaFlujoCaja.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreLineaFlujoCaja.getText();
		if(this.jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.getSelectedItem()!=null){this.id_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja=((TipoGrupoFlujoCaja)this.jComboBoxid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja.getSelectedItem()!=null){this.id_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCaja=((TipoLineaFlujoCaja)this.jComboBoxid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCajaLineaFlujoCaja.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasLineaFlujoCaja(Boolean esInicializar) throws Exception {				
		if(LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualLineaFlujoCaja();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaLineaFlujoCaja() throws Exception {
		this.inicializarActualizarBindingTablaLineaFlujoCaja(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByLineaFlujoCaja() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByLineaFlujoCaja.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByLineaFlujoCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByLineaFlujoCaja.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new LineaFlujoCajaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByLineaFlujoCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByLineaFlujoCaja.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new LineaFlujoCajaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosLineaFlujoCajaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaFlujoCajaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new LineaFlujoCajaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByLineaFlujoCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByLineaFlujoCaja.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new LineaFlujoCajaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByLineaFlujoCaja.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaLineaFlujoCaja(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=lineaflujocajaLogic.getLineaFlujoCajas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=lineaflujocajas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosLineaFlujoCaja.setModel(new LineaFlujoCajaModel(this.lineaflujocajaLogic.getLineaFlujoCajas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosLineaFlujoCaja.setModel(new LineaFlujoCajaModel(this.lineaflujocajas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByLineaFlujoCaja!=null && this.jInternalFrameOrderByLineaFlujoCaja.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByLineaFlujoCaja();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosLineaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaFlujoCaja,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new LineaFlujoCajaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO,lineaflujocajaConstantesFunciones.resaltarSeleccionarLineaFlujoCaja,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO,lineaflujocajaConstantesFunciones.resaltarSeleccionarLineaFlujoCaja,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosLineaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaFlujoCaja,LineaFlujoCajaConstantesFunciones.LABEL_ID));

		if(this.lineaflujocajaConstantesFunciones.mostraridLineaFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LineaFlujoCajaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.lineaflujocajaConstantesFunciones.resaltaridLineaFlujoCaja,this.lineaflujocajaConstantesFunciones.activaridLineaFlujoCaja,this,true,"idLineaFlujoCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.lineaflujocajaConstantesFunciones.resaltaridLineaFlujoCaja,this.lineaflujocajaConstantesFunciones.activaridLineaFlujoCaja,this,true,"idLineaFlujoCaja","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLineaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaFlujoCaja,LineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.lineaflujocajaConstantesFunciones.mostrarid_empresaLineaFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.lineaflujocajaConstantesFunciones.resaltarid_empresaLineaFlujoCaja,this,this.lineaflujocajaConstantesFunciones.activarid_empresaLineaFlujoCaja));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.lineaflujocajaConstantesFunciones.resaltarid_empresaLineaFlujoCaja,this,this.lineaflujocajaConstantesFunciones.activarid_empresaLineaFlujoCaja,false,"id_empresaLineaFlujoCaja","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LineaFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLineaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaFlujoCaja,LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA));

		if(this.lineaflujocajaConstantesFunciones.mostrarid_tipo_grupo_flujo_cajaLineaFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoGrupoFlujoCajaTableCell(this.tipogrupoflujocajasForeignKey,this.lineaflujocajaConstantesFunciones.resaltarid_tipo_grupo_flujo_cajaLineaFlujoCaja,this,this.lineaflujocajaConstantesFunciones.activarid_tipo_grupo_flujo_cajaLineaFlujoCaja));
			tableColumn.setCellEditor(new TipoGrupoFlujoCajaTableCell(this.tipogrupoflujocajasForeignKey,this.lineaflujocajaConstantesFunciones.resaltarid_tipo_grupo_flujo_cajaLineaFlujoCaja,this,this.lineaflujocajaConstantesFunciones.activarid_tipo_grupo_flujo_cajaLineaFlujoCaja,true,"id_tipo_grupo_flujo_cajaLineaFlujoCaja","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LineaFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLineaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaFlujoCaja,LineaFlujoCajaConstantesFunciones.LABEL_CODIGO));

		if(this.lineaflujocajaConstantesFunciones.mostrarcodigoLineaFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LineaFlujoCajaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.lineaflujocajaConstantesFunciones.resaltarcodigoLineaFlujoCaja,this.lineaflujocajaConstantesFunciones.activarcodigoLineaFlujoCaja,this,true,"codigoLineaFlujoCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.lineaflujocajaConstantesFunciones.resaltarcodigoLineaFlujoCaja,this.lineaflujocajaConstantesFunciones.activarcodigoLineaFlujoCaja,this,true,"codigoLineaFlujoCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new LineaFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLineaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaFlujoCaja,LineaFlujoCajaConstantesFunciones.LABEL_NOMBRE));

		if(this.lineaflujocajaConstantesFunciones.mostrarnombreLineaFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LineaFlujoCajaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.lineaflujocajaConstantesFunciones.resaltarnombreLineaFlujoCaja,this.lineaflujocajaConstantesFunciones.activarnombreLineaFlujoCaja,this,true,"nombreLineaFlujoCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.lineaflujocajaConstantesFunciones.resaltarnombreLineaFlujoCaja,this.lineaflujocajaConstantesFunciones.activarnombreLineaFlujoCaja,this,true,"nombreLineaFlujoCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new LineaFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLineaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaFlujoCaja,LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOLINEAFLUJOCAJA));

		if(this.lineaflujocajaConstantesFunciones.mostrarid_tipo_linea_flujo_cajaLineaFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOLINEAFLUJOCAJA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoLineaFlujoCajaTableCell(this.tipolineaflujocajasForeignKey,this.lineaflujocajaConstantesFunciones.resaltarid_tipo_linea_flujo_cajaLineaFlujoCaja,this,this.lineaflujocajaConstantesFunciones.activarid_tipo_linea_flujo_cajaLineaFlujoCaja));
			tableColumn.setCellEditor(new TipoLineaFlujoCajaTableCell(this.tipolineaflujocajasForeignKey,this.lineaflujocajaConstantesFunciones.resaltarid_tipo_linea_flujo_cajaLineaFlujoCaja,this,this.lineaflujocajaConstantesFunciones.activarid_tipo_linea_flujo_cajaLineaFlujoCaja,true,"id_tipo_linea_flujo_cajaLineaFlujoCaja","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new LineaFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLineaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaFlujoCaja,LineaFlujoCajaConstantesFunciones.LABEL_ESCONSOLIDADO));

		if(this.lineaflujocajaConstantesFunciones.mostrares_consolidadoLineaFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LineaFlujoCajaConstantesFunciones.LABEL_ESCONSOLIDADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.lineaflujocajaConstantesFunciones.resaltares_consolidadoLineaFlujoCaja,this.lineaflujocajaConstantesFunciones.activares_consolidadoLineaFlujoCaja));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.lineaflujocajaConstantesFunciones.resaltares_consolidadoLineaFlujoCaja,this.lineaflujocajaConstantesFunciones.activares_consolidadoLineaFlujoCaja,this,true,"es_consolidadoLineaFlujoCaja","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new LineaFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosLineaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosLineaFlujoCaja,LineaFlujoCajaConstantesFunciones.LABEL_ESTAPROYECCION));

		if(this.lineaflujocajaConstantesFunciones.mostraresta_proyeccionLineaFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,LineaFlujoCajaConstantesFunciones.LABEL_ESTAPROYECCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.lineaflujocajaConstantesFunciones.resaltaresta_proyeccionLineaFlujoCaja,this.lineaflujocajaConstantesFunciones.activaresta_proyeccionLineaFlujoCaja));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.lineaflujocajaConstantesFunciones.resaltaresta_proyeccionLineaFlujoCaja,this.lineaflujocajaConstantesFunciones.activaresta_proyeccionLineaFlujoCaja,this,true,"esta_proyeccionLineaFlujoCaja","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new LineaFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.lineaflujocajaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.lineaflujocajaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.lineaflujocajaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosLineaFlujoCaja.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.lineaflujocajaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.lineaflujocajaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosLineaFlujoCaja.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarLineaFlujoCaja && this.isPermisoGuardarCambiosLineaFlujoCaja) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.lineaflujocajaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.lineaflujocajaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosLineaFlujoCaja.addColumn(tableColumn);
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
			
			this.jTableDatosLineaFlujoCaja.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarLineaFlujoCaja && this.isPermisoGuardarCambiosLineaFlujoCaja) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarLineaFlujoCaja && this.isPermisoGuardarCambiosLineaFlujoCaja) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosLineaFlujoCaja.moveColumn(this.jTableDatosLineaFlujoCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosLineaFlujoCaja.moveColumn(this.jTableDatosLineaFlujoCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosLineaFlujoCaja.moveColumn(this.jTableDatosLineaFlujoCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosLineaFlujoCaja.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosLineaFlujoCaja.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosLineaFlujoCaja,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosLineaFlujoCaja.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosLineaFlujoCaja.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosLineaFlujoCaja.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosLineaFlujoCaja.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosLineaFlujoCaja.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=lineaflujocajaLogic.getLineaFlujoCajas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=lineaflujocajas.size()-1;
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
		//this.jTableDatosLineaFlujoCaja.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosLineaFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosLineaFlujoCaja();
			
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
				
				//this.isEsNuevoLineaFlujoCaja=false;
					
				LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
			
				if(this.lineaflujocajaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormLineaFlujoCaja==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosLineaFlujoCaja.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosLineaFlujoCaja.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.lineaflujocaja.getsType().equals("DUPLICADO")
				   || this.lineaflujocaja.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoLineaFlujoCaja=true;
				
				} else {
					this.isEsNuevoLineaFlujoCaja=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
					if(this.lineaflujocaja.getId()>=0 && !this.lineaflujocaja.getIsNew()) {						
						this.isEsNuevoLineaFlujoCaja=false;
						
					} else {
						this.isEsNuevoLineaFlujoCaja=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoLineaFlujoCaja(esRelaciones);						
				
				this.seleccionarLineaFlujoCaja(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.lineaflujocaja.getId()<0) {
					this.isEsNuevoLineaFlujoCaja=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarLineaFlujoCaja(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarLineaFlujoCaja(evt,rowIndex);
				}	
				
				if(this.lineaflujocajaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion LineaFlujoCaja: " + this.dDif); 
					}
				}								
				
				LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarLineaFlujoCaja(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.lineaflujocaja)) {
					if(this.lineaflujocaja.getId()>0) {
						this.lineaflujocaja.setIsDeleted(true);
						
						this.lineaflujocajasEliminados.add(this.lineaflujocaja);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.lineaflujocajaLogic.getLineaFlujoCajas().remove(this.lineaflujocaja);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.lineaflujocajas.remove(this.lineaflujocaja);				
					}
					
					
					((LineaFlujoCajaModel) this.jTableDatosLineaFlujoCaja.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaLineaFlujoCaja(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarLineaFlujoCaja(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoLineaFlujoCaja) {
			
			if(this.jInternalFrameDetalleFormLineaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosLineaFlujoCaja.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosLineaFlujoCaja.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioLineaFlujoCaja(this.lineaflujocaja);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.lineaflujocajaConstantesFunciones.cargarid_empresaLineaFlujoCaja || this.lineaflujocajaConstantesFunciones.event_dependid_empresaLineaFlujoCaja) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.lineaflujocaja.getid_empresa());
									//this.inicializarActualizarBindingLineaFlujoCaja(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(lineaflujocaja.getEmpresa()!=null) {
							this.empresasForeignKey.add(lineaflujocaja.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.lineaflujocaja.getid_empresa(),false,"Formulario");

					//TipoGrupoFlujoCaja
					if(!this.lineaflujocajaConstantesFunciones.cargarid_tipo_grupo_flujo_cajaLineaFlujoCaja || this.lineaflujocajaConstantesFunciones.event_dependid_tipo_grupo_flujo_cajaLineaFlujoCaja) {
						//this.cargarCombosTipoGrupoFlujoCajasForeignKeyLista(" where id="+this.lineaflujocaja.getid_tipo_grupo_flujo_caja());
									//this.inicializarActualizarBindingLineaFlujoCaja(false,false);
						this.tipogrupoflujocajasForeignKey=new ArrayList<TipoGrupoFlujoCaja>();

						if(lineaflujocaja.getTipoGrupoFlujoCaja()!=null) {
							this.tipogrupoflujocajasForeignKey.add(lineaflujocaja.getTipoGrupoFlujoCaja());
						}

						this.addItemDefectoCombosForeignKeyTipoGrupoFlujoCaja();
						this.cargarCombosFrameTipoGrupoFlujoCajasForeignKey("Todos");
					}
					this.setActualTipoGrupoFlujoCajaForeignKey(this.lineaflujocaja.getid_tipo_grupo_flujo_caja(),false,"Formulario");

					//TipoLineaFlujoCaja
					if(!this.lineaflujocajaConstantesFunciones.cargarid_tipo_linea_flujo_cajaLineaFlujoCaja || this.lineaflujocajaConstantesFunciones.event_dependid_tipo_linea_flujo_cajaLineaFlujoCaja) {
						//this.cargarCombosTipoLineaFlujoCajasForeignKeyLista(" where id="+this.lineaflujocaja.getid_tipo_linea_flujo_caja());
									//this.inicializarActualizarBindingLineaFlujoCaja(false,false);
						this.tipolineaflujocajasForeignKey=new ArrayList<TipoLineaFlujoCaja>();

						if(lineaflujocaja.getTipoLineaFlujoCaja()!=null) {
							this.tipolineaflujocajasForeignKey.add(lineaflujocaja.getTipoLineaFlujoCaja());
						}

						this.addItemDefectoCombosForeignKeyTipoLineaFlujoCaja();
						this.cargarCombosFrameTipoLineaFlujoCajasForeignKey("Todos");
					}
					this.setActualTipoLineaFlujoCajaForeignKey(this.lineaflujocaja.getid_tipo_linea_flujo_caja(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesLineaFlujoCaja("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesLineaFlujoCaja(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualLineaFlujoCaja() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoLineaFlujoCaja(LineaFlujoCaja lineaflujocaja) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoLineaFlujoCaja(lineaflujocaja,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoLineaFlujoCaja(LineaFlujoCaja lineaflujocaja,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioLineaFlujoCaja(lineaflujocaja);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyLineaFlujoCaja(lineaflujocaja,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyLineaFlujoCaja(lineaflujocaja);
	}
	
	public void setVariablesObjetoActualToFormularioLineaFlujoCaja(LineaFlujoCaja lineaflujocaja) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormLineaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormLineaFlujoCaja.jLabelidLineaFlujoCaja.setText(lineaflujocaja.getId().toString());
			this.jInternalFrameDetalleFormLineaFlujoCaja.jTextFieldcodigoLineaFlujoCaja.setText(lineaflujocaja.getcodigo());
			this.jInternalFrameDetalleFormLineaFlujoCaja.jTextAreanombreLineaFlujoCaja.setText(lineaflujocaja.getnombre());
			this.jInternalFrameDetalleFormLineaFlujoCaja.jCheckBoxes_consolidadoLineaFlujoCaja.setSelected(lineaflujocaja.getes_consolidado());
			this.jInternalFrameDetalleFormLineaFlujoCaja.jCheckBoxesta_proyeccionLineaFlujoCaja.setSelected(lineaflujocaja.getesta_proyeccion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,LineaFlujoCaja lineaflujocajaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,lineaflujocajaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,LineaFlujoCaja lineaflujocajaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				lineaflujocajaLocal=this.lineaflujocaja;
			} else {
				lineaflujocajaLocal=this.lineaflujocajaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(lineaflujocajaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoLineaFlujoCaja(lineaflujocajaLocal,true);
					
					if(lineaflujocajaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(lineaflujocajaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(lineaflujocajaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoLineaFlujoCaja(LineaFlujoCaja lineaflujocaja,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualLineaFlujoCaja(lineaflujocaja,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysLineaFlujoCaja(lineaflujocaja);
	}
	
	public void setVariablesFormularioToObjetoActualLineaFlujoCaja(LineaFlujoCaja lineaflujocaja,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualLineaFlujoCaja(lineaflujocaja,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualLineaFlujoCaja(LineaFlujoCaja lineaflujocaja,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormLineaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormLineaFlujoCaja.jLabelidLineaFlujoCaja.getText()==null || this.jInternalFrameDetalleFormLineaFlujoCaja.jLabelidLineaFlujoCaja.getText()=="" || this.jInternalFrameDetalleFormLineaFlujoCaja.jLabelidLineaFlujoCaja.getText()=="Id") {
				this.jInternalFrameDetalleFormLineaFlujoCaja.jLabelidLineaFlujoCaja.setText("0");
			}

			if(conColumnasBase) {lineaflujocaja.setId(Long.parseLong(this.jInternalFrameDetalleFormLineaFlujoCaja.jLabelidLineaFlujoCaja.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LineaFlujoCajaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLineaFlujoCaja.jLabelIdLineaFlujoCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			lineaflujocaja.setcodigo(this.jInternalFrameDetalleFormLineaFlujoCaja.jTextFieldcodigoLineaFlujoCaja.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LineaFlujoCajaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLineaFlujoCaja.jLabelcodigoLineaFlujoCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			lineaflujocaja.setnombre(this.jInternalFrameDetalleFormLineaFlujoCaja.jTextAreanombreLineaFlujoCaja.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LineaFlujoCajaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLineaFlujoCaja.jLabelnombreLineaFlujoCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			lineaflujocaja.setes_consolidado(this.jInternalFrameDetalleFormLineaFlujoCaja.jCheckBoxes_consolidadoLineaFlujoCaja.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LineaFlujoCajaConstantesFunciones.LABEL_ESCONSOLIDADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLineaFlujoCaja.jLabeles_consolidadoLineaFlujoCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			lineaflujocaja.setesta_proyeccion(this.jInternalFrameDetalleFormLineaFlujoCaja.jCheckBoxesta_proyeccionLineaFlujoCaja.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+LineaFlujoCajaConstantesFunciones.LABEL_ESTAPROYECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormLineaFlujoCaja.jLabelesta_proyeccionLineaFlujoCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualLineaFlujoCaja(LineaFlujoCaja lineaflujocajaBean,LineaFlujoCaja lineaflujocaja,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && lineaflujocajaBean.getid_tipo_grupo_flujo_caja()!=null && !lineaflujocajaBean.getid_tipo_grupo_flujo_caja().equals(-1L))) {lineaflujocaja.setid_tipo_grupo_flujo_caja(lineaflujocajaBean.getid_tipo_grupo_flujo_caja());}
			if(conDefault || (!conDefault && lineaflujocajaBean.getid_tipo_linea_flujo_caja()!=null && !lineaflujocajaBean.getid_tipo_linea_flujo_caja().equals(-1L))) {lineaflujocaja.setid_tipo_linea_flujo_caja(lineaflujocajaBean.getid_tipo_linea_flujo_caja());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosLineaFlujoCaja(LineaFlujoCaja lineaflujocajaOrigen,LineaFlujoCaja lineaflujocaja,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && lineaflujocajaOrigen.getId()!=null && !lineaflujocajaOrigen.getId().equals(0L))) {lineaflujocaja.setId(lineaflujocajaOrigen.getId());}}
			if(conDefault || (!conDefault && lineaflujocajaOrigen.getid_tipo_grupo_flujo_caja()!=null && !lineaflujocajaOrigen.getid_tipo_grupo_flujo_caja().equals(-1L))) {lineaflujocaja.setid_tipo_grupo_flujo_caja(lineaflujocajaOrigen.getid_tipo_grupo_flujo_caja());}
			if(conDefault || (!conDefault && lineaflujocajaOrigen.getcodigo()!=null && !lineaflujocajaOrigen.getcodigo().equals(""))) {lineaflujocaja.setcodigo(lineaflujocajaOrigen.getcodigo());}
			if(conDefault || (!conDefault && lineaflujocajaOrigen.getnombre()!=null && !lineaflujocajaOrigen.getnombre().equals(""))) {lineaflujocaja.setnombre(lineaflujocajaOrigen.getnombre());}
			if(conDefault || (!conDefault && lineaflujocajaOrigen.getid_tipo_linea_flujo_caja()!=null && !lineaflujocajaOrigen.getid_tipo_linea_flujo_caja().equals(-1L))) {lineaflujocaja.setid_tipo_linea_flujo_caja(lineaflujocajaOrigen.getid_tipo_linea_flujo_caja());}
			if(conDefault || (!conDefault && lineaflujocajaOrigen.getes_consolidado()!=null && !lineaflujocajaOrigen.getes_consolidado().equals(false))) {lineaflujocaja.setes_consolidado(lineaflujocajaOrigen.getes_consolidado());}
			if(conDefault || (!conDefault && lineaflujocajaOrigen.getesta_proyeccion()!=null && !lineaflujocajaOrigen.getesta_proyeccion().equals(false))) {lineaflujocaja.setesta_proyeccion(lineaflujocajaOrigen.getesta_proyeccion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioLineaFlujoCaja(LineaFlujoCaja lineaflujocaja) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormLineaFlujoCaja.jLabelidLineaFlujoCaja.setText(lineaflujocaja.getId().toString());
			this.jInternalFrameDetalleFormLineaFlujoCaja.jTextFieldcodigoLineaFlujoCaja.setText(lineaflujocaja.getcodigo());
			this.jInternalFrameDetalleFormLineaFlujoCaja.jTextAreanombreLineaFlujoCaja.setText(lineaflujocaja.getnombre());
			this.jInternalFrameDetalleFormLineaFlujoCaja.jCheckBoxes_consolidadoLineaFlujoCaja.setSelected(lineaflujocaja.getes_consolidado());
			this.jInternalFrameDetalleFormLineaFlujoCaja.jCheckBoxesta_proyeccionLineaFlujoCaja.setSelected(lineaflujocaja.getesta_proyeccion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioLineaFlujoCaja(LineaFlujoCajaBean lineaflujocajaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormLineaFlujoCaja.jLabelidLineaFlujoCaja.setText(lineaflujocajaBean.getId().toString());
			this.jInternalFrameDetalleFormLineaFlujoCaja.jTextFieldcodigoLineaFlujoCaja.setText(lineaflujocajaBean.getcodigo());
			this.jInternalFrameDetalleFormLineaFlujoCaja.jTextAreanombreLineaFlujoCaja.setText(lineaflujocajaBean.getnombre());
			this.jInternalFrameDetalleFormLineaFlujoCaja.jCheckBoxes_consolidadoLineaFlujoCaja.setSelected(lineaflujocajaBean.getes_consolidado());
			this.jInternalFrameDetalleFormLineaFlujoCaja.jCheckBoxesta_proyeccionLineaFlujoCaja.setSelected(lineaflujocajaBean.getesta_proyeccion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanLineaFlujoCaja(LineaFlujoCajaParameterReturnGeneral lineaflujocajaReturnGeneral,LineaFlujoCajaBean lineaflujocajaBean,Boolean conDefault) throws Exception { 
		try {
			LineaFlujoCaja lineaflujocajaLocal=new LineaFlujoCaja();
			
			lineaflujocajaLocal=lineaflujocajaReturnGeneral.getLineaFlujoCaja();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && lineaflujocajaLocal.getId()!=null && !lineaflujocajaLocal.getId().equals(0L))) {lineaflujocajaBean.setId(lineaflujocajaLocal.getId());}}
			if(conDefault || (!conDefault && lineaflujocajaLocal.getid_tipo_grupo_flujo_caja()!=null && !lineaflujocajaLocal.getid_tipo_grupo_flujo_caja().equals(-1L))) {lineaflujocajaBean.setid_tipo_grupo_flujo_caja(lineaflujocajaLocal.getid_tipo_grupo_flujo_caja());}
			if(conDefault || (!conDefault && lineaflujocajaLocal.getcodigo()!=null && !lineaflujocajaLocal.getcodigo().equals(""))) {lineaflujocajaBean.setcodigo(lineaflujocajaLocal.getcodigo());}
			if(conDefault || (!conDefault && lineaflujocajaLocal.getnombre()!=null && !lineaflujocajaLocal.getnombre().equals(""))) {lineaflujocajaBean.setnombre(lineaflujocajaLocal.getnombre());}
			if(conDefault || (!conDefault && lineaflujocajaLocal.getid_tipo_linea_flujo_caja()!=null && !lineaflujocajaLocal.getid_tipo_linea_flujo_caja().equals(-1L))) {lineaflujocajaBean.setid_tipo_linea_flujo_caja(lineaflujocajaLocal.getid_tipo_linea_flujo_caja());}
			if(conDefault || (!conDefault && lineaflujocajaLocal.getes_consolidado()!=null && !lineaflujocajaLocal.getes_consolidado().equals(false))) {lineaflujocajaBean.setes_consolidado(lineaflujocajaLocal.getes_consolidado());}
			if(conDefault || (!conDefault && lineaflujocajaLocal.getesta_proyeccion()!=null && !lineaflujocajaLocal.getesta_proyeccion().equals(false))) {lineaflujocajaBean.setesta_proyeccion(lineaflujocajaLocal.getesta_proyeccion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxLineaFlujoCajaGenerico(Long idLineaFlujoCajaSeleccionado,JComboBox jComboBoxLineaFlujoCaja,List<LineaFlujoCaja> lineaflujocajasLocal)throws Exception {
		try {
			LineaFlujoCaja  lineaflujocajaTemp=null;

			for(LineaFlujoCaja lineaflujocajaAux:lineaflujocajasLocal) {
				if(lineaflujocajaAux.getId()!=null && lineaflujocajaAux.getId().equals(idLineaFlujoCajaSeleccionado)) {
					lineaflujocajaTemp=lineaflujocajaAux;
					break;
				}
			}

			jComboBoxLineaFlujoCaja.setSelectedItem(lineaflujocajaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxLineaFlujoCajaGenerico(JComboBox jComboBoxLineaFlujoCaja,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxLineaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxLineaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxLineaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxLineaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxLineaFlujoCaja.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxLineaFlujoCaja.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxLineaFlujoCaja.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxLineaFlujoCaja.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxLineaFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxLineaFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			lineaflujocaja=(LineaFlujoCaja) lineaflujocajaLogic.getLineaFlujoCajas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			lineaflujocaja =(LineaFlujoCaja) lineaflujocajas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!lineaflujocaja.getIsNew() && !lineaflujocaja.getIsChanged() && !lineaflujocaja.getIsDeleted()) {
				sDescripcion=lineaflujocaja.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=lineaflujocaja.getempresa_descripcion();
			}
		}

		if(sTipo.equals("TipoGrupoFlujoCaja")) {
			//sDescripcion=this.getActualTipoGrupoFlujoCajaForeignKeyDescripcion((Long)value);
			if(!lineaflujocaja.getIsNew() && !lineaflujocaja.getIsChanged() && !lineaflujocaja.getIsDeleted()) {
				sDescripcion=lineaflujocaja.gettipogrupoflujocaja_descripcion();
			} else {
				//sDescripcion=this.getActualTipoGrupoFlujoCajaForeignKeyDescripcion((Long)value);
				sDescripcion=lineaflujocaja.gettipogrupoflujocaja_descripcion();
			}
		}

		if(sTipo.equals("TipoLineaFlujoCaja")) {
			//sDescripcion=this.getActualTipoLineaFlujoCajaForeignKeyDescripcion((Long)value);
			if(!lineaflujocaja.getIsNew() && !lineaflujocaja.getIsChanged() && !lineaflujocaja.getIsDeleted()) {
				sDescripcion=lineaflujocaja.gettipolineaflujocaja_descripcion();
			} else {
				//sDescripcion=this.getActualTipoLineaFlujoCajaForeignKeyDescripcion((Long)value);
				sDescripcion=lineaflujocaja.gettipolineaflujocaja_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		LineaFlujoCaja lineaflujocajaRow=new LineaFlujoCaja();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			lineaflujocajaRow=(LineaFlujoCaja) lineaflujocajaLogic.getLineaFlujoCajas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			lineaflujocajaRow=(LineaFlujoCaja) lineaflujocajas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualLineaFlujoCaja(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoLineaFlujoCaja && this.isPermisoNuevoLineaFlujoCaja));			
			this.jButtonDuplicarLineaFlujoCaja.setVisible((this.isVisibilidadCeldaDuplicarLineaFlujoCaja && this.isPermisoDuplicarLineaFlujoCaja));			
			this.jButtonCopiarLineaFlujoCaja.setVisible((this.isVisibilidadCeldaCopiarLineaFlujoCaja && this.isPermisoCopiarLineaFlujoCaja));
			this.jButtonVerFormLineaFlujoCaja.setVisible((this.isVisibilidadCeldaVerFormLineaFlujoCaja && this.isPermisoVerFormLineaFlujoCaja));
			
			this.jButtonAbrirOrderByLineaFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenLineaFlujoCaja && this.isPermisoOrdenLineaFlujoCaja));			
			
			this.jButtonNuevoRelacionesLineaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesLineaFlujoCaja && this.isPermisoNuevoLineaFlujoCaja));			
			this.jButtonNuevoGuardarCambiosLineaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoLineaFlujoCaja && this.isPermisoNuevoLineaFlujoCaja && this.isPermisoGuardarCambiosLineaFlujoCaja));
			
			if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
			this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonModificarLineaFlujoCaja.setVisible((this.isVisibilidadCeldaModificarLineaFlujoCaja && this.isPermisoActualizarLineaFlujoCaja));	
			this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonActualizarLineaFlujoCaja.setVisible((this.isVisibilidadCeldaActualizarLineaFlujoCaja && this.isPermisoActualizarLineaFlujoCaja));	
			this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonEliminarLineaFlujoCaja.setVisible((this.isVisibilidadCeldaEliminarLineaFlujoCaja && this.isPermisoEliminarLineaFlujoCaja));
			this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonCancelarLineaFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarLineaFlujoCaja);							
			this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonGuardarCambiosLineaFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarLineaFlujoCaja && this.isPermisoGuardarCambiosLineaFlujoCaja));			
			
			}
						
			this.jButtonGuardarCambiosTablaLineaFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosLineaFlujoCaja && this.isPermisoGuardarCambiosLineaFlujoCaja));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarLineaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoLineaFlujoCaja && this.isPermisoNuevoLineaFlujoCaja));						
			this.jButtonDuplicarToolBarLineaFlujoCaja.setVisible((this.isVisibilidadCeldaDuplicarLineaFlujoCaja && this.isPermisoDuplicarLineaFlujoCaja));						
			this.jButtonCopiarToolBarLineaFlujoCaja.setVisible((this.isVisibilidadCeldaCopiarLineaFlujoCaja && this.isPermisoCopiarLineaFlujoCaja));			
			this.jButtonVerFormToolBarLineaFlujoCaja.setVisible((this.isVisibilidadCeldaVerFormLineaFlujoCaja && this.isPermisoVerFormLineaFlujoCaja));			
			this.jButtonAbrirOrderByToolBarLineaFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenLineaFlujoCaja && this.isPermisoOrdenLineaFlujoCaja));
			this.jButtonNuevoRelacionesToolBarLineaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesLineaFlujoCaja && this.isPermisoNuevoLineaFlujoCaja));			
			this.jButtonNuevoGuardarCambiosToolBarLineaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoLineaFlujoCaja && this.isPermisoNuevoLineaFlujoCaja && this.isPermisoGuardarCambiosLineaFlujoCaja));			
			
			if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
			this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonModificarToolBarLineaFlujoCaja.setVisible((this.isVisibilidadCeldaModificarLineaFlujoCaja && this.isPermisoActualizarLineaFlujoCaja));	
			this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonActualizarToolBarLineaFlujoCaja.setVisible((this.isVisibilidadCeldaActualizarLineaFlujoCaja  && this.isPermisoActualizarLineaFlujoCaja));	
			this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonEliminarToolBarLineaFlujoCaja.setVisible((this.isVisibilidadCeldaEliminarLineaFlujoCaja && this.isPermisoEliminarLineaFlujoCaja));
			this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonCancelarToolBarLineaFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarLineaFlujoCaja);				
			this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonGuardarCambiosToolBarLineaFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarLineaFlujoCaja && this.isPermisoGuardarCambiosLineaFlujoCaja));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarLineaFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosLineaFlujoCaja && this.isPermisoGuardarCambiosLineaFlujoCaja));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoLineaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoLineaFlujoCaja && this.isPermisoNuevoLineaFlujoCaja));			
			this.jMenuItemDuplicarLineaFlujoCaja.setVisible((this.isVisibilidadCeldaDuplicarLineaFlujoCaja && this.isPermisoDuplicarLineaFlujoCaja));			
			this.jMenuItemCopiarLineaFlujoCaja.setVisible((this.isVisibilidadCeldaCopiarLineaFlujoCaja && this.isPermisoCopiarLineaFlujoCaja));			
			this.jMenuItemVerFormLineaFlujoCaja.setVisible((this.isVisibilidadCeldaVerFormLineaFlujoCaja && this.isPermisoVerFormLineaFlujoCaja));			
			this.jMenuItemAbrirOrderByLineaFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenLineaFlujoCaja && this.isPermisoOrdenLineaFlujoCaja));			
			//this.jMenuItemMostrarOcultarLineaFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenLineaFlujoCaja && this.isPermisoOrdenLineaFlujoCaja));
			this.jMenuItemDetalleAbrirOrderByLineaFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenLineaFlujoCaja && this.isPermisoOrdenLineaFlujoCaja));			
			//this.jMenuItemDetalleMostrarOcultarLineaFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenLineaFlujoCaja && this.isPermisoOrdenLineaFlujoCaja));			
			this.jMenuItemNuevoRelacionesLineaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesLineaFlujoCaja && this.isPermisoNuevoLineaFlujoCaja));			
			this.jMenuItemNuevoGuardarCambiosLineaFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoLineaFlujoCaja && this.isPermisoNuevoLineaFlujoCaja && this.isPermisoGuardarCambiosLineaFlujoCaja));									
			
			if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
			this.jInternalFrameDetalleFormLineaFlujoCaja.jMenuItemModificarLineaFlujoCaja.setVisible((this.isVisibilidadCeldaModificarLineaFlujoCaja && this.isPermisoActualizarLineaFlujoCaja));	
			this.jInternalFrameDetalleFormLineaFlujoCaja.jMenuItemActualizarLineaFlujoCaja.setVisible((this.isVisibilidadCeldaActualizarLineaFlujoCaja && this.isPermisoActualizarLineaFlujoCaja));	
			this.jInternalFrameDetalleFormLineaFlujoCaja.jMenuItemEliminarLineaFlujoCaja.setVisible((this.isVisibilidadCeldaEliminarLineaFlujoCaja && this.isPermisoEliminarLineaFlujoCaja));
			this.jInternalFrameDetalleFormLineaFlujoCaja.jMenuItemCancelarLineaFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarLineaFlujoCaja);				
			}
			
			this.jMenuItemGuardarCambiosLineaFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarLineaFlujoCaja && this.isPermisoGuardarCambiosLineaFlujoCaja));						
			this.jMenuItemGuardarCambiosTablaLineaFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosLineaFlujoCaja && this.isPermisoGuardarCambiosLineaFlujoCaja));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoLineaFlujoCaja=this.jButtonNuevoLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaDuplicarLineaFlujoCaja=this.jButtonDuplicarLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaCopiarLineaFlujoCaja=this.jButtonCopiarLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaVerFormLineaFlujoCaja=this.jButtonVerFormLineaFlujoCaja.isVisible();
			
			this.isVisibilidadCeldaOrdenLineaFlujoCaja=this.jButtonAbrirOrderByLineaFlujoCaja.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesLineaFlujoCaja=this.jButtonNuevoRelacionesLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaModificarLineaFlujoCaja=this.jButtonModificarLineaFlujoCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
			this.isVisibilidadCeldaActualizarLineaFlujoCaja=this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonActualizarLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaEliminarLineaFlujoCaja=this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonEliminarLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaCancelarLineaFlujoCaja=this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonCancelarLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaGuardarLineaFlujoCaja=this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonGuardarCambiosLineaFlujoCaja.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosLineaFlujoCaja=this.jButtonGuardarCambiosTablaLineaFlujoCaja.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoLineaFlujoCaja=this.jButtonNuevoToolBarLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesLineaFlujoCaja=this.jButtonNuevoRelacionesToolBarLineaFlujoCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
			this.isVisibilidadCeldaModificarLineaFlujoCaja=this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonModificarToolBarLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaActualizarLineaFlujoCaja=this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonActualizarToolBarLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaEliminarLineaFlujoCaja=this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonEliminarToolBarLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaCancelarLineaFlujoCaja=this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonCancelarToolBarLineaFlujoCaja.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarLineaFlujoCaja=this.jButtonGuardarCambiosToolBarLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaGuardarCambiosLineaFlujoCaja=this.jButtonGuardarCambiosTablaToolBarLineaFlujoCaja.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoLineaFlujoCaja=this.jMenuItemNuevoLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesLineaFlujoCaja=this.jMenuItemNuevoRelacionesLineaFlujoCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
			this.isVisibilidadCeldaModificarLineaFlujoCaja=this.jInternalFrameDetalleFormLineaFlujoCaja.jMenuItemModificarLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaActualizarLineaFlujoCaja=this.jInternalFrameDetalleFormLineaFlujoCaja.jMenuItemActualizarLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaEliminarLineaFlujoCaja=this.jInternalFrameDetalleFormLineaFlujoCaja.jMenuItemEliminarLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaCancelarLineaFlujoCaja=this.jInternalFrameDetalleFormLineaFlujoCaja.jMenuItemCancelarLineaFlujoCaja.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarLineaFlujoCaja=this.jMenuItemGuardarCambiosLineaFlujoCaja.isVisible();
			this.isVisibilidadCeldaGuardarCambiosLineaFlujoCaja=this.jMenuItemGuardarCambiosTablaLineaFlujoCaja.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesLineaFlujoCaja(Boolean esInicializar) {
		if(LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.lineaflujocajaSessionBean.getConGuardarRelaciones()) {
				//if(this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesLineaFlujoCaja();
			}
			
			this.inicializarActualizarBindingBotonesManualLineaFlujoCaja(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualLineaFlujoCaja() {
		this.jButtonNuevoLineaFlujoCaja.setVisible(this.isPermisoNuevoLineaFlujoCaja);			
		this.jButtonDuplicarLineaFlujoCaja.setVisible(this.isPermisoDuplicarLineaFlujoCaja);			
		this.jButtonCopiarLineaFlujoCaja.setVisible(this.isPermisoCopiarLineaFlujoCaja);			
		this.jButtonVerFormLineaFlujoCaja.setVisible(this.isPermisoVerFormLineaFlujoCaja);			
		
		this.jButtonAbrirOrderByLineaFlujoCaja.setVisible(this.isPermisoOrdenLineaFlujoCaja);					
		
		this.jButtonNuevoRelacionesLineaFlujoCaja.setVisible(this.isPermisoNuevoLineaFlujoCaja);			
		
		if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonModificarLineaFlujoCaja.setVisible(this.isPermisoActualizarLineaFlujoCaja);	
			this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonActualizarLineaFlujoCaja.setVisible(this.isPermisoActualizarLineaFlujoCaja);	
			this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonEliminarLineaFlujoCaja.setVisible(this.isPermisoEliminarLineaFlujoCaja);
			this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonCancelarLineaFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarLineaFlujoCaja);						
			this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonGuardarCambiosLineaFlujoCaja.setVisible(this.isPermisoGuardarCambiosLineaFlujoCaja);							
		}
		
		this.jButtonGuardarCambiosTablaLineaFlujoCaja.setVisible(this.isPermisoActualizarLineaFlujoCaja);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleLineaFlujoCaja() {
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonModificarLineaFlujoCaja.setVisible(this.isPermisoActualizarLineaFlujoCaja);	
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonActualizarLineaFlujoCaja.setVisible(this.isPermisoActualizarLineaFlujoCaja);	
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonEliminarLineaFlujoCaja.setVisible(this.isPermisoEliminarLineaFlujoCaja);
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonCancelarLineaFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarLineaFlujoCaja);							
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonGuardarCambiosLineaFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarLineaFlujoCaja && this.isPermisoGuardarCambiosLineaFlujoCaja));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosLineaFlujoCaja() {
		if(LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualLineaFlujoCaja();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesLineaFlujoCaja() {
	}
	
	public void jTableDatosLineaFlujoCajaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarLineaFlujoCaja(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidLineaFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLineaFlujoCaja(this.getlineaflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaFlujoCaja(this.lineaflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.lineaflujocaja==null) {
						this.lineaflujocaja = new LineaFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualLineaFlujoCaja(this.lineaflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaFlujoCaja(this.lineaflujocaja);
				}

				if(this.lineaflujocaja.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.lineaflujocaja.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLineaFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaLineaFlujoCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebLineaFlujoCaja(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaFlujoCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosLineaFlujoCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosLineaFlujoCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualLineaFlujoCaja(this.getlineaflujocaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysLineaFlujoCaja(this.lineaflujocaja);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.lineaflujocajaLogic.getConnexion());

				if(this.lineaflujocaja.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.lineaflujocaja.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderLineaFlujoCaja=(TitledBorder)this.jScrollPanelDatosLineaFlujoCaja.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderLineaFlujoCaja.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaLineaFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLineaFlujoCaja(this.getlineaflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaFlujoCaja(this.lineaflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.lineaflujocaja==null) {
						this.lineaflujocaja = new LineaFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualLineaFlujoCaja(this.lineaflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaFlujoCaja(this.lineaflujocaja);
				}

				if(this.lineaflujocaja.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.lineaflujocaja.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLineaFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipogrupoflujocaja=true;

			idTienePermisotipogrupoflujocaja=this.tienePermisosUsuarioEnPaginaWebLineaFlujoCaja(TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipogrupoflujocaja) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaFlujoCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosLineaFlujoCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosLineaFlujoCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualLineaFlujoCaja(this.getlineaflujocaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysLineaFlujoCaja(this.lineaflujocaja);

				this.tipogrupoflujocajaBeanSwingJInternalFrame=new TipoGrupoFlujoCajaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipogrupoflujocajaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipogrupoflujocajaBeanSwingJInternalFrame.getTipoGrupoFlujoCajaLogic().setConnexion(this.lineaflujocajaLogic.getConnexion());

				if(this.lineaflujocaja.getid_tipo_grupo_flujo_caja()!=null) {
					this.tipogrupoflujocajaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipogrupoflujocajaBeanSwingJInternalFrame.setIdActual(this.lineaflujocaja.getid_tipo_grupo_flujo_caja());
					this.tipogrupoflujocajaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipogrupoflujocajaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipogrupoflujocajaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoGrupoFlujoCaja();
				}

				JInternalFrameBase jinternalFrame =this.tipogrupoflujocajaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderLineaFlujoCaja=(TitledBorder)this.jScrollPanelDatosLineaFlujoCaja.getBorder();
				TitledBorder titledBordertipogrupoflujocaja=(TitledBorder)this.tipogrupoflujocajaBeanSwingJInternalFrame.jScrollPanelDatosTipoGrupoFlujoCaja.getBorder();

				titledBordertipogrupoflujocaja.setTitle(titledBorderLineaFlujoCaja.getTitle() + " -> Tipo Grupo Flujo Caja");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLineaFlujoCaja(this.getlineaflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaFlujoCaja(this.lineaflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.lineaflujocaja==null) {
						this.lineaflujocaja = new LineaFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualLineaFlujoCaja(this.lineaflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaFlujoCaja(this.lineaflujocaja);
				}

				if(this.lineaflujocaja.getid_tipo_grupo_flujo_caja()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_grupo_flujo_caja = "+this.lineaflujocaja.getid_tipo_grupo_flujo_caja().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLineaFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoLineaFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLineaFlujoCaja(this.getlineaflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaFlujoCaja(this.lineaflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.lineaflujocaja==null) {
						this.lineaflujocaja = new LineaFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualLineaFlujoCaja(this.lineaflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaFlujoCaja(this.lineaflujocaja);
				}

				if(this.lineaflujocaja.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.lineaflujocaja.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLineaFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreLineaFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLineaFlujoCaja(this.getlineaflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaFlujoCaja(this.lineaflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.lineaflujocaja==null) {
						this.lineaflujocaja = new LineaFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualLineaFlujoCaja(this.lineaflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaFlujoCaja(this.lineaflujocaja);
				}

				if(this.lineaflujocaja.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.lineaflujocaja.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLineaFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipolineaflujocaja=true;

			idTienePermisotipolineaflujocaja=this.tienePermisosUsuarioEnPaginaWebLineaFlujoCaja(TipoLineaFlujoCajaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipolineaflujocaja) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaFlujoCaja.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosLineaFlujoCaja.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosLineaFlujoCaja.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualLineaFlujoCaja(this.getlineaflujocaja(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysLineaFlujoCaja(this.lineaflujocaja);

				this.tipolineaflujocajaBeanSwingJInternalFrame=new TipoLineaFlujoCajaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipolineaflujocajaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipolineaflujocajaBeanSwingJInternalFrame.getTipoLineaFlujoCajaLogic().setConnexion(this.lineaflujocajaLogic.getConnexion());

				if(this.lineaflujocaja.getid_tipo_linea_flujo_caja()!=null) {
					this.tipolineaflujocajaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipolineaflujocajaBeanSwingJInternalFrame.setIdActual(this.lineaflujocaja.getid_tipo_linea_flujo_caja());
					this.tipolineaflujocajaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipolineaflujocajaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipolineaflujocajaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoLineaFlujoCaja();
				}

				JInternalFrameBase jinternalFrame =this.tipolineaflujocajaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderLineaFlujoCaja=(TitledBorder)this.jScrollPanelDatosLineaFlujoCaja.getBorder();
				TitledBorder titledBordertipolineaflujocaja=(TitledBorder)this.tipolineaflujocajaBeanSwingJInternalFrame.jScrollPanelDatosTipoLineaFlujoCaja.getBorder();

				titledBordertipolineaflujocaja.setTitle(titledBorderLineaFlujoCaja.getTitle() + " -> Tipo Linea Flujo Caja ");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLineaFlujoCaja(this.getlineaflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaFlujoCaja(this.lineaflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.lineaflujocaja==null) {
						this.lineaflujocaja = new LineaFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualLineaFlujoCaja(this.lineaflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaFlujoCaja(this.lineaflujocaja);
				}

				if(this.lineaflujocaja.getid_tipo_linea_flujo_caja()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_linea_flujo_caja = "+this.lineaflujocaja.getid_tipo_linea_flujo_caja().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLineaFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_consolidadoLineaFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLineaFlujoCaja(this.getlineaflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaFlujoCaja(this.lineaflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.lineaflujocaja==null) {
						this.lineaflujocaja = new LineaFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualLineaFlujoCaja(this.lineaflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaFlujoCaja(this.lineaflujocaja);
				}

				if(this.lineaflujocaja.getes_consolidado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_consolidado = "+this.lineaflujocaja.getes_consolidado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLineaFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_proyeccionLineaFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosLineaFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualLineaFlujoCaja(this.getlineaflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaFlujoCaja(this.lineaflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.lineaflujocaja==null) {
						this.lineaflujocaja = new LineaFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualLineaFlujoCaja(this.lineaflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaFlujoCaja(this.lineaflujocaja);
				}

				if(this.lineaflujocaja.getesta_proyeccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_proyeccion = "+this.lineaflujocaja.getesta_proyeccion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingLineaFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLineaFlujoCaja(false,false);

			this.getLineaFlujoCajasBusquedaPorCodigo();

			this.inicializarActualizarBindingLineaFlujoCaja(false);

			//if(LineaFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLineaFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLineaFlujoCaja(false,false);

			this.getLineaFlujoCajasBusquedaPorNombre();

			this.inicializarActualizarBindingLineaFlujoCaja(false);

			//if(LineaFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLineaFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLineaFlujoCaja(false,false);

			this.getLineaFlujoCajasFK_IdEmpresa();

			this.inicializarActualizarBindingLineaFlujoCaja(false);

			//if(LineaFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLineaFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoGrupoFlujoCajaLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLineaFlujoCaja(false,false);

			this.getLineaFlujoCajasFK_IdTipoGrupoFlujoCaja();

			this.inicializarActualizarBindingLineaFlujoCaja(false);

			//if(LineaFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLineaFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoLineaFlujoCajaLineaFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingLineaFlujoCaja(false,false);

			this.getLineaFlujoCajasFK_IdTipoLineaFlujoCaja();

			this.inicializarActualizarBindingLineaFlujoCaja(false);

			//if(LineaFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingLineaFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.lineaflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameLineaFlujoCaja() {
		if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
			this.jInternalFrameDetalleFormLineaFlujoCaja.setVisible(false);	    			
			this.jInternalFrameDetalleFormLineaFlujoCaja.dispose();
			this.jInternalFrameDetalleFormLineaFlujoCaja=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoLineaFlujoCaja!=null) {
			this.jInternalFrameReporteDinamicoLineaFlujoCaja.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoLineaFlujoCaja.dispose();
			this.jInternalFrameReporteDinamicoLineaFlujoCaja=null;
		}
		
		if(this.jInternalFrameImportacionLineaFlujoCaja!=null) {
			this.jInternalFrameImportacionLineaFlujoCaja.setVisible(false);	    			
			this.jInternalFrameImportacionLineaFlujoCaja.dispose();
			this.jInternalFrameImportacionLineaFlujoCaja=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessLineaFlujoCaja();
			
			LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
			
			
			if(sTipo.equals("NuevoLineaFlujoCaja")) {
				jButtonNuevoLineaFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarLineaFlujoCaja")) {
				jButtonDuplicarLineaFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarLineaFlujoCaja")) {
				jButtonCopiarLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("VerFormLineaFlujoCaja")) {
				jButtonVerFormLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarLineaFlujoCaja")) {
				jButtonNuevoLineaFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarLineaFlujoCaja")) {
				jButtonDuplicarLineaFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoLineaFlujoCaja")) {
				jButtonNuevoLineaFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarLineaFlujoCaja")) {
				jButtonDuplicarLineaFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesLineaFlujoCaja")) {
				jButtonNuevoLineaFlujoCajaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarLineaFlujoCaja")) {
				jButtonNuevoLineaFlujoCajaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesLineaFlujoCaja")) {
				jButtonNuevoLineaFlujoCajaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarLineaFlujoCaja")) {
				jButtonModificarLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarLineaFlujoCaja")) {
				jButtonModificarLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarLineaFlujoCaja")) {
				jButtonModificarLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarLineaFlujoCaja")) {
				jButtonActualizarLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarLineaFlujoCaja")) {
				jButtonActualizarLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarLineaFlujoCaja")) {
				jButtonActualizarLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("EliminarLineaFlujoCaja")) {
				jButtonEliminarLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarLineaFlujoCaja")) {
				jButtonEliminarLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarLineaFlujoCaja")) {
				jButtonEliminarLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CancelarLineaFlujoCaja")) {
				jButtonCancelarLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarLineaFlujoCaja")) {
				jButtonCancelarLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarLineaFlujoCaja")) {
				jButtonCancelarLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CerrarLineaFlujoCaja")) {
				jButtonCerrarLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarLineaFlujoCaja")) {
				jButtonCerrarLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarLineaFlujoCaja")) {
				jButtonCerrarLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarLineaFlujoCaja")) {
				jButtonMostrarOcultarLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarLineaFlujoCaja")) {
				jButtonCancelarLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosLineaFlujoCaja")) {
				jButtonGuardarCambiosLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarLineaFlujoCaja")) {
				jButtonGuardarCambiosLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarLineaFlujoCaja")) {
				jButtonCopiarLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarLineaFlujoCaja")) {
				jButtonVerFormLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosLineaFlujoCaja")) {
				jButtonGuardarCambiosLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarLineaFlujoCaja")) {
				jButtonCopiarLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormLineaFlujoCaja")) {
				jButtonVerFormLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaLineaFlujoCaja")) {
				jButtonGuardarCambiosLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarLineaFlujoCaja")) {
				jButtonGuardarCambiosLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaLineaFlujoCaja")) {
				jButtonGuardarCambiosLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionLineaFlujoCaja")) {
				jButtonRecargarInformacionLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarLineaFlujoCaja")) {
				jButtonRecargarInformacionLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionLineaFlujoCaja")) {
				jButtonRecargarInformacionLineaFlujoCajaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresLineaFlujoCaja")) {
				jButtonAnterioresLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarLineaFlujoCaja")) {
				jButtonAnterioresLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreLineaFlujoCaja")) {
				jButtonAnterioresLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesLineaFlujoCaja")) {
				jButtonSiguientesLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarLineaFlujoCaja")) {
				jButtonSiguientesLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesLineaFlujoCaja")) {
				jButtonSiguientesLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByLineaFlujoCaja") || sTipo.equals("MenuItemDetalleAbrirOrderByLineaFlujoCaja")) {
				jButtonAbrirOrderByLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarLineaFlujoCaja") || sTipo.equals("MenuItemDetalleMostrarOcultarLineaFlujoCaja")) {
				jButtonMostrarOcultarLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosLineaFlujoCaja")) {
				jButtonNuevoGuardarCambiosLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarLineaFlujoCaja")) {
				jButtonNuevoGuardarCambiosLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosLineaFlujoCaja")) {
				jButtonNuevoGuardarCambiosLineaFlujoCajaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoLineaFlujoCaja")) {
				jButtonCerrarReporteDinamicoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoLineaFlujoCaja")) {
				jButtonGenerarReporteDinamicoLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoLineaFlujoCaja")) {
				
				jButtonGenerarExcelReporteDinamicoLineaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionLineaFlujoCaja")) {
				jButtonCerrarImportacionLineaFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionLineaFlujoCaja")) {
				
				jButtonGenerarImportacionLineaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionLineaFlujoCaja")) {
				
				jButtonAbrirImportacionLineaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesLineaFlujoCaja")) {
				jComboBoxTiposAccionesLineaFlujoCajaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesLineaFlujoCaja")) {
				jComboBoxTiposRelacionesLineaFlujoCajaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioLineaFlujoCaja")) {
				jComboBoxTiposAccionesLineaFlujoCajaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarLineaFlujoCaja")) {
				
				jComboBoxTiposSeleccionarLineaFlujoCajaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralLineaFlujoCaja")) {
				jTextFieldValorCampoGeneralLineaFlujoCajaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByLineaFlujoCaja")) {
				jButtonAbrirOrderByLineaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarLineaFlujoCaja")) {
				jButtonAbrirOrderByLineaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByLineaFlujoCaja")) {
				jButtonCerrarOrderByLineaFlujoCajaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idLineaFlujoCajaBusqueda")) {
				this.jButtonidLineaFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaLineaFlujoCajaUpdate")) {
				this.jButtonid_empresaLineaFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaLineaFlujoCajaBusqueda")) {
				this.jButtonid_empresaLineaFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_grupo_flujo_cajaLineaFlujoCajaUpdate")) {
				this.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_grupo_flujo_cajaLineaFlujoCajaBusqueda")) {
				this.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoLineaFlujoCajaBusqueda")) {
				this.jButtoncodigoLineaFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreLineaFlujoCajaBusqueda")) {
				this.jButtonnombreLineaFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_linea_flujo_cajaLineaFlujoCajaUpdate")) {
				this.jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_linea_flujo_cajaLineaFlujoCajaBusqueda")) {
				this.jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_consolidadoLineaFlujoCajaBusqueda")) {
				this.jButtones_consolidadoLineaFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_proyeccionLineaFlujoCajaBusqueda")) {
				this.jButtonesta_proyeccionLineaFlujoCajaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoLineaFlujoCaja")) {
				this.jButtonBusquedaPorCodigoLineaFlujoCajaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreLineaFlujoCaja")) {
				this.jButtonBusquedaPorNombreLineaFlujoCajaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoGrupoFlujoCajaLineaFlujoCaja")) {
				this.jButtonFK_IdTipoGrupoFlujoCajaLineaFlujoCajaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoLineaFlujoCajaLineaFlujoCaja")) {
				this.jButtonFK_IdTipoLineaFlujoCajaLineaFlujoCajaActionPerformed(evt);
			}
			
			;
			
			
			LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessLineaFlujoCaja();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLineaFlujoCajaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineaflujocaja);
				
				LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
				
				


				
				LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			LineaFlujoCaja lineaflujocajaLocal=null;
			
			if(!this.getEsControlTabla()) {
				lineaflujocajaLocal=this.lineaflujocaja;
			} else {
				lineaflujocajaLocal=this.lineaflujocajaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineaflujocaja);
				
				LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
							
				
				


				
				LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLineaFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaAnterior =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lineaflujocajaAnterior =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
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
			
			LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
			
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
			
			


			
			LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLineaFlujoCajaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineaflujocaja);
				
				LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
								
						
				


				
				LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaFlujoCaja.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineaflujocaja);
				
				LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
								
				
				


				
				LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLineaFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaAnterior =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lineaflujocajaAnterior =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineaflujocaja);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLineaFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaAnterior =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lineaflujocajaAnterior =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaFlujoCajaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.lineaflujocaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.lineaflujocaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineaflujocaja);
				
				LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
							
				
				


				
				LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaFlujoCaja.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLineaFlujoCajaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosLineaFlujoCaja.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lineaflujocajaAnterior =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.lineaflujocajaAnterior =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
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
			
			LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
			
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
			
			


			
			LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaFlujoCajaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.lineaflujocaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.lineaflujocaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineaflujocaja);
				
				LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
								
				
				


				
				LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLineaFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaAnterior =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lineaflujocajaAnterior =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaFlujoCajaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.lineaflujocaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.lineaflujocaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLineaFlujoCajaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineaflujocaja);
				
				LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosLineaFlujoCaja")) {
					jCheckBoxSeleccionarTodosLineaFlujoCajaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosLineaFlujoCaja")) {
					jCheckBoxSeleccionadosLineaFlujoCajaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarLineaFlujoCaja")) {
					
				}
				
				


				
				
				LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.lineaflujocaja);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.lineaflujocaja);
				
				LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
												
				
				


				
				
				LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLineaFlujoCajaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosLineaFlujoCaja.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.lineaflujocajaAnterior =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.lineaflujocajaAnterior =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLineaFlujoCajaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineaflujocaja);
				
				LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
				
				
				LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
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
			
			LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
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
			
			


			
			LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaLineaFlujoCajaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineaflujocaja);
				
				LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaFlujoCaja.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaFlujoCaja.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.lineaflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.lineaflujocaja);
				
				LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
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
				
				


				
				LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(LineaFlujoCaja.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",LineaFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaLineaFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosLineaFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.lineaflujocajaAnterior =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.lineaflujocajaAnterior =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarLineaFlujoCaja")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosLineaFlujoCajaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosLineaFlujoCaja.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.lineaflujocaja =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.lineaflujocaja);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarLineaFlujoCaja")) {
				
				}
				
				LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarLineaFlujoCaja")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosLineaFlujoCaja.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarLineaFlujoCaja")) {
			
			}
			
			LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessLineaFlujoCaja();
			
			LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
			
			if(sTipo.equals("NuevoLineaFlujoCaja")) {
				jButtonNuevoLineaFlujoCajaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarLineaFlujoCaja")) {
				jButtonDuplicarLineaFlujoCajaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarLineaFlujoCaja")) {
				jButtonCopiarLineaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormLineaFlujoCaja")) {
				jButtonVerFormLineaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesLineaFlujoCaja")) {
				jButtonNuevoLineaFlujoCajaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarLineaFlujoCaja")) {
				jButtonModificarLineaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarLineaFlujoCaja")) {
				jButtonActualizarLineaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarLineaFlujoCaja")) {
				jButtonEliminarLineaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaLineaFlujoCaja")) {
				jButtonGuardarCambiosLineaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarLineaFlujoCaja")) {
				jButtonCancelarLineaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarLineaFlujoCaja")) {
				jButtonCerrarLineaFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosLineaFlujoCaja")) {
				jButtonGuardarCambiosLineaFlujoCajaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosLineaFlujoCaja")) {
				jButtonNuevoGuardarCambiosLineaFlujoCajaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByLineaFlujoCaja")) {
				jButtonAbrirOrderByLineaFlujoCajaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionLineaFlujoCaja")) {
				jButtonRecargarInformacionLineaFlujoCajaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresLineaFlujoCaja")) {
				jButtonAnterioresLineaFlujoCajaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesLineaFlujoCaja")) {
				jButtonSiguientesLineaFlujoCajaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idLineaFlujoCajaBusqueda")) {
				this.jButtonidLineaFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaLineaFlujoCajaUpdate")) {
				this.jButtonid_empresaLineaFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaLineaFlujoCajaBusqueda")) {
				this.jButtonid_empresaLineaFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_grupo_flujo_cajaLineaFlujoCajaUpdate")) {
				this.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_grupo_flujo_cajaLineaFlujoCajaBusqueda")) {
				this.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoLineaFlujoCajaBusqueda")) {
				this.jButtoncodigoLineaFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreLineaFlujoCajaBusqueda")) {
				this.jButtonnombreLineaFlujoCajaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_linea_flujo_cajaLineaFlujoCajaUpdate")) {
				this.jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_linea_flujo_cajaLineaFlujoCajaBusqueda")) {
				this.jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_consolidadoLineaFlujoCajaBusqueda")) {
				this.jButtones_consolidadoLineaFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_proyeccionLineaFlujoCajaBusqueda")) {
				this.jButtonesta_proyeccionLineaFlujoCajaBusquedaActionPerformed(evt);
			}
			
			LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessLineaFlujoCaja();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameLineaFlujoCaja")) {
				closingInternalFrameLineaFlujoCaja();
				
			} else if(sTipo.equals("jButtonCancelarLineaFlujoCaja")) {
				JInternalFrameBase jInternalFrameDetalleFormLineaFlujoCaja = (JInternalFrameBase)evt.getSource();
	            	
	            LineaFlujoCajaBeanSwingJInternalFrame jInternalFrameParent=(LineaFlujoCajaBeanSwingJInternalFrame)jInternalFrameDetalleFormLineaFlujoCaja.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarLineaFlujoCajaActionPerformed(null);
			}
			
			LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.lineaflujocaja,new Object(),this.lineaflujocajaParameterGeneral,this.lineaflujocajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormLineaFlujoCaja(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormLineaFlujoCaja(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormLineaFlujoCaja(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.lineaflujocaja)) {
			if(!esControlTabla) {
				if(LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualLineaFlujoCaja(this.lineaflujocaja,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaFlujoCaja(this.lineaflujocaja);			
				}
				
				if(this.lineaflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualLineaFlujoCaja(this.lineaflujocaja,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.lineaflujocajaReturnGeneral=lineaflujocajaLogic.procesarEventosLineaFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.lineaflujocajaLogic.getLineaFlujoCajas(),this.lineaflujocaja,this.lineaflujocajaParameterGeneral,this.isEsNuevoLineaFlujoCaja,classes);//this.lineaflujocajaLogic.getLineaFlujoCaja()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanLineaFlujoCaja(this.lineaflujocajaReturnGeneral,this.lineaflujocajaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.lineaflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanLineaFlujoCaja(classes,this.lineaflujocajaReturnGeneral,this.lineaflujocajaBean,false);
					}
						
					if(this.lineaflujocajaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyLineaFlujoCaja(this.lineaflujocajaReturnGeneral.getLineaFlujoCaja());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioLineaFlujoCaja(this.lineaflujocajaReturnGeneral.getLineaFlujoCaja());	
					}
						
					if(this.lineaflujocajaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioLineaFlujoCaja(this.lineaflujocajaReturnGeneral.getLineaFlujoCaja(),classes);//this.lineaflujocajaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioLineaFlujoCaja(this.lineaflujocaja,classes);//this.lineaflujocajaBean);									
				}
			
				if(LineaFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualLineaFlujoCaja(this.lineaflujocaja,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysLineaFlujoCaja(this.lineaflujocaja);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.lineaflujocajaAnterior!=null) {
						this.lineaflujocaja=this.lineaflujocajaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.lineaflujocajaReturnGeneral=lineaflujocajaLogic.procesarEventosLineaFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.lineaflujocajaLogic.getLineaFlujoCajas(),this.lineaflujocaja,this.lineaflujocajaParameterGeneral,this.isEsNuevoLineaFlujoCaja,classes);//this.lineaflujocajaLogic.getLineaFlujoCaja()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.lineaflujocajaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.lineaflujocajaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.lineaflujocajaReturnGeneral.getLineaFlujoCaja(),lineaflujocajaLogic.getLineaFlujoCajas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.lineaflujocajaReturnGeneral.getLineaFlujoCaja(),this.lineaflujocajas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosLineaFlujoCaja.repaint();
				
				//((AbstractTableModel) this.jTableDatosLineaFlujoCaja.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosLineaFlujoCaja();
			}
		}
	}
	
	public void actualizarVisualTableDatosLineaFlujoCaja() throws Exception {
		
		LineaFlujoCajaModel lineaflujocajaModel=(LineaFlujoCajaModel)this.jTableDatosLineaFlujoCaja.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			lineaflujocajaModel.lineaflujocajas=this.lineaflujocajaLogic.getLineaFlujoCajas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			lineaflujocajaModel.lineaflujocajas=this.lineaflujocajas;
		}
		
		
		((LineaFlujoCajaModel) this.jTableDatosLineaFlujoCaja.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaLineaFlujoCaja() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getlineaflujocajaAnterior(),this.lineaflujocajaLogic.getLineaFlujoCajas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getlineaflujocajaAnterior(),this.lineaflujocajas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosLineaFlujoCaja();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioLineaFlujoCaja(LineaFlujoCaja lineaflujocaja,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
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
										
				LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.lineaflujocaja,new Object(),generalEntityParameterGeneral,this.lineaflujocajaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.lineaflujocajaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=LineaFlujoCajaConstantesFunciones.getClassesRelationshipsOfLineaFlujoCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=LineaFlujoCajaConstantesFunciones.getClassesRelationshipsFromStringsOfLineaFlujoCaja(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormLineaFlujoCaja(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				LineaFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.lineaflujocaja,new Object(),generalEntityParameterGeneral,this.lineaflujocajaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioLineaFlujoCaja(LineaFlujoCajaBean lineaflujocajaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanLineaFlujoCaja(ArrayList<Classe> classes,LineaFlujoCajaReturnGeneral lineaflujocajaReturnGeneral,LineaFlujoCajaBean lineaflujocajaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualLineaFlujoCaja(LineaFlujoCaja lineaflujocaja,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.lineaflujocaja)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormLineaFlujoCaja = new LineaFlujoCajaDetalleFormJInternalFrame(jDesktopPane,this.lineaflujocajaSessionBean.getConGuardarRelaciones(),this.lineaflujocajaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormLineaFlujoCaja);
		this.jInternalFrameDetalleFormLineaFlujoCaja.setVisible(false);
		this.jInternalFrameDetalleFormLineaFlujoCaja.setSelected(false);						
		
		this.jInternalFrameDetalleFormLineaFlujoCaja.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormLineaFlujoCaja.lineaflujocajaLogic=this.lineaflujocajaLogic;
		
		this.cargarCombosFrameForeignKeyLineaFlujoCaja("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleLineaFlujoCaja();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleLineaFlujoCaja();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyLineaFlujoCaja("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyLineaFlujoCaja();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormLineaFlujoCaja.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarLineaFlujoCaja"));
		
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonModificarLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"ModificarLineaFlujoCaja"));

		
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonModificarToolBarLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"ModificarToolBarLineaFlujoCaja"));
					
		this.jInternalFrameDetalleFormLineaFlujoCaja.jMenuItemModificarLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"MenuItemModificarLineaFlujoCaja"));		
		
		
		
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonActualizarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"ActualizarLineaFlujoCaja"));
		
		
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonActualizarToolBarLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"ActualizarToolBarLineaFlujoCaja"));
						
		this.jInternalFrameDetalleFormLineaFlujoCaja.jMenuItemActualizarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemActualizarLineaFlujoCaja"));		
		
		
		
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonEliminarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"EliminarLineaFlujoCaja"));
		
		
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonEliminarToolBarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"EliminarToolBarLineaFlujoCaja"));
								
		this.jInternalFrameDetalleFormLineaFlujoCaja.jMenuItemEliminarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemEliminarLineaFlujoCaja"));		
		
		
		
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonCancelarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"CancelarLineaFlujoCaja"));
		
		
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonCancelarToolBarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"CancelarToolBarLineaFlujoCaja"));
					
		this.jInternalFrameDetalleFormLineaFlujoCaja.jMenuItemCancelarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemCancelarLineaFlujoCaja"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormLineaFlujoCaja.jMenuItemDetalleCerrarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarLineaFlujoCaja"));		
		
		
		
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonGuardarCambiosToolBarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarLineaFlujoCaja"));
		
		
		
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonGuardarCambiosToolBarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarLineaFlujoCaja"));
		
		
		
		this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxTiposAccionesFormularioLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioLineaFlujoCaja"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonidLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"idLineaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonid_empresaLineaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaLineaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonid_empresaLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaLineaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_grupo_flujo_cajaLineaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_grupo_flujo_cajaLineaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtoncodigoLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"codigoLineaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonnombreLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombreLineaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_linea_flujo_cajaLineaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_linea_flujo_cajaLineaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtones_consolidadoLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"es_consolidadoLineaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonesta_proyeccionLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"esta_proyeccionLineaFlujoCajaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormLineaFlujoCaja.jTabbedPaneRelacionesLineaFlujoCaja.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesLineaFlujoCaja"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameLineaFlujoCaja"));
		
		if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaFlujoCaja.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarLineaFlujoCaja"));
		}
		
		this.jTableDatosLineaFlujoCaja.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarLineaFlujoCaja"));
		
		this.jTableDatosLineaFlujoCaja.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarLineaFlujoCaja"));
		
		this.jButtonNuevoLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"NuevoLineaFlujoCaja"));
		
		this.jButtonDuplicarLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"DuplicarLineaFlujoCaja"));
		
		this.jButtonCopiarLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"CopiarLineaFlujoCaja"));
		
		this.jButtonVerFormLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"VerFormLineaFlujoCaja"));
		
		
		this.jButtonNuevoToolBarLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"NuevoToolBarLineaFlujoCaja"));
			
		this.jButtonDuplicarToolBarLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"DuplicarToolBarLineaFlujoCaja"));
			
		this.jMenuItemNuevoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemNuevoLineaFlujoCaja"));
			
		this.jMenuItemDuplicarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarLineaFlujoCaja"));		
		
		
		this.jButtonNuevoRelacionesLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"NuevoRelacionesLineaFlujoCaja"));
		
		
		this.jButtonNuevoRelacionesToolBarLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarLineaFlujoCaja"));
			
		this.jMenuItemNuevoRelacionesLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesLineaFlujoCaja"));		
		
		
		if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonModificarLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"ModificarLineaFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonModificarToolBarLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"ModificarToolBarLineaFlujoCaja"));
			
			this.jInternalFrameDetalleFormLineaFlujoCaja.jMenuItemModificarLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"MenuItemModificarLineaFlujoCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonActualizarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"ActualizarLineaFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonActualizarToolBarLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"ActualizarToolBarLineaFlujoCaja"));
				
			this.jInternalFrameDetalleFormLineaFlujoCaja.jMenuItemActualizarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemActualizarLineaFlujoCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonEliminarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"EliminarLineaFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonEliminarToolBarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"EliminarToolBarLineaFlujoCaja"));
						
			this.jInternalFrameDetalleFormLineaFlujoCaja.jMenuItemEliminarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemEliminarLineaFlujoCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonCancelarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"CancelarLineaFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonCancelarToolBarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"CancelarToolBarLineaFlujoCaja"));
			
			this.jInternalFrameDetalleFormLineaFlujoCaja.jMenuItemCancelarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemCancelarLineaFlujoCaja"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarLineaFlujoCaja"));		
		
		
		this.jButtonCerrarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"CerrarLineaFlujoCaja"));
		
		
		this.jButtonCerrarToolBarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"CerrarToolBarLineaFlujoCaja"));
			
		this.jMenuItemCerrarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemCerrarLineaFlujoCaja"));
			
		if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaFlujoCaja.jMenuItemDetalleCerrarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarLineaFlujoCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonGuardarCambiosLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosLineaFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonGuardarCambiosToolBarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarLineaFlujoCaja"));
		}
		
		this.jButtonCopiarToolBarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"CopiarToolBarLineaFlujoCaja"));
			
		this.jButtonVerFormToolBarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"VerFormToolBarLineaFlujoCaja"));
		
		this.jMenuItemGuardarCambiosLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosLineaFlujoCaja"));
			
		this.jMenuItemCopiarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemCopiarLineaFlujoCaja"));		
		
		this.jMenuItemVerFormLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemVerFormLineaFlujoCaja"));		
		
		
		this.jButtonGuardarCambiosTablaLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaLineaFlujoCaja"));
		
		
		this.jButtonGuardarCambiosTablaToolBarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarLineaFlujoCaja"));
			
		this.jMenuItemGuardarCambiosTablaLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaLineaFlujoCaja"));		
		
		
		
		this.jButtonRecargarInformacionLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"RecargarInformacionLineaFlujoCaja"));
					
		this.jButtonRecargarInformacionToolBarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarLineaFlujoCaja"));
		
		this.jMenuItemRecargarInformacionLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionLineaFlujoCaja"));		
		
		
		
		this.jButtonAnterioresLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"AnterioresLineaFlujoCaja"));
		
		
		this.jButtonAnterioresToolBarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"AnterioresToolBarLineaFlujoCaja"));
		
		this.jMenuItemAnterioresLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresLineaFlujoCaja"));		
		
		
		this.jButtonSiguientesLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"SiguientesLineaFlujoCaja"));
		
		
		this.jButtonSiguientesToolBarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"SiguientesToolBarLineaFlujoCaja"));
			
		this.jMenuItemSiguientesLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesLineaFlujoCaja"));
			
		this.jMenuItemAbrirOrderByLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByLineaFlujoCaja"));
			
		this.jMenuItemMostrarOcultarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarLineaFlujoCaja"));
			
		this.jMenuItemDetalleAbrirOrderByLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByLineaFlujoCaja"));
			
		this.jMenuItemDetalleMostarOcultarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarLineaFlujoCaja"));		
		
		
		this.jButtonNuevoGuardarCambiosLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosLineaFlujoCaja"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarLineaFlujoCaja"));
			
		this.jMenuItemNuevoGuardarCambiosLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosLineaFlujoCaja"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosLineaFlujoCaja.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosLineaFlujoCaja"));

		this.jCheckBoxSeleccionadosLineaFlujoCaja.addItemListener(new CheckBoxItemListener(this,"SeleccionadosLineaFlujoCaja"));
		
		if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxTiposAccionesFormularioLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioLineaFlujoCaja"));
		}
		
		
		this.jComboBoxTiposRelacionesLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposRelacionesLineaFlujoCaja"));
			
		this.jComboBoxTiposAccionesLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesLineaFlujoCaja"));
					
		this.jComboBoxTiposSeleccionarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposSeleccionarLineaFlujoCaja"));
			
		this.jTextFieldValorCampoGeneralLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralLineaFlujoCaja"));		
		
		
		if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonidLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"idLineaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonid_empresaLineaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaLineaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonid_empresaLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaLineaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_grupo_flujo_cajaLineaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_grupo_flujo_cajaLineaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtoncodigoLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"codigoLineaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonnombreLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombreLineaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_linea_flujo_cajaLineaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_linea_flujo_cajaLineaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtones_consolidadoLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"es_consolidadoLineaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonesta_proyeccionLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"esta_proyeccionLineaFlujoCajaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoLineaFlujoCaja"));

			this.jButtonBusquedaPorNombreLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreLineaFlujoCaja"));

			this.jButtonFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"FK_IdTipoGrupoFlujoCajaLineaFlujoCaja"));

			this.jButtonFK_IdTipoLineaFlujoCajaLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"FK_IdTipoLineaFlujoCajaLineaFlujoCaja"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoLineaFlujoCaja!=null) {
				this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoLineaFlujoCaja"));
				this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoLineaFlujoCaja"));
				this.jInternalFrameReporteDinamicoLineaFlujoCaja.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoLineaFlujoCaja"));
			}
			
			//this.jButtonCerrarReporteDinamicoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoLineaFlujoCaja"));				
			//this.jButtonGenerarReporteDinamicoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoLineaFlujoCaja"));
			//this.jButtonGenerarExcelReporteDinamicoLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoLineaFlujoCaja"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionLineaFlujoCaja!=null) {
				this.jInternalFrameImportacionLineaFlujoCaja.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionLineaFlujoCaja"));
				this.jInternalFrameImportacionLineaFlujoCaja.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionLineaFlujoCaja"));
				this.jInternalFrameImportacionLineaFlujoCaja.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionLineaFlujoCaja"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"AbrirOrderByLineaFlujoCaja"));
			
			this.jButtonAbrirOrderByToolBarLineaFlujoCaja.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarLineaFlujoCaja"));			
			
			if(this.jInternalFrameOrderByLineaFlujoCaja!=null) {
				this.jInternalFrameOrderByLineaFlujoCaja.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByLineaFlujoCaja"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormLineaFlujoCaja.jTabbedPaneRelacionesLineaFlujoCaja.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesLineaFlujoCaja"));
		
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
            		closingInternalFrameLineaFlujoCaja();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormLineaFlujoCaja.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormLineaFlujoCaja = (JInternalFrameBase)event.getSource();
	            	
	            LineaFlujoCajaBeanSwingJInternalFrame jInternalFrameParent=(LineaFlujoCajaBeanSwingJInternalFrame)jInternalFrameDetalleFormLineaFlujoCaja.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarLineaFlujoCajaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosLineaFlujoCaja.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosLineaFlujoCajaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosLineaFlujoCaja.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosLineaFlujoCaja.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLineaFlujoCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLineaFlujoCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLineaFlujoCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoLineaFlujoCaja";
		inputMap = this.jButtonNuevoLineaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoLineaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoLineaFlujoCajaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLineaFlujoCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLineaFlujoCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoLineaFlujoCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesLineaFlujoCaja";
		inputMap = this.jButtonNuevoRelacionesLineaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesLineaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoLineaFlujoCajaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarLineaFlujoCaja";
		inputMap = this.jButtonModificarLineaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarLineaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarLineaFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarLineaFlujoCaja";
		inputMap = this.jButtonActualizarLineaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarLineaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarLineaFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarLineaFlujoCaja";
		inputMap = this.jButtonEliminarLineaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarLineaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarLineaFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarLineaFlujoCaja";
		inputMap = this.jButtonCancelarLineaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarLineaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarLineaFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarLineaFlujoCaja";
		inputMap = this.jButtonCerrarLineaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarLineaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarLineaFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonGuardarCambiosLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosLineaFlujoCaja";
		inputMap = this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonGuardarCambiosLineaFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonGuardarCambiosLineaFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosLineaFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosLineaFlujoCaja.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosLineaFlujoCajaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesLineaFlujoCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesLineaFlujoCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarLineaFlujoCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarLineaFlujoCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralLineaFlujoCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralLineaFlujoCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonidLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"idLineaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonid_empresaLineaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaLineaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonid_empresaLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaLineaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_grupo_flujo_cajaLineaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonid_tipo_grupo_flujo_cajaLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_grupo_flujo_cajaLineaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtoncodigoLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"codigoLineaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonnombreLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombreLineaFlujoCajaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_linea_flujo_cajaLineaFlujoCajaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonid_tipo_linea_flujo_cajaLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_linea_flujo_cajaLineaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtones_consolidadoLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"es_consolidadoLineaFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormLineaFlujoCaja.jButtonesta_proyeccionLineaFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"esta_proyeccionLineaFlujoCajaBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoLineaFlujoCaja"));

		this.jButtonBusquedaPorNombreLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreLineaFlujoCaja"));

		this.jButtonFK_IdTipoGrupoFlujoCajaLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"FK_IdTipoGrupoFlujoCajaLineaFlujoCaja"));

		this.jButtonFK_IdTipoLineaFlujoCajaLineaFlujoCaja.addActionListener(new ButtonActionListener(this,"FK_IdTipoLineaFlujoCajaLineaFlujoCaja"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionLineaFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionLineaFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarLineaFlujoCajaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarLineaFlujoCaja.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosLineaFlujoCaja(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(LineaFlujoCaja lineaflujocajaAux:this.lineaflujocajaLogic.getLineaFlujoCajas()) {
					lineaflujocajaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(LineaFlujoCaja lineaflujocajaAux:lineaflujocajas) {
					lineaflujocajaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosLineaFlujoCajaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingLineaFlujoCaja(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(LineaFlujoCaja lineaflujocajaAux:this.lineaflujocajaLogic.getLineaFlujoCajas()) {
						lineaflujocajaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(LineaFlujoCaja lineaflujocajaAux:lineaflujocajas) {
						lineaflujocajaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(LineaFlujoCaja lineaflujocajaAux:this.lineaflujocajaLogic.getLineaFlujoCajas()) {
					
						if(sTipoSeleccionar.equals(LineaFlujoCajaConstantesFunciones.LABEL_ESCONSOLIDADO)) {
							existe=true;
							lineaflujocajaAux.setes_consolidado(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(LineaFlujoCajaConstantesFunciones.LABEL_ESTAPROYECCION)) {
							existe=true;
							lineaflujocajaAux.setesta_proyeccion(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(LineaFlujoCaja lineaflujocajaAux:lineaflujocajas) {
						
						if(sTipoSeleccionar.equals(LineaFlujoCajaConstantesFunciones.LABEL_ESCONSOLIDADO)) {
							existe=true;
							lineaflujocajaAux.setes_consolidado(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(LineaFlujoCajaConstantesFunciones.LABEL_ESTAPROYECCION)) {
							existe=true;
							lineaflujocajaAux.setesta_proyeccion(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaLineaFlujoCaja(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosLineaFlujoCaja.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosLineaFlujoCaja.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosLineaFlujoCaja,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosLineaFlujoCajaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingLineaFlujoCaja(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosLineaFlujoCaja.getSelectedRows();
			
			LineaFlujoCaja lineaflujocajaLocal=new LineaFlujoCaja();
			
			//this.seleccionarTodosLineaFlujoCaja(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					lineaflujocajaLocal =(LineaFlujoCaja) this.lineaflujocajaLogic.getLineaFlujoCajas().toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					lineaflujocajaLocal =(LineaFlujoCaja) this.lineaflujocajas.toArray()[this.jTableDatosLineaFlujoCaja.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				lineaflujocajaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(LineaFlujoCaja lineaflujocajaAux:this.lineaflujocajaLogic.getLineaFlujoCajas()) {
						lineaflujocajaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(LineaFlujoCaja lineaflujocajaAux:lineaflujocajas) {
						lineaflujocajaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaLineaFlujoCaja(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosLineaFlujoCaja.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosLineaFlujoCaja.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosLineaFlujoCaja,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualLineaFlujoCajaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarLineaFlujoCajaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralLineaFlujoCajaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingLineaFlujoCaja(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralLineaFlujoCaja.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(LineaFlujoCaja lineaflujocajaAux:this.lineaflujocajaLogic.getLineaFlujoCajas()) {
				
						if(sTipoSeleccionar.equals(LineaFlujoCajaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							lineaflujocajaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(LineaFlujoCajaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							lineaflujocajaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(LineaFlujoCaja lineaflujocajaAux:lineaflujocajas) {
					
						if(sTipoSeleccionar.equals(LineaFlujoCajaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							lineaflujocajaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(LineaFlujoCajaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							lineaflujocajaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaLineaFlujoCaja(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesLineaFlujoCajaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingLineaFlujoCaja(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioLineaFlujoCaja=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesLineaFlujoCaja.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxTiposAccionesFormularioLineaFlujoCaja.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteLineaFlujoCaja) {				
					conSplash=true;//false;										
					
					//this.startProcessLineaFlujoCaja(conSplash);
				
					this.generarReporteLineaFlujoCajasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLineaFlujoCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxTiposAccionesFormularioLineaFlujoCaja.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoLineaFlujoCajasSeleccionados();
				//this.jComboBoxTiposAccionesLineaFlujoCaja.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoLineaFlujoCajasSeleccionados(false);
				//this.jComboBoxTiposAccionesLineaFlujoCaja.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoLineaFlujoCajasSeleccionados(true);
				//this.jComboBoxTiposAccionesLineaFlujoCaja.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessLineaFlujoCaja();
				
				this.exportarLineaFlujoCajasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLineaFlujoCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxTiposAccionesFormularioLineaFlujoCaja.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionLineaFlujoCajas();
				//this.importarLineaFlujoCajas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLineaFlujoCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxTiposAccionesFormularioLineaFlujoCaja.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessLineaFlujoCaja();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelLineaFlujoCajasSeleccionados();
				//this.jComboBoxTiposAccionesLineaFlujoCaja.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Linea Flujo Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessLineaFlujoCaja();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoLineaFlujoCaja)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyLineaFlujoCaja(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Linea Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesLineaFlujoCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxTiposAccionesFormularioLineaFlujoCaja.setSelectedIndex(0);					
				}	
			} 			
			else if(LineaFlujoCajaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteLineaFlujoCaja) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessLineaFlujoCaja(conSplash);
					
						//this.actualizarParametrosGeneralLineaFlujoCaja();
						
						this.generarReporteProcesoAccionLineaFlujoCajasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesLineaFlujoCaja.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxTiposAccionesFormularioLineaFlujoCaja.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(LineaFlujoCajaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Linea Flujo CajaS SELECCIONADOS?", "MANTENIMIENTO DE Linea Flujo Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessLineaFlujoCaja();
				
						this.actualizarParametrosGeneralLineaFlujoCaja();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.lineaflujocajaReturnGeneral=lineaflujocajaLogic.procesarAccionLineaFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.lineaflujocajaLogic.getLineaFlujoCajas(),this.lineaflujocajaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarLineaFlujoCajaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesLineaFlujoCaja.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxTiposAccionesFormularioLineaFlujoCaja.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralLineaFlujoCaja();
					
					LineaFlujoCajaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarLineaFlujoCajaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesLineaFlujoCaja.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxTiposAccionesFormularioLineaFlujoCaja.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessLineaFlujoCaja(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesLineaFlujoCajaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessLineaFlujoCaja();
			
			if(this.jInternalFrameDetalleFormLineaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<LineaFlujoCaja> lineaflujocajasSeleccionados=new ArrayList<LineaFlujoCaja>();		
			LineaFlujoCaja lineaflujocaja=new LineaFlujoCaja();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingLineaFlujoCaja(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesLineaFlujoCaja.getSelectedItem();
			
			
			
			
			lineaflujocajasSeleccionados=this.getLineaFlujoCajasSeleccionados(true);
			//this.sTipoAccion;
			
			if(lineaflujocajasSeleccionados.size()==1) {
				for(LineaFlujoCaja lineaflujocajaAux:lineaflujocajasSeleccionados) {
					lineaflujocaja=lineaflujocajaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessLineaFlujoCaja();
			
      		//this.finishProcessLineaFlujoCaja(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarLineaFlujoCajaReturnGeneral() throws Exception {
		if(this.lineaflujocajaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.lineaflujocajaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.lineaflujocajaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.lineaflujocajaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.lineaflujocajaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.lineaflujocajaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingLineaFlujoCaja(false);
		}
		
		if(this.lineaflujocajaReturnGeneral.getConRetornoLista() || this.lineaflujocajaReturnGeneral.getConRetornoObjeto()) {
			if(this.lineaflujocajaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.lineaflujocajaLogic.setLineaFlujoCajas(this.lineaflujocajaReturnGeneral.getLineaFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.lineaflujocajaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.lineaflujocajaLogic.setLineaFlujoCaja(this.lineaflujocajaReturnGeneral.getLineaFlujoCaja());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingLineaFlujoCaja(false);
		}
	}
	
	public void actualizarParametrosGeneralLineaFlujoCaja() throws Exception {
		
		
	}
	
	public ArrayList<LineaFlujoCaja> getLineaFlujoCajasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<LineaFlujoCaja> lineaflujocajasSeleccionados=new ArrayList<LineaFlujoCaja>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioLineaFlujoCaja) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(LineaFlujoCaja lineaflujocajaAux:lineaflujocajaLogic.getLineaFlujoCajas()) {
					if(lineaflujocajaAux.getIsSelected()) {
						lineaflujocajasSeleccionados.add(lineaflujocajaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(LineaFlujoCaja lineaflujocajaAux:this.lineaflujocajas) {
					if(lineaflujocajaAux.getIsSelected()) {
						lineaflujocajasSeleccionados.add(lineaflujocajaAux);				
					}
				}
			}
			
			if(lineaflujocajasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						lineaflujocajasSeleccionados.addAll(this.lineaflujocajaLogic.getLineaFlujoCajas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						lineaflujocajasSeleccionados.addAll(this.lineaflujocajas);				
					}
				}
			}
		} else {
			lineaflujocajasSeleccionados.add(this.lineaflujocaja);
		}
		
		return lineaflujocajasSeleccionados;
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
	
	public void generarReporteLineaFlujoCajasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalLineaFlujoCajasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoLineaFlujoCajasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoLineaFlujoCajasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoLineaFlujoCajasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Linea Flujo Caja",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesLineaFlujoCajasSeleccionados() throws Exception {
		ArrayList<LineaFlujoCaja> lineaflujocajasSeleccionados=new ArrayList<LineaFlujoCaja>();		
		
		lineaflujocajasSeleccionados=this.getLineaFlujoCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteLineaFlujoCajas("Todos",lineaflujocajasSeleccionados);
		
	}	
	
	public void generarReporteNormalLineaFlujoCajasSeleccionados() throws Exception {
		ArrayList<LineaFlujoCaja> lineaflujocajasSeleccionados=new ArrayList<LineaFlujoCaja>();		
		
		lineaflujocajasSeleccionados=this.getLineaFlujoCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteLineaFlujoCajas("Todos",lineaflujocajasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionLineaFlujoCajasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<LineaFlujoCaja> lineaflujocajasSeleccionados=new ArrayList<LineaFlujoCaja>();
		
		lineaflujocajasSeleccionados=this.getLineaFlujoCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteLineaFlujoCajas("Todos",lineaflujocajasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoLineaFlujoCajasSeleccionados() throws Exception {
		ArrayList<LineaFlujoCaja> lineaflujocajasSeleccionados=new ArrayList<LineaFlujoCaja>();		
		
		
		this.abrirInicializarFrameReporteDinamicoLineaFlujoCaja();
		
		
		lineaflujocajasSeleccionados=this.getLineaFlujoCajasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoLineaFlujoCaja();
		
		
		//this.generarReporteLineaFlujoCajas("Todos",lineaflujocajasSeleccionados ,lineaflujocajaImplementable,lineaflujocajaImplementableHome);
	}
	
	public void mostrarImportacionLineaFlujoCajas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionLineaFlujoCaja();
		
		this.abrirFrameImportacionLineaFlujoCaja();		
		
			
		//this.generarReporteLineaFlujoCajas("Todos",lineaflujocajasSeleccionados ,lineaflujocajaImplementable,lineaflujocajaImplementableHome);
	}
	
	public void importarLineaFlujoCajas() throws Exception {		
	
	}
	
	public void exportarLineaFlujoCajasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelLineaFlujoCajasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoLineaFlujoCajasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlLineaFlujoCajasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Linea Flujo Caja",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoLineaFlujoCajasSeleccionados() throws Exception {
		ArrayList<LineaFlujoCaja> lineaflujocajasSeleccionados=new ArrayList<LineaFlujoCaja>();		
		
		lineaflujocajasSeleccionados=this.getLineaFlujoCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"lineaflujocaja."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarLineaFlujoCaja(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(LineaFlujoCaja lineaflujocajaAux:lineaflujocajasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarLineaFlujoCaja(lineaflujocajaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//lineaflujocajaAux.setsDetalleGeneralEntityReporte(lineaflujocajaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarLineaFlujoCaja(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=LineaFlujoCajaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LineaFlujoCajaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LineaFlujoCajaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LineaFlujoCajaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOLINEAFLUJOCAJA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LineaFlujoCajaConstantesFunciones.LABEL_ESCONSOLIDADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=LineaFlujoCajaConstantesFunciones.LABEL_ESTAPROYECCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarLineaFlujoCaja(LineaFlujoCaja lineaflujocaja,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=lineaflujocaja.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=lineaflujocaja.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=lineaflujocaja.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=lineaflujocaja.gettipogrupoflujocaja_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=lineaflujocaja.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=lineaflujocaja.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=lineaflujocaja.gettipolineaflujocaja_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=lineaflujocaja.getes_consolidado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=lineaflujocaja.getesta_proyeccion().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelLineaFlujoCajasSeleccionados() throws Exception {
		ArrayList<LineaFlujoCaja> lineaflujocajasSeleccionados=new ArrayList<LineaFlujoCaja>();		
		
		lineaflujocajasSeleccionados=this.getLineaFlujoCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"lineaflujocaja.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("LineaFlujoCajas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelLineaFlujoCaja(row);				
				iRow++;
			}				
			
			for(LineaFlujoCaja lineaflujocajaAux:lineaflujocajasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelLineaFlujoCaja(lineaflujocajaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlLineaFlujoCajasSeleccionados() throws Exception {
		ArrayList<LineaFlujoCaja> lineaflujocajasSeleccionados=new ArrayList<LineaFlujoCaja>();		
		
		lineaflujocajasSeleccionados=this.getLineaFlujoCajasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"lineaflujocaja.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("lineaflujocajas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("lineaflujocaja");
			//elementRoot.appendChild(element);
		
			for(LineaFlujoCaja lineaflujocajaAux:lineaflujocajasSeleccionados) {
				element = document.createElement("lineaflujocaja");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlLineaFlujoCaja(lineaflujocajaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Linea Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelLineaFlujoCaja(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(LineaFlujoCajaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(LineaFlujoCajaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(LineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA);
		cell = row.createCell(iColumn++);cell.setCellValue(LineaFlujoCajaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(LineaFlujoCajaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOLINEAFLUJOCAJA);
		cell = row.createCell(iColumn++);cell.setCellValue(LineaFlujoCajaConstantesFunciones.LABEL_ESCONSOLIDADO);
		cell = row.createCell(iColumn++);cell.setCellValue(LineaFlujoCajaConstantesFunciones.LABEL_ESTAPROYECCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelLineaFlujoCaja(LineaFlujoCaja lineaflujocaja,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(lineaflujocaja.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(lineaflujocaja.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(lineaflujocaja.gettipogrupoflujocaja_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(lineaflujocaja.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(lineaflujocaja.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(lineaflujocaja.gettipolineaflujocaja_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(lineaflujocaja.getes_consolidado());
		cell = row.createCell(iColumn++);cell.setCellValue(lineaflujocaja.getesta_proyeccion());				
	}
	
	public void setFilaDatosExportarXmlLineaFlujoCaja(LineaFlujoCaja lineaflujocaja,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(LineaFlujoCajaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(lineaflujocaja.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(LineaFlujoCajaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(lineaflujocaja.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(LineaFlujoCajaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(lineaflujocaja.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementtipogrupoflujocaja_descripcion = document.createElement(LineaFlujoCajaConstantesFunciones.IDTIPOGRUPOFLUJOCAJA);
		elementtipogrupoflujocaja_descripcion.appendChild(document.createTextNode(lineaflujocaja.gettipogrupoflujocaja_descripcion()));
		element.appendChild(elementtipogrupoflujocaja_descripcion);

		Element elementcodigo = document.createElement(LineaFlujoCajaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(lineaflujocaja.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(LineaFlujoCajaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(lineaflujocaja.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementtipolineaflujocaja_descripcion = document.createElement(LineaFlujoCajaConstantesFunciones.IDTIPOLINEAFLUJOCAJA);
		elementtipolineaflujocaja_descripcion.appendChild(document.createTextNode(lineaflujocaja.gettipolineaflujocaja_descripcion()));
		element.appendChild(elementtipolineaflujocaja_descripcion);

		Element elementes_consolidado = document.createElement(LineaFlujoCajaConstantesFunciones.ESCONSOLIDADO);
		elementes_consolidado.appendChild(document.createTextNode(lineaflujocaja.getes_consolidado().toString().trim()));
		element.appendChild(elementes_consolidado);

		Element elementesta_proyeccion = document.createElement(LineaFlujoCajaConstantesFunciones.ESTAPROYECCION);
		elementesta_proyeccion.appendChild(document.createTextNode(lineaflujocaja.getesta_proyeccion().toString().trim()));
		element.appendChild(elementesta_proyeccion);
	}
	
	public void generarReporteGroupGenericoLineaFlujoCajasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<LineaFlujoCaja> lineaflujocajasSeleccionados=new ArrayList<LineaFlujoCaja>();
		
		lineaflujocajasSeleccionados=this.getLineaFlujoCajasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoLineaFlujoCaja(lineaflujocajasSeleccionados);
		
		this.generarReporteLineaFlujoCajas("Todos",lineaflujocajasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoLineaFlujoCaja(ArrayList<LineaFlujoCaja> lineaflujocajasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(LineaFlujoCaja lineaflujocajaAux:lineaflujocajasSeleccionados) {
				lineaflujocajaAux.setsDetalleGeneralEntityReporte(lineaflujocajaAux.toString());
			
				if(sTipoSeleccionar.equals(LineaFlujoCajaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					lineaflujocajaAux.setsDescripcionGeneralEntityReporte1(lineaflujocajaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOGRUPOFLUJOCAJA)) {
					existe=true;
					lineaflujocajaAux.setsDescripcionGeneralEntityReporte1(lineaflujocajaAux.gettipogrupoflujocaja_descripcion());
				}
				 else if(sTipoSeleccionar.equals(LineaFlujoCajaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					lineaflujocajaAux.setsDescripcionGeneralEntityReporte1(lineaflujocajaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(LineaFlujoCajaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					lineaflujocajaAux.setsDescripcionGeneralEntityReporte1(lineaflujocajaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(LineaFlujoCajaConstantesFunciones.LABEL_IDTIPOLINEAFLUJOCAJA)) {
					existe=true;
					lineaflujocajaAux.setsDescripcionGeneralEntityReporte1(lineaflujocajaAux.gettipolineaflujocaja_descripcion());
				}
				 else if(sTipoSeleccionar.equals(LineaFlujoCajaConstantesFunciones.LABEL_ESCONSOLIDADO)) {
					existe=true;
					lineaflujocajaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(lineaflujocajaAux.getes_consolidado()));
				}
				 else if(sTipoSeleccionar.equals(LineaFlujoCajaConstantesFunciones.LABEL_ESTAPROYECCION)) {
					existe=true;
					lineaflujocajaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(lineaflujocajaAux.getesta_proyeccion()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,LineaFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesLineaFlujoCaja(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoLineaFlujoCaja=true;
				this.isVisibilidadCeldaNuevoRelacionesLineaFlujoCaja=true;
				this.isVisibilidadCeldaGuardarCambiosLineaFlujoCaja=true;
			}
			
			this.isVisibilidadCeldaModificarLineaFlujoCaja=false;
			this.isVisibilidadCeldaActualizarLineaFlujoCaja=false;
			this.isVisibilidadCeldaEliminarLineaFlujoCaja=false;
			this.isVisibilidadCeldaCancelarLineaFlujoCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLineaFlujoCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarLineaFlujoCaja=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoLineaFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesLineaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosLineaFlujoCaja=false;
			this.isVisibilidadCeldaModificarLineaFlujoCaja=false;
			this.isVisibilidadCeldaActualizarLineaFlujoCaja=true;
			this.isVisibilidadCeldaEliminarLineaFlujoCaja=false;
			this.isVisibilidadCeldaCancelarLineaFlujoCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLineaFlujoCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarLineaFlujoCaja=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoLineaFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesLineaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosLineaFlujoCaja=false;
			this.isVisibilidadCeldaModificarLineaFlujoCaja=false;
			this.isVisibilidadCeldaActualizarLineaFlujoCaja=true;
			this.isVisibilidadCeldaEliminarLineaFlujoCaja=true;
			this.isVisibilidadCeldaCancelarLineaFlujoCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLineaFlujoCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarLineaFlujoCaja=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoLineaFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesLineaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosLineaFlujoCaja=false;
			this.isVisibilidadCeldaModificarLineaFlujoCaja=false;
			this.isVisibilidadCeldaActualizarLineaFlujoCaja=true;
			this.isVisibilidadCeldaEliminarLineaFlujoCaja=false;
			this.isVisibilidadCeldaCancelarLineaFlujoCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLineaFlujoCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarLineaFlujoCaja=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoLineaFlujoCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesLineaFlujoCaja=true;
			this.isVisibilidadCeldaGuardarCambiosLineaFlujoCaja=true;
			this.isVisibilidadCeldaModificarLineaFlujoCaja=false;
			this.isVisibilidadCeldaActualizarLineaFlujoCaja=false;
			this.isVisibilidadCeldaEliminarLineaFlujoCaja=false;
			this.isVisibilidadCeldaCancelarLineaFlujoCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLineaFlujoCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarLineaFlujoCaja=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoLineaFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesLineaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosLineaFlujoCaja=false;
			this.isVisibilidadCeldaActualizarLineaFlujoCaja=false;
			this.isVisibilidadCeldaEliminarLineaFlujoCaja=false;
			this.isVisibilidadCeldaCancelarLineaFlujoCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLineaFlujoCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarLineaFlujoCaja=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoLineaFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesLineaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosLineaFlujoCaja=false;
			this.isVisibilidadCeldaModificarLineaFlujoCaja=true;
			this.isVisibilidadCeldaActualizarLineaFlujoCaja=false;
			this.isVisibilidadCeldaEliminarLineaFlujoCaja=false;
			this.isVisibilidadCeldaCancelarLineaFlujoCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarLineaFlujoCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarLineaFlujoCaja=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(LineaFlujoCajaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoLineaFlujoCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesLineaFlujoCaja=true;
			this.isVisibilidadCeldaGuardarCambiosLineaFlujoCaja=true;
		} else {
			this.actualizarEstadoPanelsLineaFlujoCaja(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarLineaFlujoCaja=false;
			//this.isVisibilidadCeldaVerFormLineaFlujoCaja=false;
			this.isVisibilidadCeldaDuplicarLineaFlujoCaja=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!lineaflujocajaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesLineaFlujoCaja=false;
		} else {
			this.isVisibilidadCeldaNuevoLineaFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosLineaFlujoCaja=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
			if(!lineaflujocajaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesLineaFlujoCaja=false;												
			}
			
			this.jButtonCerrarLineaFlujoCaja.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesLineaFlujoCaja=false;
		}
		
		if(!this.permiteMantenimiento(this.lineaflujocaja)) {
			this.isVisibilidadCeldaActualizarLineaFlujoCaja=false;
			this.isVisibilidadCeldaEliminarLineaFlujoCaja=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesLineaFlujoCaja() {
	}
	
	public void actualizarEstadoPanelsLineaFlujoCaja(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionLineaFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionLineaFlujoCaja.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLineaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasLineaFlujoCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLineaFlujoCaja!=null) {
				this.jScrollPanelDatosLineaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionLineaFlujoCaja!=null) {
				this.jPanelPaginacionLineaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLineaFlujoCaja!=null) {
				this.jPanelParametrosReportesLineaFlujoCaja.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionLineaFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionLineaFlujoCaja.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLineaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasLineaFlujoCaja.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosLineaFlujoCaja!=null) {
				this.jScrollPanelDatosLineaFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionLineaFlujoCaja!=null) {
				this.jPanelPaginacionLineaFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesLineaFlujoCaja!=null) {
				this.jPanelParametrosReportesLineaFlujoCaja.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionLineaFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionLineaFlujoCaja.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLineaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasLineaFlujoCaja.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosLineaFlujoCaja!=null) {
				this.jScrollPanelDatosLineaFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionLineaFlujoCaja!=null) {
				this.jPanelPaginacionLineaFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesLineaFlujoCaja!=null) {
				this.jPanelParametrosReportesLineaFlujoCaja.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionLineaFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionLineaFlujoCaja.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLineaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasLineaFlujoCaja.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosLineaFlujoCaja!=null) {
				this.jScrollPanelDatosLineaFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionLineaFlujoCaja!=null) {
				this.jPanelPaginacionLineaFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesLineaFlujoCaja!=null) {
				this.jPanelParametrosReportesLineaFlujoCaja.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionLineaFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionLineaFlujoCaja.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLineaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasLineaFlujoCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLineaFlujoCaja!=null) {
				this.jScrollPanelDatosLineaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionLineaFlujoCaja!=null) {
				this.jPanelPaginacionLineaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLineaFlujoCaja!=null) {
				this.jPanelParametrosReportesLineaFlujoCaja.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionLineaFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionLineaFlujoCaja.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLineaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasLineaFlujoCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLineaFlujoCaja!=null) {
				this.jScrollPanelDatosLineaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionLineaFlujoCaja!=null) {
				this.jPanelPaginacionLineaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLineaFlujoCaja!=null) {
				this.jPanelParametrosReportesLineaFlujoCaja.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionLineaFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionLineaFlujoCaja.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLineaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasLineaFlujoCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosLineaFlujoCaja!=null) {
				this.jScrollPanelDatosLineaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionLineaFlujoCaja!=null) {
				this.jPanelPaginacionLineaFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesLineaFlujoCaja!=null) {
				this.jPanelParametrosReportesLineaFlujoCaja.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasLineaFlujoCaja!=null) {
					this.jTabbedPaneBusquedasLineaFlujoCaja.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesLineaFlujoCaja!=null) {
				this.jPanelParametrosReportesLineaFlujoCaja.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.lineaflujocajaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasLineaFlujoCaja!=null) {
				this.jTabbedPaneBusquedasLineaFlujoCaja.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesLineaFlujoCaja!=null) {
				this.jPanelParametrosReportesLineaFlujoCaja.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorCodigo=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasLineaFlujoCaja.remove(jPanelBusquedaPorCodigoLineaFlujoCaja);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasLineaFlujoCaja.remove(jPanelBusquedaPorNombreLineaFlujoCaja);}

			this.isVisibilidadFK_IdTipoGrupoFlujoCaja=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoGrupoFlujoCaja) {this.jTabbedPaneBusquedasLineaFlujoCaja.remove(jPanelFK_IdTipoGrupoFlujoCajaLineaFlujoCaja);}

			this.isVisibilidadFK_IdTipoLineaFlujoCaja=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoLineaFlujoCaja) {this.jTabbedPaneBusquedasLineaFlujoCaja.remove(jPanelFK_IdTipoLineaFlujoCajaLineaFlujoCaja);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoGrupoFlujoCaja(Boolean isParaTipoGrupoFlujoCaja){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoGrupoFlujoCajaNegation=!isParaTipoGrupoFlujoCaja;

			this.isVisibilidadBusquedaPorCodigo=isParaTipoGrupoFlujoCajaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasLineaFlujoCaja.remove(jPanelBusquedaPorCodigoLineaFlujoCaja);}

			this.isVisibilidadBusquedaPorNombre=isParaTipoGrupoFlujoCajaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasLineaFlujoCaja.remove(jPanelBusquedaPorNombreLineaFlujoCaja);}

			this.isVisibilidadFK_IdTipoGrupoFlujoCaja=isParaTipoGrupoFlujoCaja;
			if(!this.isVisibilidadFK_IdTipoGrupoFlujoCaja) {this.jTabbedPaneBusquedasLineaFlujoCaja.remove(jPanelFK_IdTipoGrupoFlujoCajaLineaFlujoCaja);}

			this.isVisibilidadFK_IdTipoLineaFlujoCaja=isParaTipoGrupoFlujoCajaNegation;
			if(!this.isVisibilidadFK_IdTipoLineaFlujoCaja) {this.jTabbedPaneBusquedasLineaFlujoCaja.remove(jPanelFK_IdTipoLineaFlujoCajaLineaFlujoCaja);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoLineaFlujoCaja(Boolean isParaTipoLineaFlujoCaja){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoLineaFlujoCajaNegation=!isParaTipoLineaFlujoCaja;

			this.isVisibilidadBusquedaPorCodigo=isParaTipoLineaFlujoCajaNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasLineaFlujoCaja.remove(jPanelBusquedaPorCodigoLineaFlujoCaja);}

			this.isVisibilidadBusquedaPorNombre=isParaTipoLineaFlujoCajaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasLineaFlujoCaja.remove(jPanelBusquedaPorNombreLineaFlujoCaja);}

			this.isVisibilidadFK_IdTipoGrupoFlujoCaja=isParaTipoLineaFlujoCajaNegation;
			if(!this.isVisibilidadFK_IdTipoGrupoFlujoCaja) {this.jTabbedPaneBusquedasLineaFlujoCaja.remove(jPanelFK_IdTipoGrupoFlujoCajaLineaFlujoCaja);}

			this.isVisibilidadFK_IdTipoLineaFlujoCaja=isParaTipoLineaFlujoCaja;
			if(!this.isVisibilidadFK_IdTipoLineaFlujoCaja) {this.jTabbedPaneBusquedasLineaFlujoCaja.remove(jPanelFK_IdTipoLineaFlujoCajaLineaFlujoCaja);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//LineaFlujoCajaSessionBean lineaflujocajaSessionBean=new LineaFlujoCajaSessionBean();
		
		if(this.lineaflujocajaSessionBean==null) {
			this.lineaflujocajaSessionBean=new LineaFlujoCajaSessionBean();
		}
		
		this.lineaflujocajaSessionBean.setsUltimaBusquedaLineaFlujoCaja(this.getsAccionBusqueda());
		this.lineaflujocajaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.lineaflujocajaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			lineaflujocajaSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			lineaflujocajaSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			lineaflujocajaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoGrupoFlujoCaja")) {
			lineaflujocajaSessionBean.setid_tipo_grupo_flujo_caja(this.getid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoLineaFlujoCaja")) {
			lineaflujocajaSessionBean.setid_tipo_linea_flujo_caja(this.getid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCaja());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//LineaFlujoCajaSessionBean lineaflujocajaSessionBean=new LineaFlujoCajaSessionBean();
		
		if(this.lineaflujocajaSessionBean==null) {
			this.lineaflujocajaSessionBean=new LineaFlujoCajaSessionBean();
		}
		
		if(this.lineaflujocajaSessionBean.getsUltimaBusquedaLineaFlujoCaja()!=null&&!this.lineaflujocajaSessionBean.getsUltimaBusquedaLineaFlujoCaja().equals("")) {
			this.setsAccionBusqueda(lineaflujocajaSessionBean.getsUltimaBusquedaLineaFlujoCaja());
			this.setiNumeroPaginacion(lineaflujocajaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(lineaflujocajaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(lineaflujocajaSessionBean.getcodigo());
				lineaflujocajaSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(lineaflujocajaSessionBean.getnombre());
				lineaflujocajaSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(lineaflujocajaSessionBean.getid_empresa());
				lineaflujocajaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoGrupoFlujoCaja")) {
				this.setid_tipo_grupo_flujo_cajaFK_IdTipoGrupoFlujoCaja(lineaflujocajaSessionBean.getid_tipo_grupo_flujo_caja());
				lineaflujocajaSessionBean.setid_tipo_grupo_flujo_caja(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoLineaFlujoCaja")) {
				this.setid_tipo_linea_flujo_cajaFK_IdTipoLineaFlujoCaja(lineaflujocajaSessionBean.getid_tipo_linea_flujo_caja());
				lineaflujocajaSessionBean.setid_tipo_linea_flujo_caja(-1L);
			}
		}
		
		this.lineaflujocajaSessionBean.setsUltimaBusquedaLineaFlujoCaja("");
		this.lineaflujocajaSessionBean.setiNumeroPaginacion(LineaFlujoCajaConstantesFunciones.INUMEROPAGINACION);
		this.lineaflujocajaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaLineaFlujoCaja(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioLineaFlujoCaja() {
		this.updateBorderResaltarBusquedasFormularioLineaFlujoCaja();
		this.updateVisibilidadBusquedasFormularioLineaFlujoCaja();
		this.updateHabilitarBusquedasFormularioLineaFlujoCaja();
	}
	
	public void updateBorderResaltarBusquedasFormularioLineaFlujoCaja() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasLineaFlujoCaja.getComponents().length>0) {
	

		if(this.lineaflujocajaConstantesFunciones.resaltarBusquedaPorCodigoLineaFlujoCaja!=null) {
			index= this.jTabbedPaneBusquedasLineaFlujoCaja.indexOfComponent(this.jPanelBusquedaPorCodigoLineaFlujoCaja);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLineaFlujoCaja.getComponent(index);
				jPanel.setBorder(this.lineaflujocajaConstantesFunciones.resaltarBusquedaPorCodigoLineaFlujoCaja);
			}
		}

		if(this.lineaflujocajaConstantesFunciones.resaltarBusquedaPorNombreLineaFlujoCaja!=null) {
			index= this.jTabbedPaneBusquedasLineaFlujoCaja.indexOfComponent(this.jPanelBusquedaPorNombreLineaFlujoCaja);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLineaFlujoCaja.getComponent(index);
				jPanel.setBorder(this.lineaflujocajaConstantesFunciones.resaltarBusquedaPorNombreLineaFlujoCaja);
			}
		}

		if(this.lineaflujocajaConstantesFunciones.resaltarFK_IdTipoGrupoFlujoCajaLineaFlujoCaja!=null) {
			index= this.jTabbedPaneBusquedasLineaFlujoCaja.indexOfComponent(this.jPanelFK_IdTipoGrupoFlujoCajaLineaFlujoCaja);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLineaFlujoCaja.getComponent(index);
				jPanel.setBorder(this.lineaflujocajaConstantesFunciones.resaltarFK_IdTipoGrupoFlujoCajaLineaFlujoCaja);
			}
		}

		if(this.lineaflujocajaConstantesFunciones.resaltarFK_IdTipoLineaFlujoCajaLineaFlujoCaja!=null) {
			index= this.jTabbedPaneBusquedasLineaFlujoCaja.indexOfComponent(this.jPanelFK_IdTipoLineaFlujoCajaLineaFlujoCaja);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLineaFlujoCaja.getComponent(index);
				jPanel.setBorder(this.lineaflujocajaConstantesFunciones.resaltarFK_IdTipoLineaFlujoCajaLineaFlujoCaja);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioLineaFlujoCaja() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasLineaFlujoCaja.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasLineaFlujoCaja.indexOfComponent(this.jPanelBusquedaPorCodigoLineaFlujoCaja);
			jPanel=(JPanel)this.jTabbedPaneBusquedasLineaFlujoCaja.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.lineaflujocajaConstantesFunciones.mostrarBusquedaPorCodigoLineaFlujoCaja);
			if(!this.lineaflujocajaConstantesFunciones.mostrarBusquedaPorCodigoLineaFlujoCaja && index>-1) {
				this.jTabbedPaneBusquedasLineaFlujoCaja.remove(index);
			}

			index= this.jTabbedPaneBusquedasLineaFlujoCaja.indexOfComponent(this.jPanelBusquedaPorNombreLineaFlujoCaja);
			jPanel=(JPanel)this.jTabbedPaneBusquedasLineaFlujoCaja.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.lineaflujocajaConstantesFunciones.mostrarBusquedaPorNombreLineaFlujoCaja);
			if(!this.lineaflujocajaConstantesFunciones.mostrarBusquedaPorNombreLineaFlujoCaja && index>-1) {
				this.jTabbedPaneBusquedasLineaFlujoCaja.remove(index);
			}

			index= this.jTabbedPaneBusquedasLineaFlujoCaja.indexOfComponent(this.jPanelFK_IdTipoGrupoFlujoCajaLineaFlujoCaja);
			jPanel=(JPanel)this.jTabbedPaneBusquedasLineaFlujoCaja.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.lineaflujocajaConstantesFunciones.mostrarFK_IdTipoGrupoFlujoCajaLineaFlujoCaja);
			if(!this.lineaflujocajaConstantesFunciones.mostrarFK_IdTipoGrupoFlujoCajaLineaFlujoCaja && index>-1) {
				this.jTabbedPaneBusquedasLineaFlujoCaja.remove(index);
			}

			index= this.jTabbedPaneBusquedasLineaFlujoCaja.indexOfComponent(this.jPanelFK_IdTipoLineaFlujoCajaLineaFlujoCaja);
			jPanel=(JPanel)this.jTabbedPaneBusquedasLineaFlujoCaja.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.lineaflujocajaConstantesFunciones.mostrarFK_IdTipoLineaFlujoCajaLineaFlujoCaja);
			if(!this.lineaflujocajaConstantesFunciones.mostrarFK_IdTipoLineaFlujoCajaLineaFlujoCaja && index>-1) {
				this.jTabbedPaneBusquedasLineaFlujoCaja.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioLineaFlujoCaja() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasLineaFlujoCaja.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasLineaFlujoCaja.indexOfComponent(this.jPanelBusquedaPorCodigoLineaFlujoCaja);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasLineaFlujoCaja.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.lineaflujocajaConstantesFunciones.activarBusquedaPorCodigoLineaFlujoCaja);
				this.jTabbedPaneBusquedasLineaFlujoCaja.setEnabledAt(index,this.lineaflujocajaConstantesFunciones.activarBusquedaPorCodigoLineaFlujoCaja);
			}

			index= this.jTabbedPaneBusquedasLineaFlujoCaja.indexOfComponent(this.jPanelBusquedaPorNombreLineaFlujoCaja);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasLineaFlujoCaja.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.lineaflujocajaConstantesFunciones.activarBusquedaPorNombreLineaFlujoCaja);
				this.jTabbedPaneBusquedasLineaFlujoCaja.setEnabledAt(index,this.lineaflujocajaConstantesFunciones.activarBusquedaPorNombreLineaFlujoCaja);
			}

			index= this.jTabbedPaneBusquedasLineaFlujoCaja.indexOfComponent(this.jPanelFK_IdTipoGrupoFlujoCajaLineaFlujoCaja);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasLineaFlujoCaja.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.lineaflujocajaConstantesFunciones.activarFK_IdTipoGrupoFlujoCajaLineaFlujoCaja);
				this.jTabbedPaneBusquedasLineaFlujoCaja.setEnabledAt(index,this.lineaflujocajaConstantesFunciones.activarFK_IdTipoGrupoFlujoCajaLineaFlujoCaja);
			}

			index= this.jTabbedPaneBusquedasLineaFlujoCaja.indexOfComponent(this.jPanelFK_IdTipoLineaFlujoCajaLineaFlujoCaja);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasLineaFlujoCaja.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.lineaflujocajaConstantesFunciones.activarFK_IdTipoLineaFlujoCajaLineaFlujoCaja);
				this.jTabbedPaneBusquedasLineaFlujoCaja.setEnabledAt(index,this.lineaflujocajaConstantesFunciones.activarFK_IdTipoLineaFlujoCajaLineaFlujoCaja);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaLineaFlujoCaja(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasLineaFlujoCaja.indexOfComponent(this.jPanelBusquedaPorCodigoLineaFlujoCaja);

			this.jTabbedPaneBusquedasLineaFlujoCaja.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLineaFlujoCaja.getComponent(index);

			this.lineaflujocajaConstantesFunciones.setResaltarBusquedaPorCodigoLineaFlujoCaja(resaltar);

			jPanel.setBorder(this.lineaflujocajaConstantesFunciones.resaltarBusquedaPorCodigoLineaFlujoCaja);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasLineaFlujoCaja.indexOfComponent(this.jPanelBusquedaPorNombreLineaFlujoCaja);

			this.jTabbedPaneBusquedasLineaFlujoCaja.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLineaFlujoCaja.getComponent(index);

			this.lineaflujocajaConstantesFunciones.setResaltarBusquedaPorNombreLineaFlujoCaja(resaltar);

			jPanel.setBorder(this.lineaflujocajaConstantesFunciones.resaltarBusquedaPorNombreLineaFlujoCaja);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoGrupoFlujoCaja")) {
			index= this.jTabbedPaneBusquedasLineaFlujoCaja.indexOfComponent(this.jPanelFK_IdTipoGrupoFlujoCajaLineaFlujoCaja);

			this.jTabbedPaneBusquedasLineaFlujoCaja.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLineaFlujoCaja.getComponent(index);

			this.lineaflujocajaConstantesFunciones.setResaltarFK_IdTipoGrupoFlujoCajaLineaFlujoCaja(resaltar);

			jPanel.setBorder(this.lineaflujocajaConstantesFunciones.resaltarFK_IdTipoGrupoFlujoCajaLineaFlujoCaja);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoLineaFlujoCaja")) {
			index= this.jTabbedPaneBusquedasLineaFlujoCaja.indexOfComponent(this.jPanelFK_IdTipoLineaFlujoCajaLineaFlujoCaja);

			this.jTabbedPaneBusquedasLineaFlujoCaja.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasLineaFlujoCaja.getComponent(index);

			this.lineaflujocajaConstantesFunciones.setResaltarFK_IdTipoLineaFlujoCajaLineaFlujoCaja(resaltar);

			jPanel.setBorder(this.lineaflujocajaConstantesFunciones.resaltarFK_IdTipoLineaFlujoCajaLineaFlujoCaja);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarLineaFlujoCaja.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioLineaFlujoCaja() throws Exception {

		if(this.jInternalFrameDetalleFormLineaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioLineaFlujoCaja();
		this.updateVisibilidadResaltarControlesFormularioLineaFlujoCaja();
		this.updateHabilitarResaltarControlesFormularioLineaFlujoCaja();
		
	}
	
	public void updateBorderResaltarControlesFormularioLineaFlujoCaja() throws Exception {
		if(this.jInternalFrameDetalleFormLineaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.lineaflujocajaConstantesFunciones.resaltaridLineaFlujoCaja!=null && this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {this.jInternalFrameDetalleFormLineaFlujoCaja.jLabelidLineaFlujoCaja.setBorder(this.lineaflujocajaConstantesFunciones.resaltaridLineaFlujoCaja);}
		if(this.lineaflujocajaConstantesFunciones.resaltarid_empresaLineaFlujoCaja!=null && this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_empresaLineaFlujoCaja.setBorder(this.lineaflujocajaConstantesFunciones.resaltarid_empresaLineaFlujoCaja);}
		if(this.lineaflujocajaConstantesFunciones.resaltarid_tipo_grupo_flujo_cajaLineaFlujoCaja!=null && this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCaja.setBorder(this.lineaflujocajaConstantesFunciones.resaltarid_tipo_grupo_flujo_cajaLineaFlujoCaja);}
		if(this.lineaflujocajaConstantesFunciones.resaltarcodigoLineaFlujoCaja!=null && this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {this.jInternalFrameDetalleFormLineaFlujoCaja.jTextFieldcodigoLineaFlujoCaja.setBorder(this.lineaflujocajaConstantesFunciones.resaltarcodigoLineaFlujoCaja);}
		if(this.lineaflujocajaConstantesFunciones.resaltarnombreLineaFlujoCaja!=null && this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {this.jInternalFrameDetalleFormLineaFlujoCaja.jTextAreanombreLineaFlujoCaja.setBorder(this.lineaflujocajaConstantesFunciones.resaltarnombreLineaFlujoCaja);}
		if(this.lineaflujocajaConstantesFunciones.resaltarid_tipo_linea_flujo_cajaLineaFlujoCaja!=null && this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCaja.setBorder(this.lineaflujocajaConstantesFunciones.resaltarid_tipo_linea_flujo_cajaLineaFlujoCaja);}
		if(this.lineaflujocajaConstantesFunciones.resaltares_consolidadoLineaFlujoCaja!=null && this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {this.jInternalFrameDetalleFormLineaFlujoCaja.jCheckBoxes_consolidadoLineaFlujoCaja.setBorderPainted(true);this.jInternalFrameDetalleFormLineaFlujoCaja.jCheckBoxes_consolidadoLineaFlujoCaja.setBorder(this.lineaflujocajaConstantesFunciones.resaltares_consolidadoLineaFlujoCaja);}
		if(this.lineaflujocajaConstantesFunciones.resaltaresta_proyeccionLineaFlujoCaja!=null && this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {this.jInternalFrameDetalleFormLineaFlujoCaja.jCheckBoxesta_proyeccionLineaFlujoCaja.setBorderPainted(true);this.jInternalFrameDetalleFormLineaFlujoCaja.jCheckBoxesta_proyeccionLineaFlujoCaja.setBorder(this.lineaflujocajaConstantesFunciones.resaltaresta_proyeccionLineaFlujoCaja);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioLineaFlujoCaja() throws Exception {		
		if(this.jInternalFrameDetalleFormLineaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
	
		//this.jInternalFrameDetalleFormLineaFlujoCaja.jLabelidLineaFlujoCaja.setVisible(this.lineaflujocajaConstantesFunciones.mostraridLineaFlujoCaja);
		this.jInternalFrameDetalleFormLineaFlujoCaja.jPanelidLineaFlujoCaja.setVisible(this.lineaflujocajaConstantesFunciones.mostraridLineaFlujoCaja);
		//this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_empresaLineaFlujoCaja.setVisible(this.lineaflujocajaConstantesFunciones.mostrarid_empresaLineaFlujoCaja);
		this.jInternalFrameDetalleFormLineaFlujoCaja.jPanelid_empresaLineaFlujoCaja.setVisible(this.lineaflujocajaConstantesFunciones.mostrarid_empresaLineaFlujoCaja);
		//this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCaja.setVisible(this.lineaflujocajaConstantesFunciones.mostrarid_tipo_grupo_flujo_cajaLineaFlujoCaja);
		this.jInternalFrameDetalleFormLineaFlujoCaja.jPanelid_tipo_grupo_flujo_cajaLineaFlujoCaja.setVisible(this.lineaflujocajaConstantesFunciones.mostrarid_tipo_grupo_flujo_cajaLineaFlujoCaja);
		//this.jInternalFrameDetalleFormLineaFlujoCaja.jTextFieldcodigoLineaFlujoCaja.setVisible(this.lineaflujocajaConstantesFunciones.mostrarcodigoLineaFlujoCaja);
		this.jInternalFrameDetalleFormLineaFlujoCaja.jPanelcodigoLineaFlujoCaja.setVisible(this.lineaflujocajaConstantesFunciones.mostrarcodigoLineaFlujoCaja);
		//this.jInternalFrameDetalleFormLineaFlujoCaja.jTextAreanombreLineaFlujoCaja.setVisible(this.lineaflujocajaConstantesFunciones.mostrarnombreLineaFlujoCaja);
		this.jInternalFrameDetalleFormLineaFlujoCaja.jPanelnombreLineaFlujoCaja.setVisible(this.lineaflujocajaConstantesFunciones.mostrarnombreLineaFlujoCaja);
		//this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCaja.setVisible(this.lineaflujocajaConstantesFunciones.mostrarid_tipo_linea_flujo_cajaLineaFlujoCaja);
		this.jInternalFrameDetalleFormLineaFlujoCaja.jPanelid_tipo_linea_flujo_cajaLineaFlujoCaja.setVisible(this.lineaflujocajaConstantesFunciones.mostrarid_tipo_linea_flujo_cajaLineaFlujoCaja);
		//this.jInternalFrameDetalleFormLineaFlujoCaja.jCheckBoxes_consolidadoLineaFlujoCaja.setVisible(this.lineaflujocajaConstantesFunciones.mostrares_consolidadoLineaFlujoCaja);
		this.jInternalFrameDetalleFormLineaFlujoCaja.jPaneles_consolidadoLineaFlujoCaja.setVisible(this.lineaflujocajaConstantesFunciones.mostrares_consolidadoLineaFlujoCaja);
		//this.jInternalFrameDetalleFormLineaFlujoCaja.jCheckBoxesta_proyeccionLineaFlujoCaja.setVisible(this.lineaflujocajaConstantesFunciones.mostraresta_proyeccionLineaFlujoCaja);
		this.jInternalFrameDetalleFormLineaFlujoCaja.jPanelesta_proyeccionLineaFlujoCaja.setVisible(this.lineaflujocajaConstantesFunciones.mostraresta_proyeccionLineaFlujoCaja);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioLineaFlujoCaja() throws Exception {
		if(this.jInternalFrameDetalleFormLineaFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormLineaFlujoCaja!=null) {
	
		this.jInternalFrameDetalleFormLineaFlujoCaja.jLabelidLineaFlujoCaja.setEnabled(this.lineaflujocajaConstantesFunciones.activaridLineaFlujoCaja);
		this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_empresaLineaFlujoCaja.setEnabled(this.lineaflujocajaConstantesFunciones.activarid_empresaLineaFlujoCaja);
		this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_grupo_flujo_cajaLineaFlujoCaja.setEnabled(this.lineaflujocajaConstantesFunciones.activarid_tipo_grupo_flujo_cajaLineaFlujoCaja);
		this.jInternalFrameDetalleFormLineaFlujoCaja.jTextFieldcodigoLineaFlujoCaja.setEnabled(this.lineaflujocajaConstantesFunciones.activarcodigoLineaFlujoCaja);
		this.jInternalFrameDetalleFormLineaFlujoCaja.jTextAreanombreLineaFlujoCaja.setEnabled(this.lineaflujocajaConstantesFunciones.activarnombreLineaFlujoCaja);
		this.jInternalFrameDetalleFormLineaFlujoCaja.jComboBoxid_tipo_linea_flujo_cajaLineaFlujoCaja.setEnabled(this.lineaflujocajaConstantesFunciones.activarid_tipo_linea_flujo_cajaLineaFlujoCaja);
		this.jInternalFrameDetalleFormLineaFlujoCaja.jCheckBoxes_consolidadoLineaFlujoCaja.setEnabled(this.lineaflujocajaConstantesFunciones.activares_consolidadoLineaFlujoCaja);
		this.jInternalFrameDetalleFormLineaFlujoCaja.jCheckBoxesta_proyeccionLineaFlujoCaja.setEnabled(this.lineaflujocajaConstantesFunciones.activaresta_proyeccionLineaFlujoCaja);
		}
	}
	
		
}