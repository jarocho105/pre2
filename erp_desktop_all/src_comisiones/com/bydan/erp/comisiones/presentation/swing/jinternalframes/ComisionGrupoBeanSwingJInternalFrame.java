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

import com.bydan.erp.comisiones.util.ComisionGrupoConstantesFunciones;
import com.bydan.erp.comisiones.util.ComisionGrupoParameterReturnGeneral;
//import com.bydan.erp.comisiones.util.ComisionGrupoParameterGeneral;
//import com.bydan.erp.comisiones.presentation.report.source.ComisionGrupoBean;
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
public class ComisionGrupoBeanSwingJInternalFrame extends ComisionGrupoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ComisionGrupoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ComisionGrupo> comisiongrupoValidator = new ClassValidator<ComisionGrupo>(ComisionGrupo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ComisionGrupo comisiongrupo;	
	public ComisionGrupo comisiongrupoAux;
	public ComisionGrupo comisiongrupoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ComisionGrupo comisiongrupoTotales;
	public Long idComisionGrupoActual;
	public Long iIdNuevoComisionGrupo=0L;
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
	
	public Boolean isPermisoTodoComisionGrupo;
	public Boolean isPermisoNuevoComisionGrupo;
	public Boolean isPermisoActualizarComisionGrupo;
	public Boolean isPermisoActualizarOriginalComisionGrupo;
	public Boolean isPermisoEliminarComisionGrupo;
	public Boolean isPermisoGuardarCambiosComisionGrupo;
	public Boolean isPermisoConsultaComisionGrupo;
	public Boolean isPermisoBusquedaComisionGrupo;
	public Boolean isPermisoReporteComisionGrupo;
	public Boolean isPermisoPaginacionMedioComisionGrupo;
	public Boolean isPermisoPaginacionAltoComisionGrupo;
	public Boolean isPermisoPaginacionTodoComisionGrupo;
	public Boolean isPermisoCopiarComisionGrupo;
	public Boolean isPermisoVerFormComisionGrupo;
	public Boolean isPermisoDuplicarComisionGrupo;
	public Boolean isPermisoOrdenComisionGrupo;
	
	
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
	
	public ComisionGrupoParameterReturnGeneral comisiongrupoReturnGeneral;
	public ComisionGrupoParameterReturnGeneral comisiongrupoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoComisionGrupo=false;
	public Boolean esParaAccionDesdeFormularioComisionGrupo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ComisionGrupoSessionBeanAdditional comisiongrupoSessionBeanAdditional=null;
	
	public ComisionGrupoSessionBeanAdditional getComisionGrupoSessionBeanAdditional() {
		return this.comisiongrupoSessionBeanAdditional;
	}
	
	public void setComisionGrupoSessionBeanAdditional(ComisionGrupoSessionBeanAdditional comisiongrupoSessionBeanAdditional) {
		try {
			this.comisiongrupoSessionBeanAdditional=comisiongrupoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ComisionGrupoBeanSwingJInternalFrameAdditional comisiongrupoBeanSwingJInternalFrameAdditional=null;
	//public class ComisionGrupoBeanSwingJInternalFrame
	
	public ComisionGrupoBeanSwingJInternalFrameAdditional getComisionGrupoBeanSwingJInternalFrameAdditional() {
		return this.comisiongrupoBeanSwingJInternalFrameAdditional;
	}
	
	public void setComisionGrupoBeanSwingJInternalFrameAdditional(ComisionGrupoBeanSwingJInternalFrameAdditional comisiongrupoBeanSwingJInternalFrameAdditional) {
		try {
			this.comisiongrupoBeanSwingJInternalFrameAdditional=comisiongrupoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ComisionGrupoLogic comisiongrupoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ComisionGrupo comisiongrupoBean;
	public ComisionGrupoConstantesFunciones comisiongrupoConstantesFunciones;
	//public ComisionGrupoParameterReturnGeneral comisiongrupoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ComisionConfigLogic comisionconfigLogic;
	public VendedorLogic vendedorLogic;
	public LineaLogic lineaLogic;
	public LineaLogic lineagrupoLogic;
	public EstadoComisionLogic estadocomisionLogic;
	
	//PARAMETROS
	
	
	//public List<ComisionGrupo> comisiongrupos;	
	//public List<ComisionGrupo> comisiongruposEliminados;
	//public List<ComisionGrupo> comisiongruposAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoComisionGrupo=false;
	public Boolean isVisibilidadCeldaDuplicarComisionGrupo=true;
	public Boolean isVisibilidadCeldaCopiarComisionGrupo=true;
	public Boolean isVisibilidadCeldaVerFormComisionGrupo=true;
	public Boolean isVisibilidadCeldaOrdenComisionGrupo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesComisionGrupo=false;
	public Boolean isVisibilidadCeldaModificarComisionGrupo=false;
	public Boolean isVisibilidadCeldaActualizarComisionGrupo=false;
	public Boolean isVisibilidadCeldaEliminarComisionGrupo=false;
	public Boolean isVisibilidadCeldaCancelarComisionGrupo=false;
	public Boolean isVisibilidadCeldaGuardarComisionGrupo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosComisionGrupo=false;	
	
	
	public Boolean isVisibilidadFK_IdComisionConfig=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstadoComision=false;
	public Boolean isVisibilidadFK_IdLinea=false;
	public Boolean isVisibilidadFK_IdLineaGrupo=false;
	public Boolean isVisibilidadFK_IdVendedor=false;
	
	public Long getiIdNuevoComisionGrupo() {
		return this.iIdNuevoComisionGrupo;
	}

	public void setiIdNuevoComisionGrupo(Long iIdNuevoComisionGrupo) {
		this.iIdNuevoComisionGrupo = iIdNuevoComisionGrupo;
	}
	
	public Long getidComisionGrupoActual() {
		return this.idComisionGrupoActual;
	}

	public void setidComisionGrupoActual(Long idComisionGrupoActual) {
		this.idComisionGrupoActual = idComisionGrupoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ComisionGrupo getcomisiongrupo() {
		return this.comisiongrupo;
	}

	public void setcomisiongrupo(ComisionGrupo comisiongrupo) {
		this.comisiongrupo = comisiongrupo;
	}
	
	public ComisionGrupo getcomisiongrupoAux() {
		return this.comisiongrupoAux;
	}

	public void setcomisiongrupoAux(ComisionGrupo comisiongrupoAux) {
		this.comisiongrupoAux = comisiongrupoAux;
	}				
	
	public ComisionGrupo getcomisiongrupoAnterior() {
		return this.comisiongrupoAnterior;
	}

	public void setcomisiongrupoAnterior(ComisionGrupo comisiongrupoAnterior) {
		this.comisiongrupoAnterior = comisiongrupoAnterior;
	}	
	
	public ComisionGrupo getcomisiongrupoTotales() {
		return this.comisiongrupoTotales;
	}

	public void setcomisiongrupoTotales(ComisionGrupo comisiongrupoTotales) {
		this.comisiongrupoTotales = comisiongrupoTotales;
	}	
	
	public ComisionGrupo getcomisiongrupoBean() {
		return this.comisiongrupoBean;
	}

	public void setcomisiongrupoBean(ComisionGrupo comisiongrupoBean) {
		this.comisiongrupoBean = comisiongrupoBean;
	}	
	
	public ComisionGrupoParameterReturnGeneral getcomisiongrupoReturnGeneral() {
		return this.comisiongrupoReturnGeneral;
	}

	public void setcomisiongrupoReturnGeneral(ComisionGrupoParameterReturnGeneral comisiongrupoReturnGeneral) {
		this.comisiongrupoReturnGeneral = comisiongrupoReturnGeneral;
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

	public Long id_linea_grupoFK_IdLineaGrupo=-1L;

	public Long getid_linea_grupoFK_IdLineaGrupo() {
		return this.id_linea_grupoFK_IdLineaGrupo;
	}

	public void setid_linea_grupoFK_IdLineaGrupo(Long id_linea_grupoFK_IdLineaGrupo) {
		this.id_linea_grupoFK_IdLineaGrupo = id_linea_grupoFK_IdLineaGrupo;
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
	
	
	public ComisionGrupoLogic getComisionGrupoLogic()	{		
		return comisiongrupoLogic;
	}

	public void setComisionGrupoLogic(ComisionGrupoLogic comisiongrupoLogic) {
		this.comisiongrupoLogic = comisiongrupoLogic;
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
	
	public Boolean getIsEsNuevoComisionGrupo() {
		return isEsNuevoComisionGrupo;
	}

	public void setIsEsNuevoComisionGrupo(Boolean isEsNuevoComisionGrupo) {
		this.isEsNuevoComisionGrupo = isEsNuevoComisionGrupo;
	}

	public Boolean getEsParaAccionDesdeFormularioComisionGrupo() {
		return esParaAccionDesdeFormularioComisionGrupo;
	}
	
	public void setEsParaAccionDesdeFormularioComisionGrupo(Boolean esParaAccionDesdeFormularioComisionGrupo) {
		this.esParaAccionDesdeFormularioComisionGrupo = esParaAccionDesdeFormularioComisionGrupo;
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

			if(this.comisiongrupoSessionBean==null) {
				this.comisiongrupoSessionBean=new ComisionGrupoSessionBean();
			}

			if(!this.comisiongrupoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(comisiongrupoSessionBean.getlidEmpresaActual());
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

			if(this.comisiongrupoSessionBean==null) {
				this.comisiongrupoSessionBean=new ComisionGrupoSessionBean();
			}

			if(!this.comisiongrupoSessionBean.getisBusquedaDesdeForeignKeySesionComisionConfig()) {
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
					comisionconfigLogic.getEntityWithConnection(comisiongrupoSessionBean.getlidComisionConfigActual());
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

			if(this.comisiongrupoSessionBean==null) {
				this.comisiongrupoSessionBean=new ComisionGrupoSessionBean();
			}

			if(!this.comisiongrupoSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
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
					vendedorLogic.getEntityWithConnection(comisiongrupoSessionBean.getlidVendedorActual());
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

			if(this.comisiongrupoSessionBean==null) {
				this.comisiongrupoSessionBean=new ComisionGrupoSessionBean();
			}

			if(!this.comisiongrupoSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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
					lineaLogic.getEntityWithConnection(comisiongrupoSessionBean.getlidLineaActual());
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

			if(this.comisiongrupoSessionBean==null) {
				this.comisiongrupoSessionBean=new ComisionGrupoSessionBean();
			}

			if(!this.comisiongrupoSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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
					lineaLogic.getEntityWithConnection(comisiongrupoSessionBean.getlidLineaGrupoActual());
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

			if(this.comisiongrupoSessionBean==null) {
				this.comisiongrupoSessionBean=new ComisionGrupoSessionBean();
			}

			if(!this.comisiongrupoSessionBean.getisBusquedaDesdeForeignKeySesionEstadoComision()) {
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
					estadocomisionLogic.getEntityWithConnection(comisiongrupoSessionBean.getlidEstadoComisionActual());
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

					if(this.comisiongrupo!=null) {
						this.comisiongrupo.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
						this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_empresaComisionGrupo.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaComisionGrupo.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
						if(this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_empresaComisionGrupo.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_empresaComisionGrupo.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaComisionGrupoGenerico)throws Exception
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
				jComboBoxid_empresaComisionGrupoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaComisionGrupoGenerico!=null && jComboBoxid_empresaComisionGrupoGenerico.getItemCount()>0) {
					jComboBoxid_empresaComisionGrupoGenerico.setSelectedIndex(0);
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

					if(this.comisiongrupo!=null) {
						this.comisiongrupo.setComisionConfig(comisionconfigTemp);
					}

					if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
						this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_comision_configComisionGrupo.setSelectedItem(comisionconfigTemp);
					}
				} else {
					//jComboBoxid_comision_configComisionGrupo.setSelectedItem(comisionconfigTemp);
					if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
						if(this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_comision_configComisionGrupo.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_comision_configComisionGrupo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdComisionConfig") || sFormularioTipoBusqueda.equals("Todos")){
					if(comisionconfigTemp!=null && jComboBoxid_comision_configFK_IdComisionConfigComisionGrupo!=null) {
						jComboBoxid_comision_configFK_IdComisionConfigComisionGrupo.setSelectedItem(comisionconfigTemp);
					} else {
						if(jComboBoxid_comision_configFK_IdComisionConfigComisionGrupo!=null) {
							//jComboBoxid_comision_configFK_IdComisionConfigComisionGrupo.setSelectedItem(comisionconfigTemp);
							if(jComboBoxid_comision_configFK_IdComisionConfigComisionGrupo.getItemCount()>0) {
								jComboBoxid_comision_configFK_IdComisionConfigComisionGrupo.setSelectedIndex(0);
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
	public void setActualComisionConfigForeignKeyGenerico(Long idComisionConfigSeleccionado,JComboBox jComboBoxid_comision_configComisionGrupoGenerico)throws Exception
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
				jComboBoxid_comision_configComisionGrupoGenerico.setSelectedItem(comisionconfigTemp);
			} else {
				if(jComboBoxid_comision_configComisionGrupoGenerico!=null && jComboBoxid_comision_configComisionGrupoGenerico.getItemCount()>0) {
					jComboBoxid_comision_configComisionGrupoGenerico.setSelectedIndex(0);
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

					if(this.comisiongrupo!=null) {
						this.comisiongrupo.setVendedor(vendedorTemp);
					}

					if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
						this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_vendedorComisionGrupo.setSelectedItem(vendedorTemp);
					}
				} else {
					//jComboBoxid_vendedorComisionGrupo.setSelectedItem(vendedorTemp);
					if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
						if(this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_vendedorComisionGrupo.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_vendedorComisionGrupo.setSelectedIndex(0);
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
	public void setActualVendedorForeignKeyGenerico(Long idVendedorSeleccionado,JComboBox jComboBoxid_vendedorComisionGrupoGenerico)throws Exception
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
				jComboBoxid_vendedorComisionGrupoGenerico.setSelectedItem(vendedorTemp);
			} else {
				if(jComboBoxid_vendedorComisionGrupoGenerico!=null && jComboBoxid_vendedorComisionGrupoGenerico.getItemCount()>0) {
					jComboBoxid_vendedorComisionGrupoGenerico.setSelectedIndex(0);
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

					if(this.comisiongrupo!=null) {
						this.comisiongrupo.setLinea(lineaTemp);
					}

					if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
						this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_lineaComisionGrupo.setSelectedItem(lineaTemp);
					}
				} else {
					//jComboBoxid_lineaComisionGrupo.setSelectedItem(lineaTemp);
					if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
						if(this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_lineaComisionGrupo.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_lineaComisionGrupo.setSelectedIndex(0);
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
	public void setActualLineaForeignKeyGenerico(Long idLineaSeleccionado,JComboBox jComboBoxid_lineaComisionGrupoGenerico)throws Exception
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
				jComboBoxid_lineaComisionGrupoGenerico.setSelectedItem(lineaTemp);
			} else {
				if(jComboBoxid_lineaComisionGrupoGenerico!=null && jComboBoxid_lineaComisionGrupoGenerico.getItemCount()>0) {
					jComboBoxid_lineaComisionGrupoGenerico.setSelectedIndex(0);
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

					if(this.comisiongrupo!=null) {
						this.comisiongrupo.setLineaGrupo(lineagrupoTemp);
					}

					if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
						this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_linea_grupoComisionGrupo.setSelectedItem(lineagrupoTemp);
					}
				} else {
					//jComboBoxid_linea_grupoComisionGrupo.setSelectedItem(lineagrupoTemp);
					if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
						if(this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_linea_grupoComisionGrupo.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_linea_grupoComisionGrupo.setSelectedIndex(0);
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
	public void setActualLineaGrupoForeignKeyGenerico(Long idLineaGrupoSeleccionado,JComboBox jComboBoxid_linea_grupoComisionGrupoGenerico)throws Exception
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
				jComboBoxid_linea_grupoComisionGrupoGenerico.setSelectedItem(lineagrupoTemp);
			} else {
				if(jComboBoxid_linea_grupoComisionGrupoGenerico!=null && jComboBoxid_linea_grupoComisionGrupoGenerico.getItemCount()>0) {
					jComboBoxid_linea_grupoComisionGrupoGenerico.setSelectedIndex(0);
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

					if(this.comisiongrupo!=null) {
						this.comisiongrupo.setEstadoComision(estadocomisionTemp);
					}

					if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
						this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_estado_comisionComisionGrupo.setSelectedItem(estadocomisionTemp);
					}
				} else {
					//jComboBoxid_estado_comisionComisionGrupo.setSelectedItem(estadocomisionTemp);
					if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
						if(this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_estado_comisionComisionGrupo.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_estado_comisionComisionGrupo.setSelectedIndex(0);
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
	public void setActualEstadoComisionForeignKeyGenerico(Long idEstadoComisionSeleccionado,JComboBox jComboBoxid_estado_comisionComisionGrupoGenerico)throws Exception
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
				jComboBoxid_estado_comisionComisionGrupoGenerico.setSelectedItem(estadocomisionTemp);
			} else {
				if(jComboBoxid_estado_comisionComisionGrupoGenerico!=null && jComboBoxid_estado_comisionComisionGrupoGenerico.getItemCount()>0) {
					jComboBoxid_estado_comisionComisionGrupoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ComisionGrupo comisiongrupo,JComboBox jComboBoxid_empresaComisionGrupoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaComisionGrupoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_empresaComisionGrupo.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaComisionGrupoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				comisiongrupo.setid_empresa(empresaAux.getId());
				comisiongrupo.setempresa_descripcion(ComisionGrupoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				comisiongrupo.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarComisionConfigForeignKey(ComisionGrupo comisiongrupo,JComboBox jComboBoxid_comision_configComisionGrupoGenerico)throws Exception
	{
		try
		{
			ComisionConfig  comisionconfigAux=new ComisionConfig();

			if(jComboBoxid_comision_configComisionGrupoGenerico==null) {
				comisionconfigAux=(ComisionConfig)this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_comision_configComisionGrupo.getSelectedItem();
			} else {
				comisionconfigAux=(ComisionConfig)jComboBoxid_comision_configComisionGrupoGenerico.getSelectedItem();
			}

			if(comisionconfigAux!=null && comisionconfigAux.getId()!=null) {
				comisiongrupo.setid_comision_config(comisionconfigAux.getId());
				comisiongrupo.setcomisionconfig_descripcion(ComisionGrupoConstantesFunciones.getComisionConfigDescripcion(comisionconfigAux));
				comisiongrupo.setComisionConfig(comisionconfigAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarVendedorForeignKey(ComisionGrupo comisiongrupo,JComboBox jComboBoxid_vendedorComisionGrupoGenerico)throws Exception
	{
		try
		{
			Vendedor  vendedorAux=new Vendedor();

			if(jComboBoxid_vendedorComisionGrupoGenerico==null) {
				vendedorAux=(Vendedor)this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_vendedorComisionGrupo.getSelectedItem();
			} else {
				vendedorAux=(Vendedor)jComboBoxid_vendedorComisionGrupoGenerico.getSelectedItem();
			}

			if(vendedorAux!=null && vendedorAux.getId()!=null) {
				comisiongrupo.setid_vendedor(vendedorAux.getId());
				comisiongrupo.setvendedor_descripcion(ComisionGrupoConstantesFunciones.getVendedorDescripcion(vendedorAux));
				comisiongrupo.setVendedor(vendedorAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaForeignKey(ComisionGrupo comisiongrupo,JComboBox jComboBoxid_lineaComisionGrupoGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_lineaComisionGrupoGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_lineaComisionGrupo.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_lineaComisionGrupoGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				comisiongrupo.setid_linea(lineaAux.getId());
				comisiongrupo.setlinea_descripcion(ComisionGrupoConstantesFunciones.getLineaDescripcion(lineaAux));
				comisiongrupo.setLinea(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarLineaGrupoForeignKey(ComisionGrupo comisiongrupo,JComboBox jComboBoxid_linea_grupoComisionGrupoGenerico)throws Exception
	{
		try
		{
			Linea  lineaAux=new Linea();

			if(jComboBoxid_linea_grupoComisionGrupoGenerico==null) {
				lineaAux=(Linea)this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_linea_grupoComisionGrupo.getSelectedItem();
			} else {
				lineaAux=(Linea)jComboBoxid_linea_grupoComisionGrupoGenerico.getSelectedItem();
			}

			if(lineaAux!=null && lineaAux.getId()!=null) {
				comisiongrupo.setid_linea_grupo(lineaAux.getId());
				comisiongrupo.setlineagrupo_descripcion(ComisionGrupoConstantesFunciones.getLineaGrupoDescripcion(lineaAux));
				comisiongrupo.setLineaGrupo(lineaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstadoComisionForeignKey(ComisionGrupo comisiongrupo,JComboBox jComboBoxid_estado_comisionComisionGrupoGenerico)throws Exception
	{
		try
		{
			EstadoComision  estadocomisionAux=new EstadoComision();

			if(jComboBoxid_estado_comisionComisionGrupoGenerico==null) {
				estadocomisionAux=(EstadoComision)this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_estado_comisionComisionGrupo.getSelectedItem();
			} else {
				estadocomisionAux=(EstadoComision)jComboBoxid_estado_comisionComisionGrupoGenerico.getSelectedItem();
			}

			if(estadocomisionAux!=null && estadocomisionAux.getId()!=null) {
				comisiongrupo.setid_estado_comision(estadocomisionAux.getId());
				comisiongrupo.setestadocomision_descripcion(ComisionGrupoConstantesFunciones.getEstadoComisionDescripcion(estadocomisionAux));
				comisiongrupo.setEstadoComision(estadocomisionAux);			}
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

					if(!ComisionGrupoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionGrupo!=null) { 
							this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_empresaComisionGrupo.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_empresaComisionGrupo.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionGrupo!=null) { 
					}

					if(!ComisionGrupoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ComisionGrupoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionGrupo!=null) { 
							this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_comision_configComisionGrupo.removeAllItems();

							for(ComisionConfig comisionconfig:this.comisionconfigsForeignKey) {
								this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_comision_configComisionGrupo.addItem(comisionconfig);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionGrupo!=null) { 
					}

					if(!ComisionGrupoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdComisionConfig") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ComisionGrupoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_comision_configFK_IdComisionConfigComisionGrupo.removeAllItems();

							for(ComisionConfig comisionconfig:this.comisionconfigsForeignKey) {
								this.jComboBoxid_comision_configFK_IdComisionConfigComisionGrupo.addItem(comisionconfig);
							}
						}

						if(!ComisionGrupoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ComisionGrupoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionGrupo!=null) { 
							this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_vendedorComisionGrupo.removeAllItems();

							for(Vendedor vendedor:this.vendedorsForeignKey) {
								this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_vendedorComisionGrupo.addItem(vendedor);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionGrupo!=null) { 
					}

					if(!ComisionGrupoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ComisionGrupoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionGrupo!=null) { 
							this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_lineaComisionGrupo.removeAllItems();

							for(Linea linea:this.lineasForeignKey) {
								this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_lineaComisionGrupo.addItem(linea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionGrupo!=null) { 
					}

					if(!ComisionGrupoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ComisionGrupoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionGrupo!=null) { 
							this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_linea_grupoComisionGrupo.removeAllItems();

							for(Linea lineagrupo:this.lineagruposForeignKey) {
								this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_linea_grupoComisionGrupo.addItem(lineagrupo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionGrupo!=null) { 
					}

					if(!ComisionGrupoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ComisionGrupoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionGrupo!=null) { 
							this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_estado_comisionComisionGrupo.removeAllItems();

							for(EstadoComision estadocomision:this.estadocomisionsForeignKey) {
								this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_estado_comisionComisionGrupo.addItem(estadocomision);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionGrupo!=null) { 
					}

					if(!ComisionGrupoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
							this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_empresaComisionGrupo.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
							this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_empresaComisionGrupo.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
							this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_comision_configComisionGrupo.setSelectedItem(comisionconfig);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
							this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_comision_configComisionGrupo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_comision_configFK_IdComisionConfigComisionGrupo.setSelectedItem(comisionconfig);
						} else {
							this.jComboBoxid_comision_configFK_IdComisionConfigComisionGrupo.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
							this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_vendedorComisionGrupo.setSelectedItem(vendedor);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
							this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_vendedorComisionGrupo.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
							this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_lineaComisionGrupo.setSelectedItem(linea);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
							this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_lineaComisionGrupo.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
							this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_linea_grupoComisionGrupo.setSelectedItem(lineagrupo);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
							this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_linea_grupoComisionGrupo.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
							this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_estado_comisionComisionGrupo.setSelectedItem(estadocomision);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
							this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_estado_comisionComisionGrupo.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesComisionGrupo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ComisionGrupoConstantesFunciones.refrescarForeignKeysDescripcionesComisionGrupo(this.comisiongrupoLogic.getComisionGrupos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ComisionGrupoConstantesFunciones.refrescarForeignKeysDescripcionesComisionGrupo(this.comisiongrupos);
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
			//comisiongrupoLogic.setComisionGrupos(this.comisiongrupos);
			comisiongrupoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ComisionGrupoParameterReturnGeneral getComisionGrupoParameterGeneral() {
		return this.comisiongrupoParameterGeneral;
	}
	
	public void setComisionGrupoParameterGeneral(ComisionGrupoParameterReturnGeneral comisiongrupoParameterGeneral) {
		this.comisiongrupoParameterGeneral = comisiongrupoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoComisionGrupo() {
		return isPermisoTodoComisionGrupo;
	}

	public void setIsPermisoTodoComisionGrupo(Boolean isPermisoTodoComisionGrupo) {
		this.isPermisoTodoComisionGrupo = isPermisoTodoComisionGrupo;
	}

	public Boolean getIsPermisoNuevoComisionGrupo() {
		return isPermisoNuevoComisionGrupo;
	}

	public void setIsPermisoNuevoComisionGrupo(Boolean isPermisoNuevoComisionGrupo) {
		this.isPermisoNuevoComisionGrupo = isPermisoNuevoComisionGrupo;
	}

	public Boolean getIsPermisoActualizarComisionGrupo() {
		return isPermisoActualizarComisionGrupo;
	}

	public void setIsPermisoActualizarComisionGrupo(Boolean isPermisoActualizarComisionGrupo) {
		this.isPermisoActualizarComisionGrupo = isPermisoActualizarComisionGrupo;
	}

	public Boolean getIsPermisoEliminarComisionGrupo() {
		return isPermisoEliminarComisionGrupo;
	}

	public void setIsPermisoEliminarComisionGrupo(Boolean isPermisoEliminarComisionGrupo) {
		this.isPermisoEliminarComisionGrupo = isPermisoEliminarComisionGrupo;
	}

	public Boolean getIsPermisoGuardarCambiosComisionGrupo() {
		return isPermisoGuardarCambiosComisionGrupo;
	}

	public void setIsPermisoGuardarCambiosComisionGrupo(Boolean isPermisoGuardarCambiosComisionGrupo) {
		this.isPermisoGuardarCambiosComisionGrupo = isPermisoGuardarCambiosComisionGrupo;
	}
	
	public Boolean getIsPermisoConsultaComisionGrupo() {
		return isPermisoConsultaComisionGrupo;
	}

	public void setIsPermisoConsultaComisionGrupo(Boolean isPermisoConsultaComisionGrupo) {
		this.isPermisoConsultaComisionGrupo = isPermisoConsultaComisionGrupo;
	}

	public Boolean getIsPermisoBusquedaComisionGrupo() {
		return isPermisoBusquedaComisionGrupo;
	}

	public void setIsPermisoBusquedaComisionGrupo(Boolean isPermisoBusquedaComisionGrupo) {
		this.isPermisoBusquedaComisionGrupo = isPermisoBusquedaComisionGrupo;
	}

	public Boolean getIsPermisoReporteComisionGrupo() {
		return isPermisoReporteComisionGrupo;
	}

	public void setIsPermisoReporteComisionGrupo(Boolean isPermisoReporteComisionGrupo) {
		this.isPermisoReporteComisionGrupo = isPermisoReporteComisionGrupo;
	}
	
	public Boolean getIsPermisoPaginacionMedioComisionGrupo() {
		return isPermisoPaginacionMedioComisionGrupo;
	}

	public void setIsPermisoPaginacionMedioComisionGrupo(Boolean isPermisoPaginacionMedioComisionGrupo) {
		this.isPermisoPaginacionMedioComisionGrupo = isPermisoPaginacionMedioComisionGrupo;
	}
	
	public Boolean getIsPermisoPaginacionTodoComisionGrupo() {
		return isPermisoPaginacionTodoComisionGrupo;
	}

	public void setIsPermisoPaginacionTodoComisionGrupo(Boolean isPermisoPaginacionTodoComisionGrupo) {
		this.isPermisoPaginacionTodoComisionGrupo = isPermisoPaginacionTodoComisionGrupo;
	}
	
	public Boolean getIsPermisoPaginacionAltoComisionGrupo() {
		return isPermisoPaginacionAltoComisionGrupo;
	}

	public void setIsPermisoPaginacionAltoComisionGrupo(Boolean isPermisoPaginacionAltoComisionGrupo) {
		this.isPermisoPaginacionAltoComisionGrupo = isPermisoPaginacionAltoComisionGrupo;
	}
	
	public Boolean getIsPermisoCopiarComisionGrupo() {
		return isPermisoCopiarComisionGrupo;
	}

	public void setIsPermisoCopiarComisionGrupo(Boolean isPermisoCopiarComisionGrupo) {
		this.isPermisoCopiarComisionGrupo = isPermisoCopiarComisionGrupo;
	}
	
	public Boolean getIsPermisoVerFormComisionGrupo() {
		return isPermisoVerFormComisionGrupo;
	}

	public void setIsPermisoVerFormComisionGrupo(Boolean isPermisoVerFormComisionGrupo) {
		this.isPermisoVerFormComisionGrupo = isPermisoVerFormComisionGrupo;
	}
	
	public Boolean getIsPermisoDuplicarComisionGrupo() {
		return isPermisoDuplicarComisionGrupo;
	}

	public void setIsPermisoDuplicarComisionGrupo(Boolean isPermisoDuplicarComisionGrupo) {
		this.isPermisoDuplicarComisionGrupo = isPermisoDuplicarComisionGrupo;
	}
	
	public Boolean getIsPermisoOrdenComisionGrupo() {
		return isPermisoOrdenComisionGrupo;
	}

	public void setIsPermisoOrdenComisionGrupo(Boolean isPermisoOrdenComisionGrupo) {
		this.isPermisoOrdenComisionGrupo = isPermisoOrdenComisionGrupo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoComisionGrupo() {
		return isVisibilidadCeldaNuevoComisionGrupo;
	}

	public void setIsVisibilidadCeldaNuevoComisionGrupo(Boolean isVisibilidadCeldaNuevoComisionGrupo) {
		this.isVisibilidadCeldaNuevoComisionGrupo = isVisibilidadCeldaNuevoComisionGrupo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarComisionGrupo() {
		return isVisibilidadCeldaDuplicarComisionGrupo;
	}

	public void setIsVisibilidadCeldaDuplicarComisionGrupo(Boolean isVisibilidadCeldaDuplicarComisionGrupo) {
		this.isVisibilidadCeldaDuplicarComisionGrupo = isVisibilidadCeldaDuplicarComisionGrupo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarComisionGrupo() {
		return isVisibilidadCeldaCopiarComisionGrupo;
	}

	public void setIsVisibilidadCeldaCopiarComisionGrupo(Boolean isVisibilidadCeldaCopiarComisionGrupo) {
		this.isVisibilidadCeldaCopiarComisionGrupo = isVisibilidadCeldaCopiarComisionGrupo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormComisionGrupo() {
		return isVisibilidadCeldaVerFormComisionGrupo;
	}

	public void setIsVisibilidadCeldaVerFormComisionGrupo(Boolean isVisibilidadCeldaVerFormComisionGrupo) {
		this.isVisibilidadCeldaVerFormComisionGrupo = isVisibilidadCeldaVerFormComisionGrupo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenComisionGrupo() {
		return isVisibilidadCeldaOrdenComisionGrupo;
	}

	public void setIsVisibilidadCeldaOrdenComisionGrupo(Boolean isVisibilidadCeldaOrdenComisionGrupo) {
		this.isVisibilidadCeldaOrdenComisionGrupo = isVisibilidadCeldaOrdenComisionGrupo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesComisionGrupo() {
		return isVisibilidadCeldaNuevoRelacionesComisionGrupo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesComisionGrupo(Boolean isVisibilidadCeldaNuevoRelacionesComisionGrupo) {
		this.isVisibilidadCeldaNuevoRelacionesComisionGrupo = isVisibilidadCeldaNuevoRelacionesComisionGrupo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarComisionGrupo() {
		return isVisibilidadCeldaModificarComisionGrupo;
	}

	public void setIsVisibilidadCeldaModificarComisionGrupo(Boolean isVisibilidadCeldaModificarComisionGrupo) {
		this.isVisibilidadCeldaModificarComisionGrupo = isVisibilidadCeldaModificarComisionGrupo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarComisionGrupo() {
		return isVisibilidadCeldaActualizarComisionGrupo;
	}

	public void setIsVisibilidadCeldaActualizarComisionGrupo(Boolean isVisibilidadCeldaActualizarComisionGrupo) {
		this.isVisibilidadCeldaActualizarComisionGrupo = isVisibilidadCeldaActualizarComisionGrupo;
	}

	public Boolean getIsVisibilidadCeldaEliminarComisionGrupo() {
		return isVisibilidadCeldaEliminarComisionGrupo;
	}

	public void setIsVisibilidadCeldaEliminarComisionGrupo(Boolean isVisibilidadCeldaEliminarComisionGrupo) {
		this.isVisibilidadCeldaEliminarComisionGrupo = isVisibilidadCeldaEliminarComisionGrupo;
	}

	public Boolean getIsVisibilidadCeldaCancelarComisionGrupo() {
		return isVisibilidadCeldaCancelarComisionGrupo;
	}

	public void setIsVisibilidadCeldaCancelarComisionGrupo(Boolean isVisibilidadCeldaCancelarComisionGrupo) {
		this.isVisibilidadCeldaCancelarComisionGrupo = isVisibilidadCeldaCancelarComisionGrupo;
	}

	public Boolean getIsVisibilidadCeldaGuardarComisionGrupo() {
		return isVisibilidadCeldaGuardarComisionGrupo;
	}

	public void setIsVisibilidadCeldaGuardarComisionGrupo(Boolean isVisibilidadCeldaGuardarComisionGrupo) {
		this.isVisibilidadCeldaGuardarComisionGrupo = isVisibilidadCeldaGuardarComisionGrupo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosComisionGrupo() {
		return isVisibilidadCeldaGuardarCambiosComisionGrupo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosComisionGrupo(Boolean isVisibilidadCeldaGuardarCambiosComisionGrupo) {
		this.isVisibilidadCeldaGuardarCambiosComisionGrupo = isVisibilidadCeldaGuardarCambiosComisionGrupo;
	}
		
	public ComisionGrupoSessionBean getcomisiongrupoSessionBean() {
		return this.comisiongrupoSessionBean;
	}
	
	public void setcomisiongrupoSessionBean(ComisionGrupoSessionBean comisiongrupoSessionBean) {
		this.comisiongrupoSessionBean=comisiongrupoSessionBean;
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

	public Boolean getisVisibilidadFK_IdLineaGrupo() {
		return this.isVisibilidadFK_IdLineaGrupo;
	}

	public void setisVisibilidadFK_IdLineaGrupo(Boolean isVisibilidadFK_IdLineaGrupo) {
		this.isVisibilidadFK_IdLineaGrupo=isVisibilidadFK_IdLineaGrupo;
	}

	public Boolean getisVisibilidadFK_IdVendedor() {
		return this.isVisibilidadFK_IdVendedor;
	}

	public void setisVisibilidadFK_IdVendedor(Boolean isVisibilidadFK_IdVendedor) {
		this.isVisibilidadFK_IdVendedor=isVisibilidadFK_IdVendedor;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(ComisionGrupo comisiongrupo)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(comisiongrupo,null);
				this.setActualParaGuardarComisionConfigForeignKey(comisiongrupo,null);
				this.setActualParaGuardarVendedorForeignKey(comisiongrupo,null);
				this.setActualParaGuardarLineaForeignKey(comisiongrupo,null);
				this.setActualParaGuardarLineaGrupoForeignKey(comisiongrupo,null);
				this.setActualParaGuardarEstadoComisionForeignKey(comisiongrupo,null);
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
	
	public void bugActualizarReferenciaActual(ComisionGrupo comisiongrupo,ComisionGrupo comisiongrupoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalComisionGrupo(comisiongrupo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		comisiongrupoAux.setId(comisiongrupo.getId());
		comisiongrupoAux.setVersionRow(comisiongrupo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessComisionGrupo();
		
			int intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupo =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.comisiongrupo =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ComisionGrupoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualComisionGrupo(this.comisiongrupo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = comisiongrupoValidator.getInvalidValues(this.comisiongrupo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			comisiongrupoLogic.setDatosCliente(datosCliente);
			comisiongrupoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				comisiongrupoAux=new  ComisionGrupo();
				
				comisiongrupoAux.setIsNew(true);
				comisiongrupoAux.setIsChanged(true);
				
				comisiongrupoAux.setComisionGrupoOriginal(this.comisiongrupo);
				
				comisiongrupoAux.setId(this.comisiongrupo.getId());	
				comisiongrupoAux.setVersionRow(this.comisiongrupo.getVersionRow());	
				comisiongrupoAux.setid_empresa(this.comisiongrupo.getid_empresa());	
				comisiongrupoAux.setid_comision_config(this.comisiongrupo.getid_comision_config());	
				comisiongrupoAux.setid_vendedor(this.comisiongrupo.getid_vendedor());	
				comisiongrupoAux.setid_linea(this.comisiongrupo.getid_linea());	
				comisiongrupoAux.setid_linea_grupo(this.comisiongrupo.getid_linea_grupo());	
				comisiongrupoAux.setid_estado_comision(this.comisiongrupo.getid_estado_comision());	
				comisiongrupoAux.setporcentaje(this.comisiongrupo.getporcentaje());	
				comisiongrupoAux.setdescripcion(this.comisiongrupo.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.comisiongrupoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.comisiongrupoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(comisiongrupoAux,comisiongrupoLogic.getComisionGrupos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisiongrupoAux,comisiongrupos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.comisiongrupoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.comisiongrupoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisiongrupoLogic.saveComisionGrupos();//WithConnection
						//comisiongrupoLogic.getSetVersionRowComisionGrupos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.comisiongrupo,comisiongrupoAux);
					
					this.refrescarForeignKeysDescripcionesComisionGrupo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.comisiongrupoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								comisiongrupoLogic.saveComisionGrupoRelaciones(comisiongrupoAux);//WithConnection
								//comisiongrupoLogic.getSetVersionRowComisionGrupos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.comisiongrupo,comisiongrupoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.comisiongrupoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.comisiongrupoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(comisiongrupoAux,comisiongrupoLogic.getComisionGrupos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(comisiongrupoAux,comisiongrupos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.comisiongrupo,comisiongrupoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				comisiongrupoAux=new  ComisionGrupo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.comisiongrupoSessionBean.getEsGuardarRelacionado() 
					|| (this.comisiongrupoSessionBean.getEsGuardarRelacionado() && this.comisiongrupo.getId()>=0)) {
						
					comisiongrupoAux.setIsNew(false);
				}
				
				comisiongrupoAux.setIsDeleted(false);
			
				comisiongrupoAux.setId(this.comisiongrupo.getId());	
				comisiongrupoAux.setVersionRow(this.comisiongrupo.getVersionRow());	
				comisiongrupoAux.setid_empresa(this.comisiongrupo.getid_empresa());	
				comisiongrupoAux.setid_comision_config(this.comisiongrupo.getid_comision_config());	
				comisiongrupoAux.setid_vendedor(this.comisiongrupo.getid_vendedor());	
				comisiongrupoAux.setid_linea(this.comisiongrupo.getid_linea());	
				comisiongrupoAux.setid_linea_grupo(this.comisiongrupo.getid_linea_grupo());	
				comisiongrupoAux.setid_estado_comision(this.comisiongrupo.getid_estado_comision());	
				comisiongrupoAux.setporcentaje(this.comisiongrupo.getporcentaje());	
				comisiongrupoAux.setdescripcion(this.comisiongrupo.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(comisiongrupoAux,comisiongrupoLogic.getComisionGrupos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisiongrupoAux,comisiongrupos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.comisiongrupoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.comisiongrupoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisiongrupoLogic.saveComisionGrupos();//WithConnection
						//comisiongrupoLogic.getSetVersionRowComisionGrupos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.comisiongrupo,comisiongrupoAux);
					
					this.refrescarForeignKeysDescripcionesComisionGrupo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.comisiongrupoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								comisiongrupoLogic.saveComisionGrupoRelaciones(comisiongrupoAux);//WithConnection
								//comisiongrupoLogic.getSetVersionRowComisionGrupos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.comisiongrupo,comisiongrupoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.comisiongrupoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.comisiongrupoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(comisiongrupoAux,comisiongrupoLogic.getComisionGrupos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(comisiongrupoAux,comisiongrupos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.comisiongrupo,comisiongrupoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				comisiongrupoAux=new  ComisionGrupo();
				
				comisiongrupoAux.setIsNew(false);
				comisiongrupoAux.setIsChanged(false);
				
				comisiongrupoAux.setIsDeleted(true);
				
				comisiongrupoAux.setId(this.comisiongrupo.getId());	
				comisiongrupoAux.setVersionRow(this.comisiongrupo.getVersionRow());	
				comisiongrupoAux.setid_empresa(this.comisiongrupo.getid_empresa());	
				comisiongrupoAux.setid_comision_config(this.comisiongrupo.getid_comision_config());	
				comisiongrupoAux.setid_vendedor(this.comisiongrupo.getid_vendedor());	
				comisiongrupoAux.setid_linea(this.comisiongrupo.getid_linea());	
				comisiongrupoAux.setid_linea_grupo(this.comisiongrupo.getid_linea_grupo());	
				comisiongrupoAux.setid_estado_comision(this.comisiongrupo.getid_estado_comision());	
				comisiongrupoAux.setporcentaje(this.comisiongrupo.getporcentaje());	
				comisiongrupoAux.setdescripcion(this.comisiongrupo.getdescripcion());	
				
				if(this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.comisiongrupoAux.getId()>=0) {	
						this.comisiongruposEliminados.add(comisiongrupoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(comisiongrupoAux,comisiongrupoLogic.getComisionGrupos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisiongrupoAux,comisiongrupos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.comisiongrupoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.comisiongrupoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisiongrupoLogic.saveComisionGrupos();//WithConnection
						//comisiongrupoLogic.getSetVersionRowComisionGrupos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.comisiongrupoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								comisiongrupoLogic.saveComisionGrupoRelaciones(comisiongrupoAux);//WithConnection
								//comisiongrupoLogic.getSetVersionRowComisionGrupos();//WithConnection
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
							if(this.comisiongrupoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.comisiongrupoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(comisiongrupoAux,comisiongrupoLogic.getComisionGrupos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(comisiongrupoAux,comisiongrupos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.getComisionGrupos().addAll(this.comisiongruposEliminados);
					
					comisiongrupoLogic.saveComisionGrupos();//WithConnection
					//comisiongrupoLogic.getSetVersionRowComisionGrupos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesComisionGrupo();
				
				this.comisiongruposEliminados= new ArrayList<ComisionGrupo>();		
			}
			
			if(this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Comision Grupo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Comision Grupo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.comisiongrupo=comisiongrupoAux;
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
      		//this.finishProcessComisionGrupo();
      	}
		
	}	
	
	public void actualizarRelaciones(ComisionGrupo comisiongrupoLocal) throws Exception {
		
		if(this.comisiongrupoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ComisionGrupo comisiongrupoLocal) throws Exception {	
		if(this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				comisiongrupoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ComisionConfigDetalleFormJInternalFrame.class)) {
				ComisionConfigBeanSwingJInternalFrame comisionconfigBeanSwingJInternalFrameLocal=(ComisionConfigBeanSwingJInternalFrame) ((ComisionConfigDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				comisionconfigBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoComisionConfig(comisionconfigBeanSwingJInternalFrameLocal.getcomisionconfig(),true);
				comisionconfigBeanSwingJInternalFrameLocal.actualizarLista(comisionconfigBeanSwingJInternalFrameLocal.comisionconfig,this.comisionconfigsForeignKey);

				comisionconfigBeanSwingJInternalFrameLocal.actualizarRelaciones(comisionconfigBeanSwingJInternalFrameLocal.comisionconfig);

				comisiongrupoLocal.setComisionConfig(comisionconfigBeanSwingJInternalFrameLocal.comisionconfig);

				this.addItemDefectoCombosForeignKeyComisionConfig();
				this.cargarCombosFrameComisionConfigsForeignKey("Formulario");
				this.setActualComisionConfigForeignKey(comisionconfigBeanSwingJInternalFrameLocal.comisionconfig.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(VendedorDetalleFormJInternalFrame.class)) {
				VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrameLocal=(VendedorBeanSwingJInternalFrame) ((VendedorDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				vendedorBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoVendedor(vendedorBeanSwingJInternalFrameLocal.getvendedor(),true);
				vendedorBeanSwingJInternalFrameLocal.actualizarLista(vendedorBeanSwingJInternalFrameLocal.vendedor,this.vendedorsForeignKey);

				vendedorBeanSwingJInternalFrameLocal.actualizarRelaciones(vendedorBeanSwingJInternalFrameLocal.vendedor);

				comisiongrupoLocal.setVendedor(vendedorBeanSwingJInternalFrameLocal.vendedor);

				this.addItemDefectoCombosForeignKeyVendedor();
				this.cargarCombosFrameVendedorsForeignKey("Formulario");
				this.setActualVendedorForeignKey(vendedorBeanSwingJInternalFrameLocal.vendedor.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineaBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineaBeanSwingJInternalFrameLocal.getlinea(),true);
				lineaBeanSwingJInternalFrameLocal.actualizarLista(lineaBeanSwingJInternalFrameLocal.linea,this.lineasForeignKey);

				lineaBeanSwingJInternalFrameLocal.actualizarRelaciones(lineaBeanSwingJInternalFrameLocal.linea);

				comisiongrupoLocal.setLinea(lineaBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLinea();
				this.cargarCombosFrameLineasForeignKey("Formulario");
				this.setActualLineaForeignKey(lineaBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(LineaDetalleFormJInternalFrame.class)) {
				LineaBeanSwingJInternalFrame lineagrupoBeanSwingJInternalFrameLocal=(LineaBeanSwingJInternalFrame) ((LineaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				lineagrupoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoLinea(lineagrupoBeanSwingJInternalFrameLocal.getlinea(),true);
				lineagrupoBeanSwingJInternalFrameLocal.actualizarLista(lineagrupoBeanSwingJInternalFrameLocal.linea,this.lineagruposForeignKey);

				lineagrupoBeanSwingJInternalFrameLocal.actualizarRelaciones(lineagrupoBeanSwingJInternalFrameLocal.linea);

				comisiongrupoLocal.setLineaGrupo(lineagrupoBeanSwingJInternalFrameLocal.linea);

				this.addItemDefectoCombosForeignKeyLineaGrupo();
				this.cargarCombosFrameLineaGruposForeignKey("Formulario");
				this.setActualLineaGrupoForeignKey(lineagrupoBeanSwingJInternalFrameLocal.linea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstadoComisionDetalleFormJInternalFrame.class)) {
				EstadoComisionBeanSwingJInternalFrame estadocomisionBeanSwingJInternalFrameLocal=(EstadoComisionBeanSwingJInternalFrame) ((EstadoComisionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estadocomisionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstadoComision(estadocomisionBeanSwingJInternalFrameLocal.getestadocomision(),true);
				estadocomisionBeanSwingJInternalFrameLocal.actualizarLista(estadocomisionBeanSwingJInternalFrameLocal.estadocomision,this.estadocomisionsForeignKey);

				estadocomisionBeanSwingJInternalFrameLocal.actualizarRelaciones(estadocomisionBeanSwingJInternalFrameLocal.estadocomision);

				comisiongrupoLocal.setEstadoComision(estadocomisionBeanSwingJInternalFrameLocal.estadocomision);

				this.addItemDefectoCombosForeignKeyEstadoComision();
				this.cargarCombosFrameEstadoComisionsForeignKey("Formulario");
				this.setActualEstadoComisionForeignKey(estadocomisionBeanSwingJInternalFrameLocal.estadocomision.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarComisionGrupoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.comisiongrupo =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.comisiongrupo =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = comisiongrupoValidator.getInvalidValues(this.comisiongrupo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ComisionGrupo comisiongrupo,List<ComisionGrupo> comisiongrupos) throws Exception {
		try	{		
			ComisionGrupoConstantesFunciones.actualizarLista(comisiongrupo,comisiongrupos,this.comisiongrupoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ComisionGrupo comisiongrupo,List<ComisionGrupo> comisiongrupos) throws Exception {
		try	{			
			ComisionGrupoConstantesFunciones.actualizarSelectedLista(comisiongrupo,comisiongrupos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ComisionGrupo> comisiongruposLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				comisiongruposLocal=this.comisiongrupoLogic.getComisionGrupos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				comisiongruposLocal=this.comisiongrupos;
			}
			//ARCHITECTURE
		
			for(ComisionGrupo comisiongrupoLocal:comisiongruposLocal) {
				if(this.permiteMantenimiento(comisiongrupoLocal) && comisiongrupoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ComisionGrupoConstantesFunciones.getComisionGrupoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ComisionGrupoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionGrupo.jLabelid_empresaComisionGrupo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionGrupoConstantesFunciones.IDCOMISIONCONFIG)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionGrupo.jLabelid_comision_configComisionGrupo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionGrupoConstantesFunciones.IDVENDEDOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionGrupo.jLabelid_vendedorComisionGrupo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionGrupoConstantesFunciones.IDLINEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionGrupo.jLabelid_lineaComisionGrupo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionGrupoConstantesFunciones.IDLINEAGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionGrupo.jLabelid_linea_grupoComisionGrupo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionGrupoConstantesFunciones.IDESTADOCOMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionGrupo.jLabelid_estado_comisionComisionGrupo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionGrupoConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionGrupo.jLabelporcentajeComisionGrupo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionGrupoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionGrupo.jLabeldescripcionComisionGrupo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionGrupo.jLabelid_empresaComisionGrupo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionGrupo.jLabelid_comision_configComisionGrupo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionGrupo.jLabelid_vendedorComisionGrupo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionGrupo.jLabelid_lineaComisionGrupo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionGrupo.jLabelid_linea_grupoComisionGrupo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionGrupo.jLabelid_estado_comisionComisionGrupo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionGrupo.jLabelporcentajeComisionGrupo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionGrupo.jLabeldescripcionComisionGrupo,"");
		
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
		this.iIdNuevoComisionGrupo--;	
		
		
		this.comisiongrupoAux=new ComisionGrupo();
		
		this.comisiongrupoAux.setId(this.iIdNuevoComisionGrupo);
		this.comisiongrupoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.comisiongrupoLogic.getComisionGrupos().add(this.comisiongrupoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.comisiongrupos.add(this.comisiongrupoAux);
		}
		//ARCHITECTURE
		
		this.comisiongrupo=this.comisiongrupoAux;
		
		if(ComisionGrupoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioComisionGrupo(this.comisiongrupo);
			this.setVariablesObjetoActualToFormularioForeignKeyComisionGrupo(this.comisiongrupo);
		}
				
		//this.setDefaultControlesComisionGrupo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyComisionGrupo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyComisionGrupo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyComisionGrupo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualComisionGrupo(this.comisiongrupoBean,this.comisiongrupo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ComisionGrupoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.comisiongrupoSessionBean.getConGuardarRelaciones()) {
			classes=ComisionGrupoConstantesFunciones.getClassesRelationshipsOfComisionGrupo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.comisiongrupoReturnGeneral=comisiongrupoLogic.procesarEventosComisionGruposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comisiongrupoLogic.getComisionGrupos(),this.comisiongrupo,this.comisiongrupoParameterGeneral,this.isEsNuevoComisionGrupo,classes);//this.comisiongrupoLogic.getComisionGrupo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanComisionGrupo(this.comisiongrupoReturnGeneral,this.comisiongrupoBean,false);
		
		if(this.comisiongrupoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyComisionGrupo(this.comisiongrupoReturnGeneral.getComisionGrupo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioComisionGrupo(this.comisiongrupoReturnGeneral.getComisionGrupo());
		}
		
		if(this.comisiongrupoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioComisionGrupo(this.comisiongrupoReturnGeneral.getComisionGrupo(),classes);//this.comisiongrupoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualComisionGrupo(this.comisiongrupo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyComisionGrupo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyComisionGrupo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ComisionGrupoBeanSwingJInternalFrameAdditional.RecargarFormComisionGrupo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingComisionGrupo(false);
						
			if(comisiongrupoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ComisionGrupoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComisionGrupo();
			}
			
			this.actualizarVisualTableDatosComisionGrupo();
			
			this.jTableDatosComisionGrupo.setRowSelectionInterval(this.getIndiceNuevoComisionGrupo(), this.getIndiceNuevoComisionGrupo());
			
			this.seleccionarFilaTablaComisionGrupoActual();
						
			this.actualizarEstadoCeldasBotonesComisionGrupo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesComisionGrupo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormComisionGrupo.jTextFieldporcentajeComisionGrupo.setEnabled(isHabilitar && this.comisiongrupoConstantesFunciones.activarporcentajeComisionGrupo);
		this.jInternalFrameDetalleFormComisionGrupo.jTextAreadescripcionComisionGrupo.setEnabled(isHabilitar && this.comisiongrupoConstantesFunciones.activardescripcionComisionGrupo);	
		//
		this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_empresaComisionGrupo.setEnabled(isHabilitar && this.comisiongrupoConstantesFunciones.activarid_empresaComisionGrupo);
		this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_comision_configComisionGrupo.setEnabled(isHabilitar && this.comisiongrupoConstantesFunciones.activarid_comision_configComisionGrupo);
		this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_vendedorComisionGrupo.setEnabled(isHabilitar && this.comisiongrupoConstantesFunciones.activarid_vendedorComisionGrupo);
		this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_lineaComisionGrupo.setEnabled(isHabilitar && this.comisiongrupoConstantesFunciones.activarid_lineaComisionGrupo);
		this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_linea_grupoComisionGrupo.setEnabled(isHabilitar && this.comisiongrupoConstantesFunciones.activarid_linea_grupoComisionGrupo);
		this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_estado_comisionComisionGrupo.setEnabled(isHabilitar && this.comisiongrupoConstantesFunciones.activarid_estado_comisionComisionGrupo);
	};
	
	public void setDefaultControlesComisionGrupo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoComisionGrupo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.comisiongrupoSessionBean.setConGuardarRelaciones(true);			
			this.comisiongrupoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormComisionGrupo.jTabbedPaneRelacionesComisionGrupo.setVisible(true);
			
					
		} else {
			//this.comisiongrupoSessionBean.setConGuardarRelaciones(false);			
			this.comisiongrupoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormComisionGrupo.jTabbedPaneRelacionesComisionGrupo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoComisionGrupo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionGrupo comisiongrupoAux:this.comisiongrupoLogic.getComisionGrupos()) {
				if(comisiongrupoAux.getId().equals(this.iIdNuevoComisionGrupo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionGrupo comisiongrupoAux:this.comisiongrupos) {
				if(comisiongrupoAux.getId().equals(this.iIdNuevoComisionGrupo)) {
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
	
	public int getIndiceActualComisionGrupo(ComisionGrupo comisiongrupo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionGrupo comisiongrupoAux:this.comisiongrupoLogic.getComisionGrupos()) {
				if(comisiongrupoAux.getId().equals(comisiongrupo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionGrupo comisiongrupoAux:this.comisiongrupos) {
				if(comisiongrupoAux.getId().equals(comisiongrupo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalComisionGrupo(ComisionGrupo comisiongrupoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionGrupo comisiongrupoAux:this.comisiongrupoLogic.getComisionGrupos()) {
				if(comisiongrupoAux.getComisionGrupoOriginal().getId().equals(comisiongrupoOriginal.getId())) {
					existe=true;
					comisiongrupoOriginal.setId(comisiongrupoAux.getId());
					comisiongrupoOriginal.setVersionRow(comisiongrupoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionGrupo comisiongrupoAux:this.comisiongrupos) {
				if(comisiongrupoAux.getComisionGrupoOriginal().getId().equals(comisiongrupoOriginal.getId())) {
					existe=true;
					comisiongrupoOriginal.setId(comisiongrupoAux.getId());
					comisiongrupoOriginal.setVersionRow(comisiongrupoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosComisionGrupo(Boolean esParaCancelar) throws Exception {
		comisiongruposAux=new ArrayList<ComisionGrupo>();
		comisiongrupoAux=new ComisionGrupo();
		
		if(!this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ComisionGrupo comisiongrupoAux:this.comisiongrupoLogic.getComisionGrupos()) {
					if(comisiongrupoAux.getId()<0) {
						comisiongruposAux.add(comisiongrupoAux);
					}		
				}
				this.iIdNuevoComisionGrupo=0L;
				this.comisiongrupoLogic.getComisionGrupos().removeAll(comisiongruposAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComisionGrupo comisiongrupoAux:this.comisiongrupos) {
					if(comisiongrupoAux.getId()<0) {
						comisiongruposAux.add(comisiongrupoAux);
					}		
				}
				this.iIdNuevoComisionGrupo=0L;
				this.comisiongrupos.removeAll(comisiongruposAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoComisionGrupo 
					&& this.comisiongrupoLogic.getComisionGrupos().size()>0
					) {
					comisiongrupoAux=this.comisiongrupoLogic.getComisionGrupos().get(this.comisiongrupoLogic.getComisionGrupos().size() - 1);
				
					if(comisiongrupoAux.getId()<0) {
						this.comisiongrupoLogic.getComisionGrupos().remove(comisiongrupoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoComisionGrupo && this.comisiongrupos.size()>0) {
					comisiongrupoAux=this.comisiongrupos.get(this.comisiongrupos.size() - 1);
				
					if(comisiongrupoAux.getId()<0) {
						this.comisiongrupos.remove(comisiongrupoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoComisionGrupo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(comisiongrupo.getId()<0) {
				this.comisiongrupoLogic.getComisionGrupos().remove(this.comisiongrupo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(comisiongrupo.getId()<0) {
				this.comisiongrupos.remove(this.comisiongrupo);
			}
		}			
	}
	
	public void setEstadosInicialesComisionGrupo(List<ComisionGrupo> comisiongruposAux) throws Exception {
		ComisionGrupoConstantesFunciones.setEstadosInicialesComisionGrupo(comisiongruposAux);
	}
	
	public void setEstadosInicialesComisionGrupo(ComisionGrupo comisiongrupoAux) throws Exception {
		ComisionGrupoConstantesFunciones.setEstadosInicialesComisionGrupo(comisiongrupoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarComisionGrupoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesComisionGrupo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarComisionGrupoActual()) {
				if(!this.isEsNuevoComisionGrupo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesComisionGrupo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoComisionGrupo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarComisionGrupoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Comision Grupo ?", "MANTENIMIENTO DE Comision Grupo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesComisionGrupo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ComisionGrupo comisiongrupo) throws Exception {
		ComisionGrupoConstantesFunciones.seleccionarAsignar(this.comisiongrupo,comisiongrupo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarComisionGrupo=this.isPermisoActualizarOriginalComisionGrupo;
			
			
			this.seleccionarAsignar(comisiongrupo);
			
			

			idVendedorActual=comisiongrupo.getid_vendedor();
			this.seleccionarVendedorActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ComisionGrupoConstantesFunciones.quitarEspaciosComisionGrupo(this.comisiongrupo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesComisionGrupo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.comisiongrupoSessionBean.setsFuncionBusquedaRapida(this.comisiongrupoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoComisionGrupo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosComisionGrupo(esParaCancelar);				
				this.cancelarNuevoComisionGrupo(esParaCancelar);								
			}
			
			this.comisiongrupo=new ComisionGrupo();
			
			this.inicializarComisionGrupo();
			
			this.actualizarEstadoCeldasBotonesComisionGrupo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarComisionGrupo() throws Exception {
		try {
			ComisionGrupoConstantesFunciones.inicializarComisionGrupo(this.comisiongrupo);
			
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
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.comisiongrupoLogic.getComisionGrupos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteComisionGrupos(String sAccionBusqueda,List<ComisionGrupo> comisiongruposParaReportes) throws Exception {
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
					sPathReporteFinal="ComisionGrupo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ComisionGrupoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ComisionGrupoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ComisionGrupo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Comision Grupos");		
		parameters.put("busquedapor", ComisionGrupoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceComisionGrupo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ComisionGrupoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ComisionGrupoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceComisionGrupo=new JRBeanArrayDataSource(ComisionGrupoJInternalFrame.TraerComisionGrupoBeans(comisiongruposParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceComisionGrupo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ComisionGrupoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ComisionGrupoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ComisionGrupoBean.TraerComisionGrupoBeans(comisiongruposParaReportes).toArray()));
							
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
				this.generarExcelReporteComisionGrupos(sAccionBusqueda,sTipoArchivoReporte,comisiongruposParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalComisionGrupos(sAccionBusqueda,sTipoArchivoReporte,comisiongruposParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoComisionGrupoActionPerformed(null);
					//this.generarExcelReporteComisionGrupos(sAccionBusqueda,sTipoArchivoReporte,comisiongruposParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalComisionGrupos(sAccionBusqueda,sTipoArchivoReporte,comisiongruposParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesComisionGrupos(sAccionBusqueda,sTipoArchivoReporte,comisiongruposParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesComisionGrupos(sAccionBusqueda,sTipoArchivoReporte,comisiongruposParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteComisionGrupos(String sAccionBusqueda,String sTipoArchivoReporte,List<ComisionGrupo> comisiongruposParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisiongrupo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComisionGrupos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderComisionGrupo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ComisionGrupo comisiongrupo : comisiongruposParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ComisionGrupoConstantesFunciones.generarExcelReporteDataComisionGrupo("NORMAL",row,workbook,comisiongrupo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Grupo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderComisionGrupo(String sTipo,Row row,Workbook workbook) {
		
		ComisionGrupoConstantesFunciones.generarExcelReporteHeaderComisionGrupo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalComisionGrupos(String sAccionBusqueda,String sTipoArchivoReporte,List<ComisionGrupo> comisiongruposParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisiongrupo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComisionGrupos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ComisionGrupo comisiongrupo : comisiongruposParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ComisionGrupoConstantesFunciones.getComisionGrupoDescripcion(comisiongrupo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionGrupoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionGrupoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisiongrupo.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionGrupoConstantesFunciones.LABEL_IDCOMISIONCONFIG))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionGrupoConstantesFunciones.LABEL_IDCOMISIONCONFIG);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisiongrupo.getcomisionconfig_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionGrupoConstantesFunciones.LABEL_IDVENDEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionGrupoConstantesFunciones.LABEL_IDVENDEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisiongrupo.getvendedor_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionGrupoConstantesFunciones.LABEL_IDLINEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionGrupoConstantesFunciones.LABEL_IDLINEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisiongrupo.getlinea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionGrupoConstantesFunciones.LABEL_IDLINEAGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionGrupoConstantesFunciones.LABEL_IDLINEAGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisiongrupo.getlineagrupo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionGrupoConstantesFunciones.LABEL_IDESTADOCOMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionGrupoConstantesFunciones.LABEL_IDESTADOCOMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisiongrupo.getestadocomision_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionGrupoConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionGrupoConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisiongrupo.getporcentaje());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionGrupoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionGrupoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisiongrupo.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Grupo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesComisionGrupos(String sAccionBusqueda,String sTipoArchivoReporte,List<ComisionGrupo> comisiongruposParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ComisionGrupo> comisiongruposRespaldo=null;
		
		classes=ComisionGrupoConstantesFunciones.getClassesRelationshipsOfComisionGrupo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.comisiongrupoLogic.setDatosCliente(this.datosCliente);
		this.comisiongrupoLogic.setDatosDeep(this.datosDeep);
		this.comisiongrupoLogic.setIsConDeep(true);
		
		comisiongruposRespaldo=this.comisiongrupoLogic.getComisionGrupos();
		
		this.comisiongrupoLogic.setComisionGrupos(comisiongruposParaReportes);	
		this.comisiongrupoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		comisiongruposParaReportes=this.comisiongrupoLogic.getComisionGrupos();
		this.comisiongrupoLogic.setComisionGrupos(comisiongruposRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisiongrupo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComisionGrupos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderComisionGrupo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ComisionGrupo comisiongrupo : comisiongruposParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderComisionGrupo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ComisionGrupoConstantesFunciones.generarExcelReporteDataComisionGrupo("NORMAL",row,workbook,comisiongrupo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ComisionGrupoConstantesFunciones.getComisionGrupoDescripcion(comisiongrupo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Grupo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoComisionGrupo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionGrupo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoComisionGrupo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionGrupo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessComisionGrupo() throws Exception {		
		this.startProcessComisionGrupo(true);
	}
	
	public void startProcessComisionGrupo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasComisionGrupo ,this.jPanelParametrosReportesComisionGrupo, this.jScrollPanelDatosComisionGrupo,this.jPanelPaginacionComisionGrupo, this.jScrollPanelDatosEdicionComisionGrupo, this.jPanelAccionesComisionGrupo,this.jPanelAccionesFormularioComisionGrupo,this.jmenuBarComisionGrupo,this.jmenuBarDetalleComisionGrupo,this.jTtoolBarComisionGrupo,this.jTtoolBarDetalleComisionGrupo);		
		
		final JTabbedPane jTabbedPaneBusquedasComisionGrupo=this.jTabbedPaneBusquedasComisionGrupo; 
		
		final JPanel jPanelParametrosReportesComisionGrupo=this.jPanelParametrosReportesComisionGrupo;
		//final JScrollPane jScrollPanelDatosComisionGrupo=this.jScrollPanelDatosComisionGrupo;
		final JTable jTableDatosComisionGrupo=this.jTableDatosComisionGrupo;		
		final JPanel jPanelPaginacionComisionGrupo=this.jPanelPaginacionComisionGrupo;
		//final JScrollPane jScrollPanelDatosEdicionComisionGrupo=this.jScrollPanelDatosEdicionComisionGrupo;
		final JPanel jPanelAccionesComisionGrupo=this.jPanelAccionesComisionGrupo;
		
		JPanel jPanelCamposAuxiliarComisionGrupo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarComisionGrupo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
			jPanelCamposAuxiliarComisionGrupo=this.jInternalFrameDetalleFormComisionGrupo.jPanelCamposComisionGrupo;
			jPanelAccionesFormularioAuxiliarComisionGrupo=this.jInternalFrameDetalleFormComisionGrupo.jPanelAccionesFormularioComisionGrupo;
		}
		
		final JPanel jPanelCamposComisionGrupo=jPanelCamposAuxiliarComisionGrupo;
		final JPanel jPanelAccionesFormularioComisionGrupo=jPanelAccionesFormularioAuxiliarComisionGrupo;
		
		
		final JMenuBar jmenuBarComisionGrupo=this.jmenuBarComisionGrupo;
		final JToolBar jTtoolBarComisionGrupo=this.jTtoolBarComisionGrupo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarComisionGrupo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarComisionGrupo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
			jmenuBarDetalleAuxiliarComisionGrupo=this.jInternalFrameDetalleFormComisionGrupo.jmenuBarDetalleComisionGrupo;
			jTtoolBarDetalleAuxiliarComisionGrupo=this.jInternalFrameDetalleFormComisionGrupo.jTtoolBarDetalleComisionGrupo;
		}
		
		final JMenuBar jmenuBarDetalleComisionGrupo=jmenuBarDetalleAuxiliarComisionGrupo;
		final JToolBar jTtoolBarDetalleComisionGrupo=jTtoolBarDetalleAuxiliarComisionGrupo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasComisionGrupo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesComisionGrupo;
			processRunnable.jTableDatos=jTableDatosComisionGrupo;
			processRunnable.jPanelCampos=jPanelCamposComisionGrupo;
			processRunnable.jPanelPaginacion=jPanelPaginacionComisionGrupo;
			processRunnable.jPanelAcciones=jPanelAccionesComisionGrupo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioComisionGrupo;
			
			
			processRunnable.jmenuBar=jmenuBarComisionGrupo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleComisionGrupo;
			processRunnable.jTtoolBar=jTtoolBarComisionGrupo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleComisionGrupo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasComisionGrupo ,jPanelParametrosReportesComisionGrupo,jTableDatosComisionGrupo, /*jScrollPanelDatosComisionGrupo,*/jPanelCamposComisionGrupo,jPanelPaginacionComisionGrupo, /*jScrollPanelDatosEdicionComisionGrupo,*/ jPanelAccionesComisionGrupo,jPanelAccionesFormularioComisionGrupo,jmenuBarComisionGrupo,jmenuBarDetalleComisionGrupo,jTtoolBarComisionGrupo,jTtoolBarDetalleComisionGrupo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasComisionGrupo ,jPanelParametrosReportesComisionGrupo, jScrollPanelDatosComisionGrupo,jPanelPaginacionComisionGrupo, jScrollPanelDatosEdicionComisionGrupo, jPanelAccionesComisionGrupo,jPanelAccionesFormularioComisionGrupo,jmenuBarComisionGrupo,jmenuBarDetalleComisionGrupo,jTtoolBarComisionGrupo,jTtoolBarDetalleComisionGrupo);
						
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
	
	public void finishProcessComisionGrupo() {// throws Exception 
		this.finishProcessComisionGrupo(true);
	}
	
	public void finishProcessComisionGrupo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasComisionGrupo ,this.jPanelParametrosReportesComisionGrupo, this.jScrollPanelDatosComisionGrupo,this.jPanelPaginacionComisionGrupo, this.jScrollPanelDatosEdicionComisionGrupo, this.jPanelAccionesComisionGrupo,this.jPanelAccionesFormularioComisionGrupo,this.jmenuBarComisionGrupo,this.jmenuBarDetalleComisionGrupo,this.jTtoolBarComisionGrupo,this.jTtoolBarDetalleComisionGrupo);		
		
		final JTabbedPane jTabbedPaneBusquedasComisionGrupo=this.jTabbedPaneBusquedasComisionGrupo; 
		
		final JPanel jPanelParametrosReportesComisionGrupo=this.jPanelParametrosReportesComisionGrupo;
		//final JScrollPane jScrollPanelDatosComisionGrupo=this.jScrollPanelDatosComisionGrupo;
		final JTable jTableDatosComisionGrupo=this.jTableDatosComisionGrupo;		
		final JPanel jPanelPaginacionComisionGrupo=this.jPanelPaginacionComisionGrupo;
		//final JScrollPane jScrollPanelDatosEdicionComisionGrupo=this.jScrollPanelDatosEdicionComisionGrupo;
		final JPanel jPanelAccionesComisionGrupo=this.jPanelAccionesComisionGrupo;
		
		JPanel jPanelCamposAuxiliarComisionGrupo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarComisionGrupo=new JPanel();
		
		if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
			jPanelCamposAuxiliarComisionGrupo=this.jInternalFrameDetalleFormComisionGrupo.jPanelCamposComisionGrupo;
			jPanelAccionesFormularioAuxiliarComisionGrupo=this.jInternalFrameDetalleFormComisionGrupo.jPanelAccionesFormularioComisionGrupo;
		}
		
		final JPanel jPanelCamposComisionGrupo=jPanelCamposAuxiliarComisionGrupo;
		final JPanel jPanelAccionesFormularioComisionGrupo=jPanelAccionesFormularioAuxiliarComisionGrupo;
		
		
		final JMenuBar jmenuBarComisionGrupo=this.jmenuBarComisionGrupo;		
		final JToolBar jTtoolBarComisionGrupo=this.jTtoolBarComisionGrupo;
				
		JMenuBar jmenuBarDetalleAuxiliarComisionGrupo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarComisionGrupo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
			jmenuBarDetalleAuxiliarComisionGrupo=this.jInternalFrameDetalleFormComisionGrupo.jmenuBarDetalleComisionGrupo;
			jTtoolBarDetalleAuxiliarComisionGrupo=this.jInternalFrameDetalleFormComisionGrupo.jTtoolBarDetalleComisionGrupo;		
		}
		
		final JMenuBar jmenuBarDetalleComisionGrupo=jmenuBarDetalleAuxiliarComisionGrupo;
		final JToolBar jTtoolBarDetalleComisionGrupo=jTtoolBarDetalleAuxiliarComisionGrupo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasComisionGrupo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesComisionGrupo;
			processRunnable.jTableDatos=jTableDatosComisionGrupo;
			processRunnable.jPanelCampos=jPanelCamposComisionGrupo;
			processRunnable.jPanelPaginacion=jPanelPaginacionComisionGrupo;
			processRunnable.jPanelAcciones=jPanelAccionesComisionGrupo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioComisionGrupo;
			
			
			processRunnable.jmenuBar=jmenuBarComisionGrupo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleComisionGrupo;
			processRunnable.jTtoolBar=jTtoolBarComisionGrupo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleComisionGrupo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasComisionGrupo ,jPanelParametrosReportesComisionGrupo, jTableDatosComisionGrupo,/*jScrollPanelDatosComisionGrupo,*/jPanelCamposComisionGrupo,jPanelPaginacionComisionGrupo, /*jScrollPanelDatosEdicionComisionGrupo,*/ jPanelAccionesComisionGrupo,jPanelAccionesFormularioComisionGrupo,jmenuBarComisionGrupo,jmenuBarDetalleComisionGrupo,jTtoolBarComisionGrupo,jTtoolBarDetalleComisionGrupo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesComisionGrupo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarComisionGrupo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuComisionGrupo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarComisionGrupo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarComisionGrupo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleComisionGrupo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuComisionGrupo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarComisionGrupo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleComisionGrupo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.comisiongrupoConstantesFunciones.getsFinalQueryComisionGrupo();
		String  finalQueryPaginacionTodos=this.comisiongrupoConstantesFunciones.getsFinalQueryComisionGrupo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ComisionGrupoConstantesFunciones.getArrayColumnasGlobalesNoComisionGrupo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ComisionGrupoConstantesFunciones.getArrayColumnasGlobalesComisionGrupo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ComisionGrupoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.comisiongruposEliminados= new ArrayList<ComisionGrupo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessComisionGrupo();
		
				///*ComisionGrupoSessionBean*/this.comisiongrupoSessionBean=new ComisionGrupoSessionBean();
			
			if(this.comisiongrupoSessionBean==null) {
				this.comisiongrupoSessionBean=new ComisionGrupoSessionBean();
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
					this.iNumeroPaginacion=ComisionGrupoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ComisionGrupoConstantesFunciones.getClassesForeignKeysOfComisionGrupo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/comisiongrupo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			comisiongruposAux= new ArrayList<ComisionGrupo>();
			
				
			comisiongrupoLogic.setDatosCliente(this.datosCliente);
			comisiongrupoLogic.setDatosDeep(this.datosDeep);
			comisiongrupoLogic.setIsConDeep(true);
			
			
			comisiongrupoLogic.getComisionGrupoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					comisiongrupoLogic.getTodosComisionGrupos(finalQueryGlobal,pagination);
					
					//comisiongrupoLogic.getTodosComisionGruposWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(comisiongrupoLogic.getComisionGrupos()==null|| comisiongrupoLogic.getComisionGrupos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							comisiongruposAux= new ArrayList<ComisionGrupo>();
							comisiongruposAux.addAll(comisiongrupoLogic.getComisionGrupos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisiongruposAux= new ArrayList<ComisionGrupo>();
							comisiongruposAux.addAll(comisiongrupos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							comisiongrupoLogic.getTodosComisionGrupos(finalQueryGlobal+"",this.pagination);												
							
							//comisiongrupoLogic.getTodosComisionGruposWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteComisionGrupos("Todos",comisiongrupoLogic.getComisionGrupos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							comisiongrupoLogic.setComisionGrupos(new ArrayList<ComisionGrupo>());					
							comisiongrupoLogic.getComisionGrupos().addAll(comisiongruposAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisiongrupos=new ArrayList<ComisionGrupo>();
							comisiongrupos.addAll(comisiongruposAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idComisionGrupo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idComisionGrupo=this.idActual;
				
				} else if(this.idComisionGrupoActual!=null && this.idComisionGrupoActual!=0L) {
					idComisionGrupo=idComisionGrupoActual;
				}
				
					
				this.sDetalleReporte=ComisionGrupoConstantesFunciones.getDetalleIndicePorId(idComisionGrupo);
				
				this.comisiongrupos=new ArrayList<ComisionGrupo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					comisiongrupoLogic.getEntity(idComisionGrupo);
					
					//comisiongrupoLogic.getEntityWithConnection(idComisionGrupo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisiongrupoLogic.setComisionGrupos(new ArrayList<ComisionGrupo>());
					comisiongrupoLogic.getComisionGrupos().add(comisiongrupoLogic.getComisionGrupo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisiongrupos=new ArrayList<ComisionGrupo>();
					this.comisiongrupos.add(comisiongrupo);
				}
				
				if(comisiongrupoLogic.getComisionGrupo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdComisionConfig")) {
				this.sDetalleReporte=ComisionGrupoConstantesFunciones.getDetalleIndiceFK_IdComisionConfig(id_comision_configFK_IdComisionConfig);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					comisiongrupoLogic.getComisionGruposFK_IdComisionConfig(finalQueryGlobal,pagination,id_comision_configFK_IdComisionConfig);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComisionGrupoConstantesFunciones.getDetalleIndiceFK_IdComisionConfig(id_comision_configFK_IdComisionConfig);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComisionGrupoConstantesFunciones.getDetalleIndiceFK_IdComisionConfig(id_comision_configFK_IdComisionConfig);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=comisiongrupoLogic.getComisionGrupos()==null||comisiongrupoLogic.getComisionGrupos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=comisiongrupos==null|| comisiongrupos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						comisiongruposAux=new ArrayList<ComisionGrupo>();
						comisiongruposAux.addAll(comisiongrupoLogic.getComisionGrupos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisiongruposAux=new ArrayList<ComisionGrupo>();
							comisiongruposAux.addAll(comisiongrupos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							comisiongrupoLogic.getComisionGruposFK_IdComisionConfig(finalQueryGlobal,pagination,id_comision_configFK_IdComisionConfig);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComisionGrupoConstantesFunciones.getDetalleIndiceFK_IdComisionConfig(id_comision_configFK_IdComisionConfig);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComisionGrupoConstantesFunciones.getDetalleIndiceFK_IdComisionConfig(id_comision_configFK_IdComisionConfig);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteComisionGrupos("FK_IdComisionConfig",comisiongrupoLogic.getComisionGrupos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteComisionGrupos("FK_IdComisionConfig",comisiongrupos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						comisiongrupoLogic.setComisionGrupos(new ArrayList<ComisionGrupo>());
						comisiongrupoLogic.getComisionGrupos().addAll(comisiongruposAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisiongrupos=new ArrayList<ComisionGrupo>();
							comisiongrupos.addAll(comisiongruposAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ComisionGrupoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					comisiongrupoLogic.getComisionGruposFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComisionGrupoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComisionGrupoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=comisiongrupoLogic.getComisionGrupos()==null||comisiongrupoLogic.getComisionGrupos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=comisiongrupos==null|| comisiongrupos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						comisiongruposAux=new ArrayList<ComisionGrupo>();
						comisiongruposAux.addAll(comisiongrupoLogic.getComisionGrupos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisiongruposAux=new ArrayList<ComisionGrupo>();
							comisiongruposAux.addAll(comisiongrupos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							comisiongrupoLogic.getComisionGruposFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComisionGrupoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComisionGrupoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteComisionGrupos("FK_IdEmpresa",comisiongrupoLogic.getComisionGrupos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteComisionGrupos("FK_IdEmpresa",comisiongrupos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						comisiongrupoLogic.setComisionGrupos(new ArrayList<ComisionGrupo>());
						comisiongrupoLogic.getComisionGrupos().addAll(comisiongruposAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisiongrupos=new ArrayList<ComisionGrupo>();
							comisiongrupos.addAll(comisiongruposAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesComisionGrupo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessComisionGrupo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=comisiongrupoLogic.getComisionGrupos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comisiongrupos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=comisiongrupoLogic.getComisionGrupos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comisiongrupos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ComisionGrupo comisiongrupo) {
		Boolean permite=true;
		
		if(this.comisiongrupo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ComisionGrupoConstantesFunciones.getOrderByListaComisionGrupo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ComisionGrupoConstantesFunciones.getOrderByListaComisionGrupo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionGrupo comisiongrupo:comisiongrupoLogic.getComisionGrupos()) {
				if(comisiongrupo.getsType().equals(Constantes2.S_TOTALES)) {
					comisiongrupoTotales=comisiongrupo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionGrupo comisiongrupo:this.comisiongrupos) {
				if(comisiongrupo.getsType().equals(Constantes2.S_TOTALES)) {
					comisiongrupoTotales=comisiongrupo;
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
			this.comisiongrupoAux=new ComisionGrupo();
			this.comisiongrupoAux.setsType(Constantes2.S_TOTALES);
			this.comisiongrupoAux.setIsNew(false);
			this.comisiongrupoAux.setIsChanged(false);
			this.comisiongrupoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ComisionGrupoConstantesFunciones.TotalizarValoresFilaComisionGrupo(this.comisiongrupoLogic.getComisionGrupos(),this.comisiongrupoAux);
				
				this.comisiongrupoLogic.getComisionGrupos().add(this.comisiongrupoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ComisionGrupoConstantesFunciones.TotalizarValoresFilaComisionGrupo(this.comisiongrupos,this.comisiongrupoAux);
				
				this.comisiongrupos.add(this.comisiongrupoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		comisiongrupoTotales=new ComisionGrupo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.comisiongrupoLogic.getComisionGrupos().remove(comisiongrupoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.comisiongrupos.remove(comisiongrupoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		comisiongrupoTotales=new ComisionGrupo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionGrupo comisiongrupo:comisiongrupoLogic.getComisionGrupos()) {
				if(comisiongrupo.getsType().equals(Constantes2.S_TOTALES)) {
					comisiongrupoTotales=comisiongrupo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ComisionGrupoConstantesFunciones.TotalizarValoresFilaComisionGrupo(this.comisiongrupoLogic.getComisionGrupos(),comisiongrupoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionGrupo comisiongrupo:this.comisiongrupos) {
				if(comisiongrupo.getsType().equals(Constantes2.S_TOTALES)) {
					comisiongrupoTotales=comisiongrupo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ComisionGrupoConstantesFunciones.TotalizarValoresFilaComisionGrupo(this.comisiongrupos,comisiongrupoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getComisionGruposFK_IdComisionConfig()throws Exception {
		try {
			sAccionBusqueda="FK_IdComisionConfig";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComisionGruposFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComisionGruposFK_IdEstadoComision()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstadoComision";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComisionGruposFK_IdLinea()throws Exception {
		try {
			sAccionBusqueda="FK_IdLinea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComisionGruposFK_IdLineaGrupo()throws Exception {
		try {
			sAccionBusqueda="FK_IdLineaGrupo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComisionGruposFK_IdVendedor()throws Exception {
		try {
			sAccionBusqueda="FK_IdVendedor";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getComisionGruposFK_IdComisionConfig(String sFinalQuery,Long id_comision_config)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisiongrupoLogic.getComisionGruposFK_IdComisionConfig(sFinalQuery,this.pagination,id_comision_config);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComisionGruposFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisiongrupoLogic.getComisionGruposFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComisionGruposFK_IdEstadoComision(String sFinalQuery,Long id_estado_comision)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisiongrupoLogic.getComisionGruposFK_IdEstadoComision(sFinalQuery,this.pagination,id_estado_comision);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComisionGruposFK_IdLinea(String sFinalQuery,Long id_linea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisiongrupoLogic.getComisionGruposFK_IdLinea(sFinalQuery,this.pagination,id_linea);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComisionGruposFK_IdLineaGrupo(String sFinalQuery,Long id_linea_grupo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisiongrupoLogic.getComisionGruposFK_IdLineaGrupo(sFinalQuery,this.pagination,id_linea_grupo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComisionGruposFK_IdVendedor(String sFinalQuery,Long id_vendedor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisiongrupoLogic.getComisionGruposFK_IdVendedor(sFinalQuery,this.pagination,id_vendedor);
				
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
	
	public void inicializarPermisosComisionGrupo() {
		this.isPermisoTodoComisionGrupo=false;
		this.isPermisoNuevoComisionGrupo=false;
		this.isPermisoActualizarComisionGrupo=false;
		this.isPermisoActualizarOriginalComisionGrupo=false;
		this.isPermisoEliminarComisionGrupo=false;
		this.isPermisoGuardarCambiosComisionGrupo=false;
		this.isPermisoConsultaComisionGrupo=false;
		this.isPermisoBusquedaComisionGrupo=false;
		this.isPermisoReporteComisionGrupo=false;		
		this.isPermisoOrdenComisionGrupo=false;		
		this.isPermisoPaginacionMedioComisionGrupo=false;		
		this.isPermisoPaginacionAltoComisionGrupo=false;
		this.isPermisoPaginacionTodoComisionGrupo=false;
		this.isPermisoCopiarComisionGrupo=false;		
		this.isPermisoVerFormComisionGrupo=false;		
		this.isPermisoDuplicarComisionGrupo=false;		
		this.isPermisoOrdenComisionGrupo=false;		
	}
	
	public void setPermisosUsuarioComisionGrupo(Boolean isPermiso) {
		this.isPermisoTodoComisionGrupo=isPermiso;
		this.isPermisoNuevoComisionGrupo=isPermiso;
		this.isPermisoActualizarComisionGrupo=isPermiso;
		this.isPermisoActualizarOriginalComisionGrupo=isPermiso;
		this.isPermisoEliminarComisionGrupo=isPermiso;
		this.isPermisoGuardarCambiosComisionGrupo=isPermiso;
		this.isPermisoConsultaComisionGrupo=isPermiso;
		this.isPermisoBusquedaComisionGrupo=isPermiso;
		this.isPermisoReporteComisionGrupo=isPermiso;
		this.isPermisoOrdenComisionGrupo=isPermiso;		
		this.isPermisoPaginacionMedioComisionGrupo=isPermiso;		
		this.isPermisoPaginacionAltoComisionGrupo=isPermiso;		
		this.isPermisoPaginacionTodoComisionGrupo=isPermiso;		
		this.isPermisoCopiarComisionGrupo=isPermiso;		
		this.isPermisoVerFormComisionGrupo=isPermiso;		
		this.isPermisoDuplicarComisionGrupo=isPermiso;
		this.isPermisoOrdenComisionGrupo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioComisionGrupo(Boolean isPermiso) {
		//this.isPermisoTodoComisionGrupo=isPermiso;
		this.isPermisoNuevoComisionGrupo=isPermiso;
		this.isPermisoActualizarComisionGrupo=isPermiso;
		this.isPermisoActualizarOriginalComisionGrupo=isPermiso;
		this.isPermisoEliminarComisionGrupo=isPermiso;
		this.isPermisoGuardarCambiosComisionGrupo=isPermiso;
		//this.isPermisoConsultaComisionGrupo=isPermiso;
		//this.isPermisoBusquedaComisionGrupo=isPermiso;
		//this.isPermisoReporteComisionGrupo=isPermiso;
		//this.isPermisoOrdenComisionGrupo=isPermiso;		
		//this.isPermisoPaginacionMedioComisionGrupo=isPermiso;		
		//this.isPermisoPaginacionAltoComisionGrupo=isPermiso;		
		//this.isPermisoPaginacionTodoComisionGrupo=isPermiso;		
		//this.isPermisoCopiarComisionGrupo=isPermiso;		
		//this.isPermisoDuplicarComisionGrupo=isPermiso;
		//this.isPermisoOrdenComisionGrupo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioComisionGrupoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ComisionGrupoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebComisionGrupo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioComisionGrupoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioComisionGrupoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionComisionGrupoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioComisionGrupoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioComisionGrupo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ComisionGrupoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ComisionGrupoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoComisionGrupo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarComisionGrupo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalComisionGrupo=this.isPermisoActualizarComisionGrupo;
			this.isPermisoEliminarComisionGrupo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosComisionGrupo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaComisionGrupo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaComisionGrupo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoComisionGrupo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteComisionGrupo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenComisionGrupo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioComisionGrupo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoComisionGrupo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoComisionGrupo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarComisionGrupo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormComisionGrupo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarComisionGrupo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenComisionGrupo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosComisionGrupo.setToolTipText(this.jTableDatosComisionGrupo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioComisionGrupo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioComisionGrupo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ComisionGrupoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ComisionGrupoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioComisionGrupo() throws Exception {
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
	public void inicializarCombosForeignKeyComisionGrupoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.comisionconfigsForeignKey=new ArrayList();
				this.vendedorsForeignKey=new ArrayList();
				this.lineasForeignKey=new ArrayList();
				this.lineagruposForeignKey=new ArrayList();
				this.estadocomisionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyComisionGrupoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ComisionGrupoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyComisionGrupoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyComisionConfigListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyVendedorListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyLineaGrupoListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyComisionGrupoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ComisionGrupoParameterReturnGeneral comisiongrupoReturnGeneral=new ComisionGrupoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.comisiongrupoConstantesFunciones.cargarid_empresaComisionGrupo)
					 || (this.esRecargarFks && this.comisiongrupoConstantesFunciones.cargarid_empresaComisionGrupo)) {

					if(!this.comisiongrupoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+comisiongrupoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalComisionConfig="";

				if(((this.comisionconfigsForeignKey==null||this.comisionconfigsForeignKey.size()<=0) && this.comisiongrupoConstantesFunciones.cargarid_comision_configComisionGrupo)
					 || (this.esRecargarFks && this.comisiongrupoConstantesFunciones.cargarid_comision_configComisionGrupo)) {

					if(!this.comisiongrupoSessionBean.getisBusquedaDesdeForeignKeySesionComisionConfig()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ComisionConfigConstantesFunciones.getArrayColumnasGlobalesComisionConfig(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalComisionConfig=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ComisionConfigConstantesFunciones.TABLENAME);

						finalQueryGlobalComisionConfig=Funciones.GetFinalQueryAppend(finalQueryGlobalComisionConfig, "");
						finalQueryGlobalComisionConfig+=ComisionConfigConstantesFunciones.SFINALQUERY;

						//this.cargarCombosComisionConfigsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalComisionConfig=" WHERE " + ConstantesSql.ID + "="+comisiongrupoSessionBean.getlidComisionConfigActual();
					}
				} else {
					finalQueryGlobalComisionConfig="NONE";
				}


				String finalQueryGlobalVendedor="";

				if(((this.vendedorsForeignKey==null||this.vendedorsForeignKey.size()<=0) && this.comisiongrupoConstantesFunciones.cargarid_vendedorComisionGrupo)
					 || (this.esRecargarFks && this.comisiongrupoConstantesFunciones.cargarid_vendedorComisionGrupo)) {

					if(!this.comisiongrupoSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=VendedorConstantesFunciones.getArrayColumnasGlobalesVendedor(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalVendedor=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,VendedorConstantesFunciones.TABLENAME);

						finalQueryGlobalVendedor=Funciones.GetFinalQueryAppend(finalQueryGlobalVendedor, "");
						finalQueryGlobalVendedor+=VendedorConstantesFunciones.SFINALQUERY;

						//this.cargarCombosVendedorsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalVendedor=" WHERE " + ConstantesSql.ID + "="+comisiongrupoSessionBean.getlidVendedorActual();
					}
				} else {
					finalQueryGlobalVendedor="NONE";
				}


				String finalQueryGlobalLinea="";

				if(((this.lineasForeignKey==null||this.lineasForeignKey.size()<=0) && this.comisiongrupoConstantesFunciones.cargarid_lineaComisionGrupo)
					 || (this.esRecargarFks && this.comisiongrupoConstantesFunciones.cargarid_lineaComisionGrupo)) {

					if(!this.comisiongrupoSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalLinea=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

						finalQueryGlobalLinea=Funciones.GetFinalQueryAppend(finalQueryGlobalLinea, "id_nivel_linea=1");
						finalQueryGlobalLinea+=LineaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosLineasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalLinea=" WHERE " + ConstantesSql.ID + "="+comisiongrupoSessionBean.getlidLineaActual();
					}
				} else {
					finalQueryGlobalLinea="NONE";
				}


				String finalQueryGlobalLineaGrupo="";

				if(cargarCombosDependencia && ((this.lineagruposForeignKey==null||this.lineagruposForeignKey.size()<=0) && this.comisiongrupoConstantesFunciones.cargarid_linea_grupoComisionGrupo)
					 || (this.esRecargarFks && this.comisiongrupoConstantesFunciones.cargarid_linea_grupoComisionGrupo)) {

					if(!this.comisiongrupoSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=LineaConstantesFunciones.getArrayColumnasGlobalesLinea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalLineaGrupo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,LineaConstantesFunciones.TABLENAME);

						finalQueryGlobalLineaGrupo=Funciones.GetFinalQueryAppend(finalQueryGlobalLineaGrupo, "");
						finalQueryGlobalLineaGrupo+=LineaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosLineaGruposForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalLineaGrupo=" WHERE " + ConstantesSql.ID + "="+comisiongrupoSessionBean.getlidLineaGrupoActual();
					}
				} else {
					finalQueryGlobalLineaGrupo="NONE";
				}


				String finalQueryGlobalEstadoComision="";

				if(((this.estadocomisionsForeignKey==null||this.estadocomisionsForeignKey.size()<=0) && this.comisiongrupoConstantesFunciones.cargarid_estado_comisionComisionGrupo)
					 || (this.esRecargarFks && this.comisiongrupoConstantesFunciones.cargarid_estado_comisionComisionGrupo)) {

					if(!this.comisiongrupoSessionBean.getisBusquedaDesdeForeignKeySesionEstadoComision()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstadoComisionConstantesFunciones.getArrayColumnasGlobalesEstadoComision(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstadoComision=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoComisionConstantesFunciones.TABLENAME);

						finalQueryGlobalEstadoComision=Funciones.GetFinalQueryAppend(finalQueryGlobalEstadoComision, "");
						finalQueryGlobalEstadoComision+=EstadoComisionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstadoComisionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstadoComision=" WHERE " + ConstantesSql.ID + "="+comisiongrupoSessionBean.getlidEstadoComisionActual();
					}
				} else {
					finalQueryGlobalEstadoComision="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				comisiongrupoReturnGeneral=comisiongrupoLogic.cargarCombosLoteForeignKeyComisionGrupo(finalQueryGlobalEmpresa,finalQueryGlobalComisionConfig,finalQueryGlobalVendedor,finalQueryGlobalLinea,finalQueryGlobalLineaGrupo,finalQueryGlobalEstadoComision);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=comisiongrupoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalComisionConfig.equals("NONE")) {
				this.comisionconfigsForeignKey=comisiongrupoReturnGeneral.getcomisionconfigsForeignKey();
			}

			if(!finalQueryGlobalVendedor.equals("NONE")) {
				this.vendedorsForeignKey=comisiongrupoReturnGeneral.getvendedorsForeignKey();
			}

			if(!finalQueryGlobalLinea.equals("NONE")) {
				this.lineasForeignKey=comisiongrupoReturnGeneral.getlineasForeignKey();
			}

			if(!finalQueryGlobalLineaGrupo.equals("NONE")) {
				this.lineagruposForeignKey=comisiongrupoReturnGeneral.getlineagruposForeignKey();
			}

			if(!finalQueryGlobalEstadoComision.equals("NONE")) {
				this.estadocomisionsForeignKey=comisiongrupoReturnGeneral.getestadocomisionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyComisionGrupo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyComisionConfig();
			this.addItemDefectoCombosForeignKeyVendedor();
			this.addItemDefectoCombosForeignKeyLinea();
			this.addItemDefectoCombosForeignKeyLineaGrupo();
			this.addItemDefectoCombosForeignKeyEstadoComision();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.comisiongrupoSessionBean==null) {
				this.comisiongrupoSessionBean=new ComisionGrupoSessionBean();
			}

			if(!this.comisiongrupoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.comisiongrupoSessionBean.getisBusquedaDesdeForeignKeySesionComisionConfig()) {
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

			if(!this.comisiongrupoSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
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

			if(!this.comisiongrupoSessionBean.getisBusquedaDesdeForeignKeySesionLinea()) {
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

			if(!this.comisiongrupoSessionBean.getisBusquedaDesdeForeignKeySesionLineaGrupo()) {
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

	public void addItemDefectoCombosForeignKeyEstadoComision()throws Exception {
		try {

			if(!this.comisiongrupoSessionBean.getisBusquedaDesdeForeignKeySesionEstadoComision()) {
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
	
	public void initActionsCombosTodosForeignKeyComisionGrupo()throws Exception {
		try {
			
			this.initActionsCombosForeignKeyLinea("Todos");
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyComisionGrupo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
			this.initActionsCombosForeignKeyLinea(sFormularioTipoBusqueda);
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
	
	



	public void initActionsCombosForeignKeyLinea(String sFormularioTipoBusqueda)throws Exception {
		try {
			if(sFormularioTipoBusqueda.equals("Todos") || sFormularioTipoBusqueda.equals("Formulario")) {
				if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
					if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
						this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_lineaComisionGrupo.addItemListener(new ComboBoxItemListener(this,"id_lineaComisionGrupo"));
						this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_lineaComisionGrupo.addFocusListener(new ComboBoxFocusListener(this,"id_lineaComisionGrupo"));
					}
				} else {
					if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
						this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_lineaComisionGrupo.addActionListener(new ComboBoxActionListener(this,"id_lineaComisionGrupo"));
						this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_lineaComisionGrupo.addFocusListener(new ComboBoxFocusListener(this,"id_lineaComisionGrupo"));
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
	
	public void setVariablesGlobalesCombosForeignKeyComisionGrupo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyComisionGrupo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyComisionGrupo(ComisionGrupo comisiongrupo)throws Exception {	
		try {
			
			this.setActualComisionConfigForeignKey(comisiongrupo.getid_comision_config(),false,"Formulario");
			this.setActualVendedorForeignKey(comisiongrupo.getid_vendedor(),false,"Formulario");
			this.setActualLineaForeignKey(comisiongrupo.getid_linea(),false,"Formulario");
			this.setActualLineaGrupoForeignKey(comisiongrupo.getid_linea_grupo(),false,"Formulario");
			this.setActualEstadoComisionForeignKey(comisiongrupo.getid_estado_comision(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyComisionGrupo(ComisionGrupo comisiongrupo,String sTipoEvento)throws Exception {	
		try {
			
			

				if(comisiongrupo.getVendedor()!=null && !sTipoEvento.equals("id_vendedorComisionGrupo")) { //sTipoEvento Evita Bucle Infinito

					this.vendedorsForeignKey=new ArrayList<Vendedor>();
					this.vendedorsForeignKey.add(comisiongrupo.getVendedor());

					this.addItemDefectoCombosForeignKeyVendedor();
					this.cargarCombosFrameVendedorsForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyComisionGrupo()throws Exception {	
		try {
			
			this.setActualComisionConfigForeignKey(this.comisiongrupoConstantesFunciones.getid_comision_config(),false,"Formulario");
			this.setActualVendedorForeignKey(this.comisiongrupoConstantesFunciones.getid_vendedor(),false,"Formulario");
			this.setActualLineaForeignKey(this.comisiongrupoConstantesFunciones.getid_linea(),false,"Formulario");
			this.setActualLineaGrupoForeignKey(this.comisiongrupoConstantesFunciones.getid_linea_grupo(),false,"Formulario");
			this.setActualEstadoComisionForeignKey(this.comisiongrupoConstantesFunciones.getid_estado_comision(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyComisionGrupo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyComisionGrupo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyComisionGrupo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroComisionGrupo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyComisionGrupo()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameComisionConfigsForeignKey("Todos");
			this.cargarCombosFrameVendedorsForeignKey("Todos");
			this.cargarCombosFrameLineasForeignKey("Todos");
			this.cargarCombosFrameLineaGruposForeignKey("Todos");
			this.cargarCombosFrameEstadoComisionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyComisionGrupo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameComisionConfigsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameVendedorsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstadoComisionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyComisionGrupo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_empresaComisionGrupo!=null && this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_empresaComisionGrupo.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_empresaComisionGrupo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_comision_configComisionGrupo!=null && this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_comision_configComisionGrupo.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_comision_configComisionGrupo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_vendedorComisionGrupo!=null && this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_vendedorComisionGrupo.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_vendedorComisionGrupo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_lineaComisionGrupo!=null && this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_lineaComisionGrupo.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_lineaComisionGrupo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_linea_grupoComisionGrupo!=null && this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_linea_grupoComisionGrupo.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_linea_grupoComisionGrupo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_estado_comisionComisionGrupo!=null && this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_estado_comisionComisionGrupo.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_estado_comisionComisionGrupo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	







	public void recargarFormComisionGrupoLinea(JComboBox<?> jComboBoxGenericoLinea,String sFormularioTipoBusqueda) throws Exception {

		this.recargarFormComisionGrupoid_linea_grupo(jComboBoxGenericoLinea,sFormularioTipoBusqueda,"Linea",false);
	}




	
	



	public void recargarFormComisionGrupoid_linea_grupo(JComboBox<?> jComboBoxGenericoLinea,String sFormularioTipoBusqueda,String sTipoComboOrigen,Boolean conIrServidorAplicacion) throws Exception {
		try {

			String sFinalQuery="";

			if(sTipoComboOrigen.equals("Linea")){
				this.setActualParaGuardarLineaForeignKey(this.comisiongrupo,jComboBoxGenericoLinea);
			}

			if(this.comisiongrupo.getid_linea()!=null && this.comisiongrupo.getid_linea()!=0L) {
				sFinalQuery+="  WHERE  id_linea="+this.comisiongrupo.getid_linea();
			} else {
				sFinalQuery+="  WHERE  id_linea=-1";
			}



			//BUCLE RECURSIVO
			this.setActualLineaGrupoForeignKey(this.comisiongrupo.getid_linea(),true,sFormularioTipoBusqueda);

			this.cargarCombosLineaGruposForeignKeyLista(sFinalQuery);

			this.cargarCombosFrameLineaGruposForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public ComisionGrupoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ComisionGrupoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ComisionGrupoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.comisiongrupoSessionBean=new ComisionGrupoSessionBean(); 
		this.comisiongrupoConstantesFunciones=new ComisionGrupoConstantesFunciones(); 
		this.comisiongrupoBean=new ComisionGrupo();//(this.comisiongrupoConstantesFunciones); 		
		this.comisiongrupoReturnGeneral=new ComisionGrupoParameterReturnGeneral(); 
		
		this.comisiongrupoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comisiongrupoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ComisionGrupoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ComisionGrupoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ComisionGrupoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessComisionGrupo(true);
			
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
			
			this.comisiongrupoConstantesFunciones=new ComisionGrupoConstantesFunciones(); 
			this.comisiongrupoBean=new ComisionGrupo();//this.comisiongrupoConstantesFunciones); 			
			this.comisiongrupoReturnGeneral=new ComisionGrupoParameterReturnGeneral(); 
		
			ComisionGrupoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Comision Grupo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.comisiongrupo=new ComisionGrupo();
			this.comisiongrupos = new ArrayList<ComisionGrupo>();
			this.comisiongruposAux = new ArrayList<ComisionGrupo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic=new ComisionGrupoLogic();
				this.comisiongrupoLogic.getNewConnexionToDeep("");
			}
			
			//this.comisiongrupoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.comisiongrupoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormComisionGrupo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoComisionGrupo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoComisionGrupo);	
					}
					
					if(this.jInternalFrameImportacionComisionGrupo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionComisionGrupo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByComisionGrupo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByComisionGrupo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormComisionGrupo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormComisionGrupo);
				this.jInternalFrameDetalleFormComisionGrupo.setVisible(false);
				this.jInternalFrameDetalleFormComisionGrupo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoComisionGrupo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoComisionGrupo);
					this.jInternalFrameReporteDinamicoComisionGrupo.setVisible(false);
					this.jInternalFrameReporteDinamicoComisionGrupo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionComisionGrupo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionComisionGrupo);
					this.jInternalFrameImportacionComisionGrupo.setVisible(false);
					this.jInternalFrameImportacionComisionGrupo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByComisionGrupo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByComisionGrupo);
					this.jInternalFrameOrderByComisionGrupo.setVisible(false);
					this.jInternalFrameOrderByComisionGrupo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idComisionGrupoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ComisionGrupoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.comisiongrupoReturnGeneral=new ComisionGrupoParameterReturnGeneral();
			
			this.comisiongrupoParameterGeneral=new ComisionGrupoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.comisiongrupoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ComisionGrupoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ComisionGrupoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.comisiongrupoSessionBean.getEsGuardarRelacionado(),this.comisiongrupoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ComisionGrupoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.comisiongrupoSessionBean.getEsGuardarRelacionado(),this.comisiongrupoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoComisionGrupo=false;
			this.isVisibilidadCeldaDuplicarComisionGrupo=true;
			this.isVisibilidadCeldaCopiarComisionGrupo=true;
			this.isVisibilidadCeldaVerFormComisionGrupo=true;
			this.isVisibilidadCeldaOrdenComisionGrupo=true;
			this.isVisibilidadCeldaNuevoRelacionesComisionGrupo=false;
			this.isVisibilidadCeldaModificarComisionGrupo=false;
			this.isVisibilidadCeldaActualizarComisionGrupo=false;
			this.isVisibilidadCeldaEliminarComisionGrupo=false;
			this.isVisibilidadCeldaCancelarComisionGrupo=false;
			this.isVisibilidadCeldaGuardarComisionGrupo=false;
			this.isVisibilidadCeldaGuardarCambiosComisionGrupo=false;
			
			
			this.isVisibilidadFK_IdComisionConfig=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstadoComision=true;
			this.isVisibilidadFK_IdLinea=true;
			this.isVisibilidadFK_IdLineaGrupo=true;
			this.isVisibilidadFK_IdVendedor=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesComisionGrupo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosComisionGrupo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioComisionGrupo(false);
			
			this.setPermisosUsuarioComisionGrupo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comisiongrupoSessionBean.getEsGuardarRelacionado() 
				|| (this.comisiongrupoSessionBean.getEsGuardarRelacionado() && this.comisiongrupoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioComisionGrupoClasesRelacionadas();
			}
			
			if(this.comisiongrupoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioComisionGrupoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ComisionGrupoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosComisionGrupo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualComisionGrupo();
			}
			
			if(!this.isPermisoBusquedaComisionGrupo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasComisionGrupo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioComisionGrupo,this.isPermisoPaginacionMedioComisionGrupo,this.isPermisoPaginacionTodoComisionGrupo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ComisionGrupoConstantesFunciones.getTiposSeleccionarComisionGrupo());
				
				this.tiposColumnasSelect=ComisionGrupoConstantesFunciones.getTiposSeleccionarComisionGrupo(true);
				
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
			//if(!this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioComisionGrupo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioComisionGrupo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioComisionGrupo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesComisionGrupo() ;
			
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
				comisiongrupoImplementable= (ComisionGrupoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ComisionGrupoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				comisiongrupoImplementableHome= (ComisionGrupoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ComisionGrupoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.comisiongrupos= new ArrayList<ComisionGrupo>();
			this.comisiongruposEliminados= new ArrayList<ComisionGrupo>();
						
			this.isEsNuevoComisionGrupo=false;
			this.esParaAccionDesdeFormularioComisionGrupo=false;
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
			this.estadocomisionsForeignKey=new ArrayList<EstadoComision>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyComisionGrupo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroComisionGrupo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ComisionGrupoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ComisionGrupoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesComisionGrupo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingComisionGrupo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormComisionGrupo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioComisionGrupo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioComisionGrupo();
			}
			
			ComisionGrupoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasComisionGrupo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasComisionGrupo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasComisionGrupo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessComisionGrupo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ComisionGrupo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectComisionGrupo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesComisionGrupo")) {
				iIndex=this.jInternalFrameDetalleFormComisionGrupo.jTabbedPaneRelacionesComisionGrupo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormComisionGrupo.jTabbedPaneRelacionesComisionGrupo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessComisionGrupo();	
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
	
	public void cargarCombosForeignKeyComisionGrupo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyComisionGrupo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyComisionGrupo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyComisionGrupoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyComisionGrupo();
		
		this.cargarCombosFrameForeignKeyComisionGrupo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyComisionGrupo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyComisionGrupo();
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
					this.initActionsCombosForeignKeyLinea("Todos");
				}

			this.recargarComboTablaLineaGrupo(this.lineagruposForeignKey);

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
					this.initActionsCombosForeignKeyLinea("Todos");
				}

			this.recargarComboTablaEstadoComision(this.estadocomisionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoComisionGrupoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.comisiongrupoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormComisionGrupo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
			
			
			if(jTableDatosComisionGrupo.getRowCount()>=1) {
				jTableDatosComisionGrupo.removeRowSelectionInterval(0, jTableDatosComisionGrupo.getRowCount()-1);						
			}
			
			this.isEsNuevoComisionGrupo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoComisionGrupo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesComisionGrupo(true);			
			//this.comisiongrupo=new ComisionGrupo();
			//this.comisiongrupo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComisionGrupo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisionGrupo() ;
			
			if(ComisionGrupoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComisionGrupo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.comisiongrupo);	
			this.actualizarInformacion("INFO_PADRE",false,this.comisiongrupo);				
			
			ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
			
			if(this.comisiongrupoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ComisionGrupo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarComisionGrupoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ComisionGrupo> comisiongruposSeleccionados=new ArrayList<ComisionGrupo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosComisionGrupo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosComisionGrupo.getSelectedRows().length;			
			}
			
			comisiongruposSeleccionados=this.getComisionGruposSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoComisionGrupo--;			
				//ComisionGrupo comisiongrupoAux= new ComisionGrupo();			
				//comisiongrupoAux.setId(this.iIdNuevoComisionGrupo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ComisionGrupo comisiongrupoOrigen=new ComisionGrupo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ComisionGrupo comisiongrupoOrigen : comisiongruposSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							comisiongrupoOrigen =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisiongrupoOrigen =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaComisionGrupo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.comisiongrupo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosComisionGrupo(comisiongrupoOrigen,this.comisiongrupo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.comisiongrupoLogic.getComisionGrupos().add(this.comisiongrupoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.comisiongrupos.add(this.comisiongrupoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaComisionGrupo(false);
				
				this.jTableDatosComisionGrupo.setRowSelectionInterval(this.getIndiceNuevoComisionGrupo(), this.getIndiceNuevoComisionGrupo());
				
				int iLastRow =  this.jTableDatosComisionGrupo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosComisionGrupo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosComisionGrupo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaComisionGrupo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarComisionGrupoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ComisionGrupo> comisiongruposSeleccionados=new ArrayList<ComisionGrupo>();									
		
			ComisionGrupo comisiongrupoOrigen=new ComisionGrupo();
			ComisionGrupo comisiongrupoDestino=new ComisionGrupo();
				
			comisiongruposSeleccionados=this.getComisionGruposSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosComisionGrupo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || comisiongruposSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosComisionGrupo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisiongrupoOrigen =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						comisiongrupoOrigen =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisiongrupoDestino =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						comisiongrupoDestino =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				comisiongrupoOrigen =comisiongruposSeleccionados.get(0);
				comisiongrupoDestino =comisiongruposSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosComisionGrupo(comisiongrupoOrigen,comisiongrupoDestino,true,false);
				
				comisiongrupoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(comisiongrupoDestino,comisiongrupoLogic.getComisionGrupos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisiongrupoDestino,comisiongrupos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaComisionGrupo(false);
				
				//this.jTableDatosComisionGrupo.setRowSelectionInterval(this.getIndiceNuevoComisionGrupo(), this.getIndiceNuevoComisionGrupo());
				
				int iLastRow =  this.jTableDatosComisionGrupo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosComisionGrupo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosComisionGrupo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaComisionGrupo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormComisionGrupoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormComisionGrupo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormComisionGrupo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarComisionGrupoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesComisionGrupo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasComisionGrupo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesComisionGrupo.setVisible(!isVisible);
			this.jPanelPaginacionComisionGrupo.setVisible(!isVisible);
			this.jPanelAccionesComisionGrupo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarComisionGrupoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameComisionGrupo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoComisionGrupoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoComisionGrupo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionComisionGrupoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionComisionGrupo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByComisionGrupoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByComisionGrupo();
			
			this.abrirFrameOrderByComisionGrupo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByComisionGrupoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByComisionGrupo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleComisionGrupo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormComisionGrupo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormComisionGrupo.isMaximum()) {
					this.jInternalFrameDetalleFormComisionGrupo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormComisionGrupo.setSize(this.jInternalFrameDetalleFormComisionGrupo.iWidthFormulario,this.jInternalFrameDetalleFormComisionGrupo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormComisionGrupo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormComisionGrupo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormComisionGrupo.isMaximum()) {
						this.jInternalFrameDetalleFormComisionGrupo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormComisionGrupo.jContentPaneDetalleComisionGrupo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormComisionGrupo.jTabbedPaneRelacionesComisionGrupo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormComisionGrupo.jContentPaneDetalleComisionGrupo.getWidth(),ComisionGrupoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormComisionGrupo.jTabbedPaneRelacionesComisionGrupo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormComisionGrupo.jContentPaneDetalleComisionGrupo.getWidth(),ComisionGrupoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormComisionGrupo.jTabbedPaneRelacionesComisionGrupo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormComisionGrupo.jContentPaneDetalleComisionGrupo.getWidth(),ComisionGrupoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormComisionGrupo.setVisible(true);
	        this.jInternalFrameDetalleFormComisionGrupo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByComisionGrupo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByComisionGrupo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByComisionGrupo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisionGrupo,false,this);
				} else {
					this.jInternalFrameOrderByComisionGrupo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisionGrupo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByComisionGrupo);
				this.jInternalFrameOrderByComisionGrupo.setVisible(false);
				this.jInternalFrameOrderByComisionGrupo.setSelected(false);
				
				this.jInternalFrameOrderByComisionGrupo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByComisionGrupo"));
				
				this.inicializarActualizarBindingTablaOrderByComisionGrupo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionComisionGrupo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionComisionGrupo==null) {
				
				this.jInternalFrameImportacionComisionGrupo=new ImportacionJInternalFrame(ComisionGrupoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionComisionGrupo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionComisionGrupo);
				this.jInternalFrameImportacionComisionGrupo.setVisible(false);
				this.jInternalFrameImportacionComisionGrupo.setSelected(false);


				this.jInternalFrameImportacionComisionGrupo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionComisionGrupo"));
				this.jInternalFrameImportacionComisionGrupo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionComisionGrupo"));
				this.jInternalFrameImportacionComisionGrupo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionComisionGrupo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoComisionGrupo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoComisionGrupo==null) {
				this.jInternalFrameReporteDinamicoComisionGrupo=new ReporteDinamicoJInternalFrame(ComisionGrupoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoComisionGrupo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoComisionGrupo);
				this.jInternalFrameReporteDinamicoComisionGrupo.setVisible(false);
				this.jInternalFrameReporteDinamicoComisionGrupo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoComisionGrupo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComisionGrupo"));
				this.jInternalFrameReporteDinamicoComisionGrupo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComisionGrupo"));
				this.jInternalFrameReporteDinamicoComisionGrupo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComisionGrupo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComisionGrupo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleComisionGrupo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormComisionGrupo);
			
	       	this.jInternalFrameDetalleFormComisionGrupo.setVisible(false);
	        this.jInternalFrameDetalleFormComisionGrupo.setSelected(false);
			
			//this.jInternalFrameDetalleFormComisionGrupo.dispose();
			//this.jInternalFrameDetalleFormComisionGrupo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoComisionGrupo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoComisionGrupo.setVisible(true);
	        this.jInternalFrameReporteDinamicoComisionGrupo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionComisionGrupo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionComisionGrupo.setVisible(true);
	        this.jInternalFrameImportacionComisionGrupo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByComisionGrupo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByComisionGrupo.setVisible(true);
	        this.jInternalFrameOrderByComisionGrupo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByComisionGrupo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByComisionGrupo.setVisible(false);
	        this.jInternalFrameOrderByComisionGrupo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoComisionGrupo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoComisionGrupo.setVisible(false);
	        this.jInternalFrameReporteDinamicoComisionGrupo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionComisionGrupo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionComisionGrupo.setVisible(false);
	        this.jInternalFrameImportacionComisionGrupo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderComisionGrupo=(TitledBorder)this.jScrollPanelDatosComisionGrupo.getBorder();
						TitledBorder titledBorderVendedor=(TitledBorder)vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

						titledBorderVendedor.setTitle(titledBorderComisionGrupo.getTitle() + " -> Vendedor");


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
						TitledBorder titledBorderComisionGrupo=(TitledBorder)this.jScrollPanelDatosComisionGrupo.getBorder();
						TitledBorder titledBorderLinea=(TitledBorder)lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

						titledBorderLinea.setTitle(titledBorderComisionGrupo.getTitle() + " -> Linea");


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
						TitledBorder titledBorderComisionGrupo=(TitledBorder)this.jScrollPanelDatosComisionGrupo.getBorder();
						TitledBorder titledBorderLineaGrupo=(TitledBorder)lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

						titledBorderLineaGrupo.setTitle(titledBorderComisionGrupo.getTitle() + " -> Linea");


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
	
	public void jButtonModificarComisionGrupoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarComisionGrupo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarComisionGrupo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesComisionGrupo(true);
			//this.isEsNuevoComisionGrupo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupo =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comisiongrupo =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesComisionGrupo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComisionGrupo(false) ;
			
			if(comisiongrupoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ComisionGrupoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComisionGrupo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisionGrupo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaComisionGrupoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupo =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisiongrupo =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarComisionGrupo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormComisionGrupo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesComisionGrupo(true);
			//this.isEsNuevoComisionGrupo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupo =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comisiongrupo =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.comisiongrupo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesComisionGrupo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesComisionGrupo(false) ;
			
			if(ComisionGrupoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComisionGrupo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisionGrupo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Vendedor")) {
				if(!this.comisiongrupoConstantesFunciones.cargarid_vendedorComisionGrupo) {
					this.cargarCombosVendedorsForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingComisionGrupo(false,false);
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
		TableColumn tableColumnComisionConfig=this.jTableDatosComisionGrupo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionGrupo,ComisionGrupoConstantesFunciones.LABEL_IDCOMISIONCONFIG));
		TableCellEditor tableCellEditorComisionConfig =tableColumnComisionConfig.getCellEditor();

		ComisionConfigTableCell comisionconfigTableCellFk=(ComisionConfigTableCell)tableCellEditorComisionConfig;

		if(comisionconfigTableCellFk!=null) {
			comisionconfigTableCellFk.setcomisionconfigsForeignKey(comisionconfigsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComisionGrupo.getSelectedRow();

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
		TableColumn tableColumnVendedor=this.jTableDatosComisionGrupo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionGrupo,ComisionGrupoConstantesFunciones.LABEL_IDVENDEDOR));
		TableCellEditor tableCellEditorVendedor =tableColumnVendedor.getCellEditor();

		VendedorTableCell vendedorTableCellFk=(VendedorTableCell)tableCellEditorVendedor;

		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.setvendedorsForeignKey(vendedorsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComisionGrupo.getSelectedRow();

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
		TableColumn tableColumnLinea=this.jTableDatosComisionGrupo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionGrupo,ComisionGrupoConstantesFunciones.LABEL_IDLINEA));
		TableCellEditor tableCellEditorLinea =tableColumnLinea.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLinea;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComisionGrupo.getSelectedRow();

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
		TableColumn tableColumnLineaGrupo=this.jTableDatosComisionGrupo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionGrupo,ComisionGrupoConstantesFunciones.LABEL_IDLINEAGRUPO));
		TableCellEditor tableCellEditorLineaGrupo =tableColumnLineaGrupo.getCellEditor();

		LineaTableCell lineaTableCellFk=(LineaTableCell)tableCellEditorLineaGrupo;

		if(lineaTableCellFk!=null) {
			lineaTableCellFk.setlineasForeignKey(lineagruposForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComisionGrupo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//lineaTableCellFk.setRowActual(intSelectedRow);
			//lineaTableCellFk.setlineasForeignKeyActual(lineagruposForeignKey);
		//}


		if(lineaTableCellFk!=null) {
			lineaTableCellFk.RecargarLineasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstadoComision(List<EstadoComision> estadocomisionsForeignKey)throws Exception{
		TableColumn tableColumnEstadoComision=this.jTableDatosComisionGrupo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionGrupo,ComisionGrupoConstantesFunciones.LABEL_IDESTADOCOMISION));
		TableCellEditor tableCellEditorEstadoComision =tableColumnEstadoComision.getCellEditor();

		EstadoComisionTableCell estadocomisionTableCellFk=(EstadoComisionTableCell)tableCellEditorEstadoComision;

		if(estadocomisionTableCellFk!=null) {
			estadocomisionTableCellFk.setestadocomisionsForeignKey(estadocomisionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComisionGrupo.getSelectedRow();

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
	
	public void jButtonActualizarComisionGrupoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesComisionGrupo(false);
			
			//if(!this.isEsNuevoComisionGrupo) {								
				int intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupo =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisiongrupo =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ComisionGrupoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualComisionGrupo(this.comisiongrupo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);
				
			}
			
			if(this.permiteMantenimiento(this.comisiongrupo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoComisionGrupo=true;
					this.inicializarActualizarBindingTablaComisionGrupo(false);
					this.isEsNuevoComisionGrupo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoComisionGrupo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoComisionGrupo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesComisionGrupo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComisionGrupo(false);
				
				this.habilitarDeshabilitarControlesComisionGrupo(false);
			
												
				
				if(ComisionGrupoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleComisionGrupo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoComisionGrupoActionPerformed(evt,comisiongrupoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualComisionGrupo(this.comisiongrupo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosComisionGrupo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,comisiongrupoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.comisiongrupo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ComisionGrupo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionGrupo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarComisionGrupoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupo =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				this.comisiongrupo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comisiongrupo =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				this.comisiongrupo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.comisiongrupo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ComisionGrupoModel) this.jTableDatosComisionGrupo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoComisionGrupo=true;
				this.inicializarActualizarBindingTablaComisionGrupo(false);
				this.isEsNuevoComisionGrupo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesComisionGrupo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComisionGrupo(false);
				
				this.habilitarDeshabilitarControlesComisionGrupo(false);
				
				
				
				if(ComisionGrupoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleComisionGrupo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarComisionGrupoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosComisionGrupo.getRowCount()>=1) {
				jTableDatosComisionGrupo.removeRowSelectionInterval(0, jTableDatosComisionGrupo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesComisionGrupo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaComisionGrupo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComisionGrupo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisionGrupo(false) ;
			
			this.isEsNuevoComisionGrupo=false;
			
			if(ComisionGrupoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleComisionGrupo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosComisionGrupoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingComisionGrupo(false);
				
				//SI ES MANUAL
				if(ComisionGrupoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualComisionGrupo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosComisionGrupoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoComisionGrupo--;			
			//ComisionGrupo comisiongrupoAux= new ComisionGrupo();			
			//comisiongrupoAux.setId(this.iIdNuevoComisionGrupo);
			
			if(this.jInternalFrameDetalleFormComisionGrupo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaComisionGrupo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);
			
			this.comisiongrupo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.comisiongrupoLogic.getComisionGrupos().add(this.comisiongrupoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.comisiongrupos.add(this.comisiongrupoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaComisionGrupo(false);
			
			this.jTableDatosComisionGrupo.setRowSelectionInterval(this.getIndiceNuevoComisionGrupo(), this.getIndiceNuevoComisionGrupo());
			
			int iLastRow =  this.jTableDatosComisionGrupo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosComisionGrupo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosComisionGrupo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaComisionGrupo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionComisionGrupoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingComisionGrupo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisionGrupo(false);
			
			//SI ES MANUAL
			if(ComisionGrupoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComisionGrupo();
			}
			
			//this.abrirFrameTreeComisionGrupo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionComisionGrupoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Comision GrupoS ?", "MANTENIMIENTO DE Comision Grupo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionComisionGrupo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralComisionGrupo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.comisiongrupoReturnGeneral=comisiongrupoLogic.procesarImportacionComisionGruposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.comisiongrupoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarComisionGrupoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionComisionGrupoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionComisionGrupo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionComisionGrupo.setFileImportacion(this.jInternalFrameImportacionComisionGrupo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionComisionGrupo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionComisionGrupo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionComisionGrupo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionComisionGrupo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoComisionGrupoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ComisionGrupo> comisiongruposSeleccionados=new ArrayList<ComisionGrupo>();		

		comisiongruposSeleccionados=this.getComisionGruposSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisionGrupo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisionGrupo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ComisionGrupoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ComisionGrupoBaseDesign.jrxml";
			
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
			
			this.generarReporteComisionGrupos("Todos",comisiongruposSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Grupo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoComisionGrupo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionGrupo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ComisionGrupoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionGrupoConstantesFunciones.LABEL_IDCOMISIONCONFIG:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ComisionConfig_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ComisionConfig_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ComisionConfig_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ComisionConfig_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionGrupoConstantesFunciones.LABEL_IDVENDEDOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Vendedor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Vendedor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Vendedor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Vendedor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionGrupoConstantesFunciones.LABEL_IDLINEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Linea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Linea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Linea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Linea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionGrupoConstantesFunciones.LABEL_IDLINEAGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_LineaGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_LineaGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_LineaGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_LineaGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionGrupoConstantesFunciones.LABEL_IDESTADOCOMISION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EstadoComision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EstadoComision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EstadoComision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EstadoComision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionGrupoConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionGrupoConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoComisionGrupo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoComisionGrupo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoComisionGrupo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ComisionGrupoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ComisionGrupoConstantesFunciones.LABEL_IDCOMISIONCONFIG:
					sNombreCampoCategoria="id_comision_config";
					break;

				case ComisionGrupoConstantesFunciones.LABEL_IDVENDEDOR:
					sNombreCampoCategoria="id_vendedor";
					break;

				case ComisionGrupoConstantesFunciones.LABEL_IDLINEA:
					sNombreCampoCategoria="id_linea";
					break;

				case ComisionGrupoConstantesFunciones.LABEL_IDLINEAGRUPO:
					sNombreCampoCategoria="id_linea_grupo";
					break;

				case ComisionGrupoConstantesFunciones.LABEL_IDESTADOCOMISION:
					sNombreCampoCategoria="id_estado_comision";
					break;

				case ComisionGrupoConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;

				case ComisionGrupoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoComisionGrupo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ComisionGrupoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ComisionGrupoConstantesFunciones.LABEL_IDCOMISIONCONFIG:
					sNombreCampoCategoriaValor="id_comision_config";
					break;

				case ComisionGrupoConstantesFunciones.LABEL_IDVENDEDOR:
					sNombreCampoCategoriaValor="id_vendedor";
					break;

				case ComisionGrupoConstantesFunciones.LABEL_IDLINEA:
					sNombreCampoCategoriaValor="id_linea";
					break;

				case ComisionGrupoConstantesFunciones.LABEL_IDLINEAGRUPO:
					sNombreCampoCategoriaValor="id_linea_grupo";
					break;

				case ComisionGrupoConstantesFunciones.LABEL_IDESTADOCOMISION:
					sNombreCampoCategoriaValor="id_estado_comision";
					break;

				case ComisionGrupoConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;

				case ComisionGrupoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoComisionGrupo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionGrupo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ComisionGrupoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ComisionGrupoConstantesFunciones.LABEL_IDCOMISIONCONFIG:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Configuracion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_comision_config");
					break;

				case ComisionGrupoConstantesFunciones.LABEL_IDVENDEDOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Vendedor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_vendedor");
					break;

				case ComisionGrupoConstantesFunciones.LABEL_IDLINEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea");
					break;

				case ComisionGrupoConstantesFunciones.LABEL_IDLINEAGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Linea Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_linea_grupo");
					break;

				case ComisionGrupoConstantesFunciones.LABEL_IDESTADOCOMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estado_comision");
					break;

				case ComisionGrupoConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
					break;

				case ComisionGrupoConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoComisionGrupoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ComisionGrupo> comisiongruposSeleccionados=new ArrayList<ComisionGrupo>();		
		
		comisiongruposSeleccionados=this.getComisionGruposSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisiongrupo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ComisionGrupos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoComisionGrupo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionGrupo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ComisionGrupoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionGrupoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ComisionGrupo comisiongrupo:comisiongruposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisiongrupo.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionGrupoConstantesFunciones.LABEL_IDCOMISIONCONFIG:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionGrupoConstantesFunciones.LABEL_IDCOMISIONCONFIG);
					iRow++;

					for(ComisionGrupo comisiongrupo:comisiongruposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisiongrupo.getcomisionconfig_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionGrupoConstantesFunciones.LABEL_IDVENDEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionGrupoConstantesFunciones.LABEL_IDVENDEDOR);
					iRow++;

					for(ComisionGrupo comisiongrupo:comisiongruposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisiongrupo.getvendedor_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionGrupoConstantesFunciones.LABEL_IDLINEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionGrupoConstantesFunciones.LABEL_IDLINEA);
					iRow++;

					for(ComisionGrupo comisiongrupo:comisiongruposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisiongrupo.getlinea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionGrupoConstantesFunciones.LABEL_IDLINEAGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionGrupoConstantesFunciones.LABEL_IDLINEAGRUPO);
					iRow++;

					for(ComisionGrupo comisiongrupo:comisiongruposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisiongrupo.getlineagrupo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionGrupoConstantesFunciones.LABEL_IDESTADOCOMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionGrupoConstantesFunciones.LABEL_IDESTADOCOMISION);
					iRow++;

					for(ComisionGrupo comisiongrupo:comisiongruposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisiongrupo.getestadocomision_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionGrupoConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionGrupoConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(ComisionGrupo comisiongrupo:comisiongruposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisiongrupo.getporcentaje());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionGrupoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionGrupoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ComisionGrupo comisiongrupo:comisiongruposSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisiongrupo.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelComisionGrupo(row);				
			//	iRow++;
			//}				
			
			//for(ComisionGrupo comisiongrupoAux:comisiongruposSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelComisionGrupo(comisiongrupoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Grupo",JOptionPane.INFORMATION_MESSAGE);
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
				this.comisiongrupoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisionGrupo(false);
			
			//SI ES MANUAL
			if(ComisionGrupoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComisionGrupo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresComisionGrupoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisionGrupo(false);
			
			//SI ES MANUAL
			if(ComisionGrupoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualComisionGrupo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesComisionGrupoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisionGrupo(false);
			
			//SI ES MANUAL
			if(ComisionGrupoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualComisionGrupo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaComisionGrupo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosComisionGrupo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosComisionGrupo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosComisionGrupo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosComisionGrupo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosComisionGrupo.setMinimumSize(dimensionMinimum);
		this.jTableDatosComisionGrupo.setMaximumSize(dimensionMaximum);
		this.jTableDatosComisionGrupo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingComisionGrupo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingComisionGrupo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingComisionGrupo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaComisionGrupo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesComisionGrupo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasComisionGrupo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesComisionGrupo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesComisionGrupo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ComisionGrupoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ComisionGrupoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualComisionGrupo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaComisionGrupo();
		
		this.inicializarActualizarBindingBotonesManualComisionGrupo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualComisionGrupo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesComisionGrupo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualComisionGrupo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualComisionGrupo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosComisionGrupo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosComisionGrupo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteComisionGrupo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormComisionGrupo.jCheckBoxPostAccionNuevoComisionGrupo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormComisionGrupo.jCheckBoxPostAccionSinCerrarComisionGrupo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormComisionGrupo.jCheckBoxPostAccionSinMensajeComisionGrupo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosComisionGrupo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosComisionGrupo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteComisionGrupo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
				this.jInternalFrameDetalleFormComisionGrupo.jCheckBoxPostAccionNuevoComisionGrupo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormComisionGrupo.jCheckBoxPostAccionSinCerrarComisionGrupo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormComisionGrupo.jCheckBoxPostAccionSinMensajeComisionGrupo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionComisionGrupo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionComisionGrupo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormComisionGrupo.jComboBoxTiposAccionesFormularioComisionGrupo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesComisionGrupo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoComisionGrupo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisionGrupo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesComisionGrupo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesComisionGrupo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarComisionGrupo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesComisionGrupo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoComisionGrupo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisionGrupo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesComisionGrupo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralComisionGrupo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesComisionGrupo(Boolean esInicializar) throws Exception {
		try	{	
			if(ComisionGrupoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualComisionGrupo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesComisionGrupo() throws Exception {
		try	{
			if(ComisionGrupoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualComisionGrupo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleComisionGrupo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormComisionGrupo.jComboBoxTiposAccionesFormularioComisionGrupo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormComisionGrupo.jComboBoxTiposAccionesFormularioComisionGrupo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualComisionGrupo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesComisionGrupo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesComisionGrupo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesComisionGrupo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesComisionGrupo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesComisionGrupo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesComisionGrupo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionComisionGrupo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionComisionGrupo.addItem(reporte);
			}
			
			
			if(!this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionComisionGrupo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionComisionGrupo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesComisionGrupo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesComisionGrupo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesComisionGrupo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesComisionGrupo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormComisionGrupo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormComisionGrupo.jComboBoxTiposAccionesFormularioComisionGrupo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormComisionGrupo.jComboBoxTiposAccionesFormularioComisionGrupo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarComisionGrupo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarComisionGrupo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarComisionGrupo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComisionGrupo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComisionGrupo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoComisionGrupo!=null) {
				this.jInternalFrameReporteDinamicoComisionGrupo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoComisionGrupo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoComisionGrupo!=null) {
				this.jInternalFrameReporteDinamicoComisionGrupo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoComisionGrupo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoComisionGrupo!=null) {
				
				if(this.jInternalFrameReporteDinamicoComisionGrupo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoComisionGrupo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComisionGrupo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoComisionGrupo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoComisionGrupo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComisionGrupo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoComisionGrupo.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoComisionGrupo.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ComisionGrupoConstantesFunciones.getTiposSeleccionarComisionGrupo(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoComisionGrupo.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoComisionGrupo.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoComisionGrupo.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ComisionGrupoConstantesFunciones.getTiposSeleccionarComisionGrupo(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoComisionGrupo.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoComisionGrupo.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoComisionGrupo.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ComisionGrupoConstantesFunciones.getTiposSeleccionarComisionGrupo(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComisionGrupo.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoComisionGrupo.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoComisionGrupo.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoComisionGrupo.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualComisionGrupo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_comision_configFK_IdComisionConfigComisionGrupo.getSelectedItem()!=null){this.id_comision_configFK_IdComisionConfig=((ComisionConfig)this.jComboBoxid_comision_configFK_IdComisionConfigComisionGrupo.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasComisionGrupo(Boolean esInicializar) throws Exception {				
		if(ComisionGrupoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualComisionGrupo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaComisionGrupo() throws Exception {
		this.inicializarActualizarBindingTablaComisionGrupo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByComisionGrupo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByComisionGrupo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByComisionGrupo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComisionGrupo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ComisionGrupoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByComisionGrupo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComisionGrupo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ComisionGrupoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosComisionGrupoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionGrupoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ComisionGrupoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByComisionGrupo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComisionGrupo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ComisionGrupoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByComisionGrupo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaComisionGrupo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=comisiongrupoLogic.getComisionGrupos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=comisiongrupos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ComisionGrupoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosComisionGrupo.setModel(new ComisionGrupoModel(this.comisiongrupoLogic.getComisionGrupos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosComisionGrupo.setModel(new ComisionGrupoModel(this.comisiongrupos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByComisionGrupo!=null && this.jInternalFrameOrderByComisionGrupo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByComisionGrupo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosComisionGrupo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionGrupo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ComisionGrupoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO,comisiongrupoConstantesFunciones.resaltarSeleccionarComisionGrupo,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ComisionGrupoConstantesFunciones.SCLASSWEBTITULO,comisiongrupoConstantesFunciones.resaltarSeleccionarComisionGrupo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosComisionGrupo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionGrupo,ComisionGrupoConstantesFunciones.LABEL_ID));

		if(this.comisiongrupoConstantesFunciones.mostraridComisionGrupo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionGrupoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comisiongrupoConstantesFunciones.resaltaridComisionGrupo,this.comisiongrupoConstantesFunciones.activaridComisionGrupo,iSizeTabla,this,true,"idComisionGrupo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisiongrupoConstantesFunciones.resaltaridComisionGrupo,this.comisiongrupoConstantesFunciones.activaridComisionGrupo,this,true,"idComisionGrupo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionGrupo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionGrupo,ComisionGrupoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.comisiongrupoConstantesFunciones.mostrarid_empresaComisionGrupo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionGrupoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.comisiongrupoConstantesFunciones.resaltarid_empresaComisionGrupo,this,this.comisiongrupoConstantesFunciones.activarid_empresaComisionGrupo,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.comisiongrupoConstantesFunciones.resaltarid_empresaComisionGrupo,this,this.comisiongrupoConstantesFunciones.activarid_empresaComisionGrupo,false,"id_empresaComisionGrupo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionGrupoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionGrupo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionGrupo,ComisionGrupoConstantesFunciones.LABEL_IDCOMISIONCONFIG));

		if(this.comisiongrupoConstantesFunciones.mostrarid_comision_configComisionGrupo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionGrupoConstantesFunciones.LABEL_IDCOMISIONCONFIG,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ComisionConfigTableCell(this.comisionconfigsForeignKey,this.comisiongrupoConstantesFunciones.resaltarid_comision_configComisionGrupo,this,this.comisiongrupoConstantesFunciones.activarid_comision_configComisionGrupo,iSizeTabla));
			tableColumn.setCellEditor(new ComisionConfigTableCell(this.comisionconfigsForeignKey,this.comisiongrupoConstantesFunciones.resaltarid_comision_configComisionGrupo,this,this.comisiongrupoConstantesFunciones.activarid_comision_configComisionGrupo,true,"id_comision_configComisionGrupo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionGrupoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionGrupo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionGrupo,ComisionGrupoConstantesFunciones.LABEL_IDVENDEDOR));

		if(this.comisiongrupoConstantesFunciones.mostrarid_vendedorComisionGrupo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionGrupoConstantesFunciones.LABEL_IDVENDEDOR,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new VendedorTableCell(this.vendedorsForeignKey,this.comisiongrupoConstantesFunciones.resaltarid_vendedorComisionGrupo,this,this.comisiongrupoConstantesFunciones.activarid_vendedorComisionGrupo,iSizeTabla));
			tableColumn.setCellEditor(new VendedorTableCell(this.vendedorsForeignKey,this.comisiongrupoConstantesFunciones.resaltarid_vendedorComisionGrupo,this,this.comisiongrupoConstantesFunciones.activarid_vendedorComisionGrupo,true,"id_vendedorComisionGrupo","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionGrupoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionGrupo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionGrupo,ComisionGrupoConstantesFunciones.LABEL_IDLINEA));

		if(this.comisiongrupoConstantesFunciones.mostrarid_lineaComisionGrupo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionGrupoConstantesFunciones.LABEL_IDLINEA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineasForeignKey,this.comisiongrupoConstantesFunciones.resaltarid_lineaComisionGrupo,this,this.comisiongrupoConstantesFunciones.activarid_lineaComisionGrupo,iSizeTabla));
			tableColumn.setCellEditor(new LineaTableCell(this.lineasForeignKey,this.comisiongrupoConstantesFunciones.resaltarid_lineaComisionGrupo,this,this.comisiongrupoConstantesFunciones.activarid_lineaComisionGrupo,true,"id_lineaComisionGrupo","BASICO-CON_EVENT_CHANGE"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionGrupoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionGrupo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionGrupo,ComisionGrupoConstantesFunciones.LABEL_IDLINEAGRUPO));

		if(this.comisiongrupoConstantesFunciones.mostrarid_linea_grupoComisionGrupo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionGrupoConstantesFunciones.LABEL_IDLINEAGRUPO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new LineaTableCell(this.lineagruposForeignKey,this.comisiongrupoConstantesFunciones.resaltarid_linea_grupoComisionGrupo,this,this.comisiongrupoConstantesFunciones.activarid_linea_grupoComisionGrupo,iSizeTabla));
			tableColumn.setCellEditor(new LineaTableCell(this.lineagruposForeignKey,this.comisiongrupoConstantesFunciones.resaltarid_linea_grupoComisionGrupo,this,this.comisiongrupoConstantesFunciones.activarid_linea_grupoComisionGrupo,true,"id_linea_grupoComisionGrupo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionGrupoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionGrupo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionGrupo,ComisionGrupoConstantesFunciones.LABEL_IDESTADOCOMISION));

		if(this.comisiongrupoConstantesFunciones.mostrarid_estado_comisionComisionGrupo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionGrupoConstantesFunciones.LABEL_IDESTADOCOMISION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstadoComisionTableCell(this.estadocomisionsForeignKey,this.comisiongrupoConstantesFunciones.resaltarid_estado_comisionComisionGrupo,this,this.comisiongrupoConstantesFunciones.activarid_estado_comisionComisionGrupo,iSizeTabla));
			tableColumn.setCellEditor(new EstadoComisionTableCell(this.estadocomisionsForeignKey,this.comisiongrupoConstantesFunciones.resaltarid_estado_comisionComisionGrupo,this,this.comisiongrupoConstantesFunciones.activarid_estado_comisionComisionGrupo,true,"id_estado_comisionComisionGrupo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionGrupoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionGrupo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionGrupo,ComisionGrupoConstantesFunciones.LABEL_PORCENTAJE));

		if(this.comisiongrupoConstantesFunciones.mostrarporcentajeComisionGrupo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionGrupoConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comisiongrupoConstantesFunciones.resaltarporcentajeComisionGrupo,this.comisiongrupoConstantesFunciones.activarporcentajeComisionGrupo,iSizeTabla,this,true,"porcentajeComisionGrupo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisiongrupoConstantesFunciones.resaltarporcentajeComisionGrupo,this.comisiongrupoConstantesFunciones.activarporcentajeComisionGrupo,this,true,"porcentajeComisionGrupo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComisionGrupoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionGrupo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionGrupo,ComisionGrupoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.comisiongrupoConstantesFunciones.mostrardescripcionComisionGrupo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionGrupoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comisiongrupoConstantesFunciones.resaltardescripcionComisionGrupo,this.comisiongrupoConstantesFunciones.activardescripcionComisionGrupo,iSizeTabla,this,true,"descripcionComisionGrupo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisiongrupoConstantesFunciones.resaltardescripcionComisionGrupo,this.comisiongrupoConstantesFunciones.activardescripcionComisionGrupo,this,true,"descripcionComisionGrupo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionGrupoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.comisiongrupoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.comisiongrupoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.comisiongrupoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosComisionGrupo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.comisiongrupoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.comisiongrupoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosComisionGrupo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarComisionGrupo && this.isPermisoGuardarCambiosComisionGrupo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.comisiongrupoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.comisiongrupoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosComisionGrupo.addColumn(tableColumn);
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
			
			this.jTableDatosComisionGrupo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarComisionGrupo && this.isPermisoGuardarCambiosComisionGrupo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarComisionGrupo && this.isPermisoGuardarCambiosComisionGrupo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosComisionGrupo.moveColumn(this.jTableDatosComisionGrupo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosComisionGrupo.moveColumn(this.jTableDatosComisionGrupo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosComisionGrupo.moveColumn(this.jTableDatosComisionGrupo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosComisionGrupo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosComisionGrupo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosComisionGrupo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ComisionGrupoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosComisionGrupo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosComisionGrupo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ComisionGrupoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ComisionGrupoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosComisionGrupo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosComisionGrupo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosComisionGrupo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=comisiongrupoLogic.getComisionGrupos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=comisiongrupos.size()-1;
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
		//this.jTableDatosComisionGrupo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosComisionGrupo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosComisionGrupo();
			
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
				
				//this.isEsNuevoComisionGrupo=false;
					
				ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
			
				if(this.comisiongrupoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormComisionGrupo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosComisionGrupo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosComisionGrupo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupo =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisiongrupo =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.comisiongrupo.getsType().equals("DUPLICADO")
				   || this.comisiongrupo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoComisionGrupo=true;
				
				} else {
					this.isEsNuevoComisionGrupo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
					if(this.comisiongrupo.getId()>=0 && !this.comisiongrupo.getIsNew()) {						
						this.isEsNuevoComisionGrupo=false;
						
					} else {
						this.isEsNuevoComisionGrupo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoComisionGrupo(esRelaciones);						
				
				this.seleccionarComisionGrupo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.comisiongrupo.getId()<0) {
					this.isEsNuevoComisionGrupo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarComisionGrupo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarComisionGrupo(evt,rowIndex);
				}	
				
				if(this.comisiongrupoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ComisionGrupo: " + this.dDif); 
					}
				}								
				
				ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarComisionGrupo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.comisiongrupo)) {
					if(this.comisiongrupo.getId()>0) {
						this.comisiongrupo.setIsDeleted(true);
						
						this.comisiongruposEliminados.add(this.comisiongrupo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.comisiongrupoLogic.getComisionGrupos().remove(this.comisiongrupo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.comisiongrupos.remove(this.comisiongrupo);				
					}
					
					
					((ComisionGrupoModel) this.jTableDatosComisionGrupo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaComisionGrupo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarComisionGrupo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoComisionGrupo) {
			
			if(this.jInternalFrameDetalleFormComisionGrupo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosComisionGrupo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosComisionGrupo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupo =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisiongrupo =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ComisionGrupoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioComisionGrupo(this.comisiongrupo);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.comisiongrupoConstantesFunciones.cargarid_empresaComisionGrupo || this.comisiongrupoConstantesFunciones.event_dependid_empresaComisionGrupo) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.comisiongrupo.getid_empresa());
									//this.inicializarActualizarBindingComisionGrupo(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(comisiongrupo.getEmpresa()!=null) {
							this.empresasForeignKey.add(comisiongrupo.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.comisiongrupo.getid_empresa(),false,"Formulario");

					//ComisionConfig
					if(!this.comisiongrupoConstantesFunciones.cargarid_comision_configComisionGrupo || this.comisiongrupoConstantesFunciones.event_dependid_comision_configComisionGrupo) {
						//this.cargarCombosComisionConfigsForeignKeyLista(" where id="+this.comisiongrupo.getid_comision_config());
									//this.inicializarActualizarBindingComisionGrupo(false,false);
						this.comisionconfigsForeignKey=new ArrayList<ComisionConfig>();

						if(comisiongrupo.getComisionConfig()!=null) {
							this.comisionconfigsForeignKey.add(comisiongrupo.getComisionConfig());
						}

						this.addItemDefectoCombosForeignKeyComisionConfig();
						this.cargarCombosFrameComisionConfigsForeignKey("Todos");
					}
					this.setActualComisionConfigForeignKey(this.comisiongrupo.getid_comision_config(),false,"Formulario");

					//Vendedor
					if(!this.comisiongrupoConstantesFunciones.cargarid_vendedorComisionGrupo || this.comisiongrupoConstantesFunciones.event_dependid_vendedorComisionGrupo) {
						//this.cargarCombosVendedorsForeignKeyLista(" where id="+this.comisiongrupo.getid_vendedor());
									//this.inicializarActualizarBindingComisionGrupo(false,false);
						this.vendedorsForeignKey=new ArrayList<Vendedor>();

						if(comisiongrupo.getVendedor()!=null) {
							this.vendedorsForeignKey.add(comisiongrupo.getVendedor());
						}

						this.addItemDefectoCombosForeignKeyVendedor();
						this.cargarCombosFrameVendedorsForeignKey("Todos");
					}
					this.setActualVendedorForeignKey(this.comisiongrupo.getid_vendedor(),false,"Formulario");

					//Linea
					if(!this.comisiongrupoConstantesFunciones.cargarid_lineaComisionGrupo || this.comisiongrupoConstantesFunciones.event_dependid_lineaComisionGrupo) {
						//this.cargarCombosLineasForeignKeyLista(" where id="+this.comisiongrupo.getid_linea());
									//this.inicializarActualizarBindingComisionGrupo(false,false);
						this.lineasForeignKey=new ArrayList<Linea>();

						if(comisiongrupo.getLinea()!=null) {
							this.lineasForeignKey.add(comisiongrupo.getLinea());
						}

						this.addItemDefectoCombosForeignKeyLinea();
						this.cargarCombosFrameLineasForeignKey("Todos");
					}
					this.setActualLineaForeignKey(this.comisiongrupo.getid_linea(),false,"Formulario");

					//LineaGrupo
					if(!this.comisiongrupoConstantesFunciones.cargarid_linea_grupoComisionGrupo || this.comisiongrupoConstantesFunciones.event_dependid_linea_grupoComisionGrupo) {
						//this.cargarCombosLineaGruposForeignKeyLista(" where id="+this.comisiongrupo.getid_linea_grupo());
									//this.inicializarActualizarBindingComisionGrupo(false,false);
						this.lineagruposForeignKey=new ArrayList<Linea>();

						if(comisiongrupo.getLineaGrupo()!=null) {
							this.lineagruposForeignKey.add(comisiongrupo.getLineaGrupo());
						}

						this.addItemDefectoCombosForeignKeyLineaGrupo();
						this.cargarCombosFrameLineaGruposForeignKey("Todos");
					}
					this.setActualLineaGrupoForeignKey(this.comisiongrupo.getid_linea_grupo(),false,"Formulario");

					//EstadoComision
					if(!this.comisiongrupoConstantesFunciones.cargarid_estado_comisionComisionGrupo || this.comisiongrupoConstantesFunciones.event_dependid_estado_comisionComisionGrupo) {
						//this.cargarCombosEstadoComisionsForeignKeyLista(" where id="+this.comisiongrupo.getid_estado_comision());
									//this.inicializarActualizarBindingComisionGrupo(false,false);
						this.estadocomisionsForeignKey=new ArrayList<EstadoComision>();

						if(comisiongrupo.getEstadoComision()!=null) {
							this.estadocomisionsForeignKey.add(comisiongrupo.getEstadoComision());
						}

						this.addItemDefectoCombosForeignKeyEstadoComision();
						this.cargarCombosFrameEstadoComisionsForeignKey("Todos");
					}
					this.setActualEstadoComisionForeignKey(this.comisiongrupo.getid_estado_comision(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesComisionGrupo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesComisionGrupo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComisionGrupo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoComisionGrupo(ComisionGrupo comisiongrupo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoComisionGrupo(comisiongrupo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoComisionGrupo(ComisionGrupo comisiongrupo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioComisionGrupo(comisiongrupo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyComisionGrupo(comisiongrupo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyComisionGrupo(comisiongrupo);
	}
	
	public void setVariablesObjetoActualToFormularioComisionGrupo(ComisionGrupo comisiongrupo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormComisionGrupo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormComisionGrupo.jLabelidComisionGrupo.setText(comisiongrupo.getId().toString());
			this.jInternalFrameDetalleFormComisionGrupo.jTextFieldporcentajeComisionGrupo.setText(comisiongrupo.getporcentaje().toString());
			this.jInternalFrameDetalleFormComisionGrupo.jTextAreadescripcionComisionGrupo.setText(comisiongrupo.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ComisionGrupo comisiongrupoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,comisiongrupoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ComisionGrupo comisiongrupoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				comisiongrupoLocal=this.comisiongrupo;
			} else {
				comisiongrupoLocal=this.comisiongrupoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(comisiongrupoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoComisionGrupo(comisiongrupoLocal,true);
					
					if(comisiongrupoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(comisiongrupoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(comisiongrupoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoComisionGrupo(ComisionGrupo comisiongrupo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualComisionGrupo(comisiongrupo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(comisiongrupo);
	}
	
	public void setVariablesFormularioToObjetoActualComisionGrupo(ComisionGrupo comisiongrupo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualComisionGrupo(comisiongrupo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualComisionGrupo(ComisionGrupo comisiongrupo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormComisionGrupo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormComisionGrupo.jLabelidComisionGrupo.getText()==null || this.jInternalFrameDetalleFormComisionGrupo.jLabelidComisionGrupo.getText()=="" || this.jInternalFrameDetalleFormComisionGrupo.jLabelidComisionGrupo.getText()=="Id") {
				this.jInternalFrameDetalleFormComisionGrupo.jLabelidComisionGrupo.setText("0");
			}

			if(conColumnasBase) {comisiongrupo.setId(Long.parseLong(this.jInternalFrameDetalleFormComisionGrupo.jLabelidComisionGrupo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionGrupoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionGrupo.jLabelIdComisionGrupo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comisiongrupo.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormComisionGrupo.jTextFieldporcentajeComisionGrupo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionGrupoConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionGrupo.jLabelporcentajeComisionGrupo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comisiongrupo.setdescripcion(this.jInternalFrameDetalleFormComisionGrupo.jTextAreadescripcionComisionGrupo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionGrupoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionGrupo.jLabeldescripcionComisionGrupo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualComisionGrupo(ComisionGrupo comisiongrupoBean,ComisionGrupo comisiongrupo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && comisiongrupoBean.getid_comision_config()!=null && !comisiongrupoBean.getid_comision_config().equals(-1L))) {comisiongrupo.setid_comision_config(comisiongrupoBean.getid_comision_config());}
			if(conDefault || (!conDefault && comisiongrupoBean.getid_vendedor()!=null && !comisiongrupoBean.getid_vendedor().equals(-1L))) {comisiongrupo.setid_vendedor(comisiongrupoBean.getid_vendedor());}
			if(conDefault || (!conDefault && comisiongrupoBean.getid_linea()!=null && !comisiongrupoBean.getid_linea().equals(-1L))) {comisiongrupo.setid_linea(comisiongrupoBean.getid_linea());}
			if(conDefault || (!conDefault && comisiongrupoBean.getid_linea_grupo()!=null && !comisiongrupoBean.getid_linea_grupo().equals(-1L))) {comisiongrupo.setid_linea_grupo(comisiongrupoBean.getid_linea_grupo());}
			if(conDefault || (!conDefault && comisiongrupoBean.getid_estado_comision()!=null && !comisiongrupoBean.getid_estado_comision().equals(-1L))) {comisiongrupo.setid_estado_comision(comisiongrupoBean.getid_estado_comision());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosComisionGrupo(ComisionGrupo comisiongrupoOrigen,ComisionGrupo comisiongrupo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && comisiongrupoOrigen.getId()!=null && !comisiongrupoOrigen.getId().equals(0L))) {comisiongrupo.setId(comisiongrupoOrigen.getId());}}
			if(conDefault || (!conDefault && comisiongrupoOrigen.getid_comision_config()!=null && !comisiongrupoOrigen.getid_comision_config().equals(-1L))) {comisiongrupo.setid_comision_config(comisiongrupoOrigen.getid_comision_config());}
			if(conDefault || (!conDefault && comisiongrupoOrigen.getid_vendedor()!=null && !comisiongrupoOrigen.getid_vendedor().equals(-1L))) {comisiongrupo.setid_vendedor(comisiongrupoOrigen.getid_vendedor());}
			if(conDefault || (!conDefault && comisiongrupoOrigen.getid_linea()!=null && !comisiongrupoOrigen.getid_linea().equals(-1L))) {comisiongrupo.setid_linea(comisiongrupoOrigen.getid_linea());}
			if(conDefault || (!conDefault && comisiongrupoOrigen.getid_linea_grupo()!=null && !comisiongrupoOrigen.getid_linea_grupo().equals(-1L))) {comisiongrupo.setid_linea_grupo(comisiongrupoOrigen.getid_linea_grupo());}
			if(conDefault || (!conDefault && comisiongrupoOrigen.getid_estado_comision()!=null && !comisiongrupoOrigen.getid_estado_comision().equals(-1L))) {comisiongrupo.setid_estado_comision(comisiongrupoOrigen.getid_estado_comision());}
			if(conDefault || (!conDefault && comisiongrupoOrigen.getporcentaje()!=null && !comisiongrupoOrigen.getporcentaje().equals(0.0))) {comisiongrupo.setporcentaje(comisiongrupoOrigen.getporcentaje());}
			if(conDefault || (!conDefault && comisiongrupoOrigen.getdescripcion()!=null && !comisiongrupoOrigen.getdescripcion().equals(""))) {comisiongrupo.setdescripcion(comisiongrupoOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioComisionGrupo(ComisionGrupo comisiongrupo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormComisionGrupo.jLabelidComisionGrupo.setText(comisiongrupo.getId().toString());
			this.jInternalFrameDetalleFormComisionGrupo.jTextFieldporcentajeComisionGrupo.setText(comisiongrupo.getporcentaje().toString());
			this.jInternalFrameDetalleFormComisionGrupo.jTextAreadescripcionComisionGrupo.setText(comisiongrupo.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioComisionGrupo(ComisionGrupoBean comisiongrupoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormComisionGrupo.jLabelidComisionGrupo.setText(comisiongrupoBean.getId().toString());
			this.jInternalFrameDetalleFormComisionGrupo.jTextFieldporcentajeComisionGrupo.setText(comisiongrupoBean.getporcentaje().toString());
			this.jInternalFrameDetalleFormComisionGrupo.jTextAreadescripcionComisionGrupo.setText(comisiongrupoBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanComisionGrupo(ComisionGrupoParameterReturnGeneral comisiongrupoReturnGeneral,ComisionGrupoBean comisiongrupoBean,Boolean conDefault) throws Exception { 
		try {
			ComisionGrupo comisiongrupoLocal=new ComisionGrupo();
			
			comisiongrupoLocal=comisiongrupoReturnGeneral.getComisionGrupo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && comisiongrupoLocal.getId()!=null && !comisiongrupoLocal.getId().equals(0L))) {comisiongrupoBean.setId(comisiongrupoLocal.getId());}}
			if(conDefault || (!conDefault && comisiongrupoLocal.getid_comision_config()!=null && !comisiongrupoLocal.getid_comision_config().equals(-1L))) {comisiongrupoBean.setid_comision_config(comisiongrupoLocal.getid_comision_config());}
			if(conDefault || (!conDefault && comisiongrupoLocal.getid_vendedor()!=null && !comisiongrupoLocal.getid_vendedor().equals(-1L))) {comisiongrupoBean.setid_vendedor(comisiongrupoLocal.getid_vendedor());}
			if(conDefault || (!conDefault && comisiongrupoLocal.getid_linea()!=null && !comisiongrupoLocal.getid_linea().equals(-1L))) {comisiongrupoBean.setid_linea(comisiongrupoLocal.getid_linea());}
			if(conDefault || (!conDefault && comisiongrupoLocal.getid_linea_grupo()!=null && !comisiongrupoLocal.getid_linea_grupo().equals(-1L))) {comisiongrupoBean.setid_linea_grupo(comisiongrupoLocal.getid_linea_grupo());}
			if(conDefault || (!conDefault && comisiongrupoLocal.getid_estado_comision()!=null && !comisiongrupoLocal.getid_estado_comision().equals(-1L))) {comisiongrupoBean.setid_estado_comision(comisiongrupoLocal.getid_estado_comision());}
			if(conDefault || (!conDefault && comisiongrupoLocal.getporcentaje()!=null && !comisiongrupoLocal.getporcentaje().equals(0.0))) {comisiongrupoBean.setporcentaje(comisiongrupoLocal.getporcentaje());}
			if(conDefault || (!conDefault && comisiongrupoLocal.getdescripcion()!=null && !comisiongrupoLocal.getdescripcion().equals(""))) {comisiongrupoBean.setdescripcion(comisiongrupoLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxComisionGrupoGenerico(Long idComisionGrupoSeleccionado,JComboBox jComboBoxComisionGrupo,List<ComisionGrupo> comisiongruposLocal)throws Exception {
		try {
			ComisionGrupo  comisiongrupoTemp=null;

			for(ComisionGrupo comisiongrupoAux:comisiongruposLocal) {
				if(comisiongrupoAux.getId()!=null && comisiongrupoAux.getId().equals(idComisionGrupoSeleccionado)) {
					comisiongrupoTemp=comisiongrupoAux;
					break;
				}
			}

			jComboBoxComisionGrupo.setSelectedItem(comisiongrupoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxComisionGrupoGenerico(JComboBox jComboBoxComisionGrupo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxComisionGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxComisionGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxComisionGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxComisionGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxComisionGrupo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxComisionGrupo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxComisionGrupo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxComisionGrupo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxComisionGrupo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxComisionGrupo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comisiongrupo=(ComisionGrupo) comisiongrupoLogic.getComisionGrupos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			comisiongrupo =(ComisionGrupo) comisiongrupos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!comisiongrupo.getIsNew() && !comisiongrupo.getIsChanged() && !comisiongrupo.getIsDeleted()) {
				sDescripcion=comisiongrupo.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=comisiongrupo.getempresa_descripcion();
			}
		}

		if(sTipo.equals("ComisionConfig")) {
			//sDescripcion=this.getActualComisionConfigForeignKeyDescripcion((Long)value);
			if(!comisiongrupo.getIsNew() && !comisiongrupo.getIsChanged() && !comisiongrupo.getIsDeleted()) {
				sDescripcion=comisiongrupo.getcomisionconfig_descripcion();
			} else {
				//sDescripcion=this.getActualComisionConfigForeignKeyDescripcion((Long)value);
				sDescripcion=comisiongrupo.getcomisionconfig_descripcion();
			}
		}

		if(sTipo.equals("Vendedor")) {
			//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
			if(!comisiongrupo.getIsNew() && !comisiongrupo.getIsChanged() && !comisiongrupo.getIsDeleted()) {
				sDescripcion=comisiongrupo.getvendedor_descripcion();
			} else {
				//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
				sDescripcion=comisiongrupo.getvendedor_descripcion();
			}
		}

		if(sTipo.equals("Linea")) {
			//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
			if(!comisiongrupo.getIsNew() && !comisiongrupo.getIsChanged() && !comisiongrupo.getIsDeleted()) {
				sDescripcion=comisiongrupo.getlinea_descripcion();
			} else {
				//sDescripcion=this.getActualLineaForeignKeyDescripcion((Long)value);
				sDescripcion=comisiongrupo.getlinea_descripcion();
			}
		}

		if(sTipo.equals("LineaGrupo")) {
			//sDescripcion=this.getActualLineaGrupoForeignKeyDescripcion((Long)value);
			if(!comisiongrupo.getIsNew() && !comisiongrupo.getIsChanged() && !comisiongrupo.getIsDeleted()) {
				sDescripcion=comisiongrupo.getlineagrupo_descripcion();
			} else {
				//ES DEPENDIENTE, SE FORZA DESDE DESCRIPCION
				sDescripcion=comisiongrupo.getlineagrupo_descripcion();
			}
		}

		if(sTipo.equals("EstadoComision")) {
			//sDescripcion=this.getActualEstadoComisionForeignKeyDescripcion((Long)value);
			if(!comisiongrupo.getIsNew() && !comisiongrupo.getIsChanged() && !comisiongrupo.getIsDeleted()) {
				sDescripcion=comisiongrupo.getestadocomision_descripcion();
			} else {
				//sDescripcion=this.getActualEstadoComisionForeignKeyDescripcion((Long)value);
				sDescripcion=comisiongrupo.getestadocomision_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ComisionGrupo comisiongrupoRow=new ComisionGrupo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comisiongrupoRow=(ComisionGrupo) comisiongrupoLogic.getComisionGrupos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			comisiongrupoRow=(ComisionGrupo) comisiongrupos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualComisionGrupo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoComisionGrupo.setVisible((this.isVisibilidadCeldaNuevoComisionGrupo && this.isPermisoNuevoComisionGrupo));			
			this.jButtonDuplicarComisionGrupo.setVisible((this.isVisibilidadCeldaDuplicarComisionGrupo && this.isPermisoDuplicarComisionGrupo));			
			this.jButtonCopiarComisionGrupo.setVisible((this.isVisibilidadCeldaCopiarComisionGrupo && this.isPermisoCopiarComisionGrupo));
			this.jButtonVerFormComisionGrupo.setVisible((this.isVisibilidadCeldaVerFormComisionGrupo && this.isPermisoVerFormComisionGrupo));
			
			this.jButtonAbrirOrderByComisionGrupo.setVisible((this.isVisibilidadCeldaOrdenComisionGrupo && this.isPermisoOrdenComisionGrupo));			
			
			this.jButtonNuevoRelacionesComisionGrupo.setVisible((this.isVisibilidadCeldaNuevoRelacionesComisionGrupo && this.isPermisoNuevoComisionGrupo));			
			this.jButtonNuevoGuardarCambiosComisionGrupo.setVisible((this.isVisibilidadCeldaNuevoComisionGrupo && this.isPermisoNuevoComisionGrupo && this.isPermisoGuardarCambiosComisionGrupo));
			
			if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
			this.jInternalFrameDetalleFormComisionGrupo.jButtonModificarComisionGrupo.setVisible((this.isVisibilidadCeldaModificarComisionGrupo && this.isPermisoActualizarComisionGrupo));	
			this.jInternalFrameDetalleFormComisionGrupo.jButtonActualizarComisionGrupo.setVisible((this.isVisibilidadCeldaActualizarComisionGrupo && this.isPermisoActualizarComisionGrupo));	
			this.jInternalFrameDetalleFormComisionGrupo.jButtonEliminarComisionGrupo.setVisible((this.isVisibilidadCeldaEliminarComisionGrupo && this.isPermisoEliminarComisionGrupo));
			this.jInternalFrameDetalleFormComisionGrupo.jButtonCancelarComisionGrupo.setVisible(this.isVisibilidadCeldaCancelarComisionGrupo);							
			this.jInternalFrameDetalleFormComisionGrupo.jButtonGuardarCambiosComisionGrupo.setVisible((this.isVisibilidadCeldaGuardarComisionGrupo && this.isPermisoGuardarCambiosComisionGrupo));			
			
			}
						
			this.jButtonGuardarCambiosTablaComisionGrupo.setVisible((this.isVisibilidadCeldaGuardarCambiosComisionGrupo && this.isPermisoGuardarCambiosComisionGrupo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarComisionGrupo.setVisible((this.isVisibilidadCeldaNuevoComisionGrupo && this.isPermisoNuevoComisionGrupo));						
			this.jButtonDuplicarToolBarComisionGrupo.setVisible((this.isVisibilidadCeldaDuplicarComisionGrupo && this.isPermisoDuplicarComisionGrupo));						
			this.jButtonCopiarToolBarComisionGrupo.setVisible((this.isVisibilidadCeldaCopiarComisionGrupo && this.isPermisoCopiarComisionGrupo));			
			this.jButtonVerFormToolBarComisionGrupo.setVisible((this.isVisibilidadCeldaVerFormComisionGrupo && this.isPermisoVerFormComisionGrupo));			
			this.jButtonAbrirOrderByToolBarComisionGrupo.setVisible((this.isVisibilidadCeldaOrdenComisionGrupo && this.isPermisoOrdenComisionGrupo));
			this.jButtonNuevoRelacionesToolBarComisionGrupo.setVisible((this.isVisibilidadCeldaNuevoRelacionesComisionGrupo && this.isPermisoNuevoComisionGrupo));			
			this.jButtonNuevoGuardarCambiosToolBarComisionGrupo.setVisible((this.isVisibilidadCeldaNuevoComisionGrupo && this.isPermisoNuevoComisionGrupo && this.isPermisoGuardarCambiosComisionGrupo));			
			
			if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
			this.jInternalFrameDetalleFormComisionGrupo.jButtonModificarToolBarComisionGrupo.setVisible((this.isVisibilidadCeldaModificarComisionGrupo && this.isPermisoActualizarComisionGrupo));	
			this.jInternalFrameDetalleFormComisionGrupo.jButtonActualizarToolBarComisionGrupo.setVisible((this.isVisibilidadCeldaActualizarComisionGrupo  && this.isPermisoActualizarComisionGrupo));	
			this.jInternalFrameDetalleFormComisionGrupo.jButtonEliminarToolBarComisionGrupo.setVisible((this.isVisibilidadCeldaEliminarComisionGrupo && this.isPermisoEliminarComisionGrupo));
			this.jInternalFrameDetalleFormComisionGrupo.jButtonCancelarToolBarComisionGrupo.setVisible(this.isVisibilidadCeldaCancelarComisionGrupo);				
			this.jInternalFrameDetalleFormComisionGrupo.jButtonGuardarCambiosToolBarComisionGrupo.setVisible((this.isVisibilidadCeldaGuardarComisionGrupo && this.isPermisoGuardarCambiosComisionGrupo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarComisionGrupo.setVisible((this.isVisibilidadCeldaGuardarCambiosComisionGrupo && this.isPermisoGuardarCambiosComisionGrupo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoComisionGrupo.setVisible((this.isVisibilidadCeldaNuevoComisionGrupo && this.isPermisoNuevoComisionGrupo));			
			this.jMenuItemDuplicarComisionGrupo.setVisible((this.isVisibilidadCeldaDuplicarComisionGrupo && this.isPermisoDuplicarComisionGrupo));			
			this.jMenuItemCopiarComisionGrupo.setVisible((this.isVisibilidadCeldaCopiarComisionGrupo && this.isPermisoCopiarComisionGrupo));			
			this.jMenuItemVerFormComisionGrupo.setVisible((this.isVisibilidadCeldaVerFormComisionGrupo && this.isPermisoVerFormComisionGrupo));			
			this.jMenuItemAbrirOrderByComisionGrupo.setVisible((this.isVisibilidadCeldaOrdenComisionGrupo && this.isPermisoOrdenComisionGrupo));			
			//this.jMenuItemMostrarOcultarComisionGrupo.setVisible((this.isVisibilidadCeldaOrdenComisionGrupo && this.isPermisoOrdenComisionGrupo));
			this.jMenuItemDetalleAbrirOrderByComisionGrupo.setVisible((this.isVisibilidadCeldaOrdenComisionGrupo && this.isPermisoOrdenComisionGrupo));			
			//this.jMenuItemDetalleMostrarOcultarComisionGrupo.setVisible((this.isVisibilidadCeldaOrdenComisionGrupo && this.isPermisoOrdenComisionGrupo));			
			this.jMenuItemNuevoRelacionesComisionGrupo.setVisible((this.isVisibilidadCeldaNuevoRelacionesComisionGrupo && this.isPermisoNuevoComisionGrupo));			
			this.jMenuItemNuevoGuardarCambiosComisionGrupo.setVisible((this.isVisibilidadCeldaNuevoComisionGrupo && this.isPermisoNuevoComisionGrupo && this.isPermisoGuardarCambiosComisionGrupo));									
			
			if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
			this.jInternalFrameDetalleFormComisionGrupo.jMenuItemModificarComisionGrupo.setVisible((this.isVisibilidadCeldaModificarComisionGrupo && this.isPermisoActualizarComisionGrupo));	
			this.jInternalFrameDetalleFormComisionGrupo.jMenuItemActualizarComisionGrupo.setVisible((this.isVisibilidadCeldaActualizarComisionGrupo && this.isPermisoActualizarComisionGrupo));	
			this.jInternalFrameDetalleFormComisionGrupo.jMenuItemEliminarComisionGrupo.setVisible((this.isVisibilidadCeldaEliminarComisionGrupo && this.isPermisoEliminarComisionGrupo));
			this.jInternalFrameDetalleFormComisionGrupo.jMenuItemCancelarComisionGrupo.setVisible(this.isVisibilidadCeldaCancelarComisionGrupo);				
			}
			
			this.jMenuItemGuardarCambiosComisionGrupo.setVisible((this.isVisibilidadCeldaGuardarComisionGrupo && this.isPermisoGuardarCambiosComisionGrupo));						
			this.jMenuItemGuardarCambiosTablaComisionGrupo.setVisible((this.isVisibilidadCeldaGuardarCambiosComisionGrupo && this.isPermisoGuardarCambiosComisionGrupo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoComisionGrupo=this.jButtonNuevoComisionGrupo.isVisible();
			this.isVisibilidadCeldaDuplicarComisionGrupo=this.jButtonDuplicarComisionGrupo.isVisible();
			this.isVisibilidadCeldaCopiarComisionGrupo=this.jButtonCopiarComisionGrupo.isVisible();
			this.isVisibilidadCeldaVerFormComisionGrupo=this.jButtonVerFormComisionGrupo.isVisible();
			
			this.isVisibilidadCeldaOrdenComisionGrupo=this.jButtonAbrirOrderByComisionGrupo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesComisionGrupo=this.jButtonNuevoRelacionesComisionGrupo.isVisible();
			this.isVisibilidadCeldaModificarComisionGrupo=this.jButtonModificarComisionGrupo.isVisible();
			
			if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
			this.isVisibilidadCeldaActualizarComisionGrupo=this.jInternalFrameDetalleFormComisionGrupo.jButtonActualizarComisionGrupo.isVisible();
			this.isVisibilidadCeldaEliminarComisionGrupo=this.jInternalFrameDetalleFormComisionGrupo.jButtonEliminarComisionGrupo.isVisible();
			this.isVisibilidadCeldaCancelarComisionGrupo=this.jInternalFrameDetalleFormComisionGrupo.jButtonCancelarComisionGrupo.isVisible();
			this.isVisibilidadCeldaGuardarComisionGrupo=this.jInternalFrameDetalleFormComisionGrupo.jButtonGuardarCambiosComisionGrupo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosComisionGrupo=this.jButtonGuardarCambiosTablaComisionGrupo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoComisionGrupo=this.jButtonNuevoToolBarComisionGrupo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesComisionGrupo=this.jButtonNuevoRelacionesToolBarComisionGrupo.isVisible();
			
			if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
			this.isVisibilidadCeldaModificarComisionGrupo=this.jInternalFrameDetalleFormComisionGrupo.jButtonModificarToolBarComisionGrupo.isVisible();
			this.isVisibilidadCeldaActualizarComisionGrupo=this.jInternalFrameDetalleFormComisionGrupo.jButtonActualizarToolBarComisionGrupo.isVisible();
			this.isVisibilidadCeldaEliminarComisionGrupo=this.jInternalFrameDetalleFormComisionGrupo.jButtonEliminarToolBarComisionGrupo.isVisible();
			this.isVisibilidadCeldaCancelarComisionGrupo=this.jInternalFrameDetalleFormComisionGrupo.jButtonCancelarToolBarComisionGrupo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarComisionGrupo=this.jButtonGuardarCambiosToolBarComisionGrupo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosComisionGrupo=this.jButtonGuardarCambiosTablaToolBarComisionGrupo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoComisionGrupo=this.jMenuItemNuevoComisionGrupo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesComisionGrupo=this.jMenuItemNuevoRelacionesComisionGrupo.isVisible();
			
			if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
			this.isVisibilidadCeldaModificarComisionGrupo=this.jInternalFrameDetalleFormComisionGrupo.jMenuItemModificarComisionGrupo.isVisible();
			this.isVisibilidadCeldaActualizarComisionGrupo=this.jInternalFrameDetalleFormComisionGrupo.jMenuItemActualizarComisionGrupo.isVisible();
			this.isVisibilidadCeldaEliminarComisionGrupo=this.jInternalFrameDetalleFormComisionGrupo.jMenuItemEliminarComisionGrupo.isVisible();
			this.isVisibilidadCeldaCancelarComisionGrupo=this.jInternalFrameDetalleFormComisionGrupo.jMenuItemCancelarComisionGrupo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarComisionGrupo=this.jMenuItemGuardarCambiosComisionGrupo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosComisionGrupo=this.jMenuItemGuardarCambiosTablaComisionGrupo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesComisionGrupo(Boolean esInicializar) {
		if(ComisionGrupoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.comisiongrupoSessionBean.getConGuardarRelaciones()) {
				//if(this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesComisionGrupo();
			}
			
			this.inicializarActualizarBindingBotonesManualComisionGrupo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualComisionGrupo() {
		this.jButtonNuevoComisionGrupo.setVisible(this.isPermisoNuevoComisionGrupo);			
		this.jButtonDuplicarComisionGrupo.setVisible(this.isPermisoDuplicarComisionGrupo);			
		this.jButtonCopiarComisionGrupo.setVisible(this.isPermisoCopiarComisionGrupo);			
		this.jButtonVerFormComisionGrupo.setVisible(this.isPermisoVerFormComisionGrupo);			
		
		this.jButtonAbrirOrderByComisionGrupo.setVisible(this.isPermisoOrdenComisionGrupo);					
		
		this.jButtonNuevoRelacionesComisionGrupo.setVisible(this.isPermisoNuevoComisionGrupo);			
		
		if(this.jInternalFrameDetalleFormComisionGrupo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionGrupo.jButtonModificarComisionGrupo.setVisible(this.isPermisoActualizarComisionGrupo);	
			this.jInternalFrameDetalleFormComisionGrupo.jButtonActualizarComisionGrupo.setVisible(this.isPermisoActualizarComisionGrupo);	
			this.jInternalFrameDetalleFormComisionGrupo.jButtonEliminarComisionGrupo.setVisible(this.isPermisoEliminarComisionGrupo);
			this.jInternalFrameDetalleFormComisionGrupo.jButtonCancelarComisionGrupo.setVisible(this.isVisibilidadCeldaCancelarComisionGrupo);						
			this.jInternalFrameDetalleFormComisionGrupo.jButtonGuardarCambiosComisionGrupo.setVisible(this.isPermisoGuardarCambiosComisionGrupo);							
		}
		
		this.jButtonGuardarCambiosTablaComisionGrupo.setVisible(this.isPermisoActualizarComisionGrupo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleComisionGrupo() {
		this.jInternalFrameDetalleFormComisionGrupo.jButtonModificarComisionGrupo.setVisible(this.isPermisoActualizarComisionGrupo);	
		this.jInternalFrameDetalleFormComisionGrupo.jButtonActualizarComisionGrupo.setVisible(this.isPermisoActualizarComisionGrupo);	
		this.jInternalFrameDetalleFormComisionGrupo.jButtonEliminarComisionGrupo.setVisible(this.isPermisoEliminarComisionGrupo);
		this.jInternalFrameDetalleFormComisionGrupo.jButtonCancelarComisionGrupo.setVisible(this.isVisibilidadCeldaCancelarComisionGrupo);							
		this.jInternalFrameDetalleFormComisionGrupo.jButtonGuardarCambiosComisionGrupo.setVisible((this.isVisibilidadCeldaGuardarComisionGrupo && this.isPermisoGuardarCambiosComisionGrupo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosComisionGrupo() {
		if(ComisionGrupoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualComisionGrupo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesComisionGrupo() {
	}
	
	public void jTableDatosComisionGrupoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarComisionGrupo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidComisionGrupoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionGrupo(this.getcomisiongrupo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisiongrupo =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisiongrupo =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisiongrupo==null) {
						this.comisiongrupo = new ComisionGrupo();
					}

					this.setVariablesFormularioToObjetoActualComisionGrupo(this.comisiongrupo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);
				}

				if(this.comisiongrupo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.comisiongrupo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionGrupo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaComisionGrupoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebComisionGrupo(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionGrupo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionGrupo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupo =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisiongrupo =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionGrupo(this.getcomisiongrupo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.comisiongrupoLogic.getConnexion());

				if(this.comisiongrupo.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.comisiongrupo.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionGrupo=(TitledBorder)this.jScrollPanelDatosComisionGrupo.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderComisionGrupo.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaComisionGrupoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionGrupo(this.getcomisiongrupo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisiongrupo =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisiongrupo =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisiongrupo==null) {
						this.comisiongrupo = new ComisionGrupo();
					}

					this.setVariablesFormularioToObjetoActualComisionGrupo(this.comisiongrupo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);
				}

				if(this.comisiongrupo.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.comisiongrupo.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionGrupo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_comision_configComisionGrupoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocomisionconfig=true;

			idTienePermisocomisionconfig=this.tienePermisosUsuarioEnPaginaWebComisionGrupo(ComisionConfigConstantesFunciones.CLASSNAME);

			if(idTienePermisocomisionconfig) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionGrupo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionGrupo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupo =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisiongrupo =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionGrupo(this.getcomisiongrupo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);

				this.comisionconfigBeanSwingJInternalFrame=new ComisionConfigBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.comisionconfigBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.comisionconfigBeanSwingJInternalFrame.getComisionConfigLogic().setConnexion(this.comisiongrupoLogic.getConnexion());

				if(this.comisiongrupo.getid_comision_config()!=null) {
					this.comisionconfigBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.comisionconfigBeanSwingJInternalFrame.setIdActual(this.comisiongrupo.getid_comision_config());
					this.comisionconfigBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.comisionconfigBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.comisionconfigBeanSwingJInternalFrame.inicializarActualizarBindingTablaComisionConfig();
				}

				JInternalFrameBase jinternalFrame =this.comisionconfigBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionGrupo=(TitledBorder)this.jScrollPanelDatosComisionGrupo.getBorder();
				TitledBorder titledBordercomisionconfig=(TitledBorder)this.comisionconfigBeanSwingJInternalFrame.jScrollPanelDatosComisionConfig.getBorder();

				titledBordercomisionconfig.setTitle(titledBorderComisionGrupo.getTitle() + " -> Comision Config");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_comision_configComisionGrupoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionGrupo(this.getcomisiongrupo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisiongrupo =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisiongrupo =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisiongrupo==null) {
						this.comisiongrupo = new ComisionGrupo();
					}

					this.setVariablesFormularioToObjetoActualComisionGrupo(this.comisiongrupo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);
				}

				if(this.comisiongrupo.getid_comision_config()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_comision_config = "+this.comisiongrupo.getid_comision_config().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionGrupo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_vendedorComisionGrupoActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderComisionGrupo=null;
			TitledBorder titledBordervendedor=null;

			if(!this.jScrollPanelDatosComisionGrupo.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderComisionGrupo=(TitledBorder)this.jScrollPanelDatosComisionGrupo.getBorder();
				titledBordervendedor=(TitledBorder)this.vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

				titledBordervendedor.setTitle(titledBorderComisionGrupo.getTitle() + " -> Vendedor");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_vendedorComisionGrupoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisovendedor=true;

			idTienePermisovendedor=this.tienePermisosUsuarioEnPaginaWebComisionGrupo(VendedorConstantesFunciones.CLASSNAME);

			if(idTienePermisovendedor) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionGrupo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionGrupo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupo =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisiongrupo =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionGrupo(this.getcomisiongrupo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);

				this.vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.vendedorBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.vendedorBeanSwingJInternalFrame.getVendedorLogic().setConnexion(this.comisiongrupoLogic.getConnexion());

				if(this.comisiongrupo.getid_vendedor()!=null) {
					this.vendedorBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.vendedorBeanSwingJInternalFrame.setIdActual(this.comisiongrupo.getid_vendedor());
					this.vendedorBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaVendedor();
				}

				JInternalFrameBase jinternalFrame =this.vendedorBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionGrupo=(TitledBorder)this.jScrollPanelDatosComisionGrupo.getBorder();
				TitledBorder titledBordervendedor=(TitledBorder)this.vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

				titledBordervendedor.setTitle(titledBorderComisionGrupo.getTitle() + " -> Vendedor");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_vendedorComisionGrupoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionGrupo(this.getcomisiongrupo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisiongrupo =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisiongrupo =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisiongrupo==null) {
						this.comisiongrupo = new ComisionGrupo();
					}

					this.setVariablesFormularioToObjetoActualComisionGrupo(this.comisiongrupo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);
				}

				if(this.comisiongrupo.getid_vendedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_vendedor = "+this.comisiongrupo.getid_vendedor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionGrupo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_lineaComisionGrupoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolinea=true;

			idTienePermisolinea=this.tienePermisosUsuarioEnPaginaWebComisionGrupo(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolinea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionGrupo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionGrupo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupo =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisiongrupo =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionGrupo(this.getcomisiongrupo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);

				this.lineaBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineaBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.comisiongrupoLogic.getConnexion());

				if(this.comisiongrupo.getid_linea()!=null) {
					this.lineaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineaBeanSwingJInternalFrame.setIdActual(this.comisiongrupo.getid_linea());
					this.lineaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionGrupo=(TitledBorder)this.jScrollPanelDatosComisionGrupo.getBorder();
				TitledBorder titledBorderlinea=(TitledBorder)this.lineaBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlinea.setTitle(titledBorderComisionGrupo.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_lineaComisionGrupoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionGrupo(this.getcomisiongrupo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisiongrupo =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisiongrupo =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisiongrupo==null) {
						this.comisiongrupo = new ComisionGrupo();
					}

					this.setVariablesFormularioToObjetoActualComisionGrupo(this.comisiongrupo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);
				}

				if(this.comisiongrupo.getid_linea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea = "+this.comisiongrupo.getid_linea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionGrupo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_linea_grupoComisionGrupoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisolineagrupo=true;

			idTienePermisolineagrupo=this.tienePermisosUsuarioEnPaginaWebComisionGrupo(LineaConstantesFunciones.CLASSNAME);

			if(idTienePermisolineagrupo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionGrupo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionGrupo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupo =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisiongrupo =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionGrupo(this.getcomisiongrupo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);

				this.lineagrupoBeanSwingJInternalFrame=new LineaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.lineagrupoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.lineagrupoBeanSwingJInternalFrame.getLineaLogic().setConnexion(this.comisiongrupoLogic.getConnexion());

				if(this.comisiongrupo.getid_linea_grupo()!=null) {
					this.lineagrupoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.lineagrupoBeanSwingJInternalFrame.setIdActual(this.comisiongrupo.getid_linea_grupo());
					this.lineagrupoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.lineagrupoBeanSwingJInternalFrame.inicializarActualizarBindingTablaLinea();
				}

				JInternalFrameBase jinternalFrame =this.lineagrupoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionGrupo=(TitledBorder)this.jScrollPanelDatosComisionGrupo.getBorder();
				TitledBorder titledBorderlineagrupo=(TitledBorder)this.lineagrupoBeanSwingJInternalFrame.jScrollPanelDatosLinea.getBorder();

				titledBorderlineagrupo.setTitle(titledBorderComisionGrupo.getTitle() + " -> Linea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_linea_grupoComisionGrupoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionGrupo(this.getcomisiongrupo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisiongrupo =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisiongrupo =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisiongrupo==null) {
						this.comisiongrupo = new ComisionGrupo();
					}

					this.setVariablesFormularioToObjetoActualComisionGrupo(this.comisiongrupo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);
				}

				if(this.comisiongrupo.getid_linea_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_linea_grupo = "+this.comisiongrupo.getid_linea_grupo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionGrupo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estado_comisionComisionGrupoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestadocomision=true;

			idTienePermisoestadocomision=this.tienePermisosUsuarioEnPaginaWebComisionGrupo(EstadoComisionConstantesFunciones.CLASSNAME);

			if(idTienePermisoestadocomision) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionGrupo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionGrupo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupo =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisiongrupo =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionGrupo(this.getcomisiongrupo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);

				this.estadocomisionBeanSwingJInternalFrame=new EstadoComisionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estadocomisionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estadocomisionBeanSwingJInternalFrame.getEstadoComisionLogic().setConnexion(this.comisiongrupoLogic.getConnexion());

				if(this.comisiongrupo.getid_estado_comision()!=null) {
					this.estadocomisionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estadocomisionBeanSwingJInternalFrame.setIdActual(this.comisiongrupo.getid_estado_comision());
					this.estadocomisionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estadocomisionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estadocomisionBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstadoComision();
				}

				JInternalFrameBase jinternalFrame =this.estadocomisionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionGrupo=(TitledBorder)this.jScrollPanelDatosComisionGrupo.getBorder();
				TitledBorder titledBorderestadocomision=(TitledBorder)this.estadocomisionBeanSwingJInternalFrame.jScrollPanelDatosEstadoComision.getBorder();

				titledBorderestadocomision.setTitle(titledBorderComisionGrupo.getTitle() + " -> Estado Comision");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estado_comisionComisionGrupoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionGrupo(this.getcomisiongrupo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisiongrupo =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisiongrupo =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisiongrupo==null) {
						this.comisiongrupo = new ComisionGrupo();
					}

					this.setVariablesFormularioToObjetoActualComisionGrupo(this.comisiongrupo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);
				}

				if(this.comisiongrupo.getid_estado_comision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estado_comision = "+this.comisiongrupo.getid_estado_comision().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionGrupo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeComisionGrupoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionGrupo(this.getcomisiongrupo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisiongrupo =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisiongrupo =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisiongrupo==null) {
						this.comisiongrupo = new ComisionGrupo();
					}

					this.setVariablesFormularioToObjetoActualComisionGrupo(this.comisiongrupo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);
				}

				if(this.comisiongrupo.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.comisiongrupo.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionGrupo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionComisionGrupoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionGrupo(this.getcomisiongrupo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisiongrupo =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisiongrupo =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisiongrupo==null) {
						this.comisiongrupo = new ComisionGrupo();
					}

					this.setVariablesFormularioToObjetoActualComisionGrupo(this.comisiongrupo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);
				}

				if(this.comisiongrupo.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.comisiongrupo.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionGrupo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdComisionConfigComisionGrupoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionGrupo(false,false);

			this.getComisionGruposFK_IdComisionConfig();

			this.inicializarActualizarBindingComisionGrupo(false);

			//if(ComisionGrupoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionGrupo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaComisionGrupoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionGrupo(false,false);

			this.getComisionGruposFK_IdEmpresa();

			this.inicializarActualizarBindingComisionGrupo(false);

			//if(ComisionGrupoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionGrupo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstadoComisionComisionGrupoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionGrupo(false,false);

			this.getComisionGruposFK_IdEstadoComision();

			this.inicializarActualizarBindingComisionGrupo(false);

			//if(ComisionGrupoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionGrupo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaComisionGrupoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionGrupo(false,false);

			this.getComisionGruposFK_IdLinea();

			this.inicializarActualizarBindingComisionGrupo(false);

			//if(ComisionGrupoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionGrupo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdLineaGrupoComisionGrupoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionGrupo(false,false);

			this.getComisionGruposFK_IdLineaGrupo();

			this.inicializarActualizarBindingComisionGrupo(false);

			//if(ComisionGrupoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionGrupo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdVendedorComisionGrupoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionGrupo(false,false);

			this.getComisionGruposFK_IdVendedor();

			this.inicializarActualizarBindingComisionGrupo(false);

			//if(ComisionGrupoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionGrupo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiongrupoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameComisionGrupo() {
		if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
			this.jInternalFrameDetalleFormComisionGrupo.setVisible(false);	    			
			this.jInternalFrameDetalleFormComisionGrupo.dispose();
			this.jInternalFrameDetalleFormComisionGrupo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoComisionGrupo!=null) {
			this.jInternalFrameReporteDinamicoComisionGrupo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoComisionGrupo.dispose();
			this.jInternalFrameReporteDinamicoComisionGrupo=null;
		}
		
		if(this.jInternalFrameImportacionComisionGrupo!=null) {
			this.jInternalFrameImportacionComisionGrupo.setVisible(false);	    			
			this.jInternalFrameImportacionComisionGrupo.dispose();
			this.jInternalFrameImportacionComisionGrupo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessComisionGrupo();
			
			ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
			
			
			if(sTipo.equals("NuevoComisionGrupo")) {
				jButtonNuevoComisionGrupoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarComisionGrupo")) {
				jButtonDuplicarComisionGrupoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarComisionGrupo")) {
				jButtonCopiarComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("VerFormComisionGrupo")) {
				jButtonVerFormComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarComisionGrupo")) {
				jButtonNuevoComisionGrupoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarComisionGrupo")) {
				jButtonDuplicarComisionGrupoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoComisionGrupo")) {
				jButtonNuevoComisionGrupoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarComisionGrupo")) {
				jButtonDuplicarComisionGrupoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesComisionGrupo")) {
				jButtonNuevoComisionGrupoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarComisionGrupo")) {
				jButtonNuevoComisionGrupoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesComisionGrupo")) {
				jButtonNuevoComisionGrupoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarComisionGrupo")) {
				jButtonModificarComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarComisionGrupo")) {
				jButtonModificarComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarComisionGrupo")) {
				jButtonModificarComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarComisionGrupo")) {
				jButtonActualizarComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarComisionGrupo")) {
				jButtonActualizarComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarComisionGrupo")) {
				jButtonActualizarComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("EliminarComisionGrupo")) {
				jButtonEliminarComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarComisionGrupo")) {
				jButtonEliminarComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarComisionGrupo")) {
				jButtonEliminarComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("CancelarComisionGrupo")) {
				jButtonCancelarComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarComisionGrupo")) {
				jButtonCancelarComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarComisionGrupo")) {
				jButtonCancelarComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("CerrarComisionGrupo")) {
				jButtonCerrarComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarComisionGrupo")) {
				jButtonCerrarComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarComisionGrupo")) {
				jButtonCerrarComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarComisionGrupo")) {
				jButtonMostrarOcultarComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarComisionGrupo")) {
				jButtonCancelarComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosComisionGrupo")) {
				jButtonGuardarCambiosComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarComisionGrupo")) {
				jButtonGuardarCambiosComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarComisionGrupo")) {
				jButtonCopiarComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarComisionGrupo")) {
				jButtonVerFormComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosComisionGrupo")) {
				jButtonGuardarCambiosComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarComisionGrupo")) {
				jButtonCopiarComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormComisionGrupo")) {
				jButtonVerFormComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaComisionGrupo")) {
				jButtonGuardarCambiosComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarComisionGrupo")) {
				jButtonGuardarCambiosComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaComisionGrupo")) {
				jButtonGuardarCambiosComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionComisionGrupo")) {
				jButtonRecargarInformacionComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarComisionGrupo")) {
				jButtonRecargarInformacionComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionComisionGrupo")) {
				jButtonRecargarInformacionComisionGrupoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresComisionGrupo")) {
				jButtonAnterioresComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarComisionGrupo")) {
				jButtonAnterioresComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreComisionGrupo")) {
				jButtonAnterioresComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesComisionGrupo")) {
				jButtonSiguientesComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarComisionGrupo")) {
				jButtonSiguientesComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesComisionGrupo")) {
				jButtonSiguientesComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByComisionGrupo") || sTipo.equals("MenuItemDetalleAbrirOrderByComisionGrupo")) {
				jButtonAbrirOrderByComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarComisionGrupo") || sTipo.equals("MenuItemDetalleMostrarOcultarComisionGrupo")) {
				jButtonMostrarOcultarComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosComisionGrupo")) {
				jButtonNuevoGuardarCambiosComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarComisionGrupo")) {
				jButtonNuevoGuardarCambiosComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosComisionGrupo")) {
				jButtonNuevoGuardarCambiosComisionGrupoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoComisionGrupo")) {
				jButtonCerrarReporteDinamicoComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoComisionGrupo")) {
				jButtonGenerarReporteDinamicoComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoComisionGrupo")) {
				
				jButtonGenerarExcelReporteDinamicoComisionGrupoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionComisionGrupo")) {
				jButtonCerrarImportacionComisionGrupoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionComisionGrupo")) {
				
				jButtonGenerarImportacionComisionGrupoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionComisionGrupo")) {
				
				jButtonAbrirImportacionComisionGrupoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesComisionGrupo")) {
				jComboBoxTiposAccionesComisionGrupoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesComisionGrupo")) {
				jComboBoxTiposRelacionesComisionGrupoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioComisionGrupo")) {
				jComboBoxTiposAccionesComisionGrupoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarComisionGrupo")) {
				
				jComboBoxTiposSeleccionarComisionGrupoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralComisionGrupo")) {
				jTextFieldValorCampoGeneralComisionGrupoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByComisionGrupo")) {
				jButtonAbrirOrderByComisionGrupoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarComisionGrupo")) {
				jButtonAbrirOrderByComisionGrupoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByComisionGrupo")) {
				jButtonCerrarOrderByComisionGrupoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idComisionGrupoBusqueda")) {
				this.jButtonidComisionGrupoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaComisionGrupoUpdate")) {
				this.jButtonid_empresaComisionGrupoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaComisionGrupoBusqueda")) {
				this.jButtonid_empresaComisionGrupoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_comision_configComisionGrupoUpdate")) {
				this.jButtonid_comision_configComisionGrupoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_comision_configComisionGrupoBusqueda")) {
				this.jButtonid_comision_configComisionGrupoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_vendedorComisionGrupo")) {
				this.jButtonid_vendedorComisionGrupoActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_vendedorComisionGrupoArbol")) {
				this.abrirFrameTreeVendedor("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorComisionGrupoUpdate")) {
				this.jButtonid_vendedorComisionGrupoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorComisionGrupoBusqueda")) {
				this.jButtonid_vendedorComisionGrupoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaComisionGrupoUpdate")) {
				this.jButtonid_lineaComisionGrupoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaComisionGrupoBusqueda")) {
				this.jButtonid_lineaComisionGrupoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoComisionGrupoUpdate")) {
				this.jButtonid_linea_grupoComisionGrupoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoComisionGrupoBusqueda")) {
				this.jButtonid_linea_grupoComisionGrupoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_comisionComisionGrupoUpdate")) {
				this.jButtonid_estado_comisionComisionGrupoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_comisionComisionGrupoBusqueda")) {
				this.jButtonid_estado_comisionComisionGrupoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeComisionGrupoBusqueda")) {
				this.jButtonporcentajeComisionGrupoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionComisionGrupoBusqueda")) {
				this.jButtondescripcionComisionGrupoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdComisionConfigComisionGrupo")) {
				this.jButtonFK_IdComisionConfigComisionGrupoActionPerformed(evt);
			}
			
			;
			
			
			ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessComisionGrupo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionGrupoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiongrupo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisiongrupo);
				
				ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
				
				


				
				ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionGrupo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionGrupo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ComisionGrupo comisiongrupoLocal=null;
			
			if(!this.getEsControlTabla()) {
				comisiongrupoLocal=this.comisiongrupo;
			} else {
				comisiongrupoLocal=this.comisiongrupoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiongrupo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisiongrupo);
				
				ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
							
				
				


				
				ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionGrupo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionGrupo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionGrupoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoAnterior =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisiongrupoAnterior =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
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
			
			ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
			
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
			
			


			
			ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionGrupoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiongrupo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisiongrupo);
				
				ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
								
						
				


				
				ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionGrupo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionGrupo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiongrupo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisiongrupo);
				
				ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
								
				
				


				
				ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionGrupo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionGrupo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionGrupoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoAnterior =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisiongrupoAnterior =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiongrupo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisiongrupo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionGrupoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoAnterior =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisiongrupoAnterior =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionGrupoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiongrupo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comisiongrupo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiongrupo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisiongrupo);
				
				ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
							
				
				


				
				ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionGrupo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionGrupo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionGrupoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisiongrupoAnterior =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.comisiongrupoAnterior =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
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
			
			ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
			
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
			
			


			
			ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionGrupoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiongrupo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comisiongrupo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiongrupo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisiongrupo);
				
				ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
								
				
				


				
				ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionGrupo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionGrupo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionGrupoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoAnterior =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisiongrupoAnterior =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionGrupoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiongrupo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comisiongrupo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionGrupoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiongrupo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisiongrupo);
				
				ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosComisionGrupo")) {
					jCheckBoxSeleccionarTodosComisionGrupoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosComisionGrupo")) {
					jCheckBoxSeleccionadosComisionGrupoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarComisionGrupo")) {
					
				}
				
				


				
				
				ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionGrupo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionGrupo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiongrupo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.comisiongrupo);
				
				ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
												
				
				


				
				
				ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionGrupo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionGrupo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionGrupoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisiongrupoAnterior =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.comisiongrupoAnterior =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionGrupoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiongrupo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisiongrupo);
				
				ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
				
				
				ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
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
			
			ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
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
			
			


			if(sTipo.equals("id_lineaComisionGrupo")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_lineaComisionGrupo;
				}

				if(this.comisiongrupoSessionBean.getConGuardarRelaciones()) {
					//classes=ComisionGrupoConstantesFunciones.getClassesRelationshipsOfComisionGrupo(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyLinea(jComboBoxGenerico,"Formulario");

				this.recargarFormComisionGrupo(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
			
			ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionGrupoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiongrupo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisiongrupo);
				
				ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


			if(sTipo.equals("id_lineaComisionGrupo")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_lineaComisionGrupo;
				}

				if(this.comisiongrupoSessionBean.getConGuardarRelaciones()) {
					//classes=ComisionGrupoConstantesFunciones.getClassesRelationshipsOfComisionGrupo(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyLinea(jComboBoxGenerico,"Formulario");

				this.recargarFormComisionGrupo(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
				
				ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionGrupo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionGrupo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiongrupo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisiongrupo);
				
				ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
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
				
				


			if(sTipo.equals("id_lineaComisionGrupo")) {
				if(jComboBoxGenerico==null) {
					jComboBoxGenerico=this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_lineaComisionGrupo;
				}

				if(this.comisiongrupoSessionBean.getConGuardarRelaciones()) {
					//classes=ComisionGrupoConstantesFunciones.getClassesRelationshipsOfComisionGrupo(new ArrayList<Classe>(),DeepLoadType.NONE);
				}


				this.procesarActionsCombosForeignKeyLinea(jComboBoxGenerico,"Formulario");

				this.recargarFormComisionGrupo(sTipo,"Formulario",eventoGlobalTipo,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,"COMBOBOX",classes,false,esControlTabla);
			}
				
				ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionGrupo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionGrupo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionGrupoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiongrupoAnterior =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisiongrupoAnterior =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarComisionGrupo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosComisionGrupoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosComisionGrupo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.comisiongrupo =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.comisiongrupo =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.comisiongrupo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarComisionGrupo")) {
				
				}
				
				ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarComisionGrupo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosComisionGrupo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarComisionGrupo")) {
			
			}
			
			ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessComisionGrupo();
			
			ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
			
			if(sTipo.equals("NuevoComisionGrupo")) {
				jButtonNuevoComisionGrupoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarComisionGrupo")) {
				jButtonDuplicarComisionGrupoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarComisionGrupo")) {
				jButtonCopiarComisionGrupoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormComisionGrupo")) {
				jButtonVerFormComisionGrupoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesComisionGrupo")) {
				jButtonNuevoComisionGrupoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarComisionGrupo")) {
				jButtonModificarComisionGrupoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarComisionGrupo")) {
				jButtonActualizarComisionGrupoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarComisionGrupo")) {
				jButtonEliminarComisionGrupoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaComisionGrupo")) {
				jButtonGuardarCambiosComisionGrupoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarComisionGrupo")) {
				jButtonCancelarComisionGrupoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarComisionGrupo")) {
				jButtonCerrarComisionGrupoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosComisionGrupo")) {
				jButtonGuardarCambiosComisionGrupoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosComisionGrupo")) {
				jButtonNuevoGuardarCambiosComisionGrupoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByComisionGrupo")) {
				jButtonAbrirOrderByComisionGrupoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionComisionGrupo")) {
				jButtonRecargarInformacionComisionGrupoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresComisionGrupo")) {
				jButtonAnterioresComisionGrupoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesComisionGrupo")) {
				jButtonSiguientesComisionGrupoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idComisionGrupoBusqueda")) {
				this.jButtonidComisionGrupoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaComisionGrupoUpdate")) {
				this.jButtonid_empresaComisionGrupoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaComisionGrupoBusqueda")) {
				this.jButtonid_empresaComisionGrupoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_comision_configComisionGrupoUpdate")) {
				this.jButtonid_comision_configComisionGrupoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_comision_configComisionGrupoBusqueda")) {
				this.jButtonid_comision_configComisionGrupoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_vendedorComisionGrupo")) {
				this.jButtonid_vendedorComisionGrupoActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_vendedorComisionGrupoArbol")) {
				this.abrirFrameTreeVendedor("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorComisionGrupoUpdate")) {
				this.jButtonid_vendedorComisionGrupoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorComisionGrupoBusqueda")) {
				this.jButtonid_vendedorComisionGrupoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_lineaComisionGrupoUpdate")) {
				this.jButtonid_lineaComisionGrupoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_lineaComisionGrupoBusqueda")) {
				this.jButtonid_lineaComisionGrupoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_linea_grupoComisionGrupoUpdate")) {
				this.jButtonid_linea_grupoComisionGrupoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_linea_grupoComisionGrupoBusqueda")) {
				this.jButtonid_linea_grupoComisionGrupoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_comisionComisionGrupoUpdate")) {
				this.jButtonid_estado_comisionComisionGrupoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_comisionComisionGrupoBusqueda")) {
				this.jButtonid_estado_comisionComisionGrupoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeComisionGrupoBusqueda")) {
				this.jButtonporcentajeComisionGrupoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionComisionGrupoBusqueda")) {
				this.jButtondescripcionComisionGrupoBusquedaActionPerformed(evt);
			}
			
			ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessComisionGrupo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameComisionGrupo")) {
				closingInternalFrameComisionGrupo();
				
			} else if(sTipo.equals("jButtonCancelarComisionGrupo")) {
				JInternalFrameBase jInternalFrameDetalleFormComisionGrupo = (JInternalFrameBase)evt.getSource();
	            	
	            ComisionGrupoBeanSwingJInternalFrame jInternalFrameParent=(ComisionGrupoBeanSwingJInternalFrame)jInternalFrameDetalleFormComisionGrupo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarComisionGrupoActionPerformed(null);
			}
			
			ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.comisiongrupo,new Object(),this.comisiongrupoParameterGeneral,this.comisiongrupoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormComisionGrupo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormComisionGrupo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormComisionGrupo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.comisiongrupo)) {
			if(!esControlTabla) {
				if(ComisionGrupoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualComisionGrupo(this.comisiongrupo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);			
				}
				
				if(this.comisiongrupoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualComisionGrupo(this.comisiongrupo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.comisiongrupoReturnGeneral=comisiongrupoLogic.procesarEventosComisionGruposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisiongrupoLogic.getComisionGrupos(),this.comisiongrupo,this.comisiongrupoParameterGeneral,this.isEsNuevoComisionGrupo,classes);//this.comisiongrupoLogic.getComisionGrupo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanComisionGrupo(this.comisiongrupoReturnGeneral,this.comisiongrupoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.comisiongrupoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanComisionGrupo(classes,this.comisiongrupoReturnGeneral,this.comisiongrupoBean,false);
					}
						
					if(this.comisiongrupoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyComisionGrupo(this.comisiongrupoReturnGeneral.getComisionGrupo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioComisionGrupo(this.comisiongrupoReturnGeneral.getComisionGrupo());	
					}
						
					if(this.comisiongrupoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioComisionGrupo(this.comisiongrupoReturnGeneral.getComisionGrupo(),classes);//this.comisiongrupoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioComisionGrupo(this.comisiongrupo,classes);//this.comisiongrupoBean);									
				}
			
				if(ComisionGrupoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualComisionGrupo(this.comisiongrupo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionGrupo(this.comisiongrupo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.comisiongrupoAnterior!=null) {
						this.comisiongrupo=this.comisiongrupoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.comisiongrupoReturnGeneral=comisiongrupoLogic.procesarEventosComisionGruposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisiongrupoLogic.getComisionGrupos(),this.comisiongrupo,this.comisiongrupoParameterGeneral,this.isEsNuevoComisionGrupo,classes);//this.comisiongrupoLogic.getComisionGrupo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.comisiongrupoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.comisiongrupoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.comisiongrupoReturnGeneral.getComisionGrupo(),comisiongrupoLogic.getComisionGrupos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.comisiongrupoReturnGeneral.getComisionGrupo(),this.comisiongrupos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosComisionGrupo.repaint();
				
				//((AbstractTableModel) this.jTableDatosComisionGrupo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosComisionGrupo();
			}
		}
	}
	
	public void actualizarVisualTableDatosComisionGrupo() throws Exception {
		
		ComisionGrupoModel comisiongrupoModel=(ComisionGrupoModel)this.jTableDatosComisionGrupo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comisiongrupoModel.comisiongrupos=this.comisiongrupoLogic.getComisionGrupos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			comisiongrupoModel.comisiongrupos=this.comisiongrupos;
		}
		
		
		((ComisionGrupoModel) this.jTableDatosComisionGrupo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaComisionGrupo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcomisiongrupoAnterior(),this.comisiongrupoLogic.getComisionGrupos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcomisiongrupoAnterior(),this.comisiongrupos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosComisionGrupo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioComisionGrupo(ComisionGrupo comisiongrupo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
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
										
				ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisiongrupo,new Object(),generalEntityParameterGeneral,this.comisiongrupoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.comisiongrupoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ComisionGrupoConstantesFunciones.getClassesRelationshipsOfComisionGrupo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ComisionGrupoConstantesFunciones.getClassesRelationshipsFromStringsOfComisionGrupo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormComisionGrupo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ComisionGrupoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisiongrupo,new Object(),generalEntityParameterGeneral,this.comisiongrupoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioComisionGrupo(ComisionGrupoBean comisiongrupoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanComisionGrupo(ArrayList<Classe> classes,ComisionGrupoReturnGeneral comisiongrupoReturnGeneral,ComisionGrupoBean comisiongrupoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualComisionGrupo(ComisionGrupo comisiongrupo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.comisiongrupo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormComisionGrupo = new ComisionGrupoDetalleFormJInternalFrame(jDesktopPane,this.comisiongrupoSessionBean.getConGuardarRelaciones(),this.comisiongrupoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormComisionGrupo);
		this.jInternalFrameDetalleFormComisionGrupo.setVisible(false);
		this.jInternalFrameDetalleFormComisionGrupo.setSelected(false);						
		
		this.jInternalFrameDetalleFormComisionGrupo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormComisionGrupo.comisiongrupoLogic=this.comisiongrupoLogic;
		
		this.cargarCombosFrameForeignKeyComisionGrupo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleComisionGrupo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleComisionGrupo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyComisionGrupo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyComisionGrupo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormComisionGrupo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarComisionGrupo"));
		
		this.jInternalFrameDetalleFormComisionGrupo.jButtonModificarComisionGrupo.addActionListener(new ButtonActionListener(this,"ModificarComisionGrupo"));

		
		this.jInternalFrameDetalleFormComisionGrupo.jButtonModificarToolBarComisionGrupo.addActionListener(new ButtonActionListener(this,"ModificarToolBarComisionGrupo"));
					
		this.jInternalFrameDetalleFormComisionGrupo.jMenuItemModificarComisionGrupo.addActionListener(new ButtonActionListener(this,"MenuItemModificarComisionGrupo"));		
		
		
		
		this.jInternalFrameDetalleFormComisionGrupo.jButtonActualizarComisionGrupo.addActionListener (new ButtonActionListener(this,"ActualizarComisionGrupo"));
		
		
		this.jInternalFrameDetalleFormComisionGrupo.jButtonActualizarToolBarComisionGrupo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarComisionGrupo"));
						
		this.jInternalFrameDetalleFormComisionGrupo.jMenuItemActualizarComisionGrupo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarComisionGrupo"));		
		
		
		
		this.jInternalFrameDetalleFormComisionGrupo.jButtonEliminarComisionGrupo.addActionListener (new ButtonActionListener(this,"EliminarComisionGrupo"));
		
		
		this.jInternalFrameDetalleFormComisionGrupo.jButtonEliminarToolBarComisionGrupo.addActionListener (new ButtonActionListener(this,"EliminarToolBarComisionGrupo"));
								
		this.jInternalFrameDetalleFormComisionGrupo.jMenuItemEliminarComisionGrupo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarComisionGrupo"));		
		
		
		
		this.jInternalFrameDetalleFormComisionGrupo.jButtonCancelarComisionGrupo.addActionListener (new ButtonActionListener(this,"CancelarComisionGrupo"));
		
		
		this.jInternalFrameDetalleFormComisionGrupo.jButtonCancelarToolBarComisionGrupo.addActionListener (new ButtonActionListener(this,"CancelarToolBarComisionGrupo"));
					
		this.jInternalFrameDetalleFormComisionGrupo.jMenuItemCancelarComisionGrupo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarComisionGrupo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormComisionGrupo.jMenuItemDetalleCerrarComisionGrupo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarComisionGrupo"));		
		
		
		
		this.jInternalFrameDetalleFormComisionGrupo.jButtonGuardarCambiosToolBarComisionGrupo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComisionGrupo"));
		
		
		
		this.jInternalFrameDetalleFormComisionGrupo.jButtonGuardarCambiosToolBarComisionGrupo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComisionGrupo"));
		
		
		
		this.jInternalFrameDetalleFormComisionGrupo.jComboBoxTiposAccionesFormularioComisionGrupo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioComisionGrupo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionGrupo.jButtonidComisionGrupoBusqueda.addActionListener(new ButtonActionListener(this,"idComisionGrupoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_empresaComisionGrupoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComisionGrupoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_empresaComisionGrupoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComisionGrupoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_comision_configComisionGrupoUpdate.addActionListener(new ButtonActionListener(this,"id_comision_configComisionGrupoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_comision_configComisionGrupoBusqueda.addActionListener(new ButtonActionListener(this,"id_comision_configComisionGrupoBusqueda"));
		//jButtonid_vendedorComisionGrupo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_vendedorComisionGrupoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_vendedorComisionGrupo.addActionListener(new ButtonActionListener(this,"id_vendedorComisionGrupo"));
		//jButtonid_vendedorComisionGrupoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeVendedor("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_vendedorComisionGrupoArbol.addActionListener(new ButtonActionListener(this,"id_vendedorComisionGrupoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_vendedorComisionGrupoUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorComisionGrupoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_vendedorComisionGrupoBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorComisionGrupoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_lineaComisionGrupoUpdate.addActionListener(new ButtonActionListener(this,"id_lineaComisionGrupoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_lineaComisionGrupoBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaComisionGrupoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_linea_grupoComisionGrupoUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoComisionGrupoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_linea_grupoComisionGrupoBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoComisionGrupoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_estado_comisionComisionGrupoUpdate.addActionListener(new ButtonActionListener(this,"id_estado_comisionComisionGrupoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_estado_comisionComisionGrupoBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_comisionComisionGrupoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionGrupo.jButtonporcentajeComisionGrupoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeComisionGrupoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionGrupo.jButtondescripcionComisionGrupoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionComisionGrupoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormComisionGrupo.jTabbedPaneRelacionesComisionGrupo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesComisionGrupo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameComisionGrupo"));
		
		if(this.jInternalFrameDetalleFormComisionGrupo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionGrupo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarComisionGrupo"));
		}
		
		this.jTableDatosComisionGrupo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarComisionGrupo"));
		
		this.jTableDatosComisionGrupo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarComisionGrupo"));
		
		this.jButtonNuevoComisionGrupo.addActionListener(new ButtonActionListener(this,"NuevoComisionGrupo"));
		
		this.jButtonDuplicarComisionGrupo.addActionListener(new ButtonActionListener(this,"DuplicarComisionGrupo"));
		
		this.jButtonCopiarComisionGrupo.addActionListener(new ButtonActionListener(this,"CopiarComisionGrupo"));
		
		this.jButtonVerFormComisionGrupo.addActionListener(new ButtonActionListener(this,"VerFormComisionGrupo"));
		
		
		this.jButtonNuevoToolBarComisionGrupo.addActionListener(new ButtonActionListener(this,"NuevoToolBarComisionGrupo"));
			
		this.jButtonDuplicarToolBarComisionGrupo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarComisionGrupo"));
			
		this.jMenuItemNuevoComisionGrupo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoComisionGrupo"));
			
		this.jMenuItemDuplicarComisionGrupo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarComisionGrupo"));		
		
		
		this.jButtonNuevoRelacionesComisionGrupo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesComisionGrupo"));
		
		
		this.jButtonNuevoRelacionesToolBarComisionGrupo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarComisionGrupo"));
			
		this.jMenuItemNuevoRelacionesComisionGrupo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesComisionGrupo"));		
		
		
		if(this.jInternalFrameDetalleFormComisionGrupo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionGrupo.jButtonModificarComisionGrupo.addActionListener(new ButtonActionListener(this,"ModificarComisionGrupo"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionGrupo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionGrupo.jButtonModificarToolBarComisionGrupo.addActionListener(new ButtonActionListener(this,"ModificarToolBarComisionGrupo"));
			
			this.jInternalFrameDetalleFormComisionGrupo.jMenuItemModificarComisionGrupo.addActionListener(new ButtonActionListener(this,"MenuItemModificarComisionGrupo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisionGrupo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormComisionGrupo.jButtonActualizarComisionGrupo.addActionListener (new ButtonActionListener(this,"ActualizarComisionGrupo"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionGrupo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionGrupo.jButtonActualizarToolBarComisionGrupo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarComisionGrupo"));
				
			this.jInternalFrameDetalleFormComisionGrupo.jMenuItemActualizarComisionGrupo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarComisionGrupo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisionGrupo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionGrupo.jButtonEliminarComisionGrupo.addActionListener (new ButtonActionListener(this,"EliminarComisionGrupo"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionGrupo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionGrupo.jButtonEliminarToolBarComisionGrupo.addActionListener (new ButtonActionListener(this,"EliminarToolBarComisionGrupo"));
						
			this.jInternalFrameDetalleFormComisionGrupo.jMenuItemEliminarComisionGrupo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarComisionGrupo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisionGrupo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionGrupo.jButtonCancelarComisionGrupo.addActionListener (new ButtonActionListener(this,"CancelarComisionGrupo"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionGrupo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionGrupo.jButtonCancelarToolBarComisionGrupo.addActionListener (new ButtonActionListener(this,"CancelarToolBarComisionGrupo"));
			
			this.jInternalFrameDetalleFormComisionGrupo.jMenuItemCancelarComisionGrupo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarComisionGrupo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarComisionGrupo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarComisionGrupo"));		
		
		
		this.jButtonCerrarComisionGrupo.addActionListener (new ButtonActionListener(this,"CerrarComisionGrupo"));
		
		
		this.jButtonCerrarToolBarComisionGrupo.addActionListener (new ButtonActionListener(this,"CerrarToolBarComisionGrupo"));
			
		this.jMenuItemCerrarComisionGrupo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarComisionGrupo"));
			
		if(this.jInternalFrameDetalleFormComisionGrupo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionGrupo.jMenuItemDetalleCerrarComisionGrupo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarComisionGrupo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisionGrupo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionGrupo.jButtonGuardarCambiosComisionGrupo.addActionListener (new ButtonActionListener(this,"GuardarCambiosComisionGrupo"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionGrupo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionGrupo.jButtonGuardarCambiosToolBarComisionGrupo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComisionGrupo"));
		}
		
		this.jButtonCopiarToolBarComisionGrupo.addActionListener (new ButtonActionListener(this,"CopiarToolBarComisionGrupo"));
			
		this.jButtonVerFormToolBarComisionGrupo.addActionListener (new ButtonActionListener(this,"VerFormToolBarComisionGrupo"));
		
		this.jMenuItemGuardarCambiosComisionGrupo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosComisionGrupo"));
			
		this.jMenuItemCopiarComisionGrupo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarComisionGrupo"));		
		
		this.jMenuItemVerFormComisionGrupo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormComisionGrupo"));		
		
		
		this.jButtonGuardarCambiosTablaComisionGrupo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaComisionGrupo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarComisionGrupo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarComisionGrupo"));
			
		this.jMenuItemGuardarCambiosTablaComisionGrupo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaComisionGrupo"));		
		
		
		
		this.jButtonRecargarInformacionComisionGrupo.addActionListener (new ButtonActionListener(this,"RecargarInformacionComisionGrupo"));
					
		this.jButtonRecargarInformacionToolBarComisionGrupo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarComisionGrupo"));
		
		this.jMenuItemRecargarInformacionComisionGrupo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionComisionGrupo"));		
		
		
		
		this.jButtonAnterioresComisionGrupo.addActionListener (new ButtonActionListener(this,"AnterioresComisionGrupo"));
		
		
		this.jButtonAnterioresToolBarComisionGrupo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarComisionGrupo"));
		
		this.jMenuItemAnterioresComisionGrupo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresComisionGrupo"));		
		
		
		this.jButtonSiguientesComisionGrupo.addActionListener (new ButtonActionListener(this,"SiguientesComisionGrupo"));
		
		
		this.jButtonSiguientesToolBarComisionGrupo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarComisionGrupo"));
			
		this.jMenuItemSiguientesComisionGrupo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesComisionGrupo"));
			
		this.jMenuItemAbrirOrderByComisionGrupo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByComisionGrupo"));
			
		this.jMenuItemMostrarOcultarComisionGrupo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarComisionGrupo"));
			
		this.jMenuItemDetalleAbrirOrderByComisionGrupo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByComisionGrupo"));
			
		this.jMenuItemDetalleMostarOcultarComisionGrupo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarComisionGrupo"));		
		
		
		this.jButtonNuevoGuardarCambiosComisionGrupo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosComisionGrupo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarComisionGrupo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarComisionGrupo"));
			
		this.jMenuItemNuevoGuardarCambiosComisionGrupo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosComisionGrupo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosComisionGrupo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosComisionGrupo"));

		this.jCheckBoxSeleccionadosComisionGrupo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosComisionGrupo"));
		
		if(this.jInternalFrameDetalleFormComisionGrupo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionGrupo.jComboBoxTiposAccionesFormularioComisionGrupo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioComisionGrupo"));
		}
		
		
		this.jComboBoxTiposRelacionesComisionGrupo.addActionListener (new ButtonActionListener(this,"TiposRelacionesComisionGrupo"));
			
		this.jComboBoxTiposAccionesComisionGrupo.addActionListener (new ButtonActionListener(this,"TiposAccionesComisionGrupo"));
					
		this.jComboBoxTiposSeleccionarComisionGrupo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarComisionGrupo"));
			
		this.jTextFieldValorCampoGeneralComisionGrupo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralComisionGrupo"));		
		
		
		if(this.jInternalFrameDetalleFormComisionGrupo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionGrupo.jButtonidComisionGrupoBusqueda.addActionListener(new ButtonActionListener(this,"idComisionGrupoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_empresaComisionGrupoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComisionGrupoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_empresaComisionGrupoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComisionGrupoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_comision_configComisionGrupoUpdate.addActionListener(new ButtonActionListener(this,"id_comision_configComisionGrupoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_comision_configComisionGrupoBusqueda.addActionListener(new ButtonActionListener(this,"id_comision_configComisionGrupoBusqueda"));
		//jButtonid_vendedorComisionGrupo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_vendedorComisionGrupoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_vendedorComisionGrupo.addActionListener(new ButtonActionListener(this,"id_vendedorComisionGrupo"));
		//jButtonid_vendedorComisionGrupoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeVendedor("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_vendedorComisionGrupoArbol.addActionListener(new ButtonActionListener(this,"id_vendedorComisionGrupoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_vendedorComisionGrupoUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorComisionGrupoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_vendedorComisionGrupoBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorComisionGrupoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_lineaComisionGrupoUpdate.addActionListener(new ButtonActionListener(this,"id_lineaComisionGrupoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_lineaComisionGrupoBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaComisionGrupoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_linea_grupoComisionGrupoUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoComisionGrupoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_linea_grupoComisionGrupoBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoComisionGrupoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_estado_comisionComisionGrupoUpdate.addActionListener(new ButtonActionListener(this,"id_estado_comisionComisionGrupoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_estado_comisionComisionGrupoBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_comisionComisionGrupoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionGrupo.jButtonporcentajeComisionGrupoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeComisionGrupoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionGrupo.jButtondescripcionComisionGrupoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionComisionGrupoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdComisionConfigComisionGrupo.addActionListener(new ButtonActionListener(this,"FK_IdComisionConfigComisionGrupo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoComisionGrupo!=null) {
				this.jInternalFrameReporteDinamicoComisionGrupo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComisionGrupo"));
				this.jInternalFrameReporteDinamicoComisionGrupo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComisionGrupo"));
				this.jInternalFrameReporteDinamicoComisionGrupo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComisionGrupo"));
			}
			
			//this.jButtonCerrarReporteDinamicoComisionGrupo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComisionGrupo"));				
			//this.jButtonGenerarReporteDinamicoComisionGrupo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComisionGrupo"));
			//this.jButtonGenerarExcelReporteDinamicoComisionGrupo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComisionGrupo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionComisionGrupo!=null) {
				this.jInternalFrameImportacionComisionGrupo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionComisionGrupo"));
				this.jInternalFrameImportacionComisionGrupo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionComisionGrupo"));
				this.jInternalFrameImportacionComisionGrupo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionComisionGrupo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByComisionGrupo.addActionListener (new ButtonActionListener(this,"AbrirOrderByComisionGrupo"));
			
			this.jButtonAbrirOrderByToolBarComisionGrupo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarComisionGrupo"));			
			
			if(this.jInternalFrameOrderByComisionGrupo!=null) {
				this.jInternalFrameOrderByComisionGrupo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByComisionGrupo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormComisionGrupo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormComisionGrupo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionGrupo.jTabbedPaneRelacionesComisionGrupo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesComisionGrupo"));
		
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
            		closingInternalFrameComisionGrupo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormComisionGrupo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormComisionGrupo = (JInternalFrameBase)event.getSource();
	            	
	            ComisionGrupoBeanSwingJInternalFrame jInternalFrameParent=(ComisionGrupoBeanSwingJInternalFrame)jInternalFrameDetalleFormComisionGrupo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarComisionGrupoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosComisionGrupo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosComisionGrupoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosComisionGrupo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosComisionGrupo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionGrupoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionGrupoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionGrupoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoComisionGrupo";
		inputMap = this.jButtonNuevoComisionGrupo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoComisionGrupo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoComisionGrupoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionGrupoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionGrupoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionGrupoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesComisionGrupo";
		inputMap = this.jButtonNuevoRelacionesComisionGrupo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesComisionGrupo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoComisionGrupoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarComisionGrupo";
		inputMap = this.jButtonModificarComisionGrupo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarComisionGrupo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarComisionGrupoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarComisionGrupo";
		inputMap = this.jButtonActualizarComisionGrupo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarComisionGrupo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarComisionGrupoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarComisionGrupo";
		inputMap = this.jButtonEliminarComisionGrupo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarComisionGrupo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarComisionGrupoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarComisionGrupo";
		inputMap = this.jButtonCancelarComisionGrupo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarComisionGrupo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarComisionGrupoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarComisionGrupo";
		inputMap = this.jButtonCerrarComisionGrupo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarComisionGrupo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarComisionGrupoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormComisionGrupo.jButtonGuardarCambiosComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosComisionGrupo";
		inputMap = this.jInternalFrameDetalleFormComisionGrupo.jButtonGuardarCambiosComisionGrupo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormComisionGrupo.jButtonGuardarCambiosComisionGrupo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosComisionGrupoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosComisionGrupo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosComisionGrupoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesComisionGrupo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesComisionGrupoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarComisionGrupo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarComisionGrupoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralComisionGrupo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralComisionGrupoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionGrupo.jButtonidComisionGrupoBusqueda.addActionListener(new ButtonActionListener(this,"idComisionGrupoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_empresaComisionGrupoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComisionGrupoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_empresaComisionGrupoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComisionGrupoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_comision_configComisionGrupoUpdate.addActionListener(new ButtonActionListener(this,"id_comision_configComisionGrupoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_comision_configComisionGrupoBusqueda.addActionListener(new ButtonActionListener(this,"id_comision_configComisionGrupoBusqueda"));
		//jButtonid_vendedorComisionGrupo.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_vendedorComisionGrupoActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_vendedorComisionGrupo.addActionListener(new ButtonActionListener(this,"id_vendedorComisionGrupo"));
		//jButtonid_vendedorComisionGrupoArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeVendedor("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_vendedorComisionGrupoArbol.addActionListener(new ButtonActionListener(this,"id_vendedorComisionGrupoArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_vendedorComisionGrupoUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorComisionGrupoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_vendedorComisionGrupoBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorComisionGrupoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_lineaComisionGrupoUpdate.addActionListener(new ButtonActionListener(this,"id_lineaComisionGrupoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_lineaComisionGrupoBusqueda.addActionListener(new ButtonActionListener(this,"id_lineaComisionGrupoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_linea_grupoComisionGrupoUpdate.addActionListener(new ButtonActionListener(this,"id_linea_grupoComisionGrupoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_linea_grupoComisionGrupoBusqueda.addActionListener(new ButtonActionListener(this,"id_linea_grupoComisionGrupoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_estado_comisionComisionGrupoUpdate.addActionListener(new ButtonActionListener(this,"id_estado_comisionComisionGrupoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionGrupo.jButtonid_estado_comisionComisionGrupoBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_comisionComisionGrupoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionGrupo.jButtonporcentajeComisionGrupoBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeComisionGrupoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionGrupo.jButtondescripcionComisionGrupoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionComisionGrupoBusqueda"));
		
		
		this.jButtonFK_IdComisionConfigComisionGrupo.addActionListener(new ButtonActionListener(this,"FK_IdComisionConfigComisionGrupo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionComisionGrupo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionComisionGrupoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarComisionGrupoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarComisionGrupo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosComisionGrupo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ComisionGrupo comisiongrupoAux:this.comisiongrupoLogic.getComisionGrupos()) {
					comisiongrupoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComisionGrupo comisiongrupoAux:comisiongrupos) {
					comisiongrupoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosComisionGrupoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingComisionGrupo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ComisionGrupo comisiongrupoAux:this.comisiongrupoLogic.getComisionGrupos()) {
						comisiongrupoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComisionGrupo comisiongrupoAux:comisiongrupos) {
						comisiongrupoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ComisionGrupo comisiongrupoAux:this.comisiongrupoLogic.getComisionGrupos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComisionGrupo comisiongrupoAux:comisiongrupos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaComisionGrupo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosComisionGrupo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosComisionGrupo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosComisionGrupo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosComisionGrupoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingComisionGrupo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosComisionGrupo.getSelectedRows();
			
			ComisionGrupo comisiongrupoLocal=new ComisionGrupo();
			
			//this.seleccionarTodosComisionGrupo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisiongrupoLocal =(ComisionGrupo) this.comisiongrupoLogic.getComisionGrupos().toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					comisiongrupoLocal =(ComisionGrupo) this.comisiongrupos.toArray()[this.jTableDatosComisionGrupo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				comisiongrupoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ComisionGrupo comisiongrupoAux:this.comisiongrupoLogic.getComisionGrupos()) {
						comisiongrupoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComisionGrupo comisiongrupoAux:comisiongrupos) {
						comisiongrupoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaComisionGrupo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosComisionGrupo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosComisionGrupo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosComisionGrupo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualComisionGrupoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarComisionGrupoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralComisionGrupoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingComisionGrupo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralComisionGrupo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ComisionGrupo comisiongrupoAux:this.comisiongrupoLogic.getComisionGrupos()) {
				
						if(sTipoSeleccionar.equals(ComisionGrupoConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							comisiongrupoAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComisionGrupoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							comisiongrupoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComisionGrupo comisiongrupoAux:comisiongrupos) {
					
						if(sTipoSeleccionar.equals(ComisionGrupoConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							comisiongrupoAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComisionGrupoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							comisiongrupoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaComisionGrupo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesComisionGrupoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingComisionGrupo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioComisionGrupo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesComisionGrupo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormComisionGrupo.jComboBoxTiposAccionesFormularioComisionGrupo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteComisionGrupo) {				
					conSplash=true;//false;										
					
					//this.startProcessComisionGrupo(conSplash);
				
					this.generarReporteComisionGruposSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisionGrupo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisionGrupo.jComboBoxTiposAccionesFormularioComisionGrupo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoComisionGruposSeleccionados();
				//this.jComboBoxTiposAccionesComisionGrupo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoComisionGruposSeleccionados(false);
				//this.jComboBoxTiposAccionesComisionGrupo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoComisionGruposSeleccionados(true);
				//this.jComboBoxTiposAccionesComisionGrupo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessComisionGrupo();
				
				this.exportarComisionGruposSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisionGrupo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisionGrupo.jComboBoxTiposAccionesFormularioComisionGrupo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionComisionGrupos();
				//this.importarComisionGrupos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisionGrupo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisionGrupo.jComboBoxTiposAccionesFormularioComisionGrupo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessComisionGrupo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelComisionGruposSeleccionados();
				//this.jComboBoxTiposAccionesComisionGrupo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Comision Grupo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessComisionGrupo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoComisionGrupo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyComisionGrupo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Comision Grupo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisionGrupo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisionGrupo.jComboBoxTiposAccionesFormularioComisionGrupo.setSelectedIndex(0);					
				}	
			} 			
			else if(ComisionGrupoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteComisionGrupo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessComisionGrupo(conSplash);
					
						//this.actualizarParametrosGeneralComisionGrupo();
						
						this.generarReporteProcesoAccionComisionGruposSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesComisionGrupo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormComisionGrupo.jComboBoxTiposAccionesFormularioComisionGrupo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ComisionGrupoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Comision GrupoS SELECCIONADOS?", "MANTENIMIENTO DE Comision Grupo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessComisionGrupo();
				
						this.actualizarParametrosGeneralComisionGrupo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.comisiongrupoReturnGeneral=comisiongrupoLogic.procesarAccionComisionGruposWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.comisiongrupoLogic.getComisionGrupos(),this.comisiongrupoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarComisionGrupoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesComisionGrupo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormComisionGrupo.jComboBoxTiposAccionesFormularioComisionGrupo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralComisionGrupo();
					
					ComisionGrupoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarComisionGrupoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesComisionGrupo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormComisionGrupo.jComboBoxTiposAccionesFormularioComisionGrupo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessComisionGrupo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesComisionGrupoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessComisionGrupo();
			
			if(this.jInternalFrameDetalleFormComisionGrupo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ComisionGrupo> comisiongruposSeleccionados=new ArrayList<ComisionGrupo>();		
			ComisionGrupo comisiongrupo=new ComisionGrupo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingComisionGrupo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesComisionGrupo.getSelectedItem();
			
			
			
			
			comisiongruposSeleccionados=this.getComisionGruposSeleccionados(true);
			//this.sTipoAccion;
			
			if(comisiongruposSeleccionados.size()==1) {
				for(ComisionGrupo comisiongrupoAux:comisiongruposSeleccionados) {
					comisiongrupo=comisiongrupoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessComisionGrupo();
			
      		//this.finishProcessComisionGrupo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarComisionGrupoReturnGeneral() throws Exception {
		if(this.comisiongrupoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.comisiongrupoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.comisiongrupoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.comisiongrupoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.comisiongrupoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.comisiongrupoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingComisionGrupo(false);
		}
		
		if(this.comisiongrupoReturnGeneral.getConRetornoLista() || this.comisiongrupoReturnGeneral.getConRetornoObjeto()) {
			if(this.comisiongrupoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.comisiongrupoLogic.setComisionGrupos(this.comisiongrupoReturnGeneral.getComisionGrupos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.comisiongrupoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.comisiongrupoLogic.setComisionGrupo(this.comisiongrupoReturnGeneral.getComisionGrupo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingComisionGrupo(false);
		}
	}
	
	public void actualizarParametrosGeneralComisionGrupo() throws Exception {
		
		
	}
	
	public ArrayList<ComisionGrupo> getComisionGruposSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ComisionGrupo> comisiongruposSeleccionados=new ArrayList<ComisionGrupo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioComisionGrupo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ComisionGrupo comisiongrupoAux:comisiongrupoLogic.getComisionGrupos()) {
					if(comisiongrupoAux.getIsSelected()) {
						comisiongruposSeleccionados.add(comisiongrupoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComisionGrupo comisiongrupoAux:this.comisiongrupos) {
					if(comisiongrupoAux.getIsSelected()) {
						comisiongruposSeleccionados.add(comisiongrupoAux);				
					}
				}
			}
			
			if(comisiongruposSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						comisiongruposSeleccionados.addAll(this.comisiongrupoLogic.getComisionGrupos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						comisiongruposSeleccionados.addAll(this.comisiongrupos);				
					}
				}
			}
		} else {
			comisiongruposSeleccionados.add(this.comisiongrupo);
		}
		
		return comisiongruposSeleccionados;
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
	
	public void generarReporteComisionGruposSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalComisionGruposSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoComisionGruposSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoComisionGruposSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoComisionGruposSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Comision Grupo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesComisionGruposSeleccionados() throws Exception {
		ArrayList<ComisionGrupo> comisiongruposSeleccionados=new ArrayList<ComisionGrupo>();		
		
		comisiongruposSeleccionados=this.getComisionGruposSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteComisionGrupos("Todos",comisiongruposSeleccionados);
		
	}	
	
	public void generarReporteNormalComisionGruposSeleccionados() throws Exception {
		ArrayList<ComisionGrupo> comisiongruposSeleccionados=new ArrayList<ComisionGrupo>();		
		
		comisiongruposSeleccionados=this.getComisionGruposSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteComisionGrupos("Todos",comisiongruposSeleccionados);
	}		
	
	public void generarReporteProcesoAccionComisionGruposSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ComisionGrupo> comisiongruposSeleccionados=new ArrayList<ComisionGrupo>();
		
		comisiongruposSeleccionados=this.getComisionGruposSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteComisionGrupos("Todos",comisiongruposSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoComisionGruposSeleccionados() throws Exception {
		ArrayList<ComisionGrupo> comisiongruposSeleccionados=new ArrayList<ComisionGrupo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoComisionGrupo();
		
		
		comisiongruposSeleccionados=this.getComisionGruposSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoComisionGrupo();
		
		
		//this.generarReporteComisionGrupos("Todos",comisiongruposSeleccionados ,comisiongrupoImplementable,comisiongrupoImplementableHome);
	}
	
	public void mostrarImportacionComisionGrupos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionComisionGrupo();
		
		this.abrirFrameImportacionComisionGrupo();		
		
			
		//this.generarReporteComisionGrupos("Todos",comisiongruposSeleccionados ,comisiongrupoImplementable,comisiongrupoImplementableHome);
	}
	
	public void importarComisionGrupos() throws Exception {		
	
	}
	
	public void exportarComisionGruposSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelComisionGruposSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoComisionGruposSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlComisionGruposSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Comision Grupo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoComisionGruposSeleccionados() throws Exception {
		ArrayList<ComisionGrupo> comisiongruposSeleccionados=new ArrayList<ComisionGrupo>();		
		
		comisiongruposSeleccionados=this.getComisionGruposSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisiongrupo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarComisionGrupo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ComisionGrupo comisiongrupoAux:comisiongruposSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarComisionGrupo(comisiongrupoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//comisiongrupoAux.setsDetalleGeneralEntityReporte(comisiongrupoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Grupo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarComisionGrupo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ComisionGrupoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionGrupoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionGrupoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionGrupoConstantesFunciones.LABEL_IDCOMISIONCONFIG;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionGrupoConstantesFunciones.LABEL_IDVENDEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionGrupoConstantesFunciones.LABEL_IDLINEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionGrupoConstantesFunciones.LABEL_IDLINEAGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionGrupoConstantesFunciones.LABEL_IDESTADOCOMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionGrupoConstantesFunciones.LABEL_PORCENTAJE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionGrupoConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarComisionGrupo(ComisionGrupo comisiongrupo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=comisiongrupo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=comisiongrupo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisiongrupo.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisiongrupo.getcomisionconfig_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisiongrupo.getvendedor_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisiongrupo.getlinea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisiongrupo.getlineagrupo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisiongrupo.getestadocomision_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisiongrupo.getporcentaje().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisiongrupo.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelComisionGruposSeleccionados() throws Exception {
		ArrayList<ComisionGrupo> comisiongruposSeleccionados=new ArrayList<ComisionGrupo>();		
		
		comisiongruposSeleccionados=this.getComisionGruposSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisiongrupo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ComisionGrupos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelComisionGrupo(row);				
				iRow++;
			}				
			
			for(ComisionGrupo comisiongrupoAux:comisiongruposSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelComisionGrupo(comisiongrupoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Grupo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlComisionGruposSeleccionados() throws Exception {
		ArrayList<ComisionGrupo> comisiongruposSeleccionados=new ArrayList<ComisionGrupo>();		
		
		comisiongruposSeleccionados=this.getComisionGruposSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisiongrupo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("comisiongrupos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("comisiongrupo");
			//elementRoot.appendChild(element);
		
			for(ComisionGrupo comisiongrupoAux:comisiongruposSeleccionados) {
				element = document.createElement("comisiongrupo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlComisionGrupo(comisiongrupoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Grupo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelComisionGrupo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionGrupoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionGrupoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ComisionGrupoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionGrupoConstantesFunciones.LABEL_IDCOMISIONCONFIG);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionGrupoConstantesFunciones.LABEL_IDVENDEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionGrupoConstantesFunciones.LABEL_IDLINEA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionGrupoConstantesFunciones.LABEL_IDLINEAGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionGrupoConstantesFunciones.LABEL_IDESTADOCOMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionGrupoConstantesFunciones.LABEL_PORCENTAJE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionGrupoConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelComisionGrupo(ComisionGrupo comisiongrupo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(comisiongrupo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(comisiongrupo.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisiongrupo.getcomisionconfig_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisiongrupo.getvendedor_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisiongrupo.getlinea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisiongrupo.getlineagrupo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisiongrupo.getestadocomision_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisiongrupo.getporcentaje());
		cell = row.createCell(iColumn++);cell.setCellValue(comisiongrupo.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlComisionGrupo(ComisionGrupo comisiongrupo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ComisionGrupoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(comisiongrupo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ComisionGrupoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(comisiongrupo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ComisionGrupoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(comisiongrupo.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcomisionconfig_descripcion = document.createElement(ComisionGrupoConstantesFunciones.IDCOMISIONCONFIG);
		elementcomisionconfig_descripcion.appendChild(document.createTextNode(comisiongrupo.getcomisionconfig_descripcion()));
		element.appendChild(elementcomisionconfig_descripcion);

		Element elementvendedor_descripcion = document.createElement(ComisionGrupoConstantesFunciones.IDVENDEDOR);
		elementvendedor_descripcion.appendChild(document.createTextNode(comisiongrupo.getvendedor_descripcion()));
		element.appendChild(elementvendedor_descripcion);

		Element elementlinea_descripcion = document.createElement(ComisionGrupoConstantesFunciones.IDLINEA);
		elementlinea_descripcion.appendChild(document.createTextNode(comisiongrupo.getlinea_descripcion()));
		element.appendChild(elementlinea_descripcion);

		Element elementlineagrupo_descripcion = document.createElement(ComisionGrupoConstantesFunciones.IDLINEAGRUPO);
		elementlineagrupo_descripcion.appendChild(document.createTextNode(comisiongrupo.getlineagrupo_descripcion()));
		element.appendChild(elementlineagrupo_descripcion);

		Element elementestadocomision_descripcion = document.createElement(ComisionGrupoConstantesFunciones.IDESTADOCOMISION);
		elementestadocomision_descripcion.appendChild(document.createTextNode(comisiongrupo.getestadocomision_descripcion()));
		element.appendChild(elementestadocomision_descripcion);

		Element elementporcentaje = document.createElement(ComisionGrupoConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(comisiongrupo.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);

		Element elementdescripcion = document.createElement(ComisionGrupoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(comisiongrupo.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoComisionGruposSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ComisionGrupo> comisiongruposSeleccionados=new ArrayList<ComisionGrupo>();
		
		comisiongruposSeleccionados=this.getComisionGruposSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoComisionGrupo(comisiongruposSeleccionados);
		
		this.generarReporteComisionGrupos("Todos",comisiongruposSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoComisionGrupo(ArrayList<ComisionGrupo> comisiongruposSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ComisionGrupo comisiongrupoAux:comisiongruposSeleccionados) {
				comisiongrupoAux.setsDetalleGeneralEntityReporte(comisiongrupoAux.toString());
			
				if(sTipoSeleccionar.equals(ComisionGrupoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					comisiongrupoAux.setsDescripcionGeneralEntityReporte1(comisiongrupoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionGrupoConstantesFunciones.LABEL_IDCOMISIONCONFIG)) {
					existe=true;
					comisiongrupoAux.setsDescripcionGeneralEntityReporte1(comisiongrupoAux.getcomisionconfig_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionGrupoConstantesFunciones.LABEL_IDVENDEDOR)) {
					existe=true;
					comisiongrupoAux.setsDescripcionGeneralEntityReporte1(comisiongrupoAux.getvendedor_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionGrupoConstantesFunciones.LABEL_IDLINEA)) {
					existe=true;
					comisiongrupoAux.setsDescripcionGeneralEntityReporte1(comisiongrupoAux.getlinea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionGrupoConstantesFunciones.LABEL_IDLINEAGRUPO)) {
					existe=true;
					comisiongrupoAux.setsDescripcionGeneralEntityReporte1(comisiongrupoAux.getlineagrupo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionGrupoConstantesFunciones.LABEL_IDESTADOCOMISION)) {
					existe=true;
					comisiongrupoAux.setsDescripcionGeneralEntityReporte1(comisiongrupoAux.getestadocomision_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionGrupoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					comisiongrupoAux.setsDescripcionGeneralEntityReporte1(comisiongrupoAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionGrupoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesComisionGrupo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoComisionGrupo=true;
				this.isVisibilidadCeldaNuevoRelacionesComisionGrupo=true;
				this.isVisibilidadCeldaGuardarCambiosComisionGrupo=true;
			}
			
			this.isVisibilidadCeldaModificarComisionGrupo=false;
			this.isVisibilidadCeldaActualizarComisionGrupo=false;
			this.isVisibilidadCeldaEliminarComisionGrupo=false;
			this.isVisibilidadCeldaCancelarComisionGrupo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionGrupo=true;
				} else {
					this.isVisibilidadCeldaGuardarComisionGrupo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoComisionGrupo=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionGrupo=false;
			this.isVisibilidadCeldaGuardarCambiosComisionGrupo=false;
			this.isVisibilidadCeldaModificarComisionGrupo=false;
			this.isVisibilidadCeldaActualizarComisionGrupo=true;
			this.isVisibilidadCeldaEliminarComisionGrupo=false;
			this.isVisibilidadCeldaCancelarComisionGrupo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionGrupo=true;
				} else {
					this.isVisibilidadCeldaGuardarComisionGrupo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoComisionGrupo=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionGrupo=false;
			this.isVisibilidadCeldaGuardarCambiosComisionGrupo=false;
			this.isVisibilidadCeldaModificarComisionGrupo=false;
			this.isVisibilidadCeldaActualizarComisionGrupo=true;
			this.isVisibilidadCeldaEliminarComisionGrupo=true;
			this.isVisibilidadCeldaCancelarComisionGrupo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionGrupo=true;
				} else {
					this.isVisibilidadCeldaGuardarComisionGrupo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoComisionGrupo=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionGrupo=false;
			this.isVisibilidadCeldaGuardarCambiosComisionGrupo=false;
			this.isVisibilidadCeldaModificarComisionGrupo=false;
			this.isVisibilidadCeldaActualizarComisionGrupo=true;
			this.isVisibilidadCeldaEliminarComisionGrupo=false;
			this.isVisibilidadCeldaCancelarComisionGrupo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionGrupo=false;
				} else {
					this.isVisibilidadCeldaGuardarComisionGrupo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoComisionGrupo=true;
			this.isVisibilidadCeldaNuevoRelacionesComisionGrupo=true;
			this.isVisibilidadCeldaGuardarCambiosComisionGrupo=true;
			this.isVisibilidadCeldaModificarComisionGrupo=false;
			this.isVisibilidadCeldaActualizarComisionGrupo=false;
			this.isVisibilidadCeldaEliminarComisionGrupo=false;
			this.isVisibilidadCeldaCancelarComisionGrupo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionGrupo=true;
				} else {
					this.isVisibilidadCeldaGuardarComisionGrupo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoComisionGrupo=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionGrupo=false;
			this.isVisibilidadCeldaGuardarCambiosComisionGrupo=false;
			this.isVisibilidadCeldaActualizarComisionGrupo=false;
			this.isVisibilidadCeldaEliminarComisionGrupo=false;
			this.isVisibilidadCeldaCancelarComisionGrupo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionGrupo=false;
				} else {
					this.isVisibilidadCeldaGuardarComisionGrupo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoComisionGrupo=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionGrupo=false;
			this.isVisibilidadCeldaGuardarCambiosComisionGrupo=false;
			this.isVisibilidadCeldaModificarComisionGrupo=true;
			this.isVisibilidadCeldaActualizarComisionGrupo=false;
			this.isVisibilidadCeldaEliminarComisionGrupo=false;
			this.isVisibilidadCeldaCancelarComisionGrupo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionGrupo=false;
				} else {
					this.isVisibilidadCeldaGuardarComisionGrupo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ComisionGrupoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoComisionGrupo=true;
			this.isVisibilidadCeldaNuevoRelacionesComisionGrupo=true;
			this.isVisibilidadCeldaGuardarCambiosComisionGrupo=true;
		} else {
			this.actualizarEstadoPanelsComisionGrupo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarComisionGrupo=false;
			//this.isVisibilidadCeldaVerFormComisionGrupo=false;
			this.isVisibilidadCeldaDuplicarComisionGrupo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!comisiongrupoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesComisionGrupo=false;
		} else {
			this.isVisibilidadCeldaNuevoComisionGrupo=false;
			this.isVisibilidadCeldaGuardarCambiosComisionGrupo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(comisiongrupoSessionBean.getEsGuardarRelacionado()) {
			if(!comisiongrupoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesComisionGrupo=false;												
			}
			
			this.jButtonCerrarComisionGrupo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesComisionGrupo=false;
		}
		
		if(!this.permiteMantenimiento(this.comisiongrupo)) {
			this.isVisibilidadCeldaActualizarComisionGrupo=false;
			this.isVisibilidadCeldaEliminarComisionGrupo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesComisionGrupo() {
	}
	
	public void actualizarEstadoPanelsComisionGrupo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionComisionGrupo!=null) {
				this.jScrollPanelDatosEdicionComisionGrupo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionGrupo!=null) {
				this.jTabbedPaneBusquedasComisionGrupo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComisionGrupo!=null) {
				this.jScrollPanelDatosComisionGrupo.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisionGrupo!=null) {
				this.jPanelPaginacionComisionGrupo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisionGrupo!=null) {
				this.jPanelParametrosReportesComisionGrupo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionComisionGrupo!=null) {
				this.jScrollPanelDatosEdicionComisionGrupo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionGrupo!=null) {
				this.jTabbedPaneBusquedasComisionGrupo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosComisionGrupo!=null) {
				this.jScrollPanelDatosComisionGrupo.setVisible(false);
			}
			
			if(this.jPanelPaginacionComisionGrupo!=null) {
				this.jPanelPaginacionComisionGrupo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComisionGrupo!=null) {
				this.jPanelParametrosReportesComisionGrupo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionComisionGrupo!=null) {
				this.jScrollPanelDatosEdicionComisionGrupo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionGrupo!=null) {
				this.jTabbedPaneBusquedasComisionGrupo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosComisionGrupo!=null) {
				this.jScrollPanelDatosComisionGrupo.setVisible(false);
			}
			
			if(this.jPanelPaginacionComisionGrupo!=null) {
				this.jPanelPaginacionComisionGrupo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComisionGrupo!=null) {
				this.jPanelParametrosReportesComisionGrupo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionComisionGrupo!=null) {
				this.jScrollPanelDatosEdicionComisionGrupo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionGrupo!=null) {
				this.jTabbedPaneBusquedasComisionGrupo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosComisionGrupo!=null) {
				this.jScrollPanelDatosComisionGrupo.setVisible(false);
			}
			
			if(this.jPanelPaginacionComisionGrupo!=null) {
				this.jPanelPaginacionComisionGrupo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComisionGrupo!=null) {
				this.jPanelParametrosReportesComisionGrupo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionComisionGrupo!=null) {
				this.jScrollPanelDatosEdicionComisionGrupo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionGrupo!=null) {
				this.jTabbedPaneBusquedasComisionGrupo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComisionGrupo!=null) {
				this.jScrollPanelDatosComisionGrupo.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisionGrupo!=null) {
				this.jPanelPaginacionComisionGrupo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisionGrupo!=null) {
				this.jPanelParametrosReportesComisionGrupo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionComisionGrupo!=null) {
				this.jScrollPanelDatosEdicionComisionGrupo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionGrupo!=null) {
				this.jTabbedPaneBusquedasComisionGrupo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComisionGrupo!=null) {
				this.jScrollPanelDatosComisionGrupo.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisionGrupo!=null) {
				this.jPanelPaginacionComisionGrupo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisionGrupo!=null) {
				this.jPanelParametrosReportesComisionGrupo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionComisionGrupo!=null) {
				this.jScrollPanelDatosEdicionComisionGrupo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionGrupo!=null) {
				this.jTabbedPaneBusquedasComisionGrupo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComisionGrupo!=null) {
				this.jScrollPanelDatosComisionGrupo.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisionGrupo!=null) {
				this.jPanelPaginacionComisionGrupo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisionGrupo!=null) {
				this.jPanelParametrosReportesComisionGrupo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasComisionGrupo!=null) {
					this.jTabbedPaneBusquedasComisionGrupo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesComisionGrupo!=null) {
				this.jPanelParametrosReportesComisionGrupo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.comisiongrupoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionGrupo!=null) {
				this.jTabbedPaneBusquedasComisionGrupo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesComisionGrupo!=null) {
				this.jPanelParametrosReportesComisionGrupo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdComisionConfig=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdComisionConfig) {this.jTabbedPaneBusquedasComisionGrupo.remove(jPanelFK_IdComisionConfigComisionGrupo);}
		}
		
	}

	public void setVisibilidadBusquedasParaComisionConfig(Boolean isParaComisionConfig){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaComisionConfigNegation=!isParaComisionConfig;

			this.isVisibilidadFK_IdComisionConfig=isParaComisionConfig;
			if(!this.isVisibilidadFK_IdComisionConfig) {this.jTabbedPaneBusquedasComisionGrupo.remove(jPanelFK_IdComisionConfigComisionGrupo);}
		}
		
	}

	public void setVisibilidadBusquedasParaVendedor(Boolean isParaVendedor){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaVendedorNegation=!isParaVendedor;

			this.isVisibilidadFK_IdComisionConfig=isParaVendedorNegation;
			if(!this.isVisibilidadFK_IdComisionConfig) {this.jTabbedPaneBusquedasComisionGrupo.remove(jPanelFK_IdComisionConfigComisionGrupo);}
		}
		
	}

	public void setVisibilidadBusquedasParaLinea(Boolean isParaLinea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaNegation=!isParaLinea;

			this.isVisibilidadFK_IdComisionConfig=isParaLineaNegation;
			if(!this.isVisibilidadFK_IdComisionConfig) {this.jTabbedPaneBusquedasComisionGrupo.remove(jPanelFK_IdComisionConfigComisionGrupo);}
		}
		
	}

	public void setVisibilidadBusquedasParaLineaGrupo(Boolean isParaLineaGrupo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaLineaGrupoNegation=!isParaLineaGrupo;

			this.isVisibilidadFK_IdComisionConfig=isParaLineaGrupoNegation;
			if(!this.isVisibilidadFK_IdComisionConfig) {this.jTabbedPaneBusquedasComisionGrupo.remove(jPanelFK_IdComisionConfigComisionGrupo);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstadoComision(Boolean isParaEstadoComision){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstadoComisionNegation=!isParaEstadoComision;

			this.isVisibilidadFK_IdComisionConfig=isParaEstadoComisionNegation;
			if(!this.isVisibilidadFK_IdComisionConfig) {this.jTabbedPaneBusquedasComisionGrupo.remove(jPanelFK_IdComisionConfigComisionGrupo);}
		}
		
	}
	
	
	
	

	public String registrarSesionComisionGrupoParaBusquedaVendedores() throws Exception {
		Boolean isPaginaPopupVendedor=false;

		try {

			if(comisiongrupoSessionBean==null) {
				comisiongrupoSessionBean=new ComisionGrupoSessionBean();
			}

			if(vendedorSessionBean==null) {
				vendedorSessionBean=new VendedorSessionBean();
			}

			vendedorSessionBean.setsPathNavegacionActual(comisiongrupoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+VendedorConstantesFunciones.SCLASSWEBTITULO);
			vendedorSessionBean.setisPermiteRecargarInformacion(false);
			vendedorSessionBean.setisPaginaPopup(true);
			isPaginaPopupVendedor=vendedorSessionBean.getisPaginaPopup();
			vendedorSessionBean.setisPaginaPopup(false);
			vendedorSessionBean.setEstaModoBusqueda(true);
			vendedorSessionBean.setsFuncionBusquedaRapida("window.opener.comisiongrupoFuncionGeneral.setCombosCodigoDesdeBusquedaid_vendedor(TO_REPLACE);");
			vendedorSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeVendedor(true);
			vendedorSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeVendedor(ComisionGrupoConstantesFunciones.SNOMBREOPCION);
			//vendedorSessionBean.setisBusquedaDesdeForeignKeySesionComisionGrupo(true);
			//vendedorSessionBean.setlidComisionGrupoActual(this.idComisionGrupoActual);

			comisiongrupoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyComisionGrupo(true);
			comisiongrupoSessionBean.setlIdComisionGrupoActualForeignKey(this.idComisionGrupoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ComisionGrupoSessionBean comisiongrupoSessionBean=new ComisionGrupoSessionBean();
		
		if(this.comisiongrupoSessionBean==null) {
			this.comisiongrupoSessionBean=new ComisionGrupoSessionBean();
		}
		
		this.comisiongrupoSessionBean.setsUltimaBusquedaComisionGrupo(this.getsAccionBusqueda());
		this.comisiongrupoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.comisiongrupoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdComisionConfig")) {
			comisiongrupoSessionBean.setid_comision_config(this.getid_comision_configFK_IdComisionConfig());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			comisiongrupoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ComisionGrupoSessionBean comisiongrupoSessionBean=new ComisionGrupoSessionBean();
		
		if(this.comisiongrupoSessionBean==null) {
			this.comisiongrupoSessionBean=new ComisionGrupoSessionBean();
		}
		
		if(this.comisiongrupoSessionBean.getsUltimaBusquedaComisionGrupo()!=null&&!this.comisiongrupoSessionBean.getsUltimaBusquedaComisionGrupo().equals("")) {
			this.setsAccionBusqueda(comisiongrupoSessionBean.getsUltimaBusquedaComisionGrupo());
			this.setiNumeroPaginacion(comisiongrupoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(comisiongrupoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdComisionConfig")) {
				this.setid_comision_configFK_IdComisionConfig(comisiongrupoSessionBean.getid_comision_config());
				comisiongrupoSessionBean.setid_comision_config(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(comisiongrupoSessionBean.getid_empresa());
				comisiongrupoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.comisiongrupoSessionBean.setsUltimaBusquedaComisionGrupo("");
		this.comisiongrupoSessionBean.setiNumeroPaginacion(ComisionGrupoConstantesFunciones.INUMEROPAGINACION);
		this.comisiongrupoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaComisionGrupo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioComisionGrupo() {
		this.updateBorderResaltarBusquedasFormularioComisionGrupo();
		this.updateVisibilidadBusquedasFormularioComisionGrupo();
		this.updateHabilitarBusquedasFormularioComisionGrupo();
	}
	
	public void updateBorderResaltarBusquedasFormularioComisionGrupo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasComisionGrupo.getComponents().length>0) {
	

		if(this.comisiongrupoConstantesFunciones.resaltarFK_IdComisionConfigComisionGrupo!=null) {
			index= this.jTabbedPaneBusquedasComisionGrupo.indexOfComponent(this.jPanelFK_IdComisionConfigComisionGrupo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasComisionGrupo.getComponent(index);
				jPanel.setBorder(this.comisiongrupoConstantesFunciones.resaltarFK_IdComisionConfigComisionGrupo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioComisionGrupo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasComisionGrupo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasComisionGrupo.indexOfComponent(this.jPanelFK_IdComisionConfigComisionGrupo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasComisionGrupo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.comisiongrupoConstantesFunciones.mostrarFK_IdComisionConfigComisionGrupo);
			if(!this.comisiongrupoConstantesFunciones.mostrarFK_IdComisionConfigComisionGrupo && index>-1) {
				this.jTabbedPaneBusquedasComisionGrupo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioComisionGrupo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasComisionGrupo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasComisionGrupo.indexOfComponent(this.jPanelFK_IdComisionConfigComisionGrupo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasComisionGrupo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.comisiongrupoConstantesFunciones.activarFK_IdComisionConfigComisionGrupo);
				this.jTabbedPaneBusquedasComisionGrupo.setEnabledAt(index,this.comisiongrupoConstantesFunciones.activarFK_IdComisionConfigComisionGrupo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaComisionGrupo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdComisionConfig")) {
			index= this.jTabbedPaneBusquedasComisionGrupo.indexOfComponent(this.jPanelFK_IdComisionConfigComisionGrupo);

			this.jTabbedPaneBusquedasComisionGrupo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasComisionGrupo.getComponent(index);

			this.comisiongrupoConstantesFunciones.setResaltarFK_IdComisionConfigComisionGrupo(resaltar);

			jPanel.setBorder(this.comisiongrupoConstantesFunciones.resaltarFK_IdComisionConfigComisionGrupo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarComisionGrupo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioComisionGrupo() throws Exception {

		if(this.jInternalFrameDetalleFormComisionGrupo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioComisionGrupo();
		this.updateVisibilidadResaltarControlesFormularioComisionGrupo();
		this.updateHabilitarResaltarControlesFormularioComisionGrupo();
		
	}
	
	public void updateBorderResaltarControlesFormularioComisionGrupo() throws Exception {
		if(this.jInternalFrameDetalleFormComisionGrupo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.comisiongrupoConstantesFunciones.resaltaridComisionGrupo!=null && this.jInternalFrameDetalleFormComisionGrupo!=null) {this.jInternalFrameDetalleFormComisionGrupo.jLabelidComisionGrupo.setBorder(this.comisiongrupoConstantesFunciones.resaltaridComisionGrupo);}
		if(this.comisiongrupoConstantesFunciones.resaltarid_empresaComisionGrupo!=null && this.jInternalFrameDetalleFormComisionGrupo!=null) {this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_empresaComisionGrupo.setBorder(this.comisiongrupoConstantesFunciones.resaltarid_empresaComisionGrupo);}
		if(this.comisiongrupoConstantesFunciones.resaltarid_comision_configComisionGrupo!=null && this.jInternalFrameDetalleFormComisionGrupo!=null) {this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_comision_configComisionGrupo.setBorder(this.comisiongrupoConstantesFunciones.resaltarid_comision_configComisionGrupo);}
		if(this.comisiongrupoConstantesFunciones.resaltarid_vendedorComisionGrupo!=null && this.jInternalFrameDetalleFormComisionGrupo!=null) {this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_vendedorComisionGrupo.setBorder(this.comisiongrupoConstantesFunciones.resaltarid_vendedorComisionGrupo);}
		if(this.comisiongrupoConstantesFunciones.resaltarid_lineaComisionGrupo!=null && this.jInternalFrameDetalleFormComisionGrupo!=null) {this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_lineaComisionGrupo.setBorder(this.comisiongrupoConstantesFunciones.resaltarid_lineaComisionGrupo);}
		if(this.comisiongrupoConstantesFunciones.resaltarid_linea_grupoComisionGrupo!=null && this.jInternalFrameDetalleFormComisionGrupo!=null) {this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_linea_grupoComisionGrupo.setBorder(this.comisiongrupoConstantesFunciones.resaltarid_linea_grupoComisionGrupo);}
		if(this.comisiongrupoConstantesFunciones.resaltarid_estado_comisionComisionGrupo!=null && this.jInternalFrameDetalleFormComisionGrupo!=null) {this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_estado_comisionComisionGrupo.setBorder(this.comisiongrupoConstantesFunciones.resaltarid_estado_comisionComisionGrupo);}
		if(this.comisiongrupoConstantesFunciones.resaltarporcentajeComisionGrupo!=null && this.jInternalFrameDetalleFormComisionGrupo!=null) {this.jInternalFrameDetalleFormComisionGrupo.jTextFieldporcentajeComisionGrupo.setBorder(this.comisiongrupoConstantesFunciones.resaltarporcentajeComisionGrupo);}
		if(this.comisiongrupoConstantesFunciones.resaltardescripcionComisionGrupo!=null && this.jInternalFrameDetalleFormComisionGrupo!=null) {this.jInternalFrameDetalleFormComisionGrupo.jTextAreadescripcionComisionGrupo.setBorder(this.comisiongrupoConstantesFunciones.resaltardescripcionComisionGrupo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioComisionGrupo() throws Exception {		
		if(this.jInternalFrameDetalleFormComisionGrupo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
	
		//this.jInternalFrameDetalleFormComisionGrupo.jLabelidComisionGrupo.setVisible(this.comisiongrupoConstantesFunciones.mostraridComisionGrupo);
		this.jInternalFrameDetalleFormComisionGrupo.jPanelidComisionGrupo.setVisible(this.comisiongrupoConstantesFunciones.mostraridComisionGrupo);
		//this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_empresaComisionGrupo.setVisible(this.comisiongrupoConstantesFunciones.mostrarid_empresaComisionGrupo);
		this.jInternalFrameDetalleFormComisionGrupo.jPanelid_empresaComisionGrupo.setVisible(this.comisiongrupoConstantesFunciones.mostrarid_empresaComisionGrupo);
		//this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_comision_configComisionGrupo.setVisible(this.comisiongrupoConstantesFunciones.mostrarid_comision_configComisionGrupo);
		this.jInternalFrameDetalleFormComisionGrupo.jPanelid_comision_configComisionGrupo.setVisible(this.comisiongrupoConstantesFunciones.mostrarid_comision_configComisionGrupo);
		//this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_vendedorComisionGrupo.setVisible(this.comisiongrupoConstantesFunciones.mostrarid_vendedorComisionGrupo);
		this.jInternalFrameDetalleFormComisionGrupo.jPanelid_vendedorComisionGrupo.setVisible(this.comisiongrupoConstantesFunciones.mostrarid_vendedorComisionGrupo);
			this.jInternalFrameDetalleFormComisionGrupo.jButtonid_vendedorComisionGrupo.setVisible(this.comisiongrupoConstantesFunciones.mostrarid_vendedorComisionGrupo);
		//this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_lineaComisionGrupo.setVisible(this.comisiongrupoConstantesFunciones.mostrarid_lineaComisionGrupo);
		this.jInternalFrameDetalleFormComisionGrupo.jPanelid_lineaComisionGrupo.setVisible(this.comisiongrupoConstantesFunciones.mostrarid_lineaComisionGrupo);
		//this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_linea_grupoComisionGrupo.setVisible(this.comisiongrupoConstantesFunciones.mostrarid_linea_grupoComisionGrupo);
		this.jInternalFrameDetalleFormComisionGrupo.jPanelid_linea_grupoComisionGrupo.setVisible(this.comisiongrupoConstantesFunciones.mostrarid_linea_grupoComisionGrupo);
		//this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_estado_comisionComisionGrupo.setVisible(this.comisiongrupoConstantesFunciones.mostrarid_estado_comisionComisionGrupo);
		this.jInternalFrameDetalleFormComisionGrupo.jPanelid_estado_comisionComisionGrupo.setVisible(this.comisiongrupoConstantesFunciones.mostrarid_estado_comisionComisionGrupo);
		//this.jInternalFrameDetalleFormComisionGrupo.jTextFieldporcentajeComisionGrupo.setVisible(this.comisiongrupoConstantesFunciones.mostrarporcentajeComisionGrupo);
		this.jInternalFrameDetalleFormComisionGrupo.jPanelporcentajeComisionGrupo.setVisible(this.comisiongrupoConstantesFunciones.mostrarporcentajeComisionGrupo);
		//this.jInternalFrameDetalleFormComisionGrupo.jTextAreadescripcionComisionGrupo.setVisible(this.comisiongrupoConstantesFunciones.mostrardescripcionComisionGrupo);
		this.jInternalFrameDetalleFormComisionGrupo.jPaneldescripcionComisionGrupo.setVisible(this.comisiongrupoConstantesFunciones.mostrardescripcionComisionGrupo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioComisionGrupo() throws Exception {
		if(this.jInternalFrameDetalleFormComisionGrupo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormComisionGrupo!=null) {
	
		this.jInternalFrameDetalleFormComisionGrupo.jLabelidComisionGrupo.setEnabled(this.comisiongrupoConstantesFunciones.activaridComisionGrupo);
		this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_empresaComisionGrupo.setEnabled(this.comisiongrupoConstantesFunciones.activarid_empresaComisionGrupo);
		this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_comision_configComisionGrupo.setEnabled(this.comisiongrupoConstantesFunciones.activarid_comision_configComisionGrupo);
		this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_vendedorComisionGrupo.setEnabled(this.comisiongrupoConstantesFunciones.activarid_vendedorComisionGrupo);
			this.jInternalFrameDetalleFormComisionGrupo.jButtonid_vendedorComisionGrupo.setEnabled(this.comisiongrupoConstantesFunciones.activarid_vendedorComisionGrupo);
		this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_lineaComisionGrupo.setEnabled(this.comisiongrupoConstantesFunciones.activarid_lineaComisionGrupo);
		this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_linea_grupoComisionGrupo.setEnabled(this.comisiongrupoConstantesFunciones.activarid_linea_grupoComisionGrupo);
		this.jInternalFrameDetalleFormComisionGrupo.jComboBoxid_estado_comisionComisionGrupo.setEnabled(this.comisiongrupoConstantesFunciones.activarid_estado_comisionComisionGrupo);
		this.jInternalFrameDetalleFormComisionGrupo.jTextFieldporcentajeComisionGrupo.setEnabled(this.comisiongrupoConstantesFunciones.activarporcentajeComisionGrupo);
		this.jInternalFrameDetalleFormComisionGrupo.jTextAreadescripcionComisionGrupo.setEnabled(this.comisiongrupoConstantesFunciones.activardescripcionComisionGrupo);
		}
	}
	
		
}