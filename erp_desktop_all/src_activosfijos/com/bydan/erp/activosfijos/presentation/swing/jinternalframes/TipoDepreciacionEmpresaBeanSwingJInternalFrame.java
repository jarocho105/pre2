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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;




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

import com.bydan.erp.activosfijos.util.TipoDepreciacionEmpresaConstantesFunciones;
import com.bydan.erp.activosfijos.util.TipoDepreciacionEmpresaParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.TipoDepreciacionEmpresaParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.TipoDepreciacionEmpresaBean;
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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.activosfijos.resources.reportes.AuxiliarReportes;


import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.activosfijos.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoDepreciacionEmpresaBeanSwingJInternalFrame extends TipoDepreciacionEmpresaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoDepreciacionEmpresaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoDepreciacionEmpresa> tipodepreciacionempresaValidator = new ClassValidator<TipoDepreciacionEmpresa>(TipoDepreciacionEmpresa.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoDepreciacionEmpresa tipodepreciacionempresa;	
	public TipoDepreciacionEmpresa tipodepreciacionempresaAux;
	public TipoDepreciacionEmpresa tipodepreciacionempresaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoDepreciacionEmpresa tipodepreciacionempresaTotales;
	public Long idTipoDepreciacionEmpresaActual;
	public Long iIdNuevoTipoDepreciacionEmpresa=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosDetalleActivoFijo=false;

	public Boolean getIsTienePermisosDetalleActivoFijo() {
		return isTienePermisosDetalleActivoFijo;
	}

	public void setIsTienePermisosDetalleActivoFijo(Boolean isTienePermisosDetalleActivoFijo) {
		this.isTienePermisosDetalleActivoFijo= isTienePermisosDetalleActivoFijo;
	}


	public Boolean isTienePermisosDepreciacionActivoFijo=false;

	public Boolean getIsTienePermisosDepreciacionActivoFijo() {
		return isTienePermisosDepreciacionActivoFijo;
	}

	public void setIsTienePermisosDepreciacionActivoFijo(Boolean isTienePermisosDepreciacionActivoFijo) {
		this.isTienePermisosDepreciacionActivoFijo= isTienePermisosDepreciacionActivoFijo;
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
	
	public Boolean isPermisoTodoTipoDepreciacionEmpresa;
	public Boolean isPermisoNuevoTipoDepreciacionEmpresa;
	public Boolean isPermisoActualizarTipoDepreciacionEmpresa;
	public Boolean isPermisoActualizarOriginalTipoDepreciacionEmpresa;
	public Boolean isPermisoEliminarTipoDepreciacionEmpresa;
	public Boolean isPermisoGuardarCambiosTipoDepreciacionEmpresa;
	public Boolean isPermisoConsultaTipoDepreciacionEmpresa;
	public Boolean isPermisoBusquedaTipoDepreciacionEmpresa;
	public Boolean isPermisoReporteTipoDepreciacionEmpresa;
	public Boolean isPermisoPaginacionMedioTipoDepreciacionEmpresa;
	public Boolean isPermisoPaginacionAltoTipoDepreciacionEmpresa;
	public Boolean isPermisoPaginacionTodoTipoDepreciacionEmpresa;
	public Boolean isPermisoCopiarTipoDepreciacionEmpresa;
	public Boolean isPermisoVerFormTipoDepreciacionEmpresa;
	public Boolean isPermisoDuplicarTipoDepreciacionEmpresa;
	public Boolean isPermisoOrdenTipoDepreciacionEmpresa;
	
	
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
	
	public TipoDepreciacionEmpresaParameterReturnGeneral tipodepreciacionempresaReturnGeneral;
	public TipoDepreciacionEmpresaParameterReturnGeneral tipodepreciacionempresaParameterGeneral;
	
	

	public DetalleActivoFijoLogic detalleactivofijoLogic=null;

	public DetalleActivoFijoLogic getDetalleActivoFijoLogic() {
		return detalleactivofijoLogic;
	}

	public void setDetalleActivoFijoLogic(DetalleActivoFijoLogic detalleactivofijoLogic) {
		this.detalleactivofijoLogic = detalleactivofijoLogic;
	}


	public DepreciacionActivoFijoLogic depreciacionactivofijoLogic=null;

	public DepreciacionActivoFijoLogic getDepreciacionActivoFijoLogic() {
		return depreciacionactivofijoLogic;
	}

	public void setDepreciacionActivoFijoLogic(DepreciacionActivoFijoLogic depreciacionactivofijoLogic) {
		this.depreciacionactivofijoLogic = depreciacionactivofijoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoDepreciacionEmpresa=false;
	public Boolean esParaAccionDesdeFormularioTipoDepreciacionEmpresa=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoDepreciacionEmpresaLogic tipodepreciacionempresaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoDepreciacionEmpresa tipodepreciacionempresaBean;
	public TipoDepreciacionEmpresaConstantesFunciones tipodepreciacionempresaConstantesFunciones;
	//public TipoDepreciacionEmpresaParameterReturnGeneral tipodepreciacionempresaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoDepreciacionEmpresa> tipodepreciacionempresas;	
	//public List<TipoDepreciacionEmpresa> tipodepreciacionempresasEliminados;
	//public List<TipoDepreciacionEmpresa> tipodepreciacionempresasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoDepreciacionEmpresa=false;
	public Boolean isVisibilidadCeldaDuplicarTipoDepreciacionEmpresa=true;
	public Boolean isVisibilidadCeldaCopiarTipoDepreciacionEmpresa=true;
	public Boolean isVisibilidadCeldaVerFormTipoDepreciacionEmpresa=true;
	public Boolean isVisibilidadCeldaOrdenTipoDepreciacionEmpresa=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoDepreciacionEmpresa=false;
	public Boolean isVisibilidadCeldaModificarTipoDepreciacionEmpresa=false;
	public Boolean isVisibilidadCeldaActualizarTipoDepreciacionEmpresa=false;
	public Boolean isVisibilidadCeldaEliminarTipoDepreciacionEmpresa=false;
	public Boolean isVisibilidadCeldaCancelarTipoDepreciacionEmpresa=false;
	public Boolean isVisibilidadCeldaGuardarTipoDepreciacionEmpresa=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoDepreciacionEmpresa=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoDepreciacionEmpresa() {
		return this.iIdNuevoTipoDepreciacionEmpresa;
	}

	public void setiIdNuevoTipoDepreciacionEmpresa(Long iIdNuevoTipoDepreciacionEmpresa) {
		this.iIdNuevoTipoDepreciacionEmpresa = iIdNuevoTipoDepreciacionEmpresa;
	}
	
	public Long getidTipoDepreciacionEmpresaActual() {
		return this.idTipoDepreciacionEmpresaActual;
	}

	public void setidTipoDepreciacionEmpresaActual(Long idTipoDepreciacionEmpresaActual) {
		this.idTipoDepreciacionEmpresaActual = idTipoDepreciacionEmpresaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoDepreciacionEmpresa gettipodepreciacionempresa() {
		return this.tipodepreciacionempresa;
	}

	public void settipodepreciacionempresa(TipoDepreciacionEmpresa tipodepreciacionempresa) {
		this.tipodepreciacionempresa = tipodepreciacionempresa;
	}
	
	public TipoDepreciacionEmpresa gettipodepreciacionempresaAux() {
		return this.tipodepreciacionempresaAux;
	}

	public void settipodepreciacionempresaAux(TipoDepreciacionEmpresa tipodepreciacionempresaAux) {
		this.tipodepreciacionempresaAux = tipodepreciacionempresaAux;
	}				
	
	public TipoDepreciacionEmpresa gettipodepreciacionempresaAnterior() {
		return this.tipodepreciacionempresaAnterior;
	}

	public void settipodepreciacionempresaAnterior(TipoDepreciacionEmpresa tipodepreciacionempresaAnterior) {
		this.tipodepreciacionempresaAnterior = tipodepreciacionempresaAnterior;
	}	
	
	public TipoDepreciacionEmpresa gettipodepreciacionempresaTotales() {
		return this.tipodepreciacionempresaTotales;
	}

	public void settipodepreciacionempresaTotales(TipoDepreciacionEmpresa tipodepreciacionempresaTotales) {
		this.tipodepreciacionempresaTotales = tipodepreciacionempresaTotales;
	}	
	
	public TipoDepreciacionEmpresa gettipodepreciacionempresaBean() {
		return this.tipodepreciacionempresaBean;
	}

	public void settipodepreciacionempresaBean(TipoDepreciacionEmpresa tipodepreciacionempresaBean) {
		this.tipodepreciacionempresaBean = tipodepreciacionempresaBean;
	}	
	
	public TipoDepreciacionEmpresaParameterReturnGeneral gettipodepreciacionempresaReturnGeneral() {
		return this.tipodepreciacionempresaReturnGeneral;
	}

	public void settipodepreciacionempresaReturnGeneral(TipoDepreciacionEmpresaParameterReturnGeneral tipodepreciacionempresaReturnGeneral) {
		this.tipodepreciacionempresaReturnGeneral = tipodepreciacionempresaReturnGeneral;
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
	
	
	public TipoDepreciacionEmpresaLogic getTipoDepreciacionEmpresaLogic()	{		
		return tipodepreciacionempresaLogic;
	}

	public void setTipoDepreciacionEmpresaLogic(TipoDepreciacionEmpresaLogic tipodepreciacionempresaLogic) {
		this.tipodepreciacionempresaLogic = tipodepreciacionempresaLogic;
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
	
	public Boolean getIsEsNuevoTipoDepreciacionEmpresa() {
		return isEsNuevoTipoDepreciacionEmpresa;
	}

	public void setIsEsNuevoTipoDepreciacionEmpresa(Boolean isEsNuevoTipoDepreciacionEmpresa) {
		this.isEsNuevoTipoDepreciacionEmpresa = isEsNuevoTipoDepreciacionEmpresa;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoDepreciacionEmpresa() {
		return esParaAccionDesdeFormularioTipoDepreciacionEmpresa;
	}
	
	public void setEsParaAccionDesdeFormularioTipoDepreciacionEmpresa(Boolean esParaAccionDesdeFormularioTipoDepreciacionEmpresa) {
		this.esParaAccionDesdeFormularioTipoDepreciacionEmpresa = esParaAccionDesdeFormularioTipoDepreciacionEmpresa;
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

			if(this.tipodepreciacionempresaSessionBean==null) {
				this.tipodepreciacionempresaSessionBean=new TipoDepreciacionEmpresaSessionBean();
			}

			if(!this.tipodepreciacionempresaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipodepreciacionempresaSessionBean.getlidEmpresaActual());
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

					if(this.tipodepreciacionempresa!=null) {
						this.tipodepreciacionempresa.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) {
						this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jComboBoxid_empresaTipoDepreciacionEmpresa.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoDepreciacionEmpresa.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) {
						if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jComboBoxid_empresaTipoDepreciacionEmpresa.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jComboBoxid_empresaTipoDepreciacionEmpresa.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoDepreciacionEmpresaGenerico)throws Exception
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
				jComboBoxid_empresaTipoDepreciacionEmpresaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoDepreciacionEmpresaGenerico!=null && jComboBoxid_empresaTipoDepreciacionEmpresaGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoDepreciacionEmpresaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoDepreciacionEmpresa tipodepreciacionempresa,JComboBox jComboBoxid_empresaTipoDepreciacionEmpresaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoDepreciacionEmpresaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jComboBoxid_empresaTipoDepreciacionEmpresa.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoDepreciacionEmpresaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipodepreciacionempresa.setid_empresa(empresaAux.getId());
				tipodepreciacionempresa.setempresa_descripcion(TipoDepreciacionEmpresaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipodepreciacionempresa.setEmpresa(empresaAux);			}
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

					if(!TipoDepreciacionEmpresaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) { 
							this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jComboBoxid_empresaTipoDepreciacionEmpresa.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jComboBoxid_empresaTipoDepreciacionEmpresa.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) { 
					}

					if(!TipoDepreciacionEmpresaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) {
							this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jComboBoxid_empresaTipoDepreciacionEmpresa.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) {
							this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jComboBoxid_empresaTipoDepreciacionEmpresa.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoDepreciacionEmpresa() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoDepreciacionEmpresaConstantesFunciones.refrescarForeignKeysDescripcionesTipoDepreciacionEmpresa(this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoDepreciacionEmpresaConstantesFunciones.refrescarForeignKeysDescripcionesTipoDepreciacionEmpresa(this.tipodepreciacionempresas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipodepreciacionempresaLogic.setTipoDepreciacionEmpresas(this.tipodepreciacionempresas);
			tipodepreciacionempresaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoDepreciacionEmpresaParameterReturnGeneral getTipoDepreciacionEmpresaParameterGeneral() {
		return this.tipodepreciacionempresaParameterGeneral;
	}
	
	public void setTipoDepreciacionEmpresaParameterGeneral(TipoDepreciacionEmpresaParameterReturnGeneral tipodepreciacionempresaParameterGeneral) {
		this.tipodepreciacionempresaParameterGeneral = tipodepreciacionempresaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoDepreciacionEmpresa() {
		return isPermisoTodoTipoDepreciacionEmpresa;
	}

	public void setIsPermisoTodoTipoDepreciacionEmpresa(Boolean isPermisoTodoTipoDepreciacionEmpresa) {
		this.isPermisoTodoTipoDepreciacionEmpresa = isPermisoTodoTipoDepreciacionEmpresa;
	}

	public Boolean getIsPermisoNuevoTipoDepreciacionEmpresa() {
		return isPermisoNuevoTipoDepreciacionEmpresa;
	}

	public void setIsPermisoNuevoTipoDepreciacionEmpresa(Boolean isPermisoNuevoTipoDepreciacionEmpresa) {
		this.isPermisoNuevoTipoDepreciacionEmpresa = isPermisoNuevoTipoDepreciacionEmpresa;
	}

	public Boolean getIsPermisoActualizarTipoDepreciacionEmpresa() {
		return isPermisoActualizarTipoDepreciacionEmpresa;
	}

	public void setIsPermisoActualizarTipoDepreciacionEmpresa(Boolean isPermisoActualizarTipoDepreciacionEmpresa) {
		this.isPermisoActualizarTipoDepreciacionEmpresa = isPermisoActualizarTipoDepreciacionEmpresa;
	}

	public Boolean getIsPermisoEliminarTipoDepreciacionEmpresa() {
		return isPermisoEliminarTipoDepreciacionEmpresa;
	}

	public void setIsPermisoEliminarTipoDepreciacionEmpresa(Boolean isPermisoEliminarTipoDepreciacionEmpresa) {
		this.isPermisoEliminarTipoDepreciacionEmpresa = isPermisoEliminarTipoDepreciacionEmpresa;
	}

	public Boolean getIsPermisoGuardarCambiosTipoDepreciacionEmpresa() {
		return isPermisoGuardarCambiosTipoDepreciacionEmpresa;
	}

	public void setIsPermisoGuardarCambiosTipoDepreciacionEmpresa(Boolean isPermisoGuardarCambiosTipoDepreciacionEmpresa) {
		this.isPermisoGuardarCambiosTipoDepreciacionEmpresa = isPermisoGuardarCambiosTipoDepreciacionEmpresa;
	}
	
	public Boolean getIsPermisoConsultaTipoDepreciacionEmpresa() {
		return isPermisoConsultaTipoDepreciacionEmpresa;
	}

	public void setIsPermisoConsultaTipoDepreciacionEmpresa(Boolean isPermisoConsultaTipoDepreciacionEmpresa) {
		this.isPermisoConsultaTipoDepreciacionEmpresa = isPermisoConsultaTipoDepreciacionEmpresa;
	}

	public Boolean getIsPermisoBusquedaTipoDepreciacionEmpresa() {
		return isPermisoBusquedaTipoDepreciacionEmpresa;
	}

	public void setIsPermisoBusquedaTipoDepreciacionEmpresa(Boolean isPermisoBusquedaTipoDepreciacionEmpresa) {
		this.isPermisoBusquedaTipoDepreciacionEmpresa = isPermisoBusquedaTipoDepreciacionEmpresa;
	}

	public Boolean getIsPermisoReporteTipoDepreciacionEmpresa() {
		return isPermisoReporteTipoDepreciacionEmpresa;
	}

	public void setIsPermisoReporteTipoDepreciacionEmpresa(Boolean isPermisoReporteTipoDepreciacionEmpresa) {
		this.isPermisoReporteTipoDepreciacionEmpresa = isPermisoReporteTipoDepreciacionEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoDepreciacionEmpresa() {
		return isPermisoPaginacionMedioTipoDepreciacionEmpresa;
	}

	public void setIsPermisoPaginacionMedioTipoDepreciacionEmpresa(Boolean isPermisoPaginacionMedioTipoDepreciacionEmpresa) {
		this.isPermisoPaginacionMedioTipoDepreciacionEmpresa = isPermisoPaginacionMedioTipoDepreciacionEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoDepreciacionEmpresa() {
		return isPermisoPaginacionTodoTipoDepreciacionEmpresa;
	}

	public void setIsPermisoPaginacionTodoTipoDepreciacionEmpresa(Boolean isPermisoPaginacionTodoTipoDepreciacionEmpresa) {
		this.isPermisoPaginacionTodoTipoDepreciacionEmpresa = isPermisoPaginacionTodoTipoDepreciacionEmpresa;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoDepreciacionEmpresa() {
		return isPermisoPaginacionAltoTipoDepreciacionEmpresa;
	}

	public void setIsPermisoPaginacionAltoTipoDepreciacionEmpresa(Boolean isPermisoPaginacionAltoTipoDepreciacionEmpresa) {
		this.isPermisoPaginacionAltoTipoDepreciacionEmpresa = isPermisoPaginacionAltoTipoDepreciacionEmpresa;
	}
	
	public Boolean getIsPermisoCopiarTipoDepreciacionEmpresa() {
		return isPermisoCopiarTipoDepreciacionEmpresa;
	}

	public void setIsPermisoCopiarTipoDepreciacionEmpresa(Boolean isPermisoCopiarTipoDepreciacionEmpresa) {
		this.isPermisoCopiarTipoDepreciacionEmpresa = isPermisoCopiarTipoDepreciacionEmpresa;
	}
	
	public Boolean getIsPermisoVerFormTipoDepreciacionEmpresa() {
		return isPermisoVerFormTipoDepreciacionEmpresa;
	}

	public void setIsPermisoVerFormTipoDepreciacionEmpresa(Boolean isPermisoVerFormTipoDepreciacionEmpresa) {
		this.isPermisoVerFormTipoDepreciacionEmpresa = isPermisoVerFormTipoDepreciacionEmpresa;
	}
	
	public Boolean getIsPermisoDuplicarTipoDepreciacionEmpresa() {
		return isPermisoDuplicarTipoDepreciacionEmpresa;
	}

	public void setIsPermisoDuplicarTipoDepreciacionEmpresa(Boolean isPermisoDuplicarTipoDepreciacionEmpresa) {
		this.isPermisoDuplicarTipoDepreciacionEmpresa = isPermisoDuplicarTipoDepreciacionEmpresa;
	}
	
	public Boolean getIsPermisoOrdenTipoDepreciacionEmpresa() {
		return isPermisoOrdenTipoDepreciacionEmpresa;
	}

	public void setIsPermisoOrdenTipoDepreciacionEmpresa(Boolean isPermisoOrdenTipoDepreciacionEmpresa) {
		this.isPermisoOrdenTipoDepreciacionEmpresa = isPermisoOrdenTipoDepreciacionEmpresa;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoDepreciacionEmpresa() {
		return isVisibilidadCeldaNuevoTipoDepreciacionEmpresa;
	}

	public void setIsVisibilidadCeldaNuevoTipoDepreciacionEmpresa(Boolean isVisibilidadCeldaNuevoTipoDepreciacionEmpresa) {
		this.isVisibilidadCeldaNuevoTipoDepreciacionEmpresa = isVisibilidadCeldaNuevoTipoDepreciacionEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoDepreciacionEmpresa() {
		return isVisibilidadCeldaDuplicarTipoDepreciacionEmpresa;
	}

	public void setIsVisibilidadCeldaDuplicarTipoDepreciacionEmpresa(Boolean isVisibilidadCeldaDuplicarTipoDepreciacionEmpresa) {
		this.isVisibilidadCeldaDuplicarTipoDepreciacionEmpresa = isVisibilidadCeldaDuplicarTipoDepreciacionEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoDepreciacionEmpresa() {
		return isVisibilidadCeldaCopiarTipoDepreciacionEmpresa;
	}

	public void setIsVisibilidadCeldaCopiarTipoDepreciacionEmpresa(Boolean isVisibilidadCeldaCopiarTipoDepreciacionEmpresa) {
		this.isVisibilidadCeldaCopiarTipoDepreciacionEmpresa = isVisibilidadCeldaCopiarTipoDepreciacionEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoDepreciacionEmpresa() {
		return isVisibilidadCeldaVerFormTipoDepreciacionEmpresa;
	}

	public void setIsVisibilidadCeldaVerFormTipoDepreciacionEmpresa(Boolean isVisibilidadCeldaVerFormTipoDepreciacionEmpresa) {
		this.isVisibilidadCeldaVerFormTipoDepreciacionEmpresa = isVisibilidadCeldaVerFormTipoDepreciacionEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoDepreciacionEmpresa() {
		return isVisibilidadCeldaOrdenTipoDepreciacionEmpresa;
	}

	public void setIsVisibilidadCeldaOrdenTipoDepreciacionEmpresa(Boolean isVisibilidadCeldaOrdenTipoDepreciacionEmpresa) {
		this.isVisibilidadCeldaOrdenTipoDepreciacionEmpresa = isVisibilidadCeldaOrdenTipoDepreciacionEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoDepreciacionEmpresa() {
		return isVisibilidadCeldaNuevoRelacionesTipoDepreciacionEmpresa;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoDepreciacionEmpresa(Boolean isVisibilidadCeldaNuevoRelacionesTipoDepreciacionEmpresa) {
		this.isVisibilidadCeldaNuevoRelacionesTipoDepreciacionEmpresa = isVisibilidadCeldaNuevoRelacionesTipoDepreciacionEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoDepreciacionEmpresa() {
		return isVisibilidadCeldaModificarTipoDepreciacionEmpresa;
	}

	public void setIsVisibilidadCeldaModificarTipoDepreciacionEmpresa(Boolean isVisibilidadCeldaModificarTipoDepreciacionEmpresa) {
		this.isVisibilidadCeldaModificarTipoDepreciacionEmpresa = isVisibilidadCeldaModificarTipoDepreciacionEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoDepreciacionEmpresa() {
		return isVisibilidadCeldaActualizarTipoDepreciacionEmpresa;
	}

	public void setIsVisibilidadCeldaActualizarTipoDepreciacionEmpresa(Boolean isVisibilidadCeldaActualizarTipoDepreciacionEmpresa) {
		this.isVisibilidadCeldaActualizarTipoDepreciacionEmpresa = isVisibilidadCeldaActualizarTipoDepreciacionEmpresa;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoDepreciacionEmpresa() {
		return isVisibilidadCeldaEliminarTipoDepreciacionEmpresa;
	}

	public void setIsVisibilidadCeldaEliminarTipoDepreciacionEmpresa(Boolean isVisibilidadCeldaEliminarTipoDepreciacionEmpresa) {
		this.isVisibilidadCeldaEliminarTipoDepreciacionEmpresa = isVisibilidadCeldaEliminarTipoDepreciacionEmpresa;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoDepreciacionEmpresa() {
		return isVisibilidadCeldaCancelarTipoDepreciacionEmpresa;
	}

	public void setIsVisibilidadCeldaCancelarTipoDepreciacionEmpresa(Boolean isVisibilidadCeldaCancelarTipoDepreciacionEmpresa) {
		this.isVisibilidadCeldaCancelarTipoDepreciacionEmpresa = isVisibilidadCeldaCancelarTipoDepreciacionEmpresa;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoDepreciacionEmpresa() {
		return isVisibilidadCeldaGuardarTipoDepreciacionEmpresa;
	}

	public void setIsVisibilidadCeldaGuardarTipoDepreciacionEmpresa(Boolean isVisibilidadCeldaGuardarTipoDepreciacionEmpresa) {
		this.isVisibilidadCeldaGuardarTipoDepreciacionEmpresa = isVisibilidadCeldaGuardarTipoDepreciacionEmpresa;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoDepreciacionEmpresa() {
		return isVisibilidadCeldaGuardarCambiosTipoDepreciacionEmpresa;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoDepreciacionEmpresa(Boolean isVisibilidadCeldaGuardarCambiosTipoDepreciacionEmpresa) {
		this.isVisibilidadCeldaGuardarCambiosTipoDepreciacionEmpresa = isVisibilidadCeldaGuardarCambiosTipoDepreciacionEmpresa;
	}
		
	public TipoDepreciacionEmpresaSessionBean gettipodepreciacionempresaSessionBean() {
		return this.tipodepreciacionempresaSessionBean;
	}
	
	public void settipodepreciacionempresaSessionBean(TipoDepreciacionEmpresaSessionBean tipodepreciacionempresaSessionBean) {
		this.tipodepreciacionempresaSessionBean=tipodepreciacionempresaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoDepreciacionEmpresa(TipoDepreciacionEmpresa tipodepreciacionempresa)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipodepreciacionempresa,null);
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
	
	public void bugActualizarReferenciaActual(TipoDepreciacionEmpresa tipodepreciacionempresa,TipoDepreciacionEmpresa tipodepreciacionempresaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoDepreciacionEmpresa(tipodepreciacionempresa);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipodepreciacionempresaAux.setId(tipodepreciacionempresa.getId());
		tipodepreciacionempresaAux.setVersionRow(tipodepreciacionempresa.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoDepreciacionEmpresa();
		
			int intSelectedRow = this.jTableDatosTipoDepreciacionEmpresa.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoDepreciacionEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoDepreciacionEmpresa(this.tipodepreciacionempresa,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDepreciacionEmpresa(this.tipodepreciacionempresa);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipodepreciacionempresaValidator.getInvalidValues(this.tipodepreciacionempresa);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipodepreciacionempresaLogic.setDatosCliente(datosCliente);
			tipodepreciacionempresaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipodepreciacionempresaAux=new  TipoDepreciacionEmpresa();
				
				tipodepreciacionempresaAux.setIsNew(true);
				tipodepreciacionempresaAux.setIsChanged(true);
				
				tipodepreciacionempresaAux.setTipoDepreciacionEmpresaOriginal(this.tipodepreciacionempresa);
				
				tipodepreciacionempresaAux.setId(this.tipodepreciacionempresa.getId());	
				tipodepreciacionempresaAux.setVersionRow(this.tipodepreciacionempresa.getVersionRow());	
				tipodepreciacionempresaAux.setid_empresa(this.tipodepreciacionempresa.getid_empresa());	
				tipodepreciacionempresaAux.setcodigo(this.tipodepreciacionempresa.getcodigo());	
				tipodepreciacionempresaAux.setnombre(this.tipodepreciacionempresa.getnombre());	
				tipodepreciacionempresaAux.setes_linea_recta(this.tipodepreciacionempresa.getes_linea_recta());	
				tipodepreciacionempresaAux.setes_mensual(this.tipodepreciacionempresa.getes_mensual());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodepreciacionempresaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipodepreciacionempresaAux,tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodepreciacionempresaAux,tipodepreciacionempresas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipodepreciacionempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodepreciacionempresaLogic.saveTipoDepreciacionEmpresas();//WithConnection
						//tipodepreciacionempresaLogic.getSetVersionRowTipoDepreciacionEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodepreciacionempresa,tipodepreciacionempresaAux);
					
					this.refrescarForeignKeysDescripcionesTipoDepreciacionEmpresa();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodepreciacionempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipodepreciacionempresaAux=new  TipoDepreciacionEmpresa();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado() && this.tipodepreciacionempresa.getId()>=0)) {
						
					tipodepreciacionempresaAux.setIsNew(false);
				}
				
				tipodepreciacionempresaAux.setIsDeleted(false);
			
				tipodepreciacionempresaAux.setId(this.tipodepreciacionempresa.getId());	
				tipodepreciacionempresaAux.setVersionRow(this.tipodepreciacionempresa.getVersionRow());	
				tipodepreciacionempresaAux.setid_empresa(this.tipodepreciacionempresa.getid_empresa());	
				tipodepreciacionempresaAux.setcodigo(this.tipodepreciacionempresa.getcodigo());	
				tipodepreciacionempresaAux.setnombre(this.tipodepreciacionempresa.getnombre());	
				tipodepreciacionempresaAux.setes_linea_recta(this.tipodepreciacionempresa.getes_linea_recta());	
				tipodepreciacionempresaAux.setes_mensual(this.tipodepreciacionempresa.getes_mensual());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodepreciacionempresaAux,tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodepreciacionempresaAux,tipodepreciacionempresas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipodepreciacionempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodepreciacionempresaLogic.saveTipoDepreciacionEmpresas();//WithConnection
						//tipodepreciacionempresaLogic.getSetVersionRowTipoDepreciacionEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodepreciacionempresa,tipodepreciacionempresaAux);
					
					this.refrescarForeignKeysDescripcionesTipoDepreciacionEmpresa();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodepreciacionempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipodepreciacionempresaAux=new  TipoDepreciacionEmpresa();
				
				tipodepreciacionempresaAux.setIsNew(false);
				tipodepreciacionempresaAux.setIsChanged(false);
				
				tipodepreciacionempresaAux.setIsDeleted(true);
				
				tipodepreciacionempresaAux.setId(this.tipodepreciacionempresa.getId());	
				tipodepreciacionempresaAux.setVersionRow(this.tipodepreciacionempresa.getVersionRow());	
				tipodepreciacionempresaAux.setid_empresa(this.tipodepreciacionempresa.getid_empresa());	
				tipodepreciacionempresaAux.setcodigo(this.tipodepreciacionempresa.getcodigo());	
				tipodepreciacionempresaAux.setnombre(this.tipodepreciacionempresa.getnombre());	
				tipodepreciacionempresaAux.setes_linea_recta(this.tipodepreciacionempresa.getes_linea_recta());	
				tipodepreciacionempresaAux.setes_mensual(this.tipodepreciacionempresa.getes_mensual());	
				
				if(this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipodepreciacionempresaAux.getId()>=0) {	
						this.tipodepreciacionempresasEliminados.add(tipodepreciacionempresaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipodepreciacionempresaAux,tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodepreciacionempresaAux,tipodepreciacionempresas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipodepreciacionempresaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodepreciacionempresaLogic.saveTipoDepreciacionEmpresas();//WithConnection
						//tipodepreciacionempresaLogic.getSetVersionRowTipoDepreciacionEmpresas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodepreciacionempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipodepreciacionempresaAux.setDetalleActivoFijos(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());

							if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipodepreciacionempresaAux.setDepreciacionActivoFijos(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoLogic.getDepreciacionActivoFijos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipodepreciacionempresaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipodepreciacionempresaAux,tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipodepreciacionempresaAux,tipodepreciacionempresas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().addAll(this.tipodepreciacionempresasEliminados);
					
					tipodepreciacionempresaLogic.saveTipoDepreciacionEmpresas();//WithConnection
					//tipodepreciacionempresaLogic.getSetVersionRowTipoDepreciacionEmpresas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoDepreciacionEmpresa();
				
				this.tipodepreciacionempresasEliminados= new ArrayList<TipoDepreciacionEmpresa>();		
			}
			
			if(this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Depreciacion Empresa GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Depreciacion Empresa",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipodepreciacionempresa=tipodepreciacionempresaAux;
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
      		//this.finishProcessTipoDepreciacionEmpresa();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoDepreciacionEmpresa tipodepreciacionempresaLocal) throws Exception {
		
		if(this.tipodepreciacionempresaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipodepreciacionempresaLocal.setDetalleActivoFijos(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());
				tipodepreciacionempresaLocal.setDepreciacionActivoFijos(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoLogic.getDepreciacionActivoFijos());
			
			} else {
			
				tipodepreciacionempresaLocal.setDetalleActivoFijos(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijos);
				tipodepreciacionempresaLocal.setDepreciacionActivoFijos(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoDepreciacionEmpresa tipodepreciacionempresaLocal) throws Exception {	
		if(this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipodepreciacionempresaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoDepreciacionEmpresaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoDepreciacionEmpresa.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipodepreciacionempresaValidator.getInvalidValues(this.tipodepreciacionempresa);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoDepreciacionEmpresa tipodepreciacionempresa,List<TipoDepreciacionEmpresa> tipodepreciacionempresas) throws Exception {
		try	{		
			TipoDepreciacionEmpresaConstantesFunciones.actualizarLista(tipodepreciacionempresa,tipodepreciacionempresas,this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoDepreciacionEmpresa tipodepreciacionempresa,List<TipoDepreciacionEmpresa> tipodepreciacionempresas) throws Exception {
		try	{			
			TipoDepreciacionEmpresaConstantesFunciones.actualizarSelectedLista(tipodepreciacionempresa,tipodepreciacionempresas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoDepreciacionEmpresa> tipodepreciacionempresasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipodepreciacionempresasLocal=this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipodepreciacionempresasLocal=this.tipodepreciacionempresas;
			}
			//ARCHITECTURE
		
			for(TipoDepreciacionEmpresa tipodepreciacionempresaLocal:tipodepreciacionempresasLocal) {
				if(this.permiteMantenimiento(tipodepreciacionempresaLocal) && tipodepreciacionempresaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoDepreciacionEmpresaConstantesFunciones.getTipoDepreciacionEmpresaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoDepreciacionEmpresaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jLabelid_empresaTipoDepreciacionEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDepreciacionEmpresaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jLabelcodigoTipoDepreciacionEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDepreciacionEmpresaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jLabelnombreTipoDepreciacionEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDepreciacionEmpresaConstantesFunciones.ESLINEARECTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jLabeles_linea_rectaTipoDepreciacionEmpresa,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDepreciacionEmpresaConstantesFunciones.ESMENSUAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jLabeles_mensualTipoDepreciacionEmpresa,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jLabelid_empresaTipoDepreciacionEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jLabelcodigoTipoDepreciacionEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jLabelnombreTipoDepreciacionEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jLabeles_linea_rectaTipoDepreciacionEmpresa,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jLabeles_mensualTipoDepreciacionEmpresa,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleActivoFijo")) {
			if(this.tipodepreciacionempresa==null) {
				this.tipodepreciacionempresa= new TipoDepreciacionEmpresa();
			}

			if(this.tipodepreciacionempresaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoDepreciacionEmpresa
				this.setVariablesFormularioToObjetoActualTipoDepreciacionEmpresa(this.tipodepreciacionempresa,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDepreciacionEmpresa(this.tipodepreciacionempresa);

				this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame.getdetalleactivofijo().setTipoDepreciacionEmpresa(this.tipodepreciacionempresa);
			}

			return;
		}
		 else  if(sTipo.equals("DepreciacionActivoFijo")) {
			if(this.tipodepreciacionempresa==null) {
				this.tipodepreciacionempresa= new TipoDepreciacionEmpresa();
			}

			if(this.tipodepreciacionempresaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoDepreciacionEmpresa
				this.setVariablesFormularioToObjetoActualTipoDepreciacionEmpresa(this.tipodepreciacionempresa,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDepreciacionEmpresa(this.tipodepreciacionempresa);

				this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame.getdepreciacionactivofijo().setTipoDepreciacionEmpresa(this.tipodepreciacionempresa);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoDepreciacionEmpresa--;	
		
		
		this.tipodepreciacionempresaAux=new TipoDepreciacionEmpresa();
		
		this.tipodepreciacionempresaAux.setId(this.iIdNuevoTipoDepreciacionEmpresa);
		this.tipodepreciacionempresaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().add(this.tipodepreciacionempresaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipodepreciacionempresas.add(this.tipodepreciacionempresaAux);
		}
		//ARCHITECTURE
		
		this.tipodepreciacionempresa=this.tipodepreciacionempresaAux;
		
		if(TipoDepreciacionEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoDepreciacionEmpresa(this.tipodepreciacionempresa);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDepreciacionEmpresa(this.tipodepreciacionempresa);
		}
				
		//this.setDefaultControlesTipoDepreciacionEmpresa();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoDepreciacionEmpresa();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoDepreciacionEmpresa();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDepreciacionEmpresa();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDepreciacionEmpresa(this.tipodepreciacionempresaBean,this.tipodepreciacionempresa,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDepreciacionEmpresa(this.tipodepreciacionempresa);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipodepreciacionempresaSessionBean.getConGuardarRelaciones()) {
			classes=TipoDepreciacionEmpresaConstantesFunciones.getClassesRelationshipsOfTipoDepreciacionEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipodepreciacionempresaReturnGeneral=tipodepreciacionempresaLogic.procesarEventosTipoDepreciacionEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas(),this.tipodepreciacionempresa,this.tipodepreciacionempresaParameterGeneral,this.isEsNuevoTipoDepreciacionEmpresa,classes);//this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresa()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoDepreciacionEmpresa(this.tipodepreciacionempresaReturnGeneral,this.tipodepreciacionempresaBean,false);
		
		if(this.tipodepreciacionempresaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDepreciacionEmpresa(this.tipodepreciacionempresaReturnGeneral.getTipoDepreciacionEmpresa());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoDepreciacionEmpresa(this.tipodepreciacionempresaReturnGeneral.getTipoDepreciacionEmpresa());
		}
		
		if(this.tipodepreciacionempresaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoDepreciacionEmpresa(this.tipodepreciacionempresaReturnGeneral.getTipoDepreciacionEmpresa(),classes);//this.tipodepreciacionempresaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoDepreciacionEmpresa(this.tipodepreciacionempresa,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoDepreciacionEmpresa();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoDepreciacionEmpresa();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoDepreciacionEmpresa(false);
						
			if(tipodepreciacionempresaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.getEsGuardarRelacionado() && DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleActivoFijoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoSessionBean.getEsGuardarRelacionado() && DepreciacionActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDepreciacionActivoFijoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoDepreciacionEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDepreciacionEmpresa();
			}
			
			this.actualizarVisualTableDatosTipoDepreciacionEmpresa();
			
			this.jTableDatosTipoDepreciacionEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoDepreciacionEmpresa(), this.getIndiceNuevoTipoDepreciacionEmpresa());
			
			this.seleccionarFilaTablaTipoDepreciacionEmpresaActual();
						
			this.actualizarEstadoCeldasBotonesTipoDepreciacionEmpresa("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoDepreciacionEmpresa(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jTextFieldcodigoTipoDepreciacionEmpresa.setEnabled(isHabilitar && this.tipodepreciacionempresaConstantesFunciones.activarcodigoTipoDepreciacionEmpresa);
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jTextAreanombreTipoDepreciacionEmpresa.setEnabled(isHabilitar && this.tipodepreciacionempresaConstantesFunciones.activarnombreTipoDepreciacionEmpresa);
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jCheckBoxes_linea_rectaTipoDepreciacionEmpresa.setEnabled(isHabilitar && this.tipodepreciacionempresaConstantesFunciones.activares_linea_rectaTipoDepreciacionEmpresa);
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jCheckBoxes_mensualTipoDepreciacionEmpresa.setEnabled(isHabilitar && this.tipodepreciacionempresaConstantesFunciones.activares_mensualTipoDepreciacionEmpresa);	
		//
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jComboBoxid_empresaTipoDepreciacionEmpresa.setEnabled(isHabilitar && this.tipodepreciacionempresaConstantesFunciones.activarid_empresaTipoDepreciacionEmpresa);
	};
	
	public void setDefaultControlesTipoDepreciacionEmpresa() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoDepreciacionEmpresa(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipodepreciacionempresaSessionBean.setConGuardarRelaciones(true);			
			this.tipodepreciacionempresaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jTabbedPaneRelacionesTipoDepreciacionEmpresa.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipodepreciacionempresaSessionBean.setConGuardarRelaciones(false);			
			this.tipodepreciacionempresaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jTabbedPaneRelacionesTipoDepreciacionEmpresa.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoDepreciacionEmpresa() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas()) {
				if(tipodepreciacionempresaAux.getId().equals(this.iIdNuevoTipoDepreciacionEmpresa)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:this.tipodepreciacionempresas) {
				if(tipodepreciacionempresaAux.getId().equals(this.iIdNuevoTipoDepreciacionEmpresa)) {
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
	
	public int getIndiceActualTipoDepreciacionEmpresa(TipoDepreciacionEmpresa tipodepreciacionempresa,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas()) {
				if(tipodepreciacionempresaAux.getId().equals(tipodepreciacionempresa.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:this.tipodepreciacionempresas) {
				if(tipodepreciacionempresaAux.getId().equals(tipodepreciacionempresa.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoDepreciacionEmpresa(TipoDepreciacionEmpresa tipodepreciacionempresaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas()) {
				if(tipodepreciacionempresaAux.getTipoDepreciacionEmpresaOriginal().getId().equals(tipodepreciacionempresaOriginal.getId())) {
					existe=true;
					tipodepreciacionempresaOriginal.setId(tipodepreciacionempresaAux.getId());
					tipodepreciacionempresaOriginal.setVersionRow(tipodepreciacionempresaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:this.tipodepreciacionempresas) {
				if(tipodepreciacionempresaAux.getTipoDepreciacionEmpresaOriginal().getId().equals(tipodepreciacionempresaOriginal.getId())) {
					existe=true;
					tipodepreciacionempresaOriginal.setId(tipodepreciacionempresaAux.getId());
					tipodepreciacionempresaOriginal.setVersionRow(tipodepreciacionempresaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoDepreciacionEmpresa(Boolean esParaCancelar) throws Exception {
		tipodepreciacionempresasAux=new ArrayList<TipoDepreciacionEmpresa>();
		tipodepreciacionempresaAux=new TipoDepreciacionEmpresa();
		
		if(!this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas()) {
					if(tipodepreciacionempresaAux.getId()<0) {
						tipodepreciacionempresasAux.add(tipodepreciacionempresaAux);
					}		
				}
				this.iIdNuevoTipoDepreciacionEmpresa=0L;
				this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().removeAll(tipodepreciacionempresasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:this.tipodepreciacionempresas) {
					if(tipodepreciacionempresaAux.getId()<0) {
						tipodepreciacionempresasAux.add(tipodepreciacionempresaAux);
					}		
				}
				this.iIdNuevoTipoDepreciacionEmpresa=0L;
				this.tipodepreciacionempresas.removeAll(tipodepreciacionempresasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoDepreciacionEmpresa 
					&& this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().size()>0
					) {
					tipodepreciacionempresaAux=this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().get(this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().size() - 1);
				
					if(tipodepreciacionempresaAux.getId()<0) {
						this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().remove(tipodepreciacionempresaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoDepreciacionEmpresa && this.tipodepreciacionempresas.size()>0) {
					tipodepreciacionempresaAux=this.tipodepreciacionempresas.get(this.tipodepreciacionempresas.size() - 1);
				
					if(tipodepreciacionempresaAux.getId()<0) {
						this.tipodepreciacionempresas.remove(tipodepreciacionempresaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoDepreciacionEmpresa(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipodepreciacionempresa.getId()<0) {
				this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().remove(this.tipodepreciacionempresa);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipodepreciacionempresa.getId()<0) {
				this.tipodepreciacionempresas.remove(this.tipodepreciacionempresa);
			}
		}			
	}
	
	public void setEstadosInicialesTipoDepreciacionEmpresa(List<TipoDepreciacionEmpresa> tipodepreciacionempresasAux) throws Exception {
		TipoDepreciacionEmpresaConstantesFunciones.setEstadosInicialesTipoDepreciacionEmpresa(tipodepreciacionempresasAux);
	}
	
	public void setEstadosInicialesTipoDepreciacionEmpresa(TipoDepreciacionEmpresa tipodepreciacionempresaAux) throws Exception {
		TipoDepreciacionEmpresaConstantesFunciones.setEstadosInicialesTipoDepreciacionEmpresa(tipodepreciacionempresaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoDepreciacionEmpresaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoDepreciacionEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoDepreciacionEmpresaActual()) {
				if(!this.isEsNuevoTipoDepreciacionEmpresa) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoDepreciacionEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoDepreciacionEmpresa=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoDepreciacionEmpresaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Depreciacion Empresa ?", "MANTENIMIENTO DE Tipo Depreciacion Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoDepreciacionEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoDepreciacionEmpresa tipodepreciacionempresa) throws Exception {
		TipoDepreciacionEmpresaConstantesFunciones.seleccionarAsignar(this.tipodepreciacionempresa,tipodepreciacionempresa);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoDepreciacionEmpresa=this.isPermisoActualizarOriginalTipoDepreciacionEmpresa;
			
			
			this.seleccionarAsignar(tipodepreciacionempresa);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoDepreciacionEmpresaConstantesFunciones.quitarEspaciosTipoDepreciacionEmpresa(this.tipodepreciacionempresa,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoDepreciacionEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipodepreciacionempresaSessionBean.setsFuncionBusquedaRapida(this.tipodepreciacionempresaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoDepreciacionEmpresa) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoDepreciacionEmpresa(esParaCancelar);				
				this.cancelarNuevoTipoDepreciacionEmpresa(esParaCancelar);								
			}
			
			this.tipodepreciacionempresa=new TipoDepreciacionEmpresa();
			
			this.inicializarTipoDepreciacionEmpresa();
			
			this.actualizarEstadoCeldasBotonesTipoDepreciacionEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoDepreciacionEmpresa() throws Exception {
		try {
			TipoDepreciacionEmpresaConstantesFunciones.inicializarTipoDepreciacionEmpresa(this.tipodepreciacionempresa);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoDepreciacionEmpresas(String sAccionBusqueda,List<TipoDepreciacionEmpresa> tipodepreciacionempresasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoDepreciacionEmpresa"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoDepreciacionEmpresaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoDepreciacionEmpresaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoDepreciacionEmpresa"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Depreciacion Empresaes");		
		parameters.put("busquedapor", TipoDepreciacionEmpresaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleActivoFijo.class));
			classes.add(new Classe(DepreciacionActivoFijo.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoDepreciacionEmpresaLogic tipodepreciacionempresaLogicAuxiliar=new TipoDepreciacionEmpresaLogic();
					tipodepreciacionempresaLogicAuxiliar.setDatosCliente(tipodepreciacionempresaLogic.getDatosCliente());				
					tipodepreciacionempresaLogicAuxiliar.setTipoDepreciacionEmpresas(tipodepreciacionempresasParaReportes);
					
					tipodepreciacionempresaLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoDepreciacionEmpresaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipodepreciacionempresasParaReportes=tipodepreciacionempresaLogicAuxiliar.getTipoDepreciacionEmpresas();
					
					//tipodepreciacionempresaLogic.getNewConnexionToDeep();
					
					//for (TipoDepreciacionEmpresa tipodepreciacionempresa:tipodepreciacionempresasParaReportes) {
					//	tipodepreciacionempresaLogic.deepLoad(tipodepreciacionempresa, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipodepreciacionempresaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipodepreciacionempresaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleActivoFijo = AuxiliarReportes.class.getResourceAsStream("DetalleActivoFijoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalleactivofijo", reportFileDetalleActivoFijo);

			InputStream reportFileDepreciacionActivoFijo = AuxiliarReportes.class.getResourceAsStream("DepreciacionActivoFijoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_depreciacionactivofijo", reportFileDepreciacionActivoFijo);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoDepreciacionEmpresa=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoDepreciacionEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoDepreciacionEmpresaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoDepreciacionEmpresa=new JRBeanArrayDataSource(TipoDepreciacionEmpresaJInternalFrame.TraerTipoDepreciacionEmpresaBeans(tipodepreciacionempresasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoDepreciacionEmpresa);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoDepreciacionEmpresaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoDepreciacionEmpresaBean.TraerTipoDepreciacionEmpresaBeans(tipodepreciacionempresasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoDepreciacionEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipodepreciacionempresasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoDepreciacionEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipodepreciacionempresasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoDepreciacionEmpresaActionPerformed(null);
					//this.generarExcelReporteTipoDepreciacionEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipodepreciacionempresasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoDepreciacionEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipodepreciacionempresasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoDepreciacionEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipodepreciacionempresasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoDepreciacionEmpresas(sAccionBusqueda,sTipoArchivoReporte,tipodepreciacionempresasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoDepreciacionEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDepreciacionEmpresa> tipodepreciacionempresasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodepreciacionempresa";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDepreciacionEmpresas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDepreciacionEmpresa("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoDepreciacionEmpresa tipodepreciacionempresa : tipodepreciacionempresasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoDepreciacionEmpresaConstantesFunciones.generarExcelReporteDataTipoDepreciacionEmpresa("NORMAL",row,workbook,tipodepreciacionempresa,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Depreciacion Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoDepreciacionEmpresa(String sTipo,Row row,Workbook workbook) {
		
		TipoDepreciacionEmpresaConstantesFunciones.generarExcelReporteHeaderTipoDepreciacionEmpresa(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoDepreciacionEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDepreciacionEmpresa> tipodepreciacionempresasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodepreciacionempresa_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDepreciacionEmpresas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoDepreciacionEmpresa tipodepreciacionempresa : tipodepreciacionempresasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoDepreciacionEmpresaConstantesFunciones.getTipoDepreciacionEmpresaDescripcion(tipodepreciacionempresa));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDepreciacionEmpresaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDepreciacionEmpresaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodepreciacionempresa.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDepreciacionEmpresaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDepreciacionEmpresaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodepreciacionempresa.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDepreciacionEmpresaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDepreciacionEmpresaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodepreciacionempresa.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESLINEARECTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESLINEARECTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tipodepreciacionempresa.getes_linea_recta()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESMENSUAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESMENSUAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tipodepreciacionempresa.getes_mensual()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Depreciacion Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoDepreciacionEmpresas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDepreciacionEmpresa> tipodepreciacionempresasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoDepreciacionEmpresa> tipodepreciacionempresasRespaldo=null;
		
		classes=TipoDepreciacionEmpresaConstantesFunciones.getClassesRelationshipsOfTipoDepreciacionEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipodepreciacionempresaLogic.setDatosCliente(this.datosCliente);
		this.tipodepreciacionempresaLogic.setDatosDeep(this.datosDeep);
		this.tipodepreciacionempresaLogic.setIsConDeep(true);
		
		tipodepreciacionempresasRespaldo=this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas();
		
		this.tipodepreciacionempresaLogic.setTipoDepreciacionEmpresas(tipodepreciacionempresasParaReportes);	
		this.tipodepreciacionempresaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipodepreciacionempresasParaReportes=this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas();
		this.tipodepreciacionempresaLogic.setTipoDepreciacionEmpresas(tipodepreciacionempresasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodepreciacionempresa_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDepreciacionEmpresas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDepreciacionEmpresa("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoDepreciacionEmpresa tipodepreciacionempresa : tipodepreciacionempresasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoDepreciacionEmpresa("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoDepreciacionEmpresaConstantesFunciones.generarExcelReporteDataTipoDepreciacionEmpresa("NORMAL",row,workbook,tipodepreciacionempresa,cellStyleDataAux);
		
			
			


				//DetalleActivoFijo
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipodepreciacionempresa.getDetalleActivoFijos()!=null && tipodepreciacionempresa.getDetalleActivoFijos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleActivoFijoConstantesFunciones.generarExcelReporteHeaderDetalleActivoFijo("RELACIONADO",row,workbook);
				}

				if(tipodepreciacionempresa.getDetalleActivoFijos()!=null) {
					i2=0;
					for(DetalleActivoFijo detalleactivofijo : tipodepreciacionempresa.getDetalleActivoFijos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleActivoFijoConstantesFunciones.generarExcelReporteDataDetalleActivoFijo("RELACIONADO",row,workbook,detalleactivofijo,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//DepreciacionActivoFijo
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipodepreciacionempresa.getDepreciacionActivoFijos()!=null && tipodepreciacionempresa.getDepreciacionActivoFijos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DepreciacionActivoFijoConstantesFunciones.generarExcelReporteHeaderDepreciacionActivoFijo("RELACIONADO",row,workbook);
				}

				if(tipodepreciacionempresa.getDepreciacionActivoFijos()!=null) {
					i2=0;
					for(DepreciacionActivoFijo depreciacionactivofijo : tipodepreciacionempresa.getDepreciacionActivoFijos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DepreciacionActivoFijoConstantesFunciones.generarExcelReporteDataDepreciacionActivoFijo("RELACIONADO",row,workbook,depreciacionactivofijo,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoDepreciacionEmpresaConstantesFunciones.getTipoDepreciacionEmpresaDescripcion(tipodepreciacionempresa));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Depreciacion Empresa",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoDepreciacionEmpresa() throws Exception {		
		this.startProcessTipoDepreciacionEmpresa(true);
	}
	
	public void startProcessTipoDepreciacionEmpresa(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoDepreciacionEmpresa ,this.jPanelParametrosReportesTipoDepreciacionEmpresa, this.jScrollPanelDatosTipoDepreciacionEmpresa,this.jPanelPaginacionTipoDepreciacionEmpresa, this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa, this.jPanelAccionesTipoDepreciacionEmpresa,this.jPanelAccionesFormularioTipoDepreciacionEmpresa,this.jmenuBarTipoDepreciacionEmpresa,this.jmenuBarDetalleTipoDepreciacionEmpresa,this.jTtoolBarTipoDepreciacionEmpresa,this.jTtoolBarDetalleTipoDepreciacionEmpresa);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDepreciacionEmpresa=this.jTabbedPaneBusquedasTipoDepreciacionEmpresa; 
		
		final JPanel jPanelParametrosReportesTipoDepreciacionEmpresa=this.jPanelParametrosReportesTipoDepreciacionEmpresa;
		//final JScrollPane jScrollPanelDatosTipoDepreciacionEmpresa=this.jScrollPanelDatosTipoDepreciacionEmpresa;
		final JTable jTableDatosTipoDepreciacionEmpresa=this.jTableDatosTipoDepreciacionEmpresa;		
		final JPanel jPanelPaginacionTipoDepreciacionEmpresa=this.jPanelPaginacionTipoDepreciacionEmpresa;
		//final JScrollPane jScrollPanelDatosEdicionTipoDepreciacionEmpresa=this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa;
		final JPanel jPanelAccionesTipoDepreciacionEmpresa=this.jPanelAccionesTipoDepreciacionEmpresa;
		
		JPanel jPanelCamposAuxiliarTipoDepreciacionEmpresa=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoDepreciacionEmpresa=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) {
			jPanelCamposAuxiliarTipoDepreciacionEmpresa=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jPanelCamposTipoDepreciacionEmpresa;
			jPanelAccionesFormularioAuxiliarTipoDepreciacionEmpresa=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jPanelAccionesFormularioTipoDepreciacionEmpresa;
		}
		
		final JPanel jPanelCamposTipoDepreciacionEmpresa=jPanelCamposAuxiliarTipoDepreciacionEmpresa;
		final JPanel jPanelAccionesFormularioTipoDepreciacionEmpresa=jPanelAccionesFormularioAuxiliarTipoDepreciacionEmpresa;
		
		
		final JMenuBar jmenuBarTipoDepreciacionEmpresa=this.jmenuBarTipoDepreciacionEmpresa;
		final JToolBar jTtoolBarTipoDepreciacionEmpresa=this.jTtoolBarTipoDepreciacionEmpresa;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoDepreciacionEmpresa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDepreciacionEmpresa=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) {
			jmenuBarDetalleAuxiliarTipoDepreciacionEmpresa=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jmenuBarDetalleTipoDepreciacionEmpresa;
			jTtoolBarDetalleAuxiliarTipoDepreciacionEmpresa=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jTtoolBarDetalleTipoDepreciacionEmpresa;
		}
		
		final JMenuBar jmenuBarDetalleTipoDepreciacionEmpresa=jmenuBarDetalleAuxiliarTipoDepreciacionEmpresa;
		final JToolBar jTtoolBarDetalleTipoDepreciacionEmpresa=jTtoolBarDetalleAuxiliarTipoDepreciacionEmpresa;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDepreciacionEmpresa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDepreciacionEmpresa;
			processRunnable.jTableDatos=jTableDatosTipoDepreciacionEmpresa;
			processRunnable.jPanelCampos=jPanelCamposTipoDepreciacionEmpresa;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDepreciacionEmpresa;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDepreciacionEmpresa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDepreciacionEmpresa;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDepreciacionEmpresa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDepreciacionEmpresa;
			processRunnable.jTtoolBar=jTtoolBarTipoDepreciacionEmpresa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDepreciacionEmpresa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoDepreciacionEmpresa ,jPanelParametrosReportesTipoDepreciacionEmpresa,jTableDatosTipoDepreciacionEmpresa, /*jScrollPanelDatosTipoDepreciacionEmpresa,*/jPanelCamposTipoDepreciacionEmpresa,jPanelPaginacionTipoDepreciacionEmpresa, /*jScrollPanelDatosEdicionTipoDepreciacionEmpresa,*/ jPanelAccionesTipoDepreciacionEmpresa,jPanelAccionesFormularioTipoDepreciacionEmpresa,jmenuBarTipoDepreciacionEmpresa,jmenuBarDetalleTipoDepreciacionEmpresa,jTtoolBarTipoDepreciacionEmpresa,jTtoolBarDetalleTipoDepreciacionEmpresa);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoDepreciacionEmpresa ,jPanelParametrosReportesTipoDepreciacionEmpresa, jScrollPanelDatosTipoDepreciacionEmpresa,jPanelPaginacionTipoDepreciacionEmpresa, jScrollPanelDatosEdicionTipoDepreciacionEmpresa, jPanelAccionesTipoDepreciacionEmpresa,jPanelAccionesFormularioTipoDepreciacionEmpresa,jmenuBarTipoDepreciacionEmpresa,jmenuBarDetalleTipoDepreciacionEmpresa,jTtoolBarTipoDepreciacionEmpresa,jTtoolBarDetalleTipoDepreciacionEmpresa);
						
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
	
	public void finishProcessTipoDepreciacionEmpresa() {// throws Exception 
		this.finishProcessTipoDepreciacionEmpresa(true);
	}
	
	public void finishProcessTipoDepreciacionEmpresa(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoDepreciacionEmpresa ,this.jPanelParametrosReportesTipoDepreciacionEmpresa, this.jScrollPanelDatosTipoDepreciacionEmpresa,this.jPanelPaginacionTipoDepreciacionEmpresa, this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa, this.jPanelAccionesTipoDepreciacionEmpresa,this.jPanelAccionesFormularioTipoDepreciacionEmpresa,this.jmenuBarTipoDepreciacionEmpresa,this.jmenuBarDetalleTipoDepreciacionEmpresa,this.jTtoolBarTipoDepreciacionEmpresa,this.jTtoolBarDetalleTipoDepreciacionEmpresa);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDepreciacionEmpresa=this.jTabbedPaneBusquedasTipoDepreciacionEmpresa; 
		
		final JPanel jPanelParametrosReportesTipoDepreciacionEmpresa=this.jPanelParametrosReportesTipoDepreciacionEmpresa;
		//final JScrollPane jScrollPanelDatosTipoDepreciacionEmpresa=this.jScrollPanelDatosTipoDepreciacionEmpresa;
		final JTable jTableDatosTipoDepreciacionEmpresa=this.jTableDatosTipoDepreciacionEmpresa;		
		final JPanel jPanelPaginacionTipoDepreciacionEmpresa=this.jPanelPaginacionTipoDepreciacionEmpresa;
		//final JScrollPane jScrollPanelDatosEdicionTipoDepreciacionEmpresa=this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa;
		final JPanel jPanelAccionesTipoDepreciacionEmpresa=this.jPanelAccionesTipoDepreciacionEmpresa;
		
		JPanel jPanelCamposAuxiliarTipoDepreciacionEmpresa=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoDepreciacionEmpresa=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) {
			jPanelCamposAuxiliarTipoDepreciacionEmpresa=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jPanelCamposTipoDepreciacionEmpresa;
			jPanelAccionesFormularioAuxiliarTipoDepreciacionEmpresa=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jPanelAccionesFormularioTipoDepreciacionEmpresa;
		}
		
		final JPanel jPanelCamposTipoDepreciacionEmpresa=jPanelCamposAuxiliarTipoDepreciacionEmpresa;
		final JPanel jPanelAccionesFormularioTipoDepreciacionEmpresa=jPanelAccionesFormularioAuxiliarTipoDepreciacionEmpresa;
		
		
		final JMenuBar jmenuBarTipoDepreciacionEmpresa=this.jmenuBarTipoDepreciacionEmpresa;		
		final JToolBar jTtoolBarTipoDepreciacionEmpresa=this.jTtoolBarTipoDepreciacionEmpresa;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoDepreciacionEmpresa=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDepreciacionEmpresa=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) {
			jmenuBarDetalleAuxiliarTipoDepreciacionEmpresa=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jmenuBarDetalleTipoDepreciacionEmpresa;
			jTtoolBarDetalleAuxiliarTipoDepreciacionEmpresa=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jTtoolBarDetalleTipoDepreciacionEmpresa;		
		}
		
		final JMenuBar jmenuBarDetalleTipoDepreciacionEmpresa=jmenuBarDetalleAuxiliarTipoDepreciacionEmpresa;
		final JToolBar jTtoolBarDetalleTipoDepreciacionEmpresa=jTtoolBarDetalleAuxiliarTipoDepreciacionEmpresa;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDepreciacionEmpresa;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDepreciacionEmpresa;
			processRunnable.jTableDatos=jTableDatosTipoDepreciacionEmpresa;
			processRunnable.jPanelCampos=jPanelCamposTipoDepreciacionEmpresa;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDepreciacionEmpresa;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDepreciacionEmpresa;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDepreciacionEmpresa;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDepreciacionEmpresa;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDepreciacionEmpresa;
			processRunnable.jTtoolBar=jTtoolBarTipoDepreciacionEmpresa;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDepreciacionEmpresa;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoDepreciacionEmpresa ,jPanelParametrosReportesTipoDepreciacionEmpresa, jTableDatosTipoDepreciacionEmpresa,/*jScrollPanelDatosTipoDepreciacionEmpresa,*/jPanelCamposTipoDepreciacionEmpresa,jPanelPaginacionTipoDepreciacionEmpresa, /*jScrollPanelDatosEdicionTipoDepreciacionEmpresa,*/ jPanelAccionesTipoDepreciacionEmpresa,jPanelAccionesFormularioTipoDepreciacionEmpresa,jmenuBarTipoDepreciacionEmpresa,jmenuBarDetalleTipoDepreciacionEmpresa,jTtoolBarTipoDepreciacionEmpresa,jTtoolBarDetalleTipoDepreciacionEmpresa));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoDepreciacionEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoDepreciacionEmpresa(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoDepreciacionEmpresa(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoDepreciacionEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoDepreciacionEmpresa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoDepreciacionEmpresa,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoDepreciacionEmpresa(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoDepreciacionEmpresa,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoDepreciacionEmpresa,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipodepreciacionempresaConstantesFunciones.getsFinalQueryTipoDepreciacionEmpresa();
		String  finalQueryPaginacionTodos=this.tipodepreciacionempresaConstantesFunciones.getsFinalQueryTipoDepreciacionEmpresa();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoDepreciacionEmpresaConstantesFunciones.getArrayColumnasGlobalesNoTipoDepreciacionEmpresa(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoDepreciacionEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoDepreciacionEmpresa(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoDepreciacionEmpresaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipodepreciacionempresasEliminados= new ArrayList<TipoDepreciacionEmpresa>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoDepreciacionEmpresa();
		
				///*TipoDepreciacionEmpresaSessionBean*/this.tipodepreciacionempresaSessionBean=new TipoDepreciacionEmpresaSessionBean();
			
			if(this.tipodepreciacionempresaSessionBean==null) {
				this.tipodepreciacionempresaSessionBean=new TipoDepreciacionEmpresaSessionBean();
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
					this.iNumeroPaginacion=TipoDepreciacionEmpresaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoDepreciacionEmpresaConstantesFunciones.getClassesForeignKeysOfTipoDepreciacionEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipodepreciacionempresa."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipodepreciacionempresasAux= new ArrayList<TipoDepreciacionEmpresa>();
			
				
			tipodepreciacionempresaLogic.setDatosCliente(this.datosCliente);
			tipodepreciacionempresaLogic.setDatosDeep(this.datosDeep);
			tipodepreciacionempresaLogic.setIsConDeep(true);
			
			
			tipodepreciacionempresaLogic.getTipoDepreciacionEmpresaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipodepreciacionempresaLogic.getTodosTipoDepreciacionEmpresas(finalQueryGlobal,pagination);
					
					//tipodepreciacionempresaLogic.getTodosTipoDepreciacionEmpresasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas()==null|| tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodepreciacionempresasAux= new ArrayList<TipoDepreciacionEmpresa>();
							tipodepreciacionempresasAux.addAll(tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodepreciacionempresasAux= new ArrayList<TipoDepreciacionEmpresa>();
							tipodepreciacionempresasAux.addAll(tipodepreciacionempresas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodepreciacionempresaLogic.getTodosTipoDepreciacionEmpresas(finalQueryGlobal+"",this.pagination);												
							
							//tipodepreciacionempresaLogic.getTodosTipoDepreciacionEmpresasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoDepreciacionEmpresas("Todos",tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodepreciacionempresaLogic.setTipoDepreciacionEmpresas(new ArrayList<TipoDepreciacionEmpresa>());					
							tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().addAll(tipodepreciacionempresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodepreciacionempresas=new ArrayList<TipoDepreciacionEmpresa>();
							tipodepreciacionempresas.addAll(tipodepreciacionempresasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoDepreciacionEmpresa=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoDepreciacionEmpresa=this.idActual;
				
				} else if(this.idTipoDepreciacionEmpresaActual!=null && this.idTipoDepreciacionEmpresaActual!=0L) {
					idTipoDepreciacionEmpresa=idTipoDepreciacionEmpresaActual;
				}
				
					
				this.sDetalleReporte=TipoDepreciacionEmpresaConstantesFunciones.getDetalleIndicePorId(idTipoDepreciacionEmpresa);
				
				this.tipodepreciacionempresas=new ArrayList<TipoDepreciacionEmpresa>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipodepreciacionempresaLogic.getEntity(idTipoDepreciacionEmpresa);
					
					//tipodepreciacionempresaLogic.getEntityWithConnection(idTipoDepreciacionEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodepreciacionempresaLogic.setTipoDepreciacionEmpresas(new ArrayList<TipoDepreciacionEmpresa>());
					tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().add(tipodepreciacionempresaLogic.getTipoDepreciacionEmpresa());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodepreciacionempresas=new ArrayList<TipoDepreciacionEmpresa>();
					this.tipodepreciacionempresas.add(tipodepreciacionempresa);
				}
				
				if(tipodepreciacionempresaLogic.getTipoDepreciacionEmpresa()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoDepreciacionEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodepreciacionempresaLogic.getTipoDepreciacionEmpresasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDepreciacionEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDepreciacionEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas()==null||tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodepreciacionempresas==null|| tipodepreciacionempresas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodepreciacionempresasAux=new ArrayList<TipoDepreciacionEmpresa>();
						tipodepreciacionempresasAux.addAll(tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodepreciacionempresasAux=new ArrayList<TipoDepreciacionEmpresa>();
							tipodepreciacionempresasAux.addAll(tipodepreciacionempresas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodepreciacionempresaLogic.getTipoDepreciacionEmpresasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDepreciacionEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDepreciacionEmpresaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDepreciacionEmpresas("FK_IdEmpresa",tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDepreciacionEmpresas("FK_IdEmpresa",tipodepreciacionempresas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodepreciacionempresaLogic.setTipoDepreciacionEmpresas(new ArrayList<TipoDepreciacionEmpresa>());
						tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().addAll(tipodepreciacionempresasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodepreciacionempresas=new ArrayList<TipoDepreciacionEmpresa>();
							tipodepreciacionempresas.addAll(tipodepreciacionempresasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoDepreciacionEmpresa();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoDepreciacionEmpresa();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodepreciacionempresas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodepreciacionempresas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoDepreciacionEmpresa tipodepreciacionempresa) {
		Boolean permite=true;
		
		if(this.tipodepreciacionempresa.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoDepreciacionEmpresaConstantesFunciones.getOrderByListaTipoDepreciacionEmpresa();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoDepreciacionEmpresaConstantesFunciones.getOrderByListaTipoDepreciacionEmpresa();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDepreciacionEmpresa tipodepreciacionempresa:tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas()) {
				if(tipodepreciacionempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipodepreciacionempresaTotales=tipodepreciacionempresa;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDepreciacionEmpresa tipodepreciacionempresa:this.tipodepreciacionempresas) {
				if(tipodepreciacionempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipodepreciacionempresaTotales=tipodepreciacionempresa;
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
			this.tipodepreciacionempresaAux=new TipoDepreciacionEmpresa();
			this.tipodepreciacionempresaAux.setsType(Constantes2.S_TOTALES);
			this.tipodepreciacionempresaAux.setIsNew(false);
			this.tipodepreciacionempresaAux.setIsChanged(false);
			this.tipodepreciacionempresaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoDepreciacionEmpresaConstantesFunciones.TotalizarValoresFilaTipoDepreciacionEmpresa(this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas(),this.tipodepreciacionempresaAux);
				
				this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().add(this.tipodepreciacionempresaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoDepreciacionEmpresaConstantesFunciones.TotalizarValoresFilaTipoDepreciacionEmpresa(this.tipodepreciacionempresas,this.tipodepreciacionempresaAux);
				
				this.tipodepreciacionempresas.add(this.tipodepreciacionempresaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipodepreciacionempresaTotales=new TipoDepreciacionEmpresa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().remove(tipodepreciacionempresaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodepreciacionempresas.remove(tipodepreciacionempresaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipodepreciacionempresaTotales=new TipoDepreciacionEmpresa();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDepreciacionEmpresa tipodepreciacionempresa:tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas()) {
				if(tipodepreciacionempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipodepreciacionempresaTotales=tipodepreciacionempresa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDepreciacionEmpresaConstantesFunciones.TotalizarValoresFilaTipoDepreciacionEmpresa(this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas(),tipodepreciacionempresaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDepreciacionEmpresa tipodepreciacionempresa:this.tipodepreciacionempresas) {
				if(tipodepreciacionempresa.getsType().equals(Constantes2.S_TOTALES)) {
					tipodepreciacionempresaTotales=tipodepreciacionempresa;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDepreciacionEmpresaConstantesFunciones.TotalizarValoresFilaTipoDepreciacionEmpresa(this.tipodepreciacionempresas,tipodepreciacionempresaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoDepreciacionEmpresasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoDepreciacionEmpresasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodepreciacionempresaLogic.getTipoDepreciacionEmpresasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoDepreciacionEmpresa() {
		this.isPermisoTodoTipoDepreciacionEmpresa=false;
		this.isPermisoNuevoTipoDepreciacionEmpresa=false;
		this.isPermisoActualizarTipoDepreciacionEmpresa=false;
		this.isPermisoActualizarOriginalTipoDepreciacionEmpresa=false;
		this.isPermisoEliminarTipoDepreciacionEmpresa=false;
		this.isPermisoGuardarCambiosTipoDepreciacionEmpresa=false;
		this.isPermisoConsultaTipoDepreciacionEmpresa=false;
		this.isPermisoBusquedaTipoDepreciacionEmpresa=false;
		this.isPermisoReporteTipoDepreciacionEmpresa=false;		
		this.isPermisoOrdenTipoDepreciacionEmpresa=false;		
		this.isPermisoPaginacionMedioTipoDepreciacionEmpresa=false;		
		this.isPermisoPaginacionAltoTipoDepreciacionEmpresa=false;
		this.isPermisoPaginacionTodoTipoDepreciacionEmpresa=false;
		this.isPermisoCopiarTipoDepreciacionEmpresa=false;		
		this.isPermisoVerFormTipoDepreciacionEmpresa=false;		
		this.isPermisoDuplicarTipoDepreciacionEmpresa=false;		
		this.isPermisoOrdenTipoDepreciacionEmpresa=false;		
	}
	
	public void setPermisosUsuarioTipoDepreciacionEmpresa(Boolean isPermiso) {
		this.isPermisoTodoTipoDepreciacionEmpresa=isPermiso;
		this.isPermisoNuevoTipoDepreciacionEmpresa=isPermiso;
		this.isPermisoActualizarTipoDepreciacionEmpresa=isPermiso;
		this.isPermisoActualizarOriginalTipoDepreciacionEmpresa=isPermiso;
		this.isPermisoEliminarTipoDepreciacionEmpresa=isPermiso;
		this.isPermisoGuardarCambiosTipoDepreciacionEmpresa=isPermiso;
		this.isPermisoConsultaTipoDepreciacionEmpresa=isPermiso;
		this.isPermisoBusquedaTipoDepreciacionEmpresa=isPermiso;
		this.isPermisoReporteTipoDepreciacionEmpresa=isPermiso;
		this.isPermisoOrdenTipoDepreciacionEmpresa=isPermiso;		
		this.isPermisoPaginacionMedioTipoDepreciacionEmpresa=isPermiso;		
		this.isPermisoPaginacionAltoTipoDepreciacionEmpresa=isPermiso;		
		this.isPermisoPaginacionTodoTipoDepreciacionEmpresa=isPermiso;		
		this.isPermisoCopiarTipoDepreciacionEmpresa=isPermiso;		
		this.isPermisoVerFormTipoDepreciacionEmpresa=isPermiso;		
		this.isPermisoDuplicarTipoDepreciacionEmpresa=isPermiso;
		this.isPermisoOrdenTipoDepreciacionEmpresa=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoDepreciacionEmpresa(Boolean isPermiso) {
		//this.isPermisoTodoTipoDepreciacionEmpresa=isPermiso;
		this.isPermisoNuevoTipoDepreciacionEmpresa=isPermiso;
		this.isPermisoActualizarTipoDepreciacionEmpresa=isPermiso;
		this.isPermisoActualizarOriginalTipoDepreciacionEmpresa=isPermiso;
		this.isPermisoEliminarTipoDepreciacionEmpresa=isPermiso;
		this.isPermisoGuardarCambiosTipoDepreciacionEmpresa=isPermiso;
		//this.isPermisoConsultaTipoDepreciacionEmpresa=isPermiso;
		//this.isPermisoBusquedaTipoDepreciacionEmpresa=isPermiso;
		//this.isPermisoReporteTipoDepreciacionEmpresa=isPermiso;
		//this.isPermisoOrdenTipoDepreciacionEmpresa=isPermiso;		
		//this.isPermisoPaginacionMedioTipoDepreciacionEmpresa=isPermiso;		
		//this.isPermisoPaginacionAltoTipoDepreciacionEmpresa=isPermiso;		
		//this.isPermisoPaginacionTodoTipoDepreciacionEmpresa=isPermiso;		
		//this.isPermisoCopiarTipoDepreciacionEmpresa=isPermiso;		
		//this.isPermisoDuplicarTipoDepreciacionEmpresa=isPermiso;
		//this.isPermisoOrdenTipoDepreciacionEmpresa=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoDepreciacionEmpresaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleActivoFijoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(DepreciacionActivoFijoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoDepreciacionEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetalleActivoFijo=false;
		this.isTienePermisosDetalleActivoFijo=this.verificarGetPermisosUsuarioOpcionTipoDepreciacionEmpresaClaseRelacionada(this.opcionsRelacionadas,DetalleActivoFijoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosDepreciacionActivoFijo=false;
		this.isTienePermisosDepreciacionActivoFijo=this.verificarGetPermisosUsuarioOpcionTipoDepreciacionEmpresaClaseRelacionada(this.opcionsRelacionadas,DepreciacionActivoFijoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoDepreciacionEmpresa(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoDepreciacionEmpresaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleActivoFijo=conPermiso;
		this.isTienePermisosDepreciacionActivoFijo=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoDepreciacionEmpresaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoDepreciacionEmpresaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoDepreciacionEmpresaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleActivoFijo && this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null && this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jTabbedPaneRelacionesTipoDepreciacionEmpresa.remove(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosDepreciacionActivoFijo && this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null && this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jTabbedPaneRelacionesTipoDepreciacionEmpresa.remove(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoDepreciacionEmpresa() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoDepreciacionEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoDepreciacionEmpresaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoDepreciacionEmpresa=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoDepreciacionEmpresa=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoDepreciacionEmpresa=this.isPermisoActualizarTipoDepreciacionEmpresa;
			this.isPermisoEliminarTipoDepreciacionEmpresa=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoDepreciacionEmpresa=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoDepreciacionEmpresa=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoDepreciacionEmpresa=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoDepreciacionEmpresa=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoDepreciacionEmpresa=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDepreciacionEmpresa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoDepreciacionEmpresa=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoDepreciacionEmpresa=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoDepreciacionEmpresa=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoDepreciacionEmpresa=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoDepreciacionEmpresa=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoDepreciacionEmpresa=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDepreciacionEmpresa=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoDepreciacionEmpresa.setToolTipText(this.jTableDatosTipoDepreciacionEmpresa.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoDepreciacionEmpresa(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoDepreciacionEmpresa(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoDepreciacionEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoDepreciacionEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoDepreciacionEmpresa() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleActivoFijo && this.tipodepreciacionempresaConstantesFunciones.mostrarDetalleActivoFijoTipoDepreciacionEmpresa && !TipoDepreciacionEmpresaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Activo Fijo");
			reporte.setsDescripcion("Detalle Activo Fijo");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosDepreciacionActivoFijo && this.tipodepreciacionempresaConstantesFunciones.mostrarDepreciacionActivoFijoTipoDepreciacionEmpresa && !TipoDepreciacionEmpresaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Depreciacion Activo Fijo");
			reporte.setsDescripcion("Depreciacion Activo Fijo");
			this.tiposRelaciones.add(reporte);
		}
		
		
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
	public void inicializarCombosForeignKeyTipoDepreciacionEmpresaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoDepreciacionEmpresaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoDepreciacionEmpresaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoDepreciacionEmpresaListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoDepreciacionEmpresaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoDepreciacionEmpresaParameterReturnGeneral tipodepreciacionempresaReturnGeneral=new TipoDepreciacionEmpresaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipodepreciacionempresaConstantesFunciones.cargarid_empresaTipoDepreciacionEmpresa)
					 || (this.esRecargarFks && this.tipodepreciacionempresaConstantesFunciones.cargarid_empresaTipoDepreciacionEmpresa)) {

					if(!this.tipodepreciacionempresaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipodepreciacionempresaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipodepreciacionempresaReturnGeneral=tipodepreciacionempresaLogic.cargarCombosLoteForeignKeyTipoDepreciacionEmpresa(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipodepreciacionempresaReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoDepreciacionEmpresa()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipodepreciacionempresaSessionBean==null) {
				this.tipodepreciacionempresaSessionBean=new TipoDepreciacionEmpresaSessionBean();
			}

			if(!this.tipodepreciacionempresaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoDepreciacionEmpresa()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoDepreciacionEmpresa(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoDepreciacionEmpresa()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDepreciacionEmpresa();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoDepreciacionEmpresa(TipoDepreciacionEmpresa tipodepreciacionempresa)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoDepreciacionEmpresa(TipoDepreciacionEmpresa tipodepreciacionempresa,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoDepreciacionEmpresa()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDepreciacionEmpresa()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoDepreciacionEmpresa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoDepreciacionEmpresa()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoDepreciacionEmpresa()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoDepreciacionEmpresa()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoDepreciacionEmpresa(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoDepreciacionEmpresa()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jComboBoxid_empresaTipoDepreciacionEmpresa!=null && this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jComboBoxid_empresaTipoDepreciacionEmpresa.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jComboBoxid_empresaTipoDepreciacionEmpresa.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoDepreciacionEmpresaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoDepreciacionEmpresaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoDepreciacionEmpresaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipodepreciacionempresaSessionBean=new TipoDepreciacionEmpresaSessionBean(); 
		this.tipodepreciacionempresaConstantesFunciones=new TipoDepreciacionEmpresaConstantesFunciones(); 
		this.tipodepreciacionempresaBean=new TipoDepreciacionEmpresa();//(this.tipodepreciacionempresaConstantesFunciones); 		
		this.tipodepreciacionempresaReturnGeneral=new TipoDepreciacionEmpresaParameterReturnGeneral(); 
		
		this.tipodepreciacionempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodepreciacionempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoDepreciacionEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoDepreciacionEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoDepreciacionEmpresaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoDepreciacionEmpresa(true);
			
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
			
			this.tipodepreciacionempresaConstantesFunciones=new TipoDepreciacionEmpresaConstantesFunciones(); 
			this.tipodepreciacionempresaBean=new TipoDepreciacionEmpresa();//this.tipodepreciacionempresaConstantesFunciones); 			
			this.tipodepreciacionempresaReturnGeneral=new TipoDepreciacionEmpresaParameterReturnGeneral(); 
		
			TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Depreciacion Empresa Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipodepreciacionempresa=new TipoDepreciacionEmpresa();
			this.tipodepreciacionempresas = new ArrayList<TipoDepreciacionEmpresa>();
			this.tipodepreciacionempresasAux = new ArrayList<TipoDepreciacionEmpresa>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic=new TipoDepreciacionEmpresaLogic();
				this.tipodepreciacionempresaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipodepreciacionempresaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipodepreciacionempresaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoDepreciacionEmpresa);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa);	
					}
					
					if(this.jInternalFrameImportacionTipoDepreciacionEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDepreciacionEmpresa);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoDepreciacionEmpresa!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoDepreciacionEmpresa);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa);
				this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.setVisible(false);
				this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa);
					this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoDepreciacionEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoDepreciacionEmpresa);
					this.jInternalFrameImportacionTipoDepreciacionEmpresa.setVisible(false);
					this.jInternalFrameImportacionTipoDepreciacionEmpresa.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoDepreciacionEmpresa!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoDepreciacionEmpresa);
					this.jInternalFrameOrderByTipoDepreciacionEmpresa.setVisible(false);
					this.jInternalFrameOrderByTipoDepreciacionEmpresa.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoDepreciacionEmpresaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoDepreciacionEmpresaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipodepreciacionempresaReturnGeneral=new TipoDepreciacionEmpresaParameterReturnGeneral();
			
			this.tipodepreciacionempresaParameterGeneral=new TipoDepreciacionEmpresaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipodepreciacionempresaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoDepreciacionEmpresaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleActivoFijoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(DepreciacionActivoFijoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDepreciacionEmpresaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado(),this.tipodepreciacionempresaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDepreciacionEmpresaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado(),this.tipodepreciacionempresaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaDuplicarTipoDepreciacionEmpresa=true;
			this.isVisibilidadCeldaCopiarTipoDepreciacionEmpresa=true;
			this.isVisibilidadCeldaVerFormTipoDepreciacionEmpresa=true;
			this.isVisibilidadCeldaOrdenTipoDepreciacionEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaModificarTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaGuardarTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDepreciacionEmpresa=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoDepreciacionEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoDepreciacionEmpresa();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoDepreciacionEmpresa(false);
			
			this.setPermisosUsuarioTipoDepreciacionEmpresa();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado() && this.tipodepreciacionempresaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoDepreciacionEmpresaClasesRelacionadas();
			}
			
			if(this.tipodepreciacionempresaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoDepreciacionEmpresaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoDepreciacionEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoDepreciacionEmpresa();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoDepreciacionEmpresa();
			}
			
			if(!this.isPermisoBusquedaTipoDepreciacionEmpresa) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoDepreciacionEmpresa.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoDepreciacionEmpresa,this.isPermisoPaginacionMedioTipoDepreciacionEmpresa,this.isPermisoPaginacionTodoTipoDepreciacionEmpresa);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoDepreciacionEmpresaConstantesFunciones.getTiposSeleccionarTipoDepreciacionEmpresa());
				
				this.tiposColumnasSelect=TipoDepreciacionEmpresaConstantesFunciones.getTiposSeleccionarTipoDepreciacionEmpresa(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoDepreciacionEmpresa();				
				//this.tiposRelacionesSelect=TipoDepreciacionEmpresaConstantesFunciones.getTiposRelacionesTipoDepreciacionEmpresa(true);
				
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
			//if(!this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoDepreciacionEmpresa();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoDepreciacionEmpresa(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoDepreciacionEmpresa(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDepreciacionEmpresa() ;
			
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
			
			
			this.detalleactivofijoLogic=new DetalleActivoFijoLogic();
			this.depreciacionactivofijoLogic=new DepreciacionActivoFijoLogic(); 
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
				tipodepreciacionempresaImplementable= (TipoDepreciacionEmpresaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDepreciacionEmpresaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipodepreciacionempresaImplementableHome= (TipoDepreciacionEmpresaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDepreciacionEmpresaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipodepreciacionempresas= new ArrayList<TipoDepreciacionEmpresa>();
			this.tipodepreciacionempresasEliminados= new ArrayList<TipoDepreciacionEmpresa>();
						
			this.isEsNuevoTipoDepreciacionEmpresa=false;
			this.esParaAccionDesdeFormularioTipoDepreciacionEmpresa=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoDepreciacionEmpresa(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoDepreciacionEmpresa();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoDepreciacionEmpresaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoDepreciacionEmpresa("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoDepreciacionEmpresa(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoDepreciacionEmpresa();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoDepreciacionEmpresa();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoDepreciacionEmpresa.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoDepreciacionEmpresa.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoDepreciacionEmpresa.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoDepreciacionEmpresa(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoDepreciacionEmpresa: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoDepreciacionEmpresa() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoDepreciacionEmpresa")) {
				iIndex=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jTabbedPaneRelacionesTipoDepreciacionEmpresa.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jTabbedPaneRelacionesTipoDepreciacionEmpresa.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoDepreciacionEmpresa.getSelectedRow();	
				
				

				if(sTitle.equals("Depreciacion Activo Fijos")) {
					if(!DepreciacionActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoDepreciacionEmpresa();

						this.cargarParteTabPanelRelacionadaDepreciacionActivoFijo(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Detalle Activo Fijos")) {
					if(!DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoDepreciacionEmpresa();

						this.cargarParteTabPanelRelacionadaDetalleActivoFijo(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoDepreciacionEmpresa();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDepreciacionActivoFijo(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.cargarSessionConBeanSwingJInternalFrameDepreciacionActivoFijo(false,true,iIndex);
		this.jButtonDepreciacionActivoFijoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDepreciacionActivoFijo();

		//this.jTabbedPaneRelacionesTipoDepreciacionEmpresa.updateUI();
		//this.jTabbedPaneRelacionesTipoDepreciacionEmpresa.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoDepreciacionEmpresa.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaDetalleActivoFijo(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.cargarSessionConBeanSwingJInternalFrameDetalleActivoFijo(false,true,iIndex);
		this.jButtonDetalleActivoFijoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleActivoFijo();

		//this.jTabbedPaneRelacionesTipoDepreciacionEmpresa.updateUI();
		//this.jTabbedPaneRelacionesTipoDepreciacionEmpresa.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoDepreciacionEmpresa.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleActivoFijo")) {
				int row=this.jTableDatosTipoDepreciacionEmpresa.getSelectedRow();
				jButtonDetalleActivoFijoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("DepreciacionActivoFijo")) {
				int row=this.jTableDatosTipoDepreciacionEmpresa.getSelectedRow();
				jButtonDepreciacionActivoFijoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Activo Fijo")) {

					if(this.isTienePermisosDetalleActivoFijo && this.tipodepreciacionempresaConstantesFunciones.mostrarDetalleActivoFijoTipoDepreciacionEmpresa && !TipoDepreciacionEmpresaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Activo Fijos"+"("+DetalleActivoFijoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Activo Fijos");

						if(tipodepreciacionempresaConstantesFunciones.resaltarDetalleActivoFijoTipoDepreciacionEmpresa!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipodepreciacionempresaConstantesFunciones.resaltarDetalleActivoFijoTipoDepreciacionEmpresa);
						}

						jmenuItem.setEnabled(this.tipodepreciacionempresaConstantesFunciones.activarDetalleActivoFijoTipoDepreciacionEmpresa);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleActivoFijo"));

						

						this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jmenuDetalleTipoDepreciacionEmpresa.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Depreciacion Activo Fijo")) {

					if(this.isTienePermisosDepreciacionActivoFijo && this.tipodepreciacionempresaConstantesFunciones.mostrarDepreciacionActivoFijoTipoDepreciacionEmpresa && !TipoDepreciacionEmpresaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Depreciacion Activo Fijos"+"("+DepreciacionActivoFijoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Depreciacion Activo Fijos");

						if(tipodepreciacionempresaConstantesFunciones.resaltarDepreciacionActivoFijoTipoDepreciacionEmpresa!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipodepreciacionempresaConstantesFunciones.resaltarDepreciacionActivoFijoTipoDepreciacionEmpresa);
						}

						jmenuItem.setEnabled(this.tipodepreciacionempresaConstantesFunciones.activarDepreciacionActivoFijoTipoDepreciacionEmpresa);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DepreciacionActivoFijo"));

						

						this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jmenuDetalleTipoDepreciacionEmpresa.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoDepreciacionEmpresa(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoDepreciacionEmpresa(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoDepreciacionEmpresa(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoDepreciacionEmpresaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoDepreciacionEmpresa();
		
		this.cargarCombosFrameForeignKeyTipoDepreciacionEmpresa();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoDepreciacionEmpresa();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoDepreciacionEmpresa();
		}
	}
	
	
	
	public void jButtonNuevoTipoDepreciacionEmpresaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipodepreciacionempresaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
			
			
			if(jTableDatosTipoDepreciacionEmpresa.getRowCount()>=1) {
				jTableDatosTipoDepreciacionEmpresa.removeRowSelectionInterval(0, jTableDatosTipoDepreciacionEmpresa.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoDepreciacionEmpresa=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoDepreciacionEmpresa(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoDepreciacionEmpresa(true);			
			//this.tipodepreciacionempresa=new TipoDepreciacionEmpresa();
			//this.tipodepreciacionempresa.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDepreciacionEmpresa(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDepreciacionEmpresa() ;
			
			if(TipoDepreciacionEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDepreciacionEmpresa(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipodepreciacionempresa);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipodepreciacionempresa);				
			
			TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
			
			if(this.tipodepreciacionempresaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoDepreciacionEmpresa: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoDepreciacionEmpresaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoDepreciacionEmpresa> tipodepreciacionempresasSeleccionados=new ArrayList<TipoDepreciacionEmpresa>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoDepreciacionEmpresa.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoDepreciacionEmpresa.getSelectedRows().length;			
			}
			
			tipodepreciacionempresasSeleccionados=this.getTipoDepreciacionEmpresasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoDepreciacionEmpresa--;			
				//TipoDepreciacionEmpresa tipodepreciacionempresaAux= new TipoDepreciacionEmpresa();			
				//tipodepreciacionempresaAux.setId(this.iIdNuevoTipoDepreciacionEmpresa);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoDepreciacionEmpresa tipodepreciacionempresaOrigen=new TipoDepreciacionEmpresa();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoDepreciacionEmpresa tipodepreciacionempresaOrigen : tipodepreciacionempresasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoDepreciacionEmpresa.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipodepreciacionempresaOrigen =(TipoDepreciacionEmpresa) this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodepreciacionempresaOrigen =(TipoDepreciacionEmpresa) this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoDepreciacionEmpresa();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipodepreciacionempresa.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoDepreciacionEmpresa(tipodepreciacionempresaOrigen,this.tipodepreciacionempresa,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDepreciacionEmpresa(this.tipodepreciacionempresa);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().add(this.tipodepreciacionempresaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodepreciacionempresas.add(this.tipodepreciacionempresaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoDepreciacionEmpresa(false);
				
				this.jTableDatosTipoDepreciacionEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoDepreciacionEmpresa(), this.getIndiceNuevoTipoDepreciacionEmpresa());
				
				int iLastRow =  this.jTableDatosTipoDepreciacionEmpresa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDepreciacionEmpresa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDepreciacionEmpresa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDepreciacionEmpresa(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoDepreciacionEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoDepreciacionEmpresa> tipodepreciacionempresasSeleccionados=new ArrayList<TipoDepreciacionEmpresa>();									
		
			TipoDepreciacionEmpresa tipodepreciacionempresaOrigen=new TipoDepreciacionEmpresa();
			TipoDepreciacionEmpresa tipodepreciacionempresaDestino=new TipoDepreciacionEmpresa();
				
			tipodepreciacionempresasSeleccionados=this.getTipoDepreciacionEmpresasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoDepreciacionEmpresa.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipodepreciacionempresasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoDepreciacionEmpresa.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodepreciacionempresaOrigen =(TipoDepreciacionEmpresa) this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodepreciacionempresaOrigen =(TipoDepreciacionEmpresa) this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodepreciacionempresaDestino =(TipoDepreciacionEmpresa) this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodepreciacionempresaDestino =(TipoDepreciacionEmpresa) this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipodepreciacionempresaOrigen =tipodepreciacionempresasSeleccionados.get(0);
				tipodepreciacionempresaDestino =tipodepreciacionempresasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoDepreciacionEmpresa(tipodepreciacionempresaOrigen,tipodepreciacionempresaDestino,true,false);
				
				tipodepreciacionempresaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodepreciacionempresaDestino,tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodepreciacionempresaDestino,tipodepreciacionempresas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoDepreciacionEmpresa(false);
				
				//this.jTableDatosTipoDepreciacionEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoDepreciacionEmpresa(), this.getIndiceNuevoTipoDepreciacionEmpresa());
				
				int iLastRow =  this.jTableDatosTipoDepreciacionEmpresa.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDepreciacionEmpresa.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDepreciacionEmpresa.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDepreciacionEmpresa(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoDepreciacionEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoDepreciacionEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoDepreciacionEmpresa.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoDepreciacionEmpresa.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoDepreciacionEmpresa.setVisible(!isVisible);
			this.jPanelPaginacionTipoDepreciacionEmpresa.setVisible(!isVisible);
			this.jPanelAccionesTipoDepreciacionEmpresa.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoDepreciacionEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoDepreciacionEmpresa();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoDepreciacionEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoDepreciacionEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoDepreciacionEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoDepreciacionEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoDepreciacionEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoDepreciacionEmpresa();
			
			this.abrirFrameOrderByTipoDepreciacionEmpresa();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoDepreciacionEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoDepreciacionEmpresa();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoDepreciacionEmpresa(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDepreciacionEmpresa);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.isMaximum()) {
					this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.setSize(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.iWidthFormulario,this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.isMaximum()) {
						this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jContentPaneDetalleTipoDepreciacionEmpresa.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jTabbedPaneRelacionesTipoDepreciacionEmpresa.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jContentPaneDetalleTipoDepreciacionEmpresa.getWidth(),TipoDepreciacionEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jTabbedPaneRelacionesTipoDepreciacionEmpresa.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jContentPaneDetalleTipoDepreciacionEmpresa.getWidth(),TipoDepreciacionEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jTabbedPaneRelacionesTipoDepreciacionEmpresa.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jContentPaneDetalleTipoDepreciacionEmpresa.getWidth(),TipoDepreciacionEmpresaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DepreciacionActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDepreciacionActivoFijo();
					}

					if(DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleActivoFijo();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.setVisible(true);
	        this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoDepreciacionEmpresa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoDepreciacionEmpresa==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoDepreciacionEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDepreciacionEmpresa,false,this);
				} else {
					this.jInternalFrameOrderByTipoDepreciacionEmpresa=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDepreciacionEmpresa,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoDepreciacionEmpresa);
				this.jInternalFrameOrderByTipoDepreciacionEmpresa.setVisible(false);
				this.jInternalFrameOrderByTipoDepreciacionEmpresa.setSelected(false);
				
				this.jInternalFrameOrderByTipoDepreciacionEmpresa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDepreciacionEmpresa"));
				
				this.inicializarActualizarBindingTablaOrderByTipoDepreciacionEmpresa();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoDepreciacionEmpresa() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoDepreciacionEmpresa==null) {
				
				this.jInternalFrameImportacionTipoDepreciacionEmpresa=new ImportacionJInternalFrame(TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDepreciacionEmpresa);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoDepreciacionEmpresa);
				this.jInternalFrameImportacionTipoDepreciacionEmpresa.setVisible(false);
				this.jInternalFrameImportacionTipoDepreciacionEmpresa.setSelected(false);


				this.jInternalFrameImportacionTipoDepreciacionEmpresa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDepreciacionEmpresa"));
				this.jInternalFrameImportacionTipoDepreciacionEmpresa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDepreciacionEmpresa"));
				this.jInternalFrameImportacionTipoDepreciacionEmpresa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDepreciacionEmpresa"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoDepreciacionEmpresa() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa==null) {
				this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa=new ReporteDinamicoJInternalFrame(TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa);
				this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDepreciacionEmpresa"));
				this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDepreciacionEmpresa"));
				this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDepreciacionEmpresa"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDepreciacionEmpresa();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDepreciacionActivoFijo() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDepreciacionActivoFijo.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jContentPaneDetalleTipoDepreciacionEmpresa.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDepreciacionActivoFijo.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDepreciacionActivoFijo.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDepreciacionActivoFijo.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaDetalleActivoFijo() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jContentPaneDetalleTipoDepreciacionEmpresa.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoDepreciacionEmpresa() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDepreciacionEmpresa);
			
	       	this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.setVisible(false);
	        this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.dispose();
			//this.jInternalFrameDetalleFormTipoDepreciacionEmpresa=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoDepreciacionEmpresa() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoDepreciacionEmpresa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoDepreciacionEmpresa.setVisible(true);
	        this.jInternalFrameImportacionTipoDepreciacionEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoDepreciacionEmpresa() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoDepreciacionEmpresa.setVisible(true);
	        this.jInternalFrameOrderByTipoDepreciacionEmpresa.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoDepreciacionEmpresa() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoDepreciacionEmpresa.setVisible(false);
	        this.jInternalFrameOrderByTipoDepreciacionEmpresa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoDepreciacionEmpresa() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoDepreciacionEmpresa() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoDepreciacionEmpresa.setVisible(false);
	        this.jInternalFrameImportacionTipoDepreciacionEmpresa.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoDepreciacionEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoDepreciacionEmpresa(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoDepreciacionEmpresa(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDepreciacionEmpresa.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoDepreciacionEmpresa(true);
			//this.isEsNuevoTipoDepreciacionEmpresa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoDepreciacionEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDepreciacionEmpresa(false) ;
			
			if(tipodepreciacionempresaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.getEsGuardarRelacionado() && DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleActivoFijoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoSessionBean.getEsGuardarRelacionado() && DepreciacionActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDepreciacionActivoFijoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoDepreciacionEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDepreciacionEmpresa(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDepreciacionEmpresa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoDepreciacionEmpresaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoDepreciacionEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoDepreciacionEmpresa(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDepreciacionEmpresa.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoDepreciacionEmpresa(true);
			//this.isEsNuevoTipoDepreciacionEmpresa=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipodepreciacionempresa.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoDepreciacionEmpresa("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoDepreciacionEmpresa(false) ;
			
			if(TipoDepreciacionEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDepreciacionEmpresa(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDepreciacionEmpresa(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoDepreciacionEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoDepreciacionEmpresa(false);
			
			//if(!this.isEsNuevoTipoDepreciacionEmpresa) {								
				int intSelectedRow = this.jTableDatosTipoDepreciacionEmpresa.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoDepreciacionEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoDepreciacionEmpresa(this.tipodepreciacionempresa,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDepreciacionEmpresa(this.tipodepreciacionempresa);
				
			}
			
			if(this.permiteMantenimiento(this.tipodepreciacionempresa)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoDepreciacionEmpresa=true;
					this.inicializarActualizarBindingTablaTipoDepreciacionEmpresa(false);
					this.isEsNuevoTipoDepreciacionEmpresa=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoDepreciacionEmpresa=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoDepreciacionEmpresa=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDepreciacionEmpresa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDepreciacionEmpresa(false);
				
				this.habilitarDeshabilitarControlesTipoDepreciacionEmpresa(false);
			
												
				
				if(TipoDepreciacionEmpresaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoDepreciacionEmpresa();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoDepreciacionEmpresaActionPerformed(evt,tipodepreciacionempresaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoDepreciacionEmpresa(this.tipodepreciacionempresa,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoDepreciacionEmpresa.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipodepreciacionempresaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipodepreciacionempresa.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoDepreciacionEmpresa.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDepreciacionEmpresa.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoDepreciacionEmpresaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoDepreciacionEmpresa.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
				this.tipodepreciacionempresa.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
				this.tipodepreciacionempresa.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipodepreciacionempresa)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoDepreciacionEmpresaModel) this.jTableDatosTipoDepreciacionEmpresa.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoDepreciacionEmpresa=true;
				this.inicializarActualizarBindingTablaTipoDepreciacionEmpresa(false);
				this.isEsNuevoTipoDepreciacionEmpresa=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDepreciacionEmpresa(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDepreciacionEmpresa(false);
				
				this.habilitarDeshabilitarControlesTipoDepreciacionEmpresa(false);
				
				
				
				if(TipoDepreciacionEmpresaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoDepreciacionEmpresa();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoDepreciacionEmpresaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoDepreciacionEmpresa.getRowCount()>=1) {
				jTableDatosTipoDepreciacionEmpresa.removeRowSelectionInterval(0, jTableDatosTipoDepreciacionEmpresa.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoDepreciacionEmpresa(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoDepreciacionEmpresa(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDepreciacionEmpresa(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDepreciacionEmpresa(false) ;
			
			this.isEsNuevoTipoDepreciacionEmpresa=false;
			
			if(TipoDepreciacionEmpresaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoDepreciacionEmpresa();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoDepreciacionEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoDepreciacionEmpresa(false);
				
				//SI ES MANUAL
				if(TipoDepreciacionEmpresaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoDepreciacionEmpresa();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoDepreciacionEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoDepreciacionEmpresa--;			
			//TipoDepreciacionEmpresa tipodepreciacionempresaAux= new TipoDepreciacionEmpresa();			
			//tipodepreciacionempresaAux.setId(this.iIdNuevoTipoDepreciacionEmpresa);
			
			if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoDepreciacionEmpresa();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoDepreciacionEmpresa(this.tipodepreciacionempresa);
			
			this.tipodepreciacionempresa.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().add(this.tipodepreciacionempresaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipodepreciacionempresas.add(this.tipodepreciacionempresaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoDepreciacionEmpresa(false);
			
			this.jTableDatosTipoDepreciacionEmpresa.setRowSelectionInterval(this.getIndiceNuevoTipoDepreciacionEmpresa(), this.getIndiceNuevoTipoDepreciacionEmpresa());
			
			int iLastRow =  this.jTableDatosTipoDepreciacionEmpresa.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoDepreciacionEmpresa.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoDepreciacionEmpresa.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoDepreciacionEmpresa(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoDepreciacionEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoDepreciacionEmpresa(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDepreciacionEmpresa(false);
			
			//SI ES MANUAL
			if(TipoDepreciacionEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDepreciacionEmpresa();
			}
			
			//this.abrirFrameTreeTipoDepreciacionEmpresa();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoDepreciacionEmpresaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Depreciacion EmpresaES ?", "MANTENIMIENTO DE Tipo Depreciacion Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoDepreciacionEmpresa.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoDepreciacionEmpresa();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipodepreciacionempresaReturnGeneral=tipodepreciacionempresaLogic.procesarImportacionTipoDepreciacionEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipodepreciacionempresaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoDepreciacionEmpresaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoDepreciacionEmpresaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoDepreciacionEmpresa.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoDepreciacionEmpresa.setFileImportacion(this.jInternalFrameImportacionTipoDepreciacionEmpresa.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoDepreciacionEmpresa.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoDepreciacionEmpresa.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoDepreciacionEmpresa.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoDepreciacionEmpresa.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoDepreciacionEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoDepreciacionEmpresa> tipodepreciacionempresasSeleccionados=new ArrayList<TipoDepreciacionEmpresa>();		

		tipodepreciacionempresasSeleccionados=this.getTipoDepreciacionEmpresasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoDepreciacionEmpresaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoDepreciacionEmpresaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoDepreciacionEmpresas("Todos",tipodepreciacionempresasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Depreciacion Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDepreciacionEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDepreciacionEmpresaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDepreciacionEmpresaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESLINEARECTA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_LineaRecta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_LineaRecta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_LineaRecta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_LineaRecta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESMENSUAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mensual_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mensual_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mensual_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mensual_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoDepreciacionEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoDepreciacionEmpresaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoDepreciacionEmpresaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESLINEARECTA:
					sNombreCampoCategoria="es_linea_recta";
					break;

				case TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESMENSUAL:
					sNombreCampoCategoria="es_mensual";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoDepreciacionEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoDepreciacionEmpresaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoDepreciacionEmpresaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESLINEARECTA:
					sNombreCampoCategoriaValor="es_linea_recta";
					break;

				case TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESMENSUAL:
					sNombreCampoCategoriaValor="es_mensual";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDepreciacionEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoDepreciacionEmpresaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoDepreciacionEmpresaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESLINEARECTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Linea Recta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_linea_recta");
					break;

				case TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESMENSUAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Mensual",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_mensual");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoDepreciacionEmpresaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoDepreciacionEmpresa> tipodepreciacionempresasSeleccionados=new ArrayList<TipoDepreciacionEmpresa>();		
		
		tipodepreciacionempresasSeleccionados=this.getTipoDepreciacionEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodepreciacionempresa";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoDepreciacionEmpresas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoDepreciacionEmpresaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDepreciacionEmpresaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoDepreciacionEmpresa tipodepreciacionempresa:tipodepreciacionempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodepreciacionempresa.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDepreciacionEmpresaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDepreciacionEmpresaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoDepreciacionEmpresa tipodepreciacionempresa:tipodepreciacionempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodepreciacionempresa.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDepreciacionEmpresaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDepreciacionEmpresaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoDepreciacionEmpresa tipodepreciacionempresa:tipodepreciacionempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodepreciacionempresa.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESLINEARECTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESLINEARECTA);
					iRow++;

					for(TipoDepreciacionEmpresa tipodepreciacionempresa:tipodepreciacionempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodepreciacionempresa.getes_linea_recta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESMENSUAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESMENSUAL);
					iRow++;

					for(TipoDepreciacionEmpresa tipodepreciacionempresa:tipodepreciacionempresasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodepreciacionempresa.getes_mensual());
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
			//	this.getFilaCabeceraExportarExcelTipoDepreciacionEmpresa(row);				
			//	iRow++;
			//}				
			
			//for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:tipodepreciacionempresasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoDepreciacionEmpresa(tipodepreciacionempresaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Depreciacion Empresa",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipodepreciacionempresaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDepreciacionEmpresa(false);
			
			//SI ES MANUAL
			if(TipoDepreciacionEmpresaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDepreciacionEmpresa();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoDepreciacionEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDepreciacionEmpresa(false);
			
			//SI ES MANUAL
			if(TipoDepreciacionEmpresaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDepreciacionEmpresa();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoDepreciacionEmpresaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDepreciacionEmpresa(false);
			
			//SI ES MANUAL
			if(TipoDepreciacionEmpresaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDepreciacionEmpresa();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoDepreciacionEmpresa() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoDepreciacionEmpresa.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoDepreciacionEmpresa.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoDepreciacionEmpresa.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoDepreciacionEmpresa.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoDepreciacionEmpresa.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoDepreciacionEmpresa.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoDepreciacionEmpresa.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoDepreciacionEmpresa(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoDepreciacionEmpresa(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoDepreciacionEmpresa(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoDepreciacionEmpresa(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoDepreciacionEmpresa(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoDepreciacionEmpresa(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDepreciacionEmpresa(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoDepreciacionEmpresa(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoDepreciacionEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoDepreciacionEmpresaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoDepreciacionEmpresa() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoDepreciacionEmpresa();
		
		this.inicializarActualizarBindingBotonesManualTipoDepreciacionEmpresa(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDepreciacionEmpresa();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDepreciacionEmpresa() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDepreciacionEmpresa(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDepreciacionEmpresa(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoDepreciacionEmpresa.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoDepreciacionEmpresa.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoDepreciacionEmpresa.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jCheckBoxPostAccionNuevoTipoDepreciacionEmpresa.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jCheckBoxPostAccionSinCerrarTipoDepreciacionEmpresa.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jCheckBoxPostAccionSinMensajeTipoDepreciacionEmpresa.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoDepreciacionEmpresa.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoDepreciacionEmpresa.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoDepreciacionEmpresa.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) {
				this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jCheckBoxPostAccionNuevoTipoDepreciacionEmpresa.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jCheckBoxPostAccionSinCerrarTipoDepreciacionEmpresa.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jCheckBoxPostAccionSinMensajeTipoDepreciacionEmpresa.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoDepreciacionEmpresa.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoDepreciacionEmpresa.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jComboBoxTiposAccionesFormularioTipoDepreciacionEmpresa.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoDepreciacionEmpresa.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoDepreciacionEmpresa.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoDepreciacionEmpresa.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoDepreciacionEmpresa.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoDepreciacionEmpresa.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoDepreciacionEmpresa.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoDepreciacionEmpresa.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoDepreciacionEmpresa(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoDepreciacionEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDepreciacionEmpresa(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoDepreciacionEmpresa() throws Exception {
		try	{
			if(TipoDepreciacionEmpresaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDepreciacionEmpresa();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDepreciacionEmpresa() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jComboBoxTiposAccionesFormularioTipoDepreciacionEmpresa.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jComboBoxTiposAccionesFormularioTipoDepreciacionEmpresa.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDepreciacionEmpresa() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoDepreciacionEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoDepreciacionEmpresa.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoDepreciacionEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoDepreciacionEmpresa.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoDepreciacionEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoDepreciacionEmpresa.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoDepreciacionEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoDepreciacionEmpresa.addItem(reporte);
			}
			
			
			if(!this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoDepreciacionEmpresa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoDepreciacionEmpresa.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoDepreciacionEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoDepreciacionEmpresa.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoDepreciacionEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoDepreciacionEmpresa.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jComboBoxTiposAccionesFormularioTipoDepreciacionEmpresa.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jComboBoxTiposAccionesFormularioTipoDepreciacionEmpresa.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoDepreciacionEmpresa.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoDepreciacionEmpresa.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoDepreciacionEmpresa.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDepreciacionEmpresa();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDepreciacionEmpresa() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa!=null) {
				this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa!=null) {
				this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoDepreciacionEmpresa()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoDepreciacionEmpresa(Boolean esInicializar) throws Exception {				
		if(TipoDepreciacionEmpresaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDepreciacionEmpresa();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoDepreciacionEmpresa() throws Exception {
		this.inicializarActualizarBindingTablaTipoDepreciacionEmpresa(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoDepreciacionEmpresa() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoDepreciacionEmpresa.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoDepreciacionEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDepreciacionEmpresa.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoDepreciacionEmpresaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoDepreciacionEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDepreciacionEmpresa.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoDepreciacionEmpresaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoDepreciacionEmpresaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDepreciacionEmpresaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoDepreciacionEmpresaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoDepreciacionEmpresa.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDepreciacionEmpresa.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoDepreciacionEmpresaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoDepreciacionEmpresa.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoDepreciacionEmpresa(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipodepreciacionempresas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoDepreciacionEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoDepreciacionEmpresa.setModel(new TipoDepreciacionEmpresaModel(this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoDepreciacionEmpresa.setModel(new TipoDepreciacionEmpresaModel(this.tipodepreciacionempresas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoDepreciacionEmpresa!=null && this.jInternalFrameOrderByTipoDepreciacionEmpresa.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoDepreciacionEmpresa();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoDepreciacionEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDepreciacionEmpresa,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoDepreciacionEmpresaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO,tipodepreciacionempresaConstantesFunciones.resaltarSeleccionarTipoDepreciacionEmpresa,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoDepreciacionEmpresaConstantesFunciones.SCLASSWEBTITULO,tipodepreciacionempresaConstantesFunciones.resaltarSeleccionarTipoDepreciacionEmpresa,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoDepreciacionEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDepreciacionEmpresa,TipoDepreciacionEmpresaConstantesFunciones.LABEL_ID));

		if(this.tipodepreciacionempresaConstantesFunciones.mostraridTipoDepreciacionEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDepreciacionEmpresaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipodepreciacionempresaConstantesFunciones.resaltaridTipoDepreciacionEmpresa,this.tipodepreciacionempresaConstantesFunciones.activaridTipoDepreciacionEmpresa,this,true,"idTipoDepreciacionEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodepreciacionempresaConstantesFunciones.resaltaridTipoDepreciacionEmpresa,this.tipodepreciacionempresaConstantesFunciones.activaridTipoDepreciacionEmpresa,this,true,"idTipoDepreciacionEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDepreciacionEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDepreciacionEmpresa,TipoDepreciacionEmpresaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipodepreciacionempresaConstantesFunciones.mostrarid_empresaTipoDepreciacionEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDepreciacionEmpresaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipodepreciacionempresaConstantesFunciones.resaltarid_empresaTipoDepreciacionEmpresa,this,this.tipodepreciacionempresaConstantesFunciones.activarid_empresaTipoDepreciacionEmpresa));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipodepreciacionempresaConstantesFunciones.resaltarid_empresaTipoDepreciacionEmpresa,this,this.tipodepreciacionempresaConstantesFunciones.activarid_empresaTipoDepreciacionEmpresa,false,"id_empresaTipoDepreciacionEmpresa","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDepreciacionEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDepreciacionEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDepreciacionEmpresa,TipoDepreciacionEmpresaConstantesFunciones.LABEL_CODIGO));

		if(this.tipodepreciacionempresaConstantesFunciones.mostrarcodigoTipoDepreciacionEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDepreciacionEmpresaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipodepreciacionempresaConstantesFunciones.resaltarcodigoTipoDepreciacionEmpresa,this.tipodepreciacionempresaConstantesFunciones.activarcodigoTipoDepreciacionEmpresa,this,true,"codigoTipoDepreciacionEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodepreciacionempresaConstantesFunciones.resaltarcodigoTipoDepreciacionEmpresa,this.tipodepreciacionempresaConstantesFunciones.activarcodigoTipoDepreciacionEmpresa,this,true,"codigoTipoDepreciacionEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDepreciacionEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDepreciacionEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDepreciacionEmpresa,TipoDepreciacionEmpresaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipodepreciacionempresaConstantesFunciones.mostrarnombreTipoDepreciacionEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDepreciacionEmpresaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipodepreciacionempresaConstantesFunciones.resaltarnombreTipoDepreciacionEmpresa,this.tipodepreciacionempresaConstantesFunciones.activarnombreTipoDepreciacionEmpresa,this,true,"nombreTipoDepreciacionEmpresa","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodepreciacionempresaConstantesFunciones.resaltarnombreTipoDepreciacionEmpresa,this.tipodepreciacionempresaConstantesFunciones.activarnombreTipoDepreciacionEmpresa,this,true,"nombreTipoDepreciacionEmpresa","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDepreciacionEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDepreciacionEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDepreciacionEmpresa,TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESLINEARECTA));

		if(this.tipodepreciacionempresaConstantesFunciones.mostrares_linea_rectaTipoDepreciacionEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESLINEARECTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tipodepreciacionempresaConstantesFunciones.resaltares_linea_rectaTipoDepreciacionEmpresa,this.tipodepreciacionempresaConstantesFunciones.activares_linea_rectaTipoDepreciacionEmpresa));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tipodepreciacionempresaConstantesFunciones.resaltares_linea_rectaTipoDepreciacionEmpresa,this.tipodepreciacionempresaConstantesFunciones.activares_linea_rectaTipoDepreciacionEmpresa,this,true,"es_linea_rectaTipoDepreciacionEmpresa","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoDepreciacionEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDepreciacionEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDepreciacionEmpresa,TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESMENSUAL));

		if(this.tipodepreciacionempresaConstantesFunciones.mostrares_mensualTipoDepreciacionEmpresa && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESMENSUAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tipodepreciacionempresaConstantesFunciones.resaltares_mensualTipoDepreciacionEmpresa,this.tipodepreciacionempresaConstantesFunciones.activares_mensualTipoDepreciacionEmpresa));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tipodepreciacionempresaConstantesFunciones.resaltares_mensualTipoDepreciacionEmpresa,this.tipodepreciacionempresaConstantesFunciones.activares_mensualTipoDepreciacionEmpresa,this,true,"es_mensualTipoDepreciacionEmpresa","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoDepreciacionEmpresaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleActivoFijo && this.tipodepreciacionempresaConstantesFunciones.mostrarDetalleActivoFijoTipoDepreciacionEmpresa && !TipoDepreciacionEmpresaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Activo Fijos");
				tableColumn.setHeaderValue("Detalle Activo Fijos");
				tableColumn.setCellRenderer(new DetalleActivoFijoTableCell(tipodepreciacionempresaConstantesFunciones.resaltarDetalleActivoFijoTipoDepreciacionEmpresa,this,this.tipodepreciacionempresaConstantesFunciones.activarDetalleActivoFijoTipoDepreciacionEmpresa));
				tableColumn.setCellEditor(new DetalleActivoFijoTableCell(tipodepreciacionempresaConstantesFunciones.resaltarDetalleActivoFijoTipoDepreciacionEmpresa,this,this.tipodepreciacionempresaConstantesFunciones.activarDetalleActivoFijoTipoDepreciacionEmpresa));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoDepreciacionEmpresa.addColumn(tableColumn);
			}

			if(this.isTienePermisosDepreciacionActivoFijo && this.tipodepreciacionempresaConstantesFunciones.mostrarDepreciacionActivoFijoTipoDepreciacionEmpresa && !TipoDepreciacionEmpresaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Depreciacion Activo Fijos");
				tableColumn.setHeaderValue("Depreciacion Activo Fijos");
				tableColumn.setCellRenderer(new DepreciacionActivoFijoTableCell(tipodepreciacionempresaConstantesFunciones.resaltarDepreciacionActivoFijoTipoDepreciacionEmpresa,this,this.tipodepreciacionempresaConstantesFunciones.activarDepreciacionActivoFijoTipoDepreciacionEmpresa));
				tableColumn.setCellEditor(new DepreciacionActivoFijoTableCell(tipodepreciacionempresaConstantesFunciones.resaltarDepreciacionActivoFijoTipoDepreciacionEmpresa,this,this.tipodepreciacionempresaConstantesFunciones.activarDepreciacionActivoFijoTipoDepreciacionEmpresa));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoDepreciacionEmpresa.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDepreciacionEmpresa.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDepreciacionEmpresa.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoDepreciacionEmpresa && this.isPermisoGuardarCambiosTipoDepreciacionEmpresa) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoDepreciacionEmpresa.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipodepreciacionempresaSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosTipoDepreciacionEmpresa.addColumn(tableColumn);
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
			
			this.jTableDatosTipoDepreciacionEmpresa.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDepreciacionEmpresa && this.isPermisoGuardarCambiosTipoDepreciacionEmpresa) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipodepreciacionempresaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDepreciacionEmpresa && this.isPermisoGuardarCambiosTipoDepreciacionEmpresa) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoDepreciacionEmpresa.moveColumn(this.jTableDatosTipoDepreciacionEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoDepreciacionEmpresa.moveColumn(this.jTableDatosTipoDepreciacionEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipodepreciacionempresaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoDepreciacionEmpresa.moveColumn(this.jTableDatosTipoDepreciacionEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoDepreciacionEmpresa.moveColumn(this.jTableDatosTipoDepreciacionEmpresa.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoDepreciacionEmpresa.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoDepreciacionEmpresa.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoDepreciacionEmpresa,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoDepreciacionEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoDepreciacionEmpresa.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoDepreciacionEmpresa.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoDepreciacionEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoDepreciacionEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoDepreciacionEmpresa.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoDepreciacionEmpresa.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoDepreciacionEmpresa.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipodepreciacionempresas.size()-1;
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
		//this.jTableDatosTipoDepreciacionEmpresa.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoDepreciacionEmpresa.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoDepreciacionEmpresa();
			
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
				
				//this.isEsNuevoTipoDepreciacionEmpresa=false;
					
				TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
			
				if(this.tipodepreciacionempresaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDepreciacionEmpresa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDepreciacionEmpresa.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipodepreciacionempresa.getsType().equals("DUPLICADO")
				   || this.tipodepreciacionempresa.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoDepreciacionEmpresa=true;
				
				} else {
					this.isEsNuevoTipoDepreciacionEmpresa=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipodepreciacionempresa.getId()>=0 && !this.tipodepreciacionempresa.getIsNew()) {						
						this.isEsNuevoTipoDepreciacionEmpresa=false;
						
					} else {
						this.isEsNuevoTipoDepreciacionEmpresa=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoDepreciacionEmpresa(esRelaciones);						
				
				this.seleccionarTipoDepreciacionEmpresa(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipodepreciacionempresa.getId()<0) {
					this.isEsNuevoTipoDepreciacionEmpresa=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoDepreciacionEmpresa(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoDepreciacionEmpresa(evt,rowIndex);
				}	
				
				if(this.tipodepreciacionempresaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoDepreciacionEmpresa: " + this.dDif); 
					}
				}								
				
				TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoDepreciacionEmpresa(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipodepreciacionempresa)) {
					if(this.tipodepreciacionempresa.getId()>0) {
						this.tipodepreciacionempresa.setIsDeleted(true);
						
						this.tipodepreciacionempresasEliminados.add(this.tipodepreciacionempresa);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().remove(this.tipodepreciacionempresa);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodepreciacionempresas.remove(this.tipodepreciacionempresa);				
					}
					
					
					((TipoDepreciacionEmpresaModel) this.jTableDatosTipoDepreciacionEmpresa.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDepreciacionEmpresa(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoDepreciacionEmpresa(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoDepreciacionEmpresa) {
			
			if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDepreciacionEmpresa.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDepreciacionEmpresa.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoDepreciacionEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoDepreciacionEmpresa(this.tipodepreciacionempresa);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipodepreciacionempresaConstantesFunciones.cargarid_empresaTipoDepreciacionEmpresa || this.tipodepreciacionempresaConstantesFunciones.event_dependid_empresaTipoDepreciacionEmpresa) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipodepreciacionempresa.getid_empresa());
									//this.inicializarActualizarBindingTipoDepreciacionEmpresa(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipodepreciacionempresa.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipodepreciacionempresa.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipodepreciacionempresa.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoDepreciacionEmpresa("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoDepreciacionEmpresa(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDepreciacionEmpresa() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDepreciacionEmpresa(TipoDepreciacionEmpresa tipodepreciacionempresa) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoDepreciacionEmpresa(tipodepreciacionempresa,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDepreciacionEmpresa(TipoDepreciacionEmpresa tipodepreciacionempresa,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoDepreciacionEmpresa(tipodepreciacionempresa);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoDepreciacionEmpresa(tipodepreciacionempresa,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoDepreciacionEmpresa(tipodepreciacionempresa);
	}
	
	public void setVariablesObjetoActualToFormularioTipoDepreciacionEmpresa(TipoDepreciacionEmpresa tipodepreciacionempresa) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jLabelidTipoDepreciacionEmpresa.setText(tipodepreciacionempresa.getId().toString());
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jTextFieldcodigoTipoDepreciacionEmpresa.setText(tipodepreciacionempresa.getcodigo());
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jTextAreanombreTipoDepreciacionEmpresa.setText(tipodepreciacionempresa.getnombre());
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jCheckBoxes_linea_rectaTipoDepreciacionEmpresa.setSelected(tipodepreciacionempresa.getes_linea_recta());
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jCheckBoxes_mensualTipoDepreciacionEmpresa.setSelected(tipodepreciacionempresa.getes_mensual());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoDepreciacionEmpresa tipodepreciacionempresaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipodepreciacionempresaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoDepreciacionEmpresa tipodepreciacionempresaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipodepreciacionempresaLocal=this.tipodepreciacionempresa;
			} else {
				tipodepreciacionempresaLocal=this.tipodepreciacionempresaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipodepreciacionempresaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoDepreciacionEmpresa(tipodepreciacionempresaLocal,true);
					
					if(tipodepreciacionempresaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipodepreciacionempresaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipodepreciacionempresaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoDepreciacionEmpresa(TipoDepreciacionEmpresa tipodepreciacionempresa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDepreciacionEmpresa(tipodepreciacionempresa,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDepreciacionEmpresa(tipodepreciacionempresa);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDepreciacionEmpresa(TipoDepreciacionEmpresa tipodepreciacionempresa,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDepreciacionEmpresa(tipodepreciacionempresa,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDepreciacionEmpresa(TipoDepreciacionEmpresa tipodepreciacionempresa,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jLabelidTipoDepreciacionEmpresa.getText()==null || this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jLabelidTipoDepreciacionEmpresa.getText()=="" || this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jLabelidTipoDepreciacionEmpresa.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jLabelidTipoDepreciacionEmpresa.setText("0");
			}

			if(conColumnasBase) {tipodepreciacionempresa.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jLabelidTipoDepreciacionEmpresa.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDepreciacionEmpresaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jLabelIdTipoDepreciacionEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodepreciacionempresa.setcodigo(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jTextFieldcodigoTipoDepreciacionEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDepreciacionEmpresaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jLabelcodigoTipoDepreciacionEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodepreciacionempresa.setnombre(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jTextAreanombreTipoDepreciacionEmpresa.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDepreciacionEmpresaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jLabelnombreTipoDepreciacionEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodepreciacionempresa.setes_linea_recta(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jCheckBoxes_linea_rectaTipoDepreciacionEmpresa.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESLINEARECTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jLabeles_linea_rectaTipoDepreciacionEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodepreciacionempresa.setes_mensual(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jCheckBoxes_mensualTipoDepreciacionEmpresa.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESMENSUAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jLabeles_mensualTipoDepreciacionEmpresa,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDepreciacionEmpresa(TipoDepreciacionEmpresa tipodepreciacionempresaBean,TipoDepreciacionEmpresa tipodepreciacionempresa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoDepreciacionEmpresa(TipoDepreciacionEmpresa tipodepreciacionempresaOrigen,TipoDepreciacionEmpresa tipodepreciacionempresa,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodepreciacionempresaOrigen.getId()!=null && !tipodepreciacionempresaOrigen.getId().equals(0L))) {tipodepreciacionempresa.setId(tipodepreciacionempresaOrigen.getId());}}
			if(conDefault || (!conDefault && tipodepreciacionempresaOrigen.getcodigo()!=null && !tipodepreciacionempresaOrigen.getcodigo().equals(""))) {tipodepreciacionempresa.setcodigo(tipodepreciacionempresaOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipodepreciacionempresaOrigen.getnombre()!=null && !tipodepreciacionempresaOrigen.getnombre().equals(""))) {tipodepreciacionempresa.setnombre(tipodepreciacionempresaOrigen.getnombre());}
			if(conDefault || (!conDefault && tipodepreciacionempresaOrigen.getes_linea_recta()!=null && !tipodepreciacionempresaOrigen.getes_linea_recta().equals(false))) {tipodepreciacionempresa.setes_linea_recta(tipodepreciacionempresaOrigen.getes_linea_recta());}
			if(conDefault || (!conDefault && tipodepreciacionempresaOrigen.getes_mensual()!=null && !tipodepreciacionempresaOrigen.getes_mensual().equals(false))) {tipodepreciacionempresa.setes_mensual(tipodepreciacionempresaOrigen.getes_mensual());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDepreciacionEmpresa(TipoDepreciacionEmpresa tipodepreciacionempresa) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jLabelidTipoDepreciacionEmpresa.setText(tipodepreciacionempresa.getId().toString());
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jTextFieldcodigoTipoDepreciacionEmpresa.setText(tipodepreciacionempresa.getcodigo());
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jTextAreanombreTipoDepreciacionEmpresa.setText(tipodepreciacionempresa.getnombre());
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jCheckBoxes_linea_rectaTipoDepreciacionEmpresa.setSelected(tipodepreciacionempresa.getes_linea_recta());
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jCheckBoxes_mensualTipoDepreciacionEmpresa.setSelected(tipodepreciacionempresa.getes_mensual());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDepreciacionEmpresa(TipoDepreciacionEmpresaBean tipodepreciacionempresaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jLabelidTipoDepreciacionEmpresa.setText(tipodepreciacionempresaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jTextFieldcodigoTipoDepreciacionEmpresa.setText(tipodepreciacionempresaBean.getcodigo());
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jTextAreanombreTipoDepreciacionEmpresa.setText(tipodepreciacionempresaBean.getnombre());
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jCheckBoxes_linea_rectaTipoDepreciacionEmpresa.setSelected(tipodepreciacionempresaBean.getes_linea_recta());
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jCheckBoxes_mensualTipoDepreciacionEmpresa.setSelected(tipodepreciacionempresaBean.getes_mensual());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoDepreciacionEmpresa(TipoDepreciacionEmpresaParameterReturnGeneral tipodepreciacionempresaReturnGeneral,TipoDepreciacionEmpresaBean tipodepreciacionempresaBean,Boolean conDefault) throws Exception { 
		try {
			TipoDepreciacionEmpresa tipodepreciacionempresaLocal=new TipoDepreciacionEmpresa();
			
			tipodepreciacionempresaLocal=tipodepreciacionempresaReturnGeneral.getTipoDepreciacionEmpresa();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodepreciacionempresaLocal.getId()!=null && !tipodepreciacionempresaLocal.getId().equals(0L))) {tipodepreciacionempresaBean.setId(tipodepreciacionempresaLocal.getId());}}
			if(conDefault || (!conDefault && tipodepreciacionempresaLocal.getcodigo()!=null && !tipodepreciacionempresaLocal.getcodigo().equals(""))) {tipodepreciacionempresaBean.setcodigo(tipodepreciacionempresaLocal.getcodigo());}
			if(conDefault || (!conDefault && tipodepreciacionempresaLocal.getnombre()!=null && !tipodepreciacionempresaLocal.getnombre().equals(""))) {tipodepreciacionempresaBean.setnombre(tipodepreciacionempresaLocal.getnombre());}
			if(conDefault || (!conDefault && tipodepreciacionempresaLocal.getes_linea_recta()!=null && !tipodepreciacionempresaLocal.getes_linea_recta().equals(false))) {tipodepreciacionempresaBean.setes_linea_recta(tipodepreciacionempresaLocal.getes_linea_recta());}
			if(conDefault || (!conDefault && tipodepreciacionempresaLocal.getes_mensual()!=null && !tipodepreciacionempresaLocal.getes_mensual().equals(false))) {tipodepreciacionempresaBean.setes_mensual(tipodepreciacionempresaLocal.getes_mensual());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoDepreciacionEmpresaGenerico(Long idTipoDepreciacionEmpresaSeleccionado,JComboBox jComboBoxTipoDepreciacionEmpresa,List<TipoDepreciacionEmpresa> tipodepreciacionempresasLocal)throws Exception {
		try {
			TipoDepreciacionEmpresa  tipodepreciacionempresaTemp=null;

			for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:tipodepreciacionempresasLocal) {
				if(tipodepreciacionempresaAux.getId()!=null && tipodepreciacionempresaAux.getId().equals(idTipoDepreciacionEmpresaSeleccionado)) {
					tipodepreciacionempresaTemp=tipodepreciacionempresaAux;
					break;
				}
			}

			jComboBoxTipoDepreciacionEmpresa.setSelectedItem(tipodepreciacionempresaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoDepreciacionEmpresaGenerico(JComboBox jComboBoxTipoDepreciacionEmpresa,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoDepreciacionEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDepreciacionEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoDepreciacionEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDepreciacionEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDepreciacionEmpresa.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoDepreciacionEmpresa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDepreciacionEmpresa.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoDepreciacionEmpresa.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoDepreciacionEmpresa.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoDepreciacionEmpresa.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DetalleActivoFijo")) {
			jButtonDetalleActivoFijoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("DepreciacionActivoFijo")) {
			jButtonDepreciacionActivoFijoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodepreciacionempresa=(TipoDepreciacionEmpresa) tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodepreciacionempresa =(TipoDepreciacionEmpresa) tipodepreciacionempresas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipodepreciacionempresa.getIsNew() && !tipodepreciacionempresa.getIsChanged() && !tipodepreciacionempresa.getIsDeleted()) {
				sDescripcion=tipodepreciacionempresa.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipodepreciacionempresa.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoDepreciacionEmpresa tipodepreciacionempresaRow=new TipoDepreciacionEmpresa();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodepreciacionempresaRow=(TipoDepreciacionEmpresa) tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodepreciacionempresaRow=(TipoDepreciacionEmpresa) tipodepreciacionempresas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleActivoFijoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoDepreciacionEmpresa tipodepreciacionempresa) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodepreciacionempresa = (TipoDepreciacionEmpresa)this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipodepreciacionempresa = (TipoDepreciacionEmpresa)this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipodepreciacionempresa!=null) {
						this.tipodepreciacionempresa = tipodepreciacionempresa;
					} else {
						this.tipodepreciacionempresa = new TipoDepreciacionEmpresa();
					}
				}

				if(this.isTienePermisosDetalleActivoFijo && this.permiteMantenimiento(this.tipodepreciacionempresa)) {
					DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFramePopup=new DetalleActivoFijoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalleactivofijoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFramePopup;
					} else {
						detalleactivofijoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame;
					}

					List<TipoDepreciacionEmpresa> tipodepreciacionempresas=new ArrayList<TipoDepreciacionEmpresa>();
					tipodepreciacionempresas.add(this.tipodepreciacionempresa);
					if(!esRelacionado) {
						//detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setConGuardarRelaciones(false);
						//detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalleactivofijoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.cargarDetalleActivoFijoBeanSwingJInternalFrame(tipodepreciacionempresas,this.tipodepreciacionempresa,detalleactivofijoBeanSwingJInternalFrame,/*conInicializar,*/detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.getConGuardarRelaciones(),detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.getEsGuardarRelacionado());
					detalleactivofijoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalleactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleActivoFijo("no_relacionado");

						detalleactivofijoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleActivoFijoConstantesFunciones.ITAMANIOFILATABLA + (DetalleActivoFijoConstantesFunciones.ITAMANIOFILATABLA/2));

						detalleactivofijoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoDepreciacionEmpresa=(TitledBorder)this.jScrollPanelDatosTipoDepreciacionEmpresa.getBorder();
						TitledBorder titledBorderDetalleActivoFijo=(TitledBorder)detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.getBorder();

						titledBorderDetalleActivoFijo.setTitle(titledBorderTipoDepreciacionEmpresa.getTitle() + " -> Detalle Activo Fijo");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalleactivofijoBeanSwingJInternalFrame);
						}

						detalleactivofijoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalleactivofijoBeanSwingJInternalFrame);

						detalleactivofijoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipodepreciacionempresaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Activo Fijo",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonDepreciacionActivoFijoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoDepreciacionEmpresa tipodepreciacionempresa) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodepreciacionempresa = (TipoDepreciacionEmpresa)this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipodepreciacionempresa = (TipoDepreciacionEmpresa)this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipodepreciacionempresa!=null) {
						this.tipodepreciacionempresa = tipodepreciacionempresa;
					} else {
						this.tipodepreciacionempresa = new TipoDepreciacionEmpresa();
					}
				}

				if(this.isTienePermisosDepreciacionActivoFijo && this.permiteMantenimiento(this.tipodepreciacionempresa)) {
					DepreciacionActivoFijoBeanSwingJInternalFrame depreciacionactivofijoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFramePopup=new DepreciacionActivoFijoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						depreciacionactivofijoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFramePopup;
					} else {
						depreciacionactivofijoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame;
					}

					List<TipoDepreciacionEmpresa> tipodepreciacionempresas=new ArrayList<TipoDepreciacionEmpresa>();
					tipodepreciacionempresas.add(this.tipodepreciacionempresa);
					if(!esRelacionado) {
						//depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoSessionBean.setConGuardarRelaciones(false);
						//depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					depreciacionactivofijoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.cargarDepreciacionActivoFijoBeanSwingJInternalFrame(tipodepreciacionempresas,this.tipodepreciacionempresa,depreciacionactivofijoBeanSwingJInternalFrame,/*conInicializar,*/depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoSessionBean.getConGuardarRelaciones(),depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoSessionBean.getEsGuardarRelacionado());
					depreciacionactivofijoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						depreciacionactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsDepreciacionActivoFijo("no_relacionado");

						depreciacionactivofijoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DepreciacionActivoFijoConstantesFunciones.ITAMANIOFILATABLA + (DepreciacionActivoFijoConstantesFunciones.ITAMANIOFILATABLA/2));

						depreciacionactivofijoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoDepreciacionEmpresa=(TitledBorder)this.jScrollPanelDatosTipoDepreciacionEmpresa.getBorder();
						TitledBorder titledBorderDepreciacionActivoFijo=(TitledBorder)depreciacionactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDepreciacionActivoFijo.getBorder();

						titledBorderDepreciacionActivoFijo.setTitle(titledBorderTipoDepreciacionEmpresa.getTitle() + " -> Depreciacion Activo Fijo");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,depreciacionactivofijoBeanSwingJInternalFrame);
						}

						depreciacionactivofijoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(depreciacionactivofijoBeanSwingJInternalFrame);

						depreciacionactivofijoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipodepreciacionempresaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Depreciacion Activo Fijo",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoDepreciacionEmpresa(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoDepreciacionEmpresa && this.isPermisoNuevoTipoDepreciacionEmpresa));			
			this.jButtonDuplicarTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaDuplicarTipoDepreciacionEmpresa && this.isPermisoDuplicarTipoDepreciacionEmpresa));			
			this.jButtonCopiarTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaCopiarTipoDepreciacionEmpresa && this.isPermisoCopiarTipoDepreciacionEmpresa));
			this.jButtonVerFormTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaVerFormTipoDepreciacionEmpresa && this.isPermisoVerFormTipoDepreciacionEmpresa));
			
			this.jButtonAbrirOrderByTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoDepreciacionEmpresa && this.isPermisoOrdenTipoDepreciacionEmpresa));			
			
			this.jButtonNuevoRelacionesTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDepreciacionEmpresa && this.isPermisoNuevoTipoDepreciacionEmpresa));			
			this.jButtonNuevoGuardarCambiosTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoDepreciacionEmpresa && this.isPermisoNuevoTipoDepreciacionEmpresa && this.isPermisoGuardarCambiosTipoDepreciacionEmpresa));
			
			if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonModificarTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaModificarTipoDepreciacionEmpresa && this.isPermisoActualizarTipoDepreciacionEmpresa));	
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonActualizarTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaActualizarTipoDepreciacionEmpresa && this.isPermisoActualizarTipoDepreciacionEmpresa));	
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonEliminarTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaEliminarTipoDepreciacionEmpresa && this.isPermisoEliminarTipoDepreciacionEmpresa));
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonCancelarTipoDepreciacionEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoDepreciacionEmpresa);							
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonGuardarCambiosTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoDepreciacionEmpresa && this.isPermisoGuardarCambiosTipoDepreciacionEmpresa));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDepreciacionEmpresa && this.isPermisoGuardarCambiosTipoDepreciacionEmpresa));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoDepreciacionEmpresa && this.isPermisoNuevoTipoDepreciacionEmpresa));						
			this.jButtonDuplicarToolBarTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaDuplicarTipoDepreciacionEmpresa && this.isPermisoDuplicarTipoDepreciacionEmpresa));						
			this.jButtonCopiarToolBarTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaCopiarTipoDepreciacionEmpresa && this.isPermisoCopiarTipoDepreciacionEmpresa));			
			this.jButtonVerFormToolBarTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaVerFormTipoDepreciacionEmpresa && this.isPermisoVerFormTipoDepreciacionEmpresa));			
			this.jButtonAbrirOrderByToolBarTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoDepreciacionEmpresa && this.isPermisoOrdenTipoDepreciacionEmpresa));
			this.jButtonNuevoRelacionesToolBarTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDepreciacionEmpresa && this.isPermisoNuevoTipoDepreciacionEmpresa));			
			this.jButtonNuevoGuardarCambiosToolBarTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoDepreciacionEmpresa && this.isPermisoNuevoTipoDepreciacionEmpresa && this.isPermisoGuardarCambiosTipoDepreciacionEmpresa));			
			
			if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonModificarToolBarTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaModificarTipoDepreciacionEmpresa && this.isPermisoActualizarTipoDepreciacionEmpresa));	
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonActualizarToolBarTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaActualizarTipoDepreciacionEmpresa  && this.isPermisoActualizarTipoDepreciacionEmpresa));	
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonEliminarToolBarTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaEliminarTipoDepreciacionEmpresa && this.isPermisoEliminarTipoDepreciacionEmpresa));
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonCancelarToolBarTipoDepreciacionEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoDepreciacionEmpresa);				
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonGuardarCambiosToolBarTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoDepreciacionEmpresa && this.isPermisoGuardarCambiosTipoDepreciacionEmpresa));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDepreciacionEmpresa && this.isPermisoGuardarCambiosTipoDepreciacionEmpresa));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoDepreciacionEmpresa && this.isPermisoNuevoTipoDepreciacionEmpresa));			
			this.jMenuItemDuplicarTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaDuplicarTipoDepreciacionEmpresa && this.isPermisoDuplicarTipoDepreciacionEmpresa));			
			this.jMenuItemCopiarTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaCopiarTipoDepreciacionEmpresa && this.isPermisoCopiarTipoDepreciacionEmpresa));			
			this.jMenuItemVerFormTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaVerFormTipoDepreciacionEmpresa && this.isPermisoVerFormTipoDepreciacionEmpresa));			
			this.jMenuItemAbrirOrderByTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoDepreciacionEmpresa && this.isPermisoOrdenTipoDepreciacionEmpresa));			
			//this.jMenuItemMostrarOcultarTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoDepreciacionEmpresa && this.isPermisoOrdenTipoDepreciacionEmpresa));
			this.jMenuItemDetalleAbrirOrderByTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoDepreciacionEmpresa && this.isPermisoOrdenTipoDepreciacionEmpresa));			
			//this.jMenuItemDetalleMostrarOcultarTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaOrdenTipoDepreciacionEmpresa && this.isPermisoOrdenTipoDepreciacionEmpresa));			
			this.jMenuItemNuevoRelacionesTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDepreciacionEmpresa && this.isPermisoNuevoTipoDepreciacionEmpresa));			
			this.jMenuItemNuevoGuardarCambiosTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaNuevoTipoDepreciacionEmpresa && this.isPermisoNuevoTipoDepreciacionEmpresa && this.isPermisoGuardarCambiosTipoDepreciacionEmpresa));									
			
			if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jMenuItemModificarTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaModificarTipoDepreciacionEmpresa && this.isPermisoActualizarTipoDepreciacionEmpresa));	
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jMenuItemActualizarTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaActualizarTipoDepreciacionEmpresa && this.isPermisoActualizarTipoDepreciacionEmpresa));	
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jMenuItemEliminarTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaEliminarTipoDepreciacionEmpresa && this.isPermisoEliminarTipoDepreciacionEmpresa));
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jMenuItemCancelarTipoDepreciacionEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoDepreciacionEmpresa);				
			}
			
			this.jMenuItemGuardarCambiosTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoDepreciacionEmpresa && this.isPermisoGuardarCambiosTipoDepreciacionEmpresa));						
			this.jMenuItemGuardarCambiosTablaTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDepreciacionEmpresa && this.isPermisoGuardarCambiosTipoDepreciacionEmpresa));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoDepreciacionEmpresa=this.jButtonNuevoTipoDepreciacionEmpresa.isVisible();
			this.isVisibilidadCeldaDuplicarTipoDepreciacionEmpresa=this.jButtonDuplicarTipoDepreciacionEmpresa.isVisible();
			this.isVisibilidadCeldaCopiarTipoDepreciacionEmpresa=this.jButtonCopiarTipoDepreciacionEmpresa.isVisible();
			this.isVisibilidadCeldaVerFormTipoDepreciacionEmpresa=this.jButtonVerFormTipoDepreciacionEmpresa.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoDepreciacionEmpresa=this.jButtonAbrirOrderByTipoDepreciacionEmpresa.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoDepreciacionEmpresa=this.jButtonNuevoRelacionesTipoDepreciacionEmpresa.isVisible();
			this.isVisibilidadCeldaModificarTipoDepreciacionEmpresa=this.jButtonModificarTipoDepreciacionEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) {
			this.isVisibilidadCeldaActualizarTipoDepreciacionEmpresa=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonActualizarTipoDepreciacionEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarTipoDepreciacionEmpresa=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonEliminarTipoDepreciacionEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarTipoDepreciacionEmpresa=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonCancelarTipoDepreciacionEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarTipoDepreciacionEmpresa=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonGuardarCambiosTipoDepreciacionEmpresa.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoDepreciacionEmpresa=this.jButtonGuardarCambiosTablaTipoDepreciacionEmpresa.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoDepreciacionEmpresa=this.jButtonNuevoToolBarTipoDepreciacionEmpresa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDepreciacionEmpresa=this.jButtonNuevoRelacionesToolBarTipoDepreciacionEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) {
			this.isVisibilidadCeldaModificarTipoDepreciacionEmpresa=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonModificarToolBarTipoDepreciacionEmpresa.isVisible();
			this.isVisibilidadCeldaActualizarTipoDepreciacionEmpresa=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonActualizarToolBarTipoDepreciacionEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarTipoDepreciacionEmpresa=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonEliminarToolBarTipoDepreciacionEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarTipoDepreciacionEmpresa=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonCancelarToolBarTipoDepreciacionEmpresa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDepreciacionEmpresa=this.jButtonGuardarCambiosToolBarTipoDepreciacionEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDepreciacionEmpresa=this.jButtonGuardarCambiosTablaToolBarTipoDepreciacionEmpresa.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoDepreciacionEmpresa=this.jMenuItemNuevoTipoDepreciacionEmpresa.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDepreciacionEmpresa=this.jMenuItemNuevoRelacionesTipoDepreciacionEmpresa.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) {
			this.isVisibilidadCeldaModificarTipoDepreciacionEmpresa=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jMenuItemModificarTipoDepreciacionEmpresa.isVisible();
			this.isVisibilidadCeldaActualizarTipoDepreciacionEmpresa=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jMenuItemActualizarTipoDepreciacionEmpresa.isVisible();
			this.isVisibilidadCeldaEliminarTipoDepreciacionEmpresa=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jMenuItemEliminarTipoDepreciacionEmpresa.isVisible();
			this.isVisibilidadCeldaCancelarTipoDepreciacionEmpresa=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jMenuItemCancelarTipoDepreciacionEmpresa.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDepreciacionEmpresa=this.jMenuItemGuardarCambiosTipoDepreciacionEmpresa.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDepreciacionEmpresa=this.jMenuItemGuardarCambiosTablaTipoDepreciacionEmpresa.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoDepreciacionEmpresa(Boolean esInicializar) {
		if(TipoDepreciacionEmpresaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipodepreciacionempresaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDepreciacionEmpresa();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoDepreciacionEmpresa(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoDepreciacionEmpresa() {
		this.jButtonNuevoTipoDepreciacionEmpresa.setVisible(this.isPermisoNuevoTipoDepreciacionEmpresa);			
		this.jButtonDuplicarTipoDepreciacionEmpresa.setVisible(this.isPermisoDuplicarTipoDepreciacionEmpresa);			
		this.jButtonCopiarTipoDepreciacionEmpresa.setVisible(this.isPermisoCopiarTipoDepreciacionEmpresa);			
		this.jButtonVerFormTipoDepreciacionEmpresa.setVisible(this.isPermisoVerFormTipoDepreciacionEmpresa);			
		
		this.jButtonAbrirOrderByTipoDepreciacionEmpresa.setVisible(this.isPermisoOrdenTipoDepreciacionEmpresa);					
		
		this.jButtonNuevoRelacionesTipoDepreciacionEmpresa.setVisible(this.isPermisoNuevoTipoDepreciacionEmpresa);			
		
		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonModificarTipoDepreciacionEmpresa.setVisible(this.isPermisoActualizarTipoDepreciacionEmpresa);	
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonActualizarTipoDepreciacionEmpresa.setVisible(this.isPermisoActualizarTipoDepreciacionEmpresa);	
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonEliminarTipoDepreciacionEmpresa.setVisible(this.isPermisoEliminarTipoDepreciacionEmpresa);
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonCancelarTipoDepreciacionEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoDepreciacionEmpresa);						
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonGuardarCambiosTipoDepreciacionEmpresa.setVisible(this.isPermisoGuardarCambiosTipoDepreciacionEmpresa);							
		}
		
		this.jButtonGuardarCambiosTablaTipoDepreciacionEmpresa.setVisible(this.isPermisoActualizarTipoDepreciacionEmpresa);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDepreciacionEmpresa() {
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonModificarTipoDepreciacionEmpresa.setVisible(this.isPermisoActualizarTipoDepreciacionEmpresa);	
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonActualizarTipoDepreciacionEmpresa.setVisible(this.isPermisoActualizarTipoDepreciacionEmpresa);	
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonEliminarTipoDepreciacionEmpresa.setVisible(this.isPermisoEliminarTipoDepreciacionEmpresa);
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonCancelarTipoDepreciacionEmpresa.setVisible(this.isVisibilidadCeldaCancelarTipoDepreciacionEmpresa);							
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonGuardarCambiosTipoDepreciacionEmpresa.setVisible((this.isVisibilidadCeldaGuardarTipoDepreciacionEmpresa && this.isPermisoGuardarCambiosTipoDepreciacionEmpresa));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoDepreciacionEmpresa() {
		if(TipoDepreciacionEmpresaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoDepreciacionEmpresa();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoDepreciacionEmpresa() {
	}
	
	public void jTableDatosTipoDepreciacionEmpresaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoDepreciacionEmpresa(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoDepreciacionEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDepreciacionEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDepreciacionEmpresa(this.gettipodepreciacionempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDepreciacionEmpresa(this.tipodepreciacionempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodepreciacionempresa==null) {
						this.tipodepreciacionempresa = new TipoDepreciacionEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoDepreciacionEmpresa(this.tipodepreciacionempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDepreciacionEmpresa(this.tipodepreciacionempresa);
				}

				if(this.tipodepreciacionempresa.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipodepreciacionempresa.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDepreciacionEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoDepreciacionEmpresaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoDepreciacionEmpresa(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDepreciacionEmpresa.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoDepreciacionEmpresa.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoDepreciacionEmpresa.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoDepreciacionEmpresa(this.gettipodepreciacionempresa(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDepreciacionEmpresa(this.tipodepreciacionempresa);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipodepreciacionempresaLogic.getConnexion());

				if(this.tipodepreciacionempresa.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipodepreciacionempresa.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoDepreciacionEmpresa=(TitledBorder)this.jScrollPanelDatosTipoDepreciacionEmpresa.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoDepreciacionEmpresa.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoDepreciacionEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDepreciacionEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDepreciacionEmpresa(this.gettipodepreciacionempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDepreciacionEmpresa(this.tipodepreciacionempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodepreciacionempresa==null) {
						this.tipodepreciacionempresa = new TipoDepreciacionEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoDepreciacionEmpresa(this.tipodepreciacionempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDepreciacionEmpresa(this.tipodepreciacionempresa);
				}

				if(this.tipodepreciacionempresa.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipodepreciacionempresa.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDepreciacionEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoDepreciacionEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDepreciacionEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDepreciacionEmpresa(this.gettipodepreciacionempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDepreciacionEmpresa(this.tipodepreciacionempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodepreciacionempresa==null) {
						this.tipodepreciacionempresa = new TipoDepreciacionEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoDepreciacionEmpresa(this.tipodepreciacionempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDepreciacionEmpresa(this.tipodepreciacionempresa);
				}

				if(this.tipodepreciacionempresa.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipodepreciacionempresa.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDepreciacionEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoDepreciacionEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDepreciacionEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDepreciacionEmpresa(this.gettipodepreciacionempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDepreciacionEmpresa(this.tipodepreciacionempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodepreciacionempresa==null) {
						this.tipodepreciacionempresa = new TipoDepreciacionEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoDepreciacionEmpresa(this.tipodepreciacionempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDepreciacionEmpresa(this.tipodepreciacionempresa);
				}

				if(this.tipodepreciacionempresa.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipodepreciacionempresa.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDepreciacionEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_linea_rectaTipoDepreciacionEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDepreciacionEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDepreciacionEmpresa(this.gettipodepreciacionempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDepreciacionEmpresa(this.tipodepreciacionempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodepreciacionempresa==null) {
						this.tipodepreciacionempresa = new TipoDepreciacionEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoDepreciacionEmpresa(this.tipodepreciacionempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDepreciacionEmpresa(this.tipodepreciacionempresa);
				}

				if(this.tipodepreciacionempresa.getes_linea_recta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_linea_recta = "+this.tipodepreciacionempresa.getes_linea_recta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDepreciacionEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_mensualTipoDepreciacionEmpresaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDepreciacionEmpresa.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDepreciacionEmpresa(this.gettipodepreciacionempresa(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDepreciacionEmpresa(this.tipodepreciacionempresa);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodepreciacionempresa==null) {
						this.tipodepreciacionempresa = new TipoDepreciacionEmpresa();
					}

					this.setVariablesFormularioToObjetoActualTipoDepreciacionEmpresa(this.tipodepreciacionempresa,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDepreciacionEmpresa(this.tipodepreciacionempresa);
				}

				if(this.tipodepreciacionempresa.getes_mensual()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_mensual = "+this.tipodepreciacionempresa.getes_mensual().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDepreciacionEmpresa(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoDepreciacionEmpresaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDepreciacionEmpresa(false,false);

			this.getTipoDepreciacionEmpresasFK_IdEmpresa();

			this.inicializarActualizarBindingTipoDepreciacionEmpresa(false);

			//if(TipoDepreciacionEmpresaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDepreciacionEmpresa(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodepreciacionempresaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoDepreciacionEmpresa() {
		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) {
		

		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) {
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.dispose();
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa!=null) {
			this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.dispose();
			this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa=null;
		}
		
		if(this.jInternalFrameImportacionTipoDepreciacionEmpresa!=null) {
			this.jInternalFrameImportacionTipoDepreciacionEmpresa.setVisible(false);	    			
			this.jInternalFrameImportacionTipoDepreciacionEmpresa.dispose();
			this.jInternalFrameImportacionTipoDepreciacionEmpresa=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoDepreciacionEmpresa();
			
			TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoDepreciacionEmpresa")) {
				jButtonNuevoTipoDepreciacionEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoDepreciacionEmpresa")) {
				jButtonDuplicarTipoDepreciacionEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoDepreciacionEmpresa")) {
				jButtonCopiarTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoDepreciacionEmpresa")) {
				jButtonVerFormTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoDepreciacionEmpresa")) {
				jButtonNuevoTipoDepreciacionEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoDepreciacionEmpresa")) {
				jButtonDuplicarTipoDepreciacionEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoDepreciacionEmpresa")) {
				jButtonNuevoTipoDepreciacionEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoDepreciacionEmpresa")) {
				jButtonDuplicarTipoDepreciacionEmpresaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoDepreciacionEmpresa")) {
				jButtonNuevoTipoDepreciacionEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoDepreciacionEmpresa")) {
				jButtonNuevoTipoDepreciacionEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoDepreciacionEmpresa")) {
				jButtonNuevoTipoDepreciacionEmpresaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoDepreciacionEmpresa")) {
				jButtonModificarTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoDepreciacionEmpresa")) {
				jButtonModificarTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoDepreciacionEmpresa")) {
				jButtonModificarTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoDepreciacionEmpresa")) {
				jButtonActualizarTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoDepreciacionEmpresa")) {
				jButtonActualizarTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoDepreciacionEmpresa")) {
				jButtonActualizarTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoDepreciacionEmpresa")) {
				jButtonEliminarTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoDepreciacionEmpresa")) {
				jButtonEliminarTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoDepreciacionEmpresa")) {
				jButtonEliminarTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoDepreciacionEmpresa")) {
				jButtonCancelarTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoDepreciacionEmpresa")) {
				jButtonCancelarTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoDepreciacionEmpresa")) {
				jButtonCancelarTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoDepreciacionEmpresa")) {
				jButtonCerrarTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoDepreciacionEmpresa")) {
				jButtonCerrarTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoDepreciacionEmpresa")) {
				jButtonCerrarTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoDepreciacionEmpresa")) {
				jButtonMostrarOcultarTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoDepreciacionEmpresa")) {
				jButtonCancelarTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoDepreciacionEmpresa")) {
				jButtonGuardarCambiosTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoDepreciacionEmpresa")) {
				jButtonGuardarCambiosTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoDepreciacionEmpresa")) {
				jButtonCopiarTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoDepreciacionEmpresa")) {
				jButtonVerFormTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoDepreciacionEmpresa")) {
				jButtonGuardarCambiosTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoDepreciacionEmpresa")) {
				jButtonCopiarTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoDepreciacionEmpresa")) {
				jButtonVerFormTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoDepreciacionEmpresa")) {
				jButtonGuardarCambiosTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoDepreciacionEmpresa")) {
				jButtonGuardarCambiosTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoDepreciacionEmpresa")) {
				jButtonGuardarCambiosTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoDepreciacionEmpresa")) {
				jButtonRecargarInformacionTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoDepreciacionEmpresa")) {
				jButtonRecargarInformacionTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoDepreciacionEmpresa")) {
				jButtonRecargarInformacionTipoDepreciacionEmpresaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoDepreciacionEmpresa")) {
				jButtonAnterioresTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoDepreciacionEmpresa")) {
				jButtonAnterioresTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoDepreciacionEmpresa")) {
				jButtonAnterioresTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoDepreciacionEmpresa")) {
				jButtonSiguientesTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoDepreciacionEmpresa")) {
				jButtonSiguientesTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoDepreciacionEmpresa")) {
				jButtonSiguientesTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoDepreciacionEmpresa") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoDepreciacionEmpresa")) {
				jButtonAbrirOrderByTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoDepreciacionEmpresa") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoDepreciacionEmpresa")) {
				jButtonMostrarOcultarTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDepreciacionEmpresa")) {
				jButtonNuevoGuardarCambiosTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoDepreciacionEmpresa")) {
				jButtonNuevoGuardarCambiosTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoDepreciacionEmpresa")) {
				jButtonNuevoGuardarCambiosTipoDepreciacionEmpresaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoDepreciacionEmpresa")) {
				jButtonCerrarReporteDinamicoTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoDepreciacionEmpresa")) {
				jButtonGenerarReporteDinamicoTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoDepreciacionEmpresa")) {
				
				jButtonGenerarExcelReporteDinamicoTipoDepreciacionEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoDepreciacionEmpresa")) {
				jButtonCerrarImportacionTipoDepreciacionEmpresaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoDepreciacionEmpresa")) {
				
				jButtonGenerarImportacionTipoDepreciacionEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoDepreciacionEmpresa")) {
				
				jButtonAbrirImportacionTipoDepreciacionEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoDepreciacionEmpresa")) {
				jComboBoxTiposAccionesTipoDepreciacionEmpresaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoDepreciacionEmpresa")) {
				jComboBoxTiposRelacionesTipoDepreciacionEmpresaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoDepreciacionEmpresa")) {
				jComboBoxTiposAccionesTipoDepreciacionEmpresaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoDepreciacionEmpresa")) {
				
				jComboBoxTiposSeleccionarTipoDepreciacionEmpresaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoDepreciacionEmpresa")) {
				jTextFieldValorCampoGeneralTipoDepreciacionEmpresaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoDepreciacionEmpresa")) {
				jButtonAbrirOrderByTipoDepreciacionEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoDepreciacionEmpresa")) {
				jButtonAbrirOrderByTipoDepreciacionEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoDepreciacionEmpresa")) {
				jButtonCerrarOrderByTipoDepreciacionEmpresaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDepreciacionEmpresaBusqueda")) {
				this.jButtonidTipoDepreciacionEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoDepreciacionEmpresaUpdate")) {
				this.jButtonid_empresaTipoDepreciacionEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoDepreciacionEmpresaBusqueda")) {
				this.jButtonid_empresaTipoDepreciacionEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoDepreciacionEmpresaBusqueda")) {
				this.jButtoncodigoTipoDepreciacionEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDepreciacionEmpresaBusqueda")) {
				this.jButtonnombreTipoDepreciacionEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_linea_rectaTipoDepreciacionEmpresaBusqueda")) {
				this.jButtones_linea_rectaTipoDepreciacionEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_mensualTipoDepreciacionEmpresaBusqueda")) {
				this.jButtones_mensualTipoDepreciacionEmpresaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoDepreciacionEmpresa();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDepreciacionEmpresaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodepreciacionempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodepreciacionempresa);
				
				TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
				
				


				
				TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDepreciacionEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDepreciacionEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoDepreciacionEmpresa tipodepreciacionempresaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipodepreciacionempresaLocal=this.tipodepreciacionempresa;
			} else {
				tipodepreciacionempresaLocal=this.tipodepreciacionempresaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodepreciacionempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodepreciacionempresa);
				
				TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
							
				
				


				
				TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDepreciacionEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDepreciacionEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDepreciacionEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDepreciacionEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaAnterior =(TipoDepreciacionEmpresa) this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodepreciacionempresaAnterior =(TipoDepreciacionEmpresa) this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
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
			
			TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
			
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
			
			


			
			TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDepreciacionEmpresaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodepreciacionempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodepreciacionempresa);
				
				TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
								
						
				


				
				TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDepreciacionEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDepreciacionEmpresa.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodepreciacionempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodepreciacionempresa);
				
				TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
								
				
				


				
				TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDepreciacionEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDepreciacionEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDepreciacionEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDepreciacionEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaAnterior =(TipoDepreciacionEmpresa) this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodepreciacionempresaAnterior =(TipoDepreciacionEmpresa) this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodepreciacionempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodepreciacionempresa);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDepreciacionEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDepreciacionEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaAnterior =(TipoDepreciacionEmpresa) this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodepreciacionempresaAnterior =(TipoDepreciacionEmpresa) this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDepreciacionEmpresaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodepreciacionempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodepreciacionempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodepreciacionempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodepreciacionempresa);
				
				TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
							
				
				


				
				TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDepreciacionEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDepreciacionEmpresa.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDepreciacionEmpresaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDepreciacionEmpresa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodepreciacionempresaAnterior =(TipoDepreciacionEmpresa) this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodepreciacionempresaAnterior =(TipoDepreciacionEmpresa) this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
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
			
			TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
			
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
			
			


			
			TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDepreciacionEmpresaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodepreciacionempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodepreciacionempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodepreciacionempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodepreciacionempresa);
				
				TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
								
				
				


				
				TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDepreciacionEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDepreciacionEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDepreciacionEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDepreciacionEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaAnterior =(TipoDepreciacionEmpresa) this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodepreciacionempresaAnterior =(TipoDepreciacionEmpresa) this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDepreciacionEmpresaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodepreciacionempresa);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodepreciacionempresa);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDepreciacionEmpresaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodepreciacionempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodepreciacionempresa);
				
				TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoDepreciacionEmpresa")) {
					jCheckBoxSeleccionarTodosTipoDepreciacionEmpresaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoDepreciacionEmpresa")) {
					jCheckBoxSeleccionadosTipoDepreciacionEmpresaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoDepreciacionEmpresa")) {
					
				}
				
				


				
				
				TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDepreciacionEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDepreciacionEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodepreciacionempresa);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipodepreciacionempresa);
				
				TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
												
				
				


				
				
				TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDepreciacionEmpresa.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDepreciacionEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDepreciacionEmpresaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDepreciacionEmpresa.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodepreciacionempresaAnterior =(TipoDepreciacionEmpresa) this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodepreciacionempresaAnterior =(TipoDepreciacionEmpresa) this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDepreciacionEmpresaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodepreciacionempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodepreciacionempresa);
				
				TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
				
				
				TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
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
			
			TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
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
			
			


			
			TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDepreciacionEmpresaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodepreciacionempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodepreciacionempresa);
				
				TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDepreciacionEmpresa.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDepreciacionEmpresa.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodepreciacionempresa);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodepreciacionempresa);
				
				TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
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
				
				


				
				TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDepreciacionEmpresa.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDepreciacionEmpresa.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDepreciacionEmpresaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDepreciacionEmpresa.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodepreciacionempresaAnterior =(TipoDepreciacionEmpresa) this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodepreciacionempresaAnterior =(TipoDepreciacionEmpresa) this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoDepreciacionEmpresa")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoDepreciacionEmpresaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoDepreciacionEmpresa.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipodepreciacionempresa =(TipoDepreciacionEmpresa) this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipodepreciacionempresa);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoDepreciacionEmpresa")) {
				
				}
				
				TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoDepreciacionEmpresa")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoDepreciacionEmpresa.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoDepreciacionEmpresa")) {
			
			}
			
			TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoDepreciacionEmpresa();
			
			TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoDepreciacionEmpresa")) {
				jButtonNuevoTipoDepreciacionEmpresaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoDepreciacionEmpresa")) {
				jButtonDuplicarTipoDepreciacionEmpresaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoDepreciacionEmpresa")) {
				jButtonCopiarTipoDepreciacionEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoDepreciacionEmpresa")) {
				jButtonVerFormTipoDepreciacionEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoDepreciacionEmpresa")) {
				jButtonNuevoTipoDepreciacionEmpresaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoDepreciacionEmpresa")) {
				jButtonModificarTipoDepreciacionEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoDepreciacionEmpresa")) {
				jButtonActualizarTipoDepreciacionEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoDepreciacionEmpresa")) {
				jButtonEliminarTipoDepreciacionEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoDepreciacionEmpresa")) {
				jButtonGuardarCambiosTipoDepreciacionEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoDepreciacionEmpresa")) {
				jButtonCancelarTipoDepreciacionEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoDepreciacionEmpresa")) {
				jButtonCerrarTipoDepreciacionEmpresaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoDepreciacionEmpresa")) {
				jButtonGuardarCambiosTipoDepreciacionEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDepreciacionEmpresa")) {
				jButtonNuevoGuardarCambiosTipoDepreciacionEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoDepreciacionEmpresa")) {
				jButtonAbrirOrderByTipoDepreciacionEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoDepreciacionEmpresa")) {
				jButtonRecargarInformacionTipoDepreciacionEmpresaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoDepreciacionEmpresa")) {
				jButtonAnterioresTipoDepreciacionEmpresaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoDepreciacionEmpresa")) {
				jButtonSiguientesTipoDepreciacionEmpresaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDepreciacionEmpresaBusqueda")) {
				this.jButtonidTipoDepreciacionEmpresaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoDepreciacionEmpresaUpdate")) {
				this.jButtonid_empresaTipoDepreciacionEmpresaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoDepreciacionEmpresaBusqueda")) {
				this.jButtonid_empresaTipoDepreciacionEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoDepreciacionEmpresaBusqueda")) {
				this.jButtoncodigoTipoDepreciacionEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDepreciacionEmpresaBusqueda")) {
				this.jButtonnombreTipoDepreciacionEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_linea_rectaTipoDepreciacionEmpresaBusqueda")) {
				this.jButtones_linea_rectaTipoDepreciacionEmpresaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_mensualTipoDepreciacionEmpresaBusqueda")) {
				this.jButtones_mensualTipoDepreciacionEmpresaBusquedaActionPerformed(evt);
			}
			
			TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoDepreciacionEmpresa();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoDepreciacionEmpresa")) {
				closingInternalFrameTipoDepreciacionEmpresa();
				
			} else if(sTipo.equals("jButtonCancelarTipoDepreciacionEmpresa")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoDepreciacionEmpresa = (JInternalFrameBase)evt.getSource();
	            	
	            TipoDepreciacionEmpresaBeanSwingJInternalFrame jInternalFrameParent=(TipoDepreciacionEmpresaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDepreciacionEmpresa.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoDepreciacionEmpresaActionPerformed(null);
			}
			
			TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodepreciacionempresa,new Object(),this.tipodepreciacionempresaParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoDepreciacionEmpresa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoDepreciacionEmpresa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoDepreciacionEmpresa(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipodepreciacionempresa)) {
			if(!esControlTabla) {
				if(TipoDepreciacionEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoDepreciacionEmpresa(this.tipodepreciacionempresa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDepreciacionEmpresa(this.tipodepreciacionempresa);			
				}
				
				if(this.tipodepreciacionempresaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoDepreciacionEmpresa(this.tipodepreciacionempresa,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodepreciacionempresaReturnGeneral=tipodepreciacionempresaLogic.procesarEventosTipoDepreciacionEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas(),this.tipodepreciacionempresa,this.tipodepreciacionempresaParameterGeneral,this.isEsNuevoTipoDepreciacionEmpresa,classes);//this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoDepreciacionEmpresa(this.tipodepreciacionempresaReturnGeneral,this.tipodepreciacionempresaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipodepreciacionempresaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoDepreciacionEmpresa(classes,this.tipodepreciacionempresaReturnGeneral,this.tipodepreciacionempresaBean,false);
					}
						
					if(this.tipodepreciacionempresaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoDepreciacionEmpresa(this.tipodepreciacionempresaReturnGeneral.getTipoDepreciacionEmpresa());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoDepreciacionEmpresa(this.tipodepreciacionempresaReturnGeneral.getTipoDepreciacionEmpresa());	
					}
						
					if(this.tipodepreciacionempresaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoDepreciacionEmpresa(this.tipodepreciacionempresaReturnGeneral.getTipoDepreciacionEmpresa(),classes);//this.tipodepreciacionempresaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoDepreciacionEmpresa(this.tipodepreciacionempresa,classes);//this.tipodepreciacionempresaBean);									
				}
			
				if(TipoDepreciacionEmpresaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoDepreciacionEmpresa(this.tipodepreciacionempresa,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDepreciacionEmpresa(this.tipodepreciacionempresa);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipodepreciacionempresaAnterior!=null) {
						this.tipodepreciacionempresa=this.tipodepreciacionempresaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodepreciacionempresaReturnGeneral=tipodepreciacionempresaLogic.procesarEventosTipoDepreciacionEmpresasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas(),this.tipodepreciacionempresa,this.tipodepreciacionempresaParameterGeneral,this.isEsNuevoTipoDepreciacionEmpresa,classes);//this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresa()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodepreciacionempresaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipodepreciacionempresaReturnGeneral.getTipoDepreciacionEmpresa(),tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipodepreciacionempresaReturnGeneral.getTipoDepreciacionEmpresa(),this.tipodepreciacionempresas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoDepreciacionEmpresa.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoDepreciacionEmpresa.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoDepreciacionEmpresa();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoDepreciacionEmpresa() throws Exception {
		
		TipoDepreciacionEmpresaModel tipodepreciacionempresaModel=(TipoDepreciacionEmpresaModel)this.jTableDatosTipoDepreciacionEmpresa.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodepreciacionempresaModel.tipodepreciacionempresas=this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipodepreciacionempresaModel.tipodepreciacionempresas=this.tipodepreciacionempresas;
		}
		
		
		((TipoDepreciacionEmpresaModel) this.jTableDatosTipoDepreciacionEmpresa.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoDepreciacionEmpresa() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipodepreciacionempresaAnterior(),this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipodepreciacionempresaAnterior(),this.tipodepreciacionempresas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoDepreciacionEmpresa();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoDepreciacionEmpresa(TipoDepreciacionEmpresa tipodepreciacionempresa,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleActivoFijo.class)) {
					this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.setDetalleActivoFijos(tipodepreciacionempresa.getDetalleActivoFijos());
					this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleActivoFijo(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DepreciacionActivoFijo.class)) {
					this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoLogic.setDepreciacionActivoFijos(tipodepreciacionempresa.getDepreciacionActivoFijos());
					this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDepreciacionActivoFijo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
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
										
				TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodepreciacionempresa,new Object(),generalEntityParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipodepreciacionempresaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoDepreciacionEmpresaConstantesFunciones.getClassesRelationshipsOfTipoDepreciacionEmpresa(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoDepreciacionEmpresaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoDepreciacionEmpresa(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoDepreciacionEmpresa(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoDepreciacionEmpresaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodepreciacionempresa,new Object(),generalEntityParameterGeneral,this.tipodepreciacionempresaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoDepreciacionEmpresa(TipoDepreciacionEmpresaBean tipodepreciacionempresaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleActivoFijo.class)) {
					this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.setDetalleActivoFijos(tipodepreciacionempresa.getDetalleActivoFijos());
					this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleActivoFijo(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DepreciacionActivoFijo.class)) {
					this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoLogic.setDepreciacionActivoFijos(tipodepreciacionempresa.getDepreciacionActivoFijos());
					this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDepreciacionActivoFijo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoDepreciacionEmpresa(ArrayList<Classe> classes,TipoDepreciacionEmpresaReturnGeneral tipodepreciacionempresaReturnGeneral,TipoDepreciacionEmpresaBean tipodepreciacionempresaBean,Boolean conDefault) throws Exception {
		
			this.tipodepreciacionempresaBean.setDetalleActivoFijos(tipodepreciacionempresaReturnGeneral.getTipoDepreciacionEmpresa().getDetalleActivoFijos());
			this.tipodepreciacionempresaBean.setDepreciacionActivoFijos(tipodepreciacionempresaReturnGeneral.getTipoDepreciacionEmpresa().getDepreciacionActivoFijos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoDepreciacionEmpresa(TipoDepreciacionEmpresa tipodepreciacionempresa,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleActivoFijo.class)) {
					tipodepreciacionempresa.setDetalleActivoFijos(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DepreciacionActivoFijo.class)) {
					tipodepreciacionempresa.setDepreciacionActivoFijos(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoBeanSwingJInternalFrame.depreciacionactivofijoLogic.getDepreciacionActivoFijos());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipodepreciacionempresa)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa = new TipoDepreciacionEmpresaDetalleFormJInternalFrame(jDesktopPane,this.tipodepreciacionempresaSessionBean.getConGuardarRelaciones(),this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa);
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.setVisible(false);
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.tipodepreciacionempresaLogic=this.tipodepreciacionempresaLogic;
		
		this.cargarCombosFrameForeignKeyTipoDepreciacionEmpresa("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDepreciacionEmpresa();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDepreciacionEmpresa();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoDepreciacionEmpresa("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoDepreciacionEmpresa();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDepreciacionEmpresa"));
		
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonModificarTipoDepreciacionEmpresa.addActionListener(new ButtonActionListener(this,"ModificarTipoDepreciacionEmpresa"));

		
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonModificarToolBarTipoDepreciacionEmpresa.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDepreciacionEmpresa"));
					
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jMenuItemModificarTipoDepreciacionEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDepreciacionEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonActualizarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"ActualizarTipoDepreciacionEmpresa"));
		
		
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonActualizarToolBarTipoDepreciacionEmpresa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDepreciacionEmpresa"));
						
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jMenuItemActualizarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDepreciacionEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonEliminarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"EliminarTipoDepreciacionEmpresa"));
		
		
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonEliminarToolBarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDepreciacionEmpresa"));
								
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jMenuItemEliminarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDepreciacionEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonCancelarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"CancelarTipoDepreciacionEmpresa"));
		
		
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonCancelarToolBarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDepreciacionEmpresa"));
					
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jMenuItemCancelarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDepreciacionEmpresa"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jMenuItemDetalleCerrarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDepreciacionEmpresa"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonGuardarCambiosToolBarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDepreciacionEmpresa"));
		
		
		
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonGuardarCambiosToolBarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDepreciacionEmpresa"));
		
		
		
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jComboBoxTiposAccionesFormularioTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDepreciacionEmpresa"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonidTipoDepreciacionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDepreciacionEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonid_empresaTipoDepreciacionEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoDepreciacionEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonid_empresaTipoDepreciacionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoDepreciacionEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtoncodigoTipoDepreciacionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDepreciacionEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonnombreTipoDepreciacionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDepreciacionEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtones_linea_rectaTipoDepreciacionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"es_linea_rectaTipoDepreciacionEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtones_mensualTipoDepreciacionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"es_mensualTipoDepreciacionEmpresaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jTabbedPaneRelacionesTipoDepreciacionEmpresa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDepreciacionEmpresa"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoDepreciacionEmpresa"));
		
		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDepreciacionEmpresa"));
		}
		
		this.jTableDatosTipoDepreciacionEmpresa.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoDepreciacionEmpresa"));
		
		this.jTableDatosTipoDepreciacionEmpresa.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoDepreciacionEmpresa"));
		
		this.jButtonNuevoTipoDepreciacionEmpresa.addActionListener(new ButtonActionListener(this,"NuevoTipoDepreciacionEmpresa"));
		
		this.jButtonDuplicarTipoDepreciacionEmpresa.addActionListener(new ButtonActionListener(this,"DuplicarTipoDepreciacionEmpresa"));
		
		this.jButtonCopiarTipoDepreciacionEmpresa.addActionListener(new ButtonActionListener(this,"CopiarTipoDepreciacionEmpresa"));
		
		this.jButtonVerFormTipoDepreciacionEmpresa.addActionListener(new ButtonActionListener(this,"VerFormTipoDepreciacionEmpresa"));
		
		
		this.jButtonNuevoToolBarTipoDepreciacionEmpresa.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoDepreciacionEmpresa"));
			
		this.jButtonDuplicarToolBarTipoDepreciacionEmpresa.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoDepreciacionEmpresa"));
			
		this.jMenuItemNuevoTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoDepreciacionEmpresa"));
			
		this.jMenuItemDuplicarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoDepreciacionEmpresa"));		
		
		
		this.jButtonNuevoRelacionesTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoDepreciacionEmpresa"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoDepreciacionEmpresa.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoDepreciacionEmpresa"));
			
		this.jMenuItemNuevoRelacionesTipoDepreciacionEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoDepreciacionEmpresa"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonModificarTipoDepreciacionEmpresa.addActionListener(new ButtonActionListener(this,"ModificarTipoDepreciacionEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonModificarToolBarTipoDepreciacionEmpresa.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDepreciacionEmpresa"));
			
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jMenuItemModificarTipoDepreciacionEmpresa.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDepreciacionEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonActualizarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"ActualizarTipoDepreciacionEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonActualizarToolBarTipoDepreciacionEmpresa.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDepreciacionEmpresa"));
				
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jMenuItemActualizarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDepreciacionEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonEliminarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"EliminarTipoDepreciacionEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonEliminarToolBarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDepreciacionEmpresa"));
						
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jMenuItemEliminarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDepreciacionEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonCancelarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"CancelarTipoDepreciacionEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonCancelarToolBarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDepreciacionEmpresa"));
			
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jMenuItemCancelarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDepreciacionEmpresa"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoDepreciacionEmpresa"));		
		
		
		this.jButtonCerrarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"CerrarTipoDepreciacionEmpresa"));
		
		
		this.jButtonCerrarToolBarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoDepreciacionEmpresa"));
			
		this.jMenuItemCerrarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoDepreciacionEmpresa"));
			
		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jMenuItemDetalleCerrarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDepreciacionEmpresa"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonGuardarCambiosTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoDepreciacionEmpresa"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonGuardarCambiosToolBarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDepreciacionEmpresa"));
		}
		
		this.jButtonCopiarToolBarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoDepreciacionEmpresa"));
			
		this.jButtonVerFormToolBarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoDepreciacionEmpresa"));
		
		this.jMenuItemGuardarCambiosTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoDepreciacionEmpresa"));
			
		this.jMenuItemCopiarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoDepreciacionEmpresa"));		
		
		this.jMenuItemVerFormTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoDepreciacionEmpresa"));		
		
		
		this.jButtonGuardarCambiosTablaTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDepreciacionEmpresa"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoDepreciacionEmpresa"));
			
		this.jMenuItemGuardarCambiosTablaTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDepreciacionEmpresa"));		
		
		
		
		this.jButtonRecargarInformacionTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoDepreciacionEmpresa"));
					
		this.jButtonRecargarInformacionToolBarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoDepreciacionEmpresa"));
		
		this.jMenuItemRecargarInformacionTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoDepreciacionEmpresa"));		
		
		
		
		this.jButtonAnterioresTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"AnterioresTipoDepreciacionEmpresa"));
		
		
		this.jButtonAnterioresToolBarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoDepreciacionEmpresa"));
		
		this.jMenuItemAnterioresTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoDepreciacionEmpresa"));		
		
		
		this.jButtonSiguientesTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"SiguientesTipoDepreciacionEmpresa"));
		
		
		this.jButtonSiguientesToolBarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoDepreciacionEmpresa"));
			
		this.jMenuItemSiguientesTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoDepreciacionEmpresa"));
			
		this.jMenuItemAbrirOrderByTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoDepreciacionEmpresa"));
			
		this.jMenuItemMostrarOcultarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoDepreciacionEmpresa"));
			
		this.jMenuItemDetalleAbrirOrderByTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoDepreciacionEmpresa"));
			
		this.jMenuItemDetalleMostarOcultarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoDepreciacionEmpresa"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoDepreciacionEmpresa"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoDepreciacionEmpresa"));
			
		this.jMenuItemNuevoGuardarCambiosTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoDepreciacionEmpresa"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoDepreciacionEmpresa.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoDepreciacionEmpresa"));

		this.jCheckBoxSeleccionadosTipoDepreciacionEmpresa.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoDepreciacionEmpresa"));
		
		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jComboBoxTiposAccionesFormularioTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDepreciacionEmpresa"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoDepreciacionEmpresa"));
			
		this.jComboBoxTiposAccionesTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoDepreciacionEmpresa"));
					
		this.jComboBoxTiposSeleccionarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoDepreciacionEmpresa"));
			
		this.jTextFieldValorCampoGeneralTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoDepreciacionEmpresa"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonidTipoDepreciacionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDepreciacionEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonid_empresaTipoDepreciacionEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoDepreciacionEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonid_empresaTipoDepreciacionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoDepreciacionEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtoncodigoTipoDepreciacionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDepreciacionEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonnombreTipoDepreciacionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDepreciacionEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtones_linea_rectaTipoDepreciacionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"es_linea_rectaTipoDepreciacionEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtones_mensualTipoDepreciacionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"es_mensualTipoDepreciacionEmpresaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa!=null) {
				this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDepreciacionEmpresa"));
				this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDepreciacionEmpresa"));
				this.jInternalFrameReporteDinamicoTipoDepreciacionEmpresa.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDepreciacionEmpresa"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDepreciacionEmpresa"));				
			//this.jButtonGenerarReporteDinamicoTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDepreciacionEmpresa"));
			//this.jButtonGenerarExcelReporteDinamicoTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDepreciacionEmpresa"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoDepreciacionEmpresa!=null) {
				this.jInternalFrameImportacionTipoDepreciacionEmpresa.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDepreciacionEmpresa"));
				this.jInternalFrameImportacionTipoDepreciacionEmpresa.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDepreciacionEmpresa"));
				this.jInternalFrameImportacionTipoDepreciacionEmpresa.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDepreciacionEmpresa"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoDepreciacionEmpresa"));
			
			this.jButtonAbrirOrderByToolBarTipoDepreciacionEmpresa.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoDepreciacionEmpresa"));			
			
			if(this.jInternalFrameOrderByTipoDepreciacionEmpresa!=null) {
				this.jInternalFrameOrderByTipoDepreciacionEmpresa.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDepreciacionEmpresa"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jTabbedPaneRelacionesTipoDepreciacionEmpresa.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDepreciacionEmpresa"));
		
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
            		closingInternalFrameTipoDepreciacionEmpresa();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoDepreciacionEmpresa = (JInternalFrameBase)event.getSource();
	            	
	            TipoDepreciacionEmpresaBeanSwingJInternalFrame jInternalFrameParent=(TipoDepreciacionEmpresaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDepreciacionEmpresa.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoDepreciacionEmpresaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoDepreciacionEmpresa.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoDepreciacionEmpresaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoDepreciacionEmpresa.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoDepreciacionEmpresa.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDepreciacionEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDepreciacionEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDepreciacionEmpresaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoDepreciacionEmpresa";
		inputMap = this.jButtonNuevoTipoDepreciacionEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoDepreciacionEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDepreciacionEmpresaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDepreciacionEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDepreciacionEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDepreciacionEmpresaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoDepreciacionEmpresa";
		inputMap = this.jButtonNuevoRelacionesTipoDepreciacionEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoDepreciacionEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDepreciacionEmpresaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoDepreciacionEmpresa";
		inputMap = this.jButtonModificarTipoDepreciacionEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoDepreciacionEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoDepreciacionEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoDepreciacionEmpresa";
		inputMap = this.jButtonActualizarTipoDepreciacionEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoDepreciacionEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoDepreciacionEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoDepreciacionEmpresa";
		inputMap = this.jButtonEliminarTipoDepreciacionEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoDepreciacionEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoDepreciacionEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoDepreciacionEmpresa";
		inputMap = this.jButtonCancelarTipoDepreciacionEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoDepreciacionEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoDepreciacionEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoDepreciacionEmpresa";
		inputMap = this.jButtonCerrarTipoDepreciacionEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoDepreciacionEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoDepreciacionEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonGuardarCambiosTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoDepreciacionEmpresa";
		inputMap = this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonGuardarCambiosTipoDepreciacionEmpresa.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonGuardarCambiosTipoDepreciacionEmpresa.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoDepreciacionEmpresaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoDepreciacionEmpresa.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoDepreciacionEmpresaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoDepreciacionEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoDepreciacionEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoDepreciacionEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoDepreciacionEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoDepreciacionEmpresa.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoDepreciacionEmpresaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonidTipoDepreciacionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDepreciacionEmpresaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonid_empresaTipoDepreciacionEmpresaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoDepreciacionEmpresaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonid_empresaTipoDepreciacionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoDepreciacionEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtoncodigoTipoDepreciacionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDepreciacionEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtonnombreTipoDepreciacionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDepreciacionEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtones_linea_rectaTipoDepreciacionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"es_linea_rectaTipoDepreciacionEmpresaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jButtones_mensualTipoDepreciacionEmpresaBusqueda.addActionListener(new ButtonActionListener(this,"es_mensualTipoDepreciacionEmpresaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoDepreciacionEmpresa.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoDepreciacionEmpresaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoDepreciacionEmpresaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoDepreciacionEmpresa.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoDepreciacionEmpresa(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas()) {
					tipodepreciacionempresaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:tipodepreciacionempresas) {
					tipodepreciacionempresaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoDepreciacionEmpresaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDepreciacionEmpresa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas()) {
						tipodepreciacionempresaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:tipodepreciacionempresas) {
						tipodepreciacionempresaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas()) {
					
						if(sTipoSeleccionar.equals(TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESLINEARECTA)) {
							existe=true;
							tipodepreciacionempresaAux.setes_linea_recta(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESMENSUAL)) {
							existe=true;
							tipodepreciacionempresaAux.setes_mensual(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:tipodepreciacionempresas) {
						
						if(sTipoSeleccionar.equals(TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESLINEARECTA)) {
							existe=true;
							tipodepreciacionempresaAux.setes_linea_recta(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESMENSUAL)) {
							existe=true;
							tipodepreciacionempresaAux.setes_mensual(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDepreciacionEmpresa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDepreciacionEmpresa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDepreciacionEmpresa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDepreciacionEmpresa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoDepreciacionEmpresaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDepreciacionEmpresa(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoDepreciacionEmpresa.getSelectedRows();
			
			TipoDepreciacionEmpresa tipodepreciacionempresaLocal=new TipoDepreciacionEmpresa();
			
			//this.seleccionarTodosTipoDepreciacionEmpresa(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodepreciacionempresaLocal =(TipoDepreciacionEmpresa) this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas().toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipodepreciacionempresaLocal =(TipoDepreciacionEmpresa) this.tipodepreciacionempresas.toArray()[this.jTableDatosTipoDepreciacionEmpresa.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipodepreciacionempresaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas()) {
						tipodepreciacionempresaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:tipodepreciacionempresas) {
						tipodepreciacionempresaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoDepreciacionEmpresa(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDepreciacionEmpresa.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDepreciacionEmpresa.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDepreciacionEmpresa,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoDepreciacionEmpresaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoDepreciacionEmpresaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoDepreciacionEmpresaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoDepreciacionEmpresa(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoDepreciacionEmpresa.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas()) {
				
						if(sTipoSeleccionar.equals(TipoDepreciacionEmpresaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipodepreciacionempresaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoDepreciacionEmpresaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodepreciacionempresaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:tipodepreciacionempresas) {
					
						if(sTipoSeleccionar.equals(TipoDepreciacionEmpresaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipodepreciacionempresaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoDepreciacionEmpresaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodepreciacionempresaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDepreciacionEmpresa(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoDepreciacionEmpresaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoDepreciacionEmpresa(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoDepreciacionEmpresa=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoDepreciacionEmpresa.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jComboBoxTiposAccionesFormularioTipoDepreciacionEmpresa.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoDepreciacionEmpresa) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoDepreciacionEmpresa(conSplash);
				
					this.generarReporteTipoDepreciacionEmpresasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDepreciacionEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jComboBoxTiposAccionesFormularioTipoDepreciacionEmpresa.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoDepreciacionEmpresasSeleccionados();
				//this.jComboBoxTiposAccionesTipoDepreciacionEmpresa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDepreciacionEmpresasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoDepreciacionEmpresa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDepreciacionEmpresasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoDepreciacionEmpresa.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDepreciacionEmpresa();
				
				this.exportarTipoDepreciacionEmpresasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDepreciacionEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jComboBoxTiposAccionesFormularioTipoDepreciacionEmpresa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoDepreciacionEmpresas();
				//this.importarTipoDepreciacionEmpresas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDepreciacionEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jComboBoxTiposAccionesFormularioTipoDepreciacionEmpresa.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDepreciacionEmpresa();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoDepreciacionEmpresasSeleccionados();
				//this.jComboBoxTiposAccionesTipoDepreciacionEmpresa.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Depreciacion Empresa", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoDepreciacionEmpresa();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoDepreciacionEmpresa)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoDepreciacionEmpresa(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Depreciacion Empresa",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDepreciacionEmpresa.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jComboBoxTiposAccionesFormularioTipoDepreciacionEmpresa.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoDepreciacionEmpresa();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoDepreciacionEmpresa(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoDepreciacionEmpresaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoDepreciacionEmpresa();
			
			if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoDepreciacionEmpresa> tipodepreciacionempresasSeleccionados=new ArrayList<TipoDepreciacionEmpresa>();		
			TipoDepreciacionEmpresa tipodepreciacionempresa=new TipoDepreciacionEmpresa();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoDepreciacionEmpresa(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoDepreciacionEmpresa.getSelectedItem();
			
			
			
			
			tipodepreciacionempresasSeleccionados=this.getTipoDepreciacionEmpresasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipodepreciacionempresasSeleccionados.size()==1) {
				for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:tipodepreciacionempresasSeleccionados) {
					tipodepreciacionempresa=tipodepreciacionempresaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Activo Fijo")) {
					jButtonDetalleActivoFijoActionPerformed(null,rowIndex,true,false,tipodepreciacionempresa);
				}
				else if(this.sTipoRelacion.equals("Depreciacion Activo Fijo")) {
					jButtonDepreciacionActivoFijoActionPerformed(null,rowIndex,true,false,tipodepreciacionempresa);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoDepreciacionEmpresa();
			
      		//this.finishProcessTipoDepreciacionEmpresa(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoDepreciacionEmpresaReturnGeneral() throws Exception {
		if(this.tipodepreciacionempresaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipodepreciacionempresaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipodepreciacionempresaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipodepreciacionempresaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipodepreciacionempresaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipodepreciacionempresaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoDepreciacionEmpresa(false);
		}
		
		if(this.tipodepreciacionempresaReturnGeneral.getConRetornoLista() || this.tipodepreciacionempresaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipodepreciacionempresaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodepreciacionempresaLogic.setTipoDepreciacionEmpresas(this.tipodepreciacionempresaReturnGeneral.getTipoDepreciacionEmpresas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipodepreciacionempresaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodepreciacionempresaLogic.setTipoDepreciacionEmpresa(this.tipodepreciacionempresaReturnGeneral.getTipoDepreciacionEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoDepreciacionEmpresa(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoDepreciacionEmpresa() throws Exception {
		
		
	}
	
	public ArrayList<TipoDepreciacionEmpresa> getTipoDepreciacionEmpresasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoDepreciacionEmpresa> tipodepreciacionempresasSeleccionados=new ArrayList<TipoDepreciacionEmpresa>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoDepreciacionEmpresa) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas()) {
					if(tipodepreciacionempresaAux.getIsSelected()) {
						tipodepreciacionempresasSeleccionados.add(tipodepreciacionempresaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:this.tipodepreciacionempresas) {
					if(tipodepreciacionempresaAux.getIsSelected()) {
						tipodepreciacionempresasSeleccionados.add(tipodepreciacionempresaAux);				
					}
				}
			}
			
			if(tipodepreciacionempresasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipodepreciacionempresasSeleccionados.addAll(this.tipodepreciacionempresaLogic.getTipoDepreciacionEmpresas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipodepreciacionempresasSeleccionados.addAll(this.tipodepreciacionempresas);				
					}
				}
			}
		} else {
			tipodepreciacionempresasSeleccionados.add(this.tipodepreciacionempresa);
		}
		
		return tipodepreciacionempresasSeleccionados;
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
	
	public void generarReporteTipoDepreciacionEmpresasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoDepreciacionEmpresasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoDepreciacionEmpresasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDepreciacionEmpresasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDepreciacionEmpresasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoDepreciacionEmpresasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Depreciacion Empresa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoDepreciacionEmpresasSeleccionados() throws Exception {
		ArrayList<TipoDepreciacionEmpresa> tipodepreciacionempresasSeleccionados=new ArrayList<TipoDepreciacionEmpresa>();		
		
		tipodepreciacionempresasSeleccionados=this.getTipoDepreciacionEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoDepreciacionEmpresas("Todos",tipodepreciacionempresasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoDepreciacionEmpresasSeleccionados() throws Exception {
		ArrayList<TipoDepreciacionEmpresa> tipodepreciacionempresasSeleccionados=new ArrayList<TipoDepreciacionEmpresa>();		
		
		tipodepreciacionempresasSeleccionados=this.getTipoDepreciacionEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoDepreciacionEmpresas("Todos",tipodepreciacionempresasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoDepreciacionEmpresasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoDepreciacionEmpresa> tipodepreciacionempresasSeleccionados=new ArrayList<TipoDepreciacionEmpresa>();
		
		tipodepreciacionempresasSeleccionados=this.getTipoDepreciacionEmpresasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoDepreciacionEmpresas("Todos",tipodepreciacionempresasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoDepreciacionEmpresasSeleccionados() throws Exception {
		ArrayList<TipoDepreciacionEmpresa> tipodepreciacionempresasSeleccionados=new ArrayList<TipoDepreciacionEmpresa>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoDepreciacionEmpresa();
		
		
		tipodepreciacionempresasSeleccionados=this.getTipoDepreciacionEmpresasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoDepreciacionEmpresa();
		
		
		//this.generarReporteTipoDepreciacionEmpresas("Todos",tipodepreciacionempresasSeleccionados ,tipodepreciacionempresaImplementable,tipodepreciacionempresaImplementableHome);
	}
	
	public void mostrarImportacionTipoDepreciacionEmpresas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoDepreciacionEmpresa();
		
		this.abrirFrameImportacionTipoDepreciacionEmpresa();		
		
			
		//this.generarReporteTipoDepreciacionEmpresas("Todos",tipodepreciacionempresasSeleccionados ,tipodepreciacionempresaImplementable,tipodepreciacionempresaImplementableHome);
	}
	
	public void importarTipoDepreciacionEmpresas() throws Exception {		
	
	}
	
	public void exportarTipoDepreciacionEmpresasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoDepreciacionEmpresasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoDepreciacionEmpresasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoDepreciacionEmpresasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Depreciacion Empresa",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoDepreciacionEmpresasSeleccionados() throws Exception {
		ArrayList<TipoDepreciacionEmpresa> tipodepreciacionempresasSeleccionados=new ArrayList<TipoDepreciacionEmpresa>();		
		
		tipodepreciacionempresasSeleccionados=this.getTipoDepreciacionEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodepreciacionempresa."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoDepreciacionEmpresa(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:tipodepreciacionempresasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoDepreciacionEmpresa(tipodepreciacionempresaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipodepreciacionempresaAux.setsDetalleGeneralEntityReporte(tipodepreciacionempresaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Depreciacion Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoDepreciacionEmpresa(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoDepreciacionEmpresaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDepreciacionEmpresaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDepreciacionEmpresaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDepreciacionEmpresaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDepreciacionEmpresaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESLINEARECTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESMENSUAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoDepreciacionEmpresa(TipoDepreciacionEmpresa tipodepreciacionempresa,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipodepreciacionempresa.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodepreciacionempresa.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodepreciacionempresa.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodepreciacionempresa.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodepreciacionempresa.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodepreciacionempresa.getes_linea_recta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodepreciacionempresa.getes_mensual().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoDepreciacionEmpresasSeleccionados() throws Exception {
		ArrayList<TipoDepreciacionEmpresa> tipodepreciacionempresasSeleccionados=new ArrayList<TipoDepreciacionEmpresa>();		
		
		tipodepreciacionempresasSeleccionados=this.getTipoDepreciacionEmpresasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodepreciacionempresa.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoDepreciacionEmpresas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoDepreciacionEmpresa(row);				
				iRow++;
			}				
			
			for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:tipodepreciacionempresasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoDepreciacionEmpresa(tipodepreciacionempresaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Depreciacion Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoDepreciacionEmpresasSeleccionados() throws Exception {
		ArrayList<TipoDepreciacionEmpresa> tipodepreciacionempresasSeleccionados=new ArrayList<TipoDepreciacionEmpresa>();		
		
		tipodepreciacionempresasSeleccionados=this.getTipoDepreciacionEmpresasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodepreciacionempresa.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipodepreciacionempresas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipodepreciacionempresa");
			//elementRoot.appendChild(element);
		
			for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:tipodepreciacionempresasSeleccionados) {
				element = document.createElement("tipodepreciacionempresa");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoDepreciacionEmpresa(tipodepreciacionempresaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Depreciacion Empresa",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoDepreciacionEmpresa(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDepreciacionEmpresaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDepreciacionEmpresaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoDepreciacionEmpresaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDepreciacionEmpresaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDepreciacionEmpresaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESLINEARECTA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESMENSUAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoDepreciacionEmpresa(TipoDepreciacionEmpresa tipodepreciacionempresa,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipodepreciacionempresa.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodepreciacionempresa.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodepreciacionempresa.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodepreciacionempresa.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodepreciacionempresa.getes_linea_recta());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodepreciacionempresa.getes_mensual());				
	}
	
	public void setFilaDatosExportarXmlTipoDepreciacionEmpresa(TipoDepreciacionEmpresa tipodepreciacionempresa,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoDepreciacionEmpresaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipodepreciacionempresa.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoDepreciacionEmpresaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipodepreciacionempresa.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoDepreciacionEmpresaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipodepreciacionempresa.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoDepreciacionEmpresaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipodepreciacionempresa.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoDepreciacionEmpresaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipodepreciacionempresa.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementes_linea_recta = document.createElement(TipoDepreciacionEmpresaConstantesFunciones.ESLINEARECTA);
		elementes_linea_recta.appendChild(document.createTextNode(tipodepreciacionempresa.getes_linea_recta().toString().trim()));
		element.appendChild(elementes_linea_recta);

		Element elementes_mensual = document.createElement(TipoDepreciacionEmpresaConstantesFunciones.ESMENSUAL);
		elementes_mensual.appendChild(document.createTextNode(tipodepreciacionempresa.getes_mensual().toString().trim()));
		element.appendChild(elementes_mensual);
	}
	
	public void generarReporteGroupGenericoTipoDepreciacionEmpresasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoDepreciacionEmpresa> tipodepreciacionempresasSeleccionados=new ArrayList<TipoDepreciacionEmpresa>();
		
		tipodepreciacionempresasSeleccionados=this.getTipoDepreciacionEmpresasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoDepreciacionEmpresa(tipodepreciacionempresasSeleccionados);
		
		this.generarReporteTipoDepreciacionEmpresas("Todos",tipodepreciacionempresasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoDepreciacionEmpresa(ArrayList<TipoDepreciacionEmpresa> tipodepreciacionempresasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoDepreciacionEmpresa tipodepreciacionempresaAux:tipodepreciacionempresasSeleccionados) {
				tipodepreciacionempresaAux.setsDetalleGeneralEntityReporte(tipodepreciacionempresaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoDepreciacionEmpresaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipodepreciacionempresaAux.setsDescripcionGeneralEntityReporte1(tipodepreciacionempresaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoDepreciacionEmpresaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipodepreciacionempresaAux.setsDescripcionGeneralEntityReporte1(tipodepreciacionempresaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoDepreciacionEmpresaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipodepreciacionempresaAux.setsDescripcionGeneralEntityReporte1(tipodepreciacionempresaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESLINEARECTA)) {
					existe=true;
					tipodepreciacionempresaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tipodepreciacionempresaAux.getes_linea_recta()));
				}
				 else if(sTipoSeleccionar.equals(TipoDepreciacionEmpresaConstantesFunciones.LABEL_ESMENSUAL)) {
					existe=true;
					tipodepreciacionempresaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tipodepreciacionempresaAux.getes_mensual()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDepreciacionEmpresaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoDepreciacionEmpresa(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoDepreciacionEmpresa=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoDepreciacionEmpresa=true;
				this.isVisibilidadCeldaGuardarCambiosTipoDepreciacionEmpresa=true;
			}
			
			this.isVisibilidadCeldaModificarTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoDepreciacionEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDepreciacionEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDepreciacionEmpresa=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaModificarTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoDepreciacionEmpresa=true;
			this.isVisibilidadCeldaEliminarTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoDepreciacionEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDepreciacionEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDepreciacionEmpresa=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaModificarTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoDepreciacionEmpresa=true;
			this.isVisibilidadCeldaEliminarTipoDepreciacionEmpresa=true;
			this.isVisibilidadCeldaCancelarTipoDepreciacionEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDepreciacionEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDepreciacionEmpresa=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaModificarTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoDepreciacionEmpresa=true;
			this.isVisibilidadCeldaEliminarTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoDepreciacionEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDepreciacionEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDepreciacionEmpresa=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoDepreciacionEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDepreciacionEmpresa=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDepreciacionEmpresa=true;
			this.isVisibilidadCeldaModificarTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoDepreciacionEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDepreciacionEmpresa=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDepreciacionEmpresa=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaActualizarTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoDepreciacionEmpresa=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDepreciacionEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDepreciacionEmpresa=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaModificarTipoDepreciacionEmpresa=true;
			this.isVisibilidadCeldaActualizarTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaCancelarTipoDepreciacionEmpresa=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDepreciacionEmpresa=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDepreciacionEmpresa=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoDepreciacionEmpresaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoDepreciacionEmpresa=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDepreciacionEmpresa=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDepreciacionEmpresa=true;
		} else {
			this.actualizarEstadoPanelsTipoDepreciacionEmpresa(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoDepreciacionEmpresa=false;
			//this.isVisibilidadCeldaVerFormTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaDuplicarTipoDepreciacionEmpresa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipodepreciacionempresaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDepreciacionEmpresa=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDepreciacionEmpresa=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {
			if(!tipodepreciacionempresaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoDepreciacionEmpresa=false;												
			}
			
			this.jButtonCerrarTipoDepreciacionEmpresa.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDepreciacionEmpresa=false;
		}
		
		if(!this.permiteMantenimiento(this.tipodepreciacionempresa)) {
			this.isVisibilidadCeldaActualizarTipoDepreciacionEmpresa=false;
			this.isVisibilidadCeldaEliminarTipoDepreciacionEmpresa=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDepreciacionEmpresa() {
		this.isVisibilidadCeldaNuevoTipoDepreciacionEmpresa=false;
		this.isVisibilidadCeldaGuardarCambiosTipoDepreciacionEmpresa=false;
	}
	
	public void actualizarEstadoPanelsTipoDepreciacionEmpresa(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDepreciacionEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoDepreciacionEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDepreciacionEmpresa!=null) {
				this.jScrollPanelDatosTipoDepreciacionEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDepreciacionEmpresa!=null) {
				this.jPanelPaginacionTipoDepreciacionEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDepreciacionEmpresa!=null) {
				this.jPanelParametrosReportesTipoDepreciacionEmpresa.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDepreciacionEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoDepreciacionEmpresa.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoDepreciacionEmpresa!=null) {
				this.jScrollPanelDatosTipoDepreciacionEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDepreciacionEmpresa!=null) {
				this.jPanelPaginacionTipoDepreciacionEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDepreciacionEmpresa!=null) {
				this.jPanelParametrosReportesTipoDepreciacionEmpresa.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDepreciacionEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoDepreciacionEmpresa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDepreciacionEmpresa!=null) {
				this.jScrollPanelDatosTipoDepreciacionEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDepreciacionEmpresa!=null) {
				this.jPanelPaginacionTipoDepreciacionEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDepreciacionEmpresa!=null) {
				this.jPanelParametrosReportesTipoDepreciacionEmpresa.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDepreciacionEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoDepreciacionEmpresa.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDepreciacionEmpresa!=null) {
				this.jScrollPanelDatosTipoDepreciacionEmpresa.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDepreciacionEmpresa!=null) {
				this.jPanelPaginacionTipoDepreciacionEmpresa.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDepreciacionEmpresa!=null) {
				this.jPanelParametrosReportesTipoDepreciacionEmpresa.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDepreciacionEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoDepreciacionEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDepreciacionEmpresa!=null) {
				this.jScrollPanelDatosTipoDepreciacionEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDepreciacionEmpresa!=null) {
				this.jPanelPaginacionTipoDepreciacionEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDepreciacionEmpresa!=null) {
				this.jPanelParametrosReportesTipoDepreciacionEmpresa.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDepreciacionEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoDepreciacionEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDepreciacionEmpresa!=null) {
				this.jScrollPanelDatosTipoDepreciacionEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDepreciacionEmpresa!=null) {
				this.jPanelPaginacionTipoDepreciacionEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDepreciacionEmpresa!=null) {
				this.jPanelParametrosReportesTipoDepreciacionEmpresa.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa!=null) {
				this.jScrollPanelDatosEdicionTipoDepreciacionEmpresa.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDepreciacionEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoDepreciacionEmpresa.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDepreciacionEmpresa!=null) {
				this.jScrollPanelDatosTipoDepreciacionEmpresa.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDepreciacionEmpresa!=null) {
				this.jPanelPaginacionTipoDepreciacionEmpresa.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDepreciacionEmpresa!=null) {
				this.jPanelParametrosReportesTipoDepreciacionEmpresa.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoDepreciacionEmpresa!=null) {
					this.jTabbedPaneBusquedasTipoDepreciacionEmpresa.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoDepreciacionEmpresa!=null) {
				this.jPanelParametrosReportesTipoDepreciacionEmpresa.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipodepreciacionempresaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDepreciacionEmpresa!=null) {
				this.jTabbedPaneBusquedasTipoDepreciacionEmpresa.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoDepreciacionEmpresa!=null) {
				this.jPanelParametrosReportesTipoDepreciacionEmpresa.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoDepreciacionEmpresaParaDetalleActivoFijos() throws Exception {
		Boolean isPaginaPopupDetalleActivoFijo=false;

		try {

			if(this.tipodepreciacionempresaSessionBean==null) {
				this.tipodepreciacionempresaSessionBean=new TipoDepreciacionEmpresaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoSessionBean=new DetalleActivoFijoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoSessionBean.setsPathNavegacionActual(tipodepreciacionempresaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleActivoFijo=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleActivoFijo(true);
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleActivoFijo(TipoDepreciacionEmpresaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionTipoDepreciacionEmpresa(true);
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.detalleactivofijoSessionBean.setlidTipoDepreciacionEmpresaActual(this.idTipoDepreciacionEmpresaActual);

			tipodepreciacionempresaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoDepreciacionEmpresa(true);
			tipodepreciacionempresaSessionBean.setlIdTipoDepreciacionEmpresaActualForeignKey(this.idTipoDepreciacionEmpresaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoDepreciacionEmpresaParaDepreciacionActivoFijos() throws Exception {
		Boolean isPaginaPopupDepreciacionActivoFijo=false;

		try {

			if(this.tipodepreciacionempresaSessionBean==null) {
				this.tipodepreciacionempresaSessionBean=new TipoDepreciacionEmpresaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoSessionBean=new DepreciacionActivoFijoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoSessionBean.setsPathNavegacionActual(tipodepreciacionempresaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DepreciacionActivoFijoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDepreciacionActivoFijo=this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDepreciacionActivoFijo(true);
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDepreciacionActivoFijo(TipoDepreciacionEmpresaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionTipoDepreciacionEmpresa(true);
			this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.depreciacionactivofijoSessionBean.setlidTipoDepreciacionEmpresaActual(this.idTipoDepreciacionEmpresaActual);

			tipodepreciacionempresaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoDepreciacionEmpresa(true);
			tipodepreciacionempresaSessionBean.setlIdTipoDepreciacionEmpresaActualForeignKey(this.idTipoDepreciacionEmpresaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoDepreciacionEmpresaSessionBean tipodepreciacionempresaSessionBean=new TipoDepreciacionEmpresaSessionBean();
		
		if(this.tipodepreciacionempresaSessionBean==null) {
			this.tipodepreciacionempresaSessionBean=new TipoDepreciacionEmpresaSessionBean();
		}
		
		this.tipodepreciacionempresaSessionBean.setsUltimaBusquedaTipoDepreciacionEmpresa(this.getsAccionBusqueda());
		this.tipodepreciacionempresaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipodepreciacionempresaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipodepreciacionempresaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoDepreciacionEmpresaSessionBean tipodepreciacionempresaSessionBean=new TipoDepreciacionEmpresaSessionBean();
		
		if(this.tipodepreciacionempresaSessionBean==null) {
			this.tipodepreciacionempresaSessionBean=new TipoDepreciacionEmpresaSessionBean();
		}
		
		if(this.tipodepreciacionempresaSessionBean.getsUltimaBusquedaTipoDepreciacionEmpresa()!=null&&!this.tipodepreciacionempresaSessionBean.getsUltimaBusquedaTipoDepreciacionEmpresa().equals("")) {
			this.setsAccionBusqueda(tipodepreciacionempresaSessionBean.getsUltimaBusquedaTipoDepreciacionEmpresa());
			this.setiNumeroPaginacion(tipodepreciacionempresaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipodepreciacionempresaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipodepreciacionempresaSessionBean.getid_empresa());
				tipodepreciacionempresaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipodepreciacionempresaSessionBean.setsUltimaBusquedaTipoDepreciacionEmpresa("");
		this.tipodepreciacionempresaSessionBean.setiNumeroPaginacion(TipoDepreciacionEmpresaConstantesFunciones.INUMEROPAGINACION);
		this.tipodepreciacionempresaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoDepreciacionEmpresa(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoDepreciacionEmpresa() {
		this.updateBorderResaltarBusquedasFormularioTipoDepreciacionEmpresa();
		this.updateVisibilidadBusquedasFormularioTipoDepreciacionEmpresa();
		this.updateHabilitarBusquedasFormularioTipoDepreciacionEmpresa();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoDepreciacionEmpresa() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoDepreciacionEmpresa.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoDepreciacionEmpresa() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoDepreciacionEmpresa.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoDepreciacionEmpresa() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoDepreciacionEmpresa.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoDepreciacionEmpresa(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoDepreciacionEmpresa.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoDepreciacionEmpresa() throws Exception {

		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoDepreciacionEmpresa();
		this.updateVisibilidadResaltarControlesFormularioTipoDepreciacionEmpresa();
		this.updateHabilitarResaltarControlesFormularioTipoDepreciacionEmpresa();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoDepreciacionEmpresa() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipodepreciacionempresaConstantesFunciones.resaltaridTipoDepreciacionEmpresa!=null && this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) {this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jLabelidTipoDepreciacionEmpresa.setBorder(this.tipodepreciacionempresaConstantesFunciones.resaltaridTipoDepreciacionEmpresa);}
		if(this.tipodepreciacionempresaConstantesFunciones.resaltarid_empresaTipoDepreciacionEmpresa!=null && this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) {this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jComboBoxid_empresaTipoDepreciacionEmpresa.setBorder(this.tipodepreciacionempresaConstantesFunciones.resaltarid_empresaTipoDepreciacionEmpresa);}
		if(this.tipodepreciacionempresaConstantesFunciones.resaltarcodigoTipoDepreciacionEmpresa!=null && this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) {this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jTextFieldcodigoTipoDepreciacionEmpresa.setBorder(this.tipodepreciacionempresaConstantesFunciones.resaltarcodigoTipoDepreciacionEmpresa);}
		if(this.tipodepreciacionempresaConstantesFunciones.resaltarnombreTipoDepreciacionEmpresa!=null && this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) {this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jTextAreanombreTipoDepreciacionEmpresa.setBorder(this.tipodepreciacionempresaConstantesFunciones.resaltarnombreTipoDepreciacionEmpresa);}
		if(this.tipodepreciacionempresaConstantesFunciones.resaltares_linea_rectaTipoDepreciacionEmpresa!=null && this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) {this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jCheckBoxes_linea_rectaTipoDepreciacionEmpresa.setBorderPainted(true);this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jCheckBoxes_linea_rectaTipoDepreciacionEmpresa.setBorder(this.tipodepreciacionempresaConstantesFunciones.resaltares_linea_rectaTipoDepreciacionEmpresa);}
		if(this.tipodepreciacionempresaConstantesFunciones.resaltares_mensualTipoDepreciacionEmpresa!=null && this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) {this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jCheckBoxes_mensualTipoDepreciacionEmpresa.setBorderPainted(true);this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jCheckBoxes_mensualTipoDepreciacionEmpresa.setBorder(this.tipodepreciacionempresaConstantesFunciones.resaltares_mensualTipoDepreciacionEmpresa);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoDepreciacionEmpresa() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) {
	
		//this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jLabelidTipoDepreciacionEmpresa.setVisible(this.tipodepreciacionempresaConstantesFunciones.mostraridTipoDepreciacionEmpresa);
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jPanelidTipoDepreciacionEmpresa.setVisible(this.tipodepreciacionempresaConstantesFunciones.mostraridTipoDepreciacionEmpresa);
		//this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jComboBoxid_empresaTipoDepreciacionEmpresa.setVisible(this.tipodepreciacionempresaConstantesFunciones.mostrarid_empresaTipoDepreciacionEmpresa);
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jPanelid_empresaTipoDepreciacionEmpresa.setVisible(this.tipodepreciacionempresaConstantesFunciones.mostrarid_empresaTipoDepreciacionEmpresa);
		//this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jTextFieldcodigoTipoDepreciacionEmpresa.setVisible(this.tipodepreciacionempresaConstantesFunciones.mostrarcodigoTipoDepreciacionEmpresa);
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jPanelcodigoTipoDepreciacionEmpresa.setVisible(this.tipodepreciacionempresaConstantesFunciones.mostrarcodigoTipoDepreciacionEmpresa);
		//this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jTextAreanombreTipoDepreciacionEmpresa.setVisible(this.tipodepreciacionempresaConstantesFunciones.mostrarnombreTipoDepreciacionEmpresa);
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jPanelnombreTipoDepreciacionEmpresa.setVisible(this.tipodepreciacionempresaConstantesFunciones.mostrarnombreTipoDepreciacionEmpresa);
		//this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jCheckBoxes_linea_rectaTipoDepreciacionEmpresa.setVisible(this.tipodepreciacionempresaConstantesFunciones.mostrares_linea_rectaTipoDepreciacionEmpresa);
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jPaneles_linea_rectaTipoDepreciacionEmpresa.setVisible(this.tipodepreciacionempresaConstantesFunciones.mostrares_linea_rectaTipoDepreciacionEmpresa);
		//this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jCheckBoxes_mensualTipoDepreciacionEmpresa.setVisible(this.tipodepreciacionempresaConstantesFunciones.mostrares_mensualTipoDepreciacionEmpresa);
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jPaneles_mensualTipoDepreciacionEmpresa.setVisible(this.tipodepreciacionempresaConstantesFunciones.mostrares_mensualTipoDepreciacionEmpresa);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoDepreciacionEmpresa() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDepreciacionEmpresa!=null) {
	
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jLabelidTipoDepreciacionEmpresa.setEnabled(this.tipodepreciacionempresaConstantesFunciones.activaridTipoDepreciacionEmpresa);
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jComboBoxid_empresaTipoDepreciacionEmpresa.setEnabled(this.tipodepreciacionempresaConstantesFunciones.activarid_empresaTipoDepreciacionEmpresa);
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jTextFieldcodigoTipoDepreciacionEmpresa.setEnabled(this.tipodepreciacionempresaConstantesFunciones.activarcodigoTipoDepreciacionEmpresa);
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jTextAreanombreTipoDepreciacionEmpresa.setEnabled(this.tipodepreciacionempresaConstantesFunciones.activarnombreTipoDepreciacionEmpresa);
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jCheckBoxes_linea_rectaTipoDepreciacionEmpresa.setEnabled(this.tipodepreciacionempresaConstantesFunciones.activares_linea_rectaTipoDepreciacionEmpresa);
		this.jInternalFrameDetalleFormTipoDepreciacionEmpresa.jCheckBoxes_mensualTipoDepreciacionEmpresa.setEnabled(this.tipodepreciacionempresaConstantesFunciones.activares_mensualTipoDepreciacionEmpresa);
		}
	}
	
		
}