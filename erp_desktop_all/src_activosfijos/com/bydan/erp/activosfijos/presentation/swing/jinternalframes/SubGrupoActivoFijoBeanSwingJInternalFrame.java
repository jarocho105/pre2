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

import com.bydan.erp.activosfijos.util.SubGrupoActivoFijoConstantesFunciones;
import com.bydan.erp.activosfijos.util.SubGrupoActivoFijoParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.SubGrupoActivoFijoParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.SubGrupoActivoFijoBean;
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
public class SubGrupoActivoFijoBeanSwingJInternalFrame extends SubGrupoActivoFijoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(SubGrupoActivoFijoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<SubGrupoActivoFijo> subgrupoactivofijoValidator = new ClassValidator<SubGrupoActivoFijo>(SubGrupoActivoFijo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public SubGrupoActivoFijo subgrupoactivofijo;	
	public SubGrupoActivoFijo subgrupoactivofijoAux;
	public SubGrupoActivoFijo subgrupoactivofijoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public SubGrupoActivoFijo subgrupoactivofijoTotales;
	public Long idSubGrupoActivoFijoActual;
	public Long iIdNuevoSubGrupoActivoFijo=0L;
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

	public String sFinalQueryComboDetalleGrupoActivoFijo="";

	public List<DetalleGrupoActivoFijo> detallegrupoactivofijosForeignKey;

	public List<DetalleGrupoActivoFijo> getdetallegrupoactivofijosForeignKey() {
		return detallegrupoactivofijosForeignKey;
	}

	public void setdetallegrupoactivofijosForeignKey(List<DetalleGrupoActivoFijo> detallegrupoactivofijosForeignKey) {
		this.detallegrupoactivofijosForeignKey = detallegrupoactivofijosForeignKey;
	}

	//OBJETO FK ACTUAL
	public DetalleGrupoActivoFijo detallegrupoactivofijoForeignKey;

	public DetalleGrupoActivoFijo getdetallegrupoactivofijoForeignKey() {
		return detallegrupoactivofijoForeignKey;
	}

	public void setdetallegrupoactivofijoForeignKey(DetalleGrupoActivoFijo detallegrupoactivofijoForeignKey) {
		this.detallegrupoactivofijoForeignKey = detallegrupoactivofijoForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosDetalleActivoFijo=false;

	public Boolean getIsTienePermisosDetalleActivoFijo() {
		return isTienePermisosDetalleActivoFijo;
	}

	public void setIsTienePermisosDetalleActivoFijo(Boolean isTienePermisosDetalleActivoFijo) {
		this.isTienePermisosDetalleActivoFijo= isTienePermisosDetalleActivoFijo;
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
	
	public Boolean isPermisoTodoSubGrupoActivoFijo;
	public Boolean isPermisoNuevoSubGrupoActivoFijo;
	public Boolean isPermisoActualizarSubGrupoActivoFijo;
	public Boolean isPermisoActualizarOriginalSubGrupoActivoFijo;
	public Boolean isPermisoEliminarSubGrupoActivoFijo;
	public Boolean isPermisoGuardarCambiosSubGrupoActivoFijo;
	public Boolean isPermisoConsultaSubGrupoActivoFijo;
	public Boolean isPermisoBusquedaSubGrupoActivoFijo;
	public Boolean isPermisoReporteSubGrupoActivoFijo;
	public Boolean isPermisoPaginacionMedioSubGrupoActivoFijo;
	public Boolean isPermisoPaginacionAltoSubGrupoActivoFijo;
	public Boolean isPermisoPaginacionTodoSubGrupoActivoFijo;
	public Boolean isPermisoCopiarSubGrupoActivoFijo;
	public Boolean isPermisoVerFormSubGrupoActivoFijo;
	public Boolean isPermisoDuplicarSubGrupoActivoFijo;
	public Boolean isPermisoOrdenSubGrupoActivoFijo;
	
	
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
	
	public SubGrupoActivoFijoParameterReturnGeneral subgrupoactivofijoReturnGeneral;
	public SubGrupoActivoFijoParameterReturnGeneral subgrupoactivofijoParameterGeneral;
	
	

	public DetalleActivoFijoLogic detalleactivofijoLogic=null;

	public DetalleActivoFijoLogic getDetalleActivoFijoLogic() {
		return detalleactivofijoLogic;
	}

	public void setDetalleActivoFijoLogic(DetalleActivoFijoLogic detalleactivofijoLogic) {
		this.detalleactivofijoLogic = detalleactivofijoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoSubGrupoActivoFijo=false;
	public Boolean esParaAccionDesdeFormularioSubGrupoActivoFijo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected SubGrupoActivoFijoSessionBeanAdditional subgrupoactivofijoSessionBeanAdditional=null;
	
	public SubGrupoActivoFijoSessionBeanAdditional getSubGrupoActivoFijoSessionBeanAdditional() {
		return this.subgrupoactivofijoSessionBeanAdditional;
	}
	
	public void setSubGrupoActivoFijoSessionBeanAdditional(SubGrupoActivoFijoSessionBeanAdditional subgrupoactivofijoSessionBeanAdditional) {
		try {
			this.subgrupoactivofijoSessionBeanAdditional=subgrupoactivofijoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected SubGrupoActivoFijoBeanSwingJInternalFrameAdditional subgrupoactivofijoBeanSwingJInternalFrameAdditional=null;
	//public class SubGrupoActivoFijoBeanSwingJInternalFrame
	
	public SubGrupoActivoFijoBeanSwingJInternalFrameAdditional getSubGrupoActivoFijoBeanSwingJInternalFrameAdditional() {
		return this.subgrupoactivofijoBeanSwingJInternalFrameAdditional;
	}
	
	public void setSubGrupoActivoFijoBeanSwingJInternalFrameAdditional(SubGrupoActivoFijoBeanSwingJInternalFrameAdditional subgrupoactivofijoBeanSwingJInternalFrameAdditional) {
		try {
			this.subgrupoactivofijoBeanSwingJInternalFrameAdditional=subgrupoactivofijoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public SubGrupoActivoFijoLogic subgrupoactivofijoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public SubGrupoActivoFijo subgrupoactivofijoBean;
	public SubGrupoActivoFijoConstantesFunciones subgrupoactivofijoConstantesFunciones;
	//public SubGrupoActivoFijoParameterReturnGeneral subgrupoactivofijoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public DetalleGrupoActivoFijoLogic detallegrupoactivofijoLogic;
	
	//PARAMETROS
	
	
	//public List<SubGrupoActivoFijo> subgrupoactivofijos;	
	//public List<SubGrupoActivoFijo> subgrupoactivofijosEliminados;
	//public List<SubGrupoActivoFijo> subgrupoactivofijosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoSubGrupoActivoFijo=false;
	public Boolean isVisibilidadCeldaDuplicarSubGrupoActivoFijo=true;
	public Boolean isVisibilidadCeldaCopiarSubGrupoActivoFijo=true;
	public Boolean isVisibilidadCeldaVerFormSubGrupoActivoFijo=true;
	public Boolean isVisibilidadCeldaOrdenSubGrupoActivoFijo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesSubGrupoActivoFijo=false;
	public Boolean isVisibilidadCeldaModificarSubGrupoActivoFijo=false;
	public Boolean isVisibilidadCeldaActualizarSubGrupoActivoFijo=false;
	public Boolean isVisibilidadCeldaEliminarSubGrupoActivoFijo=false;
	public Boolean isVisibilidadCeldaCancelarSubGrupoActivoFijo=false;
	public Boolean isVisibilidadCeldaGuardarSubGrupoActivoFijo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosSubGrupoActivoFijo=false;	
	
	
	public Boolean isVisibilidadFK_IdDetalleGrupoActivoFijo=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoSubGrupoActivoFijo() {
		return this.iIdNuevoSubGrupoActivoFijo;
	}

	public void setiIdNuevoSubGrupoActivoFijo(Long iIdNuevoSubGrupoActivoFijo) {
		this.iIdNuevoSubGrupoActivoFijo = iIdNuevoSubGrupoActivoFijo;
	}
	
	public Long getidSubGrupoActivoFijoActual() {
		return this.idSubGrupoActivoFijoActual;
	}

	public void setidSubGrupoActivoFijoActual(Long idSubGrupoActivoFijoActual) {
		this.idSubGrupoActivoFijoActual = idSubGrupoActivoFijoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public SubGrupoActivoFijo getsubgrupoactivofijo() {
		return this.subgrupoactivofijo;
	}

	public void setsubgrupoactivofijo(SubGrupoActivoFijo subgrupoactivofijo) {
		this.subgrupoactivofijo = subgrupoactivofijo;
	}
	
	public SubGrupoActivoFijo getsubgrupoactivofijoAux() {
		return this.subgrupoactivofijoAux;
	}

	public void setsubgrupoactivofijoAux(SubGrupoActivoFijo subgrupoactivofijoAux) {
		this.subgrupoactivofijoAux = subgrupoactivofijoAux;
	}				
	
	public SubGrupoActivoFijo getsubgrupoactivofijoAnterior() {
		return this.subgrupoactivofijoAnterior;
	}

	public void setsubgrupoactivofijoAnterior(SubGrupoActivoFijo subgrupoactivofijoAnterior) {
		this.subgrupoactivofijoAnterior = subgrupoactivofijoAnterior;
	}	
	
	public SubGrupoActivoFijo getsubgrupoactivofijoTotales() {
		return this.subgrupoactivofijoTotales;
	}

	public void setsubgrupoactivofijoTotales(SubGrupoActivoFijo subgrupoactivofijoTotales) {
		this.subgrupoactivofijoTotales = subgrupoactivofijoTotales;
	}	
	
	public SubGrupoActivoFijo getsubgrupoactivofijoBean() {
		return this.subgrupoactivofijoBean;
	}

	public void setsubgrupoactivofijoBean(SubGrupoActivoFijo subgrupoactivofijoBean) {
		this.subgrupoactivofijoBean = subgrupoactivofijoBean;
	}	
	
	public SubGrupoActivoFijoParameterReturnGeneral getsubgrupoactivofijoReturnGeneral() {
		return this.subgrupoactivofijoReturnGeneral;
	}

	public void setsubgrupoactivofijoReturnGeneral(SubGrupoActivoFijoParameterReturnGeneral subgrupoactivofijoReturnGeneral) {
		this.subgrupoactivofijoReturnGeneral = subgrupoactivofijoReturnGeneral;
	}	
	
	
	public Long id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo=-1L;

	public Long getid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo() {
		return this.id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo;
	}

	public void setid_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo(Long id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo) {
		this.id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo = id_detalle_grupo_activo_fijoFK_IdDetalleGrupoActivoFijo;
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
	
	
	public SubGrupoActivoFijoLogic getSubGrupoActivoFijoLogic()	{		
		return subgrupoactivofijoLogic;
	}

	public void setSubGrupoActivoFijoLogic(SubGrupoActivoFijoLogic subgrupoactivofijoLogic) {
		this.subgrupoactivofijoLogic = subgrupoactivofijoLogic;
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
	
	public Boolean getIsEsNuevoSubGrupoActivoFijo() {
		return isEsNuevoSubGrupoActivoFijo;
	}

	public void setIsEsNuevoSubGrupoActivoFijo(Boolean isEsNuevoSubGrupoActivoFijo) {
		this.isEsNuevoSubGrupoActivoFijo = isEsNuevoSubGrupoActivoFijo;
	}

	public Boolean getEsParaAccionDesdeFormularioSubGrupoActivoFijo() {
		return esParaAccionDesdeFormularioSubGrupoActivoFijo;
	}
	
	public void setEsParaAccionDesdeFormularioSubGrupoActivoFijo(Boolean esParaAccionDesdeFormularioSubGrupoActivoFijo) {
		this.esParaAccionDesdeFormularioSubGrupoActivoFijo = esParaAccionDesdeFormularioSubGrupoActivoFijo;
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

			if(this.subgrupoactivofijoSessionBean==null) {
				this.subgrupoactivofijoSessionBean=new SubGrupoActivoFijoSessionBean();
			}

			if(!this.subgrupoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(subgrupoactivofijoSessionBean.getlidEmpresaActual());
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

	public void cargarCombosDetalleGrupoActivoFijosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.detallegrupoactivofijosForeignKey=new ArrayList<DetalleGrupoActivoFijo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			DetalleGrupoActivoFijoLogic detallegrupoactivofijoLogic=new DetalleGrupoActivoFijoLogic();

			//detallegrupoactivofijoLogic.getDetalleGrupoActivoFijoDataAccess().setIsForForeingKeyData(true);

			if(this.subgrupoactivofijoSessionBean==null) {
				this.subgrupoactivofijoSessionBean=new SubGrupoActivoFijoSessionBean();
			}

			if(!this.subgrupoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//detallegrupoactivofijoLogic.getDetalleGrupoActivoFijoDataAccess().setIsForForeingKeyData(true);

					detallegrupoactivofijoLogic.getTodosDetalleGrupoActivoFijosWithConnection(sFinalQuery,new Pagination());

					this.detallegrupoactivofijosForeignKey=detallegrupoactivofijoLogic.getDetalleGrupoActivoFijos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaDetalleGrupoActivoFijo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallegrupoactivofijoLogic.getEntityWithConnection(subgrupoactivofijoSessionBean.getlidDetalleGrupoActivoFijoActual());
					this.detallegrupoactivofijosForeignKey.add(detallegrupoactivofijoLogic.getDetalleGrupoActivoFijo());
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

					if(this.subgrupoactivofijo!=null) {
						this.subgrupoactivofijo.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {
						this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_empresaSubGrupoActivoFijo.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaSubGrupoActivoFijo.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_empresaSubGrupoActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_empresaSubGrupoActivoFijo.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaSubGrupoActivoFijoGenerico)throws Exception
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
				jComboBoxid_empresaSubGrupoActivoFijoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaSubGrupoActivoFijoGenerico!=null && jComboBoxid_empresaSubGrupoActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_empresaSubGrupoActivoFijoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualDetalleGrupoActivoFijoForeignKey(Long idDetalleGrupoActivoFijoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			DetalleGrupoActivoFijo  detallegrupoactivofijoTemp=null;

			for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:detallegrupoactivofijosForeignKey) {
				if(detallegrupoactivofijoAux.getId()!=null && detallegrupoactivofijoAux.getId().equals(idDetalleGrupoActivoFijoSeleccionado)) {
					detallegrupoactivofijoTemp=detallegrupoactivofijoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(detallegrupoactivofijoTemp!=null) {

					if(this.subgrupoactivofijo!=null) {
						this.subgrupoactivofijo.setDetalleGrupoActivoFijo(detallegrupoactivofijoTemp);
					}

					if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {
						this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijo.setSelectedItem(detallegrupoactivofijoTemp);
					}
				} else {
					//jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijo.setSelectedItem(detallegrupoactivofijoTemp);
					if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {
						if(this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijo.getItemCount()>0) {
							this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijo.setSelectedIndex(0);
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

	public String getActualDetalleGrupoActivoFijoForeignKeyDescripcion(Long idDetalleGrupoActivoFijoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			DetalleGrupoActivoFijo  detallegrupoactivofijoTemp=null;

			for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:detallegrupoactivofijosForeignKey) {
				if(detallegrupoactivofijoAux.getId()!=null && detallegrupoactivofijoAux.getId().equals(idDetalleGrupoActivoFijoSeleccionado)) {
					detallegrupoactivofijoTemp=detallegrupoactivofijoAux;
					break;
				}
			}


			sDescripcion=DetalleGrupoActivoFijoConstantesFunciones.getDetalleGrupoActivoFijoDescripcion(detallegrupoactivofijoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualDetalleGrupoActivoFijoForeignKeyGenerico(Long idDetalleGrupoActivoFijoSeleccionado,JComboBox jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijoGenerico)throws Exception
	{
		try
		{
			DetalleGrupoActivoFijo  detallegrupoactivofijoTemp=null;

			for(DetalleGrupoActivoFijo detallegrupoactivofijoAux:detallegrupoactivofijosForeignKey) {
				if(detallegrupoactivofijoAux.getId()!=null && detallegrupoactivofijoAux.getId().equals(idDetalleGrupoActivoFijoSeleccionado)) {
					detallegrupoactivofijoTemp=detallegrupoactivofijoAux;
					break;
				}
			}

			if(detallegrupoactivofijoTemp!=null) {
				jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijoGenerico.setSelectedItem(detallegrupoactivofijoTemp);
			} else {
				if(jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijoGenerico!=null && jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijoGenerico.getItemCount()>0) {
					jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(SubGrupoActivoFijo subgrupoactivofijo,JComboBox jComboBoxid_empresaSubGrupoActivoFijoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaSubGrupoActivoFijoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_empresaSubGrupoActivoFijo.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaSubGrupoActivoFijoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				subgrupoactivofijo.setid_empresa(empresaAux.getId());
				subgrupoactivofijo.setempresa_descripcion(SubGrupoActivoFijoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				subgrupoactivofijo.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarDetalleGrupoActivoFijoForeignKey(SubGrupoActivoFijo subgrupoactivofijo,JComboBox jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijoGenerico)throws Exception
	{
		try
		{
			DetalleGrupoActivoFijo  detallegrupoactivofijoAux=new DetalleGrupoActivoFijo();

			if(jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijoGenerico==null) {
				detallegrupoactivofijoAux=(DetalleGrupoActivoFijo)this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijo.getSelectedItem();
			} else {
				detallegrupoactivofijoAux=(DetalleGrupoActivoFijo)jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijoGenerico.getSelectedItem();
			}

			if(detallegrupoactivofijoAux!=null && detallegrupoactivofijoAux.getId()!=null) {
				subgrupoactivofijo.setid_detalle_grupo_activo_fijo(detallegrupoactivofijoAux.getId());
				subgrupoactivofijo.setdetallegrupoactivofijo_descripcion(SubGrupoActivoFijoConstantesFunciones.getDetalleGrupoActivoFijoDescripcion(detallegrupoactivofijoAux));
				subgrupoactivofijo.setDetalleGrupoActivoFijo(detallegrupoactivofijoAux);			}
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

					if(!SubGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) { 
							this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_empresaSubGrupoActivoFijo.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_empresaSubGrupoActivoFijo.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) { 
					}

					if(!SubGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameDetalleGrupoActivoFijosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingDetalleGrupoActivoFijo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!SubGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) { 
							this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijo.removeAllItems();

							for(DetalleGrupoActivoFijo detallegrupoactivofijo:this.detallegrupoactivofijosForeignKey) {
								this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijo.addItem(detallegrupoactivofijo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) { 
					}

					if(!SubGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {
							this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_empresaSubGrupoActivoFijo.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {
							this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_empresaSubGrupoActivoFijo.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameDetalleGrupoActivoFijoForeignKey(DetalleGrupoActivoFijo detallegrupoactivofijo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {
							this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijo.setSelectedItem(detallegrupoactivofijo);
						}
					} else {
						if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {
							this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijo.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesSubGrupoActivoFijo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			SubGrupoActivoFijoConstantesFunciones.refrescarForeignKeysDescripcionesSubGrupoActivoFijo(this.subgrupoactivofijoLogic.getSubGrupoActivoFijos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			SubGrupoActivoFijoConstantesFunciones.refrescarForeignKeysDescripcionesSubGrupoActivoFijo(this.subgrupoactivofijos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(DetalleGrupoActivoFijo.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//subgrupoactivofijoLogic.setSubGrupoActivoFijos(this.subgrupoactivofijos);
			subgrupoactivofijoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public SubGrupoActivoFijoParameterReturnGeneral getSubGrupoActivoFijoParameterGeneral() {
		return this.subgrupoactivofijoParameterGeneral;
	}
	
	public void setSubGrupoActivoFijoParameterGeneral(SubGrupoActivoFijoParameterReturnGeneral subgrupoactivofijoParameterGeneral) {
		this.subgrupoactivofijoParameterGeneral = subgrupoactivofijoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoSubGrupoActivoFijo() {
		return isPermisoTodoSubGrupoActivoFijo;
	}

	public void setIsPermisoTodoSubGrupoActivoFijo(Boolean isPermisoTodoSubGrupoActivoFijo) {
		this.isPermisoTodoSubGrupoActivoFijo = isPermisoTodoSubGrupoActivoFijo;
	}

	public Boolean getIsPermisoNuevoSubGrupoActivoFijo() {
		return isPermisoNuevoSubGrupoActivoFijo;
	}

	public void setIsPermisoNuevoSubGrupoActivoFijo(Boolean isPermisoNuevoSubGrupoActivoFijo) {
		this.isPermisoNuevoSubGrupoActivoFijo = isPermisoNuevoSubGrupoActivoFijo;
	}

	public Boolean getIsPermisoActualizarSubGrupoActivoFijo() {
		return isPermisoActualizarSubGrupoActivoFijo;
	}

	public void setIsPermisoActualizarSubGrupoActivoFijo(Boolean isPermisoActualizarSubGrupoActivoFijo) {
		this.isPermisoActualizarSubGrupoActivoFijo = isPermisoActualizarSubGrupoActivoFijo;
	}

	public Boolean getIsPermisoEliminarSubGrupoActivoFijo() {
		return isPermisoEliminarSubGrupoActivoFijo;
	}

	public void setIsPermisoEliminarSubGrupoActivoFijo(Boolean isPermisoEliminarSubGrupoActivoFijo) {
		this.isPermisoEliminarSubGrupoActivoFijo = isPermisoEliminarSubGrupoActivoFijo;
	}

	public Boolean getIsPermisoGuardarCambiosSubGrupoActivoFijo() {
		return isPermisoGuardarCambiosSubGrupoActivoFijo;
	}

	public void setIsPermisoGuardarCambiosSubGrupoActivoFijo(Boolean isPermisoGuardarCambiosSubGrupoActivoFijo) {
		this.isPermisoGuardarCambiosSubGrupoActivoFijo = isPermisoGuardarCambiosSubGrupoActivoFijo;
	}
	
	public Boolean getIsPermisoConsultaSubGrupoActivoFijo() {
		return isPermisoConsultaSubGrupoActivoFijo;
	}

	public void setIsPermisoConsultaSubGrupoActivoFijo(Boolean isPermisoConsultaSubGrupoActivoFijo) {
		this.isPermisoConsultaSubGrupoActivoFijo = isPermisoConsultaSubGrupoActivoFijo;
	}

	public Boolean getIsPermisoBusquedaSubGrupoActivoFijo() {
		return isPermisoBusquedaSubGrupoActivoFijo;
	}

	public void setIsPermisoBusquedaSubGrupoActivoFijo(Boolean isPermisoBusquedaSubGrupoActivoFijo) {
		this.isPermisoBusquedaSubGrupoActivoFijo = isPermisoBusquedaSubGrupoActivoFijo;
	}

	public Boolean getIsPermisoReporteSubGrupoActivoFijo() {
		return isPermisoReporteSubGrupoActivoFijo;
	}

	public void setIsPermisoReporteSubGrupoActivoFijo(Boolean isPermisoReporteSubGrupoActivoFijo) {
		this.isPermisoReporteSubGrupoActivoFijo = isPermisoReporteSubGrupoActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionMedioSubGrupoActivoFijo() {
		return isPermisoPaginacionMedioSubGrupoActivoFijo;
	}

	public void setIsPermisoPaginacionMedioSubGrupoActivoFijo(Boolean isPermisoPaginacionMedioSubGrupoActivoFijo) {
		this.isPermisoPaginacionMedioSubGrupoActivoFijo = isPermisoPaginacionMedioSubGrupoActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionTodoSubGrupoActivoFijo() {
		return isPermisoPaginacionTodoSubGrupoActivoFijo;
	}

	public void setIsPermisoPaginacionTodoSubGrupoActivoFijo(Boolean isPermisoPaginacionTodoSubGrupoActivoFijo) {
		this.isPermisoPaginacionTodoSubGrupoActivoFijo = isPermisoPaginacionTodoSubGrupoActivoFijo;
	}
	
	public Boolean getIsPermisoPaginacionAltoSubGrupoActivoFijo() {
		return isPermisoPaginacionAltoSubGrupoActivoFijo;
	}

	public void setIsPermisoPaginacionAltoSubGrupoActivoFijo(Boolean isPermisoPaginacionAltoSubGrupoActivoFijo) {
		this.isPermisoPaginacionAltoSubGrupoActivoFijo = isPermisoPaginacionAltoSubGrupoActivoFijo;
	}
	
	public Boolean getIsPermisoCopiarSubGrupoActivoFijo() {
		return isPermisoCopiarSubGrupoActivoFijo;
	}

	public void setIsPermisoCopiarSubGrupoActivoFijo(Boolean isPermisoCopiarSubGrupoActivoFijo) {
		this.isPermisoCopiarSubGrupoActivoFijo = isPermisoCopiarSubGrupoActivoFijo;
	}
	
	public Boolean getIsPermisoVerFormSubGrupoActivoFijo() {
		return isPermisoVerFormSubGrupoActivoFijo;
	}

	public void setIsPermisoVerFormSubGrupoActivoFijo(Boolean isPermisoVerFormSubGrupoActivoFijo) {
		this.isPermisoVerFormSubGrupoActivoFijo = isPermisoVerFormSubGrupoActivoFijo;
	}
	
	public Boolean getIsPermisoDuplicarSubGrupoActivoFijo() {
		return isPermisoDuplicarSubGrupoActivoFijo;
	}

	public void setIsPermisoDuplicarSubGrupoActivoFijo(Boolean isPermisoDuplicarSubGrupoActivoFijo) {
		this.isPermisoDuplicarSubGrupoActivoFijo = isPermisoDuplicarSubGrupoActivoFijo;
	}
	
	public Boolean getIsPermisoOrdenSubGrupoActivoFijo() {
		return isPermisoOrdenSubGrupoActivoFijo;
	}

	public void setIsPermisoOrdenSubGrupoActivoFijo(Boolean isPermisoOrdenSubGrupoActivoFijo) {
		this.isPermisoOrdenSubGrupoActivoFijo = isPermisoOrdenSubGrupoActivoFijo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoSubGrupoActivoFijo() {
		return isVisibilidadCeldaNuevoSubGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaNuevoSubGrupoActivoFijo(Boolean isVisibilidadCeldaNuevoSubGrupoActivoFijo) {
		this.isVisibilidadCeldaNuevoSubGrupoActivoFijo = isVisibilidadCeldaNuevoSubGrupoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarSubGrupoActivoFijo() {
		return isVisibilidadCeldaDuplicarSubGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaDuplicarSubGrupoActivoFijo(Boolean isVisibilidadCeldaDuplicarSubGrupoActivoFijo) {
		this.isVisibilidadCeldaDuplicarSubGrupoActivoFijo = isVisibilidadCeldaDuplicarSubGrupoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarSubGrupoActivoFijo() {
		return isVisibilidadCeldaCopiarSubGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaCopiarSubGrupoActivoFijo(Boolean isVisibilidadCeldaCopiarSubGrupoActivoFijo) {
		this.isVisibilidadCeldaCopiarSubGrupoActivoFijo = isVisibilidadCeldaCopiarSubGrupoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormSubGrupoActivoFijo() {
		return isVisibilidadCeldaVerFormSubGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaVerFormSubGrupoActivoFijo(Boolean isVisibilidadCeldaVerFormSubGrupoActivoFijo) {
		this.isVisibilidadCeldaVerFormSubGrupoActivoFijo = isVisibilidadCeldaVerFormSubGrupoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenSubGrupoActivoFijo() {
		return isVisibilidadCeldaOrdenSubGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaOrdenSubGrupoActivoFijo(Boolean isVisibilidadCeldaOrdenSubGrupoActivoFijo) {
		this.isVisibilidadCeldaOrdenSubGrupoActivoFijo = isVisibilidadCeldaOrdenSubGrupoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesSubGrupoActivoFijo() {
		return isVisibilidadCeldaNuevoRelacionesSubGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesSubGrupoActivoFijo(Boolean isVisibilidadCeldaNuevoRelacionesSubGrupoActivoFijo) {
		this.isVisibilidadCeldaNuevoRelacionesSubGrupoActivoFijo = isVisibilidadCeldaNuevoRelacionesSubGrupoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarSubGrupoActivoFijo() {
		return isVisibilidadCeldaModificarSubGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaModificarSubGrupoActivoFijo(Boolean isVisibilidadCeldaModificarSubGrupoActivoFijo) {
		this.isVisibilidadCeldaModificarSubGrupoActivoFijo = isVisibilidadCeldaModificarSubGrupoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarSubGrupoActivoFijo() {
		return isVisibilidadCeldaActualizarSubGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaActualizarSubGrupoActivoFijo(Boolean isVisibilidadCeldaActualizarSubGrupoActivoFijo) {
		this.isVisibilidadCeldaActualizarSubGrupoActivoFijo = isVisibilidadCeldaActualizarSubGrupoActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaEliminarSubGrupoActivoFijo() {
		return isVisibilidadCeldaEliminarSubGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaEliminarSubGrupoActivoFijo(Boolean isVisibilidadCeldaEliminarSubGrupoActivoFijo) {
		this.isVisibilidadCeldaEliminarSubGrupoActivoFijo = isVisibilidadCeldaEliminarSubGrupoActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaCancelarSubGrupoActivoFijo() {
		return isVisibilidadCeldaCancelarSubGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaCancelarSubGrupoActivoFijo(Boolean isVisibilidadCeldaCancelarSubGrupoActivoFijo) {
		this.isVisibilidadCeldaCancelarSubGrupoActivoFijo = isVisibilidadCeldaCancelarSubGrupoActivoFijo;
	}

	public Boolean getIsVisibilidadCeldaGuardarSubGrupoActivoFijo() {
		return isVisibilidadCeldaGuardarSubGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaGuardarSubGrupoActivoFijo(Boolean isVisibilidadCeldaGuardarSubGrupoActivoFijo) {
		this.isVisibilidadCeldaGuardarSubGrupoActivoFijo = isVisibilidadCeldaGuardarSubGrupoActivoFijo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosSubGrupoActivoFijo() {
		return isVisibilidadCeldaGuardarCambiosSubGrupoActivoFijo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosSubGrupoActivoFijo(Boolean isVisibilidadCeldaGuardarCambiosSubGrupoActivoFijo) {
		this.isVisibilidadCeldaGuardarCambiosSubGrupoActivoFijo = isVisibilidadCeldaGuardarCambiosSubGrupoActivoFijo;
	}
		
	public SubGrupoActivoFijoSessionBean getsubgrupoactivofijoSessionBean() {
		return this.subgrupoactivofijoSessionBean;
	}
	
	public void setsubgrupoactivofijoSessionBean(SubGrupoActivoFijoSessionBean subgrupoactivofijoSessionBean) {
		this.subgrupoactivofijoSessionBean=subgrupoactivofijoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdDetalleGrupoActivoFijo() {
		return this.isVisibilidadFK_IdDetalleGrupoActivoFijo;
	}

	public void setisVisibilidadFK_IdDetalleGrupoActivoFijo(Boolean isVisibilidadFK_IdDetalleGrupoActivoFijo) {
		this.isVisibilidadFK_IdDetalleGrupoActivoFijo=isVisibilidadFK_IdDetalleGrupoActivoFijo;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysSubGrupoActivoFijo(SubGrupoActivoFijo subgrupoactivofijo)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(subgrupoactivofijo,null);
				this.setActualParaGuardarDetalleGrupoActivoFijoForeignKey(subgrupoactivofijo,null);
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
	
	public void bugActualizarReferenciaActual(SubGrupoActivoFijo subgrupoactivofijo,SubGrupoActivoFijo subgrupoactivofijoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalSubGrupoActivoFijo(subgrupoactivofijo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		subgrupoactivofijoAux.setId(subgrupoactivofijo.getId());
		subgrupoactivofijoAux.setVersionRow(subgrupoactivofijo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessSubGrupoActivoFijo();
		
			int intSelectedRow = this.jTableDatosSubGrupoActivoFijo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(SubGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualSubGrupoActivoFijo(this.subgrupoactivofijo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoActivoFijo(this.subgrupoactivofijo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = subgrupoactivofijoValidator.getInvalidValues(this.subgrupoactivofijo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			subgrupoactivofijoLogic.setDatosCliente(datosCliente);
			subgrupoactivofijoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				subgrupoactivofijoAux=new  SubGrupoActivoFijo();
				
				subgrupoactivofijoAux.setIsNew(true);
				subgrupoactivofijoAux.setIsChanged(true);
				
				subgrupoactivofijoAux.setSubGrupoActivoFijoOriginal(this.subgrupoactivofijo);
				
				subgrupoactivofijoAux.setId(this.subgrupoactivofijo.getId());	
				subgrupoactivofijoAux.setVersionRow(this.subgrupoactivofijo.getVersionRow());	
				subgrupoactivofijoAux.setid_empresa(this.subgrupoactivofijo.getid_empresa());	
				subgrupoactivofijoAux.setid_detalle_grupo_activo_fijo(this.subgrupoactivofijo.getid_detalle_grupo_activo_fijo());	
				subgrupoactivofijoAux.setcodigo(this.subgrupoactivofijo.getcodigo());	
				subgrupoactivofijoAux.setnombre(this.subgrupoactivofijo.getnombre());	
				subgrupoactivofijoAux.setsiglas(this.subgrupoactivofijo.getsiglas());	
				subgrupoactivofijoAux.setes_vehiculo(this.subgrupoactivofijo.getes_vehiculo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.subgrupoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(subgrupoactivofijoAux,subgrupoactivofijoLogic.getSubGrupoActivoFijos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(subgrupoactivofijoAux,subgrupoactivofijos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.subgrupoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						subgrupoactivofijoLogic.saveSubGrupoActivoFijos();//WithConnection
						//subgrupoactivofijoLogic.getSetVersionRowSubGrupoActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.subgrupoactivofijo,subgrupoactivofijoAux);
					
					this.refrescarForeignKeysDescripcionesSubGrupoActivoFijo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.subgrupoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos().addAll(this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijos.addAll(this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								subgrupoactivofijoLogic.saveSubGrupoActivoFijoRelaciones(subgrupoactivofijoAux,this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());//WithConnection
								//subgrupoactivofijoLogic.getSetVersionRowSubGrupoActivoFijos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.subgrupoactivofijo,subgrupoactivofijoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.setDetalleActivoFijos(new ArrayList<DetalleActivoFijo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijos= new ArrayList<DetalleActivoFijo>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();}
							subgrupoactivofijoAux.setDetalleActivoFijos(this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.subgrupoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(subgrupoactivofijoAux,subgrupoactivofijoLogic.getSubGrupoActivoFijos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(subgrupoactivofijoAux,subgrupoactivofijos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.subgrupoactivofijo,subgrupoactivofijoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				subgrupoactivofijoAux=new  SubGrupoActivoFijo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado() 
					|| (this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado() && this.subgrupoactivofijo.getId()>=0)) {
						
					subgrupoactivofijoAux.setIsNew(false);
				}
				
				subgrupoactivofijoAux.setIsDeleted(false);
			
				subgrupoactivofijoAux.setId(this.subgrupoactivofijo.getId());	
				subgrupoactivofijoAux.setVersionRow(this.subgrupoactivofijo.getVersionRow());	
				subgrupoactivofijoAux.setid_empresa(this.subgrupoactivofijo.getid_empresa());	
				subgrupoactivofijoAux.setid_detalle_grupo_activo_fijo(this.subgrupoactivofijo.getid_detalle_grupo_activo_fijo());	
				subgrupoactivofijoAux.setcodigo(this.subgrupoactivofijo.getcodigo());	
				subgrupoactivofijoAux.setnombre(this.subgrupoactivofijo.getnombre());	
				subgrupoactivofijoAux.setsiglas(this.subgrupoactivofijo.getsiglas());	
				subgrupoactivofijoAux.setes_vehiculo(this.subgrupoactivofijo.getes_vehiculo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(subgrupoactivofijoAux,subgrupoactivofijoLogic.getSubGrupoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(subgrupoactivofijoAux,subgrupoactivofijos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.subgrupoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						subgrupoactivofijoLogic.saveSubGrupoActivoFijos();//WithConnection
						//subgrupoactivofijoLogic.getSetVersionRowSubGrupoActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.subgrupoactivofijo,subgrupoactivofijoAux);
					
					this.refrescarForeignKeysDescripcionesSubGrupoActivoFijo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.subgrupoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos().addAll(this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijos.addAll(this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								subgrupoactivofijoLogic.saveSubGrupoActivoFijoRelaciones(subgrupoactivofijoAux,this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());//WithConnection
								//subgrupoactivofijoLogic.getSetVersionRowSubGrupoActivoFijos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.subgrupoactivofijo,subgrupoactivofijoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.setDetalleActivoFijos(new ArrayList<DetalleActivoFijo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijos= new ArrayList<DetalleActivoFijo>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();}
							subgrupoactivofijoAux.setDetalleActivoFijos(this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.subgrupoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(subgrupoactivofijoAux,subgrupoactivofijoLogic.getSubGrupoActivoFijos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(subgrupoactivofijoAux,subgrupoactivofijos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.subgrupoactivofijo,subgrupoactivofijoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				subgrupoactivofijoAux=new  SubGrupoActivoFijo();
				
				subgrupoactivofijoAux.setIsNew(false);
				subgrupoactivofijoAux.setIsChanged(false);
				
				subgrupoactivofijoAux.setIsDeleted(true);
				
				subgrupoactivofijoAux.setId(this.subgrupoactivofijo.getId());	
				subgrupoactivofijoAux.setVersionRow(this.subgrupoactivofijo.getVersionRow());	
				subgrupoactivofijoAux.setid_empresa(this.subgrupoactivofijo.getid_empresa());	
				subgrupoactivofijoAux.setid_detalle_grupo_activo_fijo(this.subgrupoactivofijo.getid_detalle_grupo_activo_fijo());	
				subgrupoactivofijoAux.setcodigo(this.subgrupoactivofijo.getcodigo());	
				subgrupoactivofijoAux.setnombre(this.subgrupoactivofijo.getnombre());	
				subgrupoactivofijoAux.setsiglas(this.subgrupoactivofijo.getsiglas());	
				subgrupoactivofijoAux.setes_vehiculo(this.subgrupoactivofijo.getes_vehiculo());	
				
				if(this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.subgrupoactivofijoAux.getId()>=0) {	
						this.subgrupoactivofijosEliminados.add(subgrupoactivofijoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(subgrupoactivofijoAux,subgrupoactivofijoLogic.getSubGrupoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(subgrupoactivofijoAux,subgrupoactivofijos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.subgrupoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						subgrupoactivofijoLogic.saveSubGrupoActivoFijos();//WithConnection
						//subgrupoactivofijoLogic.getSetVersionRowSubGrupoActivoFijos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.subgrupoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos().addAll(this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijos.addAll(this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								subgrupoactivofijoLogic.saveSubGrupoActivoFijoRelaciones(subgrupoactivofijoAux,this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());//WithConnection
								//subgrupoactivofijoLogic.getSetVersionRowSubGrupoActivoFijos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.setDetalleActivoFijos(new ArrayList<DetalleActivoFijo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijos= new ArrayList<DetalleActivoFijo>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.quitarFilaTotales();}
							subgrupoactivofijoAux.setDetalleActivoFijos(this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.subgrupoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(subgrupoactivofijoAux,subgrupoactivofijoLogic.getSubGrupoActivoFijos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(subgrupoactivofijoAux,subgrupoactivofijos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().addAll(this.subgrupoactivofijosEliminados);
					
					subgrupoactivofijoLogic.saveSubGrupoActivoFijos();//WithConnection
					//subgrupoactivofijoLogic.getSetVersionRowSubGrupoActivoFijos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesSubGrupoActivoFijo();
				
				this.subgrupoactivofijosEliminados= new ArrayList<SubGrupoActivoFijo>();		
			}
			
			if(this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Sub Grupo Activo Fijo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Sub Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.subgrupoactivofijo=subgrupoactivofijoAux;
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
      		//this.finishProcessSubGrupoActivoFijo();
      	}
		
	}	
	
	public void actualizarRelaciones(SubGrupoActivoFijo subgrupoactivofijoLocal) throws Exception {
		
		if(this.subgrupoactivofijoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				subgrupoactivofijoLocal.setDetalleActivoFijos(this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());
			
			} else {
			
				subgrupoactivofijoLocal.setDetalleActivoFijos(this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(SubGrupoActivoFijo subgrupoactivofijoLocal) throws Exception {	
		if(this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				subgrupoactivofijoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(DetalleGrupoActivoFijoDetalleFormJInternalFrame.class)) {
				DetalleGrupoActivoFijoBeanSwingJInternalFrame detallegrupoactivofijoBeanSwingJInternalFrameLocal=(DetalleGrupoActivoFijoBeanSwingJInternalFrame) ((DetalleGrupoActivoFijoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				detallegrupoactivofijoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoDetalleGrupoActivoFijo(detallegrupoactivofijoBeanSwingJInternalFrameLocal.getdetallegrupoactivofijo(),true);
				detallegrupoactivofijoBeanSwingJInternalFrameLocal.actualizarLista(detallegrupoactivofijoBeanSwingJInternalFrameLocal.detallegrupoactivofijo,this.detallegrupoactivofijosForeignKey);

				detallegrupoactivofijoBeanSwingJInternalFrameLocal.actualizarRelaciones(detallegrupoactivofijoBeanSwingJInternalFrameLocal.detallegrupoactivofijo);

				subgrupoactivofijoLocal.setDetalleGrupoActivoFijo(detallegrupoactivofijoBeanSwingJInternalFrameLocal.detallegrupoactivofijo);

				this.addItemDefectoCombosForeignKeyDetalleGrupoActivoFijo();
				this.cargarCombosFrameDetalleGrupoActivoFijosForeignKey("Formulario");
				this.setActualDetalleGrupoActivoFijoForeignKey(detallegrupoactivofijoBeanSwingJInternalFrameLocal.detallegrupoactivofijo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarSubGrupoActivoFijoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosSubGrupoActivoFijo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = subgrupoactivofijoValidator.getInvalidValues(this.subgrupoactivofijo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(SubGrupoActivoFijo subgrupoactivofijo,List<SubGrupoActivoFijo> subgrupoactivofijos) throws Exception {
		try	{		
			SubGrupoActivoFijoConstantesFunciones.actualizarLista(subgrupoactivofijo,subgrupoactivofijos,this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(SubGrupoActivoFijo subgrupoactivofijo,List<SubGrupoActivoFijo> subgrupoactivofijos) throws Exception {
		try	{			
			SubGrupoActivoFijoConstantesFunciones.actualizarSelectedLista(subgrupoactivofijo,subgrupoactivofijos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<SubGrupoActivoFijo> subgrupoactivofijosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				subgrupoactivofijosLocal=this.subgrupoactivofijoLogic.getSubGrupoActivoFijos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				subgrupoactivofijosLocal=this.subgrupoactivofijos;
			}
			//ARCHITECTURE
		
			for(SubGrupoActivoFijo subgrupoactivofijoLocal:subgrupoactivofijosLocal) {
				if(this.permiteMantenimiento(subgrupoactivofijoLocal) && subgrupoactivofijoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+SubGrupoActivoFijoConstantesFunciones.getSubGrupoActivoFijoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(SubGrupoActivoFijoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubGrupoActivoFijo.jLabelid_empresaSubGrupoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SubGrupoActivoFijoConstantesFunciones.IDDETALLEGRUPOACTIVOFIJO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubGrupoActivoFijo.jLabelid_detalle_grupo_activo_fijoSubGrupoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SubGrupoActivoFijoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubGrupoActivoFijo.jLabelcodigoSubGrupoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SubGrupoActivoFijoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubGrupoActivoFijo.jLabelnombreSubGrupoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SubGrupoActivoFijoConstantesFunciones.SIGLAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubGrupoActivoFijo.jLabelsiglasSubGrupoActivoFijo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(SubGrupoActivoFijoConstantesFunciones.ESVEHICULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubGrupoActivoFijo.jLabeles_vehiculoSubGrupoActivoFijo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSubGrupoActivoFijo.jLabelid_empresaSubGrupoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSubGrupoActivoFijo.jLabelid_detalle_grupo_activo_fijoSubGrupoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSubGrupoActivoFijo.jLabelcodigoSubGrupoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSubGrupoActivoFijo.jLabelnombreSubGrupoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSubGrupoActivoFijo.jLabelsiglasSubGrupoActivoFijo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSubGrupoActivoFijo.jLabeles_vehiculoSubGrupoActivoFijo,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleActivoFijo")) {
			if(this.subgrupoactivofijo==null) {
				this.subgrupoactivofijo= new SubGrupoActivoFijo();
			}

			if(this.subgrupoactivofijoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoSubGrupoActivoFijo
				this.setVariablesFormularioToObjetoActualSubGrupoActivoFijo(this.subgrupoactivofijo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoActivoFijo(this.subgrupoactivofijo);

				this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.getdetalleactivofijo().setSubGrupoActivoFijo(this.subgrupoactivofijo);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoSubGrupoActivoFijo--;	
		
		
		this.subgrupoactivofijoAux=new SubGrupoActivoFijo();
		
		this.subgrupoactivofijoAux.setId(this.iIdNuevoSubGrupoActivoFijo);
		this.subgrupoactivofijoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().add(this.subgrupoactivofijoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.subgrupoactivofijos.add(this.subgrupoactivofijoAux);
		}
		//ARCHITECTURE
		
		this.subgrupoactivofijo=this.subgrupoactivofijoAux;
		
		if(SubGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioSubGrupoActivoFijo(this.subgrupoactivofijo);
			this.setVariablesObjetoActualToFormularioForeignKeySubGrupoActivoFijo(this.subgrupoactivofijo);
		}
				
		//this.setDefaultControlesSubGrupoActivoFijo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeySubGrupoActivoFijo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeySubGrupoActivoFijo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeySubGrupoActivoFijo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSubGrupoActivoFijo(this.subgrupoactivofijoBean,this.subgrupoactivofijo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoActivoFijo(this.subgrupoactivofijo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.subgrupoactivofijoSessionBean.getConGuardarRelaciones()) {
			classes=SubGrupoActivoFijoConstantesFunciones.getClassesRelationshipsOfSubGrupoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.subgrupoactivofijoReturnGeneral=subgrupoactivofijoLogic.procesarEventosSubGrupoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.subgrupoactivofijoLogic.getSubGrupoActivoFijos(),this.subgrupoactivofijo,this.subgrupoactivofijoParameterGeneral,this.isEsNuevoSubGrupoActivoFijo,classes);//this.subgrupoactivofijoLogic.getSubGrupoActivoFijo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanSubGrupoActivoFijo(this.subgrupoactivofijoReturnGeneral,this.subgrupoactivofijoBean,false);
		
		if(this.subgrupoactivofijoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeySubGrupoActivoFijo(this.subgrupoactivofijoReturnGeneral.getSubGrupoActivoFijo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioSubGrupoActivoFijo(this.subgrupoactivofijoReturnGeneral.getSubGrupoActivoFijo());
		}
		
		if(this.subgrupoactivofijoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioSubGrupoActivoFijo(this.subgrupoactivofijoReturnGeneral.getSubGrupoActivoFijo(),classes);//this.subgrupoactivofijoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualSubGrupoActivoFijo(this.subgrupoactivofijo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeySubGrupoActivoFijo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeySubGrupoActivoFijo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.RecargarFormSubGrupoActivoFijo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingSubGrupoActivoFijo(false);
						
			if(subgrupoactivofijoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.getEsGuardarRelacionado() && DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleActivoFijoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(SubGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSubGrupoActivoFijo();
			}
			
			this.actualizarVisualTableDatosSubGrupoActivoFijo();
			
			this.jTableDatosSubGrupoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoSubGrupoActivoFijo(), this.getIndiceNuevoSubGrupoActivoFijo());
			
			this.seleccionarFilaTablaSubGrupoActivoFijoActual();
						
			this.actualizarEstadoCeldasBotonesSubGrupoActivoFijo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesSubGrupoActivoFijo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTextFieldcodigoSubGrupoActivoFijo.setEnabled(isHabilitar && this.subgrupoactivofijoConstantesFunciones.activarcodigoSubGrupoActivoFijo);
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTextAreanombreSubGrupoActivoFijo.setEnabled(isHabilitar && this.subgrupoactivofijoConstantesFunciones.activarnombreSubGrupoActivoFijo);
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTextFieldsiglasSubGrupoActivoFijo.setEnabled(isHabilitar && this.subgrupoactivofijoConstantesFunciones.activarsiglasSubGrupoActivoFijo);
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jCheckBoxes_vehiculoSubGrupoActivoFijo.setEnabled(isHabilitar && this.subgrupoactivofijoConstantesFunciones.activares_vehiculoSubGrupoActivoFijo);	
		//
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_empresaSubGrupoActivoFijo.setEnabled(isHabilitar && this.subgrupoactivofijoConstantesFunciones.activarid_empresaSubGrupoActivoFijo);
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijo.setEnabled(isHabilitar && this.subgrupoactivofijoConstantesFunciones.activarid_detalle_grupo_activo_fijoSubGrupoActivoFijo);
	};
	
	public void setDefaultControlesSubGrupoActivoFijo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoSubGrupoActivoFijo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.subgrupoactivofijoSessionBean.setConGuardarRelaciones(true);			
			this.subgrupoactivofijoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTabbedPaneRelacionesSubGrupoActivoFijo.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.subgrupoactivofijoSessionBean.setConGuardarRelaciones(false);			
			this.subgrupoactivofijoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTabbedPaneRelacionesSubGrupoActivoFijo.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoSubGrupoActivoFijo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SubGrupoActivoFijo subgrupoactivofijoAux:this.subgrupoactivofijoLogic.getSubGrupoActivoFijos()) {
				if(subgrupoactivofijoAux.getId().equals(this.iIdNuevoSubGrupoActivoFijo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SubGrupoActivoFijo subgrupoactivofijoAux:this.subgrupoactivofijos) {
				if(subgrupoactivofijoAux.getId().equals(this.iIdNuevoSubGrupoActivoFijo)) {
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
	
	public int getIndiceActualSubGrupoActivoFijo(SubGrupoActivoFijo subgrupoactivofijo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SubGrupoActivoFijo subgrupoactivofijoAux:this.subgrupoactivofijoLogic.getSubGrupoActivoFijos()) {
				if(subgrupoactivofijoAux.getId().equals(subgrupoactivofijo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SubGrupoActivoFijo subgrupoactivofijoAux:this.subgrupoactivofijos) {
				if(subgrupoactivofijoAux.getId().equals(subgrupoactivofijo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalSubGrupoActivoFijo(SubGrupoActivoFijo subgrupoactivofijoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SubGrupoActivoFijo subgrupoactivofijoAux:this.subgrupoactivofijoLogic.getSubGrupoActivoFijos()) {
				if(subgrupoactivofijoAux.getSubGrupoActivoFijoOriginal().getId().equals(subgrupoactivofijoOriginal.getId())) {
					existe=true;
					subgrupoactivofijoOriginal.setId(subgrupoactivofijoAux.getId());
					subgrupoactivofijoOriginal.setVersionRow(subgrupoactivofijoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SubGrupoActivoFijo subgrupoactivofijoAux:this.subgrupoactivofijos) {
				if(subgrupoactivofijoAux.getSubGrupoActivoFijoOriginal().getId().equals(subgrupoactivofijoOriginal.getId())) {
					existe=true;
					subgrupoactivofijoOriginal.setId(subgrupoactivofijoAux.getId());
					subgrupoactivofijoOriginal.setVersionRow(subgrupoactivofijoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosSubGrupoActivoFijo(Boolean esParaCancelar) throws Exception {
		subgrupoactivofijosAux=new ArrayList<SubGrupoActivoFijo>();
		subgrupoactivofijoAux=new SubGrupoActivoFijo();
		
		if(!this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SubGrupoActivoFijo subgrupoactivofijoAux:this.subgrupoactivofijoLogic.getSubGrupoActivoFijos()) {
					if(subgrupoactivofijoAux.getId()<0) {
						subgrupoactivofijosAux.add(subgrupoactivofijoAux);
					}		
				}
				this.iIdNuevoSubGrupoActivoFijo=0L;
				this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().removeAll(subgrupoactivofijosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SubGrupoActivoFijo subgrupoactivofijoAux:this.subgrupoactivofijos) {
					if(subgrupoactivofijoAux.getId()<0) {
						subgrupoactivofijosAux.add(subgrupoactivofijoAux);
					}		
				}
				this.iIdNuevoSubGrupoActivoFijo=0L;
				this.subgrupoactivofijos.removeAll(subgrupoactivofijosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoSubGrupoActivoFijo 
					&& this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().size()>0
					) {
					subgrupoactivofijoAux=this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().get(this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().size() - 1);
				
					if(subgrupoactivofijoAux.getId()<0) {
						this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().remove(subgrupoactivofijoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoSubGrupoActivoFijo && this.subgrupoactivofijos.size()>0) {
					subgrupoactivofijoAux=this.subgrupoactivofijos.get(this.subgrupoactivofijos.size() - 1);
				
					if(subgrupoactivofijoAux.getId()<0) {
						this.subgrupoactivofijos.remove(subgrupoactivofijoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoSubGrupoActivoFijo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(subgrupoactivofijo.getId()<0) {
				this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().remove(this.subgrupoactivofijo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(subgrupoactivofijo.getId()<0) {
				this.subgrupoactivofijos.remove(this.subgrupoactivofijo);
			}
		}			
	}
	
	public void setEstadosInicialesSubGrupoActivoFijo(List<SubGrupoActivoFijo> subgrupoactivofijosAux) throws Exception {
		SubGrupoActivoFijoConstantesFunciones.setEstadosInicialesSubGrupoActivoFijo(subgrupoactivofijosAux);
	}
	
	public void setEstadosInicialesSubGrupoActivoFijo(SubGrupoActivoFijo subgrupoactivofijoAux) throws Exception {
		SubGrupoActivoFijoConstantesFunciones.setEstadosInicialesSubGrupoActivoFijo(subgrupoactivofijoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarSubGrupoActivoFijoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesSubGrupoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarSubGrupoActivoFijoActual()) {
				if(!this.isEsNuevoSubGrupoActivoFijo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesSubGrupoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoSubGrupoActivoFijo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarSubGrupoActivoFijoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Sub Grupo Activo Fijo ?", "MANTENIMIENTO DE Sub Grupo Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesSubGrupoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(SubGrupoActivoFijo subgrupoactivofijo) throws Exception {
		SubGrupoActivoFijoConstantesFunciones.seleccionarAsignar(this.subgrupoactivofijo,subgrupoactivofijo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarSubGrupoActivoFijo=this.isPermisoActualizarOriginalSubGrupoActivoFijo;
			
			
			this.seleccionarAsignar(subgrupoactivofijo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SubGrupoActivoFijoConstantesFunciones.quitarEspaciosSubGrupoActivoFijo(this.subgrupoactivofijo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesSubGrupoActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.subgrupoactivofijoSessionBean.setsFuncionBusquedaRapida(this.subgrupoactivofijoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoSubGrupoActivoFijo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosSubGrupoActivoFijo(esParaCancelar);				
				this.cancelarNuevoSubGrupoActivoFijo(esParaCancelar);								
			}
			
			this.subgrupoactivofijo=new SubGrupoActivoFijo();
			
			this.inicializarSubGrupoActivoFijo();
			
			this.actualizarEstadoCeldasBotonesSubGrupoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarSubGrupoActivoFijo() throws Exception {
		try {
			SubGrupoActivoFijoConstantesFunciones.inicializarSubGrupoActivoFijo(this.subgrupoactivofijo);
			
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
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteSubGrupoActivoFijos(String sAccionBusqueda,List<SubGrupoActivoFijo> subgrupoactivofijosParaReportes) throws Exception {
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
					sPathReporteFinal="SubGrupoActivoFijo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="SubGrupoActivoFijoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("SubGrupoActivoFijoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="SubGrupoActivoFijo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Sub Grupo Activo Fijos");		
		parameters.put("busquedapor", SubGrupoActivoFijoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleActivoFijo.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					SubGrupoActivoFijoLogic subgrupoactivofijoLogicAuxiliar=new SubGrupoActivoFijoLogic();
					subgrupoactivofijoLogicAuxiliar.setDatosCliente(subgrupoactivofijoLogic.getDatosCliente());				
					subgrupoactivofijoLogicAuxiliar.setSubGrupoActivoFijos(subgrupoactivofijosParaReportes);
					
					subgrupoactivofijoLogicAuxiliar.cargarRelacionesLoteForeignKeySubGrupoActivoFijoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					subgrupoactivofijosParaReportes=subgrupoactivofijoLogicAuxiliar.getSubGrupoActivoFijos();
					
					//subgrupoactivofijoLogic.getNewConnexionToDeep();
					
					//for (SubGrupoActivoFijo subgrupoactivofijo:subgrupoactivofijosParaReportes) {
					//	subgrupoactivofijoLogic.deepLoad(subgrupoactivofijo, false, DeepLoadType.INCLUDE, classes);
					//}						
					//subgrupoactivofijoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//subgrupoactivofijoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleActivoFijo = AuxiliarReportes.class.getResourceAsStream("DetalleActivoFijoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalleactivofijo", reportFileDetalleActivoFijo);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceSubGrupoActivoFijo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			SubGrupoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			SubGrupoActivoFijoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceSubGrupoActivoFijo=new JRBeanArrayDataSource(SubGrupoActivoFijoJInternalFrame.TraerSubGrupoActivoFijoBeans(subgrupoactivofijosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceSubGrupoActivoFijo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+SubGrupoActivoFijoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+SubGrupoActivoFijoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(SubGrupoActivoFijoBean.TraerSubGrupoActivoFijoBeans(subgrupoactivofijosParaReportes).toArray()));
							
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
				this.generarExcelReporteSubGrupoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,subgrupoactivofijosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalSubGrupoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,subgrupoactivofijosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoSubGrupoActivoFijoActionPerformed(null);
					//this.generarExcelReporteSubGrupoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,subgrupoactivofijosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalSubGrupoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,subgrupoactivofijosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesSubGrupoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,subgrupoactivofijosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesSubGrupoActivoFijos(sAccionBusqueda,sTipoArchivoReporte,subgrupoactivofijosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteSubGrupoActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<SubGrupoActivoFijo> subgrupoactivofijosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"subgrupoactivofijo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SubGrupoActivoFijos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSubGrupoActivoFijo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(SubGrupoActivoFijo subgrupoactivofijo : subgrupoactivofijosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			SubGrupoActivoFijoConstantesFunciones.generarExcelReporteDataSubGrupoActivoFijo("NORMAL",row,workbook,subgrupoactivofijo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sub Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderSubGrupoActivoFijo(String sTipo,Row row,Workbook workbook) {
		
		SubGrupoActivoFijoConstantesFunciones.generarExcelReporteHeaderSubGrupoActivoFijo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalSubGrupoActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<SubGrupoActivoFijo> subgrupoactivofijosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"subgrupoactivofijo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SubGrupoActivoFijos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(SubGrupoActivoFijo subgrupoactivofijo : subgrupoactivofijosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(SubGrupoActivoFijoConstantesFunciones.getSubGrupoActivoFijoDescripcion(subgrupoactivofijo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SubGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SubGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(subgrupoactivofijo.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SubGrupoActivoFijoConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SubGrupoActivoFijoConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(subgrupoactivofijo.getdetallegrupoactivofijo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SubGrupoActivoFijoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SubGrupoActivoFijoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(subgrupoactivofijo.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SubGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SubGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(subgrupoactivofijo.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SubGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SubGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(subgrupoactivofijo.getsiglas());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SubGrupoActivoFijoConstantesFunciones.LABEL_ESVEHICULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SubGrupoActivoFijoConstantesFunciones.LABEL_ESVEHICULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(subgrupoactivofijo.getes_vehiculo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sub Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesSubGrupoActivoFijos(String sAccionBusqueda,String sTipoArchivoReporte,List<SubGrupoActivoFijo> subgrupoactivofijosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<SubGrupoActivoFijo> subgrupoactivofijosRespaldo=null;
		
		classes=SubGrupoActivoFijoConstantesFunciones.getClassesRelationshipsOfSubGrupoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.subgrupoactivofijoLogic.setDatosCliente(this.datosCliente);
		this.subgrupoactivofijoLogic.setDatosDeep(this.datosDeep);
		this.subgrupoactivofijoLogic.setIsConDeep(true);
		
		subgrupoactivofijosRespaldo=this.subgrupoactivofijoLogic.getSubGrupoActivoFijos();
		
		this.subgrupoactivofijoLogic.setSubGrupoActivoFijos(subgrupoactivofijosParaReportes);	
		this.subgrupoactivofijoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		subgrupoactivofijosParaReportes=this.subgrupoactivofijoLogic.getSubGrupoActivoFijos();
		this.subgrupoactivofijoLogic.setSubGrupoActivoFijos(subgrupoactivofijosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"subgrupoactivofijo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SubGrupoActivoFijos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSubGrupoActivoFijo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(SubGrupoActivoFijo subgrupoactivofijo : subgrupoactivofijosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderSubGrupoActivoFijo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			SubGrupoActivoFijoConstantesFunciones.generarExcelReporteDataSubGrupoActivoFijo("NORMAL",row,workbook,subgrupoactivofijo,cellStyleDataAux);
		
			
			


				//DetalleActivoFijo
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO))) {

				if(subgrupoactivofijo.getDetalleActivoFijos()!=null && subgrupoactivofijo.getDetalleActivoFijos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleActivoFijoConstantesFunciones.generarExcelReporteHeaderDetalleActivoFijo("RELACIONADO",row,workbook);
				}

				if(subgrupoactivofijo.getDetalleActivoFijos()!=null) {
					i2=0;
					for(DetalleActivoFijo detalleactivofijo : subgrupoactivofijo.getDetalleActivoFijos()) {
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
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(SubGrupoActivoFijoConstantesFunciones.getSubGrupoActivoFijoDescripcion(subgrupoactivofijo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sub Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessSubGrupoActivoFijo() throws Exception {		
		this.startProcessSubGrupoActivoFijo(true);
	}
	
	public void startProcessSubGrupoActivoFijo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasSubGrupoActivoFijo ,this.jPanelParametrosReportesSubGrupoActivoFijo, this.jScrollPanelDatosSubGrupoActivoFijo,this.jPanelPaginacionSubGrupoActivoFijo, this.jScrollPanelDatosEdicionSubGrupoActivoFijo, this.jPanelAccionesSubGrupoActivoFijo,this.jPanelAccionesFormularioSubGrupoActivoFijo,this.jmenuBarSubGrupoActivoFijo,this.jmenuBarDetalleSubGrupoActivoFijo,this.jTtoolBarSubGrupoActivoFijo,this.jTtoolBarDetalleSubGrupoActivoFijo);		
		
		final JTabbedPane jTabbedPaneBusquedasSubGrupoActivoFijo=this.jTabbedPaneBusquedasSubGrupoActivoFijo; 
		
		final JPanel jPanelParametrosReportesSubGrupoActivoFijo=this.jPanelParametrosReportesSubGrupoActivoFijo;
		//final JScrollPane jScrollPanelDatosSubGrupoActivoFijo=this.jScrollPanelDatosSubGrupoActivoFijo;
		final JTable jTableDatosSubGrupoActivoFijo=this.jTableDatosSubGrupoActivoFijo;		
		final JPanel jPanelPaginacionSubGrupoActivoFijo=this.jPanelPaginacionSubGrupoActivoFijo;
		//final JScrollPane jScrollPanelDatosEdicionSubGrupoActivoFijo=this.jScrollPanelDatosEdicionSubGrupoActivoFijo;
		final JPanel jPanelAccionesSubGrupoActivoFijo=this.jPanelAccionesSubGrupoActivoFijo;
		
		JPanel jPanelCamposAuxiliarSubGrupoActivoFijo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarSubGrupoActivoFijo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {
			jPanelCamposAuxiliarSubGrupoActivoFijo=this.jInternalFrameDetalleFormSubGrupoActivoFijo.jPanelCamposSubGrupoActivoFijo;
			jPanelAccionesFormularioAuxiliarSubGrupoActivoFijo=this.jInternalFrameDetalleFormSubGrupoActivoFijo.jPanelAccionesFormularioSubGrupoActivoFijo;
		}
		
		final JPanel jPanelCamposSubGrupoActivoFijo=jPanelCamposAuxiliarSubGrupoActivoFijo;
		final JPanel jPanelAccionesFormularioSubGrupoActivoFijo=jPanelAccionesFormularioAuxiliarSubGrupoActivoFijo;
		
		
		final JMenuBar jmenuBarSubGrupoActivoFijo=this.jmenuBarSubGrupoActivoFijo;
		final JToolBar jTtoolBarSubGrupoActivoFijo=this.jTtoolBarSubGrupoActivoFijo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarSubGrupoActivoFijo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSubGrupoActivoFijo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {
			jmenuBarDetalleAuxiliarSubGrupoActivoFijo=this.jInternalFrameDetalleFormSubGrupoActivoFijo.jmenuBarDetalleSubGrupoActivoFijo;
			jTtoolBarDetalleAuxiliarSubGrupoActivoFijo=this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTtoolBarDetalleSubGrupoActivoFijo;
		}
		
		final JMenuBar jmenuBarDetalleSubGrupoActivoFijo=jmenuBarDetalleAuxiliarSubGrupoActivoFijo;
		final JToolBar jTtoolBarDetalleSubGrupoActivoFijo=jTtoolBarDetalleAuxiliarSubGrupoActivoFijo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSubGrupoActivoFijo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSubGrupoActivoFijo;
			processRunnable.jTableDatos=jTableDatosSubGrupoActivoFijo;
			processRunnable.jPanelCampos=jPanelCamposSubGrupoActivoFijo;
			processRunnable.jPanelPaginacion=jPanelPaginacionSubGrupoActivoFijo;
			processRunnable.jPanelAcciones=jPanelAccionesSubGrupoActivoFijo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSubGrupoActivoFijo;
			
			
			processRunnable.jmenuBar=jmenuBarSubGrupoActivoFijo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSubGrupoActivoFijo;
			processRunnable.jTtoolBar=jTtoolBarSubGrupoActivoFijo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSubGrupoActivoFijo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSubGrupoActivoFijo ,jPanelParametrosReportesSubGrupoActivoFijo,jTableDatosSubGrupoActivoFijo, /*jScrollPanelDatosSubGrupoActivoFijo,*/jPanelCamposSubGrupoActivoFijo,jPanelPaginacionSubGrupoActivoFijo, /*jScrollPanelDatosEdicionSubGrupoActivoFijo,*/ jPanelAccionesSubGrupoActivoFijo,jPanelAccionesFormularioSubGrupoActivoFijo,jmenuBarSubGrupoActivoFijo,jmenuBarDetalleSubGrupoActivoFijo,jTtoolBarSubGrupoActivoFijo,jTtoolBarDetalleSubGrupoActivoFijo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSubGrupoActivoFijo ,jPanelParametrosReportesSubGrupoActivoFijo, jScrollPanelDatosSubGrupoActivoFijo,jPanelPaginacionSubGrupoActivoFijo, jScrollPanelDatosEdicionSubGrupoActivoFijo, jPanelAccionesSubGrupoActivoFijo,jPanelAccionesFormularioSubGrupoActivoFijo,jmenuBarSubGrupoActivoFijo,jmenuBarDetalleSubGrupoActivoFijo,jTtoolBarSubGrupoActivoFijo,jTtoolBarDetalleSubGrupoActivoFijo);
						
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
	
	public void finishProcessSubGrupoActivoFijo() {// throws Exception 
		this.finishProcessSubGrupoActivoFijo(true);
	}
	
	public void finishProcessSubGrupoActivoFijo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasSubGrupoActivoFijo ,this.jPanelParametrosReportesSubGrupoActivoFijo, this.jScrollPanelDatosSubGrupoActivoFijo,this.jPanelPaginacionSubGrupoActivoFijo, this.jScrollPanelDatosEdicionSubGrupoActivoFijo, this.jPanelAccionesSubGrupoActivoFijo,this.jPanelAccionesFormularioSubGrupoActivoFijo,this.jmenuBarSubGrupoActivoFijo,this.jmenuBarDetalleSubGrupoActivoFijo,this.jTtoolBarSubGrupoActivoFijo,this.jTtoolBarDetalleSubGrupoActivoFijo);		
		
		final JTabbedPane jTabbedPaneBusquedasSubGrupoActivoFijo=this.jTabbedPaneBusquedasSubGrupoActivoFijo; 
		
		final JPanel jPanelParametrosReportesSubGrupoActivoFijo=this.jPanelParametrosReportesSubGrupoActivoFijo;
		//final JScrollPane jScrollPanelDatosSubGrupoActivoFijo=this.jScrollPanelDatosSubGrupoActivoFijo;
		final JTable jTableDatosSubGrupoActivoFijo=this.jTableDatosSubGrupoActivoFijo;		
		final JPanel jPanelPaginacionSubGrupoActivoFijo=this.jPanelPaginacionSubGrupoActivoFijo;
		//final JScrollPane jScrollPanelDatosEdicionSubGrupoActivoFijo=this.jScrollPanelDatosEdicionSubGrupoActivoFijo;
		final JPanel jPanelAccionesSubGrupoActivoFijo=this.jPanelAccionesSubGrupoActivoFijo;
		
		JPanel jPanelCamposAuxiliarSubGrupoActivoFijo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarSubGrupoActivoFijo=new JPanel();
		
		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {
			jPanelCamposAuxiliarSubGrupoActivoFijo=this.jInternalFrameDetalleFormSubGrupoActivoFijo.jPanelCamposSubGrupoActivoFijo;
			jPanelAccionesFormularioAuxiliarSubGrupoActivoFijo=this.jInternalFrameDetalleFormSubGrupoActivoFijo.jPanelAccionesFormularioSubGrupoActivoFijo;
		}
		
		final JPanel jPanelCamposSubGrupoActivoFijo=jPanelCamposAuxiliarSubGrupoActivoFijo;
		final JPanel jPanelAccionesFormularioSubGrupoActivoFijo=jPanelAccionesFormularioAuxiliarSubGrupoActivoFijo;
		
		
		final JMenuBar jmenuBarSubGrupoActivoFijo=this.jmenuBarSubGrupoActivoFijo;		
		final JToolBar jTtoolBarSubGrupoActivoFijo=this.jTtoolBarSubGrupoActivoFijo;
				
		JMenuBar jmenuBarDetalleAuxiliarSubGrupoActivoFijo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSubGrupoActivoFijo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {
			jmenuBarDetalleAuxiliarSubGrupoActivoFijo=this.jInternalFrameDetalleFormSubGrupoActivoFijo.jmenuBarDetalleSubGrupoActivoFijo;
			jTtoolBarDetalleAuxiliarSubGrupoActivoFijo=this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTtoolBarDetalleSubGrupoActivoFijo;		
		}
		
		final JMenuBar jmenuBarDetalleSubGrupoActivoFijo=jmenuBarDetalleAuxiliarSubGrupoActivoFijo;
		final JToolBar jTtoolBarDetalleSubGrupoActivoFijo=jTtoolBarDetalleAuxiliarSubGrupoActivoFijo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSubGrupoActivoFijo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSubGrupoActivoFijo;
			processRunnable.jTableDatos=jTableDatosSubGrupoActivoFijo;
			processRunnable.jPanelCampos=jPanelCamposSubGrupoActivoFijo;
			processRunnable.jPanelPaginacion=jPanelPaginacionSubGrupoActivoFijo;
			processRunnable.jPanelAcciones=jPanelAccionesSubGrupoActivoFijo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSubGrupoActivoFijo;
			
			
			processRunnable.jmenuBar=jmenuBarSubGrupoActivoFijo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSubGrupoActivoFijo;
			processRunnable.jTtoolBar=jTtoolBarSubGrupoActivoFijo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSubGrupoActivoFijo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasSubGrupoActivoFijo ,jPanelParametrosReportesSubGrupoActivoFijo, jTableDatosSubGrupoActivoFijo,/*jScrollPanelDatosSubGrupoActivoFijo,*/jPanelCamposSubGrupoActivoFijo,jPanelPaginacionSubGrupoActivoFijo, /*jScrollPanelDatosEdicionSubGrupoActivoFijo,*/ jPanelAccionesSubGrupoActivoFijo,jPanelAccionesFormularioSubGrupoActivoFijo,jmenuBarSubGrupoActivoFijo,jmenuBarDetalleSubGrupoActivoFijo,jTtoolBarSubGrupoActivoFijo,jTtoolBarDetalleSubGrupoActivoFijo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesSubGrupoActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarSubGrupoActivoFijo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuSubGrupoActivoFijo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarSubGrupoActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarSubGrupoActivoFijo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleSubGrupoActivoFijo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuSubGrupoActivoFijo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarSubGrupoActivoFijo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleSubGrupoActivoFijo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.subgrupoactivofijoConstantesFunciones.getsFinalQuerySubGrupoActivoFijo();
		String  finalQueryPaginacionTodos=this.subgrupoactivofijoConstantesFunciones.getsFinalQuerySubGrupoActivoFijo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=SubGrupoActivoFijoConstantesFunciones.getArrayColumnasGlobalesNoSubGrupoActivoFijo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=SubGrupoActivoFijoConstantesFunciones.getArrayColumnasGlobalesSubGrupoActivoFijo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,SubGrupoActivoFijoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.subgrupoactivofijosEliminados= new ArrayList<SubGrupoActivoFijo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessSubGrupoActivoFijo();
		
				///*SubGrupoActivoFijoSessionBean*/this.subgrupoactivofijoSessionBean=new SubGrupoActivoFijoSessionBean();
			
			if(this.subgrupoactivofijoSessionBean==null) {
				this.subgrupoactivofijoSessionBean=new SubGrupoActivoFijoSessionBean();
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
					this.iNumeroPaginacion=SubGrupoActivoFijoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=SubGrupoActivoFijoConstantesFunciones.getClassesForeignKeysOfSubGrupoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/subgrupoactivofijo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			subgrupoactivofijosAux= new ArrayList<SubGrupoActivoFijo>();
			
				
			subgrupoactivofijoLogic.setDatosCliente(this.datosCliente);
			subgrupoactivofijoLogic.setDatosDeep(this.datosDeep);
			subgrupoactivofijoLogic.setIsConDeep(true);
			
			
			subgrupoactivofijoLogic.getSubGrupoActivoFijoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					subgrupoactivofijoLogic.getTodosSubGrupoActivoFijos(finalQueryGlobal,pagination);
					
					//subgrupoactivofijoLogic.getTodosSubGrupoActivoFijosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(subgrupoactivofijoLogic.getSubGrupoActivoFijos()==null|| subgrupoactivofijoLogic.getSubGrupoActivoFijos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							subgrupoactivofijosAux= new ArrayList<SubGrupoActivoFijo>();
							subgrupoactivofijosAux.addAll(subgrupoactivofijoLogic.getSubGrupoActivoFijos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subgrupoactivofijosAux= new ArrayList<SubGrupoActivoFijo>();
							subgrupoactivofijosAux.addAll(subgrupoactivofijos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							subgrupoactivofijoLogic.getTodosSubGrupoActivoFijos(finalQueryGlobal+"",this.pagination);												
							
							//subgrupoactivofijoLogic.getTodosSubGrupoActivoFijosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteSubGrupoActivoFijos("Todos",subgrupoactivofijoLogic.getSubGrupoActivoFijos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							subgrupoactivofijoLogic.setSubGrupoActivoFijos(new ArrayList<SubGrupoActivoFijo>());					
							subgrupoactivofijoLogic.getSubGrupoActivoFijos().addAll(subgrupoactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subgrupoactivofijos=new ArrayList<SubGrupoActivoFijo>();
							subgrupoactivofijos.addAll(subgrupoactivofijosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idSubGrupoActivoFijo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idSubGrupoActivoFijo=this.idActual;
				
				} else if(this.idSubGrupoActivoFijoActual!=null && this.idSubGrupoActivoFijoActual!=0L) {
					idSubGrupoActivoFijo=idSubGrupoActivoFijoActual;
				}
				
					
				this.sDetalleReporte=SubGrupoActivoFijoConstantesFunciones.getDetalleIndicePorId(idSubGrupoActivoFijo);
				
				this.subgrupoactivofijos=new ArrayList<SubGrupoActivoFijo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					subgrupoactivofijoLogic.getEntity(idSubGrupoActivoFijo);
					
					//subgrupoactivofijoLogic.getEntityWithConnection(idSubGrupoActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					subgrupoactivofijoLogic.setSubGrupoActivoFijos(new ArrayList<SubGrupoActivoFijo>());
					subgrupoactivofijoLogic.getSubGrupoActivoFijos().add(subgrupoactivofijoLogic.getSubGrupoActivoFijo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.subgrupoactivofijos=new ArrayList<SubGrupoActivoFijo>();
					this.subgrupoactivofijos.add(subgrupoactivofijo);
				}
				
				if(subgrupoactivofijoLogic.getSubGrupoActivoFijo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=SubGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					subgrupoactivofijoLogic.getSubGrupoActivoFijosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SubGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SubGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=subgrupoactivofijoLogic.getSubGrupoActivoFijos()==null||subgrupoactivofijoLogic.getSubGrupoActivoFijos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=subgrupoactivofijos==null|| subgrupoactivofijos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						subgrupoactivofijosAux=new ArrayList<SubGrupoActivoFijo>();
						subgrupoactivofijosAux.addAll(subgrupoactivofijoLogic.getSubGrupoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subgrupoactivofijosAux=new ArrayList<SubGrupoActivoFijo>();
							subgrupoactivofijosAux.addAll(subgrupoactivofijos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							subgrupoactivofijoLogic.getSubGrupoActivoFijosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=SubGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=SubGrupoActivoFijoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteSubGrupoActivoFijos("FK_IdEmpresa",subgrupoactivofijoLogic.getSubGrupoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteSubGrupoActivoFijos("FK_IdEmpresa",subgrupoactivofijos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						subgrupoactivofijoLogic.setSubGrupoActivoFijos(new ArrayList<SubGrupoActivoFijo>());
						subgrupoactivofijoLogic.getSubGrupoActivoFijos().addAll(subgrupoactivofijosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subgrupoactivofijos=new ArrayList<SubGrupoActivoFijo>();
							subgrupoactivofijos.addAll(subgrupoactivofijosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesSubGrupoActivoFijo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessSubGrupoActivoFijo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=subgrupoactivofijoLogic.getSubGrupoActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=subgrupoactivofijos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=subgrupoactivofijoLogic.getSubGrupoActivoFijos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=subgrupoactivofijos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(SubGrupoActivoFijo subgrupoactivofijo) {
		Boolean permite=true;
		
		if(this.subgrupoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=SubGrupoActivoFijoConstantesFunciones.getOrderByListaSubGrupoActivoFijo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=SubGrupoActivoFijoConstantesFunciones.getOrderByListaSubGrupoActivoFijo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SubGrupoActivoFijo subgrupoactivofijo:subgrupoactivofijoLogic.getSubGrupoActivoFijos()) {
				if(subgrupoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					subgrupoactivofijoTotales=subgrupoactivofijo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SubGrupoActivoFijo subgrupoactivofijo:this.subgrupoactivofijos) {
				if(subgrupoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					subgrupoactivofijoTotales=subgrupoactivofijo;
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
			this.subgrupoactivofijoAux=new SubGrupoActivoFijo();
			this.subgrupoactivofijoAux.setsType(Constantes2.S_TOTALES);
			this.subgrupoactivofijoAux.setIsNew(false);
			this.subgrupoactivofijoAux.setIsChanged(false);
			this.subgrupoactivofijoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				SubGrupoActivoFijoConstantesFunciones.TotalizarValoresFilaSubGrupoActivoFijo(this.subgrupoactivofijoLogic.getSubGrupoActivoFijos(),this.subgrupoactivofijoAux);
				
				this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().add(this.subgrupoactivofijoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				SubGrupoActivoFijoConstantesFunciones.TotalizarValoresFilaSubGrupoActivoFijo(this.subgrupoactivofijos,this.subgrupoactivofijoAux);
				
				this.subgrupoactivofijos.add(this.subgrupoactivofijoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		subgrupoactivofijoTotales=new SubGrupoActivoFijo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().remove(subgrupoactivofijoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.subgrupoactivofijos.remove(subgrupoactivofijoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		subgrupoactivofijoTotales=new SubGrupoActivoFijo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SubGrupoActivoFijo subgrupoactivofijo:subgrupoactivofijoLogic.getSubGrupoActivoFijos()) {
				if(subgrupoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					subgrupoactivofijoTotales=subgrupoactivofijo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SubGrupoActivoFijoConstantesFunciones.TotalizarValoresFilaSubGrupoActivoFijo(this.subgrupoactivofijoLogic.getSubGrupoActivoFijos(),subgrupoactivofijoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SubGrupoActivoFijo subgrupoactivofijo:this.subgrupoactivofijos) {
				if(subgrupoactivofijo.getsType().equals(Constantes2.S_TOTALES)) {
					subgrupoactivofijoTotales=subgrupoactivofijo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SubGrupoActivoFijoConstantesFunciones.TotalizarValoresFilaSubGrupoActivoFijo(this.subgrupoactivofijos,subgrupoactivofijoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getSubGrupoActivoFijosFK_IdDetalleGrupoActivoFijo()throws Exception {
		try {
			sAccionBusqueda="FK_IdDetalleGrupoActivoFijo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getSubGrupoActivoFijosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getSubGrupoActivoFijosFK_IdDetalleGrupoActivoFijo(String sFinalQuery,Long id_detalle_grupo_activo_fijo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					subgrupoactivofijoLogic.getSubGrupoActivoFijosFK_IdDetalleGrupoActivoFijo(sFinalQuery,this.pagination,id_detalle_grupo_activo_fijo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getSubGrupoActivoFijosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					subgrupoactivofijoLogic.getSubGrupoActivoFijosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosSubGrupoActivoFijo() {
		this.isPermisoTodoSubGrupoActivoFijo=false;
		this.isPermisoNuevoSubGrupoActivoFijo=false;
		this.isPermisoActualizarSubGrupoActivoFijo=false;
		this.isPermisoActualizarOriginalSubGrupoActivoFijo=false;
		this.isPermisoEliminarSubGrupoActivoFijo=false;
		this.isPermisoGuardarCambiosSubGrupoActivoFijo=false;
		this.isPermisoConsultaSubGrupoActivoFijo=false;
		this.isPermisoBusquedaSubGrupoActivoFijo=false;
		this.isPermisoReporteSubGrupoActivoFijo=false;		
		this.isPermisoOrdenSubGrupoActivoFijo=false;		
		this.isPermisoPaginacionMedioSubGrupoActivoFijo=false;		
		this.isPermisoPaginacionAltoSubGrupoActivoFijo=false;
		this.isPermisoPaginacionTodoSubGrupoActivoFijo=false;
		this.isPermisoCopiarSubGrupoActivoFijo=false;		
		this.isPermisoVerFormSubGrupoActivoFijo=false;		
		this.isPermisoDuplicarSubGrupoActivoFijo=false;		
		this.isPermisoOrdenSubGrupoActivoFijo=false;		
	}
	
	public void setPermisosUsuarioSubGrupoActivoFijo(Boolean isPermiso) {
		this.isPermisoTodoSubGrupoActivoFijo=isPermiso;
		this.isPermisoNuevoSubGrupoActivoFijo=isPermiso;
		this.isPermisoActualizarSubGrupoActivoFijo=isPermiso;
		this.isPermisoActualizarOriginalSubGrupoActivoFijo=isPermiso;
		this.isPermisoEliminarSubGrupoActivoFijo=isPermiso;
		this.isPermisoGuardarCambiosSubGrupoActivoFijo=isPermiso;
		this.isPermisoConsultaSubGrupoActivoFijo=isPermiso;
		this.isPermisoBusquedaSubGrupoActivoFijo=isPermiso;
		this.isPermisoReporteSubGrupoActivoFijo=isPermiso;
		this.isPermisoOrdenSubGrupoActivoFijo=isPermiso;		
		this.isPermisoPaginacionMedioSubGrupoActivoFijo=isPermiso;		
		this.isPermisoPaginacionAltoSubGrupoActivoFijo=isPermiso;		
		this.isPermisoPaginacionTodoSubGrupoActivoFijo=isPermiso;		
		this.isPermisoCopiarSubGrupoActivoFijo=isPermiso;		
		this.isPermisoVerFormSubGrupoActivoFijo=isPermiso;		
		this.isPermisoDuplicarSubGrupoActivoFijo=isPermiso;
		this.isPermisoOrdenSubGrupoActivoFijo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioSubGrupoActivoFijo(Boolean isPermiso) {
		//this.isPermisoTodoSubGrupoActivoFijo=isPermiso;
		this.isPermisoNuevoSubGrupoActivoFijo=isPermiso;
		this.isPermisoActualizarSubGrupoActivoFijo=isPermiso;
		this.isPermisoActualizarOriginalSubGrupoActivoFijo=isPermiso;
		this.isPermisoEliminarSubGrupoActivoFijo=isPermiso;
		this.isPermisoGuardarCambiosSubGrupoActivoFijo=isPermiso;
		//this.isPermisoConsultaSubGrupoActivoFijo=isPermiso;
		//this.isPermisoBusquedaSubGrupoActivoFijo=isPermiso;
		//this.isPermisoReporteSubGrupoActivoFijo=isPermiso;
		//this.isPermisoOrdenSubGrupoActivoFijo=isPermiso;		
		//this.isPermisoPaginacionMedioSubGrupoActivoFijo=isPermiso;		
		//this.isPermisoPaginacionAltoSubGrupoActivoFijo=isPermiso;		
		//this.isPermisoPaginacionTodoSubGrupoActivoFijo=isPermiso;		
		//this.isPermisoCopiarSubGrupoActivoFijo=isPermiso;		
		//this.isPermisoDuplicarSubGrupoActivoFijo=isPermiso;
		//this.isPermisoOrdenSubGrupoActivoFijo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioSubGrupoActivoFijoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleActivoFijoConstantesFunciones.SNOMBREOPCION);
		
		if(SubGrupoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
		this.isTienePermisosDetalleActivoFijo=this.verificarGetPermisosUsuarioOpcionSubGrupoActivoFijoClaseRelacionada(this.opcionsRelacionadas,DetalleActivoFijoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebSubGrupoActivoFijo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioSubGrupoActivoFijoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleActivoFijo=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioSubGrupoActivoFijoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionSubGrupoActivoFijoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioSubGrupoActivoFijoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleActivoFijo && this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null && this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTabbedPaneRelacionesSubGrupoActivoFijo.remove(this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioSubGrupoActivoFijo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(SubGrupoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, SubGrupoActivoFijoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoSubGrupoActivoFijo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarSubGrupoActivoFijo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalSubGrupoActivoFijo=this.isPermisoActualizarSubGrupoActivoFijo;
			this.isPermisoEliminarSubGrupoActivoFijo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosSubGrupoActivoFijo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaSubGrupoActivoFijo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaSubGrupoActivoFijo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoSubGrupoActivoFijo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteSubGrupoActivoFijo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSubGrupoActivoFijo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioSubGrupoActivoFijo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoSubGrupoActivoFijo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoSubGrupoActivoFijo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarSubGrupoActivoFijo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormSubGrupoActivoFijo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarSubGrupoActivoFijo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSubGrupoActivoFijo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosSubGrupoActivoFijo.setToolTipText(this.jTableDatosSubGrupoActivoFijo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioSubGrupoActivoFijo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioSubGrupoActivoFijo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(SubGrupoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(SubGrupoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioSubGrupoActivoFijo() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleActivoFijo && this.subgrupoactivofijoConstantesFunciones.mostrarDetalleActivoFijoSubGrupoActivoFijo && !SubGrupoActivoFijoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Activo Fijo");
			reporte.setsDescripcion("Detalle Activo Fijo");
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
	public void inicializarCombosForeignKeySubGrupoActivoFijoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.detallegrupoactivofijosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeySubGrupoActivoFijoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(SubGrupoActivoFijoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeySubGrupoActivoFijoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyDetalleGrupoActivoFijoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyDetalleGrupoActivoFijoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.detallegrupoactivofijosForeignKey==null||this.detallegrupoactivofijosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=DetalleGrupoActivoFijoConstantesFunciones.getArrayColumnasGlobalesDetalleGrupoActivoFijo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DetalleGrupoActivoFijoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=DetalleGrupoActivoFijoConstantesFunciones.SFINALQUERY;

				this.cargarCombosDetalleGrupoActivoFijosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeySubGrupoActivoFijoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			SubGrupoActivoFijoParameterReturnGeneral subgrupoactivofijoReturnGeneral=new SubGrupoActivoFijoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.subgrupoactivofijoConstantesFunciones.cargarid_empresaSubGrupoActivoFijo)
					 || (this.esRecargarFks && this.subgrupoactivofijoConstantesFunciones.cargarid_empresaSubGrupoActivoFijo)) {

					if(!this.subgrupoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+subgrupoactivofijoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalDetalleGrupoActivoFijo="";

				if(((this.detallegrupoactivofijosForeignKey==null||this.detallegrupoactivofijosForeignKey.size()<=0) && this.subgrupoactivofijoConstantesFunciones.cargarid_detalle_grupo_activo_fijoSubGrupoActivoFijo)
					 || (this.esRecargarFks && this.subgrupoactivofijoConstantesFunciones.cargarid_detalle_grupo_activo_fijoSubGrupoActivoFijo)) {

					if(!this.subgrupoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=DetalleGrupoActivoFijoConstantesFunciones.getArrayColumnasGlobalesDetalleGrupoActivoFijo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalDetalleGrupoActivoFijo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DetalleGrupoActivoFijoConstantesFunciones.TABLENAME);

						finalQueryGlobalDetalleGrupoActivoFijo=Funciones.GetFinalQueryAppend(finalQueryGlobalDetalleGrupoActivoFijo, "");
						finalQueryGlobalDetalleGrupoActivoFijo+=DetalleGrupoActivoFijoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosDetalleGrupoActivoFijosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalDetalleGrupoActivoFijo=" WHERE " + ConstantesSql.ID + "="+subgrupoactivofijoSessionBean.getlidDetalleGrupoActivoFijoActual();
					}
				} else {
					finalQueryGlobalDetalleGrupoActivoFijo="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				subgrupoactivofijoReturnGeneral=subgrupoactivofijoLogic.cargarCombosLoteForeignKeySubGrupoActivoFijo(finalQueryGlobalEmpresa,finalQueryGlobalDetalleGrupoActivoFijo);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=subgrupoactivofijoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalDetalleGrupoActivoFijo.equals("NONE")) {
				this.detallegrupoactivofijosForeignKey=subgrupoactivofijoReturnGeneral.getdetallegrupoactivofijosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeySubGrupoActivoFijo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyDetalleGrupoActivoFijo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.subgrupoactivofijoSessionBean==null) {
				this.subgrupoactivofijoSessionBean=new SubGrupoActivoFijoSessionBean();
			}

			if(!this.subgrupoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyDetalleGrupoActivoFijo()throws Exception {
		try {

			if(!this.subgrupoactivofijoSessionBean.getisBusquedaDesdeForeignKeySesionDetalleGrupoActivoFijo()) {
				DetalleGrupoActivoFijo detallegrupoactivofijo=new DetalleGrupoActivoFijo();
				DetalleGrupoActivoFijoConstantesFunciones.setDetalleGrupoActivoFijoDescripcion(detallegrupoactivofijo,Constantes.SMENSAJE_ESCOJA_OPCION);
				detallegrupoactivofijo.setId(null);

				if(!DetalleGrupoActivoFijoConstantesFunciones.ExisteEnLista(this.detallegrupoactivofijosForeignKey,detallegrupoactivofijo,true)) {

					this.detallegrupoactivofijosForeignKey.add(0,detallegrupoactivofijo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeySubGrupoActivoFijo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeySubGrupoActivoFijo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeySubGrupoActivoFijo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeySubGrupoActivoFijo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeySubGrupoActivoFijo(SubGrupoActivoFijo subgrupoactivofijo)throws Exception {	
		try {
			
			this.setActualDetalleGrupoActivoFijoForeignKey(subgrupoactivofijo.getid_detalle_grupo_activo_fijo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeySubGrupoActivoFijo(SubGrupoActivoFijo subgrupoactivofijo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeySubGrupoActivoFijo()throws Exception {	
		try {
			
			this.setActualDetalleGrupoActivoFijoForeignKey(this.subgrupoactivofijoConstantesFunciones.getid_detalle_grupo_activo_fijo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeySubGrupoActivoFijo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeySubGrupoActivoFijo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeySubGrupoActivoFijo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroSubGrupoActivoFijo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeySubGrupoActivoFijo()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameDetalleGrupoActivoFijosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeySubGrupoActivoFijo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameDetalleGrupoActivoFijosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeySubGrupoActivoFijo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_empresaSubGrupoActivoFijo!=null && this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_empresaSubGrupoActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_empresaSubGrupoActivoFijo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijo!=null && this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijo.getItemCount()>0) {
				this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public SubGrupoActivoFijoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public SubGrupoActivoFijoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public SubGrupoActivoFijoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.subgrupoactivofijoSessionBean=new SubGrupoActivoFijoSessionBean(); 
		this.subgrupoactivofijoConstantesFunciones=new SubGrupoActivoFijoConstantesFunciones(); 
		this.subgrupoactivofijoBean=new SubGrupoActivoFijo();//(this.subgrupoactivofijoConstantesFunciones); 		
		this.subgrupoactivofijoReturnGeneral=new SubGrupoActivoFijoParameterReturnGeneral(); 
		
		this.subgrupoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.subgrupoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public SubGrupoActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public SubGrupoActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public SubGrupoActivoFijoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessSubGrupoActivoFijo(true);
			
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
			
			this.subgrupoactivofijoConstantesFunciones=new SubGrupoActivoFijoConstantesFunciones(); 
			this.subgrupoactivofijoBean=new SubGrupoActivoFijo();//this.subgrupoactivofijoConstantesFunciones); 			
			this.subgrupoactivofijoReturnGeneral=new SubGrupoActivoFijoParameterReturnGeneral(); 
		
			SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sub Grupo Activo Fijo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.subgrupoactivofijo=new SubGrupoActivoFijo();
			this.subgrupoactivofijos = new ArrayList<SubGrupoActivoFijo>();
			this.subgrupoactivofijosAux = new ArrayList<SubGrupoActivoFijo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic=new SubGrupoActivoFijoLogic();
				this.subgrupoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			//this.subgrupoactivofijoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.subgrupoactivofijoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormSubGrupoActivoFijo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoSubGrupoActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSubGrupoActivoFijo);	
					}
					
					if(this.jInternalFrameImportacionSubGrupoActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSubGrupoActivoFijo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderBySubGrupoActivoFijo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderBySubGrupoActivoFijo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormSubGrupoActivoFijo);
				this.jInternalFrameDetalleFormSubGrupoActivoFijo.setVisible(false);
				this.jInternalFrameDetalleFormSubGrupoActivoFijo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoSubGrupoActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSubGrupoActivoFijo);
					this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.setVisible(false);
					this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionSubGrupoActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionSubGrupoActivoFijo);
					this.jInternalFrameImportacionSubGrupoActivoFijo.setVisible(false);
					this.jInternalFrameImportacionSubGrupoActivoFijo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderBySubGrupoActivoFijo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderBySubGrupoActivoFijo);
					this.jInternalFrameOrderBySubGrupoActivoFijo.setVisible(false);
					this.jInternalFrameOrderBySubGrupoActivoFijo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idSubGrupoActivoFijoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=SubGrupoActivoFijoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.subgrupoactivofijoReturnGeneral=new SubGrupoActivoFijoParameterReturnGeneral();
			
			this.subgrupoactivofijoParameterGeneral=new SubGrupoActivoFijoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.subgrupoactivofijoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(SubGrupoActivoFijoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleActivoFijoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SubGrupoActivoFijoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado(),this.subgrupoactivofijoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SubGrupoActivoFijoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado(),this.subgrupoactivofijoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaDuplicarSubGrupoActivoFijo=true;
			this.isVisibilidadCeldaCopiarSubGrupoActivoFijo=true;
			this.isVisibilidadCeldaVerFormSubGrupoActivoFijo=true;
			this.isVisibilidadCeldaOrdenSubGrupoActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaModificarSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaActualizarSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaEliminarSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaCancelarSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaGuardarSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosSubGrupoActivoFijo=false;
			
			
			this.isVisibilidadFK_IdDetalleGrupoActivoFijo=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesSubGrupoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosSubGrupoActivoFijo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioSubGrupoActivoFijo(false);
			
			this.setPermisosUsuarioSubGrupoActivoFijo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado() 
				|| (this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado() && this.subgrupoactivofijoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioSubGrupoActivoFijoClasesRelacionadas();
			}
			
			if(this.subgrupoactivofijoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioSubGrupoActivoFijoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!SubGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosSubGrupoActivoFijo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualSubGrupoActivoFijo();
			}
			
			if(!this.isPermisoBusquedaSubGrupoActivoFijo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasSubGrupoActivoFijo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioSubGrupoActivoFijo,this.isPermisoPaginacionMedioSubGrupoActivoFijo,this.isPermisoPaginacionTodoSubGrupoActivoFijo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(SubGrupoActivoFijoConstantesFunciones.getTiposSeleccionarSubGrupoActivoFijo());
				
				this.tiposColumnasSelect=SubGrupoActivoFijoConstantesFunciones.getTiposSeleccionarSubGrupoActivoFijo(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectSubGrupoActivoFijo();				
				//this.tiposRelacionesSelect=SubGrupoActivoFijoConstantesFunciones.getTiposRelacionesSubGrupoActivoFijo(true);
				
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
			//if(!this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioSubGrupoActivoFijo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioSubGrupoActivoFijo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioSubGrupoActivoFijo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesSubGrupoActivoFijo() ;
			
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
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.detallegrupoactivofijoLogic=new DetalleGrupoActivoFijoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				subgrupoactivofijoImplementable= (SubGrupoActivoFijoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SubGrupoActivoFijoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				subgrupoactivofijoImplementableHome= (SubGrupoActivoFijoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SubGrupoActivoFijoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.subgrupoactivofijos= new ArrayList<SubGrupoActivoFijo>();
			this.subgrupoactivofijosEliminados= new ArrayList<SubGrupoActivoFijo>();
						
			this.isEsNuevoSubGrupoActivoFijo=false;
			this.esParaAccionDesdeFormularioSubGrupoActivoFijo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.detallegrupoactivofijosForeignKey=new ArrayList<DetalleGrupoActivoFijo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeySubGrupoActivoFijo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroSubGrupoActivoFijo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=SubGrupoActivoFijoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesSubGrupoActivoFijo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingSubGrupoActivoFijo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioSubGrupoActivoFijo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioSubGrupoActivoFijo();
			}
			
			SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasSubGrupoActivoFijo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasSubGrupoActivoFijo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasSubGrupoActivoFijo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessSubGrupoActivoFijo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga SubGrupoActivoFijo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectSubGrupoActivoFijo() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesSubGrupoActivoFijo")) {
				iIndex=this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTabbedPaneRelacionesSubGrupoActivoFijo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTabbedPaneRelacionesSubGrupoActivoFijo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosSubGrupoActivoFijo.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Activo Fijos")) {
					if(!DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessSubGrupoActivoFijo();

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
				this.finishProcessSubGrupoActivoFijo();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleActivoFijo(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.cargarSessionConBeanSwingJInternalFrameDetalleActivoFijo(false,true,iIndex);
		this.jButtonDetalleActivoFijoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleActivoFijo();

		//this.jTabbedPaneRelacionesSubGrupoActivoFijo.updateUI();
		//this.jTabbedPaneRelacionesSubGrupoActivoFijo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesSubGrupoActivoFijo.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleActivoFijo")) {
				int row=this.jTableDatosSubGrupoActivoFijo.getSelectedRow();
				jButtonDetalleActivoFijoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Activo Fijo")) {

					if(this.isTienePermisosDetalleActivoFijo && this.subgrupoactivofijoConstantesFunciones.mostrarDetalleActivoFijoSubGrupoActivoFijo && !SubGrupoActivoFijoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Activo Fijos"+"("+DetalleActivoFijoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Activo Fijos");

						if(subgrupoactivofijoConstantesFunciones.resaltarDetalleActivoFijoSubGrupoActivoFijo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(subgrupoactivofijoConstantesFunciones.resaltarDetalleActivoFijoSubGrupoActivoFijo);
						}

						jmenuItem.setEnabled(this.subgrupoactivofijoConstantesFunciones.activarDetalleActivoFijoSubGrupoActivoFijo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleActivoFijo"));

						

						this.jInternalFrameDetalleFormSubGrupoActivoFijo.jmenuDetalleSubGrupoActivoFijo.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeySubGrupoActivoFijo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeySubGrupoActivoFijo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeySubGrupoActivoFijo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeySubGrupoActivoFijoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeySubGrupoActivoFijo();
		
		this.cargarCombosFrameForeignKeySubGrupoActivoFijo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeySubGrupoActivoFijo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeySubGrupoActivoFijo();
		}
	}
	
	

	public void cargarCombosForeignKeyDetalleGrupoActivoFijo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyDetalleGrupoActivoFijoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyDetalleGrupoActivoFijo();
				this.cargarCombosFrameDetalleGrupoActivoFijosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaDetalleGrupoActivoFijo(this.detallegrupoactivofijosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoSubGrupoActivoFijoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.subgrupoactivofijoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormSubGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
			
			
			if(jTableDatosSubGrupoActivoFijo.getRowCount()>=1) {
				jTableDatosSubGrupoActivoFijo.removeRowSelectionInterval(0, jTableDatosSubGrupoActivoFijo.getRowCount()-1);						
			}
			
			this.isEsNuevoSubGrupoActivoFijo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoSubGrupoActivoFijo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesSubGrupoActivoFijo(true);			
			//this.subgrupoactivofijo=new SubGrupoActivoFijo();
			//this.subgrupoactivofijo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSubGrupoActivoFijo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSubGrupoActivoFijo() ;
			
			if(SubGrupoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSubGrupoActivoFijo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.subgrupoactivofijo);	
			this.actualizarInformacion("INFO_PADRE",false,this.subgrupoactivofijo);				
			
			SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
			
			if(this.subgrupoactivofijoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar SubGrupoActivoFijo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarSubGrupoActivoFijoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<SubGrupoActivoFijo> subgrupoactivofijosSeleccionados=new ArrayList<SubGrupoActivoFijo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosSubGrupoActivoFijo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosSubGrupoActivoFijo.getSelectedRows().length;			
			}
			
			subgrupoactivofijosSeleccionados=this.getSubGrupoActivoFijosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoSubGrupoActivoFijo--;			
				//SubGrupoActivoFijo subgrupoactivofijoAux= new SubGrupoActivoFijo();			
				//subgrupoactivofijoAux.setId(this.iIdNuevoSubGrupoActivoFijo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//SubGrupoActivoFijo subgrupoactivofijoOrigen=new SubGrupoActivoFijo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(SubGrupoActivoFijo subgrupoactivofijoOrigen : subgrupoactivofijosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosSubGrupoActivoFijo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							subgrupoactivofijoOrigen =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							subgrupoactivofijoOrigen =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaSubGrupoActivoFijo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.subgrupoactivofijo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosSubGrupoActivoFijo(subgrupoactivofijoOrigen,this.subgrupoactivofijo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoActivoFijo(this.subgrupoactivofijo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().add(this.subgrupoactivofijoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.subgrupoactivofijos.add(this.subgrupoactivofijoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaSubGrupoActivoFijo(false);
				
				this.jTableDatosSubGrupoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoSubGrupoActivoFijo(), this.getIndiceNuevoSubGrupoActivoFijo());
				
				int iLastRow =  this.jTableDatosSubGrupoActivoFijo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSubGrupoActivoFijo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSubGrupoActivoFijo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSubGrupoActivoFijo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarSubGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<SubGrupoActivoFijo> subgrupoactivofijosSeleccionados=new ArrayList<SubGrupoActivoFijo>();									
		
			SubGrupoActivoFijo subgrupoactivofijoOrigen=new SubGrupoActivoFijo();
			SubGrupoActivoFijo subgrupoactivofijoDestino=new SubGrupoActivoFijo();
				
			subgrupoactivofijosSeleccionados=this.getSubGrupoActivoFijosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosSubGrupoActivoFijo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || subgrupoactivofijosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosSubGrupoActivoFijo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						subgrupoactivofijoOrigen =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						subgrupoactivofijoOrigen =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						subgrupoactivofijoDestino =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						subgrupoactivofijoDestino =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				subgrupoactivofijoOrigen =subgrupoactivofijosSeleccionados.get(0);
				subgrupoactivofijoDestino =subgrupoactivofijosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosSubGrupoActivoFijo(subgrupoactivofijoOrigen,subgrupoactivofijoDestino,true,false);
				
				subgrupoactivofijoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(subgrupoactivofijoDestino,subgrupoactivofijoLogic.getSubGrupoActivoFijos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(subgrupoactivofijoDestino,subgrupoactivofijos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaSubGrupoActivoFijo(false);
				
				//this.jTableDatosSubGrupoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoSubGrupoActivoFijo(), this.getIndiceNuevoSubGrupoActivoFijo());
				
				int iLastRow =  this.jTableDatosSubGrupoActivoFijo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSubGrupoActivoFijo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSubGrupoActivoFijo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSubGrupoActivoFijo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormSubGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSubGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarSubGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesSubGrupoActivoFijo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasSubGrupoActivoFijo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesSubGrupoActivoFijo.setVisible(!isVisible);
			this.jPanelPaginacionSubGrupoActivoFijo.setVisible(!isVisible);
			this.jPanelAccionesSubGrupoActivoFijo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarSubGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameSubGrupoActivoFijo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoSubGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoSubGrupoActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionSubGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionSubGrupoActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderBySubGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBySubGrupoActivoFijo();
			
			this.abrirFrameOrderBySubGrupoActivoFijo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderBySubGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBySubGrupoActivoFijo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleSubGrupoActivoFijo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormSubGrupoActivoFijo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormSubGrupoActivoFijo.isMaximum()) {
					this.jInternalFrameDetalleFormSubGrupoActivoFijo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormSubGrupoActivoFijo.setSize(this.jInternalFrameDetalleFormSubGrupoActivoFijo.iWidthFormulario,this.jInternalFrameDetalleFormSubGrupoActivoFijo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormSubGrupoActivoFijo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormSubGrupoActivoFijo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormSubGrupoActivoFijo.isMaximum()) {
						this.jInternalFrameDetalleFormSubGrupoActivoFijo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormSubGrupoActivoFijo.jContentPaneDetalleSubGrupoActivoFijo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTabbedPaneRelacionesSubGrupoActivoFijo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormSubGrupoActivoFijo.jContentPaneDetalleSubGrupoActivoFijo.getWidth(),SubGrupoActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTabbedPaneRelacionesSubGrupoActivoFijo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormSubGrupoActivoFijo.jContentPaneDetalleSubGrupoActivoFijo.getWidth(),SubGrupoActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTabbedPaneRelacionesSubGrupoActivoFijo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormSubGrupoActivoFijo.jContentPaneDetalleSubGrupoActivoFijo.getWidth(),SubGrupoActivoFijoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleActivoFijo();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormSubGrupoActivoFijo.setVisible(true);
	        this.jInternalFrameDetalleFormSubGrupoActivoFijo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderBySubGrupoActivoFijo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderBySubGrupoActivoFijo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderBySubGrupoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySubGrupoActivoFijo,false,this);
				} else {
					this.jInternalFrameOrderBySubGrupoActivoFijo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySubGrupoActivoFijo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderBySubGrupoActivoFijo);
				this.jInternalFrameOrderBySubGrupoActivoFijo.setVisible(false);
				this.jInternalFrameOrderBySubGrupoActivoFijo.setSelected(false);
				
				this.jInternalFrameOrderBySubGrupoActivoFijo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySubGrupoActivoFijo"));
				
				this.inicializarActualizarBindingTablaOrderBySubGrupoActivoFijo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionSubGrupoActivoFijo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionSubGrupoActivoFijo==null) {
				
				this.jInternalFrameImportacionSubGrupoActivoFijo=new ImportacionJInternalFrame(SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSubGrupoActivoFijo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionSubGrupoActivoFijo);
				this.jInternalFrameImportacionSubGrupoActivoFijo.setVisible(false);
				this.jInternalFrameImportacionSubGrupoActivoFijo.setSelected(false);


				this.jInternalFrameImportacionSubGrupoActivoFijo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSubGrupoActivoFijo"));
				this.jInternalFrameImportacionSubGrupoActivoFijo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSubGrupoActivoFijo"));
				this.jInternalFrameImportacionSubGrupoActivoFijo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSubGrupoActivoFijo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoSubGrupoActivoFijo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoSubGrupoActivoFijo==null) {
				this.jInternalFrameReporteDinamicoSubGrupoActivoFijo=new ReporteDinamicoJInternalFrame(SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSubGrupoActivoFijo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSubGrupoActivoFijo);
				this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.setVisible(false);
				this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSubGrupoActivoFijo"));
				this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSubGrupoActivoFijo"));
				this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSubGrupoActivoFijo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSubGrupoActivoFijo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleActivoFijo() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormSubGrupoActivoFijo.jContentPaneDetalleSubGrupoActivoFijo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleSubGrupoActivoFijo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormSubGrupoActivoFijo);
			
	       	this.jInternalFrameDetalleFormSubGrupoActivoFijo.setVisible(false);
	        this.jInternalFrameDetalleFormSubGrupoActivoFijo.setSelected(false);
			
			//this.jInternalFrameDetalleFormSubGrupoActivoFijo.dispose();
			//this.jInternalFrameDetalleFormSubGrupoActivoFijo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoSubGrupoActivoFijo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.setVisible(true);
	        this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionSubGrupoActivoFijo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionSubGrupoActivoFijo.setVisible(true);
	        this.jInternalFrameImportacionSubGrupoActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBySubGrupoActivoFijo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderBySubGrupoActivoFijo.setVisible(true);
	        this.jInternalFrameOrderBySubGrupoActivoFijo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBySubGrupoActivoFijo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderBySubGrupoActivoFijo.setVisible(false);
	        this.jInternalFrameOrderBySubGrupoActivoFijo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoSubGrupoActivoFijo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.setVisible(false);
	        this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionSubGrupoActivoFijo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionSubGrupoActivoFijo.setVisible(false);
	        this.jInternalFrameImportacionSubGrupoActivoFijo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarSubGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarSubGrupoActivoFijo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarSubGrupoActivoFijo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSubGrupoActivoFijo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesSubGrupoActivoFijo(true);
			//this.isEsNuevoSubGrupoActivoFijo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesSubGrupoActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSubGrupoActivoFijo(false) ;
			
			if(subgrupoactivofijoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.getEsGuardarRelacionado() && DetalleActivoFijoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleActivoFijoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(SubGrupoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSubGrupoActivoFijo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSubGrupoActivoFijo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaSubGrupoActivoFijoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosSubGrupoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarSubGrupoActivoFijo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSubGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSubGrupoActivoFijo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesSubGrupoActivoFijo(true);
			//this.isEsNuevoSubGrupoActivoFijo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.subgrupoactivofijo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesSubGrupoActivoFijo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesSubGrupoActivoFijo(false) ;
			
			if(SubGrupoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSubGrupoActivoFijo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSubGrupoActivoFijo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaDetalleGrupoActivoFijo(List<DetalleGrupoActivoFijo> detallegrupoactivofijosForeignKey)throws Exception{
		TableColumn tableColumnDetalleGrupoActivoFijo=this.jTableDatosSubGrupoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubGrupoActivoFijo,SubGrupoActivoFijoConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO));
		TableCellEditor tableCellEditorDetalleGrupoActivoFijo =tableColumnDetalleGrupoActivoFijo.getCellEditor();

		DetalleGrupoActivoFijoTableCell detallegrupoactivofijoTableCellFk=(DetalleGrupoActivoFijoTableCell)tableCellEditorDetalleGrupoActivoFijo;

		if(detallegrupoactivofijoTableCellFk!=null) {
			detallegrupoactivofijoTableCellFk.setdetallegrupoactivofijosForeignKey(detallegrupoactivofijosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosSubGrupoActivoFijo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//detallegrupoactivofijoTableCellFk.setRowActual(intSelectedRow);
			//detallegrupoactivofijoTableCellFk.setdetallegrupoactivofijosForeignKeyActual(detallegrupoactivofijosForeignKey);
		//}


		if(detallegrupoactivofijoTableCellFk!=null) {
			detallegrupoactivofijoTableCellFk.RecargarDetalleGrupoActivoFijosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarSubGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesSubGrupoActivoFijo(false);
			
			//if(!this.isEsNuevoSubGrupoActivoFijo) {								
				int intSelectedRow = this.jTableDatosSubGrupoActivoFijo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(SubGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualSubGrupoActivoFijo(this.subgrupoactivofijo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoActivoFijo(this.subgrupoactivofijo);
				
			}
			
			if(this.permiteMantenimiento(this.subgrupoactivofijo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoSubGrupoActivoFijo=true;
					this.inicializarActualizarBindingTablaSubGrupoActivoFijo(false);
					this.isEsNuevoSubGrupoActivoFijo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoSubGrupoActivoFijo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoSubGrupoActivoFijo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSubGrupoActivoFijo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSubGrupoActivoFijo(false);
				
				this.habilitarDeshabilitarControlesSubGrupoActivoFijo(false);
			
												
				
				if(SubGrupoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleSubGrupoActivoFijo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoSubGrupoActivoFijoActionPerformed(evt,subgrupoactivofijoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualSubGrupoActivoFijo(this.subgrupoactivofijo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosSubGrupoActivoFijo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,subgrupoactivofijoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.subgrupoactivofijo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(SubGrupoActivoFijo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubGrupoActivoFijo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarSubGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosSubGrupoActivoFijo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				this.subgrupoactivofijo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				this.subgrupoactivofijo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.subgrupoactivofijo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((SubGrupoActivoFijoModel) this.jTableDatosSubGrupoActivoFijo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoSubGrupoActivoFijo=true;
				this.inicializarActualizarBindingTablaSubGrupoActivoFijo(false);
				this.isEsNuevoSubGrupoActivoFijo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSubGrupoActivoFijo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSubGrupoActivoFijo(false);
				
				this.habilitarDeshabilitarControlesSubGrupoActivoFijo(false);
				
				
				
				if(SubGrupoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleSubGrupoActivoFijo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarSubGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosSubGrupoActivoFijo.getRowCount()>=1) {
				jTableDatosSubGrupoActivoFijo.removeRowSelectionInterval(0, jTableDatosSubGrupoActivoFijo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesSubGrupoActivoFijo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaSubGrupoActivoFijo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSubGrupoActivoFijo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSubGrupoActivoFijo(false) ;
			
			this.isEsNuevoSubGrupoActivoFijo=false;
			
			if(SubGrupoActivoFijoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleSubGrupoActivoFijo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosSubGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingSubGrupoActivoFijo(false);
				
				//SI ES MANUAL
				if(SubGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualSubGrupoActivoFijo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosSubGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoSubGrupoActivoFijo--;			
			//SubGrupoActivoFijo subgrupoactivofijoAux= new SubGrupoActivoFijo();			
			//subgrupoactivofijoAux.setId(this.iIdNuevoSubGrupoActivoFijo);
			
			if(this.jInternalFrameDetalleFormSubGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaSubGrupoActivoFijo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoActivoFijo(this.subgrupoactivofijo);
			
			this.subgrupoactivofijo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().add(this.subgrupoactivofijoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.subgrupoactivofijos.add(this.subgrupoactivofijoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaSubGrupoActivoFijo(false);
			
			this.jTableDatosSubGrupoActivoFijo.setRowSelectionInterval(this.getIndiceNuevoSubGrupoActivoFijo(), this.getIndiceNuevoSubGrupoActivoFijo());
			
			int iLastRow =  this.jTableDatosSubGrupoActivoFijo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosSubGrupoActivoFijo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosSubGrupoActivoFijo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaSubGrupoActivoFijo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionSubGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingSubGrupoActivoFijo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSubGrupoActivoFijo(false);
			
			//SI ES MANUAL
			if(SubGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSubGrupoActivoFijo();
			}
			
			//this.abrirFrameTreeSubGrupoActivoFijo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionSubGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Sub Grupo Activo FijoS ?", "MANTENIMIENTO DE Sub Grupo Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionSubGrupoActivoFijo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralSubGrupoActivoFijo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.subgrupoactivofijoReturnGeneral=subgrupoactivofijoLogic.procesarImportacionSubGrupoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.subgrupoactivofijoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarSubGrupoActivoFijoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionSubGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionSubGrupoActivoFijo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionSubGrupoActivoFijo.setFileImportacion(this.jInternalFrameImportacionSubGrupoActivoFijo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionSubGrupoActivoFijo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionSubGrupoActivoFijo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionSubGrupoActivoFijo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionSubGrupoActivoFijo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoSubGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<SubGrupoActivoFijo> subgrupoactivofijosSeleccionados=new ArrayList<SubGrupoActivoFijo>();		

		subgrupoactivofijosSeleccionados=this.getSubGrupoActivoFijosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("SubGrupoActivoFijoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"SubGrupoActivoFijoBaseDesign.jrxml";
			
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
			
			this.generarReporteSubGrupoActivoFijos("Todos",subgrupoactivofijosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sub Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SubGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SubGrupoActivoFijoConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_DetalleGrupoActivoFijo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_DetalleGrupoActivoFijo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_DetalleGrupoActivoFijo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_DetalleGrupoActivoFijo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SubGrupoActivoFijoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SubGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SubGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_glas_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_glas_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_glas_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_glas_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case SubGrupoActivoFijoConstantesFunciones.LABEL_ESVEHICULO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Vehiculo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Vehiculo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Vehiculo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Vehiculo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case SubGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case SubGrupoActivoFijoConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO:
					sNombreCampoCategoria="id_detalle_grupo_activo_fijo";
					break;

				case SubGrupoActivoFijoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case SubGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case SubGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS:
					sNombreCampoCategoria="siglas";
					break;

				case SubGrupoActivoFijoConstantesFunciones.LABEL_ESVEHICULO:
					sNombreCampoCategoria="es_vehiculo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case SubGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case SubGrupoActivoFijoConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO:
					sNombreCampoCategoriaValor="id_detalle_grupo_activo_fijo";
					break;

				case SubGrupoActivoFijoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case SubGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case SubGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS:
					sNombreCampoCategoriaValor="siglas";
					break;

				case SubGrupoActivoFijoConstantesFunciones.LABEL_ESVEHICULO:
					sNombreCampoCategoriaValor="es_vehiculo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SubGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case SubGrupoActivoFijoConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Detalle Grupo Activo Fijo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_detalle_grupo_activo_fijo");
					break;

				case SubGrupoActivoFijoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case SubGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case SubGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Siglas",sNombreCampoCategoria,sNombreCampoCategoriaValor,"siglas");
					break;

				case SubGrupoActivoFijoConstantesFunciones.LABEL_ESVEHICULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Vehiculo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_vehiculo");
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
	
	public void jButtonGenerarExcelReporteDinamicoSubGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<SubGrupoActivoFijo> subgrupoactivofijosSeleccionados=new ArrayList<SubGrupoActivoFijo>();		
		
		subgrupoactivofijosSeleccionados=this.getSubGrupoActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"subgrupoactivofijo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("SubGrupoActivoFijos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case SubGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SubGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(SubGrupoActivoFijo subgrupoactivofijo:subgrupoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(subgrupoactivofijo.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SubGrupoActivoFijoConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SubGrupoActivoFijoConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO);
					iRow++;

					for(SubGrupoActivoFijo subgrupoactivofijo:subgrupoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(subgrupoactivofijo.getdetallegrupoactivofijo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SubGrupoActivoFijoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SubGrupoActivoFijoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(SubGrupoActivoFijo subgrupoactivofijo:subgrupoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(subgrupoactivofijo.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SubGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SubGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(SubGrupoActivoFijo subgrupoactivofijo:subgrupoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(subgrupoactivofijo.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SubGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SubGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS);
					iRow++;

					for(SubGrupoActivoFijo subgrupoactivofijo:subgrupoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(subgrupoactivofijo.getsiglas());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case SubGrupoActivoFijoConstantesFunciones.LABEL_ESVEHICULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SubGrupoActivoFijoConstantesFunciones.LABEL_ESVEHICULO);
					iRow++;

					for(SubGrupoActivoFijo subgrupoactivofijo:subgrupoactivofijosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(subgrupoactivofijo.getes_vehiculo());
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
			//	this.getFilaCabeceraExportarExcelSubGrupoActivoFijo(row);				
			//	iRow++;
			//}				
			
			//for(SubGrupoActivoFijo subgrupoactivofijoAux:subgrupoactivofijosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelSubGrupoActivoFijo(subgrupoactivofijoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sub Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
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
				this.subgrupoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSubGrupoActivoFijo(false);
			
			//SI ES MANUAL
			if(SubGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSubGrupoActivoFijo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresSubGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSubGrupoActivoFijo(false);
			
			//SI ES MANUAL
			if(SubGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSubGrupoActivoFijo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesSubGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSubGrupoActivoFijo(false);
			
			//SI ES MANUAL
			if(SubGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSubGrupoActivoFijo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaSubGrupoActivoFijo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosSubGrupoActivoFijo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosSubGrupoActivoFijo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosSubGrupoActivoFijo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosSubGrupoActivoFijo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosSubGrupoActivoFijo.setMinimumSize(dimensionMinimum);
		this.jTableDatosSubGrupoActivoFijo.setMaximumSize(dimensionMaximum);
		this.jTableDatosSubGrupoActivoFijo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingSubGrupoActivoFijo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingSubGrupoActivoFijo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingSubGrupoActivoFijo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaSubGrupoActivoFijo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesSubGrupoActivoFijo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasSubGrupoActivoFijo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSubGrupoActivoFijo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesSubGrupoActivoFijo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !SubGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!SubGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualSubGrupoActivoFijo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaSubGrupoActivoFijo();
		
		this.inicializarActualizarBindingBotonesManualSubGrupoActivoFijo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualSubGrupoActivoFijo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSubGrupoActivoFijo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualSubGrupoActivoFijo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualSubGrupoActivoFijo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosSubGrupoActivoFijo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosSubGrupoActivoFijo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteSubGrupoActivoFijo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormSubGrupoActivoFijo.jCheckBoxPostAccionNuevoSubGrupoActivoFijo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormSubGrupoActivoFijo.jCheckBoxPostAccionSinCerrarSubGrupoActivoFijo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormSubGrupoActivoFijo.jCheckBoxPostAccionSinMensajeSubGrupoActivoFijo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosSubGrupoActivoFijo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosSubGrupoActivoFijo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteSubGrupoActivoFijo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {
				this.jInternalFrameDetalleFormSubGrupoActivoFijo.jCheckBoxPostAccionNuevoSubGrupoActivoFijo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormSubGrupoActivoFijo.jCheckBoxPostAccionSinCerrarSubGrupoActivoFijo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormSubGrupoActivoFijo.jCheckBoxPostAccionSinMensajeSubGrupoActivoFijo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionSubGrupoActivoFijo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionSubGrupoActivoFijo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxTiposAccionesFormularioSubGrupoActivoFijo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesSubGrupoActivoFijo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoSubGrupoActivoFijo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesSubGrupoActivoFijo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesSubGrupoActivoFijo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarSubGrupoActivoFijo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesSubGrupoActivoFijo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoSubGrupoActivoFijo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesSubGrupoActivoFijo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralSubGrupoActivoFijo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesSubGrupoActivoFijo(Boolean esInicializar) throws Exception {
		try	{	
			if(SubGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualSubGrupoActivoFijo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesSubGrupoActivoFijo() throws Exception {
		try	{
			if(SubGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualSubGrupoActivoFijo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSubGrupoActivoFijo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxTiposAccionesFormularioSubGrupoActivoFijo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxTiposAccionesFormularioSubGrupoActivoFijo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualSubGrupoActivoFijo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesSubGrupoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesSubGrupoActivoFijo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesSubGrupoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesSubGrupoActivoFijo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesSubGrupoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesSubGrupoActivoFijo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionSubGrupoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionSubGrupoActivoFijo.addItem(reporte);
			}
			
			
			if(!this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionSubGrupoActivoFijo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionSubGrupoActivoFijo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesSubGrupoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesSubGrupoActivoFijo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesSubGrupoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesSubGrupoActivoFijo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxTiposAccionesFormularioSubGrupoActivoFijo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxTiposAccionesFormularioSubGrupoActivoFijo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarSubGrupoActivoFijo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarSubGrupoActivoFijo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarSubGrupoActivoFijo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSubGrupoActivoFijo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSubGrupoActivoFijo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSubGrupoActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSubGrupoActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoSubGrupoActivoFijo!=null) {
				
				if(this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualSubGrupoActivoFijo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasSubGrupoActivoFijo(Boolean esInicializar) throws Exception {				
		if(SubGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualSubGrupoActivoFijo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaSubGrupoActivoFijo() throws Exception {
		this.inicializarActualizarBindingTablaSubGrupoActivoFijo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderBySubGrupoActivoFijo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderBySubGrupoActivoFijo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderBySubGrupoActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySubGrupoActivoFijo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new SubGrupoActivoFijoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderBySubGrupoActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySubGrupoActivoFijo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new SubGrupoActivoFijoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosSubGrupoActivoFijoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubGrupoActivoFijoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new SubGrupoActivoFijoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderBySubGrupoActivoFijo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySubGrupoActivoFijo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new SubGrupoActivoFijoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderBySubGrupoActivoFijo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaSubGrupoActivoFijo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=subgrupoactivofijoLogic.getSubGrupoActivoFijos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=subgrupoactivofijos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(SubGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosSubGrupoActivoFijo.setModel(new SubGrupoActivoFijoModel(this.subgrupoactivofijoLogic.getSubGrupoActivoFijos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosSubGrupoActivoFijo.setModel(new SubGrupoActivoFijoModel(this.subgrupoactivofijos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderBySubGrupoActivoFijo!=null && this.jInternalFrameOrderBySubGrupoActivoFijo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBySubGrupoActivoFijo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosSubGrupoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubGrupoActivoFijo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new SubGrupoActivoFijoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO,subgrupoactivofijoConstantesFunciones.resaltarSeleccionarSubGrupoActivoFijo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+SubGrupoActivoFijoConstantesFunciones.SCLASSWEBTITULO,subgrupoactivofijoConstantesFunciones.resaltarSeleccionarSubGrupoActivoFijo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosSubGrupoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubGrupoActivoFijo,SubGrupoActivoFijoConstantesFunciones.LABEL_ID));

		if(this.subgrupoactivofijoConstantesFunciones.mostraridSubGrupoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SubGrupoActivoFijoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.subgrupoactivofijoConstantesFunciones.resaltaridSubGrupoActivoFijo,this.subgrupoactivofijoConstantesFunciones.activaridSubGrupoActivoFijo,this,true,"idSubGrupoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.subgrupoactivofijoConstantesFunciones.resaltaridSubGrupoActivoFijo,this.subgrupoactivofijoConstantesFunciones.activaridSubGrupoActivoFijo,this,true,"idSubGrupoActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSubGrupoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubGrupoActivoFijo,SubGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.subgrupoactivofijoConstantesFunciones.mostrarid_empresaSubGrupoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SubGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.subgrupoactivofijoConstantesFunciones.resaltarid_empresaSubGrupoActivoFijo,this,this.subgrupoactivofijoConstantesFunciones.activarid_empresaSubGrupoActivoFijo));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.subgrupoactivofijoConstantesFunciones.resaltarid_empresaSubGrupoActivoFijo,this,this.subgrupoactivofijoConstantesFunciones.activarid_empresaSubGrupoActivoFijo,false,"id_empresaSubGrupoActivoFijo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SubGrupoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSubGrupoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubGrupoActivoFijo,SubGrupoActivoFijoConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO));

		if(this.subgrupoactivofijoConstantesFunciones.mostrarid_detalle_grupo_activo_fijoSubGrupoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SubGrupoActivoFijoConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new DetalleGrupoActivoFijoTableCell(this.detallegrupoactivofijosForeignKey,this.subgrupoactivofijoConstantesFunciones.resaltarid_detalle_grupo_activo_fijoSubGrupoActivoFijo,this,this.subgrupoactivofijoConstantesFunciones.activarid_detalle_grupo_activo_fijoSubGrupoActivoFijo));
			tableColumn.setCellEditor(new DetalleGrupoActivoFijoTableCell(this.detallegrupoactivofijosForeignKey,this.subgrupoactivofijoConstantesFunciones.resaltarid_detalle_grupo_activo_fijoSubGrupoActivoFijo,this,this.subgrupoactivofijoConstantesFunciones.activarid_detalle_grupo_activo_fijoSubGrupoActivoFijo,true,"id_detalle_grupo_activo_fijoSubGrupoActivoFijo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SubGrupoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSubGrupoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubGrupoActivoFijo,SubGrupoActivoFijoConstantesFunciones.LABEL_CODIGO));

		if(this.subgrupoactivofijoConstantesFunciones.mostrarcodigoSubGrupoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SubGrupoActivoFijoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.subgrupoactivofijoConstantesFunciones.resaltarcodigoSubGrupoActivoFijo,this.subgrupoactivofijoConstantesFunciones.activarcodigoSubGrupoActivoFijo,this,true,"codigoSubGrupoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.subgrupoactivofijoConstantesFunciones.resaltarcodigoSubGrupoActivoFijo,this.subgrupoactivofijoConstantesFunciones.activarcodigoSubGrupoActivoFijo,this,true,"codigoSubGrupoActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SubGrupoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSubGrupoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubGrupoActivoFijo,SubGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE));

		if(this.subgrupoactivofijoConstantesFunciones.mostrarnombreSubGrupoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SubGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.subgrupoactivofijoConstantesFunciones.resaltarnombreSubGrupoActivoFijo,this.subgrupoactivofijoConstantesFunciones.activarnombreSubGrupoActivoFijo,this,true,"nombreSubGrupoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.subgrupoactivofijoConstantesFunciones.resaltarnombreSubGrupoActivoFijo,this.subgrupoactivofijoConstantesFunciones.activarnombreSubGrupoActivoFijo,this,true,"nombreSubGrupoActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SubGrupoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSubGrupoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubGrupoActivoFijo,SubGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS));

		if(this.subgrupoactivofijoConstantesFunciones.mostrarsiglasSubGrupoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SubGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.subgrupoactivofijoConstantesFunciones.resaltarsiglasSubGrupoActivoFijo,this.subgrupoactivofijoConstantesFunciones.activarsiglasSubGrupoActivoFijo,this,true,"siglasSubGrupoActivoFijo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.subgrupoactivofijoConstantesFunciones.resaltarsiglasSubGrupoActivoFijo,this.subgrupoactivofijoConstantesFunciones.activarsiglasSubGrupoActivoFijo,this,true,"siglasSubGrupoActivoFijo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SubGrupoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSubGrupoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSubGrupoActivoFijo,SubGrupoActivoFijoConstantesFunciones.LABEL_ESVEHICULO));

		if(this.subgrupoactivofijoConstantesFunciones.mostrares_vehiculoSubGrupoActivoFijo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SubGrupoActivoFijoConstantesFunciones.LABEL_ESVEHICULO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.subgrupoactivofijoConstantesFunciones.resaltares_vehiculoSubGrupoActivoFijo,this.subgrupoactivofijoConstantesFunciones.activares_vehiculoSubGrupoActivoFijo));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.subgrupoactivofijoConstantesFunciones.resaltares_vehiculoSubGrupoActivoFijo,this.subgrupoactivofijoConstantesFunciones.activares_vehiculoSubGrupoActivoFijo,this,true,"es_vehiculoSubGrupoActivoFijo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new SubGrupoActivoFijoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleActivoFijo && this.subgrupoactivofijoConstantesFunciones.mostrarDetalleActivoFijoSubGrupoActivoFijo && !SubGrupoActivoFijoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Activo Fijos");
				tableColumn.setHeaderValue("Detalle Activo Fijos");
				tableColumn.setCellRenderer(new DetalleActivoFijoTableCell(subgrupoactivofijoConstantesFunciones.resaltarDetalleActivoFijoSubGrupoActivoFijo,this,this.subgrupoactivofijoConstantesFunciones.activarDetalleActivoFijoSubGrupoActivoFijo));
				tableColumn.setCellEditor(new DetalleActivoFijoTableCell(subgrupoactivofijoConstantesFunciones.resaltarDetalleActivoFijoSubGrupoActivoFijo,this,this.subgrupoactivofijoConstantesFunciones.activarDetalleActivoFijoSubGrupoActivoFijo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosSubGrupoActivoFijo.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSubGrupoActivoFijo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSubGrupoActivoFijo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarSubGrupoActivoFijo && this.isPermisoGuardarCambiosSubGrupoActivoFijo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosSubGrupoActivoFijo.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.subgrupoactivofijoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosSubGrupoActivoFijo.addColumn(tableColumn);
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
			
			this.jTableDatosSubGrupoActivoFijo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSubGrupoActivoFijo && this.isPermisoGuardarCambiosSubGrupoActivoFijo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.subgrupoactivofijoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSubGrupoActivoFijo && this.isPermisoGuardarCambiosSubGrupoActivoFijo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosSubGrupoActivoFijo.moveColumn(this.jTableDatosSubGrupoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosSubGrupoActivoFijo.moveColumn(this.jTableDatosSubGrupoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.subgrupoactivofijoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosSubGrupoActivoFijo.moveColumn(this.jTableDatosSubGrupoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosSubGrupoActivoFijo.moveColumn(this.jTableDatosSubGrupoActivoFijo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosSubGrupoActivoFijo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosSubGrupoActivoFijo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosSubGrupoActivoFijo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!SubGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosSubGrupoActivoFijo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosSubGrupoActivoFijo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!SubGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!SubGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosSubGrupoActivoFijo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosSubGrupoActivoFijo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosSubGrupoActivoFijo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=subgrupoactivofijoLogic.getSubGrupoActivoFijos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=subgrupoactivofijos.size()-1;
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
		//this.jTableDatosSubGrupoActivoFijo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosSubGrupoActivoFijo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosSubGrupoActivoFijo();
			
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
				
				//this.isEsNuevoSubGrupoActivoFijo=false;
					
				SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
			
				if(this.subgrupoactivofijoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormSubGrupoActivoFijo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSubGrupoActivoFijo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSubGrupoActivoFijo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.subgrupoactivofijo.getsType().equals("DUPLICADO")
				   || this.subgrupoactivofijo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoSubGrupoActivoFijo=true;
				
				} else {
					this.isEsNuevoSubGrupoActivoFijo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
					if(this.subgrupoactivofijo.getId()>=0 && !this.subgrupoactivofijo.getIsNew()) {						
						this.isEsNuevoSubGrupoActivoFijo=false;
						
					} else {
						this.isEsNuevoSubGrupoActivoFijo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoSubGrupoActivoFijo(esRelaciones);						
				
				this.seleccionarSubGrupoActivoFijo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.subgrupoactivofijo.getId()<0) {
					this.isEsNuevoSubGrupoActivoFijo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarSubGrupoActivoFijo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarSubGrupoActivoFijo(evt,rowIndex);
				}	
				
				if(this.subgrupoactivofijoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion SubGrupoActivoFijo: " + this.dDif); 
					}
				}								
				
				SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarSubGrupoActivoFijo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.subgrupoactivofijo)) {
					if(this.subgrupoactivofijo.getId()>0) {
						this.subgrupoactivofijo.setIsDeleted(true);
						
						this.subgrupoactivofijosEliminados.add(this.subgrupoactivofijo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().remove(this.subgrupoactivofijo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.subgrupoactivofijos.remove(this.subgrupoactivofijo);				
					}
					
					
					((SubGrupoActivoFijoModel) this.jTableDatosSubGrupoActivoFijo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaSubGrupoActivoFijo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarSubGrupoActivoFijo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoSubGrupoActivoFijo) {
			
			if(this.jInternalFrameDetalleFormSubGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSubGrupoActivoFijo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSubGrupoActivoFijo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(SubGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioSubGrupoActivoFijo(this.subgrupoactivofijo);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.subgrupoactivofijoConstantesFunciones.cargarid_empresaSubGrupoActivoFijo || this.subgrupoactivofijoConstantesFunciones.event_dependid_empresaSubGrupoActivoFijo) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.subgrupoactivofijo.getid_empresa());
									//this.inicializarActualizarBindingSubGrupoActivoFijo(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(subgrupoactivofijo.getEmpresa()!=null) {
							this.empresasForeignKey.add(subgrupoactivofijo.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.subgrupoactivofijo.getid_empresa(),false,"Formulario");

					//DetalleGrupoActivoFijo
					if(!this.subgrupoactivofijoConstantesFunciones.cargarid_detalle_grupo_activo_fijoSubGrupoActivoFijo || this.subgrupoactivofijoConstantesFunciones.event_dependid_detalle_grupo_activo_fijoSubGrupoActivoFijo) {
						//this.cargarCombosDetalleGrupoActivoFijosForeignKeyLista(" where id="+this.subgrupoactivofijo.getid_detalle_grupo_activo_fijo());
									//this.inicializarActualizarBindingSubGrupoActivoFijo(false,false);
						this.detallegrupoactivofijosForeignKey=new ArrayList<DetalleGrupoActivoFijo>();

						if(subgrupoactivofijo.getDetalleGrupoActivoFijo()!=null) {
							this.detallegrupoactivofijosForeignKey.add(subgrupoactivofijo.getDetalleGrupoActivoFijo());
						}

						this.addItemDefectoCombosForeignKeyDetalleGrupoActivoFijo();
						this.cargarCombosFrameDetalleGrupoActivoFijosForeignKey("Todos");
					}
					this.setActualDetalleGrupoActivoFijoForeignKey(this.subgrupoactivofijo.getid_detalle_grupo_activo_fijo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesSubGrupoActivoFijo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesSubGrupoActivoFijo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSubGrupoActivoFijo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoSubGrupoActivoFijo(SubGrupoActivoFijo subgrupoactivofijo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoSubGrupoActivoFijo(subgrupoactivofijo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoSubGrupoActivoFijo(SubGrupoActivoFijo subgrupoactivofijo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioSubGrupoActivoFijo(subgrupoactivofijo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeySubGrupoActivoFijo(subgrupoactivofijo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeySubGrupoActivoFijo(subgrupoactivofijo);
	}
	
	public void setVariablesObjetoActualToFormularioSubGrupoActivoFijo(SubGrupoActivoFijo subgrupoactivofijo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormSubGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jLabelidSubGrupoActivoFijo.setText(subgrupoactivofijo.getId().toString());
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTextFieldcodigoSubGrupoActivoFijo.setText(subgrupoactivofijo.getcodigo());
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTextAreanombreSubGrupoActivoFijo.setText(subgrupoactivofijo.getnombre());
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTextFieldsiglasSubGrupoActivoFijo.setText(subgrupoactivofijo.getsiglas());
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jCheckBoxes_vehiculoSubGrupoActivoFijo.setSelected(subgrupoactivofijo.getes_vehiculo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,SubGrupoActivoFijo subgrupoactivofijoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,subgrupoactivofijoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,SubGrupoActivoFijo subgrupoactivofijoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				subgrupoactivofijoLocal=this.subgrupoactivofijo;
			} else {
				subgrupoactivofijoLocal=this.subgrupoactivofijoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(subgrupoactivofijoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoSubGrupoActivoFijo(subgrupoactivofijoLocal,true);
					
					if(subgrupoactivofijoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(subgrupoactivofijoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(subgrupoactivofijoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoSubGrupoActivoFijo(SubGrupoActivoFijo subgrupoactivofijo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSubGrupoActivoFijo(subgrupoactivofijo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoActivoFijo(subgrupoactivofijo);
	}
	
	public void setVariablesFormularioToObjetoActualSubGrupoActivoFijo(SubGrupoActivoFijo subgrupoactivofijo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSubGrupoActivoFijo(subgrupoactivofijo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualSubGrupoActivoFijo(SubGrupoActivoFijo subgrupoactivofijo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormSubGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormSubGrupoActivoFijo.jLabelidSubGrupoActivoFijo.getText()==null || this.jInternalFrameDetalleFormSubGrupoActivoFijo.jLabelidSubGrupoActivoFijo.getText()=="" || this.jInternalFrameDetalleFormSubGrupoActivoFijo.jLabelidSubGrupoActivoFijo.getText()=="Id") {
				this.jInternalFrameDetalleFormSubGrupoActivoFijo.jLabelidSubGrupoActivoFijo.setText("0");
			}

			if(conColumnasBase) {subgrupoactivofijo.setId(Long.parseLong(this.jInternalFrameDetalleFormSubGrupoActivoFijo.jLabelidSubGrupoActivoFijo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SubGrupoActivoFijoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubGrupoActivoFijo.jLabelIdSubGrupoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			subgrupoactivofijo.setcodigo(this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTextFieldcodigoSubGrupoActivoFijo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SubGrupoActivoFijoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubGrupoActivoFijo.jLabelcodigoSubGrupoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			subgrupoactivofijo.setnombre(this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTextAreanombreSubGrupoActivoFijo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SubGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubGrupoActivoFijo.jLabelnombreSubGrupoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			subgrupoactivofijo.setsiglas(this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTextFieldsiglasSubGrupoActivoFijo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SubGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubGrupoActivoFijo.jLabelsiglasSubGrupoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			subgrupoactivofijo.setes_vehiculo(this.jInternalFrameDetalleFormSubGrupoActivoFijo.jCheckBoxes_vehiculoSubGrupoActivoFijo.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SubGrupoActivoFijoConstantesFunciones.LABEL_ESVEHICULO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSubGrupoActivoFijo.jLabeles_vehiculoSubGrupoActivoFijo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSubGrupoActivoFijo(SubGrupoActivoFijo subgrupoactivofijoBean,SubGrupoActivoFijo subgrupoactivofijo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && subgrupoactivofijoBean.getid_detalle_grupo_activo_fijo()!=null && !subgrupoactivofijoBean.getid_detalle_grupo_activo_fijo().equals(-1L))) {subgrupoactivofijo.setid_detalle_grupo_activo_fijo(subgrupoactivofijoBean.getid_detalle_grupo_activo_fijo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosSubGrupoActivoFijo(SubGrupoActivoFijo subgrupoactivofijoOrigen,SubGrupoActivoFijo subgrupoactivofijo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && subgrupoactivofijoOrigen.getId()!=null && !subgrupoactivofijoOrigen.getId().equals(0L))) {subgrupoactivofijo.setId(subgrupoactivofijoOrigen.getId());}}
			if(conDefault || (!conDefault && subgrupoactivofijoOrigen.getid_detalle_grupo_activo_fijo()!=null && !subgrupoactivofijoOrigen.getid_detalle_grupo_activo_fijo().equals(-1L))) {subgrupoactivofijo.setid_detalle_grupo_activo_fijo(subgrupoactivofijoOrigen.getid_detalle_grupo_activo_fijo());}
			if(conDefault || (!conDefault && subgrupoactivofijoOrigen.getcodigo()!=null && !subgrupoactivofijoOrigen.getcodigo().equals(""))) {subgrupoactivofijo.setcodigo(subgrupoactivofijoOrigen.getcodigo());}
			if(conDefault || (!conDefault && subgrupoactivofijoOrigen.getnombre()!=null && !subgrupoactivofijoOrigen.getnombre().equals(""))) {subgrupoactivofijo.setnombre(subgrupoactivofijoOrigen.getnombre());}
			if(conDefault || (!conDefault && subgrupoactivofijoOrigen.getsiglas()!=null && !subgrupoactivofijoOrigen.getsiglas().equals(""))) {subgrupoactivofijo.setsiglas(subgrupoactivofijoOrigen.getsiglas());}
			if(conDefault || (!conDefault && subgrupoactivofijoOrigen.getes_vehiculo()!=null && !subgrupoactivofijoOrigen.getes_vehiculo().equals(false))) {subgrupoactivofijo.setes_vehiculo(subgrupoactivofijoOrigen.getes_vehiculo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSubGrupoActivoFijo(SubGrupoActivoFijo subgrupoactivofijo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jLabelidSubGrupoActivoFijo.setText(subgrupoactivofijo.getId().toString());
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTextFieldcodigoSubGrupoActivoFijo.setText(subgrupoactivofijo.getcodigo());
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTextAreanombreSubGrupoActivoFijo.setText(subgrupoactivofijo.getnombre());
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTextFieldsiglasSubGrupoActivoFijo.setText(subgrupoactivofijo.getsiglas());
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jCheckBoxes_vehiculoSubGrupoActivoFijo.setSelected(subgrupoactivofijo.getes_vehiculo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSubGrupoActivoFijo(SubGrupoActivoFijoBean subgrupoactivofijoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jLabelidSubGrupoActivoFijo.setText(subgrupoactivofijoBean.getId().toString());
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTextFieldcodigoSubGrupoActivoFijo.setText(subgrupoactivofijoBean.getcodigo());
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTextAreanombreSubGrupoActivoFijo.setText(subgrupoactivofijoBean.getnombre());
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTextFieldsiglasSubGrupoActivoFijo.setText(subgrupoactivofijoBean.getsiglas());
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jCheckBoxes_vehiculoSubGrupoActivoFijo.setSelected(subgrupoactivofijoBean.getes_vehiculo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanSubGrupoActivoFijo(SubGrupoActivoFijoParameterReturnGeneral subgrupoactivofijoReturnGeneral,SubGrupoActivoFijoBean subgrupoactivofijoBean,Boolean conDefault) throws Exception { 
		try {
			SubGrupoActivoFijo subgrupoactivofijoLocal=new SubGrupoActivoFijo();
			
			subgrupoactivofijoLocal=subgrupoactivofijoReturnGeneral.getSubGrupoActivoFijo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && subgrupoactivofijoLocal.getId()!=null && !subgrupoactivofijoLocal.getId().equals(0L))) {subgrupoactivofijoBean.setId(subgrupoactivofijoLocal.getId());}}
			if(conDefault || (!conDefault && subgrupoactivofijoLocal.getid_detalle_grupo_activo_fijo()!=null && !subgrupoactivofijoLocal.getid_detalle_grupo_activo_fijo().equals(-1L))) {subgrupoactivofijoBean.setid_detalle_grupo_activo_fijo(subgrupoactivofijoLocal.getid_detalle_grupo_activo_fijo());}
			if(conDefault || (!conDefault && subgrupoactivofijoLocal.getcodigo()!=null && !subgrupoactivofijoLocal.getcodigo().equals(""))) {subgrupoactivofijoBean.setcodigo(subgrupoactivofijoLocal.getcodigo());}
			if(conDefault || (!conDefault && subgrupoactivofijoLocal.getnombre()!=null && !subgrupoactivofijoLocal.getnombre().equals(""))) {subgrupoactivofijoBean.setnombre(subgrupoactivofijoLocal.getnombre());}
			if(conDefault || (!conDefault && subgrupoactivofijoLocal.getsiglas()!=null && !subgrupoactivofijoLocal.getsiglas().equals(""))) {subgrupoactivofijoBean.setsiglas(subgrupoactivofijoLocal.getsiglas());}
			if(conDefault || (!conDefault && subgrupoactivofijoLocal.getes_vehiculo()!=null && !subgrupoactivofijoLocal.getes_vehiculo().equals(false))) {subgrupoactivofijoBean.setes_vehiculo(subgrupoactivofijoLocal.getes_vehiculo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxSubGrupoActivoFijoGenerico(Long idSubGrupoActivoFijoSeleccionado,JComboBox jComboBoxSubGrupoActivoFijo,List<SubGrupoActivoFijo> subgrupoactivofijosLocal)throws Exception {
		try {
			SubGrupoActivoFijo  subgrupoactivofijoTemp=null;

			for(SubGrupoActivoFijo subgrupoactivofijoAux:subgrupoactivofijosLocal) {
				if(subgrupoactivofijoAux.getId()!=null && subgrupoactivofijoAux.getId().equals(idSubGrupoActivoFijoSeleccionado)) {
					subgrupoactivofijoTemp=subgrupoactivofijoAux;
					break;
				}
			}

			jComboBoxSubGrupoActivoFijo.setSelectedItem(subgrupoactivofijoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxSubGrupoActivoFijoGenerico(JComboBox jComboBoxSubGrupoActivoFijo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxSubGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSubGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxSubGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSubGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSubGrupoActivoFijo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxSubGrupoActivoFijo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSubGrupoActivoFijo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxSubGrupoActivoFijo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxSubGrupoActivoFijo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxSubGrupoActivoFijo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			subgrupoactivofijo=(SubGrupoActivoFijo) subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			subgrupoactivofijo =(SubGrupoActivoFijo) subgrupoactivofijos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!subgrupoactivofijo.getIsNew() && !subgrupoactivofijo.getIsChanged() && !subgrupoactivofijo.getIsDeleted()) {
				sDescripcion=subgrupoactivofijo.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=subgrupoactivofijo.getempresa_descripcion();
			}
		}

		if(sTipo.equals("DetalleGrupoActivoFijo")) {
			//sDescripcion=this.getActualDetalleGrupoActivoFijoForeignKeyDescripcion((Long)value);
			if(!subgrupoactivofijo.getIsNew() && !subgrupoactivofijo.getIsChanged() && !subgrupoactivofijo.getIsDeleted()) {
				sDescripcion=subgrupoactivofijo.getdetallegrupoactivofijo_descripcion();
			} else {
				//sDescripcion=this.getActualDetalleGrupoActivoFijoForeignKeyDescripcion((Long)value);
				sDescripcion=subgrupoactivofijo.getdetallegrupoactivofijo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		SubGrupoActivoFijo subgrupoactivofijoRow=new SubGrupoActivoFijo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			subgrupoactivofijoRow=(SubGrupoActivoFijo) subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			subgrupoactivofijoRow=(SubGrupoActivoFijo) subgrupoactivofijos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleActivoFijoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,SubGrupoActivoFijo subgrupoactivofijo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormSubGrupoActivoFijo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subgrupoactivofijo = (SubGrupoActivoFijo)this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.subgrupoactivofijo = (SubGrupoActivoFijo)this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(subgrupoactivofijo!=null) {
						this.subgrupoactivofijo = subgrupoactivofijo;
					} else {
						this.subgrupoactivofijo = new SubGrupoActivoFijo();
					}
				}

				if(this.isTienePermisosDetalleActivoFijo && this.permiteMantenimiento(this.subgrupoactivofijo)) {
					DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFramePopup=new DetalleActivoFijoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalleactivofijoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFramePopup;
					} else {
						detalleactivofijoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame;
					}

					List<SubGrupoActivoFijo> subgrupoactivofijos=new ArrayList<SubGrupoActivoFijo>();
					subgrupoactivofijos.add(this.subgrupoactivofijo);
					if(!esRelacionado) {
						//detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setConGuardarRelaciones(false);
						//detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalleactivofijoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormSubGrupoActivoFijo.cargarDetalleActivoFijoBeanSwingJInternalFrame(subgrupoactivofijos,this.subgrupoactivofijo,detalleactivofijoBeanSwingJInternalFrame,/*conInicializar,*/detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.getConGuardarRelaciones(),detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoSessionBean.getEsGuardarRelacionado());
					detalleactivofijoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalleactivofijoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleActivoFijo("no_relacionado");

						detalleactivofijoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleActivoFijoConstantesFunciones.ITAMANIOFILATABLA + (DetalleActivoFijoConstantesFunciones.ITAMANIOFILATABLA/2));

						detalleactivofijoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderSubGrupoActivoFijo=(TitledBorder)this.jScrollPanelDatosSubGrupoActivoFijo.getBorder();
						TitledBorder titledBorderDetalleActivoFijo=(TitledBorder)detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.getBorder();

						titledBorderDetalleActivoFijo.setTitle(titledBorderSubGrupoActivoFijo.getTitle() + " -> Detalle Activo Fijo");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalleactivofijoBeanSwingJInternalFrame);
						}

						detalleactivofijoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalleactivofijoBeanSwingJInternalFrame);

						detalleactivofijoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.subgrupoactivofijoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Activo Fijo",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualSubGrupoActivoFijo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoSubGrupoActivoFijo && this.isPermisoNuevoSubGrupoActivoFijo));			
			this.jButtonDuplicarSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarSubGrupoActivoFijo && this.isPermisoDuplicarSubGrupoActivoFijo));			
			this.jButtonCopiarSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaCopiarSubGrupoActivoFijo && this.isPermisoCopiarSubGrupoActivoFijo));
			this.jButtonVerFormSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaVerFormSubGrupoActivoFijo && this.isPermisoVerFormSubGrupoActivoFijo));
			
			this.jButtonAbrirOrderBySubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenSubGrupoActivoFijo && this.isPermisoOrdenSubGrupoActivoFijo));			
			
			this.jButtonNuevoRelacionesSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesSubGrupoActivoFijo && this.isPermisoNuevoSubGrupoActivoFijo));			
			this.jButtonNuevoGuardarCambiosSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoSubGrupoActivoFijo && this.isPermisoNuevoSubGrupoActivoFijo && this.isPermisoGuardarCambiosSubGrupoActivoFijo));
			
			if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonModificarSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaModificarSubGrupoActivoFijo && this.isPermisoActualizarSubGrupoActivoFijo));	
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonActualizarSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaActualizarSubGrupoActivoFijo && this.isPermisoActualizarSubGrupoActivoFijo));	
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonEliminarSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaEliminarSubGrupoActivoFijo && this.isPermisoEliminarSubGrupoActivoFijo));
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonCancelarSubGrupoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarSubGrupoActivoFijo);							
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonGuardarCambiosSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarSubGrupoActivoFijo && this.isPermisoGuardarCambiosSubGrupoActivoFijo));			
			
			}
						
			this.jButtonGuardarCambiosTablaSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosSubGrupoActivoFijo && this.isPermisoGuardarCambiosSubGrupoActivoFijo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoSubGrupoActivoFijo && this.isPermisoNuevoSubGrupoActivoFijo));						
			this.jButtonDuplicarToolBarSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarSubGrupoActivoFijo && this.isPermisoDuplicarSubGrupoActivoFijo));						
			this.jButtonCopiarToolBarSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaCopiarSubGrupoActivoFijo && this.isPermisoCopiarSubGrupoActivoFijo));			
			this.jButtonVerFormToolBarSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaVerFormSubGrupoActivoFijo && this.isPermisoVerFormSubGrupoActivoFijo));			
			this.jButtonAbrirOrderByToolBarSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenSubGrupoActivoFijo && this.isPermisoOrdenSubGrupoActivoFijo));
			this.jButtonNuevoRelacionesToolBarSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesSubGrupoActivoFijo && this.isPermisoNuevoSubGrupoActivoFijo));			
			this.jButtonNuevoGuardarCambiosToolBarSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoSubGrupoActivoFijo && this.isPermisoNuevoSubGrupoActivoFijo && this.isPermisoGuardarCambiosSubGrupoActivoFijo));			
			
			if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonModificarToolBarSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaModificarSubGrupoActivoFijo && this.isPermisoActualizarSubGrupoActivoFijo));	
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonActualizarToolBarSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaActualizarSubGrupoActivoFijo  && this.isPermisoActualizarSubGrupoActivoFijo));	
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonEliminarToolBarSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaEliminarSubGrupoActivoFijo && this.isPermisoEliminarSubGrupoActivoFijo));
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonCancelarToolBarSubGrupoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarSubGrupoActivoFijo);				
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonGuardarCambiosToolBarSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarSubGrupoActivoFijo && this.isPermisoGuardarCambiosSubGrupoActivoFijo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosSubGrupoActivoFijo && this.isPermisoGuardarCambiosSubGrupoActivoFijo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoSubGrupoActivoFijo && this.isPermisoNuevoSubGrupoActivoFijo));			
			this.jMenuItemDuplicarSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaDuplicarSubGrupoActivoFijo && this.isPermisoDuplicarSubGrupoActivoFijo));			
			this.jMenuItemCopiarSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaCopiarSubGrupoActivoFijo && this.isPermisoCopiarSubGrupoActivoFijo));			
			this.jMenuItemVerFormSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaVerFormSubGrupoActivoFijo && this.isPermisoVerFormSubGrupoActivoFijo));			
			this.jMenuItemAbrirOrderBySubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenSubGrupoActivoFijo && this.isPermisoOrdenSubGrupoActivoFijo));			
			//this.jMenuItemMostrarOcultarSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenSubGrupoActivoFijo && this.isPermisoOrdenSubGrupoActivoFijo));
			this.jMenuItemDetalleAbrirOrderBySubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenSubGrupoActivoFijo && this.isPermisoOrdenSubGrupoActivoFijo));			
			//this.jMenuItemDetalleMostrarOcultarSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaOrdenSubGrupoActivoFijo && this.isPermisoOrdenSubGrupoActivoFijo));			
			this.jMenuItemNuevoRelacionesSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoRelacionesSubGrupoActivoFijo && this.isPermisoNuevoSubGrupoActivoFijo));			
			this.jMenuItemNuevoGuardarCambiosSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaNuevoSubGrupoActivoFijo && this.isPermisoNuevoSubGrupoActivoFijo && this.isPermisoGuardarCambiosSubGrupoActivoFijo));									
			
			if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jMenuItemModificarSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaModificarSubGrupoActivoFijo && this.isPermisoActualizarSubGrupoActivoFijo));	
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jMenuItemActualizarSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaActualizarSubGrupoActivoFijo && this.isPermisoActualizarSubGrupoActivoFijo));	
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jMenuItemEliminarSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaEliminarSubGrupoActivoFijo && this.isPermisoEliminarSubGrupoActivoFijo));
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jMenuItemCancelarSubGrupoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarSubGrupoActivoFijo);				
			}
			
			this.jMenuItemGuardarCambiosSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarSubGrupoActivoFijo && this.isPermisoGuardarCambiosSubGrupoActivoFijo));						
			this.jMenuItemGuardarCambiosTablaSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarCambiosSubGrupoActivoFijo && this.isPermisoGuardarCambiosSubGrupoActivoFijo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoSubGrupoActivoFijo=this.jButtonNuevoSubGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaDuplicarSubGrupoActivoFijo=this.jButtonDuplicarSubGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaCopiarSubGrupoActivoFijo=this.jButtonCopiarSubGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaVerFormSubGrupoActivoFijo=this.jButtonVerFormSubGrupoActivoFijo.isVisible();
			
			this.isVisibilidadCeldaOrdenSubGrupoActivoFijo=this.jButtonAbrirOrderBySubGrupoActivoFijo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesSubGrupoActivoFijo=this.jButtonNuevoRelacionesSubGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaModificarSubGrupoActivoFijo=this.jButtonModificarSubGrupoActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {
			this.isVisibilidadCeldaActualizarSubGrupoActivoFijo=this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonActualizarSubGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarSubGrupoActivoFijo=this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonEliminarSubGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarSubGrupoActivoFijo=this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonCancelarSubGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarSubGrupoActivoFijo=this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonGuardarCambiosSubGrupoActivoFijo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosSubGrupoActivoFijo=this.jButtonGuardarCambiosTablaSubGrupoActivoFijo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoSubGrupoActivoFijo=this.jButtonNuevoToolBarSubGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSubGrupoActivoFijo=this.jButtonNuevoRelacionesToolBarSubGrupoActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {
			this.isVisibilidadCeldaModificarSubGrupoActivoFijo=this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonModificarToolBarSubGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaActualizarSubGrupoActivoFijo=this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonActualizarToolBarSubGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarSubGrupoActivoFijo=this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonEliminarToolBarSubGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarSubGrupoActivoFijo=this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonCancelarToolBarSubGrupoActivoFijo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSubGrupoActivoFijo=this.jButtonGuardarCambiosToolBarSubGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSubGrupoActivoFijo=this.jButtonGuardarCambiosTablaToolBarSubGrupoActivoFijo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoSubGrupoActivoFijo=this.jMenuItemNuevoSubGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSubGrupoActivoFijo=this.jMenuItemNuevoRelacionesSubGrupoActivoFijo.isVisible();
			
			if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {
			this.isVisibilidadCeldaModificarSubGrupoActivoFijo=this.jInternalFrameDetalleFormSubGrupoActivoFijo.jMenuItemModificarSubGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaActualizarSubGrupoActivoFijo=this.jInternalFrameDetalleFormSubGrupoActivoFijo.jMenuItemActualizarSubGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaEliminarSubGrupoActivoFijo=this.jInternalFrameDetalleFormSubGrupoActivoFijo.jMenuItemEliminarSubGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaCancelarSubGrupoActivoFijo=this.jInternalFrameDetalleFormSubGrupoActivoFijo.jMenuItemCancelarSubGrupoActivoFijo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSubGrupoActivoFijo=this.jMenuItemGuardarCambiosSubGrupoActivoFijo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSubGrupoActivoFijo=this.jMenuItemGuardarCambiosTablaSubGrupoActivoFijo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesSubGrupoActivoFijo(Boolean esInicializar) {
		if(SubGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.subgrupoactivofijoSessionBean.getConGuardarRelaciones()) {
				//if(this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesSubGrupoActivoFijo();
			}
			
			this.inicializarActualizarBindingBotonesManualSubGrupoActivoFijo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualSubGrupoActivoFijo() {
		this.jButtonNuevoSubGrupoActivoFijo.setVisible(this.isPermisoNuevoSubGrupoActivoFijo);			
		this.jButtonDuplicarSubGrupoActivoFijo.setVisible(this.isPermisoDuplicarSubGrupoActivoFijo);			
		this.jButtonCopiarSubGrupoActivoFijo.setVisible(this.isPermisoCopiarSubGrupoActivoFijo);			
		this.jButtonVerFormSubGrupoActivoFijo.setVisible(this.isPermisoVerFormSubGrupoActivoFijo);			
		
		this.jButtonAbrirOrderBySubGrupoActivoFijo.setVisible(this.isPermisoOrdenSubGrupoActivoFijo);					
		
		this.jButtonNuevoRelacionesSubGrupoActivoFijo.setVisible(this.isPermisoNuevoSubGrupoActivoFijo);			
		
		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonModificarSubGrupoActivoFijo.setVisible(this.isPermisoActualizarSubGrupoActivoFijo);	
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonActualizarSubGrupoActivoFijo.setVisible(this.isPermisoActualizarSubGrupoActivoFijo);	
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonEliminarSubGrupoActivoFijo.setVisible(this.isPermisoEliminarSubGrupoActivoFijo);
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonCancelarSubGrupoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarSubGrupoActivoFijo);						
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonGuardarCambiosSubGrupoActivoFijo.setVisible(this.isPermisoGuardarCambiosSubGrupoActivoFijo);							
		}
		
		this.jButtonGuardarCambiosTablaSubGrupoActivoFijo.setVisible(this.isPermisoActualizarSubGrupoActivoFijo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleSubGrupoActivoFijo() {
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonModificarSubGrupoActivoFijo.setVisible(this.isPermisoActualizarSubGrupoActivoFijo);	
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonActualizarSubGrupoActivoFijo.setVisible(this.isPermisoActualizarSubGrupoActivoFijo);	
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonEliminarSubGrupoActivoFijo.setVisible(this.isPermisoEliminarSubGrupoActivoFijo);
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonCancelarSubGrupoActivoFijo.setVisible(this.isVisibilidadCeldaCancelarSubGrupoActivoFijo);							
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonGuardarCambiosSubGrupoActivoFijo.setVisible((this.isVisibilidadCeldaGuardarSubGrupoActivoFijo && this.isPermisoGuardarCambiosSubGrupoActivoFijo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosSubGrupoActivoFijo() {
		if(SubGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualSubGrupoActivoFijo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesSubGrupoActivoFijo() {
	}
	
	public void jTableDatosSubGrupoActivoFijoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarSubGrupoActivoFijo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidSubGrupoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubGrupoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSubGrupoActivoFijo(this.getsubgrupoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoActivoFijo(this.subgrupoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.subgrupoactivofijo==null) {
						this.subgrupoactivofijo = new SubGrupoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualSubGrupoActivoFijo(this.subgrupoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoActivoFijo(this.subgrupoactivofijo);
				}

				if(this.subgrupoactivofijo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.subgrupoactivofijo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSubGrupoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaSubGrupoActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebSubGrupoActivoFijo(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubGrupoActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSubGrupoActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSubGrupoActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSubGrupoActivoFijo(this.getsubgrupoactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoActivoFijo(this.subgrupoactivofijo);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.subgrupoactivofijoLogic.getConnexion());

				if(this.subgrupoactivofijo.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.subgrupoactivofijo.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSubGrupoActivoFijo=(TitledBorder)this.jScrollPanelDatosSubGrupoActivoFijo.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderSubGrupoActivoFijo.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaSubGrupoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubGrupoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSubGrupoActivoFijo(this.getsubgrupoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoActivoFijo(this.subgrupoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.subgrupoactivofijo==null) {
						this.subgrupoactivofijo = new SubGrupoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualSubGrupoActivoFijo(this.subgrupoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoActivoFijo(this.subgrupoactivofijo);
				}

				if(this.subgrupoactivofijo.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.subgrupoactivofijo.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSubGrupoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisodetallegrupoactivofijo=true;

			idTienePermisodetallegrupoactivofijo=this.tienePermisosUsuarioEnPaginaWebSubGrupoActivoFijo(DetalleGrupoActivoFijoConstantesFunciones.CLASSNAME);

			if(idTienePermisodetallegrupoactivofijo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubGrupoActivoFijo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosSubGrupoActivoFijo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosSubGrupoActivoFijo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualSubGrupoActivoFijo(this.getsubgrupoactivofijo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoActivoFijo(this.subgrupoactivofijo);

				this.detallegrupoactivofijoBeanSwingJInternalFrame=new DetalleGrupoActivoFijoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.detallegrupoactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.detallegrupoactivofijoBeanSwingJInternalFrame.getDetalleGrupoActivoFijoLogic().setConnexion(this.subgrupoactivofijoLogic.getConnexion());

				if(this.subgrupoactivofijo.getid_detalle_grupo_activo_fijo()!=null) {
					this.detallegrupoactivofijoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.detallegrupoactivofijoBeanSwingJInternalFrame.setIdActual(this.subgrupoactivofijo.getid_detalle_grupo_activo_fijo());
					this.detallegrupoactivofijoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.detallegrupoactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.detallegrupoactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleGrupoActivoFijo();
				}

				JInternalFrameBase jinternalFrame =this.detallegrupoactivofijoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderSubGrupoActivoFijo=(TitledBorder)this.jScrollPanelDatosSubGrupoActivoFijo.getBorder();
				TitledBorder titledBorderdetallegrupoactivofijo=(TitledBorder)this.detallegrupoactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleGrupoActivoFijo.getBorder();

				titledBorderdetallegrupoactivofijo.setTitle(titledBorderSubGrupoActivoFijo.getTitle() + " -> Detalle Grupo Activo Fijo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubGrupoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSubGrupoActivoFijo(this.getsubgrupoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoActivoFijo(this.subgrupoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.subgrupoactivofijo==null) {
						this.subgrupoactivofijo = new SubGrupoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualSubGrupoActivoFijo(this.subgrupoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoActivoFijo(this.subgrupoactivofijo);
				}

				if(this.subgrupoactivofijo.getid_detalle_grupo_activo_fijo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_detalle_grupo_activo_fijo = "+this.subgrupoactivofijo.getid_detalle_grupo_activo_fijo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSubGrupoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoSubGrupoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubGrupoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSubGrupoActivoFijo(this.getsubgrupoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoActivoFijo(this.subgrupoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.subgrupoactivofijo==null) {
						this.subgrupoactivofijo = new SubGrupoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualSubGrupoActivoFijo(this.subgrupoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoActivoFijo(this.subgrupoactivofijo);
				}

				if(this.subgrupoactivofijo.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.subgrupoactivofijo.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSubGrupoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreSubGrupoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubGrupoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSubGrupoActivoFijo(this.getsubgrupoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoActivoFijo(this.subgrupoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.subgrupoactivofijo==null) {
						this.subgrupoactivofijo = new SubGrupoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualSubGrupoActivoFijo(this.subgrupoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoActivoFijo(this.subgrupoactivofijo);
				}

				if(this.subgrupoactivofijo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.subgrupoactivofijo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSubGrupoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsiglasSubGrupoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubGrupoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSubGrupoActivoFijo(this.getsubgrupoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoActivoFijo(this.subgrupoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.subgrupoactivofijo==null) {
						this.subgrupoactivofijo = new SubGrupoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualSubGrupoActivoFijo(this.subgrupoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoActivoFijo(this.subgrupoactivofijo);
				}

				if(this.subgrupoactivofijo.getsiglas()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where siglas like '%"+this.subgrupoactivofijo.getsiglas()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSubGrupoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_vehiculoSubGrupoActivoFijoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSubGrupoActivoFijo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSubGrupoActivoFijo(this.getsubgrupoactivofijo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoActivoFijo(this.subgrupoactivofijo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.subgrupoactivofijo==null) {
						this.subgrupoactivofijo = new SubGrupoActivoFijo();
					}

					this.setVariablesFormularioToObjetoActualSubGrupoActivoFijo(this.subgrupoactivofijo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoActivoFijo(this.subgrupoactivofijo);
				}

				if(this.subgrupoactivofijo.getes_vehiculo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_vehiculo = "+this.subgrupoactivofijo.getes_vehiculo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSubGrupoActivoFijo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdDetalleGrupoActivoFijoSubGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSubGrupoActivoFijo(false,false);

			this.getSubGrupoActivoFijosFK_IdDetalleGrupoActivoFijo();

			this.inicializarActualizarBindingSubGrupoActivoFijo(false);

			//if(SubGrupoActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSubGrupoActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaSubGrupoActivoFijoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingSubGrupoActivoFijo(false,false);

			this.getSubGrupoActivoFijosFK_IdEmpresa();

			this.inicializarActualizarBindingSubGrupoActivoFijo(false);

			//if(SubGrupoActivoFijoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingSubGrupoActivoFijo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.subgrupoactivofijoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameSubGrupoActivoFijo() {
		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {
		

		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.setVisible(false);	    			
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.dispose();
			this.jInternalFrameDetalleFormSubGrupoActivoFijo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoSubGrupoActivoFijo!=null) {
			this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.dispose();
			this.jInternalFrameReporteDinamicoSubGrupoActivoFijo=null;
		}
		
		if(this.jInternalFrameImportacionSubGrupoActivoFijo!=null) {
			this.jInternalFrameImportacionSubGrupoActivoFijo.setVisible(false);	    			
			this.jInternalFrameImportacionSubGrupoActivoFijo.dispose();
			this.jInternalFrameImportacionSubGrupoActivoFijo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessSubGrupoActivoFijo();
			
			SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
			
			
			if(sTipo.equals("NuevoSubGrupoActivoFijo")) {
				jButtonNuevoSubGrupoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarSubGrupoActivoFijo")) {
				jButtonDuplicarSubGrupoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarSubGrupoActivoFijo")) {
				jButtonCopiarSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("VerFormSubGrupoActivoFijo")) {
				jButtonVerFormSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarSubGrupoActivoFijo")) {
				jButtonNuevoSubGrupoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarSubGrupoActivoFijo")) {
				jButtonDuplicarSubGrupoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoSubGrupoActivoFijo")) {
				jButtonNuevoSubGrupoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarSubGrupoActivoFijo")) {
				jButtonDuplicarSubGrupoActivoFijoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesSubGrupoActivoFijo")) {
				jButtonNuevoSubGrupoActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarSubGrupoActivoFijo")) {
				jButtonNuevoSubGrupoActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesSubGrupoActivoFijo")) {
				jButtonNuevoSubGrupoActivoFijoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarSubGrupoActivoFijo")) {
				jButtonModificarSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarSubGrupoActivoFijo")) {
				jButtonModificarSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarSubGrupoActivoFijo")) {
				jButtonModificarSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarSubGrupoActivoFijo")) {
				jButtonActualizarSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarSubGrupoActivoFijo")) {
				jButtonActualizarSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarSubGrupoActivoFijo")) {
				jButtonActualizarSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("EliminarSubGrupoActivoFijo")) {
				jButtonEliminarSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarSubGrupoActivoFijo")) {
				jButtonEliminarSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarSubGrupoActivoFijo")) {
				jButtonEliminarSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CancelarSubGrupoActivoFijo")) {
				jButtonCancelarSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarSubGrupoActivoFijo")) {
				jButtonCancelarSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarSubGrupoActivoFijo")) {
				jButtonCancelarSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CerrarSubGrupoActivoFijo")) {
				jButtonCerrarSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarSubGrupoActivoFijo")) {
				jButtonCerrarSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarSubGrupoActivoFijo")) {
				jButtonCerrarSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarSubGrupoActivoFijo")) {
				jButtonMostrarOcultarSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarSubGrupoActivoFijo")) {
				jButtonCancelarSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosSubGrupoActivoFijo")) {
				jButtonGuardarCambiosSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarSubGrupoActivoFijo")) {
				jButtonGuardarCambiosSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarSubGrupoActivoFijo")) {
				jButtonCopiarSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarSubGrupoActivoFijo")) {
				jButtonVerFormSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosSubGrupoActivoFijo")) {
				jButtonGuardarCambiosSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarSubGrupoActivoFijo")) {
				jButtonCopiarSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormSubGrupoActivoFijo")) {
				jButtonVerFormSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaSubGrupoActivoFijo")) {
				jButtonGuardarCambiosSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarSubGrupoActivoFijo")) {
				jButtonGuardarCambiosSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaSubGrupoActivoFijo")) {
				jButtonGuardarCambiosSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionSubGrupoActivoFijo")) {
				jButtonRecargarInformacionSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarSubGrupoActivoFijo")) {
				jButtonRecargarInformacionSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionSubGrupoActivoFijo")) {
				jButtonRecargarInformacionSubGrupoActivoFijoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresSubGrupoActivoFijo")) {
				jButtonAnterioresSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarSubGrupoActivoFijo")) {
				jButtonAnterioresSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreSubGrupoActivoFijo")) {
				jButtonAnterioresSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesSubGrupoActivoFijo")) {
				jButtonSiguientesSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarSubGrupoActivoFijo")) {
				jButtonSiguientesSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesSubGrupoActivoFijo")) {
				jButtonSiguientesSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderBySubGrupoActivoFijo") || sTipo.equals("MenuItemDetalleAbrirOrderBySubGrupoActivoFijo")) {
				jButtonAbrirOrderBySubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarSubGrupoActivoFijo") || sTipo.equals("MenuItemDetalleMostrarOcultarSubGrupoActivoFijo")) {
				jButtonMostrarOcultarSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosSubGrupoActivoFijo")) {
				jButtonNuevoGuardarCambiosSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarSubGrupoActivoFijo")) {
				jButtonNuevoGuardarCambiosSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosSubGrupoActivoFijo")) {
				jButtonNuevoGuardarCambiosSubGrupoActivoFijoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoSubGrupoActivoFijo")) {
				jButtonCerrarReporteDinamicoSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoSubGrupoActivoFijo")) {
				jButtonGenerarReporteDinamicoSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoSubGrupoActivoFijo")) {
				
				jButtonGenerarExcelReporteDinamicoSubGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionSubGrupoActivoFijo")) {
				jButtonCerrarImportacionSubGrupoActivoFijoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionSubGrupoActivoFijo")) {
				
				jButtonGenerarImportacionSubGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionSubGrupoActivoFijo")) {
				
				jButtonAbrirImportacionSubGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesSubGrupoActivoFijo")) {
				jComboBoxTiposAccionesSubGrupoActivoFijoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesSubGrupoActivoFijo")) {
				jComboBoxTiposRelacionesSubGrupoActivoFijoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioSubGrupoActivoFijo")) {
				jComboBoxTiposAccionesSubGrupoActivoFijoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarSubGrupoActivoFijo")) {
				
				jComboBoxTiposSeleccionarSubGrupoActivoFijoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralSubGrupoActivoFijo")) {
				jTextFieldValorCampoGeneralSubGrupoActivoFijoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderBySubGrupoActivoFijo")) {
				jButtonAbrirOrderBySubGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarSubGrupoActivoFijo")) {
				jButtonAbrirOrderBySubGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderBySubGrupoActivoFijo")) {
				jButtonCerrarOrderBySubGrupoActivoFijoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSubGrupoActivoFijoBusqueda")) {
				this.jButtonidSubGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSubGrupoActivoFijoUpdate")) {
				this.jButtonid_empresaSubGrupoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSubGrupoActivoFijoBusqueda")) {
				this.jButtonid_empresaSubGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_detalle_grupo_activo_fijoSubGrupoActivoFijoUpdate")) {
				this.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_detalle_grupo_activo_fijoSubGrupoActivoFijoBusqueda")) {
				this.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoSubGrupoActivoFijoBusqueda")) {
				this.jButtoncodigoSubGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreSubGrupoActivoFijoBusqueda")) {
				this.jButtonnombreSubGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("siglasSubGrupoActivoFijoBusqueda")) {
				this.jButtonsiglasSubGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_vehiculoSubGrupoActivoFijoBusqueda")) {
				this.jButtones_vehiculoSubGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessSubGrupoActivoFijo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSubGrupoActivoFijoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subgrupoactivofijo);
				
				SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
				
				


				
				SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubGrupoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubGrupoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			SubGrupoActivoFijo subgrupoactivofijoLocal=null;
			
			if(!this.getEsControlTabla()) {
				subgrupoactivofijoLocal=this.subgrupoactivofijo;
			} else {
				subgrupoactivofijoLocal=this.subgrupoactivofijoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subgrupoactivofijo);
				
				SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
							
				
				


				
				SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubGrupoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubGrupoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubGrupoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSubGrupoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoAnterior =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subgrupoactivofijoAnterior =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
			
			SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
			
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
			
			


			
			SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSubGrupoActivoFijoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subgrupoactivofijo);
				
				SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
								
						
				


				
				SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubGrupoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubGrupoActivoFijo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subgrupoactivofijo);
				
				SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
								
				
				


				
				SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubGrupoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubGrupoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubGrupoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSubGrupoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoAnterior =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subgrupoactivofijoAnterior =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subgrupoactivofijo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubGrupoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSubGrupoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoAnterior =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subgrupoactivofijoAnterior =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubGrupoActivoFijoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.subgrupoactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subgrupoactivofijo);
				
				SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
							
				
				


				
				SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubGrupoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubGrupoActivoFijo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSubGrupoActivoFijoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSubGrupoActivoFijo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subgrupoactivofijoAnterior =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.subgrupoactivofijoAnterior =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
			
			SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
			
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
			
			


			
			SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubGrupoActivoFijoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.subgrupoactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subgrupoactivofijo);
				
				SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
								
				
				


				
				SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubGrupoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubGrupoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubGrupoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSubGrupoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoAnterior =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subgrupoactivofijoAnterior =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubGrupoActivoFijoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoactivofijo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.subgrupoactivofijo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSubGrupoActivoFijoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subgrupoactivofijo);
				
				SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosSubGrupoActivoFijo")) {
					jCheckBoxSeleccionarTodosSubGrupoActivoFijoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosSubGrupoActivoFijo")) {
					jCheckBoxSeleccionadosSubGrupoActivoFijoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarSubGrupoActivoFijo")) {
					
				}
				
				


				
				
				SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubGrupoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubGrupoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoactivofijo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.subgrupoactivofijo);
				
				SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
												
				
				


				
				
				SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubGrupoActivoFijo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubGrupoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSubGrupoActivoFijoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSubGrupoActivoFijo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.subgrupoactivofijoAnterior =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.subgrupoactivofijoAnterior =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSubGrupoActivoFijoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subgrupoactivofijo);
				
				SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
				
				
				SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
			
			SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
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
			
			


			
			SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSubGrupoActivoFijoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subgrupoactivofijo);
				
				SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubGrupoActivoFijo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubGrupoActivoFijo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.subgrupoactivofijo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.subgrupoactivofijo);
				
				SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
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
				
				


				
				SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SubGrupoActivoFijo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SubGrupoActivoFijo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSubGrupoActivoFijoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSubGrupoActivoFijo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.subgrupoactivofijoAnterior =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.subgrupoactivofijoAnterior =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarSubGrupoActivoFijo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosSubGrupoActivoFijoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosSubGrupoActivoFijo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.subgrupoactivofijo =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.subgrupoactivofijo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarSubGrupoActivoFijo")) {
				
				}
				
				SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarSubGrupoActivoFijo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosSubGrupoActivoFijo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarSubGrupoActivoFijo")) {
			
			}
			
			SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessSubGrupoActivoFijo();
			
			SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
			
			if(sTipo.equals("NuevoSubGrupoActivoFijo")) {
				jButtonNuevoSubGrupoActivoFijoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarSubGrupoActivoFijo")) {
				jButtonDuplicarSubGrupoActivoFijoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarSubGrupoActivoFijo")) {
				jButtonCopiarSubGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormSubGrupoActivoFijo")) {
				jButtonVerFormSubGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesSubGrupoActivoFijo")) {
				jButtonNuevoSubGrupoActivoFijoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarSubGrupoActivoFijo")) {
				jButtonModificarSubGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarSubGrupoActivoFijo")) {
				jButtonActualizarSubGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarSubGrupoActivoFijo")) {
				jButtonEliminarSubGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaSubGrupoActivoFijo")) {
				jButtonGuardarCambiosSubGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarSubGrupoActivoFijo")) {
				jButtonCancelarSubGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSubGrupoActivoFijo")) {
				jButtonCerrarSubGrupoActivoFijoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosSubGrupoActivoFijo")) {
				jButtonGuardarCambiosSubGrupoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosSubGrupoActivoFijo")) {
				jButtonNuevoGuardarCambiosSubGrupoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderBySubGrupoActivoFijo")) {
				jButtonAbrirOrderBySubGrupoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionSubGrupoActivoFijo")) {
				jButtonRecargarInformacionSubGrupoActivoFijoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresSubGrupoActivoFijo")) {
				jButtonAnterioresSubGrupoActivoFijoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesSubGrupoActivoFijo")) {
				jButtonSiguientesSubGrupoActivoFijoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSubGrupoActivoFijoBusqueda")) {
				this.jButtonidSubGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaSubGrupoActivoFijoUpdate")) {
				this.jButtonid_empresaSubGrupoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaSubGrupoActivoFijoBusqueda")) {
				this.jButtonid_empresaSubGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_detalle_grupo_activo_fijoSubGrupoActivoFijoUpdate")) {
				this.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_detalle_grupo_activo_fijoSubGrupoActivoFijoBusqueda")) {
				this.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoSubGrupoActivoFijoBusqueda")) {
				this.jButtoncodigoSubGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreSubGrupoActivoFijoBusqueda")) {
				this.jButtonnombreSubGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("siglasSubGrupoActivoFijoBusqueda")) {
				this.jButtonsiglasSubGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_vehiculoSubGrupoActivoFijoBusqueda")) {
				this.jButtones_vehiculoSubGrupoActivoFijoBusquedaActionPerformed(evt);
			}
			
			SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessSubGrupoActivoFijo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameSubGrupoActivoFijo")) {
				closingInternalFrameSubGrupoActivoFijo();
				
			} else if(sTipo.equals("jButtonCancelarSubGrupoActivoFijo")) {
				JInternalFrameBase jInternalFrameDetalleFormSubGrupoActivoFijo = (JInternalFrameBase)evt.getSource();
	            	
	            SubGrupoActivoFijoBeanSwingJInternalFrame jInternalFrameParent=(SubGrupoActivoFijoBeanSwingJInternalFrame)jInternalFrameDetalleFormSubGrupoActivoFijo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarSubGrupoActivoFijoActionPerformed(null);
			}
			
			SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.subgrupoactivofijo,new Object(),this.subgrupoactivofijoParameterGeneral,this.subgrupoactivofijoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormSubGrupoActivoFijo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormSubGrupoActivoFijo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormSubGrupoActivoFijo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.subgrupoactivofijo)) {
			if(!esControlTabla) {
				if(SubGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualSubGrupoActivoFijo(this.subgrupoactivofijo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoActivoFijo(this.subgrupoactivofijo);			
				}
				
				if(this.subgrupoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualSubGrupoActivoFijo(this.subgrupoactivofijo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.subgrupoactivofijoReturnGeneral=subgrupoactivofijoLogic.procesarEventosSubGrupoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.subgrupoactivofijoLogic.getSubGrupoActivoFijos(),this.subgrupoactivofijo,this.subgrupoactivofijoParameterGeneral,this.isEsNuevoSubGrupoActivoFijo,classes);//this.subgrupoactivofijoLogic.getSubGrupoActivoFijo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanSubGrupoActivoFijo(this.subgrupoactivofijoReturnGeneral,this.subgrupoactivofijoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.subgrupoactivofijoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanSubGrupoActivoFijo(classes,this.subgrupoactivofijoReturnGeneral,this.subgrupoactivofijoBean,false);
					}
						
					if(this.subgrupoactivofijoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeySubGrupoActivoFijo(this.subgrupoactivofijoReturnGeneral.getSubGrupoActivoFijo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioSubGrupoActivoFijo(this.subgrupoactivofijoReturnGeneral.getSubGrupoActivoFijo());	
					}
						
					if(this.subgrupoactivofijoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioSubGrupoActivoFijo(this.subgrupoactivofijoReturnGeneral.getSubGrupoActivoFijo(),classes);//this.subgrupoactivofijoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioSubGrupoActivoFijo(this.subgrupoactivofijo,classes);//this.subgrupoactivofijoBean);									
				}
			
				if(SubGrupoActivoFijoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualSubGrupoActivoFijo(this.subgrupoactivofijo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSubGrupoActivoFijo(this.subgrupoactivofijo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.subgrupoactivofijoAnterior!=null) {
						this.subgrupoactivofijo=this.subgrupoactivofijoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.subgrupoactivofijoReturnGeneral=subgrupoactivofijoLogic.procesarEventosSubGrupoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.subgrupoactivofijoLogic.getSubGrupoActivoFijos(),this.subgrupoactivofijo,this.subgrupoactivofijoParameterGeneral,this.isEsNuevoSubGrupoActivoFijo,classes);//this.subgrupoactivofijoLogic.getSubGrupoActivoFijo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.subgrupoactivofijoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.subgrupoactivofijoReturnGeneral.getSubGrupoActivoFijo(),subgrupoactivofijoLogic.getSubGrupoActivoFijos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.subgrupoactivofijoReturnGeneral.getSubGrupoActivoFijo(),this.subgrupoactivofijos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosSubGrupoActivoFijo.repaint();
				
				//((AbstractTableModel) this.jTableDatosSubGrupoActivoFijo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosSubGrupoActivoFijo();
			}
		}
	}
	
	public void actualizarVisualTableDatosSubGrupoActivoFijo() throws Exception {
		
		SubGrupoActivoFijoModel subgrupoactivofijoModel=(SubGrupoActivoFijoModel)this.jTableDatosSubGrupoActivoFijo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			subgrupoactivofijoModel.subgrupoactivofijos=this.subgrupoactivofijoLogic.getSubGrupoActivoFijos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			subgrupoactivofijoModel.subgrupoactivofijos=this.subgrupoactivofijos;
		}
		
		
		((SubGrupoActivoFijoModel) this.jTableDatosSubGrupoActivoFijo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaSubGrupoActivoFijo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getsubgrupoactivofijoAnterior(),this.subgrupoactivofijoLogic.getSubGrupoActivoFijos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getsubgrupoactivofijoAnterior(),this.subgrupoactivofijos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosSubGrupoActivoFijo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioSubGrupoActivoFijo(SubGrupoActivoFijo subgrupoactivofijo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleActivoFijo.class)) {
					this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.setDetalleActivoFijos(subgrupoactivofijo.getDetalleActivoFijos());
					this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleActivoFijo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
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
										
				SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.subgrupoactivofijo,new Object(),generalEntityParameterGeneral,this.subgrupoactivofijoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.subgrupoactivofijoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=SubGrupoActivoFijoConstantesFunciones.getClassesRelationshipsOfSubGrupoActivoFijo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=SubGrupoActivoFijoConstantesFunciones.getClassesRelationshipsFromStringsOfSubGrupoActivoFijo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormSubGrupoActivoFijo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.subgrupoactivofijo,new Object(),generalEntityParameterGeneral,this.subgrupoactivofijoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioSubGrupoActivoFijo(SubGrupoActivoFijoBean subgrupoactivofijoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleActivoFijo.class)) {
					this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.setDetalleActivoFijos(subgrupoactivofijo.getDetalleActivoFijos());
					this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleActivoFijo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanSubGrupoActivoFijo(ArrayList<Classe> classes,SubGrupoActivoFijoReturnGeneral subgrupoactivofijoReturnGeneral,SubGrupoActivoFijoBean subgrupoactivofijoBean,Boolean conDefault) throws Exception {
		
			this.subgrupoactivofijoBean.setDetalleActivoFijos(subgrupoactivofijoReturnGeneral.getSubGrupoActivoFijo().getDetalleActivoFijos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualSubGrupoActivoFijo(SubGrupoActivoFijo subgrupoactivofijo,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleActivoFijo.class)) {
					subgrupoactivofijo.setDetalleActivoFijos(this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoBeanSwingJInternalFrame.detalleactivofijoLogic.getDetalleActivoFijos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.subgrupoactivofijo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormSubGrupoActivoFijo = new SubGrupoActivoFijoDetalleFormJInternalFrame(jDesktopPane,this.subgrupoactivofijoSessionBean.getConGuardarRelaciones(),this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormSubGrupoActivoFijo);
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.setVisible(false);
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.setSelected(false);						
		
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.subgrupoactivofijoLogic=this.subgrupoactivofijoLogic;
		
		this.cargarCombosFrameForeignKeySubGrupoActivoFijo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleSubGrupoActivoFijo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSubGrupoActivoFijo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeySubGrupoActivoFijo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeySubGrupoActivoFijo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSubGrupoActivoFijo"));
		
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonModificarSubGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarSubGrupoActivoFijo"));

		
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonModificarToolBarSubGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarToolBarSubGrupoActivoFijo"));
					
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jMenuItemModificarSubGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemModificarSubGrupoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonActualizarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"ActualizarSubGrupoActivoFijo"));
		
		
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonActualizarToolBarSubGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSubGrupoActivoFijo"));
						
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jMenuItemActualizarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSubGrupoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonEliminarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarSubGrupoActivoFijo"));
		
		
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonEliminarToolBarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarToolBarSubGrupoActivoFijo"));
								
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jMenuItemEliminarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSubGrupoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonCancelarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarSubGrupoActivoFijo"));
		
		
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonCancelarToolBarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarToolBarSubGrupoActivoFijo"));
					
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jMenuItemCancelarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSubGrupoActivoFijo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jMenuItemDetalleCerrarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSubGrupoActivoFijo"));		
		
		
		
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonGuardarCambiosToolBarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSubGrupoActivoFijo"));
		
		
		
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonGuardarCambiosToolBarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSubGrupoActivoFijo"));
		
		
		
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxTiposAccionesFormularioSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSubGrupoActivoFijo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonidSubGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idSubGrupoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonid_empresaSubGrupoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSubGrupoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonid_empresaSubGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSubGrupoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_grupo_activo_fijoSubGrupoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_grupo_activo_fijoSubGrupoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtoncodigoSubGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"codigoSubGrupoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonnombreSubGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"nombreSubGrupoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonsiglasSubGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"siglasSubGrupoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtones_vehiculoSubGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"es_vehiculoSubGrupoActivoFijoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTabbedPaneRelacionesSubGrupoActivoFijo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSubGrupoActivoFijo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameSubGrupoActivoFijo"));
		
		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSubGrupoActivoFijo"));
		}
		
		this.jTableDatosSubGrupoActivoFijo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarSubGrupoActivoFijo"));
		
		this.jTableDatosSubGrupoActivoFijo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarSubGrupoActivoFijo"));
		
		this.jButtonNuevoSubGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoSubGrupoActivoFijo"));
		
		this.jButtonDuplicarSubGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"DuplicarSubGrupoActivoFijo"));
		
		this.jButtonCopiarSubGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"CopiarSubGrupoActivoFijo"));
		
		this.jButtonVerFormSubGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"VerFormSubGrupoActivoFijo"));
		
		
		this.jButtonNuevoToolBarSubGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoToolBarSubGrupoActivoFijo"));
			
		this.jButtonDuplicarToolBarSubGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarSubGrupoActivoFijo"));
			
		this.jMenuItemNuevoSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoSubGrupoActivoFijo"));
			
		this.jMenuItemDuplicarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarSubGrupoActivoFijo"));		
		
		
		this.jButtonNuevoRelacionesSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesSubGrupoActivoFijo"));
		
		
		this.jButtonNuevoRelacionesToolBarSubGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarSubGrupoActivoFijo"));
			
		this.jMenuItemNuevoRelacionesSubGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesSubGrupoActivoFijo"));		
		
		
		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonModificarSubGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarSubGrupoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonModificarToolBarSubGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"ModificarToolBarSubGrupoActivoFijo"));
			
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jMenuItemModificarSubGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"MenuItemModificarSubGrupoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonActualizarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"ActualizarSubGrupoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonActualizarToolBarSubGrupoActivoFijo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSubGrupoActivoFijo"));
				
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jMenuItemActualizarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSubGrupoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonEliminarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarSubGrupoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonEliminarToolBarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"EliminarToolBarSubGrupoActivoFijo"));
						
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jMenuItemEliminarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSubGrupoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonCancelarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarSubGrupoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonCancelarToolBarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"CancelarToolBarSubGrupoActivoFijo"));
			
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jMenuItemCancelarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSubGrupoActivoFijo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarSubGrupoActivoFijo"));		
		
		
		this.jButtonCerrarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarSubGrupoActivoFijo"));
		
		
		this.jButtonCerrarToolBarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarToolBarSubGrupoActivoFijo"));
			
		this.jMenuItemCerrarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarSubGrupoActivoFijo"));
			
		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jMenuItemDetalleCerrarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSubGrupoActivoFijo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonGuardarCambiosSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosSubGrupoActivoFijo"));
		}
		
		
		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonGuardarCambiosToolBarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSubGrupoActivoFijo"));
		}
		
		this.jButtonCopiarToolBarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"CopiarToolBarSubGrupoActivoFijo"));
			
		this.jButtonVerFormToolBarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"VerFormToolBarSubGrupoActivoFijo"));
		
		this.jMenuItemGuardarCambiosSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosSubGrupoActivoFijo"));
			
		this.jMenuItemCopiarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarSubGrupoActivoFijo"));		
		
		this.jMenuItemVerFormSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormSubGrupoActivoFijo"));		
		
		
		this.jButtonGuardarCambiosTablaSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSubGrupoActivoFijo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarSubGrupoActivoFijo"));
			
		this.jMenuItemGuardarCambiosTablaSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSubGrupoActivoFijo"));		
		
		
		
		this.jButtonRecargarInformacionSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"RecargarInformacionSubGrupoActivoFijo"));
					
		this.jButtonRecargarInformacionToolBarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarSubGrupoActivoFijo"));
		
		this.jMenuItemRecargarInformacionSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionSubGrupoActivoFijo"));		
		
		
		
		this.jButtonAnterioresSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"AnterioresSubGrupoActivoFijo"));
		
		
		this.jButtonAnterioresToolBarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarSubGrupoActivoFijo"));
		
		this.jMenuItemAnterioresSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresSubGrupoActivoFijo"));		
		
		
		this.jButtonSiguientesSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"SiguientesSubGrupoActivoFijo"));
		
		
		this.jButtonSiguientesToolBarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarSubGrupoActivoFijo"));
			
		this.jMenuItemSiguientesSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesSubGrupoActivoFijo"));
			
		this.jMenuItemAbrirOrderBySubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderBySubGrupoActivoFijo"));
			
		this.jMenuItemMostrarOcultarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarSubGrupoActivoFijo"));
			
		this.jMenuItemDetalleAbrirOrderBySubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderBySubGrupoActivoFijo"));
			
		this.jMenuItemDetalleMostarOcultarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarSubGrupoActivoFijo"));		
		
		
		this.jButtonNuevoGuardarCambiosSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosSubGrupoActivoFijo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarSubGrupoActivoFijo"));
			
		this.jMenuItemNuevoGuardarCambiosSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosSubGrupoActivoFijo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosSubGrupoActivoFijo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosSubGrupoActivoFijo"));

		this.jCheckBoxSeleccionadosSubGrupoActivoFijo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosSubGrupoActivoFijo"));
		
		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxTiposAccionesFormularioSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSubGrupoActivoFijo"));
		}
		
		
		this.jComboBoxTiposRelacionesSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposRelacionesSubGrupoActivoFijo"));
			
		this.jComboBoxTiposAccionesSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposAccionesSubGrupoActivoFijo"));
					
		this.jComboBoxTiposSeleccionarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarSubGrupoActivoFijo"));
			
		this.jTextFieldValorCampoGeneralSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralSubGrupoActivoFijo"));		
		
		
		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonidSubGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idSubGrupoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonid_empresaSubGrupoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSubGrupoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonid_empresaSubGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSubGrupoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_grupo_activo_fijoSubGrupoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_grupo_activo_fijoSubGrupoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtoncodigoSubGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"codigoSubGrupoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonnombreSubGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"nombreSubGrupoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonsiglasSubGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"siglasSubGrupoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtones_vehiculoSubGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"es_vehiculoSubGrupoActivoFijoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoSubGrupoActivoFijo!=null) {
				this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSubGrupoActivoFijo"));
				this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSubGrupoActivoFijo"));
				this.jInternalFrameReporteDinamicoSubGrupoActivoFijo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSubGrupoActivoFijo"));
			}
			
			//this.jButtonCerrarReporteDinamicoSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSubGrupoActivoFijo"));				
			//this.jButtonGenerarReporteDinamicoSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSubGrupoActivoFijo"));
			//this.jButtonGenerarExcelReporteDinamicoSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSubGrupoActivoFijo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionSubGrupoActivoFijo!=null) {
				this.jInternalFrameImportacionSubGrupoActivoFijo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSubGrupoActivoFijo"));
				this.jInternalFrameImportacionSubGrupoActivoFijo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSubGrupoActivoFijo"));
				this.jInternalFrameImportacionSubGrupoActivoFijo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSubGrupoActivoFijo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderBySubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"AbrirOrderBySubGrupoActivoFijo"));
			
			this.jButtonAbrirOrderByToolBarSubGrupoActivoFijo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarSubGrupoActivoFijo"));			
			
			if(this.jInternalFrameOrderBySubGrupoActivoFijo!=null) {
				this.jInternalFrameOrderBySubGrupoActivoFijo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySubGrupoActivoFijo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTabbedPaneRelacionesSubGrupoActivoFijo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSubGrupoActivoFijo"));
		
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
            		closingInternalFrameSubGrupoActivoFijo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormSubGrupoActivoFijo = (JInternalFrameBase)event.getSource();
	            	
	            SubGrupoActivoFijoBeanSwingJInternalFrame jInternalFrameParent=(SubGrupoActivoFijoBeanSwingJInternalFrame)jInternalFrameDetalleFormSubGrupoActivoFijo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarSubGrupoActivoFijoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosSubGrupoActivoFijo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosSubGrupoActivoFijoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosSubGrupoActivoFijo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosSubGrupoActivoFijo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSubGrupoActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSubGrupoActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSubGrupoActivoFijoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoSubGrupoActivoFijo";
		inputMap = this.jButtonNuevoSubGrupoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoSubGrupoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSubGrupoActivoFijoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSubGrupoActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSubGrupoActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSubGrupoActivoFijoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesSubGrupoActivoFijo";
		inputMap = this.jButtonNuevoRelacionesSubGrupoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesSubGrupoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSubGrupoActivoFijoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarSubGrupoActivoFijo";
		inputMap = this.jButtonModificarSubGrupoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarSubGrupoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarSubGrupoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarSubGrupoActivoFijo";
		inputMap = this.jButtonActualizarSubGrupoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarSubGrupoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarSubGrupoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarSubGrupoActivoFijo";
		inputMap = this.jButtonEliminarSubGrupoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarSubGrupoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarSubGrupoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarSubGrupoActivoFijo";
		inputMap = this.jButtonCancelarSubGrupoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarSubGrupoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarSubGrupoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarSubGrupoActivoFijo";
		inputMap = this.jButtonCerrarSubGrupoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarSubGrupoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarSubGrupoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonGuardarCambiosSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosSubGrupoActivoFijo";
		inputMap = this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonGuardarCambiosSubGrupoActivoFijo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonGuardarCambiosSubGrupoActivoFijo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosSubGrupoActivoFijoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosSubGrupoActivoFijo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosSubGrupoActivoFijoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesSubGrupoActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesSubGrupoActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarSubGrupoActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarSubGrupoActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralSubGrupoActivoFijo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralSubGrupoActivoFijoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonidSubGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"idSubGrupoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonid_empresaSubGrupoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaSubGrupoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonid_empresaSubGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaSubGrupoActivoFijoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_grupo_activo_fijoSubGrupoActivoFijoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonid_detalle_grupo_activo_fijoSubGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_grupo_activo_fijoSubGrupoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtoncodigoSubGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"codigoSubGrupoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonnombreSubGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"nombreSubGrupoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtonsiglasSubGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"siglasSubGrupoActivoFijoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jButtones_vehiculoSubGrupoActivoFijoBusqueda.addActionListener(new ButtonActionListener(this,"es_vehiculoSubGrupoActivoFijoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionSubGrupoActivoFijo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionSubGrupoActivoFijoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarSubGrupoActivoFijoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarSubGrupoActivoFijo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosSubGrupoActivoFijo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(SubGrupoActivoFijo subgrupoactivofijoAux:this.subgrupoactivofijoLogic.getSubGrupoActivoFijos()) {
					subgrupoactivofijoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SubGrupoActivoFijo subgrupoactivofijoAux:subgrupoactivofijos) {
					subgrupoactivofijoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosSubGrupoActivoFijoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSubGrupoActivoFijo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SubGrupoActivoFijo subgrupoactivofijoAux:this.subgrupoactivofijoLogic.getSubGrupoActivoFijos()) {
						subgrupoactivofijoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SubGrupoActivoFijo subgrupoactivofijoAux:subgrupoactivofijos) {
						subgrupoactivofijoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(SubGrupoActivoFijo subgrupoactivofijoAux:this.subgrupoactivofijoLogic.getSubGrupoActivoFijos()) {
					
						if(sTipoSeleccionar.equals(SubGrupoActivoFijoConstantesFunciones.LABEL_ESVEHICULO)) {
							existe=true;
							subgrupoactivofijoAux.setes_vehiculo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SubGrupoActivoFijo subgrupoactivofijoAux:subgrupoactivofijos) {
						
						if(sTipoSeleccionar.equals(SubGrupoActivoFijoConstantesFunciones.LABEL_ESVEHICULO)) {
							existe=true;
							subgrupoactivofijoAux.setes_vehiculo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaSubGrupoActivoFijo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSubGrupoActivoFijo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSubGrupoActivoFijo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSubGrupoActivoFijo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosSubGrupoActivoFijoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSubGrupoActivoFijo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosSubGrupoActivoFijo.getSelectedRows();
			
			SubGrupoActivoFijo subgrupoactivofijoLocal=new SubGrupoActivoFijo();
			
			//this.seleccionarTodosSubGrupoActivoFijo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					subgrupoactivofijoLocal =(SubGrupoActivoFijo) this.subgrupoactivofijoLogic.getSubGrupoActivoFijos().toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					subgrupoactivofijoLocal =(SubGrupoActivoFijo) this.subgrupoactivofijos.toArray()[this.jTableDatosSubGrupoActivoFijo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				subgrupoactivofijoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SubGrupoActivoFijo subgrupoactivofijoAux:this.subgrupoactivofijoLogic.getSubGrupoActivoFijos()) {
						subgrupoactivofijoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SubGrupoActivoFijo subgrupoactivofijoAux:subgrupoactivofijos) {
						subgrupoactivofijoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaSubGrupoActivoFijo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSubGrupoActivoFijo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSubGrupoActivoFijo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSubGrupoActivoFijo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualSubGrupoActivoFijoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarSubGrupoActivoFijoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralSubGrupoActivoFijoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingSubGrupoActivoFijo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralSubGrupoActivoFijo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SubGrupoActivoFijo subgrupoactivofijoAux:this.subgrupoactivofijoLogic.getSubGrupoActivoFijos()) {
				
						if(sTipoSeleccionar.equals(SubGrupoActivoFijoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							subgrupoactivofijoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SubGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							subgrupoactivofijoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SubGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS)) {
							existe=true;
							subgrupoactivofijoAux.setsiglas(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SubGrupoActivoFijo subgrupoactivofijoAux:subgrupoactivofijos) {
					
						if(sTipoSeleccionar.equals(SubGrupoActivoFijoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							subgrupoactivofijoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SubGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							subgrupoactivofijoAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(SubGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS)) {
							existe=true;
							subgrupoactivofijoAux.setsiglas(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaSubGrupoActivoFijo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesSubGrupoActivoFijoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingSubGrupoActivoFijo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioSubGrupoActivoFijo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesSubGrupoActivoFijo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxTiposAccionesFormularioSubGrupoActivoFijo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteSubGrupoActivoFijo) {				
					conSplash=true;//false;										
					
					//this.startProcessSubGrupoActivoFijo(conSplash);
				
					this.generarReporteSubGrupoActivoFijosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSubGrupoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxTiposAccionesFormularioSubGrupoActivoFijo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoSubGrupoActivoFijosSeleccionados();
				//this.jComboBoxTiposAccionesSubGrupoActivoFijo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSubGrupoActivoFijosSeleccionados(false);
				//this.jComboBoxTiposAccionesSubGrupoActivoFijo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSubGrupoActivoFijosSeleccionados(true);
				//this.jComboBoxTiposAccionesSubGrupoActivoFijo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSubGrupoActivoFijo();
				
				this.exportarSubGrupoActivoFijosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSubGrupoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxTiposAccionesFormularioSubGrupoActivoFijo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionSubGrupoActivoFijos();
				//this.importarSubGrupoActivoFijos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSubGrupoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxTiposAccionesFormularioSubGrupoActivoFijo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSubGrupoActivoFijo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelSubGrupoActivoFijosSeleccionados();
				//this.jComboBoxTiposAccionesSubGrupoActivoFijo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Sub Grupo Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessSubGrupoActivoFijo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoSubGrupoActivoFijo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeySubGrupoActivoFijo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Sub Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSubGrupoActivoFijo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxTiposAccionesFormularioSubGrupoActivoFijo.setSelectedIndex(0);					
				}	
			} 			
			else if(SubGrupoActivoFijoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteSubGrupoActivoFijo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessSubGrupoActivoFijo(conSplash);
					
						//this.actualizarParametrosGeneralSubGrupoActivoFijo();
						
						this.generarReporteProcesoAccionSubGrupoActivoFijosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesSubGrupoActivoFijo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxTiposAccionesFormularioSubGrupoActivoFijo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Sub Grupo Activo FijoS SELECCIONADOS?", "MANTENIMIENTO DE Sub Grupo Activo Fijo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessSubGrupoActivoFijo();
				
						this.actualizarParametrosGeneralSubGrupoActivoFijo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.subgrupoactivofijoReturnGeneral=subgrupoactivofijoLogic.procesarAccionSubGrupoActivoFijosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.subgrupoactivofijoLogic.getSubGrupoActivoFijos(),this.subgrupoactivofijoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarSubGrupoActivoFijoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSubGrupoActivoFijo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxTiposAccionesFormularioSubGrupoActivoFijo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralSubGrupoActivoFijo();
					
					SubGrupoActivoFijoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarSubGrupoActivoFijoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSubGrupoActivoFijo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxTiposAccionesFormularioSubGrupoActivoFijo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessSubGrupoActivoFijo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesSubGrupoActivoFijoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessSubGrupoActivoFijo();
			
			if(this.jInternalFrameDetalleFormSubGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<SubGrupoActivoFijo> subgrupoactivofijosSeleccionados=new ArrayList<SubGrupoActivoFijo>();		
			SubGrupoActivoFijo subgrupoactivofijo=new SubGrupoActivoFijo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingSubGrupoActivoFijo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesSubGrupoActivoFijo.getSelectedItem();
			
			
			
			
			subgrupoactivofijosSeleccionados=this.getSubGrupoActivoFijosSeleccionados(true);
			//this.sTipoAccion;
			
			if(subgrupoactivofijosSeleccionados.size()==1) {
				for(SubGrupoActivoFijo subgrupoactivofijoAux:subgrupoactivofijosSeleccionados) {
					subgrupoactivofijo=subgrupoactivofijoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Activo Fijo")) {
					jButtonDetalleActivoFijoActionPerformed(null,rowIndex,true,false,subgrupoactivofijo);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessSubGrupoActivoFijo();
			
      		//this.finishProcessSubGrupoActivoFijo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarSubGrupoActivoFijoReturnGeneral() throws Exception {
		if(this.subgrupoactivofijoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.subgrupoactivofijoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.subgrupoactivofijoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.subgrupoactivofijoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.subgrupoactivofijoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.subgrupoactivofijoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingSubGrupoActivoFijo(false);
		}
		
		if(this.subgrupoactivofijoReturnGeneral.getConRetornoLista() || this.subgrupoactivofijoReturnGeneral.getConRetornoObjeto()) {
			if(this.subgrupoactivofijoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.subgrupoactivofijoLogic.setSubGrupoActivoFijos(this.subgrupoactivofijoReturnGeneral.getSubGrupoActivoFijos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.subgrupoactivofijoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.subgrupoactivofijoLogic.setSubGrupoActivoFijo(this.subgrupoactivofijoReturnGeneral.getSubGrupoActivoFijo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingSubGrupoActivoFijo(false);
		}
	}
	
	public void actualizarParametrosGeneralSubGrupoActivoFijo() throws Exception {
		
		
	}
	
	public ArrayList<SubGrupoActivoFijo> getSubGrupoActivoFijosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<SubGrupoActivoFijo> subgrupoactivofijosSeleccionados=new ArrayList<SubGrupoActivoFijo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioSubGrupoActivoFijo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(SubGrupoActivoFijo subgrupoactivofijoAux:subgrupoactivofijoLogic.getSubGrupoActivoFijos()) {
					if(subgrupoactivofijoAux.getIsSelected()) {
						subgrupoactivofijosSeleccionados.add(subgrupoactivofijoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SubGrupoActivoFijo subgrupoactivofijoAux:this.subgrupoactivofijos) {
					if(subgrupoactivofijoAux.getIsSelected()) {
						subgrupoactivofijosSeleccionados.add(subgrupoactivofijoAux);				
					}
				}
			}
			
			if(subgrupoactivofijosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						subgrupoactivofijosSeleccionados.addAll(this.subgrupoactivofijoLogic.getSubGrupoActivoFijos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						subgrupoactivofijosSeleccionados.addAll(this.subgrupoactivofijos);				
					}
				}
			}
		} else {
			subgrupoactivofijosSeleccionados.add(this.subgrupoactivofijo);
		}
		
		return subgrupoactivofijosSeleccionados;
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
	
	public void generarReporteSubGrupoActivoFijosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalSubGrupoActivoFijosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoSubGrupoActivoFijosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSubGrupoActivoFijosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSubGrupoActivoFijosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesSubGrupoActivoFijosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Sub Grupo Activo Fijo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSubGrupoActivoFijosSeleccionados() throws Exception {
		ArrayList<SubGrupoActivoFijo> subgrupoactivofijosSeleccionados=new ArrayList<SubGrupoActivoFijo>();		
		
		subgrupoactivofijosSeleccionados=this.getSubGrupoActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteSubGrupoActivoFijos("Todos",subgrupoactivofijosSeleccionados);
		
	}	
	
	public void generarReporteNormalSubGrupoActivoFijosSeleccionados() throws Exception {
		ArrayList<SubGrupoActivoFijo> subgrupoactivofijosSeleccionados=new ArrayList<SubGrupoActivoFijo>();		
		
		subgrupoactivofijosSeleccionados=this.getSubGrupoActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteSubGrupoActivoFijos("Todos",subgrupoactivofijosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionSubGrupoActivoFijosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<SubGrupoActivoFijo> subgrupoactivofijosSeleccionados=new ArrayList<SubGrupoActivoFijo>();
		
		subgrupoactivofijosSeleccionados=this.getSubGrupoActivoFijosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteSubGrupoActivoFijos("Todos",subgrupoactivofijosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoSubGrupoActivoFijosSeleccionados() throws Exception {
		ArrayList<SubGrupoActivoFijo> subgrupoactivofijosSeleccionados=new ArrayList<SubGrupoActivoFijo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoSubGrupoActivoFijo();
		
		
		subgrupoactivofijosSeleccionados=this.getSubGrupoActivoFijosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoSubGrupoActivoFijo();
		
		
		//this.generarReporteSubGrupoActivoFijos("Todos",subgrupoactivofijosSeleccionados ,subgrupoactivofijoImplementable,subgrupoactivofijoImplementableHome);
	}
	
	public void mostrarImportacionSubGrupoActivoFijos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionSubGrupoActivoFijo();
		
		this.abrirFrameImportacionSubGrupoActivoFijo();		
		
			
		//this.generarReporteSubGrupoActivoFijos("Todos",subgrupoactivofijosSeleccionados ,subgrupoactivofijoImplementable,subgrupoactivofijoImplementableHome);
	}
	
	public void importarSubGrupoActivoFijos() throws Exception {		
	
	}
	
	public void exportarSubGrupoActivoFijosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelSubGrupoActivoFijosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoSubGrupoActivoFijosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlSubGrupoActivoFijosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Sub Grupo Activo Fijo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoSubGrupoActivoFijosSeleccionados() throws Exception {
		ArrayList<SubGrupoActivoFijo> subgrupoactivofijosSeleccionados=new ArrayList<SubGrupoActivoFijo>();		
		
		subgrupoactivofijosSeleccionados=this.getSubGrupoActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"subgrupoactivofijo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarSubGrupoActivoFijo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(SubGrupoActivoFijo subgrupoactivofijoAux:subgrupoactivofijosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarSubGrupoActivoFijo(subgrupoactivofijoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//subgrupoactivofijoAux.setsDetalleGeneralEntityReporte(subgrupoactivofijoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sub Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarSubGrupoActivoFijo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=SubGrupoActivoFijoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SubGrupoActivoFijoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SubGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SubGrupoActivoFijoConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SubGrupoActivoFijoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SubGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SubGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SubGrupoActivoFijoConstantesFunciones.LABEL_ESVEHICULO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarSubGrupoActivoFijo(SubGrupoActivoFijo subgrupoactivofijo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=subgrupoactivofijo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=subgrupoactivofijo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=subgrupoactivofijo.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=subgrupoactivofijo.getdetallegrupoactivofijo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=subgrupoactivofijo.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=subgrupoactivofijo.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=subgrupoactivofijo.getsiglas();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=subgrupoactivofijo.getes_vehiculo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelSubGrupoActivoFijosSeleccionados() throws Exception {
		ArrayList<SubGrupoActivoFijo> subgrupoactivofijosSeleccionados=new ArrayList<SubGrupoActivoFijo>();		
		
		subgrupoactivofijosSeleccionados=this.getSubGrupoActivoFijosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"subgrupoactivofijo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("SubGrupoActivoFijos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelSubGrupoActivoFijo(row);				
				iRow++;
			}				
			
			for(SubGrupoActivoFijo subgrupoactivofijoAux:subgrupoactivofijosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelSubGrupoActivoFijo(subgrupoactivofijoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sub Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlSubGrupoActivoFijosSeleccionados() throws Exception {
		ArrayList<SubGrupoActivoFijo> subgrupoactivofijosSeleccionados=new ArrayList<SubGrupoActivoFijo>();		
		
		subgrupoactivofijosSeleccionados=this.getSubGrupoActivoFijosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"subgrupoactivofijo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("subgrupoactivofijos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("subgrupoactivofijo");
			//elementRoot.appendChild(element);
		
			for(SubGrupoActivoFijo subgrupoactivofijoAux:subgrupoactivofijosSeleccionados) {
				element = document.createElement("subgrupoactivofijo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlSubGrupoActivoFijo(subgrupoactivofijoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sub Grupo Activo Fijo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelSubGrupoActivoFijo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(SubGrupoActivoFijoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(SubGrupoActivoFijoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(SubGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(SubGrupoActivoFijoConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO);
		cell = row.createCell(iColumn++);cell.setCellValue(SubGrupoActivoFijoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(SubGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(SubGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS);
		cell = row.createCell(iColumn++);cell.setCellValue(SubGrupoActivoFijoConstantesFunciones.LABEL_ESVEHICULO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelSubGrupoActivoFijo(SubGrupoActivoFijo subgrupoactivofijo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(subgrupoactivofijo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(subgrupoactivofijo.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(subgrupoactivofijo.getdetallegrupoactivofijo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(subgrupoactivofijo.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(subgrupoactivofijo.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(subgrupoactivofijo.getsiglas());
		cell = row.createCell(iColumn++);cell.setCellValue(subgrupoactivofijo.getes_vehiculo());				
	}
	
	public void setFilaDatosExportarXmlSubGrupoActivoFijo(SubGrupoActivoFijo subgrupoactivofijo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(SubGrupoActivoFijoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(subgrupoactivofijo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(SubGrupoActivoFijoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(subgrupoactivofijo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(SubGrupoActivoFijoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(subgrupoactivofijo.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementdetallegrupoactivofijo_descripcion = document.createElement(SubGrupoActivoFijoConstantesFunciones.IDDETALLEGRUPOACTIVOFIJO);
		elementdetallegrupoactivofijo_descripcion.appendChild(document.createTextNode(subgrupoactivofijo.getdetallegrupoactivofijo_descripcion()));
		element.appendChild(elementdetallegrupoactivofijo_descripcion);

		Element elementcodigo = document.createElement(SubGrupoActivoFijoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(subgrupoactivofijo.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(SubGrupoActivoFijoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(subgrupoactivofijo.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementsiglas = document.createElement(SubGrupoActivoFijoConstantesFunciones.SIGLAS);
		elementsiglas.appendChild(document.createTextNode(subgrupoactivofijo.getsiglas().trim()));
		element.appendChild(elementsiglas);

		Element elementes_vehiculo = document.createElement(SubGrupoActivoFijoConstantesFunciones.ESVEHICULO);
		elementes_vehiculo.appendChild(document.createTextNode(subgrupoactivofijo.getes_vehiculo().toString().trim()));
		element.appendChild(elementes_vehiculo);
	}
	
	public void generarReporteGroupGenericoSubGrupoActivoFijosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<SubGrupoActivoFijo> subgrupoactivofijosSeleccionados=new ArrayList<SubGrupoActivoFijo>();
		
		subgrupoactivofijosSeleccionados=this.getSubGrupoActivoFijosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoSubGrupoActivoFijo(subgrupoactivofijosSeleccionados);
		
		this.generarReporteSubGrupoActivoFijos("Todos",subgrupoactivofijosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoSubGrupoActivoFijo(ArrayList<SubGrupoActivoFijo> subgrupoactivofijosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(SubGrupoActivoFijo subgrupoactivofijoAux:subgrupoactivofijosSeleccionados) {
				subgrupoactivofijoAux.setsDetalleGeneralEntityReporte(subgrupoactivofijoAux.toString());
			
				if(sTipoSeleccionar.equals(SubGrupoActivoFijoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					subgrupoactivofijoAux.setsDescripcionGeneralEntityReporte1(subgrupoactivofijoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SubGrupoActivoFijoConstantesFunciones.LABEL_IDDETALLEGRUPOACTIVOFIJO)) {
					existe=true;
					subgrupoactivofijoAux.setsDescripcionGeneralEntityReporte1(subgrupoactivofijoAux.getdetallegrupoactivofijo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(SubGrupoActivoFijoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					subgrupoactivofijoAux.setsDescripcionGeneralEntityReporte1(subgrupoactivofijoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(SubGrupoActivoFijoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					subgrupoactivofijoAux.setsDescripcionGeneralEntityReporte1(subgrupoactivofijoAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(SubGrupoActivoFijoConstantesFunciones.LABEL_SIGLAS)) {
					existe=true;
					subgrupoactivofijoAux.setsDescripcionGeneralEntityReporte1(subgrupoactivofijoAux.getsiglas());
				}
				 else if(sTipoSeleccionar.equals(SubGrupoActivoFijoConstantesFunciones.LABEL_ESVEHICULO)) {
					existe=true;
					subgrupoactivofijoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(subgrupoactivofijoAux.getes_vehiculo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SubGrupoActivoFijoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesSubGrupoActivoFijo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoSubGrupoActivoFijo=true;
				this.isVisibilidadCeldaNuevoRelacionesSubGrupoActivoFijo=true;
				this.isVisibilidadCeldaGuardarCambiosSubGrupoActivoFijo=true;
			}
			
			this.isVisibilidadCeldaModificarSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaActualizarSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaEliminarSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaCancelarSubGrupoActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSubGrupoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarSubGrupoActivoFijo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaModificarSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaActualizarSubGrupoActivoFijo=true;
			this.isVisibilidadCeldaEliminarSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaCancelarSubGrupoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSubGrupoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarSubGrupoActivoFijo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaModificarSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaActualizarSubGrupoActivoFijo=true;
			this.isVisibilidadCeldaEliminarSubGrupoActivoFijo=true;
			this.isVisibilidadCeldaCancelarSubGrupoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSubGrupoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarSubGrupoActivoFijo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaModificarSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaActualizarSubGrupoActivoFijo=true;
			this.isVisibilidadCeldaEliminarSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaCancelarSubGrupoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSubGrupoActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarSubGrupoActivoFijo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoSubGrupoActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesSubGrupoActivoFijo=true;
			this.isVisibilidadCeldaGuardarCambiosSubGrupoActivoFijo=true;
			this.isVisibilidadCeldaModificarSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaActualizarSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaEliminarSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaCancelarSubGrupoActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSubGrupoActivoFijo=true;
				} else {
					this.isVisibilidadCeldaGuardarSubGrupoActivoFijo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaActualizarSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaEliminarSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaCancelarSubGrupoActivoFijo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSubGrupoActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarSubGrupoActivoFijo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaNuevoRelacionesSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaModificarSubGrupoActivoFijo=true;
			this.isVisibilidadCeldaActualizarSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaEliminarSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaCancelarSubGrupoActivoFijo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSubGrupoActivoFijo=false;
				} else {
					this.isVisibilidadCeldaGuardarSubGrupoActivoFijo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(SubGrupoActivoFijoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoSubGrupoActivoFijo=true;
			this.isVisibilidadCeldaNuevoRelacionesSubGrupoActivoFijo=true;
			this.isVisibilidadCeldaGuardarCambiosSubGrupoActivoFijo=true;
		} else {
			this.actualizarEstadoPanelsSubGrupoActivoFijo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarSubGrupoActivoFijo=false;
			//this.isVisibilidadCeldaVerFormSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaDuplicarSubGrupoActivoFijo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!subgrupoactivofijoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesSubGrupoActivoFijo=false;
		} else {
			this.isVisibilidadCeldaNuevoSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaGuardarCambiosSubGrupoActivoFijo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(!subgrupoactivofijoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesSubGrupoActivoFijo=false;												
			}
			
			this.jButtonCerrarSubGrupoActivoFijo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesSubGrupoActivoFijo=false;
		}
		
		if(!this.permiteMantenimiento(this.subgrupoactivofijo)) {
			this.isVisibilidadCeldaActualizarSubGrupoActivoFijo=false;
			this.isVisibilidadCeldaEliminarSubGrupoActivoFijo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesSubGrupoActivoFijo() {
		this.isVisibilidadCeldaNuevoSubGrupoActivoFijo=false;
		this.isVisibilidadCeldaGuardarCambiosSubGrupoActivoFijo=false;
	}
	
	public void actualizarEstadoPanelsSubGrupoActivoFijo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionSubGrupoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionSubGrupoActivoFijo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubGrupoActivoFijo!=null) {
				this.jTabbedPaneBusquedasSubGrupoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSubGrupoActivoFijo!=null) {
				this.jScrollPanelDatosSubGrupoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionSubGrupoActivoFijo!=null) {
				this.jPanelPaginacionSubGrupoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSubGrupoActivoFijo!=null) {
				this.jPanelParametrosReportesSubGrupoActivoFijo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionSubGrupoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionSubGrupoActivoFijo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubGrupoActivoFijo!=null) {
				this.jTabbedPaneBusquedasSubGrupoActivoFijo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosSubGrupoActivoFijo!=null) {
				this.jScrollPanelDatosSubGrupoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionSubGrupoActivoFijo!=null) {
				this.jPanelPaginacionSubGrupoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSubGrupoActivoFijo!=null) {
				this.jPanelParametrosReportesSubGrupoActivoFijo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionSubGrupoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionSubGrupoActivoFijo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubGrupoActivoFijo!=null) {
				this.jTabbedPaneBusquedasSubGrupoActivoFijo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSubGrupoActivoFijo!=null) {
				this.jScrollPanelDatosSubGrupoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionSubGrupoActivoFijo!=null) {
				this.jPanelPaginacionSubGrupoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSubGrupoActivoFijo!=null) {
				this.jPanelParametrosReportesSubGrupoActivoFijo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionSubGrupoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionSubGrupoActivoFijo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubGrupoActivoFijo!=null) {
				this.jTabbedPaneBusquedasSubGrupoActivoFijo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSubGrupoActivoFijo!=null) {
				this.jScrollPanelDatosSubGrupoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelPaginacionSubGrupoActivoFijo!=null) {
				this.jPanelPaginacionSubGrupoActivoFijo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSubGrupoActivoFijo!=null) {
				this.jPanelParametrosReportesSubGrupoActivoFijo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionSubGrupoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionSubGrupoActivoFijo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubGrupoActivoFijo!=null) {
				this.jTabbedPaneBusquedasSubGrupoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSubGrupoActivoFijo!=null) {
				this.jScrollPanelDatosSubGrupoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionSubGrupoActivoFijo!=null) {
				this.jPanelPaginacionSubGrupoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSubGrupoActivoFijo!=null) {
				this.jPanelParametrosReportesSubGrupoActivoFijo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionSubGrupoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionSubGrupoActivoFijo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubGrupoActivoFijo!=null) {
				this.jTabbedPaneBusquedasSubGrupoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSubGrupoActivoFijo!=null) {
				this.jScrollPanelDatosSubGrupoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionSubGrupoActivoFijo!=null) {
				this.jPanelPaginacionSubGrupoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSubGrupoActivoFijo!=null) {
				this.jPanelParametrosReportesSubGrupoActivoFijo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionSubGrupoActivoFijo!=null) {
				this.jScrollPanelDatosEdicionSubGrupoActivoFijo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubGrupoActivoFijo!=null) {
				this.jTabbedPaneBusquedasSubGrupoActivoFijo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSubGrupoActivoFijo!=null) {
				this.jScrollPanelDatosSubGrupoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelPaginacionSubGrupoActivoFijo!=null) {
				this.jPanelPaginacionSubGrupoActivoFijo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSubGrupoActivoFijo!=null) {
				this.jPanelParametrosReportesSubGrupoActivoFijo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasSubGrupoActivoFijo!=null) {
					this.jTabbedPaneBusquedasSubGrupoActivoFijo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesSubGrupoActivoFijo!=null) {
				this.jPanelParametrosReportesSubGrupoActivoFijo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.subgrupoactivofijoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasSubGrupoActivoFijo!=null) {
				this.jTabbedPaneBusquedasSubGrupoActivoFijo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesSubGrupoActivoFijo!=null) {
				this.jPanelParametrosReportesSubGrupoActivoFijo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}

	public void setVisibilidadBusquedasParaDetalleGrupoActivoFijo(Boolean isParaDetalleGrupoActivoFijo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaDetalleGrupoActivoFijoNegation=!isParaDetalleGrupoActivoFijo;
		}
		
	}
	
	

	public String registrarSesionSubGrupoActivoFijoParaDetalleActivoFijos() throws Exception {
		Boolean isPaginaPopupDetalleActivoFijo=false;

		try {

			if(this.subgrupoactivofijoSessionBean==null) {
				this.subgrupoactivofijoSessionBean=new SubGrupoActivoFijoSessionBean();
			}

			if(this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoSessionBean==null) {
				this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoSessionBean=new DetalleActivoFijoSessionBean();
			}

			this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoSessionBean.setsPathNavegacionActual(subgrupoactivofijoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleActivoFijoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleActivoFijo=this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleActivoFijo(true);
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleActivoFijo(SubGrupoActivoFijoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionSubGrupoActivoFijo(true);
			this.jInternalFrameDetalleFormSubGrupoActivoFijo.detalleactivofijoSessionBean.setlidSubGrupoActivoFijoActual(this.idSubGrupoActivoFijoActual);

			subgrupoactivofijoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeySubGrupoActivoFijo(true);
			subgrupoactivofijoSessionBean.setlIdSubGrupoActivoFijoActualForeignKey(this.idSubGrupoActivoFijoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//SubGrupoActivoFijoSessionBean subgrupoactivofijoSessionBean=new SubGrupoActivoFijoSessionBean();
		
		if(this.subgrupoactivofijoSessionBean==null) {
			this.subgrupoactivofijoSessionBean=new SubGrupoActivoFijoSessionBean();
		}
		
		this.subgrupoactivofijoSessionBean.setsUltimaBusquedaSubGrupoActivoFijo(this.getsAccionBusqueda());
		this.subgrupoactivofijoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.subgrupoactivofijoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			subgrupoactivofijoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//SubGrupoActivoFijoSessionBean subgrupoactivofijoSessionBean=new SubGrupoActivoFijoSessionBean();
		
		if(this.subgrupoactivofijoSessionBean==null) {
			this.subgrupoactivofijoSessionBean=new SubGrupoActivoFijoSessionBean();
		}
		
		if(this.subgrupoactivofijoSessionBean.getsUltimaBusquedaSubGrupoActivoFijo()!=null&&!this.subgrupoactivofijoSessionBean.getsUltimaBusquedaSubGrupoActivoFijo().equals("")) {
			this.setsAccionBusqueda(subgrupoactivofijoSessionBean.getsUltimaBusquedaSubGrupoActivoFijo());
			this.setiNumeroPaginacion(subgrupoactivofijoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(subgrupoactivofijoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(subgrupoactivofijoSessionBean.getid_empresa());
				subgrupoactivofijoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.subgrupoactivofijoSessionBean.setsUltimaBusquedaSubGrupoActivoFijo("");
		this.subgrupoactivofijoSessionBean.setiNumeroPaginacion(SubGrupoActivoFijoConstantesFunciones.INUMEROPAGINACION);
		this.subgrupoactivofijoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaSubGrupoActivoFijo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioSubGrupoActivoFijo() {
		this.updateBorderResaltarBusquedasFormularioSubGrupoActivoFijo();
		this.updateVisibilidadBusquedasFormularioSubGrupoActivoFijo();
		this.updateHabilitarBusquedasFormularioSubGrupoActivoFijo();
	}
	
	public void updateBorderResaltarBusquedasFormularioSubGrupoActivoFijo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasSubGrupoActivoFijo.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioSubGrupoActivoFijo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasSubGrupoActivoFijo.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioSubGrupoActivoFijo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasSubGrupoActivoFijo.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaSubGrupoActivoFijo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarSubGrupoActivoFijo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioSubGrupoActivoFijo() throws Exception {

		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioSubGrupoActivoFijo();
		this.updateVisibilidadResaltarControlesFormularioSubGrupoActivoFijo();
		this.updateHabilitarResaltarControlesFormularioSubGrupoActivoFijo();
		
	}
	
	public void updateBorderResaltarControlesFormularioSubGrupoActivoFijo() throws Exception {
		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.subgrupoactivofijoConstantesFunciones.resaltaridSubGrupoActivoFijo!=null && this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {this.jInternalFrameDetalleFormSubGrupoActivoFijo.jLabelidSubGrupoActivoFijo.setBorder(this.subgrupoactivofijoConstantesFunciones.resaltaridSubGrupoActivoFijo);}
		if(this.subgrupoactivofijoConstantesFunciones.resaltarid_empresaSubGrupoActivoFijo!=null && this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_empresaSubGrupoActivoFijo.setBorder(this.subgrupoactivofijoConstantesFunciones.resaltarid_empresaSubGrupoActivoFijo);}
		if(this.subgrupoactivofijoConstantesFunciones.resaltarid_detalle_grupo_activo_fijoSubGrupoActivoFijo!=null && this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijo.setBorder(this.subgrupoactivofijoConstantesFunciones.resaltarid_detalle_grupo_activo_fijoSubGrupoActivoFijo);}
		if(this.subgrupoactivofijoConstantesFunciones.resaltarcodigoSubGrupoActivoFijo!=null && this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTextFieldcodigoSubGrupoActivoFijo.setBorder(this.subgrupoactivofijoConstantesFunciones.resaltarcodigoSubGrupoActivoFijo);}
		if(this.subgrupoactivofijoConstantesFunciones.resaltarnombreSubGrupoActivoFijo!=null && this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTextAreanombreSubGrupoActivoFijo.setBorder(this.subgrupoactivofijoConstantesFunciones.resaltarnombreSubGrupoActivoFijo);}
		if(this.subgrupoactivofijoConstantesFunciones.resaltarsiglasSubGrupoActivoFijo!=null && this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTextFieldsiglasSubGrupoActivoFijo.setBorder(this.subgrupoactivofijoConstantesFunciones.resaltarsiglasSubGrupoActivoFijo);}
		if(this.subgrupoactivofijoConstantesFunciones.resaltares_vehiculoSubGrupoActivoFijo!=null && this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {this.jInternalFrameDetalleFormSubGrupoActivoFijo.jCheckBoxes_vehiculoSubGrupoActivoFijo.setBorderPainted(true);this.jInternalFrameDetalleFormSubGrupoActivoFijo.jCheckBoxes_vehiculoSubGrupoActivoFijo.setBorder(this.subgrupoactivofijoConstantesFunciones.resaltares_vehiculoSubGrupoActivoFijo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioSubGrupoActivoFijo() throws Exception {		
		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {
	
		//this.jInternalFrameDetalleFormSubGrupoActivoFijo.jLabelidSubGrupoActivoFijo.setVisible(this.subgrupoactivofijoConstantesFunciones.mostraridSubGrupoActivoFijo);
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jPanelidSubGrupoActivoFijo.setVisible(this.subgrupoactivofijoConstantesFunciones.mostraridSubGrupoActivoFijo);
		//this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_empresaSubGrupoActivoFijo.setVisible(this.subgrupoactivofijoConstantesFunciones.mostrarid_empresaSubGrupoActivoFijo);
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jPanelid_empresaSubGrupoActivoFijo.setVisible(this.subgrupoactivofijoConstantesFunciones.mostrarid_empresaSubGrupoActivoFijo);
		//this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijo.setVisible(this.subgrupoactivofijoConstantesFunciones.mostrarid_detalle_grupo_activo_fijoSubGrupoActivoFijo);
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jPanelid_detalle_grupo_activo_fijoSubGrupoActivoFijo.setVisible(this.subgrupoactivofijoConstantesFunciones.mostrarid_detalle_grupo_activo_fijoSubGrupoActivoFijo);
		//this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTextFieldcodigoSubGrupoActivoFijo.setVisible(this.subgrupoactivofijoConstantesFunciones.mostrarcodigoSubGrupoActivoFijo);
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jPanelcodigoSubGrupoActivoFijo.setVisible(this.subgrupoactivofijoConstantesFunciones.mostrarcodigoSubGrupoActivoFijo);
		//this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTextAreanombreSubGrupoActivoFijo.setVisible(this.subgrupoactivofijoConstantesFunciones.mostrarnombreSubGrupoActivoFijo);
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jPanelnombreSubGrupoActivoFijo.setVisible(this.subgrupoactivofijoConstantesFunciones.mostrarnombreSubGrupoActivoFijo);
		//this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTextFieldsiglasSubGrupoActivoFijo.setVisible(this.subgrupoactivofijoConstantesFunciones.mostrarsiglasSubGrupoActivoFijo);
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jPanelsiglasSubGrupoActivoFijo.setVisible(this.subgrupoactivofijoConstantesFunciones.mostrarsiglasSubGrupoActivoFijo);
		//this.jInternalFrameDetalleFormSubGrupoActivoFijo.jCheckBoxes_vehiculoSubGrupoActivoFijo.setVisible(this.subgrupoactivofijoConstantesFunciones.mostrares_vehiculoSubGrupoActivoFijo);
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jPaneles_vehiculoSubGrupoActivoFijo.setVisible(this.subgrupoactivofijoConstantesFunciones.mostrares_vehiculoSubGrupoActivoFijo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioSubGrupoActivoFijo() throws Exception {
		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSubGrupoActivoFijo!=null) {
	
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jLabelidSubGrupoActivoFijo.setEnabled(this.subgrupoactivofijoConstantesFunciones.activaridSubGrupoActivoFijo);
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_empresaSubGrupoActivoFijo.setEnabled(this.subgrupoactivofijoConstantesFunciones.activarid_empresaSubGrupoActivoFijo);
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jComboBoxid_detalle_grupo_activo_fijoSubGrupoActivoFijo.setEnabled(this.subgrupoactivofijoConstantesFunciones.activarid_detalle_grupo_activo_fijoSubGrupoActivoFijo);
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTextFieldcodigoSubGrupoActivoFijo.setEnabled(this.subgrupoactivofijoConstantesFunciones.activarcodigoSubGrupoActivoFijo);
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTextAreanombreSubGrupoActivoFijo.setEnabled(this.subgrupoactivofijoConstantesFunciones.activarnombreSubGrupoActivoFijo);
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jTextFieldsiglasSubGrupoActivoFijo.setEnabled(this.subgrupoactivofijoConstantesFunciones.activarsiglasSubGrupoActivoFijo);
		this.jInternalFrameDetalleFormSubGrupoActivoFijo.jCheckBoxes_vehiculoSubGrupoActivoFijo.setEnabled(this.subgrupoactivofijoConstantesFunciones.activares_vehiculoSubGrupoActivoFijo);
		}
	}
	
		
}